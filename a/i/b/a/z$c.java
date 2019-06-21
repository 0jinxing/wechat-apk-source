package a.i.b.a;

public abstract class z$c<T>
{
  private static final Object AYw = new Object()
  {
  };

  protected static Object du(T paramT)
  {
    Object localObject = paramT;
    if (paramT == null)
      localObject = AYw;
    return localObject;
  }

  protected static T dv(Object paramObject)
  {
    Object localObject = paramObject;
    if (paramObject == AYw)
      localObject = null;
    return localObject;
  }

  public abstract T invoke();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.z.c
 * JD-Core Version:    0.6.2
 */