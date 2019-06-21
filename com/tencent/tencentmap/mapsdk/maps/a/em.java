package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class em
  implements dq, ek
{
  private static em a;
  private ek b;
  private dq c;
  private boolean d = false;

  static
  {
    AppMethodBeat.i(98797);
    a = new em();
    AppMethodBeat.o(98797);
  }

  public static em d()
  {
    return a;
  }

  public final void a()
  {
    AppMethodBeat.i(98791);
    this.b.a();
    AppMethodBeat.o(98791);
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(98793);
    this.b.a(paramInt);
    AppMethodBeat.o(98793);
  }

  public final void a(dq paramdq)
  {
    this.c = paramdq;
  }

  public final void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(98796);
    this.c.a(paramString1, paramString2);
    AppMethodBeat.o(98796);
  }

  public final void a(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    AppMethodBeat.i(98795);
    this.c.a(paramString1, paramArrayOfByte, paramString2);
    AppMethodBeat.o(98795);
  }

  public final void b()
  {
    AppMethodBeat.i(98792);
    this.b.b();
    AppMethodBeat.o(98792);
  }

  public final void c()
  {
    AppMethodBeat.i(98794);
    this.c.c();
    AppMethodBeat.o(98794);
  }

  public final void e()
  {
    try
    {
      AppMethodBeat.i(98790);
      if (this.d)
        AppMethodBeat.o(98790);
      while (true)
      {
        return;
        this.b = ec.c();
        if (this.b != null)
        {
          this.b.a(this);
          this.b.e();
        }
        this.d = true;
        AppMethodBeat.o(98790);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.em
 * JD-Core Version:    0.6.2
 */