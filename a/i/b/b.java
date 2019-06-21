package a.i.b;

import a.f.a.m;
import a.i.b.a.af;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.t;
import a.i.b.a.c.e.a.ag;
import a.i.b.a.c.e.a.o;
import a.i.b.a.c.e.b.a.g;
import a.i.b.a.c.g.q;
import a.i.b.a.i;
import a.i.e;
import a.l;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflect-api"})
public final class b
{
  public static final <R> e<R> a(a.c<? extends R> paramc)
  {
    AppMethodBeat.i(118659);
    a.f.b.j.p(paramc, "receiver$0");
    Object localObject1 = (l)paramc.getClass().getAnnotation(l.class);
    if (localObject1 == null)
    {
      AppMethodBeat.o(118659);
      paramc = null;
    }
    while (true)
    {
      return paramc;
      Object localObject2 = ((l)localObject1).dWp();
      int i;
      if (localObject2.length == 0)
      {
        i = 1;
        label51: if (i != 0)
          break label74;
      }
      while (true)
      {
        if (localObject2 != null)
          break label79;
        AppMethodBeat.o(118659);
        paramc = null;
        break;
        i = 0;
        break label51;
        label74: localObject2 = null;
      }
      label79: localObject2 = a.i.b.a.c.e.b.a.j.f((String[])localObject2, ((l)localObject1).dWq());
      Object localObject3 = (a.i.b.a.c.e.b.a.h)((o)localObject2).first;
      localObject2 = (a.o)((o)localObject2).second;
      Object localObject4 = ((l)localObject1).dWo();
      if ((((l)localObject1).dWr() & 0x8) != 0);
      for (boolean bool = true; ; bool = false)
      {
        localObject1 = new g((int[])localObject4, bool);
        paramc = paramc.getClass();
        localObject4 = (q)localObject2;
        localObject3 = (a.i.b.a.c.e.a.c)localObject3;
        localObject2 = ((a.o)localObject2).BtC;
        a.f.b.j.o(localObject2, "proto.typeTable");
        paramc = (al)af.a(paramc, (q)localObject4, (a.i.b.a.c.e.a.c)localObject3, new a.i.b.a.c.e.a.h((a.ag)localObject2), (a.i.b.a.c.e.a.a)localObject1, (m)b.a.AWd);
        if (paramc != null)
          break label221;
        AppMethodBeat.o(118659);
        paramc = null;
        break;
      }
      label221: paramc = (e)new a.i.b.a.j((i)a.i.b.a.a.AWe, (t)paramc);
      AppMethodBeat.o(118659);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.b
 * JD-Core Version:    0.6.2
 */