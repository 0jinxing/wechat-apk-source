package oicq.wlogin_sdk.request;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.a.a;
import oicq.wlogin_sdk.a.ao;
import oicq.wlogin_sdk.a.f;

public final class g extends d
{
  public g(i parami)
  {
    this.BUz = 2064;
    this.BUA = 2;
    this.BUC = parami;
  }

  public final byte[] cF(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96426);
    int i = this.BUC.BUM;
    byte[] arrayOfByte1 = this.BUC.BUH.emF();
    Object localObject = this.BUC.BUI;
    byte[] arrayOfByte2 = new byte[((oicq.wlogin_sdk.a.g)localObject).BVu];
    int j;
    if (((oicq.wlogin_sdk.a.g)localObject).BVu <= 0)
    {
      localObject = new f();
      ao localao = new ao();
      localObject = ((f)localObject).cG(arrayOfByte1);
      paramArrayOfByte = localao.q(paramArrayOfByte, arrayOfByte2);
      arrayOfByte2 = new byte[localObject.length + paramArrayOfByte.length];
      if (arrayOfByte1.length <= 0)
        break label217;
      System.arraycopy(localObject, 0, arrayOfByte2, 0, localObject.length);
      j = localObject.length + 0;
    }
    for (int k = 1; ; k = 0)
    {
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, j, paramArrayOfByte.length);
      paramArrayOfByte = super.G(arrayOfByte2, this.BUA, k + 1);
      a(this.BUu, this.BUz, this.BUC._uin, this.BUw, this.BUx, i, this.BUy, paramArrayOfByte);
      paramArrayOfByte = super.emC();
      AppMethodBeat.o(96426);
      return paramArrayOfByte;
      System.arraycopy(((oicq.wlogin_sdk.a.g)localObject).BUt, ((oicq.wlogin_sdk.a.g)localObject).BVw, arrayOfByte2, 0, ((oicq.wlogin_sdk.a.g)localObject).BVu);
      break;
      label217: j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.request.g
 * JD-Core Version:    0.6.2
 */