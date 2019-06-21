package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class q
  implements f
{
  private String sKY;
  public q.a sLI;
  private int sLf;
  public String sLs;
  public int sLt;

  public q()
  {
    AppMethodBeat.i(26128);
    this.sLI = null;
    this.sLt = -1;
    this.sLs = null;
    this.sKY = null;
    this.sLf = 0;
    aw.Rg().a(611, this);
    aw.Rg().a(613, this);
    AppMethodBeat.o(26128);
  }

  public q(q.a parama)
  {
    this();
    this.sLI = parama;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(26129);
    ab.d("MicroMsg.VoicePrintUnLockService", "onSceneEnd, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      if (this.sLI != null)
        this.sLI.cHM();
      AppMethodBeat.o(26129);
    }
    while (true)
    {
      return;
      if (paramm.getType() == 611)
      {
        paramString = (d)paramm;
        this.sLt = paramString.sKX;
        this.sLs = paramString.sKW;
        this.sKY = paramString.sKY;
        ab.d("MicroMsg.VoicePrintUnLockService", "onGetVoiceText, resId:%d, verifyKey:%s, voiceText==null:%b", new Object[] { Integer.valueOf(this.sLt), this.sKY, Boolean.valueOf(bo.isNullOrNil(this.sLs)) });
        if (this.sLI != null)
          this.sLI.abU(this.sLs);
      }
      if (paramm.getType() == 613)
      {
        if (((j)paramm).Kt == 0)
        {
          ab.d("MicroMsg.VoicePrintUnLockService", "onVerify, success");
          if (this.sLI != null)
          {
            this.sLI.mi(true);
            AppMethodBeat.o(26129);
          }
        }
        else
        {
          ab.d("MicroMsg.VoicePrintUnLockService", "onVerify, failed");
          if (this.sLI != null)
            this.sLI.mi(false);
        }
      }
      else
        AppMethodBeat.o(26129);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.q
 * JD-Core Version:    0.6.2
 */