package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class b extends a
{
  int BVk;
  int BVl;
  int BVm;
  int BVn;
  byte[] BVo;

  public b()
  {
    AppMethodBeat.i(96498);
    this.BVk = 4;
    this.BVl = 14;
    this.BVm = 1;
    this.BVn = 20;
    this.BVo = new byte[2];
    this.BUz = 1;
    AppMethodBeat.o(96498);
  }

  public final Boolean emH()
  {
    if (this.BVj < 20);
    for (Boolean localBoolean = Boolean.FALSE; ; localBoolean = Boolean.TRUE)
      return localBoolean;
  }

  public final byte[] g(long paramLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96499);
    byte[] arrayOfByte = new byte[this.BVn];
    util.N(arrayOfByte, 0, this.BVm);
    util.O(arrayOfByte, 2, util.emN());
    util.O(arrayOfByte, 6, (int)paramLong);
    util.d(arrayOfByte, 10, util.emP());
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 14, paramArrayOfByte.length);
    util.N(arrayOfByte, paramArrayOfByte.length + 14, 0);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, this.BVn);
    super.emG();
    paramArrayOfByte = super.emC();
    AppMethodBeat.o(96499);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.b
 * JD-Core Version:    0.6.2
 */