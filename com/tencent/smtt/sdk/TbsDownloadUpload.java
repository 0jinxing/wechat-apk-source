package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TbsDownloadUpload
{
  private static TbsDownloadUpload b;
  Map<String, Object> a;
  private Context c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  public SharedPreferences mPreferences;

  public TbsDownloadUpload(Context paramContext)
  {
    AppMethodBeat.i(64339);
    this.a = new HashMap();
    this.mPreferences = paramContext.getSharedPreferences("tbs_download_upload", 4);
    this.c = paramContext.getApplicationContext();
    if (this.c == null)
      this.c = paramContext;
    AppMethodBeat.o(64339);
  }

  private static File a(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(64343);
    an.a();
    paramContext = an.t(paramContext);
    if (paramContext == null)
    {
      AppMethodBeat.o(64343);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      paramContext = new File(paramContext, paramString);
      if (paramContext.exists())
        AppMethodBeat.o(64343);
      else
        try
        {
          paramContext.createNewFile();
          AppMethodBeat.o(64343);
        }
        catch (IOException paramContext)
        {
          AppMethodBeat.o(64343);
          paramContext = localObject;
        }
    }
  }

  public static void clear()
  {
    try
    {
      b = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static TbsDownloadUpload getInstance()
  {
    try
    {
      TbsDownloadUpload localTbsDownloadUpload = b;
      return localTbsDownloadUpload;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static TbsDownloadUpload getInstance(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(64340);
      if (b == null)
      {
        TbsDownloadUpload localTbsDownloadUpload = new com/tencent/smtt/sdk/TbsDownloadUpload;
        localTbsDownloadUpload.<init>(paramContext);
        b = localTbsDownloadUpload;
      }
      paramContext = b;
      AppMethodBeat.o(64340);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public void clearUploadCode()
  {
    AppMethodBeat.i(64341);
    this.a.put("tbs_needdownload_code", Integer.valueOf(0));
    this.a.put("tbs_startdownload_code", Integer.valueOf(0));
    this.a.put("tbs_needdownload_return", Integer.valueOf(0));
    this.a.put("tbs_needdownload_sent", Integer.valueOf(0));
    this.a.put("tbs_startdownload_sent", Integer.valueOf(0));
    this.a.put("tbs_local_core_version", Integer.valueOf(0));
    writeTbsDownloadInfo();
    AppMethodBeat.o(64341);
  }

  public void commit()
  {
    try
    {
      AppMethodBeat.i(64345);
      writeTbsDownloadInfo();
      AppMethodBeat.o(64345);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public int getLocalCoreVersion()
  {
    try
    {
      int j = this.i;
      return j;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public int getNeedDownloadCode()
  {
    try
    {
      int j = this.g;
      if (j == 1);
      for (j = 148; ; j = this.d)
        return j;
    }
    finally
    {
    }
  }

  public int getNeedDownloadReturn()
  {
    try
    {
      int j = this.f;
      return j;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public int getStartDownloadCode()
  {
    try
    {
      int j = this.h;
      if (j == 1);
      for (j = 168; ; j = this.e)
        return j;
    }
    finally
    {
    }
  }

  // ERROR //
  public void readTbsDownloadInfo(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 146
    //   4: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 54	com/tencent/smtt/sdk/TbsDownloadUpload:c	Landroid/content/Context;
    //   11: ldc 148
    //   13: invokestatic 150	com/tencent/smtt/sdk/TbsDownloadUpload:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   16: astore_1
    //   17: aload_1
    //   18: ifnonnull +11 -> 29
    //   21: ldc 146
    //   23: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: new 152	java/io/FileInputStream
    //   32: astore_2
    //   33: aload_2
    //   34: aload_1
    //   35: invokespecial 155	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   38: new 157	java/io/BufferedInputStream
    //   41: astore_1
    //   42: aload_1
    //   43: aload_2
    //   44: invokespecial 160	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   47: new 162	java/util/Properties
    //   50: astore_2
    //   51: aload_2
    //   52: invokespecial 163	java/util/Properties:<init>	()V
    //   55: aload_2
    //   56: aload_1
    //   57: invokevirtual 166	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   60: aload_2
    //   61: ldc 96
    //   63: ldc 168
    //   65: invokevirtual 172	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   68: astore_3
    //   69: ldc 168
    //   71: aload_3
    //   72: invokevirtual 178	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   75: ifne +15 -> 90
    //   78: aload_0
    //   79: aload_3
    //   80: invokestatic 182	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   83: iconst_0
    //   84: invokestatic 188	java/lang/Math:max	(II)I
    //   87: putfield 132	com/tencent/smtt/sdk/TbsDownloadUpload:d	I
    //   90: aload_2
    //   91: ldc 110
    //   93: ldc 168
    //   95: invokevirtual 172	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   98: astore_3
    //   99: ldc 168
    //   101: aload_3
    //   102: invokevirtual 178	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   105: ifne +15 -> 120
    //   108: aload_0
    //   109: aload_3
    //   110: invokestatic 182	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   113: iconst_0
    //   114: invokestatic 188	java/lang/Math:max	(II)I
    //   117: putfield 140	com/tencent/smtt/sdk/TbsDownloadUpload:e	I
    //   120: aload_2
    //   121: ldc 112
    //   123: ldc 168
    //   125: invokevirtual 172	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   128: astore_3
    //   129: ldc 168
    //   131: aload_3
    //   132: invokevirtual 178	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   135: ifne +15 -> 150
    //   138: aload_0
    //   139: aload_3
    //   140: invokestatic 182	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   143: iconst_0
    //   144: invokestatic 188	java/lang/Math:max	(II)I
    //   147: putfield 135	com/tencent/smtt/sdk/TbsDownloadUpload:f	I
    //   150: aload_2
    //   151: ldc 114
    //   153: ldc 168
    //   155: invokevirtual 172	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   158: astore_3
    //   159: ldc 168
    //   161: aload_3
    //   162: invokevirtual 178	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   165: ifne +15 -> 180
    //   168: aload_0
    //   169: aload_3
    //   170: invokestatic 182	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   173: iconst_0
    //   174: invokestatic 188	java/lang/Math:max	(II)I
    //   177: putfield 130	com/tencent/smtt/sdk/TbsDownloadUpload:g	I
    //   180: aload_2
    //   181: ldc 116
    //   183: ldc 168
    //   185: invokevirtual 172	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   188: astore_3
    //   189: ldc 168
    //   191: aload_3
    //   192: invokevirtual 178	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   195: ifne +15 -> 210
    //   198: aload_0
    //   199: aload_3
    //   200: invokestatic 182	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   203: iconst_0
    //   204: invokestatic 188	java/lang/Math:max	(II)I
    //   207: putfield 138	com/tencent/smtt/sdk/TbsDownloadUpload:h	I
    //   210: aload_2
    //   211: ldc 118
    //   213: ldc 168
    //   215: invokevirtual 172	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   218: astore_2
    //   219: ldc 168
    //   221: aload_2
    //   222: invokevirtual 178	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   225: ifne +15 -> 240
    //   228: aload_0
    //   229: aload_2
    //   230: invokestatic 182	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   233: iconst_0
    //   234: invokestatic 188	java/lang/Math:max	(II)I
    //   237: putfield 127	com/tencent/smtt/sdk/TbsDownloadUpload:i	I
    //   240: aload_1
    //   241: invokevirtual 191	java/io/BufferedInputStream:close	()V
    //   244: ldc 146
    //   246: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   249: goto -223 -> 26
    //   252: astore_1
    //   253: aload_0
    //   254: monitorexit
    //   255: aload_1
    //   256: athrow
    //   257: astore_1
    //   258: ldc 146
    //   260: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   263: goto -237 -> 26
    //   266: astore_1
    //   267: aconst_null
    //   268: astore_1
    //   269: aload_1
    //   270: ifnull +7 -> 277
    //   273: aload_1
    //   274: invokevirtual 191	java/io/BufferedInputStream:close	()V
    //   277: ldc 146
    //   279: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   282: goto -256 -> 26
    //   285: astore_1
    //   286: ldc 146
    //   288: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   291: goto -265 -> 26
    //   294: astore_1
    //   295: aconst_null
    //   296: astore_2
    //   297: aload_2
    //   298: ifnull +7 -> 305
    //   301: aload_2
    //   302: invokevirtual 191	java/io/BufferedInputStream:close	()V
    //   305: ldc 146
    //   307: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   310: aload_1
    //   311: athrow
    //   312: astore_2
    //   313: goto -8 -> 305
    //   316: astore_2
    //   317: aload_1
    //   318: astore_3
    //   319: aload_2
    //   320: astore_1
    //   321: aload_3
    //   322: astore_2
    //   323: goto -26 -> 297
    //   326: astore_2
    //   327: goto -58 -> 269
    //
    // Exception table:
    //   from	to	target	type
    //   2	7	252	finally
    //   21	26	252	finally
    //   240	244	252	finally
    //   244	249	252	finally
    //   258	263	252	finally
    //   273	277	252	finally
    //   277	282	252	finally
    //   286	291	252	finally
    //   301	305	252	finally
    //   305	312	252	finally
    //   240	244	257	java/lang/Exception
    //   7	17	266	java/lang/Throwable
    //   29	47	266	java/lang/Throwable
    //   273	277	285	java/lang/Exception
    //   7	17	294	finally
    //   29	47	294	finally
    //   301	305	312	java/lang/Exception
    //   47	90	316	finally
    //   90	120	316	finally
    //   120	150	316	finally
    //   150	180	316	finally
    //   180	210	316	finally
    //   210	240	316	finally
    //   47	90	326	java/lang/Throwable
    //   90	120	326	java/lang/Throwable
    //   120	150	326	java/lang/Throwable
    //   150	180	326	java/lang/Throwable
    //   180	210	326	java/lang/Throwable
    //   210	240	326	java/lang/Throwable
  }

  // ERROR //
  public void writeTbsDownloadInfo()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 192
    //   4: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: ldc 194
    //   9: ldc 196
    //   11: invokestatic 201	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 54	com/tencent/smtt/sdk/TbsDownloadUpload:c	Landroid/content/Context;
    //   18: ldc 148
    //   20: invokestatic 150	com/tencent/smtt/sdk/TbsDownloadUpload:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   23: astore_1
    //   24: aload_1
    //   25: ifnonnull +11 -> 36
    //   28: ldc 192
    //   30: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: aload_0
    //   34: monitorexit
    //   35: return
    //   36: new 152	java/io/FileInputStream
    //   39: astore_2
    //   40: aload_2
    //   41: aload_1
    //   42: invokespecial 155	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   45: new 157	java/io/BufferedInputStream
    //   48: astore_3
    //   49: aload_3
    //   50: aload_2
    //   51: invokespecial 160	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   54: new 162	java/util/Properties
    //   57: astore_2
    //   58: aload_2
    //   59: invokespecial 163	java/util/Properties:<init>	()V
    //   62: aload_2
    //   63: aload_3
    //   64: invokevirtual 166	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   67: aload_0
    //   68: getfield 38	com/tencent/smtt/sdk/TbsDownloadUpload:a	Ljava/util/Map;
    //   71: invokeinterface 205 1 0
    //   76: invokeinterface 211 1 0
    //   81: astore 4
    //   83: aload 4
    //   85: invokeinterface 216 1 0
    //   90: ifeq +112 -> 202
    //   93: aload 4
    //   95: invokeinterface 220 1 0
    //   100: checkcast 174	java/lang/String
    //   103: astore 5
    //   105: aload_0
    //   106: getfield 38	com/tencent/smtt/sdk/TbsDownloadUpload:a	Ljava/util/Map;
    //   109: aload 5
    //   111: invokeinterface 224 2 0
    //   116: astore 6
    //   118: aload_2
    //   119: aload 5
    //   121: aload 6
    //   123: invokestatic 227	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   126: invokevirtual 231	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   129: pop
    //   130: new 233	java/lang/StringBuilder
    //   133: astore 7
    //   135: aload 7
    //   137: ldc 235
    //   139: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   142: ldc 194
    //   144: aload 7
    //   146: aload 5
    //   148: invokevirtual 242	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: ldc 244
    //   153: invokevirtual 242	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: aload 6
    //   158: invokevirtual 247	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   161: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: invokestatic 201	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   167: goto -84 -> 83
    //   170: astore_1
    //   171: aconst_null
    //   172: astore_1
    //   173: aload_3
    //   174: ifnull +7 -> 181
    //   177: aload_3
    //   178: invokevirtual 191	java/io/BufferedInputStream:close	()V
    //   181: aload_1
    //   182: ifnull +7 -> 189
    //   185: aload_1
    //   186: invokevirtual 254	java/io/BufferedOutputStream:close	()V
    //   189: ldc 192
    //   191: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: goto -161 -> 33
    //   197: astore_1
    //   198: aload_0
    //   199: monitorexit
    //   200: aload_1
    //   201: athrow
    //   202: aload_0
    //   203: getfield 38	com/tencent/smtt/sdk/TbsDownloadUpload:a	Ljava/util/Map;
    //   206: invokeinterface 256 1 0
    //   211: new 258	java/io/FileOutputStream
    //   214: astore 7
    //   216: aload 7
    //   218: aload_1
    //   219: invokespecial 259	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   222: new 253	java/io/BufferedOutputStream
    //   225: dup
    //   226: aload 7
    //   228: invokespecial 262	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   231: astore_1
    //   232: aload_2
    //   233: aload_1
    //   234: aconst_null
    //   235: invokevirtual 266	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   238: aload_3
    //   239: invokevirtual 191	java/io/BufferedInputStream:close	()V
    //   242: aload_1
    //   243: invokevirtual 254	java/io/BufferedOutputStream:close	()V
    //   246: ldc 192
    //   248: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   251: goto -218 -> 33
    //   254: astore_1
    //   255: ldc 192
    //   257: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   260: goto -227 -> 33
    //   263: astore_1
    //   264: ldc 192
    //   266: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   269: goto -236 -> 33
    //   272: astore_1
    //   273: aconst_null
    //   274: astore_3
    //   275: aconst_null
    //   276: astore_2
    //   277: aload_2
    //   278: ifnull +7 -> 285
    //   281: aload_2
    //   282: invokevirtual 191	java/io/BufferedInputStream:close	()V
    //   285: aload_3
    //   286: ifnull +7 -> 293
    //   289: aload_3
    //   290: invokevirtual 254	java/io/BufferedOutputStream:close	()V
    //   293: ldc 192
    //   295: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   298: aload_1
    //   299: athrow
    //   300: astore_3
    //   301: goto -59 -> 242
    //   304: astore_3
    //   305: goto -124 -> 181
    //   308: astore_2
    //   309: goto -24 -> 285
    //   312: astore_3
    //   313: goto -20 -> 293
    //   316: astore_1
    //   317: aconst_null
    //   318: astore 7
    //   320: aload_3
    //   321: astore_2
    //   322: aload 7
    //   324: astore_3
    //   325: goto -48 -> 277
    //   328: astore 6
    //   330: aload_1
    //   331: astore 7
    //   333: aload_3
    //   334: astore_2
    //   335: aload 6
    //   337: astore_1
    //   338: aload 7
    //   340: astore_3
    //   341: goto -64 -> 277
    //   344: astore_1
    //   345: aconst_null
    //   346: astore_1
    //   347: aconst_null
    //   348: astore_3
    //   349: goto -176 -> 173
    //   352: astore_2
    //   353: goto -180 -> 173
    //
    // Exception table:
    //   from	to	target	type
    //   54	83	170	java/lang/Throwable
    //   83	167	170	java/lang/Throwable
    //   202	232	170	java/lang/Throwable
    //   2	14	197	finally
    //   28	33	197	finally
    //   177	181	197	finally
    //   185	189	197	finally
    //   189	194	197	finally
    //   238	242	197	finally
    //   242	246	197	finally
    //   246	251	197	finally
    //   255	260	197	finally
    //   264	269	197	finally
    //   281	285	197	finally
    //   289	293	197	finally
    //   293	300	197	finally
    //   242	246	254	java/lang/Exception
    //   185	189	263	java/lang/Exception
    //   14	24	272	finally
    //   36	54	272	finally
    //   238	242	300	java/lang/Exception
    //   177	181	304	java/lang/Exception
    //   281	285	308	java/lang/Exception
    //   289	293	312	java/lang/Exception
    //   54	83	316	finally
    //   83	167	316	finally
    //   202	232	316	finally
    //   232	238	328	finally
    //   14	24	344	java/lang/Throwable
    //   36	54	344	java/lang/Throwable
    //   232	238	352	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsDownloadUpload
 * JD-Core Version:    0.6.2
 */