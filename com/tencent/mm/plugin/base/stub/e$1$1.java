package com.tencent.mm.plugin.base.stub;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1$1
  implements Runnable
{
  e$1$1(e.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18157);
    this.jDK.val$activity.finish();
    AppMethodBeat.o(18157);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.e.1.1
 * JD-Core Version:    0.6.2
 */