package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class ae extends a
{
  int BVM = 0;
  int upS = 0;

  public ae()
  {
    this.BUz = 322;
  }

  public final byte[] cJ(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96494);
    this.BVM = (paramArrayOfByte.length + 4);
    byte[] arrayOfByte = new byte[this.BVM];
    util.N(arrayOfByte, 0, this.upS);
    util.N(arrayOfByte, 2, paramArrayOfByte.length);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 4, paramArrayOfByte.length);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, arrayOfByte.length);
    super.emG();
    paramArrayOfByte = super.emC();
    AppMethodBeat.o(96494);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.ae
 * JD-Core Version:    0.6.2
 */