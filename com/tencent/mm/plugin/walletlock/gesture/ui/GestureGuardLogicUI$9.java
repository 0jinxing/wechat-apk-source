package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.g.b.a.bj;
import com.tencent.mm.plugin.walletlock.c.i;
import com.tencent.mm.plugin.walletlock.gesture.a.d;
import com.tencent.mm.protocal.protobuf.bfp;
import com.tencent.mm.sdk.platformtools.ab;

final class GestureGuardLogicUI$9
  implements w.a
{
  GestureGuardLogicUI$9(GestureGuardLogicUI paramGestureGuardLogicUI, w.a parama)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(51594);
    ab.i("MicroMsg.GestureGuardLogicUI", String.format("Scene doModify, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString }));
    GestureGuardLogicUI.o(this.tVW);
    Object localObject;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      d.a(((bfp)paramb.fsH.fsP).wJw);
      GestureGuardLogicUI.cTQ();
      if (GestureGuardLogicUI.q(this.tVW) != 0)
        break label206;
      if (GestureGuardLogicUI.r(this.tVW) == 1)
      {
        localObject = new bj();
        ((bj)localObject).cVT = 8L;
        ((bj)localObject).dcm = 2L;
        ((bj)localObject).ajK();
      }
    }
    else
    {
      i.tXc.cUf();
      if (this.fux == null)
        break label342;
      paramInt1 = this.fux.a(paramInt1, paramInt2, paramString, paramb, paramm);
      AppMethodBeat.o(51594);
    }
    while (true)
    {
      return paramInt1;
      if (GestureGuardLogicUI.r(this.tVW) != 2)
        break;
      localObject = new bj();
      ((bj)localObject).cVT = 10L;
      ((bj)localObject).dcm = 2L;
      ((bj)localObject).ajK();
      break;
      label206: localObject = this.tVW.getIntent().getStringExtra("next_action");
      if ("next_action.modify_pattern".equals(localObject))
      {
        localObject = new bj();
        ((bj)localObject).cVT = 5L;
        ((bj)localObject).dcm = 2L;
        ((bj)localObject).ajK();
        break;
      }
      if ("next_action.switch_on_pattern".equals(localObject))
      {
        localObject = new bj();
        ((bj)localObject).cVT = 4L;
        ((bj)localObject).dcm = 2L;
        ((bj)localObject).ajK();
        break;
      }
      localObject = new bj();
      ((bj)localObject).cVT = 5L;
      ((bj)localObject).dcm = 2L;
      ((bj)localObject).ajK();
      break;
      label342: AppMethodBeat.o(51594);
      paramInt1 = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.9
 * JD-Core Version:    0.6.2
 */