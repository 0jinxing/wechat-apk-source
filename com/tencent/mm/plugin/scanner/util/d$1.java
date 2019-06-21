package com.tencent.mm.plugin.scanner.util;

import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class d$1
  implements Runnable
{
  d$1(d paramd, byte[] paramArrayOfByte, Point paramPoint)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81380);
    if (d.a(this.qhv, this.val$data, this.qhu))
    {
      al.d(new d.1.1(this));
      AppMethodBeat.o(81380);
    }
    while (true)
    {
      return;
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(81379);
          if (d.1.this.qhv.qhj != null)
            d.1.this.qhv.qhj.jJ(d.1.this.qhv.qhn);
          AppMethodBeat.o(81379);
        }
      });
      AppMethodBeat.o(81380);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.d.1
 * JD-Core Version:    0.6.2
 */