package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class md extends RuntimeException
{
  public md(Throwable paramThrowable)
  {
    super(paramThrowable.getMessage(), paramThrowable);
    AppMethodBeat.i(100504);
    AppMethodBeat.o(100504);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.md
 * JD-Core Version:    0.6.2
 */