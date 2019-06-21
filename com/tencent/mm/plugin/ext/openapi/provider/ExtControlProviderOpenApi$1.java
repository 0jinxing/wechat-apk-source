package com.tencent.mm.plugin.ext.openapi.provider;

import android.database.MatrixCursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bj;

final class ExtControlProviderOpenApi$1 extends bj<MatrixCursor>
{
  ExtControlProviderOpenApi$1(ExtControlProviderOpenApi paramExtControlProviderOpenApi, String[] paramArrayOfString)
  {
    super(20000L, null);
  }

  private MatrixCursor brJ()
  {
    AppMethodBeat.i(20310);
    try
    {
      ab.d("MicroMsg.ExtControlProviderOpenApi", "syncTaskCur run ");
      fh localfh = new com/tencent/mm/g/a/fh;
      localfh.<init>();
      localfh.cyW.cyY = this.ewE;
      ExtControlProviderOpenApi.1.1 local1 = new com/tencent/mm/plugin/ext/openapi/provider/ExtControlProviderOpenApi$1$1;
      local1.<init>(this, localfh);
      localfh.callback = local1;
      if (!com.tencent.mm.sdk.b.a.xxA.m(localfh))
      {
        ab.i("MicroMsg.ExtControlProviderOpenApi", "getWifiList publish getWifiListEvent fail");
        cC(com.tencent.mm.pluginsdk.d.a.a.Kn(8));
      }
      AppMethodBeat.o(20310);
      return null;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ExtControlProviderOpenApi", "exception in getWifiList syncTaskCur.", new Object[] { localException });
        cC(com.tencent.mm.pluginsdk.d.a.a.Kn(12));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi.1
 * JD-Core Version:    0.6.2
 */