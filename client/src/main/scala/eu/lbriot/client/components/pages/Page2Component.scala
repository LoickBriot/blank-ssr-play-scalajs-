package eu.lbriot.client.components.pages

import components.{ApplicationComponentTrait, JSComponentTrait, JSPageComponentTrait}
import eu.lbriot.client.components.ApplicationComponent
import eu.lbriot.shared_impl.utils.HtmlIDHandler
import rx_binding.Var

import scala.collection.mutable.ListBuffer

case class Page2Component() extends JSPageComponentTrait {

  override val application_component: ApplicationComponentTrait[_] = ApplicationComponent

  override val component_id : String = {
    HtmlIDHandler.page2
  }



  //              _                                        _
  //   _   _ _ __| |  _ __   __ _ _ __ __ _ _ __ ___   ___| |_ ___ _ __ ___
  //  | | | | '__| | | '_ \ / _` | '__/ _` | '_ ` _ \ / _ \ __/ _ \ '__/ __|
  //  | |_| | |  | | | |_) | (_| | | | (_| | | | | | |  __/ |_  __/ |  \__ \
  //   \__,_|_|  |_| | .__/ \__,_|_|  \__,_|_| |_| |_|\___|\__\___|_|  |___/
  //                 |_|

  val params_data : Seq[(String,(Var[_<:Any],(String,Boolean)=>Unit))]= {
    Seq[(String,(Var[_<:Any],(String,Boolean)=>Unit))]()
  }




  //   _       _ _                _   _
  //  (_)_ __ (_) |_    __ _  ___| |_(_) ___  _ __  ___
  //  | | '_ \| | __|  / _` |/ __| __| |/ _ \| '_ \/ __|
  //  | | | | | | |_  | (_| | (__| |_| | (_) | | | \__ \
  //  |_|_| |_|_|\__|  \__,_|\___|\__|_|\___/|_| |_|___/
  //




  def on_init_action_impl() : Unit = {}

  def on_set_visible_action_impl() : Unit = {}

  def on_set_hidden_action_impl() : Unit = {}


  protected val children_components : ListBuffer[JSComponentTrait] = {
    ListBuffer()
  }



  //         _
  //  __   ___) _____      __
  //  \ \ / / |/ _ \ \ /\ / /
  //   \ V /| |  __/\ V  V /
  //    \_/ |_|\___| \_/\_/
  //

  def view_impl() : scala.xml.Node = {
    ApplicationComponent.sharedHTMLComponent.page2_html
  }


}
