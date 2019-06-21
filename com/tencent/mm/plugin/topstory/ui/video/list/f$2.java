package com.tencent.mm.plugin.topstory.ui.video.list;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.f.a;
import com.tencent.mm.plugin.topstory.ui.video.l;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.plugin.websearch.api.a.a;

final class f$2
  implements View.OnClickListener
{
  f$2(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(2036);
    if (f.a(this.sGV) == f.a.sDK)
    {
      this.sGV.getListVideoUIComponent().cFQ().sEM = true;
      f.b(this.sGV).FE(2);
    }
    if (this.sGV.getListVideoUIComponent().cFQ().isConnected())
    {
      f.a(this.sGV, f.a.sDJ);
      if (this.sGV.getListVideoUIComponent().cFV().sFw)
      {
        this.sGV.getListVideoUIComponent().cFV().cEf();
        this.sGV.cGp();
        a.kT(19);
        AppMethodBeat.o(2036);
      }
    }
    while (true)
    {
      return;
      this.sGV.O(true, false);
      break;
      a.kT(20);
      AppMethodBeat.o(2036);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.f.2
 * JD-Core Version:    0.6.2
 */