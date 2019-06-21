package com.tencent.mm.plugin.appbrand.j;

import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface a
{
  public abstract String CC(String paramString);

  public abstract void a(String paramString, boolean paramBoolean, b paramb);

  public abstract void a(String paramString, boolean paramBoolean, b paramb, a parama);

  public abstract boolean aIy();

  public static abstract interface a
  {
    public abstract void b(d paramd);
  }

  public static abstract interface b
  {
    public abstract void a(a.d paramd);
  }

  public static class c
    implements a
  {
    public final String CC(String paramString)
    {
      return "__APP__";
    }

    public final void a(String paramString, boolean paramBoolean, a.b paramb)
    {
      AppMethodBeat.i(87004);
      a(paramString, paramBoolean, paramb, null);
      AppMethodBeat.o(87004);
    }

    public void a(String paramString, boolean paramBoolean, a.b paramb, a.a parama)
    {
      AppMethodBeat.i(87003);
      if (paramb != null)
        paramb.a(a.d.inH);
      AppMethodBeat.o(87003);
    }

    public final boolean aIy()
    {
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.j.a
 * JD-Core Version:    0.6.2
 */