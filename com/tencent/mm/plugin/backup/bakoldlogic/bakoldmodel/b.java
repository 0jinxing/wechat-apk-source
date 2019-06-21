package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.o;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

public final class b
{
  public static int a(byte[] paramArrayOfByte1, int paramInt1, short paramShort1, short paramShort2, int paramInt2, byte[] paramArrayOfByte2)
  {
    int i = 0;
    AppMethodBeat.i(17752);
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      localByteArrayOutputStream.write(paramArrayOfByte1);
      localByteArrayOutputStream.write(o.fZ(paramInt1));
      localByteArrayOutputStream.write(new byte[] { (byte)(paramShort1 >> 8 & 0xFF), (byte)(paramShort1 & 0xFF) });
      localByteArrayOutputStream.write(new byte[] { (byte)(paramShort2 >> 8 & 0xFF), (byte)(paramShort2 & 0xFF) });
      localByteArrayOutputStream.write(o.fZ(paramInt2));
      localByteArrayOutputStream.write(o.fZ(0));
      localByteArrayOutputStream.write(paramArrayOfByte2);
      paramArrayOfByte1 = new java/util/zip/CRC32;
      paramArrayOfByte1.<init>();
      paramArrayOfByte1.update(localByteArrayOutputStream.toByteArray());
      long l = paramArrayOfByte1.getValue();
      paramInt1 = (int)l;
      AppMethodBeat.o(17752);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BakOldPacker", paramArrayOfByte1, "", new Object[0]);
        AppMethodBeat.o(17752);
        paramInt1 = i;
      }
    }
  }

  public static String ap(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17753);
    String str = "";
    int i;
    if (paramArrayOfByte.length > 100)
      i = paramArrayOfByte.length - 100;
    while (i < paramArrayOfByte.length)
    {
      str = str + Integer.toHexString(paramArrayOfByte[i] & 0xFF) + " ";
      i++;
      continue;
      i = 0;
    }
    ab.e("MicroMsg.BakOldPacker", "dump errBuf: %s", new Object[] { str });
    AppMethodBeat.o(17753);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.b
 * JD-Core Version:    0.6.2
 */