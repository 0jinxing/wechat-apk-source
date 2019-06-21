package com.tencent.mm.plugin.webview.luggage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.webview.model.ap;

class LuggageMMLocalResourceProvider$GetLocalResourceInfoTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetLocalResourceInfoTask> CREATOR;
  String czD;
  Runnable hyN;
  int infoType;
  String path;

  static
  {
    AppMethodBeat.i(5986);
    CREATOR = new LuggageMMLocalResourceProvider.GetLocalResourceInfoTask.1();
    AppMethodBeat.o(5986);
  }

  public final void asP()
  {
    AppMethodBeat.i(5982);
    switch (this.infoType)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      aCb();
      AppMethodBeat.o(5982);
      return;
      this.path = ap.aeC(this.czD);
      continue;
      this.path = ap.aeD(this.czD);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(5983);
    if (this.hyN != null)
      this.hyN.run();
    AppMethodBeat.o(5983);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(5985);
    this.czD = paramParcel.readString();
    this.infoType = paramParcel.readInt();
    this.path = paramParcel.readString();
    AppMethodBeat.o(5985);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(5984);
    paramParcel.writeString(this.czD);
    paramParcel.writeInt(this.infoType);
    paramParcel.writeString(this.path);
    AppMethodBeat.o(5984);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider.GetLocalResourceInfoTask
 * JD-Core Version:    0.6.2
 */