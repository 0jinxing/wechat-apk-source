package com.tencent.mm.plugin.label.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ai;
import java.util.ArrayList;

final class ContactLabelEditUI$12
  implements Runnable
{
  ContactLabelEditUI$12(ContactLabelEditUI paramContactLabelEditUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22552);
    ArrayList localArrayList = e.bIZ().aoD(ContactLabelEditUI.i(this.nHW));
    if (localArrayList == null)
    {
      ab.w("MicroMsg.Label.ContactLabelEditUI", "result is null");
      AppMethodBeat.o(22552);
      return;
    }
    if (localArrayList != null)
    {
      ContactLabelEditUI.a(this.nHW, localArrayList);
      if (ContactLabelEditUI.j(this.nHW) != null)
        break label121;
      ContactLabelEditUI.b(this.nHW, new ArrayList());
    }
    while (true)
    {
      ContactLabelEditUI.j(this.nHW).addAll(localArrayList);
      if (ContactLabelEditUI.k(this.nHW) != null)
        ContactLabelEditUI.k(this.nHW).sendEmptyMessage(6001);
      AppMethodBeat.o(22552);
      break;
      label121: ContactLabelEditUI.j(this.nHW).clear();
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(22553);
    String str = super.toString() + "|initView";
    AppMethodBeat.o(22553);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelEditUI.12
 * JD-Core Version:    0.6.2
 */