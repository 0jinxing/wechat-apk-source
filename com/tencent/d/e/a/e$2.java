package com.tencent.d.e.a;

import android.os.Handler;
import com.tencent.d.e.a.a.c;
import com.tencent.d.e.a.a.f;
import com.tencent.d.e.a.a.g;
import com.tencent.d.e.a.a.g.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$2 extends c
{
  e$2(e parame)
  {
  }

  public final void dQt()
  {
    AppMethodBeat.i(114536);
    synchronized (this.Atx)
    {
      if (!e.c(this.Atx))
        AppMethodBeat.o(114536);
      while (true)
      {
        return;
        if (e.g(this.Atx) == null)
        {
          AppMethodBeat.o(114536);
        }
        else
        {
          if (e.g(this.Atx).nA(e.a(this.Atx).Ato))
          {
            long l = e.g(this.Atx).AtN.dQx();
            e.a locala = e.d(this.Atx);
            int i = (int)(e.a(this.Atx).Ato / f.AtG);
            locala.mCount = 1;
            locala.mMaxCount = i;
            locala.AtD = l;
            l = l + f.AtG - System.currentTimeMillis();
            if (l <= 0L)
              break;
            e.e(this.Atx).postDelayed(e.d(this.Atx), l);
          }
          AppMethodBeat.o(114536);
        }
      }
      e.e(this.Atx).post(e.d(this.Atx));
    }
  }

  public final void dQu()
  {
    AppMethodBeat.i(114537);
    if (e.f(this.Atx) != null)
      e.f(this.Atx);
    AppMethodBeat.o(114537);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.e.2
 * JD-Core Version:    0.6.2
 */