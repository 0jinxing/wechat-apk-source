package com.tencent.mm.performance.wxperformancetool;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MemoryLeakActivity$4
  implements DialogInterface.OnDismissListener
{
  MemoryLeakActivity$4(MemoryLeakActivity paramMemoryLeakActivity)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(76885);
    this.ggs.finish();
    AppMethodBeat.o(76885);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.performance.wxperformancetool.MemoryLeakActivity.4
 * JD-Core Version:    0.6.2
 */