package com.tencent.mm.chatroom.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelectMemberUI$b$1$1
  implements Runnable
{
  SelectMemberUI$b$1$1(SelectMemberUI.b.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104412);
    SelectMemberUI.b.a(this.emM.emL, false);
    SelectMemberUI.c(this.emM.emL.emG).setVisibility(8);
    this.emM.emL.notifyDataSetChanged();
    AppMethodBeat.o(104412);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectMemberUI.b.1.1
 * JD-Core Version:    0.6.2
 */