package com.google.b.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  static final String[] byr;
  static final int[][] bys;
  private static final int[][] byt;
  static final int[][] byu;
  final byte[] byv;

  static
  {
    AppMethodBeat.i(57263);
    byr = new String[] { "UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT" };
    Object localObject = { 0, 327708, 327710, 327709, 656318 };
    int[] arrayOfInt1 = { 590318, 0, 327710, 327709, 656318 };
    int[] arrayOfInt2 = { 262158, 590300, 0, 590301, 932798 };
    int[] arrayOfInt3 = { 327711, 656380, 656382, 656381, 0 };
    bys = new int[][] { localObject, arrayOfInt1, arrayOfInt2, { 327709, 327708, 656318, 0, 327710 }, arrayOfInt3 };
    localObject = new int[5][256];
    byt = (int[][])localObject;
    localObject[0][32] = 1;
    for (int i = 65; i <= 90; i++)
      byt[0][i] = (i - 65 + 2);
    byt[1][32] = 1;
    for (i = 97; i <= 122; i++)
      byt[1][i] = (i - 97 + 2);
    byt[2][32] = 1;
    for (i = 48; i <= 57; i++)
      byt[2][i] = (i - 48 + 2);
    byt[2][44] = 12;
    byt[2][46] = 13;
    for (i = 0; i < 28; i++)
      byt[3][new int[] { 0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127 }[i]] = i;
    localObject = new int[31];
    localObject[0] = 0;
    localObject[1] = 13;
    localObject[2] = 0;
    localObject[3] = 0;
    localObject[4] = 0;
    localObject[5] = 0;
    localObject[6] = 33;
    localObject[7] = 39;
    localObject[8] = 35;
    localObject[9] = 36;
    localObject[10] = 37;
    localObject[11] = 38;
    localObject[12] = 39;
    localObject[13] = 40;
    localObject[14] = 41;
    localObject[15] = 42;
    localObject[16] = 43;
    localObject[17] = 44;
    localObject[18] = 45;
    localObject[19] = 46;
    localObject[20] = 47;
    localObject[21] = 58;
    localObject[22] = 59;
    localObject[23] = 60;
    localObject[24] = 61;
    localObject[25] = 62;
    localObject[26] = 63;
    localObject[27] = 91;
    localObject[28] = 93;
    localObject[29] = 123;
    localObject[30] = 125;
    localObject;
    for (i = 0; i < 31; i++)
      if (localObject[i] > 0)
        byt[4][localObject[i]] = i;
    localObject = new int[6][6];
    byu = (int[][])localObject;
    int j = localObject.length;
    for (i = 0; i < j; i++)
      Arrays.fill(localObject[i], -1);
    byu[0][4] = 0;
    byu[1][4] = 0;
    byu[1][0] = 28;
    byu[3][4] = 0;
    byu[2][4] = 0;
    byu[2][0] = 15;
    AppMethodBeat.o(57263);
  }

  public d(byte[] paramArrayOfByte)
  {
    this.byv = paramArrayOfByte;
  }

  static Collection<f> a(Iterable<f> paramIterable, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57261);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      paramIterable = (f)localIterator.next();
      f localf = paramIterable.fB(paramInt1);
      localLinkedList.add(localf.bw(4, paramInt2));
      if (paramIterable.mode != 4)
        localLinkedList.add(localf.bx(4, paramInt2));
      if ((paramInt2 == 3) || (paramInt2 == 4))
        localLinkedList.add(localf.bw(2, 16 - paramInt2).bw(2, 1));
      if (paramIterable.byA > 0)
        localLinkedList.add(paramIterable.fA(paramInt1).fA(paramInt1 + 1));
    }
    paramIterable = c(localLinkedList);
    AppMethodBeat.o(57261);
    return paramIterable;
  }

  static Collection<f> c(Iterable<f> paramIterable)
  {
    AppMethodBeat.i(57262);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramIterable.iterator();
    label46: label119: label123: 
    while (true)
    {
      f localf1;
      f localf2;
      if (localIterator.hasNext())
      {
        localf1 = (f)localIterator.next();
        paramIterable = localLinkedList.iterator();
        if (!paramIterable.hasNext())
          break label119;
        localf2 = (f)paramIterable.next();
        if (!localf2.a(localf1));
      }
      for (int i = 0; ; i = 1)
      {
        if (i == 0)
          break label123;
        localLinkedList.add(localf1);
        break;
        if (!localf1.a(localf2))
          break label46;
        paramIterable.remove();
        break label46;
        AppMethodBeat.o(57262);
        return localLinkedList;
      }
    }
  }

  final void a(f paramf, int paramInt, Collection<f> paramCollection)
  {
    AppMethodBeat.i(57260);
    int i = (char)(this.byv[paramInt] & 0xFF);
    int j;
    Object localObject1;
    int k;
    label41: Object localObject2;
    if (byt[paramf.mode][i] > 0)
    {
      j = 1;
      localObject1 = null;
      k = 0;
      if (k > 4)
        break label170;
      int m = byt[k][i];
      if (m <= 0)
        break label216;
      if (localObject1 != null)
        break label209;
      localObject2 = paramf.fB(paramInt);
      label75: if ((j == 0) || (k == paramf.mode) || (k == 2))
        paramCollection.add(((f)localObject2).bw(k, m));
      localObject1 = localObject2;
      if (j == 0)
      {
        localObject1 = localObject2;
        if (byu[paramf.mode][k] >= 0)
        {
          paramCollection.add(((f)localObject2).bx(k, m));
          localObject1 = localObject2;
        }
      }
    }
    label170: label209: label216: 
    while (true)
    {
      k++;
      break label41;
      j = 0;
      break;
      if ((paramf.byA > 0) || (byt[paramf.mode][i] == 0))
        paramCollection.add(paramf.fA(paramInt));
      AppMethodBeat.o(57260);
      return;
      localObject2 = localObject1;
      break label75;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.b.a.a.d
 * JD-Core Version:    0.6.2
 */