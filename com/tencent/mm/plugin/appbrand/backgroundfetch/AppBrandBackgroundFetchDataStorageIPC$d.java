package com.tencent.mm.plugin.appbrand.backgroundfetch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

class AppBrandBackgroundFetchDataStorageIPC$d
  implements i<AppBrandBackgroundFetchDataStorageIPC.WxappParams, IPCBoolean>
{
  private static IPCBoolean a(AppBrandBackgroundFetchDataStorageIPC.WxappParams paramWxappParams)
  {
    AppMethodBeat.i(129783);
    if ((paramWxappParams == null) || (bo.isNullOrNil(paramWxappParams.username)))
    {
      ab.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC.javayhu", "SetCall:data or username is null");
      paramWxappParams = new IPCBoolean(false);
      AppMethodBeat.o(129783);
    }
    while (true)
    {
      return paramWxappParams;
      try
      {
        IPCBoolean localIPCBoolean = new com/tencent/mm/ipcinvoker/type/IPCBoolean;
        localIPCBoolean.<init>(((h)g.K(h.class)).a(paramWxappParams.username, paramWxappParams.hca, paramWxappParams.data, paramWxappParams.path, paramWxappParams.query, paramWxappParams.scene, paramWxappParams.time));
        AppMethodBeat.o(129783);
        paramWxappParams = localIPCBoolean;
      }
      catch (Exception paramWxappParams)
      {
        ab.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC.javayhu", "SetCall fail", new Object[] { paramWxappParams });
        paramWxappParams = new IPCBoolean(false);
        AppMethodBeat.o(129783);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC.d
 * JD-Core Version:    0.6.2
 */