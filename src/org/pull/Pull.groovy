package org.pull

class Pull{
  def config
  def script
  
  Pull(script,config){
    this.config=config
    this.script=script
  }
  void pullcode(){
    this.script.stage('pulling'){
    this.script.sh('git clone this.config.url')
  }
 }
}
    
