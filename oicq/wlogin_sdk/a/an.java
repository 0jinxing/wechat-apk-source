package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class an extends a
{
  int BVU = 22;
  int BVV = 1;
  int BVW = 1536;

  public an()
  {
    this.BUz = 24;
  }

  public final byte[] aj(int paramInt, long paramLong)
  {
    AppMethodBeat.i(96504);
    byte[] arrayOfByte = new byte[this.BVU];
    util.N(arrayOfByte, 0, this.BVV);
    util.O(arrayOfByte, 2, this.BVW);
    util.O(arrayOfByte, 6, 522017402);
    util.O(arrayOfByte, 10, paramInt);
    util.O(arrayOfByte, 14, (int)paramLong);
    util.N(arrayOfByte, 18, 0);
    util.N(arrayOfByte, 20, 0);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, this.BVU);
    super.emG();
    arrayOfByte = super.emC();
    AppMethodBeat.o(96504);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.an
 * JD-Core Version:    0.6.2
 */