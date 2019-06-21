package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class NewBizInfoMoreInofUI$4
  implements DialogInterface.OnClickListener
{
  NewBizInfoMoreInofUI$4(NewBizInfoMoreInofUI paramNewBizInfoMoreInofUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23899);
    paramDialogInterface = new Intent("android.intent.action.DIAL");
    paramDialogInterface.setFlags(268435456);
    paramDialogInterface.setData(Uri.parse("tel:" + this.kod));
    if (bo.k(this.pqp, paramDialogInterface))
      this.pqp.startActivity(paramDialogInterface);
    AppMethodBeat.o(23899);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMoreInofUI.4
 * JD-Core Version:    0.6.2
 */