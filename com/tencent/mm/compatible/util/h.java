package com.tencent.mm.compatible.util;

import android.annotation.TargetApi;
import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

public final class h
{
  private static Boolean evF = null;
  private static Boolean evG = null;
  private static Boolean evH = null;

  // ERROR //
  @java.lang.Deprecated
  public static boolean Ms()
  {
    // Byte code:
    //   0: ldc 23
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 12	com/tencent/mm/compatible/util/h:evF	Ljava/lang/Boolean;
    //   8: ifnonnull +62 -> 70
    //   11: new 31	java/io/FileInputStream
    //   14: astore_0
    //   15: new 33	java/io/File
    //   18: astore_1
    //   19: aload_1
    //   20: invokestatic 39	android/os/Environment:getRootDirectory	()Ljava/io/File;
    //   23: ldc 41
    //   25: invokespecial 45	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   28: aload_0
    //   29: aload_1
    //   30: invokespecial 48	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: aload_0
    //   34: astore_1
    //   35: new 50	java/util/Properties
    //   38: astore_2
    //   39: aload_0
    //   40: astore_1
    //   41: aload_2
    //   42: invokespecial 52	java/util/Properties:<init>	()V
    //   45: aload_0
    //   46: astore_1
    //   47: aload_2
    //   48: aload_0
    //   49: invokevirtual 56	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   52: aload_0
    //   53: astore_1
    //   54: aload_2
    //   55: ldc 58
    //   57: invokevirtual 62	java/util/Properties:containsKey	(Ljava/lang/Object;)Z
    //   60: invokestatic 68	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   63: putstatic 12	com/tencent/mm/compatible/util/h:evF	Ljava/lang/Boolean;
    //   66: aload_0
    //   67: invokevirtual 71	java/io/FileInputStream:close	()V
    //   70: getstatic 12	com/tencent/mm/compatible/util/h:evF	Ljava/lang/Boolean;
    //   73: invokevirtual 74	java/lang/Boolean:booleanValue	()Z
    //   76: istore_3
    //   77: ldc 23
    //   79: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   82: iload_3
    //   83: ireturn
    //   84: astore_2
    //   85: aconst_null
    //   86: astore_0
    //   87: aload_0
    //   88: astore_1
    //   89: ldc 79
    //   91: aload_2
    //   92: ldc 81
    //   94: iconst_0
    //   95: anewarray 4	java/lang/Object
    //   98: invokestatic 87	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: aload_0
    //   102: astore_1
    //   103: getstatic 90	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   106: putstatic 12	com/tencent/mm/compatible/util/h:evF	Ljava/lang/Boolean;
    //   109: aload_0
    //   110: ifnull -40 -> 70
    //   113: aload_0
    //   114: invokevirtual 71	java/io/FileInputStream:close	()V
    //   117: goto -47 -> 70
    //   120: astore_1
    //   121: goto -51 -> 70
    //   124: astore_0
    //   125: aconst_null
    //   126: astore_1
    //   127: aload_1
    //   128: ifnull +7 -> 135
    //   131: aload_1
    //   132: invokevirtual 71	java/io/FileInputStream:close	()V
    //   135: ldc 23
    //   137: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   140: aload_0
    //   141: athrow
    //   142: astore_1
    //   143: goto -73 -> 70
    //   146: astore_1
    //   147: goto -12 -> 135
    //   150: astore_0
    //   151: goto -24 -> 127
    //   154: astore_2
    //   155: goto -68 -> 87
    //
    // Exception table:
    //   from	to	target	type
    //   11	33	84	java/lang/Exception
    //   113	117	120	java/lang/Exception
    //   11	33	124	finally
    //   66	70	142	java/lang/Exception
    //   131	135	146	java/lang/Exception
    //   35	39	150	finally
    //   41	45	150	finally
    //   47	52	150	finally
    //   54	66	150	finally
    //   89	101	150	finally
    //   103	109	150	finally
    //   35	39	154	java/lang/Exception
    //   41	45	154	java/lang/Exception
    //   47	52	154	java/lang/Exception
    //   54	66	154	java/lang/Exception
  }

  // ERROR //
  public static boolean Mt()
  {
    // Byte code:
    //   0: ldc 93
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 14	com/tencent/mm/compatible/util/h:evG	Ljava/lang/Boolean;
    //   8: ifnonnull +69 -> 77
    //   11: new 31	java/io/FileInputStream
    //   14: astore_0
    //   15: new 33	java/io/File
    //   18: astore_1
    //   19: aload_1
    //   20: invokestatic 39	android/os/Environment:getRootDirectory	()Ljava/io/File;
    //   23: ldc 41
    //   25: invokespecial 45	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   28: aload_0
    //   29: aload_1
    //   30: invokespecial 48	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: aload_0
    //   34: astore_1
    //   35: new 50	java/util/Properties
    //   38: astore_2
    //   39: aload_0
    //   40: astore_1
    //   41: aload_2
    //   42: invokespecial 52	java/util/Properties:<init>	()V
    //   45: aload_0
    //   46: astore_1
    //   47: aload_2
    //   48: aload_0
    //   49: invokevirtual 56	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   52: aload_0
    //   53: astore_1
    //   54: aload_2
    //   55: ldc 58
    //   57: ldc 95
    //   59: invokevirtual 99	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   62: ldc 101
    //   64: invokevirtual 107	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   67: invokestatic 68	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   70: putstatic 14	com/tencent/mm/compatible/util/h:evG	Ljava/lang/Boolean;
    //   73: aload_0
    //   74: invokevirtual 71	java/io/FileInputStream:close	()V
    //   77: getstatic 14	com/tencent/mm/compatible/util/h:evG	Ljava/lang/Boolean;
    //   80: invokevirtual 74	java/lang/Boolean:booleanValue	()Z
    //   83: istore_3
    //   84: ldc 93
    //   86: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: iload_3
    //   90: ireturn
    //   91: astore_2
    //   92: aconst_null
    //   93: astore_0
    //   94: aload_0
    //   95: astore_1
    //   96: ldc 79
    //   98: aload_2
    //   99: ldc 81
    //   101: iconst_0
    //   102: anewarray 4	java/lang/Object
    //   105: invokestatic 87	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   108: aload_0
    //   109: astore_1
    //   110: getstatic 90	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   113: putstatic 14	com/tencent/mm/compatible/util/h:evG	Ljava/lang/Boolean;
    //   116: aload_0
    //   117: ifnull -40 -> 77
    //   120: aload_0
    //   121: invokevirtual 71	java/io/FileInputStream:close	()V
    //   124: goto -47 -> 77
    //   127: astore_1
    //   128: goto -51 -> 77
    //   131: astore_0
    //   132: aconst_null
    //   133: astore_1
    //   134: aload_1
    //   135: ifnull +7 -> 142
    //   138: aload_1
    //   139: invokevirtual 71	java/io/FileInputStream:close	()V
    //   142: ldc 93
    //   144: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_0
    //   148: athrow
    //   149: astore_1
    //   150: goto -73 -> 77
    //   153: astore_1
    //   154: goto -12 -> 142
    //   157: astore_0
    //   158: goto -24 -> 134
    //   161: astore_2
    //   162: goto -68 -> 94
    //
    // Exception table:
    //   from	to	target	type
    //   11	33	91	java/lang/Exception
    //   120	124	127	java/lang/Exception
    //   11	33	131	finally
    //   73	77	149	java/lang/Exception
    //   138	142	153	java/lang/Exception
    //   35	39	157	finally
    //   41	45	157	finally
    //   47	52	157	finally
    //   54	73	157	finally
    //   96	108	157	finally
    //   110	116	157	finally
    //   35	39	161	java/lang/Exception
    //   41	45	161	java/lang/Exception
    //   47	52	161	java/lang/Exception
    //   54	73	161	java/lang/Exception
  }

  public static int Mu()
  {
    return 4;
  }

  public static File getDataDirectory()
  {
    AppMethodBeat.i(93081);
    File localFile;
    if (bo.isNullOrNil(q.etn.esv))
    {
      localFile = Environment.getDataDirectory();
      AppMethodBeat.o(93081);
    }
    while (true)
    {
      return localFile;
      localFile = new File(q.etn.esv);
      AppMethodBeat.o(93081);
    }
  }

  public static File getDownloadCacheDirectory()
  {
    AppMethodBeat.i(93083);
    File localFile;
    if (bo.isNullOrNil(q.etn.esy))
    {
      localFile = Environment.getDownloadCacheDirectory();
      AppMethodBeat.o(93083);
    }
    while (true)
    {
      return localFile;
      localFile = new File(q.etn.esy);
      AppMethodBeat.o(93083);
    }
  }

  public static File getExternalStorageDirectory()
  {
    AppMethodBeat.i(93079);
    File localFile;
    if (bo.isNullOrNil(q.etn.est))
    {
      localFile = Environment.getExternalStorageDirectory();
      AppMethodBeat.o(93079);
    }
    while (true)
    {
      return localFile;
      localFile = new File(q.etn.est);
      AppMethodBeat.o(93079);
    }
  }

  @TargetApi(8)
  public static File getExternalStoragePublicDirectory(String paramString)
  {
    AppMethodBeat.i(93080);
    if (bo.isNullOrNil(q.etn.esu))
    {
      paramString = Environment.getExternalStoragePublicDirectory(paramString);
      AppMethodBeat.o(93080);
    }
    while (true)
    {
      return paramString;
      paramString = new File(q.etn.esu);
      AppMethodBeat.o(93080);
    }
  }

  public static String getExternalStorageState()
  {
    AppMethodBeat.i(93084);
    String str;
    if (bo.isNullOrNil(q.etn.esx))
    {
      str = Environment.getExternalStorageState();
      AppMethodBeat.o(93084);
    }
    while (true)
    {
      return str;
      str = q.etn.esx;
      AppMethodBeat.o(93084);
    }
  }

  public static File getRootDirectory()
  {
    AppMethodBeat.i(93082);
    File localFile;
    if (bo.isNullOrNil(q.etn.esw))
    {
      localFile = Environment.getRootDirectory();
      AppMethodBeat.o(93082);
    }
    while (true)
    {
      return localFile;
      localFile = new File(q.etn.esw);
      AppMethodBeat.o(93082);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.h
 * JD-Core Version:    0.6.2
 */