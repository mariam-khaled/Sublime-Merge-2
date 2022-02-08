
import java.io.IOException;
import java.util.List;

public class MainClass {
    
    public static void main(String [] args) throws IOException
    {
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("data/pyramids.csv");
        
        //counter
        //loop on pyramids
        //increment
        //change from github
        // back
        int i = 0;
        for(Pyramid p : pyramids)
        {   
            System.out.println("#"+(i++)+","+p);
        }
        
    
    }
    
}
