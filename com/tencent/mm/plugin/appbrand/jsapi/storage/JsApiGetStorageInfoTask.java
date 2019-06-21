package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import java.util.ArrayList;

public class JsApiGetStorageInfoTask extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetStorageInfoTask> CREATOR;
  public String appId;
  public int hXg;
  public ArrayList<String> hXl;
  public Runnable hww;
  public int limit;
  public int size;

  static
  {
    AppMethodBeat.i(102052);
    CREATOR = new JsApiGetStorageInfoTask.1();
    AppMethodBeat.o(102052);
  }

  public final void asP()
  {
    AppMethodBeat.i(102048);
    Object localObject;
    if (e.B(com.tencent.luggage.sdk.customize.b.class) == null)
    {
      localObject = null;
      if (localObject != null)
        break label47;
      aCb();
      AppMethodBeat.o(102048);
    }
    while (true)
    {
      return;
      localObject = ((com.tencent.luggage.sdk.customize.b)e.B(com.tencent.luggage.sdk.customize.b.class)).xG();
      break;
      label47: localObject = ((com.tencent.mm.plugin.appbrand.appstorage.b)localObject).G(this.hXg, this.appId);
      this.hXl = ((ArrayList)localObject[0]);
      this.size = ((int)Math.ceil(((Integer)localObject[1]).doubleValue() / 1000.0D));
      this.limit = ((int)Math.ceil(((Integer)localObject[2]).doubleValue() / 1000.0D));
      aCb();
      AppMethodBeat.o(102048);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(102049);
    if (this.hww != null)
      this.hww.run();
    AppMethodBeat.o(102049);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(102050);
    this.appId = paramParcel.readString();
    this.hXg = paramParcel.readInt();
    this.hXl = paramParcel.createStringArrayList();
    this.size = paramParcel.readInt();
    this.limit = paramParcel.readInt();
    AppMethodBeat.o(102050);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(102051);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.hXg);
    paramParcel.writeStringList(this.hXl);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.limit);
    AppMethodBeat.o(102051);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask
 * JD-Core Version:    0.6.2
 */