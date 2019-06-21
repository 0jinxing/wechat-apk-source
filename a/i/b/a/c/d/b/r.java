package a.i.b.a.c.d.b;

import a.i.b.a.c.a.g;
import a.i.b.a.c.a.g.a;
import a.i.b.a.c.b.ai;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.e;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.d.c;
import a.i.b.a.c.l.av;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public final class r
{
  public static final j V(a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(120305);
    a.f.b.j.p(paramw, "receiver$0");
    paramw = (j)y.a(paramw, (k)l.BrF, w.BrW, (u)v.BrL);
    AppMethodBeat.o(120305);
    return paramw;
  }

  private static String a(a.i.b.a.c.b.t paramt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(120300);
    a.f.b.j.p(paramt, "receiver$0");
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject1;
    if (paramBoolean2)
    {
      if (!(paramt instanceof a.i.b.a.c.b.k))
        break label115;
      localObject1 = "<init>";
    }
    Object localObject2;
    while (true)
    {
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append("(");
      localObject1 = paramt.dYV().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (au)((Iterator)localObject1).next();
        a.f.b.j.o(localObject2, "parameter");
        localObject2 = ((au)localObject2).dZS();
        a.f.b.j.o(localObject2, "parameter.type");
        a(localStringBuilder, (a.i.b.a.c.l.w)localObject2);
      }
      label115: localObject1 = paramt.dZg().name;
      a.f.b.j.o(localObject1, "name.asString()");
    }
    localStringBuilder.append(")");
    int i;
    if (paramBoolean1)
    {
      localObject1 = (a.i.b.a.c.b.a)paramt;
      a.f.b.j.p(localObject1, "descriptor");
      if (!(localObject1 instanceof a.i.b.a.c.b.k))
        break label201;
      i = 1;
      if (i == 0)
        break label271;
      localStringBuilder.append("V");
    }
    while (true)
    {
      paramt = localStringBuilder.toString();
      a.f.b.j.o(paramt, "StringBuilder().apply(builderAction).toString()");
      AppMethodBeat.o(120300);
      return paramt;
      label201: localObject2 = ((a.i.b.a.c.b.a)localObject1).dYT();
      if (localObject2 == null)
        a.f.b.j.dWJ();
      if (g.D((a.i.b.a.c.l.w)localObject2))
      {
        localObject2 = ((a.i.b.a.c.b.a)localObject1).dYT();
        if (localObject2 == null)
          a.f.b.j.dWJ();
        if ((!av.aB((a.i.b.a.c.l.w)localObject2)) && (!(localObject1 instanceof ai)))
        {
          i = 1;
          break;
        }
      }
      i = 0;
      break;
      label271: paramt = paramt.dYT();
      if (paramt == null)
        a.f.b.j.dWJ();
      a.f.b.j.o(paramt, "returnType!!");
      a(localStringBuilder, paramt);
    }
  }

  private static final void a(StringBuilder paramStringBuilder, a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(120304);
    paramStringBuilder.append(V(paramw));
    AppMethodBeat.o(120304);
  }

  public static final boolean b(a.i.b.a.c.b.a parama)
  {
    Object localObject1 = null;
    AppMethodBeat.i(120302);
    a.f.b.j.p(parama, "f");
    boolean bool;
    if (!(parama instanceof a.i.b.a.c.b.t))
    {
      AppMethodBeat.o(120302);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((((a.i.b.a.c.b.t)parama).dYV().size() != 1) || (a.i.b.a.c.d.a.t.s((a.i.b.a.c.b.b)parama)) || ((a.f.b.j.j(((a.i.b.a.c.b.t)parama).dZg().name, "remove") ^ true)))
      {
        AppMethodBeat.o(120302);
        bool = false;
      }
      else
      {
        Object localObject2 = ((a.i.b.a.c.b.t)parama).dZp();
        a.f.b.j.o(localObject2, "f.original");
        localObject2 = ((a.i.b.a.c.b.t)localObject2).dYV();
        a.f.b.j.o(localObject2, "f.original.valueParameters");
        localObject2 = a.a.j.fN((List)localObject2);
        a.f.b.j.o(localObject2, "f.original.valueParameters.single()");
        localObject2 = ((au)localObject2).dZS();
        a.f.b.j.o(localObject2, "f.original.valueParameters.single().type");
        Object localObject3 = V((a.i.b.a.c.l.w)localObject2);
        localObject2 = localObject3;
        if (!(localObject3 instanceof j.c))
          localObject2 = null;
        localObject3 = (j.c)localObject2;
        localObject2 = localObject1;
        if (localObject3 != null)
          localObject2 = ((j.c)localObject3).BrE;
        if (localObject2 != c.BFi)
        {
          AppMethodBeat.o(120302);
          bool = false;
        }
        else
        {
          parama = a.i.b.a.c.d.a.d.e((a.i.b.a.c.b.t)parama);
          if (parama == null)
          {
            AppMethodBeat.o(120302);
            bool = false;
          }
          else
          {
            localObject2 = parama.dZp();
            a.f.b.j.o(localObject2, "overridden.original");
            localObject2 = ((a.i.b.a.c.b.t)localObject2).dYV();
            a.f.b.j.o(localObject2, "overridden.original.valueParameters");
            localObject2 = a.a.j.fN((List)localObject2);
            a.f.b.j.o(localObject2, "overridden.original.valueParameters.single()");
            localObject2 = ((au)localObject2).dZS();
            a.f.b.j.o(localObject2, "overridden.original.valueParameters.single().type");
            localObject2 = V((a.i.b.a.c.l.w)localObject2);
            parama = parama.dXW();
            a.f.b.j.o(parama, "overridden.containingDeclaration");
            if ((a.f.b.j.j(a.i.b.a.c.i.c.a.q(parama), g.Bag.Bbi.ByQ)) && ((localObject2 instanceof j.b)) && (a.f.b.j.j(((j.b)localObject2).BrD, "java/lang/Object")))
            {
              AppMethodBeat.o(120302);
              bool = true;
            }
            else
            {
              AppMethodBeat.o(120302);
              bool = false;
            }
          }
        }
      }
    }
  }

  public static final String c(a.i.b.a.c.b.a parama)
  {
    Object localObject1 = null;
    AppMethodBeat.i(120303);
    a.f.b.j.p(parama, "receiver$0");
    Object localObject2 = t.BrJ;
    if (a.i.b.a.c.i.d.m((a.i.b.a.c.b.l)parama))
    {
      AppMethodBeat.o(120303);
      parama = localObject1;
    }
    while (true)
    {
      return parama;
      Object localObject3 = parama.dXW();
      localObject2 = localObject3;
      if (!(localObject3 instanceof e))
        localObject2 = null;
      localObject3 = (e)localObject2;
      if (localObject3 == null)
      {
        AppMethodBeat.o(120303);
        parama = localObject1;
      }
      else
      {
        localObject2 = ((e)localObject3).dZg();
        a.f.b.j.o(localObject2, "classDescriptor.name");
        if (((f)localObject2).ByZ)
        {
          AppMethodBeat.o(120303);
          parama = localObject1;
        }
        else
        {
          localObject2 = parama.dYU();
          parama = (a.i.b.a.c.b.a)localObject2;
          if (!(localObject2 instanceof al))
            parama = null;
          parama = (al)parama;
          if (parama == null)
          {
            AppMethodBeat.o(120303);
            parama = localObject1;
          }
          else
          {
            parama = t.a((e)localObject3, a((a.i.b.a.c.b.t)parama, false, false, 3));
            AppMethodBeat.o(120303);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.r
 * JD-Core Version:    0.6.2
 */