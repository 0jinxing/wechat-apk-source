package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb, b.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33531);
    switch (b.3.zkC[this.zkA.ordinal()])
    {
    default:
      ab.e("MicroMsg.ChatroomContactEntranceView", "[cpan] unknow type for click. type:%s", new Object[] { this.zkA });
      AppMethodBeat.o(33531);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      paramView = new Intent();
      paramView.setClassName(b.a(this.zkB), "com.tencent.mm.ui.contact.ChatroomContactUI");
      b.a(this.zkB).startActivity(paramView);
      AppMethodBeat.o(33531);
      continue;
      paramView = new Intent();
      d.b(b.a(this.zkB), "label", ".ui.ContactLabelManagerUI", paramView);
      AppMethodBeat.o(33531);
      continue;
      paramView = new Intent();
      d.b(b.a(this.zkB), "ipcall", ".ui.IPCallAddressUI", paramView);
      AppMethodBeat.o(33531);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.b.1
 * JD-Core Version:    0.6.2
 */