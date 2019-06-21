package com.tencent.matrix.resource.c.a;

public final class a
{
  public final b bXA;
  public final Object bXB;
  public final int bXz;

  public a(int paramInt, b paramb, Object paramObject)
  {
    this.bXz = paramInt;
    this.bXA = paramb;
    this.bXB = paramObject;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2;
    if (this == paramObject)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if (!(paramObject instanceof a))
      {
        bool2 = false;
      }
      else
      {
        paramObject = (a)paramObject;
        if (this.bXz != paramObject.bXz)
        {
          bool2 = false;
        }
        else if (!this.bXA.equals(paramObject.bXA))
        {
          bool2 = false;
        }
        else if ((this.bXB == null) || (this.bXB.equals(paramObject.bXB)))
        {
          bool2 = bool1;
          if (paramObject.bXB != null)
          {
            bool2 = bool1;
            if (paramObject.bXB.equals(this.bXB));
          }
        }
        else
        {
          bool2 = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    return (this.bXA.hashCode() << 31) + this.bXz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.c.a.a
 * JD-Core Version:    0.6.2
 */