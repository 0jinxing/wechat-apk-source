package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelectContactUI$13
  implements View.OnClickListener
{
  SelectContactUI$13(SelectContactUI paramSelectContactUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33860);
    paramView = new Intent();
    paramView.setClassName(this.zoP, "com.tencent.mm.ui.contact.GroupCardSelectUI");
    paramView.putExtra("group_select_type", false);
    this.zoP.startActivityForResult(paramView, 1);
    AppMethodBeat.o(33860);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.13
 * JD-Core Version:    0.6.2
 */