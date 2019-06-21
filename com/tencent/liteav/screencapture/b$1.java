package com.tencent.liteav.screencapture;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Iterator;

class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66800);
    b.a(this.a);
    while (true)
    {
      b.a locala;
      try
      {
        if (b.b(this.a) == null)
          return;
        int i = ((WindowManager)b.b(this.a).getSystemService("window")).getDefaultDisplay().getRotation();
        if ((i != 0) && (i != 2))
          break label179;
        if (b.c(this.a) != 0)
        {
          TXCLog.d(b.c(), "ORIENTATION_PORTRAIT, mDelegateSet size = " + b.d(this.a).size());
          Iterator localIterator1 = b.d(this.a).iterator();
          if (localIterator1.hasNext())
          {
            locala = (b.a)localIterator1.next();
            if (locala == null)
              continue;
            locala.a(0);
            continue;
          }
        }
      }
      finally
      {
        AppMethodBeat.o(66800);
      }
      b.a(this.a, 0);
      AppMethodBeat.o(66800);
      continue;
      label179: if (b.c(this.a) != 90)
      {
        TXCLog.d(b.c(), "ORIENTATION_LANDSCAPE, mDelegateSet size = " + b.d(this.a).size());
        Iterator localIterator2 = b.d(this.a).iterator();
        while (localIterator2.hasNext())
        {
          locala = (b.a)localIterator2.next();
          if (locala != null)
            locala.a(90);
        }
      }
      b.a(this.a, 90);
      AppMethodBeat.o(66800);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.screencapture.b.1
 * JD-Core Version:    0.6.2
 */