package com.tencent.mm.hardcoder;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e
{
  private static a eEy = null;

  public static void a(a.b paramb)
  {
    AppMethodBeat.i(93932);
    int i = (int)(paramb.eDE - paramb.eDK);
    int j;
    int k;
    int m;
    label40: int n;
    long l1;
    int i1;
    int i2;
    int[] arrayOfInt1;
    int i3;
    int i4;
    int i5;
    if (HardCoderJNI.isHcEnable())
    {
      j = 1;
      k = HardCoderJNI.isRunning();
      if (i - paramb.delay > 0)
        break label227;
      m = 1;
      n = paramb.scene;
      l1 = paramb.eDJ;
      i1 = paramb.eDF;
      i2 = paramb.eDH;
      arrayOfInt1 = paramb.eDR;
      i3 = (int)(paramb.eDL - paramb.startTime);
      i4 = paramb.eDV;
      i5 = 0;
      if (paramb.eDX != null)
        i5 = (int)(0L + paramb.eDX.eEF);
      if (paramb.eDY == null)
        break label613;
      i5 = (int)(i5 + paramb.eDY.eEF);
    }
    label227: label613: 
    while (true)
    {
      int i6 = HardCoderJNI.tickRate;
      long l2 = paramb.eDW;
      int[] arrayOfInt2 = paramb.eDP;
      int[] arrayOfInt3 = paramb.eDQ;
      StringBuilder localStringBuilder1 = new StringBuilder();
      int i7;
      int i8;
      int i9;
      if (arrayOfInt1 != null)
      {
        i7 = arrayOfInt1.length;
        i8 = 0;
        while (true)
          if (i8 < i7)
          {
            i9 = arrayOfInt1[i8];
            localStringBuilder1.append(i9 + "#");
            i8++;
            continue;
            j = 0;
            break;
            m = 0;
            break label40;
          }
      }
      StringBuilder localStringBuilder2 = new StringBuilder();
      if (arrayOfInt2 != null)
      {
        i7 = arrayOfInt2.length;
        for (i8 = 0; i8 < i7; i8++)
        {
          i9 = arrayOfInt2[i8];
          localStringBuilder2.append(i9 + "#");
        }
      }
      StringBuilder localStringBuilder3 = new StringBuilder();
      if (arrayOfInt3 != null)
      {
        i7 = arrayOfInt3.length;
        for (i8 = 0; i8 < i7; i8++)
        {
          i9 = arrayOfInt3[i8];
          localStringBuilder3.append(i9 + "#");
        }
      }
      c.d("HardCoder.HardCoderReporter", String.format("[oneliang]performance report,hash:%s,threadId:%s,enable:%s, engineStatus:%s,cancelInDelay:%s,scene:%s,action:%s,lastCpuLevel:%s,cpuLevel:%s,lastIoLevel:%s,ioLevel:%s,bindCoreIds:%s,executeTime:%s,runtime:%s,threadJiffies:%s, phonePower:%s, phoneHZ:%s, processJiffies:%s,cpuLevelTimeArray:%s, ioLevelTimeArray:%s", new Object[] { Integer.valueOf(paramb.hashCode()), paramb.PE(), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Long.valueOf(l1), Integer.valueOf(paramb.eDN), Integer.valueOf(i1), Integer.valueOf(paramb.eDO), Integer.valueOf(i2), localStringBuilder1.toString(), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Long.valueOf(l2), localStringBuilder2.toString(), localStringBuilder3.toString() }));
      if (eEy != null)
        eEy.a(paramb.eDI, j, k, m, n, l1, i1, i2, arrayOfInt1, i3, i, i4, i5, i6, l2, arrayOfInt2, arrayOfInt3);
      AppMethodBeat.o(93932);
      return;
    }
  }

  public static void a(a parama)
  {
    AppMethodBeat.i(93931);
    if (eEy == null)
    {
      c.i("HardCoder.HardCoderReporter", String.format("hardcoder setReporter[%s]", new Object[] { parama }));
      eEy = parama;
    }
    AppMethodBeat.o(93931);
  }

  public static abstract interface a
  {
    public abstract void a(int[] paramArrayOfInt1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, int paramInt5, int paramInt6, int[] paramArrayOfInt2, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, long paramLong2, int[] paramArrayOfInt3, int[] paramArrayOfInt4);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.hardcoder.e
 * JD-Core Version:    0.6.2
 */