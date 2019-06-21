package com.tencent.mm.plugin.sns.ui.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.widget.listview.AnimatedExpandableListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

final class JsapiSnsLabelUI$3
  implements Runnable
{
  JsapiSnsLabelUI$3(JsapiSnsLabelUI paramJsapiSnsLabelUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40174);
    JsapiSnsLabelUI.a(this.rJs).rtF = JsapiSnsLabelUI.l(this.rJs);
    if (JsapiSnsLabelUI.b(this.rJs) != null)
    {
      if (JsapiSnsLabelUI.j(this.rJs) == null)
        JsapiSnsLabelUI.a(this.rJs, JsapiSnsLabelUI.b(this.rJs));
      while (true)
      {
        localObject = JsapiSnsLabelUI.b(this.rJs).iterator();
        while (((Iterator)localObject).hasNext())
        {
          JsapiSnsLabelUI.a(this.rJs);
          a.ZF((String)((Iterator)localObject).next());
        }
        JsapiSnsLabelUI.j(this.rJs).addAll(JsapiSnsLabelUI.b(this.rJs));
      }
      Object localObject = new HashSet(JsapiSnsLabelUI.j(this.rJs));
      JsapiSnsLabelUI.j(this.rJs).clear();
      JsapiSnsLabelUI.j(this.rJs).addAll((Collection)localObject);
      JsapiSnsLabelUI.b(this.rJs).clear();
      JsapiSnsLabelUI.q(this.rJs);
      ((HashSet)localObject).clear();
    }
    JsapiSnsLabelUI.a(this.rJs).T(JsapiSnsLabelUI.j(this.rJs));
    JsapiSnsLabelUI.k(this.rJs);
    JsapiSnsLabelUI.a(this.rJs).notifyDataSetChanged();
    JsapiSnsLabelUI.g(this.rJs).Qi(JsapiSnsLabelUI.a(this.rJs).rtF);
    if ((JsapiSnsLabelUI.r(this.rJs) != null) && (JsapiSnsLabelUI.r(this.rJs).isShowing()))
      JsapiSnsLabelUI.r(this.rJs).dismiss();
    AppMethodBeat.o(40174);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.3
 * JD-Core Version:    0.6.2
 */