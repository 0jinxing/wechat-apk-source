package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.audio.b.g.a;
import com.tencent.mm.audio.d.d;
import com.tencent.mm.bt.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.j;
import com.tencent.mm.protocal.protobuf.cux;
import com.tencent.mm.protocal.protobuf.cuy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import com.tencent.qqpinyin.voicerecoapi.c.a;
import java.util.LinkedList;

public final class p
  implements f
{
  public static final String tYC;
  public boolean cRY;
  public LinkedList<Integer> hkE;
  public com.tencent.mm.plugin.wear.model.d.c tYD;
  public com.tencent.qqpinyin.voicerecoapi.c tYE;
  public d tYF;
  private int tYG;
  public int tYH;
  public int tYI;

  static
  {
    AppMethodBeat.i(26425);
    tYC = ac.eSj + "tmp_wearvoicetotext.spx";
    AppMethodBeat.o(26425);
  }

  public p()
  {
    AppMethodBeat.i(26421);
    this.cRY = false;
    this.tYG = 0;
    this.hkE = new LinkedList();
    AppMethodBeat.o(26421);
  }

  public final void a(int paramInt, cux paramcux)
  {
    AppMethodBeat.i(26424);
    if (paramcux.vHn == null)
    {
      ab.i("MicroMsg.Wear.VoiceToTextServer", "voice data is null");
      AppMethodBeat.o(26424);
      return;
    }
    Object localObject = paramcux.vHn.toByteArray();
    this.tYG += this.tYF.a(new g.a((byte[])localObject, paramcux.wdn), 0, false);
    ab.i("MicroMsg.Wear.VoiceToTextServer", "write bytes: %d", new Object[] { Integer.valueOf(this.tYG) });
    short[] arrayOfShort = new short[paramcux.wdn / 2];
    for (int i = 0; i < paramcux.wdn / 2; i++)
      arrayOfShort[i] = ((short)(short)(localObject[(i * 2)] & 0xFF | localObject[(i * 2 + 1)] << 8));
    localObject = new c.a();
    this.tYE.a(arrayOfShort, paramcux.wdn / 2, (c.a)localObject);
    ab.i("MicroMsg.Wear.VoiceToTextServer", "state.vad_flag: " + ((c.a)localObject).AqE);
    if (((c.a)localObject).AqE == 2)
      this.tYI = 1;
    while (true)
    {
      if (this.tYI != 0)
      {
        if (this.tYI < 0)
        {
          if (this.hkE.size() > 10)
            this.hkE.removeLast();
          this.hkE.addFirst(Integer.valueOf(paramInt));
        }
        if (this.tYI == 1)
        {
          paramcux = new cuy();
          paramcux.wyw = this.tYD.talker;
          paramcux.wdK = "";
          paramcux.vAS = this.tYI;
          paramcux.xqZ = true;
          a.cUn().tXz.a(new p.a(this, this.tYD.ctE, paramcux));
          this.tYI = 0;
        }
      }
      if ((!this.cRY) && (this.tYG > 3300))
      {
        this.cRY = true;
        aw.Rg().a(this.tYD, 0);
      }
      AppMethodBeat.o(26424);
      break;
      if (((c.a)localObject).AqE == 3)
        this.tYI = 2;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(26423);
    if ((paramm instanceof com.tencent.mm.plugin.wear.model.d.c))
    {
      paramString = (com.tencent.mm.plugin.wear.model.d.c)paramm;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        aw.Rg().b(349, this);
        paramm = new cuy();
        paramm.wyw = paramString.talker;
        paramm.wdK = "";
        paramm.vAS = -1;
        paramm.xqZ = false;
        a.cUn().tXz.a(new p.a(this, paramString.ctE, paramm));
        AppMethodBeat.o(26423);
        return;
      }
      if (paramString.tYt)
      {
        aw.Rg().b(349, this);
        paramm = new cuy();
        paramm.wyw = paramString.talker;
        if (bo.isNullOrNil(paramString.tYs))
          break label221;
        ab.i("MicroMsg.Wear.VoiceToTextServer", "receive text: %s", new Object[] { paramString.tYs });
        paramm.wdK = paramString.tYs;
        paramm.vAS = 0;
      }
    }
    for (paramm.xqZ = true; ; paramm.xqZ = false)
    {
      a.cUn().tXz.a(new p.a(this, paramString.ctE, paramm));
      AppMethodBeat.o(26423);
      break;
      label221: paramm.wdK = "";
      paramm.vAS = -1;
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(26422);
    ab.i("MicroMsg.Wear.VoiceToTextServer", "reset: sessionId=%s", new Object[] { Integer.valueOf(this.tYH) });
    if (this.tYF != null)
    {
      this.tYF.Fe();
      this.tYF = null;
      ab.i("MicroMsg.Wear.VoiceToTextServer", "reset speexWriter");
    }
    if (this.tYE != null)
    {
      this.tYE.stop();
      this.tYE = null;
      ab.i("MicroMsg.Wear.VoiceToTextServer", "reset voiceDetectAPI");
    }
    if (this.tYD != null)
    {
      this.tYD.fZa = true;
      aw.Rg().b(349, this);
      aw.Rg().c(this.tYD);
      this.tYD = null;
    }
    this.tYI = 0;
    this.cRY = false;
    this.tYG = 0;
    this.tYH = -1;
    this.hkE.clear();
    AppMethodBeat.o(26422);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.p
 * JD-Core Version:    0.6.2
 */