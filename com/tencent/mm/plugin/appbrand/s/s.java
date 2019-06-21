package com.tencent.mm.plugin.appbrand.s;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONArray;
import org.json.JSONException;

public final class s
{
  public static boolean Ek(String paramString)
  {
    AppMethodBeat.i(133592);
    boolean bool;
    if ((paramString != null) && (paramString.startsWith("content://")))
    {
      bool = true;
      AppMethodBeat.o(133592);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133592);
    }
  }

  public static boolean El(String paramString)
  {
    AppMethodBeat.i(133593);
    try
    {
      new JSONArray(paramString);
      bool = true;
      AppMethodBeat.o(133593);
      return bool;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(133593);
      }
    }
  }

  // ERROR //
  public static String a(com.tencent.mm.plugin.appbrand.o paramo, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 41
    //   2: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_2
    //   6: invokestatic 47	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   9: astore_2
    //   10: new 49	java/io/BufferedInputStream
    //   13: astore_3
    //   14: aload_3
    //   15: invokestatic 55	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   18: invokevirtual 61	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   21: aload_2
    //   22: invokevirtual 67	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   25: invokespecial 70	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   28: aload_2
    //   29: invokevirtual 74	android/net/Uri:getPath	()Ljava/lang/String;
    //   32: astore_2
    //   33: aload_2
    //   34: bipush 46
    //   36: invokevirtual 78	java/lang/String:indexOf	(I)I
    //   39: istore 4
    //   41: iload 4
    //   43: iconst_m1
    //   44: if_icmpeq +179 -> 223
    //   47: aload_2
    //   48: iload 4
    //   50: invokevirtual 82	java/lang/String:substring	(I)Ljava/lang/String;
    //   53: astore_2
    //   54: new 84	java/io/File
    //   57: dup
    //   58: aload_1
    //   59: new 86	java/lang/StringBuilder
    //   62: dup
    //   63: ldc 88
    //   65: invokespecial 89	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   68: invokestatic 95	java/lang/System:currentTimeMillis	()J
    //   71: invokevirtual 99	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   74: ldc 101
    //   76: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: aload_2
    //   80: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: invokespecial 110	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   89: invokevirtual 113	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   92: astore 5
    //   94: new 84	java/io/File
    //   97: dup
    //   98: aload 5
    //   100: invokespecial 114	java/io/File:<init>	(Ljava/lang/String;)V
    //   103: astore 6
    //   105: new 116	java/io/FileOutputStream
    //   108: astore_1
    //   109: aload_1
    //   110: aload 6
    //   112: invokespecial 119	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   115: aload_3
    //   116: aload_1
    //   117: invokestatic 125	com/tencent/mm/a/e:copyStream	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   120: pop2
    //   121: new 127	com/tencent/mm/plugin/appbrand/r/j
    //   124: dup
    //   125: invokespecial 130	com/tencent/mm/plugin/appbrand/r/j:<init>	()V
    //   128: astore 6
    //   130: aload_0
    //   131: invokevirtual 136	com/tencent/mm/plugin/appbrand/o:atG	()Lcom/tencent/mm/plugin/appbrand/jsapi/file/al;
    //   134: new 84	java/io/File
    //   137: dup
    //   138: aload 5
    //   140: invokespecial 114	java/io/File:<init>	(Ljava/lang/String;)V
    //   143: aload_2
    //   144: iconst_1
    //   145: aload 6
    //   147: invokevirtual 141	com/tencent/mm/plugin/appbrand/jsapi/file/al:a	(Ljava/io/File;Ljava/lang/String;ZLcom/tencent/mm/plugin/appbrand/r/j;)Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   150: pop
    //   151: aload_3
    //   152: invokestatic 147	com/google/android/exoplayer2/i/v:closeQuietly	(Ljava/io/Closeable;)V
    //   155: aload_1
    //   156: invokestatic 147	com/google/android/exoplayer2/i/v:closeQuietly	(Ljava/io/Closeable;)V
    //   159: aload 6
    //   161: getfield 151	com/tencent/mm/plugin/appbrand/r/j:value	Ljava/lang/Object;
    //   164: checkcast 17	java/lang/String
    //   167: astore_0
    //   168: ldc 41
    //   170: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: aload_0
    //   174: areturn
    //   175: astore_0
    //   176: ldc 153
    //   178: aload_0
    //   179: ldc 155
    //   181: iconst_0
    //   182: anewarray 4	java/lang/Object
    //   185: invokestatic 161	com/tencent/luggage/g/d:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   188: ldc 155
    //   190: astore_0
    //   191: ldc 41
    //   193: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   196: goto -23 -> 173
    //   199: astore_0
    //   200: ldc 153
    //   202: aload_0
    //   203: ldc 155
    //   205: iconst_0
    //   206: anewarray 4	java/lang/Object
    //   209: invokestatic 161	com/tencent/luggage/g/d:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: ldc 155
    //   214: astore_0
    //   215: ldc 41
    //   217: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   220: goto -47 -> 173
    //   223: ldc 155
    //   225: astore_2
    //   226: goto -172 -> 54
    //   229: astore_0
    //   230: ldc 153
    //   232: aload_0
    //   233: ldc 155
    //   235: iconst_0
    //   236: anewarray 4	java/lang/Object
    //   239: invokestatic 161	com/tencent/luggage/g/d:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   242: ldc 155
    //   244: astore_0
    //   245: ldc 41
    //   247: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   250: goto -77 -> 173
    //
    // Exception table:
    //   from	to	target	type
    //   10	28	175	java/io/FileNotFoundException
    //   10	28	199	java/lang/Exception
    //   105	115	229	java/io/FileNotFoundException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.s
 * JD-Core Version:    0.6.2
 */