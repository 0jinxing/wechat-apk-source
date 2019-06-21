package com.tencent.mm.plugin.label.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.b.a;

final class ContactLabelManagerUI$12
  implements AdapterView.OnItemLongClickListener
{
  ContactLabelManagerUI$12(ContactLabelManagerUI paramContactLabelManagerUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(22597);
    ContactLabelManagerUI.f(this.nIh).a(paramView, paramInt, paramLong, this.nIh, this.nIh, ContactLabelManagerUI.d(this.nIh), ContactLabelManagerUI.e(this.nIh));
    AppMethodBeat.o(22597);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.12
 * JD-Core Version:    0.6.2
 */