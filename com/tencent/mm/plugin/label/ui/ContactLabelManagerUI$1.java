package com.tencent.mm.plugin.label.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class ContactLabelManagerUI$1 extends ak
{
  ContactLabelManagerUI$1(ContactLabelManagerUI paramContactLabelManagerUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(22584);
    int i = paramMessage.what;
    ab.d("MicroMsg.Label.ContactLabelManagerUI", "handleMessage:%d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default:
    case 5001:
    case 5002:
    case 5003:
    }
    while (true)
    {
      AppMethodBeat.o(22584);
      while (true)
      {
        return;
        ContactLabelManagerUI.a(this.nIh);
        AppMethodBeat.o(22584);
        continue;
        this.nIh.PI(this.nIh.getString(2131297086));
        AppMethodBeat.o(22584);
      }
      this.nIh.bJc();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.1
 * JD-Core Version:    0.6.2
 */