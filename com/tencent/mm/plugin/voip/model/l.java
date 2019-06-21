package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.locks.ReentrantLock;

public final class l
{
  private static l sPJ;
  private ReentrantLock cbR;
  private k sPK;

  static
  {
    AppMethodBeat.i(4435);
    sPJ = new l();
    AppMethodBeat.o(4435);
  }

  private l()
  {
    AppMethodBeat.i(4433);
    this.cbR = new ReentrantLock();
    AppMethodBeat.o(4433);
  }

  public static k cIW()
  {
    AppMethodBeat.i(4434);
    if (sPJ.sPK == null)
      sPJ.cbR.lock();
    try
    {
      if (sPJ.sPK == null)
      {
        localObject1 = sPJ;
        k localk = new com/tencent/mm/plugin/voip/model/k;
        localk.<init>();
        ((l)localObject1).sPK = localk;
      }
      sPJ.cbR.unlock();
      Object localObject1 = sPJ.sPK;
      AppMethodBeat.o(4434);
      return localObject1;
    }
    finally
    {
      sPJ.cbR.unlock();
      AppMethodBeat.o(4434);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.l
 * JD-Core Version:    0.6.2
 */