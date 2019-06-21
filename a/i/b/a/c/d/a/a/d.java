package a.i.b.a.c.d.a.a;

import a.a.ad;
import a.a.x;
import a.i.b.a.c.a.g;
import a.i.b.a.c.a.g.a;
import a.i.b.a.c.b.a.n;
import a.i.b.a.c.f.a;
import a.i.b.a.c.i.b.i;
import a.o;
import a.u;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d
{
  private static final Map<String, EnumSet<n>> Bmg;
  private static final Map<String, a.i.b.a.c.b.a.m> Bmh;
  public static final d Bmi;

  static
  {
    AppMethodBeat.i(119763);
    Bmi = new d();
    Bmg = ad.a(new o[] { u.I("PACKAGE", EnumSet.noneOf(n.class)), u.I("TYPE", EnumSet.of((Enum)n.Bgb, (Enum)n.Bgo)), u.I("ANNOTATION_TYPE", EnumSet.of((Enum)n.Bgc)), u.I("TYPE_PARAMETER", EnumSet.of((Enum)n.Bgd)), u.I("FIELD", EnumSet.of((Enum)n.Bgf)), u.I("LOCAL_VARIABLE", EnumSet.of((Enum)n.Bgg)), u.I("PARAMETER", EnumSet.of((Enum)n.Bgh)), u.I("CONSTRUCTOR", EnumSet.of((Enum)n.Bgi)), u.I("METHOD", EnumSet.of((Enum)n.Bgj, (Enum)n.Bgk, (Enum)n.Bgl)), u.I("TYPE_USE", EnumSet.of((Enum)n.Bgm)) });
    Bmh = ad.a(new o[] { u.I("RUNTIME", a.i.b.a.c.b.a.m.BfX), u.I("CLASS", a.i.b.a.c.b.a.m.BfY), u.I("SOURCE", a.i.b.a.c.b.a.m.BfZ) });
    AppMethodBeat.o(119763);
  }

  public static a.i.b.a.c.i.b.f<?> a(a.i.b.a.c.d.a.e.b paramb)
  {
    AppMethodBeat.i(119762);
    if (!(paramb instanceof a.i.b.a.c.d.a.e.m))
      paramb = null;
    while (true)
    {
      paramb = (a.i.b.a.c.d.a.e.m)paramb;
      if (paramb != null)
      {
        Object localObject = Bmh;
        paramb = paramb.ebR();
        if (paramb != null)
        {
          paramb = paramb.name;
          localObject = (a.i.b.a.c.b.a.m)((Map)localObject).get(paramb);
          if (localObject == null)
            break label115;
          paramb = a.n(g.Bag.BaS);
          a.f.b.j.o(paramb, "ClassId.topLevel(KotlinB…AMES.annotationRetention)");
          localObject = a.i.b.a.c.f.f.avX(((a.i.b.a.c.b.a.m)localObject).name());
          a.f.b.j.o(localObject, "Name.identifier(retention.name)");
          paramb = new i(paramb, (a.i.b.a.c.f.f)localObject);
        }
      }
      while (true)
      {
        paramb = (a.i.b.a.c.i.b.f)paramb;
        AppMethodBeat.o(119762);
        return paramb;
        paramb = null;
        break;
        label115: paramb = null;
        continue;
        paramb = null;
      }
    }
  }

  public static a.i.b.a.c.i.b.f<?> fW(List<? extends a.i.b.a.c.d.a.e.b> paramList)
  {
    AppMethodBeat.i(119761);
    a.f.b.j.p(paramList, "arguments");
    Object localObject1 = (Iterable)paramList;
    paramList = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if ((localObject2 instanceof a.i.b.a.c.d.a.e.m))
        paramList.add(localObject2);
    }
    paramList = (Iterable)paramList;
    localObject1 = (Collection)new ArrayList();
    Object localObject2 = paramList.iterator();
    if (((Iterator)localObject2).hasNext())
    {
      paramList = ((a.i.b.a.c.d.a.e.m)((Iterator)localObject2).next()).ebR();
      if (paramList != null)
      {
        paramList = paramList.name;
        label127: paramList = (EnumSet)Bmg.get(paramList);
        if (paramList == null)
          break label166;
      }
      label166: for (paramList = (Set)paramList; ; paramList = (Set)x.AUR)
      {
        a.a.j.a((Collection)localObject1, (Iterable)paramList);
        break;
        paramList = null;
        break label127;
      }
    }
    localObject1 = (Iterable)localObject1;
    paramList = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    localObject2 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (n)((Iterator)localObject2).next();
      localObject1 = a.n(g.Bag.BaR);
      a.f.b.j.o(localObject1, "ClassId.topLevel(KotlinB…Q_NAMES.annotationTarget)");
      localObject3 = a.i.b.a.c.f.f.avX(((n)localObject3).name());
      a.f.b.j.o(localObject3, "Name.identifier(kotlinTarget.name)");
      paramList.add(new i((a)localObject1, (a.i.b.a.c.f.f)localObject3));
    }
    paramList = (a.i.b.a.c.i.b.f)new a.i.b.a.c.i.b.b((List)paramList, (a.f.a.b)d.a.Bmj);
    AppMethodBeat.o(119761);
    return paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.a.d
 * JD-Core Version:    0.6.2
 */