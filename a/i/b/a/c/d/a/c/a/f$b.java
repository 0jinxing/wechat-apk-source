package a.i.b.a.c.d.a.c.a;

import a.a.ab;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.aa.b;
import a.i.b.a.c.b.ap;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.y;
import a.i.b.a.c.d.a.a.l;
import a.i.b.a.c.d.a.p;
import a.i.b.a.c.i.b.s;
import a.i.b.a.c.j.a.m;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ao;
import a.i.b.a.c.l.au;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class f$b extends a.i.b.a.c.l.b
{
  private final a.i.b.a.c.k.f<List<a.i.b.a.c.b.ar>> Bod;

  public f$b()
  {
    super(f.b(localf).Bnv.Baf);
    AppMethodBeat.i(119893);
    this.Bod = f.b(localf).Bnv.Baf.i((a.f.a.a)new f.b.a(this));
    AppMethodBeat.o(119893);
  }

  private final w ebs()
  {
    Object localObject1 = null;
    AppMethodBeat.i(119890);
    Object localObject2 = this.Boe.dYn();
    Object localObject3 = p.Blu;
    a.f.b.j.o(localObject3, "JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION");
    localObject2 = ((a.i.b.a.c.b.a.g)localObject2).i((a.i.b.a.c.f.b)localObject3);
    int i;
    if (localObject2 == null)
    {
      localObject2 = null;
      if (localObject2 == null)
        break label320;
      if ((((a.i.b.a.c.f.b)localObject2).ByQ.ByV.isEmpty()) || (!((a.i.b.a.c.f.b)localObject2).r(a.i.b.a.c.a.g.AZU)))
        break label309;
      i = 1;
      label69: if (i == 0)
        break label315;
      label74: if (localObject2 != null)
        break label693;
      localObject3 = a.i.b.a.c.d.a.i.Bld;
    }
    label263: label271: label284: label297: label683: label693: for (localObject3 = a.i.b.a.c.d.a.i.k(a.i.b.a.c.i.c.a.o(this.Boe)); ; localObject3 = localObject2)
    {
      if (localObject3 == null)
      {
        AppMethodBeat.o(119890);
        localObject2 = localObject1;
      }
      while (true)
      {
        return localObject2;
        localObject3 = a.a.j.i((Iterable)((a.i.b.a.c.b.a.c)localObject2).eah().values());
        localObject2 = localObject3;
        if (!(localObject3 instanceof s))
          localObject2 = null;
        localObject2 = (s)localObject2;
        if (localObject2 != null)
        {
          localObject3 = (String)((s)localObject2).getValue();
          if (localObject3 != null);
        }
        else
        {
          localObject2 = null;
          break;
        }
        int j;
        if (localObject3 != null)
        {
          localObject2 = a.i.b.a.c.f.i.Bzh;
          j = ((String)localObject3).length();
          i = 0;
          if (i >= j)
            break label284;
          char c = ((String)localObject3).charAt(i);
          switch (a.i.b.a.c.f.e.eQZ[localObject2.ordinal()])
          {
          default:
          case 1:
          case 2:
          case 3:
          }
          do
            while (true)
            {
              i++;
              break;
              if (!Character.isJavaIdentifierPart(c))
                break label271;
              localObject2 = a.i.b.a.c.f.i.Bzi;
              continue;
              if (c != '.')
                break label263;
              localObject2 = a.i.b.a.c.f.i.Bzj;
            }
          while (Character.isJavaIdentifierPart(c));
        }
        for (i = 0; ; i = 1)
        {
          if (i != 0)
            break label297;
          localObject2 = null;
          break;
          if (localObject2 == a.i.b.a.c.f.i.Bzj)
            break label271;
        }
        localObject2 = new a.i.b.a.c.f.b((String)localObject3);
        break;
        label309: i = 0;
        break label69;
        label315: localObject2 = null;
        break label74;
        label320: localObject2 = null;
        break label74;
        localObject3 = a.i.b.a.c.i.c.a.b(f.b(this.Boe).Bnv.BcH, (a.i.b.a.c.f.b)localObject3, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjX);
        if (localObject3 == null)
        {
          AppMethodBeat.o(119890);
          localObject2 = localObject1;
        }
        else
        {
          Object localObject4 = ((e)localObject3).dXY();
          a.f.b.j.o(localObject4, "classDescriptor.typeConstructor");
          j = ((an)localObject4).getParameters().size();
          localObject4 = ((an)this.Boe.BnV).getParameters();
          a.f.b.j.o(localObject4, "getTypeConstructor().parameters");
          i = ((List)localObject4).size();
          if (i == j)
          {
            localObject1 = (Iterable)localObject4;
            localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
            Iterator localIterator = ((Iterable)localObject1).iterator();
            while (localIterator.hasNext())
            {
              localObject1 = (a.i.b.a.c.b.ar)localIterator.next();
              localObject4 = ba.BKh;
              a.f.b.j.o(localObject1, "parameter");
              ((Collection)localObject2).add(new a.i.b.a.c.l.ar((ba)localObject4, (w)((a.i.b.a.c.b.ar)localObject1).dZf()));
            }
          }
          for (localObject2 = (List)localObject2; ; localObject2 = (List)localObject1)
          {
            localObject1 = a.i.b.a.c.b.a.g.BfJ;
            localObject2 = (w)x.a(g.a.eai(), (e)localObject3, (List)localObject2);
            AppMethodBeat.o(119890);
            break;
            if ((i != 1) || (j <= 1) || (localObject2 != null))
              break label683;
            localObject2 = ba.BKh;
            localObject1 = a.a.j.fN((List)localObject4);
            a.f.b.j.o(localObject1, "typeParameters.single()");
            localObject2 = new a.i.b.a.c.l.ar((ba)localObject2, (w)((a.i.b.a.c.b.ar)localObject1).dZf());
            localObject4 = (Iterable)new a.h.d(1, j);
            localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject4));
            localObject4 = ((Iterable)localObject4).iterator();
            while (((Iterator)localObject4).hasNext())
            {
              ((ab)localObject4).nextInt();
              ((Collection)localObject1).add(localObject2);
            }
          }
          AppMethodBeat.o(119890);
          localObject2 = localObject1;
        }
      }
    }
  }

  public final Collection<w> dYr()
  {
    e locale = null;
    AppMethodBeat.i(119889);
    Object localObject1 = f.a(this.Boe).eap();
    ArrayList localArrayList = new ArrayList(((Collection)localObject1).size());
    Object localObject2 = new ArrayList(0);
    Object localObject3 = ebs();
    Object localObject4 = ((Collection)localObject1).iterator();
    label179: 
    while (((Iterator)localObject4).hasNext())
    {
      localObject1 = (a.i.b.a.c.d.a.e.j)((Iterator)localObject4).next();
      localObject5 = f.b(this.Boe).Bnu.a((a.i.b.a.c.d.a.e.v)localObject1, a.i.b.a.c.d.a.c.b.d.a(l.Bmv, false, null, 3));
      if ((((w)localObject5).ejw().dYs() instanceof aa.b))
        ((ArrayList)localObject2).add(localObject1);
      an localan = ((w)localObject5).ejw();
      if (localObject3 != null);
      for (localObject1 = ((w)localObject3).ejw(); ; localObject1 = null)
      {
        if ((a.f.b.j.j(localan, localObject1)) || (a.i.b.a.c.a.g.A((w)localObject5)))
          break label179;
        localArrayList.add(localObject5);
        break;
      }
    }
    localObject4 = (Collection)localArrayList;
    Object localObject5 = f.c(this.Boe);
    localObject1 = locale;
    if (localObject5 != null)
      localObject1 = a.i.b.a.c.a.b.h.a((e)localObject5, (e)this.Boe).ekr().c((w)((e)localObject5).dZf(), ba.BKh);
    a.i.b.a.c.n.a.b((Collection)localObject4, localObject1);
    a.i.b.a.c.n.a.b((Collection)localArrayList, localObject3);
    int i;
    if (!((Collection)localObject2).isEmpty())
    {
      i = 1;
      if (i != 0)
      {
        localObject1 = f.b(this.Boe).Bnv.BmV;
        locale = (e)this.Boe;
        localObject3 = (Iterable)localObject2;
        localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject3));
        localObject3 = ((Iterable)localObject3).iterator();
      }
    }
    else
    {
      while (true)
      {
        if (!((Iterator)localObject3).hasNext())
          break label399;
        localObject4 = (a.i.b.a.c.d.a.e.v)((Iterator)localObject3).next();
        if (localObject4 == null)
        {
          localObject1 = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
          AppMethodBeat.o(119889);
          throw ((Throwable)localObject1);
          i = 0;
          break;
        }
        ((Collection)localObject2).add(((a.i.b.a.c.d.a.e.j)localObject4).ebP());
      }
      label399: ((m)localObject1).a(locale, (List)localObject2);
    }
    if (!((Collection)localArrayList).isEmpty())
    {
      i = 1;
      if (i == 0)
        break label456;
      localObject1 = (Collection)a.a.j.m((Iterable)localArrayList);
      AppMethodBeat.o(119889);
    }
    while (true)
    {
      return localObject1;
      i = 0;
      break;
      label456: localObject1 = (Collection)a.a.j.listOf(f.b(this.Boe).Bnv.BcH.dZD().dXM());
      AppMethodBeat.o(119889);
    }
  }

  public final e dYt()
  {
    return (e)this.Boe;
  }

  public final boolean dYu()
  {
    return true;
  }

  public final ap dYv()
  {
    AppMethodBeat.i(119891);
    ap localap = f.b(this.Boe).Bnv.Bhr;
    AppMethodBeat.o(119891);
    return localap;
  }

  public final List<a.i.b.a.c.b.ar> getParameters()
  {
    AppMethodBeat.i(119888);
    List localList = (List)this.Bod.invoke();
    AppMethodBeat.o(119888);
    return localList;
  }

  public final String toString()
  {
    AppMethodBeat.i(119892);
    String str = this.Boe.BgZ.name;
    a.f.b.j.o(str, "name.asString()");
    AppMethodBeat.o(119892);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.a.f.b
 * JD-Core Version:    0.6.2
 */