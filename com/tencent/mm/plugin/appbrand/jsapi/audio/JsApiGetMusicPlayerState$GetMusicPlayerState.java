package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.media.music.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

class JsApiGetMusicPlayerState$GetMusicPlayerState extends MainProcessTask
{
  public static final Parcelable.Creator<GetMusicPlayerState> CREATOR;
  public boolean error;
  public String hAa;
  public String hAj;
  public int hAk;
  public String hAl;
  private int hwi;
  private m hwz;
  private com.tencent.mm.plugin.appbrand.jsapi.c hxS;
  public int mDuration;
  public int mPosition;
  public int mStatus;

  static
  {
    AppMethodBeat.i(137743);
    CREATOR = new JsApiGetMusicPlayerState.GetMusicPlayerState.1();
    AppMethodBeat.o(137743);
  }

  public JsApiGetMusicPlayerState$GetMusicPlayerState(Parcel paramParcel)
  {
    AppMethodBeat.i(137738);
    this.error = false;
    g(paramParcel);
    AppMethodBeat.o(137738);
  }

  public JsApiGetMusicPlayerState$GetMusicPlayerState(m paramm, com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt)
  {
    this.error = false;
    this.hwz = paramm;
    this.hxS = paramc;
    this.hwi = paramInt;
  }

  public final void asP()
  {
    AppMethodBeat.i(137739);
    Object localObject = a.a.aId().ikS;
    if ((!bo.isNullOrNil((String)localObject)) && (!((String)localObject).equals(this.hAj)))
    {
      ab.i("MicroMsg.JsApiGetMusicPlayerState", "appid not match cannot operate");
      this.error = true;
      this.hAa = "appid not match cannot operate";
      aCb();
      AppMethodBeat.o(137739);
      return;
    }
    localObject = com.tencent.mm.aw.a.aih();
    int i;
    int j;
    if (localObject != null)
    {
      com.tencent.mm.aw.c localc = com.tencent.mm.aw.a.aii();
      if (localc == null)
        break label230;
      i = localc.mDuration;
      j = localc.mPosition;
      this.mStatus = localc.mStatus;
      this.hAk = localc.fJQ;
    }
    while (true)
    {
      this.mDuration = (i / 1000);
      this.mPosition = (j / 1000);
      this.hAl = ((e)localObject).fKa;
      this.hAa = "";
      for (this.error = false; ; this.error = false)
      {
        ab.i("MicroMsg.JsApiGetMusicPlayerState", "duration %d , position %d ,status %s , downloadpercent %d , dataurl %s", new Object[] { Integer.valueOf(this.mDuration), Integer.valueOf(this.mPosition), Integer.valueOf(this.mStatus), Integer.valueOf(this.hAk), this.hAl });
        aCb();
        AppMethodBeat.o(137739);
        break;
        this.mStatus = 2;
        this.hAa = "";
      }
      label230: j = -1;
      i = -1;
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(137740);
    HashMap localHashMap = new HashMap();
    localHashMap.put("duration", Integer.valueOf(this.mDuration));
    localHashMap.put("currentPosition", Integer.valueOf(this.mPosition));
    localHashMap.put("status", Integer.valueOf(this.mStatus));
    localHashMap.put("downloadPercent", Integer.valueOf(this.hAk));
    localHashMap.put("dataUrl", this.hAl);
    com.tencent.mm.plugin.appbrand.jsapi.c localc = this.hxS;
    int i = this.hwi;
    m localm = this.hwz;
    StringBuilder localStringBuilder;
    if (this.error)
    {
      localStringBuilder = new StringBuilder("fail");
      if (TextUtils.isEmpty(this.hAa))
        str = "";
    }
    for (String str = str; ; str = "ok")
    {
      localc.M(i, localm.j(str, localHashMap));
      AppMethodBeat.o(137740);
      return;
      str = ":" + this.hAa;
      break;
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(137741);
    this.hAj = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.error = bool;
      this.mDuration = paramParcel.readInt();
      this.mPosition = paramParcel.readInt();
      this.mStatus = paramParcel.readInt();
      this.hAk = paramParcel.readInt();
      this.hAl = paramParcel.readString();
      this.hAa = paramParcel.readString();
      AppMethodBeat.o(137741);
      return;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(137742);
    paramParcel.writeString(this.hAj);
    if (this.error)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeInt(this.mDuration);
      paramParcel.writeInt(this.mPosition);
      paramParcel.writeInt(this.mStatus);
      paramParcel.writeInt(this.hAk);
      paramParcel.writeString(this.hAl);
      paramParcel.writeString(this.hAa);
      AppMethodBeat.o(137742);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState.GetMusicPlayerState
 * JD-Core Version:    0.6.2
 */