package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
{
  static int kze = 3;
  d kza;
  volatile com.tencent.mm.audio.b.c kzb;
  private b kzc;
  private e kzd;
  int kzf;
  int kzg;
  private int kzh;
  private final Object kzi;
  int kzj;
  private int kzk;
  private long kzl;
  boolean kzm;
  int kzn;
  c.a kzo;
  int mChannels;
  int mSampleRate;

  public c(e parame)
  {
    AppMethodBeat.i(135470);
    this.kzf = 1;
    this.kzg = 92;
    this.kzh = 1;
    this.kzi = new Object();
    this.kzj = 0;
    this.kzk = 1;
    this.kzl = 0L;
    this.kzm = false;
    this.mSampleRate = v2protocal.VOICE_SAMPLERATE;
    this.mChannels = 1;
    this.kzn = 20;
    this.kzo = new c.a()
    {
      public final void bN(int paramAnonymousInt1, int paramAnonymousInt2)
      {
      }

      public final void u(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        paramAnonymousInt = 0;
        int i = -1;
        AppMethodBeat.i(135468);
        while (true)
        {
          synchronized (c.i(c.this))
          {
            if (c.a(c.this) == 2)
            {
              if (c.b(c.this).kzq != null)
                paramAnonymousInt = 1;
              if (paramAnonymousInt != 0);
            }
            else
            {
              AppMethodBeat.o(135468);
              return;
            }
            if (c.c(c.this) <= 10)
              c.a(c.this, 92);
            Object localObject2 = c.b(c.this);
            if (((d)localObject2).kzq != null)
            {
              paramAnonymousInt = ((d)localObject2).kzq.cIq();
              c.a(c.this, (paramAnonymousInt + 24 + c.c(c.this) * 3) / 4);
              if (c.d(c.this) != 1)
                break label285;
              localObject2 = c.b(c.this);
              paramAnonymousInt = i;
              if (((d)localObject2).kzq != null)
                paramAnonymousInt = ((d)localObject2).kzq.cIn();
              i = paramAnonymousInt;
              if (paramAnonymousInt >= c.c(c.this))
                i = paramAnonymousInt - c.c(c.this);
              c.a(c.this, i);
              c.e(c.this);
              if (1 != c.f(c.this))
                break label297;
              c.g(c.this);
              c.a(c.this, System.currentTimeMillis());
              ab.i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "amyfwang,first record");
              localObject2 = j.kzW;
              j.t(paramAnonymousArrayOfByte, paramAnonymousArrayOfByte.length, c.c(c.this));
            }
          }
          paramAnonymousInt = -1;
          continue;
          label285: c.a(c.this, 0);
          continue;
          label297: long l1 = System.currentTimeMillis();
          long l2 = l1 - c.h(c.this);
          if (l2 > 1000L)
            ab.i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "amyfwang,error,deltaTime:".concat(String.valueOf(l2)));
          c.a(c.this, l1);
        }
      }
    };
    this.kzc = new b();
    this.kzd = parame;
    this.kza = new d();
    AppMethodBeat.o(135470);
  }

  public final boolean EL()
  {
    boolean bool = true;
    AppMethodBeat.i(135471);
    ab.i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "hy: trigger start play");
    if (this.kzf != 2)
      ab.e("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "hy: not init when start listen!");
    synchronized (this.kzi)
    {
      if (!this.kzb.EL())
      {
        if (this.kzb.cpq != 13)
          this.kzj = 1;
        bool = false;
        AppMethodBeat.o(135471);
        return bool;
      }
      ab.d("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "VoipDeivceHandler.m_iAudioDevErr:" + this.kzj);
      AppMethodBeat.o(135471);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.c
 * JD-Core Version:    0.6.2
 */