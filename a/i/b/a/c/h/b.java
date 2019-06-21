package a.i.b.a.c.h;

import a.a.ai;
import a.f.b.j;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.h;
import a.i.b.a.c.b.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public abstract interface b
{
  public abstract String a(h paramh, c paramc);

  public static final class b
    implements b
  {
    public static final b BBE;

    static
    {
      AppMethodBeat.i(121702);
      BBE = new b();
      AppMethodBeat.o(121702);
    }

    public final String a(h paramh, c paramc)
    {
      AppMethodBeat.i(121701);
      j.p(paramh, "classifier");
      j.p(paramc, "renderer");
      if ((paramh instanceof ar))
      {
        paramh = ((ar)paramh).dZg();
        j.o(paramh, "classifier.name");
        paramh = paramc.b(paramh, false);
        AppMethodBeat.o(121701);
      }
      while (true)
      {
        return paramh;
        ArrayList localArrayList = new ArrayList();
        paramh = (l)paramh;
        do
        {
          localArrayList.add(paramh.dZg());
          paramc = paramh.dXW();
          paramh = paramc;
        }
        while ((paramc instanceof e));
        paramh = (List)localArrayList;
        j.p(paramh, "receiver$0");
        paramh = q.fZ((List)new ai(paramh));
        AppMethodBeat.o(121701);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.h.b
 * JD-Core Version:    0.6.2
 */