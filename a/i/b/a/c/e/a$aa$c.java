package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import a.i.b.a.c.g.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$aa$c extends i.b<a.aa, c>
  implements a.ad
{
  private int BsD;
  private List<a.aa.a> BsF;
  private int BsW;
  private boolean Bva;
  private int Bvb;
  private a.aa Bvc;
  private int Bvd;
  private int Bve;
  private int Bvf;
  private int Bvg;
  private int Bvh;
  private a.aa Bvi;
  private int Bvj;
  private a.aa Bvk;
  private int Bvl;

  private a$aa$c()
  {
    AppMethodBeat.i(120852);
    this.BsF = Collections.emptyList();
    this.Bvc = a.aa.eeX();
    this.Bvi = a.aa.eeX();
    this.Bvk = a.aa.eeX();
    AppMethodBeat.o(120852);
  }

  private c TE(int paramInt)
  {
    this.BsD |= 4;
    this.Bvb = paramInt;
    return this;
  }

  private c TF(int paramInt)
  {
    this.BsD |= 16;
    this.Bvd = paramInt;
    return this;
  }

  private c TG(int paramInt)
  {
    this.BsD |= 32;
    this.Bve = paramInt;
    return this;
  }

  private c TH(int paramInt)
  {
    this.BsD |= 64;
    this.Bvf = paramInt;
    return this;
  }

  private c TI(int paramInt)
  {
    this.BsD |= 128;
    this.Bvg = paramInt;
    return this;
  }

  private c TJ(int paramInt)
  {
    this.BsD |= 256;
    this.Bvh = paramInt;
    return this;
  }

  private c TK(int paramInt)
  {
    this.BsD |= 1024;
    this.Bvj = paramInt;
    return this;
  }

  private c TL(int paramInt)
  {
    this.BsD |= 4096;
    this.Bvl = paramInt;
    return this;
  }

  private c TM(int paramInt)
  {
    this.BsD |= 8192;
    this.BsW = paramInt;
    return this;
  }

  private void edg()
  {
    AppMethodBeat.i(120859);
    if ((this.BsD & 0x1) != 1)
    {
      this.BsF = new ArrayList(this.BsF);
      this.BsD |= 1;
    }
    AppMethodBeat.o(120859);
  }

  private c efr()
  {
    AppMethodBeat.i(120853);
    c localc = new c().j(eft());
    AppMethodBeat.o(120853);
    return localc;
  }

  private c k(a.aa paramaa)
  {
    AppMethodBeat.i(120860);
    if (((this.BsD & 0x8) == 8) && (this.Bvc != a.aa.eeX()));
    for (this.Bvc = a.aa.f(this.Bvc).j(paramaa).eft(); ; this.Bvc = paramaa)
    {
      this.BsD |= 8;
      AppMethodBeat.o(120860);
      return this;
    }
  }

  private c l(a.aa paramaa)
  {
    AppMethodBeat.i(120861);
    if (((this.BsD & 0x200) == 512) && (this.Bvi != a.aa.eeX()));
    for (this.Bvi = a.aa.f(this.Bvi).j(paramaa).eft(); ; this.Bvi = paramaa)
    {
      this.BsD |= 512;
      AppMethodBeat.o(120861);
      return this;
    }
  }

  private c m(a.aa paramaa)
  {
    AppMethodBeat.i(120862);
    if (((this.BsD & 0x800) == 2048) && (this.Bvk != a.aa.eeX()));
    for (this.Bvk = a.aa.f(this.Bvk).j(paramaa).eft(); ; this.Bvk = paramaa)
    {
      this.BsD |= 2048;
      AppMethodBeat.o(120862);
      return this;
    }
  }

  // ERROR //
  private c t(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 127
    //   2: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 131	a/i/b/a/c/e/a$aa:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 137 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$aa
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 111	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   26: pop
    //   27: ldc 127
    //   29: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 141	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$aa
    //   42: astore_2
    //   43: ldc 127
    //   45: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 111	a/i/b/a/c/e/a$aa$c:j	(La/i/b/a/c/e/a$aa;)La/i/b/a/c/e/a$aa$c;
    //   60: pop
    //   61: ldc 127
    //   63: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   66: aload_1
    //   67: athrow
    //   68: astore_1
    //   69: aload_3
    //   70: astore_2
    //   71: goto -20 -> 51
    //
    // Exception table:
    //   from	to	target	type
    //   7	21	34	a/i/b/a/c/g/k
    //   43	50	50	finally
    //   7	21	68	finally
    //   35	43	68	finally
  }

  public final a.aa efs()
  {
    AppMethodBeat.i(120854);
    Object localObject = eft();
    if (!((a.aa)localObject).isInitialized())
    {
      localObject = new w();
      AppMethodBeat.o(120854);
      throw ((Throwable)localObject);
    }
    AppMethodBeat.o(120854);
    return localObject;
  }

  public final a.aa eft()
  {
    int i = 1;
    AppMethodBeat.i(120855);
    a.aa localaa = new a.aa(this, (byte)0);
    int j = this.BsD;
    if ((this.BsD & 0x1) == 1)
    {
      this.BsF = Collections.unmodifiableList(this.BsF);
      this.BsD &= -2;
    }
    a.aa.a(localaa, this.BsF);
    if ((j & 0x2) == 2);
    while (true)
    {
      a.aa.a(localaa, this.Bva);
      int k = i;
      if ((j & 0x4) == 4)
        k = i | 0x2;
      a.aa.a(localaa, this.Bvb);
      int m = k;
      if ((j & 0x8) == 8)
        m = k | 0x4;
      a.aa.a(localaa, this.Bvc);
      i = m;
      if ((j & 0x10) == 16)
        i = m | 0x8;
      a.aa.b(localaa, this.Bvd);
      k = i;
      if ((j & 0x20) == 32)
        k = i | 0x10;
      a.aa.c(localaa, this.Bve);
      i = k;
      if ((j & 0x40) == 64)
        i = k | 0x20;
      a.aa.d(localaa, this.Bvf);
      k = i;
      if ((j & 0x80) == 128)
        k = i | 0x40;
      a.aa.e(localaa, this.Bvg);
      i = k;
      if ((j & 0x100) == 256)
        i = k | 0x80;
      a.aa.f(localaa, this.Bvh);
      k = i;
      if ((j & 0x200) == 512)
        k = i | 0x100;
      a.aa.b(localaa, this.Bvi);
      i = k;
      if ((j & 0x400) == 1024)
        i = k | 0x200;
      a.aa.g(localaa, this.Bvj);
      k = i;
      if ((j & 0x800) == 2048)
        k = i | 0x400;
      a.aa.c(localaa, this.Bvk);
      i = k;
      if ((j & 0x1000) == 4096)
        i = k | 0x800;
      a.aa.h(localaa, this.Bvl);
      k = i;
      if ((j & 0x2000) == 8192)
        k = i | 0x1000;
      a.aa.i(localaa, this.BsW);
      a.aa.j(localaa, k);
      AppMethodBeat.o(120855);
      return localaa;
      i = 0;
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120857);
    int i = 0;
    if (i < this.BsF.size())
      if (!((a.aa.a)this.BsF.get(i)).isInitialized())
        AppMethodBeat.o(120857);
    while (true)
    {
      return bool;
      i++;
      break;
      if ((this.BsD & 0x8) == 8);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.Bvc.isInitialized()))
          break label95;
        AppMethodBeat.o(120857);
        break;
      }
      label95: if ((this.BsD & 0x200) == 512);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.Bvi.isInitialized()))
          break label138;
        AppMethodBeat.o(120857);
        break;
      }
      label138: if ((this.BsD & 0x800) == 2048);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.Bvk.isInitialized()))
          break label181;
        AppMethodBeat.o(120857);
        break;
      }
      label181: if (!this.BzI.isInitialized())
      {
        AppMethodBeat.o(120857);
      }
      else
      {
        AppMethodBeat.o(120857);
        bool = true;
      }
    }
  }

  public final c j(a.aa paramaa)
  {
    AppMethodBeat.i(120856);
    if (paramaa == a.aa.eeX())
    {
      AppMethodBeat.o(120856);
      return this;
    }
    if (!a.aa.g(paramaa).isEmpty())
    {
      if (!this.BsF.isEmpty())
        break label298;
      this.BsF = a.aa.g(paramaa);
      this.BsD &= -2;
    }
    while (true)
    {
      if (paramaa.eeY())
        rN(paramaa.Bva);
      if (paramaa.eeZ())
        TE(paramaa.Bvb);
      if (paramaa.efa())
        k(paramaa.Bvc);
      if (paramaa.efb())
        TF(paramaa.Bvd);
      if (paramaa.efc())
        TG(paramaa.Bve);
      if (paramaa.efd())
        TH(paramaa.Bvf);
      if (paramaa.efe())
        TI(paramaa.Bvg);
      if (paramaa.eff())
        TJ(paramaa.Bvh);
      if (paramaa.efg())
        l(paramaa.Bvi);
      if (paramaa.efh())
        TK(paramaa.Bvj);
      if (paramaa.efi())
        m(paramaa.Bvk);
      if (paramaa.efj())
        TL(paramaa.Bvl);
      if (paramaa.ecY())
        TM(paramaa.BsW);
      a(paramaa);
      this.BsB = this.BsB.a(a.aa.h(paramaa));
      AppMethodBeat.o(120856);
      break;
      label298: edg();
      this.BsF.addAll(a.aa.g(paramaa));
    }
  }

  public final c rN(boolean paramBoolean)
  {
    this.BsD |= 2;
    this.Bva = paramBoolean;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.aa.c
 * JD-Core Version:    0.6.2
 */