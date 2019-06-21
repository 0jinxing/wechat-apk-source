package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.b.e.b;
import com.tencent.mm.plugin.appbrand.config.l;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

class JsApiGetAppConfigTask extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetAppConfigTask> CREATOR;
  public String appId;
  public Runnable hww;
  public String key;
  public int scene;
  public int type;
  public String value;

  static
  {
    AppMethodBeat.i(130433);
    CREATOR = new JsApiGetAppConfigTask.2();
    AppMethodBeat.o(130433);
  }

  public JsApiGetAppConfigTask()
  {
  }

  public JsApiGetAppConfigTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130427);
    g(paramParcel);
    AppMethodBeat.o(130427);
  }

  public final void asP()
  {
    AppMethodBeat.i(130428);
    if (!g.RN().eJb)
    {
      AppMethodBeat.o(130428);
      return;
    }
    Pair localPair = ((b)f.E(b.class)).y(this.appId, 4, this.scene);
    if (((Boolean)localPair.first).booleanValue())
    {
      com.tencent.mm.plugin.appbrand.appcache.b.c.a locala = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
      com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(((Integer)localPair.second).intValue(), 166L);
    }
    if (!((Boolean)localPair.first).booleanValue());
    for (boolean bool = true; ; bool = false)
    {
      l.a(this.appId, this.type, 0, new JsApiGetAppConfigTask.1(this), bool);
      AppMethodBeat.o(130428);
      break;
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(130429);
    if (this.hww != null)
      this.hww.run();
    AppMethodBeat.o(130429);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130430);
    this.appId = paramParcel.readString();
    this.key = paramParcel.readString();
    this.value = paramParcel.readString();
    this.type = paramParcel.readInt();
    this.scene = paramParcel.readInt();
    AppMethodBeat.o(130430);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130431);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.key);
    paramParcel.writeString(this.value);
    paramParcel.writeInt(this.type);
    paramParcel.writeInt(this.scene);
    AppMethodBeat.o(130431);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiGetAppConfigTask
 * JD-Core Version:    0.6.2
 */