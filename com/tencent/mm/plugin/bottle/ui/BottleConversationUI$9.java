package com.tencent.mm.plugin.bottle.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;

final class BottleConversationUI$9
  implements View.OnClickListener
{
  BottleConversationUI$9(BottleConversationUI paramBottleConversationUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18564);
    BackwardSupportUtil.c.a(BottleConversationUI.c(this.jKb));
    AppMethodBeat.o(18564);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.BottleConversationUI.9
 * JD-Core Version:    0.6.2
 */