package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.task.h;

final class JsApiLaunchMiniProgram$LaunchPreconditionTask extends MainProcessTask
{
  public static final Parcelable.Creator<LaunchPreconditionTask> CREATOR;
  private String hQL;
  private int hQM;
  private int hQN;

  static
  {
    AppMethodBeat.i(131335);
    CREATOR = new JsApiLaunchMiniProgram.LaunchPreconditionTask.1();
    AppMethodBeat.o(131335);
  }

  JsApiLaunchMiniProgram$LaunchPreconditionTask()
  {
    AppMethodBeat.i(131333);
    this.hQN = JsApiLaunchMiniProgram.LaunchPreconditionTask.a.hQO.ordinal();
    AppMethodBeat.o(131333);
  }

  JsApiLaunchMiniProgram$LaunchPreconditionTask(Parcel paramParcel)
  {
    AppMethodBeat.i(131334);
    this.hQN = JsApiLaunchMiniProgram.LaunchPreconditionTask.a.hQO.ordinal();
    g(paramParcel);
    AppMethodBeat.o(131334);
  }

  public final void asP()
  {
    AppMethodBeat.i(131331);
    h.DS(this.hQL);
    this.hQN = JsApiLaunchMiniProgram.LaunchPreconditionTask.a.hQQ.ordinal();
    AppMethodBeat.o(131331);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(131330);
    this.hQL = paramParcel.readString();
    this.hQM = paramParcel.readInt();
    this.hQN = paramParcel.readInt();
    AppMethodBeat.o(131330);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131332);
    paramParcel.writeString(this.hQL);
    paramParcel.writeInt(this.hQM);
    paramParcel.writeInt(this.hQN);
    AppMethodBeat.o(131332);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiLaunchMiniProgram.LaunchPreconditionTask
 * JD-Core Version:    0.6.2
 */