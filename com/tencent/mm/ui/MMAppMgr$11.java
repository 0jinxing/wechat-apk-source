package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.z;

final class MMAppMgr$11
  implements DialogInterface.OnClickListener
{
  MMAppMgr$11(int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29559);
    aw.ZK();
    c.Ry().set(65, Integer.valueOf(this.fJG + 1));
    AppMethodBeat.o(29559);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.11
 * JD-Core Version:    0.6.2
 */