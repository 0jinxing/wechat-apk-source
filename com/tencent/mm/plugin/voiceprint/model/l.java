package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class l
  implements com.tencent.mm.ai.f
{
  public int sLf;
  public int sLr;
  private String sLs;
  public int sLt;
  public a sLu;

  public l()
  {
    AppMethodBeat.i(26111);
    this.sLr = 71;
    this.sLs = null;
    this.sLt = 0;
    this.sLf = 0;
    this.sLu = null;
    aw.Rg().a(611, this);
    aw.Rg().a(612, this);
    AppMethodBeat.o(26111);
  }

  public l(a parama)
  {
    this();
    this.sLu = parama;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(26112);
    ab.d("MicroMsg.VoicePrintCreateService", "onSceneEnd, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      if (this.sLu != null)
        this.sLu.cHM();
      AppMethodBeat.o(26112);
      return;
    }
    if (paramm.getType() == 611)
    {
      paramString = (d)paramm;
      this.sLt = paramString.sKX;
      this.sLs = paramString.sKW;
      ab.d("MicroMsg.VoicePrintCreateService", "onFinishGetText, resId:%d, voiceText==null:%b", new Object[] { Integer.valueOf(this.sLt), Boolean.valueOf(bo.isNullOrNil(this.sLs)) });
      if (this.sLu != null)
      {
        if (this.sLr != 71)
          break label298;
        this.sLu.abS(this.sLs);
      }
    }
    label158: if (paramm.getType() == 612)
    {
      paramString = (f)paramm;
      if (((paramString.sLh != 72) || (paramString.Kt != 0)) && (paramString.sLh != 71))
        break label323;
      paramInt1 = 1;
      label202: if (paramInt1 == 0)
        break label328;
      ab.d("MicroMsg.VoicePrintCreateService", "onRegister, ok, step:%d", new Object[] { Integer.valueOf(paramString.sLh) });
      this.sLf = paramString.sLf;
      if (this.sLu != null)
        this.sLu.E(true, paramString.sLh);
    }
    while (true)
    {
      if ((paramInt1 != 0) && (paramString.sLh == 71) && (this.sLu != null))
        this.sLu.abT(this.sLs);
      AppMethodBeat.o(26112);
      break;
      label298: if (this.sLr != 72)
        break label158;
      this.sLu.abT(this.sLs);
      break label158;
      label323: paramInt1 = 0;
      break label202;
      label328: ab.d("MicroMsg.VoicePrintCreateService", "onRegister, not ok, step:%d", new Object[] { Integer.valueOf(paramString.sLh) });
      if (this.sLu != null)
        this.sLu.E(false, paramString.sLh);
    }
  }

  public static abstract interface a
  {
    public abstract void E(boolean paramBoolean, int paramInt);

    public abstract void abS(String paramString);

    public abstract void abT(String paramString);

    public abstract void cHM();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.l
 * JD-Core Version:    0.6.2
 */