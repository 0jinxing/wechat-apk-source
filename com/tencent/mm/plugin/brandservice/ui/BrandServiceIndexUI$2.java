package com.tencent.mm.plugin.brandservice.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BrandServiceIndexUI$2
  implements MenuItem.OnMenuItemClickListener
{
  BrandServiceIndexUI$2(BrandServiceIndexUI paramBrandServiceIndexUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13915);
    this.jLI.finish();
    AppMethodBeat.o(13915);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI.2
 * JD-Core Version:    0.6.2
 */