package a.i.b.a.c.d.a.f;

import a.aa;
import a.f.b.k;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.c.z;
import a.i.b.a.c.d.a.a.a;
import a.i.b.a.c.d.a.c.d;
import a.i.b.a.c.d.a.q;
import a.i.b.a.c.i.b.s;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.w;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class l
{
  private final a.i.b.a.c.n.e Bkf;
  private final a.i.b.a.c.d.a.a Bne;

  public l(a.i.b.a.c.d.a.a parama, a.i.b.a.c.n.e parame)
  {
    AppMethodBeat.i(120178);
    this.Bne = parama;
    this.Bkf = parame;
    AppMethodBeat.o(120178);
  }

  private final <D extends a.i.b.a.c.b.b> D a(D paramD, a.i.b.a.c.d.a.c.h paramh)
  {
    AppMethodBeat.i(120175);
    if (!(paramD instanceof a.i.b.a.c.d.a.b.b))
      AppMethodBeat.o(120175);
    while (true)
    {
      return paramD;
      if (((a.i.b.a.c.d.a.b.b)paramD).dYZ() != b.a.Bek)
        break;
      localObject1 = ((a.i.b.a.c.d.a.b.b)paramD).dYY();
      a.f.b.j.o(localObject1, "original");
      if (((a.i.b.a.c.b.b)localObject1).dYX().size() != 1)
        break;
      AppMethodBeat.o(120175);
    }
    a.i.b.a.c.d.a.c.h localh = a.i.b.a.c.d.a.c.a.b(paramh, paramD.dYn());
    if ((paramD instanceof a.i.b.a.c.d.a.b.f))
    {
      paramh = ((a.i.b.a.c.d.a.b.f)paramD).Bjb;
      if ((paramh != null) && (!paramh.isDefault))
      {
        paramh = ((a.i.b.a.c.d.a.b.f)paramD).Bjb;
        if (paramh == null)
          a.f.b.j.dWJ();
        a.f.b.j.o(paramh, "getter!!");
        paramh = (a.i.b.a.c.b.b)paramh;
        label137: if (((a.i.b.a.c.d.a.b.b)paramD).dYQ() == null)
          break label261;
        if ((paramh instanceof a.i.b.a.c.b.t))
          break label1415;
      }
    }
    label261: label1415: for (Object localObject1 = null; ; localObject1 = paramh)
    {
      localObject1 = (a.i.b.a.c.b.t)localObject1;
      label180: Object localObject2;
      if (localObject1 != null)
      {
        localObject1 = (au)((a.i.b.a.c.b.t)localObject1).a(a.i.b.a.c.d.a.b.e.BmA);
        localObject2 = a(paramD, (au)localObject1, localh, (a.f.a.b)l.d.Bqy).a(null);
        label200: if ((paramD instanceof a.i.b.a.c.d.a.b.e))
          break label1410;
      }
      for (localObject1 = null; ; localObject1 = paramD)
      {
        localObject1 = (a.i.b.a.c.d.a.b.e)localObject1;
        Object localObject3;
        if (localObject1 != null)
        {
          localObject3 = a.i.b.a.c.d.b.t.BrJ;
          localObject3 = ((a.i.b.a.c.d.a.b.e)localObject1).dXW();
          if (localObject3 == null)
          {
            paramD = new v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            AppMethodBeat.o(120175);
            throw paramD;
            paramh = paramD;
            break label137;
            localObject1 = null;
            break label180;
            localObject2 = null;
            break label200;
          }
          localObject1 = a.i.b.a.c.d.b.t.a((a.i.b.a.c.b.e)localObject3, a.i.b.a.c.d.b.r.a((a.i.b.a.c.b.t)localObject1, false, false, 3));
          if (localObject1 != null)
          {
            localObject3 = (j)i.ecj().get(localObject1);
            if (localObject3 == null)
              break label441;
            if (((j)localObject3).Bqg.size() != ((a.i.b.a.c.d.a.b.b)paramD).dYV().size())
              break label435;
          }
        }
        label435: for (int i = 1; ; i = 0)
        {
          if ((!aa.AUz) || (i != 0))
            break label441;
          paramD = (Throwable)new AssertionError("Predefined enhancement info for " + paramD + " has " + ((j)localObject3).Bqg.size() + ", but " + ((a.i.b.a.c.d.a.b.b)paramD).dYV().size() + " expected");
          AppMethodBeat.o(120175);
          throw paramD;
          localObject3 = null;
          break;
        }
        label441: localObject1 = paramh.dYV();
        a.f.b.j.o(localObject1, "annotationOwnerForMember.valueParameters");
        localObject1 = (Iterable)localObject1;
        Collection localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
        Iterator localIterator = ((Iterable)localObject1).iterator();
        label558: label581: Object localObject5;
        if (localIterator.hasNext())
        {
          au localau = (au)localIterator.next();
          localObject4 = a(paramD, localau, localh, (a.f.a.b)new l.f(localau));
          l.a locala;
          label687: boolean bool1;
          if (localObject3 != null)
          {
            localObject1 = ((j)localObject3).Bqg;
            if (localObject1 != null)
            {
              localObject1 = (r)a.a.j.x((List)localObject1, localau.getIndex());
              locala = ((l.b)localObject4).a((r)localObject1);
              if (!locala.Bqi)
                break label795;
              localObject4 = locala.AYl;
              a.f.b.j.o(localau, "p");
              a.f.b.j.p(localau, "receiver$0");
              localObject5 = localau.dYn();
              localObject1 = a.i.b.a.c.d.a.p.Bly;
              a.f.b.j.o(localObject1, "JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME");
              localObject1 = ((a.i.b.a.c.b.a.g)localObject5).i((a.i.b.a.c.f.b)localObject1);
              if (localObject1 == null)
                break label823;
              localObject5 = a.i.b.a.c.i.c.a.m((a.i.b.a.c.b.a.c)localObject1);
              if (localObject5 == null)
                break label823;
              localObject1 = localObject5;
              if (!(localObject5 instanceof s))
                localObject1 = null;
              localObject1 = (s)localObject1;
              if (localObject1 == null)
                break label823;
              localObject1 = (String)((s)localObject1).getValue();
              if (localObject1 == null)
                break label823;
              localObject1 = (a.i.b.a.c.d.a.b.a)new a.i.b.a.c.d.a.b.h((String)localObject1);
              if (!(localObject1 instanceof a.i.b.a.c.d.a.b.h))
                break label876;
              if (a.i.b.a.c.d.a.u.a((w)localObject4, ((a.i.b.a.c.d.a.b.h)localObject1).value) == null)
                break label870;
              bool1 = true;
              label712: if ((!bool1) || (!localau.dYX().isEmpty()))
                break label927;
              bool1 = true;
              label735: if ((!locala.Bqi) && (bool1 == localau.dZU()))
                break label933;
            }
          }
          label795: label927: label933: for (boolean bool2 = true; ; bool2 = false)
          {
            localCollection.add(new l.c(locala.AYl, bool1, bool2, locala.Bqj));
            break;
            localObject1 = null;
            break label558;
            a.f.b.j.o(localau, "p");
            localObject4 = localau.dZS();
            a.f.b.j.o(localObject4, "p.type");
            break label581;
            label823: localObject1 = localau.dYn();
            localObject5 = a.i.b.a.c.d.a.p.Blz;
            a.f.b.j.o(localObject5, "JvmAnnotationNames.DEFAULT_NULL_FQ_NAME");
            if (((a.i.b.a.c.b.a.g)localObject1).j((a.i.b.a.c.f.b)localObject5))
            {
              localObject1 = (a.i.b.a.c.d.a.b.a)a.i.b.a.c.d.a.b.g.BmL;
              break label687;
            }
            localObject1 = null;
            break label687;
            label870: bool1 = false;
            break label712;
            label876: if (a.f.b.j.j(localObject1, a.i.b.a.c.d.a.b.g.BmL))
            {
              bool1 = av.aC((w)localObject4);
              break label712;
            }
            if (localObject1 == null)
            {
              bool1 = localau.dZU();
              break label712;
            }
            paramD = new a.m();
            AppMethodBeat.o(120175);
            throw paramD;
            bool1 = false;
            break label735;
          }
        }
        localObject1 = (List)localCollection;
        Object localObject4 = (a.i.b.a.c.b.a.a)paramh;
        if (!(paramD instanceof ah));
        for (paramh = null; ; paramh = paramD)
        {
          paramh = (ah)paramh;
          label1011: int j;
          if ((paramh != null) && (a.i.b.a.c.d.a.c.a.c.e(paramh) == true))
          {
            paramh = a.a.Bki;
            localObject4 = a(paramD, (a.i.b.a.c.b.a.a)localObject4, true, localh, paramh, (a.f.a.b)l.e.Bqz);
            if (localObject3 == null)
              break label1310;
            paramh = ((j)localObject3).Bqf;
            localObject3 = ((l.b)localObject4).a(paramh);
            if (((localObject2 == null) || (((l.a)localObject2).Bqj != true)) && (!((l.a)localObject3).Bqj))
            {
              paramh = (Iterable)localObject1;
              if (((Collection)paramh).isEmpty())
                break label1315;
              paramh = paramh.iterator();
            }
            while (paramh.hasNext())
              if (((l.c)paramh.next()).Bqj)
              {
                i = 1;
                label1092: if (i == 0)
                  break label1321;
                i = 1;
                label1100: if (((localObject2 == null) || (((l.a)localObject2).Bqi != true)) && (!((l.a)localObject3).Bqi))
                {
                  paramh = (Iterable)localObject1;
                  if (((Collection)paramh).isEmpty())
                    break label1327;
                  paramh = paramh.iterator();
                }
                while (paramh.hasNext())
                  if (((l.c)paramh.next()).Bqi)
                  {
                    j = 1;
                    label1173: if ((j == 0) && (i == 0))
                      break label1397;
                    if (i == 0)
                      break label1333;
                    paramh = a.u.I(a.i.b.a.c.i.a.ejr(), new a.i.b.a.c.d.a.g((a.i.b.a.c.b.l)paramD));
                    label1206: localObject4 = (a.i.b.a.c.d.a.b.b)paramD;
                    if (localObject2 == null)
                      break label1338;
                  }
              }
          }
          label1310: label1315: label1321: label1327: label1333: label1338: for (paramD = ((l.a)localObject2).AYl; ; paramD = null)
          {
            localObject2 = (Iterable)localObject1;
            localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
            localObject5 = ((Iterable)localObject2).iterator();
            while (((Iterator)localObject5).hasNext())
            {
              localObject2 = (l.c)((Iterator)localObject5).next();
              ((Collection)localObject1).add(new a.i.b.a.c.d.a.b.j(((l.a)localObject2).AYl, ((l.c)localObject2).BmM));
            }
            paramh = a.a.Bkg;
            break;
            paramh = null;
            break label1011;
            i = 0;
            break label1092;
            i = 0;
            break label1100;
            j = 0;
            break label1173;
            paramh = null;
            break label1206;
          }
          paramD = ((a.i.b.a.c.d.a.b.b)localObject4).a(paramD, (List)localObject1, ((l.a)localObject3).AYl, paramh);
          if (paramD == null)
          {
            paramD = new v("null cannot be cast to non-null type D");
            AppMethodBeat.o(120175);
            throw paramD;
          }
          paramD = (a.i.b.a.c.b.b)paramD;
          AppMethodBeat.o(120175);
          break;
          label1397: AppMethodBeat.o(120175);
          break;
        }
      }
    }
  }

  private final l.b a(a.i.b.a.c.b.b paramb, a.i.b.a.c.b.a.a parama, boolean paramBoolean, a.i.b.a.c.d.a.c.h paramh, a.a parama1, a.f.a.b<? super a.i.b.a.c.b.b, ? extends w> paramb1)
  {
    AppMethodBeat.i(120177);
    w localw = (w)paramb1.am(paramb);
    Collection localCollection = paramb.dYX();
    a.f.b.j.o(localCollection, "this.overriddenDescriptors");
    Object localObject = (Iterable)localCollection;
    localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (a.i.b.a.c.b.b)localIterator.next();
      a.f.b.j.o(localObject, "it");
      localCollection.add((w)paramb1.am(localObject));
    }
    paramb = new l.b(this, parama, localw, (Collection)localCollection, paramBoolean, a.i.b.a.c.d.a.c.a.b(paramh, ((w)paramb1.am(paramb)).dYn()), parama1);
    AppMethodBeat.o(120177);
    return paramb;
  }

  private final l.b a(a.i.b.a.c.b.b paramb, au paramau, a.i.b.a.c.d.a.c.h paramh, a.f.a.b<? super a.i.b.a.c.b.b, ? extends w> paramb1)
  {
    AppMethodBeat.i(120176);
    a.i.b.a.c.b.a.a locala = (a.i.b.a.c.b.a.a)paramau;
    if (paramau != null)
    {
      paramau = a.i.b.a.c.d.a.c.a.b(paramh, paramau.dYn());
      if (paramau != null);
    }
    else
    {
      paramau = paramh;
    }
    while (true)
    {
      paramb = a(paramb, locala, false, paramau, a.a.Bkh, paramb1);
      AppMethodBeat.o(120176);
      return paramb;
    }
  }

  private static h h(a.i.b.a.c.b.a.c paramc)
  {
    Object localObject = null;
    AppMethodBeat.i(120171);
    a.i.b.a.c.i.b.f localf = a.i.b.a.c.i.c.a.m(paramc);
    paramc = localf;
    if (!(localf instanceof a.i.b.a.c.i.b.i))
      paramc = null;
    paramc = (a.i.b.a.c.i.b.i)paramc;
    if (paramc == null)
    {
      paramc = new h(g.BpM);
      AppMethodBeat.o(120171);
    }
    while (true)
    {
      return paramc;
      paramc = paramc.BES.name;
      switch (paramc.hashCode())
      {
      default:
      case 73135176:
      case 74175084:
      case 433141802:
      case 1933739535:
      }
      label108: 
      do
      {
        do
        {
          do
          {
            AppMethodBeat.o(120171);
            paramc = localObject;
            break;
          }
          while (!paramc.equals("MAYBE"));
          while (true)
          {
            paramc = new h(g.BpL);
            AppMethodBeat.o(120171);
            break;
            if (!paramc.equals("NEVER"))
              break label108;
          }
        }
        while (!paramc.equals("UNKNOWN"));
        paramc = new h(g.BpN);
        AppMethodBeat.o(120171);
        break;
      }
      while (!paramc.equals("ALWAYS"));
      paramc = new h(g.BpM);
      AppMethodBeat.o(120171);
    }
  }

  private final h j(a.i.b.a.c.b.a.c paramc)
  {
    Object localObject = null;
    AppMethodBeat.i(120173);
    a.i.b.a.c.f.b localb = paramc.dZF();
    if (localb == null)
    {
      AppMethodBeat.o(120173);
      paramc = localObject;
    }
    while (true)
    {
      return paramc;
      if (q.eaY().contains(localb))
      {
        paramc = new h(g.BpL);
        AppMethodBeat.o(120173);
      }
      else if (q.ebb().contains(localb))
      {
        paramc = new h(g.BpM);
        AppMethodBeat.o(120173);
      }
      else if (a.f.b.j.j(localb, q.eaZ()))
      {
        paramc = h(paramc);
        AppMethodBeat.o(120173);
      }
      else if ((a.f.b.j.j(localb, q.ebc())) && (this.Bkf.BNc))
      {
        paramc = new h(g.BpL);
        AppMethodBeat.o(120173);
      }
      else if ((a.f.b.j.j(localb, q.ebd())) && (this.Bkf.BNc))
      {
        paramc = new h(g.BpM);
        AppMethodBeat.o(120173);
      }
      else if (a.f.b.j.j(localb, q.ebf()))
      {
        paramc = new h(g.BpM, true);
        AppMethodBeat.o(120173);
      }
      else if (a.f.b.j.j(localb, q.ebe()))
      {
        paramc = new h(g.BpL, true);
        AppMethodBeat.o(120173);
      }
      else
      {
        AppMethodBeat.o(120173);
        paramc = localObject;
      }
    }
  }

  public final <D extends a.i.b.a.c.b.b> Collection<D> a(a.i.b.a.c.d.a.c.h paramh, Collection<? extends D> paramCollection)
  {
    AppMethodBeat.i(120174);
    a.f.b.j.p(paramh, "c");
    a.f.b.j.p(paramCollection, "platformSignatures");
    Object localObject = (Iterable)paramCollection;
    paramCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
      paramCollection.add(a((a.i.b.a.c.b.b)((Iterator)localObject).next(), paramh));
    paramh = (Collection)paramCollection;
    AppMethodBeat.o(120174);
    return paramh;
  }

  public final h i(a.i.b.a.c.b.a.c paramc)
  {
    AppMethodBeat.i(120172);
    a.f.b.j.p(paramc, "annotationDescriptor");
    Object localObject = j(paramc);
    if (localObject != null)
    {
      AppMethodBeat.o(120172);
      paramc = (a.i.b.a.c.b.a.c)localObject;
    }
    while (true)
    {
      return paramc;
      localObject = this.Bne.d(paramc);
      if (localObject == null)
      {
        AppMethodBeat.o(120172);
        paramc = null;
      }
      else
      {
        paramc = this.Bne.f(paramc);
        if (paramc.ekz())
        {
          AppMethodBeat.o(120172);
          paramc = null;
        }
        else
        {
          localObject = j((a.i.b.a.c.b.a.c)localObject);
          if (localObject != null)
          {
            paramc = h.a((h)localObject, paramc.eky());
            AppMethodBeat.o(120172);
          }
          else
          {
            AppMethodBeat.o(120172);
            paramc = null;
          }
        }
      }
    }
  }

  static final class b$f extends k
    implements a.f.a.m<w, a.i.b.a.c.d.a.c.h, a.y>
  {
    b$f(ArrayList paramArrayList)
    {
      super();
    }

    public final void a(w paramw, a.i.b.a.c.d.a.c.h paramh)
    {
      AppMethodBeat.i(120157);
      a.f.b.j.p(paramw, "type");
      a.f.b.j.p(paramh, "ownerContext");
      a.i.b.a.c.d.a.c.h localh = a.i.b.a.c.d.a.c.a.b(paramh, paramw.dYn());
      Object localObject = this.Bqx;
      paramh = localh.ebm();
      if (paramh != null)
      {
        paramh = paramh.b(a.a.Bkj);
        ((ArrayList)localObject).add(new p(paramw, paramh));
        paramw = paramw.ejt().iterator();
      }
      while (true)
      {
        if (!paramw.hasNext())
          break label173;
        paramh = (ap)paramw.next();
        if (paramh.ekp())
        {
          localObject = this.Bqx;
          paramh = paramh.dZS();
          a.f.b.j.o(paramh, "arg.type");
          ((ArrayList)localObject).add(new p(paramh, null));
          continue;
          paramh = null;
          break;
        }
        localObject = (f)this;
        paramh = paramh.dZS();
        a.f.b.j.o(paramh, "arg.type");
        ((f)localObject).a(paramh, localh);
      }
      label173: AppMethodBeat.o(120157);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.f.l
 * JD-Core Version:    0.6.2
 */