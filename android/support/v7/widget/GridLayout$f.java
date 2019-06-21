package android.support.v7.widget;

final class GridLayout$f
{
  public final int max;
  public final int min;

  public GridLayout$f(int paramInt1, int paramInt2)
  {
    this.min = paramInt1;
    this.max = paramInt2;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        bool = false;
      }
      else
      {
        paramObject = (f)paramObject;
        if (this.max != paramObject.max)
          bool = false;
        else if (this.min != paramObject.min)
          bool = false;
      }
    }
  }

  public final int hashCode()
  {
    return this.min * 31 + this.max;
  }

  final int size()
  {
    return this.max - this.min;
  }

  public final String toString()
  {
    return "[" + this.min + ", " + this.max + "]";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.GridLayout.f
 * JD-Core Version:    0.6.2
 */