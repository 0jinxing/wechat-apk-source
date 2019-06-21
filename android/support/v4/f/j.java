package android.support.v4.f;

public final class j<F, S>
{
  public final F first;
  public final S second;

  public j(F paramF, S paramS)
  {
    this.first = paramF;
    this.second = paramS;
  }

  private static boolean e(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2))));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (!(paramObject instanceof j))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      paramObject = (j)paramObject;
      bool2 = bool1;
      if (e(paramObject.first, this.first))
      {
        bool2 = bool1;
        if (e(paramObject.second, this.second))
          bool2 = true;
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    int j;
    if (this.first == null)
    {
      j = 0;
      if (this.second != null)
        break label33;
    }
    while (true)
    {
      return j ^ i;
      j = this.first.hashCode();
      break;
      label33: i = this.second.hashCode();
    }
  }

  public final String toString()
  {
    return "Pair{" + String.valueOf(this.first) + " " + String.valueOf(this.second) + "}";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.f.j
 * JD-Core Version:    0.6.2
 */