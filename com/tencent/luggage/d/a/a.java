package com.tencent.luggage.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface a
{
  public static final a bPT = new a()
  {
    public final void a(c paramAnonymousc)
    {
      AppMethodBeat.i(90857);
      paramAnonymousc.a(b.bPW);
      AppMethodBeat.o(90857);
    }

    public final void a(String paramAnonymousString, c paramAnonymousc)
    {
      AppMethodBeat.i(90858);
      paramAnonymousc.a(b.bPW);
      AppMethodBeat.o(90858);
    }
  };
  public static final a bPU = new a.2();

  public abstract void a(c paramc);

  public abstract void a(String paramString, c paramc);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.a.a
 * JD-Core Version:    0.6.2
 */