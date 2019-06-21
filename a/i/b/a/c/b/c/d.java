package a.i.b.a.c.b.c;

import a.f.a.b;
import a.i.b.a.c.b.a;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.aq;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.n;
import a.i.b.a.c.b.o;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.c;
import a.i.b.a.c.k.i;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.au;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ba;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class d extends k
  implements aq
{
  protected List<? extends ar> Bhf;
  private final d.b Bhg;
  protected final az Bhh;

  public d(l paraml, g paramg, f paramf, am paramam, az paramaz)
  {
    super(paraml, paramg, paramf, paramam);
    this.Bhh = paramaz;
    this.Bhg = new d.b(this);
  }

  private aq eam()
  {
    o localo = super.ean();
    if (localo == null)
      throw new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
    return (aq)localo;
  }

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    a.f.b.j.p(paramn, "visitor");
    return paramn.a((aq)this, paramD);
  }

  public final an dXY()
  {
    return (an)this.Bhg;
  }

  public final a.i.b.a.c.b.w dYd()
  {
    return a.i.b.a.c.b.w.BeB;
  }

  public final az dYf()
  {
    return this.Bhh;
  }

  public final boolean dYh()
  {
    return av.b((a.i.b.a.c.l.w)dZP(), (b)new d.a(this));
  }

  public final boolean dYk()
  {
    return false;
  }

  public final boolean dYl()
  {
    return false;
  }

  public final boolean dYm()
  {
    return false;
  }

  public final List<ar> dYq()
  {
    List localList = this.Bhf;
    if (localList == null)
      a.f.b.j.avw("declaredTypeParametersImpl");
    return localList;
  }

  protected abstract i eak();

  public final Collection<af> eal()
  {
    Object localObject1 = dZR();
    if (localObject1 == null);
    Collection localCollection;
    for (localObject1 = (Collection)a.a.v.AUP; ; localObject1 = (Collection)localCollection)
    {
      return localObject1;
      localObject1 = ((e)localObject1).dYb();
      a.f.b.j.o(localObject1, "classDescriptor.constructors");
      localObject1 = (Iterable)localObject1;
      localCollection = (Collection)new ArrayList();
      Iterator localIterator = ((Iterable)localObject1).iterator();
      if (localIterator.hasNext())
      {
        Object localObject2 = (a.i.b.a.c.b.d)localIterator.next();
        localObject1 = ag.Bjq;
        Object localObject3 = eak();
        aq localaq = (aq)this;
        a.f.b.j.o(localObject2, "it");
        a.f.b.j.p(localObject3, "storageManager");
        a.f.b.j.p(localaq, "typeAliasDescriptor");
        a.f.b.j.p(localObject2, "constructor");
        localObject1 = ag.a.a(localaq);
        if (localObject1 == null)
          localObject1 = null;
        label133: Object localObject4;
        Object localObject5;
        Object localObject6;
        while (true)
          if (localObject1 != null)
          {
            localCollection.add(localObject1);
            break;
            localObject4 = ((a.i.b.a.c.b.d)localObject2).a((au)localObject1);
            if (localObject4 == null)
            {
              localObject1 = null;
            }
            else
            {
              localObject5 = ((a.i.b.a.c.b.d)localObject2).dYn();
              b.a locala = ((a.i.b.a.c.b.d)localObject2).dYZ();
              a.f.b.j.o(locala, "constructor.kind");
              localObject6 = localaq.dYo();
              a.f.b.j.o(localObject6, "typeAliasDescriptor.source");
              localObject3 = new ag((i)localObject3, localaq, (a.i.b.a.c.b.d)localObject4, null, (g)localObject5, locala, (am)localObject6, (byte)0);
              localObject5 = p.a((a.i.b.a.c.b.t)localObject3, ((a.i.b.a.c.b.d)localObject2).dYV(), (au)localObject1, false, false, null);
              if (localObject5 == null)
              {
                localObject1 = null;
              }
              else
              {
                a.f.b.j.o(localObject5, "FunctionDescriptorImpl.g…         ) ?: return null");
                localObject4 = a.i.b.a.c.l.t.ak((a.i.b.a.c.l.w)((a.i.b.a.c.b.d)localObject4).dYT().ekn());
                localObject6 = localaq.dZf();
                a.f.b.j.o(localObject6, "typeAliasDescriptor.defaultType");
                localObject4 = a.i.b.a.c.l.ag.b((ad)localObject4, (ad)localObject6);
                localObject6 = ((a.i.b.a.c.b.d)localObject2).dYR();
                if (localObject6 == null)
                  break label413;
                localObject2 = (a)localObject3;
                a.f.b.j.o(localObject6, "it");
                localObject6 = ((au)localObject1).b(((ak)localObject6).dZS(), ba.BKh);
                localObject1 = g.BfJ;
              }
            }
          }
        label413: for (localObject1 = c.a((a)localObject2, (a.i.b.a.c.l.w)localObject6, g.a.eai()); ; localObject1 = null)
        {
          ((ag)localObject3).a((ak)localObject1, null, localaq.dYq(), (List)localObject5, (a.i.b.a.c.l.w)localObject4, a.i.b.a.c.b.w.BeB, localaq.dYf());
          localObject1 = (af)localObject3;
          break label133;
          break;
        }
      }
    }
  }

  protected abstract List<ar> eao();

  public String toString()
  {
    return "typealias " + this.BgZ.name;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.d
 * JD-Core Version:    0.6.2
 */