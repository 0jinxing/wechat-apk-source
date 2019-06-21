package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.a.f;
import com.tencent.mm.plugin.topstory.ui.video.l;
import com.tencent.mm.plugin.topstory.ui.video.o;

final class e$14
  implements View.OnClickListener
{
  e$14(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1899);
    this.sFU.getFSVideoUIComponent().cFR().sFo = 2;
    boolean bool;
    if ((this.sFU.getFSItemUIComponent() != null) && (this.sFU.getFSItemUIComponent().cFP() == this.sFU.getFSVideoUIComponent().cFY()))
    {
      paramView = this.sFU;
      if (!this.sFU.getFSVideoUIComponent().cFQ().sEM)
      {
        bool = true;
        paramView.O(bool, false);
        AppMethodBeat.o(1899);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      this.sFU.getFSVideoUIComponent().FC(e.l(this.sFU).cFP());
      this.sFU.getFSVideoUIComponent().cFR().f(e.m(this.sFU));
      ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(this.sFU.getFSVideoUIComponent().cFT(), e.n(this.sFU), e.o(this.sFU).cFP(), 2, "");
      AppMethodBeat.o(1899);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.14
 * JD-Core Version:    0.6.2
 */