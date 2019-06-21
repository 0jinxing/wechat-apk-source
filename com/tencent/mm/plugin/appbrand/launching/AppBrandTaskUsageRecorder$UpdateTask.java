package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.launching.a.b;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.protobuf.cwf;
import com.tencent.mm.protocal.protobuf.cxj;
import com.tencent.mm.protocal.protobuf.cyb;

public final class AppBrandTaskUsageRecorder$UpdateTask extends MainProcessTask
{
  public static final Parcelable.Creator<UpdateTask> CREATOR;
  AppBrandTaskUsageRecorder.LaunchCheckParams igz;

  static
  {
    AppMethodBeat.i(131769);
    CREATOR = new AppBrandTaskUsageRecorder.UpdateTask.1();
    AppMethodBeat.o(131769);
  }

  AppBrandTaskUsageRecorder$UpdateTask(Parcel paramParcel)
  {
    AppMethodBeat.i(131766);
    g(paramParcel);
    AppMethodBeat.o(131766);
  }

  public AppBrandTaskUsageRecorder$UpdateTask(AppBrandTaskUsageRecorder.LaunchCheckParams paramLaunchCheckParams)
  {
    this.igz = paramLaunchCheckParams;
  }

  public final void asP()
  {
    AppMethodBeat.i(131765);
    if ((!g.RN().eJb) || (com.tencent.mm.kernel.a.QT()))
      AppMethodBeat.o(131765);
    while (true)
    {
      return;
      this.igz.getClass();
      Object localObject = this.igz.igx.hgF;
      cyb localcyb = b.b((AppBrandLaunchReferrer)localObject);
      cxj localcxj = b.c((AppBrandLaunchReferrer)localObject);
      localObject = new cwf();
      ((cwf)localObject).wzF = this.igz.igx.gVs;
      ((cwf)localObject).vMG = this.igz.gVu;
      ((cwf)localObject).Scene = this.igz.igy.scene;
      ((cwf)localObject).wDB = this.igz.igx.hgC;
      ((cwf)localObject).wDA = 1;
      ((cwf)localObject).wDz = this.igz.igy.cOq;
      new com.tencent.mm.plugin.appbrand.launching.a.a(this.igz.igx.appId, false, (cwf)localObject, localcyb, localcxj, this.igz.bQd, this.igz.hCY, this.igz.hgN).aHF();
      AppMethodBeat.o(131765);
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(131767);
    this.igz = ((AppBrandTaskUsageRecorder.LaunchCheckParams)paramParcel.readParcelable(AppBrandTaskUsageRecorder.LaunchCheckParams.class.getClassLoader()));
    AppMethodBeat.o(131767);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131768);
    paramParcel.writeParcelable(this.igz, paramInt);
    AppMethodBeat.o(131768);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder.UpdateTask
 * JD-Core Version:    0.6.2
 */