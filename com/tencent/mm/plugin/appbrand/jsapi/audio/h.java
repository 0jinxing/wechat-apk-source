package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import org.json.JSONObject;

public class h extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 297;
  public static final String NAME = "operateAudio";
  private k.a hAm;

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    long l1 = 0L;
    AppMethodBeat.i(137747);
    if (!com.tencent.mm.plugin.appbrand.media.a.a.Ct(paramc.getAppId()))
    {
      ab.e("MicroMsg.Audio.JsApiOperateAudio", "can't do operateAudio, App is paused or background");
      paramc.M(paramInt, j("fail:App is paused or background", null));
      AppMethodBeat.o(137747);
    }
    while (true)
    {
      return;
      if (paramJSONObject == null)
      {
        ab.e("MicroMsg.Audio.JsApiOperateAudio", "operateAudio data is null");
        paramc.M(paramInt, j("fail:data is null", null));
        AppMethodBeat.o(137747);
      }
      else
      {
        ab.i("MicroMsg.Audio.JsApiOperateAudio", "operateAudio appId:%s, data:%s", new Object[] { paramc.getAppId(), paramJSONObject.toString() });
        String str1 = paramJSONObject.optString("audioId");
        int i = paramJSONObject.optInt("currentTime", 0);
        String str2 = paramJSONObject.optString("operationType");
        if (TextUtils.isEmpty(str1))
        {
          ab.e("MicroMsg.Audio.JsApiOperateAudio", "audioId is empty");
          paramc.M(paramInt, j("fail:audioId is empty", null));
          AppMethodBeat.o(137747);
        }
        else if (TextUtils.isEmpty(str2))
        {
          ab.e("MicroMsg.Audio.JsApiOperateAudio", "operationType is empty");
          paramc.M(paramInt, j("fail:operationType is empty", null));
          AppMethodBeat.o(137747);
        }
        else
        {
          if (this.hAm == null)
            this.hAm = new k.a(this, paramc, paramInt);
          this.hAm.appId = paramc.getAppId();
          this.hAm.aCr();
          h.a locala = new h.a(this, paramc, paramInt);
          locala.appId = paramc.getAppId();
          locala.ckD = str1;
          locala.csK = i;
          locala.hAn = str2;
          if (str2.equalsIgnoreCase("play"))
          {
            long l2 = paramJSONObject.optLong("timestamp", 0L);
            long l3 = System.currentTimeMillis();
            long l4 = l1;
            if (l2 > 0L)
            {
              l4 = l1;
              if (l2 < l3)
                l4 = l3 - l2;
            }
            locala.fqP = l4;
            locala.fqQ = l3;
          }
          paramc = com.tencent.mm.plugin.appbrand.media.a.a.Cr(str1);
          if (paramc != null)
          {
            locala.hAo = paramc.hAo;
            locala.gSP = paramc.gSP;
            locala.ckz = paramc.ckz;
          }
          locala.processName = ah.getProcessName();
          locala.aCr();
          AppMethodBeat.o(137747);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.h
 * JD-Core Version:    0.6.2
 */