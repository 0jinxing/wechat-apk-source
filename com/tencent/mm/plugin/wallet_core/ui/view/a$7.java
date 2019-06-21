package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class a$7
  implements Runnable
{
  a$7(Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47860);
    ((MMActivity)this.val$context).showVKB();
    AppMethodBeat.o(47860);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.a.7
 * JD-Core Version:    0.6.2
 */