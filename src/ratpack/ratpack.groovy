import app.SpringBootConfig
import ratpack.spring.Spring

import static ratpack.groovy.Groovy.ratpack

ratpack {
  bindings {
  }
  handlers {
    register(Spring.spring(SpringBootConfig))
    get {
      render "Hello World from ratpack + boot"
    }
  }
}
