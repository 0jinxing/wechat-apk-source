package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.c;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class p
{
  public static final class b extends l.e
    implements l.c
  {
    private int bJt;
    private int cAd;
    public byte[] content;
    public String deviceID;
    public String fOt;
    private int fQi;

    public b()
    {
      AppMethodBeat.i(28287);
      this.fOt = "";
      this.content = new byte[0];
      this.deviceID = "";
      this.cAd = 0;
      this.bJt = 0;
      this.fQi = 0;
      this.fOt = "";
      this.content = new byte[0];
      AppMethodBeat.o(28287);
    }

    private byte[] bN(byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(28288);
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 2))
      {
        ab.e("MicroMsg.MMDirectSend", "parse all failed, empty buf");
        paramArrayOfByte = null;
        AppMethodBeat.o(28288);
      }
      while (true)
      {
        return paramArrayOfByte;
        byte[] arrayOfByte = new byte[paramArrayOfByte.length - 2];
        try
        {
          ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
          localByteArrayInputStream.<init>(paramArrayOfByte);
          paramArrayOfByte = new java/io/DataInputStream;
          paramArrayOfByte.<init>(localByteArrayInputStream);
          this.cAd = paramArrayOfByte.readByte();
          this.bJt = paramArrayOfByte.readByte();
          paramArrayOfByte.readFully(arrayOfByte);
          paramArrayOfByte = new java/lang/StringBuilder;
          paramArrayOfByte.<init>("cmdId:");
          ab.d("MicroMsg.MMDirectSend", this.cAd + ", flag=" + this.bJt + ", tail len=" + arrayOfByte.length);
          localByteArrayInputStream.close();
          AppMethodBeat.o(28288);
          paramArrayOfByte = arrayOfByte;
        }
        catch (IOException paramArrayOfByte)
        {
          while (true)
            ab.e("MicroMsg.MMDirectSend", "direct parse all failed, err=" + paramArrayOfByte.getMessage());
        }
      }
    }

    public final int P(byte[] paramArrayOfByte)
    {
      int i = 0;
      AppMethodBeat.i(28289);
      Object localObject1 = p.akG(this.deviceID);
      Object localObject2 = new PByteArray();
      int j;
      if (c.b((PByteArray)localObject2, bN(paramArrayOfByte), (byte[])localObject1) != 0)
      {
        byte[] arrayOfByte = new byte[16];
        for (j = 0; j < 16; j++)
          arrayOfByte[j] = ((byte)0);
        if (c.b((PByteArray)localObject2, bN(paramArrayOfByte), arrayOfByte) != 0)
        {
          ab.e("MicroMsg.MMDirectSend", "decrypting from buffer using key=%s error", new Object[] { bo.ca((byte[])localObject1) });
          j = -1;
          AppMethodBeat.o(28289);
          return j;
        }
      }
      paramArrayOfByte = ((PByteArray)localObject2).value;
      if (paramArrayOfByte == null)
        ab.e("MicroMsg.MMDirectSend", "parse tail failed, empty buf");
      while (true)
      {
        AppMethodBeat.o(28289);
        j = i;
        break;
        try
        {
          localObject1 = new java/io/ByteArrayInputStream;
          ((ByteArrayInputStream)localObject1).<init>(paramArrayOfByte);
          paramArrayOfByte = new java/io/DataInputStream;
          paramArrayOfByte.<init>((InputStream)localObject1);
          this.fQi = paramArrayOfByte.readInt();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("seq=");
          ab.d("MicroMsg.MMDirectSend", this.fQi);
          j = paramArrayOfByte.readShort();
          if (j >= 0)
            break label251;
          paramArrayOfByte = new java/io/IOException;
          paramArrayOfByte.<init>("sender empty");
          AppMethodBeat.o(28289);
          throw paramArrayOfByte;
        }
        catch (IOException paramArrayOfByte)
        {
          ab.e("MicroMsg.MMDirectSend", "direct parse all failed, err=" + paramArrayOfByte.getMessage());
        }
        continue;
        label251: localObject1 = new byte[j];
        paramArrayOfByte.readFully((byte[])localObject1);
        localObject2 = new java/lang/String;
        ((String)localObject2).<init>((byte[])localObject1);
        this.fOt = ((String)localObject2);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("recievers len=");
        ab.d("MicroMsg.MMDirectSend", j + ", sender=" + this.fOt);
        j = paramArrayOfByte.readShort();
        if (j < 0)
        {
          paramArrayOfByte = new java/io/IOException;
          paramArrayOfByte.<init>("content empty");
          AppMethodBeat.o(28289);
          throw paramArrayOfByte;
        }
        this.content = new byte[j];
        paramArrayOfByte.readFully(this.content);
        paramArrayOfByte = new java/lang/StringBuilder;
        paramArrayOfByte.<init>("content len=");
        ab.d("MicroMsg.MMDirectSend", this.content.length);
      }
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
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.p
 * JD-Core Version:    0.6.2
 */