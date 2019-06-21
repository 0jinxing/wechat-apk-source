package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.ab;

class JsApiSetStorageTask extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiSetStorageTask> CREATOR;
  public String appId;
  public int hXg;
  private boolean hXm;
  private int hXn;
  private int hXo;
  private int hXp;
  public Runnable hww;
  private String key;
  public String result;
  private String type;
  private String value;

  static
  {
    AppMethodBeat.i(102090);
    CREATOR = new JsApiSetStorageTask.1();
    AppMethodBeat.o(102090);
  }

  private void aET()
  {
    this.key = null;
    this.value = null;
    this.type = null;
  }

  public final void C(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(102085);
    if (p.m(new String[] { paramString1, paramString2, paramString3 }) > 102400)
    {
      this.hXn = p.m(new String[] { paramString1 });
      this.hXo = p.m(new String[] { paramString2 });
      this.hXp = p.m(new String[] { paramString3 });
    }
    while (true)
    {
      try
      {
        p.g(this.hvr, new String[] { paramString1, paramString2, paramString3 });
        this.hXm = true;
        AppMethodBeat.o(102085);
        return;
      }
      catch (Exception paramString1)
      {
        ab.e("MicroMsg.JsApiSetStorageTask", paramString1.getMessage());
        continue;
      }
      this.hXm = false;
      this.key = paramString1;
      this.value = paramString2;
      this.type = paramString3;
      AppMethodBeat.o(102085);
    }
  }

  public final void asP()
  {
    AppMethodBeat.i(102087);
    if (this.hXm);
    while (true)
    {
      try
      {
        String str = p.BL(this.hvr);
        if (str.length() == this.hXn + this.hXo + this.hXp)
        {
          this.key = str.substring(0, this.hXn);
          this.value = str.substring(this.hXn, this.hXn + this.hXo);
          this.type = str.substring(this.hXn + this.hXo, this.hXn + this.hXo + this.hXp);
        }
        p.BM(this.hvr);
        if (e.B(com.tencent.luggage.sdk.customize.b.class) == null)
        {
          str = null;
          if (str != null)
            break label200;
          this.result = "fail:internal error get DB fail";
          aET();
          aCb();
          AppMethodBeat.o(102087);
          return;
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.JsApiSetStorageTask", localException.getMessage());
        p.BM(this.hvr);
        continue;
      }
      finally
      {
        p.BM(this.hvr);
        AppMethodBeat.o(102087);
      }
      com.tencent.mm.plugin.appbrand.appstorage.b localb = ((com.tencent.luggage.sdk.customize.b)e.B(com.tencent.luggage.sdk.customize.b.class)).xG();
      continue;
      label200: this.result = p.a(localb.b(this.hXg, this.appId, this.key, this.value, this.type));
      aET();
      aCb();
      AppMethodBeat.o(102087);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(102086);
    if (this.hww != null)
      this.hww.run();
    AppMethodBeat.o(102086);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(102088);
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
      this.result = paramParcel.readString();
      AppMethodBeat.o(102088);
      return;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(102089);
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
      paramParcel.writeString(this.result);
      AppMethodBeat.o(102089);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask
 * JD-Core Version:    0.6.2
 */