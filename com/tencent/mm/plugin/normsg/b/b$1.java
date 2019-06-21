package com.tencent.mm.plugin.normsg.b;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class b$1
  implements Runnable
{
  b$1(b paramb, int paramInt, View paramView, List paramList, boolean[] paramArrayOfBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10389);
    b.b(this.oUG, this.oUC, this.oUD, this.oUE);
    synchronized (this.oUF)
    {
      this.oUF[0] = true;
      this.oUF.notifyAll();
      AppMethodBeat.o(10389);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.b.1
 * JD-Core Version:    0.6.2
 */