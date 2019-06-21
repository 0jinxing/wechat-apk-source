package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.d;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements f.d
{
  a$2(a parama, AppBrandLivePlayerView paramAppBrandLivePlayerView)
  {
  }

  public final void wU()
  {
    AppMethodBeat.i(96071);
    Object localObject = this.hLr.hLb;
    if (((k)localObject).hLO);
    for (localObject = ((k)localObject).Bd("resume"); ; localObject = new i())
    {
      ab.i("MicroMsg.AppBrandLivePlayerView", "onForeground code:%d info:%s", new Object[] { Integer.valueOf(((i)localObject).errorCode), ((i)localObject).hLF });
      AppMethodBeat.o(96071);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.a.2
 * JD-Core Version:    0.6.2
 */