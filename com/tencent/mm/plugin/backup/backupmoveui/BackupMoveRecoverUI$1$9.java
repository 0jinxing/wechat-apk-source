package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.aa;

final class BackupMoveRecoverUI$1$9
  implements View.OnClickListener
{
  BackupMoveRecoverUI$1$9(BackupMoveRecoverUI.1 param1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17369);
    paramView = new Intent();
    paramView.putExtra("title", this.jvd.jvc.getString(2131297238));
    paramView.putExtra("rawUrl", this.jvd.jvc.getString(2131305822, new Object[] { aa.dor() }));
    paramView.putExtra("showShare", false);
    paramView.putExtra("neverGetA8Key", true);
    d.b(this.jvd.jvc, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(17369);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI.1.9
 * JD-Core Version:    0.6.2
 */