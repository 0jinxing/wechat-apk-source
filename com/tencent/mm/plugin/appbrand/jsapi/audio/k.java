package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ag.b;
import com.tencent.mm.ag.e;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.g.a.u;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.media.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import org.json.JSONObject;

public class k extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 292;
  public static final String NAME = "setAudioState";
  private k.a hAm;

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(137768);
    if (!com.tencent.mm.plugin.appbrand.media.a.a.Ct(paramc.getAppId()))
    {
      ab.e("MicroMsg.Audio.JsApiSetAudioState", "can't do operateAudio, App is paused or background");
      paramc.M(paramInt, j("fail:App is paused or background", null));
      AppMethodBeat.o(137768);
    }
    while (true)
    {
      return;
      if (paramJSONObject == null)
      {
        ab.e("MicroMsg.Audio.JsApiSetAudioState", "setAudioState data is null");
        paramc.M(paramInt, j("fail:data is null", null));
        AppMethodBeat.o(137768);
      }
      else
      {
        ab.i("MicroMsg.Audio.JsApiSetAudioState", "setAudioState data:%s", new Object[] { paramJSONObject.toString() });
        String str = paramJSONObject.optString("audioId");
        int i = paramJSONObject.optInt("startTime", 0);
        Object localObject1 = paramJSONObject.optString("src");
        label139: boolean bool1;
        boolean bool2;
        double d;
        Long localLong2;
        Object localObject2;
        Object localObject3;
        Object localObject4;
        if (bo.isNullOrNil((String)localObject1))
        {
          ab.e("MicroMsg.WxaAudioUtils", "[getRealSrc]src is empty");
          localObject1 = "";
          bool1 = paramJSONObject.optBoolean("autoplay", false);
          bool2 = paramJSONObject.optBoolean("loop", false);
          d = paramJSONObject.optDouble("volume", 1.0D);
          Long localLong1 = Long.valueOf(paramJSONObject.optLong("timestamp", 0L));
          localLong2 = Long.valueOf(0L);
          localObject2 = Long.valueOf(System.currentTimeMillis());
          if (!bool1)
            break label449;
          localObject3 = localObject2;
          localObject4 = localLong2;
          if (localLong1.longValue() > 0L)
          {
            localObject3 = localObject2;
            localObject4 = localLong2;
            if (localLong1.longValue() <= ((Long)localObject2).longValue())
            {
              localObject4 = Long.valueOf(((Long)localObject2).longValue() - localLong1.longValue());
              localObject3 = localObject2;
            }
          }
        }
        while (true)
        {
          if (!TextUtils.isEmpty(str))
            break label462;
          ab.e("MicroMsg.Audio.JsApiSetAudioState", "audioId is empty");
          paramc.M(paramInt, j("fail:audioId is empty", null));
          AppMethodBeat.o(137768);
          break;
          if (((String)localObject1).startsWith("wxfile://"))
          {
            if (paramc.asE() == null)
            {
              ab.e("MicroMsg.WxaAudioUtils", "[getRealSrc]service.getRuntime().getFileSystem() is null");
              localObject1 = "";
              break label139;
            }
            localObject1 = paramc.asE().yg((String)localObject1);
            if ((localObject1 == null) || (!((File)localObject1).exists()))
            {
              ab.e("MicroMsg.WxaAudioUtils", "[getRealSrc]localFile is null");
              localObject1 = "";
              break label139;
            }
            localObject4 = ((File)localObject1).getAbsolutePath();
            localObject1 = localObject4;
            if (localObject4 != null)
            {
              localObject1 = localObject4;
              if (!((String)localObject4).startsWith("file://"))
                localObject1 = "file://".concat(String.valueOf(localObject4));
            }
            ab.i("MicroMsg.WxaAudioUtils", "getRealSrc:src:%s", new Object[] { localObject1 });
            break label139;
          }
          ab.i("MicroMsg.WxaAudioUtils", "getRealSrc:src:%s", new Object[] { localObject1 });
          break label139;
          label449: localObject3 = Long.valueOf(0L);
          localObject4 = localLong2;
        }
        label462: if (TextUtils.isEmpty((CharSequence)localObject1))
        {
          ab.e("MicroMsg.Audio.JsApiSetAudioState", "src is empty");
          paramc.M(paramInt, j("fail:src is empty", null));
          AppMethodBeat.o(137768);
        }
        else
        {
          if (this.hAm == null)
            this.hAm = new k.a(this, paramc, paramInt);
          this.hAm.appId = paramc.getAppId();
          this.hAm.aCr();
          localObject2 = new c(this, paramc, paramInt);
          ((c)localObject2).appId = paramc.getAppId();
          ((c)localObject2).ckD = str;
          ((c)localObject2).ckz = ((String)localObject1);
          ((c)localObject2).startTime = i;
          ((c)localObject2).fqK = bool1;
          ((c)localObject2).fqL = bool2;
          ((c)localObject2).gSP = f(paramc, (String)localObject1);
          ((c)localObject2).fqN = d;
          ((c)localObject2).processName = com.tencent.mm.sdk.platformtools.ah.getProcessName();
          ((c)localObject2).fqP = ((Long)localObject4).longValue();
          ((c)localObject2).fqQ = ((Long)localObject3).longValue();
          ((c)localObject2).aCr();
          paramc = new com.tencent.mm.plugin.appbrand.media.a.c();
          paramc.gSP = ((c)localObject2).gSP;
          paramc.hAo = paramJSONObject.toString();
          paramc.ckz = ((String)localObject1);
          com.tencent.mm.plugin.appbrand.media.a.a.a(str, paramc);
          AppMethodBeat.o(137768);
        }
      }
    }
  }

  public String f(com.tencent.mm.plugin.appbrand.jsapi.c paramc, String paramString)
  {
    return "";
  }

  public static final class b extends com.tencent.mm.plugin.appbrand.jsapi.ah
  {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onAudioStateChange";
  }

  static final class c extends a
  {
    public String appId = "";
    public String ckD = "";
    public String ckz = "";
    public boolean error = false;
    public boolean fqK = false;
    public boolean fqL = false;
    public double fqN;
    public long fqP;
    public long fqQ;
    public String gSP;
    public String hAa;
    public int hwi;
    private m hwz;
    public com.tencent.mm.plugin.appbrand.jsapi.c hxS;
    public String processName = "";
    public int startTime = 0;

    public c(m paramm, com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt)
    {
      this.hwz = paramm;
      this.hxS = paramc;
      this.hwi = paramInt;
    }

    public final void Dp()
    {
      AppMethodBeat.i(137766);
      ab.i("MicroMsg.Audio.JsApiSetAudioState", "SetAudioTask runTask");
      this.error = false;
      this.hAa = "";
      Object localObject1 = com.tencent.mm.ag.c.pO(this.ckD);
      b localb = new b();
      localb.ckD = this.ckD;
      localb.clP = this.ckz;
      localb.startTime = this.startTime;
      localb.fqJ = this.startTime;
      localb.fqK = this.fqK;
      localb.fqL = this.fqL;
      localb.processName = this.processName;
      localb.fqN = this.fqN;
      localb.appId = this.appId;
      localb.fromScene = 0;
      localb.fqR = this.fqP;
      localb.fqS = this.fqQ;
      if ((localObject1 != null) && (this.ckz.equalsIgnoreCase(((b)localObject1).clP)) && (com.tencent.mm.ag.c.pN(this.ckD)))
      {
        ab.i("MicroMsg.Audio.JsApiSetAudioState", "same src is playing audio, not to start again, but setAudioParam to update");
        ab.i("MicroMsg.AudioPlayerHelper", "setAudioParam, audioId:%s, src:%s", new Object[] { localb.ckD, localb.clP });
        localObject1 = new t();
        ((t)localObject1).csI.action = 18;
        ((t)localObject1).csI.ckD = localb.ckD;
        ((t)localObject1).csI.csL = localb;
        com.tencent.mm.plugin.music.b.a.a((t)localObject1);
        if (!((t)localObject1).csJ.csN)
        {
          this.error = true;
          this.hAa = "not to set audio param, the audioId is err";
          ab.e("MicroMsg.Audio.JsApiSetAudioState", "not to set audio param, the audioId is err");
        }
        wM();
        AppMethodBeat.o(137766);
      }
      e locale;
      while (true)
      {
        return;
        ab.i("MicroMsg.Audio.JsApiSetAudioState", "appId:%s, audioId:%s, src:%s, startTime:%d", new Object[] { this.appId, this.ckD, this.ckz, Integer.valueOf(this.startTime) });
        if (this.ckz.startsWith("file://"))
        {
          localb.filePath = this.ckz.substring(7);
          ab.i("MicroMsg.Audio.JsApiSetAudioState", "filePath:%s", new Object[] { localb.filePath });
        }
        while ((this.ckz.startsWith("http://")) || (this.ckz.startsWith("https://")))
        {
          if (!this.error)
          {
            ab.d("MicroMsg.AudioPlayerHelper", "startAudio, audioId:%s", new Object[] { localb.ckD });
            localObject1 = new t();
            ((t)localObject1).csI.action = 0;
            ((t)localObject1).csI.ckD = localb.ckD;
            ((t)localObject1).csI.csL = localb;
            com.tencent.mm.plugin.music.b.a.a((t)localObject1);
          }
          wM();
          AppMethodBeat.o(137766);
          break;
        }
        locale = f.cC(this.ckz, this.gSP);
        if (locale.isOpen())
          break;
        this.error = true;
        this.hAa = "the file not exist for src";
        ab.e("MicroMsg.Audio.JsApiSetAudioState", "the wxa audioDataSource not found for src %s", new Object[] { this.ckz });
        wM();
        AppMethodBeat.o(137766);
      }
      if ((localObject1 != null) && (this.ckz.equalsIgnoreCase(((b)localObject1).clP)) && (!TextUtils.isEmpty(((b)localObject1).filePath)))
        localObject1 = ((b)localObject1).filePath;
      while (true)
      {
        localb.filePath = ((String)localObject1);
        localb.fqV = locale;
        break;
        Object localObject2 = this.hxS;
        localObject1 = this.ckz;
        if (bo.isNullOrNil((String)localObject1))
        {
          ab.e("MicroMsg.WxaAudioUtils", "getLocalFilePathFromWxaPkg src is empty");
        }
        else if (((com.tencent.mm.plugin.appbrand.jsapi.c)localObject2).asE() == null)
        {
          ab.e("MicroMsg.WxaAudioUtils", "[getLocalFilePathFromWxaPkg]service.getFileSystem() is null");
        }
        else
        {
          localObject2 = ((com.tencent.mm.plugin.appbrand.jsapi.c)localObject2).asE().yg((String)localObject1);
          if ((localObject2 == null) || (!((File)localObject2).exists()))
          {
            ab.e("MicroMsg.WxaAudioUtils", "[getLocalFilePathFromWxaPkg]localFile is null");
          }
          else
          {
            localObject1 = ((File)localObject2).getAbsolutePath();
            ab.i("MicroMsg.WxaAudioUtils", "getLocalFilePathFromWxaPkg:path:%s", new Object[] { localObject1 });
          }
        }
      }
    }

    public final void wM()
    {
      AppMethodBeat.i(137767);
      super.wM();
      if (this.hxS == null)
      {
        ab.e("MicroMsg.Audio.JsApiSetAudioState", "server is null");
        AppMethodBeat.o(137767);
      }
      while (true)
      {
        return;
        if (this.error)
        {
          this.hxS.M(this.hwi, this.hwz.j("fail:" + this.hAa, null));
          AppMethodBeat.o(137767);
        }
        else
        {
          this.hxS.M(this.hwi, this.hwz.j("ok", null));
          AppMethodBeat.o(137767);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.k
 * JD-Core Version:    0.6.2
 */