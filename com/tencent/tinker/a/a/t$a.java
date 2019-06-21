package com.tencent.tinker.a.a;

public final class t$a
  implements Comparable<a>
{
  public final short AyO;
  public boolean AyP;
  public int byteCount = 0;
  public int off = -1;
  public int size = 0;

  public t$a(int paramInt, boolean paramBoolean)
  {
    this.AyO = ((short)(short)paramInt);
    this.AyP = paramBoolean;
    if (paramInt == 0)
    {
      this.off = 0;
      this.size = 1;
      this.byteCount = 112;
    }
    while (true)
    {
      return;
      if (paramInt == 4096)
        this.size = 1;
    }
  }

  private static int Rp(int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("unknown section type: ".concat(String.valueOf(paramInt)));
    case 0:
      paramInt = 0;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 8194:
    case 4097:
    case 8196:
    case 4099:
    case 4098:
    case 8198:
    case 8195:
    case 8193:
    case 8192:
    case 8197:
    case 4096:
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      continue;
      paramInt = 2;
      continue;
      paramInt = 3;
      continue;
      paramInt = 4;
      continue;
      paramInt = 5;
      continue;
      paramInt = 6;
      continue;
      paramInt = 7;
      continue;
      paramInt = 8;
      continue;
      paramInt = 9;
      continue;
      paramInt = 10;
      continue;
      paramInt = 11;
      continue;
      paramInt = 12;
      continue;
      paramInt = 13;
      continue;
      paramInt = 14;
      continue;
      paramInt = 15;
      continue;
      paramInt = 16;
      continue;
      paramInt = 17;
    }
  }

  public final boolean exists()
  {
    if (this.size > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String toString()
  {
    return String.format("Section[type=%#x,off=%#x,size=%#x]", new Object[] { Short.valueOf(this.AyO), Integer.valueOf(this.off), Integer.valueOf(this.size) });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.a.t.a
 * JD-Core Version:    0.6.2
 */