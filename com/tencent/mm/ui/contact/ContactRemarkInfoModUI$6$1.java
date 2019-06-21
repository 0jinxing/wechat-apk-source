package com.tencent.mm.ui.contact;

import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class ContactRemarkInfoModUI$6$1
  implements Runnable
{
  ContactRemarkInfoModUI$6$1(ContactRemarkInfoModUI.6 param6, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(33633);
    if (!this.ejK)
    {
      h.bQ(this.zmh.zmg, this.zmh.zmg.getString(2131296906));
      ContactRemarkInfoModUI.s(this.zmh.zmg).setVisibility(0);
      ContactRemarkInfoModUI.t(this.zmh.zmg).setVisibility(8);
      ContactRemarkInfoModUI.u(this.zmh.zmg).setVisibility(8);
      AppMethodBeat.o(33633);
    }
    while (true)
    {
      return;
      ContactRemarkInfoModUI.v(this.zmh.zmg);
      AppMethodBeat.o(33633);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoModUI.6.1
 * JD-Core Version:    0.6.2
 */