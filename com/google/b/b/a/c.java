package com.google.b.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class c
{
  private final a bzA;
  private final List<b> bzC;

  public c(a parama)
  {
    AppMethodBeat.i(57164);
    this.bzA = parama;
    this.bzC = new ArrayList();
    this.bzC.add(new b(parama, new int[] { 1 }));
    AppMethodBeat.o(57164);
  }

  private b fD(int paramInt)
  {
    AppMethodBeat.i(57165);
    if (paramInt >= this.bzC.size())
    {
      localObject1 = (b)this.bzC.get(this.bzC.size() - 1);
      int i = this.bzC.size();
      if (i <= paramInt)
      {
        Object localObject2 = this.bzA;
        Object localObject3 = this.bzA;
        int j = this.bzA.bzz;
        localObject2 = new b((a)localObject2, new int[] { 1, localObject3.bzu[(i - 1 + j)] });
        if (!((b)localObject1).bzA.equals(((b)localObject2).bzA))
        {
          localObject1 = new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
          AppMethodBeat.o(57165);
          throw ((Throwable)localObject1);
        }
        if ((((b)localObject1).isZero()) || (((b)localObject2).isZero()));
        int[] arrayOfInt;
        for (localObject1 = ((b)localObject1).bzA.bzw; ; localObject1 = new b(((b)localObject1).bzA, arrayOfInt))
        {
          this.bzC.add(localObject1);
          i++;
          break;
          localObject3 = ((b)localObject1).bzB;
          int k = localObject3.length;
          localObject2 = ((b)localObject2).bzB;
          int m = localObject2.length;
          arrayOfInt = new int[k + m - 1];
          for (j = 0; j < k; j++)
          {
            int n = localObject3[j];
            for (int i1 = 0; i1 < m; i1++)
              arrayOfInt[(j + i1)] = a.bC(arrayOfInt[(j + i1)], ((b)localObject1).bzA.bD(n, localObject2[i1]));
          }
        }
      }
    }
    Object localObject1 = (b)this.bzC.get(paramInt);
    AppMethodBeat.o(57165);
    return localObject1;
  }

  public final void e(int[] paramArrayOfInt, int paramInt)
  {
    AppMethodBeat.i(57166);
    if (paramInt == 0)
    {
      paramArrayOfInt = new IllegalArgumentException("No error correction bytes");
      AppMethodBeat.o(57166);
      throw paramArrayOfInt;
    }
    int i = paramArrayOfInt.length - paramInt;
    if (i <= 0)
    {
      paramArrayOfInt = new IllegalArgumentException("No data bytes provided");
      AppMethodBeat.o(57166);
      throw paramArrayOfInt;
    }
    b localb = fD(paramInt);
    int[] arrayOfInt = new int[i];
    System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, i);
    arrayOfInt = new b(this.bzA, arrayOfInt).bE(paramInt, 1).b(localb)[1].bzB;
    int j = paramInt - arrayOfInt.length;
    for (paramInt = 0; paramInt < j; paramInt++)
      paramArrayOfInt[(i + paramInt)] = 0;
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt, i + j, arrayOfInt.length);
    AppMethodBeat.o(57166);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.b.b.a.c
 * JD-Core Version:    0.6.2
 */