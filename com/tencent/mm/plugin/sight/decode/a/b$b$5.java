package com.tencent.mm.plugin.sight.decode.a;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class b$b$5
  implements Runnable
{
  b$b$5(b.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70236);
    if (b.r(this.qyc.qxW) != null)
    {
      View localView = b.r(this.qyc.qxW).cli();
      if (localView != null)
      {
        if ((b.D(this.qyc.qxW) == null) && (b.r(this.qyc.qxW).clj() != -1) && (b.l(this.qyc.qxW).get() != null))
          b.a(this.qyc.qxW, AnimationUtils.loadAnimation(((View)b.l(this.qyc.qxW).get()).getContext(), b.r(this.qyc.qxW).clj()));
        if (b.D(this.qyc.qxW) != null)
          localView.startAnimation(b.D(this.qyc.qxW));
        localView.setVisibility(0);
      }
    }
    AppMethodBeat.o(70236);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.a.b.b.5
 * JD-Core Version:    0.6.2
 */