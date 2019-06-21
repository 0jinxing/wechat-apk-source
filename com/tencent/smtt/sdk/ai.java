package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

class ai
{
  private static ai a = null;
  private static Context b = null;

  static ai a(Context paramContext)
  {
    AppMethodBeat.i(64302);
    if (a == null);
    try
    {
      if (a == null)
      {
        ai localai = new com/tencent/smtt/sdk/ai;
        localai.<init>();
        a = localai;
      }
      b = paramContext.getApplicationContext();
      paramContext = a;
      AppMethodBeat.o(64302);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(64302);
    }
    throw paramContext;
  }

  // ERROR //
  private Properties e()
  {
    // Byte code:
    //   0: ldc 43
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokevirtual 46	com/tencent/smtt/sdk/ai:a	()Ljava/io/File;
    //   9: astore_1
    //   10: new 48	java/util/Properties
    //   13: astore_2
    //   14: aload_2
    //   15: invokespecial 49	java/util/Properties:<init>	()V
    //   18: aload_1
    //   19: ifnull +118 -> 137
    //   22: new 51	java/io/FileInputStream
    //   25: astore_3
    //   26: aload_3
    //   27: aload_1
    //   28: invokespecial 54	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   31: new 56	java/io/BufferedInputStream
    //   34: astore_1
    //   35: aload_1
    //   36: aload_3
    //   37: invokespecial 59	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   40: aload_2
    //   41: aload_1
    //   42: invokevirtual 62	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   45: aload_1
    //   46: ifnull +7 -> 53
    //   49: aload_1
    //   50: invokevirtual 65	java/io/BufferedInputStream:close	()V
    //   53: ldc 43
    //   55: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: aload_2
    //   59: astore_1
    //   60: aload_1
    //   61: areturn
    //   62: astore_1
    //   63: aconst_null
    //   64: astore_1
    //   65: aconst_null
    //   66: astore_3
    //   67: aload_3
    //   68: ifnull +7 -> 75
    //   71: aload_3
    //   72: invokevirtual 65	java/io/BufferedInputStream:close	()V
    //   75: ldc 43
    //   77: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: goto -20 -> 60
    //   83: astore_1
    //   84: aconst_null
    //   85: astore_2
    //   86: aload_2
    //   87: ifnull +7 -> 94
    //   90: aload_2
    //   91: invokevirtual 65	java/io/BufferedInputStream:close	()V
    //   94: ldc 43
    //   96: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   99: aload_1
    //   100: athrow
    //   101: astore_1
    //   102: goto -49 -> 53
    //   105: astore_3
    //   106: goto -31 -> 75
    //   109: astore_3
    //   110: goto -16 -> 94
    //   113: astore_3
    //   114: aload_1
    //   115: astore_2
    //   116: aload_3
    //   117: astore_1
    //   118: goto -32 -> 86
    //   121: astore_1
    //   122: aconst_null
    //   123: astore_3
    //   124: aload_2
    //   125: astore_1
    //   126: goto -59 -> 67
    //   129: astore_3
    //   130: aload_1
    //   131: astore_3
    //   132: aload_2
    //   133: astore_1
    //   134: goto -67 -> 67
    //   137: aconst_null
    //   138: astore_1
    //   139: goto -94 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   5	18	62	java/lang/Exception
    //   5	18	83	finally
    //   22	40	83	finally
    //   49	53	101	java/io/IOException
    //   71	75	105	java/io/IOException
    //   90	94	109	java/io/IOException
    //   40	45	113	finally
    //   22	40	121	java/lang/Exception
    //   40	45	129	java/lang/Exception
  }

  File a()
  {
    AppMethodBeat.i(64304);
    an.a();
    File localFile = new File(an.t(b), "tbscoreinstall.txt");
    if (!localFile.exists());
    try
    {
      localFile.createNewFile();
      AppMethodBeat.o(64304);
      return localFile;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(64304);
      }
    }
  }

  void a(int paramInt)
  {
    AppMethodBeat.i(64308);
    a("dexopt_retry_num", paramInt);
    AppMethodBeat.o(64308);
  }

  void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(64303);
    a("copy_core_ver", paramInt1);
    a("copy_status", paramInt2);
    AppMethodBeat.o(64303);
  }

  void a(String paramString)
  {
    AppMethodBeat.i(64310);
    a("install_apk_path", paramString);
    AppMethodBeat.o(64310);
  }

  void a(String paramString, int paramInt)
  {
    AppMethodBeat.i(64317);
    a(paramString, String.valueOf(paramInt));
    AppMethodBeat.o(64317);
  }

  // ERROR //
  void a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 116
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_3
    //   7: aload_0
    //   8: invokespecial 118	com/tencent/smtt/sdk/ai:e	()Ljava/util/Properties;
    //   11: astore 4
    //   13: aload_3
    //   14: astore 5
    //   16: aload 4
    //   18: ifnull +70 -> 88
    //   21: aload 4
    //   23: aload_1
    //   24: aload_2
    //   25: invokevirtual 122	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   28: pop
    //   29: aload_0
    //   30: invokevirtual 46	com/tencent/smtt/sdk/ai:a	()Ljava/io/File;
    //   33: astore 6
    //   35: aload_3
    //   36: astore 5
    //   38: aload 6
    //   40: ifnull +48 -> 88
    //   43: new 124	java/io/FileOutputStream
    //   46: astore_2
    //   47: aload_2
    //   48: aload 6
    //   50: invokespecial 125	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   53: new 127	java/lang/StringBuilder
    //   56: astore 5
    //   58: aload 5
    //   60: ldc 129
    //   62: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   65: aload 4
    //   67: aload_2
    //   68: aload 5
    //   70: aload_1
    //   71: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: ldc 137
    //   76: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokevirtual 145	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   85: aload_2
    //   86: astore 5
    //   88: aload 5
    //   90: ifnull +69 -> 159
    //   93: aload 5
    //   95: invokevirtual 146	java/io/FileOutputStream:close	()V
    //   98: ldc 116
    //   100: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: return
    //   104: astore_1
    //   105: ldc 116
    //   107: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   110: goto -7 -> 103
    //   113: astore_1
    //   114: aconst_null
    //   115: astore_2
    //   116: aload_2
    //   117: ifnull +42 -> 159
    //   120: aload_2
    //   121: invokevirtual 146	java/io/FileOutputStream:close	()V
    //   124: ldc 116
    //   126: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: goto -26 -> 103
    //   132: astore_1
    //   133: ldc 116
    //   135: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   138: goto -35 -> 103
    //   141: astore_1
    //   142: aconst_null
    //   143: astore_2
    //   144: aload_2
    //   145: ifnull +7 -> 152
    //   148: aload_2
    //   149: invokevirtual 146	java/io/FileOutputStream:close	()V
    //   152: ldc 116
    //   154: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: aload_1
    //   158: athrow
    //   159: ldc 116
    //   161: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: goto -61 -> 103
    //   167: astore_2
    //   168: goto -16 -> 152
    //   171: astore_1
    //   172: goto -28 -> 144
    //   175: astore_1
    //   176: goto -60 -> 116
    //
    // Exception table:
    //   from	to	target	type
    //   93	98	104	java/io/IOException
    //   7	13	113	java/lang/Exception
    //   21	35	113	java/lang/Exception
    //   43	53	113	java/lang/Exception
    //   120	124	132	java/io/IOException
    //   7	13	141	finally
    //   21	35	141	finally
    //   43	53	141	finally
    //   148	152	167	java/io/IOException
    //   53	85	171	finally
    //   53	85	175	java/lang/Exception
  }

  int b()
  {
    AppMethodBeat.i(64306);
    int i = c("install_core_ver");
    AppMethodBeat.o(64306);
    return i;
  }

  int b(String paramString)
  {
    AppMethodBeat.i(64315);
    Properties localProperties = e();
    int i;
    if ((localProperties != null) && (localProperties.getProperty(paramString) != null))
    {
      i = Integer.parseInt(localProperties.getProperty(paramString));
      AppMethodBeat.o(64315);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(64315);
    }
  }

  void b(int paramInt)
  {
    AppMethodBeat.i(64309);
    a("unzip_retry_num", paramInt);
    AppMethodBeat.o(64309);
  }

  void b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(64311);
    a("install_core_ver", paramInt1);
    a("install_status", paramInt2);
    AppMethodBeat.o(64311);
  }

  int c()
  {
    AppMethodBeat.i(64307);
    int i = b("install_status");
    AppMethodBeat.o(64307);
    return i;
  }

  int c(String paramString)
  {
    AppMethodBeat.i(64318);
    Properties localProperties = e();
    int i;
    if ((localProperties != null) && (localProperties.getProperty(paramString) != null))
    {
      i = Integer.parseInt(localProperties.getProperty(paramString));
      AppMethodBeat.o(64318);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(64318);
    }
  }

  void c(int paramInt)
  {
    AppMethodBeat.i(64312);
    a("incrupdate_status", paramInt);
    AppMethodBeat.o(64312);
  }

  int d()
  {
    AppMethodBeat.i(64313);
    int i = b("incrupdate_status");
    AppMethodBeat.o(64313);
    return i;
  }

  String d(String paramString)
  {
    AppMethodBeat.i(64319);
    Properties localProperties = e();
    if ((localProperties != null) && (localProperties.getProperty(paramString) != null))
    {
      paramString = localProperties.getProperty(paramString);
      AppMethodBeat.o(64319);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(64319);
    }
  }

  void d(int paramInt)
  {
    AppMethodBeat.i(64314);
    a("unlzma_status", paramInt);
    AppMethodBeat.o(64314);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ai
 * JD-Core Version:    0.6.2
 */