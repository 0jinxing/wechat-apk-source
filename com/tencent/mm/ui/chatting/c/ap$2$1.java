package com.tencent.mm.ui.chatting.c;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate.b;

final class ap$2$1
  implements Runnable
{
  ap$2$1(ap.2 param2, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31825);
    if (this.rcK == 0)
    {
      this.ySZ.ySY.a(bo.anl(this.val$id), ChattingItemTranslate.b.zhj);
      ap.a(this.ySZ.ySY, bo.anl(this.val$id));
      AppMethodBeat.o(31825);
      return;
    }
    if (this.rcK == 3)
      h.bQ(this.ySZ.ySY.cgL.yTx.getContext(), this.ySZ.ySY.cgL.yTx.getMMResources().getString(2131298260));
    while (true)
    {
      this.ySZ.ySY.a(bo.anl(this.val$id), ChattingItemTranslate.b.zhg);
      this.ySZ.ySY.cgL.aWv();
      AppMethodBeat.o(31825);
      break;
      if (this.rcK != 5)
        h.bQ(this.ySZ.ySY.cgL.yTx.getContext(), this.ySZ.ySY.cgL.yTx.getMMResources().getString(2131298255));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ap.2.1
 * JD-Core Version:    0.6.2
 */