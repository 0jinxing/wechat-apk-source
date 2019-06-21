package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k extends a
{
  int BVC = 0;

  public k()
  {
    this.BUz = 265;
  }

  public final byte[] cI(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96502);
    this.BVC = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[this.BVC];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, this.BVC);
    super.emG();
    paramArrayOfByte = super.emC();
    AppMethodBeat.o(96502);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.k
 * JD-Core Version:    0.6.2
 */