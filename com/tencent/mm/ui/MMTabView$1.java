package com.tencent.mm.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMTabView$1
  implements Runnable
{
  MMTabView$1(MMTabView paramMMTabView, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106109);
    MMTabView.a(this.ynC).setText(this.ynB);
    this.ynC.dyw();
    AppMethodBeat.o(106109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMTabView.1
 * JD-Core Version:    0.6.2
 */