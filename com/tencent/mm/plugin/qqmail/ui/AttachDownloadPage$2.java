package com.tencent.mm.plugin.qqmail.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class AttachDownloadPage$2
  implements MenuItem.OnMenuItemClickListener
{
  AttachDownloadPage$2(AttachDownloadPage paramAttachDownloadPage)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(68132);
    AttachDownloadPage localAttachDownloadPage = this.pwb;
    String str = this.pwb.getString(2131301955);
    paramMenuItem = new AttachDownloadPage.2.1(this);
    h.a(localAttachDownloadPage, "", new String[] { str }, "", false, paramMenuItem);
    AppMethodBeat.o(68132);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage.2
 * JD-Core Version:    0.6.2
 */