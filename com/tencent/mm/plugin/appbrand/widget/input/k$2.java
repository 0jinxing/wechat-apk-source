package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.aj;
import com.tencent.mm.plugin.appbrand.page.u;

final class k$2
  implements Runnable
{
  k$2(k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123653);
    if (!k.a(this.jeD).isRunning())
      AppMethodBeat.o(123653);
    while (true)
    {
      return;
      Object localObject = k.b(this.jeD);
      if (localObject != null)
      {
        ((View)localObject).scrollTo(0, 0);
        if (k.c(this.jeD) != 0)
        {
          localObject = k.a(this.jeD).aJz();
          if (localObject != null)
          {
            localObject = ((aj)localObject).getContentView();
            if (localObject != null)
              ((View)localObject).scrollBy(((View)localObject).getScrollX(), -k.c(this.jeD));
          }
        }
        k.d(this.jeD);
      }
      AppMethodBeat.o(123653);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.k.2
 * JD-Core Version:    0.6.2
 */