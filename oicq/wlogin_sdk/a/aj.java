package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class aj extends a
{
  public aj()
  {
    this.BUz = 327;
  }

  private static int cL(byte[] paramArrayOfByte)
  {
    int i = 32;
    if (paramArrayOfByte != null)
      if (paramArrayOfByte.length <= 32);
    while (true)
    {
      return i;
      i = paramArrayOfByte.length;
      continue;
      i = 0;
    }
  }

  public final byte[] p(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(96500);
    int i = cL(paramArrayOfByte1);
    int j = cL(paramArrayOfByte2);
    byte[] arrayOfByte = new byte[i + 6 + 2 + j];
    util.d(arrayOfByte, 0, 522017402L);
    util.N(arrayOfByte, 4, i);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 6, i);
    i += 6;
    util.N(arrayOfByte, i, j);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, i + 2, j);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, arrayOfByte.length);
    super.emG();
    paramArrayOfByte1 = super.emC();
    AppMethodBeat.o(96500);
    return paramArrayOfByte1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.aj
 * JD-Core Version:    0.6.2
 */