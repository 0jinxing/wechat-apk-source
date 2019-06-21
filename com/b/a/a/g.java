package com.b.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

final class g
{
  protected static byte[] compress(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(55583);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    Object localObject4 = localObject1;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localObject3 = localObject2;
      localObject4 = localObject1;
      localByteArrayOutputStream.<init>(paramArrayOfByte.length);
      localObject3 = localObject2;
      localObject4 = localObject1;
      GZIPOutputStream localGZIPOutputStream = new java/util/zip/GZIPOutputStream;
      localObject3 = localObject2;
      localObject4 = localObject1;
      localGZIPOutputStream.<init>(localByteArrayOutputStream);
      localObject3 = localObject2;
      localObject4 = localObject1;
      localGZIPOutputStream.write(paramArrayOfByte);
      localObject3 = localObject2;
      localObject4 = localObject1;
      localGZIPOutputStream.close();
      localObject3 = localObject2;
      localObject4 = localObject1;
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      localObject3 = paramArrayOfByte;
      localObject4 = paramArrayOfByte;
      localByteArrayOutputStream.close();
      AppMethodBeat.o(55583);
      return paramArrayOfByte;
    }
    catch (Error paramArrayOfByte)
    {
      while (true)
        paramArrayOfByte = (byte[])localObject3;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
        paramArrayOfByte = (byte[])localObject4;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.b.a.a.g
 * JD-Core Version:    0.6.2
 */