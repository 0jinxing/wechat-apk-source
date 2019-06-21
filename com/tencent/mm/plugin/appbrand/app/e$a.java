package com.tencent.mm.plugin.appbrand.app;

import a.f.b.j;
import a.l;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.service.a;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/app/ServiceForWebViewAnyProcess$BatchSyncWxaAttr;", "Lcom/tencent/mm/ipcinvoker/IPCSyncInvokeTask;", "Landroid/os/Parcel;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "()V", "invoke", "data", "plugin-appbrand-integration_release"})
final class e$a
  implements i<Parcel, IPCVoid>
{
  private static IPCVoid h(Parcel paramParcel)
  {
    AppMethodBeat.i(134455);
    if (paramParcel != null);
    try
    {
      paramParcel = paramParcel.createStringArrayList();
      if (paramParcel != null)
        ((a)g.K(a.class)).ax((List)paramParcel);
      label35: paramParcel = IPCVoid.eGH;
      j.o(paramParcel, "IPCVoid.VOID");
      AppMethodBeat.o(134455);
      return paramParcel;
    }
    catch (Exception paramParcel)
    {
      break label35;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.e.a
 * JD-Core Version:    0.6.2
 */