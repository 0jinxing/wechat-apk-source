package com.tencent.mm.plugin.label.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.af;
import com.tencent.mm.storage.ai;
import java.util.ArrayList;
import java.util.HashMap;

final class ContactLabelManagerUI$4
  implements Runnable
{
  ContactLabelManagerUI$4(ContactLabelManagerUI paramContactLabelManagerUI, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22588);
    ContactLabelManagerUI.a(this.nIh, e.bIZ().dsn());
    if ((ContactLabelManagerUI.g(this.nIh) == null) || (ContactLabelManagerUI.g(this.nIh).size() <= 0))
    {
      ab.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[updateData] Empty");
      if (ContactLabelManagerUI.h(this.nIh))
      {
        h.pYm.e(11346, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
        ContactLabelManagerUI.i(this.nIh);
      }
      al.d(new ContactLabelManagerUI.4.1(this));
      AppMethodBeat.o(22588);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[updateData] Normal");
      if (ContactLabelManagerUI.h(this.nIh))
      {
        h.pYm.e(11346, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
        ContactLabelManagerUI.i(this.nIh);
      }
      if ((ContactLabelManagerUI.g(this.nIh) != null) && (ContactLabelManagerUI.g(this.nIh).size() > 0))
      {
        int i = ContactLabelManagerUI.g(this.nIh).size();
        e.bIZ().ahw();
        int j = 0;
        if (j < i)
        {
          int k = ((af)ContactLabelManagerUI.g(this.nIh).get(j)).field_labelID;
          ArrayList localArrayList = e.bIZ().aoD(String.valueOf(k));
          if ((localArrayList != null) && (localArrayList.size() > 0))
            ContactLabelManagerUI.j(this.nIh).put(Integer.valueOf(k), Integer.valueOf(localArrayList.size()));
          while (true)
          {
            j++;
            break;
            ContactLabelManagerUI.j(this.nIh).put(Integer.valueOf(k), Integer.valueOf(0));
          }
        }
      }
      al.d(new ContactLabelManagerUI.4.2(this));
      AppMethodBeat.o(22588);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(22589);
    String str = super.toString() + "|updateData";
    AppMethodBeat.o(22589);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.4
 * JD-Core Version:    0.6.2
 */