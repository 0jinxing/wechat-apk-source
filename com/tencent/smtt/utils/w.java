package com.tencent.smtt.utils;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class w
{
  private static w e = null;
  public boolean a;
  private Context b;
  private File c;
  private boolean d;
  private File f;

  private w(Context paramContext)
  {
    AppMethodBeat.i(65309);
    this.b = null;
    this.c = null;
    this.a = false;
    this.d = false;
    this.f = null;
    this.b = paramContext.getApplicationContext();
    b();
    AppMethodBeat.o(65309);
  }

  public static w a()
  {
    try
    {
      w localw = e;
      return localw;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static w a(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(65308);
      if (e == null)
      {
        w localw = new com/tencent/smtt/utils/w;
        localw.<init>(paramContext);
        e = localw;
      }
      paramContext = e;
      AppMethodBeat.o(65308);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  private File d()
  {
    Object localObject1 = null;
    AppMethodBeat.i(65311);
    try
    {
      File localFile2;
      if (this.c == null)
      {
        File localFile1 = this.b.getDir("tbs", 0);
        localFile2 = new java/io/File;
        localFile2.<init>(localFile1, "core_private");
        this.c = localFile2;
        if (this.c != null)
        {
          boolean bool = this.c.isDirectory();
          if (bool);
        }
        else
        {
          AppMethodBeat.o(65311);
        }
      }
      while (true)
      {
        return localObject1;
        localFile2 = new java/io/File;
        localFile2.<init>(this.c, "debug.conf");
        localObject1 = localFile2;
        if (!localFile2.exists())
        {
          localFile2.createNewFile();
          localObject1 = localFile2;
        }
        AppMethodBeat.o(65311);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
        Object localObject2 = null;
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(65312);
    this.d = paramBoolean;
    c();
    AppMethodBeat.o(65312);
  }

  // ERROR //
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 92
    //   4: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aconst_null
    //   8: astore_1
    //   9: aload_0
    //   10: getfield 40	com/tencent/smtt/utils/w:f	Ljava/io/File;
    //   13: ifnonnull +11 -> 24
    //   16: aload_0
    //   17: aload_0
    //   18: invokespecial 94	com/tencent/smtt/utils/w:d	()Ljava/io/File;
    //   21: putfield 40	com/tencent/smtt/utils/w:f	Ljava/io/File;
    //   24: aload_0
    //   25: getfield 40	com/tencent/smtt/utils/w:f	Ljava/io/File;
    //   28: astore_2
    //   29: aload_2
    //   30: ifnonnull +11 -> 41
    //   33: ldc 92
    //   35: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: aload_0
    //   39: monitorexit
    //   40: return
    //   41: new 96	java/io/FileInputStream
    //   44: astore_3
    //   45: aload_3
    //   46: aload_0
    //   47: getfield 40	com/tencent/smtt/utils/w:f	Ljava/io/File;
    //   50: invokespecial 99	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   53: new 101	java/io/BufferedInputStream
    //   56: astore_2
    //   57: aload_2
    //   58: aload_3
    //   59: invokespecial 104	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   62: new 106	java/util/Properties
    //   65: astore_1
    //   66: aload_1
    //   67: invokespecial 107	java/util/Properties:<init>	()V
    //   70: aload_1
    //   71: aload_2
    //   72: invokevirtual 110	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   75: aload_1
    //   76: ldc 112
    //   78: ldc 114
    //   80: invokevirtual 118	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   83: astore_1
    //   84: ldc 114
    //   86: aload_1
    //   87: invokevirtual 124	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   90: ifne +11 -> 101
    //   93: aload_0
    //   94: aload_1
    //   95: invokestatic 130	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   98: putfield 36	com/tencent/smtt/utils/w:a	Z
    //   101: aload_2
    //   102: invokevirtual 133	java/io/BufferedInputStream:close	()V
    //   105: ldc 92
    //   107: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   110: goto -72 -> 38
    //   113: astore_2
    //   114: aload_0
    //   115: monitorexit
    //   116: aload_2
    //   117: athrow
    //   118: astore_2
    //   119: ldc 92
    //   121: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: goto -86 -> 38
    //   127: astore_2
    //   128: aload_1
    //   129: astore_2
    //   130: aload_2
    //   131: ifnull +7 -> 138
    //   134: aload_2
    //   135: invokevirtual 133	java/io/BufferedInputStream:close	()V
    //   138: ldc 92
    //   140: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: goto -105 -> 38
    //   146: astore_2
    //   147: ldc 92
    //   149: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   152: goto -114 -> 38
    //   155: astore_2
    //   156: aconst_null
    //   157: astore_1
    //   158: aload_1
    //   159: ifnull +7 -> 166
    //   162: aload_1
    //   163: invokevirtual 133	java/io/BufferedInputStream:close	()V
    //   166: ldc 92
    //   168: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   171: aload_2
    //   172: athrow
    //   173: astore_1
    //   174: goto -8 -> 166
    //   177: astore_1
    //   178: aload_2
    //   179: astore_3
    //   180: aload_1
    //   181: astore_2
    //   182: aload_3
    //   183: astore_1
    //   184: goto -26 -> 158
    //   187: astore_1
    //   188: goto -58 -> 130
    //
    // Exception table:
    //   from	to	target	type
    //   2	7	113	finally
    //   33	38	113	finally
    //   101	105	113	finally
    //   105	110	113	finally
    //   119	124	113	finally
    //   134	138	113	finally
    //   138	143	113	finally
    //   147	152	113	finally
    //   162	166	113	finally
    //   166	173	113	finally
    //   101	105	118	java/lang/Exception
    //   9	24	127	java/lang/Throwable
    //   24	29	127	java/lang/Throwable
    //   41	62	127	java/lang/Throwable
    //   134	138	146	java/lang/Exception
    //   9	24	155	finally
    //   24	29	155	finally
    //   41	62	155	finally
    //   162	166	173	java/lang/Exception
    //   62	101	177	finally
    //   62	101	187	java/lang/Throwable
  }

  // ERROR //
  public void c()
  {
    // Byte code:
    //   0: ldc 134
    //   2: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokespecial 94	com/tencent/smtt/utils/w:d	()Ljava/io/File;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnonnull +29 -> 40
    //   14: new 136	java/lang/NullPointerException
    //   17: dup
    //   18: invokespecial 137	java/lang/NullPointerException:<init>	()V
    //   21: athrow
    //   22: new 136	java/lang/NullPointerException
    //   25: dup
    //   26: invokespecial 137	java/lang/NullPointerException:<init>	()V
    //   29: athrow
    //   30: return
    //   31: astore_1
    //   32: ldc 134
    //   34: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   37: goto -7 -> 30
    //   40: new 96	java/io/FileInputStream
    //   43: astore_2
    //   44: aload_2
    //   45: aload_1
    //   46: invokespecial 99	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   49: new 101	java/io/BufferedInputStream
    //   52: astore_3
    //   53: aload_3
    //   54: aload_2
    //   55: invokespecial 104	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   58: new 106	java/util/Properties
    //   61: astore_2
    //   62: aload_2
    //   63: invokespecial 107	java/util/Properties:<init>	()V
    //   66: aload_2
    //   67: aload_3
    //   68: invokevirtual 110	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   71: aload_2
    //   72: ldc 112
    //   74: aload_0
    //   75: getfield 36	com/tencent/smtt/utils/w:a	Z
    //   78: invokestatic 141	java/lang/Boolean:toString	(Z)Ljava/lang/String;
    //   81: invokevirtual 145	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   84: pop
    //   85: aload_2
    //   86: ldc 147
    //   88: aload_0
    //   89: getfield 38	com/tencent/smtt/utils/w:d	Z
    //   92: invokestatic 141	java/lang/Boolean:toString	(Z)Ljava/lang/String;
    //   95: invokevirtual 145	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   98: pop
    //   99: new 149	java/io/FileOutputStream
    //   102: astore 4
    //   104: aload 4
    //   106: aload_1
    //   107: invokespecial 150	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   110: new 152	java/io/BufferedOutputStream
    //   113: astore_1
    //   114: aload_1
    //   115: aload 4
    //   117: invokespecial 155	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   120: aload_2
    //   121: aload_1
    //   122: aconst_null
    //   123: invokevirtual 159	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   126: aload_3
    //   127: invokevirtual 133	java/io/BufferedInputStream:close	()V
    //   130: aload_1
    //   131: invokevirtual 160	java/io/BufferedOutputStream:close	()V
    //   134: ldc 134
    //   136: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   139: goto -109 -> 30
    //   142: astore_1
    //   143: ldc 134
    //   145: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: goto -118 -> 30
    //   151: astore_1
    //   152: aconst_null
    //   153: astore_1
    //   154: aconst_null
    //   155: astore_3
    //   156: aload_3
    //   157: invokevirtual 133	java/io/BufferedInputStream:close	()V
    //   160: aload_1
    //   161: invokevirtual 160	java/io/BufferedOutputStream:close	()V
    //   164: ldc 134
    //   166: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   169: goto -139 -> 30
    //   172: astore_1
    //   173: ldc 134
    //   175: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: goto -148 -> 30
    //   181: astore_1
    //   182: aconst_null
    //   183: astore_3
    //   184: aconst_null
    //   185: astore_2
    //   186: aload_2
    //   187: invokevirtual 133	java/io/BufferedInputStream:close	()V
    //   190: aload_3
    //   191: invokevirtual 160	java/io/BufferedOutputStream:close	()V
    //   194: ldc 134
    //   196: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   199: aload_1
    //   200: athrow
    //   201: astore_1
    //   202: goto -180 -> 22
    //   205: astore_3
    //   206: goto -76 -> 130
    //   209: astore_3
    //   210: goto -50 -> 160
    //   213: astore_2
    //   214: goto -24 -> 190
    //   217: astore_3
    //   218: goto -24 -> 194
    //   221: astore_1
    //   222: aconst_null
    //   223: astore 4
    //   225: aload_3
    //   226: astore_2
    //   227: aload 4
    //   229: astore_3
    //   230: goto -44 -> 186
    //   233: astore 5
    //   235: aload_1
    //   236: astore 4
    //   238: aload_3
    //   239: astore_2
    //   240: aload 5
    //   242: astore_1
    //   243: aload 4
    //   245: astore_3
    //   246: goto -60 -> 186
    //   249: astore_1
    //   250: aconst_null
    //   251: astore_1
    //   252: goto -96 -> 156
    //   255: astore_2
    //   256: goto -100 -> 156
    //
    // Exception table:
    //   from	to	target	type
    //   22	30	31	java/lang/Exception
    //   130	134	142	java/lang/Exception
    //   5	10	151	java/lang/Throwable
    //   40	58	151	java/lang/Throwable
    //   160	164	172	java/lang/Exception
    //   5	10	181	finally
    //   40	58	181	finally
    //   14	22	201	java/lang/Exception
    //   126	130	205	java/lang/Exception
    //   156	160	209	java/lang/Exception
    //   186	190	213	java/lang/Exception
    //   190	194	217	java/lang/Exception
    //   58	120	221	finally
    //   120	126	233	finally
    //   58	120	249	java/lang/Throwable
    //   120	126	255	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.w
 * JD-Core Version:    0.6.2
 */