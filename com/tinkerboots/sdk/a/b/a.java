package com.tinkerboots.sdk.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class a
{
  public final com.tinkerboots.sdk.a.c.a AUa;

  private a(com.tinkerboots.sdk.a.c.a parama)
  {
    this.AUa = parama;
  }

  public static a dWl()
  {
    AppMethodBeat.i(65531);
    Object localObject = new a.a();
    ((a.a)localObject).AUa = new com.tinkerboots.sdk.a.c.a();
    if (((a.a)localObject).AUa == null)
    {
      localObject = new RuntimeException("You need init conditions property");
      AppMethodBeat.o(65531);
      throw ((Throwable)localObject);
    }
    localObject = new a(((a.a)localObject).AUa);
    AppMethodBeat.o(65531);
    return localObject;
  }

  public final com.tinkerboots.sdk.a.c.a iP(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65532);
    paramString1 = this.AUa.iQ(paramString1, paramString2);
    AppMethodBeat.o(65532);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.a.b.a
 * JD-Core Version:    0.6.2
 */