package com.tencent.matrix.resource.c;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class c
{
  private int bXj = 0;
  private final InputStream bXs;

  public c(InputStream paramInputStream)
  {
    this.bXs = paramInputStream;
  }

  private int a(int paramInt, b paramb)
  {
    com.tencent.matrix.resource.c.a.b localb = com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj);
    int i = com.tencent.matrix.resource.c.b.a.m(this.bXs);
    int j = com.tencent.matrix.resource.c.b.a.m(this.bXs);
    int k = this.bXs.read();
    Object localObject = com.tencent.matrix.resource.c.a.c.fW(k);
    if (localObject == null)
      throw new IllegalStateException("accept primitive array failed, lost type def of typeId: ".concat(String.valueOf(k)));
    int m = j * ((com.tencent.matrix.resource.c.a.c)localObject).getSize(this.bXj);
    localObject = new byte[m];
    com.tencent.matrix.resource.c.b.a.a(this.bXs, (byte[])localObject, m);
    paramb.a(paramInt, localb, i, j, k, (byte[])localObject);
    return this.bXj + 4 + 4 + 1 + m;
  }

  private int a(b paramb)
  {
    paramb.a(com.tencent.matrix.resource.c.b.a.m(this.bXs), com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj));
    return this.bXj + 4;
  }

  private void a(int paramInt1, int paramInt2, long paramLong, d paramd)
  {
    paramd = paramd.a(paramInt1, paramInt2, paramLong);
    long l = paramLong;
    if (paramd == null)
      com.tencent.matrix.resource.c.b.a.d(this.bXs, paramLong);
    while (true)
    {
      return;
      paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj));
      l = paramLong - this.bXj;
      while (l > 0L)
      {
        paramInt1 = this.bXs.read();
        paramLong = l - 1L;
        switch (paramInt1)
        {
        case 255:
        default:
          throw new IllegalArgumentException("acceptHeapDumpRecord loop with unknown tag " + paramInt1 + " with " + this.bXs.available() + " bytes possibly remaining");
        case 1:
          paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj));
          com.tencent.matrix.resource.c.b.a.d(this.bXs, this.bXj);
          l = paramLong - (this.bXj << 1);
          break;
        case 2:
          l = paramLong - b(paramd);
          break;
        case 3:
          l = paramLong - c(paramd);
          break;
        case 4:
          l = paramLong - d(paramd);
          break;
        case 5:
          paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj));
          l = paramLong - this.bXj;
          break;
        case 6:
          l = paramLong - e(paramd);
          break;
        case 7:
          paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj));
          l = paramLong - this.bXj;
          break;
        case 8:
          l = paramLong - f(paramd);
          break;
        case 32:
          l = paramLong - g(paramd);
          break;
        case 33:
          l = paramLong - h(paramd);
          break;
        case 34:
          l = paramLong - i(paramd);
          break;
        case 35:
          l = paramLong - a(paramInt1, paramd);
          break;
        case 195:
          l = paramLong - a(paramInt1, paramd);
          break;
        case 254:
          l = paramLong - a(paramd);
          break;
        case 137:
          paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj));
          l = paramLong - this.bXj;
          break;
        case 138:
          paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj));
          l = paramLong - this.bXj;
          break;
        case 139:
          paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj));
          l = paramLong - this.bXj;
          break;
        case 140:
          paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj));
          l = paramLong - this.bXj;
          break;
        case 141:
          paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj));
          l = paramLong - this.bXj;
          break;
        case 142:
          l = paramLong - j(paramd);
          break;
        case 144:
          paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj));
          l = paramLong - this.bXj;
        }
      }
      paramd.zn();
    }
  }

  private void a(int paramInt, long paramLong, d paramd)
  {
    paramd.a(com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), com.tencent.matrix.resource.c.b.a.c(this.bXs, paramLong - this.bXj), paramInt, paramLong);
  }

  private int b(b paramb)
  {
    paramb.a(com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), com.tencent.matrix.resource.c.b.a.m(this.bXs), com.tencent.matrix.resource.c.b.a.m(this.bXs));
    return this.bXj + 4 + 4;
  }

  private void b(int paramInt1, int paramInt2, long paramLong, d paramd)
  {
    byte[] arrayOfByte = new byte[(int)paramLong];
    com.tencent.matrix.resource.c.b.a.a(this.bXs, arrayOfByte, paramLong);
    paramd.a(paramInt1, paramInt2, paramLong, arrayOfByte);
  }

  private void b(int paramInt, long paramLong, d paramd)
  {
    paramd.a(com.tencent.matrix.resource.c.b.a.m(this.bXs), com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), com.tencent.matrix.resource.c.b.a.m(this.bXs), com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), paramInt, paramLong);
  }

  private void b(d paramd)
  {
    String str = com.tencent.matrix.resource.c.b.a.o(this.bXs);
    int i = com.tencent.matrix.resource.c.b.a.m(this.bXs);
    if ((i <= 0) || (i >= 1073741823))
      throw new IOException("bad idSize: ".concat(String.valueOf(i)));
    long l = com.tencent.matrix.resource.c.b.a.n(this.bXs);
    this.bXj = i;
    paramd.a(str, i, l);
  }

  private int c(b paramb)
  {
    paramb.b(com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), com.tencent.matrix.resource.c.b.a.m(this.bXs), com.tencent.matrix.resource.c.b.a.m(this.bXs));
    return this.bXj + 4 + 4;
  }

  private void c(int paramInt, long paramLong, d paramd)
  {
    paramd.a(com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), com.tencent.matrix.resource.c.b.a.m(this.bXs), com.tencent.matrix.resource.c.b.a.m(this.bXs), paramInt, paramLong);
  }

  private void c(d paramd)
  {
    while (true)
    {
      int i;
      int j;
      long l;
      try
      {
        i = this.bXs.read();
        j = com.tencent.matrix.resource.c.b.a.m(this.bXs);
        l = 0xFFFFFFFF & com.tencent.matrix.resource.c.b.a.m(this.bXs);
        switch (i)
        {
        default:
          b(i, j, l, paramd);
          continue;
        case 1:
        case 2:
        case 4:
        case 5:
        case 12:
        case 28:
        }
      }
      catch (EOFException paramd)
      {
        return;
      }
      a(j, l, paramd);
      continue;
      b(j, l, paramd);
      continue;
      c(j, l, paramd);
      continue;
      d(j, l, paramd);
      continue;
      a(i, j, l, paramd);
    }
  }

  private int d(b paramb)
  {
    paramb.a(com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), com.tencent.matrix.resource.c.b.a.m(this.bXs));
    return this.bXj + 4;
  }

  private void d(int paramInt, long paramLong, d paramd)
  {
    int i = com.tencent.matrix.resource.c.b.a.m(this.bXs);
    int j = com.tencent.matrix.resource.c.b.a.m(this.bXs);
    int k = com.tencent.matrix.resource.c.b.a.m(this.bXs);
    com.tencent.matrix.resource.c.a.b[] arrayOfb = new com.tencent.matrix.resource.c.a.b[k];
    for (int m = 0; m < k; m++)
      arrayOfb[m] = com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj);
    paramd.a(i, j, arrayOfb, paramInt, paramLong);
  }

  private int e(b paramb)
  {
    paramb.b(com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), com.tencent.matrix.resource.c.b.a.m(this.bXs));
    return this.bXj + 4;
  }

  private int f(b paramb)
  {
    paramb.c(com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), com.tencent.matrix.resource.c.b.a.m(this.bXs), com.tencent.matrix.resource.c.b.a.m(this.bXs));
    return this.bXj + 4 + 4;
  }

  private int g(b paramb)
  {
    com.tencent.matrix.resource.c.a.b localb1 = com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj);
    int i = com.tencent.matrix.resource.c.b.a.m(this.bXs);
    com.tencent.matrix.resource.c.a.b localb2 = com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj);
    com.tencent.matrix.resource.c.a.b localb3 = com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj);
    com.tencent.matrix.resource.c.b.a.d(this.bXs, this.bXj << 2);
    int j = com.tencent.matrix.resource.c.b.a.m(this.bXs);
    int k = this.bXj;
    int m = com.tencent.matrix.resource.c.b.a.l(this.bXs);
    int n = 0;
    int i1;
    for (k = k * 7 + 4 + 4 + 2; n < m; k = i1 + 2 + k)
    {
      com.tencent.matrix.resource.c.b.a.d(this.bXs, 2L);
      i1 = zo();
      n++;
    }
    m = com.tencent.matrix.resource.c.b.a.l(this.bXs);
    com.tencent.matrix.resource.c.a.a[] arrayOfa = new com.tencent.matrix.resource.c.a.a[m];
    n = 0;
    k += 2;
    com.tencent.matrix.resource.c.a.b localb4;
    while (n < m)
    {
      localb4 = com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj);
      i1 = this.bXs.read();
      localObject = com.tencent.matrix.resource.c.a.c.fW(i1);
      if (localObject == null)
        throw new IllegalStateException("accept class failed, lost type def of typeId: ".concat(String.valueOf(i1)));
      arrayOfa[n] = new com.tencent.matrix.resource.c.a.a(i1, localb4, com.tencent.matrix.resource.c.b.a.a(this.bXs, (com.tencent.matrix.resource.c.a.c)localObject, this.bXj));
      int i2 = this.bXj;
      i1 = ((com.tencent.matrix.resource.c.a.c)localObject).getSize(this.bXj);
      n++;
      k = i2 + 1 + i1 + k;
    }
    m = com.tencent.matrix.resource.c.b.a.l(this.bXs);
    Object localObject = new com.tencent.matrix.resource.c.a.a[m];
    k += 2;
    for (n = 0; n < m; n++)
    {
      localb4 = com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj);
      localObject[n] = new com.tencent.matrix.resource.c.a.a(this.bXs.read(), localb4, null);
      k += this.bXj + 1;
    }
    paramb.a(localb1, i, localb2, localb3, j, arrayOfa, (com.tencent.matrix.resource.c.a.a[])localObject);
    return k;
  }

  private int h(b paramb)
  {
    com.tencent.matrix.resource.c.a.b localb1 = com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj);
    int i = com.tencent.matrix.resource.c.b.a.m(this.bXs);
    com.tencent.matrix.resource.c.a.b localb2 = com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj);
    int j = com.tencent.matrix.resource.c.b.a.m(this.bXs);
    byte[] arrayOfByte = new byte[j];
    com.tencent.matrix.resource.c.b.a.a(this.bXs, arrayOfByte, j);
    paramb.a(localb1, i, localb2, arrayOfByte);
    return this.bXj + 4 + this.bXj + 4 + j;
  }

  private int i(b paramb)
  {
    com.tencent.matrix.resource.c.a.b localb1 = com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj);
    int i = com.tencent.matrix.resource.c.b.a.m(this.bXs);
    int j = com.tencent.matrix.resource.c.b.a.m(this.bXs);
    com.tencent.matrix.resource.c.a.b localb2 = com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj);
    int k = j * this.bXj;
    byte[] arrayOfByte = new byte[k];
    com.tencent.matrix.resource.c.b.a.a(this.bXs, arrayOfByte, k);
    paramb.a(localb1, i, j, localb2, arrayOfByte);
    return this.bXj + 4 + 4 + this.bXj + k;
  }

  private int j(b paramb)
  {
    paramb.d(com.tencent.matrix.resource.c.b.a.a(this.bXs, this.bXj), com.tencent.matrix.resource.c.b.a.m(this.bXs), com.tencent.matrix.resource.c.b.a.m(this.bXs));
    return this.bXj + 4 + 4;
  }

  private int zo()
  {
    int i = this.bXs.read();
    com.tencent.matrix.resource.c.a.c localc = com.tencent.matrix.resource.c.a.c.fW(i);
    if (localc == null)
      throw new IllegalStateException("failure to skip type, cannot find type def of typeid: ".concat(String.valueOf(i)));
    i = localc.getSize(this.bXj);
    com.tencent.matrix.resource.c.b.a.d(this.bXs, i);
    return i + 1;
  }

  public final void a(d paramd)
  {
    b(paramd);
    c(paramd);
    paramd.zn();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.c.c
 * JD-Core Version:    0.6.2
 */