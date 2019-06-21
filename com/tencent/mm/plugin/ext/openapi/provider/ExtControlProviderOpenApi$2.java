package com.tencent.mm.plugin.ext.openapi.provider;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fe;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.bo;

final class ExtControlProviderOpenApi$2 extends bj<Integer>
{
  ExtControlProviderOpenApi$2(ExtControlProviderOpenApi paramExtControlProviderOpenApi, String[] paramArrayOfString)
  {
    super(20000L, null);
  }

  private Integer amW()
  {
    AppMethodBeat.i(20313);
    try
    {
      ab.d("MicroMsg.ExtControlProviderOpenApi", "syncTaskCur run ");
      fe localfe = new com/tencent/mm/g/a/fe;
      localfe.<init>();
      localfe.cyA.version = bo.getInt(this.ewE[0], 0);
      localfe.cyA.ssid = this.ewE[1];
      localfe.cyA.bssid = this.ewE[2];
      localfe.cyA.cyC = bo.getInt(this.ewE[3], 0);
      ExtControlProviderOpenApi.2.1 local1 = new com/tencent/mm/plugin/ext/openapi/provider/ExtControlProviderOpenApi$2$1;
      local1.<init>(this, localfe);
      localfe.callback = local1;
      if (!a.xxA.m(localfe))
      {
        ab.i("MicroMsg.ExtControlProviderOpenApi", "connectWifi publish getWifiListEvent fail");
        cC(Integer.valueOf(8));
      }
      AppMethodBeat.o(20313);
      return Integer.valueOf(0);
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ExtControlProviderOpenApi", "exception in connectWifi syncTaskInt.", new Object[] { localException });
        cC(Integer.valueOf(12));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi.2
 * JD-Core Version:    0.6.2
 */