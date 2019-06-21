package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.PriorityBlockingQueue;

final class n$c extends PriorityBlockingQueue<Runnable>
{
  public n$c()
  {
    super(11, new n.c.1());
    AppMethodBeat.i(79593);
    AppMethodBeat.o(79593);
  }

  private static String ac(Runnable paramRunnable)
  {
    AppMethodBeat.i(79594);
    if ((paramRunnable instanceof f.c))
      if ((((f.c)paramRunnable).vfb instanceof l))
      {
        paramRunnable = String.format("priority = %d, urlKey = %s", new Object[] { Integer.valueOf(((l)((f.c)paramRunnable).vfb).priority), ((f.c)paramRunnable).vfb.dib() });
        AppMethodBeat.o(79594);
      }
    while (true)
    {
      return paramRunnable;
      paramRunnable = String.format("unknown request = %s", new Object[] { ((f.c)paramRunnable).vfb });
      AppMethodBeat.o(79594);
      continue;
      paramRunnable = String.format("unknown runnable = %s", new Object[] { paramRunnable });
      AppMethodBeat.o(79594);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.n.c
 * JD-Core Version:    0.6.2
 */