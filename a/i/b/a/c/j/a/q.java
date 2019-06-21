package a.i.b.a.c.j.a;

import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.aj;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.aq;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.c.aa;
import a.i.b.a.c.b.c.ai;
import a.i.b.a.c.b.c.o;
import a.i.b.a.c.b.c.p;
import a.i.b.a.c.b.c.z;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.e.a.aa;
import a.i.b.a.c.e.a.ab;
import a.i.b.a.c.e.a.ai;
import a.i.b.a.c.e.a.ao;
import a.i.b.a.c.e.a.e;
import a.i.b.a.c.e.a.o;
import a.i.b.a.c.e.a.q;
import a.i.b.a.c.e.a.r;
import a.i.b.a.c.e.a.u;
import a.i.b.a.c.e.a.b.c;
import a.i.b.a.c.f.f;
import a.i.b.a.c.j.a.a.f.a;
import a.i.b.a.c.j.a.a.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class q
{
  private final k BHj;
  private final c Brc;

  public q(k paramk)
  {
    AppMethodBeat.i(122291);
    this.BHj = paramk;
    this.Brc = new c(this.BHj.Brl.Bdv, this.BHj.Brl.Bcm);
    AppMethodBeat.o(122291);
  }

  private final s K(l paraml)
  {
    AppMethodBeat.i(122290);
    if ((paraml instanceof a.i.b.a.c.b.ab))
    {
      paraml = (s)new s.b(((a.i.b.a.c.b.ab)paraml).dZF(), this.BHj.AWq, this.BHj.AWr, (am)this.BHj.BHe);
      AppMethodBeat.o(122290);
    }
    while (true)
    {
      return paraml;
      if ((paraml instanceof a.i.b.a.c.j.a.a.d))
      {
        paraml = (s)((a.i.b.a.c.j.a.a.d)paraml).BHX;
        AppMethodBeat.o(122290);
      }
      else
      {
        paraml = null;
        AppMethodBeat.o(122290);
      }
    }
  }

  private static int UK(int paramInt)
  {
    return (paramInt & 0x3F) + (paramInt >> 8 << 6);
  }

  private final a.i.b.a.c.b.a.g a(a.u paramu, boolean paramBoolean)
  {
    AppMethodBeat.i(122287);
    if (!a.i.b.a.c.e.a.b.Bwu.Ug(paramu.BsW).booleanValue())
    {
      paramu = a.i.b.a.c.b.a.g.BfJ;
      paramu = g.a.eai();
      AppMethodBeat.o(122287);
    }
    while (true)
    {
      return paramu;
      paramu = (a.i.b.a.c.b.a.g)new m(this.BHj.Brl.Baf, (a.f.a.a)new q.b(this, paramBoolean, paramu));
      AppMethodBeat.o(122287);
    }
  }

  private final a.i.b.a.c.b.a.g a(a.i.b.a.c.g.q paramq, int paramInt, a parama)
  {
    AppMethodBeat.i(122286);
    if (!a.i.b.a.c.e.a.b.Bwu.Ug(paramInt).booleanValue())
    {
      paramq = a.i.b.a.c.b.a.g.BfJ;
      paramq = g.a.eai();
      AppMethodBeat.o(122286);
    }
    while (true)
    {
      return paramq;
      paramq = (a.i.b.a.c.b.a.g)new m(this.BHj.Brl.Baf, (a.f.a.a)new q.a(this, paramq, parama));
      AppMethodBeat.o(122286);
    }
  }

  private final a.i.b.a.c.b.a.g a(a.i.b.a.c.g.q paramq, a parama)
  {
    AppMethodBeat.i(122288);
    paramq = (a.i.b.a.c.b.a.g)new a.i.b.a.c.j.a.a.a(this.BHj.Brl.Baf, (a.f.a.a)new q.c(this, paramq, parama));
    AppMethodBeat.o(122288);
    return paramq;
  }

  private final List<au> a(List<a.ai> paramList, a.i.b.a.c.g.q paramq, a parama)
  {
    AppMethodBeat.i(122289);
    Object localObject1 = this.BHj.Bht;
    if (localObject1 == null)
    {
      paramList = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
      AppMethodBeat.o(122289);
      throw paramList;
    }
    a.i.b.a.c.b.a locala = (a.i.b.a.c.b.a)localObject1;
    localObject1 = locala.dXW();
    a.f.b.j.o(localObject1, "callableDescriptor.containingDeclaration");
    s locals = K((l)localObject1);
    paramList = (Iterable)paramList;
    Collection localCollection = (Collection)new ArrayList(a.a.j.d(paramList));
    int i = 0;
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      paramList = localIterator.next();
      if (i < 0)
        a.a.j.dWs();
      localObject1 = (a.ai)paramList;
      int j;
      label146: label215: f localf;
      a.i.b.a.c.l.w localw;
      Object localObject2;
      boolean bool1;
      boolean bool2;
      boolean bool3;
      if (((a.ai)localObject1).ecY())
      {
        j = ((a.ai)localObject1).BsW;
        if (locals == null)
          break label424;
        paramList = a.i.b.a.c.e.a.b.Bwu.Ug(j);
        a.f.b.j.o(paramList, "Flags.HAS_ANNOTATIONS.get(flags)");
        if (!paramList.booleanValue())
          break label424;
        paramList = (a.i.b.a.c.b.a.g)new m(this.BHj.Brl.Baf, (a.f.a.a)new q.e(i, (a.ai)localObject1, this, locals, paramq, parama, locala));
        localf = r.b(this.BHj.AWq, ((a.ai)localObject1).Buf);
        localw = this.BHj.BHb.r(a.i.b.a.c.e.a.g.a((a.ai)localObject1, this.BHj.AWr));
        localObject2 = a.i.b.a.c.e.a.b.BwV.Ug(j);
        a.f.b.j.o(localObject2, "Flags.DECLARES_DEFAULT_VALUE.get(flags)");
        bool1 = ((Boolean)localObject2).booleanValue();
        localObject2 = a.i.b.a.c.e.a.b.BwW.Ug(j);
        a.f.b.j.o(localObject2, "Flags.IS_CROSSINLINE.get(flags)");
        bool2 = ((Boolean)localObject2).booleanValue();
        localObject2 = a.i.b.a.c.e.a.b.BwX.Ug(j);
        a.f.b.j.o(localObject2, "Flags.IS_NOINLINE.get(flags)");
        bool3 = ((Boolean)localObject2).booleanValue();
        localObject1 = a.i.b.a.c.e.a.g.b((a.ai)localObject1, this.BHj.AWr);
        if (localObject1 == null)
          break label435;
      }
      label424: label435: for (localObject1 = this.BHj.BHb.r((a.aa)localObject1); ; localObject1 = null)
      {
        localObject2 = am.BeR;
        a.f.b.j.o(localObject2, "SourceElement.NO_SOURCE");
        localCollection.add(new ai(locala, null, i, paramList, localf, localw, bool1, bool2, bool3, (a.i.b.a.c.l.w)localObject1, (am)localObject2));
        i++;
        break;
        j = 0;
        break label146;
        paramList = a.i.b.a.c.b.a.g.BfJ;
        paramList = g.a.eai();
        break label215;
      }
    }
    paramList = a.a.j.m((Iterable)localCollection);
    AppMethodBeat.o(122289);
    return paramList;
  }

  private static void a(a.i.b.a.c.j.a.a.j paramj, ak paramak1, ak paramak2, List<? extends ar> paramList, List<? extends au> paramList1, a.i.b.a.c.l.w paramw, a.i.b.a.c.b.w paramw1, az paramaz, Map<? extends a.i.b.a.c.b.a.a<?>, ?> paramMap)
  {
    AppMethodBeat.i(122281);
    paramj.a(paramak1, paramak2, paramList, paramList1, paramw, paramw1, paramaz, paramMap, f.a.BIi);
    AppMethodBeat.o(122281);
  }

  private final ak dYR()
  {
    Object localObject1 = null;
    AppMethodBeat.i(122284);
    l locall = this.BHj.Bht;
    Object localObject2 = locall;
    if (!(locall instanceof e))
      localObject2 = null;
    localObject2 = (e)localObject2;
    if (localObject2 != null)
    {
      localObject2 = ((e)localObject2).dZl();
      AppMethodBeat.o(122284);
    }
    while (true)
    {
      return localObject2;
      AppMethodBeat.o(122284);
      localObject2 = localObject1;
    }
  }

  public final a.i.b.a.c.b.d a(a.e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(122285);
    a.f.b.j.p(parame, "proto");
    Object localObject1 = this.BHj.Bht;
    if (localObject1 == null)
    {
      parame = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
      AppMethodBeat.o(122285);
      throw parame;
    }
    e locale = (e)localObject1;
    localObject1 = new a.i.b.a.c.j.a.a.c(locale, a((a.i.b.a.c.g.q)parame, parame.BsW, a.BGy), paramBoolean, a.i.b.a.c.b.b.a.Bej, parame, this.BHj.AWq, this.BHj.AWr, this.BHj.BHd, this.BHj.BHe);
    Object localObject2 = k.a(this.BHj, (l)localObject1, (List)a.a.v.AUP).BHc;
    List localList = parame.BtO;
    a.f.b.j.o(localList, "proto.valueParameterList");
    localList = ((q)localObject2).a(localList, (a.i.b.a.c.g.q)parame, a.BGy);
    localObject2 = t.BHx;
    ((a.i.b.a.c.j.a.a.c)localObject1).a(localList, t.a((a.ao)a.i.b.a.c.e.a.b.Bwv.get(parame.BsW)));
    ((p)localObject1).BhN = ((a.i.b.a.c.l.w)locale.dZf());
    a.f.b.j.o(((p)localObject1).BhM, "descriptor.valueParameters");
    a.f.b.j.o(((p)localObject1).BeK, "descriptor.typeParameters");
    ((a.i.b.a.c.j.a.a.c)localObject1).dYT();
    ((a.i.b.a.c.j.a.a.c)localObject1).a(f.a.BIi);
    parame = (a.i.b.a.c.b.d)localObject1;
    AppMethodBeat.o(122285);
    return parame;
  }

  public final aq f(a.ab paramab)
  {
    AppMethodBeat.i(122283);
    a.f.b.j.p(paramab, "proto");
    Object localObject1 = a.i.b.a.c.b.a.g.BfJ;
    localObject1 = paramab.BvA;
    a.f.b.j.o(localObject1, "proto.annotationList");
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (a.i.b.a.c.e.a.a)((Iterator)localObject2).next();
      localObject4 = this.Brc;
      a.f.b.j.o(localObject3, "it");
      ((Collection)localObject1).add(((c)localObject4).b((a.i.b.a.c.e.a.a)localObject3, this.BHj.AWq));
    }
    localObject1 = g.a.fS((List)localObject1);
    localObject2 = t.BHx;
    localObject2 = t.a((a.ao)a.i.b.a.c.e.a.b.Bwv.get(paramab.BsW));
    localObject2 = new a.i.b.a.c.j.a.a.k(this.BHj.Brl.Baf, this.BHj.Bht, (a.i.b.a.c.b.a.g)localObject1, r.b(this.BHj.AWq, paramab.Buf), (az)localObject2, paramab, this.BHj.AWq, this.BHj.AWr, this.BHj.BHd, this.BHj.BHe);
    Object localObject3 = this.BHj;
    localObject1 = (l)localObject2;
    Object localObject4 = paramab.Btp;
    a.f.b.j.o(localObject4, "proto.typeParameterList");
    localObject3 = k.a((k)localObject3, (l)localObject1, (List)localObject4);
    localObject4 = ((k)localObject3).BHb.ejS();
    Object localObject5 = ((k)localObject3).BHb;
    localObject1 = this.BHj.AWr;
    a.f.b.j.p(paramab, "receiver$0");
    a.f.b.j.p(localObject1, "typeTable");
    if (paramab.efw())
    {
      localObject1 = paramab.Bvw;
      a.f.b.j.o(localObject1, "underlyingType");
      localObject1 = ((w)localObject5).s((a.aa)localObject1);
      localObject3 = ((k)localObject3).BHb;
      localObject5 = this.BHj.AWr;
      a.f.b.j.p(paramab, "receiver$0");
      a.f.b.j.p(localObject5, "typeTable");
      if (!paramab.efy())
        break label436;
      paramab = paramab.Bvy;
      a.f.b.j.o(paramab, "expandedType");
    }
    while (true)
    {
      ((a.i.b.a.c.j.a.a.k)localObject2).a((List)localObject4, (a.i.b.a.c.l.ad)localObject1, ((w)localObject3).s(paramab), f.a.BIi);
      paramab = (aq)localObject2;
      AppMethodBeat.o(122283);
      return paramab;
      if (paramab.efx())
      {
        localObject1 = ((a.i.b.a.c.e.a.h)localObject1).Uk(paramab.Bvx);
        break;
      }
      paramab = (Throwable)new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
      AppMethodBeat.o(122283);
      throw paramab;
      label436: if (!paramab.efz())
        break label456;
      paramab = ((a.i.b.a.c.e.a.h)localObject5).Uk(paramab.Bvz);
    }
    label456: paramab = (Throwable)new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
    AppMethodBeat.o(122283);
    throw paramab;
  }

  public final ah g(a.u paramu)
  {
    AppMethodBeat.i(122280);
    a.f.b.j.p(paramu, "proto");
    int i;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    boolean bool1;
    label406: label490: int j;
    int k;
    if (paramu.ecY())
    {
      i = paramu.BsW;
      localObject1 = this.BHj.Bht;
      localObject2 = a((a.i.b.a.c.g.q)paramu, i, a.BGz);
      localObject3 = t.BHx;
      localObject3 = t.a((a.r)a.i.b.a.c.e.a.b.Bww.get(i));
      localObject4 = t.BHx;
      localObject4 = t.a((a.ao)a.i.b.a.c.e.a.b.Bwv.get(i));
      localObject5 = a.i.b.a.c.e.a.b.BwM.Ug(i);
      a.f.b.j.o(localObject5, "Flags.IS_VAR.get(flags)");
      bool1 = ((Boolean)localObject5).booleanValue();
      localObject5 = r.b(this.BHj.AWq, paramu.Buf);
      Object localObject6 = t.BHx;
      localObject6 = t.a((a.q)a.i.b.a.c.e.a.b.BwE.get(i));
      Object localObject7 = a.i.b.a.c.e.a.b.BwQ.Ug(i);
      a.f.b.j.o(localObject7, "Flags.IS_LATEINIT.get(flags)");
      boolean bool2 = ((Boolean)localObject7).booleanValue();
      localObject7 = a.i.b.a.c.e.a.b.BwP.Ug(i);
      a.f.b.j.o(localObject7, "Flags.IS_CONST.get(flags)");
      boolean bool3 = ((Boolean)localObject7).booleanValue();
      localObject7 = a.i.b.a.c.e.a.b.BwS.Ug(i);
      a.f.b.j.o(localObject7, "Flags.IS_EXTERNAL_PROPERTY.get(flags)");
      boolean bool4 = ((Boolean)localObject7).booleanValue();
      localObject7 = a.i.b.a.c.e.a.b.BwT.Ug(i);
      a.f.b.j.o(localObject7, "Flags.IS_DELEGATED.get(flags)");
      boolean bool5 = ((Boolean)localObject7).booleanValue();
      localObject7 = a.i.b.a.c.e.a.b.BwU.Ug(i);
      a.f.b.j.o(localObject7, "Flags.IS_EXPECT_PROPERTY.get(flags)");
      localObject3 = new a.i.b.a.c.j.a.a.i((l)localObject1, null, (a.i.b.a.c.b.a.g)localObject2, (a.i.b.a.c.b.w)localObject3, (az)localObject4, bool1, (f)localObject5, (a.i.b.a.c.b.b.a)localObject6, bool2, bool3, bool4, bool5, ((Boolean)localObject7).booleanValue(), paramu, this.BHj.AWq, this.BHj.AWr, this.BHj.BHd, this.BHj.BHe);
      localObject1 = this.BHj;
      localObject2 = (l)localObject3;
      localObject4 = paramu.Btp;
      a.f.b.j.o(localObject4, "proto.typeParameterList");
      localObject4 = k.a((k)localObject1, (l)localObject2, (List)localObject4);
      localObject1 = a.i.b.a.c.e.a.b.BwN.Ug(i);
      a.f.b.j.o(localObject1, "Flags.HAS_GETTER.get(flags)");
      bool1 = ((Boolean)localObject1).booleanValue();
      if ((!bool1) || (!a.i.b.a.c.e.a.g.e(paramu)))
        break label1139;
      localObject1 = a((a.i.b.a.c.g.q)paramu, a.BGA);
      localObject5 = ((k)localObject4).BHb.r(a.i.b.a.c.e.a.g.a(paramu, this.BHj.AWr));
      localObject6 = ((k)localObject4).BHb.ejS();
      localObject2 = dYR();
      localObject7 = a.i.b.a.c.e.a.g.b(paramu, this.BHj.AWr);
      if (localObject7 == null)
        break label1150;
      localObject7 = ((k)localObject4).BHb.r((a.aa)localObject7);
      if (localObject7 == null)
        break label1150;
      localObject1 = a.i.b.a.c.i.c.a((a.i.b.a.c.b.a)localObject3, (a.i.b.a.c.l.w)localObject7, (a.i.b.a.c.b.a.g)localObject1);
      ((a.i.b.a.c.j.a.a.i)localObject3).a((a.i.b.a.c.l.w)localObject5, (List)localObject6, (ak)localObject2, (ak)localObject1);
      localObject1 = a.i.b.a.c.e.a.b.Bwu.Ug(i);
      a.f.b.j.o(localObject1, "Flags.HAS_ANNOTATIONS.get(flags)");
      j = a.i.b.a.c.e.a.b.a(((Boolean)localObject1).booleanValue(), (a.ao)a.i.b.a.c.e.a.b.Bwv.get(i), (a.r)a.i.b.a.c.e.a.b.Bww.get(i));
      if (!bool1)
        break label1188;
      if (!paramu.eeA())
        break label1155;
      k = paramu.BuL;
      label563: localObject1 = a.i.b.a.c.e.a.b.BwY.Ug(k);
      a.f.b.j.o(localObject1, "Flags.IS_NOT_DEFAULT.get(getterFlags)");
      bool1 = ((Boolean)localObject1).booleanValue();
      localObject1 = a.i.b.a.c.e.a.b.BwZ.Ug(k);
      a.f.b.j.o(localObject1, "Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags)");
      bool3 = ((Boolean)localObject1).booleanValue();
      localObject1 = a.i.b.a.c.e.a.b.Bxa.Ug(k);
      a.f.b.j.o(localObject1, "Flags.IS_INLINE_ACCESSOR.get(getterFlags)");
      bool4 = ((Boolean)localObject1).booleanValue();
      localObject1 = a((a.i.b.a.c.g.q)paramu, k, a.BGA);
      if (!bool1)
        break label1168;
      localObject2 = (ah)localObject3;
      localObject5 = t.BHx;
      localObject5 = t.a((a.r)a.i.b.a.c.e.a.b.Bww.get(k));
      localObject6 = t.BHx;
      localObject6 = t.a((a.ao)a.i.b.a.c.e.a.b.Bwv.get(k));
      if (bool1)
        break label1162;
      bool1 = true;
      label705: localObject1 = new aa((ah)localObject2, (a.i.b.a.c.b.a.g)localObject1, (a.i.b.a.c.b.w)localObject5, (az)localObject6, bool1, bool3, bool4, ((z)localObject3).Bif, null, am.BeR);
      label735: ((aa)localObject1).K(((a.i.b.a.c.j.a.a.i)localObject3).dYT());
      localObject2 = localObject1;
      label747: localObject1 = a.i.b.a.c.e.a.b.BwO.Ug(i);
      a.f.b.j.o(localObject1, "Flags.HAS_SETTER.get(flags)");
      if (!((Boolean)localObject1).booleanValue())
        break label1232;
      if (paramu.eeB())
        j = paramu.BuM;
      localObject1 = a.i.b.a.c.e.a.b.BwY.Ug(j);
      a.f.b.j.o(localObject1, "Flags.IS_NOT_DEFAULT.get(setterFlags)");
      bool1 = ((Boolean)localObject1).booleanValue();
      localObject1 = a.i.b.a.c.e.a.b.BwZ.Ug(j);
      a.f.b.j.o(localObject1, "Flags.IS_EXTERNAL_ACCESSOR.get(setterFlags)");
      bool3 = ((Boolean)localObject1).booleanValue();
      localObject1 = a.i.b.a.c.e.a.b.Bxa.Ug(j);
      a.f.b.j.o(localObject1, "Flags.IS_INLINE_ACCESSOR.get(setterFlags)");
      bool4 = ((Boolean)localObject1).booleanValue();
      localObject1 = a((a.i.b.a.c.g.q)paramu, j, a.BGB);
      if (!bool1)
        break label1200;
      localObject5 = (ah)localObject3;
      localObject6 = t.BHx;
      localObject6 = t.a((a.r)a.i.b.a.c.e.a.b.Bww.get(j));
      localObject7 = t.BHx;
      localObject7 = t.a((a.ao)a.i.b.a.c.e.a.b.Bwv.get(j));
      if (bool1)
        break label1194;
      bool1 = true;
      label924: localObject1 = new a.i.b.a.c.b.c.ab((ah)localObject5, (a.i.b.a.c.b.a.g)localObject1, (a.i.b.a.c.b.w)localObject6, (az)localObject7, bool1, bool3, bool4, ((z)localObject3).Bif, null, am.BeR);
      ((a.i.b.a.c.b.c.ab)localObject1).a((au)a.a.j.fN(k.a((k)localObject4, (l)localObject1, (List)a.a.v.AUP).BHc.a(a.a.j.listOf(paramu.BuK), (a.i.b.a.c.g.q)paramu, a.BGB)));
    }
    while (true)
    {
      localObject4 = a.i.b.a.c.e.a.b.BwR.Ug(i);
      a.f.b.j.o(localObject4, "Flags.HAS_CONSTANT.get(flags)");
      if (((Boolean)localObject4).booleanValue())
        ((a.i.b.a.c.j.a.a.i)localObject3).a(this.BHj.Brl.Baf.j((a.f.a.a)new q.d(this, paramu, (a.i.b.a.c.j.a.a.i)localObject3)));
      ((a.i.b.a.c.j.a.a.i)localObject3).a((aa)localObject2, (aj)localObject1, (a.i.b.a.c.b.r)new o(a(paramu, false), (ah)localObject3), (a.i.b.a.c.b.r)new o(a(paramu, true), (ah)localObject3), f.a.BIi);
      paramu = (ah)localObject3;
      AppMethodBeat.o(122280);
      return paramu;
      i = UK(paramu.Bus);
      break;
      label1139: localObject1 = a.i.b.a.c.b.a.g.BfJ;
      localObject1 = g.a.eai();
      break label406;
      label1150: localObject1 = null;
      break label490;
      label1155: k = j;
      break label563;
      label1162: bool1 = false;
      break label705;
      label1168: localObject1 = a.i.b.a.c.i.c.a((ah)localObject3, (a.i.b.a.c.b.a.g)localObject1);
      a.f.b.j.o(localObject1, "DescriptorFactory.create…er(property, annotations)");
      break label735;
      label1188: localObject2 = null;
      break label747;
      label1194: bool1 = false;
      break label924;
      label1200: localObject4 = (ah)localObject3;
      localObject5 = a.i.b.a.c.b.a.g.BfJ;
      localObject1 = a.i.b.a.c.i.c.a((ah)localObject4, (a.i.b.a.c.b.a.g)localObject1, g.a.eai());
      a.f.b.j.o(localObject1, "DescriptorFactory.create…ptor */\n                )");
      continue;
      label1232: localObject1 = null;
    }
  }

  public final al g(a.o paramo)
  {
    AppMethodBeat.i(122282);
    a.f.b.j.p(paramo, "proto");
    int i;
    Object localObject1;
    label58: Object localObject3;
    label104: Object localObject4;
    Object localObject5;
    Object localObject6;
    if (paramo.ecY())
    {
      i = paramo.BsW;
      localObject1 = a((a.i.b.a.c.g.q)paramo, i, a.BGy);
      if (!a.i.b.a.c.e.a.g.f(paramo))
        break label675;
      localObject2 = a((a.i.b.a.c.g.q)paramo, a.BGy);
      if (!a.f.b.j.j(a.i.b.a.c.i.c.a.o(this.BHj.Bht).q(r.b(this.BHj.AWq, paramo.Buf)), v.BHC))
        break label688;
      localObject3 = a.i.b.a.c.e.a.i.Bxj;
      localObject3 = a.i.b.a.c.e.a.i.ego();
      localObject4 = this.BHj.Bht;
      localObject5 = r.b(this.BHj.AWq, paramo.Buf);
      localObject6 = t.BHx;
      localObject3 = new a.i.b.a.c.j.a.a.j((l)localObject4, (a.i.b.a.c.b.a.g)localObject1, (f)localObject5, t.a((a.q)a.i.b.a.c.e.a.b.BwE.get(i)), paramo, this.BHj.AWq, this.BHj.AWr, (a.i.b.a.c.e.a.i)localObject3, this.BHj.BHe);
      localObject1 = this.BHj;
      localObject4 = (l)localObject3;
      localObject5 = paramo.Btp;
      a.f.b.j.o(localObject5, "proto.typeParameterList");
      localObject6 = k.a((k)localObject1, (l)localObject4, (List)localObject5);
      localObject1 = a.i.b.a.c.e.a.g.b(paramo, this.BHj.AWr);
      if (localObject1 == null)
        break label700;
      localObject1 = ((k)localObject6).BHb.r((a.aa)localObject1);
      if (localObject1 == null)
        break label700;
    }
    label675: label688: label700: for (Object localObject2 = a.i.b.a.c.i.c.a((a.i.b.a.c.b.a)localObject3, (a.i.b.a.c.l.w)localObject1, (a.i.b.a.c.b.a.g)localObject2); ; localObject2 = null)
    {
      localObject5 = dYR();
      localObject1 = ((k)localObject6).BHb.ejS();
      localObject4 = ((k)localObject6).BHc;
      Object localObject7 = paramo.BtO;
      a.f.b.j.o(localObject7, "proto.valueParameterList");
      localObject4 = ((q)localObject4).a((List)localObject7, (a.i.b.a.c.g.q)paramo, a.BGy);
      localObject6 = ((k)localObject6).BHb.r(a.i.b.a.c.e.a.g.a(paramo, this.BHj.AWr));
      localObject7 = t.BHx;
      localObject7 = t.a((a.r)a.i.b.a.c.e.a.b.Bww.get(i));
      Object localObject8 = t.BHx;
      localObject8 = t.a((a.ao)a.i.b.a.c.e.a.b.Bwv.get(i));
      Map localMap = a.a.ad.emptyMap();
      Boolean localBoolean = a.i.b.a.c.e.a.b.BwK.Ug(i);
      a.f.b.j.o(localBoolean, "Flags.IS_SUSPEND.get(flags)");
      localBoolean.booleanValue();
      a((a.i.b.a.c.j.a.a.j)localObject3, (ak)localObject2, (ak)localObject5, (List)localObject1, (List)localObject4, (a.i.b.a.c.l.w)localObject6, (a.i.b.a.c.b.w)localObject7, (az)localObject8, localMap);
      localObject2 = a.i.b.a.c.e.a.b.BwF.Ug(i);
      a.f.b.j.o(localObject2, "Flags.IS_OPERATOR.get(flags)");
      ((p)localObject3).BhR = ((Boolean)localObject2).booleanValue();
      localObject2 = a.i.b.a.c.e.a.b.BwG.Ug(i);
      a.f.b.j.o(localObject2, "Flags.IS_INFIX.get(flags)");
      ((p)localObject3).BhS = ((Boolean)localObject2).booleanValue();
      localObject2 = a.i.b.a.c.e.a.b.BwJ.Ug(i);
      a.f.b.j.o(localObject2, "Flags.IS_EXTERNAL_FUNCTION.get(flags)");
      ((p)localObject3).Bhu = ((Boolean)localObject2).booleanValue();
      localObject2 = a.i.b.a.c.e.a.b.BwH.Ug(i);
      a.f.b.j.o(localObject2, "Flags.IS_INLINE.get(flags)");
      ((p)localObject3).BhT = ((Boolean)localObject2).booleanValue();
      localObject2 = a.i.b.a.c.e.a.b.BwI.Ug(i);
      a.f.b.j.o(localObject2, "Flags.IS_TAILREC.get(flags)");
      ((p)localObject3).BhU = ((Boolean)localObject2).booleanValue();
      localObject2 = a.i.b.a.c.e.a.b.BwK.Ug(i);
      a.f.b.j.o(localObject2, "Flags.IS_SUSPEND.get(flags)");
      ((p)localObject3).BhZ = ((Boolean)localObject2).booleanValue();
      localObject2 = a.i.b.a.c.e.a.b.BwL.Ug(i);
      a.f.b.j.o(localObject2, "Flags.IS_EXPECT_FUNCTION.get(flags)");
      ((p)localObject3).BhV = ((Boolean)localObject2).booleanValue();
      this.BHj.Brl.BGW.a(paramo, (a.i.b.a.c.b.t)localObject3, this.BHj.AWr, this.BHj.BHb);
      paramo = (al)localObject3;
      AppMethodBeat.o(122282);
      return paramo;
      i = UK(paramo.Bus);
      break;
      localObject2 = a.i.b.a.c.b.a.g.BfJ;
      localObject2 = g.a.eai();
      break label58;
      localObject3 = this.BHj.BHd;
      break label104;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.q
 * JD-Core Version:    0.6.2
 */