package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class ContactRemarkInfoModUI$14
  implements View.OnClickListener
{
  ContactRemarkInfoModUI$14(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33642);
    ContactRemarkInfoModUI.f(this.zmg);
    ContactRemarkInfoModUI.a(this.zmg, false, paramView.getId());
    ContactRemarkInfoModUI.h(this.zmg).performClick();
    ContactRemarkInfoModUI.h(this.zmg).requestFocus();
    this.zmg.showVKB();
    AppMethodBeat.o(33642);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoModUI.14
 * JD-Core Version:    0.6.2
 */