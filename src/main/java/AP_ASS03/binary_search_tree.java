package AP_ASS03;

public class binary_search_tree {
			//declarations
			private String Data;
		    private binary_search_tree left;
		    private binary_search_tree right;
		    public binary_search_tree() {
		        this.Data = null;
		        this.left = null;
		        this.right = null;
		    }
		    //constructors
		    public binary_search_tree (String Data) {
		        this.Data = Data;
		        this.left = null;
		        this.right = null;
		    }
    //comparing data
    public void addWord(String Data) {
		        if (this.Data != null) 
		        {
		            if (this.Data.compareTo(Data) > 0)
		            {
		                if (this.left != null)
		                {
		                    this.left.addWord(Data);
		                } 
		                else
		                {
		                    this.left = new binary_search_tree(Data);
		                }
		            }
		            else
		            {
		                if (this.right != null)
		                {
		                    this.right.addWord(Data);
		                }
		                else
		                {
		                    this.right = new binary_search_tree(Data);
		                }
		            }
		        }
		        if (this.Data == null) 
		        {
		            this.Data = Data;
		        }
		    }
    //traversing using preorder(root,left,right)
    public void preOrder_transversal() {
        System.out.println(this.Data);
	        if (this.left != null) {
	            this.left.preOrder_transversal();
	        }
	        if (this.right != null) {
	            this.right.preOrder_transversal();
	        }
    }
}