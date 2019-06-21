package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

class JsApiClearStorageTask extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiClearStorageTask> CREATOR;
  public String appId;
  public int hXg;

  static
  {
    AppMethodBeat.i(102033);
    CREATOR = new JsApiClearStorageTask.1();
    AppMethodBeat.o(102033);
  }

  public JsApiClearStorageTask()
  {
  }

  public JsApiClearStorageTask(Parcel paramParcel)
  {
    AppMethodBeat.i(102029);
    g(paramParcel);
    AppMethodBeat.o(102029);
  }

  public final void asP()
  {
    AppMethodBeat.i(102030);
    com.tencent.mm.plugin.appbrand.appstorage.b localb;
    if (e.B(com.tencent.luggage.sdk.customize.b.class) == null)
    {
      localb = null;
      if (localb != null)
        break label42;
      AppMethodBeat.o(102030);
    }
    while (true)
    {
      return;
      localb = ((com.tencent.luggage.sdk.customize.b)e.B(com.tencent.luggage.sdk.customize.b.class)).xG();
      break;
      label42: localb.F(this.hXg, this.appId);
      AppMethodBeat.o(102030);
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(102031);
    this.appId = paramParcel.readString();
    this.hXg = paramParcel.readInt();
    AppMethodBeat.o(102031);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(102032);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.hXg);
    AppMethodBeat.o(102032);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask
 * JD-Core Version:    0.6.2
 */