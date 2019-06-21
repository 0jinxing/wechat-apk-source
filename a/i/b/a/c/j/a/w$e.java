package a.i.b.a.c.j.a;

import a.f.a.b;
import a.i.b.a.c.b.aa;
import a.i.b.a.c.b.e;
import a.i.b.a.c.e.a.aa;
import a.i.b.a.c.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class w$e extends a.f.b.k
  implements b<Integer, e>
{
  w$e(w paramw, a.aa paramaa)
  {
    super(1);
  }

  public final e UN(int paramInt)
  {
    AppMethodBeat.i(122319);
    Object localObject = r.a(this.BHI.BHj.AWq, paramInt);
    List localList = a.j.i.d(a.j.i.d(a.j.i.a(this.BHJ, (b)new b(this)), (b)c.BHM));
    paramInt = a.j.i.e(a.j.i.a(localObject, (b)w.e.a.BHK));
    while (localList.size() < paramInt)
      localList.add(Integer.valueOf(0));
    localObject = this.BHI.BHj.Brl.Bcm.a((a)localObject, localList);
    AppMethodBeat.o(122319);
    return localObject;
  }

  static final class b extends a.f.b.k
    implements b<a.aa, a.aa>
  {
    b(w.e parame)
    {
      super();
    }
  }

  static final class c extends a.f.b.k
    implements b<a.aa, Integer>
  {
    public static final c BHM;

    static
    {
      AppMethodBeat.i(122317);
      BHM = new c();
      AppMethodBeat.o(122317);
    }

    c()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.w.e
 * JD-Core Version:    0.6.2
 */