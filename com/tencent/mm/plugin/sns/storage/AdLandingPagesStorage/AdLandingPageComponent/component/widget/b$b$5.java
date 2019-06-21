package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

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
    AppMethodBeat.i(37419);
    if (b.q(this.rcv.rct) != null)
    {
      View localView = b.q(this.rcv.rct).cli();
      if (localView != null)
      {
        if ((b.C(this.rcv.rct) == null) && (b.q(this.rcv.rct).clj() != -1) && (b.k(this.rcv.rct).get() != null))
          b.a(this.rcv.rct, AnimationUtils.loadAnimation(((View)b.k(this.rcv.rct).get()).getContext(), b.q(this.rcv.rct).clj()));
        if (b.C(this.rcv.rct) != null)
          localView.startAnimation(b.C(this.rcv.rct));
        localView.setVisibility(0);
      }
    }
    AppMethodBeat.o(37419);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.b.5
 * JD-Core Version:    0.6.2
 */