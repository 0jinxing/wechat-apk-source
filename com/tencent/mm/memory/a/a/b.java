package com.tencent.mm.memory.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f.b;
import com.tencent.mm.a.f.c;
import com.tencent.mm.memory.a.a.a.d;
import com.tencent.mm.memory.a.a.a.g;
import java.util.concurrent.ConcurrentHashMap;

public class b
{
  private static volatile b feh;
  public static final com.tencent.mm.memory.a.a.a.a fei;
  private final String TAG;
  public ConcurrentHashMap<String, b> fdN;
  private b fej;

  static
  {
    AppMethodBeat.i(115458);
    com.tencent.mm.memory.a.a.a.a locala = com.tencent.mm.memory.a.a.a.a.Xw();
    fei = locala;
    b localb = Xr();
    a locala1 = new a(locala);
    localb.fdN.put(locala.few, locala1);
    if (locala.equals(fei))
      localb.fej = locala1;
    AppMethodBeat.o(115458);
  }

  b()
  {
    AppMethodBeat.i(115452);
    this.TAG = "MicroMsg.CacheInvoke";
    this.fej = null;
    this.fdN = new ConcurrentHashMap();
    AppMethodBeat.o(115452);
  }

  public static b Xr()
  {
    AppMethodBeat.i(115453);
    if (feh == null);
    try
    {
      if (feh == null)
      {
        localb = new com/tencent/mm/memory/a/a/b;
        localb.<init>();
        feh = localb;
      }
      b localb = feh;
      AppMethodBeat.o(115453);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(115453);
    }
  }

  private static b b(com.tencent.mm.memory.a.a.a.a parama)
  {
    AppMethodBeat.i(115454);
    parama = (b)Xr().fdN.get(parama.few);
    AppMethodBeat.o(115454);
    return parama;
  }

  public static d<String, a> c(com.tencent.mm.memory.a.a.a.a parama)
  {
    AppMethodBeat.i(115455);
    if ((parama == null) || (parama.equals("")))
    {
      parama = null;
      AppMethodBeat.o(115455);
    }
    while (true)
    {
      return parama;
      if (fei.equals(parama))
      {
        parama = Xr().fej.Xu();
        AppMethodBeat.o(115455);
      }
      else
      {
        Xr();
        parama = b(parama).Xu();
        AppMethodBeat.o(115455);
      }
    }
  }

  public static com.tencent.mm.a.f<String, Object> d(com.tencent.mm.memory.a.a.a.a parama)
  {
    AppMethodBeat.i(115456);
    if ((parama == null) || (parama.equals("")))
    {
      parama = null;
      AppMethodBeat.o(115456);
    }
    while (true)
    {
      return parama;
      if (fei.equals(parama))
      {
        parama = Xr().fej.Xv();
        AppMethodBeat.o(115456);
      }
      else
      {
        Xr();
        parama = b(parama).Xv();
        AppMethodBeat.o(115456);
      }
    }
  }

  public static int e(com.tencent.mm.memory.a.a.a.a parama)
  {
    AppMethodBeat.i(115457);
    int i;
    if ((parama == null) || (parama.equals("")))
    {
      i = 2147483647;
      AppMethodBeat.o(115457);
    }
    while (true)
    {
      return i;
      if (fei.equals(parama))
      {
        i = Xr().fej.Xt().fer;
        AppMethodBeat.o(115457);
      }
      else
      {
        Xr();
        i = b(parama).Xt().fer;
        AppMethodBeat.o(115457);
      }
    }
  }

  static final class a
    implements b.b
  {
    private static String fen = "//data[%d,%d]::%s::%s";
    private d<String, a> fek;
    private g<String, Object> fel;
    private com.tencent.mm.memory.a.a.a.a fem;

    a(com.tencent.mm.memory.a.a.a.a parama)
    {
      AppMethodBeat.i(115450);
      this.fek = null;
      this.fel = null;
      this.fem = parama;
      this.fek = new com.tencent.mm.memory.a.a.a.f(parama, new f.b()
      {
      }
      , new f.c()
      {
      })
      {
      };
      this.fel = new g();
      AppMethodBeat.o(115450);
    }

    public final void Xs()
    {
      AppMethodBeat.i(115451);
      this.fek.trimToSize(this.fem.fer / 2);
      AppMethodBeat.o(115451);
    }

    public final com.tencent.mm.memory.a.a.a.a Xt()
    {
      return this.fem;
    }

    public final d Xu()
    {
      return this.fek;
    }

    public final com.tencent.mm.a.f Xv()
    {
      return this.fel;
    }
  }

  public static abstract interface b<T>
  {
    public abstract void Xs();

    public abstract com.tencent.mm.memory.a.a.a.a Xt();

    public abstract d<String, T> Xu();

    public abstract com.tencent.mm.a.f<String, T> Xv();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.a.a.b
 * JD-Core Version:    0.6.2
 */