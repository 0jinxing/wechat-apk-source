package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.video.f.a;
import com.tencent.mm.plugin.topstory.ui.video.l;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.plugin.websearch.api.a.a;

final class e$13
  implements View.OnClickListener
{
  e$13(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1898);
    if (e.j(this.sFU) == f.a.sDK)
    {
      this.sFU.getFSVideoUIComponent().cFQ().sEM = true;
      e.k(this.sFU).FE(2);
    }
    if (this.sFU.getFSVideoUIComponent().cFQ().isConnected())
    {
      e.a(this.sFU, f.a.sDJ);
      if (this.sFU.getFSVideoUIComponent().cFV().sFw)
      {
        this.sFU.getFSVideoUIComponent().cFV().cEf();
        a.kT(19);
        AppMethodBeat.o(1898);
      }
    }
    while (true)
    {
      return;
      this.sFU.O(true, false);
      break;
      a.kT(20);
      AppMethodBeat.o(1898);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.13
 * JD-Core Version:    0.6.2
 */