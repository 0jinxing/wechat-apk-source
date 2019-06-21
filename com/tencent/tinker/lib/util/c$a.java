package com.tencent.tinker.lib.util;

public final class c$a
{
  public String ACr;
  public String cvZ;

  public c$a(String paramString1, String paramString2)
  {
    this.cvZ = paramString1;
    this.ACr = paramString2;
  }

  // ERROR //
  public static void a(java.io.File paramFile, a parama)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: invokevirtual 29	java/io/File:getParentFile	()Ljava/io/File;
    //   9: astore_2
    //   10: aload_2
    //   11: invokevirtual 33	java/io/File:exists	()Z
    //   14: ifne +8 -> 22
    //   17: aload_2
    //   18: invokevirtual 36	java/io/File:mkdirs	()Z
    //   21: pop
    //   22: new 38	java/util/Properties
    //   25: dup
    //   26: invokespecial 39	java/util/Properties:<init>	()V
    //   29: astore_2
    //   30: aload_2
    //   31: ldc 41
    //   33: aload_1
    //   34: getfield 17	com/tencent/tinker/lib/util/c$a:cvZ	Ljava/lang/String;
    //   37: invokevirtual 45	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   40: pop
    //   41: aload_2
    //   42: ldc 47
    //   44: aload_1
    //   45: getfield 19	com/tencent/tinker/lib/util/c$a:ACr	Ljava/lang/String;
    //   48: invokevirtual 45	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   51: pop
    //   52: new 49	java/io/FileOutputStream
    //   55: astore_1
    //   56: aload_1
    //   57: aload_0
    //   58: iconst_0
    //   59: invokespecial 52	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   62: aload_1
    //   63: astore_0
    //   64: aload_2
    //   65: aload_1
    //   66: aconst_null
    //   67: invokevirtual 56	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   70: aload_1
    //   71: invokestatic 62	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   74: goto -70 -> 4
    //   77: astore_2
    //   78: aconst_null
    //   79: astore_1
    //   80: aload_1
    //   81: astore_0
    //   82: ldc 64
    //   84: aload_2
    //   85: ldc 66
    //   87: iconst_0
    //   88: anewarray 4	java/lang/Object
    //   91: invokestatic 72	com/tencent/tinker/lib/util/a:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: aload_1
    //   95: invokestatic 62	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   98: goto -94 -> 4
    //   101: astore_1
    //   102: aconst_null
    //   103: astore_0
    //   104: aload_0
    //   105: invokestatic 62	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   108: aload_1
    //   109: athrow
    //   110: astore_1
    //   111: goto -7 -> 104
    //   114: astore_2
    //   115: goto -35 -> 80
    //
    // Exception table:
    //   from	to	target	type
    //   52	62	77	java/lang/Exception
    //   52	62	101	finally
    //   64	70	110	finally
    //   82	94	110	finally
    //   64	70	114	java/lang/Exception
  }

  // ERROR //
  public static a am(java.io.File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 38	java/util/Properties
    //   5: dup
    //   6: invokespecial 39	java/util/Properties:<init>	()V
    //   9: astore_2
    //   10: new 78	java/io/FileInputStream
    //   13: astore_3
    //   14: aload_3
    //   15: aload_0
    //   16: invokespecial 81	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   19: aload_3
    //   20: astore 4
    //   22: aload_2
    //   23: aload_3
    //   24: invokevirtual 85	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   27: aload_3
    //   28: astore 4
    //   30: aload_2
    //   31: ldc 41
    //   33: invokevirtual 89	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   36: astore_0
    //   37: aload_3
    //   38: astore 4
    //   40: aload_2
    //   41: ldc 47
    //   43: invokevirtual 89	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   46: astore_2
    //   47: aload_2
    //   48: astore 4
    //   50: aload_3
    //   51: invokestatic 62	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   54: new 2	com/tencent/tinker/lib/util/c$a
    //   57: dup
    //   58: aload_0
    //   59: aload 4
    //   61: invokespecial 91	com/tencent/tinker/lib/util/c$a:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   64: areturn
    //   65: astore_2
    //   66: aconst_null
    //   67: astore_3
    //   68: aconst_null
    //   69: astore_0
    //   70: aload_3
    //   71: astore 4
    //   73: ldc 64
    //   75: ldc 93
    //   77: aload_2
    //   78: invokestatic 99	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   81: invokevirtual 102	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   84: iconst_0
    //   85: anewarray 4	java/lang/Object
    //   88: invokestatic 106	com/tencent/tinker/lib/util/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: aload_3
    //   92: invokestatic 62	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   95: aload_1
    //   96: astore 4
    //   98: goto -44 -> 54
    //   101: astore_0
    //   102: aconst_null
    //   103: astore 4
    //   105: aload 4
    //   107: invokestatic 62	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   110: aload_0
    //   111: athrow
    //   112: astore_0
    //   113: goto -8 -> 105
    //   116: astore_2
    //   117: aconst_null
    //   118: astore_0
    //   119: goto -49 -> 70
    //   122: astore_2
    //   123: goto -53 -> 70
    //
    // Exception table:
    //   from	to	target	type
    //   10	19	65	java/io/IOException
    //   10	19	101	finally
    //   22	27	112	finally
    //   30	37	112	finally
    //   40	47	112	finally
    //   73	91	112	finally
    //   22	27	116	java/io/IOException
    //   30	37	116	java/io/IOException
    //   40	47	122	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.util.c.a
 * JD-Core Version:    0.6.2
 */