package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class r extends a
{
  int BVD = 0;
  int BVE = 0;

  public r()
  {
    this.BUz = 278;
  }

  public final byte[] iB(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(96501);
    this.BVD = 10;
    byte[] arrayOfByte = new byte[this.BVD];
    util.M(arrayOfByte, 0, this.BVE);
    util.O(arrayOfByte, 1, paramInt1);
    util.O(arrayOfByte, 5, paramInt2);
    util.M(arrayOfByte, 9, 0);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, this.BVD);
    super.emG();
    arrayOfByte = super.emC();
    AppMethodBeat.o(96501);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.r
 * JD-Core Version:    0.6.2
 */