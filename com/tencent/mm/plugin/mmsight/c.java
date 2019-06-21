package com.tencent.mm.plugin.mmsight;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentSkipListSet;

public final class c
{
  private static ConcurrentSkipListSet<Integer> oss;

  static
  {
    AppMethodBeat.i(60270);
    oss = new ConcurrentSkipListSet();
    AppMethodBeat.o(60270);
  }

  public static void yK(int paramInt)
  {
    try
    {
      AppMethodBeat.i(60267);
      try
      {
        ab.i("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxing: %s", new Object[] { Integer.valueOf(paramInt) });
        oss.add(Integer.valueOf(paramInt));
        AppMethodBeat.o(60267);
        return;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxing error: %s", new Object[] { localException.getMessage() });
          AppMethodBeat.o(60267);
        }
      }
    }
    finally
    {
    }
  }

  public static void yL(int paramInt)
  {
    try
    {
      AppMethodBeat.i(60268);
      try
      {
        ab.i("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxingFinish: %s", new Object[] { Integer.valueOf(paramInt) });
        oss.remove(Integer.valueOf(paramInt));
        AppMethodBeat.o(60268);
        return;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxingFinish error: %s", new Object[] { localException.getMessage() });
          AppMethodBeat.o(60268);
        }
      }
    }
    finally
    {
    }
  }

  public static boolean yM(int paramInt)
  {
    try
    {
      AppMethodBeat.i(60269);
      try
      {
        bool = oss.contains(Integer.valueOf(paramInt));
        ab.d("MicroMsg.MMSightCaptureVideoRemuxStatus", "isMsgRemuxing: %s, %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
        AppMethodBeat.o(60269);
        return bool;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.MMSightCaptureVideoRemuxStatus", "isMsgRemuxing error: %s", new Object[] { localException.getMessage() });
          AppMethodBeat.o(60269);
          boolean bool = false;
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.c
 * JD-Core Version:    0.6.2
 */