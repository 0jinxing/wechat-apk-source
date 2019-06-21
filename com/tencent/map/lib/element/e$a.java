package com.tencent.map.lib.element;

class e$a
{
  public int a;
  public int b;

  public e$a(e parame, int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.a = paramInt2;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramObject == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if (paramObject == this)
      {
        bool2 = true;
      }
      else
      {
        paramObject = (a)paramObject;
        bool2 = bool1;
        if (paramObject.a == this.a)
        {
          bool2 = bool1;
          if (paramObject.b == this.b)
            bool2 = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.element.e.a
 * JD-Core Version:    0.6.2
 */