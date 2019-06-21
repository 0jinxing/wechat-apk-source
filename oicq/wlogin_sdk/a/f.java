package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f extends a
{
  int BVs = 0;

  public f()
  {
    this.BUz = 260;
  }

  public final byte[] cG(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96480);
    this.BVs = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[this.BVs];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, this.BVs);
    super.emG();
    paramArrayOfByte = super.emC();
    AppMethodBeat.o(96480);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.f
 * JD-Core Version:    0.6.2
 */