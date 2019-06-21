package com.tencent.mm.plugin.topstory.ui.video.list;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.a;
import com.tencent.mm.plugin.topstory.ui.video.r;

final class f$4
  implements View.OnClickListener
{
  f$4(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(2038);
    this.sGV.cGv();
    f.g(this.sGV).aFE();
    this.sGV.getListVideoUIComponent().cFR().sFo = 2;
    this.sGV.getListVideoUIComponent().cFV().a(this.sGV.getListVideoUIComponent(), f.h(this.sGV), f.i(this.sGV), f.j(this.sGV).cFP());
    this.sGV.cGp();
    AppMethodBeat.o(2038);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.f.4
 * JD-Core Version:    0.6.2
 */