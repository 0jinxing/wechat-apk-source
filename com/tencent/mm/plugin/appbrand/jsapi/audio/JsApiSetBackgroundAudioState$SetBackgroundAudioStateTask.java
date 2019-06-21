package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.f;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.media.music.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public class JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask extends MainProcessTask
{
  public static final Parcelable.Creator<SetBackgroundAudioStateTask> CREATOR;
  public String appId;
  public String cHg;
  public boolean error;
  public String hAa;
  public String hAs;
  public int hwi;
  private m hwz;
  public c hxS;

  static
  {
    AppMethodBeat.i(137789);
    CREATOR = new JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask.1();
    AppMethodBeat.o(137789);
  }

  public JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask(Parcel paramParcel)
  {
    AppMethodBeat.i(137783);
    this.error = false;
    this.hAa = "";
    g(paramParcel);
    AppMethodBeat.o(137783);
  }

  public JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask(com.tencent.mm.plugin.appbrand.jsapi.a parama, c paramc, int paramInt)
  {
    this.error = false;
    this.hAa = "";
    this.hwz = parama;
    this.hxS = paramc;
    this.hwi = paramInt;
  }

  public String AP(String paramString)
  {
    AppMethodBeat.i(137784);
    paramString = com.tencent.mm.loader.j.b.eSn + "/image/" + paramString.hashCode();
    AppMethodBeat.o(137784);
    return paramString;
  }

  public final void asP()
  {
    AppMethodBeat.i(137785);
    ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "runInMainProcess");
    try
    {
      Object localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(this.hAs);
      str1 = ((JSONObject)localObject1).optString("src");
      str2 = ((JSONObject)localObject1).optString("title");
      str3 = ((JSONObject)localObject1).optString("epname");
      str4 = ((JSONObject)localObject1).optString("singer");
      str5 = ((JSONObject)localObject1).optString("coverImgUrl");
      str6 = ((JSONObject)localObject1).optString("webUrl");
      str7 = ((JSONObject)localObject1).optString("protocol");
      i = ((JSONObject)localObject1).optInt("startTime", 0);
      localObject1 = ((JSONObject)localObject1).optString("operationType");
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "come from onStickyBannerChanged pause or lifeCycleListener onDestroy");
        str5 = a.a.aId().ikS;
        if ((!bo.isNullOrNil(str5)) && (!str5.equals(this.appId)))
        {
          ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "appid not match cannot operate, preAppId:%s, appId:%s", new Object[] { str5, this.appId });
          AppMethodBeat.o(137785);
          return;
        }
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        String str1;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        ab.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "new json exists exception, data is invalid");
        this.error = true;
        this.hAa = "parser data fail, data is invalid";
        ab.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "exception:%s" + localJSONException.getMessage());
        aCb();
        AppMethodBeat.o(137785);
        continue;
        this.error = false;
        if (localJSONException.equalsIgnoreCase("pause"))
        {
          if (com.tencent.mm.aw.b.aik())
          {
            ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "pause music ok");
            AppMethodBeat.o(137785);
          }
          else
          {
            this.error = true;
            this.hAa = "pause music fail";
          }
        }
        else
        {
          while (true)
          {
            aCb();
            AppMethodBeat.o(137785);
            break;
            if (localJSONException.equalsIgnoreCase("stop"))
            {
              if (com.tencent.mm.aw.b.ail())
              {
                ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "stop music ok");
                AppMethodBeat.o(137785);
                break;
              }
              this.error = true;
              this.hAa = "stop music fail";
            }
          }
          if (TextUtils.isEmpty(str1))
          {
            ab.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "src is null");
            this.error = true;
            this.hAa = "src is null";
            aCb();
            AppMethodBeat.o(137785);
          }
          else
          {
            ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "src;%s, title:%s, epname:%s, singer:%s, coverImgUrl:%s, protocol:%s, webUrl:%s, startTime:%d, localPath", new Object[] { str1, str2, str3, str4, str5, str7, str6, Integer.valueOf(i), this.cHg });
            Object localObject2 = str5;
            if (str5 == null)
              localObject2 = "";
            localObject2 = f.a(11, (String)localObject2, str2, str4, str6, str1, str1, new StringBuilder().append(this.appId).append(str1).append((String)localObject2).toString().hashCode(), com.tencent.mm.compatible.util.e.eSn, AP((String)localObject2), str3, "");
            ((com.tencent.mm.aw.e)localObject2).startTime = (i * 1000);
            ((com.tencent.mm.aw.e)localObject2).protocol = str7;
            if (this.cHg.startsWith("file://"))
              ((com.tencent.mm.aw.e)localObject2).fKg = this.cHg;
            a.a.aId().ikT = ((com.tencent.mm.aw.e)localObject2).fJU;
            com.tencent.mm.aw.a.b((com.tencent.mm.aw.e)localObject2);
            ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "runInMainProcess startPlayMusic");
            ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState ok");
            this.error = false;
            aCb();
            AppMethodBeat.o(137785);
          }
        }
      }
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(137786);
    if (this.hxS == null)
    {
      ab.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "service is null, don't callback");
      AppMethodBeat.o(137786);
    }
    while (true)
    {
      return;
      if (!this.error)
      {
        ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState ok");
        this.hxS.M(this.hwi, this.hwz.j("ok", null));
        AppMethodBeat.o(137786);
      }
      else
      {
        ab.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState fail:%s", new Object[] { this.hAa });
        this.hxS.M(this.hwi, this.hwz.j("fail:" + this.hAa, null));
        AppMethodBeat.o(137786);
      }
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(137787);
    this.appId = paramParcel.readString();
    this.hAs = paramParcel.readString();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.error = bool;
      this.hAa = paramParcel.readString();
      this.cHg = paramParcel.readString();
      AppMethodBeat.o(137787);
      return;
      bool = false;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(137788);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.hAs);
    if (this.error);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.hAa);
      paramParcel.writeString(this.cHg);
      AppMethodBeat.o(137788);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask
 * JD-Core Version:    0.6.2
 */