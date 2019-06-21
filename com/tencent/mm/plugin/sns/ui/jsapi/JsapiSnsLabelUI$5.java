package com.tencent.mm.plugin.sns.ui.jsapi;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.listview.AnimatedExpandableListView;
import java.util.ArrayList;

final class JsapiSnsLabelUI$5
  implements ExpandableListView.OnGroupClickListener
{
  JsapiSnsLabelUI$5(JsapiSnsLabelUI paramJsapiSnsLabelUI)
  {
  }

  public final boolean onGroupClick(ExpandableListView paramExpandableListView, View paramView, final int paramInt, long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(40176);
    int i = JsapiSnsLabelUI.a(this.rJs).rtF;
    ab.i("MicroMsg.SnsLabelUI", "dz[previousGroup: %d    onGroupClick:%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    if ((JsapiSnsLabelUI.a(this.rJs, paramInt).equals("visible")) || (JsapiSnsLabelUI.a(this.rJs, paramInt).equals("invisible")))
      if ((JsapiSnsLabelUI.b(this.rJs) != null) && (JsapiSnsLabelUI.b(this.rJs).size() != 0) && (JsapiSnsLabelUI.cuW() == 0))
      {
        JsapiSnsLabelUI.b(this.rJs, paramInt);
        JsapiSnsLabelUI.c(this.rJs);
        ab.i("MicroMsg.SnsLabelUI", "dz[previousGroup: need transform]");
        AppMethodBeat.o(40176);
        bool = true;
      }
    while (true)
    {
      return bool;
      if (JsapiSnsLabelUI.d(this.rJs))
      {
        JsapiSnsLabelUI.e(this.rJs);
        JsapiSnsLabelUI.b(this.rJs, paramInt);
        JsapiSnsLabelUI.a(this.rJs, h.b(this.rJs, this.rJs.getString(2131303676), false, null));
        ab.i("MicroMsg.SnsLabelUI", "dz[previousGroup: isGettingTagInfo]");
        AppMethodBeat.o(40176);
        bool = true;
      }
      else if ((JsapiSnsLabelUI.a(this.rJs).rtE == null) || (JsapiSnsLabelUI.a(this.rJs).rtE.size() == 0))
      {
        JsapiSnsLabelUI.b(this.rJs, paramInt);
        JsapiSnsLabelUI.f(this.rJs);
        ab.i("MicroMsg.SnsLabelUI", "dz[previousGroup: gotoSelectContact]");
        AppMethodBeat.o(40176);
        bool = true;
      }
      else
      {
        if (i == paramInt)
        {
          if (JsapiSnsLabelUI.g(this.rJs).isGroupExpanded(paramInt))
            JsapiSnsLabelUI.g(this.rJs).Qj(paramInt);
          while (true)
          {
            JsapiSnsLabelUI.a(this.rJs).rtF = paramInt;
            AppMethodBeat.o(40176);
            bool = true;
            break;
            JsapiSnsLabelUI.g(this.rJs).Qi(paramInt);
          }
        }
        if (JsapiSnsLabelUI.a(this.rJs, i).equals("visible"))
        {
          JsapiSnsLabelUI.g(this.rJs).collapseGroup(i);
          JsapiSnsLabelUI.a(this.rJs).rtH.clear();
          JsapiSnsLabelUI.a(this.rJs).rtJ.clear();
        }
        while (true)
        {
          JsapiSnsLabelUI.g(this.rJs).post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(40175);
              JsapiSnsLabelUI.g(JsapiSnsLabelUI.5.this.rJs).Qi(paramInt);
              AppMethodBeat.o(40175);
            }
          });
          break;
          if (JsapiSnsLabelUI.a(this.rJs, i).equals("invisible"))
          {
            JsapiSnsLabelUI.g(this.rJs).collapseGroup(i);
            JsapiSnsLabelUI.a(this.rJs).rtI.clear();
            JsapiSnsLabelUI.a(this.rJs).rtK.clear();
          }
        }
        if ((i >= 0) && ((JsapiSnsLabelUI.a(this.rJs, i).equals("visible")) || (JsapiSnsLabelUI.a(this.rJs, i).equals("invisible"))))
          JsapiSnsLabelUI.g(this.rJs).Qj(i);
        JsapiSnsLabelUI.a(this.rJs).rtF = paramInt;
        AppMethodBeat.o(40176);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.5
 * JD-Core Version:    0.6.2
 */