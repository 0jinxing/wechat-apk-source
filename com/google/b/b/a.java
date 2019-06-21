package com.google.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class a
  implements Cloneable
{
  public int[] byE;
  public int size;

  public a()
  {
    AppMethodBeat.i(57279);
    this.size = 0;
    this.byE = new int[1];
    AppMethodBeat.o(57279);
  }

  private a(int[] paramArrayOfInt, int paramInt)
  {
    this.byE = paramArrayOfInt;
    this.size = paramInt;
  }

  private void ensureCapacity(int paramInt)
  {
    AppMethodBeat.i(57280);
    if (paramInt > this.byE.length << 5)
    {
      int[] arrayOfInt = new int[(paramInt + 31) / 32];
      System.arraycopy(this.byE, 0, arrayOfInt, 0, this.byE.length);
      this.byE = arrayOfInt;
    }
    AppMethodBeat.o(57280);
  }

  public final void a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    AppMethodBeat.i(57284);
    int i = 0;
    int j = paramInt1;
    for (paramInt1 = i; paramInt1 < paramInt2; paramInt1++)
    {
      i = 0;
      int m;
      for (int k = 0; i < 8; k = m)
      {
        m = k;
        if (get(j))
          m = k | 1 << 7 - i;
        j++;
        i++;
      }
      paramArrayOfByte[(paramInt1 + 0)] = ((byte)(byte)k);
    }
    AppMethodBeat.o(57284);
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(57283);
    int i = parama.size;
    ensureCapacity(this.size + i);
    for (int j = 0; j < i; j++)
      aT(parama.get(j));
    AppMethodBeat.o(57283);
  }

  public final void aT(boolean paramBoolean)
  {
    AppMethodBeat.i(57281);
    ensureCapacity(this.size + 1);
    if (paramBoolean)
    {
      int[] arrayOfInt = this.byE;
      int i = this.size / 32;
      arrayOfInt[i] |= 1 << (this.size & 0x1F);
    }
    this.size += 1;
    AppMethodBeat.o(57281);
  }

  public final void bA(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57282);
    if ((paramInt2 < 0) || (paramInt2 > 32))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Num bits must be between 0 and 32");
      AppMethodBeat.o(57282);
      throw localIllegalArgumentException;
    }
    ensureCapacity(this.size + paramInt2);
    if (paramInt2 > 0)
    {
      if ((paramInt1 >> paramInt2 - 1 & 0x1) == 1);
      for (boolean bool = true; ; bool = false)
      {
        aT(bool);
        paramInt2--;
        break;
      }
    }
    AppMethodBeat.o(57282);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(57285);
    if (!(paramObject instanceof a))
      AppMethodBeat.o(57285);
    while (true)
    {
      return bool;
      paramObject = (a)paramObject;
      if ((this.size == paramObject.size) && (Arrays.equals(this.byE, paramObject.byE)))
      {
        bool = true;
        AppMethodBeat.o(57285);
      }
      else
      {
        AppMethodBeat.o(57285);
      }
    }
  }

  public final boolean get(int paramInt)
  {
    boolean bool = true;
    if ((this.byE[(paramInt / 32)] & 1 << (paramInt & 0x1F)) != 0);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(57286);
    int i = this.size;
    int j = Arrays.hashCode(this.byE);
    AppMethodBeat.o(57286);
    return i * 31 + j;
  }

  public final String toString()
  {
    AppMethodBeat.i(57287);
    Object localObject = new StringBuilder(this.size);
    int i = 0;
    if (i < this.size)
    {
      if ((i & 0x7) == 0)
        ((StringBuilder)localObject).append(' ');
      char c1;
      if (get(i))
        c1 = 'X';
      for (char c2 = c1; ; c2 = c1)
      {
        ((StringBuilder)localObject).append(c2);
        i++;
        break;
        c1 = '.';
      }
    }
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(57287);
    return localObject;
  }

  public final int vt()
  {
    return (this.size + 7) / 8;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.b.b.a
 * JD-Core Version:    0.6.2
 */