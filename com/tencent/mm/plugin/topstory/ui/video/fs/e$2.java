package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.a.f;
import com.tencent.mm.plugin.topstory.ui.video.o;

final class e$2
  implements View.OnClickListener
{
  e$2(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1878);
    if ((this.sFU.getFSItemUIComponent() != null) && (this.sFU.getFSItemUIComponent().cFP() != this.sFU.getFSVideoUIComponent().cFY()))
    {
      this.sFU.getFSVideoUIComponent().cFR().sFo = 2;
      this.sFU.getFSVideoUIComponent().FC(e.s(this.sFU).cFP());
      this.sFU.getFSVideoUIComponent().cFR().f(e.t(this.sFU));
      ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(this.sFU.getFSVideoUIComponent().cFT(), e.u(this.sFU), e.v(this.sFU).cFP(), 2, "");
    }
    AppMethodBeat.o(1878);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.2
 * JD-Core Version:    0.6.2
 */