package com.tencent.mm.plugin.ipcall.ui;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class IPCallDynamicTextView$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  IPCallDynamicTextView$2(IPCallDynamicTextView paramIPCallDynamicTextView)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(22143);
    if (IPCallDynamicTextView.b(this.nCD) != IPCallDynamicTextView.c(this.nCD))
      IPCallDynamicTextView.e(this.nCD).sendEmptyMessage(1);
    AppMethodBeat.o(22143);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView.2
 * JD-Core Version:    0.6.2
 */