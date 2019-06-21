package com.tencent.mm.plugin.fts.ui.widget;

import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

final class c$1
  implements FTSVoiceInputLayoutImpl.a
{
  String mMR = "";
  String mMS = "";

  c$1(c paramc)
  {
  }

  private void IF()
  {
    AppMethodBeat.i(62176);
    this.mMT.mMN = System.currentTimeMillis();
    c localc = this.mMT;
    long l1;
    if (this.mMT.mMM > 0L)
    {
      l1 = this.mMT.mMM;
      localc.mMM = l1;
      if (!bo.isNullOrNil(this.mMR))
        break label214;
    }
    label214: for (int i = 2; ; i = 1)
    {
      long l2 = this.mMT.mMM - this.mMT.mML;
      l1 = this.mMT.mMN - this.mMT.mML;
      h.pYm.e(16346, new Object[] { Integer.valueOf(i), e.mCM, Long.valueOf(l2), Long.valueOf(l1) });
      ab.i("MicroMsg.FTSVoiceInputHelper", "16346 actionType:%s, searchId:%s, voiceTime:%s, tranTime:%s", new Object[] { Integer.valueOf(i), e.mCM, Long.valueOf(l2), Long.valueOf(l1) });
      this.mMT.mML = 0L;
      this.mMT.mMM = 0L;
      this.mMT.mMN = 0L;
      AppMethodBeat.o(62176);
      return;
      l1 = this.mMT.mMN;
      break;
    }
  }

  private void bBG()
  {
    AppMethodBeat.i(62174);
    bBH();
    this.mMT.mMJ.setText(this.mMR);
    this.mMT.mMK.setVisibility(0);
    this.mMT.mMG.Nx(this.mMR);
    AppMethodBeat.o(62174);
  }

  private void bBH()
  {
    AppMethodBeat.i(62175);
    if (this.mMR.length() > 0)
      this.mMR = this.mMR.replaceAll("。", " ").replaceAll("\\.", " ").replaceAll("，", " ").replaceAll(",", " ").trim();
    AppMethodBeat.o(62175);
  }

  public final void bBA()
  {
    AppMethodBeat.i(62166);
    this.mMT.mMM = System.currentTimeMillis();
    if ((this.mMT.mMH) && (!bo.isNullOrNil(this.mMR)))
      this.mMT.bBy();
    AppMethodBeat.o(62166);
  }

  public final void bBB()
  {
    AppMethodBeat.i(62167);
    this.mMT.mML = System.currentTimeMillis();
    AppMethodBeat.o(62167);
  }

  public final void bBC()
  {
    AppMethodBeat.i(62168);
    ab.d("MicroMsg.FTSVoiceInputHelper", "onDetectStop");
    AppMethodBeat.o(62168);
  }

  public final void bBD()
  {
    AppMethodBeat.i(62169);
    ab.d("MicroMsg.FTSVoiceInputHelper", "onDetectCancel");
    AppMethodBeat.o(62169);
  }

  public final void bBE()
  {
    AppMethodBeat.i(62170);
    ab.d("MicroMsg.FTSVoiceInputHelper", "onStateReset");
    AppMethodBeat.o(62170);
  }

  public final void bBF()
  {
    AppMethodBeat.i(62171);
    ab.d("MicroMsg.FTSVoiceInputHelper", "onDetectFinish");
    IF();
    this.mMT.mMH = false;
    bBG();
    this.mMT.mMG.Ny(this.mMR);
    this.mMR = "";
    this.mMS = "";
    AppMethodBeat.o(62171);
  }

  public final void bBz()
  {
    AppMethodBeat.i(62165);
    this.mMR = "";
    this.mMS = "";
    ab.d("MicroMsg.FTSVoiceInputHelper", "onDetectStart");
    h.pYm.e(15490, new Object[] { Integer.valueOf(3), e.mCM, Integer.valueOf(1) });
    ab.d("MicroMsg.FTSVoiceInputHelper", "15490 type:3, sessionId:%s, voicever:%s", new Object[] { e.mCM, Integer.valueOf(1) });
    this.mMT.mMH = true;
    this.mMT.mMG.bBh();
    AppMethodBeat.o(62165);
  }

  public final void c(String[] paramArrayOfString, List<String> paramList)
  {
    AppMethodBeat.i(138302);
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0) && (paramArrayOfString[0].length() > 0))
    {
      this.mMR = paramArrayOfString[0];
      ab.d("MicroMsg.FTSVoiceInputHelper", "onDetected text content: " + this.mMR);
      bBG();
    }
    if ((paramList != null) && (!paramList.isEmpty()) && (paramList.iterator().hasNext()))
    {
      this.mMS = ((String)paramList.iterator().next());
      ab.d("MicroMsg.FTSVoiceInputHelper", "set voiceId:%s", new Object[] { this.mMS });
    }
    AppMethodBeat.o(138302);
  }

  public final void wi(int paramInt)
  {
    AppMethodBeat.i(62173);
    this.mMT.mMH = false;
    IF();
    if (paramInt == 12)
    {
      this.mMT.mMG.a(false, true, this.mMR);
      AppMethodBeat.o(62173);
    }
    while (true)
    {
      return;
      this.mMT.mMG.a(false, false, this.mMR);
      AppMethodBeat.o(62173);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.c.1
 * JD-Core Version:    0.6.2
 */