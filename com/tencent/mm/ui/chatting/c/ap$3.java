package com.tencent.mm.ui.chatting.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.bi;

final class ap$3
  implements DialogInterface.OnClickListener
{
  ap$3(ap paramap, bi parambi, MenuItem paramMenuItem, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31828);
    ap localap = this.ySY;
    bi localbi = this.fku;
    this.aaR.getGroupId();
    if (this.yTa == 125);
    for (boolean bool = true; ; bool = false)
    {
      ap.a(localap, localbi, bool);
      paramDialogInterface.dismiss();
      AppMethodBeat.o(31828);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ap.3
 * JD-Core Version:    0.6.2
 */