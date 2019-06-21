package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class ao extends a
{
  int BVX = 0;
  int BVY = 0;

  public ao()
  {
    this.BUz = 2;
  }

  public final byte[] q(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(96470);
    this.BVX = (paramArrayOfByte1.length + 6 + paramArrayOfByte2.length);
    byte[] arrayOfByte = new byte[this.BVX];
    util.N(arrayOfByte, 0, this.BVY);
    util.N(arrayOfByte, 2, paramArrayOfByte1.length);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 4, paramArrayOfByte1.length);
    int i = paramArrayOfByte1.length + 4;
    util.N(arrayOfByte, i, paramArrayOfByte2.length);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, i + 2, paramArrayOfByte2.length);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, this.BVX);
    super.emG();
    paramArrayOfByte1 = super.emC();
    AppMethodBeat.o(96470);
    return paramArrayOfByte1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.ao
 * JD-Core Version:    0.6.2
 */