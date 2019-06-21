package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

final class o$c$1
  implements d.a
{
  o$c$1(o.c paramc, a parama)
  {
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(32993);
    if (paramInt1 == 221)
      if (paramIntent == null)
        AppMethodBeat.o(32993);
    while (true)
    {
      return;
      paramIntent = paramIntent.getStringExtra("result_msg");
      if (!bo.isNullOrNil(paramIntent))
        h.b(this.zbG.yTx.getContext(), paramIntent, "", false);
      AppMethodBeat.o(32993);
      continue;
      AppMethodBeat.o(32993);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.o.c.1
 * JD-Core Version:    0.6.2
 */