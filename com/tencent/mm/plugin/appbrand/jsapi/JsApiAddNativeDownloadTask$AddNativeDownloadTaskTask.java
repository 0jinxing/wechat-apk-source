package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

class JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask extends MainProcessTask
{
  public static final Parcelable.Creator<AddNativeDownloadTaskTask> CREATOR;
  public int bJt = 0;
  public long crZ = 0L;
  private c hwv;
  Runnable hww;

  static
  {
    AppMethodBeat.i(130389);
    CREATOR = new JsApiAddNativeDownloadTask.AddNativeDownloadTaskTask.2();
    AppMethodBeat.o(130389);
  }

  public final void asP()
  {
    AppMethodBeat.i(130382);
    ab.i("MicroMsg.JsApiAddNativeDownloadTask", "runInMainProcess flag:%d", new Object[] { Integer.valueOf(this.bJt) });
    this.hwv = new JsApiAddNativeDownloadTask.AddNativeDownloadTaskTask.1(this);
    a.xxA.b(this.hwv);
    AppMethodBeat.o(130382);
  }

  public final void asQ()
  {
    AppMethodBeat.i(130383);
    if (this.hww != null)
      this.hww.run();
    AppMethodBeat.o(130383);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130384);
    this.bJt = paramParcel.readInt();
    this.crZ = paramParcel.readLong();
    AppMethodBeat.o(130384);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130385);
    paramParcel.writeInt(this.bJt);
    paramParcel.writeLong(this.crZ);
    AppMethodBeat.o(130385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask.AddNativeDownloadTaskTask
 * JD-Core Version:    0.6.2
 */