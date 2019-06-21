package com.google.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class b
  implements Cloneable
{
  private final int[] byE;
  private final int byF;
  public final int height;
  public final int width;

  public b(int paramInt)
  {
    this(paramInt, paramInt);
    AppMethodBeat.i(57264);
    AppMethodBeat.o(57264);
  }

  public b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57265);
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Both dimensions must be greater than 0");
      AppMethodBeat.o(57265);
      throw localIllegalArgumentException;
    }
    this.width = paramInt1;
    this.height = paramInt2;
    this.byF = ((paramInt1 + 31) / 32);
    this.byE = new int[this.byF * paramInt2];
    AppMethodBeat.o(57265);
  }

  private b(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    this.width = paramInt1;
    this.height = paramInt2;
    this.byF = paramInt3;
    this.byE = paramArrayOfInt;
  }

  public final boolean bB(int paramInt1, int paramInt2)
  {
    int i = this.byF;
    int j = paramInt1 / 32;
    if ((this.byE[(i * paramInt2 + j)] >>> (paramInt1 & 0x1F) & 0x1) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void clear()
  {
    int i = this.byE.length;
    for (int j = 0; j < i; j++)
      this.byE[j] = 0;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(57267);
    if (!(paramObject instanceof b))
      AppMethodBeat.o(57267);
    while (true)
    {
      return bool;
      paramObject = (b)paramObject;
      if ((this.width == paramObject.width) && (this.height == paramObject.height) && (this.byF == paramObject.byF) && (Arrays.equals(this.byE, paramObject.byE)))
      {
        bool = true;
        AppMethodBeat.o(57267);
      }
      else
      {
        AppMethodBeat.o(57267);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(57268);
    int i = this.width;
    int j = this.width;
    int k = this.height;
    int m = this.byF;
    int n = Arrays.hashCode(this.byE);
    AppMethodBeat.o(57268);
    return (((i * 31 + j) * 31 + k) * 31 + m) * 31 + n;
  }

  public final void p(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(57266);
    Object localObject;
    if ((paramInt2 < 0) || (paramInt1 < 0))
    {
      localObject = new IllegalArgumentException("Left and top must be nonnegative");
      AppMethodBeat.o(57266);
      throw ((Throwable)localObject);
    }
    if ((paramInt4 <= 0) || (paramInt3 <= 0))
    {
      localObject = new IllegalArgumentException("Height and width must be at least 1");
      AppMethodBeat.o(57266);
      throw ((Throwable)localObject);
    }
    int i = paramInt1 + paramInt3;
    paramInt4 = paramInt2 + paramInt4;
    if ((paramInt4 > this.height) || (i > this.width))
    {
      localObject = new IllegalArgumentException("The region must fit inside the matrix");
      AppMethodBeat.o(57266);
      throw ((Throwable)localObject);
    }
    while (true)
    {
      paramInt2++;
      if (paramInt2 >= paramInt4)
        break;
      int j = this.byF;
      for (paramInt3 = paramInt1; paramInt3 < i; paramInt3++)
      {
        localObject = this.byE;
        int k = paramInt3 / 32 + paramInt2 * j;
        localObject[k] |= 1 << (paramInt3 & 0x1F);
      }
    }
    AppMethodBeat.o(57266);
  }

  public final void set(int paramInt1, int paramInt2)
  {
    paramInt2 = this.byF * paramInt2 + paramInt1 / 32;
    int[] arrayOfInt = this.byE;
    arrayOfInt[paramInt2] |= 1 << (paramInt1 & 0x1F);
  }

  public final String toString()
  {
    AppMethodBeat.i(57269);
    StringBuilder localStringBuilder = new StringBuilder(this.height * (this.width + 1));
    for (int i = 0; i < this.height; i++)
    {
      int j = 0;
      if (j < this.width)
      {
        if (bB(j, i));
        for (str = "X "; ; str = "  ")
        {
          localStringBuilder.append(str);
          j++;
          break;
        }
      }
      localStringBuilder.append("\n");
    }
    String str = localStringBuilder.toString();
    AppMethodBeat.o(57269);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.b.b.b
 * JD-Core Version:    0.6.2
 */