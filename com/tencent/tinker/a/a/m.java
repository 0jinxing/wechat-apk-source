package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.b.a;

public final class m
{
  protected final a Ayj;
  public int Ayk;
  private int Ayl;
  private int type = -1;

  public m(a parama, int paramInt)
  {
    this.Ayj = parama;
    this.type = paramInt;
  }

  public m(k paramk, int paramInt)
  {
    this(new k.1(paramk), paramInt);
  }

  private void Ro(int paramInt)
  {
    if (dRL() != paramInt)
      throw new IllegalStateException(String.format("Expected %x but was %x", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(dRL()) }));
  }

  public final int dRL()
  {
    if (this.type == -1)
    {
      int i = this.Ayj.readByte() & 0xFF;
      this.type = (i & 0x1F);
      this.Ayl = ((i & 0xE0) >> 5);
    }
    return this.type;
  }

  public final int dRM()
  {
    Ro(28);
    this.type = -1;
    return o.b(this.Ayj);
  }

  public final int dRN()
  {
    Ro(29);
    this.type = -1;
    this.Ayk = o.b(this.Ayj);
    return o.b(this.Ayj);
  }

  public final int dRO()
  {
    return o.b(this.Ayj);
  }

  public final int dRP()
  {
    Ro(23);
    this.type = -1;
    return l.a(this.Ayj, this.Ayl, false);
  }

  public final int dRQ()
  {
    Ro(24);
    this.type = -1;
    return l.a(this.Ayj, this.Ayl, false);
  }

  public final int dRR()
  {
    Ro(25);
    this.type = -1;
    return l.a(this.Ayj, this.Ayl, false);
  }

  public final int dRS()
  {
    Ro(27);
    this.type = -1;
    return l.a(this.Ayj, this.Ayl, false);
  }

  public final int dRT()
  {
    Ro(26);
    this.type = -1;
    return l.a(this.Ayj, this.Ayl, false);
  }

  public final void dRU()
  {
    Ro(30);
    this.type = -1;
  }

  public final boolean readBoolean()
  {
    Ro(31);
    this.type = -1;
    if (this.Ayl != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final byte readByte()
  {
    Ro(0);
    this.type = -1;
    return (byte)l.a(this.Ayj, this.Ayl);
  }

  public final char readChar()
  {
    Ro(3);
    this.type = -1;
    return (char)l.a(this.Ayj, this.Ayl, false);
  }

  public final double readDouble()
  {
    Ro(17);
    this.type = -1;
    a locala = this.Ayj;
    int i = this.Ayl;
    long l = 0L;
    while (i >= 0)
    {
      l = l >>> 8 | (locala.readByte() & 0xFF) << 56;
      i--;
    }
    return Double.longBitsToDouble(l);
  }

  public final float readFloat()
  {
    Ro(16);
    this.type = -1;
    return Float.intBitsToFloat(l.a(this.Ayj, this.Ayl, true));
  }

  public final int readInt()
  {
    Ro(4);
    this.type = -1;
    return l.a(this.Ayj, this.Ayl);
  }

  public final long readLong()
  {
    Ro(6);
    this.type = -1;
    a locala = this.Ayj;
    int i = this.Ayl;
    long l = 0L;
    for (int j = i; j >= 0; j--)
      l = l >>> 8 | (locala.readByte() & 0xFF) << 56;
    return l >> (7 - i) * 8;
  }

  public final short readShort()
  {
    Ro(2);
    this.type = -1;
    return (short)l.a(this.Ayj, this.Ayl);
  }

  public final void skipValue()
  {
    int i = 0;
    int j = 0;
    switch (dRL())
    {
    case 1:
    case 5:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 18:
    case 19:
    case 20:
    case 21:
    case 22:
    default:
      throw new j("Unexpected type: " + Integer.toHexString(this.type));
    case 0:
      readByte();
    case 2:
    case 3:
    case 4:
    case 6:
    case 16:
    case 17:
    case 23:
    case 24:
    case 25:
    case 27:
    case 26:
    case 28:
    case 29:
    case 30:
    case 31:
    }
    while (true)
    {
      return;
      readShort();
      continue;
      readChar();
      continue;
      readInt();
      continue;
      readLong();
      continue;
      readFloat();
      continue;
      readDouble();
      continue;
      dRP();
      continue;
      dRQ();
      continue;
      dRR();
      continue;
      dRS();
      continue;
      dRT();
      continue;
      i = dRM();
      while (j < i)
      {
        skipValue();
        j++;
      }
      continue;
      int k = dRN();
      for (j = i; j < k; j++)
      {
        o.b(this.Ayj);
        skipValue();
      }
      continue;
      dRU();
      continue;
      readBoolean();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.a.m
 * JD-Core Version:    0.6.2
 */