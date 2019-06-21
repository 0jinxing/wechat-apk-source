package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;

final class ContactRemarkInfoModUI$17
  implements View.OnClickListener
{
  ContactRemarkInfoModUI$17(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33645);
    if ((ah.isNullOrNil(ContactRemarkInfoModUI.m(this.zmg))) || (ContactRemarkInfoModUI.p(this.zmg)))
    {
      ContactRemarkInfoModUI.a(this.zmg, false);
      ContactRemarkInfoModUI.k(this.zmg);
    }
    AppMethodBeat.o(33645);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoModUI.17
 * JD-Core Version:    0.6.2
 */