package com.tencent.mm.pluginsdk.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BioHelperUI$1
  implements MenuItem.OnMenuItemClickListener
{
  BioHelperUI$1(BioHelperUI paramBioHelperUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(125667);
    this.vgV.finish();
    AppMethodBeat.o(125667);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.BioHelperUI.1
 * JD-Core Version:    0.6.2
 */