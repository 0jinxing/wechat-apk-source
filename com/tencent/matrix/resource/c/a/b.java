package com.tencent.matrix.resource.c.a;

import java.util.Arrays;

public final class b
{
  public final byte[] bXC;

  public b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    this.bXC = new byte[i];
    System.arraycopy(paramArrayOfByte, 0, this.bXC, 0, i);
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b));
    for (boolean bool = false; ; bool = Arrays.equals(this.bXC, ((b)paramObject).bXC))
      return bool;
  }

  public final int hashCode()
  {
    return Arrays.hashCode(this.bXC);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("0x");
    byte[] arrayOfByte = this.bXC;
    int i = arrayOfByte.length;
    for (int j = 0; j < i; j++)
      localStringBuilder.append(Integer.toHexString(arrayOfByte[j] & 0xFF));
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.c.a.b
 * JD-Core Version:    0.6.2
 */