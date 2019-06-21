package com.google.b.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b
{
  final a bzA;
  final int[] bzB;

  b(a parama, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(57201);
    if (paramArrayOfInt.length == 0)
    {
      parama = new IllegalArgumentException();
      AppMethodBeat.o(57201);
      throw parama;
    }
    this.bzA = parama;
    int i = paramArrayOfInt.length;
    int j;
    if ((i > 1) && (paramArrayOfInt[0] == 0))
    {
      for (j = 1; (j < i) && (paramArrayOfInt[j] == 0); j++);
      if (j == i)
      {
        this.bzB = new int[] { 0 };
        AppMethodBeat.o(57201);
      }
    }
    while (true)
    {
      return;
      this.bzB = new int[i - j];
      System.arraycopy(paramArrayOfInt, j, this.bzB, 0, this.bzB.length);
      AppMethodBeat.o(57201);
      continue;
      this.bzB = paramArrayOfInt;
      AppMethodBeat.o(57201);
    }
  }

  private b a(b paramb)
  {
    AppMethodBeat.i(57202);
    if (!this.bzA.equals(paramb.bzA))
    {
      paramb = new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
      AppMethodBeat.o(57202);
      throw paramb;
    }
    if (isZero())
      AppMethodBeat.o(57202);
    while (true)
    {
      return paramb;
      if (!paramb.isZero())
        break;
      AppMethodBeat.o(57202);
      paramb = this;
    }
    Object localObject = this.bzB;
    int[] arrayOfInt = paramb.bzB;
    if (localObject.length > arrayOfInt.length)
      paramb = arrayOfInt;
    while (true)
    {
      arrayOfInt = new int[localObject.length];
      int i = localObject.length - paramb.length;
      System.arraycopy(localObject, 0, arrayOfInt, 0, i);
      for (int j = i; j < localObject.length; j++)
        arrayOfInt[j] = a.bC(paramb[(j - i)], localObject[j]);
      paramb = new b(this.bzA, arrayOfInt);
      AppMethodBeat.o(57202);
      break;
      paramb = (b)localObject;
      localObject = arrayOfInt;
    }
  }

  private int fC(int paramInt)
  {
    return this.bzB[(this.bzB.length - 1 - paramInt)];
  }

  final b[] b(b paramb)
  {
    AppMethodBeat.i(57204);
    if (!this.bzA.equals(paramb.bzA))
    {
      paramb = new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
      AppMethodBeat.o(57204);
      throw paramb;
    }
    if (paramb.isZero())
    {
      paramb = new IllegalArgumentException("Divide by 0");
      AppMethodBeat.o(57204);
      throw paramb;
    }
    b localb1 = this.bzA.bzw;
    int i = paramb.fC(paramb.bzB.length - 1);
    Object localObject1 = this.bzA;
    if (i == 0)
    {
      paramb = new ArithmeticException();
      AppMethodBeat.o(57204);
      throw paramb;
    }
    int j = localObject1.bzu[(localObject1.size - localObject1.bzv[i] - 1)];
    localObject1 = this;
    if ((((b)localObject1).bzB.length - 1 >= paramb.bzB.length - 1) && (!((b)localObject1).isZero()))
    {
      i = ((b)localObject1).bzB.length - 1 - (paramb.bzB.length - 1);
      int k = this.bzA.bD(((b)localObject1).fC(((b)localObject1).bzB.length - 1), j);
      b localb2 = paramb.bE(i, k);
      Object localObject2 = this.bzA;
      if (i < 0)
      {
        paramb = new IllegalArgumentException();
        AppMethodBeat.o(57204);
        throw paramb;
      }
      if (k == 0);
      int[] arrayOfInt;
      for (localObject2 = ((a)localObject2).bzw; ; localObject2 = new b((a)localObject2, arrayOfInt))
      {
        localb1 = localb1.a((b)localObject2);
        localObject1 = ((b)localObject1).a(localb2);
        break;
        arrayOfInt = new int[i + 1];
        arrayOfInt[0] = k;
      }
    }
    AppMethodBeat.o(57204);
    return new b[] { localb1, localObject1 };
  }

  final b bE(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57203);
    Object localObject;
    if (paramInt1 < 0)
    {
      localObject = new IllegalArgumentException();
      AppMethodBeat.o(57203);
      throw ((Throwable)localObject);
    }
    if (paramInt2 == 0)
    {
      localObject = this.bzA.bzw;
      AppMethodBeat.o(57203);
    }
    while (true)
    {
      return localObject;
      int i = this.bzB.length;
      localObject = new int[i + paramInt1];
      for (paramInt1 = 0; paramInt1 < i; paramInt1++)
        localObject[paramInt1] = this.bzA.bD(this.bzB[paramInt1], paramInt2);
      localObject = new b(this.bzA, (int[])localObject);
      AppMethodBeat.o(57203);
    }
  }

  final boolean isZero()
  {
    boolean bool = false;
    if (this.bzB[0] == 0)
      bool = true;
    return bool;
  }

  public final String toString()
  {
    AppMethodBeat.i(57205);
    StringBuilder localStringBuilder = new StringBuilder((this.bzB.length - 1) * 8);
    int i = this.bzB.length - 1;
    if (i >= 0)
    {
      int j = fC(i);
      int k;
      if (j != 0)
      {
        if (j < 0)
        {
          localStringBuilder.append(" - ");
          k = -j;
        }
        while ((i == 0) || (k != 1))
        {
          localObject = this.bzA;
          if (k == 0)
          {
            localObject = new IllegalArgumentException();
            AppMethodBeat.o(57205);
            throw ((Throwable)localObject);
            k = j;
            if (localStringBuilder.length() > 0)
            {
              localStringBuilder.append(" + ");
              k = j;
            }
          }
          else
          {
            k = localObject.bzv[k];
            if (k != 0)
              break label165;
            localStringBuilder.append('1');
          }
        }
        label143: if (i != 0)
        {
          if (i != 1)
            break label198;
          localStringBuilder.append('x');
        }
      }
      while (true)
      {
        i--;
        break;
        label165: if (k == 1)
        {
          localStringBuilder.append('a');
          break label143;
        }
        localStringBuilder.append("a^");
        localStringBuilder.append(k);
        break label143;
        label198: localStringBuilder.append("x^");
        localStringBuilder.append(i);
      }
    }
    Object localObject = localStringBuilder.toString();
    AppMethodBeat.o(57205);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.b.b.a.b
 * JD-Core Version:    0.6.2
 */