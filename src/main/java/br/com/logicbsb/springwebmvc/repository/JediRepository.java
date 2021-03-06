package br.com.logicbsb.springwebmvc.repository;

import br.com.logicbsb.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {

    private List<Jedi> jedi;

    public JediRepository() {
        this.jedi = new ArrayList<>();
        this.jedi.add(new Jedi("Luke", "Skywalker"));
    }

    public List<Jedi> getAllJedi() {
        return this.jedi;
    }

    public void add(Jedi jedi) {
        this.jedi.add(jedi);
    }
}
