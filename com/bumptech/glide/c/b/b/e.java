package com.bumptech.glide.c.b.b;

import android.util.Log;
import com.bumptech.glide.c.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;

public final class e
  implements a
{
  private final j aDe;
  private final c aDf;
  private com.bumptech.glide.a.a aDg;
  private final long axz;
  private final File directory;

  @Deprecated
  e(File paramFile, long paramLong)
  {
    AppMethodBeat.i(91981);
    this.aDf = new c();
    this.directory = paramFile;
    this.axz = paramLong;
    this.aDe = new j();
    AppMethodBeat.o(91981);
  }

  private com.bumptech.glide.a.a mX()
  {
    try
    {
      AppMethodBeat.i(91982);
      if (this.aDg == null)
        this.aDg = com.bumptech.glide.a.a.a(this.directory, this.axz);
      com.bumptech.glide.a.a locala = this.aDg;
      AppMethodBeat.o(91982);
      return locala;
    }
    finally
    {
    }
  }

  public final File a(h paramh)
  {
    AppMethodBeat.i(91983);
    Object localObject1 = this.aDe.c(paramh);
    if (Log.isLoggable("DiskLruCacheWrapper", 2))
      new StringBuilder("Get: Obtained: ").append((String)localObject1).append(" for for Key: ").append(paramh);
    Object localObject2 = null;
    try
    {
      localObject1 = mX().X((String)localObject1);
      paramh = localObject2;
      if (localObject1 != null)
        paramh = localObject1.files[0];
      AppMethodBeat.o(91983);
      return paramh;
    }
    catch (IOException paramh)
    {
      while (true)
      {
        Log.isLoggable("DiskLruCacheWrapper", 5);
        paramh = localObject2;
      }
    }
  }

  // ERROR //
  public final void a(h paramh, a.b paramb)
  {
    // Byte code:
    //   0: ldc 105
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 43	com/bumptech/glide/c/b/b/e:aDe	Lcom/bumptech/glide/c/b/b/j;
    //   9: aload_1
    //   10: invokevirtual 67	com/bumptech/glide/c/b/b/j:c	(Lcom/bumptech/glide/c/h;)Ljava/lang/String;
    //   13: astore_3
    //   14: aload_0
    //   15: getfield 34	com/bumptech/glide/c/b/b/e:aDf	Lcom/bumptech/glide/c/b/b/c;
    //   18: astore 4
    //   20: aload 4
    //   22: monitorenter
    //   23: aload 4
    //   25: getfield 109	com/bumptech/glide/c/b/b/c:aCX	Ljava/util/Map;
    //   28: aload_3
    //   29: invokeinterface 115 2 0
    //   34: checkcast 117	com/bumptech/glide/c/b/b/c$a
    //   37: astore 5
    //   39: aload 5
    //   41: astore 6
    //   43: aload 5
    //   45: ifnonnull +27 -> 72
    //   48: aload 4
    //   50: getfield 121	com/bumptech/glide/c/b/b/c:aCY	Lcom/bumptech/glide/c/b/b/c$b;
    //   53: invokevirtual 127	com/bumptech/glide/c/b/b/c$b:mV	()Lcom/bumptech/glide/c/b/b/c$a;
    //   56: astore 6
    //   58: aload 4
    //   60: getfield 109	com/bumptech/glide/c/b/b/c:aCX	Ljava/util/Map;
    //   63: aload_3
    //   64: aload 6
    //   66: invokeinterface 131 3 0
    //   71: pop
    //   72: aload 6
    //   74: aload 6
    //   76: getfield 135	com/bumptech/glide/c/b/b/c$a:aDa	I
    //   79: iconst_1
    //   80: iadd
    //   81: putfield 135	com/bumptech/glide/c/b/b/c$a:aDa	I
    //   84: aload 4
    //   86: monitorexit
    //   87: aload 6
    //   89: getfield 139	com/bumptech/glide/c/b/b/c$a:aCZ	Ljava/util/concurrent/locks/Lock;
    //   92: invokeinterface 144 1 0
    //   97: ldc 69
    //   99: iconst_2
    //   100: invokestatic 75	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   103: ifeq +31 -> 134
    //   106: new 77	java/lang/StringBuilder
    //   109: astore 6
    //   111: aload 6
    //   113: ldc 146
    //   115: invokespecial 82	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   118: aload 6
    //   120: aload_3
    //   121: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: ldc 88
    //   126: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: aload_1
    //   130: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: aload_0
    //   135: invokespecial 93	com/bumptech/glide/c/b/b/e:mX	()Lcom/bumptech/glide/a/a;
    //   138: astore 6
    //   140: aload 6
    //   142: aload_3
    //   143: invokevirtual 97	com/bumptech/glide/a/a:X	(Ljava/lang/String;)Lcom/bumptech/glide/a/a$d;
    //   146: astore_1
    //   147: aload_1
    //   148: ifnull +28 -> 176
    //   151: aload_0
    //   152: getfield 34	com/bumptech/glide/c/b/b/e:aDf	Lcom/bumptech/glide/c/b/b/c;
    //   155: aload_3
    //   156: invokevirtual 149	com/bumptech/glide/c/b/b/c:release	(Ljava/lang/String;)V
    //   159: ldc 105
    //   161: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: return
    //   165: astore_1
    //   166: aload 4
    //   168: monitorexit
    //   169: ldc 105
    //   171: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   174: aload_1
    //   175: athrow
    //   176: aload 6
    //   178: aload_3
    //   179: invokevirtual 153	com/bumptech/glide/a/a:Y	(Ljava/lang/String;)Lcom/bumptech/glide/a/a$b;
    //   182: astore_1
    //   183: aload_1
    //   184: ifnonnull +51 -> 235
    //   187: new 155	java/lang/IllegalStateException
    //   190: astore_1
    //   191: aload_1
    //   192: ldc 157
    //   194: aload_3
    //   195: invokestatic 163	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   198: invokevirtual 167	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   201: invokespecial 168	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   204: ldc 105
    //   206: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: aload_1
    //   210: athrow
    //   211: astore_1
    //   212: ldc 69
    //   214: iconst_5
    //   215: invokestatic 75	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   218: pop
    //   219: aload_0
    //   220: getfield 34	com/bumptech/glide/c/b/b/e:aDf	Lcom/bumptech/glide/c/b/b/c;
    //   223: aload_3
    //   224: invokevirtual 149	com/bumptech/glide/c/b/b/c:release	(Ljava/lang/String;)V
    //   227: ldc 105
    //   229: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   232: goto -68 -> 164
    //   235: aload_2
    //   236: aload_1
    //   237: invokevirtual 174	com/bumptech/glide/a/a$b:lP	()Ljava/io/File;
    //   240: invokeinterface 180 2 0
    //   245: ifeq +17 -> 262
    //   248: aload_1
    //   249: getfield 183	com/bumptech/glide/a/a$b:axH	Lcom/bumptech/glide/a/a;
    //   252: aload_1
    //   253: iconst_1
    //   254: invokestatic 186	com/bumptech/glide/a/a:a	(Lcom/bumptech/glide/a/a;Lcom/bumptech/glide/a/a$b;Z)V
    //   257: aload_1
    //   258: iconst_1
    //   259: putfield 190	com/bumptech/glide/a/a$b:axK	Z
    //   262: aload_1
    //   263: invokevirtual 193	com/bumptech/glide/a/a$b:lQ	()V
    //   266: goto -47 -> 219
    //   269: astore_1
    //   270: aload_0
    //   271: getfield 34	com/bumptech/glide/c/b/b/e:aDf	Lcom/bumptech/glide/c/b/b/c;
    //   274: aload_3
    //   275: invokevirtual 149	com/bumptech/glide/c/b/b/c:release	(Ljava/lang/String;)V
    //   278: ldc 105
    //   280: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: aload_1
    //   284: athrow
    //   285: astore_2
    //   286: aload_1
    //   287: invokevirtual 193	com/bumptech/glide/a/a$b:lQ	()V
    //   290: ldc 105
    //   292: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   295: aload_2
    //   296: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   23	39	165	finally
    //   48	72	165	finally
    //   72	87	165	finally
    //   166	169	165	finally
    //   134	147	211	java/io/IOException
    //   176	183	211	java/io/IOException
    //   187	211	211	java/io/IOException
    //   262	266	211	java/io/IOException
    //   286	297	211	java/io/IOException
    //   97	134	269	finally
    //   134	147	269	finally
    //   176	183	269	finally
    //   187	211	269	finally
    //   212	219	269	finally
    //   262	266	269	finally
    //   286	297	269	finally
    //   235	262	285	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.b.e
 * JD-Core Version:    0.6.2
 */