package com.tencent.mm.chatroom.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import java.util.HashMap;

final class SelectMemberUI$1
  implements VerticalScrollBar.a
{
  SelectMemberUI$1(SelectMemberUI paramSelectMemberUI)
  {
  }

  public final void kp(String paramString)
  {
    AppMethodBeat.i(104407);
    if ("↑".equals(paramString))
    {
      SelectMemberUI.a(this.emG).setSelection(0);
      AppMethodBeat.o(104407);
      return;
    }
    SelectMemberUI.b localb = this.emG.emB;
    if (localb.emK.containsKey(paramString));
    for (int i = ((Integer)localb.emK.get(paramString)).intValue(); ; i = -1)
    {
      if (i != -1)
        SelectMemberUI.a(this.emG).setSelection(i);
      AppMethodBeat.o(104407);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectMemberUI.1
 * JD-Core Version:    0.6.2
 */