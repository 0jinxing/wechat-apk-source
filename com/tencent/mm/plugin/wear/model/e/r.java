package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public final class r
{
  private static AtomicInteger tYM;

  static
  {
    AppMethodBeat.i(26430);
    tYM = new AtomicInteger();
    AppMethodBeat.o(26430);
  }

  public static void b(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(26429);
    byte[] arrayOfByte = paramArrayOfByte;
    if (paramBoolean)
      arrayOfByte = a.cUn().tXt.bC(paramArrayOfByte);
    int i = tYM.incrementAndGet();
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramArrayOfByte = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      paramArrayOfByte.writeInt(0);
      paramArrayOfByte.writeInt(i);
      paramArrayOfByte.writeInt(paramInt);
      if ((arrayOfByte != null) && (arrayOfByte.length > 0))
      {
        paramArrayOfByte.writeInt(arrayOfByte.length);
        paramArrayOfByte.write(arrayOfByte);
      }
      while (true)
      {
        a.cUn().tXt.bA(localByteArrayOutputStream.toByteArray());
        AppMethodBeat.o(26429);
        return;
        paramArrayOfByte.writeInt(0);
      }
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Wear.WearPushServerLogic", paramArrayOfByte, "gen response data error connectType=%d, sessionId=%d, funId=%d", new Object[] { Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(paramInt) });
        AppMethodBeat.o(26429);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.r
 * JD-Core Version:    0.6.2
 */