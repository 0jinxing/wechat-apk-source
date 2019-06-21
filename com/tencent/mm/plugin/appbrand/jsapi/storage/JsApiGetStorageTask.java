package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.n.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.ab;

class JsApiGetStorageTask extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetStorageTask> CREATOR;
  public String appId;
  public int hXg;
  private boolean hXm;
  private int hXn;
  private int hXo;
  private int hXp;
  public Runnable hww;
  public String key;
  public String type;
  public String value;

  static
  {
    AppMethodBeat.i(102059);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(102059);
  }

  public final void asP()
  {
    AppMethodBeat.i(102055);
    if ((com.tencent.luggage.sdk.customize.b)e.B(com.tencent.luggage.sdk.customize.b.class) == null)
    {
      aCb();
      AppMethodBeat.o(102055);
    }
    Object localObject1;
    while (true)
    {
      return;
      localObject1 = ((com.tencent.luggage.sdk.customize.b)e.B(com.tencent.luggage.sdk.customize.b.class)).xG();
      if (localObject1 != null)
        break;
      aCb();
      AppMethodBeat.o(102055);
    }
    Object localObject2 = ((com.tencent.mm.plugin.appbrand.appstorage.b)localObject1).k(this.hXg, this.appId, this.key);
    if ((n.a)localObject2[0] == n.a.gXV)
    {
      localObject1 = (String)localObject2[1];
      localObject2 = (String)localObject2[2];
      if (p.m(new String[] { localObject1, localObject2 }) <= 102400)
        break label201;
      this.hXo = p.m(new String[] { localObject1 });
      this.hXp = p.m(new String[] { localObject2 });
    }
    while (true)
    {
      try
      {
        p.g(this.hvr, new String[] { localObject1, localObject2 });
        this.hXm = true;
        aCb();
        AppMethodBeat.o(102055);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.JsApiGetStorageTask", localException.getMessage());
        continue;
      }
      label201: this.hXm = false;
      this.value = localException;
      this.type = ((String)localObject2);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(102056);
    if (this.hXm);
    try
    {
      String str = p.BL(this.hvr);
      if (str.length() == this.hXo + this.hXp)
      {
        this.value = str.substring(0, this.hXo);
        this.type = str.substring(this.hXo, this.hXo + this.hXp);
      }
      p.BM(this.hvr);
      if (this.hww != null)
        this.hww.run();
      AppMethodBeat.o(102056);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiGetStorageTask", localException.getMessage());
        p.BM(this.hvr);
      }
    }
    finally
    {
      p.BM(this.hvr);
      AppMethodBeat.o(102056);
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(102057);
    this.appId = paramParcel.readString();
    this.hXg = paramParcel.readInt();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.hXm = bool;
      this.hXn = paramParcel.readInt();
      this.hXo = paramParcel.readInt();
      this.hXp = paramParcel.readInt();
      this.key = paramParcel.readString();
      this.value = paramParcel.readString();
      this.type = paramParcel.readString();
      AppMethodBeat.o(102057);
      return;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(102058);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.hXg);
    if (this.hXm)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeInt(this.hXn);
      paramParcel.writeInt(this.hXo);
      paramParcel.writeInt(this.hXp);
      paramParcel.writeString(this.key);
      paramParcel.writeString(this.value);
      paramParcel.writeString(this.type);
      AppMethodBeat.o(102058);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask
 * JD-Core Version:    0.6.2
 */