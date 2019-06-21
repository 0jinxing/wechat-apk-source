package com.tencent.mm.plugin.base.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WXEntryActivity$2
  implements DialogInterface.OnCancelListener
{
  WXEntryActivity$2(WXEntryActivity paramWXEntryActivity)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(18191);
    WXEntryActivity.b(this.jEd);
    this.jEd.finish();
    AppMethodBeat.o(18191);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXEntryActivity.2
 * JD-Core Version:    0.6.2
 */