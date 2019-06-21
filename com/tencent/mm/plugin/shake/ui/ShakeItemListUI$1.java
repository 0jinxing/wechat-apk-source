package com.tencent.mm.plugin.shake.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.shake.b.e;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.plugin.shake.d.a.i.1;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.h;

final class ShakeItemListUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ShakeItemListUI$1(ShakeItemListUI paramShakeItemListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24720);
    h.a(this.quC, true, this.quC.getString(2131302715), "", this.quC.getString(2131296871), this.quC.getString(2131296868), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(24719);
        switch (ShakeItemListUI.a(ShakeItemListUI.1.this.quC))
        {
        default:
        case 100:
        case -1:
        case 0:
        case -5:
        case 4:
        case -6:
        case 5:
        case -12:
        case 11:
        }
        while (true)
        {
          ShakeItemListUI.b(ShakeItemListUI.1.this.quC).KC();
          ShakeItemListUI.c(ShakeItemListUI.1.this.quC).setVisibility(8);
          paramAnonymousDialogInterface = (TextView)ShakeItemListUI.1.this.quC.findViewById(2131826297);
          paramAnonymousDialogInterface.setText(ShakeItemListUI.CC(ShakeItemListUI.a(ShakeItemListUI.1.this.quC)));
          paramAnonymousDialogInterface.setVisibility(0);
          ShakeItemListUI.1.this.quC.enableOptionMenu(false);
          AppMethodBeat.o(24719);
          return;
          m.cjS().Cu(0);
          m.cjS().cjH();
          continue;
          m.cjS().Cu(0);
          continue;
          aw.RS().aa(new i.1());
          m.cjS().Cu(4);
          continue;
          m.cjS().Cu(7);
          m.cjS().Cu(6);
          m.cjS().Cu(8);
          m.cjS().Cu(9);
          m.cjS().Cu(10);
          m.cjS().Cu(12);
          continue;
          m.cjS().Cu(11);
        }
      }
    }
    , null);
    AppMethodBeat.o(24720);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeItemListUI.1
 * JD-Core Version:    0.6.2
 */