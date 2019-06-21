package com.tencent.mm.plugin.appbrand.backgroundfetch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

class AppBrandBackgroundFetchDataStorageIPC$a
  implements i<AppBrandBackgroundFetchDataStorageIPC.WxappIdentity, IPCBoolean>
{
  private static IPCBoolean a(AppBrandBackgroundFetchDataStorageIPC.WxappIdentity paramWxappIdentity)
  {
    AppMethodBeat.i(129777);
    if ((paramWxappIdentity == null) || (bo.isNullOrNil(paramWxappIdentity.username)))
    {
      ab.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC.javayhu", "DeleteCall:data or username is null");
      paramWxappIdentity = new IPCBoolean(false);
      AppMethodBeat.o(129777);
    }
    while (true)
    {
      return paramWxappIdentity;
      try
      {
        IPCBoolean localIPCBoolean = new com/tencent/mm/ipcinvoker/type/IPCBoolean;
        localIPCBoolean.<init>(((h)g.K(h.class)).ao(paramWxappIdentity.username, paramWxappIdentity.hca));
        AppMethodBeat.o(129777);
        paramWxappIdentity = localIPCBoolean;
      }
      catch (Exception paramWxappIdentity)
      {
        ab.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC.javayhu", "DeleteCall fail", new Object[] { paramWxappIdentity });
        paramWxappIdentity = new IPCBoolean(false);
        AppMethodBeat.o(129777);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC.a
 * JD-Core Version:    0.6.2
 */