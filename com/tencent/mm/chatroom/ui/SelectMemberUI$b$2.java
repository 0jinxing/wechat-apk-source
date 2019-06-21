package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class SelectMemberUI$b$2
  implements Runnable
{
  SelectMemberUI$b$2(SelectMemberUI.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104414);
    this.emL.notifyDataSetChanged();
    if ((SelectMemberUI.b.b(this.emL) != null) && (SelectMemberUI.b.b(this.emL).size() == 0))
    {
      SelectMemberUI.a(this.emL.emG).setVisibility(8);
      SelectMemberUI.d(this.emL.emG).setVisibility(0);
      AppMethodBeat.o(104414);
    }
    while (true)
    {
      return;
      SelectMemberUI.a(this.emL.emG).setVisibility(0);
      SelectMemberUI.d(this.emL.emG).setVisibility(8);
      AppMethodBeat.o(104414);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectMemberUI.b.2
 * JD-Core Version:    0.6.2
 */