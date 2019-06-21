package com.tencent.mm.plugin.wear.model.e;

import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public abstract class a
{
  protected boolean HI(int paramInt)
  {
    return false;
  }

  protected boolean HJ(int paramInt)
  {
    return false;
  }

  public boolean HK(int paramInt)
  {
    return false;
  }

  public abstract List<Integer> cUA();

  public boolean cUB()
  {
    return true;
  }

  public final void d(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    Object localObject = paramArrayOfByte;
    if (HJ(paramInt3))
    {
      localObject = paramArrayOfByte;
      if (paramArrayOfByte != null)
      {
        paramArrayOfByte = com.tencent.mm.plugin.wear.model.a.cUn().tXt.bB(paramArrayOfByte);
        localObject = paramArrayOfByte;
        if (paramArrayOfByte == null)
          ab.e("MicroMsg.Wear.BaseHttpServer", "request data decrypt error");
      }
    }
    while (true)
    {
      return;
      localObject = p(paramInt3, (byte[])localObject);
      if (cUB())
      {
        paramArrayOfByte = (byte[])localObject;
        if (HI(paramInt3))
          paramArrayOfByte = com.tencent.mm.plugin.wear.model.a.cUn().tXt.bC((byte[])localObject);
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localObject = new DataOutputStream(localByteArrayOutputStream);
        while (true)
        {
          try
          {
            ((DataOutputStream)localObject).writeInt(paramInt1);
            ((DataOutputStream)localObject).writeInt(paramInt2);
            ((DataOutputStream)localObject).writeInt(paramInt3);
            if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
              break label252;
            ((DataOutputStream)localObject).writeInt(paramArrayOfByte.length);
            ((DataOutputStream)localObject).write(paramArrayOfByte);
            localObject = localByteArrayOutputStream.toByteArray();
            ab.i("MicroMsg.Wear.BaseHttpServer", "send data funId=%d length=%d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(localObject.length) });
            if (HK(paramInt3))
              break label261;
            com.tencent.mm.plugin.wear.model.a.cUn().tXt.bA((byte[])localObject);
          }
          catch (IOException paramArrayOfByte)
          {
            ab.printErrStackTrace("MicroMsg.Wear.BaseHttpServer", paramArrayOfByte, "gen response data error connectType=%d, sessionId=%d, funId=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
          }
          break;
          label252: ((DataOutputStream)localObject).writeInt(0);
        }
        label261: paramArrayOfByte = new com/tencent/mm/plugin/wear/model/e/a$1;
        paramArrayOfByte.<init>(this, (byte[])localObject);
        com.tencent.mm.sdk.g.d.post(paramArrayOfByte, "WearSendResponseTask");
      }
    }
  }

  protected abstract byte[] p(int paramInt, byte[] paramArrayOfByte);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.a
 * JD-Core Version:    0.6.2
 */