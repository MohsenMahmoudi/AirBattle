
public class MapM {
	private int col=8;
	private int row=8;
	public Block.Block MapArray [][];
        private Weapon MapArrayW [][];
	public MapM(int col,int row) {
		setCol(col);
		setRow(row);
		MapArray=new Block.Block[row][col];
		for(int i = 0 ; i < row ; i++)
			for(int j = 0 ; j < col;j++)
				MapArray[i][j]=new Block.Clear(i, j);
	}
	public void FillMap() {
		for(int i = 0 ; i < row ; i++)
			for(int j = 0 ; j < col;j++)
				MapArray[i][j]=new Block.Random(i, j);
	}
	
	public void edit( int row,int col, Block.Block block) {
		MapArray[row][col]=block;
	}
	
        @Override
	public String toString() {
		String output="";
		for(int i = 0 ; i < col ; i++){
			for(int j = 0 ; j < row;j++)
				output+=MapArray[j][i].getName()+"\t";
			output+="\n\n";
		}
		return output;
	}
	
	public int getCol() {
		return col;
	}
	public Block.Block GetBlock(int row,int col){
		if(row<=this.row && row>=0 && col<=this.col && col>=0)
			return MapArray[row][col];
		return null;
	}
        
//        
//        public Weapon getWeapon(int row, int col){if(row<=this.row && row>=0 && col<=this.col && col>=0)
//                    return MapArrayW[row][col];
//                return null;
//        }
	private void setCol(int col) {
		this.col = col;
	}
	public int getRow() {
		return row;
	}
	private void setRow(int row) {
		this.row = row;
	}
        public char MapArr(int row,int col){
            return MapArray[row][col].getName();
        }
}
