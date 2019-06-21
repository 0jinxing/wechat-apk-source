package com.tencent.mm.plugin.topstory.ui.video.list;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.ui.video.l;
import com.tencent.mm.plugin.topstory.ui.video.o;

final class f$3
  implements View.OnClickListener
{
  f$3(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(2037);
    this.sGV.getListVideoUIComponent().cFR().sFo = 2;
    boolean bool;
    if ((this.sGV.getListItemUIComponent() != null) && (this.sGV.getListItemUIComponent().cFP() == this.sGV.getListVideoUIComponent().cFY()))
    {
      paramView = this.sGV;
      if (!this.sGV.getListVideoUIComponent().cFQ().sEM)
      {
        bool = true;
        paramView.O(bool, false);
        AppMethodBeat.o(2037);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      this.sGV.getListVideoUIComponent().FC(f.c(this.sGV).cFP());
      this.sGV.getListVideoUIComponent().cFR().f(f.d(this.sGV));
      ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(this.sGV.getListVideoUIComponent().cFT(), f.e(this.sGV), f.f(this.sGV).cFP(), 2, "");
      AppMethodBeat.o(2037);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.f.3
 * JD-Core Version:    0.6.2
 */