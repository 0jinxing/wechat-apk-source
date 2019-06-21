package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class mc extends RuntimeException
{
  public mc(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }

  public mc(Throwable paramThrowable)
  {
    super(paramThrowable.getMessage(), paramThrowable);
    AppMethodBeat.i(100503);
    AppMethodBeat.o(100503);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.mc
 * JD-Core Version:    0.6.2
 */