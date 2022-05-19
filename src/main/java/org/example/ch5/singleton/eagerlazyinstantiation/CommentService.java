package org.example.ch5.singleton.eagerlazyinstantiation;

import org.springframework.stereotype.Service;

/*Bean should be singleton only if it is immutable - see final modifier*/
@Service
public final class CommentService {

    public CommentService() {
        System.out.println("CommentService instance created!");
    }
}
