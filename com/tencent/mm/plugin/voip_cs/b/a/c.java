package com.tencent.mm.plugin.voip_cs.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class c
{
  public com.tencent.mm.audio.b.c kzb;
  private c.a kzo;
  private com.tencent.mm.plugin.voip.model.b oFT;
  public com.tencent.mm.plugin.voip.model.c sPL;

  public c()
  {
    AppMethodBeat.i(135363);
    this.kzo = new c.1(this);
    this.oFT = new c.2(this);
    this.kzb = new com.tencent.mm.audio.b.c(v2protocal.VOICE_SAMPLERATE, 1, 1);
    this.kzb.gG(20);
    this.kzb.br(true);
    this.kzb.EJ();
    this.kzb.v(1, false);
    this.kzb.bq(true);
    this.kzb.cpM = this.kzo;
    this.sPL = new com.tencent.mm.plugin.voip.model.c();
    this.sPL.G(v2protocal.VOICE_SAMPLERATE, 1, 20, 0);
    this.sPL.x(ah.getContext(), false);
    this.sPL.sNt = this.oFT;
    AppMethodBeat.o(135363);
  }

  private boolean mj(boolean paramBoolean)
  {
    AppMethodBeat.i(135364);
    if (this.sPL != null)
    {
      paramBoolean = this.sPL.mj(paramBoolean);
      AppMethodBeat.o(135364);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(135364);
    }
  }

  public final int cIt()
  {
    AppMethodBeat.i(135366);
    int i;
    if (this.sPL != null)
    {
      i = this.sPL.cIt();
      AppMethodBeat.o(135366);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(135366);
    }
  }

  public final void mr(boolean paramBoolean)
  {
    AppMethodBeat.i(135365);
    ab.b("MicroMsg.cs.VoipCsAudioManager", "enableSpeaker: ".concat(String.valueOf(paramBoolean)), new Object[0]);
    ab.d("MicroMsg.cs.VoipCsAudioManager", "MMCore.getAudioManager() " + g.KK().KT());
    if (g.KK().KP())
      paramBoolean = false;
    if (q.etd.epG)
    {
      q.etd.dump();
      if (q.etd.epH > 0)
        mj(paramBoolean);
    }
    if ((q.etd.eqj >= 0) || (q.etd.eqk >= 0))
      mj(paramBoolean);
    com.tencent.mm.plugin.voip_cs.b.b.a locala;
    if (this.sPL != null)
    {
      i = this.sPL.cIt();
      g.KK().b(paramBoolean, i, false);
      locala = com.tencent.mm.plugin.voip_cs.b.c.cMe();
      if (!paramBoolean)
        break label182;
    }
    label182: for (int i = locala.tew.setAppCmd(401); ; i = locala.tew.setAppCmd(402))
    {
      if (i < 0)
        com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.VoipCSEngine", "voipContext trySwitchSpeakerPhone ret:".concat(String.valueOf(i)));
      AppMethodBeat.o(135365);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.c
 * JD-Core Version:    0.6.2
 */