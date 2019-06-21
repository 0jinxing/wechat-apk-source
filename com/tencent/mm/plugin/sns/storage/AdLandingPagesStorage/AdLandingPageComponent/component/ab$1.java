package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

final class ab$1
  implements Runnable
{
  ab$1(ab paramab)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37346);
    try
    {
      ab.a(this.rca).await();
      label15: if ((ab.b(this.rca) != null) && (ab.c(this.rca) != null))
        this.rca.contentView.post(new ab.1.1(this));
      AppMethodBeat.o(37346);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label15;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab.1
 * JD-Core Version:    0.6.2
 */