package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.listview.AnimatedExpandableListView;
import java.util.ArrayList;

final class SnsLabelUI$10
  implements Runnable
{
  SnsLabelUI$10(SnsLabelUI paramSnsLabelUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39020);
    SnsLabelUI.a(this.rtz, (ArrayList)a.bJa().bIV());
    if (SnsLabelUI.j(this.rtz) == null)
      SnsLabelUI.a(this.rtz, new ArrayList());
    if (!bo.isNullOrNil(this.rtC))
      if (!SnsLabelUI.j(this.rtz).contains(this.rtC))
        SnsLabelUI.j(this.rtz).add(this.rtC);
    for (int i = SnsLabelUI.j(this.rtz).indexOf(this.rtC); ; i = -1)
    {
      SnsLabelUI.a(this.rtz).T(SnsLabelUI.j(this.rtz));
      SnsLabelUI.k(this.rtz);
      SnsLabelUI.a(this.rtz).rtF = SnsLabelUI.l(this.rtz);
      if ((!bo.isNullOrNil(this.rtC)) && (i != -1))
      {
        if (SnsLabelUI.l(this.rtz) != 2)
          break label246;
        SnsLabelUI.a(this.rtz).rtH.add(this.rtC);
        SnsLabelUI.a(this.rtz).rtJ.clear();
      }
      while (true)
      {
        SnsLabelUI.a(this.rtz).notifyDataSetChanged();
        SnsLabelUI.g(this.rtz).expandGroup(SnsLabelUI.l(this.rtz));
        SnsLabelUI.m(this.rtz);
        AppMethodBeat.o(39020);
        return;
        label246: if (SnsLabelUI.l(this.rtz) == 3)
        {
          SnsLabelUI.a(this.rtz).rtI.add(this.rtC);
          SnsLabelUI.a(this.rtz).rtK.clear();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsLabelUI.10
 * JD-Core Version:    0.6.2
 */