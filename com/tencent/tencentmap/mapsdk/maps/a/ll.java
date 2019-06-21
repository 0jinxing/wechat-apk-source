package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.be;
import com.tencent.tencentmap.mapsdk.a.da;
import com.tencent.tencentmap.mapsdk.a.r;
import com.tencent.tencentmap.mapsdk.a.v;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ll
{
  private static volatile ll a;
  private static String d = "/rastermap/world";
  private static String e = "/tencentmapsdk/rastermap/handdraw";
  private Context b;
  private ReentrantReadWriteLock c;
  private final int f;

  private ll(Context paramContext)
  {
    AppMethodBeat.i(100432);
    this.c = new ReentrantReadWriteLock();
    this.f = 128;
    this.b = paramContext;
    AppMethodBeat.o(100432);
  }

  private int a(int paramInt1, int paramInt2)
  {
    return paramInt1 % 128 * 128 + paramInt2 % 128;
  }

  public static ll a(Context paramContext)
  {
    AppMethodBeat.i(100431);
    if (a == null);
    try
    {
      if (a == null)
      {
        ll localll = new com/tencent/tencentmap/mapsdk/maps/a/ll;
        localll.<init>(paramContext.getApplicationContext());
        a = localll;
      }
      paramContext = a;
      AppMethodBeat.o(100431);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(100431);
    }
    throw paramContext;
  }

  private void a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length != 4));
    while (true)
    {
      return;
      int i = paramArrayOfByte[0];
      paramArrayOfByte[0] = ((byte)paramArrayOfByte[3]);
      paramArrayOfByte[3] = ((byte)i);
      i = paramArrayOfByte[1];
      paramArrayOfByte[1] = ((byte)paramArrayOfByte[2]);
      paramArrayOfByte[2] = ((byte)i);
    }
  }

  private String[] a(be parambe, boolean paramBoolean)
  {
    Object localObject1 = null;
    AppMethodBeat.i(100433);
    int i = parambe.a() / 128;
    int j = parambe.b() / 128;
    int k = i / 10;
    int m = j / 10;
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject2 = parambe.e();
    switch (parambe.d())
    {
    default:
      localObject2 = null;
      if (localObject2 == null)
        AppMethodBeat.o(100433);
      break;
    case 0:
    case 1:
    }
    for (parambe = localObject1; ; parambe = new String[] { parambe, localObject2 })
    {
      return parambe;
      localObject2 = a((da)localObject2);
      break;
      localObject2 = a();
      break;
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append("glGrid");
      localStringBuilder.append("/");
      localStringBuilder.append(parambe.c());
      localStringBuilder.append("/");
      localStringBuilder.append(k);
      localStringBuilder.append("/");
      localStringBuilder.append(m);
      localStringBuilder.append("/");
      if (!paramBoolean)
      {
        localObject2 = new File(localStringBuilder.toString());
        if (!((File)localObject2).exists())
          ((File)localObject2).mkdirs();
      }
      localStringBuilder.append(parambe.c());
      localStringBuilder.append("_");
      localStringBuilder.append(i);
      localStringBuilder.append("_");
      localStringBuilder.append(j);
      parambe = localStringBuilder.toString() + ".idx";
      localObject2 = localStringBuilder.toString() + ".dat";
      AppMethodBeat.o(100433);
    }
  }

  private int b(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[0] & 0xFF | paramArrayOfByte[1] << 8 & 0xFF00 | paramArrayOfByte[2] << 16 & 0xFF0000 | paramArrayOfByte[3] << 24 & 0xFF000000;
  }

  private byte[] b(int paramInt)
  {
    return new byte[] { (byte)(paramInt & 0xFF), (byte)((0xFF00 & paramInt) >> 8), (byte)((0xFF0000 & paramInt) >> 16), (byte)((0xFF000000 & paramInt) >> 24) };
  }

  // ERROR //
  public android.graphics.Bitmap a(be parambe)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: ldc 133
    //   6: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: aload_1
    //   11: iconst_1
    //   12: invokespecial 135	com/tencent/tencentmap/mapsdk/maps/a/ll:a	(Lcom/tencent/tencentmap/mapsdk/a/be;Z)[Ljava/lang/String;
    //   15: astore 4
    //   17: aload 4
    //   19: ifnull +36 -> 55
    //   22: aload 4
    //   24: arraylength
    //   25: iconst_2
    //   26: if_icmpne +29 -> 55
    //   29: aload 4
    //   31: iconst_0
    //   32: aaload
    //   33: ldc 137
    //   35: invokevirtual 141	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   38: ifne +17 -> 55
    //   41: aload 4
    //   43: aload 4
    //   45: arraylength
    //   46: anewarray 122	java/lang/String
    //   49: invokestatic 146	java/util/Arrays:equals	([Ljava/lang/Object;[Ljava/lang/Object;)Z
    //   52: ifeq +14 -> 66
    //   55: ldc 133
    //   57: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: aload_3
    //   61: astore 5
    //   63: aload 5
    //   65: areturn
    //   66: new 101	java/io/File
    //   69: dup
    //   70: aload 4
    //   72: iconst_0
    //   73: aaload
    //   74: invokespecial 107	java/io/File:<init>	(Ljava/lang/String;)V
    //   77: astore 6
    //   79: aload 6
    //   81: invokevirtual 111	java/io/File:exists	()Z
    //   84: ifeq +13 -> 97
    //   87: aload 6
    //   89: invokevirtual 150	java/io/File:length	()J
    //   92: lconst_0
    //   93: lcmp
    //   94: ifne +14 -> 108
    //   97: ldc 133
    //   99: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: aload_3
    //   103: astore 5
    //   105: goto -42 -> 63
    //   108: aload_0
    //   109: aload_1
    //   110: invokevirtual 70	com/tencent/tencentmap/mapsdk/a/be:a	()I
    //   113: aload_1
    //   114: invokevirtual 72	com/tencent/tencentmap/mapsdk/a/be:b	()I
    //   117: invokespecial 152	com/tencent/tencentmap/mapsdk/maps/a/ll:a	(II)I
    //   120: istore 7
    //   122: iload 7
    //   124: ifge +14 -> 138
    //   127: ldc 133
    //   129: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: aload_3
    //   133: astore 5
    //   135: goto -72 -> 63
    //   138: iconst_4
    //   139: newarray byte
    //   141: astore 8
    //   143: aload_0
    //   144: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   147: invokevirtual 156	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   150: invokevirtual 161	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:lock	()V
    //   153: new 163	java/io/RandomAccessFile
    //   156: astore 5
    //   158: aload 5
    //   160: aload 6
    //   162: ldc 165
    //   164: invokespecial 168	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   167: iload 7
    //   169: iconst_4
    //   170: imul
    //   171: i2l
    //   172: lstore 9
    //   174: aload 5
    //   176: lload 9
    //   178: invokevirtual 172	java/io/RandomAccessFile:seek	(J)V
    //   181: aload 5
    //   183: aload 8
    //   185: iconst_0
    //   186: iconst_4
    //   187: invokevirtual 176	java/io/RandomAccessFile:read	([BII)I
    //   190: pop
    //   191: aload_0
    //   192: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   195: invokevirtual 156	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   198: invokevirtual 179	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   201: aload 5
    //   203: invokestatic 184	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   206: aload_0
    //   207: aload 8
    //   209: invokespecial 186	com/tencent/tencentmap/mapsdk/maps/a/ll:a	([B)V
    //   212: aload_0
    //   213: aload 8
    //   215: invokespecial 188	com/tencent/tencentmap/mapsdk/maps/a/ll:b	([B)I
    //   218: istore 7
    //   220: iload 7
    //   222: ifge +70 -> 292
    //   225: ldc 133
    //   227: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   230: aload_3
    //   231: astore 5
    //   233: goto -170 -> 63
    //   236: astore_1
    //   237: aconst_null
    //   238: astore 5
    //   240: aload_0
    //   241: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   244: invokevirtual 156	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   247: invokevirtual 179	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   250: aload 5
    //   252: invokestatic 184	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   255: ldc 133
    //   257: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   260: aload_3
    //   261: astore 5
    //   263: goto -200 -> 63
    //   266: astore_1
    //   267: aconst_null
    //   268: astore 5
    //   270: aload_0
    //   271: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   274: invokevirtual 156	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   277: invokevirtual 179	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   280: aload 5
    //   282: invokestatic 184	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   285: ldc 133
    //   287: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   290: aload_1
    //   291: athrow
    //   292: new 101	java/io/File
    //   295: dup
    //   296: aload 4
    //   298: iconst_1
    //   299: aaload
    //   300: invokespecial 107	java/io/File:<init>	(Ljava/lang/String;)V
    //   303: astore 4
    //   305: aload 4
    //   307: invokevirtual 111	java/io/File:exists	()Z
    //   310: ifne +14 -> 324
    //   313: ldc 133
    //   315: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   318: aload_3
    //   319: astore 5
    //   321: goto -258 -> 63
    //   324: aload_0
    //   325: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   328: invokevirtual 156	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   331: invokevirtual 161	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:lock	()V
    //   334: new 163	java/io/RandomAccessFile
    //   337: astore 5
    //   339: aload 5
    //   341: aload 4
    //   343: ldc 165
    //   345: invokespecial 168	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   348: iload 7
    //   350: i2l
    //   351: lstore 9
    //   353: aload 5
    //   355: lload 9
    //   357: invokevirtual 172	java/io/RandomAccessFile:seek	(J)V
    //   360: aload 5
    //   362: aload 8
    //   364: iconst_0
    //   365: iconst_4
    //   366: invokevirtual 176	java/io/RandomAccessFile:read	([BII)I
    //   369: pop
    //   370: aload_0
    //   371: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   374: invokevirtual 156	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   377: invokevirtual 179	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   380: aload_0
    //   381: aload 8
    //   383: invokespecial 186	com/tencent/tencentmap/mapsdk/maps/a/ll:a	([B)V
    //   386: aload_0
    //   387: aload 8
    //   389: invokespecial 188	com/tencent/tencentmap/mapsdk/maps/a/ll:b	([B)I
    //   392: istore 7
    //   394: iload 7
    //   396: ifgt +65 -> 461
    //   399: aload 5
    //   401: invokestatic 184	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   404: ldc 133
    //   406: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   409: aload_3
    //   410: astore 5
    //   412: goto -349 -> 63
    //   415: astore_1
    //   416: aconst_null
    //   417: astore_1
    //   418: aload_1
    //   419: invokestatic 184	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   422: aload_0
    //   423: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   426: invokevirtual 156	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   429: invokevirtual 179	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   432: ldc 133
    //   434: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   437: aload_3
    //   438: astore 5
    //   440: goto -377 -> 63
    //   443: astore_1
    //   444: aload_0
    //   445: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   448: invokevirtual 156	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   451: invokevirtual 179	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   454: ldc 133
    //   456: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   459: aload_1
    //   460: athrow
    //   461: iload 7
    //   463: newarray byte
    //   465: astore 8
    //   467: aload 5
    //   469: aload 8
    //   471: iconst_0
    //   472: iload 7
    //   474: invokevirtual 176	java/io/RandomAccessFile:read	([BII)I
    //   477: pop
    //   478: aload 5
    //   480: invokevirtual 191	java/io/RandomAccessFile:close	()V
    //   483: aload_1
    //   484: invokevirtual 194	com/tencent/tencentmap/mapsdk/a/be:f	()Landroid/graphics/BitmapFactory$Options;
    //   487: astore 5
    //   489: aload 5
    //   491: ifnull +59 -> 550
    //   494: aload 8
    //   496: iconst_0
    //   497: iload 7
    //   499: aload 5
    //   501: invokestatic 200	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   504: astore 5
    //   506: aload_1
    //   507: aload 5
    //   509: invokevirtual 203	com/tencent/tencentmap/mapsdk/a/be:a	(Landroid/graphics/Bitmap;)V
    //   512: ldc 133
    //   514: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   517: goto -454 -> 63
    //   520: astore_1
    //   521: aload 5
    //   523: invokevirtual 191	java/io/RandomAccessFile:close	()V
    //   526: ldc 133
    //   528: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   531: aload_3
    //   532: astore 5
    //   534: goto -471 -> 63
    //   537: astore_1
    //   538: aload 5
    //   540: invokevirtual 191	java/io/RandomAccessFile:close	()V
    //   543: ldc 133
    //   545: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   548: aload_1
    //   549: athrow
    //   550: aload 8
    //   552: iconst_0
    //   553: iload 7
    //   555: invokestatic 206	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   558: astore 5
    //   560: goto -54 -> 506
    //   563: astore 5
    //   565: goto -82 -> 483
    //   568: astore_1
    //   569: goto -43 -> 526
    //   572: astore 5
    //   574: goto -31 -> 543
    //   577: astore 5
    //   579: aload_2
    //   580: astore 5
    //   582: goto -76 -> 506
    //   585: astore_1
    //   586: aload 5
    //   588: astore_1
    //   589: goto -171 -> 418
    //   592: astore_1
    //   593: goto -323 -> 270
    //   596: astore_1
    //   597: goto -357 -> 240
    //
    // Exception table:
    //   from	to	target	type
    //   153	167	236	java/lang/Exception
    //   153	167	266	finally
    //   324	348	415	java/lang/Exception
    //   324	348	443	finally
    //   353	370	443	finally
    //   418	422	443	finally
    //   467	478	520	java/io/IOException
    //   467	478	537	finally
    //   478	483	563	java/lang/Exception
    //   521	526	568	java/lang/Exception
    //   538	543	572	java/lang/Exception
    //   483	489	577	java/lang/Exception
    //   494	506	577	java/lang/Exception
    //   550	560	577	java/lang/Exception
    //   353	370	585	java/lang/Exception
    //   174	191	592	finally
    //   174	191	596	java/lang/Exception
  }

  public String a()
  {
    AppMethodBeat.i(100438);
    String str;
    if (this.b == null)
    {
      str = null;
      AppMethodBeat.o(100438);
    }
    while (true)
    {
      return str;
      str = r.b(this.b) + "/" + e + "/" + jp.a() + "/";
      AppMethodBeat.o(100438);
    }
  }

  public String a(da paramda)
  {
    AppMethodBeat.i(100437);
    Object localObject;
    if (this.b == null)
    {
      localObject = null;
      AppMethodBeat.o(100437);
    }
    while (true)
    {
      return localObject;
      localObject = r.a(this.b).a().getPath() + d;
      String str = (String)localObject + "/" + lq.b() + "/" + lq.a() + "/" + lq.c() + "/";
      localObject = str;
      if (paramda != null)
        localObject = str + paramda.name() + "/";
      AppMethodBeat.o(100437);
    }
  }

  public boolean a(int paramInt)
  {
    AppMethodBeat.i(100436);
    String str = null;
    if (paramInt == 0)
      str = r.a(this.b).a().getPath() + d;
    if (paramInt == 1)
      str = r.b(this.b) + e;
    boolean bool = v.c(str);
    AppMethodBeat.o(100436);
    return bool;
  }

  // ERROR //
  public boolean a(byte[] paramArrayOfByte, be parambe)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: aload_0
    //   6: monitorenter
    //   7: ldc 242
    //   9: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   12: aload_1
    //   13: ifnonnull +17 -> 30
    //   16: ldc 242
    //   18: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: iload 4
    //   23: istore 5
    //   25: aload_0
    //   26: monitorexit
    //   27: iload 5
    //   29: ireturn
    //   30: aload_1
    //   31: arraylength
    //   32: istore 6
    //   34: iload 6
    //   36: ifgt +20 -> 56
    //   39: ldc 242
    //   41: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: iload 4
    //   46: istore 5
    //   48: goto -23 -> 25
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    //   56: aload_0
    //   57: aload_2
    //   58: iconst_0
    //   59: invokespecial 135	com/tencent/tencentmap/mapsdk/maps/a/ll:a	(Lcom/tencent/tencentmap/mapsdk/a/be;Z)[Ljava/lang/String;
    //   62: astore 7
    //   64: aload 7
    //   66: ifnull +36 -> 102
    //   69: aload 7
    //   71: arraylength
    //   72: iconst_2
    //   73: if_icmpne +29 -> 102
    //   76: aload 7
    //   78: iconst_0
    //   79: aaload
    //   80: ldc 137
    //   82: invokevirtual 141	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   85: ifne +17 -> 102
    //   88: aload 7
    //   90: aload 7
    //   92: arraylength
    //   93: anewarray 122	java/lang/String
    //   96: invokestatic 146	java/util/Arrays:equals	([Ljava/lang/Object;[Ljava/lang/Object;)Z
    //   99: ifeq +15 -> 114
    //   102: ldc 242
    //   104: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: iload 4
    //   109: istore 5
    //   111: goto -86 -> 25
    //   114: new 101	java/io/File
    //   117: astore 8
    //   119: aload 8
    //   121: aload 7
    //   123: iconst_1
    //   124: aaload
    //   125: invokespecial 107	java/io/File:<init>	(Ljava/lang/String;)V
    //   128: aload 8
    //   130: invokevirtual 111	java/io/File:exists	()Z
    //   133: istore 5
    //   135: iload 5
    //   137: ifne +35 -> 172
    //   140: aload 8
    //   142: invokevirtual 245	java/io/File:createNewFile	()Z
    //   145: istore 5
    //   147: iload 5
    //   149: ifne +23 -> 172
    //   152: ldc 242
    //   154: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: iload 4
    //   159: istore 5
    //   161: goto -136 -> 25
    //   164: astore 9
    //   166: iconst_0
    //   167: istore 5
    //   169: goto -22 -> 147
    //   172: new 163	java/io/RandomAccessFile
    //   175: astore 9
    //   177: aload 9
    //   179: aload 8
    //   181: ldc 247
    //   183: invokespecial 168	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   186: aload 9
    //   188: ifnonnull +23 -> 211
    //   191: ldc 242
    //   193: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   196: iload 4
    //   198: istore 5
    //   200: goto -175 -> 25
    //   203: astore 9
    //   205: aconst_null
    //   206: astore 9
    //   208: goto -22 -> 186
    //   211: aload_0
    //   212: iload 6
    //   214: invokespecial 249	com/tencent/tencentmap/mapsdk/maps/a/ll:b	(I)[B
    //   217: astore 8
    //   219: aload_0
    //   220: aload 8
    //   222: invokespecial 186	com/tencent/tencentmap/mapsdk/maps/a/ll:a	([B)V
    //   225: aload_0
    //   226: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   229: invokevirtual 253	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   232: invokevirtual 256	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:lock	()V
    //   235: aload 9
    //   237: invokevirtual 257	java/io/RandomAccessFile:length	()J
    //   240: lstore 10
    //   242: aload 9
    //   244: lload 10
    //   246: invokevirtual 172	java/io/RandomAccessFile:seek	(J)V
    //   249: aload 9
    //   251: aload 8
    //   253: invokevirtual 260	java/io/RandomAccessFile:write	([B)V
    //   256: aload 9
    //   258: aload_1
    //   259: invokevirtual 260	java/io/RandomAccessFile:write	([B)V
    //   262: aload 9
    //   264: invokestatic 184	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   267: aload_0
    //   268: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   271: invokevirtual 253	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   274: invokevirtual 261	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   277: new 101	java/io/File
    //   280: astore 9
    //   282: aload 9
    //   284: aload 7
    //   286: iconst_0
    //   287: aaload
    //   288: invokespecial 107	java/io/File:<init>	(Ljava/lang/String;)V
    //   291: aload 9
    //   293: invokevirtual 111	java/io/File:exists	()Z
    //   296: istore 5
    //   298: iload 5
    //   300: ifne +79 -> 379
    //   303: aload 9
    //   305: invokevirtual 245	java/io/File:createNewFile	()Z
    //   308: istore 5
    //   310: iload 5
    //   312: ifne +67 -> 379
    //   315: ldc 242
    //   317: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   320: iload 4
    //   322: istore 5
    //   324: goto -299 -> 25
    //   327: astore_1
    //   328: lconst_0
    //   329: lstore 10
    //   331: aload 9
    //   333: invokestatic 184	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   336: aload_0
    //   337: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   340: invokevirtual 253	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   343: invokevirtual 261	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   346: goto -69 -> 277
    //   349: astore_1
    //   350: aload 9
    //   352: invokestatic 184	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   355: aload_0
    //   356: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   359: invokevirtual 253	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   362: invokevirtual 261	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   365: ldc 242
    //   367: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   370: aload_1
    //   371: athrow
    //   372: astore_1
    //   373: iconst_0
    //   374: istore 5
    //   376: goto -66 -> 310
    //   379: new 163	java/io/RandomAccessFile
    //   382: astore_1
    //   383: aload_1
    //   384: aload 9
    //   386: ldc 247
    //   388: invokespecial 168	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   391: aload_1
    //   392: ifnonnull +15 -> 407
    //   395: ldc 242
    //   397: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   400: iload 4
    //   402: istore 5
    //   404: goto -379 -> 25
    //   407: aload_1
    //   408: invokevirtual 257	java/io/RandomAccessFile:length	()J
    //   411: lstore 12
    //   413: lload 12
    //   415: lconst_0
    //   416: lcmp
    //   417: ifne +42 -> 459
    //   420: ldc_w 262
    //   423: newarray byte
    //   425: astore 9
    //   427: aload 9
    //   429: iconst_m1
    //   430: invokestatic 266	java/util/Arrays:fill	([BB)V
    //   433: aload_0
    //   434: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   437: invokevirtual 253	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   440: invokevirtual 256	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:lock	()V
    //   443: aload_1
    //   444: aload 9
    //   446: invokevirtual 260	java/io/RandomAccessFile:write	([B)V
    //   449: aload_0
    //   450: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   453: invokevirtual 253	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   456: invokevirtual 261	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   459: aload_0
    //   460: aload_2
    //   461: invokevirtual 70	com/tencent/tencentmap/mapsdk/a/be:a	()I
    //   464: aload_2
    //   465: invokevirtual 72	com/tencent/tencentmap/mapsdk/a/be:b	()I
    //   468: invokespecial 152	com/tencent/tencentmap/mapsdk/maps/a/ll:a	(II)I
    //   471: istore 6
    //   473: iload 6
    //   475: ifge +60 -> 535
    //   478: aload_1
    //   479: invokestatic 184	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   482: ldc 242
    //   484: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   487: iload 4
    //   489: istore 5
    //   491: goto -466 -> 25
    //   494: astore 9
    //   496: lconst_0
    //   497: lstore 12
    //   499: goto -86 -> 413
    //   502: astore 9
    //   504: aload_0
    //   505: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   508: invokevirtual 253	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   511: invokevirtual 261	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   514: goto -55 -> 459
    //   517: astore_1
    //   518: aload_0
    //   519: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   522: invokevirtual 253	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   525: invokevirtual 261	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   528: ldc 242
    //   530: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   533: aload_1
    //   534: athrow
    //   535: iload 6
    //   537: iconst_4
    //   538: imul
    //   539: i2l
    //   540: lstore 12
    //   542: aload_1
    //   543: lload 12
    //   545: invokevirtual 172	java/io/RandomAccessFile:seek	(J)V
    //   548: lload 10
    //   550: l2i
    //   551: istore 6
    //   553: aload_0
    //   554: iload 6
    //   556: invokespecial 249	com/tencent/tencentmap/mapsdk/maps/a/ll:b	(I)[B
    //   559: astore_2
    //   560: aload_0
    //   561: aload_2
    //   562: invokespecial 186	com/tencent/tencentmap/mapsdk/maps/a/ll:a	([B)V
    //   565: aload_0
    //   566: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   569: invokevirtual 253	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   572: invokevirtual 256	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:lock	()V
    //   575: aload_1
    //   576: aload_2
    //   577: invokevirtual 260	java/io/RandomAccessFile:write	([B)V
    //   580: aload_1
    //   581: invokestatic 184	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   584: aload_0
    //   585: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   588: invokevirtual 253	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   591: invokevirtual 261	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   594: ldc 242
    //   596: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   599: iconst_1
    //   600: istore 5
    //   602: goto -577 -> 25
    //   605: astore_2
    //   606: aload_1
    //   607: invokestatic 184	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   610: aload_0
    //   611: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   614: invokevirtual 253	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   617: invokevirtual 261	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   620: goto -26 -> 594
    //   623: astore_2
    //   624: aload_1
    //   625: invokestatic 184	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   628: aload_0
    //   629: getfield 42	com/tencent/tencentmap/mapsdk/maps/a/ll:c	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   632: invokevirtual 253	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   635: invokevirtual 261	java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock:unlock	()V
    //   638: ldc 242
    //   640: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   643: aload_2
    //   644: athrow
    //   645: astore_2
    //   646: goto -98 -> 548
    //   649: astore_1
    //   650: aload_3
    //   651: astore_1
    //   652: goto -261 -> 391
    //   655: astore_1
    //   656: goto -325 -> 331
    //
    // Exception table:
    //   from	to	target	type
    //   7	12	51	finally
    //   16	21	51	finally
    //   30	34	51	finally
    //   39	44	51	finally
    //   56	64	51	finally
    //   69	102	51	finally
    //   102	107	51	finally
    //   114	135	51	finally
    //   140	147	51	finally
    //   152	157	51	finally
    //   172	186	51	finally
    //   191	196	51	finally
    //   211	235	51	finally
    //   262	277	51	finally
    //   277	298	51	finally
    //   303	310	51	finally
    //   315	320	51	finally
    //   331	346	51	finally
    //   350	372	51	finally
    //   379	391	51	finally
    //   395	400	51	finally
    //   407	413	51	finally
    //   420	443	51	finally
    //   449	459	51	finally
    //   459	473	51	finally
    //   478	487	51	finally
    //   504	514	51	finally
    //   518	535	51	finally
    //   542	548	51	finally
    //   553	575	51	finally
    //   580	594	51	finally
    //   594	599	51	finally
    //   606	620	51	finally
    //   624	645	51	finally
    //   140	147	164	java/lang/Exception
    //   172	186	203	java/lang/Exception
    //   235	242	327	java/lang/Exception
    //   235	242	349	finally
    //   242	262	349	finally
    //   303	310	372	java/lang/Exception
    //   407	413	494	java/lang/Exception
    //   443	449	502	java/lang/Exception
    //   443	449	517	finally
    //   575	580	605	java/lang/Exception
    //   575	580	623	finally
    //   542	548	645	java/lang/Exception
    //   379	391	649	java/lang/Exception
    //   242	262	655	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ll
 * JD-Core Version:    0.6.2
 */