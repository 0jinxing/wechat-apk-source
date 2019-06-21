package com.tencent.d.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public final class b
{
  public static byte[] cl(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(114593);
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    InflaterInputStream localInflaterInputStream = new InflaterInputStream(localByteArrayInputStream);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      while (true)
      {
        int i = localInflaterInputStream.read();
        if (i == -1)
          break;
        localByteArrayOutputStream.write(i);
      }
    }
    catch (Exception paramArrayOfByte)
    {
      h.db("inflater(), exception: ".concat(String.valueOf(paramArrayOfByte)));
    }
    finally
    {
      try
      {
        localByteArrayInputStream.close();
        localInflaterInputStream.close();
        localByteArrayOutputStream.close();
        paramArrayOfByte = null;
        AppMethodBeat.o(114593);
        return paramArrayOfByte;
        paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      }
      catch (IOException paramArrayOfByte)
      {
        try
        {
          while (true)
          {
            localByteArrayInputStream.close();
            localInflaterInputStream.close();
            localByteArrayOutputStream.close();
            label103: AppMethodBeat.o(114593);
          }
          paramArrayOfByte = finally;
          try
          {
            localByteArrayInputStream.close();
            localInflaterInputStream.close();
            localByteArrayOutputStream.close();
            label124: AppMethodBeat.o(114593);
            throw paramArrayOfByte;
          }
          catch (IOException localIOException1)
          {
            break label124;
          }
          paramArrayOfByte = paramArrayOfByte;
        }
        catch (IOException localIOException2)
        {
          break label103;
        }
      }
    }
  }

  // ERROR //
  public static byte[] compress(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 73
    //   2: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 30	java/io/ByteArrayOutputStream
    //   8: dup
    //   9: invokespecial 33	java/io/ByteArrayOutputStream:<init>	()V
    //   12: astore_1
    //   13: new 75	java/util/zip/DeflaterOutputStream
    //   16: dup
    //   17: aload_1
    //   18: invokespecial 78	java/util/zip/DeflaterOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   21: astore_2
    //   22: aload_2
    //   23: aload_0
    //   24: invokevirtual 80	java/util/zip/DeflaterOutputStream:write	([B)V
    //   27: aload_2
    //   28: invokevirtual 83	java/util/zip/DeflaterOutputStream:finish	()V
    //   31: aload_1
    //   32: invokevirtual 70	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   35: astore_0
    //   36: aload_1
    //   37: invokevirtual 63	java/io/ByteArrayOutputStream:close	()V
    //   40: aload_2
    //   41: invokevirtual 84	java/util/zip/DeflaterOutputStream:close	()V
    //   44: ldc 73
    //   46: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   49: aload_0
    //   50: areturn
    //   51: astore_0
    //   52: ldc 86
    //   54: aload_0
    //   55: invokestatic 48	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   58: invokevirtual 52	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   61: invokestatic 58	com/tencent/d/f/h:db	(Ljava/lang/Object;)V
    //   64: aload_1
    //   65: invokevirtual 63	java/io/ByteArrayOutputStream:close	()V
    //   68: aload_2
    //   69: invokevirtual 84	java/util/zip/DeflaterOutputStream:close	()V
    //   72: aconst_null
    //   73: astore_0
    //   74: ldc 73
    //   76: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   79: goto -30 -> 49
    //   82: astore_0
    //   83: aload_1
    //   84: invokevirtual 63	java/io/ByteArrayOutputStream:close	()V
    //   87: aload_2
    //   88: invokevirtual 84	java/util/zip/DeflaterOutputStream:close	()V
    //   91: ldc 73
    //   93: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: aload_0
    //   97: athrow
    //   98: astore_1
    //   99: goto -8 -> 91
    //   102: astore_0
    //   103: goto -31 -> 72
    //   106: astore_1
    //   107: goto -63 -> 44
    //
    // Exception table:
    //   from	to	target	type
    //   22	36	51	java/lang/Exception
    //   22	36	82	finally
    //   52	64	82	finally
    //   83	91	98	java/io/IOException
    //   64	72	102	java/io/IOException
    //   36	44	106	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.d.f.b
 * JD-Core Version:    0.6.2
 */