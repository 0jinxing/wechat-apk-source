package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;

final class SelectContactUI$12
  implements View.OnClickListener
{
  SelectContactUI$12(SelectContactUI paramSelectContactUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33859);
    h.pYm.e(11140, new Object[] { Integer.valueOf(0) });
    d.H(this.zoP, "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
    AppMethodBeat.o(33859);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.12
 * JD-Core Version:    0.6.2
 */