package com.tencent.c.a.a;

import android.content.Context;

public abstract class q
{
  protected Context context = null;

  protected q(Context paramContext)
  {
    this.context = paramContext;
  }

  protected abstract void a(a parama);

  public final void b(a parama)
  {
    if (parama == null);
    while (true)
    {
      return;
      if (zO())
        a(parama);
    }
  }

  public final void b(g paramg)
  {
    if (paramg == null);
    while (true)
    {
      return;
      paramg = paramg.toString();
      if (zO())
        write(s.encode(paramg));
    }
  }

  protected abstract String read();

  protected abstract void write(String paramString);

  protected abstract boolean zO();

  protected abstract a zP();

  public final g zV()
  {
    g localg = null;
    if (zO());
    for (String str = s.decode(read()); ; str = null)
    {
      if (str != null)
        localg = g.cn(str);
      return localg;
    }
  }

  public final a zW()
  {
    if (zO());
    for (a locala = zP(); ; locala = null)
      return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.q
 * JD-Core Version:    0.6.2
 */