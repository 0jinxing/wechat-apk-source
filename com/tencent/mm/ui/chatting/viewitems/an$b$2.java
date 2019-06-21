package com.tencent.mm.ui.chatting.viewitems;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.ag;

final class an$b$2
  implements DialogInterface.OnClickListener
{
  an$b$2(an.b paramb, ag paramag, bi parambi, MenuItem paramMenuItem)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(33366);
    this.zhx.dFj();
    this.zhx.a(this.fku, true, this.aaR.getGroupId(), 0);
    AppMethodBeat.o(33366);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.an.b.2
 * JD-Core Version:    0.6.2
 */