package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class y extends a
{
  int BVG = 0;

  public y()
  {
    this.BUz = 292;
  }

  private static int ad(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte != null)
      if (paramArrayOfByte.length <= paramInt);
    while (true)
    {
      return paramInt;
      paramInt = paramArrayOfByte.length;
      continue;
      paramInt = 0;
    }
  }

  public final byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5)
  {
    AppMethodBeat.i(96473);
    int i = ad(paramArrayOfByte1, 16);
    int j = ad(paramArrayOfByte2, 16);
    int k = ad(paramArrayOfByte3, 16);
    int m = ad(paramArrayOfByte4, 32);
    int n = ad(paramArrayOfByte5, 16);
    this.BVG = (i + 2 + 2 + j + 2 + 2 + k + 2 + m + 2 + n);
    byte[] arrayOfByte = new byte[this.BVG];
    util.N(arrayOfByte, 0, i);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 2, i);
    i += 2;
    util.N(arrayOfByte, i, j);
    i += 2;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, i, j);
    j = i + j;
    util.N(arrayOfByte, j, paramInt);
    paramInt = j + 2;
    util.N(arrayOfByte, paramInt, k);
    paramInt += 2;
    System.arraycopy(paramArrayOfByte3, 0, arrayOfByte, paramInt, k);
    paramInt += k;
    util.N(arrayOfByte, paramInt, m);
    paramInt += 2;
    System.arraycopy(paramArrayOfByte4, 0, arrayOfByte, paramInt, m);
    paramInt += m;
    util.N(arrayOfByte, paramInt, n);
    System.arraycopy(paramArrayOfByte5, 0, arrayOfByte, paramInt + 2, n);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, this.BVG);
    super.emG();
    paramArrayOfByte1 = super.emC();
    AppMethodBeat.o(96473);
    return paramArrayOfByte1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.y
 * JD-Core Version:    0.6.2
 */