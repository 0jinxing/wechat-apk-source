package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.b.g;
import com.tencent.mm.ui.l;
import java.util.HashSet;
import java.util.Iterator;

public final class h
  implements g, l
{
  private HashSet<l> yOL;

  public h()
  {
    AppMethodBeat.i(31289);
    this.yOL = new HashSet();
    AppMethodBeat.o(31289);
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(31290);
    if (!this.yOL.contains(paraml))
      this.yOL.add(paraml);
    AppMethodBeat.o(31290);
  }

  public final void b(l paraml)
  {
    AppMethodBeat.i(31291);
    this.yOL.remove(paraml);
    AppMethodBeat.o(31291);
  }

  public final void dxA()
  {
    AppMethodBeat.i(31295);
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.yOL).iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      long l2 = System.currentTimeMillis();
      locall.dxA();
      long l3 = System.currentTimeMillis();
      if (ab.getLogLevel() == 0)
        ab.v("MicroMsg.ChattingLifecycleObserver", "[onChattingResume] listener:%s cost:%sms", new Object[] { locall.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    ab.i("MicroMsg.ChattingLifecycleObserver", "[onChattingResume]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(31295);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31296);
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.yOL).iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      long l2 = System.currentTimeMillis();
      locall.dxB();
      long l3 = System.currentTimeMillis();
      if (ab.getLogLevel() == 0)
        ab.v("MicroMsg.ChattingLifecycleObserver", "[onChattingPause] listener:%s cost:%sms", new Object[] { locall.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    ab.i("MicroMsg.ChattingLifecycleObserver", "[onChattingPause]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(31296);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31297);
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.yOL).iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      long l2 = System.currentTimeMillis();
      locall.dxC();
      long l3 = System.currentTimeMillis();
      if (ab.getLogLevel() == 0)
        ab.v("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimStart] listener:%s cost:%sms", new Object[] { locall.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    ab.i("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimStart]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(31297);
  }

  public final void dxD()
  {
    AppMethodBeat.i(31298);
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.yOL).iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      long l2 = System.currentTimeMillis();
      locall.dxD();
      long l3 = System.currentTimeMillis();
      if (ab.getLogLevel() == 0)
        ab.v("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimEnd] listener:%s cost:%sms", new Object[] { locall.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    ab.i("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimEnd]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(31298);
  }

  public final void dxx()
  {
    AppMethodBeat.i(31292);
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.yOL).iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      long l2 = System.currentTimeMillis();
      locall.dxx();
      long l3 = System.currentTimeMillis();
      if (ab.getLogLevel() == 0)
        ab.v("MicroMsg.ChattingLifecycleObserver", "[onChattingInit] listener:%s cost:%sms", new Object[] { locall.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    ab.i("MicroMsg.ChattingLifecycleObserver", "[onChattingInit]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(31292);
  }

  public final void dxy()
  {
    AppMethodBeat.i(31293);
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.yOL).iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      long l2 = System.currentTimeMillis();
      locall.dxy();
      long l3 = System.currentTimeMillis();
      if (ab.getLogLevel() == 0)
        ab.v("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimStart] listener:%s cost:%sms", new Object[] { locall.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    ab.i("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimStart]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(31293);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31294);
    long l1 = System.currentTimeMillis();
    Iterator localIterator = new HashSet(this.yOL).iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      long l2 = System.currentTimeMillis();
      locall.dxz();
      long l3 = System.currentTimeMillis();
      if (ab.getLogLevel() == 0)
        ab.v("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimEnd] listener:%s cost:%sms", new Object[] { locall.getClass().getSimpleName(), Long.valueOf(l3 - l2) });
    }
    ab.i("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimEnd]cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(31294);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.h
 * JD-Core Version:    0.6.2
 */