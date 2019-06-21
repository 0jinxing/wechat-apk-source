package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

public class JsApiRemoveStorageTask extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiRemoveStorageTask> CREATOR;
  public String appId;
  public int hXg;
  public String key;

  static
  {
    AppMethodBeat.i(102071);
    CREATOR = new JsApiRemoveStorageTask.1();
    AppMethodBeat.o(102071);
  }

  public final void asP()
  {
    AppMethodBeat.i(102068);
    com.tencent.mm.plugin.appbrand.appstorage.b localb;
    if (e.B(com.tencent.luggage.sdk.customize.b.class) == null)
    {
      localb = null;
      if (localb != null)
        break label42;
      AppMethodBeat.o(102068);
    }
    while (true)
    {
      return;
      localb = ((com.tencent.luggage.sdk.customize.b)e.B(com.tencent.luggage.sdk.customize.b.class)).xG();
      break;
      label42: localb.l(this.hXg, this.appId, this.key);
      AppMethodBeat.o(102068);
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(102070);
    this.appId = paramParcel.readString();
    this.hXg = paramParcel.readInt();
    this.key = paramParcel.readString();
    AppMethodBeat.o(102070);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(102069);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.hXg);
    paramParcel.writeString(this.key);
    AppMethodBeat.o(102069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask
 * JD-Core Version:    0.6.2
 */