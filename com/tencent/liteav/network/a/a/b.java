package com.tencent.liteav.network.a.a;

import com.tencent.liteav.network.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;

public final class b
{
  private static String a(DataInputStream paramDataInputStream, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(67646);
    int i = paramDataInputStream.readUnsignedByte();
    if ((i & 0xC0) == 192)
    {
      i = ((i & 0x3F) << 8) + paramDataInputStream.readUnsignedByte();
      paramDataInputStream = new HashSet();
      paramDataInputStream.add(Integer.valueOf(i));
      paramDataInputStream = a(paramArrayOfByte, i, paramDataInputStream);
      AppMethodBeat.o(67646);
    }
    while (true)
    {
      return paramDataInputStream;
      if (i == 0)
      {
        paramDataInputStream = "";
        AppMethodBeat.o(67646);
      }
      else
      {
        Object localObject = new byte[i];
        paramDataInputStream.readFully((byte[])localObject);
        localObject = IDN.toUnicode(new String((byte[])localObject));
        paramArrayOfByte = a(paramDataInputStream, paramArrayOfByte);
        paramDataInputStream = (DataInputStream)localObject;
        if (paramArrayOfByte.length() > 0)
          paramDataInputStream = (String)localObject + "." + paramArrayOfByte;
        AppMethodBeat.o(67646);
      }
    }
  }

  private static String a(byte[] paramArrayOfByte, int paramInt, HashSet<Integer> paramHashSet)
  {
    AppMethodBeat.i(67647);
    int i;
    while (true)
    {
      i = paramArrayOfByte[paramInt] & 0xFF;
      if ((i & 0xC0) != 192)
        break;
      paramInt = ((i & 0x3F) << 8) + (paramArrayOfByte[(paramInt + 1)] & 0xFF);
      if (paramHashSet.contains(Integer.valueOf(paramInt)))
      {
        paramArrayOfByte = new com.tencent.liteav.network.a.a("", "Cyclic offsets detected.");
        AppMethodBeat.o(67647);
        throw paramArrayOfByte;
      }
      paramHashSet.add(Integer.valueOf(paramInt));
    }
    if (i == 0)
    {
      paramArrayOfByte = "";
      AppMethodBeat.o(67647);
    }
    while (true)
    {
      return paramArrayOfByte;
      String str = new String(paramArrayOfByte, paramInt + 1, i);
      paramHashSet = a(paramArrayOfByte, i + (paramInt + 1), paramHashSet);
      paramArrayOfByte = str;
      if (paramHashSet.length() > 0)
        paramArrayOfByte = str + "." + paramHashSet;
      AppMethodBeat.o(67647);
    }
  }

  private static void a(DataInputStream paramDataInputStream, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(67648);
    while (paramInt > 0)
    {
      a(paramDataInputStream, paramArrayOfByte);
      paramDataInputStream.readUnsignedShort();
      paramDataInputStream.readUnsignedShort();
      paramInt--;
    }
    AppMethodBeat.o(67648);
  }

  private static void a(OutputStream paramOutputStream, String paramString)
  {
    AppMethodBeat.i(67643);
    paramString = paramString.split("[.。．｡]");
    int i = paramString.length;
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = IDN.toASCII(paramString[j]).getBytes();
      paramOutputStream.write(arrayOfByte.length);
      paramOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
    }
    paramOutputStream.write(0);
    AppMethodBeat.o(67643);
  }

  public static byte[] a(String paramString, int paramInt)
  {
    AppMethodBeat.i(67642);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(512);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    com.tencent.liteav.network.a.b.a locala = new com.tencent.liteav.network.a.b.a();
    locala.a(8);
    paramInt = (short)paramInt;
    try
    {
      localDataOutputStream.writeShort(paramInt);
      localDataOutputStream.writeShort((short)locala.a());
      localDataOutputStream.writeShort(1);
      localDataOutputStream.writeShort(0);
      localDataOutputStream.writeShort(0);
      localDataOutputStream.writeShort(0);
      localDataOutputStream.flush();
      b(localByteArrayOutputStream, paramString);
      paramString = localByteArrayOutputStream.toByteArray();
      AppMethodBeat.o(67642);
      return paramString;
    }
    catch (IOException paramString)
    {
      paramString = new AssertionError(paramString);
      AppMethodBeat.o(67642);
    }
    throw paramString;
  }

  public static e[] a(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    int i = 1;
    AppMethodBeat.i(67645);
    DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
    int j = localDataInputStream.readUnsignedShort();
    if (j != paramInt)
    {
      paramArrayOfByte = new com.tencent.liteav.network.a.a(paramString, "the answer id " + j + " is not match " + paramInt);
      AppMethodBeat.o(67645);
      throw paramArrayOfByte;
    }
    j = localDataInputStream.readUnsignedShort();
    if ((j >> 8 & 0x1) == 1)
    {
      paramInt = 1;
      if ((j >> 7 & 0x1) != 1)
        break label141;
    }
    while (true)
    {
      if ((i != 0) && (paramInt != 0))
        break label146;
      paramArrayOfByte = new com.tencent.liteav.network.a.a(paramString, "the dns server cant support recursion ");
      AppMethodBeat.o(67645);
      throw paramArrayOfByte;
      paramInt = 0;
      break;
      label141: i = 0;
    }
    label146: paramInt = localDataInputStream.readUnsignedShort();
    i = localDataInputStream.readUnsignedShort();
    localDataInputStream.readUnsignedShort();
    localDataInputStream.readUnsignedShort();
    a(localDataInputStream, paramArrayOfByte, paramInt);
    paramArrayOfByte = b(localDataInputStream, paramArrayOfByte, i);
    AppMethodBeat.o(67645);
    return paramArrayOfByte;
  }

  private static e b(DataInputStream paramDataInputStream, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(67650);
    a(paramDataInputStream, paramArrayOfByte);
    int i = paramDataInputStream.readUnsignedShort();
    paramDataInputStream.readUnsignedShort();
    long l1 = paramDataInputStream.readUnsignedShort();
    long l2 = paramDataInputStream.readUnsignedShort();
    int j = paramDataInputStream.readUnsignedShort();
    switch (i)
    {
    default:
      Object localObject = null;
      for (int k = 0; ; k++)
      {
        paramArrayOfByte = localObject;
        if (k >= j)
          break;
        paramDataInputStream.readByte();
      }
    case 1:
      paramArrayOfByte = new byte[4];
      paramDataInputStream.readFully(paramArrayOfByte);
    case 5:
    }
    for (paramArrayOfByte = InetAddress.getByAddress(paramArrayOfByte).getHostAddress(); paramArrayOfByte == null; paramArrayOfByte = a(paramDataInputStream, paramArrayOfByte))
    {
      paramDataInputStream = new UnknownHostException("no record");
      AppMethodBeat.o(67650);
      throw paramDataInputStream;
    }
    paramDataInputStream = new e(paramArrayOfByte, i, (int)(l2 + (l1 << 16)), System.currentTimeMillis() / 1000L);
    AppMethodBeat.o(67650);
    return paramDataInputStream;
  }

  private static void b(OutputStream paramOutputStream, String paramString)
  {
    AppMethodBeat.i(67644);
    DataOutputStream localDataOutputStream = new DataOutputStream(paramOutputStream);
    a(paramOutputStream, paramString);
    localDataOutputStream.writeShort(1);
    localDataOutputStream.writeShort(1);
    AppMethodBeat.o(67644);
  }

  private static e[] b(DataInputStream paramDataInputStream, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(67649);
    int i = 0;
    e[] arrayOfe = new e[paramInt];
    while (paramInt > 0)
    {
      arrayOfe[i] = b(paramDataInputStream, paramArrayOfByte);
      i++;
      paramInt--;
    }
    AppMethodBeat.o(67649);
    return arrayOfe;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.a.a.b
 * JD-Core Version:    0.6.2
 */