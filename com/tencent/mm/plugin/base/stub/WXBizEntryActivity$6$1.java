package com.tencent.mm.plugin.base.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WXBizEntryActivity$6$1
  implements DialogInterface.OnClickListener
{
  WXBizEntryActivity$6$1(WXBizEntryActivity.6 param6, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(18143);
    WXBizEntryActivity.a(this.jDG.jDz, this.jDF);
    this.jDG.jDz.finish();
    AppMethodBeat.o(18143);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXBizEntryActivity.6.1
 * JD-Core Version:    0.6.2
 */