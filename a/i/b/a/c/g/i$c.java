package a.i.b.a.c.g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class i$c<MessageType extends c<MessageType>> extends i
  implements i.d<MessageType>
{
  protected final h<i.e> BzI;

  protected i$c()
  {
    this.BzI = h.eig();
  }

  protected i$c(i.b<MessageType, ?> paramb)
  {
    this.BzI = i.b.a(paramb);
  }

  private void b(i.f<MessageType, ?> paramf)
  {
    if (paramf.BzS != ecE())
      throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
  }

  public final <Type> Type a(i.f<MessageType, List<Type>> paramf, int paramInt)
  {
    b(paramf);
    Object localObject = this.BzI;
    i.e locale = paramf.BzU;
    if (!locale.eim())
      throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    localObject = ((h)localObject).a(locale);
    if (localObject == null)
      throw new IndexOutOfBoundsException();
    return paramf.dM(((List)localObject).get(paramInt));
  }

  protected final boolean a(e parame, f paramf, g paramg, int paramInt)
  {
    h localh = this.BzI;
    Object localObject = ecE();
    int i = z.fy(paramInt);
    int j = z.fz(paramInt);
    i.f localf = (i.f)paramg.BzA.get(new g.a(localObject, j));
    if (localf != null)
      if (i == h.a(localf.BzU.BzP, false))
      {
        i = 0;
        j = 0;
      }
    boolean bool;
    while (j != 0)
    {
      bool = parame.a(paramInt, paramf);
      return bool;
      if ((localf.BzU.BzQ) && (localf.BzU.BzP.eiN()) && (i == h.a(localf.BzU.BzP, true)))
      {
        i = 1;
        j = 0;
      }
      else
      {
        i = 0;
        j = 1;
      }
    }
    if (i != 0)
    {
      paramInt = parame.fo(parame.vd());
      if (localf.BzU.BzP == z.a.BBe)
        while (parame.vg() > 0)
        {
          i = parame.vd();
          paramf = localf.BzU.BzO.SW(i);
          if (paramf == null)
            break label277;
          localh.b(localf.BzU, localf.dN(paramf));
        }
      while (parame.vg() > 0)
      {
        paramf = h.a(parame, localf.BzU.BzP);
        localh.b(localf.BzU, paramf);
      }
      parame.fp(paramInt);
    }
    while (true)
    {
      label277: bool = true;
      break;
      switch (i.1.BzG[localf.BzU.BzP.BBj.ordinal()])
      {
      default:
        parame = h.a(parame, localf.BzU.BzP);
        label337: if (!localf.BzU.BzQ)
          break label628;
        localh.b(localf.BzU, localf.dN(parame));
      case 1:
      case 2:
      }
    }
    if (!localf.BzU.BzQ)
    {
      paramf = (q)localh.a(localf.BzU);
      if (paramf == null);
    }
    for (paramf = paramf.ecC(); ; paramf = null)
    {
      localObject = paramf;
      if (paramf == null)
        localObject = localf.BzT.ecD();
      if (localf.BzU.BzP == z.a.BBa)
      {
        paramInt = localf.BzU.number;
        if (parame.bxp >= parame.bxq)
          throw k.eiw();
        parame.bxp += 1;
        ((q.a)localObject).d(parame, paramg);
        parame.fm(z.bv(paramInt, 4));
        parame.bxp -= 1;
      }
      while (true)
      {
        parame = ((q.a)localObject).ecM();
        break;
        paramInt = parame.vd();
        if (parame.bxp >= parame.bxq)
          throw k.eiw();
        paramInt = parame.fo(paramInt);
        parame.bxp += 1;
        ((q.a)localObject).d(parame, paramg);
        parame.fm(0);
        parame.bxp -= 1;
        parame.fp(paramInt);
      }
      i = parame.vd();
      paramg = localf.BzU.BzO.SW(i);
      parame = paramg;
      if (paramg != null)
        break label337;
      paramf.fw(paramInt);
      paramf.fw(i);
      break;
      label628: localh.a(localf.BzU, localf.dN(parame));
      break;
    }
  }

  public final <Type> boolean c(i.f<MessageType, Type> paramf)
  {
    b(paramf);
    h localh = this.BzI;
    paramf = paramf.BzU;
    if (paramf.eim())
      throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    if (localh.BzC.get(paramf) != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final <Type> int d(i.f<MessageType, List<Type>> paramf)
  {
    b(paramf);
    h localh = this.BzI;
    paramf = paramf.BzU;
    if (!paramf.eim())
      throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    paramf = localh.a(paramf);
    if (paramf == null);
    for (int i = 0; ; i = ((List)paramf).size())
      return i;
  }

  public final <Type> Type e(i.f<MessageType, Type> paramf)
  {
    b(paramf);
    Object localObject1 = this.BzI.a(paramf.BzU);
    Object localObject2;
    if (localObject1 == null)
      localObject2 = paramf.aze;
    while (true)
    {
      return localObject2;
      if (paramf.BzU.BzQ)
      {
        localObject2 = localObject1;
        if (paramf.BzU.BzP.BBj == z.b.BBt)
        {
          localObject2 = new ArrayList();
          localObject1 = ((List)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
            ((List)localObject2).add(paramf.dM(((Iterator)localObject1).next()));
        }
      }
      else
      {
        localObject2 = paramf.dM(localObject1);
      }
    }
  }

  protected final void eio()
  {
    this.BzI.eii();
  }

  protected final c<MessageType>.a eip()
  {
    return new i.c.a(this, (byte)0);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.i.c
 * JD-Core Version:    0.6.2
 */