package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d.a;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

final class ae$1
  implements d.a
{
  ae$1(ae paramae, Intent paramIntent)
  {
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(31628);
    this.val$intent.removeExtra("SendAppMessageWrapper_Scene");
    if (paramInt1 == 228)
      if (paramInt2 == -1)
        if ((paramIntent != null) && (paramIntent.getBooleanExtra("Select_stay_in_wx", false)))
        {
          ReportUtil.F(false, 0);
          AppMethodBeat.o(31628);
        }
    while (true)
    {
      return;
      if (!this.yRm.cgL.yTx.getContext().isFinishing())
      {
        this.yRm.cgL.yTx.getContext().finish();
        AppMethodBeat.o(31628);
        continue;
        paramIntent = ReportUtil.c(this.val$intent.getExtras(), 0);
        ReportUtil.a(this.yRm.cgL.yTx.getContext(), paramIntent, true);
        if (!this.yRm.cgL.yTx.getContext().isFinishing())
          this.yRm.cgL.yTx.getContext().finish();
      }
      else
      {
        AppMethodBeat.o(31628);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ae.1
 * JD-Core Version:    0.6.2
 */