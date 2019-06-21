package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.transmit.SendAppMessageWrapperUI;

public class ae extends a
  implements v
{
  public final void dxx()
  {
    AppMethodBeat.i(31630);
    Intent localIntent = this.cgL.yTx.getContext().getIntent();
    if (localIntent.getIntExtra("SendAppMessageWrapper_Scene", 0) != 3)
      AppMethodBeat.o(31630);
    while (true)
    {
      return;
      localIntent.setClass(this.cgL.yTx.getContext(), SendAppMessageWrapperUI.class);
      localIntent.putExtra("Select_Conv_User", this.cgL.getTalkerUserName());
      this.cgL.a(localIntent, 228, new ae.1(this, localIntent));
      AppMethodBeat.o(31630);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(31629);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(31629);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ae
 * JD-Core Version:    0.6.2
 */