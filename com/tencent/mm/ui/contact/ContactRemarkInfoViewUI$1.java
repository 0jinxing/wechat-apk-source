package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bc.c;

final class ContactRemarkInfoViewUI$1
  implements View.OnClickListener
{
  ContactRemarkInfoViewUI$1(ContactRemarkInfoViewUI paramContactRemarkInfoViewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33687);
    if (!ContactRemarkInfoViewUI.a(this.zml))
      AppMethodBeat.o(33687);
    while (true)
    {
      return;
      paramView = new Intent(this.zml, ContactRemarkImagePreviewUI.class);
      paramView.putExtra("Contact_User", ContactRemarkInfoViewUI.b(this.zml));
      c.aiB();
      paramView.putExtra("remark_image_path", c.sW(ContactRemarkInfoViewUI.b(this.zml)));
      paramView.putExtra("view_only", true);
      this.zml.startActivity(paramView);
      AppMethodBeat.o(33687);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoViewUI.1
 * JD-Core Version:    0.6.2
 */