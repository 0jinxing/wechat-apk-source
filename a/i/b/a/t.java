package a.i.b.a;

import a.aa;
import a.i.b.a.a.e;
import a.i.b.a.a.e.f;
import a.i.b.a.a.e.f.a;
import a.i.b.a.a.e.f.b;
import a.i.b.a.a.e.f.c;
import a.i.b.a.a.e.f.d;
import a.i.b.a.a.e.f.e;
import a.i.b.a.a.e.f.f;
import a.i.b.a.a.h;
import a.i.b.a.c.b.b;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.b.a.f.b;
import a.i.b.a.c.e.b.b.c;
import a.i.b.a.c.e.b.b.e;
import a.k.k;
import a.l;
import a.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"computeCallerForAccessor", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "isGetter", "", "isJvmFieldPropertyInCompanionObject", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "kotlin-reflect-api"})
public final class t
{
  static final a.i.b.a.a.d<?> a(s.a<?, ?> parama, boolean paramBoolean)
  {
    AppMethodBeat.i(118870);
    Object localObject1 = i.AXg;
    if (i.dXd().aq((CharSequence)parama.dXg().signature))
    {
      parama = (a.i.b.a.a.d)a.i.b.a.a.i.AZo;
      AppMethodBeat.o(118870);
      return parama;
    }
    t.a locala = new t.a(parama);
    Object localObject2 = new t.c(parama, paramBoolean, new t.b(parama), locala);
    localObject1 = ad.AYC;
    d locald = ad.c(parama.dXg().dXp());
    if ((locald instanceof d.c))
    {
      localObject1 = ((d.c)locald).AWp;
      if (paramBoolean)
        if (((b.e)localObject1).egY())
        {
          localObject1 = ((b.e)localObject1).BxS;
          if (localObject1 == null)
            break label257;
          localObject1 = parama.dXg().AXs.H(((d.c)locald).AWq.getString(((b.c)localObject1).Buf), ((d.c)locald).AWq.getString(((b.c)localObject1).BxN), af.c((b)parama.dXq()));
        }
      while (true)
        if (localObject1 == null)
        {
          localObject1 = parama.dXg().dXn();
          if (localObject1 == null)
          {
            parama = (Throwable)new x("No accessors or field is found for property " + parama.dXg());
            AppMethodBeat.o(118870);
            throw parama;
            localObject1 = null;
            break;
            if (((b.e)localObject1).egZ())
            {
              localObject1 = ((b.e)localObject1).BxT;
              break;
            }
            localObject1 = null;
            break;
            label257: localObject1 = null;
            continue;
          }
          localObject1 = ((t.c)localObject2).c((Field)localObject1);
        }
    }
    while (true)
    {
      parama = h.a((e)localObject1, (b)parama.dXq());
      AppMethodBeat.o(118870);
      break;
      if (!Modifier.isStatic(((Method)localObject1).getModifiers()))
      {
        if (parama.dXg().isBound());
        for (localObject1 = (e.f)new e.f.a((Method)localObject1, parama.dXg().AXt); ; localObject1 = (e.f)new e.f.d((Method)localObject1))
        {
          localObject1 = (e)localObject1;
          break;
        }
      }
      if (locala.gF())
      {
        if (parama.dXg().isBound());
        for (localObject1 = (e.f)new e.f.b((Method)localObject1); ; localObject1 = (e.f)new e.f.e((Method)localObject1))
        {
          localObject1 = (e)localObject1;
          break;
        }
      }
      if (parama.dXg().isBound());
      for (localObject1 = (e.f)new e.f.c((Method)localObject1, parama.dXg().AXt); ; localObject1 = (e.f)new e.f.f((Method)localObject1))
      {
        localObject1 = (e)localObject1;
        break;
      }
      if (!(locald instanceof d.a))
        break label480;
      localObject1 = ((t.c)localObject2).c(((d.a)locald).eum);
    }
    label480: if ((locald instanceof d.b))
      if (paramBoolean)
        localObject1 = ((d.b)locald).AWl;
    label901: 
    while (true)
    {
      if (parama.dXg().isBound());
      for (localObject1 = (e.f)new e.f.a((Method)localObject1, parama.dXg().AXt); ; localObject1 = (e.f)new e.f.d((Method)localObject1))
      {
        localObject1 = (e)localObject1;
        break;
        localObject1 = ((d.b)locald).AWm;
        if (localObject1 != null)
          break label901;
        parama = (Throwable)new x("No source found for setter of Java method property: " + ((d.b)locald).AWl);
        AppMethodBeat.o(118870);
        throw parama;
      }
      if ((locald instanceof d.d))
      {
        if (paramBoolean)
          localObject1 = ((d.d)locald).AWs;
        do
        {
          localObject1 = parama.dXg().AXs.H(((c.e)localObject1).AWk.name, ((c.e)localObject1).AWk.desc, af.c((b)parama.dXq()));
          if (localObject1 != null)
            break;
          parama = (Throwable)new x("No accessor found for property " + parama.dXg());
          AppMethodBeat.o(118870);
          throw parama;
          localObject2 = ((d.d)locald).AWt;
          localObject1 = localObject2;
        }
        while (localObject2 != null);
        parama = (Throwable)new x("No setter found for property " + parama.dXg());
        AppMethodBeat.o(118870);
        throw parama;
        if (!Modifier.isStatic(((Method)localObject1).getModifiers()));
        for (int i = 1; (aa.AUz) && (i == 0); i = 0)
        {
          parama = (Throwable)new AssertionError("Mapped property cannot have a static accessor: " + parama.dXg());
          AppMethodBeat.o(118870);
          throw parama;
        }
        if (parama.dXg().isBound())
        {
          parama = (a.i.b.a.a.d)new e.f.a((Method)localObject1, parama.dXg().AXt);
          AppMethodBeat.o(118870);
          break;
        }
        parama = (a.i.b.a.a.d)new e.f.d((Method)localObject1);
        AppMethodBeat.o(118870);
        break;
      }
      parama = new m();
      AppMethodBeat.o(118870);
      throw parama;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.t
 * JD-Core Version:    0.6.2
 */