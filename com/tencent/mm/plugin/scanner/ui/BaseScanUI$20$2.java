package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.base.model.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI;
import com.tencent.mm.ui.base.n.d;

final class BaseScanUI$20$2
  implements n.d
{
  BaseScanUI$20$2(BaseScanUI.20 param20)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(138477);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(138477);
      while (true)
      {
        return;
        BaseScanUI localBaseScanUI = this.qca.qbV;
        paramMenuItem = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        paramMenuItem.putExtra("android.intent.extra.shortcut.NAME", localBaseScanUI.getString(2131299813));
        paramMenuItem.putExtra("duplicate", false);
        Intent localIntent = new Intent("com.tencent.mm.action.BIZSHORTCUT");
        localIntent.putExtra("LauncherUI.From.Scaner.Shortcut", true);
        localIntent.addFlags(67108864);
        paramMenuItem.putExtra("android.intent.extra.shortcut.INTENT", localIntent);
        paramMenuItem.putExtra("shortcut_is_adaptive_icon", true);
        paramMenuItem.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(localBaseScanUI, 2130840076));
        paramMenuItem.putExtra("shortcut_icon_resource_id", 2130840076);
        b.q(localBaseScanUI, paramMenuItem);
        h.pYm.e(11410, new Object[0]);
        AppMethodBeat.o(138477);
        continue;
        if (this.qca.qbZ == null)
          break;
        this.qca.qbZ.onClick(null);
        AppMethodBeat.o(138477);
      }
      paramMenuItem = new Intent();
      paramMenuItem.setClass(this.qca.qbV, ScannerHistoryUI.class);
      this.qca.qbV.startActivity(paramMenuItem);
      h.pYm.e(12684, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.20.2
 * JD-Core Version:    0.6.2
 */