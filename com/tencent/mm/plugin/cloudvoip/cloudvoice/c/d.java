package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class d
  implements com.tencent.mm.compatible.b.g.a, HeadsetPlugReceiver.a
{
  boolean cFy;
  com.tencent.mm.compatible.util.b gar;
  c kzq;
  final Object kzr;
  HeadsetPlugReceiver kzs;
  boolean kzt;
  boolean kzu;
  private int kzv;
  com.tencent.mm.compatible.util.g.a kzw;
  boolean kzx;

  public d()
  {
    AppMethodBeat.i(135472);
    this.kzq = null;
    this.kzr = new Object();
    this.cFy = false;
    this.kzt = false;
    this.kzu = false;
    this.kzw = new com.tencent.mm.compatible.util.g.a();
    this.kzx = false;
    this.gar = new com.tencent.mm.compatible.util.b(ah.getContext());
    this.kzs = new HeadsetPlugReceiver();
    AppMethodBeat.o(135472);
  }

  public final int a(com.tencent.mm.plugin.voip.model.b paramb, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(135473);
    synchronized (this.kzr)
    {
      if (this.cFy)
      {
        ab.d("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "startPlay, already start");
        paramInt1 = -1;
        AppMethodBeat.o(135473);
        return paramInt1;
      }
      ab.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "startPlay %s", new Object[] { Integer.valueOf(hashCode()) });
      if (this.kzq == null)
      {
        c localc = new com/tencent/mm/plugin/voip/model/c;
        localc.<init>();
        this.kzq = localc;
        this.kzq.G(paramInt1, paramInt2, paramInt3, 0);
      }
      this.kzq.x(ah.getContext(), false);
      this.kzq.sNt = paramb;
      this.kzw.evE = SystemClock.elapsedRealtime();
      paramInt1 = this.kzq.cIp();
      paramb = new java/lang/StringBuilder;
      paramb.<init>("startPlaying cost: ");
      ab.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", this.kzw.Mr());
      ab.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "set start play");
      this.cFy = true;
      ab.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "finish start play: %s", new Object[] { Integer.valueOf(paramInt1) });
      AppMethodBeat.o(135473);
    }
  }

  final boolean fR(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(135474);
    ab.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "setSpeakerPhoneOn, isSpeakerPhoneOn: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    g.KK().bF(paramBoolean);
    if ((this.kzq != null) && (this.kzq.sNi))
    {
      paramBoolean = this.kzq.mj(paramBoolean);
      AppMethodBeat.o(135474);
    }
    while (true)
    {
      return paramBoolean;
      AppMethodBeat.o(135474);
      paramBoolean = bool;
    }
  }

  public final void fS(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(135475);
    if (this.kzt != paramBoolean)
    {
      this.kzt = paramBoolean;
      ab.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "onHeadsetState: isHeadsetPlugged: %s, isBluetoothConnected: %s", new Object[] { Boolean.valueOf(this.kzt), Boolean.valueOf(this.kzu) });
      if (this.kzt)
        break label91;
      paramBoolean = bool1;
      if (!this.kzu)
        break label96;
      paramBoolean = bool2;
    }
    label91: label96: 
    while (true)
    {
      this.kzx &= fR(paramBoolean);
      AppMethodBeat.o(135475);
      return;
      paramBoolean = false;
      break;
    }
  }

  public final void gE(int paramInt)
  {
    AppMethodBeat.i(135476);
    ab.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "onBluetoothHeadsetStateChange, status: %d, isStart: %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.cFy) });
    switch (paramInt)
    {
    default:
    case 3:
    case 1:
    case 2:
    case 5:
    case 4:
    }
    while (true)
    {
      this.kzv = paramInt;
      AppMethodBeat.o(135476);
      return;
      this.kzu = true;
      g.KK().KM();
      continue;
      if (paramInt != this.kzv)
      {
        this.kzu = true;
        this.kzx &= fR(false);
        continue;
        if (paramInt != this.kzv)
        {
          this.kzu = false;
          this.kzx &= fR(true);
          continue;
          g.KK().KM();
          continue;
          if (paramInt != this.kzv)
          {
            this.kzu = false;
            g.KK().KN();
            this.kzx &= fR(true);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.d
 * JD-Core Version:    0.6.2
 */