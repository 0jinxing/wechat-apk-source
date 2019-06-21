package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.h;
import a.i.b.a.c.g.i.a;
import a.i.b.a.c.g.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$ai$a extends i.b<a.ai, a>
  implements a.aj
{
  private int BsD;
  private int BsW;
  private int Buf;
  private a.aa BvP;
  private int BvQ;
  private a.aa Bvo;
  private int Bvp;

  private a$ai$a()
  {
    AppMethodBeat.i(120978);
    this.Bvo = a.aa.eeX();
    this.BvP = a.aa.eeX();
    AppMethodBeat.o(120978);
  }

  private a TV(int paramInt)
  {
    this.BsD |= 1;
    this.BsW = paramInt;
    return this;
  }

  private a TW(int paramInt)
  {
    this.BsD |= 2;
    this.Buf = paramInt;
    return this;
  }

  private a TX(int paramInt)
  {
    this.BsD |= 8;
    this.Bvp = paramInt;
    return this;
  }

  private a TY(int paramInt)
  {
    this.BsD |= 32;
    this.BvQ = paramInt;
    return this;
  }

  private a efV()
  {
    AppMethodBeat.i(120979);
    a locala = new a().d(efW());
    AppMethodBeat.o(120979);
    return locala;
  }

  private a p(a.aa paramaa)
  {
    AppMethodBeat.i(120984);
    if (((this.BsD & 0x4) == 4) && (this.Bvo != a.aa.eeX()));
    for (this.Bvo = a.aa.f(this.Bvo).j(paramaa).eft(); ; this.Bvo = paramaa)
    {
      this.BsD |= 4;
      AppMethodBeat.o(120984);
      return this;
    }
  }

  private a q(a.aa paramaa)
  {
    AppMethodBeat.i(120985);
    if (((this.BsD & 0x10) == 16) && (this.BvP != a.aa.eeX()));
    for (this.BvP = a.aa.f(this.BvP).j(paramaa).eft(); ; this.BvP = paramaa)
    {
      this.BsD |= 16;
      AppMethodBeat.o(120985);
      return this;
    }
  }

  // ERROR //
  private a x(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 95
    //   2: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 99	a/i/b/a/c/e/a$ai:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 104 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$ai
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 71	a/i/b/a/c/e/a$ai$a:d	(La/i/b/a/c/e/a$ai;)La/i/b/a/c/e/a$ai$a;
    //   26: pop
    //   27: ldc 95
    //   29: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 108	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$ai
    //   42: astore_2
    //   43: ldc 95
    //   45: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 71	a/i/b/a/c/e/a$ai$a:d	(La/i/b/a/c/e/a$ai;)La/i/b/a/c/e/a$ai$a;
    //   60: pop
    //   61: ldc 95
    //   63: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a d(a.ai paramai)
  {
    AppMethodBeat.i(120981);
    if (paramai == a.ai.efS())
      AppMethodBeat.o(120981);
    while (true)
    {
      return this;
      if (paramai.ecY())
        TV(paramai.BsW);
      if (paramai.edW())
        TW(paramai.Buf);
      if (paramai.ecP())
        p(paramai.Bvo);
      if (paramai.efn())
        TX(paramai.Bvp);
      if (paramai.efT())
        q(paramai.BvP);
      if (paramai.efU())
        TY(paramai.BvQ);
      a(paramai);
      this.BsB = this.BsB.a(a.ai.c(paramai));
      AppMethodBeat.o(120981);
    }
  }

  public final a.ai efW()
  {
    int i = 1;
    AppMethodBeat.i(120980);
    a.ai localai = new a.ai(this, (byte)0);
    int j = this.BsD;
    if ((j & 0x1) == 1);
    while (true)
    {
      a.ai.a(localai, this.BsW);
      int k = i;
      if ((j & 0x2) == 2)
        k = i | 0x2;
      a.ai.b(localai, this.Buf);
      i = k;
      if ((j & 0x4) == 4)
        i = k | 0x4;
      a.ai.a(localai, this.Bvo);
      k = i;
      if ((j & 0x8) == 8)
        k = i | 0x8;
      a.ai.c(localai, this.Bvp);
      i = k;
      if ((j & 0x10) == 16)
        i = k | 0x10;
      a.ai.b(localai, this.BvP);
      k = i;
      if ((j & 0x20) == 32)
        k = i | 0x20;
      a.ai.d(localai, this.BvQ);
      a.ai.e(localai, k);
      AppMethodBeat.o(120980);
      return localai;
      i = 0;
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120982);
    int i;
    if ((this.BsD & 0x2) == 2)
    {
      i = 1;
      if (i != 0)
        break label35;
      AppMethodBeat.o(120982);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label35: if ((this.BsD & 0x4) == 4);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.Bvo.isInitialized()))
          break label74;
        AppMethodBeat.o(120982);
        break;
      }
      label74: if ((this.BsD & 0x10) == 16);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.BvP.isInitialized()))
          break label115;
        AppMethodBeat.o(120982);
        break;
      }
      label115: if (!this.BzI.isInitialized())
      {
        AppMethodBeat.o(120982);
      }
      else
      {
        AppMethodBeat.o(120982);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.ai.a
 * JD-Core Version:    0.6.2
 */