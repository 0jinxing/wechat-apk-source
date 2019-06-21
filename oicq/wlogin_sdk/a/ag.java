package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.d;
import oicq.wlogin_sdk.tools.util;

public final class ag extends a
{
  public int BVO = 0;

  public ag()
  {
    this.BUz = 324;
  }

  public final byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5)
  {
    AppMethodBeat.i(96474);
    int i;
    int j;
    if (paramArrayOfByte1 != null)
    {
      i = paramArrayOfByte1.length + 0;
      j = 1;
    }
    while (true)
    {
      int k = j;
      int m = i;
      if (paramArrayOfByte2 != null)
      {
        m = i + paramArrayOfByte2.length;
        k = j + 1;
      }
      i = k;
      j = m;
      if (paramArrayOfByte3 != null)
      {
        j = m + paramArrayOfByte3.length;
        i = k + 1;
      }
      m = i;
      k = j;
      if (paramArrayOfByte4 != null)
      {
        k = j + paramArrayOfByte4.length;
        m = i + 1;
      }
      byte[] arrayOfByte = new byte[k + 2];
      util.N(arrayOfByte, 0, m);
      if (paramArrayOfByte1 != null)
        System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 2, paramArrayOfByte1.length);
      for (j = paramArrayOfByte1.length + 2; ; j = 2)
      {
        k = j;
        if (paramArrayOfByte2 != null)
        {
          System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, j, paramArrayOfByte2.length);
          k = j + paramArrayOfByte2.length;
        }
        j = k;
        if (paramArrayOfByte3 != null)
        {
          System.arraycopy(paramArrayOfByte3, 0, arrayOfByte, k, paramArrayOfByte3.length);
          j = k + paramArrayOfByte3.length;
        }
        if (paramArrayOfByte4 != null)
          System.arraycopy(paramArrayOfByte4, 0, arrayOfByte, j, paramArrayOfByte4.length);
        paramArrayOfByte1 = d.a(arrayOfByte, arrayOfByte.length, paramArrayOfByte5);
        this.BVO = paramArrayOfByte1.length;
        super.Vj(this.BUz);
        super.ac(paramArrayOfByte1, paramArrayOfByte1.length);
        super.emG();
        paramArrayOfByte1 = super.emC();
        AppMethodBeat.o(96474);
        return paramArrayOfByte1;
      }
      j = 0;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.ag
 * JD-Core Version:    0.6.2
 */