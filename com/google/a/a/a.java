package com.google.a.a;

public final class a
{
  private final byte[] buffer;
  private int bufferSize;
  private int bxk;
  private int bxl;
  private int bxm;
  private int bxn;
  private int bxo = 2147483647;
  private int bxp;
  private int bxq = 64;
  private int bxr = 67108864;

  a(byte[] paramArrayOfByte, int paramInt)
  {
    this.buffer = paramArrayOfByte;
    this.bxk = 0;
    this.bufferSize = (paramInt + 0);
    this.bxm = 0;
  }

  private byte[] fr(int paramInt)
  {
    if (paramInt < 0)
      throw d.vj();
    if (this.bxm + paramInt > this.bxo)
    {
      fs(this.bxo - this.bxm);
      throw d.vi();
    }
    if (paramInt <= this.bufferSize - this.bxm)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.buffer, this.bxm, arrayOfByte, 0, paramInt);
      this.bxm += paramInt;
      return arrayOfByte;
    }
    throw d.vi();
  }

  private void fs(int paramInt)
  {
    if (paramInt < 0)
      throw d.vj();
    if (this.bxm + paramInt > this.bxo)
    {
      fs(this.bxo - this.bxm);
      throw d.vi();
    }
    if (paramInt <= this.bufferSize - this.bxm)
    {
      this.bxm += paramInt;
      return;
    }
    throw d.vi();
  }

  private void vf()
  {
    this.bufferSize += this.bxl;
    int i = this.bufferSize;
    if (i > this.bxo)
    {
      this.bxl = (i - this.bxo);
      this.bufferSize -= this.bxl;
    }
    while (true)
    {
      return;
      this.bxl = 0;
    }
  }

  private byte vh()
  {
    if (this.bxm == this.bufferSize)
      throw d.vi();
    byte[] arrayOfByte = this.buffer;
    int i = this.bxm;
    this.bxm = (i + 1);
    return arrayOfByte[i];
  }

  public final void a(e parame)
  {
    int i = vd();
    if (this.bxp >= this.bxq)
      throw d.vo();
    i = fo(i);
    this.bxp += 1;
    parame.a(this);
    fm(0);
    this.bxp -= 1;
    fp(i);
  }

  public final void fm(int paramInt)
  {
    if (this.bxn != paramInt)
      throw d.vm();
  }

  public final boolean fn(int paramInt)
  {
    boolean bool = true;
    switch (g.fy(paramInt))
    {
    default:
      throw d.vn();
    case 0:
      vd();
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return bool;
      vh();
      vh();
      vh();
      vh();
      vh();
      vh();
      vh();
      vh();
      continue;
      fs(vd());
      continue;
      int i;
      do
        i = vc();
      while ((i != 0) && (fn(i)));
      fm(g.bv(g.fz(paramInt), 4));
      continue;
      bool = false;
      continue;
      vh();
      vh();
      vh();
      vh();
    }
  }

  public final int fo(int paramInt)
  {
    if (paramInt < 0)
      throw d.vj();
    int i = this.bxm + paramInt;
    paramInt = this.bxo;
    if (i > paramInt)
      throw d.vi();
    this.bxo = i;
    vf();
    return paramInt;
  }

  public final void fp(int paramInt)
  {
    this.bxo = paramInt;
    vf();
  }

  public final void fq(int paramInt)
  {
    if (paramInt > this.bxm - this.bxk)
      throw new IllegalArgumentException("Position " + paramInt + " is beyond current " + (this.bxm - this.bxk));
    if (paramInt < 0)
      throw new IllegalArgumentException("Bad position ".concat(String.valueOf(paramInt)));
    this.bxm = (this.bxk + paramInt);
  }

  public final int getPosition()
  {
    return this.bxm - this.bxk;
  }

  public final byte[] readBytes()
  {
    int i = vd();
    byte[] arrayOfByte;
    if ((i <= this.bufferSize - this.bxm) && (i > 0))
    {
      arrayOfByte = new byte[i];
      System.arraycopy(this.buffer, this.bxm, arrayOfByte, 0, i);
      this.bxm = (i + this.bxm);
    }
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = fr(i);
    }
  }

  public final String readString()
  {
    int i = vd();
    String str;
    if ((i <= this.bufferSize - this.bxm) && (i > 0))
    {
      str = new String(this.buffer, this.bxm, i, "UTF-8");
      this.bxm = (i + this.bxm);
    }
    while (true)
    {
      return str;
      str = new String(fr(i), "UTF-8");
    }
  }

  public final int vc()
  {
    int i = 0;
    if (this.bxm == this.bufferSize)
    {
      j = 1;
      if (j == 0)
        break label33;
      this.bxn = 0;
    }
    for (int j = i; ; j = this.bxn)
    {
      return j;
      j = 0;
      break;
      label33: this.bxn = vd();
      if (this.bxn == 0)
        throw d.vl();
    }
  }

  public final int vd()
  {
    int i = vh();
    if (i >= 0);
    int k;
    do
    {
      while (true)
      {
        return i;
        j = i & 0x7F;
        i = vh();
        if (i >= 0)
        {
          i = j | i << 7;
        }
        else
        {
          j |= (i & 0x7F) << 7;
          i = vh();
          if (i >= 0)
          {
            i = j | i << 14;
          }
          else
          {
            i = j | (i & 0x7F) << 14;
            k = vh();
            if (k < 0)
              break;
            i |= k << 21;
          }
        }
      }
      j = vh();
      k = i | (k & 0x7F) << 21 | j << 28;
      i = k;
    }
    while (j >= 0);
    for (int j = 0; ; j++)
    {
      if (j >= 5)
        break label141;
      i = k;
      if (vh() >= 0)
        break;
    }
    label141: throw d.vk();
  }

  public final long ve()
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = vh();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0)
        return l;
      i += 7;
    }
    throw d.vk();
  }

  public final int vg()
  {
    if (this.bxo == 2147483647);
    for (int i = -1; ; i = this.bxo - i)
    {
      return i;
      i = this.bxm;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.a.a.a
 * JD-Core Version:    0.6.2
 */