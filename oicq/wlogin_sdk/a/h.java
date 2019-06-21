package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.c;
import oicq.wlogin_sdk.tools.d;
import oicq.wlogin_sdk.tools.util;

public final class h extends a
{
  int BVx;
  int BVy;
  int BVz;

  public h()
  {
    AppMethodBeat.i(96496);
    this.BVx = 1;
    this.BVy = 1;
    this.BVz = 69;
    this.BUz = 262;
    this.BVy = util.BWu;
    if (util.BWu <= 2)
    {
      this.BVx = 1;
      this.BVz = 69;
      AppMethodBeat.o(96496);
    }
    while (true)
    {
      return;
      this.BVx = 2;
      this.BVz = 90;
      AppMethodBeat.o(96496);
    }
  }

  public final byte[] a(int paramInt1, long paramLong, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, int paramInt2, byte[] paramArrayOfByte5)
  {
    AppMethodBeat.i(96497);
    if (util.BWu <= 2)
    {
      paramArrayOfByte5 = new byte[this.BVz];
      util.N(paramArrayOfByte5, 0, this.BVx);
      util.O(paramArrayOfByte5, 2, util.emN());
      util.O(paramArrayOfByte5, 6, this.BVy);
      util.O(paramArrayOfByte5, 10, 522017402);
      util.O(paramArrayOfByte5, 14, paramInt1);
      util.c(paramArrayOfByte5, 18, paramLong);
      System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte5, 26, paramArrayOfByte1.length);
      paramInt1 = paramArrayOfByte1.length + 26;
      System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte5, paramInt1, paramArrayOfByte2.length);
      paramInt1 += paramArrayOfByte2.length;
      util.M(paramArrayOfByte5, paramInt1, 1);
      paramInt1++;
      System.arraycopy(paramArrayOfByte3, 0, paramArrayOfByte5, paramInt1, paramArrayOfByte3.length);
      System.arraycopy(paramArrayOfByte4, 0, paramArrayOfByte5, paramInt1 + paramArrayOfByte3.length, paramArrayOfByte4.length);
      paramArrayOfByte1 = new byte[24];
      System.arraycopy(paramArrayOfByte3, 0, paramArrayOfByte1, 0, paramArrayOfByte3.length);
      util.c(paramArrayOfByte1, 16, paramLong);
      paramArrayOfByte1 = c.cM(paramArrayOfByte1);
      paramArrayOfByte1 = d.a(paramArrayOfByte5, paramArrayOfByte5.length, paramArrayOfByte1);
      this.BVz = paramArrayOfByte1.length;
      super.Vj(this.BUz);
      super.ac(paramArrayOfByte1, this.BVz);
      super.emG();
      paramArrayOfByte1 = super.emC();
      AppMethodBeat.o(96497);
      return paramArrayOfByte1;
    }
    byte[] arrayOfByte = new byte[this.BVz];
    util.N(arrayOfByte, 0, this.BVx);
    util.O(arrayOfByte, 2, util.emN());
    util.O(arrayOfByte, 6, this.BVy);
    util.O(arrayOfByte, 10, 522017402);
    util.O(arrayOfByte, 14, paramInt1);
    util.c(arrayOfByte, 18, paramLong);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 26, paramArrayOfByte1.length);
    paramInt1 = paramArrayOfByte1.length + 26;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, paramInt1, paramArrayOfByte2.length);
    paramInt1 += paramArrayOfByte2.length;
    util.M(arrayOfByte, paramInt1, 1);
    paramInt1++;
    System.arraycopy(paramArrayOfByte3, 0, arrayOfByte, paramInt1, paramArrayOfByte3.length);
    paramInt1 += paramArrayOfByte3.length;
    System.arraycopy(paramArrayOfByte4, 0, arrayOfByte, paramInt1, paramArrayOfByte4.length);
    paramInt1 += paramArrayOfByte4.length;
    util.O(arrayOfByte, paramInt1, 0);
    paramInt1 += 4;
    util.M(arrayOfByte, paramInt1, paramInt2);
    if ((paramArrayOfByte5 == null) || (paramArrayOfByte5.length <= 0))
    {
      paramArrayOfByte1 = new byte[16];
      util.O(paramArrayOfByte1, 0, util.emN());
      util.O(paramArrayOfByte1, 4, util.emN());
      util.O(paramArrayOfByte1, 8, util.emN());
      util.O(paramArrayOfByte1, 12, util.emN());
    }
    while (true)
    {
      paramArrayOfByte1 = new byte[24];
      System.arraycopy(paramArrayOfByte3, 0, paramArrayOfByte1, 0, paramArrayOfByte3.length);
      util.c(paramArrayOfByte1, 16, paramLong);
      paramArrayOfByte1 = c.cM(paramArrayOfByte1);
      paramArrayOfByte1 = d.a(arrayOfByte, arrayOfByte.length, paramArrayOfByte1);
      this.BVz = paramArrayOfByte1.length;
      super.Vj(this.BUz);
      super.ac(paramArrayOfByte1, this.BVz);
      super.emG();
      paramArrayOfByte1 = emC();
      AppMethodBeat.o(96497);
      break;
      System.arraycopy(paramArrayOfByte5, 0, arrayOfByte, paramInt1 + 1, paramArrayOfByte5.length);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.h
 * JD-Core Version:    0.6.2
 */