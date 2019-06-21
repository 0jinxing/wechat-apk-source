package com.tencent.mm.plugin.appbrand.ui.banner;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class AppBrandStickyBannerLogic$Watcher extends MainProcessTask
{
  public static final Parcelable.Creator<Watcher> CREATOR;
  private static final transient Map<String, f> iKT;
  String iKQ;
  String iKR;
  int iKS;

  static
  {
    AppMethodBeat.i(133312);
    iKT = new HashMap();
    CREATOR = new AppBrandStickyBannerLogic.Watcher.2();
    AppMethodBeat.o(133312);
  }

  public final void asP()
  {
    AppMethodBeat.i(133307);
    if (bo.isNullOrNil(this.iKQ))
      AppMethodBeat.o(133307);
    while (true)
    {
      return;
      synchronized (iKT)
      {
        if (iKT.containsKey(this.iKQ))
          AppBrandStickyBannerLogic.b.c((f)iKT.get(this.iKQ));
        AppBrandStickyBannerLogic.Watcher.1 local1 = new com/tencent/mm/plugin/appbrand/ui/banner/AppBrandStickyBannerLogic$Watcher$1;
        local1.<init>(this);
        AppBrandStickyBannerLogic.b.d(local1);
        iKT.put(this.iKQ, local1);
        AppMethodBeat.o(133307);
      }
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(133308);
    AppBrandStickyBannerLogic.a.bw(this.iKR, this.iKS);
    AppMethodBeat.o(133308);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(133310);
    this.iKQ = paramParcel.readString();
    this.iKR = paramParcel.readString();
    this.iKS = paramParcel.readInt();
    AppMethodBeat.o(133310);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(133309);
    paramParcel.writeString(this.iKQ);
    paramParcel.writeString(this.iKR);
    paramParcel.writeInt(this.iKS);
    AppMethodBeat.o(133309);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.Watcher
 * JD-Core Version:    0.6.2
 */