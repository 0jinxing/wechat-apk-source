package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CompressPreviewUI$4
  implements MenuItem.OnMenuItemClickListener
{
  CompressPreviewUI$4(CompressPreviewUI paramCompressPreviewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(68241);
    paramMenuItem = new Intent(this.pxt, AttachDownloadPage.class);
    paramMenuItem.putExtra("attach_name", CompressPreviewUI.e(this.pxt));
    paramMenuItem.putExtra("mail_id", CompressPreviewUI.b(this.pxt));
    paramMenuItem.putExtra("attach_id", CompressPreviewUI.f(this.pxt));
    paramMenuItem.putExtra("total_size", CompressPreviewUI.g(this.pxt));
    paramMenuItem.putExtra("is_preview", 0);
    paramMenuItem.putExtra("is_compress", true);
    this.pxt.startActivity(paramMenuItem);
    AppMethodBeat.o(68241);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI.4
 * JD-Core Version:    0.6.2
 */