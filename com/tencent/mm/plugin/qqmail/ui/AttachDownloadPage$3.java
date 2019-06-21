package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.plugin.qqmail.b.v;

final class AttachDownloadPage$3
  implements View.OnClickListener
{
  AttachDownloadPage$3(AttachDownloadPage paramAttachDownloadPage)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(68133);
    AttachDownloadPage.a(this.pwb, 2);
    ac.ccC().cancel(AttachDownloadPage.b(this.pwb));
    AttachDownloadPage.c(this.pwb);
    AttachDownloadPage.d(this.pwb);
    AppMethodBeat.o(68133);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage.3
 * JD-Core Version:    0.6.2
 */