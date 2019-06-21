package com.tencent.mm.plugin.appbrand.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.task.h;

public class AppBrandProcessSuicideLogic$ProcessRestartTask extends MainProcessTask
{
  public static final Parcelable.Creator<ProcessRestartTask> CREATOR;
  public String eHT;
  public String gQX;

  static
  {
    AppMethodBeat.i(129201);
    CREATOR = new AppBrandProcessSuicideLogic.ProcessRestartTask.1();
    AppMethodBeat.o(129201);
  }

  public final void asP()
  {
    AppMethodBeat.i(129198);
    b.pj(this.eHT);
    h.DO(this.gQX);
    AppMethodBeat.o(129198);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(129200);
    this.eHT = paramParcel.readString();
    this.gQX = paramParcel.readString();
    AppMethodBeat.o(129200);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(129199);
    paramParcel.writeString(this.eHT);
    paramParcel.writeString(this.gQX);
    AppMethodBeat.o(129199);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic.ProcessRestartTask
 * JD-Core Version:    0.6.2
 */