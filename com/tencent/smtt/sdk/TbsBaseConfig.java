package com.tencent.smtt.sdk;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class TbsBaseConfig
{
  public static final String TAG = "TbsBaseConfig";
  Map<String, String> a;
  private Context b;

  private static File a(Context paramContext, String paramString)
  {
    Object localObject = null;
    an.a();
    paramContext = an.t(paramContext);
    if (paramContext == null)
      paramContext = localObject;
    while (true)
    {
      return paramContext;
      paramContext = new File(paramContext, paramString);
      if (!paramContext.exists())
        try
        {
          paramContext.createNewFile();
        }
        catch (IOException paramContext)
        {
          paramContext = localObject;
        }
    }
  }

  public void clear()
  {
    this.a.clear();
    commit();
  }

  public void commit()
  {
    try
    {
      writeTbsDownloadInfo();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public abstract String getConfigFileName();

  public void init(Context paramContext)
  {
    this.a = new HashMap();
    this.b = paramContext.getApplicationContext();
    if (this.b == null)
      this.b = paramContext;
    refreshSyncMap(paramContext);
  }

  // ERROR //
  public void refreshSyncMap(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: getfield 70	com/tencent/smtt/sdk/TbsBaseConfig:b	Landroid/content/Context;
    //   8: aload_0
    //   9: invokevirtual 79	com/tencent/smtt/sdk/TbsBaseConfig:getConfigFileName	()Ljava/lang/String;
    //   12: invokestatic 81	com/tencent/smtt/sdk/TbsBaseConfig:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +6 -> 23
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_0
    //   24: getfield 45	com/tencent/smtt/sdk/TbsBaseConfig:a	Ljava/util/Map;
    //   27: invokeinterface 49 1 0
    //   32: new 83	java/io/FileInputStream
    //   35: astore_3
    //   36: aload_3
    //   37: aload_1
    //   38: invokespecial 86	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   41: new 88	java/io/BufferedInputStream
    //   44: astore_1
    //   45: aload_1
    //   46: aload_3
    //   47: invokespecial 91	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   50: new 93	java/util/Properties
    //   53: astore_3
    //   54: aload_3
    //   55: invokespecial 94	java/util/Properties:<init>	()V
    //   58: aload_3
    //   59: aload_1
    //   60: invokevirtual 97	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   63: aload_3
    //   64: invokevirtual 101	java/util/Properties:stringPropertyNames	()Ljava/util/Set;
    //   67: invokeinterface 107 1 0
    //   72: astore 4
    //   74: aload 4
    //   76: invokeinterface 112 1 0
    //   81: ifeq +49 -> 130
    //   84: aload 4
    //   86: invokeinterface 116 1 0
    //   91: checkcast 118	java/lang/String
    //   94: astore_2
    //   95: aload_0
    //   96: getfield 45	com/tencent/smtt/sdk/TbsBaseConfig:a	Ljava/util/Map;
    //   99: aload_2
    //   100: aload_3
    //   101: aload_2
    //   102: invokevirtual 122	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   105: invokeinterface 126 3 0
    //   110: pop
    //   111: goto -37 -> 74
    //   114: astore_2
    //   115: aload_1
    //   116: ifnull -96 -> 20
    //   119: aload_1
    //   120: invokevirtual 129	java/io/BufferedInputStream:close	()V
    //   123: goto -103 -> 20
    //   126: astore_1
    //   127: goto -107 -> 20
    //   130: aload_1
    //   131: invokevirtual 129	java/io/BufferedInputStream:close	()V
    //   134: goto -114 -> 20
    //   137: astore_1
    //   138: goto -118 -> 20
    //   141: astore_1
    //   142: aconst_null
    //   143: astore_3
    //   144: aload_3
    //   145: ifnull +7 -> 152
    //   148: aload_3
    //   149: invokevirtual 129	java/io/BufferedInputStream:close	()V
    //   152: aload_1
    //   153: athrow
    //   154: astore_1
    //   155: aload_0
    //   156: monitorexit
    //   157: aload_1
    //   158: athrow
    //   159: astore_2
    //   160: goto -8 -> 152
    //   163: astore_2
    //   164: aload_1
    //   165: astore_3
    //   166: aload_2
    //   167: astore_1
    //   168: goto -24 -> 144
    //   171: astore_1
    //   172: aload_2
    //   173: astore_1
    //   174: goto -59 -> 115
    //
    // Exception table:
    //   from	to	target	type
    //   50	74	114	java/lang/Throwable
    //   74	111	114	java/lang/Throwable
    //   119	123	126	java/lang/Exception
    //   130	134	137	java/lang/Exception
    //   4	16	141	finally
    //   23	50	141	finally
    //   119	123	154	finally
    //   130	134	154	finally
    //   148	152	154	finally
    //   152	154	154	finally
    //   148	152	159	java/lang/Exception
    //   50	74	163	finally
    //   74	111	163	finally
    //   4	16	171	java/lang/Throwable
    //   23	50	171	java/lang/Throwable
  }

  // ERROR //
  public void writeTbsDownloadInfo()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 8
    //   4: ldc 131
    //   6: invokestatic 137	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   9: aload_0
    //   10: getfield 70	com/tencent/smtt/sdk/TbsBaseConfig:b	Landroid/content/Context;
    //   13: aload_0
    //   14: invokevirtual 79	com/tencent/smtt/sdk/TbsBaseConfig:getConfigFileName	()Ljava/lang/String;
    //   17: invokestatic 81	com/tencent/smtt/sdk/TbsBaseConfig:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   20: astore_1
    //   21: aload_1
    //   22: ifnonnull +6 -> 28
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: new 83	java/io/FileInputStream
    //   31: astore_2
    //   32: aload_2
    //   33: aload_1
    //   34: invokespecial 86	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   37: new 88	java/io/BufferedInputStream
    //   40: astore_3
    //   41: aload_3
    //   42: aload_2
    //   43: invokespecial 91	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   46: new 93	java/util/Properties
    //   49: astore_2
    //   50: aload_2
    //   51: invokespecial 94	java/util/Properties:<init>	()V
    //   54: aload_2
    //   55: aload_3
    //   56: invokevirtual 97	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   59: aload_2
    //   60: invokevirtual 138	java/util/Properties:clear	()V
    //   63: aload_0
    //   64: getfield 45	com/tencent/smtt/sdk/TbsBaseConfig:a	Ljava/util/Map;
    //   67: invokeinterface 141 1 0
    //   72: invokeinterface 107 1 0
    //   77: astore 4
    //   79: aload 4
    //   81: invokeinterface 112 1 0
    //   86: ifeq +106 -> 192
    //   89: aload 4
    //   91: invokeinterface 116 1 0
    //   96: checkcast 118	java/lang/String
    //   99: astore 5
    //   101: aload_0
    //   102: getfield 45	com/tencent/smtt/sdk/TbsBaseConfig:a	Ljava/util/Map;
    //   105: aload 5
    //   107: invokeinterface 145 2 0
    //   112: astore 6
    //   114: aload_2
    //   115: aload 5
    //   117: aload 6
    //   119: invokestatic 149	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   122: invokevirtual 153	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   125: pop
    //   126: new 155	java/lang/StringBuilder
    //   129: astore 7
    //   131: aload 7
    //   133: ldc 157
    //   135: invokespecial 160	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   138: ldc 8
    //   140: aload 7
    //   142: aload 5
    //   144: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: ldc 166
    //   149: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload 6
    //   154: invokevirtual 169	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   157: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: invokestatic 137	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   163: goto -84 -> 79
    //   166: astore_1
    //   167: aconst_null
    //   168: astore_1
    //   169: aload_3
    //   170: ifnull +7 -> 177
    //   173: aload_3
    //   174: invokevirtual 129	java/io/BufferedInputStream:close	()V
    //   177: aload_1
    //   178: ifnull -153 -> 25
    //   181: aload_1
    //   182: invokevirtual 175	java/io/BufferedOutputStream:close	()V
    //   185: goto -160 -> 25
    //   188: astore_1
    //   189: goto -164 -> 25
    //   192: aload_0
    //   193: getfield 45	com/tencent/smtt/sdk/TbsBaseConfig:a	Ljava/util/Map;
    //   196: invokeinterface 49 1 0
    //   201: new 177	java/io/FileOutputStream
    //   204: astore 7
    //   206: aload 7
    //   208: aload_1
    //   209: invokespecial 178	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   212: new 174	java/io/BufferedOutputStream
    //   215: dup
    //   216: aload 7
    //   218: invokespecial 181	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   221: astore_1
    //   222: aload_2
    //   223: aload_1
    //   224: aconst_null
    //   225: invokevirtual 185	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   228: aload_3
    //   229: invokevirtual 129	java/io/BufferedInputStream:close	()V
    //   232: aload_1
    //   233: invokevirtual 175	java/io/BufferedOutputStream:close	()V
    //   236: goto -211 -> 25
    //   239: astore_1
    //   240: goto -215 -> 25
    //   243: astore_1
    //   244: aconst_null
    //   245: astore_3
    //   246: aconst_null
    //   247: astore_2
    //   248: aload_2
    //   249: ifnull +7 -> 256
    //   252: aload_2
    //   253: invokevirtual 129	java/io/BufferedInputStream:close	()V
    //   256: aload_3
    //   257: ifnull +7 -> 264
    //   260: aload_3
    //   261: invokevirtual 175	java/io/BufferedOutputStream:close	()V
    //   264: aload_1
    //   265: athrow
    //   266: astore_1
    //   267: aload_0
    //   268: monitorexit
    //   269: aload_1
    //   270: athrow
    //   271: astore_3
    //   272: goto -40 -> 232
    //   275: astore_3
    //   276: goto -99 -> 177
    //   279: astore_2
    //   280: goto -24 -> 256
    //   283: astore_3
    //   284: goto -20 -> 264
    //   287: astore_1
    //   288: aconst_null
    //   289: astore 7
    //   291: aload_3
    //   292: astore_2
    //   293: aload 7
    //   295: astore_3
    //   296: goto -48 -> 248
    //   299: astore 6
    //   301: aload_1
    //   302: astore 7
    //   304: aload_3
    //   305: astore_2
    //   306: aload 6
    //   308: astore_1
    //   309: aload 7
    //   311: astore_3
    //   312: goto -64 -> 248
    //   315: astore_1
    //   316: aconst_null
    //   317: astore_1
    //   318: aconst_null
    //   319: astore_3
    //   320: goto -151 -> 169
    //   323: astore_2
    //   324: goto -155 -> 169
    //
    // Exception table:
    //   from	to	target	type
    //   46	79	166	java/lang/Throwable
    //   79	163	166	java/lang/Throwable
    //   192	222	166	java/lang/Throwable
    //   181	185	188	java/lang/Exception
    //   232	236	239	java/lang/Exception
    //   9	21	243	finally
    //   28	46	243	finally
    //   2	9	266	finally
    //   173	177	266	finally
    //   181	185	266	finally
    //   228	232	266	finally
    //   232	236	266	finally
    //   252	256	266	finally
    //   260	264	266	finally
    //   264	266	266	finally
    //   228	232	271	java/lang/Exception
    //   173	177	275	java/lang/Exception
    //   252	256	279	java/lang/Exception
    //   260	264	283	java/lang/Exception
    //   46	79	287	finally
    //   79	163	287	finally
    //   192	222	287	finally
    //   222	228	299	finally
    //   9	21	315	java/lang/Throwable
    //   28	46	315	java/lang/Throwable
    //   222	228	323	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsBaseConfig
 * JD-Core Version:    0.6.2
 */