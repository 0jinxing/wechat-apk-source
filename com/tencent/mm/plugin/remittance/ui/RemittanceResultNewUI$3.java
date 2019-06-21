package com.tencent.mm.plugin.remittance.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;

final class RemittanceResultNewUI$3
  implements n.d
{
  RemittanceResultNewUI$3(RemittanceResultNewUI paramRemittanceResultNewUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(45117);
    ClipboardManager localClipboardManager = (ClipboardManager)ah.getContext().getSystemService("clipboard");
    paramMenuItem = "";
    if (bo.gW(RemittanceResultNewUI.c(this.pWO), 2131827031))
      paramMenuItem = RemittanceResultNewUI.d(this.pWO).getText().toString().trim();
    while (!bo.gW(RemittanceResultNewUI.c(this.pWO), 2131827109))
    {
      localClipboardManager.setPrimaryClip(ClipData.newPlainText(null, paramMenuItem));
      h.bQ(this.pWO, this.pWO.getString(2131296876));
      AppMethodBeat.o(45117);
      return;
    }
    paramMenuItem = new StringBuilder();
    paramMenuItem.append(RemittanceResultNewUI.e(this.pWO).getText().toString().trim() + " ");
    String str = RemittanceResultNewUI.b(this.pWO).getText().toString().trim();
    if (str.endsWith(this.pWO.getString(2131296805)))
      paramMenuItem.append(str.substring(0, str.length() - 4));
    while (true)
    {
      paramMenuItem = paramMenuItem.toString();
      break;
      paramMenuItem.append(str);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.3
 * JD-Core Version:    0.6.2
 */