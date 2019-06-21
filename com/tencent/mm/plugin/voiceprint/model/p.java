package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.b.g.a;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class p
  implements g.a
{
  public static int cri = 100;
  public k chd = null;
  public String fileName = "";
  public b gar;
  private int jJI = 0;
  public long ljM = 0L;
  public p.b sLB;
  public String sLC;
  public boolean sLD = false;
  public p.a sLE = null;
  public boolean sth = false;
  public int stk = 0;

  public final boolean EH()
  {
    long l = 0L;
    AppMethodBeat.i(26127);
    aw.ZL().KN();
    this.sLD = false;
    ab.d("MicroMsg.VoicePrintRecoder", "stop Record :" + this.fileName);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("stop synchronized Record :");
      ab.d("MicroMsg.VoicePrintRecoder", this.fileName);
      if (this.chd != null)
        this.chd.EB();
      if (this.stk != 2)
      {
        this.fileName = null;
        this.sLD = false;
        ab.d("MicroMsg.VoicePrintRecoder", "Stop " + this.fileName);
        this.stk = -1;
        ab.d("MicroMsg.VoicePrintRecoder", "bLongEnough " + this.sLD);
        if (this.gar != null)
          this.gar.Mm();
        boolean bool = this.sLD;
        AppMethodBeat.o(26127);
        return bool;
      }
    }
    finally
    {
      AppMethodBeat.o(26127);
    }
    if (this.ljM <= 0L)
    {
      label209: this.jJI = ((int)l);
      if (this.jJI >= 1000)
        break label292;
      ab.d("MicroMsg.VoicePrintRecoder", "Stop " + this.fileName + " by voiceLen: " + this.jJI);
      this.fileName = "";
      this.sLD = false;
    }
    while (true)
    {
      this.fileName = "";
      break;
      l = bo.az(this.ljM);
      break label209;
      label292: this.sLD = true;
      ab.d("MicroMsg.VoicePrintRecoder", "Stop file success: " + this.fileName);
    }
  }

  public final void gE(int paramInt)
  {
    AppMethodBeat.i(26126);
    ab.d("MicroMsg.VoicePrintRecoder", " Recorder onBluetoothHeadsetStateChange :".concat(String.valueOf(paramInt)));
    if (this.sth)
      AppMethodBeat.o(26126);
    while (true)
    {
      return;
      this.sth = true;
      aw.ZL().b(this);
      this.chd = new k();
      this.sLB = new p.b(this);
      this.sLB.start();
      this.sLD = false;
      this.stk = 1;
      AppMethodBeat.o(26126);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.p
 * JD-Core Version:    0.6.2
 */