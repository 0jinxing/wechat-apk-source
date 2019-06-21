package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.d;

final class p$8
  implements Runnable
{
  p$8(p paramp, byte[] paramArrayOfByte, Point paramPoint, int paramInt, Rect paramRect)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81211);
    Object localObject1 = ((d)this.qfp.cgO()).a(this.val$data, this.qft, this.hHn, this.qfu, this.qfp.qfk);
    if (localObject1 != null);
    while (true)
    {
      synchronized (this.qfp.cli)
      {
        if ((this.qfp.qfj == null) || (this.qfp.qfl < localObject1.length))
        {
          this.qfp.qfj = new byte[localObject1.length];
          this.qfp.qfl = localObject1.length;
        }
        System.arraycopy(localObject1, 0, this.qfp.qfj, 0, localObject1.length);
        localObject1 = this.qfp;
        ((p)localObject1).bufferSize += 1;
        p.b(this.qfp);
        AppMethodBeat.o(81211);
        return;
      }
      AppMethodBeat.o(81211);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.p.8
 * JD-Core Version:    0.6.2
 */