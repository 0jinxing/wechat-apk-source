package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

final class MobileFriendUI$5
  implements DialogInterface.OnClickListener
{
  MobileFriendUI$5(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13723);
    h.pYm.e(11438, new Object[] { Integer.valueOf(6) });
    ab.i("MicroMsg.MobileFriendUI", "[cpan] kv report logid:%d scene:%d", new Object[] { Integer.valueOf(11438), Integer.valueOf(6) });
    g.RP().Ry().set(12322, Boolean.TRUE);
    ((a)g.M(a.class)).syncUploadMContactStatus(true, true);
    MobileFriendUI.h(this.gtZ);
    AppMethodBeat.o(13723);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.5
 * JD-Core Version:    0.6.2
 */