package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.widget.listview.AnimatedExpandableListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

final class SnsLabelUI$3
  implements Runnable
{
  SnsLabelUI$3(SnsLabelUI paramSnsLabelUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39013);
    SnsLabelUI.a(this.rtz).rtF = SnsLabelUI.l(this.rtz);
    if (SnsLabelUI.b(this.rtz) != null)
    {
      if (SnsLabelUI.j(this.rtz) == null)
        SnsLabelUI.a(this.rtz, SnsLabelUI.b(this.rtz));
      while (true)
      {
        localObject = SnsLabelUI.b(this.rtz).iterator();
        while (((Iterator)localObject).hasNext())
        {
          SnsLabelUI.a(this.rtz);
          ap.ZF((String)((Iterator)localObject).next());
        }
        SnsLabelUI.j(this.rtz).addAll(SnsLabelUI.b(this.rtz));
      }
      Object localObject = new HashSet(SnsLabelUI.j(this.rtz));
      SnsLabelUI.j(this.rtz).clear();
      SnsLabelUI.j(this.rtz).addAll((Collection)localObject);
      SnsLabelUI.b(this.rtz).clear();
      SnsLabelUI.q(this.rtz);
      ((HashSet)localObject).clear();
    }
    SnsLabelUI.a(this.rtz).T(SnsLabelUI.j(this.rtz));
    SnsLabelUI.k(this.rtz);
    SnsLabelUI.a(this.rtz).notifyDataSetChanged();
    SnsLabelUI.g(this.rtz).Qi(SnsLabelUI.a(this.rtz).rtF);
    if ((SnsLabelUI.r(this.rtz) != null) && (SnsLabelUI.r(this.rtz).isShowing()))
      SnsLabelUI.r(this.rtz).dismiss();
    AppMethodBeat.o(39013);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsLabelUI.3
 * JD-Core Version:    0.6.2
 */