package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.listview.AnimatedExpandableListView;
import java.util.ArrayList;

final class SnsLabelUI$5
  implements ExpandableListView.OnGroupClickListener
{
  SnsLabelUI$5(SnsLabelUI paramSnsLabelUI)
  {
  }

  public final boolean onGroupClick(ExpandableListView paramExpandableListView, View paramView, int paramInt, long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(39015);
    int i = SnsLabelUI.a(this.rtz).rtF;
    ab.i("MicroMsg.SnsLabelUI", "dz[previousGroup: %d    onGroupClick:%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    if (paramInt > 1)
      if ((SnsLabelUI.b(this.rtz) != null) && (SnsLabelUI.b(this.rtz).size() != 0) && (SnsLabelUI.ctB() == 0))
      {
        SnsLabelUI.a(this.rtz, paramInt);
        SnsLabelUI.c(this.rtz);
        ab.i("MicroMsg.SnsLabelUI", "dz[previousGroup: need transform]");
        AppMethodBeat.o(39015);
      }
    while (true)
    {
      return bool;
      if (SnsLabelUI.d(this.rtz))
      {
        SnsLabelUI.e(this.rtz);
        SnsLabelUI.a(this.rtz, paramInt);
        SnsLabelUI.a(this.rtz, h.b(this.rtz, this.rtz.getString(2131303676), false, null));
        ab.i("MicroMsg.SnsLabelUI", "dz[previousGroup: isGettingTagInfo]");
        AppMethodBeat.o(39015);
      }
      else if ((SnsLabelUI.a(this.rtz).rtE == null) || (SnsLabelUI.a(this.rtz).rtE.size() == 0))
      {
        SnsLabelUI.a(this.rtz, paramInt);
        SnsLabelUI.f(this.rtz);
        ab.i("MicroMsg.SnsLabelUI", "dz[previousGroup: gotoSelectContact]");
        AppMethodBeat.o(39015);
      }
      else
      {
        if (i == paramInt)
        {
          if (SnsLabelUI.g(this.rtz).isGroupExpanded(paramInt))
            SnsLabelUI.g(this.rtz).Qj(paramInt);
          while (true)
          {
            SnsLabelUI.a(this.rtz).rtF = paramInt;
            AppMethodBeat.o(39015);
            break;
            SnsLabelUI.g(this.rtz).Qi(paramInt);
          }
        }
        if (i == 2)
        {
          SnsLabelUI.g(this.rtz).collapseGroup(2);
          SnsLabelUI.a(this.rtz).rtH.clear();
          SnsLabelUI.a(this.rtz).rtJ.clear();
        }
        while (true)
        {
          SnsLabelUI.g(this.rtz).post(new SnsLabelUI.5.1(this, paramInt));
          break;
          if (i == 3)
          {
            SnsLabelUI.g(this.rtz).collapseGroup(3);
            SnsLabelUI.a(this.rtz).rtI.clear();
            SnsLabelUI.a(this.rtz).rtK.clear();
          }
        }
        if (i > 1)
          SnsLabelUI.g(this.rtz).Qj(i);
        SnsLabelUI.a(this.rtz).rtF = paramInt;
        AppMethodBeat.o(39015);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsLabelUI.5
 * JD-Core Version:    0.6.2
 */