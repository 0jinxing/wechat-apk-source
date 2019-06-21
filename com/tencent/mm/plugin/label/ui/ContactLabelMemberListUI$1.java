package com.tencent.mm.plugin.label.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class ContactLabelMemberListUI$1 extends ak
{
  ContactLabelMemberListUI$1(ContactLabelMemberListUI paramContactLabelMemberListUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(22639);
    int i = paramMessage.what;
    ab.d("MicroMsg.Label.ContactLabelMemberListUI", "handleMessage:%d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default:
      ab.w("MicroMsg.Label.ContactLabelMemberListUI", "[cpan] unknow msg.");
      AppMethodBeat.o(22639);
    case 5001:
    }
    while (true)
    {
      return;
      ContactLabelMemberListUI.a(this.nIz);
      AppMethodBeat.o(22639);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelMemberListUI.1
 * JD-Core Version:    0.6.2
 */