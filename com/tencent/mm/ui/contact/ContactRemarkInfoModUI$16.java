package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bc.c;
import com.tencent.mm.platformtools.ah;

final class ContactRemarkInfoModUI$16
  implements View.OnClickListener
{
  ContactRemarkInfoModUI$16(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33644);
    if (!ContactRemarkInfoModUI.j(this.zmg))
    {
      AppMethodBeat.o(33644);
      return;
    }
    ContactRemarkInfoModUI.k(this.zmg);
    Intent localIntent = new Intent(this.zmg, ContactRemarkImagePreviewUI.class);
    localIntent.putExtra("Contact_User", ContactRemarkInfoModUI.l(this.zmg));
    if ((!ah.isNullOrNil(ContactRemarkInfoModUI.m(this.zmg))) && (!ContactRemarkInfoModUI.n(this.zmg)))
      c.aiB();
    for (paramView = c.sW(ContactRemarkInfoModUI.l(this.zmg)); ; paramView = ContactRemarkInfoModUI.o(this.zmg))
    {
      localIntent.putExtra("remark_image_path", paramView);
      localIntent.putExtra("view_temp_remark_image", ContactRemarkInfoModUI.n(this.zmg));
      this.zmg.startActivityForResult(localIntent, 400);
      AppMethodBeat.o(33644);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoModUI.16
 * JD-Core Version:    0.6.2
 */