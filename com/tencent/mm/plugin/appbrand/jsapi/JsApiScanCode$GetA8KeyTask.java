package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.w;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

public class JsApiScanCode$GetA8KeyTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetA8KeyTask> CREATOR;
  public int actionCode;
  public int cvn;
  public int cvo;
  public String hyL;
  public String hyM;
  public Runnable hyN;

  static
  {
    AppMethodBeat.i(130565);
    CREATOR = new JsApiScanCode.GetA8KeyTask.2();
    AppMethodBeat.o(130565);
  }

  public final void asP()
  {
    AppMethodBeat.i(130559);
    h localh = new h(this.hyL, 36, this.cvn, this.cvo, null, (int)System.currentTimeMillis(), new byte[0]);
    w.a(localh.ehh, new JsApiScanCode.GetA8KeyTask.1(this, localh), true);
    AppMethodBeat.o(130559);
  }

  public final void asQ()
  {
    AppMethodBeat.i(130560);
    if (this.hyN != null)
      this.hyN.run();
    AppMethodBeat.o(130560);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130562);
    this.hyL = paramParcel.readString();
    this.actionCode = paramParcel.readInt();
    this.hyM = paramParcel.readString();
    this.cvn = paramParcel.readInt();
    this.cvo = paramParcel.readInt();
    AppMethodBeat.o(130562);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130561);
    paramParcel.writeString(this.hyL);
    paramParcel.writeInt(this.actionCode);
    paramParcel.writeString(this.hyM);
    paramParcel.writeInt(this.cvn);
    paramParcel.writeInt(this.cvo);
    AppMethodBeat.o(130561);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiScanCode.GetA8KeyTask
 * JD-Core Version:    0.6.2
 */