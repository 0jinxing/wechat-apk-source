package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;

class ma$c extends ma.b
{
  private final PrintStream a;

  ma$c(PrintStream paramPrintStream)
  {
    super(null);
    this.a = paramPrintStream;
  }

  Object a()
  {
    return this.a;
  }

  void a(Object paramObject)
  {
    AppMethodBeat.i(100491);
    this.a.println(paramObject);
    AppMethodBeat.o(100491);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ma.c
 * JD-Core Version:    0.6.2
 */