package com.tencent.mm.plugin.appbrand.performance;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.RandomAccessFile;

public final class e
{
  private final int ivS;
  private volatile RandomAccessFile ivT;
  private volatile RandomAccessFile ivU;
  private boolean ivV;
  private long ivW;
  private long ivX;
  private long ivY;

  public e(int paramInt)
  {
    this.ivS = paramInt;
  }

  public final double aKs()
  {
    AppMethodBeat.i(102242);
    double d1;
    if (this.ivV)
    {
      d1 = 0.0D;
      AppMethodBeat.o(102242);
    }
    while (true)
    {
      return d1;
      double d2 = 0.0D;
      double d3 = d2;
      try
      {
        if (this.ivU == null)
        {
          d3 = d2;
          localObject1 = new java/io/RandomAccessFile;
          d3 = d2;
          localObject2 = new java/lang/StringBuilder;
          d3 = d2;
          ((StringBuilder)localObject2).<init>("/proc/");
          d3 = d2;
          ((RandomAccessFile)localObject1).<init>(this.ivS + "/stat", "r");
          d3 = d2;
          this.ivU = ((RandomAccessFile)localObject1);
        }
        d3 = d2;
        this.ivU.seek(0L);
        d3 = d2;
        Object localObject1 = this.ivU.readLine();
        d3 = d2;
        boolean bool = bo.isNullOrNil((String)localObject1);
        if (bool)
        {
          d1 = 0.0D;
          AppMethodBeat.o(102242);
          continue;
        }
        d3 = d2;
        localObject1 = ((String)localObject1).split(" ");
        d3 = d2;
        int i = localObject1.length;
        if (i < 17)
        {
          d1 = 0.0D;
          AppMethodBeat.o(102242);
          continue;
        }
        d3 = d2;
        if (this.ivT == null)
        {
          d3 = d2;
          localObject2 = new java/io/RandomAccessFile;
          d3 = d2;
          ((RandomAccessFile)localObject2).<init>("/proc/stat", "r");
          d3 = d2;
          this.ivT = ((RandomAccessFile)localObject2);
        }
        d3 = d2;
        this.ivT.seek(0L);
        d3 = d2;
        Object localObject2 = this.ivT.readLine();
        d3 = d2;
        long l1;
        if (bo.isNullOrNil((String)localObject2))
          l1 = 0L;
        while (true)
        {
          d3 = d2;
          long l2 = bo.anl(localObject1[13]);
          d3 = d2;
          long l3 = bo.anl(localObject1[14]);
          d1 = d2;
          d3 = d2;
          if (this.ivW != 0L)
          {
            d3 = d2;
            double d4 = (l2 - this.ivX) * 100L / (l1 - this.ivW);
            d3 = d2;
            d1 = (l3 - this.ivY) * 100L / (l1 - this.ivW);
            d3 = d2;
            d4 = Math.max(0.0D, d4);
            d3 = d2;
            d1 = Math.max(0.0D, d1) + d4;
          }
          d3 = d1;
          this.ivW = l1;
          d3 = d1;
          this.ivX = l2;
          d3 = d1;
          this.ivY = l3;
          AppMethodBeat.o(102242);
          break;
          d3 = d2;
          localObject2 = ((String)localObject2).split(" ");
          d3 = d2;
          if (localObject2.length < 9)
          {
            l1 = 0L;
          }
          else
          {
            d3 = d2;
            long l4 = bo.anl(localObject2[2]);
            d3 = d2;
            l3 = bo.anl(localObject2[3]);
            d3 = d2;
            long l5 = bo.anl(localObject2[4]);
            d3 = d2;
            long l6 = bo.anl(localObject2[5]);
            d3 = d2;
            long l7 = bo.anl(localObject2[6]);
            d3 = d2;
            long l8 = bo.anl(localObject2[7]);
            d3 = d2;
            l2 = bo.anl(localObject2[8]);
            d3 = d2;
            l1 = bo.anl(localObject2[9]);
            l1 += l4 + l3 + l5 + l6 + l7 + l8 + l2;
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e(" MicroMsg.CpuSampler", "read pid stat file error: ".concat(String.valueOf(localException)));
          this.ivV = true;
          d1 = d3;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.performance.e
 * JD-Core Version:    0.6.2
 */