package com.tencent.matrix.resource.c;

import com.tencent.matrix.resource.c.a.c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  final Set<com.tencent.matrix.resource.c.a.b> bWY = new HashSet();
  final Map<com.tencent.matrix.resource.c.a.b, byte[]> bWZ = new HashMap();
  final Map<com.tencent.matrix.resource.c.a.b, com.tencent.matrix.resource.c.a.b> bXa = new HashMap();
  final Set<com.tencent.matrix.resource.c.a.b> bXb = new HashSet();
  com.tencent.matrix.resource.c.a.b bXc = null;
  com.tencent.matrix.resource.c.a.b bXd = null;
  com.tencent.matrix.resource.c.a.b bXe = null;
  com.tencent.matrix.resource.c.a.b bXf = null;
  com.tencent.matrix.resource.c.a.b bXg = null;
  com.tencent.matrix.resource.c.a.b bXh = null;
  com.tencent.matrix.resource.c.a.b bXi = null;
  int bXj = 0;
  com.tencent.matrix.resource.c.a.b bXk = null;
  com.tencent.matrix.resource.c.a.a[] bXl = null;
  com.tencent.matrix.resource.c.a.a[] bXm = null;

  // ERROR //
  public static boolean a(java.io.File paramFile, java.util.Properties paramProperties)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 94	java/io/File:exists	()Z
    //   4: ifne +7 -> 11
    //   7: iconst_0
    //   8: istore_2
    //   9: iload_2
    //   10: ireturn
    //   11: aload_1
    //   12: invokevirtual 99	java/util/Properties:isEmpty	()Z
    //   15: ifeq +8 -> 23
    //   18: iconst_1
    //   19: istore_2
    //   20: goto -11 -> 9
    //   23: invokestatic 105	java/lang/System:currentTimeMillis	()J
    //   26: lstore_3
    //   27: new 90	java/io/File
    //   30: dup
    //   31: aload_0
    //   32: invokevirtual 109	java/io/File:getParentFile	()Ljava/io/File;
    //   35: ldc 111
    //   37: invokespecial 114	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   40: astore 5
    //   42: new 90	java/io/File
    //   45: dup
    //   46: new 116	java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial 117	java/lang/StringBuilder:<init>	()V
    //   53: aload_0
    //   54: invokevirtual 121	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   57: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: ldc 127
    //   62: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   68: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   71: astore 6
    //   73: new 135	java/io/BufferedOutputStream
    //   76: astore 7
    //   78: new 137	java/io/FileOutputStream
    //   81: astore 8
    //   83: aload 8
    //   85: aload 5
    //   87: iconst_0
    //   88: invokespecial 140	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   91: aload 7
    //   93: aload 8
    //   95: invokespecial 143	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   98: aload_1
    //   99: aload 7
    //   101: aconst_null
    //   102: invokevirtual 147	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   105: aload 7
    //   107: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   110: new 155	com/tencent/tinker/d/a/h
    //   113: astore 7
    //   115: new 135	java/io/BufferedOutputStream
    //   118: astore_1
    //   119: new 137	java/io/FileOutputStream
    //   122: astore 8
    //   124: aload 8
    //   126: aload 6
    //   128: invokespecial 158	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   131: aload_1
    //   132: aload 8
    //   134: invokespecial 143	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   137: aload 7
    //   139: aload_1
    //   140: invokespecial 159	com/tencent/tinker/d/a/h:<init>	(Ljava/io/OutputStream;)V
    //   143: new 161	com/tencent/tinker/d/a/g
    //   146: astore_1
    //   147: aload_1
    //   148: aload_0
    //   149: invokespecial 162	com/tencent/tinker/d/a/g:<init>	(Ljava/io/File;)V
    //   152: aload_1
    //   153: invokevirtual 166	com/tencent/tinker/d/a/g:entries	()Ljava/util/Enumeration;
    //   156: astore 9
    //   158: aload 9
    //   160: invokeinterface 171 1 0
    //   165: ifeq +158 -> 323
    //   168: aload 9
    //   170: invokeinterface 175 1 0
    //   175: checkcast 177	com/tencent/tinker/d/a/f
    //   178: astore 8
    //   180: aload 8
    //   182: ifnonnull +99 -> 281
    //   185: new 179	java/lang/RuntimeException
    //   188: astore_0
    //   189: aload_0
    //   190: ldc 181
    //   192: invokespecial 182	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   195: aload_0
    //   196: athrow
    //   197: astore 6
    //   199: aload_1
    //   200: astore_0
    //   201: aload 6
    //   203: astore_1
    //   204: ldc 184
    //   206: ldc 186
    //   208: aload_1
    //   209: invokestatic 192	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   212: invokevirtual 196	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   215: iconst_0
    //   216: anewarray 4	java/lang/Object
    //   219: invokestatic 202	com/tencent/matrix/d/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   222: aload_0
    //   223: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   226: aload 7
    //   228: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   231: aload 5
    //   233: invokevirtual 205	java/io/File:delete	()Z
    //   236: pop
    //   237: iconst_0
    //   238: istore_2
    //   239: goto -230 -> 9
    //   242: astore_1
    //   243: aconst_null
    //   244: astore_0
    //   245: ldc 184
    //   247: ldc 207
    //   249: aload_1
    //   250: invokestatic 192	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   253: invokevirtual 196	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   256: iconst_0
    //   257: anewarray 4	java/lang/Object
    //   260: invokestatic 202	com/tencent/matrix/d/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   263: aload_0
    //   264: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   267: iconst_0
    //   268: istore_2
    //   269: goto -260 -> 9
    //   272: astore_1
    //   273: aconst_null
    //   274: astore_0
    //   275: aload_0
    //   276: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   279: aload_1
    //   280: athrow
    //   281: aload 8
    //   283: getfield 211	com/tencent/tinker/d/a/f:name	Ljava/lang/String;
    //   286: ldc 213
    //   288: invokevirtual 217	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   291: ifne -133 -> 158
    //   294: aload_1
    //   295: aload 8
    //   297: aload 7
    //   299: invokestatic 222	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/g;Lcom/tencent/tinker/d/a/f;Lcom/tencent/tinker/d/a/h;)V
    //   302: goto -144 -> 158
    //   305: astore_0
    //   306: aload_1
    //   307: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   310: aload 7
    //   312: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   315: aload 5
    //   317: invokevirtual 205	java/io/File:delete	()Z
    //   320: pop
    //   321: aload_0
    //   322: athrow
    //   323: aload 5
    //   325: invokestatic 226	com/tencent/matrix/resource/c/a:r	(Ljava/io/File;)Ljava/lang/Long;
    //   328: astore 9
    //   330: aload 9
    //   332: ifnonnull +34 -> 366
    //   335: ldc 184
    //   337: ldc 228
    //   339: iconst_0
    //   340: anewarray 4	java/lang/Object
    //   343: invokestatic 202	com/tencent/matrix/d/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   346: aload_1
    //   347: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   350: aload 7
    //   352: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   355: aload 5
    //   357: invokevirtual 205	java/io/File:delete	()Z
    //   360: pop
    //   361: iconst_0
    //   362: istore_2
    //   363: goto -354 -> 9
    //   366: new 177	com/tencent/tinker/d/a/f
    //   369: astore 8
    //   371: aload 8
    //   373: aload 5
    //   375: invokevirtual 231	java/io/File:getName	()Ljava/lang/String;
    //   378: invokespecial 232	com/tencent/tinker/d/a/f:<init>	(Ljava/lang/String;)V
    //   381: aload 8
    //   383: aload 5
    //   385: aload 9
    //   387: invokevirtual 237	java/lang/Long:longValue	()J
    //   390: aload 7
    //   392: invokestatic 240	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/f;Ljava/io/File;JLcom/tencent/tinker/d/a/h;)V
    //   395: aload_1
    //   396: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   399: aload 7
    //   401: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   404: aload 5
    //   406: invokevirtual 205	java/io/File:delete	()Z
    //   409: pop
    //   410: aload_0
    //   411: invokevirtual 205	java/io/File:delete	()Z
    //   414: pop
    //   415: aload 6
    //   417: aload_0
    //   418: invokevirtual 244	java/io/File:renameTo	(Ljava/io/File;)Z
    //   421: ifne +19 -> 440
    //   424: ldc 184
    //   426: ldc 246
    //   428: iconst_0
    //   429: anewarray 4	java/lang/Object
    //   432: invokestatic 202	com/tencent/matrix/d/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   435: iconst_0
    //   436: istore_2
    //   437: goto -428 -> 9
    //   440: ldc 184
    //   442: ldc 248
    //   444: iconst_2
    //   445: anewarray 4	java/lang/Object
    //   448: dup
    //   449: iconst_0
    //   450: aload_0
    //   451: invokevirtual 121	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   454: aastore
    //   455: dup
    //   456: iconst_1
    //   457: invokestatic 105	java/lang/System:currentTimeMillis	()J
    //   460: lload_3
    //   461: lsub
    //   462: invokestatic 251	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   465: aastore
    //   466: invokestatic 254	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   469: iconst_1
    //   470: istore_2
    //   471: goto -462 -> 9
    //   474: astore_0
    //   475: aconst_null
    //   476: astore_1
    //   477: aconst_null
    //   478: astore 7
    //   480: goto -174 -> 306
    //   483: astore_0
    //   484: aconst_null
    //   485: astore_1
    //   486: goto -180 -> 306
    //   489: astore 6
    //   491: aload_0
    //   492: astore_1
    //   493: aload 6
    //   495: astore_0
    //   496: goto -190 -> 306
    //   499: astore_1
    //   500: aconst_null
    //   501: astore_0
    //   502: aconst_null
    //   503: astore 7
    //   505: goto -301 -> 204
    //   508: astore_1
    //   509: aconst_null
    //   510: astore_0
    //   511: goto -307 -> 204
    //   514: astore_1
    //   515: aload 7
    //   517: astore_0
    //   518: goto -243 -> 275
    //   521: astore_1
    //   522: goto -247 -> 275
    //   525: astore_1
    //   526: aload 7
    //   528: astore_0
    //   529: goto -284 -> 245
    //
    // Exception table:
    //   from	to	target	type
    //   152	158	197	java/io/IOException
    //   158	180	197	java/io/IOException
    //   185	197	197	java/io/IOException
    //   281	302	197	java/io/IOException
    //   323	330	197	java/io/IOException
    //   335	346	197	java/io/IOException
    //   366	395	197	java/io/IOException
    //   73	98	242	java/lang/Throwable
    //   73	98	272	finally
    //   152	158	305	finally
    //   158	180	305	finally
    //   185	197	305	finally
    //   281	302	305	finally
    //   323	330	305	finally
    //   335	346	305	finally
    //   366	395	305	finally
    //   110	143	474	finally
    //   143	152	483	finally
    //   204	222	489	finally
    //   110	143	499	java/io/IOException
    //   143	152	508	java/io/IOException
    //   98	105	514	finally
    //   245	263	521	finally
    //   98	105	525	java/lang/Throwable
  }

  // ERROR //
  private static java.lang.Long r(java.io.File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 256	java/util/zip/CRC32
    //   5: dup
    //   6: invokespecial 257	java/util/zip/CRC32:<init>	()V
    //   9: astore_2
    //   10: new 259	java/io/FileInputStream
    //   13: astore_3
    //   14: aload_3
    //   15: aload_0
    //   16: invokespecial 260	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   19: sipush 8192
    //   22: newarray byte
    //   24: astore_0
    //   25: aload_3
    //   26: aload_0
    //   27: invokevirtual 264	java/io/FileInputStream:read	([B)I
    //   30: istore 4
    //   32: iload 4
    //   34: iconst_m1
    //   35: if_icmpeq +23 -> 58
    //   38: aload_2
    //   39: aload_0
    //   40: iconst_0
    //   41: iload 4
    //   43: invokevirtual 268	java/util/zip/CRC32:update	([BII)V
    //   46: goto -21 -> 25
    //   49: astore_0
    //   50: aload_3
    //   51: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   54: aload_1
    //   55: astore_0
    //   56: aload_0
    //   57: areturn
    //   58: aload_2
    //   59: invokevirtual 271	java/util/zip/CRC32:getValue	()J
    //   62: lstore 5
    //   64: lload 5
    //   66: invokestatic 251	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   69: astore_0
    //   70: aload_3
    //   71: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   74: goto -18 -> 56
    //   77: astore_0
    //   78: aconst_null
    //   79: astore_3
    //   80: aload_3
    //   81: invokestatic 153	com/tencent/matrix/d/d:closeQuietly	(Ljava/io/Closeable;)V
    //   84: aload_0
    //   85: athrow
    //   86: astore_0
    //   87: goto -7 -> 80
    //   90: astore_0
    //   91: aconst_null
    //   92: astore_3
    //   93: goto -43 -> 50
    //
    // Exception table:
    //   from	to	target	type
    //   19	25	49	java/io/IOException
    //   25	32	49	java/io/IOException
    //   38	46	49	java/io/IOException
    //   58	64	49	java/io/IOException
    //   10	19	77	finally
    //   19	25	86	finally
    //   25	32	86	finally
    //   38	46	86	finally
    //   58	64	86	finally
    //   10	19	90	java/io/IOException
  }

  public final class a extends d
  {
    public a(e arg2)
    {
      super();
    }

    public final b a(int paramInt1, int paramInt2, long paramLong)
    {
      return new b(super.a(paramInt1, paramInt2, paramLong))
      {
        public final void a(int paramAnonymousInt1, com.tencent.matrix.resource.c.a.b paramAnonymousb, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, byte[] paramAnonymousArrayOfByte)
        {
          com.tencent.matrix.resource.c.a.b localb = (com.tencent.matrix.resource.c.a.b)a.this.bXa.get(paramAnonymousb);
          if (((localb == null) || (!paramAnonymousb.equals(localb))) && (!a.this.bXb.contains(paramAnonymousb)));
          while (true)
          {
            return;
            super.a(paramAnonymousInt1, paramAnonymousb, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousArrayOfByte);
          }
        }

        public final void a(com.tencent.matrix.resource.c.a.b paramAnonymousb1, int paramAnonymousInt, com.tencent.matrix.resource.c.a.b paramAnonymousb2, byte[] paramAnonymousArrayOfByte)
        {
          ByteArrayInputStream localByteArrayInputStream;
          int j;
          int k;
          com.tencent.matrix.resource.c.a.b localb;
          c localc;
          try
          {
            if (!paramAnonymousb2.equals(a.this.bXd))
              break label256;
            localByteArrayInputStream = new java/io/ByteArrayInputStream;
            localByteArrayInputStream.<init>(paramAnonymousArrayOfByte);
            com.tencent.matrix.resource.c.a.a[] arrayOfa = a.this.bXl;
            int i = arrayOfa.length;
            j = 0;
            k = 0;
            if (j >= i)
              break label298;
            localObject = arrayOfa[j];
            localb = ((com.tencent.matrix.resource.c.a.a)localObject).bXA;
            localc = c.fW(((com.tencent.matrix.resource.c.a.a)localObject).bXz);
            if (localc == null)
            {
              paramAnonymousb1 = new java/lang/IllegalStateException;
              paramAnonymousb2 = new java/lang/StringBuilder;
              paramAnonymousb2.<init>("visit instance failed, lost type def of typeId: ");
              paramAnonymousb1.<init>(((com.tencent.matrix.resource.c.a.a)localObject).bXz);
              throw paramAnonymousb1;
            }
          }
          catch (Throwable paramAnonymousb1)
          {
            throw new RuntimeException(paramAnonymousb1);
          }
          if (a.this.bXe.equals(localb));
          label256: label298: for (Object localObject = (com.tencent.matrix.resource.c.a.b)com.tencent.matrix.resource.c.b.a.a(localByteArrayInputStream, localc, a.this.bXj); ; localObject = null)
          {
            if (localObject != null)
            {
              localb = (com.tencent.matrix.resource.c.a.b)a.this.bXa.get(localObject);
              if ((localb != null) && (!((com.tencent.matrix.resource.c.a.b)localObject).equals(localb)) && (!((com.tencent.matrix.resource.c.a.b)localObject).equals(a.this.bXk)))
              {
                localObject = ByteBuffer.wrap(paramAnonymousArrayOfByte);
                ((ByteBuffer)localObject).position(k);
                ((ByteBuffer)localObject).put(localb.bXC);
              }
            }
            super.a(paramAnonymousb1, paramAnonymousInt, paramAnonymousb2, paramAnonymousArrayOfByte);
            return;
            int m = com.tencent.matrix.resource.c.b.a.b(localByteArrayInputStream, localc, a.this.bXj);
            j++;
            k = m + k;
            break;
          }
        }
      };
    }
  }

  public final class b extends d
  {
    public b()
    {
      super();
    }

    public final b a(int paramInt1, int paramInt2, long paramLong)
    {
      // Byte code:
      //   0: new 9	com/tencent/matrix/resource/c/a$b$1
      //   3: dup
      //   4: aload_0
      //   5: invokespecial 24	com/tencent/matrix/resource/c/a$b$1:<init>	(Lcom/tencent/matrix/resource/c/a$b;)V
      //   8: areturn
    }

    public final void a(int paramInt1, com.tencent.matrix.resource.c.a.b paramb1, int paramInt2, com.tencent.matrix.resource.c.a.b paramb2, int paramInt3, long paramLong)
    {
      if ((a.this.bXd == null) && (a.this.bXc != null) && (a.this.bXc.equals(paramb2)))
        a.this.bXd = paramb1;
      while (true)
      {
        return;
        if ((a.this.bXh == null) && (a.this.bXg != null) && (a.this.bXg.equals(paramb2)))
          a.this.bXh = paramb1;
      }
    }

    public final void a(com.tencent.matrix.resource.c.a.b paramb, String paramString, int paramInt, long paramLong)
    {
      if ((a.this.bXc == null) && ("android.graphics.Bitmap".equals(paramString)))
        a.this.bXc = paramb;
      while (true)
      {
        return;
        if ((a.this.bXe == null) && ("mBuffer".equals(paramString)))
          a.this.bXe = paramb;
        else if ((a.this.bXf == null) && ("mRecycled".equals(paramString)))
          a.this.bXf = paramb;
        else if ((a.this.bXg == null) && ("java.lang.String".equals(paramString)))
          a.this.bXg = paramb;
        else if ((a.this.bXi == null) && ("value".equals(paramString)))
          a.this.bXi = paramb;
      }
    }

    public final void a(String paramString, int paramInt, long paramLong)
    {
      a.this.bXj = paramInt;
      a.this.bXk = new com.tencent.matrix.resource.c.a.b(new byte[paramInt]);
    }
  }

  public final class c extends d
  {
    public c()
    {
      super();
    }

    public final b a(int paramInt1, int paramInt2, long paramLong)
    {
      // Byte code:
      //   0: new 9	com/tencent/matrix/resource/c/a$c$1
      //   3: dup
      //   4: aload_0
      //   5: invokespecial 24	com/tencent/matrix/resource/c/a$c$1:<init>	(Lcom/tencent/matrix/resource/c/a$c;)V
      //   8: areturn
    }

    public final void zn()
    {
      Object localObject1 = a.this.bWZ.entrySet();
      HashMap localHashMap = new HashMap();
      localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
        com.tencent.matrix.resource.c.a.b localb1 = (com.tencent.matrix.resource.c.a.b)((Map.Entry)localObject2).getKey();
        localObject2 = (byte[])((Map.Entry)localObject2).getValue();
        if (a.this.bWY.contains(localb1))
        {
          localObject2 = com.tencent.matrix.resource.a.a.a.w((byte[])localObject2);
          com.tencent.matrix.resource.c.a.b localb2 = (com.tencent.matrix.resource.c.a.b)localHashMap.get(localObject2);
          if (localb2 == null)
          {
            localHashMap.put(localObject2, localb1);
          }
          else
          {
            a.this.bXa.put(localb2, localb2);
            a.this.bXa.put(localb1, localb2);
          }
        }
      }
      a.this.bWZ.clear();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.c.a
 * JD-Core Version:    0.6.2
 */