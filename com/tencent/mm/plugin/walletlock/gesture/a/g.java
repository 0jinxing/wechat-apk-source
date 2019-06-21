package com.tencent.mm.plugin.walletlock.gesture.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class g
{
  public long tVD = -1L;
  public long tVE = 0L;

  public final g bz(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(51585);
    paramArrayOfByte = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
    try
    {
      this.tVD = paramArrayOfByte.readLong();
      this.tVE = paramArrayOfByte.readLong();
      paramArrayOfByte.close();
      AppMethodBeat.o(51585);
      return this;
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.TimeInfo", paramArrayOfByte, "", new Object[0]);
    }
  }

  public final byte[] toByteArray()
  {
    AppMethodBeat.i(51584);
    Object localObject = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream((OutputStream)localObject);
    try
    {
      localDataOutputStream.writeLong(this.tVD);
      localDataOutputStream.writeLong(this.tVE);
      localDataOutputStream.close();
      localObject = ((ByteArrayOutputStream)localObject).toByteArray();
      AppMethodBeat.o(51584);
      return localObject;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.TimeInfo", localIOException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.a.g
 * JD-Core Version:    0.6.2
 */