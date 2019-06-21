package com.tencent.mm.vending.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.j.h;
import java.util.Stack;

public final class f
{
  private static final a zYm;

  static
  {
    AppMethodBeat.i(126032);
    zYm = new a();
    AppMethodBeat.o(126032);
  }

  public static final <Var1, Var2> c<com.tencent.mm.vending.j.c<Var1, Var2>> D(Var1 paramVar1, Var2 paramVar2)
  {
    AppMethodBeat.i(126020);
    paramVar1 = new e().C(new Object[] { paramVar1, paramVar2 });
    AppMethodBeat.o(126020);
    return paramVar1;
  }

  public static <$1, $2> com.tencent.mm.vending.j.c<$1, $2> E($1 param$1, $2 param$2)
  {
    AppMethodBeat.i(126026);
    param$1 = com.tencent.mm.vending.j.a.F(param$1, param$2);
    AppMethodBeat.o(126026);
    return param$1;
  }

  public static final <Var1, Var2, Var3, Var4, Var5> c<com.tencent.mm.vending.j.f<Var1, Var2, Var3, Var4, Var5>> a(Var1 paramVar1, Var2 paramVar2, Var3 paramVar3, Var4 paramVar4, Var5 paramVar5)
  {
    AppMethodBeat.i(126023);
    paramVar1 = new e().C(new Object[] { paramVar1, paramVar2, paramVar3, paramVar4, paramVar5 });
    AppMethodBeat.o(126023);
    return paramVar1;
  }

  public static final <Var1, Var2, Var3, Var4, Var5, Var6, Var7> c<h<Var1, Var2, Var3, Var4, Var5, Var6, Var7>> a(Var1 paramVar1, Var2 paramVar2, Var3 paramVar3, Var4 paramVar4, Var5 paramVar5, Var6 paramVar6, Var7 paramVar7)
  {
    AppMethodBeat.i(126024);
    paramVar1 = new e().C(new Object[] { paramVar1, paramVar2, paramVar3, paramVar4, paramVar5, paramVar6, paramVar7 });
    AppMethodBeat.o(126024);
    return paramVar1;
  }

  public static final void a(b paramb)
  {
    AppMethodBeat.i(126030);
    if (paramb == null)
    {
      com.tencent.mm.vending.f.a.w("Vending.QuickAccess", "dummy mario", new Object[0]);
      AppMethodBeat.o(126030);
    }
    while (true)
    {
      return;
      paramb.cR(null);
      AppMethodBeat.o(126030);
    }
  }

  public static final void a(b paramb, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126029);
    if (paramb == null)
    {
      com.tencent.mm.vending.f.a.w("Vending.QuickAccess", "dummy mario", new Object[0]);
      AppMethodBeat.o(126029);
    }
    while (true)
    {
      return;
      if (paramArrayOfObject.length > 0)
      {
        paramb.B(paramArrayOfObject);
        AppMethodBeat.o(126029);
      }
      else
      {
        paramb.resume();
        AppMethodBeat.o(126029);
      }
    }
  }

  public static final <_Var> void a(d<_Var> paramd)
  {
    AppMethodBeat.i(126031);
    b localb = dMo();
    paramd.a(new d.b()
    {
      public final void az(_Var paramAnonymous_Var)
      {
        AppMethodBeat.i(126017);
        f.a(this.zYn, new Object[] { paramAnonymous_Var });
        AppMethodBeat.o(126017);
      }
    }).a(new d.a()
    {
      public final void bi(Object paramAnonymousObject)
      {
        AppMethodBeat.i(126033);
        this.zYn.cR(paramAnonymousObject);
        AppMethodBeat.o(126033);
      }
    });
    AppMethodBeat.o(126031);
  }

  public static final <Var1, Var2, Var3, Var4> c<com.tencent.mm.vending.j.e<Var1, Var2, Var3, Var4>> b(Var1 paramVar1, Var2 paramVar2, Var3 paramVar3, Var4 paramVar4)
  {
    AppMethodBeat.i(126022);
    paramVar1 = new e().C(new Object[] { paramVar1, paramVar2, paramVar3, paramVar4 });
    AppMethodBeat.o(126022);
    return paramVar1;
  }

  public static final <Var1> c<Var1> cU(Var1 paramVar1)
  {
    AppMethodBeat.i(126019);
    paramVar1 = new e().C(new Object[] { paramVar1 });
    AppMethodBeat.o(126019);
    return paramVar1;
  }

  public static <$1> com.tencent.mm.vending.j.b<$1> cV($1 param$1)
  {
    AppMethodBeat.i(126025);
    param$1 = com.tencent.mm.vending.j.a.cW(param$1);
    AppMethodBeat.o(126025);
    return param$1;
  }

  public static final b dMj()
  {
    AppMethodBeat.i(126027);
    g localg = g.dMp();
    Object localObject = (Stack)localg.b.get();
    if (localObject == null)
    {
      localObject = null;
      if (localObject == null)
        break label76;
      localObject = ((c)localObject).dMj();
      AppMethodBeat.o(126027);
    }
    while (true)
    {
      return localObject;
      if (((Stack)localObject).size() == 0)
      {
        localObject = null;
        break;
      }
      localObject = (c)((Stack)localg.b.get()).peek();
      break;
      label76: localObject = zYm;
      AppMethodBeat.o(126027);
    }
  }

  public static final c<Void> dMn()
  {
    AppMethodBeat.i(126018);
    c localc = new e().C(new Object[0]);
    AppMethodBeat.o(126018);
    return localc;
  }

  public static final b dMo()
  {
    AppMethodBeat.i(126028);
    b localb = dMj();
    if (localb != null)
      localb.dMi();
    while (true)
    {
      AppMethodBeat.o(126028);
      return localb;
      com.tencent.mm.vending.f.a.w("Vending.QuickAccess", "dummy mario", new Object[0]);
    }
  }

  public static final <Var1, Var2, Var3> c<com.tencent.mm.vending.j.d<Var1, Var2, Var3>> h(Var1 paramVar1, Var2 paramVar2, Var3 paramVar3)
  {
    AppMethodBeat.i(126021);
    paramVar1 = new e().C(new Object[] { paramVar1, paramVar2, paramVar3 });
    AppMethodBeat.o(126021);
    return paramVar1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.g.f
 * JD-Core Version:    0.6.2
 */