package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EditSignatureUI$2
  implements MenuItem.OnMenuItemClickListener
{
  EditSignatureUI$2(EditSignatureUI paramEditSignatureUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(126945);
    this.qkL.aqX();
    this.qkL.finish();
    AppMethodBeat.o(126945);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI.2
 * JD-Core Version:    0.6.2
 */