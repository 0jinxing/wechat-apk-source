package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintWriter;

class ma$d extends ma.b
{
  private final PrintWriter a;

  ma$d(PrintWriter paramPrintWriter)
  {
    super(null);
    this.a = paramPrintWriter;
  }

  Object a()
  {
    return this.a;
  }

  void a(Object paramObject)
  {
    AppMethodBeat.i(100492);
    this.a.println(paramObject);
    AppMethodBeat.o(100492);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ma.d
 * JD-Core Version:    0.6.2
 */