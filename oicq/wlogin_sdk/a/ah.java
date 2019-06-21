package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ah extends a
{
  public int BVP = 0;

  public ah()
  {
    this.BUz = 325;
  }

  public final byte[] cK(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96479);
    if (paramArrayOfByte != null);
    for (int i = paramArrayOfByte.length + 0; ; i = 0)
    {
      byte[] arrayOfByte = new byte[i];
      if (arrayOfByte.length > 0)
        System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i);
      this.BVP = arrayOfByte.length;
      super.Vj(this.BUz);
      super.ac(arrayOfByte, arrayOfByte.length);
      super.emG();
      paramArrayOfByte = super.emC();
      AppMethodBeat.o(96479);
      return paramArrayOfByte;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.ah
 * JD-Core Version:    0.6.2
 */