package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.b;
import com.tencent.mm.plugin.appbrand.r.h;
import com.tencent.mm.sdk.platformtools.ab;

class HCEEventLogic$SendHCEEventToMMTask extends MainProcessTask
{
  public static final Parcelable.Creator<SendHCEEventToMMTask> CREATOR;
  private String appId;
  private int hRW;
  private Bundle hRX;

  static
  {
    AppMethodBeat.i(137854);
    CREATOR = new HCEEventLogic.SendHCEEventToMMTask.1();
    AppMethodBeat.o(137854);
  }

  protected HCEEventLogic$SendHCEEventToMMTask(Parcel paramParcel)
  {
    AppMethodBeat.i(137849);
    g(paramParcel);
    AppMethodBeat.o(137849);
  }

  private HCEEventLogic$SendHCEEventToMMTask(String paramString, int paramInt, Bundle paramBundle)
  {
    this.hRW = paramInt;
    this.appId = paramString;
    this.hRX = paramBundle;
  }

  public final void asP()
  {
    AppMethodBeat.i(137850);
    ab.i("MicroMsg.HCEEventLogic", "alvinluo HCEEventLogic SendHCEEventToMMTask runInMainProcess");
    b.hSG.a(this.hRW, this.appId, this.hRX);
    aCb();
    AppMethodBeat.o(137850);
  }

  public final void asQ()
  {
    AppMethodBeat.i(137851);
    super.asQ();
    h.at(this);
    AppMethodBeat.o(137851);
  }

  public int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(137852);
    super.g(paramParcel);
    this.hRW = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.hRX = paramParcel.readBundle();
    AppMethodBeat.o(137852);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(137853);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.hRW);
    paramParcel.writeString(this.appId);
    paramParcel.writeBundle(this.hRX);
    AppMethodBeat.o(137853);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.HCEEventLogic.SendHCEEventToMMTask
 * JD-Core Version:    0.6.2
 */