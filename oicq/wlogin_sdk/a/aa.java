package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class aa extends a
{
  int BVJ = 0;

  public aa()
  {
    this.BUz = 296;
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

  public final byte[] a(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(96495);
    int i = ad(paramArrayOfByte1, 32);
    int j = ad(paramArrayOfByte2, 16);
    this.BVJ = (i + 11 + 2 + j + 2);
    byte[] arrayOfByte = new byte[this.BVJ];
    util.N(arrayOfByte, 0, 0);
    util.M(arrayOfByte, 2, paramInt1);
    util.M(arrayOfByte, 3, paramInt2);
    util.M(arrayOfByte, 4, paramInt3);
    util.O(arrayOfByte, 5, 0);
    util.N(arrayOfByte, 9, i);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 11, i);
    paramInt1 = i + 11;
    util.N(arrayOfByte, paramInt1, j);
    paramInt1 += 2;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, paramInt1, j);
    util.N(arrayOfByte, paramInt1 + j, 0);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, this.BVJ);
    super.emG();
    paramArrayOfByte1 = super.emC();
    AppMethodBeat.o(96495);
    return paramArrayOfByte1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.aa
 * JD-Core Version:    0.6.2
 */