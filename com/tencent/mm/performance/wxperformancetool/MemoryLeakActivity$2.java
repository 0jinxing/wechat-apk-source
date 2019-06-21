package com.tencent.mm.performance.wxperformancetool;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cf.b;

final class MemoryLeakActivity$2
  implements DialogInterface.OnClickListener
{
  MemoryLeakActivity$2(MemoryLeakActivity paramMemoryLeakActivity, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(76883);
    b.aqz(this.ggt);
    if ((MemoryLeakActivity.b(this.ggs) != null) && (MemoryLeakActivity.b(this.ggs).isShowing()))
      MemoryLeakActivity.b(this.ggs).dismiss();
    this.ggs.finish();
    AppMethodBeat.o(76883);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.performance.wxperformancetool.MemoryLeakActivity.2
 * JD-Core Version:    0.6.2
 */