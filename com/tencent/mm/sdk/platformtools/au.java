package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class au
{
  private final String tCs;
  private byte[] xAA;
  private volatile boolean xAB;
  public final boolean xAv;
  private final String xAw;
  public SharedPreferences xAx;
  public final Map<String, Long> xAy;
  public long xAz;

  public au(String paramString, long paramLong)
  {
    AppMethodBeat.i(93585);
    this.xAz = 0L;
    this.xAA = new byte[0];
    this.xAB = false;
    this.tCs = paramString;
    this.xAv = false;
    this.xAw = ("prm_" + this.tCs + "_" + paramLong);
    try
    {
      this.xAx = as.amG(this.xAw);
      this.xAy = new ConcurrentHashMap(20);
      this.xAz = paramLong;
      AppMethodBeat.o(93585);
      return;
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.PeriodRecorder", paramString, "exception happened.", new Object[0]);
        this.xAx = ah.getContext().getSharedPreferences(this.xAw, 4);
      }
    }
  }

  public final void dpe()
  {
    int i = 0;
    AppMethodBeat.i(93586);
    while (true)
    {
      synchronized (this.xAA)
      {
        if (this.xAB)
        {
          AppMethodBeat.o(93586);
          return;
        }
        if ((this.xAx instanceof as))
        {
          String[] arrayOfString = ((as)this.xAx).allKeys();
          if (arrayOfString == null)
          {
            AppMethodBeat.o(93586);
            continue;
          }
          int j = arrayOfString.length;
          if (i >= j)
            break label252;
          String str = arrayOfString[i];
          try
          {
            long l = this.xAx.getLong(str, 0L);
            if (l == 0L)
            {
              i++;
              continue;
            }
            this.xAy.put(str, Long.valueOf(l));
            continue;
          }
          catch (Throwable localThrowable)
          {
            ab.printErrStackTrace("MicroMsg.PeriodRecorder", localThrowable, "exception occurred.", new Object[0]);
            continue;
          }
        }
      }
      Object localObject2 = this.xAx.getAll();
      if (localObject2 == null)
      {
        AppMethodBeat.o(93586);
      }
      else
      {
        Iterator localIterator = ((Map)localObject2).entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (Map.Entry)localIterator.next();
          Object localObject3 = ((Map.Entry)localObject2).getValue();
          if ((localObject3 instanceof Long))
            this.xAy.put(((Map.Entry)localObject2).getKey(), (Long)localObject3);
        }
        label252: this.xAB = true;
        AppMethodBeat.o(93586);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.au
 * JD-Core Version:    0.6.2
 */