package com.tencent.mm.plugin.appbrand.s;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.e.a;
import java.util.concurrent.atomic.AtomicBoolean;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/utils/LifeCycleWrappedRunnable;", "Ljava/lang/Runnable;", "Lcom/tencent/mm/vending/lifecycle/ILifeCycle;", "mRunnable", "(Ljava/lang/Runnable;)V", "mDead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "dead", "", "run", "Companion", "luggage-wxa-app_release"})
public final class p
  implements a, Runnable
{

  @Deprecated
  public static final p.a iRD;
  private final AtomicBoolean iRC;
  private final Runnable mRunnable;

  static
  {
    AppMethodBeat.i(87595);
    iRD = new p.a((byte)0);
    AppMethodBeat.o(87595);
  }

  private p(Runnable paramRunnable)
  {
    AppMethodBeat.i(87594);
    this.mRunnable = paramRunnable;
    this.iRC = new AtomicBoolean(false);
    AppMethodBeat.o(87594);
  }

  public static final p O(Runnable paramRunnable)
  {
    AppMethodBeat.i(87596);
    if ((paramRunnable instanceof p))
    {
      paramRunnable = (p)paramRunnable;
      AppMethodBeat.o(87596);
    }
    while (true)
    {
      return paramRunnable;
      paramRunnable = new p(paramRunnable);
      AppMethodBeat.o(87596);
    }
  }

  public final void dead()
  {
    AppMethodBeat.i(87593);
    this.iRC.set(true);
    AppMethodBeat.o(87593);
  }

  public final void run()
  {
    AppMethodBeat.i(87592);
    if (!this.iRC.get())
    {
      Runnable localRunnable = this.mRunnable;
      if (localRunnable != null)
      {
        localRunnable.run();
        AppMethodBeat.o(87592);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(87592);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.p
 * JD-Core Version:    0.6.2
 */