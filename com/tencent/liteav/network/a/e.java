package com.tencent.liteav.network.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e
{
  public final String a;
  public final int b;
  public final int c;
  public final long d;

  public e(String paramString, int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(67651);
    this.a = paramString;
    this.b = paramInt1;
    paramInt1 = paramInt2;
    if (paramInt2 < 600)
      paramInt1 = 600;
    this.c = paramInt1;
    this.d = paramLong;
    AppMethodBeat.o(67651);
  }

  public final boolean a()
  {
    if (this.b == 5);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(67652);
    if (this == paramObject)
      AppMethodBeat.o(67652);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (!(paramObject instanceof e)))
      {
        AppMethodBeat.o(67652);
        bool = false;
      }
      else
      {
        paramObject = (e)paramObject;
        if ((this.a.equals(paramObject.a)) && (this.b == paramObject.b) && (this.c == paramObject.c) && (this.d == paramObject.d))
        {
          AppMethodBeat.o(67652);
        }
        else
        {
          AppMethodBeat.o(67652);
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.a.e
 * JD-Core Version:    0.6.2
 */