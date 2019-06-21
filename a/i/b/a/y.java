package a.i.b.a;

import a.i.b.a.c.b.ac;
import a.i.b.a.c.b.ap;
import a.i.b.a.c.b.ap.a;
import a.i.b.a.c.b.c.v;
import a.i.b.a.c.c.a.b.a;
import a.i.b.a.c.d.a.a.f.a;
import a.i.b.a.c.d.a.c.c.b;
import a.i.b.a.c.d.a.k.a;
import a.i.b.a.c.d.b.d;
import a.i.b.a.c.d.b.s;
import a.i.b.a.c.j.a.h.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"moduleByClassLoader", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "Ljava/lang/ref/WeakReference;", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "clearModuleByClassLoaderCache", "", "getOrCreateModule", "Ljava/lang/Class;", "kotlin-reflect-api"})
public final class y
{
  private static final ConcurrentMap<ah, WeakReference<a.i.b.a.b.i>> AYu;

  static
  {
    AppMethodBeat.i(118896);
    AYu = (ConcurrentMap)new ConcurrentHashMap();
    AppMethodBeat.o(118896);
  }

  public static final a.i.b.a.b.i aQ(Class<?> paramClass)
  {
    AppMethodBeat.i(118895);
    a.f.b.j.p(paramClass, "receiver$0");
    Object localObject1 = a.i.b.a.e.b.aX(paramClass);
    ah localah = new ah((ClassLoader)localObject1);
    Object localObject2 = (WeakReference)AYu.get(localah);
    if (localObject2 != null)
    {
      paramClass = (a.i.b.a.b.i)((WeakReference)localObject2).get();
      if (paramClass != null)
      {
        a.f.b.j.o(paramClass, "it");
        AppMethodBeat.o(118895);
      }
    }
    while (true)
    {
      return paramClass;
      AYu.remove(localah, localObject2);
      paramClass = a.i.b.a.b.i.AZz;
      a.f.b.j.p(localObject1, "classLoader");
      Object localObject3 = new a.i.b.a.c.k.b();
      paramClass = new a.i.b.a.c.a.b.e((a.i.b.a.c.k.i)localObject3, (byte)0);
      localObject2 = a.i.b.a.c.f.f.avZ("<runtime module for " + localObject1 + '>');
      a.f.b.j.o(localObject2, "Name.special(\"<runtime module for $classLoader>\")");
      localObject2 = new v((a.i.b.a.c.f.f)localObject2, (a.i.b.a.c.k.i)localObject3, (a.i.b.a.c.a.g)paramClass, null, 56);
      Object localObject4 = new a.i.b.a.b.f((ClassLoader)localObject1);
      a.i.b.a.c.d.b.e locale = new a.i.b.a.c.d.b.e();
      a.i.b.a.c.d.a.c.l locall = new a.i.b.a.c.d.a.c.l();
      Object localObject5 = new a.i.b.a.b.j((ClassLoader)localObject1);
      Object localObject6 = a.i.b.a.c.d.a.a.g.Bmn;
      Object localObject7 = new a.i.b.a.c.b.aa((a.i.b.a.c.k.i)localObject3, (a.i.b.a.c.b.y)localObject2);
      Object localObject8 = new a.i.b.a.c.d.a.a((a.i.b.a.c.k.i)localObject3, a.i.b.a.c.n.e.BNe);
      a.i.b.a.c.k.i locali = (a.i.b.a.c.k.i)localObject3;
      Object localObject9 = (a.i.b.a.c.d.a.j)new a.i.b.a.b.c((ClassLoader)localObject1);
      Object localObject10 = (a.i.b.a.c.d.b.m)localObject4;
      localObject1 = a.i.b.a.c.d.a.a.k.Bmr;
      a.f.b.j.o(localObject1, "SignaturePropagator.DO_NOTHING");
      Object localObject11 = (a.i.b.a.c.j.a.m)a.i.b.a.b.h.AZw;
      a.f.b.j.o(localObject6, "javaResolverCache");
      localObject1 = new a.i.b.a.c.d.a.c.g(new a.i.b.a.c.d.a.c.b(locali, (a.i.b.a.c.d.a.j)localObject9, (a.i.b.a.c.d.b.m)localObject10, locale, (a.i.b.a.c.d.a.a.k)localObject1, (a.i.b.a.c.j.a.m)localObject11, (a.i.b.a.c.d.a.a.g)localObject6, (a.i.b.a.c.d.a.a.f)f.a.Bmm, (a.i.b.a.c.d.a.a.j)a.i.b.a.c.d.a.a.j.a.Bmq, (a.i.b.a.c.d.a.d.b)a.i.b.a.b.k.AZE, (a.i.b.a.c.d.a.c.j)locall, (s)localObject5, (ap)ap.a.BeT, (a.i.b.a.c.c.a.b)b.a.BjE, (a.i.b.a.c.b.y)localObject2, new a.i.b.a.c.a.i((a.i.b.a.c.b.y)localObject2, (a.i.b.a.c.b.aa)localObject7), (a.i.b.a.c.d.a.a)localObject8, new a.i.b.a.c.d.a.f.l((a.i.b.a.c.d.a.a)localObject8, a.i.b.a.c.n.e.BNe), (a.i.b.a.c.d.a.k)k.a.Ble, (a.i.b.a.c.d.a.c.c)c.b.Bnk));
      localObject8 = (a.i.b.a.c.b.y)localObject2;
      a.f.b.j.p(localObject8, "moduleDescriptor");
      if (paramClass.BdE == null);
      for (int i = 1; (a.aa.AUz) && (i == 0); i = 0)
      {
        paramClass = (Throwable)new AssertionError("JvmBuiltins repeated initialization");
        AppMethodBeat.o(118895);
        throw paramClass;
      }
      paramClass.BdE = ((a.i.b.a.c.b.y)localObject8);
      paramClass.BdF = true;
      localObject6 = new a.i.b.a.c.i.d.a((a.i.b.a.c.d.a.c.g)localObject1, (a.i.b.a.c.d.a.a.g)localObject6);
      localObject8 = new a.i.b.a.c.d.b.f((a.i.b.a.c.d.b.m)localObject4, locale);
      localObject4 = new a.i.b.a.c.d.b.c((a.i.b.a.c.b.y)localObject2, (a.i.b.a.c.b.aa)localObject7, (a.i.b.a.c.k.i)localObject3, (a.i.b.a.c.d.b.m)localObject4);
      locali = (a.i.b.a.c.k.i)localObject3;
      localObject10 = (a.i.b.a.c.b.y)localObject2;
      a.i.b.a.c.j.a.j localj = (a.i.b.a.c.j.a.j)a.i.b.a.c.j.a.j.a.BHa;
      localObject3 = (a.i.b.a.c.j.a.m)a.i.b.a.b.h.AZw;
      localObject11 = (a.i.b.a.c.c.a.b)b.a.BjE;
      localObject9 = a.i.b.a.c.j.a.h.BGL;
      localObject7 = new d(locali, (a.i.b.a.c.b.y)localObject10, localj, (a.i.b.a.c.d.b.f)localObject8, (a.i.b.a.c.d.b.c)localObject4, (a.i.b.a.c.d.a.c.g)localObject1, (a.i.b.a.c.b.aa)localObject7, (a.i.b.a.c.j.a.m)localObject3, (a.i.b.a.c.c.a.b)localObject11, h.a.ejQ());
      a.f.b.j.p(localObject6, "<set-?>");
      locall.BnE = ((a.i.b.a.c.i.d.a)localObject6);
      a.f.b.j.p(localObject7, "components");
      locale.Brl = ((d)localObject7).Brl;
      paramClass = paramClass.Bab;
      a.f.b.j.o(paramClass, "builtIns.builtInsModule");
      ((v)localObject2).a(new v[] { localObject2, paramClass });
      ((v)localObject2).a((ac)((a.i.b.a.c.i.d.a)localObject6).BFd);
      paramClass = new a.i.b.a.b.i(((d)localObject7).Brl, (a.i.b.a.b.j)localObject5, (byte)0);
      try
      {
        while (true)
        {
          localObject2 = AYu;
          localObject5 = new java/lang/ref/WeakReference;
          ((WeakReference)localObject5).<init>(paramClass);
          localObject5 = (WeakReference)((ConcurrentMap)localObject2).putIfAbsent(localah, localObject5);
          if (localObject5 == null)
          {
            localah.AYG = null;
            AppMethodBeat.o(118895);
            break;
          }
          localObject2 = (a.i.b.a.b.i)((WeakReference)localObject5).get();
          if (localObject2 != null)
          {
            localah.AYG = null;
            AppMethodBeat.o(118895);
            paramClass = (Class<?>)localObject2;
            break;
          }
          AYu.remove(localah, localObject5);
        }
      }
      finally
      {
        localah.AYG = null;
        AppMethodBeat.o(118895);
      }
    }
    throw paramClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.y
 * JD-Core Version:    0.6.2
 */