package com.tencent.mm.plugin.label.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class ContactLabelEditUI$10
  implements ContactListExpandPreference.a
{
  ContactLabelEditUI$10(ContactLabelEditUI paramContactLabelEditUI)
  {
  }

  public final void JT()
  {
    AppMethodBeat.i(22547);
    if (ContactLabelEditUI.c(this.nHW) != null)
      ContactLabelEditUI.c(this.nHW).djD();
    AppMethodBeat.o(22547);
  }

  public final void iA(int paramInt)
  {
    AppMethodBeat.i(22549);
    String str = ContactLabelEditUI.c(this.nHW).KX(paramInt);
    ab.d("MicroMsg.Label.ContactLabelEditUI", "cpan[onItemDelClick] position:%d userName:%s", new Object[] { Integer.valueOf(paramInt), str });
    ContactLabelEditUI.a(this.nHW, str);
    AppMethodBeat.o(22549);
  }

  public final void iB(int paramInt)
  {
    AppMethodBeat.i(22546);
    String str1;
    String str2;
    if (ContactLabelEditUI.c(this.nHW).KW(paramInt))
    {
      str1 = ContactLabelEditUI.c(this.nHW).KX(paramInt);
      str2 = ContactLabelEditUI.c(this.nHW).KY(paramInt);
      if (bo.isNullOrNil(str1))
        AppMethodBeat.o(22546);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("Contact_User", str1);
      localIntent.putExtra("Contact_RoomNickname", str2);
      a.gkE.c(localIntent, this.nHW);
      AppMethodBeat.o(22546);
    }
  }

  public final void iC(int paramInt)
  {
    AppMethodBeat.i(22548);
    ContactLabelEditUI.d(this.nHW);
    AppMethodBeat.o(22548);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelEditUI.10
 * JD-Core Version:    0.6.2
 */