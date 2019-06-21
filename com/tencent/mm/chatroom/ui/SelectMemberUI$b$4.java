package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import java.util.HashSet;

final class SelectMemberUI$b$4
  implements View.OnClickListener
{
  SelectMemberUI$b$4(SelectMemberUI.b paramb, SelectMemberUI.c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(104416);
    int i = ((Integer)paramView.getTag()).intValue();
    paramView = this.emL.iH(i);
    if (this.emL.emG.Ks().contains(paramView.ehM.field_username))
      AppMethodBeat.o(104416);
    while (true)
    {
      return;
      if (this.emL.emG.emD.contains(paramView.ehM.field_username))
      {
        this.emL.emG.emD.remove(paramView.ehM.field_username);
        this.emN.emR.setImageResource(2131231120);
        this.emL.emG.w(i, false);
        AppMethodBeat.o(104416);
      }
      else
      {
        this.emL.emG.emD.add(paramView.ehM.field_username);
        this.emN.emR.setImageResource(2131231117);
        this.emL.emG.w(i, true);
        AppMethodBeat.o(104416);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectMemberUI.b.4
 * JD-Core Version:    0.6.2
 */