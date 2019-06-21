package com.tencent.mm.plugin.sns.ui.jsapi;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class JsapiSnsLabelUI$6
  implements ExpandableListView.OnChildClickListener
{
  JsapiSnsLabelUI$6(JsapiSnsLabelUI paramJsapiSnsLabelUI)
  {
  }

  public final boolean onChildClick(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(40177);
    if (paramInt2 == JsapiSnsLabelUI.a(this.rJs).getChildrenCount(paramInt1) - 1)
    {
      JsapiSnsLabelUI.b(this.rJs, paramInt1);
      JsapiSnsLabelUI.f(this.rJs);
    }
    while (true)
    {
      AppMethodBeat.o(40177);
      return false;
      paramExpandableListView = (String)JsapiSnsLabelUI.a(this.rJs).getChild(paramInt1, paramInt2);
      JsapiSnsLabelUI.a(this.rJs);
      a.ZF(paramExpandableListView);
      if (paramInt1 == this.rJs.rJn)
        JsapiSnsLabelUI.a(this.rJs, 1, JsapiSnsLabelUI.a(this.rJs).rtH, paramExpandableListView, paramView);
      else if (paramInt1 == this.rJs.rJo)
        JsapiSnsLabelUI.a(this.rJs, 2, JsapiSnsLabelUI.a(this.rJs).rtI, paramExpandableListView, paramView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.6
 * JD-Core Version:    0.6.2
 */