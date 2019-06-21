package com.tencent.smtt.utils;

import android.annotation.TargetApi;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class v
{
  private static v c = null;
  private Context a;
  private File b;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;

  @TargetApi(11)
  private v(Context paramContext)
  {
    AppMethodBeat.i(65305);
    this.a = null;
    this.b = null;
    this.d = "http://log.tbs.qq.com/ajax?c=pu&v=2&k=";
    this.e = "http://log.tbs.qq.com/ajax?c=pu&tk=";
    this.f = "http://wup.imtt.qq.com:8080";
    this.g = "http://log.tbs.qq.com/ajax?c=dl&k=";
    this.h = "http://cfg.imtt.qq.com/tbs?v=2&mk=";
    this.i = "http://log.tbs.qq.com/ajax?c=ul&v=2&k=";
    this.j = "http://mqqad.html5.qq.com/adjs";
    this.k = "http://log.tbs.qq.com/ajax?c=ucfu&k=";
    TbsLog.w("TbsCommonConfig", "TbsCommonConfig constructing...");
    this.a = paramContext.getApplicationContext();
    g();
    AppMethodBeat.o(65305);
  }

  public static v a()
  {
    try
    {
      v localv = c;
      return localv;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static v a(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(65304);
      if (c == null)
      {
        v localv = new com/tencent/smtt/utils/v;
        localv.<init>(paramContext);
        c = localv;
      }
      paramContext = c;
      AppMethodBeat.o(65304);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  // ERROR //
  private void g()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 105
    //   4: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aconst_null
    //   8: astore_1
    //   9: aload_0
    //   10: invokespecial 108	com/tencent/smtt/utils/v:h	()Ljava/io/File;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull +30 -> 45
    //   18: ldc 75
    //   20: ldc 110
    //   22: invokestatic 112	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: iconst_0
    //   26: ifeq +11 -> 37
    //   29: new 114	java/lang/NullPointerException
    //   32: dup
    //   33: invokespecial 115	java/lang/NullPointerException:<init>	()V
    //   36: athrow
    //   37: ldc 105
    //   39: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: new 117	java/io/FileInputStream
    //   48: astore_3
    //   49: aload_3
    //   50: aload_2
    //   51: invokespecial 120	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   54: new 122	java/io/BufferedInputStream
    //   57: dup
    //   58: aload_3
    //   59: invokespecial 125	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   62: astore_2
    //   63: new 127	java/util/Properties
    //   66: astore_1
    //   67: aload_1
    //   68: invokespecial 128	java/util/Properties:<init>	()V
    //   71: aload_1
    //   72: aload_2
    //   73: invokevirtual 131	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   76: aload_1
    //   77: ldc 133
    //   79: ldc 135
    //   81: invokevirtual 139	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   84: astore_3
    //   85: ldc 135
    //   87: aload_3
    //   88: invokevirtual 145	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   91: ifne +8 -> 99
    //   94: aload_0
    //   95: aload_3
    //   96: putfield 45	com/tencent/smtt/utils/v:d	Ljava/lang/String;
    //   99: aload_1
    //   100: ldc 147
    //   102: ldc 135
    //   104: invokevirtual 139	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   107: astore_3
    //   108: ldc 135
    //   110: aload_3
    //   111: invokevirtual 145	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   114: ifne +8 -> 122
    //   117: aload_0
    //   118: aload_3
    //   119: putfield 53	com/tencent/smtt/utils/v:f	Ljava/lang/String;
    //   122: aload_1
    //   123: ldc 149
    //   125: ldc 135
    //   127: invokevirtual 139	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   130: astore_3
    //   131: ldc 135
    //   133: aload_3
    //   134: invokevirtual 145	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   137: ifne +8 -> 145
    //   140: aload_0
    //   141: aload_3
    //   142: putfield 57	com/tencent/smtt/utils/v:g	Ljava/lang/String;
    //   145: aload_1
    //   146: ldc 151
    //   148: ldc 135
    //   150: invokevirtual 139	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   153: astore_3
    //   154: ldc 135
    //   156: aload_3
    //   157: invokevirtual 145	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   160: ifne +8 -> 168
    //   163: aload_0
    //   164: aload_3
    //   165: putfield 61	com/tencent/smtt/utils/v:h	Ljava/lang/String;
    //   168: aload_1
    //   169: ldc 153
    //   171: ldc 135
    //   173: invokevirtual 139	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   176: astore_3
    //   177: ldc 135
    //   179: aload_3
    //   180: invokevirtual 145	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   183: ifne +8 -> 191
    //   186: aload_0
    //   187: aload_3
    //   188: putfield 65	com/tencent/smtt/utils/v:i	Ljava/lang/String;
    //   191: aload_1
    //   192: ldc 155
    //   194: ldc 135
    //   196: invokevirtual 139	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   199: astore_3
    //   200: ldc 135
    //   202: aload_3
    //   203: invokevirtual 145	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   206: ifne +8 -> 214
    //   209: aload_0
    //   210: aload_3
    //   211: putfield 69	com/tencent/smtt/utils/v:j	Ljava/lang/String;
    //   214: aload_1
    //   215: ldc 157
    //   217: ldc 135
    //   219: invokevirtual 139	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   222: astore_3
    //   223: ldc 135
    //   225: aload_3
    //   226: invokevirtual 145	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   229: ifne +8 -> 237
    //   232: aload_0
    //   233: aload_3
    //   234: putfield 73	com/tencent/smtt/utils/v:k	Ljava/lang/String;
    //   237: aload_1
    //   238: ldc 159
    //   240: ldc 135
    //   242: invokevirtual 139	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   245: astore_1
    //   246: ldc 135
    //   248: aload_1
    //   249: invokevirtual 145	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   252: ifne +8 -> 260
    //   255: aload_0
    //   256: aload_1
    //   257: putfield 49	com/tencent/smtt/utils/v:e	Ljava/lang/String;
    //   260: aload_2
    //   261: ifnull +7 -> 268
    //   264: aload_2
    //   265: invokevirtual 162	java/io/BufferedInputStream:close	()V
    //   268: ldc 105
    //   270: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   273: goto -231 -> 42
    //   276: astore_1
    //   277: aload_0
    //   278: monitorexit
    //   279: aload_1
    //   280: athrow
    //   281: astore_2
    //   282: new 164	java/io/StringWriter
    //   285: astore_3
    //   286: aload_3
    //   287: invokespecial 165	java/io/StringWriter:<init>	()V
    //   290: new 167	java/io/PrintWriter
    //   293: astore 4
    //   295: aload 4
    //   297: aload_3
    //   298: invokespecial 170	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   301: aload_2
    //   302: aload 4
    //   304: invokevirtual 174	java/lang/Throwable:printStackTrace	(Ljava/io/PrintWriter;)V
    //   307: new 176	java/lang/StringBuilder
    //   310: astore_2
    //   311: aload_2
    //   312: ldc 178
    //   314: invokespecial 181	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   317: ldc 75
    //   319: aload_2
    //   320: aload_3
    //   321: invokevirtual 185	java/io/StringWriter:toString	()Ljava/lang/String;
    //   324: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   330: invokestatic 112	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   333: aload_1
    //   334: ifnull +7 -> 341
    //   337: aload_1
    //   338: invokevirtual 162	java/io/BufferedInputStream:close	()V
    //   341: ldc 105
    //   343: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   346: goto -304 -> 42
    //   349: astore_1
    //   350: aconst_null
    //   351: astore_2
    //   352: aload_2
    //   353: ifnull +7 -> 360
    //   356: aload_2
    //   357: invokevirtual 162	java/io/BufferedInputStream:close	()V
    //   360: ldc 105
    //   362: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   365: aload_1
    //   366: athrow
    //   367: astore_2
    //   368: goto -8 -> 360
    //   371: astore_1
    //   372: goto -31 -> 341
    //   375: astore_1
    //   376: goto -339 -> 37
    //   379: astore_1
    //   380: goto -112 -> 268
    //   383: astore_1
    //   384: goto -32 -> 352
    //   387: astore_3
    //   388: aload_1
    //   389: astore_2
    //   390: aload_3
    //   391: astore_1
    //   392: goto -40 -> 352
    //   395: astore_1
    //   396: aload_2
    //   397: astore_3
    //   398: aload_1
    //   399: astore_2
    //   400: aload_3
    //   401: astore_1
    //   402: goto -120 -> 282
    //
    // Exception table:
    //   from	to	target	type
    //   2	7	276	finally
    //   29	37	276	finally
    //   37	42	276	finally
    //   264	268	276	finally
    //   268	273	276	finally
    //   337	341	276	finally
    //   341	346	276	finally
    //   356	360	276	finally
    //   360	367	276	finally
    //   9	14	281	java/lang/Throwable
    //   18	25	281	java/lang/Throwable
    //   45	63	281	java/lang/Throwable
    //   9	14	349	finally
    //   18	25	349	finally
    //   45	63	349	finally
    //   356	360	367	java/io/IOException
    //   337	341	371	java/io/IOException
    //   29	37	375	java/io/IOException
    //   264	268	379	java/io/IOException
    //   63	99	383	finally
    //   99	122	383	finally
    //   122	145	383	finally
    //   145	168	383	finally
    //   168	191	383	finally
    //   191	214	383	finally
    //   214	237	383	finally
    //   237	260	383	finally
    //   282	333	387	finally
    //   63	99	395	java/lang/Throwable
    //   99	122	395	java/lang/Throwable
    //   122	145	395	java/lang/Throwable
    //   145	168	395	java/lang/Throwable
    //   168	191	395	java/lang/Throwable
    //   191	214	395	java/lang/Throwable
    //   214	237	395	java/lang/Throwable
    //   237	260	395	java/lang/Throwable
  }

  // ERROR //
  private File h()
  {
    // Byte code:
    //   0: ldc 191
    //   2: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 41	com/tencent/smtt/utils/v:b	Ljava/io/File;
    //   9: ifnonnull +52 -> 61
    //   12: new 193	java/io/File
    //   15: astore_1
    //   16: aload_1
    //   17: aload_0
    //   18: getfield 39	com/tencent/smtt/utils/v:a	Landroid/content/Context;
    //   21: iconst_5
    //   22: invokestatic 198	com/tencent/smtt/utils/k:a	(Landroid/content/Context;I)Ljava/lang/String;
    //   25: invokespecial 199	java/io/File:<init>	(Ljava/lang/String;)V
    //   28: aload_0
    //   29: aload_1
    //   30: putfield 41	com/tencent/smtt/utils/v:b	Ljava/io/File;
    //   33: aload_0
    //   34: getfield 41	com/tencent/smtt/utils/v:b	Ljava/io/File;
    //   37: ifnull +15 -> 52
    //   40: aload_0
    //   41: getfield 41	com/tencent/smtt/utils/v:b	Ljava/io/File;
    //   44: invokevirtual 203	java/io/File:isDirectory	()Z
    //   47: istore_2
    //   48: iload_2
    //   49: ifne +12 -> 61
    //   52: ldc 191
    //   54: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   57: aconst_null
    //   58: astore_1
    //   59: aload_1
    //   60: areturn
    //   61: new 193	java/io/File
    //   64: astore_1
    //   65: aload_1
    //   66: aload_0
    //   67: getfield 41	com/tencent/smtt/utils/v:b	Ljava/io/File;
    //   70: ldc 205
    //   72: invokespecial 208	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   75: aload_1
    //   76: invokevirtual 211	java/io/File:exists	()Z
    //   79: ifne +44 -> 123
    //   82: new 176	java/lang/StringBuilder
    //   85: astore_3
    //   86: aload_3
    //   87: ldc 213
    //   89: invokespecial 181	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   92: ldc 75
    //   94: aload_3
    //   95: aload_1
    //   96: invokevirtual 216	java/io/File:getCanonicalPath	()Ljava/lang/String;
    //   99: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: ldc 218
    //   104: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: invokestatic 112	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: ldc 191
    //   115: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: aconst_null
    //   119: astore_1
    //   120: goto -61 -> 59
    //   123: new 176	java/lang/StringBuilder
    //   126: astore_3
    //   127: aload_3
    //   128: ldc 220
    //   130: invokespecial 181	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   133: ldc 75
    //   135: aload_3
    //   136: aload_1
    //   137: invokevirtual 216	java/io/File:getCanonicalPath	()Ljava/lang/String;
    //   140: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: invokestatic 83	com/tencent/smtt/utils/TbsLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   149: ldc 191
    //   151: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: goto -95 -> 59
    //   157: astore_3
    //   158: aconst_null
    //   159: astore_1
    //   160: new 164	java/io/StringWriter
    //   163: dup
    //   164: invokespecial 165	java/io/StringWriter:<init>	()V
    //   167: astore 4
    //   169: aload_3
    //   170: new 167	java/io/PrintWriter
    //   173: dup
    //   174: aload 4
    //   176: invokespecial 170	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   179: invokevirtual 174	java/lang/Throwable:printStackTrace	(Ljava/io/PrintWriter;)V
    //   182: ldc 75
    //   184: new 176	java/lang/StringBuilder
    //   187: dup
    //   188: ldc 222
    //   190: invokespecial 181	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   193: aload 4
    //   195: invokevirtual 185	java/io/StringWriter:toString	()Ljava/lang/String;
    //   198: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   204: invokestatic 112	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   207: goto -58 -> 149
    //   210: astore_3
    //   211: goto -51 -> 160
    //
    // Exception table:
    //   from	to	target	type
    //   5	48	157	java/lang/Throwable
    //   61	113	157	java/lang/Throwable
    //   123	149	210	java/lang/Throwable
  }

  public String b()
  {
    return this.d;
  }

  public String c()
  {
    return this.g;
  }

  public String d()
  {
    return this.h;
  }

  public String e()
  {
    return this.i;
  }

  public String f()
  {
    return this.e;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.v
 * JD-Core Version:    0.6.2
 */