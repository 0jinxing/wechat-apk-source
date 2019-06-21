package a.i.b.a.c.l;

import a.i.b.a.c.a.g;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.c.a;
import a.i.b.a.c.i.d;
import a.i.b.a.c.k.i;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class b extends c
  implements an
{
  private int aBR = 0;

  public b(i parami)
  {
    super(parami);
  }

  private static boolean d(a.i.b.a.c.b.h paramh)
  {
    if ((!p.L(paramh)) && (!d.m(paramh)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public abstract e dYt();

  public final g dZD()
  {
    return a.G(dYt());
  }

  protected final w ear()
  {
    if (g.e(dYt()));
    for (Object localObject = null; ; localObject = a.G(dYt()).dXM())
      return localObject;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject)
      bool = true;
    while (true)
    {
      return bool;
      if (!(paramObject instanceof an))
      {
        bool = false;
      }
      else if (paramObject.hashCode() != hashCode())
      {
        bool = false;
      }
      else if (((an)paramObject).getParameters().size() != getParameters().size())
      {
        bool = false;
      }
      else
      {
        Object localObject = dYt();
        paramObject = ((an)paramObject).dYs();
        if ((!d((a.i.b.a.c.b.h)localObject)) || ((paramObject != null) && (!d(paramObject))))
        {
          bool = false;
        }
        else if ((paramObject instanceof e))
        {
          localObject = (e)localObject;
          paramObject = (e)paramObject;
          if (!((e)localObject).dZg().equals(paramObject.dZg()))
          {
            bool = false;
          }
          else
          {
            localObject = ((e)localObject).dXW();
            for (paramObject = paramObject.dXW(); ; paramObject = paramObject.dXW())
            {
              if ((localObject == null) || (paramObject == null))
                break label290;
              if ((localObject instanceof y))
              {
                bool = paramObject instanceof y;
                break;
              }
              if ((paramObject instanceof y))
              {
                bool = false;
                break;
              }
              if ((localObject instanceof ab))
              {
                if (((paramObject instanceof ab)) && (((ab)localObject).dZF().equals(((ab)paramObject).dZF())))
                  break label290;
                bool = false;
                break;
              }
              if ((paramObject instanceof ab))
              {
                bool = false;
                break;
              }
              if (!((l)localObject).dZg().equals(paramObject.dZg()))
              {
                bool = false;
                break;
              }
              localObject = ((l)localObject).dXW();
            }
            label290: bool = true;
          }
        }
        else
        {
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = this.aBR;
    if (i != 0)
      return i;
    e locale = dYt();
    if (d(locale));
    for (i = d.n(locale).hashCode(); ; i = System.identityHashCode(this))
    {
      this.aBR = i;
      break;
    }
  }

  protected final Collection<w> sb(boolean paramBoolean)
  {
    Object localObject1 = dYt().dXW();
    Object localObject2;
    if (!(localObject1 instanceof e))
      localObject2 = Collections.emptyList();
    while (true)
    {
      return localObject2;
      localObject2 = new a.i.b.a.c.n.h();
      localObject1 = (e)localObject1;
      ((Collection)localObject2).add(((e)localObject1).dZf());
      localObject1 = ((e)localObject1).dYa();
      if ((paramBoolean) && (localObject1 != null))
        ((Collection)localObject2).add(((e)localObject1).dZf());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.b
 * JD-Core Version:    0.6.2
 */