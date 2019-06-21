package com.tencent.mm.plugin.backup.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.o;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

public final class j
{
  public static int a(byte[] paramArrayOfByte1, int paramInt1, short paramShort1, short paramShort2, int paramInt2, byte[] paramArrayOfByte2)
  {
    int i = 0;
    AppMethodBeat.i(17470);
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
      AppMethodBeat.o(17470);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupPacker", paramArrayOfByte1, "BackupPacker getCheckSum error.", new Object[0]);
        AppMethodBeat.o(17470);
        paramInt1 = i;
      }
    }
  }

  // ERROR //
  public static void a(byte[] paramArrayOfByte, int paramInt1, short paramShort, com.tencent.mm.pointers.PByteArray paramPByteArray, int paramInt2)
  {
    // Byte code:
    //   0: sipush 17469
    //   3: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 16	java/io/ByteArrayOutputStream
    //   9: astore 5
    //   11: aload 5
    //   13: invokespecial 20	java/io/ByteArrayOutputStream:<init>	()V
    //   16: aload 5
    //   18: astore 6
    //   20: aload 5
    //   22: ldc 61
    //   24: invokevirtual 66	java/lang/String:getBytes	()[B
    //   27: invokevirtual 24	java/io/ByteArrayOutputStream:write	([B)V
    //   30: aload 5
    //   32: astore 6
    //   34: aload 5
    //   36: iload_1
    //   37: invokestatic 30	com/tencent/mm/a/o:fZ	(I)[B
    //   40: invokevirtual 24	java/io/ByteArrayOutputStream:write	([B)V
    //   43: aload 5
    //   45: astore 6
    //   47: aload 5
    //   49: iconst_2
    //   50: newarray byte
    //   52: dup
    //   53: iconst_0
    //   54: iconst_0
    //   55: bastore
    //   56: dup
    //   57: iconst_1
    //   58: iconst_1
    //   59: bastore
    //   60: invokevirtual 24	java/io/ByteArrayOutputStream:write	([B)V
    //   63: aload 5
    //   65: astore 6
    //   67: aload 5
    //   69: iconst_2
    //   70: newarray byte
    //   72: dup
    //   73: iconst_0
    //   74: iload_2
    //   75: bipush 8
    //   77: ishr
    //   78: sipush 255
    //   81: iand
    //   82: i2b
    //   83: bastore
    //   84: dup
    //   85: iconst_1
    //   86: iload_2
    //   87: sipush 255
    //   90: iand
    //   91: i2b
    //   92: bastore
    //   93: invokevirtual 24	java/io/ByteArrayOutputStream:write	([B)V
    //   96: aload_0
    //   97: astore 7
    //   99: iload_2
    //   100: iconst_1
    //   101: if_icmpeq +11 -> 112
    //   104: iload_2
    //   105: iconst_2
    //   106: if_icmpne +135 -> 241
    //   109: aload_0
    //   110: astore 7
    //   112: aload 5
    //   114: astore 6
    //   116: aload 5
    //   118: aload 7
    //   120: arraylength
    //   121: bipush 20
    //   123: iadd
    //   124: invokestatic 30	com/tencent/mm/a/o:fZ	(I)[B
    //   127: invokevirtual 24	java/io/ByteArrayOutputStream:write	([B)V
    //   130: aload 5
    //   132: astore 6
    //   134: aload 5
    //   136: iconst_0
    //   137: invokestatic 30	com/tencent/mm/a/o:fZ	(I)[B
    //   140: invokevirtual 24	java/io/ByteArrayOutputStream:write	([B)V
    //   143: aload 5
    //   145: astore 6
    //   147: aload 5
    //   149: aload 7
    //   151: invokevirtual 24	java/io/ByteArrayOutputStream:write	([B)V
    //   154: aload 5
    //   156: astore 6
    //   158: aload_3
    //   159: aload 5
    //   161: invokevirtual 37	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   164: putfield 72	com/tencent/mm/pointers/PByteArray:value	[B
    //   167: iload 4
    //   169: iconst_1
    //   170: if_icmpne +54 -> 224
    //   173: aload 5
    //   175: astore 6
    //   177: new 32	java/util/zip/CRC32
    //   180: astore_0
    //   181: aload 5
    //   183: astore 6
    //   185: aload_0
    //   186: invokespecial 33	java/util/zip/CRC32:<init>	()V
    //   189: aload 5
    //   191: astore 6
    //   193: aload_0
    //   194: aload_3
    //   195: getfield 72	com/tencent/mm/pointers/PByteArray:value	[B
    //   198: invokevirtual 40	java/util/zip/CRC32:update	([B)V
    //   201: aload 5
    //   203: astore 6
    //   205: aload_0
    //   206: invokevirtual 44	java/util/zip/CRC32:getValue	()J
    //   209: l2i
    //   210: invokestatic 30	com/tencent/mm/a/o:fZ	(I)[B
    //   213: iconst_0
    //   214: aload_3
    //   215: getfield 72	com/tencent/mm/pointers/PByteArray:value	[B
    //   218: bipush 16
    //   220: iconst_4
    //   221: invokestatic 78	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   224: aload 5
    //   226: invokevirtual 81	java/io/ByteArrayOutputStream:reset	()V
    //   229: aload 5
    //   231: invokevirtual 84	java/io/ByteArrayOutputStream:close	()V
    //   234: sipush 17469
    //   237: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   240: return
    //   241: aload 5
    //   243: astore 6
    //   245: aload_0
    //   246: invokestatic 89	com/tencent/mm/plugin/backup/b/d:aSy	()[B
    //   249: invokestatic 95	com/tencent/mm/a/l:d	([B[B)[B
    //   252: astore 7
    //   254: goto -142 -> 112
    //   257: astore_0
    //   258: sipush 17469
    //   261: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   264: goto -24 -> 240
    //   267: astore_3
    //   268: aconst_null
    //   269: astore_0
    //   270: aload_0
    //   271: astore 6
    //   273: ldc 49
    //   275: aload_3
    //   276: ldc 97
    //   278: iconst_0
    //   279: anewarray 4	java/lang/Object
    //   282: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   285: aload_0
    //   286: ifnull +57 -> 343
    //   289: aload_0
    //   290: invokevirtual 81	java/io/ByteArrayOutputStream:reset	()V
    //   293: aload_0
    //   294: invokevirtual 84	java/io/ByteArrayOutputStream:close	()V
    //   297: sipush 17469
    //   300: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   303: goto -63 -> 240
    //   306: astore_0
    //   307: sipush 17469
    //   310: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   313: goto -73 -> 240
    //   316: astore_0
    //   317: aconst_null
    //   318: astore 6
    //   320: aload 6
    //   322: ifnull +13 -> 335
    //   325: aload 6
    //   327: invokevirtual 81	java/io/ByteArrayOutputStream:reset	()V
    //   330: aload 6
    //   332: invokevirtual 84	java/io/ByteArrayOutputStream:close	()V
    //   335: sipush 17469
    //   338: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   341: aload_0
    //   342: athrow
    //   343: sipush 17469
    //   346: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   349: goto -109 -> 240
    //   352: astore_3
    //   353: goto -18 -> 335
    //   356: astore_0
    //   357: goto -37 -> 320
    //   360: astore_3
    //   361: aload 5
    //   363: astore_0
    //   364: goto -94 -> 270
    //
    // Exception table:
    //   from	to	target	type
    //   224	234	257	java/io/IOException
    //   6	16	267	java/io/IOException
    //   289	297	306	java/io/IOException
    //   6	16	316	finally
    //   325	335	352	java/io/IOException
    //   20	30	356	finally
    //   34	43	356	finally
    //   47	63	356	finally
    //   67	96	356	finally
    //   116	130	356	finally
    //   134	143	356	finally
    //   147	154	356	finally
    //   158	167	356	finally
    //   177	181	356	finally
    //   185	189	356	finally
    //   193	201	356	finally
    //   205	224	356	finally
    //   245	254	356	finally
    //   273	285	356	finally
    //   20	30	360	java/io/IOException
    //   34	43	360	java/io/IOException
    //   47	63	360	java/io/IOException
    //   67	96	360	java/io/IOException
    //   116	130	360	java/io/IOException
    //   134	143	360	java/io/IOException
    //   147	154	360	java/io/IOException
    //   158	167	360	java/io/IOException
    //   177	181	360	java/io/IOException
    //   185	189	360	java/io/IOException
    //   193	201	360	java/io/IOException
    //   205	224	360	java/io/IOException
    //   245	254	360	java/io/IOException
  }

  public static String ap(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17471);
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
    ab.e("MicroMsg.BackupPacker", "dumpErr errBuf:%s", new Object[] { str });
    AppMethodBeat.o(17471);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.j
 * JD-Core Version:    0.6.2
 */