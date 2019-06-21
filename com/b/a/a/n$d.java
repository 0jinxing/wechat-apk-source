package com.b.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class n$d
{
  private String bFr;
  private long bFs;
  private String bFt;
  private long bFu;

  static boolean o(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(55682);
    boolean bool;
    if (Math.abs(paramLong1 - paramLong2) <= 10000L)
    {
      bool = true;
      AppMethodBeat.o(55682);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(55682);
    }
  }

  final String c(String paramString, long paramLong, boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(55681);
      Object localObject;
      if (paramBoolean)
      {
        localObject = paramString;
        if (this.bFr != null)
        {
          localObject = paramString;
          if (o(paramLong, this.bFs))
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>(String.valueOf(paramString));
            localObject = this.bFr;
            this.bFr = null;
          }
        }
        paramString = (String)localObject;
        if (this.bFt != null)
        {
          paramString = (String)localObject;
          if (o(paramLong, this.bFu))
          {
            paramString = new java/lang/StringBuilder;
            paramString.<init>(String.valueOf(localObject));
            paramString = this.bFt;
            this.bFt = null;
          }
        }
      }
      while (true)
      {
        AppMethodBeat.o(55681);
        return paramString;
        localObject = paramString;
        if (this.bFr != null)
        {
          localObject = paramString;
          if (o(paramLong, this.bFs))
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>(String.valueOf(paramString));
            localObject = v.bu(this.bFr);
            this.bFr = null;
          }
        }
        paramString = (String)localObject;
        if (this.bFt != null)
        {
          paramString = (String)localObject;
          if (o(paramLong, this.bFu))
          {
            paramString = new java/lang/StringBuilder;
            paramString.<init>(String.valueOf(localObject));
            paramString = v.bt(this.bFt);
            this.bFt = null;
          }
        }
      }
    }
    finally
    {
    }
    throw paramString;
  }

  final void d(String paramString, long paramLong)
  {
    try
    {
      this.bFr = paramString;
      this.bFs = paramLong;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  final void e(String paramString, long paramLong)
  {
    try
    {
      this.bFt = paramString;
      this.bFu = paramLong;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  final void reset()
  {
    try
    {
      this.bFr = null;
      this.bFt = null;
      this.bFs = 0L;
      this.bFu = 0L;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.b.a.a.n.d
 * JD-Core Version:    0.6.2
 */