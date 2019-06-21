package com.tencent.mm.plugin.choosemsgfile.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b
{
  private static final ThreadPoolExecutor iBq;

  static
  {
    AppMethodBeat.i(54254);
    iBq = new ThreadPoolExecutor(0, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
    AppMethodBeat.o(54254);
  }

  public static void a(com.tencent.mm.plugin.choosemsgfile.b.b.a parama, a parama1, com.tencent.mm.vending.e.b paramb)
  {
    AppMethodBeat.i(54253);
    com.tencent.luggage.g.d.i("MicroMsg.MsgFileMgr", "sumbit() item:%s", new Object[] { parama });
    Object localObject = null;
    switch (parama.getType())
    {
    default:
      parama = localObject;
      if (parama == null)
      {
        com.tencent.luggage.g.d.e("MicroMsg.MsgFileMgr", "downloadTask is null, return");
        parama1.bfe();
        AppMethodBeat.o(54253);
      }
      break;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return;
      parama = new e(parama, parama1, paramb);
      break;
      parama = new f(parama, parama1, paramb);
      break;
      parama = new g(parama, parama1, paramb);
      break;
      parama = new d(parama, parama1, paramb);
      break;
      if (!parama.checkValid())
      {
        com.tencent.luggage.g.d.e("MicroMsg.MsgFileMgr", "downloadTask is invalid, return");
        parama1.bfg();
        AppMethodBeat.o(54253);
      }
      else
      {
        if (!parama.bfh())
          iBq.submit(parama);
        AppMethodBeat.o(54253);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.a.b
 * JD-Core Version:    0.6.2
 */