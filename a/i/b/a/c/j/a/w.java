package a.i.b.a.c.j.a;

import a.i.b.a.c.b.e;
import a.i.b.a.c.b.h;
import a.i.b.a.c.b.y;
import a.i.b.a.c.e.a.aa;
import a.i.b.a.c.e.a.aa.a;
import a.i.b.a.c.e.a.aa.a.b;
import a.i.b.a.c.e.a.ae;
import a.i.b.a.c.e.a.b.a;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.l.ag;
import a.i.b.a.c.l.ah;
import a.i.b.a.c.l.al;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.p;
import a.i.b.a.c.l.x;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class w
{
  private final a.f.a.b<Integer, e> BHD;
  private final a.f.a.b<Integer, h> BHE;
  private final Map<Integer, a.i.b.a.c.b.ar> BHF;
  private final w BHG;
  boolean BHH;
  final k BHj;
  private final String ByG;

  private w(k paramk, w paramw, List<a.ae> paramList, String paramString)
  {
    AppMethodBeat.i(122332);
    this.BHj = paramk;
    this.BHG = paramw;
    this.ByG = paramString;
    this.BHH = false;
    this.BHD = ((a.f.a.b)this.BHj.Brl.Baf.g((a.f.a.b)new w.a(this)));
    this.BHE = ((a.f.a.b)this.BHj.Brl.Baf.g((a.f.a.b)new w.d(this)));
    if (paramList.isEmpty())
      paramw = a.a.ad.emptyMap();
    for (paramk = this; ; paramk = this)
    {
      paramk.BHF = paramw;
      AppMethodBeat.o(122332);
      return;
      paramk = new LinkedHashMap();
      paramw = ((Iterable)paramList).iterator();
      for (int i = 0; paramw.hasNext(); i++)
      {
        paramList = (a.ae)paramw.next();
        ((Map)paramk).put(Integer.valueOf(paramList.BsE), new a.i.b.a.c.j.a.a.l(this.BHj, paramList, i));
      }
      paramw = (Map)paramk;
    }
  }

  private final an UL(int paramInt)
  {
    AppMethodBeat.i(122328);
    Object localObject1 = this;
    do
    {
      localObject2 = (a.i.b.a.c.b.ar)((w)localObject1).BHF.get(Integer.valueOf(paramInt));
      if (localObject2 != null)
      {
        an localan = ((a.i.b.a.c.b.ar)localObject2).dXY();
        localObject2 = localan;
        if (localan != null)
          break;
      }
      localObject2 = ((w)localObject1).BHG;
      localObject1 = localObject2;
    }
    while (localObject2 != null);
    Object localObject2 = null;
    AppMethodBeat.o(122328);
    return localObject2;
  }

  private final a.i.b.a.c.l.ad UM(int paramInt)
  {
    AppMethodBeat.i(122329);
    if (r.a(this.BHj.AWq, paramInt).ByO)
      AppMethodBeat.o(122329);
    while (true)
    {
      return null;
      AppMethodBeat.o(122329);
    }
  }

  private final a.i.b.a.c.l.ad a(a.i.b.a.c.b.a.g paramg, an paraman, List<? extends ap> paramList, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(122324);
    switch (paraman.getParameters().size() - paramList.size())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      paramg = (a.i.b.a.c.b.a.g)localObject;
      if (localObject == null)
      {
        paramg = p.C("Bad suspend function in metadata with constructor: ".concat(String.valueOf(paraman)), paramList);
        a.f.b.j.o(paramg, "ErrorUtils.createErrorTy…      arguments\n        )");
      }
      AppMethodBeat.o(122324);
      return paramg;
      localObject = b(paramg, paraman, paramList, paramBoolean);
      continue;
      int i = paramList.size() - 1;
      if (i >= 0)
      {
        localObject = paraman.dZD().SM(i);
        a.f.b.j.o(localObject, "functionTypeConstructor.…getSuspendFunction(arity)");
        localObject = ((e)localObject).dXY();
        a.f.b.j.o(localObject, "functionTypeConstructor.…on(arity).typeConstructor");
        localObject = x.c(paramg, (an)localObject, paramList, paramBoolean);
      }
    }
  }

  private static a.i.b.a.c.l.ad a(a.i.b.a.c.l.w paramw1, a.i.b.a.c.l.w paramw2)
  {
    AppMethodBeat.i(122327);
    a.i.b.a.c.a.g localg = a.i.b.a.c.l.c.a.aL(paramw1);
    a.i.b.a.c.b.a.g localg1 = paramw1.dYn();
    a.i.b.a.c.l.w localw = a.i.b.a.c.a.f.h(paramw1);
    Object localObject = (Iterable)a.a.j.fP(a.i.b.a.c.a.f.j(paramw1));
    Collection localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
      localCollection.add(((ap)((Iterator)localObject).next()).dZS());
    paramw1 = a.i.b.a.c.a.f.a(localg, localg1, localw, (List)localCollection, paramw2, true).rL(paramw1.eci());
    AppMethodBeat.o(122327);
    return paramw1;
  }

  private final ap a(a.i.b.a.c.b.ar paramar, a.aa.a parama)
  {
    AppMethodBeat.i(122330);
    if (parama.Bvn == a.aa.a.b.Bvt)
      if (paramar == null)
      {
        paramar = this.BHj.Brl.Bdv.dZD().dXN();
        a.f.b.j.o(paramar, "c.components.moduleDescr….builtIns.nullableAnyType");
        paramar = (ap)new al((a.i.b.a.c.l.w)paramar);
        AppMethodBeat.o(122330);
      }
    while (true)
    {
      return paramar;
      paramar = (ap)new ah(paramar);
      AppMethodBeat.o(122330);
      continue;
      paramar = t.BHx;
      paramar = parama.Bvn;
      a.f.b.j.o(paramar, "typeArgumentProto.projection");
      paramar = t.b(paramar);
      parama = a.i.b.a.c.e.a.g.a(parama, this.BHj.AWr);
      if (parama == null)
      {
        paramar = (ap)new a.i.b.a.c.l.ar((a.i.b.a.c.l.w)p.awn("No type recorded"));
        AppMethodBeat.o(122330);
      }
      else
      {
        paramar = (ap)new a.i.b.a.c.l.ar(paramar, r(parama));
        AppMethodBeat.o(122330);
      }
    }
  }

  private final a.i.b.a.c.l.ad af(a.i.b.a.c.l.w paramw)
  {
    Object localObject1 = null;
    AppMethodBeat.i(122326);
    Object localObject2 = (ap)a.a.j.fM(a.i.b.a.c.a.f.j(paramw));
    Object localObject3;
    if (localObject2 != null)
    {
      localObject3 = ((ap)localObject2).dZS();
      if (localObject3 != null);
    }
    else
    {
      AppMethodBeat.o(122326);
      paramw = null;
    }
    label126: a.i.b.a.c.l.w localw;
    while (true)
    {
      return paramw;
      a.f.b.j.o(localObject3, "funType.getValueParamete…ll()?.type ?: return null");
      localObject2 = ((a.i.b.a.c.l.w)localObject3).ejw().dYs();
      if (localObject2 != null);
      for (localObject2 = a.i.b.a.c.i.c.a.o((a.i.b.a.c.b.l)localObject2); ; localObject2 = null)
      {
        if ((((a.i.b.a.c.l.w)localObject3).ejt().size() == 1) && ((a.i.b.a.c.a.k.a((a.i.b.a.c.f.b)localObject2, true)) || (a.i.b.a.c.a.k.a((a.i.b.a.c.f.b)localObject2, false))))
          break label126;
        paramw = (a.i.b.a.c.l.ad)paramw;
        AppMethodBeat.o(122326);
        break;
      }
      localw = ((ap)a.a.j.fN(((a.i.b.a.c.l.w)localObject3).ejt())).dZS();
      a.f.b.j.o(localw, "continuationArgumentType.arguments.single().type");
      localObject3 = this.BHj.Bht;
      localObject2 = localObject3;
      if (!(localObject3 instanceof a.i.b.a.c.b.a))
        localObject2 = null;
      localObject3 = (a.i.b.a.c.b.a)localObject2;
      localObject2 = localObject1;
      if (localObject3 != null)
        localObject2 = a.i.b.a.c.i.c.a.I((a.i.b.a.c.b.l)localObject3);
      if (!a.f.b.j.j(localObject2, v.BHC))
        break;
      paramw = a(paramw, localw);
      AppMethodBeat.o(122326);
    }
    if (this.BHH);
    for (boolean bool = true; ; bool = false)
    {
      this.BHH = bool;
      paramw = a(paramw, localw);
      AppMethodBeat.o(122326);
      break;
    }
  }

  private final a.i.b.a.c.l.ad b(a.i.b.a.c.b.a.g paramg, an paraman, List<? extends ap> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(122325);
    paramg = x.c(paramg, paraman, paramList, paramBoolean);
    if (!a.i.b.a.c.a.f.d((a.i.b.a.c.l.w)paramg))
    {
      paramg = null;
      AppMethodBeat.o(122325);
    }
    while (true)
    {
      return paramg;
      paramg = af((a.i.b.a.c.l.w)paramg);
      AppMethodBeat.o(122325);
    }
  }

  private final an t(a.aa paramaa)
  {
    AppMethodBeat.i(122323);
    Object localObject1 = new w.e(this, paramaa);
    Object localObject2;
    Object localObject3;
    if (paramaa.efc())
    {
      localObject2 = (e)this.BHD.am(Integer.valueOf(paramaa.Bve));
      localObject3 = localObject2;
      if (localObject2 == null)
        localObject3 = ((w.e)localObject1).UN(paramaa.Bve);
      paramaa = ((e)localObject3).dXY();
      a.f.b.j.o(paramaa, "(classDescriptors(proto.…assName)).typeConstructor");
      AppMethodBeat.o(122323);
    }
    while (true)
    {
      return paramaa;
      if (paramaa.efd())
      {
        localObject2 = UL(paramaa.Bvf);
        localObject3 = localObject2;
        if (localObject2 == null)
        {
          paramaa = p.awp("Unknown type parameter " + paramaa.Bvf);
          a.f.b.j.o(paramaa, "ErrorUtils.createErrorTy… ${proto.typeParameter}\")");
          AppMethodBeat.o(122323);
        }
      }
      else
      {
        if (paramaa.efe())
        {
          localObject2 = this.BHj.Bht;
          localObject1 = this.BHj.AWq.getString(paramaa.Bvg);
          localObject3 = ((Iterable)ejS()).iterator();
          do
          {
            if (!((Iterator)localObject3).hasNext())
              break;
            paramaa = ((Iterator)localObject3).next();
          }
          while (!a.f.b.j.j(((a.i.b.a.c.b.ar)paramaa).dZg().name, localObject1));
          while (true)
          {
            paramaa = (a.i.b.a.c.b.ar)paramaa;
            if (paramaa != null)
            {
              paramaa = paramaa.dXY();
              localObject3 = paramaa;
              if (paramaa != null)
                break label391;
            }
            paramaa = p.awp("Deserialized type parameter " + (String)localObject1 + " in " + localObject2);
            a.f.b.j.o(paramaa, "ErrorUtils.createErrorTy…ter $name in $container\")");
            AppMethodBeat.o(122323);
            break;
            paramaa = null;
          }
        }
        if (paramaa.eff())
        {
          localObject2 = (h)this.BHE.am(Integer.valueOf(paramaa.Bvh));
          localObject3 = localObject2;
          if (localObject2 == null)
            localObject3 = (h)((w.e)localObject1).UN(paramaa.Bvh);
          paramaa = ((h)localObject3).dXY();
          a.f.b.j.o(paramaa, "(typeAliasDescriptors(pr…iasName)).typeConstructor");
          AppMethodBeat.o(122323);
        }
        else
        {
          localObject3 = p.awp("Unknown type");
          a.f.b.j.o(localObject3, "ErrorUtils.createErrorTy…nstructor(\"Unknown type\")");
          label391: AppMethodBeat.o(122323);
          paramaa = (a.aa)localObject3;
        }
      }
    }
  }

  public final List<a.i.b.a.c.b.ar> ejS()
  {
    AppMethodBeat.i(122320);
    List localList = a.a.j.m((Iterable)this.BHF.values());
    AppMethodBeat.o(122320);
    return localList;
  }

  public final a.i.b.a.c.l.w r(a.aa paramaa)
  {
    AppMethodBeat.i(122321);
    a.f.b.j.p(paramaa, "proto");
    if (paramaa.eeZ())
    {
      String str = this.BHj.AWq.getString(paramaa.Bvb);
      a.i.b.a.c.l.ad localad = s(paramaa);
      Object localObject = a.i.b.a.c.e.a.g.a(paramaa, this.BHj.AWr);
      if (localObject == null)
        a.f.b.j.dWJ();
      localObject = s((a.aa)localObject);
      paramaa = this.BHj.Brl.BGU.a(paramaa, str, localad, (a.i.b.a.c.l.ad)localObject);
      AppMethodBeat.o(122321);
    }
    while (true)
    {
      return paramaa;
      paramaa = (a.i.b.a.c.l.w)s(paramaa);
      AppMethodBeat.o(122321);
    }
  }

  public final a.i.b.a.c.l.ad s(a.aa paramaa)
  {
    AppMethodBeat.i(122322);
    a.f.b.j.p(paramaa, "proto");
    an localan;
    Object localObject1;
    if (paramaa.efc())
    {
      UM(paramaa.Bve);
      localan = t(paramaa);
      if (!p.L((a.i.b.a.c.b.l)localan.dYs()))
        break label93;
      localObject1 = p.a(localan.toString(), localan);
      a.f.b.j.o(localObject1, "ErrorUtils.createErrorTy….toString(), constructor)");
      AppMethodBeat.o(122322);
    }
    while (true)
    {
      return localObject1;
      if (!paramaa.eff())
        break;
      UM(paramaa.Bvh);
      break;
      label93: localObject1 = new a.i.b.a.c.j.a.a.a(this.BHj.Brl.Baf, (a.f.a.a)new w.c(this, paramaa));
      Object localObject2 = (Iterable)new w.b(this).u(paramaa);
      Object localObject3 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
      int i = 0;
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject4 = ((Iterator)localObject2).next();
        if (i < 0)
          a.a.j.dWs();
        a.aa.a locala = (a.aa.a)localObject4;
        localObject4 = localan.getParameters();
        a.f.b.j.o(localObject4, "constructor.parameters");
        ((Collection)localObject3).add(a((a.i.b.a.c.b.ar)a.a.j.x((List)localObject4, i), locala));
        i++;
      }
      localObject3 = a.a.j.m((Iterable)localObject3);
      localObject2 = a.i.b.a.c.e.a.b.Bwt.Ug(paramaa.BsW);
      a.f.b.j.o(localObject2, "Flags.SUSPEND_TYPE.get(proto.flags)");
      if (((Boolean)localObject2).booleanValue());
      for (localObject1 = a((a.i.b.a.c.b.a.g)localObject1, localan, (List)localObject3, paramaa.Bva); ; localObject1 = x.c((a.i.b.a.c.b.a.g)localObject1, localan, (List)localObject3, paramaa.Bva))
      {
        paramaa = a.i.b.a.c.e.a.g.c(paramaa, this.BHj.AWr);
        if (paramaa != null)
          break label349;
        AppMethodBeat.o(122322);
        break;
      }
      label349: localObject1 = ag.b((a.i.b.a.c.l.ad)localObject1, s(paramaa));
      AppMethodBeat.o(122322);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122331);
    StringBuilder localStringBuilder = new StringBuilder().append(this.ByG);
    if (this.BHG == null);
    for (String str = ""; ; str = ". Child of " + this.BHG.ByG)
    {
      str = str;
      AppMethodBeat.o(122331);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.w
 * JD-Core Version:    0.6.2
 */