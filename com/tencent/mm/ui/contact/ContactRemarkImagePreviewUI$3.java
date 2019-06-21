package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ContactRemarkImagePreviewUI$3
  implements AdapterView.OnItemClickListener
{
  ContactRemarkImagePreviewUI$3(ContactRemarkImagePreviewUI paramContactRemarkImagePreviewUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(33617);
    if (!this.zlA.mController.isTitleShowing())
    {
      this.zlA.mController.showTitleView();
      AppMethodBeat.o(33617);
    }
    while (true)
    {
      return;
      this.zlA.mController.hideTitleView();
      AppMethodBeat.o(33617);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI.3
 * JD-Core Version:    0.6.2
 */