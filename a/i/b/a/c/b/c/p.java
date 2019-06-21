package a.i.b.a.c.b.c;

import a.a.j;
import a.i.b.a.c.b.a.a;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.a.i;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.n;
import a.i.b.a.c.b.t;
import a.i.b.a.c.b.t.a;
import a.i.b.a.c.f.f;
import a.i.b.a.c.l.as;
import a.i.b.a.c.l.ba;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class p extends k
  implements t
{
  public List<ar> BeK;
  public List<a.i.b.a.c.b.au> BhM;
  public a.i.b.a.c.l.w BhN;
  private ak BhO;
  protected ak BhP;
  public az BhQ = ay.Bfe;
  public boolean BhR = false;
  public boolean BhS = false;
  public boolean BhT = false;
  public boolean BhU = false;
  public boolean BhV = false;
  boolean BhW = false;
  boolean BhX = false;
  boolean BhY = false;
  public boolean BhZ = false;
  public boolean Bhu = false;
  protected a.i.b.a.c.b.w Bhv;
  private boolean Bia = true;
  private boolean Bib = false;
  private Collection<? extends t> Bic = null;
  private volatile a.f.a.a<Collection<t>> Bid = null;
  private final t Bie;
  protected final b.a Bif;
  private t Big = null;
  protected Map<a.a<?>, Object> Bih = null;

  protected p(l paraml, t paramt, g paramg, f paramf, b.a parama, am paramam)
  {
    super(paraml, paramg, paramf, paramam);
    paraml = paramt;
    if (paramt == null)
      paraml = this;
    this.Bie = paraml;
    this.Bif = parama;
  }

  public static List<a.i.b.a.c.b.au> a(t paramt, List<a.i.b.a.c.b.au> paramList, a.i.b.a.c.l.au paramau, boolean paramBoolean1, boolean paramBoolean2, boolean[] paramArrayOfBoolean)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    Object localObject1;
    a.i.b.a.c.l.w localw;
    Object localObject2;
    if (localIterator.hasNext())
    {
      localObject1 = (a.i.b.a.c.b.au)localIterator.next();
      localw = paramau.c(((a.i.b.a.c.b.au)localObject1).dZS(), ba.BKi);
      localObject2 = ((a.i.b.a.c.b.au)localObject1).dZV();
      if (localObject2 == null)
      {
        paramList = null;
        label77: if (localw != null)
          break label99;
      }
    }
    for (paramt = null; ; paramt = localArrayList)
    {
      return paramt;
      paramList = paramau.c((a.i.b.a.c.l.w)localObject2, ba.BKi);
      break label77;
      label99: if (((localw != ((a.i.b.a.c.b.au)localObject1).dZS()) || (localObject2 != paramList)) && (paramArrayOfBoolean != null))
        paramArrayOfBoolean[0] = true;
      label134: int i;
      g localg;
      f localf;
      boolean bool1;
      boolean bool2;
      boolean bool3;
      if (paramBoolean1)
      {
        localObject2 = null;
        i = ((a.i.b.a.c.b.au)localObject1).getIndex();
        localg = ((a.i.b.a.c.b.au)localObject1).dYn();
        localf = ((a.i.b.a.c.b.au)localObject1).dZg();
        bool1 = ((a.i.b.a.c.b.au)localObject1).dZU();
        bool2 = ((a.i.b.a.c.b.au)localObject1).dZX();
        bool3 = ((a.i.b.a.c.b.au)localObject1).dZY();
        if (!paramBoolean2)
          break label247;
      }
      label247: for (localObject1 = ((a.i.b.a.c.b.au)localObject1).dYo(); ; localObject1 = am.BeR)
      {
        localArrayList.add(new ai(paramt, (a.i.b.a.c.b.au)localObject2, i, localg, localf, localw, bool1, bool2, bool3, paramList, (am)localObject1));
        break;
        localObject2 = localObject1;
        break label134;
      }
    }
  }

  public p a(ak paramak1, ak paramak2, List<? extends ar> paramList, List<a.i.b.a.c.b.au> paramList1, a.i.b.a.c.l.w paramw, a.i.b.a.c.b.w paramw1, az paramaz)
  {
    int i = 0;
    this.BeK = j.m(paramList);
    this.BhM = j.m(paramList1);
    this.BhN = paramw;
    this.Bhv = paramw1;
    this.BhQ = paramaz;
    this.BhO = paramak1;
    this.BhP = paramak2;
    int k;
    for (int j = 0; ; j++)
    {
      k = i;
      if (j >= paramList.size())
        break;
      paramak1 = (ar)paramList.get(j);
      if (paramak1.getIndex() != j)
        throw new IllegalStateException(paramak1 + " index is " + paramak1.getIndex() + " but position is " + j);
    }
    do
    {
      k++;
      if (k >= paramList1.size())
        break;
      paramak1 = (a.i.b.a.c.b.au)paramList1.get(k);
    }
    while (paramak1.getIndex() == k + 0);
    throw new IllegalStateException(paramak1 + "index is " + paramak1.getIndex() + " but position is " + k);
    return this;
  }

  protected abstract p a(l paraml, t paramt, b.a parama, f paramf, g paramg, am paramam);

  protected t a(p.a parama)
  {
    boolean[] arrayOfBoolean = new boolean[1];
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    label69: label78: label107: int j;
    if (parama.Biw != null)
    {
      localObject1 = i.a(dYn(), parama.Biw);
      localObject2 = parama.Bil;
      localObject3 = parama.Bie;
      localObject4 = parama.Bif;
      localObject5 = parama.BgZ;
      boolean bool1 = parama.Bit;
      localObject6 = parama.Bie;
      if (!bool1)
        break label188;
      if (localObject6 == null)
        break label179;
      localObject6 = ((t)localObject6).dYo();
      localObject4 = a((l)localObject2, (t)localObject3, (b.a)localObject4, (f)localObject5, (g)localObject1, (am)localObject6);
      if (parama.Biv != null)
        break label196;
      localObject1 = this.BeK;
      i = arrayOfBoolean[0];
      if (((List)localObject1).isEmpty())
        break label204;
      j = 1;
      label124: arrayOfBoolean[0] = (j | i);
      localObject3 = new ArrayList(((List)localObject1).size());
      localObject2 = a.i.b.a.c.l.k.a((List)localObject1, parama.Bik, (l)localObject4, (List)localObject3, arrayOfBoolean);
      if (localObject2 != null)
        break label210;
    }
    for (Object localObject1 = null; ; localObject1 = null)
    {
      return localObject1;
      localObject1 = dYn();
      break;
      label179: localObject6 = dZp();
      break label69;
      label188: localObject6 = am.BeR;
      break label78;
      label196: localObject1 = parama.Biv;
      break label107;
      label204: j = 0;
      break label124;
      label210: if (parama.Bip == null)
        break label943;
      localObject1 = ((a.i.b.a.c.l.au)localObject2).c(parama.Bip.dZS(), ba.BKi);
      if (localObject1 != null)
        break label244;
    }
    label244: Object localObject6 = new ac((l)localObject4, new a.i.b.a.c.i.e.a.b((a.i.b.a.c.b.a)localObject4, (a.i.b.a.c.l.w)localObject1, parama.Bip.dZO()), parama.Bip.dYn());
    int i = arrayOfBoolean[0];
    if (localObject1 != parama.Bip.dZS())
    {
      j = 1;
      label304: arrayOfBoolean[0] = (j | i);
    }
    while (true)
    {
      if (parama.BhP != null)
      {
        localObject5 = parama.BhP.e((a.i.b.a.c.l.au)localObject2);
        if (localObject5 == null)
        {
          localObject1 = null;
          break;
          j = 0;
          break label304;
        }
        i = arrayOfBoolean[0];
        if (localObject5 != parama.BhP)
        {
          j = 1;
          label365: arrayOfBoolean[0] = (j | i);
        }
      }
      while (true)
      {
        List localList = a((t)localObject4, parama.Bio, (a.i.b.a.c.l.au)localObject2, parama.Biu, parama.Bit, arrayOfBoolean);
        if (localList == null)
        {
          localObject1 = null;
          break;
          j = 0;
          break label365;
        }
        a.i.b.a.c.l.w localw = ((a.i.b.a.c.l.au)localObject2).c(parama.Biq, ba.BKj);
        if (localw == null)
        {
          localObject1 = null;
          break;
        }
        i = arrayOfBoolean[0];
        if (localw != parama.Biq)
        {
          j = 1;
          arrayOfBoolean[0] = (j | i);
          if (arrayOfBoolean[0] == 0)
          {
            localObject1 = this;
            if (parama.Biy)
              break;
          }
          ((p)localObject4).a((ak)localObject6, (ak)localObject5, (List)localObject3, localList, localw, parama.Bim, parama.Bin);
          ((p)localObject4).BhR = this.BhR;
          ((p)localObject4).BhS = this.BhS;
          ((p)localObject4).Bhu = this.Bhu;
          ((p)localObject4).BhT = this.BhT;
          ((p)localObject4).BhU = this.BhU;
          ((p)localObject4).BhZ = this.BhZ;
          ((p)localObject4).BhV = this.BhV;
          ((p)localObject4).BhW = this.BhW;
          ((p)localObject4).rH(this.Bia);
          ((p)localObject4).BhX = parama.BhX;
          ((p)localObject4).BhY = parama.BhY;
          if (parama.Bix == null)
            break label736;
        }
        label736: for (boolean bool2 = parama.Bix.booleanValue(); ; bool2 = this.Bib)
        {
          ((p)localObject4).rI(bool2);
          if ((parama.Bih.isEmpty()) && (this.Bih == null))
            break label798;
          localObject6 = parama.Bih;
          if (this.Bih == null)
            break label745;
          localObject1 = this.Bih.entrySet().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject5 = (Map.Entry)((Iterator)localObject1).next();
            if (!((Map)localObject6).containsKey(((Map.Entry)localObject5).getKey()))
              ((Map)localObject6).put(((Map.Entry)localObject5).getKey(), ((Map.Entry)localObject5).getValue());
          }
          j = 0;
          break;
        }
        label745: if (((Map)localObject6).size() == 1)
        {
          ((p)localObject4).Bih = Collections.singletonMap(((Map)localObject6).keySet().iterator().next(), ((Map)localObject6).values().iterator().next());
          if ((parama.Bis) || (this.Big != null))
          {
            if (this.Big == null)
              break label902;
            localObject1 = this.Big;
            ((p)localObject4).Big = ((t)localObject1).c((a.i.b.a.c.l.au)localObject2);
          }
          if ((parama.Bir) && (!dZp().dYX().isEmpty()))
          {
            if (!parama.Bik.isEmpty())
              break label919;
            parama = this.Bid;
            if (parama == null)
              break label907;
            ((p)localObject4).Bid = parama;
          }
        }
        while (true)
        {
          label798: label824: localObject1 = localObject4;
          break;
          ((p)localObject4).Bih = ((Map)localObject6);
          break label798;
          label902: localObject1 = this;
          break label824;
          label907: ((p)localObject4).k(dYX());
          continue;
          label919: ((p)localObject4).Bid = new a.f.a.a()
          {
          };
        }
        localObject5 = null;
      }
      label943: localObject6 = null;
    }
  }

  public <V> V a(a.a<V> parama)
  {
    if (this.Bih == null);
    for (parama = null; ; parama = this.Bih.get(parama))
      return parama;
  }

  public <R, D> R a(n<R, D> paramn, D paramD)
  {
    return paramn.a(this, paramD);
  }

  public final <V> void a(a.a<V> parama, Object paramObject)
  {
    if (this.Bih == null)
      this.Bih = new LinkedHashMap();
    this.Bih.put(parama, paramObject);
  }

  public t b(l paraml, a.i.b.a.c.b.w paramw, az paramaz, b.a parama, boolean paramBoolean)
  {
    return dZw().g(paraml).a(paramw).a(paramaz).a(parama).rG(paramBoolean).dZC();
  }

  public t c(a.i.b.a.c.l.au paramau)
  {
    if (paramau.Bik.isEmpty());
    for (paramau = this; ; paramau = h(paramau).h(dZp()).eax().dZC())
      return paramau;
  }

  public final ak dYQ()
  {
    return this.BhO;
  }

  public final ak dYR()
  {
    return this.BhP;
  }

  public final List<ar> dYS()
  {
    return this.BeK;
  }

  public a.i.b.a.c.l.w dYT()
  {
    return this.BhN;
  }

  public final List<a.i.b.a.c.b.au> dYV()
  {
    return this.BhM;
  }

  public boolean dYW()
  {
    return this.Bib;
  }

  public Collection<? extends t> dYX()
  {
    Object localObject = this.Bid;
    if (localObject != null)
    {
      this.Bic = ((Collection)((a.f.a.a)localObject).invoke());
      this.Bid = null;
    }
    if (this.Bic != null);
    for (localObject = this.Bic; ; localObject = Collections.emptyList())
      return localObject;
  }

  public final b.a dYZ()
  {
    return this.Bif;
  }

  public final a.i.b.a.c.b.w dYd()
  {
    return this.Bhv;
  }

  public final az dYf()
  {
    return this.BhQ;
  }

  public boolean dYj()
  {
    return this.BhT;
  }

  public final boolean dYk()
  {
    return this.BhV;
  }

  public final boolean dYl()
  {
    return this.BhW;
  }

  public boolean dYm()
  {
    return this.Bhu;
  }

  public boolean dYx()
  {
    return this.BhU;
  }

  public t dZp()
  {
    if (this.Bie == this);
    for (Object localObject = this; ; localObject = this.Bie.dZp())
      return localObject;
  }

  public final t dZq()
  {
    return this.Big;
  }

  public final boolean dZr()
  {
    return this.BhX;
  }

  public final boolean dZs()
  {
    boolean bool;
    if (this.BhR)
      bool = true;
    while (true)
    {
      return bool;
      Iterator localIterator = dZp().dYX().iterator();
      while (true)
        if (localIterator.hasNext())
          if (((t)localIterator.next()).dZs())
          {
            bool = true;
            break;
          }
      bool = false;
    }
  }

  public final boolean dZt()
  {
    boolean bool;
    if (this.BhS)
      bool = true;
    while (true)
    {
      return bool;
      Iterator localIterator = dZp().dYX().iterator();
      while (true)
        if (localIterator.hasNext())
          if (((t)localIterator.next()).dZt())
          {
            bool = true;
            break;
          }
      bool = false;
    }
  }

  public final boolean dZu()
  {
    return this.BhY;
  }

  public boolean dZv()
  {
    return this.BhZ;
  }

  public t.a<? extends t> dZw()
  {
    return h(a.i.b.a.c.l.au.BJW);
  }

  public boolean eaw()
  {
    return this.Bia;
  }

  protected final p.a h(a.i.b.a.c.l.au paramau)
  {
    return new p.a(this, paramau.Bik, dXW(), this.Bhv, this.BhQ, this.Bif, this.BhM, this.BhO, dYT());
  }

  public void k(Collection<? extends a.i.b.a.c.b.b> paramCollection)
  {
    this.Bic = paramCollection;
    paramCollection = this.Bic.iterator();
    while (paramCollection.hasNext())
      if (((t)paramCollection.next()).dZu())
        this.BhY = true;
  }

  public void rH(boolean paramBoolean)
  {
    this.Bia = paramBoolean;
  }

  public void rI(boolean paramBoolean)
  {
    this.Bib = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.p
 * JD-Core Version:    0.6.2
 */