package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class SelectContactUI$14
  implements View.OnClickListener
{
  SelectContactUI$14(SelectContactUI paramSelectContactUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33861);
    paramView = new Intent();
    paramView.putExtra("list_attr", 16384);
    d.b(this.zoP, "brandservice", ".ui.BrandServiceIndexUI", paramView, 2);
    AppMethodBeat.o(33861);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.14
 * JD-Core Version:    0.6.2
 */