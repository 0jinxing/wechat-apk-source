package com.tencent.liteav.network;

import com.tencent.liteav.basic.g.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

class TXCStreamUploader$2 extends Thread
{
  TXCStreamUploader$2(TXCStreamUploader paramTXCStreamUploader, String paramString1, boolean paramBoolean, String paramString2)
  {
    super(paramString1);
  }

  public void run()
  {
    AppMethodBeat.i(67543);
    while (TXCStreamUploader.access$400(this.c) != 0L)
      try
      {
        sleep(100L, 0);
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    TXCStreamUploader.access$500(this.c).b();
    TXCStreamUploader.access$500(this.c).a(TXCStreamUploader.access$600(this.c).m);
    TXCStreamUploader.access$500(this.c).a(TXCStreamUploader.access$700(this.c));
    TXCStreamUploader.access$500(this.c).a(this.a, TXCStreamUploader.access$800(this.c, this.b));
    label553: label563: label958: 
    while (true)
    {
      synchronized (TXCStreamUploader.access$900(this.c))
      {
        TXCStreamUploader.access$1002(this.c, this.a);
        int i;
        if (TXCStreamUploader.access$600(this.c).m)
        {
          if (TXCStreamUploader.access$1000(this.c))
          {
            i = 3;
            if (!TXCStreamUploader.access$1100(this.c))
            {
              if (TXCStreamUploader.access$1200(this.c) != null)
              {
                j = i;
                if (TXCStreamUploader.access$1200(this.c).size() != 0);
              }
              else
              {
                j = 1;
              }
              this.c.setStatusValue(7020, Long.valueOf(j));
              TXCStreamUploader.access$402(this.c, TXCStreamUploader.access$1400(this.c, TXCStreamUploader.access$700(this.c), this.b, this.a, TXCStreamUploader.access$600(this.c).e, TXCStreamUploader.access$600(this.c).d, TXCStreamUploader.access$600(this.c).a, TXCStreamUploader.access$600(this.c).c, TXCStreamUploader.access$600(this.c).h, 16, j, TXCStreamUploader.access$600(this.c).n, TXCStreamUploader.access$600(this.c).o));
              if (TXCStreamUploader.access$400(this.c) == 0L)
                break label563;
              TXCStreamUploader.access$1500(this.c, TXCStreamUploader.access$400(this.c), TXCStreamUploader.access$600(this.c).j, TXCStreamUploader.access$600(this.c).h, TXCStreamUploader.access$600(this.c).i);
              i = 0;
              Iterator localIterator = TXCStreamUploader.access$1600(this.c).iterator();
              if (!localIterator.hasNext())
                break label553;
              b localb = (b)localIterator.next();
              if ((i != 0) || (localb.b != 0))
                break label958;
              i = 1;
              if (i != 0)
              {
                if (TXCStreamUploader.access$1700(this.c) == 0L)
                  TXCStreamUploader.access$1702(this.c, localb.h - 3600000L);
                TXCStreamUploader.access$1800(this.c, TXCStreamUploader.access$400(this.c), localb.a, localb.b, localb.e, localb.g - TXCStreamUploader.access$1700(this.c), localb.h - TXCStreamUploader.access$1700(this.c));
              }
              continue;
            }
          }
          else
          {
            i = 2;
            continue;
          }
        }
        else
        {
          i = 1;
          continue;
        }
        int j = i;
        if (!TXCStreamUploader.access$1300(this.c))
          continue;
        TXCStreamUploader.access$600(this.c).n = false;
        j = i;
      }
      TXCStreamUploader.access$1600(this.c).removeAllElements();
      if (TXCStreamUploader.access$1100(this.c));
      synchronized (TXCStreamUploader.access$1900(this.c))
      {
        TXCStreamUploader.access$2002(this.c, TXCStreamUploader.access$2200(this.c, TXCStreamUploader.access$2100(this.c).a, TXCStreamUploader.access$2100(this.c).b, TXCStreamUploader.access$2100(this.c).c, TXCStreamUploader.access$2100(this.c).d, TXCStreamUploader.access$2100(this.c).e, TXCStreamUploader.access$2100(this.c).f, TXCStreamUploader.access$2100(this.c).g, TXCStreamUploader.access$2100(this.c).h, TXCStreamUploader.access$2100(this.c).i, TXCStreamUploader.access$2100(this.c).j));
        synchronized (TXCStreamUploader.access$2300(this.c))
        {
          TXCStreamUploader.access$2402(this.c, TXCStreamUploader.access$2500(this.c, TXCStreamUploader.access$2000(this.c), TXCStreamUploader.access$400(this.c)));
          TXCStreamUploader.access$2600(this.c, TXCStreamUploader.access$400(this.c));
          if (TXCStreamUploader.access$1100(this.c))
            synchronized (TXCStreamUploader.access$2300(this.c))
            {
              TXCStreamUploader.access$2700(this.c, TXCStreamUploader.access$2400(this.c));
              TXCStreamUploader.access$2800(this.c, TXCStreamUploader.access$2400(this.c));
              TXCStreamUploader.access$2402(this.c, 0L);
              synchronized (TXCStreamUploader.access$1900(this.c))
              {
                TXCStreamUploader.access$2900(this.c, TXCStreamUploader.access$2000(this.c));
                TXCStreamUploader.access$2002(this.c, 0L);
              }
            }
        }
      }
      synchronized (TXCStreamUploader.access$900(this.c))
      {
        TXCStreamUploader.access$3000(this.c, TXCStreamUploader.access$400(this.c));
        TXCStreamUploader.access$402(this.c, 0L);
        AppMethodBeat.o(67543);
        return;
        localObject7 = finally;
        AppMethodBeat.o(67543);
        throw localObject7;
        localObject8 = finally;
        AppMethodBeat.o(67543);
        throw localObject8;
        localObject2 = finally;
        AppMethodBeat.o(67543);
        throw localObject2;
        localObject3 = finally;
        AppMethodBeat.o(67543);
        throw localObject3;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.TXCStreamUploader.2
 * JD-Core Version:    0.6.2
 */