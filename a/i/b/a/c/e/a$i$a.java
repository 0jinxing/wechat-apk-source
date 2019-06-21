package a.i.b.a.c.e;

import a.i.b.a.c.g.d;
import a.i.b.a.c.g.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$i$a extends i.a<a.i, a>
  implements a.j
{
  private int BsD;
  private a.i.b BtS;
  private List<a.m> BtT;
  private a.m BtU;
  private a.i.c BtV;

  private a$i$a()
  {
    AppMethodBeat.i(120541);
    this.BtS = a.i.b.BtW;
    this.BtT = Collections.emptyList();
    this.BtU = a.m.eea();
    this.BtV = a.i.c.Bua;
    AppMethodBeat.o(120541);
  }

  private a a(a.i.b paramb)
  {
    AppMethodBeat.i(120547);
    if (paramb == null)
    {
      paramb = new NullPointerException();
      AppMethodBeat.o(120547);
      throw paramb;
    }
    this.BsD |= 1;
    this.BtS = paramb;
    AppMethodBeat.o(120547);
    return this;
  }

  private a a(a.i.c paramc)
  {
    AppMethodBeat.i(120550);
    if (paramc == null)
    {
      paramc = new NullPointerException();
      AppMethodBeat.o(120550);
      throw paramc;
    }
    this.BsD |= 8;
    this.BtV = paramc;
    AppMethodBeat.o(120550);
    return this;
  }

  private a a(a.m paramm)
  {
    AppMethodBeat.i(120549);
    if (((this.BsD & 0x4) == 4) && (this.BtU != a.m.eea()));
    for (this.BtU = a.m.b(this.BtU).f(paramm).eeg(); ; this.BtU = paramm)
    {
      this.BsD |= 4;
      AppMethodBeat.o(120549);
      return this;
    }
  }

  private a edR()
  {
    AppMethodBeat.i(120542);
    a locala = new a().c(edS());
    AppMethodBeat.o(120542);
    return locala;
  }

  private a.i edS()
  {
    int i = 1;
    AppMethodBeat.i(120543);
    a.i locali = new a.i(this, (byte)0);
    int j = this.BsD;
    if ((j & 0x1) == 1);
    while (true)
    {
      a.i.a(locali, this.BtS);
      if ((this.BsD & 0x2) == 2)
      {
        this.BtT = Collections.unmodifiableList(this.BtT);
        this.BsD &= -3;
      }
      a.i.a(locali, this.BtT);
      int k = i;
      if ((j & 0x4) == 4)
        k = i | 0x2;
      a.i.a(locali, this.BtU);
      i = k;
      if ((j & 0x8) == 8)
        i = k | 0x4;
      a.i.a(locali, this.BtV);
      a.i.a(locali, i);
      AppMethodBeat.o(120543);
      return locali;
      i = 0;
    }
  }

  private void edT()
  {
    AppMethodBeat.i(120548);
    if ((this.BsD & 0x2) != 2)
    {
      this.BtT = new ArrayList(this.BtT);
      this.BsD |= 2;
    }
    AppMethodBeat.o(120548);
  }

  // ERROR //
  private a j(a.i.b.a.c.g.e parame, a.i.b.a.c.g.g paramg)
  {
    // Byte code:
    //   0: ldc 138
    //   2: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 142	a/i/b/a/c/e/a$i:BsC	La/i/b/a/c/g/s;
    //   10: aload_1
    //   11: aload_2
    //   12: invokeinterface 147 3 0
    //   17: checkcast 9	a/i/b/a/c/e/a$i
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 101	a/i/b/a/c/e/a$i$a:c	(La/i/b/a/c/e/a$i;)La/i/b/a/c/e/a$i$a;
    //   26: pop
    //   27: ldc 138
    //   29: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_0
    //   33: areturn
    //   34: astore_1
    //   35: aload_1
    //   36: getfield 151	a/i/b/a/c/g/k:BzY	La/i/b/a/c/g/q;
    //   39: checkcast 9	a/i/b/a/c/e/a$i
    //   42: astore_2
    //   43: ldc 138
    //   45: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: aload_2
    //   52: ifnull +9 -> 61
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 101	a/i/b/a/c/e/a$i$a:c	(La/i/b/a/c/e/a$i;)La/i/b/a/c/e/a$i$a;
    //   60: pop
    //   61: ldc 138
    //   63: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  public final a c(a.i parami)
  {
    AppMethodBeat.i(120544);
    if (parami == a.i.edN())
    {
      AppMethodBeat.o(120544);
      return this;
    }
    if (parami.edO())
      a(parami.BtS);
    if (!a.i.a(parami).isEmpty())
    {
      if (!this.BtT.isEmpty())
        break label133;
      this.BtT = a.i.a(parami);
      this.BsD &= -3;
    }
    while (true)
    {
      if (parami.edP())
        a(parami.BtU);
      if (parami.edQ())
        a(parami.BtV);
      this.BsB = this.BsB.a(a.i.b(parami));
      AppMethodBeat.o(120544);
      break;
      label133: edT();
      this.BtT.addAll(a.i.a(parami));
    }
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(120545);
    int i = 0;
    if (i < this.BtT.size())
      if (!((a.m)this.BtT.get(i)).isInitialized())
        AppMethodBeat.o(120545);
    while (true)
    {
      return bool;
      i++;
      break;
      if ((this.BsD & 0x4) == 4);
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || (this.BtU.isInitialized()))
          break label93;
        AppMethodBeat.o(120545);
        break;
      }
      label93: AppMethodBeat.o(120545);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.i.a
 * JD-Core Version:    0.6.2
 */