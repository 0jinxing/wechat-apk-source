package com.tencent.mm.plugin.appbrand.appusage;

import a.f.b.j;
import a.l;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/QueryCall;", "Lcom/tencent/mm/ipcinvoker/IPCSyncInvokeTask;", "Lcom/tencent/mm/plugin/appbrand/appusage/QueryParams;", "Landroid/os/Parcel;", "()V", "invoke", "data", "plugin-appbrand-integration_release"})
final class aj
  implements i<QueryParams, Parcel>
{
  private static Parcel a(QueryParams paramQueryParams)
  {
    AppMethodBeat.i(134561);
    Parcel localParcel = Parcel.obtain();
    if ((g.RK()) && (paramQueryParams != null));
    try
    {
      localParcel.writeTypedList(((af)g.K(af.class)).a(paramQueryParams.count, paramQueryParams.haS));
      j.o(localParcel, "Parcel.obtain().apply {\n…}\n            }\n        }");
      AppMethodBeat.o(134561);
      return localParcel;
    }
    catch (Exception paramQueryParams)
    {
      while (true)
        ab.e("MicroMsg.AppBrandCollectionStorageIPC", "QueryCall, writeTypedList e = ".concat(String.valueOf(paramQueryParams)));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.aj
 * JD-Core Version:    0.6.2
 */