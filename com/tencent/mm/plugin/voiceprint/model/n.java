package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class n
  implements f
{
  public String gCk;
  public String hjp;
  public String igi;
  private String sLs;
  public int sLt;
  public n.a sLv;

  public n()
  {
    AppMethodBeat.i(26114);
    this.hjp = null;
    this.sLv = null;
    this.sLt = -1;
    this.sLs = null;
    this.gCk = null;
    this.igi = null;
    aw.Rg().a(618, this);
    aw.Rg().a(616, this);
    aw.Rg().a(617, this);
    AppMethodBeat.o(26114);
  }

  public final void cHN()
  {
    AppMethodBeat.i(26115);
    aw.Rg().a(new g(this.hjp), 0);
    AppMethodBeat.o(26115);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(26116);
    ab.d("MicroMsg.VoicePrintLoginService", "onSceneEnd, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) && (paramInt2 != 0))
      if ((paramInt2 == -34) && (paramm.getType() == 617))
      {
        ab.d("MicroMsg.VoicePrintLoginService", "blocked by limit");
        if (this.sLv != null)
          this.sLv.cHO();
        AppMethodBeat.o(26116);
      }
    while (true)
    {
      return;
      if (this.sLv != null)
        this.sLv.cHM();
      AppMethodBeat.o(26116);
      continue;
      if (paramm.getType() == 618)
      {
        this.hjp = ((e)paramm).elr;
        ab.d("MicroMsg.VoicePrintLoginService", "onGetTicket, loginTicket==null:%b", new Object[] { Boolean.valueOf(bo.isNullOrNil(this.hjp)) });
        if (!bo.isNullOrNil(this.hjp))
          cHN();
      }
      if (paramm.getType() == 616)
      {
        paramString = (g)paramm;
        this.sLt = paramString.sKX;
        this.sLs = paramString.sKW;
        ab.d("MicroMsg.VoicePrintLoginService", "onFinishGetText, resId:%d, voiceText==null:%b", new Object[] { Integer.valueOf(this.sLt), Boolean.valueOf(bo.isNullOrNil(this.sLs)) });
        if (this.sLv != null)
          this.sLv.abU(this.sLs);
      }
      if (paramm.getType() == 617)
      {
        paramString = (h)paramm;
        if (paramString.Kt == 0)
        {
          ab.d("MicroMsg.VoicePrintLoginService", "onFinishVerify, success");
          this.gCk = paramString.gCk;
          if (this.sLv != null)
          {
            this.sLv.mh(true);
            AppMethodBeat.o(26116);
          }
        }
        else
        {
          ab.d("MicroMsg.VoicePrintLoginService", "onFinishVerify, failed");
          if (this.sLv != null)
            this.sLv.mh(false);
        }
      }
      else
      {
        AppMethodBeat.o(26116);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.n
 * JD-Core Version:    0.6.2
 */