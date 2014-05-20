(defproject ui-gallery "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  
  :dependencies [[com.badlogicgames.gdx/gdx "1.0.1"]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl "1.0.1"]
                 [com.badlogicgames.gdx/gdx-box2d "1.0.1"]
                 [com.badlogicgames.gdx/gdx-box2d-platform "1.0.1"
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-bullet "1.0.1"]
                 [com.badlogicgames.gdx/gdx-bullet-platform "1.0.1"
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-platform "1.0.1"
                  :classifier "natives-desktop"]
                 [org.clojure/clojure "1.6.0"]
                 [play-clj "0.3.5-SNAPSHOT"]]
  
  :source-paths ["src" "src-common"]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [ui-gallery.core.desktop-launcher]
  :main ui-gallery.core.desktop-launcher)
