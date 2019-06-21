package com.tencent.mm.plugin.label.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactLabelMemberListUI$5
  implements AdapterView.OnItemClickListener
{
  ContactLabelMemberListUI$5(ContactLabelMemberListUI paramContactLabelMemberListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(22643);
    ContactLabelMemberListUI.a(this.nIz, paramInt);
    AppMethodBeat.o(22643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelMemberListUI.5
 * JD-Core Version:    0.6.2
 */