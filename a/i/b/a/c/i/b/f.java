package a.i.b.a.c.i.b;

import a.f.b.j;
import a.i.b.a.c.b.y;
import a.i.b.a.c.l.w;

public abstract class f<T>
{
  private final T value;

  public f(T paramT)
  {
    this.value = paramT;
  }

  public abstract w b(y paramy);

  public boolean equals(Object paramObject)
  {
    Object localObject1 = null;
    Object localObject2;
    if ((f)this != paramObject)
    {
      localObject2 = getValue();
      if ((paramObject instanceof f))
        break label63;
      paramObject = null;
    }
    label63: 
    while (true)
    {
      f localf = (f)paramObject;
      paramObject = localObject1;
      if (localf != null)
        paramObject = localf.getValue();
      if (j.j(localObject2, paramObject));
      for (boolean bool = true; ; bool = false)
        return bool;
    }
  }

  public T getValue()
  {
    return this.value;
  }

  public int hashCode()
  {
    Object localObject = getValue();
    if (localObject != null);
    for (int i = localObject.hashCode(); ; i = 0)
      return i;
  }

  public String toString()
  {
    return String.valueOf(getValue());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.b.f
 * JD-Core Version:    0.6.2
 */