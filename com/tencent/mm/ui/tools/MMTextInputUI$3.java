package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMTextInputUI$3
  implements MenuItem.OnMenuItemClickListener
{
  MMTextInputUI$3(MMTextInputUI paramMMTextInputUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(107726);
    this.zGf.I(MMTextInputUI.b(this.zGf).getText());
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("key_result", MMTextInputUI.b(this.zGf).getText());
    this.zGf.setResult(-1, paramMenuItem);
    this.zGf.finish();
    AppMethodBeat.o(107726);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMTextInputUI.3
 * JD-Core Version:    0.6.2
 */