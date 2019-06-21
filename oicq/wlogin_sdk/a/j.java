package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class j extends a
{
  int BVB = 0;

  public j()
  {
    this.BUz = 264;
  }

  public final byte[] cH(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96493);
    this.BVB = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[this.BVB];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, this.BVB);
    super.emG();
    paramArrayOfByte = super.emC();
    AppMethodBeat.o(96493);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.j
 * JD-Core Version:    0.6.2
 */