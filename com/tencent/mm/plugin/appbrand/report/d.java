package com.tencent.mm.plugin.appbrand.report;

import a.l;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/report/AppBrandServiceTypeCache;", "", "()V", "TAG", "", "serviceTypeMap", "Landroid/util/SparseIntArray;", "addServiceTypeMap", "", "appId", "serviceType", "", "getServiceTypeMap", "default", "plugin-appbrand-integration_release"})
public final class d
{
  private static final SparseIntArray iAk;
  public static final d iAl;

  static
  {
    AppMethodBeat.i(134937);
    iAl = new d();
    iAk = new SparseIntArray();
    AppMethodBeat.o(134937);
  }

  public static final int Dy(String paramString)
  {
    AppMethodBeat.i(134936);
    int i = Dx(paramString);
    AppMethodBeat.o(134936);
    return i;
  }

  public static final void bs(String paramString, int paramInt)
  {
    AppMethodBeat.i(134934);
    if (paramString != null)
    {
      ab.d("MicroMsg.AppBrandServiceTypeCache", "addServiceTypeMap appId: " + paramString + ", serviceType: " + paramInt);
      iAk.put(paramString.hashCode(), paramInt);
    }
    AppMethodBeat.o(134934);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.d
 * JD-Core Version:    0.6.2
 */