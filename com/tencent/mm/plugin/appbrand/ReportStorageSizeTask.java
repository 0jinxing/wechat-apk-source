package com.tencent.mm.plugin.appbrand;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.appstorage.b;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.appstorage.c.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.report.service.h;

public class ReportStorageSizeTask extends MainProcessTask
{
  public static final Parcelable.Creator<ReportStorageSizeTask> CREATOR;
  public String appId;

  static
  {
    AppMethodBeat.i(129148);
    CREATOR = new ReportStorageSizeTask.1();
    AppMethodBeat.o(129148);
  }

  public final void asP()
  {
    AppMethodBeat.i(129145);
    Object localObject = com.tencent.mm.plugin.appbrand.app.f.xG();
    if (localObject == null)
    {
      AppMethodBeat.o(129145);
      return;
    }
    c.a locala = c.gXe;
    if (c.a.xV(this.appId) != 1)
      localObject = com.tencent.mm.plugin.appbrand.appstorage.f.gXv;
    for (localObject = Integer.valueOf(com.tencent.mm.plugin.appbrand.appstorage.f.xT(this.appId)); ; localObject = Integer.valueOf(((b)localObject).xT(this.appId)))
    {
      h.pYm.e(14073, new Object[] { this.appId, "", "", localObject, Long.valueOf(AppBrandLocalMediaObjectManager.xW(this.appId)), Long.valueOf(AppBrandLocalMediaObjectManager.xX(this.appId)) });
      AppMethodBeat.o(129145);
      break;
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(129147);
    this.appId = paramParcel.readString();
    AppMethodBeat.o(129147);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(129146);
    paramParcel.writeString(this.appId);
    AppMethodBeat.o(129146);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ReportStorageSizeTask
 * JD-Core Version:    0.6.2
 */