package com.tencent.mm.plugin.appbrand.appcache;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;

final class WxaCommLibRuntimeReader$a
  implements i<IPCVoid, Object>
{
  private WxaPkgWrappingInfo dB(boolean paramBoolean)
  {
    AppMethodBeat.i(59458);
    Object localObject = as.dE(paramBoolean);
    if ((((Pair)localObject).first == as.a.gUM) && (((Pair)localObject).second == null) && (!paramBoolean))
      d.xDG.b(new WxaCommLibRuntimeReader.a.1(this), "AppBrand$checkLibUnbrokenOrDownload_releaseLib(false)");
    if ((((Pair)localObject).second != null) && (((WxaPkgWrappingInfo)((Pair)localObject).second).gVt == 999))
      ((WxaPkgWrappingInfo)((Pair)localObject).second).gVu = 0;
    localObject = (WxaPkgWrappingInfo)((Pair)localObject).second;
    AppMethodBeat.o(59458);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader.a
 * JD-Core Version:    0.6.2
 */