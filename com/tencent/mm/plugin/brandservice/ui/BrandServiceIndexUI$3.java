package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class BrandServiceIndexUI$3
  implements MenuItem.OnMenuItemClickListener
{
  BrandServiceIndexUI$3(BrandServiceIndexUI paramBrandServiceIndexUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13916);
    ab.v("MicroMsg.BrandService.BrandServiceIndexUI", "search btn was clicked.");
    paramMenuItem = new Intent(this.jLI, BrandServiceLocalSearchUI.class);
    paramMenuItem.putExtra("is_return_result", BrandServiceIndexUI.a(this.jLI));
    paramMenuItem.addFlags(67108864);
    this.jLI.startActivityForResult(paramMenuItem, 1);
    AppMethodBeat.o(13916);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI.3
 * JD-Core Version:    0.6.2
 */