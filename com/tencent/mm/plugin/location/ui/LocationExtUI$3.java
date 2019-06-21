package com.tencent.mm.plugin.location.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LocationExtUI$3
  implements MenuItem.OnMenuItemClickListener
{
  LocationExtUI$3(LocationExtUI paramLocationExtUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(113433);
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("key_remark_result", LocationExtUI.b(this.nLA));
    paramMenuItem.putExtra("key_tags_result", LocationExtUI.a(this.nLA));
    this.nLA.setResult(-1, paramMenuItem);
    this.nLA.finish();
    AppMethodBeat.o(113433);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.LocationExtUI.3
 * JD-Core Version:    0.6.2
 */