package com.tencent.mm.plugin.appbrand.appstorage;

import a.f.b.j;
import a.l;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.n.b;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"KV_STORAGE_ACTION_GET", "", "KV_STORAGE_ACTION_INFO", "KV_STORAGE_ACTION_SET", "KV_STORAGE_SCHEME_DB", "KV_STORAGE_SCHEME_MMKV", "TAG", "", "report", "", "scheme", "action", "dataSize", "count", "cost", "", "service", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentWithExtra;", "luggage-wechat-full-sdk_release"})
public final class q
{
  public static final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, com.tencent.mm.plugin.appbrand.jsapi.h paramh)
  {
    AppMethodBeat.i(102457);
    j.p(paramh, "service");
    paramh = paramh.getRuntime();
    if (paramh != null)
    {
      paramh = paramh.ye();
      if (paramh != null)
        break label57;
      ab.i("KVStoragePerformanceReport", "sysConfig is null");
      AppMethodBeat.o(102457);
    }
    while (true)
    {
      return;
      paramh = null;
      break;
      label57: if (!paramh.hhf)
      {
        ab.i("KVStoragePerformanceReport", "performance report off");
        AppMethodBeat.o(102457);
      }
      else
      {
        ab.i("KVStoragePerformanceReport", "report scheme=" + paramInt1 + "  action=" + paramInt2 + "  dataSize=" + paramInt3 + "  count=" + paramInt4 + "  cost=" + paramLong);
        ((b)e.C(b.class)).e(16336, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Long.valueOf(paramLong) });
        AppMethodBeat.o(102457);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.q
 * JD-Core Version:    0.6.2
 */