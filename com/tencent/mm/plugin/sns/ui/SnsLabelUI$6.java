package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsLabelUI$6
  implements ExpandableListView.OnChildClickListener
{
  SnsLabelUI$6(SnsLabelUI paramSnsLabelUI)
  {
  }

  public final boolean onChildClick(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(39016);
    if (paramInt2 == SnsLabelUI.a(this.rtz).getChildrenCount(paramInt1) - 1)
    {
      SnsLabelUI.a(this.rtz, paramInt1);
      SnsLabelUI.f(this.rtz);
    }
    while (true)
    {
      AppMethodBeat.o(39016);
      return false;
      paramExpandableListView = (String)SnsLabelUI.a(this.rtz).getChild(paramInt1, paramInt2);
      SnsLabelUI.a(this.rtz);
      ap.ZF(paramExpandableListView);
      if (paramInt1 == 2)
        SnsLabelUI.a(this.rtz, 1, SnsLabelUI.a(this.rtz).rtH, paramExpandableListView, paramView);
      else if (paramInt1 == 3)
        SnsLabelUI.a(this.rtz, 2, SnsLabelUI.a(this.rtz).rtI, paramExpandableListView, paramView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsLabelUI.6
 * JD-Core Version:    0.6.2
 */