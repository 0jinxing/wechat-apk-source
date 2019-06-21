package com.tencent.mm.plugin.freewifi.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.f;

final class a$2
  implements Runnable
{
  a$2(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20927);
    View localView = a.b(this.myk).findViewById(2131824170);
    f.dMn().d(new a.2.3(this)).f(new a.2.2(this, localView)).d(new a.2.1(this, localView));
    AppMethodBeat.o(20927);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.a.2
 * JD-Core Version:    0.6.2
 */