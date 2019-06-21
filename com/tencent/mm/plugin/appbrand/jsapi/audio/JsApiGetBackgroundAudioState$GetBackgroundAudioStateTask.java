package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.c;
import com.tencent.mm.aw.e;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.media.music.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

class JsApiGetBackgroundAudioState$GetBackgroundAudioStateTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetBackgroundAudioStateTask> CREATOR;
  public String appId;
  public String ckz;
  public boolean error;
  public int fSc;
  public String hAa;
  public double hAb;
  public double hAc;
  public double hAd;
  public String hAe;
  public String hAf;
  public String hAg;
  public String hAh;
  public String protocol;
  public int startTime;
  public String title;

  static
  {
    AppMethodBeat.i(137735);
    CREATOR = new JsApiGetBackgroundAudioState.GetBackgroundAudioStateTask.1();
    AppMethodBeat.o(137735);
  }

  public JsApiGetBackgroundAudioState$GetBackgroundAudioStateTask()
  {
    this.appId = "";
    this.hAb = 0.0D;
    this.error = false;
  }

  public JsApiGetBackgroundAudioState$GetBackgroundAudioStateTask(Parcel paramParcel)
  {
    AppMethodBeat.i(137731);
    this.appId = "";
    this.hAb = 0.0D;
    this.error = false;
    g(paramParcel);
    AppMethodBeat.o(137731);
  }

  public final void asP()
  {
    double d = 0.0D;
    AppMethodBeat.i(137732);
    Object localObject = a.a.aId().ikS;
    if ((!bo.isNullOrNil((String)localObject)) && (!((String)localObject).equals(this.appId)))
    {
      ab.i("MicroMsg.JsApiGetBackgroundAudioState", "appid not match cannot get background audio state, preAppId:%s, appId:%s", new Object[] { localObject, this.appId });
      this.error = true;
      this.hAa = "appid not match cannot get background audio state";
      aCb();
      AppMethodBeat.o(137732);
    }
    e locale;
    while (true)
    {
      return;
      locale = com.tencent.mm.aw.a.aih();
      if (locale == null)
        break label453;
      localObject = com.tencent.mm.aw.a.aii();
      i = -1;
      j = -1;
      if (localObject != null)
      {
        i = ((c)localObject).mDuration;
        j = ((c)localObject).mPosition;
      }
      if ((localObject != null) && (i >= 0) && (j >= 0))
        break;
      ab.e("MicroMsg.JsApiGetBackgroundAudioState", "return parameter is invalid, duration_t:%d, position:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      this.error = true;
      this.hAa = "return parameter is invalid";
      aCb();
      AppMethodBeat.o(137732);
    }
    this.hAb = (i / 1000.0D);
    this.hAc = (j / 1000.0D);
    int i = ((c)localObject).mStatus;
    int j = ((c)localObject).fJQ;
    if (this.hAb > 0.0D)
      d = j * this.hAb / 100.0D;
    this.hAd = d;
    if (i == 1)
    {
      j = 0;
      label247: this.fSc = j;
      this.ckz = locale.fKa;
      this.title = locale.fJW;
      this.hAe = locale.fJY;
      this.hAf = locale.fJX;
      this.hAg = locale.fJZ;
      this.hAh = locale.fKc;
      this.protocol = locale.protocol;
      this.startTime = locale.startTime;
      ab.d("MicroMsg.JsApiGetBackgroundAudioState", "duration: %f , currentTime: %f ,paused: %d , buffered: %f , src: %s, startTime:%d, title:%s, singer:%s, webUrl:%s, coverImgUrl:%s, protocol:%s", new Object[] { Double.valueOf(this.hAb), Double.valueOf(this.hAc), Integer.valueOf(this.fSc), Double.valueOf(this.hAd), this.ckz, Integer.valueOf(this.startTime), this.title, this.hAf, this.hAh, this.hAg, this.protocol });
    }
    while (true)
    {
      aCb();
      AppMethodBeat.o(137732);
      break;
      j = 1;
      break label247;
      label453: ab.e("MicroMsg.JsApiGetBackgroundAudioState", "currentWrapper is null");
      this.error = true;
      this.hAa = "currentWrapper is null";
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(137733);
    this.appId = paramParcel.readString();
    this.hAb = paramParcel.readDouble();
    this.hAc = paramParcel.readDouble();
    this.fSc = paramParcel.readInt();
    this.hAd = paramParcel.readDouble();
    this.ckz = paramParcel.readString();
    this.title = paramParcel.readString();
    this.hAe = paramParcel.readString();
    this.hAf = paramParcel.readString();
    this.hAg = paramParcel.readString();
    this.hAh = paramParcel.readString();
    this.protocol = paramParcel.readString();
    this.startTime = paramParcel.readInt();
    AppMethodBeat.o(137733);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(137734);
    paramParcel.writeString(this.appId);
    paramParcel.writeDouble(this.hAb);
    paramParcel.writeDouble(this.hAc);
    paramParcel.writeInt(this.fSc);
    paramParcel.writeDouble(this.hAd);
    paramParcel.writeString(this.ckz);
    paramParcel.writeString(this.title);
    paramParcel.writeString(this.hAe);
    paramParcel.writeString(this.hAf);
    paramParcel.writeString(this.hAg);
    paramParcel.writeString(this.hAh);
    paramParcel.writeString(this.protocol);
    paramParcel.writeInt(this.startTime);
    AppMethodBeat.o(137734);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState.GetBackgroundAudioStateTask
 * JD-Core Version:    0.6.2
 */