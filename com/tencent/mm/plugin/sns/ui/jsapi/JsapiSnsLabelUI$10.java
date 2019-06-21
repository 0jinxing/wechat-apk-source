package com.tencent.mm.plugin.sns.ui.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.listview.AnimatedExpandableListView;
import java.util.ArrayList;

final class JsapiSnsLabelUI$10
  implements Runnable
{
  JsapiSnsLabelUI$10(JsapiSnsLabelUI paramJsapiSnsLabelUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40181);
    JsapiSnsLabelUI.a(this.rJs, (ArrayList)com.tencent.mm.plugin.label.a.a.bJa().bIV());
    if (JsapiSnsLabelUI.j(this.rJs) == null)
      JsapiSnsLabelUI.a(this.rJs, new ArrayList());
    if (!bo.isNullOrNil(this.rtC))
      if (!JsapiSnsLabelUI.j(this.rJs).contains(this.rtC))
        JsapiSnsLabelUI.j(this.rJs).add(this.rtC);
    for (int i = JsapiSnsLabelUI.j(this.rJs).indexOf(this.rtC); ; i = -1)
    {
      JsapiSnsLabelUI.a(this.rJs).T(JsapiSnsLabelUI.j(this.rJs));
      JsapiSnsLabelUI.k(this.rJs);
      JsapiSnsLabelUI.a(this.rJs).rtF = JsapiSnsLabelUI.l(this.rJs);
      if ((!bo.isNullOrNil(this.rtC)) && (i != -1))
      {
        if (JsapiSnsLabelUI.l(this.rJs) != this.rJs.rJn)
          break label252;
        JsapiSnsLabelUI.a(this.rJs).rtH.add(this.rtC);
        JsapiSnsLabelUI.a(this.rJs).rtJ.clear();
      }
      while (true)
      {
        JsapiSnsLabelUI.a(this.rJs).notifyDataSetChanged();
        JsapiSnsLabelUI.g(this.rJs).expandGroup(JsapiSnsLabelUI.l(this.rJs));
        JsapiSnsLabelUI.m(this.rJs);
        AppMethodBeat.o(40181);
        return;
        label252: if (JsapiSnsLabelUI.l(this.rJs) == this.rJs.rJo)
        {
          JsapiSnsLabelUI.a(this.rJs).rtI.add(this.rtC);
          JsapiSnsLabelUI.a(this.rJs).rtK.clear();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.10
 * JD-Core Version:    0.6.2
 */