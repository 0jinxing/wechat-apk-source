package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a.a;
import com.tencent.mm.storage.z;

final class MobileFriendUI$6
  implements DialogInterface.OnClickListener
{
  MobileFriendUI$6(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13724);
    g.RP().Ry().set(12322, Boolean.FALSE);
    ((a)g.M(a.class)).syncUploadMContactStatus(false, true);
    this.gtZ.finish();
    AppMethodBeat.o(13724);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.6
 * JD-Core Version:    0.6.2
 */