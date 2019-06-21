package a.i.b;

import a.i.b;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.f;
import a.i.b.a.c.b.h;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.w;
import a.i.b.a.u;
import a.i.b.a.x;
import a.i.c;
import a.i.o;
import a.i.p;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "getJvmErasure", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "jvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "kotlin-reflect-api"})
public final class a
{
  public static final b<?> a(c paramc)
  {
    AppMethodBeat.i(118655);
    a.f.b.j.p(paramc, "receiver$0");
    if ((paramc instanceof b))
    {
      paramc = (b)paramc;
      AppMethodBeat.o(118655);
    }
    while (true)
    {
      return paramc;
      if ((paramc instanceof p))
      {
        List localList = ((p)paramc).dWP();
        Iterator localIterator = ((Iterable)localList).iterator();
        label57: Object localObject;
        int i;
        if (localIterator.hasNext())
        {
          localObject = localIterator.next();
          paramc = (o)localObject;
          if (paramc == null)
          {
            paramc = new a.v("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            AppMethodBeat.o(118655);
            throw paramc;
          }
          h localh = ((u)paramc).AYl.ejw().dYs();
          paramc = localh;
          if (!(localh instanceof e))
            paramc = null;
          paramc = (e)paramc;
          if ((paramc != null) && (paramc.dYc() != f.Bes) && (paramc.dYc() != f.Bev))
          {
            i = 1;
            label165: if (i == 0)
              break label222;
          }
        }
        for (paramc = (c)localObject; ; paramc = null)
        {
          localObject = (o)paramc;
          paramc = (c)localObject;
          if (localObject == null)
            paramc = (o)a.a.j.fK(localList);
          if (paramc != null)
          {
            paramc = a(paramc);
            if (paramc != null)
              break label256;
          }
          paramc = a.f.b.v.aN(Object.class);
          AppMethodBeat.o(118655);
          break;
          i = 0;
          break label165;
          label222: break label57;
        }
      }
      paramc = (Throwable)new x("Cannot calculate JVM erasure for type: ".concat(String.valueOf(paramc)));
      AppMethodBeat.o(118655);
      throw paramc;
      label256: AppMethodBeat.o(118655);
    }
  }

  private static b<?> a(o paramo)
  {
    AppMethodBeat.i(118654);
    a.f.b.j.p(paramo, "receiver$0");
    Object localObject = paramo.dWO();
    if (localObject != null)
    {
      localObject = a((c)localObject);
      if (localObject != null);
    }
    else
    {
      paramo = (Throwable)new x("Cannot calculate JVM erasure for type: ".concat(String.valueOf(paramo)));
      AppMethodBeat.o(118654);
      throw paramo;
    }
    AppMethodBeat.o(118654);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a
 * JD-Core Version:    0.6.2
 */