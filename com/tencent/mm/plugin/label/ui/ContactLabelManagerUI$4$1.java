package com.tencent.mm.plugin.label.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class ContactLabelManagerUI$4$1
  implements Runnable
{
  ContactLabelManagerUI$4$1(ContactLabelManagerUI.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22586);
    ContactLabelManagerUI.a(this.nIk.nIh, ContactLabelManagerUI.b.nIn);
    if ((this.nIk.nIj) && (ContactLabelManagerUI.c(this.nIk.nIh) != null))
    {
      ContactLabelManagerUI.c(this.nIk.nIh).removeMessages(5002);
      ContactLabelManagerUI.c(this.nIk.nIh).sendEmptyMessageDelayed(5003, 0L);
    }
    AppMethodBeat.o(22586);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.4.1
 * JD-Core Version:    0.6.2
 */