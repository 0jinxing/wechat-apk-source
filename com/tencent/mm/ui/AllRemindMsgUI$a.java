package com.tencent.mm.ui;

import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.n;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

final class AllRemindMsgUI$a
  implements f, Runnable
{
  AllRemindMsgUI$a(AllRemindMsgUI paramAllRemindMsgUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(29117);
    ab.i("MicroMsg.emoji.AllRemindMsgUI", "[onSceneEnd] errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (paramm.getType() != 866)
        AppMethodBeat.o(29117);
    while (true)
    {
      return;
      d.post(new AllRemindMsgUI.a.1(this, paramm), "MicroMsg.emoji.AllRemindMsgUI[onSceneEnd]");
      AppMethodBeat.o(29117);
      continue;
      ab.e("MicroMsg.emoji.AllRemindMsgUI", "[onSceneEnd] errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      AllRemindMsgUI.c(this.yex).setVisibility(0);
      AllRemindMsgUI.e(this.yex).setVisibility(8);
      AppMethodBeat.o(29117);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(29116);
    n localn = new n();
    aw.Rg().a(localn, 0);
    AppMethodBeat.o(29116);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AllRemindMsgUI.a
 * JD-Core Version:    0.6.2
 */