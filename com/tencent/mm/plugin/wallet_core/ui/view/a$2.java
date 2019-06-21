package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class a$2
  implements Runnable
{
  a$2(Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47854);
    ((MMActivity)this.val$context).showVKB();
    AppMethodBeat.o(47854);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.a.2
 * JD-Core Version:    0.6.2
 */