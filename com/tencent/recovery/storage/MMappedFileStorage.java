package com.tencent.recovery.storage;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;

public class MMappedFileStorage
{
  private int Arv;
  private File Arw;
  private File Arx;
  private MappedByteBuffer Ary;
  private RandomAccessFile Arz;
  private int currentIndex;

  // ERROR //
  private static void h(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: new 22	java/io/DataInputStream
    //   3: astore_2
    //   4: new 24	java/io/FileInputStream
    //   7: astore_3
    //   8: aload_3
    //   9: aload_0
    //   10: invokespecial 28	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   13: aload_2
    //   14: aload_3
    //   15: invokespecial 31	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   18: aload_2
    //   19: invokevirtual 35	java/io/DataInputStream:readInt	()I
    //   22: istore 4
    //   24: new 37	java/io/FileOutputStream
    //   27: astore_0
    //   28: aload_0
    //   29: aload_1
    //   30: iconst_1
    //   31: invokespecial 40	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   34: aload_0
    //   35: astore_3
    //   36: aload_2
    //   37: astore_1
    //   38: sipush 1024
    //   41: newarray byte
    //   43: astore 5
    //   45: iconst_0
    //   46: istore 6
    //   48: iload 6
    //   50: sipush 1024
    //   53: iadd
    //   54: iload 4
    //   56: if_icmple +58 -> 114
    //   59: iload 4
    //   61: iload 6
    //   63: isub
    //   64: istore 7
    //   66: iload 7
    //   68: ifle +54 -> 122
    //   71: aload_0
    //   72: astore_3
    //   73: aload_2
    //   74: astore_1
    //   75: aload_2
    //   76: aload 5
    //   78: iconst_0
    //   79: iload 7
    //   81: invokevirtual 44	java/io/DataInputStream:read	([BII)I
    //   84: istore 7
    //   86: iload 7
    //   88: ifle +34 -> 122
    //   91: aload_0
    //   92: astore_3
    //   93: aload_2
    //   94: astore_1
    //   95: aload_0
    //   96: aload 5
    //   98: iconst_0
    //   99: iload 7
    //   101: invokevirtual 48	java/io/FileOutputStream:write	([BII)V
    //   104: iload 7
    //   106: iload 6
    //   108: iadd
    //   109: istore 6
    //   111: goto -63 -> 48
    //   114: sipush 1024
    //   117: istore 7
    //   119: goto -53 -> 66
    //   122: aload_2
    //   123: invokevirtual 52	java/io/DataInputStream:close	()V
    //   126: aload_0
    //   127: invokevirtual 53	java/io/FileOutputStream:close	()V
    //   130: return
    //   131: astore 5
    //   133: aconst_null
    //   134: astore_0
    //   135: aconst_null
    //   136: astore_2
    //   137: aload_0
    //   138: astore_3
    //   139: aload_2
    //   140: astore_1
    //   141: ldc 55
    //   143: aload 5
    //   145: ldc 57
    //   147: iconst_0
    //   148: anewarray 4	java/lang/Object
    //   151: invokestatic 63	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   154: aload_2
    //   155: ifnull +7 -> 162
    //   158: aload_2
    //   159: invokevirtual 52	java/io/DataInputStream:close	()V
    //   162: aload_0
    //   163: ifnull -33 -> 130
    //   166: aload_0
    //   167: invokevirtual 53	java/io/FileOutputStream:close	()V
    //   170: goto -40 -> 130
    //   173: astore_0
    //   174: goto -44 -> 130
    //   177: astore_0
    //   178: aconst_null
    //   179: astore_3
    //   180: aconst_null
    //   181: astore_1
    //   182: aload_1
    //   183: ifnull +7 -> 190
    //   186: aload_1
    //   187: invokevirtual 52	java/io/DataInputStream:close	()V
    //   190: aload_3
    //   191: ifnull +7 -> 198
    //   194: aload_3
    //   195: invokevirtual 53	java/io/FileOutputStream:close	()V
    //   198: aload_0
    //   199: athrow
    //   200: astore_1
    //   201: goto -75 -> 126
    //   204: astore_0
    //   205: goto -75 -> 130
    //   208: astore_1
    //   209: goto -47 -> 162
    //   212: astore_1
    //   213: goto -23 -> 190
    //   216: astore_1
    //   217: goto -19 -> 198
    //   220: astore_0
    //   221: aconst_null
    //   222: astore_3
    //   223: aload_2
    //   224: astore_1
    //   225: goto -43 -> 182
    //   228: astore_0
    //   229: goto -47 -> 182
    //   232: astore 5
    //   234: aconst_null
    //   235: astore_0
    //   236: goto -99 -> 137
    //   239: astore 5
    //   241: goto -104 -> 137
    //
    // Exception table:
    //   from	to	target	type
    //   0	18	131	java/lang/Exception
    //   166	170	173	java/io/IOException
    //   0	18	177	finally
    //   122	126	200	java/io/IOException
    //   126	130	204	java/io/IOException
    //   158	162	208	java/io/IOException
    //   186	190	212	java/io/IOException
    //   194	198	216	java/io/IOException
    //   18	34	220	finally
    //   38	45	228	finally
    //   75	86	228	finally
    //   95	104	228	finally
    //   141	154	228	finally
    //   18	34	232	java/lang/Exception
    //   38	45	239	java/lang/Exception
    //   75	86	239	java/lang/Exception
    //   95	104	239	java/lang/Exception
  }

  // ERROR //
  public final void e(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 68	com/tencent/recovery/storage/MMappedFileStorage:Arz	Ljava/io/RandomAccessFile;
    //   6: ifnonnull +40 -> 46
    //   9: aload_0
    //   10: getfield 70	com/tencent/recovery/storage/MMappedFileStorage:Arx	Ljava/io/File;
    //   13: invokevirtual 76	java/io/File:exists	()Z
    //   16: ifne +11 -> 27
    //   19: aload_0
    //   20: getfield 70	com/tencent/recovery/storage/MMappedFileStorage:Arx	Ljava/io/File;
    //   23: invokevirtual 79	java/io/File:createNewFile	()Z
    //   26: pop
    //   27: new 81	java/io/RandomAccessFile
    //   30: astore_3
    //   31: aload_3
    //   32: aload_0
    //   33: getfield 70	com/tencent/recovery/storage/MMappedFileStorage:Arx	Ljava/io/File;
    //   36: ldc 83
    //   38: invokespecial 86	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   41: aload_0
    //   42: aload_3
    //   43: putfield 68	com/tencent/recovery/storage/MMappedFileStorage:Arz	Ljava/io/RandomAccessFile;
    //   46: aload_0
    //   47: getfield 88	com/tencent/recovery/storage/MMappedFileStorage:Ary	Ljava/nio/MappedByteBuffer;
    //   50: ifnonnull +26 -> 76
    //   53: aload_0
    //   54: aload_0
    //   55: getfield 68	com/tencent/recovery/storage/MMappedFileStorage:Arz	Ljava/io/RandomAccessFile;
    //   58: invokevirtual 92	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   61: getstatic 98	java/nio/channels/FileChannel$MapMode:READ_WRITE	Ljava/nio/channels/FileChannel$MapMode;
    //   64: lconst_0
    //   65: aload_0
    //   66: getfield 100	com/tencent/recovery/storage/MMappedFileStorage:Arv	I
    //   69: i2l
    //   70: invokevirtual 106	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   73: putfield 88	com/tencent/recovery/storage/MMappedFileStorage:Ary	Ljava/nio/MappedByteBuffer;
    //   76: aload_0
    //   77: getfield 70	com/tencent/recovery/storage/MMappedFileStorage:Arx	Ljava/io/File;
    //   80: ifnull +12 -> 92
    //   83: aload_0
    //   84: getfield 88	com/tencent/recovery/storage/MMappedFileStorage:Ary	Ljava/nio/MappedByteBuffer;
    //   87: astore_3
    //   88: aload_3
    //   89: ifnonnull +6 -> 95
    //   92: aload_0
    //   93: monitorexit
    //   94: return
    //   95: aload_0
    //   96: getfield 108	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   99: aload_1
    //   100: arraylength
    //   101: iadd
    //   102: aload_0
    //   103: getfield 100	com/tencent/recovery/storage/MMappedFileStorage:Arv	I
    //   106: if_icmpgt +7 -> 113
    //   109: iload_2
    //   110: ifeq +106 -> 216
    //   113: aload_0
    //   114: getfield 88	com/tencent/recovery/storage/MMappedFileStorage:Ary	Ljava/nio/MappedByteBuffer;
    //   117: invokevirtual 114	java/nio/MappedByteBuffer:force	()Ljava/nio/MappedByteBuffer;
    //   120: pop
    //   121: aload_0
    //   122: getfield 68	com/tencent/recovery/storage/MMappedFileStorage:Arz	Ljava/io/RandomAccessFile;
    //   125: invokevirtual 115	java/io/RandomAccessFile:close	()V
    //   128: aload_0
    //   129: getfield 70	com/tencent/recovery/storage/MMappedFileStorage:Arx	Ljava/io/File;
    //   132: aload_0
    //   133: getfield 117	com/tencent/recovery/storage/MMappedFileStorage:Arw	Ljava/io/File;
    //   136: invokestatic 119	com/tencent/recovery/storage/MMappedFileStorage:h	(Ljava/io/File;Ljava/io/File;)V
    //   139: aload_0
    //   140: iconst_4
    //   141: putfield 108	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   144: aload_0
    //   145: getfield 70	com/tencent/recovery/storage/MMappedFileStorage:Arx	Ljava/io/File;
    //   148: invokevirtual 122	java/io/File:delete	()Z
    //   151: pop
    //   152: aload_0
    //   153: getfield 70	com/tencent/recovery/storage/MMappedFileStorage:Arx	Ljava/io/File;
    //   156: invokevirtual 79	java/io/File:createNewFile	()Z
    //   159: pop
    //   160: new 81	java/io/RandomAccessFile
    //   163: astore_3
    //   164: aload_3
    //   165: aload_0
    //   166: getfield 70	com/tencent/recovery/storage/MMappedFileStorage:Arx	Ljava/io/File;
    //   169: ldc 83
    //   171: invokespecial 86	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   174: aload_0
    //   175: aload_3
    //   176: putfield 68	com/tencent/recovery/storage/MMappedFileStorage:Arz	Ljava/io/RandomAccessFile;
    //   179: aload_0
    //   180: aload_0
    //   181: getfield 68	com/tencent/recovery/storage/MMappedFileStorage:Arz	Ljava/io/RandomAccessFile;
    //   184: invokevirtual 92	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   187: getstatic 98	java/nio/channels/FileChannel$MapMode:READ_WRITE	Ljava/nio/channels/FileChannel$MapMode;
    //   190: lconst_0
    //   191: aload_0
    //   192: getfield 100	com/tencent/recovery/storage/MMappedFileStorage:Arv	I
    //   195: i2l
    //   196: invokevirtual 106	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   199: putfield 88	com/tencent/recovery/storage/MMappedFileStorage:Ary	Ljava/nio/MappedByteBuffer;
    //   202: aload_0
    //   203: getfield 88	com/tencent/recovery/storage/MMappedFileStorage:Ary	Ljava/nio/MappedByteBuffer;
    //   206: aload_0
    //   207: getfield 108	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   210: iconst_4
    //   211: isub
    //   212: invokevirtual 126	java/nio/MappedByteBuffer:putInt	(I)Ljava/nio/ByteBuffer;
    //   215: pop
    //   216: aload_1
    //   217: arraylength
    //   218: iflt -126 -> 92
    //   221: aload_0
    //   222: getfield 88	com/tencent/recovery/storage/MMappedFileStorage:Ary	Ljava/nio/MappedByteBuffer;
    //   225: aload_0
    //   226: getfield 108	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   229: invokevirtual 130	java/nio/MappedByteBuffer:position	(I)Ljava/nio/Buffer;
    //   232: pop
    //   233: aload_0
    //   234: getfield 88	com/tencent/recovery/storage/MMappedFileStorage:Ary	Ljava/nio/MappedByteBuffer;
    //   237: aload_1
    //   238: invokevirtual 134	java/nio/MappedByteBuffer:put	([B)Ljava/nio/ByteBuffer;
    //   241: pop
    //   242: aload_0
    //   243: getfield 88	com/tencent/recovery/storage/MMappedFileStorage:Ary	Ljava/nio/MappedByteBuffer;
    //   246: iconst_0
    //   247: invokevirtual 130	java/nio/MappedByteBuffer:position	(I)Ljava/nio/Buffer;
    //   250: pop
    //   251: aload_0
    //   252: aload_0
    //   253: getfield 108	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   256: aload_1
    //   257: arraylength
    //   258: iadd
    //   259: putfield 108	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   262: aload_0
    //   263: getfield 88	com/tencent/recovery/storage/MMappedFileStorage:Ary	Ljava/nio/MappedByteBuffer;
    //   266: aload_0
    //   267: getfield 108	com/tencent/recovery/storage/MMappedFileStorage:currentIndex	I
    //   270: iconst_4
    //   271: isub
    //   272: invokevirtual 126	java/nio/MappedByteBuffer:putInt	(I)Ljava/nio/ByteBuffer;
    //   275: pop
    //   276: goto -184 -> 92
    //   279: astore_1
    //   280: ldc 55
    //   282: aload_1
    //   283: ldc 136
    //   285: iconst_0
    //   286: anewarray 4	java/lang/Object
    //   289: invokestatic 63	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   292: goto -200 -> 92
    //   295: astore_1
    //   296: aload_0
    //   297: monitorexit
    //   298: aload_1
    //   299: athrow
    //   300: astore_3
    //   301: goto -173 -> 128
    //
    // Exception table:
    //   from	to	target	type
    //   2	27	279	java/lang/Exception
    //   27	46	279	java/lang/Exception
    //   46	76	279	java/lang/Exception
    //   76	88	279	java/lang/Exception
    //   95	109	279	java/lang/Exception
    //   113	121	279	java/lang/Exception
    //   121	128	279	java/lang/Exception
    //   128	216	279	java/lang/Exception
    //   216	276	279	java/lang/Exception
    //   2	27	295	finally
    //   27	46	295	finally
    //   46	76	295	finally
    //   76	88	295	finally
    //   95	109	295	finally
    //   113	121	295	finally
    //   121	128	295	finally
    //   128	216	295	finally
    //   216	276	295	finally
    //   280	292	295	finally
    //   121	128	300	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.storage.MMappedFileStorage
 * JD-Core Version:    0.6.2
 */