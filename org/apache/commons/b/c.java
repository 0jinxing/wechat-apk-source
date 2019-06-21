package org.apache.commons.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class c
{
  private transient c.a[] BWZ;
  private final float BXa;
  private transient int count;
  private int yrA;

  public c()
  {
    this((byte)0);
  }

  private c(byte paramByte)
  {
    AppMethodBeat.i(116954);
    this.BXa = 0.75F;
    this.BWZ = new c.a[20];
    this.yrA = 15;
    AppMethodBeat.o(116954);
  }

  public final Object v(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(116955);
    Object localObject1 = this.BWZ;
    int i = (paramInt & 0x7FFFFFFF) % localObject1.length;
    Object localObject2 = localObject1[i];
    if (localObject2 != null)
      if (((c.a)localObject2).puf == paramInt)
      {
        localObject1 = ((c.a)localObject2).value;
        ((c.a)localObject2).value = paramObject;
        AppMethodBeat.o(116955);
        paramObject = localObject1;
      }
    while (true)
    {
      return paramObject;
      localObject2 = ((c.a)localObject2).BXb;
      break;
      localObject2 = localObject1;
      if (this.count >= this.yrA)
      {
        i = this.BWZ.length;
        c.a[] arrayOfa1 = this.BWZ;
        int j = i * 2 + 1;
        c.a[] arrayOfa2 = new c.a[j];
        this.yrA = ((int)(j * this.BXa));
        this.BWZ = arrayOfa2;
        while (true)
        {
          int k = i - 1;
          if (i <= 0)
            break;
          for (localObject2 = arrayOfa1[k]; localObject2 != null; localObject2 = localObject1)
          {
            localObject1 = ((c.a)localObject2).BXb;
            i = (((c.a)localObject2).puf & 0x7FFFFFFF) % j;
            ((c.a)localObject2).BXb = arrayOfa2[i];
            arrayOfa2[i] = localObject2;
          }
          i = k;
        }
        localObject2 = this.BWZ;
        i = (paramInt & 0x7FFFFFFF) % localObject2.length;
      }
      localObject2[i] = new c.a(paramInt, paramInt, paramObject, localObject2[i]);
      this.count += 1;
      paramObject = null;
      AppMethodBeat.o(116955);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.apache.commons.b.c
 * JD-Core Version:    0.6.2
 */