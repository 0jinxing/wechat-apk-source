package com.tencent.mm.plugin.base.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WXBizEntryActivity$4$1
  implements DialogInterface.OnClickListener
{
  WXBizEntryActivity$4$1(WXBizEntryActivity.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(18139);
    WXBizEntryActivity.b(this.jDB.jDz);
    this.jDB.jDz.finish();
    AppMethodBeat.o(18139);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXBizEntryActivity.4.1
 * JD-Core Version:    0.6.2
 */