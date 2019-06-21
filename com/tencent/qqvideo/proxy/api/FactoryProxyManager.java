package com.tencent.qqvideo.proxy.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqvideo.proxy.common.PlayManagerImp;

public class FactoryProxyManager
{
  private static IPlayManager playManager = null;

  public static IPlayManager getPlayManager()
  {
    try
    {
      AppMethodBeat.i(124390);
      if (playManager == null)
      {
        localObject1 = new com/tencent/qqvideo/proxy/common/PlayManagerImp;
        ((PlayManagerImp)localObject1).<init>();
        playManager = (IPlayManager)localObject1;
      }
      Object localObject1 = playManager;
      AppMethodBeat.o(124390);
      return localObject1;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqvideo.proxy.api.FactoryProxyManager
 * JD-Core Version:    0.6.2
 */