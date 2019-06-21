package a.i.b.a.c.l.d;

import a.aa;
import a.f.b.k;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.l;
import a.i.b.a.c.h.c.a;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.as;
import a.i.b.a.c.l.at;
import a.i.b.a.c.l.au;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ax;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.t;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import a.m;
import a.o;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b
{
  public static final ap a(ap paramap, boolean paramBoolean)
  {
    AppMethodBeat.i(122841);
    if (paramap == null)
    {
      paramap = null;
      AppMethodBeat.o(122841);
    }
    while (true)
    {
      return paramap;
      if (paramap.ekp())
      {
        AppMethodBeat.o(122841);
      }
      else
      {
        w localw = paramap.dZS();
        a.f.b.j.o(localw, "typeProjection.type");
        if (!av.b(localw, (a.f.a.b)b.b.BLo))
        {
          AppMethodBeat.o(122841);
        }
        else
        {
          ba localba = paramap.ekq();
          a.f.b.j.o(localba, "typeProjection.projectionKind");
          if (localba == ba.BKj)
          {
            paramap = (ap)new a.i.b.a.c.l.ar(localba, (w)aO(localw).BLn);
            AppMethodBeat.o(122841);
          }
          else if (paramBoolean)
          {
            paramap = (ap)new a.i.b.a.c.l.ar(localba, (w)aO(localw).BLm);
            AppMethodBeat.o(122841);
          }
          else
          {
            paramap = e(paramap);
            AppMethodBeat.o(122841);
          }
        }
      }
    }
  }

  private static final a<d> a(d paramd)
  {
    AppMethodBeat.i(122845);
    Object localObject1 = aO(paramd.BLr);
    w localw1 = (w)((a)localObject1).BLm;
    w localw2 = (w)((a)localObject1).BLn;
    Object localObject2 = aO(paramd.BLs);
    localObject1 = (w)((a)localObject2).BLm;
    localObject2 = (w)((a)localObject2).BLn;
    paramd = new a(new d(paramd.BJL, localw2, (w)localObject1), new d(paramd.BJL, localw1, (w)localObject2));
    AppMethodBeat.o(122845);
    return paramd;
  }

  private static final w a(w paramw, List<d> paramList)
  {
    AppMethodBeat.i(122844);
    if (paramw.ejt().size() == paramList.size());
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramw = (Throwable)new AssertionError("Incorrect type arguments ".concat(String.valueOf(paramList)));
      AppMethodBeat.o(122844);
      throw paramw;
    }
    paramList = (Iterable)paramList;
    Collection localCollection = (Collection)new ArrayList(a.a.j.d(paramList));
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      paramList = (d)localIterator.next();
      boolean bool = paramList.eks();
      if ((aa.AUz) && (!bool))
      {
        paramw = a.i.b.a.c.h.c.BBP;
        paramw = c.a.e((a.f.a.b)b.d.BLp);
        paramw = (Throwable)new AssertionError("Only consistent enhanced type projection can be converted to type projection, but [" + paramw.k((l)paramList.BJL) + ": <" + paramw.b(paramList.BLr) + ", " + paramw.b(paramList.BLs) + ">] was found");
        AppMethodBeat.o(122844);
        throw paramw;
      }
      b.e locale = new b.e(paramList);
      if (a.f.b.j.j(paramList.BLr, paramList.BLs))
        paramList = (ap)new a.i.b.a.c.l.ar(paramList.BLr);
      while (true)
      {
        localCollection.add(paramList);
        break;
        if ((g.y(paramList.BLr)) && (paramList.BJL.dZh() != ba.BKi))
          paramList = (ap)new a.i.b.a.c.l.ar(locale.b(ba.BKj), paramList.BLs);
        else if (g.B(paramList.BLs))
          paramList = (ap)new a.i.b.a.c.l.ar(locale.b(ba.BKi), paramList.BLr);
        else
          paramList = (ap)new a.i.b.a.c.l.ar(locale.b(ba.BKj), paramList.BLs);
      }
    }
    paramw = at.a(paramw, (List)localCollection, paramw.dYn());
    AppMethodBeat.o(122844);
    return paramw;
  }

  public static final a<w> aO(w paramw)
  {
    AppMethodBeat.i(122843);
    a.f.b.j.p(paramw, "type");
    if (t.ai(paramw))
    {
      localObject1 = aO((w)t.ak(paramw));
      localObject2 = aO((w)t.al(paramw));
      paramw = new a(ax.a(x.a(t.ak((w)((a)localObject1).BLm), t.al((w)((a)localObject2).BLm)), paramw), ax.a(x.a(t.ak((w)((a)localObject1).BLn), t.al((w)((a)localObject2).BLn)), paramw));
      AppMethodBeat.o(122843);
    }
    while (true)
    {
      return paramw;
      localObject3 = paramw.ejw();
      if (a.i.b.a.c.i.a.a.c.ae(paramw))
      {
        if (localObject3 == null)
        {
          paramw = new v("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
          AppMethodBeat.o(122843);
          throw paramw;
        }
        localObject4 = ((a.i.b.a.c.i.a.a.b)localObject3).BEG;
        localObject1 = new a(paramw);
        localObject2 = ((ap)localObject4).dZS();
        a.f.b.j.o(localObject2, "typeProjection.type");
        localObject2 = ((a)localObject1).aP((w)localObject2);
        localObject3 = ((ap)localObject4).ekq();
        switch (c.pCY[localObject3.ordinal()])
        {
        default:
          paramw = (Throwable)new AssertionError("Only nontrivial projections should have been captured, not: ".concat(String.valueOf(localObject4)));
          AppMethodBeat.o(122843);
          throw paramw;
        case 1:
          paramw = a.i.b.a.c.l.c.a.aL(paramw).dXN();
          a.f.b.j.o(paramw, "type.builtIns.nullableAnyType");
          paramw = new a(localObject2, paramw);
          AppMethodBeat.o(122843);
          break;
        case 2:
          paramw = a.i.b.a.c.l.c.a.aL(paramw).dXL();
          a.f.b.j.o(paramw, "type.builtIns.nothingType");
          paramw = new a(((a)localObject1).aP((w)paramw), localObject2);
          AppMethodBeat.o(122843);
          break;
        }
      }
      else
      {
        if ((!paramw.ejt().isEmpty()) && (paramw.ejt().size() == ((an)localObject3).getParameters().size()))
          break;
        paramw = new a(paramw, paramw);
        AppMethodBeat.o(122843);
      }
    }
    Object localObject1 = new ArrayList();
    Object localObject2 = new ArrayList();
    Object localObject4 = (Iterable)paramw.ejt();
    Object localObject3 = ((an)localObject3).getParameters();
    a.f.b.j.o(localObject3, "typeConstructor.parameters");
    localObject4 = a.a.j.a((Iterable)localObject4, (Iterable)localObject3).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      Object localObject5 = (o)((Iterator)localObject4).next();
      localObject3 = (ap)((o)localObject5).first;
      localObject5 = (a.i.b.a.c.b.ar)((o)localObject5).second;
      a.f.b.j.o(localObject5, "typeParameter");
      localObject5 = b((ap)localObject3, (a.i.b.a.c.b.ar)localObject5);
      if (((ap)localObject3).ekp())
      {
        ((ArrayList)localObject1).add(localObject5);
        ((ArrayList)localObject2).add(localObject5);
      }
      else
      {
        localObject5 = a((d)localObject5);
        localObject3 = (d)((a)localObject5).BLm;
        localObject5 = (d)((a)localObject5).BLn;
        ((ArrayList)localObject1).add(localObject3);
        ((ArrayList)localObject2).add(localObject5);
      }
    }
    localObject4 = (Iterable)localObject1;
    label591: int i;
    if (!((Collection)localObject4).isEmpty())
    {
      localObject4 = ((Iterable)localObject4).iterator();
      if (((Iterator)localObject4).hasNext())
        if (!((d)((Iterator)localObject4).next()).eks())
        {
          i = 1;
          label620: if (i == 0)
            break label683;
          i = 1;
          label628: if (i == 0)
            break label691;
          localObject1 = a.i.b.a.c.l.c.a.aL(paramw).dXL();
          a.f.b.j.o(localObject1, "type.builtIns.nothingType");
        }
    }
    label683: label691: for (localObject1 = (w)localObject1; ; localObject1 = a(paramw, (List)localObject1))
    {
      paramw = new a(localObject1, a(paramw, (List)localObject2));
      AppMethodBeat.o(122843);
      break;
      i = 0;
      break label620;
      break label591;
      i = 0;
      break label628;
    }
  }

  private static final d b(ap paramap, a.i.b.a.c.b.ar paramar)
  {
    AppMethodBeat.i(122840);
    Object localObject = au.a(paramar.dZh(), paramap);
    switch (c.eQZ[localObject.ordinal()])
    {
    default:
      paramap = new m();
      AppMethodBeat.o(122840);
      throw paramap;
    case 1:
      localObject = paramap.dZS();
      a.f.b.j.o(localObject, "type");
      paramap = paramap.dZS();
      a.f.b.j.o(paramap, "type");
      paramap = new d(paramar, (w)localObject, paramap);
      AppMethodBeat.o(122840);
    case 2:
    case 3:
    }
    while (true)
    {
      return paramap;
      paramap = paramap.dZS();
      a.f.b.j.o(paramap, "type");
      localObject = a.i.b.a.c.i.c.a.G((l)paramar).dXN();
      a.f.b.j.o(localObject, "typeParameter.builtIns.nullableAnyType");
      paramap = new d(paramar, paramap, (w)localObject);
      AppMethodBeat.o(122840);
      continue;
      localObject = a.i.b.a.c.i.c.a.G((l)paramar).dXL();
      a.f.b.j.o(localObject, "typeParameter.builtIns.nothingType");
      localObject = (w)localObject;
      paramap = paramap.dZS();
      a.f.b.j.o(paramap, "type");
      paramap = new d(paramar, (w)localObject, paramap);
      AppMethodBeat.o(122840);
    }
  }

  private static final ap e(ap paramap)
  {
    AppMethodBeat.i(122842);
    au localau = au.d((as)new b.c());
    a.f.b.j.o(localau, "TypeSubstitutor.create(o…ojection\n        }\n    })");
    paramap = localau.d(paramap);
    AppMethodBeat.o(122842);
    return paramap;
  }

  static final class a extends k
    implements a.f.a.b<w, w>
  {
    a(w paramw)
    {
      super();
    }

    public final w aP(w paramw)
    {
      AppMethodBeat.i(122832);
      a.f.b.j.p(paramw, "receiver$0");
      paramw = av.b(paramw, this.BEP.eci());
      a.f.b.j.o(paramw, "TypeUtils.makeNullableIf…s, type.isMarkedNullable)");
      AppMethodBeat.o(122832);
      return paramw;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.d.b
 * JD-Core Version:    0.6.2
 */