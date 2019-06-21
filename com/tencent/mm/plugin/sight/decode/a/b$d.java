package com.tencent.mm.plugin.sight.decode.a;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class b$d
  implements Runnable
{
  private b$d(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70240);
    if (b.l(this.qxW).get() == null)
      AppMethodBeat.o(70240);
    while (true)
    {
      return;
      ((View)b.l(this.qxW).get()).startAnimation(b.m(this.qxW));
      AppMethodBeat.o(70240);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.a.b.d
 * JD-Core Version:    0.6.2
 */