package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactRemarkInfoModUI$15
  implements View.OnFocusChangeListener
{
  ContactRemarkInfoModUI$15(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(33643);
    if (!paramBoolean)
    {
      ContactRemarkInfoModUI.i(this.zmg).setBackgroundResource(2130839105);
      AppMethodBeat.o(33643);
    }
    while (true)
    {
      return;
      ContactRemarkInfoModUI.i(this.zmg).setBackgroundResource(2130839104);
      AppMethodBeat.o(33643);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoModUI.15
 * JD-Core Version:    0.6.2
 */