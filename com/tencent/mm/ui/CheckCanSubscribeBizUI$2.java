package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.protocal.protobuf.qu;
import com.tencent.mm.sdk.platformtools.bo;

final class CheckCanSubscribeBizUI$2
  implements w.a
{
  CheckCanSubscribeBizUI$2(CheckCanSubscribeBizUI paramCheckCanSubscribeBizUI)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(29142);
    paramb = (qu)paramb.fsH.fsP;
    CheckCanSubscribeBizUI.a(this.yfJ, paramb.vXO);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (!bo.isNullOrNil(paramb.vXO)) && (!bo.isNullOrNil(paramb.ndF)))
    {
      CheckCanSubscribeBizUI.b(this.yfJ, paramb.ndF);
      CheckCanSubscribeBizUI.c(this.yfJ, paramb.vXP);
      CheckCanSubscribeBizUI.b(this.yfJ);
      AppMethodBeat.o(29142);
    }
    while (true)
    {
      return 0;
      if (u.a.a(this.yfJ, paramInt1, paramInt2, paramString, 7))
      {
        this.yfJ.setResult(5);
        this.yfJ.finish();
        AppMethodBeat.o(29142);
      }
      else
      {
        CheckCanSubscribeBizUI.c(this.yfJ);
        this.yfJ.setResult(3);
        this.yfJ.finish();
        AppMethodBeat.o(29142);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.CheckCanSubscribeBizUI.2
 * JD-Core Version:    0.6.2
 */