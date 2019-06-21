package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.rtmp.ITXLiveBaseListener;

final class j$1
  implements ITXLiveBaseListener
{
  public final void OnLog(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(96128);
    switch (paramInt)
    {
    default:
      ab.d(paramString1, paramString2);
      AppMethodBeat.o(96128);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return;
      ab.v(paramString1, paramString2);
      AppMethodBeat.o(96128);
      continue;
      ab.d(paramString1, paramString2);
      AppMethodBeat.o(96128);
      continue;
      ab.i(paramString1, paramString2);
      AppMethodBeat.o(96128);
      continue;
      ab.w(paramString1, paramString2);
      AppMethodBeat.o(96128);
      continue;
      ab.e(paramString1, paramString2);
      AppMethodBeat.o(96128);
      continue;
      ab.f(paramString1, paramString2);
      AppMethodBeat.o(96128);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.j.1
 * JD-Core Version:    0.6.2
 */