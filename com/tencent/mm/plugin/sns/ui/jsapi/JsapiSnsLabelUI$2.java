package com.tencent.mm.plugin.sns.ui.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.a.b;
import java.util.ArrayList;

final class JsapiSnsLabelUI$2
  implements Runnable
{
  JsapiSnsLabelUI$2(JsapiSnsLabelUI paramJsapiSnsLabelUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40173);
    com.tencent.mm.plugin.label.a.a.bJa().ahw();
    JsapiSnsLabelUI.a(this.rJs, (ArrayList)com.tencent.mm.plugin.label.a.a.bJa().bIV());
    JsapiSnsLabelUI.a(this.rJs).T(JsapiSnsLabelUI.j(this.rJs));
    JsapiSnsLabelUI.k(this.rJs);
    if (((JsapiSnsLabelUI.j(this.rJs) == null) || (JsapiSnsLabelUI.j(this.rJs).size() == 0)) && ((JsapiSnsLabelUI.p(this.rJs) == null) || (JsapiSnsLabelUI.p(this.rJs).length() == 0)) && (JsapiSnsLabelUI.a(this.rJs).rtF != this.rJs.rJl) && (JsapiSnsLabelUI.a(this.rJs).rtF != this.rJs.rJm))
      JsapiSnsLabelUI.a(this.rJs).rtF = this.rJs.rJl;
    JsapiSnsLabelUI.a(this.rJs).notifyDataSetChanged();
    JsapiSnsLabelUI.m(this.rJs);
    AppMethodBeat.o(40173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.2
 * JD-Core Version:    0.6.2
 */