package com.tencent.mm.plugin.appbrand.backgroundfetch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

class AppBrandBackgroundFetchDataStorageIPC$b
  implements i<AppBrandBackgroundFetchDataStorageIPC.WxappIdentityWithAppId, AppBrandBackgroundFetchDataParcel>
{
  private static AppBrandBackgroundFetchDataParcel a(AppBrandBackgroundFetchDataStorageIPC.WxappIdentityWithAppId paramWxappIdentityWithAppId)
  {
    AppMethodBeat.i(129779);
    if ((paramWxappIdentityWithAppId == null) || (bo.isNullOrNil(paramWxappIdentityWithAppId.csB)))
    {
      ab.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC.javayhu", "GetByAppIdCall:data or appid is null");
      AppMethodBeat.o(129779);
      paramWxappIdentityWithAppId = null;
    }
    while (true)
    {
      return paramWxappIdentityWithAppId;
      try
      {
        paramWxappIdentityWithAppId = ((h)g.K(h.class)).aR(paramWxappIdentityWithAppId.csB, paramWxappIdentityWithAppId.hca);
        AppMethodBeat.o(129779);
      }
      catch (Exception paramWxappIdentityWithAppId)
      {
        ab.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC.javayhu", "GetByAppIdCall fail", new Object[] { paramWxappIdentityWithAppId });
        AppMethodBeat.o(129779);
        paramWxappIdentityWithAppId = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC.b
 * JD-Core Version:    0.6.2
 */