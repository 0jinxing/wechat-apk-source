package com.tencent.mm.vending.j;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class a
{
  Object[] a;

  public static <$1, $2> c<$1, $2> F($1 param$1, $2 param$2)
  {
    AppMethodBeat.i(126103);
    c localc = new c();
    localc.a = new Object[] { param$1, param$2 };
    param$1 = (c)localc;
    AppMethodBeat.o(126103);
    return param$1;
  }

  public static <$1, $2, $3, $4, $5> f<$1, $2, $3, $4, $5> b($1 param$1, $2 param$2, $3 param$3, $4 param$4, $5 param$5)
  {
    AppMethodBeat.i(126105);
    f localf = new f();
    localf.a = new Object[] { param$1, param$2, param$3, param$4, param$5 };
    param$1 = (f)localf;
    AppMethodBeat.o(126105);
    return param$1;
  }

  public static <$1> b<$1> cW($1 param$1)
  {
    AppMethodBeat.i(126102);
    b localb = new b();
    localb.a = new Object[] { param$1 };
    param$1 = (b)localb;
    AppMethodBeat.o(126102);
    return param$1;
  }

  public static <$1, $2, $3> d<$1, $2, $3> i($1 param$1, $2 param$2, $3 param$3)
  {
    AppMethodBeat.i(126104);
    d locald = new d();
    locald.a = new Object[] { param$1, param$2, param$3 };
    param$1 = (d)locald;
    AppMethodBeat.o(126104);
    return param$1;
  }

  public final <T> T get(int paramInt)
  {
    if (this.a.length <= paramInt);
    for (Object localObject = null; ; localObject = this.a[paramInt])
      return localObject;
  }

  public final int size()
  {
    if (this.a == null);
    for (int i = 0; ; i = this.a.length)
      return i;
  }

  public String toString()
  {
    AppMethodBeat.i(126106);
    Object localObject1 = new StringBuilder();
    int i = 1;
    Object[] arrayOfObject = this.a;
    int j = arrayOfObject.length;
    int k = 0;
    if (k < j)
    {
      Object localObject2 = arrayOfObject[k];
      if (i != 0)
        i = 0;
      while (true)
      {
        ((StringBuilder)localObject1).append(localObject2);
        k++;
        break;
        ((StringBuilder)localObject1).append(",");
      }
    }
    localObject1 = ((StringBuilder)localObject1).toString();
    AppMethodBeat.o(126106);
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.j.a
 * JD-Core Version:    0.6.2
 */