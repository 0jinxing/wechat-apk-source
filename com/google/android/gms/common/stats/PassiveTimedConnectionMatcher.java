package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.f.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PassiveTimedConnectionMatcher
{
  private final long zzym;
  private final int zzyn;
  private final m<String, Long> zzyo;

  public PassiveTimedConnectionMatcher()
  {
    AppMethodBeat.i(89961);
    this.zzym = 60000L;
    this.zzyn = 10;
    this.zzyo = new m(10);
    AppMethodBeat.o(89961);
  }

  public PassiveTimedConnectionMatcher(int paramInt, long paramLong)
  {
    AppMethodBeat.i(89962);
    this.zzym = paramLong;
    this.zzyn = paramInt;
    this.zzyo = new m();
    AppMethodBeat.o(89962);
  }

  public Long get(String paramString)
  {
    AppMethodBeat.i(89963);
    try
    {
      paramString = (Long)this.zzyo.get(paramString);
      return paramString;
    }
    finally
    {
      AppMethodBeat.o(89963);
    }
    throw paramString;
  }

  public Long put(String paramString)
  {
    AppMethodBeat.i(89964);
    long l1 = SystemClock.elapsedRealtime();
    long l2 = this.zzym;
    try
    {
      while (this.zzyo.size() >= this.zzyn)
      {
        for (int i = this.zzyo.size() - 1; i >= 0; i--)
          if (l1 - ((Long)this.zzyo.valueAt(i)).longValue() > l2)
            this.zzyo.removeAt(i);
        l2 /= 2L;
        i = this.zzyn;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(94);
        localStringBuilder.append("The max capacity ").append(i).append(" is not enough. Current durationThreshold is: ").append(l2);
      }
      paramString = (Long)this.zzyo.put(paramString, Long.valueOf(l1));
      return paramString;
    }
    finally
    {
      AppMethodBeat.o(89964);
    }
    throw paramString;
  }

  public boolean remove(String paramString)
  {
    AppMethodBeat.i(89965);
    try
    {
      if (this.zzyo.remove(paramString) != null);
      for (boolean bool = true; ; bool = false)
        return bool;
    }
    finally
    {
      AppMethodBeat.o(89965);
    }
    throw paramString;
  }

  public boolean removeByPrefix(String paramString)
  {
    AppMethodBeat.i(89966);
    int i = 0;
    boolean bool = false;
    while (true)
      try
      {
        if (i < size())
        {
          String str = (String)this.zzyo.keyAt(i);
          if ((str != null) && (str.startsWith(paramString)))
          {
            this.zzyo.remove(str);
            bool = true;
            i++;
          }
        }
        else
        {
          return bool;
        }
      }
      finally
      {
        AppMethodBeat.o(89966);
      }
  }

  public int size()
  {
    AppMethodBeat.i(89967);
    try
    {
      int i = this.zzyo.size();
      return i;
    }
    finally
    {
      AppMethodBeat.o(89967);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.PassiveTimedConnectionMatcher
 * JD-Core Version:    0.6.2
 */