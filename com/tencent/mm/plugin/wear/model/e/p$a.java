package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.plugin.wear.model.f.c;
import com.tencent.mm.protocal.protobuf.cuy;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class p$a extends c
{
  public int ctE;
  public int tXY = 2;
  public int tXZ;
  public cuy tYK;

  public p$a(p paramp, int paramInt, cuy paramcuy)
  {
    this.ctE = paramInt;
    this.tXZ = 30001;
    this.tYK = paramcuy;
  }

  public final String getName()
  {
    return "WearVoiceToTextTask";
  }

  public final void send()
  {
    AppMethodBeat.i(26420);
    try
    {
      localObject1 = this.tYK.toByteArray();
      arrayOfByte = a.cUn().tXt.bC((byte[])localObject1);
      localObject1 = new ByteArrayOutputStream();
      localObject2 = new DataOutputStream((OutputStream)localObject1);
    }
    catch (IOException localIOException1)
    {
      try
      {
        Object localObject1;
        byte[] arrayOfByte;
        Object localObject2;
        ((DataOutputStream)localObject2).writeInt(this.tXY);
        ((DataOutputStream)localObject2).writeInt(this.ctE);
        ((DataOutputStream)localObject2).writeInt(this.tXZ);
        if ((arrayOfByte != null) && (arrayOfByte.length > 0))
        {
          ((DataOutputStream)localObject2).writeInt(arrayOfByte.length);
          ((DataOutputStream)localObject2).write(arrayOfByte);
        }
        while (true)
        {
          localObject2 = ((ByteArrayOutputStream)localObject1).toByteArray();
          ab.i("MicroMsg.Wear.VoiceToTextServer", "send data funId=%d length=%d", new Object[] { Integer.valueOf(this.tXZ), Integer.valueOf(localObject2.length) });
          a.cUn().tXt.bA(((ByteArrayOutputStream)localObject1).toByteArray());
          AppMethodBeat.o(26420);
          while (true)
          {
            return;
            localIOException1 = localIOException1;
            ab.printErrStackTrace("MicroMsg.Wear.VoiceToTextServer", localIOException1, "", new Object[0]);
            AppMethodBeat.o(26420);
          }
          ((DataOutputStream)localObject2).writeInt(0);
        }
      }
      catch (IOException localIOException2)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.Wear.VoiceToTextServer", localIOException2, "gen response data error connectType=%d, sessionId=%d, funId=%d", new Object[] { Integer.valueOf(this.tXY), Integer.valueOf(this.ctE), Integer.valueOf(this.tXZ) });
          AppMethodBeat.o(26420);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.p.a
 * JD-Core Version:    0.6.2
 */