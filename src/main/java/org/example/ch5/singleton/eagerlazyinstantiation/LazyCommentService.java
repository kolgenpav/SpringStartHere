package org.example.ch5.singleton.eagerlazyinstantiation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/*Bean should be singleton only if it is immutable - see final modifier*/
@Service
@Lazy
public final class LazyCommentService {

    public LazyCommentService() {
        System.out.println("LazyCommentService instance created!");
    }
}
