package com.tencent.mm.openim.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;

public final class p
  implements com.tencent.mm.openim.a.a
{
  public final void ah(String paramString1, String paramString2)
  {
    AppMethodBeat.i(78941);
    ((j)g.K(j.class)).XL().c(new k(paramString1, paramString2));
    AppMethodBeat.o(78941);
  }

  public final void oi(String paramString)
  {
    AppMethodBeat.i(78935);
    if (t.mP(paramString))
    {
      ((j)g.K(j.class)).XL().c(new f(paramString, 1));
      AppMethodBeat.o(78935);
    }
    while (true)
    {
      return;
      ((j)g.K(j.class)).XL().c(new o(paramString, 1));
      AppMethodBeat.o(78935);
    }
  }

  public final void oj(String paramString)
  {
    AppMethodBeat.i(78936);
    if (t.mP(paramString))
    {
      ((j)g.K(j.class)).XL().c(new f(paramString, 2));
      AppMethodBeat.o(78936);
    }
    while (true)
    {
      return;
      ((j)g.K(j.class)).XL().c(new o(paramString, 2));
      AppMethodBeat.o(78936);
    }
  }

  public final void ok(String paramString)
  {
    AppMethodBeat.i(78937);
    ((j)g.K(j.class)).XL().c(new n(paramString, 1));
    AppMethodBeat.o(78937);
  }

  public final void ol(String paramString)
  {
    AppMethodBeat.i(78938);
    ((j)g.K(j.class)).XL().c(new n(paramString, 2));
    AppMethodBeat.o(78938);
  }

  public final void om(String paramString)
  {
    AppMethodBeat.i(78939);
    ((j)g.K(j.class)).XL().c(new m(paramString, 1));
    AppMethodBeat.o(78939);
  }

  public final void on(String paramString)
  {
    AppMethodBeat.i(78940);
    ((j)g.K(j.class)).XL().c(new m(paramString, 2));
    AppMethodBeat.o(78940);
  }

  public final void oo(String paramString)
  {
    AppMethodBeat.i(78942);
    ((j)g.K(j.class)).XL().c(new h(paramString, 1));
    AppMethodBeat.o(78942);
  }

  public final void op(String paramString)
  {
    AppMethodBeat.i(78943);
    ((j)g.K(j.class)).XL().c(new h(paramString, 2));
    AppMethodBeat.o(78943);
  }

  public final void ve(String paramString)
  {
    AppMethodBeat.i(78944);
    ((j)g.K(j.class)).XL().c(new a(paramString));
    AppMethodBeat.o(78944);
  }

  public final void vf(String paramString)
  {
    AppMethodBeat.i(78945);
    ((j)g.K(j.class)).XL().c(new l(paramString, 1));
    AppMethodBeat.o(78945);
  }

  public final void vg(String paramString)
  {
    AppMethodBeat.i(78946);
    ((j)g.K(j.class)).XL().c(new l(paramString, 2));
    AppMethodBeat.o(78946);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.d.p
 * JD-Core Version:    0.6.2
 */