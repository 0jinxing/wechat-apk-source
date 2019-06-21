package com.tencent.mm.ui.base;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class h$13
  implements Runnable
{
  h$13(Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106416);
    ((MMActivity)this.val$context).showVKB();
    AppMethodBeat.o(106416);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.h.13
 * JD-Core Version:    0.6.2
 */