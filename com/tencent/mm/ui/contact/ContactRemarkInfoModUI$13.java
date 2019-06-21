package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMClearEditText;

final class ContactRemarkInfoModUI$13
  implements View.OnClickListener
{
  ContactRemarkInfoModUI$13(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33641);
    ContactRemarkInfoModUI.f(this.zmg);
    ContactRemarkInfoModUI.a(this.zmg, false, paramView.getId());
    ContactRemarkInfoModUI.g(this.zmg).performClick();
    ContactRemarkInfoModUI.g(this.zmg).requestFocus();
    this.zmg.showVKB();
    AppMethodBeat.o(33641);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoModUI.13
 * JD-Core Version:    0.6.2
 */