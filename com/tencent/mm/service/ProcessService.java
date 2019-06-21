package com.tencent.mm.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.CoreService.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentHashMap;

public final class ProcessService
{
  public static ConcurrentHashMap<String, b> xFh;

  static
  {
    AppMethodBeat.i(58945);
    xFh = new ConcurrentHashMap();
    AppMethodBeat.o(58945);
  }

  public static class DexOptProcessService extends CommonProcessService
  {
    public final String getTag()
    {
      return "MicroMsg.DexOptProcessService";
    }
  }

  public static class MMProcessService extends CommonProcessService
  {
    private CoreService.a ebC = null;

    public final String getTag()
    {
      return "MicroMsg.MMProcessService";
    }

    public void onCreate()
    {
      AppMethodBeat.i(58943);
      try
      {
        this.ebC = ((CoreService.a)Class.forName("com.tencent.mm.platformtools.BroadcastHelper").newInstance());
        ab.d("MicroMsg.MMProcessService", "broadcastRegisterHelper = %s", new Object[] { this.ebC });
        this.ebC.registerBroadcasts();
        super.onCreate();
        AppMethodBeat.o(58943);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.MMProcessService", "onCreate Class.forName(com.tencent.mm.platformtools.BroadcastHelper) Exception = %s ", new Object[] { localException.getMessage() });
      }
    }

    public void onDestroy()
    {
      AppMethodBeat.i(58944);
      if (this.ebC != null);
      try
      {
        this.ebC.unRegisterBroadcasts();
        super.onDestroy();
        AppMethodBeat.o(58944);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.MMProcessService", "onDestroy unRegisterBroadcasts() Exception = %s ", new Object[] { localException.getMessage() });
      }
    }
  }

  public static class SandBoxProcessService extends CommonProcessService
  {
    public final String getTag()
    {
      return "MicroMsg.SandBoxProcessService";
    }
  }

  public static class ToolsmpProcessService extends CommonProcessService
  {
    public final String getTag()
    {
      return "MicroMsg.ToolsmpProcessService";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.service.ProcessService
 * JD-Core Version:    0.6.2
 */