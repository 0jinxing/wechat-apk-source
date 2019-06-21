package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.c;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class p$a extends l.d
  implements l.b
{
  public int bJt;
  public int cAd;
  public int fQi;
  public String vyw;
  public byte[] vyx;

  public p$a()
  {
    AppMethodBeat.i(28283);
    this.cAd = 0;
    this.bJt = 0;
    this.fQi = 0;
    this.vyw = "";
    this.vyx = new byte[0];
    AppMethodBeat.o(28283);
  }

  private byte[] bM(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(28285);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(28285);
    }
    while (true)
    {
      return paramArrayOfByte;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      try
      {
        DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
        localDataOutputStream.<init>(localByteArrayOutputStream);
        localDataOutputStream.writeByte(this.cAd);
        localDataOutputStream.writeByte(this.bJt);
        localDataOutputStream.write(paramArrayOfByte);
        localDataOutputStream.close();
        paramArrayOfByte = localByteArrayOutputStream.toByteArray();
        AppMethodBeat.o(28285);
      }
      catch (IOException paramArrayOfByte)
      {
        while (true)
          ab.e("MicroMsg.MMDirectSend", "direct merge all failed, err=" + paramArrayOfByte.getMessage());
      }
    }
  }

  private byte[] dmt()
  {
    AppMethodBeat.i(28284);
    Object localObject = new ByteArrayOutputStream();
    try
    {
      DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
      localDataOutputStream.<init>((OutputStream)localObject);
      localDataOutputStream.writeInt(this.fQi);
      localDataOutputStream.writeShort(this.vyw.getBytes().length);
      localDataOutputStream.write(this.vyw.getBytes());
      localDataOutputStream.writeShort(this.vyx.length);
      localDataOutputStream.write(this.vyx);
      localDataOutputStream.close();
      localObject = ((ByteArrayOutputStream)localObject).toByteArray();
      AppMethodBeat.o(28284);
      return localObject;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MicroMsg.MMDirectSend", "direct merge tail failed, err=" + localIOException.getMessage());
    }
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(28286);
    byte[] arrayOfByte = dmt();
    Object localObject = new PByteArray();
    c.a((PByteArray)localObject, arrayOfByte, p.akG(this.vye));
    localObject = bM(((PByteArray)localObject).value);
    AppMethodBeat.o(28286);
    return localObject;
  }

  public final int ZU()
  {
    return 10;
  }

  public final boolean adr()
  {
    return false;
  }

  public final boolean dms()
  {
    return true;
  }

  public final int getCmdId()
  {
    return 8;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.p.a
 * JD-Core Version:    0.6.2
 */