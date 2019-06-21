package com.google.android.exoplayer2.i;

import com.google.android.exoplayer2.d.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.charset.Charset;

public final class l
{
  public byte[] data;
  public int limit;
  public int position;

  public l()
  {
  }

  public l(int paramInt)
  {
    AppMethodBeat.i(95903);
    this.data = new byte[paramInt];
    this.limit = paramInt;
    AppMethodBeat.o(95903);
  }

  public l(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(95904);
    this.data = paramArrayOfByte;
    this.limit = paramArrayOfByte.length;
    AppMethodBeat.o(95904);
  }

  public l(byte[] paramArrayOfByte, int paramInt)
  {
    this.data = paramArrayOfByte;
    this.limit = paramInt;
  }

  public final String a(int paramInt, Charset paramCharset)
  {
    AppMethodBeat.i(95916);
    paramCharset = new String(this.data, this.position, paramInt, paramCharset);
    this.position += paramInt;
    AppMethodBeat.o(95916);
    return paramCharset;
  }

  public final void c(k paramk, int paramInt)
  {
    AppMethodBeat.i(95909);
    readBytes(paramk.data, 0, paramInt);
    paramk.setPosition(0);
    AppMethodBeat.o(95909);
  }

  public final long cM()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    long l1 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l2 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l3 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    return (l1 & 0xFF) << 24 | (l2 & 0xFF) << 16 | (l3 & 0xFF) << 8 | arrayOfByte[i] & 0xFF;
  }

  public final int capacity()
  {
    if (this.data == null);
    for (int i = 0; ; i = this.data.length)
      return i;
  }

  public final void eL(int paramInt)
  {
    AppMethodBeat.i(95906);
    if ((paramInt >= 0) && (paramInt <= this.data.length));
    for (boolean bool = true; ; bool = false)
    {
      a.checkArgument(bool);
      this.limit = paramInt;
      AppMethodBeat.o(95906);
      return;
    }
  }

  public final void eM(int paramInt)
  {
    AppMethodBeat.i(95908);
    setPosition(this.position + paramInt);
    AppMethodBeat.o(95908);
  }

  public final String eN(int paramInt)
  {
    AppMethodBeat.i(95917);
    String str;
    if (paramInt == 0)
    {
      str = "";
      AppMethodBeat.o(95917);
      return str;
    }
    int i = this.position + paramInt - 1;
    if ((i < this.limit) && (this.data[i] == 0));
    for (i = paramInt - 1; ; i = paramInt)
    {
      str = new String(this.data, this.position, i);
      this.position += paramInt;
      AppMethodBeat.o(95917);
      break;
    }
  }

  public final void n(byte[] paramArrayOfByte, int paramInt)
  {
    this.data = paramArrayOfByte;
    this.limit = paramInt;
    this.position = 0;
  }

  public final void readBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95910);
    System.arraycopy(this.data, this.position, paramArrayOfByte, paramInt1, paramInt2);
    this.position += paramInt2;
    AppMethodBeat.o(95910);
  }

  public final int readInt()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.data;
    int j = this.position;
    this.position = (j + 1);
    j = arrayOfByte[j];
    arrayOfByte = this.data;
    int k = this.position;
    this.position = (k + 1);
    k = arrayOfByte[k];
    arrayOfByte = this.data;
    int m = this.position;
    this.position = (m + 1);
    return (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8 | arrayOfByte[m] & 0xFF;
  }

  public final String readLine()
  {
    AppMethodBeat.i(95919);
    String str;
    if (tB() == 0)
    {
      str = null;
      AppMethodBeat.o(95919);
    }
    while (true)
    {
      return str;
      for (int i = this.position; (i < this.limit) && (!v.eQ(this.data[i])); i++);
      if ((i - this.position >= 3) && (this.data[this.position] == -17) && (this.data[(this.position + 1)] == -69) && (this.data[(this.position + 2)] == -65))
        this.position += 3;
      str = new String(this.data, this.position, i - this.position);
      this.position = i;
      if (this.position == this.limit)
      {
        AppMethodBeat.o(95919);
      }
      else if (this.data[this.position] == 13)
      {
        this.position += 1;
        if (this.position == this.limit)
          AppMethodBeat.o(95919);
      }
      else
      {
        if (this.data[this.position] == 10)
          this.position += 1;
        AppMethodBeat.o(95919);
      }
    }
  }

  public final long readLong()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    long l1 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l2 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l3 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l4 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l5 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l6 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l7 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    return (l1 & 0xFF) << 56 | (l2 & 0xFF) << 48 | (l3 & 0xFF) << 40 | (l4 & 0xFF) << 32 | (l5 & 0xFF) << 24 | (l6 & 0xFF) << 16 | (l7 & 0xFF) << 8 | arrayOfByte[i] & 0xFF;
  }

  public final String readString(int paramInt)
  {
    AppMethodBeat.i(95915);
    String str = a(paramInt, Charset.forName("UTF-8"));
    AppMethodBeat.o(95915);
    return str;
  }

  public final int readUnsignedByte()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    return arrayOfByte[i] & 0xFF;
  }

  public final int readUnsignedShort()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    int j = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    return (j & 0xFF) << 8 | arrayOfByte[i] & 0xFF;
  }

  public final void reset()
  {
    this.position = 0;
    this.limit = 0;
  }

  public final void reset(int paramInt)
  {
    AppMethodBeat.i(95905);
    if (capacity() < paramInt);
    for (byte[] arrayOfByte = new byte[paramInt]; ; arrayOfByte = this.data)
    {
      n(arrayOfByte, paramInt);
      AppMethodBeat.o(95905);
      return;
    }
  }

  public final void setPosition(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(95907);
    if ((paramInt < 0) || (paramInt > this.limit))
      b.i("ExoPlayer", "position%d, limit:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.limit) });
    if ((paramInt >= 0) && (paramInt <= this.limit));
    while (true)
    {
      a.checkArgument(bool);
      this.position = paramInt;
      AppMethodBeat.o(95907);
      return;
      bool = false;
    }
  }

  public final int tB()
  {
    return this.limit - this.position;
  }

  public final int tC()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.data;
    int j = this.position;
    this.position = (j + 1);
    return i & 0xFF | (arrayOfByte[j] & 0xFF) << 8;
  }

  public final int tD()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.data;
    int j = this.position;
    this.position = (j + 1);
    j = arrayOfByte[j];
    arrayOfByte = this.data;
    int k = this.position;
    this.position = (k + 1);
    return (i & 0xFF) << 16 | (j & 0xFF) << 8 | arrayOfByte[k] & 0xFF;
  }

  public final long tE()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    long l1 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l2 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l3 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    return l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (arrayOfByte[i] & 0xFF) << 24;
  }

  public final int tF()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.data;
    int j = this.position;
    this.position = (j + 1);
    j = arrayOfByte[j];
    arrayOfByte = this.data;
    int k = this.position;
    this.position = (k + 1);
    int m = arrayOfByte[k];
    arrayOfByte = this.data;
    k = this.position;
    this.position = (k + 1);
    return i & 0xFF | (j & 0xFF) << 8 | (m & 0xFF) << 16 | (arrayOfByte[k] & 0xFF) << 24;
  }

  public final long tG()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    long l1 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l2 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l3 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l4 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l5 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l6 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l7 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    return l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48 | (arrayOfByte[i] & 0xFF) << 56;
  }

  public final int tH()
  {
    AppMethodBeat.i(95911);
    int i = readUnsignedByte();
    int j = readUnsignedByte();
    int k = readUnsignedByte();
    int m = readUnsignedByte();
    AppMethodBeat.o(95911);
    return i << 21 | j << 14 | k << 7 | m;
  }

  public final int tI()
  {
    AppMethodBeat.i(95912);
    int i = readInt();
    if (i < 0)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("Top bit not zero: ".concat(String.valueOf(i)));
      AppMethodBeat.o(95912);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(95912);
    return i;
  }

  public final int tJ()
  {
    AppMethodBeat.i(95913);
    int i = tF();
    if (i < 0)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("Top bit not zero: ".concat(String.valueOf(i)));
      AppMethodBeat.o(95913);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(95913);
    return i;
  }

  public final long tK()
  {
    AppMethodBeat.i(95914);
    long l = readLong();
    if (l < 0L)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("Top bit not zero: ".concat(String.valueOf(l)));
      AppMethodBeat.o(95914);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(95914);
    return l;
  }

  public final String tL()
  {
    AppMethodBeat.i(95918);
    String str;
    if (tB() == 0)
    {
      str = null;
      AppMethodBeat.o(95918);
    }
    while (true)
    {
      return str;
      for (int i = this.position; (i < this.limit) && (this.data[i] != 0); i++);
      str = new String(this.data, this.position, i - this.position);
      this.position = i;
      if (this.position < this.limit)
        this.position += 1;
      AppMethodBeat.o(95918);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.l
 * JD-Core Version:    0.6.2
 */