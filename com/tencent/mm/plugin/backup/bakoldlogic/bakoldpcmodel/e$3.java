package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;

final class e$3
  implements f
{
  e$3(e parame, Runnable paramRunnable1, Runnable paramRunnable2)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17842);
    if (paramm != this.jzN.jzF)
    {
      ab.w("MicroMsg.BakPcProcessMgr", "last canceded scene");
      AppMethodBeat.o(17842);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.BakPcProcessMgr", "getPcPwd OK");
      paramString = (com.tencent.mm.plugin.backup.bakoldlogic.c.e)paramm;
      a.aUB().jqU = paramString.jAn;
      this.jzQ.run();
    }
    while (true)
    {
      aw.Rg().b(596, this);
      AppMethodBeat.o(17842);
      break;
      this.jzN.ai(10010, new String("getPcPwd Fail"));
      ab.i("MicroMsg.BakPcProcessMgr", "getPcPwd Fail");
      this.jzR.run();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.3
 * JD-Core Version:    0.6.2
 */