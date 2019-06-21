package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class cx$c extends cx.a
{
  private cx.d a;

  public cx$c(cx paramcx, cx.d paramd)
  {
    super(paramcx, (byte)0);
    this.a = paramd;
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(98683);
    cx.b(this.b, false);
    cx.a(this.b, SystemClock.elapsedRealtime());
    int j;
    if (this.a.d)
    {
      if (cx.j(this.b) > 0)
        cx.b(this.b, 10);
      this.b.a.addAndGet(cx.d.a(this.a));
      if (!this.a.b)
      {
        j = this.a.e.size();
        ArrayList localArrayList = new ArrayList();
        for (i = 0; i < j; i++)
          localArrayList.add(Long.valueOf(((dh.a)this.a.e.get(i)).a));
        dh.a(this.b.b()).a(localArrayList);
        if (cx.k(this.b))
        {
          cx.c(this.b, false);
          cx.b(this.b, true, this.a.c);
          AppMethodBeat.o(98683);
        }
      }
    }
    while (true)
    {
      return;
      if (!this.a.a)
      {
        SystemClock.sleep(200L);
        cx.b(this.b, this.a.b, this.a.c);
        AppMethodBeat.o(98683);
      }
      else
      {
        cx.a(this.b, true);
        AppMethodBeat.o(98683);
        continue;
        if (ce.h())
        {
          if (cx.j(this.b) <= 0)
            break label390;
          j = ce.a.a("report_interval_forbid_limit", 30, 1440, 60);
          if (cx.j(this.b) < j)
            cx.c(this.b, 2);
        }
        while ((this.a.c) && (this.a.b))
        {
          j = this.a.e.size();
          while (i < j)
          {
            dh.a(this.b.b()).b(((dh.a)this.a.e.get(i)).b);
            i++;
          }
          label390: cx.d(this.b, 5);
        }
        AppMethodBeat.o(98683);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cx.c
 * JD-Core Version:    0.6.2
 */