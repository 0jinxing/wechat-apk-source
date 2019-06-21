package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;

final class h$a extends a
{
  public String appId = "";
  public String ckD = "";
  public String ckz = "";
  public int csK = 0;
  public boolean error = false;
  public long fqP;
  public long fqQ;
  public String gSP;
  public String hAa;
  public String hAn = "";
  public String hAo;
  public int hwi;
  private m hwz;
  public com.tencent.mm.plugin.appbrand.jsapi.c hxS;
  public String processName = "";

  public h$a(m paramm, com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt)
  {
    this.hwz = paramm;
    this.hxS = paramc;
    this.hwi = paramInt;
  }

  public final void Dp()
  {
    AppMethodBeat.i(137745);
    ab.i("MicroMsg.Audio.JsApiOperateAudio", "runTask operationType;%s", new Object[] { this.hAn });
    this.error = false;
    Object localObject1 = this.hAn;
    Object localObject2;
    if (((String)localObject1).equalsIgnoreCase("play"))
    {
      localObject2 = com.tencent.mm.ag.c.pO(this.ckD);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        ab.e("MicroMsg.Audio.JsApiOperateAudio", "play operate, playParam is null");
        localObject1 = com.tencent.mm.plugin.appbrand.media.a.b.b(this.appId, this.ckD, this.ckz, this.hAo, this.gSP, this.processName);
      }
      if (localObject1 != null)
      {
        ((com.tencent.mm.ag.b)localObject1).fqT = this.fqP;
        ((com.tencent.mm.ag.b)localObject1).fqU = this.fqQ;
      }
      String str = this.ckD;
      ab.d("MicroMsg.AudioPlayerHelper", "resumeAudio, audioId:%s", new Object[] { str });
      localObject2 = new t();
      ((t)localObject2).csI.action = 1;
      ((t)localObject2).csI.ckD = str;
      ((t)localObject2).csI.csL = ((com.tencent.mm.ag.b)localObject1);
      com.tencent.mm.plugin.music.b.a.a((t)localObject2);
      if (((t)localObject2).csJ.csN)
        ab.i("MicroMsg.Audio.JsApiOperateAudio", "play audio ok");
    }
    while (true)
    {
      if (this.error)
        ab.e("MicroMsg.Audio.JsApiOperateAudio", this.hAa);
      wM();
      AppMethodBeat.o(137745);
      return;
      if (com.tencent.mm.ag.c.pN(this.ckD))
      {
        this.error = true;
        this.hAa = "audio is playing, don't play again";
      }
      else
      {
        this.error = true;
        this.hAa = "play audio fail";
        continue;
        if (((String)localObject1).equalsIgnoreCase("pause"))
        {
          localObject1 = this.ckD;
          ab.d("MicroMsg.AudioPlayerHelper", "pauseAudio, audioId:%s", new Object[] { localObject1 });
          localObject2 = new t();
          ((t)localObject2).csI.action = 2;
          ((t)localObject2).csI.ckD = ((String)localObject1);
          com.tencent.mm.plugin.music.b.a.a((t)localObject2);
          if (((t)localObject2).csJ.csN)
          {
            ab.i("MicroMsg.Audio.JsApiOperateAudio", "pause audio ok");
          }
          else
          {
            this.error = true;
            this.hAa = "pause audio fail";
          }
        }
        else if (((String)localObject1).equalsIgnoreCase("seek"))
        {
          ab.i("MicroMsg.Audio.JsApiOperateAudio", "currentTime:%d", new Object[] { Integer.valueOf(this.csK) });
          if (this.csK < 0)
          {
            ab.e("MicroMsg.Audio.JsApiOperateAudio", "currentTime %d is invalid!", new Object[] { Integer.valueOf(this.csK) });
            this.error = true;
            this.hAa = "currentTime is invalid";
          }
          else
          {
            localObject1 = this.ckD;
            int i = this.csK;
            ab.i("MicroMsg.AudioPlayerHelper", "seekToAudio, audioId:%s, currentTime:%d", new Object[] { localObject1, Integer.valueOf(i) });
            localObject2 = new t();
            ((t)localObject2).csI.action = 4;
            ((t)localObject2).csI.ckD = ((String)localObject1);
            ((t)localObject2).csI.csK = i;
            com.tencent.mm.plugin.music.b.a.a((t)localObject2);
            if (((t)localObject2).csJ.csN)
            {
              ab.i("MicroMsg.Audio.JsApiOperateAudio", "seek audio ok");
            }
            else
            {
              this.error = true;
              this.hAa = "seek audio fail";
            }
          }
        }
        else if (((String)localObject1).equalsIgnoreCase("stop"))
        {
          localObject1 = this.ckD;
          localObject2 = new t();
          ((t)localObject2).csI.action = 13;
          ((t)localObject2).csI.ckD = ((String)localObject1);
          com.tencent.mm.plugin.music.b.a.a((t)localObject2);
          boolean bool;
          if (((t)localObject2).csJ.csN)
          {
            ab.i("MicroMsg.AudioPlayerHelper", "stopAudioOnBackground, audioId:%s", new Object[] { localObject1 });
            localObject2 = new t();
            ((t)localObject2).csI.action = 14;
            ((t)localObject2).csI.ckD = ((String)localObject1);
            com.tencent.mm.plugin.music.b.a.a((t)localObject2);
            bool = ((t)localObject2).csJ.csN;
          }
          while (true)
          {
            if (!bool)
              break label744;
            ab.i("MicroMsg.Audio.JsApiOperateAudio", "stop audio ok");
            break;
            localObject2 = new t();
            ((t)localObject2).csI.action = 17;
            ((t)localObject2).csI.ckD = ((String)localObject1);
            com.tencent.mm.plugin.music.b.a.a((t)localObject2);
            if (!((t)localObject2).csJ.csN)
            {
              ab.i("MicroMsg.AudioPlayerHelper", "stopAudio, audioId:%s", new Object[] { localObject1 });
              localObject2 = new t();
              ((t)localObject2).csI.action = 3;
              ((t)localObject2).csI.ckD = ((String)localObject1);
              com.tencent.mm.plugin.music.b.a.a((t)localObject2);
              bool = ((t)localObject2).csJ.csN;
            }
            else
            {
              bool = true;
            }
          }
          label744: this.error = true;
          this.hAa = "stop audio fail";
        }
        else
        {
          ab.e("MicroMsg.Audio.JsApiOperateAudio", "operationType is invalid");
          this.error = true;
          this.hAa = "operationType is invalid";
        }
      }
    }
  }

  public final void wM()
  {
    AppMethodBeat.i(137746);
    super.wM();
    if (this.hxS == null)
    {
      ab.e("MicroMsg.Audio.JsApiOperateAudio", "server is null");
      AppMethodBeat.o(137746);
    }
    while (true)
    {
      return;
      if (this.error)
      {
        this.hxS.M(this.hwi, this.hwz.j("fail:" + this.hAa, null));
        AppMethodBeat.o(137746);
      }
      else
      {
        this.hxS.M(this.hwi, this.hwz.j("ok", null));
        AppMethodBeat.o(137746);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.h.a
 * JD-Core Version:    0.6.2
 */