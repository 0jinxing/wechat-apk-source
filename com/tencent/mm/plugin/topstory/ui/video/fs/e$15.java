package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.a;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.video.r;

final class e$15
  implements View.OnClickListener
{
  e$15(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1900);
    this.sFU.cGv();
    e.e(this.sFU).aFE();
    this.sFU.getFSVideoUIComponent().cFR().sFo = 2;
    this.sFU.getFSVideoUIComponent().cFV().a(this.sFU.getFSVideoUIComponent(), e.p(this.sFU), e.q(this.sFU), e.r(this.sFU).cFP());
    this.sFU.cGp();
    AppMethodBeat.o(1900);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.15
 * JD-Core Version:    0.6.2
 */