package a.f.b;

import a.i.k;

public abstract class p extends c
  implements k
{
  protected final k dWL()
  {
    return (k)super.dWE();
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this);
    while (true)
    {
      return bool;
      if ((paramObject instanceof p))
      {
        paramObject = (p)paramObject;
        if ((!dWF().equals(paramObject.dWF())) || (!getName().equals(paramObject.getName())) || (!due().equals(paramObject.due())) || (!j.j(dWC(), paramObject.dWC())))
          bool = false;
      }
      else if ((paramObject instanceof k))
      {
        bool = paramObject.equals(dWD());
      }
      else
      {
        bool = false;
      }
    }
  }

  public int hashCode()
  {
    return (dWF().hashCode() * 31 + getName().hashCode()) * 31 + due().hashCode();
  }

  public String toString()
  {
    Object localObject = dWD();
    if (localObject != this);
    for (localObject = localObject.toString(); ; localObject = "property " + getName() + " (Kotlin reflection is not available)")
      return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.f.b.p
 * JD-Core Version:    0.6.2
 */