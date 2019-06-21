package com.tencent.matrix.d;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static final FileFilter CPU_FILTER = new FileFilter()
  {
    public final boolean accept(File paramAnonymousFile)
    {
      return Pattern.matches("cpu[0-9]", paramAnonymousFile.getName());
    }
  };
  private static a caC = null;
  private static long caD = 0L;
  private static long caE = 0L;
  private static int caF = 0;

  public static JSONObject a(JSONObject paramJSONObject, Application paramApplication)
  {
    try
    {
      paramJSONObject.put("machine", aC(paramApplication));
      paramJSONObject.put("cpu_app", zH());
      paramJSONObject.put("mem", getTotalMemory(paramApplication));
      paramJSONObject.put("mem_free", zG());
      return paramJSONObject;
    }
    catch (JSONException paramApplication)
    {
      while (true)
        c.e("Matrix.DeviceUtil", "[JSONException for stack, error: %s", new Object[] { paramApplication });
    }
  }

  public static a aC(Context paramContext)
  {
    if (caC != null)
    {
      paramContext = caC;
      return paramContext;
    }
    long l1 = System.currentTimeMillis();
    long l2 = getTotalMemory(paramContext);
    int i = zI();
    c.i("Matrix.DeviceUtil", "[getLevel] totalMemory:%s coresNum:%s", new Object[] { Long.valueOf(l2), Integer.valueOf(i) });
    if (l2 >= 4294967296L)
      caC = a.caG;
    while (true)
    {
      c.i("Matrix.DeviceUtil", "getLevel, cost:" + (System.currentTimeMillis() - l1) + ", level:" + caC, new Object[0]);
      paramContext = caC;
      break;
      if (l2 >= 3221225472L)
        caC = a.caH;
      else if (l2 >= 2147483648L)
      {
        if (i >= 4)
          caC = a.caH;
        else if (i >= 2)
          caC = a.caI;
        else if (i > 0)
          caC = a.caJ;
      }
      else if (l2 >= 1073741824L)
      {
        if (i >= 4)
          caC = a.caI;
        else if (i >= 2)
          caC = a.caJ;
        else if (i > 0)
          caC = a.caJ;
      }
      else if ((0L <= l2) && (l2 < 1073741824L))
        caC = a.caK;
      else
        caC = a.caL;
    }
  }

  // ERROR //
  private static int ci(String paramString)
  {
    // Byte code:
    //   0: new 163	java/io/FileInputStream
    //   3: astore_1
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial 164	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   9: aload_1
    //   10: astore_0
    //   11: new 166	java/io/BufferedReader
    //   14: astore_2
    //   15: aload_1
    //   16: astore_0
    //   17: new 168	java/io/InputStreamReader
    //   20: astore_3
    //   21: aload_1
    //   22: astore_0
    //   23: aload_3
    //   24: aload_1
    //   25: ldc 170
    //   27: invokespecial 173	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   30: aload_1
    //   31: astore_0
    //   32: aload_2
    //   33: aload_3
    //   34: invokespecial 176	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   37: aload_1
    //   38: astore_0
    //   39: aload_2
    //   40: invokevirtual 179	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   43: astore_3
    //   44: aload_1
    //   45: astore_0
    //   46: aload_2
    //   47: invokevirtual 182	java/io/BufferedReader:close	()V
    //   50: aload_3
    //   51: ifnull +18 -> 69
    //   54: aload_1
    //   55: astore_0
    //   56: aload_3
    //   57: ldc 184
    //   59: invokevirtual 190	java/lang/String:matches	(Ljava/lang/String;)Z
    //   62: istore 4
    //   64: iload 4
    //   66: ifne +35 -> 101
    //   69: aload_1
    //   70: invokevirtual 193	java/io/InputStream:close	()V
    //   73: iconst_0
    //   74: istore 5
    //   76: iload 5
    //   78: ireturn
    //   79: astore_0
    //   80: ldc 75
    //   82: ldc 195
    //   84: iconst_1
    //   85: anewarray 4	java/lang/Object
    //   88: dup
    //   89: iconst_0
    //   90: aload_0
    //   91: invokevirtual 196	java/io/IOException:toString	()Ljava/lang/String;
    //   94: aastore
    //   95: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   98: goto -25 -> 73
    //   101: aload_1
    //   102: astore_0
    //   103: aload_3
    //   104: iconst_2
    //   105: invokevirtual 200	java/lang/String:substring	(I)Ljava/lang/String;
    //   108: invokestatic 203	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   111: istore 5
    //   113: iinc 5 1
    //   116: aload_1
    //   117: invokevirtual 193	java/io/InputStream:close	()V
    //   120: goto -44 -> 76
    //   123: astore_0
    //   124: ldc 75
    //   126: ldc 195
    //   128: iconst_1
    //   129: anewarray 4	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload_0
    //   135: invokevirtual 196	java/io/IOException:toString	()Ljava/lang/String;
    //   138: aastore
    //   139: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   142: goto -66 -> 76
    //   145: astore_2
    //   146: aconst_null
    //   147: astore_1
    //   148: aload_1
    //   149: astore_0
    //   150: ldc 75
    //   152: ldc 195
    //   154: iconst_1
    //   155: anewarray 4	java/lang/Object
    //   158: dup
    //   159: iconst_0
    //   160: aload_2
    //   161: invokevirtual 196	java/io/IOException:toString	()Ljava/lang/String;
    //   164: aastore
    //   165: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   168: aload_1
    //   169: ifnull +7 -> 176
    //   172: aload_1
    //   173: invokevirtual 193	java/io/InputStream:close	()V
    //   176: iconst_0
    //   177: istore 5
    //   179: goto -103 -> 76
    //   182: astore_0
    //   183: ldc 75
    //   185: ldc 195
    //   187: iconst_1
    //   188: anewarray 4	java/lang/Object
    //   191: dup
    //   192: iconst_0
    //   193: aload_0
    //   194: invokevirtual 196	java/io/IOException:toString	()Ljava/lang/String;
    //   197: aastore
    //   198: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: goto -25 -> 176
    //   204: astore_1
    //   205: aconst_null
    //   206: astore_0
    //   207: aload_0
    //   208: ifnull +7 -> 215
    //   211: aload_0
    //   212: invokevirtual 193	java/io/InputStream:close	()V
    //   215: aload_1
    //   216: athrow
    //   217: astore_0
    //   218: ldc 75
    //   220: ldc 195
    //   222: iconst_1
    //   223: anewarray 4	java/lang/Object
    //   226: dup
    //   227: iconst_0
    //   228: aload_0
    //   229: invokevirtual 196	java/io/IOException:toString	()Ljava/lang/String;
    //   232: aastore
    //   233: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   236: goto -21 -> 215
    //   239: astore_1
    //   240: goto -33 -> 207
    //   243: astore_2
    //   244: goto -96 -> 148
    //
    // Exception table:
    //   from	to	target	type
    //   69	73	79	java/io/IOException
    //   116	120	123	java/io/IOException
    //   0	9	145	java/io/IOException
    //   172	176	182	java/io/IOException
    //   0	9	204	finally
    //   211	215	217	java/io/IOException
    //   11	15	239	finally
    //   17	21	239	finally
    //   23	30	239	finally
    //   32	37	239	finally
    //   39	44	239	finally
    //   46	50	239	finally
    //   56	64	239	finally
    //   103	113	239	finally
    //   150	168	239	finally
    //   11	15	243	java/io/IOException
    //   17	21	243	java/io/IOException
    //   23	30	243	java/io/IOException
    //   32	37	243	java/io/IOException
    //   39	44	243	java/io/IOException
    //   46	50	243	java/io/IOException
    //   56	64	243	java/io/IOException
    //   103	113	243	java/io/IOException
  }

  private static String convertStreamToString(InputStream paramInputStream)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      BufferedReader localBufferedReader = new java/io/BufferedReader;
      InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
      localInputStreamReader.<init>(paramInputStream);
      localBufferedReader.<init>(localInputStreamReader);
      try
      {
        while (true)
        {
          paramInputStream = localBufferedReader.readLine();
          if (paramInputStream == null)
            break;
          localStringBuilder.append(paramInputStream).append('\n');
        }
      }
      finally
      {
        paramInputStream = localBufferedReader;
      }
      if (paramInputStream != null)
        paramInputStream.close();
      throw localObject1;
      localBufferedReader.close();
      return localObject1.toString();
    }
    finally
    {
      while (true)
        paramInputStream = null;
    }
  }

  public static long getDalvikHeap()
  {
    Runtime localRuntime = Runtime.getRuntime();
    return (localRuntime.totalMemory() - localRuntime.freeMemory()) / 1024L;
  }

  public static long getNativeHeap()
  {
    return Debug.getNativeHeapAllocatedSize() / 1024L;
  }

  // ERROR //
  private static String getStringFromFile(String paramString)
  {
    // Byte code:
    //   0: new 237	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 238	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore_0
    //   9: new 163	java/io/FileInputStream
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: invokespecial 241	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   18: aload_1
    //   19: invokestatic 243	com/tencent/matrix/d/a:convertStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   22: astore_0
    //   23: aload_1
    //   24: invokevirtual 244	java/io/FileInputStream:close	()V
    //   27: aload_0
    //   28: areturn
    //   29: astore_0
    //   30: aconst_null
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull +7 -> 40
    //   36: aload_1
    //   37: invokevirtual 244	java/io/FileInputStream:close	()V
    //   40: aload_0
    //   41: athrow
    //   42: astore_0
    //   43: goto -11 -> 32
    //
    // Exception table:
    //   from	to	target	type
    //   9	18	29	finally
    //   18	23	42	finally
  }

  private static long getTotalMemory(Context paramContext)
  {
    long l1 = 0L;
    if (0L != caD)
      l1 = caD;
    long l2;
    do
    {
      return l1;
      l2 = System.currentTimeMillis();
    }
    while (Build.VERSION.SDK_INT < 16);
    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    paramContext.getMemoryInfo(localMemoryInfo);
    caD = localMemoryInfo.totalMem;
    caE = localMemoryInfo.threshold;
    l1 = Runtime.getRuntime().maxMemory();
    if (l1 == 9223372036854775807L);
    for (caF = paramContext.getMemoryClass(); ; caF = (int)(l1 / 1048576L))
    {
      c.i("Matrix.DeviceUtil", "getTotalMemory cost:" + (System.currentTimeMillis() - l2) + ", total_mem:" + caD + ", LowMemoryThresold:" + caE + ", Memory Class:" + caF, new Object[0]);
      l1 = caD;
      break;
    }
  }

  // ERROR //
  private static long zG()
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_0
    //   2: new 166	java/io/BufferedReader
    //   5: astore_2
    //   6: new 168	java/io/InputStreamReader
    //   9: astore_3
    //   10: new 163	java/io/FileInputStream
    //   13: astore 4
    //   15: aload 4
    //   17: ldc_w 297
    //   20: invokespecial 164	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   23: aload_3
    //   24: aload 4
    //   26: ldc 170
    //   28: invokespecial 173	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   31: aload_2
    //   32: aload_3
    //   33: invokespecial 176	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   36: aload_2
    //   37: astore 4
    //   39: aload_2
    //   40: invokevirtual 179	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   43: astore_3
    //   44: lload_0
    //   45: lstore 5
    //   47: aload_3
    //   48: ifnull +49 -> 97
    //   51: aload_2
    //   52: astore 4
    //   54: aload_3
    //   55: ldc_w 299
    //   58: invokevirtual 303	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   61: astore_3
    //   62: aload_2
    //   63: astore 4
    //   65: ldc_w 305
    //   68: aload_3
    //   69: iconst_0
    //   70: aaload
    //   71: invokevirtual 309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   74: ifeq +34 -> 108
    //   77: aload_2
    //   78: astore 4
    //   80: aload_3
    //   81: iconst_1
    //   82: aaload
    //   83: invokestatic 203	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   86: istore 7
    //   88: iload 7
    //   90: i2l
    //   91: ldc2_w 226
    //   94: lmul
    //   95: lstore 5
    //   97: aload_2
    //   98: invokevirtual 182	java/io/BufferedReader:close	()V
    //   101: lload 5
    //   103: ldc2_w 226
    //   106: ldiv
    //   107: lreturn
    //   108: aload_2
    //   109: astore 4
    //   111: aload_2
    //   112: invokevirtual 179	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   115: astore_3
    //   116: goto -72 -> 44
    //   119: astore 4
    //   121: ldc 75
    //   123: ldc_w 311
    //   126: iconst_1
    //   127: anewarray 4	java/lang/Object
    //   130: dup
    //   131: iconst_0
    //   132: aload 4
    //   134: invokevirtual 312	java/lang/Exception:toString	()Ljava/lang/String;
    //   137: aastore
    //   138: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: goto -40 -> 101
    //   144: astore_3
    //   145: aconst_null
    //   146: astore_2
    //   147: aload_2
    //   148: astore 4
    //   150: ldc 75
    //   152: ldc_w 314
    //   155: iconst_1
    //   156: anewarray 4	java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: aload_3
    //   162: invokevirtual 312	java/lang/Exception:toString	()Ljava/lang/String;
    //   165: aastore
    //   166: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: lload_0
    //   170: lstore 5
    //   172: aload_2
    //   173: ifnull -72 -> 101
    //   176: aload_2
    //   177: invokevirtual 182	java/io/BufferedReader:close	()V
    //   180: lload_0
    //   181: lstore 5
    //   183: goto -82 -> 101
    //   186: astore 4
    //   188: ldc 75
    //   190: ldc_w 311
    //   193: iconst_1
    //   194: anewarray 4	java/lang/Object
    //   197: dup
    //   198: iconst_0
    //   199: aload 4
    //   201: invokevirtual 312	java/lang/Exception:toString	()Ljava/lang/String;
    //   204: aastore
    //   205: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   208: lload_0
    //   209: lstore 5
    //   211: goto -110 -> 101
    //   214: astore_2
    //   215: aconst_null
    //   216: astore 4
    //   218: aload 4
    //   220: ifnull +8 -> 228
    //   223: aload 4
    //   225: invokevirtual 182	java/io/BufferedReader:close	()V
    //   228: aload_2
    //   229: athrow
    //   230: astore 4
    //   232: ldc 75
    //   234: ldc_w 311
    //   237: iconst_1
    //   238: anewarray 4	java/lang/Object
    //   241: dup
    //   242: iconst_0
    //   243: aload 4
    //   245: invokevirtual 312	java/lang/Exception:toString	()Ljava/lang/String;
    //   248: aastore
    //   249: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   252: goto -24 -> 228
    //   255: astore_2
    //   256: goto -38 -> 218
    //   259: astore_3
    //   260: goto -113 -> 147
    //
    // Exception table:
    //   from	to	target	type
    //   97	101	119	java/lang/Exception
    //   2	36	144	java/lang/Exception
    //   176	180	186	java/lang/Exception
    //   2	36	214	finally
    //   223	228	230	java/lang/Exception
    //   39	44	255	finally
    //   54	62	255	finally
    //   65	77	255	finally
    //   80	88	255	finally
    //   111	116	255	finally
    //   150	169	255	finally
    //   39	44	259	java/lang/Exception
    //   54	62	259	java/lang/Exception
    //   65	77	259	java/lang/Exception
    //   80	88	259	java/lang/Exception
    //   111	116	259	java/lang/Exception
  }

  // ERROR //
  private static double zH()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: aconst_null
    //   3: astore_1
    //   4: invokestatic 88	java/lang/System:currentTimeMillis	()J
    //   7: lstore_2
    //   8: dconst_0
    //   9: dstore 4
    //   11: new 316	java/io/RandomAccessFile
    //   14: astore 6
    //   16: aload 6
    //   18: ldc_w 318
    //   21: ldc_w 320
    //   24: invokespecial 323	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   27: aload 6
    //   29: astore 7
    //   31: aload 6
    //   33: invokevirtual 324	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   36: ldc_w 326
    //   39: invokevirtual 303	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   42: astore 8
    //   44: aload 6
    //   46: astore 7
    //   48: aload 8
    //   50: iconst_2
    //   51: aaload
    //   52: invokestatic 330	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   55: lstore 9
    //   57: aload 6
    //   59: astore 7
    //   61: aload 8
    //   63: iconst_3
    //   64: aaload
    //   65: invokestatic 330	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   68: lstore 11
    //   70: aload 6
    //   72: astore 7
    //   74: aload 8
    //   76: iconst_4
    //   77: aaload
    //   78: invokestatic 330	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   81: lstore 13
    //   83: aload 6
    //   85: astore 7
    //   87: aload 8
    //   89: iconst_5
    //   90: aaload
    //   91: invokestatic 330	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   94: lstore 15
    //   96: aload 6
    //   98: astore 7
    //   100: aload 8
    //   102: bipush 6
    //   104: aaload
    //   105: invokestatic 330	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   108: lstore 17
    //   110: aload 6
    //   112: astore 7
    //   114: aload 8
    //   116: bipush 7
    //   118: aaload
    //   119: invokestatic 330	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   122: lstore 19
    //   124: aload 6
    //   126: astore 7
    //   128: aload 8
    //   130: bipush 8
    //   132: aaload
    //   133: invokestatic 330	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   136: lstore 21
    //   138: lload 9
    //   140: lload 11
    //   142: ladd
    //   143: lload 13
    //   145: ladd
    //   146: lload 15
    //   148: ladd
    //   149: lload 17
    //   151: ladd
    //   152: lload 19
    //   154: ladd
    //   155: lload 21
    //   157: ladd
    //   158: lstore 17
    //   160: aload 6
    //   162: invokevirtual 331	java/io/RandomAccessFile:close	()V
    //   165: aload_0
    //   166: astore 7
    //   168: new 316	java/io/RandomAccessFile
    //   171: astore 6
    //   173: aload_0
    //   174: astore 7
    //   176: new 115	java/lang/StringBuilder
    //   179: astore 8
    //   181: aload_0
    //   182: astore 7
    //   184: aload 8
    //   186: ldc_w 333
    //   189: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   192: aload_0
    //   193: astore 7
    //   195: aload 6
    //   197: aload 8
    //   199: invokestatic 338	android/os/Process:myPid	()I
    //   202: invokevirtual 291	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   205: ldc_w 340
    //   208: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   214: ldc_w 320
    //   217: invokespecial 323	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   220: aload 6
    //   222: invokevirtual 324	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   225: ldc_w 326
    //   228: invokevirtual 303	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   231: astore 7
    //   233: aload 7
    //   235: bipush 13
    //   237: aaload
    //   238: invokestatic 330	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   241: lstore 15
    //   243: aload 7
    //   245: bipush 14
    //   247: aaload
    //   248: invokestatic 330	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   251: lstore 13
    //   253: lload 15
    //   255: lload 13
    //   257: ladd
    //   258: lstore 15
    //   260: aload 6
    //   262: invokevirtual 331	java/io/RandomAccessFile:close	()V
    //   265: lconst_0
    //   266: lload 17
    //   268: lcmp
    //   269: ifeq +16 -> 285
    //   272: lload 15
    //   274: l2d
    //   275: lload 17
    //   277: l2d
    //   278: ddiv
    //   279: ldc2_w 341
    //   282: dmul
    //   283: dstore 4
    //   285: ldc 75
    //   287: new 115	java/lang/StringBuilder
    //   290: dup
    //   291: ldc_w 344
    //   294: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   297: invokestatic 88	java/lang/System:currentTimeMillis	()J
    //   300: lload_2
    //   301: lsub
    //   302: invokevirtual 124	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   305: ldc_w 346
    //   308: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: dload 4
    //   313: invokevirtual 349	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   316: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   319: iconst_0
    //   320: anewarray 4	java/lang/Object
    //   323: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   326: dload 4
    //   328: dreturn
    //   329: astore 7
    //   331: ldc 75
    //   333: ldc_w 351
    //   336: iconst_1
    //   337: anewarray 4	java/lang/Object
    //   340: dup
    //   341: iconst_0
    //   342: aload 7
    //   344: invokevirtual 312	java/lang/Exception:toString	()Ljava/lang/String;
    //   347: aastore
    //   348: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   351: goto -186 -> 165
    //   354: astore 8
    //   356: aconst_null
    //   357: astore 6
    //   359: aload 6
    //   361: astore 7
    //   363: ldc 75
    //   365: ldc_w 353
    //   368: iconst_1
    //   369: anewarray 4	java/lang/Object
    //   372: dup
    //   373: iconst_0
    //   374: aload 8
    //   376: invokevirtual 312	java/lang/Exception:toString	()Ljava/lang/String;
    //   379: aastore
    //   380: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   383: aload 6
    //   385: ifnull +8 -> 393
    //   388: aload 6
    //   390: invokevirtual 331	java/io/RandomAccessFile:close	()V
    //   393: lconst_0
    //   394: lstore 17
    //   396: goto -231 -> 165
    //   399: astore 7
    //   401: ldc 75
    //   403: ldc_w 351
    //   406: iconst_1
    //   407: anewarray 4	java/lang/Object
    //   410: dup
    //   411: iconst_0
    //   412: aload 7
    //   414: invokevirtual 312	java/lang/Exception:toString	()Ljava/lang/String;
    //   417: aastore
    //   418: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   421: lconst_0
    //   422: lstore 17
    //   424: goto -259 -> 165
    //   427: astore 6
    //   429: aconst_null
    //   430: astore 7
    //   432: aload 7
    //   434: ifnull +8 -> 442
    //   437: aload 7
    //   439: invokevirtual 331	java/io/RandomAccessFile:close	()V
    //   442: aload 6
    //   444: athrow
    //   445: astore 7
    //   447: ldc 75
    //   449: ldc_w 351
    //   452: iconst_1
    //   453: anewarray 4	java/lang/Object
    //   456: dup
    //   457: iconst_0
    //   458: aload 7
    //   460: invokevirtual 312	java/lang/Exception:toString	()Ljava/lang/String;
    //   463: aastore
    //   464: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   467: goto -25 -> 442
    //   470: astore 7
    //   472: ldc 75
    //   474: ldc_w 355
    //   477: iconst_1
    //   478: anewarray 4	java/lang/Object
    //   481: dup
    //   482: iconst_0
    //   483: aload 7
    //   485: invokevirtual 312	java/lang/Exception:toString	()Ljava/lang/String;
    //   488: aastore
    //   489: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   492: goto -227 -> 265
    //   495: astore 8
    //   497: aload_1
    //   498: astore 6
    //   500: aload 6
    //   502: astore 7
    //   504: ldc 75
    //   506: ldc_w 357
    //   509: iconst_1
    //   510: anewarray 4	java/lang/Object
    //   513: dup
    //   514: iconst_0
    //   515: aload 8
    //   517: invokevirtual 312	java/lang/Exception:toString	()Ljava/lang/String;
    //   520: aastore
    //   521: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   524: aload 6
    //   526: ifnull +8 -> 534
    //   529: aload 6
    //   531: invokevirtual 331	java/io/RandomAccessFile:close	()V
    //   534: lconst_0
    //   535: lstore 15
    //   537: goto -272 -> 265
    //   540: astore 7
    //   542: ldc 75
    //   544: ldc_w 355
    //   547: iconst_1
    //   548: anewarray 4	java/lang/Object
    //   551: dup
    //   552: iconst_0
    //   553: aload 7
    //   555: invokevirtual 312	java/lang/Exception:toString	()Ljava/lang/String;
    //   558: aastore
    //   559: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   562: lconst_0
    //   563: lstore 15
    //   565: goto -300 -> 265
    //   568: astore 8
    //   570: aload 7
    //   572: astore 6
    //   574: aload 8
    //   576: astore 7
    //   578: aload 6
    //   580: ifnull +8 -> 588
    //   583: aload 6
    //   585: invokevirtual 331	java/io/RandomAccessFile:close	()V
    //   588: aload 7
    //   590: athrow
    //   591: astore 6
    //   593: ldc 75
    //   595: ldc_w 355
    //   598: iconst_1
    //   599: anewarray 4	java/lang/Object
    //   602: dup
    //   603: iconst_0
    //   604: aload 6
    //   606: invokevirtual 312	java/lang/Exception:toString	()Ljava/lang/String;
    //   609: aastore
    //   610: invokestatic 108	com/tencent/matrix/d/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   613: goto -25 -> 588
    //   616: astore 7
    //   618: goto -40 -> 578
    //   621: astore 8
    //   623: goto -123 -> 500
    //   626: astore 6
    //   628: goto -196 -> 432
    //   631: astore 8
    //   633: goto -274 -> 359
    //
    // Exception table:
    //   from	to	target	type
    //   160	165	329	java/lang/Exception
    //   11	27	354	java/lang/Exception
    //   388	393	399	java/lang/Exception
    //   11	27	427	finally
    //   437	442	445	java/lang/Exception
    //   260	265	470	java/lang/Exception
    //   168	173	495	java/lang/Exception
    //   176	181	495	java/lang/Exception
    //   184	192	495	java/lang/Exception
    //   195	220	495	java/lang/Exception
    //   529	534	540	java/lang/Exception
    //   168	173	568	finally
    //   176	181	568	finally
    //   184	192	568	finally
    //   195	220	568	finally
    //   504	524	568	finally
    //   583	588	591	java/lang/Exception
    //   220	253	616	finally
    //   220	253	621	java/lang/Exception
    //   31	44	626	finally
    //   48	57	626	finally
    //   61	70	626	finally
    //   74	83	626	finally
    //   87	96	626	finally
    //   100	110	626	finally
    //   114	124	626	finally
    //   128	138	626	finally
    //   363	383	626	finally
    //   31	44	631	java/lang/Exception
    //   48	57	631	java/lang/Exception
    //   61	70	631	java/lang/Exception
    //   74	83	631	java/lang/Exception
    //   87	96	631	java/lang/Exception
    //   100	110	631	java/lang/Exception
    //   114	124	631	java/lang/Exception
    //   128	138	631	java/lang/Exception
  }

  private static int zI()
  {
    int i = 1;
    int j = 0;
    if (Build.VERSION.SDK_INT <= 10)
      j = i;
    while (true)
    {
      return j;
      try
      {
        int k = ci("/sys/devices/system/cpu/possible");
        i = k;
        if (k == 0)
          i = ci("/sys/devices/system/cpu/present");
        if (i == 0)
        {
          Object localObject = new java/io/File;
          ((File)localObject).<init>("/sys/devices/system/cpu/");
          localObject = ((File)localObject).listFiles(CPU_FILTER);
          if (localObject == null);
          for (i = j; ; i = localObject.length)
          {
            j = i;
            if (i == 0)
              j = 1;
            break;
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
          i = j;
      }
    }
  }

  public static long zJ()
  {
    long l1 = -1L;
    int i = 0;
    Object localObject1 = String.format("/proc/%s/status", new Object[] { Integer.valueOf(Process.myPid()) });
    try
    {
      localObject1 = getStringFromFile((String)localObject1).trim().split("\n");
      int j = localObject1.length;
      if (i < j)
      {
        Object localObject2 = localObject1[i];
        if (((String)localObject2).startsWith("VmSize"))
        {
          localObject2 = Pattern.compile("\\d+").matcher((CharSequence)localObject2);
          if (((Matcher)localObject2).find())
            l2 = Long.parseLong(((Matcher)localObject2).group());
        }
      }
      while (true)
      {
        return l2;
        i++;
        break;
        l2 = l1;
        if (localObject1.length > 12)
        {
          localObject1 = Pattern.compile("\\d+").matcher(localObject1[12]);
          l2 = l1;
          if (((Matcher)localObject1).find())
            l2 = Long.parseLong(((Matcher)localObject1).group());
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
        long l2 = l1;
    }
  }

  public static enum a
  {
    int value;

    private a(int paramInt)
    {
      this.value = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.d.a
 * JD-Core Version:    0.6.2
 */