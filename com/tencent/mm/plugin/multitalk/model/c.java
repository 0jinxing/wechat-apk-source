package com.tencent.mm.plugin.multitalk.model;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.video.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class c
  implements com.tencent.mm.compatible.b.g.a, HeadsetPlugReceiver.a
{
  boolean cFy;
  com.tencent.mm.compatible.util.b gar;
  com.tencent.mm.plugin.voip.model.c kzq;
  final Object kzr;
  HeadsetPlugReceiver kzs;
  private boolean kzt;
  private boolean kzu;
  private int kzv;
  com.tencent.mm.compatible.util.g.a kzw;
  private final Object nxa;

  public c()
  {
    AppMethodBeat.i(53885);
    this.kzq = null;
    this.nxa = new Object();
    this.kzr = new Object();
    this.cFy = false;
    this.kzt = false;
    this.kzu = false;
    this.kzw = new com.tencent.mm.compatible.util.g.a();
    this.gar = new com.tencent.mm.compatible.util.b(ah.getContext());
    this.kzs = new HeadsetPlugReceiver();
    AppMethodBeat.o(53885);
  }

  private boolean bRi()
  {
    AppMethodBeat.i(53890);
    boolean bool1;
    if ((p.bSf().nwe.DB()) && (!this.kzt))
    {
      bool1 = true;
      bool2 = bool1;
      if (p.bSf().nwe.DB())
      {
        bool2 = bool1;
        if (!this.kzt)
          if (!p.bSf().oGc)
            break label157;
      }
    }
    label157: for (boolean bool2 = true; ; bool2 = false)
    {
      p.bSe().jj(false);
      ab.i("MicroMsg.MT.MultiTalkAudioPlayer", "isSpeakerAfterBluetoothDisconnected: isHeadsetPlugged: %s, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s, isSpeaker: %s", new Object[] { Boolean.valueOf(this.kzt), Boolean.valueOf(p.bSf().oGb), Boolean.valueOf(p.bSf().oGc), Boolean.valueOf(p.bSf().nwe.DB()), Boolean.valueOf(this.kzu), Boolean.valueOf(bool2) });
      AppMethodBeat.o(53890);
      return bool2;
      bool1 = false;
      break;
    }
  }

  public final int a(com.tencent.mm.plugin.voip.model.b paramb, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(53886);
    synchronized (this.kzr)
    {
      if (this.cFy)
      {
        ab.d("MicroMsg.MT.MultiTalkAudioPlayer", "startPlay, already start");
        paramInt1 = -1;
        AppMethodBeat.o(53886);
      }
      while (true)
      {
        return paramInt1;
        ab.i("MicroMsg.MT.MultiTalkAudioPlayer", "startPlay %s", new Object[] { Integer.valueOf(hashCode()) });
        if (this.kzq == null)
        {
          com.tencent.mm.plugin.voip.model.c localc = new com/tencent/mm/plugin/voip/model/c;
          localc.<init>();
          this.kzq = localc;
          this.kzq.G(paramInt1, 1, paramInt2, 0);
        }
        this.kzq.x(ah.getContext(), false);
        this.kzq.sNt = paramb;
        g.KK().a(this);
        this.kzt = g.KK().KV();
        this.kzu = g.KK().KP();
        ab.i("MicroMsg.MT.MultiTalkAudioPlayer", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b %s", new Object[] { Boolean.valueOf(this.kzt), Boolean.valueOf(this.kzu), Integer.valueOf(hashCode()) });
        this.gar.requestFocus();
        this.kzs.a(ah.getContext(), this);
        if ((!this.kzt) && (!this.kzu))
          break;
        p.bSf().ji(false);
        if (this.kzu)
          g.KK().KM();
        p.bSe().jj(true);
        ab.i("MicroMsg.MT.MultiTalkAudioPlayer", "set start play");
        this.cFy = true;
        this.kzw.evE = SystemClock.elapsedRealtime();
        paramInt1 = this.kzq.cIp();
        paramb = new java/lang/StringBuilder;
        paramb.<init>("startPlaying cost: ");
        ab.i("MicroMsg.MT.MultiTalkAudioPlayer", this.kzw.Mr());
        ab.i("MicroMsg.MT.MultiTalkAudioPlayer", "finish start play: %s", new Object[] { Integer.valueOf(paramInt1) });
        AppMethodBeat.o(53886);
      }
      p.bSe().jj(false);
    }
  }

  public final void fS(boolean paramBoolean)
  {
    boolean bool1 = true;
    AppMethodBeat.i(53888);
    boolean bool2;
    boolean bool3;
    label159: d locald;
    if (this.kzt != paramBoolean)
    {
      this.kzt = paramBoolean;
      ab.i("MicroMsg.MT.MultiTalkAudioPlayer", "onHeadsetState: isHeadsetPlugged: %s, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s", new Object[] { Boolean.valueOf(this.kzt), Boolean.valueOf(p.bSf().oGb), Boolean.valueOf(p.bSf().oGc), Boolean.valueOf(p.bSf().nwe.DB()), Boolean.valueOf(this.kzu) });
      if ((!p.bSf().nwe.DB()) || (this.kzt))
        break label224;
      bool2 = true;
      if (paramBoolean)
        p.bSf().ji(false);
      bool3 = bool2;
      if (p.bSf().nwe.DB())
      {
        bool3 = bool2;
        if (!this.kzt)
        {
          if (!p.bSf().oGc)
            break label229;
          bool3 = true;
        }
      }
      if (this.kzu)
        bool3 = false;
      io(bool3);
      p.bSf().jo(bool3);
      if (!paramBoolean)
        p.bSf().ji(true);
      locald = p.bSe();
      if ((this.kzu) || (!paramBoolean))
        break label235;
    }
    label224: label229: label235: for (paramBoolean = bool1; ; paramBoolean = false)
    {
      locald.jj(paramBoolean);
      AppMethodBeat.o(53888);
      return;
      bool2 = false;
      break;
      bool3 = false;
      break label159;
    }
  }

  public final void gE(int paramInt)
  {
    AppMethodBeat.i(53889);
    ab.i("MicroMsg.MT.MultiTalkAudioPlayer", "onBluetoothHeadsetStateChange, status: %d, isStart: %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.cFy) });
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
      AppMethodBeat.o(53889);
      return;
      this.kzu = true;
      g.KK().KM();
      continue;
      if (paramInt != this.kzv)
      {
        this.kzu = true;
        p.bSf().ji(false);
        io(false);
        p.bSf().jo(false);
        p.bSe().jj(true);
        continue;
        if (paramInt != this.kzv)
        {
          this.kzu = false;
          boolean bool = bRi();
          io(bool);
          p.bSf().jo(bool);
          p.bSf().ji(true);
          continue;
          g.KK().KM();
          continue;
          if (paramInt != this.kzv)
          {
            this.kzu = false;
            g.KK().KN();
            bool = bRi();
            io(bool);
            p.bSf().jo(bool);
            p.bSf().ji(true);
          }
        }
      }
    }
  }

  public final void io(boolean paramBoolean)
  {
    AppMethodBeat.i(53887);
    ab.i("MicroMsg.MT.MultiTalkAudioPlayer", "setSpeakerPhoneOn, isSpeakerPhoneOn: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    g.KK().bF(paramBoolean);
    if ((this.kzq != null) && (this.kzq.sNi))
      this.kzq.mj(paramBoolean);
    AppMethodBeat.o(53887);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.c
 * JD-Core Version:    0.6.2
 */