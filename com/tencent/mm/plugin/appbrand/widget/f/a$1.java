package com.tencent.mm.plugin.appbrand.widget.f;

import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87522);
    a locala = this.jmA;
    if ((locala.getAlpha() == 0.0F) || (locala.jmz != null))
      AppMethodBeat.o(87522);
    while (true)
    {
      return;
      locala.animate().cancel();
      ViewPropertyAnimator localViewPropertyAnimator = locala.animate();
      locala.jmz = localViewPropertyAnimator;
      localViewPropertyAnimator.alpha(0.0F).setListener(new a.3(locala)).start();
      AppMethodBeat.o(87522);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.f.a.1
 * JD-Core Version:    0.6.2
 */