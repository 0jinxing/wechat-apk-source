package com.tencent.mm.plugin.product.ui;

import android.content.res.Resources;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class MallGalleryUI$4
  implements MenuItem.OnMenuItemClickListener
{
  MallGalleryUI$4(MallGalleryUI paramMallGalleryUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44039);
    if (d.afj("favorite"));
    for (paramMenuItem = this.piy.getResources().getStringArray(2131755033); ; paramMenuItem = this.piy.getResources().getStringArray(2131755034))
    {
      h.a(this.piy.mController.ylL, null, paramMenuItem, null, false, new MallGalleryUI.4.1(this));
      AppMethodBeat.o(44039);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallGalleryUI.4
 * JD-Core Version:    0.6.2
 */