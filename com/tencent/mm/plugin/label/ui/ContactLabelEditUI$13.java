package com.tencent.mm.plugin.label.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactLabelEditUI$13
  implements AbsListView.OnScrollListener
{
  ContactLabelEditUI$13(ContactLabelEditUI paramContactLabelEditUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(22554);
    if ((paramInt == 2) || (paramInt == 1))
      this.nHW.aqX();
    AppMethodBeat.o(22554);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelEditUI.13
 * JD-Core Version:    0.6.2
 */