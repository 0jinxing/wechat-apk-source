package a.i.b.a.c.i.a.a;

import a.f.b.j;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.z;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  static final ap a(ap paramap, a.i.b.a.c.b.ar paramar)
  {
    AppMethodBeat.i(122065);
    if ((paramar == null) || (paramap.ekq() == ba.BKh))
      AppMethodBeat.o(122065);
    while (true)
    {
      return paramap;
      if (paramar.dZh() == paramap.ekq())
      {
        if (paramap.ekp())
        {
          paramar = a.i.b.a.c.k.b.BIH;
          j.o(paramar, "LockBasedStorageManager.NO_LOCKS");
          paramap = (ap)new a.i.b.a.c.l.ar((w)new z(paramar, (a.f.a.a)new c.a(paramap)));
          AppMethodBeat.o(122065);
        }
        else
        {
          paramap = (ap)new a.i.b.a.c.l.ar(paramap.dZS());
          AppMethodBeat.o(122065);
        }
      }
      else
      {
        paramap = (ap)new a.i.b.a.c.l.ar(b(paramap));
        AppMethodBeat.o(122065);
      }
    }
  }

  public static final boolean ae(w paramw)
  {
    AppMethodBeat.i(122063);
    j.p(paramw, "receiver$0");
    boolean bool = paramw.ejw() instanceof b;
    AppMethodBeat.o(122063);
    return bool;
  }

  private static w b(ap paramap)
  {
    AppMethodBeat.i(122062);
    j.p(paramap, "typeProjection");
    paramap = (w)new a(paramap);
    AppMethodBeat.o(122062);
    return paramap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.a.a.c
 * JD-Core Version:    0.6.2
 */