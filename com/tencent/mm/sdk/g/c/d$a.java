package com.tencent.mm.sdk.g.c;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.b.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class d$a
  implements a
{
  int cml;
  String name;
  List<al> xEL;
  AtomicInteger xEM;

  public d$a(String paramString, int paramInt)
  {
    AppMethodBeat.i(52693);
    this.xEL = new ArrayList();
    this.xEM = new AtomicInteger(0);
    this.cml = paramInt;
    this.name = paramString;
    reset();
    AppMethodBeat.o(52693);
  }

  private void dqr()
  {
    AppMethodBeat.i(52699);
    if (this.xEM.incrementAndGet() >= this.cml)
      this.xEM.set(0);
    AppMethodBeat.o(52699);
  }

  public final void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(52698);
    ((al)this.xEL.get(this.xEM.get())).aa(paramRunnable);
    dqr();
    AppMethodBeat.o(52698);
  }

  public final int getCorePoolSize()
  {
    return this.cml;
  }

  public final void p(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(52697);
    ((al)this.xEL.get(this.xEM.get())).m(paramRunnable, paramLong);
    dqr();
    AppMethodBeat.o(52697);
  }

  public final boolean remove(Runnable paramRunnable)
  {
    AppMethodBeat.i(52694);
    Iterator localIterator = this.xEL.iterator();
    while (localIterator.hasNext())
      ((al)localIterator.next()).doN().removeCallbacks(paramRunnable);
    AppMethodBeat.o(52694);
    return true;
  }

  public final void reset()
  {
    AppMethodBeat.i(52696);
    this.xEL.clear();
    for (int i = 0; i < this.cml; i++)
      this.xEL.add(new al(this.name + i));
    AppMethodBeat.o(52696);
  }

  public final void shutdown()
  {
    AppMethodBeat.i(52695);
    Iterator localIterator = this.xEL.iterator();
    while (localIterator.hasNext())
      ((al)localIterator.next()).oAl.quit();
    AppMethodBeat.o(52695);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.c.d.a
 * JD-Core Version:    0.6.2
 */