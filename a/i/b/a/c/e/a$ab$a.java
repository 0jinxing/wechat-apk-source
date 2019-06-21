package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$ab$a extends i.b<a.ab, a>
  implements a.ac
{
  private int BsD;
  private int BsW;
  private List<Integer> BtD;
  private List<a.ae> Btp;
  private int Buf;
  private List<a.a> BvA;
  private a.aa Bvw;
  private int Bvx;
  private a.aa Bvy;
  private int Bvz;

  private a$ab$a()
  {
    AppMethodBeat.i(120886);
    this.BsW = 6;
    this.Btp = Collections.emptyList();
    this.Bvw = a.aa.eeX();
    this.Bvy = a.aa.eeX();
    this.BvA = Collections.emptyList();
    this.BtD = Collections.emptyList();
    AppMethodBeat.o(120886);
  }

  private a TN(int paramInt)
  {
    this.BsD |= 1;
    this.BsW = paramInt;
    return this;
  }

  private a TO(int paramInt)
  {
    this.BsD |= 2;
    this.Buf = paramInt;
    return this;
  }

  private a TP(int paramInt)
  {
    this.BsD |= 16;
    this.Bvx = paramInt;
    return this;
  }

  private a TQ(int paramInt)
  {
    this.BsD |= 64;
    this.Bvz = paramInt;
    return this;
  }

  private void edp()
  {
    AppMethodBeat.i(120892);
    if ((this.BsD & 0x4) != 4)
    {
      this.Btp = new ArrayList(this.Btp);
      this.BsD |= 4;
    }
    AppMethodBeat.o(120892);
  }

  private void edz()
  {
    AppMethodBeat.i(120896);
    if ((this.BsD & 0x100) != 256)
    {
      this.BtD = new ArrayList(this.BtD);
      this.BsD |= 256;
    }
    AppMethodBeat.o(120896);
  }

  private a efA()
  {
    AppMethodBeat.i(120887);
    a locala = new a().e(efB());
    AppMethodBeat.o(120887);
    return locala;
  }

  private a.ab efB()
  {
    int i = 1;
    AppMethodBeat.i(120888);
    a.ab localab = new a.ab(this, (byte)0);
    int j = this.BsD;
    if ((j & 0x1) == 1);
    while (true)
    {
      a.ab.a(localab, this.BsW);
      int k = i;
      if ((j & 0x2) == 2)
        k = i | 0x2;
      a.ab.b(localab, this.Buf);
      if ((this.BsD & 0x4) == 4)
      {
        this.Btp = Collections.unmodifiableList(this.Btp);
        this.BsD &= -5;
      }
      a.ab.a(localab, this.Btp);
      i = k;
      if ((j & 0x8) == 8)
        i = k | 0x4;
      a.ab.a(localab, this.Bvw);
      k = i;
      if ((j & 0x10) == 16)
        k = i | 0x8;
      a.ab.c(localab, this.Bvx);
      i = k;
      if ((j & 0x20) == 32)
        i = k | 0x10;
      a.ab.b(localab, this.Bvy);
      k = i;
      if ((j & 0x40) == 64)
        k = i | 0x20;
      a.ab.d(localab, this.Bvz);
      if ((this.BsD & 0x80) == 128)
      {
        this.BvA = Collections.unmodifiableList(this.BvA);
        this.BsD &= -129;
      }
      a.ab.b(localab, this.BvA);
      if ((this.BsD & 0x100) == 256)
      {
        this.BtD = Collections.unmodifiableList(this.BtD);
        this.BsD &= -257;
      }
      a.ab.c(localab, this.BtD);
      a.ab.e(localab, k);
      AppMethodBeat.o(120888);
      return localab;
      i = 0;
    }
  }

  private void efC()
  {
    AppMethodBeat.i(120895);
    if ((this.BsD & 0x80) != 128)
    {
      this.BvA = new ArrayList(this.BvA);
      this.BsD |= 128;
    }
    AppMethodBeat.o(120895);
  }

  private a n(a.aa paramaa)
  {
    AppMethodBeat.i(120893);
    if (((this.BsD & 0x8) == 8) && (this.Bvw != a.aa.eeX()));
    for (this.Bvw = a.aa.f(this.Bvw).j(paramaa).eft(); ; this.Bvw = paramaa)
    {
      this.BsD |= 8;
      AppMethodBeat.o(120893);
      return this;
    }
  }

  private a o(a.aa paramaa)
  {
    AppMethodBeat.i(120894);
    if (((this.BsD & 0x20) == 32) && (this.Bvy != a.aa.eeX()));
    for (this.Bvy = a.aa.f(this.Bvy).j(paramaa).eft(); ; this.Bvy = paramaa)
    {
      this.BsD |= 32;
      AppMethodBeat.o(120894);
      return this;
    }
  }

  // ERROR //
  private a u(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 158
    //   2: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 162	a/i/b/a/c/e/a$ab:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 167 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$ab
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 99	a/i/b/a/c/e/a$ab$a:e	(La/i/b/a/c/e/a$ab;)La/i/b/a/c/e/a$ab$a;
    //   26: pop
    //   27: ldc 158
    //   29: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 171	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$ab
    //   42: astore_2
    //   43: ldc 158
    //   45: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 99	a/i/b/a/c/e/a$ab$a:e	(La/i/b/a/c/e/a$ab;)La/i/b/a/c/e/a$ab$a;
    //   60: pop
    //   61: ldc 158
    //   63: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a e(a.ab paramab)
  {
    AppMethodBeat.i(120889);
    if (paramab == a.ab.efv())
    {
      AppMethodBeat.o(120889);
      return this;
    }
    if (paramab.ecY())
      TN(paramab.BsW);
    if (paramab.edW())
      TO(paramab.Buf);
    if (!a.ab.a(paramab).isEmpty())
    {
      if (this.Btp.isEmpty())
      {
        this.Btp = a.ab.a(paramab);
        this.BsD &= -5;
      }
    }
    else
    {
      label94: if (paramab.efw())
        n(paramab.Bvw);
      if (paramab.efx())
        TP(paramab.Bvx);
      if (paramab.efy())
        o(paramab.Bvy);
      if (paramab.efz())
        TQ(paramab.Bvz);
      if (!a.ab.b(paramab).isEmpty())
      {
        if (!this.BvA.isEmpty())
          break label295;
        this.BvA = a.ab.b(paramab);
        this.BsD &= -129;
      }
      label202: if (!a.ab.c(paramab).isEmpty())
      {
        if (!this.BtD.isEmpty())
          break label316;
        this.BtD = a.ab.c(paramab);
        this.BsD &= -257;
      }
    }
    while (true)
    {
      a(paramab);
      this.BsB = this.BsB.a(a.ab.d(paramab));
      AppMethodBeat.o(120889);
      break;
      edp();
      this.Btp.addAll(a.ab.a(paramab));
      break label94;
      label295: efC();
      this.BvA.addAll(a.ab.b(paramab));
      break label202;
      label316: edz();
      this.BtD.addAll(a.ab.c(paramab));
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120890);
    int i;
    if ((this.BsD & 0x2) == 2)
    {
      i = 1;
      if (i != 0)
        break label37;
      AppMethodBeat.o(120890);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label37: for (i = 0; ; i++)
      {
        if (i >= this.Btp.size())
          break label86;
        if (!((a.ae)this.Btp.get(i)).isInitialized())
        {
          AppMethodBeat.o(120890);
          break;
        }
      }
      label86: if ((this.BsD & 0x8) == 8);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.Bvw.isInitialized()))
          break label128;
        AppMethodBeat.o(120890);
        break;
      }
      label128: if ((this.BsD & 0x20) == 32);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.Bvy.isInitialized()))
          break label170;
        AppMethodBeat.o(120890);
        break;
      }
      label170: for (i = 0; ; i++)
      {
        if (i >= this.BvA.size())
          break label219;
        if (!((a.a)this.BvA.get(i)).isInitialized())
        {
          AppMethodBeat.o(120890);
          break;
        }
      }
      label219: if (!this.BzI.isInitialized())
      {
        AppMethodBeat.o(120890);
      }
      else
      {
        AppMethodBeat.o(120890);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.ab.a
 * JD-Core Version:    0.6.2
 */