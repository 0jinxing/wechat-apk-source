package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.b;
import com.tencent.mm.aw.e;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.media.music.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public class JsApiOperateBackgroundAudio$OperateBackgroundAudioTask extends MainProcessTask
{
  public static final Parcelable.Creator<OperateBackgroundAudioTask> CREATOR;
  public String appId;
  public boolean error;
  public String hAa;
  public String hAs;
  public int hwi;
  private m hwz;
  public c hxS;

  static
  {
    AppMethodBeat.i(137758);
    CREATOR = new JsApiOperateBackgroundAudio.OperateBackgroundAudioTask.1();
    AppMethodBeat.o(137758);
  }

  public JsApiOperateBackgroundAudio$OperateBackgroundAudioTask(Parcel paramParcel)
  {
    AppMethodBeat.i(137753);
    this.error = false;
    this.hAa = "";
    g(paramParcel);
    AppMethodBeat.o(137753);
  }

  public JsApiOperateBackgroundAudio$OperateBackgroundAudioTask(com.tencent.mm.plugin.appbrand.jsapi.a parama, c paramc, int paramInt)
  {
    this.error = false;
    this.hAa = "";
    this.hwz = parama;
    this.hxS = paramc;
    this.hwi = paramInt;
  }

  public final void asP()
  {
    AppMethodBeat.i(137754);
    ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "runInMainProcess");
    Object localObject = a.a.aId().ikS;
    if ((!bo.isNullOrNil((String)localObject)) && (!((String)localObject).equals(this.appId)))
    {
      ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "appid not match cannot operate, preAppId:%s, appId:%s", new Object[] { localObject, this.appId });
      this.error = true;
      this.hAa = "appid not match cannot operate";
      aCb();
      AppMethodBeat.o(137754);
    }
    String str;
    int i;
    while (true)
    {
      return;
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(this.hAs);
        str = ((JSONObject)localObject).optString("operationType");
        i = ((JSONObject)localObject).optInt("currentTime", -1);
        if (!TextUtils.isEmpty(str))
          break;
        ab.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operationType is null");
        this.error = true;
        this.hAa = "operationType is null";
        aCb();
        AppMethodBeat.o(137754);
      }
      catch (JSONException localJSONException)
      {
        ab.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "new json exists exception, data is invalid, jsonStr:%s", new Object[] { this.hAs });
        this.error = true;
        this.hAa = "parser data fail, data is invalid";
        ab.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "exception:%s" + localJSONException.getMessage());
        aCb();
        AppMethodBeat.o(137754);
      }
    }
    ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "operationType;%s, currentTime:%d", new Object[] { str, Integer.valueOf(i) });
    this.error = false;
    if (str.equalsIgnoreCase("play"))
    {
      e locale = com.tencent.mm.aw.a.aih();
      if (locale != null)
        a.a.aId().ikT = locale.fJU;
      if (b.aij())
        ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "play music ok");
    }
    while (true)
    {
      if (this.error)
        ab.e("MicroMsg.Music.JsApiOperateBackgroundAudio", this.hAa);
      aCb();
      AppMethodBeat.o(137754);
      break;
      if (com.tencent.mm.aw.a.aie())
      {
        this.error = true;
        this.hAa = "music is playing, don't play again";
      }
      else
      {
        this.error = true;
        this.hAa = "play music fail";
        continue;
        if (str.equalsIgnoreCase("pause"))
        {
          if (b.aik())
          {
            ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "pause music ok");
          }
          else
          {
            this.error = true;
            this.hAa = "pause music fail";
          }
        }
        else if (str.equalsIgnoreCase("seek"))
        {
          if (i < 0)
          {
            ab.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "currentTime is invalid!");
            this.error = true;
            this.hAa = "currentTime is invalid";
          }
          else if (com.tencent.mm.aw.a.lP(i * 1000))
          {
            ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "seek music ok");
          }
          else
          {
            this.error = true;
            this.hAa = "seek music fail";
          }
        }
        else if (str.equalsIgnoreCase("stop"))
        {
          if (b.ail())
          {
            ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "stop music ok");
          }
          else
          {
            this.error = true;
            this.hAa = "stop music fail";
          }
        }
        else
        {
          ab.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operationType is invalid");
          this.error = true;
          this.hAa = "operationType is invalid";
        }
      }
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(137755);
    if (this.hxS == null)
    {
      ab.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "service is null, don't callback");
      AppMethodBeat.o(137755);
    }
    while (true)
    {
      return;
      if (!this.error)
      {
        ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio ok");
        this.hxS.M(this.hwi, this.hwz.j("ok", null));
        AppMethodBeat.o(137755);
      }
      else
      {
        ab.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio fail:%s", new Object[] { this.hAa });
        this.hxS.M(this.hwi, this.hwz.j("fail:" + this.hAa, null));
        AppMethodBeat.o(137755);
      }
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(137756);
    this.appId = paramParcel.readString();
    this.hAs = paramParcel.readString();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.error = bool;
      this.hAa = paramParcel.readString();
      AppMethodBeat.o(137756);
      return;
      bool = false;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(137757);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.hAs);
    if (this.error);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.hAa);
      AppMethodBeat.o(137757);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio.OperateBackgroundAudioTask
 * JD-Core Version:    0.6.2
 */