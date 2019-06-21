package com.tencent.mm.plugin.base.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ciq;

final class WXBizEntryActivity$5$1
  implements DialogInterface.OnClickListener
{
  WXBizEntryActivity$5$1(WXBizEntryActivity.5 param5, ciq paramciq)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(18141);
    WXBizEntryActivity.a(this.jDE.jDz, this.jDE.jDC, this.jDD.xhy);
    this.jDE.jDz.finish();
    AppMethodBeat.o(18141);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXBizEntryActivity.5.1
 * JD-Core Version:    0.6.2
 */