package com.tencent.mm.plugin.label.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.ui.widget.MMLabelPanel;
import com.tencent.mm.sdk.platformtools.bo;

final class ContactLabelUI$9
  implements AdapterView.OnItemClickListener
{
  ContactLabelUI$9(ContactLabelUI paramContactLabelUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(22673);
    if (ContactLabelUI.f(this.nIU) == null)
      AppMethodBeat.o(22673);
    while (true)
    {
      return;
      paramAdapterView = ContactLabelUI.f(this.nIU).getItem(paramInt);
      if ((!bo.isNullOrNil(paramAdapterView)) && (ContactLabelUI.b(this.nIU) != null))
      {
        ContactLabelUI.b(this.nIU).dAb();
        ContactLabelUI.b(this.nIU).cc(paramAdapterView, true);
        ContactLabelUI.c(this.nIU).cd(paramAdapterView, true);
      }
      AppMethodBeat.o(22673);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelUI.9
 * JD-Core Version:    0.6.2
 */