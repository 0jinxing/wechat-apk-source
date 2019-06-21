package a.i.b.a.c.d.b;

import a.aa;
import a.f.a.q;
import a.i.b.a.c.a.b.c.a;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.d.a.f.s;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.p;
import a.k.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class y
{
  private static a.i.b.a.c.l.w a(a.i.b.a.c.l.w paramw, HashSet<a.i.b.a.c.b.h> paramHashSet)
  {
    AppMethodBeat.i(120333);
    a.f.b.j.p(paramw, "kotlinType");
    a.f.b.j.p(paramHashSet, "visitedClassifiers");
    Object localObject = paramw.ejw().dYs();
    if (localObject == null)
    {
      paramw = (Throwable)new AssertionError("Type with a declaration expected: ".concat(String.valueOf(paramw)));
      AppMethodBeat.o(120333);
      throw paramw;
    }
    a.f.b.j.o(localObject, "kotlinType.constructor.d…n expected: $kotlinType\")");
    if (!paramHashSet.add(localObject))
    {
      AppMethodBeat.o(120333);
      paramw = null;
    }
    while (true)
    {
      return paramw;
      if ((localObject instanceof ar))
      {
        paramHashSet = a(c((ar)localObject), paramHashSet);
        if (paramHashSet != null)
        {
          if ((a.i.b.a.c.l.y.am(paramHashSet)) || (!paramw.eci()))
          {
            AppMethodBeat.o(120333);
            paramw = paramHashSet;
          }
          else
          {
            paramw = a.i.b.a.c.l.c.a.az(paramHashSet);
            AppMethodBeat.o(120333);
          }
        }
        else
        {
          AppMethodBeat.o(120333);
          paramw = null;
        }
      }
      else if (((localObject instanceof e)) && (((e)localObject).dYj()))
      {
        localObject = a.i.b.a.c.i.f.ac(paramw);
        if (localObject == null)
        {
          AppMethodBeat.o(120333);
          paramw = null;
        }
        else
        {
          paramHashSet = a((a.i.b.a.c.l.w)localObject, paramHashSet);
          if (paramHashSet == null)
          {
            AppMethodBeat.o(120333);
            paramw = null;
          }
          else if (!paramw.eci())
          {
            AppMethodBeat.o(120333);
            paramw = paramHashSet;
          }
          else if (a.i.b.a.c.l.y.am(paramHashSet))
          {
            AppMethodBeat.o(120333);
          }
          else if (g.p(paramHashSet))
          {
            AppMethodBeat.o(120333);
          }
          else
          {
            paramw = a.i.b.a.c.l.c.a.az(paramHashSet);
            AppMethodBeat.o(120333);
          }
        }
      }
      else
      {
        AppMethodBeat.o(120333);
      }
    }
  }

  private static final <T> T a(k<T> paramk, T paramT, boolean paramBoolean)
  {
    AppMethodBeat.i(120329);
    if (paramBoolean)
    {
      paramT = paramk.dJ(paramT);
      AppMethodBeat.o(120329);
    }
    while (true)
    {
      return paramT;
      AppMethodBeat.o(120329);
    }
  }

  private static <T> T a(a.i.b.a.c.l.w paramw, k<T> paramk, w paramw1, u<? extends T> paramu, h<T> paramh, q<? super a.i.b.a.c.l.w, ? super T, ? super w, a.y> paramq, boolean paramBoolean)
  {
    AppMethodBeat.i(120330);
    for (Object localObject1 = paramw; ; localObject1 = (a.i.b.a.c.l.w)a.i.b.a.c.a.k.F((a.i.b.a.c.l.w)localObject1))
    {
      a.f.b.j.p(localObject1, "kotlinType");
      a.f.b.j.p(paramk, "factory");
      a.f.b.j.p(paramw1, "mode");
      a.f.b.j.p(paramu, "typeMappingConfiguration");
      a.f.b.j.p(paramq, "writeGenericType");
      if (!a.i.b.a.c.a.f.e((a.i.b.a.c.l.w)localObject1))
        break;
    }
    Object localObject2 = ((a.i.b.a.c.l.w)localObject1).ejw().dYs();
    paramw = (a.i.b.a.c.l.w)localObject2;
    if (!(localObject2 instanceof e))
      paramw = null;
    paramw = (e)paramw;
    if (paramw == null)
    {
      label95: paramw = null;
      label97: if (paramw == null)
        break label475;
      paramw = a(paramk, paramw, paramw1.BrM);
      paramq.g(localObject1, paramw, paramw1);
      AppMethodBeat.o(120330);
    }
    while (true)
    {
      return paramw;
      if (paramw == a.i.b.a.c.a.k.dXU())
      {
        paramw = paramk.avN(rM(false));
        break label97;
      }
      if (a.f.b.j.j(paramw, a.i.b.a.c.a.k.dXV()))
      {
        paramw = paramk.avN(rM(true));
        break label97;
      }
      localObject2 = g.d((l)paramw);
      if (localObject2 != null)
      {
        paramw = a.i.b.a.c.i.d.c.d((a.i.b.a.c.a.h)localObject2);
        a.f.b.j.o(paramw, "JvmPrimitiveType.get(primitiveType)");
        paramw = paramw.desc;
        a.f.b.j.o(paramw, "JvmPrimitiveType.get(primitiveType).desc");
        paramw = paramk.avM(paramw);
        if ((av.aB((a.i.b.a.c.l.w)localObject1)) || (s.U((a.i.b.a.c.l.w)localObject1)));
        for (boolean bool = true; ; bool = false)
        {
          paramw = a(paramk, paramw, bool);
          break;
        }
      }
      localObject2 = g.e((l)paramw);
      if (localObject2 != null)
      {
        paramw = new StringBuilder("[");
        localObject2 = a.i.b.a.c.i.d.c.d((a.i.b.a.c.a.h)localObject2);
        a.f.b.j.o(localObject2, "JvmPrimitiveType.get(arrayElementType)");
        paramw = paramk.avM(((a.i.b.a.c.i.d.c)localObject2).desc);
        break label97;
      }
      if (!g.c((l)paramw))
        break label95;
      localObject2 = a.i.b.a.c.a.b.c.Bdq;
      paramw = a.i.b.a.c.a.b.c.c(a.i.b.a.c.i.c.a.q((l)paramw));
      if (paramw == null)
        break label95;
      if (!paramw1.BrR)
      {
        localObject2 = a.i.b.a.c.a.b.c.Bdq;
        localObject2 = (Iterable)a.i.b.a.c.a.b.c.dYB();
        if (((localObject2 instanceof Collection)) && (((Collection)localObject2).isEmpty()))
          break label469;
        localObject2 = ((Iterable)localObject2).iterator();
        do
          if (!((Iterator)localObject2).hasNext())
            break;
        while (!a.f.b.j.j(((c.a)((Iterator)localObject2).next()).Bdr, paramw));
      }
      label469: for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label473;
        paramw = a.i.b.a.c.i.d.b.h(paramw);
        a.f.b.j.o(paramw, "JvmClassName.byClassId(classId)");
        paramw = paramw.BrD;
        a.f.b.j.o(paramw, "JvmClassName.byClassId(classId).internalName");
        paramw = paramk.avN(paramw);
        break;
      }
      label473: break label95;
      label475: paramw = ((a.i.b.a.c.l.w)localObject1).ejw();
      if ((paramw instanceof a.i.b.a.c.l.v))
      {
        paramw = ((a.i.b.a.c.l.v)paramw).BJH;
        a.f.b.j.o(paramw, "constructor.supertypes");
        localObject1 = a.i.b.a.c.l.c.a.aN(paramu.m(paramw));
        break;
      }
      localObject2 = paramw.dYs();
      if (localObject2 == null)
      {
        paramw = (Throwable)new UnsupportedOperationException("no descriptor for type constructor of ".concat(String.valueOf(localObject1)));
        AppMethodBeat.o(120330);
        throw paramw;
      }
      a.f.b.j.o(localObject2, "constructor.declarationD…structor of $kotlinType\")");
      if (p.L((l)localObject2))
      {
        paramw = paramk.avN("error/NonExistentClass");
        if (localObject2 == null)
        {
          paramw = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
          AppMethodBeat.o(120330);
          throw paramw;
        }
        paramu.a((a.i.b.a.c.l.w)localObject1, (e)localObject2);
        if (paramh != null)
          paramh.dH(paramw);
        AppMethodBeat.o(120330);
      }
      else if (((localObject2 instanceof e)) && (g.n((a.i.b.a.c.l.w)localObject1)))
      {
        if (((a.i.b.a.c.l.w)localObject1).ejt().size() != 1)
        {
          paramw = (Throwable)new UnsupportedOperationException("arrays must have one type argument");
          AppMethodBeat.o(120330);
          throw paramw;
        }
        paramw = (ap)((a.i.b.a.c.l.w)localObject1).ejt().get(0);
        localObject2 = paramw.dZS();
        a.f.b.j.o(localObject2, "memberProjection.type");
        if (paramw.ekq() == ba.BKi)
        {
          paramw1 = paramk.avN("java/lang/Object");
          paramw = paramw1;
          if (paramh != null)
          {
            paramh.ecs();
            paramh.dH(paramw1);
            paramw = paramw1;
          }
          paramw = paramk.avM("[" + paramk.toString(paramw));
          AppMethodBeat.o(120330);
        }
        else
        {
          if (paramh != null)
            paramh.ecs();
          paramw = paramw.ekq();
          a.f.b.j.o(paramw, "memberProjection.projectionKind");
          a.f.b.j.p(paramw, "effectiveVariance");
          switch (x.eQZ[paramw.ordinal()])
          {
          default:
            localObject1 = paramw1.BrQ;
            paramw = (a.i.b.a.c.l.w)localObject1;
            if (localObject1 == null)
              paramw = paramw1;
            break;
          case 1:
          case 2:
          }
          while (true)
          {
            paramw = a((a.i.b.a.c.l.w)localObject2, paramk, paramw, paramu, paramh, paramq, paramBoolean);
            break;
            localObject1 = paramw1.BrS;
            paramw = (a.i.b.a.c.l.w)localObject1;
            if (localObject1 == null)
            {
              paramw = paramw1;
              continue;
              localObject1 = paramw1.BrT;
              paramw = (a.i.b.a.c.l.w)localObject1;
              if (localObject1 == null)
                paramw = paramw1;
            }
          }
        }
      }
      else
      {
        if ((localObject2 instanceof e))
        {
          if ((((e)localObject2).dYj()) && (!paramw1.BrN))
          {
            a.f.b.j.p(localObject1, "inlineClassType");
            paramw = a((a.i.b.a.c.l.w)localObject1, new HashSet());
            if (paramw != null)
            {
              paramw1 = new w(paramw1.BrM, true, paramw1.BoY, paramw1.BrO, paramw1.BrP, paramw1.BrQ, paramw1.BrR, paramw1.BrS, paramw1.BrT);
              localObject1 = paramw;
              break;
            }
          }
          if ((paramw1.BoY) && (g.g((e)localObject2)))
          {
            paramw = paramk.ecu();
            paramq.g(localObject1, paramw, paramw1);
            AppMethodBeat.o(120330);
            continue;
          }
          paramw = ((e)localObject2).dZm();
          a.f.b.j.o(paramw, "descriptor.original");
          paramu.t(paramw);
          if (((e)localObject2).dYc() == a.i.b.a.c.b.f.Beu)
          {
            paramw = ((e)localObject2).dXW();
            if (paramw == null)
            {
              paramw = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
              AppMethodBeat.o(120330);
              throw paramw;
            }
          }
          for (paramw = (e)paramw; ; paramw = (e)localObject2)
          {
            paramw = paramw.dZm();
            a.f.b.j.o(paramw, "enumClassIfEnumEntry.original");
            paramw = paramk.avN(a(paramw, paramu, paramBoolean));
            break;
          }
        }
        if (!(localObject2 instanceof ar))
          break label1282;
        paramw = a(c((ar)localObject2), paramk, paramw1, paramu, null, a.i.b.a.c.n.d.ekw(), paramBoolean);
        if (paramh != null)
        {
          paramk = ((a.i.b.a.c.b.h)localObject2).dZg();
          a.f.b.j.o(paramk, "descriptor.getName()");
          a.f.b.j.p(paramk, "name");
          a.f.b.j.p(paramw, "type");
          paramh.dI(paramw);
        }
        AppMethodBeat.o(120330);
      }
    }
    label1282: paramw = (Throwable)new UnsupportedOperationException("Unknown type ".concat(String.valueOf(localObject1)));
    AppMethodBeat.o(120330);
    throw paramw;
  }

  public static final String a(e parame, u<?> paramu, boolean paramBoolean)
  {
    AppMethodBeat.i(120334);
    a.f.b.j.p(parame, "klass");
    a.f.b.j.p(paramu, "typeMappingConfiguration");
    l locall;
    String str;
    if (paramBoolean)
    {
      locall = i(parame.dXW());
      localObject = a.i.b.a.c.f.h.w(parame.dZg());
      a.f.b.j.o(localObject, "SpecialNames.safeIdentifier(klass.name)");
      str = ((a.i.b.a.c.f.f)localObject).ehN();
      a.f.b.j.o(str, "SpecialNames.safeIdentifier(klass.name).identifier");
      if (!(locall instanceof ab))
        break label176;
      paramu = ((ab)locall).dZF();
      if (!paramu.ByQ.ByV.isEmpty())
        break label118;
      AppMethodBeat.o(120334);
      parame = str;
    }
    while (true)
    {
      return parame;
      locall = parame.dXW();
      break;
      label118: parame = new StringBuilder();
      paramu = paramu.ByQ.ByV;
      a.f.b.j.o(paramu, "fqName.asString()");
      parame = m.a(paramu, '.', '/') + '/' + str;
      AppMethodBeat.o(120334);
    }
    label176: if (!(locall instanceof e));
    for (Object localObject = null; ; localObject = locall)
    {
      localObject = (e)localObject;
      if (localObject == null)
      {
        parame = (Throwable)new IllegalArgumentException("Unexpected container: " + locall + " for " + parame);
        AppMethodBeat.o(120334);
        throw parame;
      }
      paramu.u((e)localObject);
      parame = a((e)localObject, paramu, paramBoolean);
      parame = parame + '$' + str;
      AppMethodBeat.o(120334);
      break;
    }
  }

  private static a.i.b.a.c.l.w c(ar paramar)
  {
    AppMethodBeat.i(120336);
    a.f.b.j.p(paramar, "descriptor");
    List localList = paramar.dWP();
    a.f.b.j.o(localList, "descriptor.upperBounds");
    if (!localList.isEmpty());
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramar = (Throwable)new AssertionError("Upper bounds should not be empty: ".concat(String.valueOf(paramar)));
      AppMethodBeat.o(120336);
      throw paramar;
    }
    Iterator localIterator = ((Iterable)localList).iterator();
    Object localObject;
    if (localIterator.hasNext())
    {
      localObject = localIterator.next();
      a.i.b.a.c.b.h localh = ((a.i.b.a.c.l.w)localObject).ejw().dYs();
      paramar = localh;
      if (!(localh instanceof e))
        paramar = null;
      paramar = (e)paramar;
      if (paramar == null)
      {
        label146: i = 0;
        label148: if (i == 0)
          break label221;
      }
    }
    for (paramar = (ar)localObject; ; paramar = null)
    {
      localObject = (a.i.b.a.c.l.w)paramar;
      paramar = (ar)localObject;
      if (localObject == null)
      {
        paramar = a.a.j.fJ(localList);
        a.f.b.j.o(paramar, "upperBounds.first()");
        paramar = (a.i.b.a.c.l.w)paramar;
      }
      AppMethodBeat.o(120336);
      return paramar;
      if ((paramar.dYc() == a.i.b.a.c.b.f.Bes) || (paramar.dYc() == a.i.b.a.c.b.f.Bev))
        break label146;
      i = 1;
      break label148;
      label221: break;
    }
  }

  private static final l i(l paraml)
  {
    Object localObject1 = null;
    AppMethodBeat.i(120335);
    if (!(paraml instanceof e));
    for (Object localObject2 = null; ; localObject2 = paraml)
    {
      localObject2 = (e)localObject2;
      if (localObject2 != null)
      {
        localObject2 = (l)localObject2;
        if (localObject2 != null)
          break label71;
        localObject2 = localObject1;
        if (paraml == null)
          break label71;
        paraml = paraml.dXW();
        break;
      }
      if (!(paraml instanceof ab));
      for (localObject2 = null; ; localObject2 = paraml)
      {
        localObject2 = (l)localObject2;
        break;
        label71: AppMethodBeat.o(120335);
        return localObject2;
      }
    }
  }

  private static final String rM(boolean paramBoolean)
  {
    AppMethodBeat.i(120332);
    if (paramBoolean);
    for (Object localObject = a.i.b.a.c.i.d.BDW; ; localObject = a.i.b.a.c.i.d.BDV)
    {
      localObject = a.i.b.a.c.i.d.b.h(a.i.b.a.c.f.a.n((a.i.b.a.c.f.b)localObject));
      a.f.b.j.o(localObject, "JvmClassName.byClassId(ClassId.topLevel(fqName))");
      localObject = ((a.i.b.a.c.i.d.b)localObject).BrD;
      a.f.b.j.o(localObject, "JvmClassName.byClassId(C…vel(fqName)).internalName");
      AppMethodBeat.o(120332);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.y
 * JD-Core Version:    0.6.2
 */