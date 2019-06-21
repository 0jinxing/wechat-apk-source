package com.tencent.mm.ui.base;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMCollapsibleTextView$2
  implements Runnable
{
  MMCollapsibleTextView$2(MMCollapsibleTextView paramMMCollapsibleTextView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106519);
    MMCollapsibleTextView.d(this.ytY).setMaxLines(10);
    MMCollapsibleTextView.e(this.ytY).setVisibility(0);
    MMCollapsibleTextView.e(this.ytY).setText(MMCollapsibleTextView.f(this.ytY));
    AppMethodBeat.o(106519);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMCollapsibleTextView.2
 * JD-Core Version:    0.6.2
 */