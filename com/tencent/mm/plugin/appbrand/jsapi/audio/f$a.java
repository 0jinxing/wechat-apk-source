package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ag.d;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class f$a extends a
{
  public String appId = "";
  public String ckD = "";
  public String ckz;
  public int csK;
  public int duration = 0;
  public boolean error = false;
  public int fSc;
  public int fqZ;
  public String hAa;
  public int hwi;
  private m hwz;
  public c hxS;
  public int startTime;

  public f$a(m paramm, c paramc, int paramInt)
  {
    this.hwz = paramm;
    this.hxS = paramc;
    this.hwi = paramInt;
  }

  public final void Dp()
  {
    AppMethodBeat.i(137726);
    Object localObject = this.ckD;
    t localt = new t();
    localt.csI.action = 6;
    localt.csI.ckD = ((String)localObject);
    com.tencent.mm.plugin.music.b.a.a(localt);
    localObject = localt.csJ.csO;
    if (localObject == null)
    {
      ab.e("MicroMsg.Audio.JsApiGetAudioState", "return parameter is invalid, audioState is null, audioId:%s", new Object[] { this.ckD });
      this.error = true;
      this.hAa = "return parameter is invalid";
      wM();
      AppMethodBeat.o(137726);
    }
    while (true)
    {
      return;
      if ((((d)localObject).duration >= 0) && (((d)localObject).csK >= 0))
        break;
      ab.e("MicroMsg.Audio.JsApiGetAudioState", "return parameter is invalid, duration:%d, currentTime:%d", new Object[] { Integer.valueOf(((d)localObject).duration), Integer.valueOf(((d)localObject).csK) });
      this.error = true;
      this.hAa = "return parameter is invalid";
      wM();
      AppMethodBeat.o(137726);
    }
    this.duration = ((d)localObject).duration;
    this.csK = ((d)localObject).csK;
    if (((d)localObject).rw);
    for (int i = 1; ; i = 0)
    {
      this.fSc = i;
      this.ckz = ((d)localObject).ckz;
      this.fqZ = ((d)localObject).fqZ;
      this.startTime = ((d)localObject).startTime;
      ab.d("MicroMsg.Audio.JsApiGetAudioState", "duration: %d , currentTime: %d ,paused: %d , buffered: %d , src: %s, startTime:%d", new Object[] { Integer.valueOf(this.duration), Integer.valueOf(this.csK), Integer.valueOf(this.fSc), Integer.valueOf(this.fqZ), this.ckz, Integer.valueOf(this.startTime) });
      wM();
      AppMethodBeat.o(137726);
      break;
    }
  }

  public final void wM()
  {
    AppMethodBeat.i(137727);
    if (this.hxS == null)
    {
      ab.e("MicroMsg.Audio.JsApiGetAudioState", "service is null");
      AppMethodBeat.o(137727);
    }
    while (true)
    {
      return;
      HashMap localHashMap = new HashMap();
      localHashMap.put("duration", Integer.valueOf(this.duration));
      localHashMap.put("currentTime", Integer.valueOf(this.csK));
      boolean bool;
      if (this.fSc == 1)
      {
        bool = true;
        label75: localHashMap.put("paused", Boolean.valueOf(bool));
        localHashMap.put("buffered", Integer.valueOf(this.fqZ));
        localHashMap.put("src", this.ckz);
        localHashMap.put("startTime", Integer.valueOf(this.startTime));
        if (!TextUtils.isEmpty(this.hAa))
          break label211;
      }
      label211: for (String str = ""; ; str = this.hAa)
      {
        if (!this.error)
          break label219;
        ab.e("MicroMsg.Audio.JsApiGetAudioState", "getAudioState fail, err:%s", new Object[] { str });
        this.hxS.M(this.hwi, this.hwz.j("fail:".concat(String.valueOf(str)), null));
        AppMethodBeat.o(137727);
        break;
        bool = false;
        break label75;
      }
      label219: this.hxS.M(this.hwi, this.hwz.j("ok", localHashMap));
      AppMethodBeat.o(137727);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.f.a
 * JD-Core Version:    0.6.2
 */