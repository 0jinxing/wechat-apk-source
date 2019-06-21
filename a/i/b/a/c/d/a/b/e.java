package a.i.b.a.c.d.a.b;

import a.f.b.j;
import a.i.b.a.c.b.a.a;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.c.ad;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.t;
import a.i.b.a.c.f.f;
import a.i.b.a.c.m.a;
import a.i.b.a.c.m.c;
import a.i.b.a.c.m.c.a;
import a.i.b.a.c.m.c.b;
import a.i.b.a.c.m.c.c;
import a.i.b.a.c.m.d;
import a.i.b.a.c.m.i;
import a.k.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e extends ad
  implements b
{
  public static final a.a<au> BmA;
  private e.a BmB = null;

  static
  {
    AppMethodBeat.i(119805);
    if (!e.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      BmA = new e.1();
      AppMethodBeat.o(119805);
      return;
    }
  }

  private e(l paraml, al paramal, g paramg, f paramf, b.a parama, am paramam)
  {
    super(paraml, paramal, paramg, paramf, parama, paramam);
  }

  public static e a(l paraml, g paramg, f paramf, am paramam)
  {
    AppMethodBeat.i(119798);
    paraml = new e(paraml, null, paramg, paramf, b.a.Bej, paramam);
    AppMethodBeat.o(119798);
    return paraml;
  }

  public final ad a(ak paramak1, ak paramak2, List<? extends ar> paramList, List<au> paramList1, a.i.b.a.c.l.w paramw, a.i.b.a.c.b.w paramw1, az paramaz, Map<? extends a.a<?>, ?> paramMap)
  {
    AppMethodBeat.i(119799);
    paramak2 = super.a(paramak1, paramak2, paramList, paramList1, paramw, paramw1, paramaz, paramMap);
    paramak1 = i.BLI;
    j.p(paramak2, "functionDescriptor");
    paramList = paramak1.ekt().iterator();
    int i;
    if (paramList.hasNext())
    {
      paramak1 = (d)paramList.next();
      j.p(paramak2, "functionDescriptor");
      if ((paramak1.BgZ != null) && ((j.j(paramak2.dZg(), paramak1.BgZ) ^ true)))
      {
        i = 0;
        label96: if (i == 0)
          break label256;
        j.p(paramak2, "functionDescriptor");
        paramList = paramak1.BLy;
        int j = paramList.length;
        i = 0;
        label119: if (i >= j)
          break label264;
        paramList1 = paramList[i].i(paramak2);
        if (paramList1 == null)
          break label258;
        paramak1 = (c)new c.b(paramList1);
      }
    }
    while (true)
    {
      this.BhR = paramak1.cxT;
      AppMethodBeat.o(119799);
      return paramak2;
      if (paramak1.BLv != null)
      {
        paramList1 = paramak2.dZg().name;
        j.o(paramList1, "functionDescriptor.name.asString()");
        paramList1 = (CharSequence)paramList1;
        if (!paramak1.BLv.aq(paramList1))
        {
          i = 0;
          break label96;
        }
      }
      if ((paramak1.BLw != null) && (!paramak1.BLw.contains(paramak2.dZg())))
      {
        i = 0;
        break label96;
      }
      i = 1;
      break label96;
      label256: break;
      label258: i++;
      break label119;
      label264: paramak1 = (String)paramak1.BLx.am(paramak2);
      if (paramak1 != null)
      {
        paramak1 = (c)new c.b(paramak1);
      }
      else
      {
        paramak1 = (c)c.c.BLu;
        continue;
        paramak1 = (c)c.a.BLt;
      }
    }
  }

  public final void ao(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(119802);
    this.BmB = e.a.ap(paramBoolean1, paramBoolean2);
    AppMethodBeat.o(119802);
  }

  public final boolean dYW()
  {
    AppMethodBeat.i(119801);
    if ((!$assertionsDisabled) && (this.BmB == null))
    {
      AssertionError localAssertionError = new AssertionError("Parameter names status was not set: ".concat(String.valueOf(this)));
      AppMethodBeat.o(119801);
      throw localAssertionError;
    }
    boolean bool = this.BmB.BmH;
    AppMethodBeat.o(119801);
    return bool;
  }

  public final boolean eaw()
  {
    AppMethodBeat.i(119800);
    if ((!$assertionsDisabled) && (this.BmB == null))
    {
      AssertionError localAssertionError = new AssertionError("Parameter names status was not set: ".concat(String.valueOf(this)));
      AppMethodBeat.o(119800);
      throw localAssertionError;
    }
    boolean bool = this.BmB.BmG;
    AppMethodBeat.o(119800);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.b.e
 * JD-Core Version:    0.6.2
 */