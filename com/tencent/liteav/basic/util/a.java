package com.tencent.liteav.basic.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;

public class a
{
  @TargetApi(18)
  public static long a(StatFs paramStatFs)
  {
    AppMethodBeat.i(66031);
    if (Build.VERSION.SDK_INT >= 18);
    for (long l = paramStatFs.getAvailableBytes(); ; l = paramStatFs.getAvailableBlocks() * paramStatFs.getBlockSize())
    {
      AppMethodBeat.o(66031);
      return l;
    }
  }

  // ERROR //
  public static void a(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 44
    //   2: invokestatic 16	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 46	java/io/File
    //   8: astore_2
    //   9: aload_2
    //   10: aload_0
    //   11: invokespecial 50	java/io/File:<init>	(Ljava/lang/String;)V
    //   14: new 52	java/io/FileOutputStream
    //   17: astore_0
    //   18: aload_0
    //   19: aload_2
    //   20: invokespecial 55	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   23: new 57	java/io/BufferedOutputStream
    //   26: astore_2
    //   27: aload_2
    //   28: aload_0
    //   29: invokespecial 60	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   32: aload_2
    //   33: aload_1
    //   34: invokevirtual 64	java/io/BufferedOutputStream:write	([B)V
    //   37: aload_2
    //   38: invokevirtual 68	java/io/BufferedOutputStream:close	()V
    //   41: aload_0
    //   42: invokevirtual 69	java/io/FileOutputStream:close	()V
    //   45: ldc 44
    //   47: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   50: return
    //   51: astore_0
    //   52: ldc 44
    //   54: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   57: goto -7 -> 50
    //   60: astore_0
    //   61: aconst_null
    //   62: astore_1
    //   63: aconst_null
    //   64: astore_0
    //   65: aload_0
    //   66: ifnull +7 -> 73
    //   69: aload_0
    //   70: invokevirtual 68	java/io/BufferedOutputStream:close	()V
    //   73: aload_1
    //   74: ifnull +7 -> 81
    //   77: aload_1
    //   78: invokevirtual 69	java/io/FileOutputStream:close	()V
    //   81: ldc 44
    //   83: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   86: goto -36 -> 50
    //   89: astore_0
    //   90: ldc 44
    //   92: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   95: goto -45 -> 50
    //   98: astore_0
    //   99: aconst_null
    //   100: astore_1
    //   101: aconst_null
    //   102: astore_2
    //   103: aload_2
    //   104: ifnull +7 -> 111
    //   107: aload_2
    //   108: invokevirtual 68	java/io/BufferedOutputStream:close	()V
    //   111: aload_1
    //   112: ifnull +7 -> 119
    //   115: aload_1
    //   116: invokevirtual 69	java/io/FileOutputStream:close	()V
    //   119: ldc 44
    //   121: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: aload_0
    //   125: athrow
    //   126: astore_1
    //   127: goto -8 -> 119
    //   130: astore_1
    //   131: aload_0
    //   132: astore_2
    //   133: aconst_null
    //   134: astore_3
    //   135: aload_1
    //   136: astore_0
    //   137: aload_2
    //   138: astore_1
    //   139: aload_3
    //   140: astore_2
    //   141: goto -38 -> 103
    //   144: astore_3
    //   145: aload_0
    //   146: astore_1
    //   147: aload_3
    //   148: astore_0
    //   149: goto -46 -> 103
    //   152: astore_1
    //   153: aconst_null
    //   154: astore_2
    //   155: aload_0
    //   156: astore_1
    //   157: aload_2
    //   158: astore_0
    //   159: goto -94 -> 65
    //   162: astore_1
    //   163: aload_0
    //   164: astore_1
    //   165: aload_2
    //   166: astore_0
    //   167: goto -102 -> 65
    //
    // Exception table:
    //   from	to	target	type
    //   37	45	51	java/lang/Exception
    //   5	23	60	java/lang/Exception
    //   69	73	89	java/lang/Exception
    //   77	81	89	java/lang/Exception
    //   5	23	98	finally
    //   107	111	126	java/lang/Exception
    //   115	119	126	java/lang/Exception
    //   23	32	130	finally
    //   32	37	144	finally
    //   23	32	152	java/lang/Exception
    //   32	37	162	java/lang/Exception
  }

  public static boolean a(long paramLong)
  {
    AppMethodBeat.i(66032);
    boolean bool;
    if (a(new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath())) > paramLong)
    {
      bool = true;
      AppMethodBeat.o(66032);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(66032);
    }
  }

  public static boolean a(Context paramContext)
  {
    AppMethodBeat.i(66030);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(66030);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramContext = paramContext.getActiveNetworkInfo();
      if ((paramContext != null) && (paramContext.isConnectedOrConnecting()))
      {
        bool = true;
        AppMethodBeat.o(66030);
      }
      else
      {
        AppMethodBeat.o(66030);
        bool = false;
      }
    }
  }

  public static boolean a(Context paramContext, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(66036);
    paramContext = paramContext.getAssets();
    try
    {
      paramContext = paramContext.list("");
      for (int i = 0; i < paramContext.length; i++)
        if (paramContext[i].equals(paramString.trim()))
        {
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>();
          TXCLog.i("isAssetFileExists", paramString + " exist");
          bool = true;
          AppMethodBeat.o(66036);
          return bool;
        }
    }
    catch (IOException paramContext)
    {
      while (true)
      {
        TXCLog.i("isAssetFileExists", paramString + " not exist");
        AppMethodBeat.o(66036);
        continue;
        TXCLog.i("isAssetFileExists", paramString + " not exist");
        AppMethodBeat.o(66036);
      }
    }
  }

  public static boolean a(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(66033);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(66033);
    while (true)
    {
      return bool;
      paramString = new File(paramString);
      if ((paramString.exists()) && (paramString.isFile()))
      {
        bool = true;
        AppMethodBeat.o(66033);
      }
      else
      {
        AppMethodBeat.o(66033);
      }
    }
  }

  // ERROR //
  public static String b(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 170
    //   2: invokestatic 16	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_2
    //   7: aload_0
    //   8: invokevirtual 114	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   11: aload_1
    //   12: invokevirtual 174	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   15: astore_0
    //   16: aload_0
    //   17: invokevirtual 179	java/io/InputStream:available	()I
    //   20: newarray byte
    //   22: astore_2
    //   23: aload_0
    //   24: aload_2
    //   25: invokevirtual 183	java/io/InputStream:read	([B)I
    //   28: ifgt +23 -> 51
    //   31: ldc 116
    //   33: astore_1
    //   34: aload_0
    //   35: ifnull +7 -> 42
    //   38: aload_0
    //   39: invokevirtual 184	java/io/InputStream:close	()V
    //   42: ldc 170
    //   44: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   47: aload_1
    //   48: astore_0
    //   49: aload_0
    //   50: areturn
    //   51: aload_0
    //   52: invokevirtual 184	java/io/InputStream:close	()V
    //   55: new 124	java/lang/String
    //   58: astore_1
    //   59: aload_1
    //   60: aload_2
    //   61: ldc 186
    //   63: invokespecial 189	java/lang/String:<init>	([BLjava/lang/String;)V
    //   66: aload_0
    //   67: ifnull +7 -> 74
    //   70: aload_0
    //   71: invokevirtual 184	java/io/InputStream:close	()V
    //   74: ldc 170
    //   76: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   79: aload_1
    //   80: astore_0
    //   81: goto -32 -> 49
    //   84: astore_0
    //   85: aload_2
    //   86: astore_0
    //   87: aload_0
    //   88: ifnull +7 -> 95
    //   91: aload_0
    //   92: invokevirtual 184	java/io/InputStream:close	()V
    //   95: ldc 116
    //   97: astore_0
    //   98: ldc 170
    //   100: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: goto -54 -> 49
    //   106: astore_0
    //   107: aconst_null
    //   108: astore_2
    //   109: aload_2
    //   110: ifnull +7 -> 117
    //   113: aload_2
    //   114: invokevirtual 184	java/io/InputStream:close	()V
    //   117: ldc 170
    //   119: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: aload_0
    //   123: athrow
    //   124: astore_0
    //   125: goto -83 -> 42
    //   128: astore_0
    //   129: goto -55 -> 74
    //   132: astore_0
    //   133: goto -38 -> 95
    //   136: astore_1
    //   137: goto -20 -> 117
    //   140: astore_1
    //   141: aload_0
    //   142: astore_2
    //   143: aload_1
    //   144: astore_0
    //   145: goto -36 -> 109
    //   148: astore_1
    //   149: goto -62 -> 87
    //
    // Exception table:
    //   from	to	target	type
    //   7	16	84	java/io/IOException
    //   7	16	106	finally
    //   38	42	124	java/io/IOException
    //   70	74	128	java/io/IOException
    //   91	95	132	java/io/IOException
    //   113	117	136	java/io/IOException
    //   16	31	140	finally
    //   51	66	140	finally
    //   16	31	148	java/io/IOException
    //   51	66	148	java/io/IOException
  }

  // ERROR //
  public static String b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 191
    //   4: invokestatic 16	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 46	java/io/File
    //   10: dup
    //   11: aload_0
    //   12: invokespecial 50	java/io/File:<init>	(Ljava/lang/String;)V
    //   15: astore_2
    //   16: new 133	java/lang/StringBuilder
    //   19: dup
    //   20: ldc 116
    //   22: invokespecial 192	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   25: astore_3
    //   26: aload_2
    //   27: invokevirtual 167	java/io/File:isFile	()Z
    //   30: ifne +12 -> 42
    //   33: ldc 191
    //   35: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: aload_1
    //   39: astore_0
    //   40: aload_0
    //   41: areturn
    //   42: new 194	java/io/InputStreamReader
    //   45: astore_0
    //   46: new 196	java/io/FileInputStream
    //   49: astore_1
    //   50: aload_1
    //   51: aload_2
    //   52: invokespecial 197	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   55: aload_0
    //   56: aload_1
    //   57: invokespecial 200	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   60: new 202	java/io/BufferedReader
    //   63: astore_1
    //   64: aload_1
    //   65: aload_0
    //   66: invokespecial 205	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   69: aload_1
    //   70: astore_0
    //   71: aload_1
    //   72: invokevirtual 208	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   75: astore_2
    //   76: aload_2
    //   77: ifnull +57 -> 134
    //   80: aload_1
    //   81: astore_0
    //   82: aload_3
    //   83: aload_2
    //   84: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: goto -19 -> 69
    //   91: astore_3
    //   92: aload_1
    //   93: astore_0
    //   94: new 210	java/lang/RuntimeException
    //   97: astore_2
    //   98: aload_1
    //   99: astore_0
    //   100: aload_2
    //   101: ldc 212
    //   103: aload_3
    //   104: invokespecial 215	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   107: aload_1
    //   108: astore_0
    //   109: ldc 191
    //   111: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: aload_1
    //   115: astore_0
    //   116: aload_2
    //   117: athrow
    //   118: astore_1
    //   119: aload_0
    //   120: ifnull +7 -> 127
    //   123: aload_0
    //   124: invokevirtual 216	java/io/BufferedReader:close	()V
    //   127: ldc 191
    //   129: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: aload_1
    //   133: athrow
    //   134: aload_1
    //   135: astore_0
    //   136: aload_1
    //   137: invokevirtual 216	java/io/BufferedReader:close	()V
    //   140: aload_1
    //   141: astore_0
    //   142: aload_3
    //   143: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: astore_3
    //   147: aload_3
    //   148: astore_0
    //   149: aload_1
    //   150: invokevirtual 216	java/io/BufferedReader:close	()V
    //   153: ldc 191
    //   155: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   158: goto -118 -> 40
    //   161: astore_0
    //   162: new 210	java/lang/RuntimeException
    //   165: dup
    //   166: ldc 212
    //   168: aload_0
    //   169: invokespecial 215	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   172: astore_0
    //   173: ldc 191
    //   175: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: aload_0
    //   179: athrow
    //   180: astore_0
    //   181: new 210	java/lang/RuntimeException
    //   184: dup
    //   185: ldc 212
    //   187: aload_0
    //   188: invokespecial 215	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   191: astore_0
    //   192: ldc 191
    //   194: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   197: aload_0
    //   198: athrow
    //   199: astore_1
    //   200: aconst_null
    //   201: astore_0
    //   202: goto -83 -> 119
    //   205: astore_3
    //   206: aconst_null
    //   207: astore_1
    //   208: goto -116 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   71	76	91	java/io/IOException
    //   82	88	91	java/io/IOException
    //   136	140	91	java/io/IOException
    //   142	147	91	java/io/IOException
    //   71	76	118	finally
    //   82	88	118	finally
    //   94	98	118	finally
    //   100	107	118	finally
    //   109	114	118	finally
    //   116	118	118	finally
    //   136	140	118	finally
    //   142	147	118	finally
    //   149	153	161	java/io/IOException
    //   123	127	180	java/io/IOException
    //   42	69	199	finally
    //   42	69	205	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.util.a
 * JD-Core Version:    0.6.2
 */