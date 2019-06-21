package com.tencent.mm.plugin.normsg.b;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2
  implements Runnable
{
  b$2(b paramb, boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10390);
    this.oUF[0] = b.b(this.oUG, this.cgR, this.oUC, this.oUD);
    synchronized (this.oUF)
    {
      this.oUF[1] = true;
      this.oUF.notifyAll();
      AppMethodBeat.o(10390);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.b.2
 * JD-Core Version:    0.6.2
 */