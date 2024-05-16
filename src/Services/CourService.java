package Services;

import java.util.ArrayList;
import java.util.List;

import entities.Cour;

public class CourService extends Services<Cour> {
    
    private List<Cour> cours=new ArrayList<>();

    public List<Cour> getCours() {
        return cours;
    }

    public int generateId(){
        return Cour.getNbrCour();
    }

    public boolean save(Cour cour){
        cour.setId(generateId());
        cours.add(cour);
        return true;
    }

    
}
