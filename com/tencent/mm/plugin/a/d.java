package com.tencent.mm.plugin.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

public final class d
{
  private static final int gjS;
  private static final int gjT;
  private static final int gjU;
  private static final int gjV;
  private static final int gjW;
  private static final int gjX;
  private static final int gjY;
  private static final int gjZ;
  private static final int gka;
  private static final int gkb;
  private static final int gkc;
  private static final int gkd;
  private static final int gke;

  static
  {
    AppMethodBeat.i(117844);
    gjS = ag(new byte[] { 102, 114, 101, 101 });
    gjT = ag(new byte[] { 106, 117, 110, 107 });
    gjU = ag(new byte[] { 109, 100, 97, 116 });
    gjV = ag(new byte[] { 109, 111, 111, 118 });
    gjW = ag(new byte[] { 112, 110, 111, 116 });
    gjX = ag(new byte[] { 115, 107, 105, 112 });
    gjY = ag(new byte[] { 119, 105, 100, 101 });
    gjZ = ag(new byte[] { 80, 73, 67, 84 });
    gka = ag(new byte[] { 102, 116, 121, 112 });
    gkb = ag(new byte[] { 117, 117, 105, 100 });
    gkc = ag(new byte[] { 99, 109, 111, 118 });
    gkd = ag(new byte[] { 115, 116, 99, 111 });
    gke = ag(new byte[] { 99, 111, 54, 52 });
    AppMethodBeat.o(117844);
  }

  private static boolean a(FileChannel paramFileChannel, ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(117840);
    paramByteBuffer.clear();
    int i = paramFileChannel.read(paramByteBuffer);
    paramByteBuffer.flip();
    boolean bool;
    if (i == paramByteBuffer.capacity())
    {
      bool = true;
      AppMethodBeat.o(117840);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(117840);
    }
  }

  private static boolean a(FileChannel paramFileChannel1, FileChannel paramFileChannel2, PInt paramPInt)
  {
    AppMethodBeat.i(117843);
    int i = 0;
    long l1 = 0L;
    Object localObject1 = null;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
    long l2 = 0L;
    int j = 0;
    int k = 0;
    long l3 = -1L;
    long l4;
    int m;
    int n;
    Object localObject2;
    boolean bool;
    while (true)
      if (a(paramFileChannel1, localByteBuffer))
      {
        l4 = 0xFFFFFFFF & localByteBuffer.getInt();
        m = localByteBuffer.getInt();
        if (m == gka)
        {
          i = 1;
          j = 1;
          n = gc(l4);
          localObject1 = ByteBuffer.allocate(n).order(ByteOrder.BIG_ENDIAN);
          localByteBuffer.rewind();
          ((ByteBuffer)localObject1).put(localByteBuffer);
          localObject2 = localObject1;
          if (paramFileChannel1.read((ByteBuffer)localObject1) >= n - 8)
          {
            ((ByteBuffer)localObject1).flip();
            l2 = paramFileChannel1.position();
            i = m;
            l1 = l4;
            if (l4 >= 8L)
              continue;
            ab.w("MicroMsg.FastStart", "atom size less 8, it error mp4.");
            bool = false;
            AppMethodBeat.o(117843);
          }
        }
        else
        {
          while (true)
          {
            label176: return bool;
            if (m != gjV)
              break label270;
            l1 = paramFileChannel1.position();
            if (k != 0)
              break;
            ab.d("MicroMsg.FastStart", "it moov before mdat, needn't fast start");
            paramPInt.value = 1;
            bool = false;
            AppMethodBeat.o(117843);
          }
          ab.d("MicroMsg.FastStart", "it moov after mdat, need fast start");
          l1 -= 8L;
          k = 1;
          i = m;
        }
      }
    while (true)
    {
      if ((j == 0) || (k == 0))
      {
        ab.w("MicroMsg.FastStart", "it can not find moov or ftyp");
        bool = false;
        AppMethodBeat.o(117843);
        break label176;
        label270: if (m == gjU)
          k = 1;
        if (l4 == 1L)
        {
          localByteBuffer.clear();
          i = j;
          localObject2 = localObject1;
          if (!a(paramFileChannel1, localByteBuffer))
            break label902;
          l4 = localByteBuffer.getLong();
          if (l4 < 0L)
          {
            paramFileChannel1 = new Exception("uint64 value is too large");
            AppMethodBeat.o(117843);
            throw paramFileChannel1;
          }
          paramFileChannel1.position(paramFileChannel1.position() + l4 - 16L);
          break;
        }
        paramFileChannel1.position(paramFileChannel1.position() + l4 - 8L);
        break;
      }
      if ((i != gjV) || (l1 < 0L))
      {
        ab.w("MicroMsg.FastStart", "it can not find moov atom");
        bool = false;
        AppMethodBeat.o(117843);
        break label176;
      }
      k = gc(l4);
      paramPInt = ByteBuffer.allocate(k).order(ByteOrder.BIG_ENDIAN);
      paramPInt.clear();
      j = paramFileChannel1.read(paramPInt, l1);
      paramPInt.flip();
      if (j == paramPInt.capacity());
      for (j = 1; ; j = 0)
      {
        if (j != 0)
          break label490;
        ab.w("MicroMsg.FastStart", "failed to read moov atom");
        bool = false;
        AppMethodBeat.o(117843);
        break;
      }
      label490: if (paramPInt.getInt(12) == gkc)
      {
        ab.w("MicroMsg.FastStart", "this utility does not support compressed moov atoms yet");
        bool = false;
        AppMethodBeat.o(117843);
        break label176;
      }
      while (true)
      {
        if (paramPInt.remaining() < 8)
          break label819;
        i = paramPInt.position();
        j = paramPInt.getInt(i + 4);
        if ((j != gkd) && (j != gke))
        {
          paramPInt.position(paramPInt.position() + 1);
        }
        else
        {
          if ((paramPInt.getInt(i) & 0xFFFFFFFF) > paramPInt.remaining())
          {
            ab.w("MicroMsg.FastStart", "bad atom size");
            bool = false;
            AppMethodBeat.o(117843);
            break;
          }
          paramPInt.position(i + 12);
          if (paramPInt.remaining() < 4)
          {
            ab.w("MicroMsg.FastStart", "malformed atom");
            bool = false;
            AppMethodBeat.o(117843);
            break;
          }
          i = gc(paramPInt.getInt());
          if (j == gkd)
          {
            if (paramPInt.remaining() < i * 4)
            {
              ab.w("MicroMsg.FastStart", "bad atom size/element count");
              bool = false;
              AppMethodBeat.o(117843);
              break;
            }
            for (j = 0; ; j++)
            {
              if (j >= i)
                break label748;
              m = paramPInt.getInt(paramPInt.position());
              n = m + k;
              if ((m < 0) && (n >= 0))
              {
                bool = false;
                AppMethodBeat.o(117843);
                break;
              }
              paramPInt.putInt(n);
            }
            label748: continue;
          }
          if (j == gke)
          {
            if (paramPInt.remaining() < i * 8)
            {
              ab.w("MicroMsg.FastStart", "bad atom size/element count");
              bool = false;
              AppMethodBeat.o(117843);
              break;
            }
            for (j = 0; j < i; j++)
              paramPInt.putLong(paramPInt.getLong(paramPInt.position()) + k);
          }
        }
      }
      label819: paramFileChannel1.position(l2);
      if (localObject1 != null)
      {
        ((ByteBuffer)localObject1).rewind();
        paramFileChannel2.write((ByteBuffer)localObject1);
      }
      paramPInt.rewind();
      paramFileChannel2.write(paramPInt);
      paramFileChannel1.transferTo(l2, l1 - l2, paramFileChannel2);
      paramFileChannel1.transferTo(l1 + k, paramFileChannel1.size() - l1 - k, paramFileChannel2);
      bool = true;
      AppMethodBeat.o(117843);
      break label176;
      label902: k = 0;
      j = i;
      localObject1 = localObject2;
      i = m;
      l1 = l3;
      continue;
      k = 0;
      l4 = l1;
      l1 = l3;
    }
  }

  private static int ag(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(117838);
    int i = ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.BIG_ENDIAN).getInt();
    AppMethodBeat.o(117838);
    return i;
  }

  // ERROR //
  public static boolean b(java.lang.String paramString1, java.lang.String paramString2, PInt paramPInt)
  {
    // Byte code:
    //   0: ldc 244
    //   2: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iconst_0
    //   6: istore_3
    //   7: new 246	java/io/File
    //   10: dup
    //   11: aload_0
    //   12: invokespecial 247	java/io/File:<init>	(Ljava/lang/String;)V
    //   15: astore 4
    //   17: new 246	java/io/File
    //   20: dup
    //   21: aload_1
    //   22: invokespecial 247	java/io/File:<init>	(Ljava/lang/String;)V
    //   25: astore 5
    //   27: new 249	java/io/FileInputStream
    //   30: astore 6
    //   32: aload 6
    //   34: aload 4
    //   36: invokespecial 252	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   39: aload 6
    //   41: invokevirtual 256	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   44: astore 7
    //   46: new 258	java/io/FileOutputStream
    //   49: astore 8
    //   51: aload 8
    //   53: aload 5
    //   55: invokespecial 259	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   58: aload 8
    //   60: astore 9
    //   62: aload 6
    //   64: astore 4
    //   66: aload 7
    //   68: aload 8
    //   70: invokevirtual 260	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   73: aload_2
    //   74: invokestatic 262	com/tencent/mm/plugin/a/d:a	(Ljava/nio/channels/FileChannel;Ljava/nio/channels/FileChannel;Lcom/tencent/mm/pointers/PInt;)Z
    //   77: istore 10
    //   79: iload 10
    //   81: istore_3
    //   82: iload_3
    //   83: istore 10
    //   85: iload_3
    //   86: ifeq +18 -> 104
    //   89: aload 8
    //   91: astore 9
    //   93: aload 6
    //   95: astore 4
    //   97: aload_0
    //   98: aload_1
    //   99: invokestatic 266	com/tencent/mm/plugin/a/d:be	(Ljava/lang/String;Ljava/lang/String;)Z
    //   102: istore 10
    //   104: aload 6
    //   106: invokestatic 270	com/tencent/mm/plugin/a/d:c	(Ljava/io/Closeable;)V
    //   109: aload 8
    //   111: invokestatic 270	com/tencent/mm/plugin/a/d:c	(Ljava/io/Closeable;)V
    //   114: iload 10
    //   116: istore_3
    //   117: iload_3
    //   118: ifne +9 -> 127
    //   121: aload 5
    //   123: invokevirtual 274	java/io/File:delete	()Z
    //   126: pop
    //   127: ldc 244
    //   129: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: iload_3
    //   133: ireturn
    //   134: astore_0
    //   135: aconst_null
    //   136: astore_1
    //   137: aconst_null
    //   138: astore 6
    //   140: aload_1
    //   141: astore 9
    //   143: aload 6
    //   145: astore 4
    //   147: new 276	java/lang/StringBuilder
    //   150: astore_2
    //   151: aload_1
    //   152: astore 9
    //   154: aload 6
    //   156: astore 4
    //   158: aload_2
    //   159: ldc_w 278
    //   162: invokespecial 279	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   165: aload_1
    //   166: astore 9
    //   168: aload 6
    //   170: astore 4
    //   172: ldc 152
    //   174: aload_2
    //   175: aload_0
    //   176: invokevirtual 283	java/lang/Exception:toString	()Ljava/lang/String;
    //   179: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: invokevirtual 288	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   185: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   188: aload 6
    //   190: invokestatic 270	com/tencent/mm/plugin/a/d:c	(Ljava/io/Closeable;)V
    //   193: aload_1
    //   194: invokestatic 270	com/tencent/mm/plugin/a/d:c	(Ljava/io/Closeable;)V
    //   197: goto -80 -> 117
    //   200: astore_0
    //   201: aconst_null
    //   202: astore 9
    //   204: aconst_null
    //   205: astore 6
    //   207: aload 6
    //   209: invokestatic 270	com/tencent/mm/plugin/a/d:c	(Ljava/io/Closeable;)V
    //   212: aload 9
    //   214: invokestatic 270	com/tencent/mm/plugin/a/d:c	(Ljava/io/Closeable;)V
    //   217: ldc 244
    //   219: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   222: aload_0
    //   223: athrow
    //   224: astore_0
    //   225: aconst_null
    //   226: astore 9
    //   228: goto -21 -> 207
    //   231: astore_0
    //   232: aload 4
    //   234: astore 6
    //   236: goto -29 -> 207
    //   239: astore_0
    //   240: aconst_null
    //   241: astore_1
    //   242: goto -102 -> 140
    //   245: astore_0
    //   246: aload 8
    //   248: astore_1
    //   249: goto -109 -> 140
    //   252: astore_0
    //   253: aload 8
    //   255: astore_1
    //   256: goto -116 -> 140
    //
    // Exception table:
    //   from	to	target	type
    //   27	39	134	java/lang/Exception
    //   27	39	200	finally
    //   39	58	224	finally
    //   66	79	231	finally
    //   97	104	231	finally
    //   147	151	231	finally
    //   158	165	231	finally
    //   172	188	231	finally
    //   39	58	239	java/lang/Exception
    //   66	79	245	java/lang/Exception
    //   97	104	252	java/lang/Exception
  }

  // ERROR //
  private static boolean be(java.lang.String paramString1, java.lang.String paramString2)
  {
    // Byte code:
    //   0: ldc_w 291
    //   3: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 246	java/io/File
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 247	java/io/File:<init>	(Ljava/lang/String;)V
    //   14: astore_2
    //   15: new 246	java/io/File
    //   18: dup
    //   19: aload_1
    //   20: invokespecial 247	java/io/File:<init>	(Ljava/lang/String;)V
    //   23: astore_3
    //   24: aload_2
    //   25: invokevirtual 294	java/io/File:length	()J
    //   28: aload_3
    //   29: invokevirtual 294	java/io/File:length	()J
    //   32: lcmp
    //   33: ifeq +23 -> 56
    //   36: ldc 152
    //   38: ldc_w 296
    //   41: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   44: ldc_w 291
    //   47: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   50: iconst_0
    //   51: istore 4
    //   53: iload 4
    //   55: ireturn
    //   56: new 298	com/tencent/mm/plugin/a/b
    //   59: dup
    //   60: invokespecial 300	com/tencent/mm/plugin/a/b:<init>	()V
    //   63: aload_0
    //   64: invokevirtual 304	com/tencent/mm/plugin/a/b:vB	(Ljava/lang/String;)J
    //   67: lstore 5
    //   69: new 306	com/tencent/mm/plugin/a/f
    //   72: dup
    //   73: invokespecial 307	com/tencent/mm/plugin/a/f:<init>	()V
    //   76: astore 7
    //   78: aload 7
    //   80: aload_0
    //   81: lload 5
    //   83: invokevirtual 311	com/tencent/mm/plugin/a/f:v	(Ljava/lang/String;J)Z
    //   86: pop
    //   87: aload 7
    //   89: getfield 314	com/tencent/mm/plugin/a/f:gkm	I
    //   92: istore 8
    //   94: new 298	com/tencent/mm/plugin/a/b
    //   97: dup
    //   98: invokespecial 300	com/tencent/mm/plugin/a/b:<init>	()V
    //   101: aload_1
    //   102: invokevirtual 304	com/tencent/mm/plugin/a/b:vB	(Ljava/lang/String;)J
    //   105: lstore 5
    //   107: new 306	com/tencent/mm/plugin/a/f
    //   110: dup
    //   111: invokespecial 307	com/tencent/mm/plugin/a/f:<init>	()V
    //   114: astore 9
    //   116: aload 9
    //   118: aload_1
    //   119: lload 5
    //   121: invokevirtual 311	com/tencent/mm/plugin/a/f:v	(Ljava/lang/String;J)Z
    //   124: pop
    //   125: aload 9
    //   127: getfield 314	com/tencent/mm/plugin/a/f:gkm	I
    //   130: istore 10
    //   132: iload 10
    //   134: iload 8
    //   136: if_icmpeq +23 -> 159
    //   139: ldc 152
    //   141: ldc_w 316
    //   144: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   147: ldc_w 291
    //   150: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: iconst_0
    //   154: istore 4
    //   156: goto -103 -> 53
    //   159: ldc 152
    //   161: new 276	java/lang/StringBuilder
    //   164: dup
    //   165: ldc_w 318
    //   168: invokespecial 279	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   171: iload 8
    //   173: invokevirtual 321	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   176: ldc_w 323
    //   179: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: iload 10
    //   184: invokevirtual 321	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   187: invokevirtual 288	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   190: invokestatic 165	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: new 325	java/util/Random
    //   196: dup
    //   197: invokespecial 326	java/util/Random:<init>	()V
    //   200: iload 10
    //   202: iconst_1
    //   203: isub
    //   204: invokevirtual 329	java/util/Random:nextInt	(I)I
    //   207: iconst_1
    //   208: iadd
    //   209: istore 8
    //   211: iload 8
    //   213: iconst_1
    //   214: iadd
    //   215: iload 10
    //   217: if_icmple +96 -> 313
    //   220: new 167	com/tencent/mm/pointers/PInt
    //   223: dup
    //   224: invokespecial 330	com/tencent/mm/pointers/PInt:<init>	()V
    //   227: astore_1
    //   228: new 167	com/tencent/mm/pointers/PInt
    //   231: dup
    //   232: invokespecial 330	com/tencent/mm/pointers/PInt:<init>	()V
    //   235: astore 11
    //   237: aload 7
    //   239: iload 8
    //   241: iload 10
    //   243: aload_1
    //   244: aload 11
    //   246: invokevirtual 333	com/tencent/mm/plugin/a/f:a	(IILcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Z
    //   249: pop
    //   250: new 167	com/tencent/mm/pointers/PInt
    //   253: dup
    //   254: invokespecial 330	com/tencent/mm/pointers/PInt:<init>	()V
    //   257: astore_0
    //   258: new 167	com/tencent/mm/pointers/PInt
    //   261: dup
    //   262: invokespecial 330	com/tencent/mm/pointers/PInt:<init>	()V
    //   265: astore 7
    //   267: aload 9
    //   269: iload 8
    //   271: iload 10
    //   273: aload_0
    //   274: aload 7
    //   276: invokevirtual 333	com/tencent/mm/plugin/a/f:a	(IILcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Z
    //   279: pop
    //   280: aload 7
    //   282: getfield 170	com/tencent/mm/pointers/PInt:value	I
    //   285: aload 11
    //   287: getfield 170	com/tencent/mm/pointers/PInt:value	I
    //   290: if_icmpeq +32 -> 322
    //   293: ldc 152
    //   295: ldc_w 335
    //   298: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   301: ldc_w 291
    //   304: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   307: iconst_0
    //   308: istore 4
    //   310: goto -257 -> 53
    //   313: iload 8
    //   315: iconst_1
    //   316: iadd
    //   317: istore 10
    //   319: goto -99 -> 220
    //   322: new 249	java/io/FileInputStream
    //   325: astore 9
    //   327: aload 9
    //   329: aload_2
    //   330: invokespecial 252	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   333: aload 9
    //   335: aload_1
    //   336: getfield 170	com/tencent/mm/pointers/PInt:value	I
    //   339: i2l
    //   340: invokevirtual 339	java/io/FileInputStream:skip	(J)J
    //   343: pop2
    //   344: sipush 4096
    //   347: newarray byte
    //   349: astore_2
    //   350: aload 9
    //   352: aload_2
    //   353: invokevirtual 341	java/io/FileInputStream:read	([B)I
    //   356: pop
    //   357: new 249	java/io/FileInputStream
    //   360: astore_1
    //   361: aload_1
    //   362: aload_3
    //   363: invokespecial 252	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   366: aload_1
    //   367: aload_0
    //   368: getfield 170	com/tencent/mm/pointers/PInt:value	I
    //   371: i2l
    //   372: invokevirtual 339	java/io/FileInputStream:skip	(J)J
    //   375: pop2
    //   376: sipush 4096
    //   379: newarray byte
    //   381: astore_0
    //   382: aload 9
    //   384: aload_0
    //   385: invokevirtual 341	java/io/FileInputStream:read	([B)I
    //   388: pop
    //   389: aload_2
    //   390: aload_0
    //   391: invokestatic 347	java/util/Arrays:equals	([B[B)Z
    //   394: ifeq +32 -> 426
    //   397: ldc 152
    //   399: ldc_w 349
    //   402: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   405: aload 9
    //   407: invokevirtual 352	java/io/FileInputStream:close	()V
    //   410: aload_1
    //   411: invokevirtual 352	java/io/FileInputStream:close	()V
    //   414: ldc_w 291
    //   417: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   420: iconst_0
    //   421: istore 4
    //   423: goto -370 -> 53
    //   426: aload 9
    //   428: invokevirtual 352	java/io/FileInputStream:close	()V
    //   431: aload_1
    //   432: invokevirtual 352	java/io/FileInputStream:close	()V
    //   435: iconst_1
    //   436: istore 4
    //   438: ldc_w 291
    //   441: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   444: goto -391 -> 53
    //   447: astore_1
    //   448: aconst_null
    //   449: astore_0
    //   450: aconst_null
    //   451: astore 9
    //   453: new 276	java/lang/StringBuilder
    //   456: astore_3
    //   457: aload_3
    //   458: ldc_w 278
    //   461: invokespecial 279	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   464: ldc 152
    //   466: aload_3
    //   467: aload_1
    //   468: invokevirtual 283	java/lang/Exception:toString	()Ljava/lang/String;
    //   471: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   474: invokevirtual 288	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   477: invokestatic 160	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   480: aload 9
    //   482: ifnull +8 -> 490
    //   485: aload 9
    //   487: invokevirtual 352	java/io/FileInputStream:close	()V
    //   490: aload_0
    //   491: ifnull -56 -> 435
    //   494: aload_0
    //   495: invokevirtual 352	java/io/FileInputStream:close	()V
    //   498: goto -63 -> 435
    //   501: astore_0
    //   502: goto -67 -> 435
    //   505: astore_0
    //   506: aconst_null
    //   507: astore_1
    //   508: aconst_null
    //   509: astore 9
    //   511: aload 9
    //   513: ifnull +8 -> 521
    //   516: aload 9
    //   518: invokevirtual 352	java/io/FileInputStream:close	()V
    //   521: aload_1
    //   522: ifnull +7 -> 529
    //   525: aload_1
    //   526: invokevirtual 352	java/io/FileInputStream:close	()V
    //   529: ldc_w 291
    //   532: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   535: aload_0
    //   536: athrow
    //   537: astore_0
    //   538: goto -128 -> 410
    //   541: astore_0
    //   542: goto -128 -> 414
    //   545: astore_0
    //   546: goto -115 -> 431
    //   549: astore_0
    //   550: goto -115 -> 435
    //   553: astore_1
    //   554: goto -64 -> 490
    //   557: astore 9
    //   559: goto -38 -> 521
    //   562: astore_1
    //   563: goto -34 -> 529
    //   566: astore_0
    //   567: aconst_null
    //   568: astore_1
    //   569: goto -58 -> 511
    //   572: astore_0
    //   573: goto -62 -> 511
    //   576: astore_1
    //   577: aload_0
    //   578: astore_3
    //   579: aload_1
    //   580: astore_0
    //   581: aload_3
    //   582: astore_1
    //   583: goto -72 -> 511
    //   586: astore_1
    //   587: aconst_null
    //   588: astore_0
    //   589: goto -136 -> 453
    //   592: astore_3
    //   593: aload_1
    //   594: astore_0
    //   595: aload_3
    //   596: astore_1
    //   597: goto -144 -> 453
    //
    // Exception table:
    //   from	to	target	type
    //   322	333	447	java/lang/Exception
    //   494	498	501	java/io/IOException
    //   322	333	505	finally
    //   405	410	537	java/io/IOException
    //   410	414	541	java/io/IOException
    //   426	431	545	java/io/IOException
    //   431	435	549	java/io/IOException
    //   485	490	553	java/io/IOException
    //   516	521	557	java/io/IOException
    //   525	529	562	java/io/IOException
    //   333	366	566	finally
    //   366	405	572	finally
    //   453	480	576	finally
    //   333	366	586	java/lang/Exception
    //   366	405	592	java/lang/Exception
  }

  private static void c(Closeable paramCloseable)
  {
    AppMethodBeat.i(117841);
    if (paramCloseable != null);
    while (true)
    {
      try
      {
        paramCloseable.close();
        AppMethodBeat.o(117841);
        return;
      }
      catch (IOException paramCloseable)
      {
        ab.w("MicroMsg.FastStart", "Failed to close file: ");
      }
      AppMethodBeat.o(117841);
    }
  }

  private static int gc(long paramLong)
  {
    AppMethodBeat.i(117839);
    if ((paramLong > 2147483647L) || (paramLong < 0L))
    {
      Exception localException = new Exception("uint32 value is too large");
      AppMethodBeat.o(117839);
      throw localException;
    }
    int i = (int)paramLong;
    AppMethodBeat.o(117839);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.a.d
 * JD-Core Version:    0.6.2
 */