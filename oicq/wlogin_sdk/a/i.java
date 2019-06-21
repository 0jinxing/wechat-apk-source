package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class i extends a
{
  int BVA = 6;

  public i()
  {
    this.BUz = 263;
  }

  public final byte[] emI()
  {
    AppMethodBeat.i(96492);
    byte[] arrayOfByte = new byte[this.BVA];
    util.N(arrayOfByte, 0, 0);
    util.M(arrayOfByte, 2, 1);
    util.N(arrayOfByte, 3, 102400);
    util.M(arrayOfByte, 5, 1);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, this.BVA);
    super.emG();
    arrayOfByte = super.emC();
    AppMethodBeat.o(96492);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.i
 * JD-Core Version:    0.6.2
 */