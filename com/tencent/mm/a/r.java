package com.tencent.mm.a;

import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Inflater;

public final class r
{
  public static byte[] B(byte[] paramArrayOfByte)
  {
    Inflater localInflater = new Inflater();
    localInflater.reset();
    localInflater.setInput(paramArrayOfByte);
    Object localObject = null;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfByte.length);
    try
    {
      arrayOfByte = new byte[1024];
      while (!localInflater.finished())
        localByteArrayOutputStream.write(arrayOfByte, 0, localInflater.inflate(arrayOfByte));
    }
    catch (Exception localException)
    {
      byte[] arrayOfByte;
      ab.printErrStackTrace("MicroMsg.Zlib", localException, "exception when loop read byte", new Object[0]);
      try
      {
        localByteArrayOutputStream.close();
        while (true)
        {
          localInflater.end();
          if (localException == null)
            break;
          throw new Exception(localException);
          arrayOfByte = localByteArrayOutputStream.toByteArray();
          paramArrayOfByte = arrayOfByte;
          try
          {
            localByteArrayOutputStream.close();
          }
          catch (IOException localIOException2)
          {
            ab.printErrStackTrace("MicroMsg.Zlib", localIOException2, "", new Object[0]);
          }
        }
      }
      catch (IOException localIOException3)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.Zlib", localIOException3, "", new Object[0]);
      }
    }
    finally
    {
      try
      {
        localByteArrayOutputStream.close();
        throw paramArrayOfByte;
      }
      catch (IOException localIOException1)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.Zlib", localIOException1, "", new Object[0]);
      }
    }
    return paramArrayOfByte;
  }

  // ERROR //
  public static byte[] compress(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 71	java/util/zip/Deflater
    //   3: dup
    //   4: invokespecial 72	java/util/zip/Deflater:<init>	()V
    //   7: astore_1
    //   8: aload_1
    //   9: invokevirtual 73	java/util/zip/Deflater:reset	()V
    //   12: aload_1
    //   13: aload_0
    //   14: invokevirtual 74	java/util/zip/Deflater:setInput	([B)V
    //   17: aload_1
    //   18: invokevirtual 77	java/util/zip/Deflater:finish	()V
    //   21: new 25	java/io/ByteArrayOutputStream
    //   24: astore_2
    //   25: aload_2
    //   26: aload_0
    //   27: arraylength
    //   28: invokespecial 28	java/io/ByteArrayOutputStream:<init>	(I)V
    //   31: aload_2
    //   32: astore_3
    //   33: sipush 1024
    //   36: newarray byte
    //   38: astore 4
    //   40: aload_2
    //   41: astore_3
    //   42: aload_1
    //   43: invokevirtual 78	java/util/zip/Deflater:finished	()Z
    //   46: ifne +56 -> 102
    //   49: aload_2
    //   50: astore_3
    //   51: aload_2
    //   52: aload 4
    //   54: iconst_0
    //   55: aload_1
    //   56: aload 4
    //   58: invokevirtual 81	java/util/zip/Deflater:deflate	([B)I
    //   61: invokevirtual 40	java/io/ByteArrayOutputStream:write	([BII)V
    //   64: goto -24 -> 40
    //   67: astore 4
    //   69: aload_2
    //   70: astore_3
    //   71: ldc 42
    //   73: aload 4
    //   75: ldc 65
    //   77: iconst_0
    //   78: anewarray 4	java/lang/Object
    //   81: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: aload_0
    //   85: astore_3
    //   86: aload_2
    //   87: ifnull +9 -> 96
    //   90: aload_2
    //   91: invokevirtual 53	java/io/ByteArrayOutputStream:close	()V
    //   94: aload_0
    //   95: astore_3
    //   96: aload_1
    //   97: invokevirtual 82	java/util/zip/Deflater:end	()V
    //   100: aload_3
    //   101: areturn
    //   102: aload_2
    //   103: astore_3
    //   104: aload_2
    //   105: invokevirtual 63	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   108: astore 4
    //   110: aload 4
    //   112: astore_3
    //   113: aload_2
    //   114: invokevirtual 53	java/io/ByteArrayOutputStream:close	()V
    //   117: goto -21 -> 96
    //   120: astore_0
    //   121: ldc 42
    //   123: aload_0
    //   124: ldc 65
    //   126: iconst_0
    //   127: anewarray 4	java/lang/Object
    //   130: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: goto -37 -> 96
    //   136: astore_3
    //   137: ldc 42
    //   139: aload_3
    //   140: ldc 65
    //   142: iconst_0
    //   143: anewarray 4	java/lang/Object
    //   146: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: aload_0
    //   150: astore_3
    //   151: goto -55 -> 96
    //   154: astore_3
    //   155: aconst_null
    //   156: astore_2
    //   157: aload_2
    //   158: astore_3
    //   159: new 69	java/lang/OutOfMemoryError
    //   162: astore 4
    //   164: aload_2
    //   165: astore_3
    //   166: new 84	java/lang/StringBuilder
    //   169: astore_1
    //   170: aload_2
    //   171: astore_3
    //   172: aload_1
    //   173: ldc 86
    //   175: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   178: aload_2
    //   179: astore_3
    //   180: aload 4
    //   182: aload_1
    //   183: aload_0
    //   184: arraylength
    //   185: invokevirtual 93	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   188: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: invokespecial 98	java/lang/OutOfMemoryError:<init>	(Ljava/lang/String;)V
    //   194: aload_2
    //   195: astore_3
    //   196: aload 4
    //   198: athrow
    //   199: astore_0
    //   200: aload_3
    //   201: ifnull +7 -> 208
    //   204: aload_3
    //   205: invokevirtual 53	java/io/ByteArrayOutputStream:close	()V
    //   208: aload_0
    //   209: athrow
    //   210: astore_3
    //   211: ldc 42
    //   213: aload_3
    //   214: ldc 65
    //   216: iconst_0
    //   217: anewarray 4	java/lang/Object
    //   220: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   223: goto -15 -> 208
    //   226: astore_0
    //   227: aconst_null
    //   228: astore_3
    //   229: goto -29 -> 200
    //   232: astore_3
    //   233: goto -76 -> 157
    //   236: astore 4
    //   238: aconst_null
    //   239: astore_2
    //   240: goto -171 -> 69
    //
    // Exception table:
    //   from	to	target	type
    //   33	40	67	java/lang/Exception
    //   42	49	67	java/lang/Exception
    //   51	64	67	java/lang/Exception
    //   104	110	67	java/lang/Exception
    //   113	117	120	java/io/IOException
    //   90	94	136	java/io/IOException
    //   21	31	154	java/lang/OutOfMemoryError
    //   33	40	199	finally
    //   42	49	199	finally
    //   51	64	199	finally
    //   71	84	199	finally
    //   104	110	199	finally
    //   159	164	199	finally
    //   166	170	199	finally
    //   172	178	199	finally
    //   180	194	199	finally
    //   196	199	199	finally
    //   204	208	210	java/io/IOException
    //   21	31	226	finally
    //   33	40	232	java/lang/OutOfMemoryError
    //   42	49	232	java/lang/OutOfMemoryError
    //   51	64	232	java/lang/OutOfMemoryError
    //   104	110	232	java/lang/OutOfMemoryError
    //   21	31	236	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.r
 * JD-Core Version:    0.6.2
 */