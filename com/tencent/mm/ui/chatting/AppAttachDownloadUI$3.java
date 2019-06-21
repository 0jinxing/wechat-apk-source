package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;

final class AppAttachDownloadUI$3
  implements Runnable
{
  AppAttachDownloadUI$3(AppAttachDownloadUI paramAppAttachDownloadUI, b paramb1, b paramb2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30266);
    long l1 = System.currentTimeMillis();
    long l2 = e.y(this.yGi.field_fileFullPath, this.yGj.field_fileFullPath);
    if (l2 > 0L)
    {
      this.yGj.field_offset = l2;
      if (AppAttachDownloadUI.d(this.yGj))
        this.yGj.field_status = 199L;
    }
    for (boolean bool = am.aUq().a(this.yGj, new String[0]); ; bool = false)
    {
      ab.i("MicroMsg.AppAttachDownloadUI", "summerapp copyAttachFromLocal size[%d], id[%d, %d], ret[%b], new status[%d], take[%d]ms", new Object[] { Long.valueOf(l2), Long.valueOf(this.yGi.field_msgInfoId), Long.valueOf(this.yGj.field_msgInfoId), Boolean.valueOf(bool), Long.valueOf(this.yGj.field_status), Long.valueOf(System.currentTimeMillis() - l1) });
      AppMethodBeat.o(30266);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachDownloadUI.3
 * JD-Core Version:    0.6.2
 */