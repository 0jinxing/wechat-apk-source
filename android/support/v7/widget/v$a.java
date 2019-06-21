package android.support.v7.widget;

final class v$a
{
  long ahd = 0L;
  a ahe;

  private void hV()
  {
    if (this.ahe == null)
      this.ahe = new a();
  }

  final boolean bJ(int paramInt)
  {
    a locala = this;
    while (paramInt >= 64)
    {
      locala.hV();
      locala = locala.ahe;
      paramInt -= 64;
    }
    long l1 = 1L << paramInt;
    if ((locala.ahd & l1) != 0L);
    for (boolean bool = true; ; bool = false)
    {
      locala.ahd &= (l1 ^ 0xFFFFFFFF);
      l1 -= 1L;
      long l2 = locala.ahd;
      locala.ahd = (Long.rotateRight((l1 ^ 0xFFFFFFFF) & locala.ahd, 1) | l2 & l1);
      if (locala.ahe != null)
      {
        if (locala.ahe.get(0))
          locala.set(63);
        locala.ahe.bJ(0);
      }
      return bool;
    }
  }

  final int bK(int paramInt)
  {
    if (this.ahe == null)
      if (paramInt >= 64)
        paramInt = Long.bitCount(this.ahd);
    while (true)
    {
      return paramInt;
      paramInt = Long.bitCount(this.ahd & (1L << paramInt) - 1L);
      continue;
      if (paramInt < 64)
        paramInt = Long.bitCount(this.ahd & (1L << paramInt) - 1L);
      else
        paramInt = this.ahe.bK(paramInt - 64) + Long.bitCount(this.ahd);
    }
  }

  final void clear(int paramInt)
  {
    a locala = this;
    while (paramInt >= 64)
    {
      if (locala.ahe == null)
        return;
      locala = locala.ahe;
      paramInt -= 64;
    }
    locala.ahd &= (1L << paramInt ^ 0xFFFFFFFF);
  }

  final boolean get(int paramInt)
  {
    a locala = this;
    while (paramInt >= 64)
    {
      locala.hV();
      locala = locala.ahe;
      paramInt -= 64;
    }
    if ((locala.ahd & 1L << paramInt) != 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void m(int paramInt, boolean paramBoolean)
  {
    boolean bool = paramBoolean;
    a locala = this;
    while (paramInt >= 64)
    {
      locala.hV();
      locala = locala.ahe;
      paramInt -= 64;
    }
    if ((locala.ahd & 0x0) != 0L)
    {
      paramBoolean = true;
      label45: long l1 = (1L << paramInt) - 1L;
      long l2 = locala.ahd;
      locala.ahd = (((l1 ^ 0xFFFFFFFF) & locala.ahd) << 1 | l2 & l1);
      if (!bool)
        break label130;
      locala.set(paramInt);
    }
    while (true)
    {
      if ((!paramBoolean) && (locala.ahe == null))
        return;
      locala.hV();
      locala = locala.ahe;
      paramInt = 0;
      bool = paramBoolean;
      break;
      paramBoolean = false;
      break label45;
      label130: locala.clear(paramInt);
    }
  }

  final void set(int paramInt)
  {
    a locala = this;
    while (paramInt >= 64)
    {
      locala.hV();
      locala = locala.ahe;
      paramInt -= 64;
    }
    locala.ahd |= 1L << paramInt;
  }

  public final String toString()
  {
    if (this.ahe == null);
    for (String str = Long.toBinaryString(this.ahd); ; str = this.ahe.toString() + "xx" + Long.toBinaryString(this.ahd))
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.v.a
 * JD-Core Version:    0.6.2
 */