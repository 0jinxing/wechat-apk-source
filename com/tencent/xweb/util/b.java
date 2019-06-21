package com.tencent.xweb.util;

import android.content.res.AssetFileDescriptor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.io.File;
import org.xwalk.core.Log;

public final class b
{
  public static void a(AssetFileDescriptor paramAssetFileDescriptor)
  {
    AppMethodBeat.i(4008);
    if (paramAssetFileDescriptor != null);
    while (true)
    {
      try
      {
        paramAssetFileDescriptor.close();
        AppMethodBeat.o(4008);
        return;
      }
      catch (Exception paramAssetFileDescriptor)
      {
        Log.e("FileUtils", "tryClose AssetFileDescriptor error: " + paramAssetFileDescriptor.getMessage());
      }
      AppMethodBeat.o(4008);
    }
  }

  // ERROR //
  public static boolean a(AssetFileDescriptor paramAssetFileDescriptor, File paramFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: sipush 4009
    //   5: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnonnull +18 -> 27
    //   12: ldc 25
    //   14: ldc 54
    //   16: invokestatic 50	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: sipush 4009
    //   22: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: iload_2
    //   26: ireturn
    //   27: aload_1
    //   28: invokevirtual 60	java/io/File:exists	()Z
    //   31: ifeq +8 -> 39
    //   34: aload_1
    //   35: invokevirtual 63	java/io/File:delete	()Z
    //   38: pop
    //   39: new 65	java/io/FileOutputStream
    //   42: astore_3
    //   43: aload_3
    //   44: aload_1
    //   45: invokespecial 68	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   48: aload_0
    //   49: invokevirtual 72	android/content/res/AssetFileDescriptor:createInputStream	()Ljava/io/FileInputStream;
    //   52: astore_1
    //   53: aload_1
    //   54: astore 4
    //   56: aload_3
    //   57: astore 5
    //   59: ldc 73
    //   61: newarray byte
    //   63: astore 6
    //   65: aload_1
    //   66: astore 4
    //   68: aload_3
    //   69: astore 5
    //   71: aload_1
    //   72: aload 6
    //   74: invokevirtual 79	java/io/FileInputStream:read	([B)I
    //   77: istore 7
    //   79: iload 7
    //   81: iconst_m1
    //   82: if_icmpeq +92 -> 174
    //   85: aload_1
    //   86: astore 4
    //   88: aload_3
    //   89: astore 5
    //   91: aload_3
    //   92: aload 6
    //   94: iconst_0
    //   95: iload 7
    //   97: invokevirtual 83	java/io/FileOutputStream:write	([BII)V
    //   100: goto -35 -> 65
    //   103: astore 6
    //   105: aload_1
    //   106: astore 4
    //   108: aload_3
    //   109: astore 5
    //   111: new 27	java/lang/StringBuilder
    //   114: astore 8
    //   116: aload_1
    //   117: astore 4
    //   119: aload_3
    //   120: astore 5
    //   122: aload 8
    //   124: ldc 85
    //   126: invokespecial 33	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   129: aload_1
    //   130: astore 4
    //   132: aload_3
    //   133: astore 5
    //   135: ldc 25
    //   137: aload 8
    //   139: aload 6
    //   141: invokevirtual 37	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   144: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   150: invokestatic 50	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   153: aload_3
    //   154: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   157: aload_1
    //   158: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   161: aload_0
    //   162: invokestatic 91	com/tencent/xweb/util/b:a	(Landroid/content/res/AssetFileDescriptor;)V
    //   165: sipush 4009
    //   168: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   171: goto -146 -> 25
    //   174: aload_1
    //   175: astore 4
    //   177: aload_3
    //   178: astore 5
    //   180: aload_3
    //   181: invokevirtual 94	java/io/FileOutputStream:flush	()V
    //   184: aload_3
    //   185: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   188: aload_1
    //   189: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   192: aload_0
    //   193: invokestatic 91	com/tencent/xweb/util/b:a	(Landroid/content/res/AssetFileDescriptor;)V
    //   196: iconst_1
    //   197: istore_2
    //   198: sipush 4009
    //   201: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: goto -179 -> 25
    //   207: astore_1
    //   208: aconst_null
    //   209: astore 4
    //   211: aconst_null
    //   212: astore_3
    //   213: aload_3
    //   214: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   217: aload 4
    //   219: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   222: aload_0
    //   223: invokestatic 91	com/tencent/xweb/util/b:a	(Landroid/content/res/AssetFileDescriptor;)V
    //   226: sipush 4009
    //   229: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   232: aload_1
    //   233: athrow
    //   234: astore_1
    //   235: aconst_null
    //   236: astore 4
    //   238: goto -25 -> 213
    //   241: astore_1
    //   242: aload 5
    //   244: astore_3
    //   245: goto -32 -> 213
    //   248: astore 6
    //   250: aconst_null
    //   251: astore_1
    //   252: aconst_null
    //   253: astore_3
    //   254: goto -149 -> 105
    //   257: astore 6
    //   259: aconst_null
    //   260: astore_1
    //   261: goto -156 -> 105
    //
    // Exception table:
    //   from	to	target	type
    //   59	65	103	java/lang/Exception
    //   71	79	103	java/lang/Exception
    //   91	100	103	java/lang/Exception
    //   180	184	103	java/lang/Exception
    //   27	39	207	finally
    //   39	48	207	finally
    //   48	53	234	finally
    //   59	65	241	finally
    //   71	79	241	finally
    //   91	100	241	finally
    //   111	116	241	finally
    //   122	129	241	finally
    //   135	153	241	finally
    //   180	184	241	finally
    //   27	39	248	java/lang/Exception
    //   39	48	248	java/lang/Exception
    //   48	53	257	java/lang/Exception
  }

  public static boolean avl(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(4005);
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      deleteAll(localFile);
      AppMethodBeat.o(4005);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Log.i("FileUtils", String.format("delete all files.(%s)", new Object[] { paramString }));
        AppMethodBeat.o(4005);
        bool = false;
      }
    }
  }

  // ERROR //
  public static boolean b(java.io.InputStream paramInputStream, File paramFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: sipush 4010
    //   5: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnonnull +18 -> 27
    //   12: ldc 25
    //   14: ldc 114
    //   16: invokestatic 50	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: sipush 4010
    //   22: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: iload_2
    //   26: ireturn
    //   27: aconst_null
    //   28: astore_3
    //   29: aconst_null
    //   30: astore 4
    //   32: aload_3
    //   33: astore 5
    //   35: aload_1
    //   36: invokevirtual 60	java/io/File:exists	()Z
    //   39: ifeq +11 -> 50
    //   42: aload_3
    //   43: astore 5
    //   45: aload_1
    //   46: invokevirtual 63	java/io/File:delete	()Z
    //   49: pop
    //   50: aload_3
    //   51: astore 5
    //   53: new 65	java/io/FileOutputStream
    //   56: astore 6
    //   58: aload_3
    //   59: astore 5
    //   61: aload 6
    //   63: aload_1
    //   64: invokespecial 68	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   67: ldc 73
    //   69: newarray byte
    //   71: astore_1
    //   72: aload_0
    //   73: aload_1
    //   74: invokevirtual 117	java/io/InputStream:read	([B)I
    //   77: istore 7
    //   79: iload 7
    //   81: iconst_m1
    //   82: if_icmpeq +80 -> 162
    //   85: aload 6
    //   87: aload_1
    //   88: iconst_0
    //   89: iload 7
    //   91: invokevirtual 83	java/io/FileOutputStream:write	([BII)V
    //   94: goto -22 -> 72
    //   97: astore 5
    //   99: aload 6
    //   101: astore_1
    //   102: aload 5
    //   104: astore 6
    //   106: aload_1
    //   107: astore 5
    //   109: new 27	java/lang/StringBuilder
    //   112: astore 4
    //   114: aload_1
    //   115: astore 5
    //   117: aload 4
    //   119: ldc 119
    //   121: invokespecial 33	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   124: aload_1
    //   125: astore 5
    //   127: ldc 25
    //   129: aload 4
    //   131: aload 6
    //   133: invokevirtual 37	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   136: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   142: invokestatic 50	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   145: aload_1
    //   146: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   149: aload_0
    //   150: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   153: sipush 4010
    //   156: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: goto -134 -> 25
    //   162: aload 6
    //   164: invokevirtual 94	java/io/FileOutputStream:flush	()V
    //   167: aload 6
    //   169: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   172: aload_0
    //   173: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   176: iconst_1
    //   177: istore_2
    //   178: sipush 4010
    //   181: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: goto -159 -> 25
    //   187: astore_1
    //   188: aload 5
    //   190: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   193: aload_0
    //   194: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   197: sipush 4010
    //   200: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   203: aload_1
    //   204: athrow
    //   205: astore_1
    //   206: aload 6
    //   208: astore 5
    //   210: goto -22 -> 188
    //   213: astore 6
    //   215: aload 4
    //   217: astore_1
    //   218: goto -112 -> 106
    //
    // Exception table:
    //   from	to	target	type
    //   67	72	97	java/lang/Exception
    //   72	79	97	java/lang/Exception
    //   85	94	97	java/lang/Exception
    //   162	167	97	java/lang/Exception
    //   35	42	187	finally
    //   45	50	187	finally
    //   53	58	187	finally
    //   61	67	187	finally
    //   109	114	187	finally
    //   117	124	187	finally
    //   127	145	187	finally
    //   67	72	205	finally
    //   72	79	205	finally
    //   85	94	205	finally
    //   162	167	205	finally
    //   35	42	213	java/lang/Exception
    //   45	50	213	java/lang/Exception
    //   53	58	213	java/lang/Exception
    //   61	67	213	java/lang/Exception
  }

  // ERROR //
  public static boolean copyFile(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: sipush 4001
    //   3: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 75	java/io/FileInputStream
    //   9: astore_2
    //   10: aload_2
    //   11: aload_0
    //   12: invokespecial 124	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   15: aload_2
    //   16: invokevirtual 128	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   19: astore_3
    //   20: new 65	java/io/FileOutputStream
    //   23: astore 4
    //   25: aload 4
    //   27: aload_1
    //   28: invokespecial 129	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   31: aload 4
    //   33: invokevirtual 130	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   36: astore 5
    //   38: aload 5
    //   40: aload_3
    //   41: lconst_0
    //   42: aload_3
    //   43: invokevirtual 136	java/nio/channels/FileChannel:size	()J
    //   46: invokevirtual 140	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   49: pop2
    //   50: aload 5
    //   52: iconst_1
    //   53: invokevirtual 144	java/nio/channels/FileChannel:force	(Z)V
    //   56: aload_2
    //   57: invokevirtual 145	java/io/FileInputStream:close	()V
    //   60: aload 4
    //   62: invokevirtual 146	java/io/FileOutputStream:close	()V
    //   65: aload_3
    //   66: ifnull +7 -> 73
    //   69: aload_3
    //   70: invokevirtual 147	java/nio/channels/FileChannel:close	()V
    //   73: aload 5
    //   75: ifnull +8 -> 83
    //   78: aload 5
    //   80: invokevirtual 147	java/nio/channels/FileChannel:close	()V
    //   83: sipush 4001
    //   86: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: iconst_1
    //   90: istore 6
    //   92: iload 6
    //   94: ireturn
    //   95: astore 7
    //   97: aconst_null
    //   98: astore_2
    //   99: aconst_null
    //   100: astore 5
    //   102: aconst_null
    //   103: astore 4
    //   105: aconst_null
    //   106: astore_3
    //   107: ldc 25
    //   109: ldc 149
    //   111: iconst_4
    //   112: anewarray 4	java/lang/Object
    //   115: dup
    //   116: iconst_0
    //   117: aload 7
    //   119: invokevirtual 153	java/lang/Object:getClass	()Ljava/lang/Class;
    //   122: invokevirtual 158	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   125: aastore
    //   126: dup
    //   127: iconst_1
    //   128: aload 7
    //   130: invokevirtual 37	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   133: aastore
    //   134: dup
    //   135: iconst_2
    //   136: aload_0
    //   137: aastore
    //   138: dup
    //   139: iconst_3
    //   140: aload_1
    //   141: aastore
    //   142: invokestatic 108	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   145: invokestatic 50	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   148: aload 5
    //   150: ifnull +8 -> 158
    //   153: aload 5
    //   155: invokevirtual 145	java/io/FileInputStream:close	()V
    //   158: aload_2
    //   159: ifnull +7 -> 166
    //   162: aload_2
    //   163: invokevirtual 146	java/io/FileOutputStream:close	()V
    //   166: aload_3
    //   167: ifnull +7 -> 174
    //   170: aload_3
    //   171: invokevirtual 147	java/nio/channels/FileChannel:close	()V
    //   174: aload 4
    //   176: ifnull +8 -> 184
    //   179: aload 4
    //   181: invokevirtual 147	java/nio/channels/FileChannel:close	()V
    //   184: sipush 4001
    //   187: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: iconst_0
    //   191: istore 6
    //   193: goto -101 -> 92
    //   196: astore_0
    //   197: aconst_null
    //   198: astore_2
    //   199: aconst_null
    //   200: astore 5
    //   202: aconst_null
    //   203: astore 4
    //   205: aconst_null
    //   206: astore_3
    //   207: aload 5
    //   209: ifnull +8 -> 217
    //   212: aload 5
    //   214: invokevirtual 145	java/io/FileInputStream:close	()V
    //   217: aload_2
    //   218: ifnull +7 -> 225
    //   221: aload_2
    //   222: invokevirtual 146	java/io/FileOutputStream:close	()V
    //   225: aload_3
    //   226: ifnull +7 -> 233
    //   229: aload_3
    //   230: invokevirtual 147	java/nio/channels/FileChannel:close	()V
    //   233: aload 4
    //   235: ifnull +8 -> 243
    //   238: aload 4
    //   240: invokevirtual 147	java/nio/channels/FileChannel:close	()V
    //   243: sipush 4001
    //   246: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   249: aload_0
    //   250: athrow
    //   251: astore_0
    //   252: goto -192 -> 60
    //   255: astore_0
    //   256: goto -191 -> 65
    //   259: astore_0
    //   260: goto -187 -> 73
    //   263: astore_0
    //   264: goto -181 -> 83
    //   267: astore_0
    //   268: goto -110 -> 158
    //   271: astore_0
    //   272: goto -106 -> 166
    //   275: astore_0
    //   276: goto -102 -> 174
    //   279: astore_0
    //   280: goto -96 -> 184
    //   283: astore_1
    //   284: goto -67 -> 217
    //   287: astore_1
    //   288: goto -63 -> 225
    //   291: astore_1
    //   292: goto -59 -> 233
    //   295: astore_1
    //   296: goto -53 -> 243
    //   299: astore_0
    //   300: aconst_null
    //   301: astore_1
    //   302: aload_2
    //   303: astore 5
    //   305: aconst_null
    //   306: astore 4
    //   308: aconst_null
    //   309: astore_3
    //   310: aload_1
    //   311: astore_2
    //   312: goto -105 -> 207
    //   315: astore_0
    //   316: aconst_null
    //   317: astore_1
    //   318: aload_2
    //   319: astore 5
    //   321: aconst_null
    //   322: astore 4
    //   324: aload_1
    //   325: astore_2
    //   326: goto -119 -> 207
    //   329: astore_0
    //   330: aload_2
    //   331: astore 5
    //   333: aconst_null
    //   334: astore_1
    //   335: aload 4
    //   337: astore_2
    //   338: aload_1
    //   339: astore 4
    //   341: goto -134 -> 207
    //   344: astore_0
    //   345: aload_2
    //   346: astore_1
    //   347: aload 5
    //   349: astore 7
    //   351: aload 4
    //   353: astore_2
    //   354: aload_1
    //   355: astore 5
    //   357: aload 7
    //   359: astore 4
    //   361: goto -154 -> 207
    //   364: astore_0
    //   365: goto -158 -> 207
    //   368: astore 7
    //   370: aconst_null
    //   371: astore 8
    //   373: aload_2
    //   374: astore 5
    //   376: aconst_null
    //   377: astore 4
    //   379: aconst_null
    //   380: astore_3
    //   381: aload 8
    //   383: astore_2
    //   384: goto -277 -> 107
    //   387: astore 7
    //   389: aconst_null
    //   390: astore 8
    //   392: aload_2
    //   393: astore 5
    //   395: aconst_null
    //   396: astore 4
    //   398: aload 8
    //   400: astore_2
    //   401: goto -294 -> 107
    //   404: astore 7
    //   406: aload_2
    //   407: astore 5
    //   409: aconst_null
    //   410: astore 8
    //   412: aload 4
    //   414: astore_2
    //   415: aload 8
    //   417: astore 4
    //   419: goto -312 -> 107
    //   422: astore 7
    //   424: aload_2
    //   425: astore 9
    //   427: aload 5
    //   429: astore 8
    //   431: aload 4
    //   433: astore_2
    //   434: aload 9
    //   436: astore 5
    //   438: aload 8
    //   440: astore 4
    //   442: goto -335 -> 107
    //
    // Exception table:
    //   from	to	target	type
    //   6	15	95	java/lang/Exception
    //   6	15	196	finally
    //   56	60	251	java/lang/Exception
    //   60	65	255	java/lang/Exception
    //   69	73	259	java/io/IOException
    //   78	83	263	java/io/IOException
    //   153	158	267	java/lang/Exception
    //   162	166	271	java/lang/Exception
    //   170	174	275	java/io/IOException
    //   179	184	279	java/io/IOException
    //   212	217	283	java/lang/Exception
    //   221	225	287	java/lang/Exception
    //   229	233	291	java/io/IOException
    //   238	243	295	java/io/IOException
    //   15	20	299	finally
    //   20	31	315	finally
    //   31	38	329	finally
    //   38	56	344	finally
    //   107	148	364	finally
    //   15	20	368	java/lang/Exception
    //   20	31	387	java/lang/Exception
    //   31	38	404	java/lang/Exception
    //   38	56	422	java/lang/Exception
  }

  private static void deleteAll(File paramFile)
  {
    AppMethodBeat.i(4006);
    if ((paramFile == null) || (!paramFile.exists()))
      AppMethodBeat.o(4006);
    while (true)
    {
      return;
      if (paramFile.isFile())
      {
        paramFile.delete();
        AppMethodBeat.o(4006);
      }
      else
      {
        if (paramFile.isDirectory())
        {
          File[] arrayOfFile = paramFile.listFiles();
          if ((arrayOfFile != null) && (arrayOfFile.length > 0))
          {
            int i = arrayOfFile.length;
            int j = 0;
            if (j < i)
            {
              File localFile = arrayOfFile[j];
              if ((localFile != null) && (localFile.exists()))
              {
                if (!localFile.isFile())
                  break label114;
                localFile.delete();
              }
              while (true)
              {
                j++;
                break;
                label114: deleteAll(localFile);
              }
            }
          }
          paramFile.delete();
        }
        AppMethodBeat.o(4006);
      }
    }
  }

  public static boolean deleteFile(String paramString)
  {
    AppMethodBeat.i(4004);
    paramString = new File(paramString);
    boolean bool;
    if ((paramString.exists()) && (paramString.isFile()))
    {
      paramString.delete();
      bool = true;
      AppMethodBeat.o(4004);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4004);
    }
  }

  public static boolean iI(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(4003);
    Object localObject = new File(paramString2);
    if ((!((File)localObject).isDirectory()) || (!((File)localObject).exists()))
      ((File)localObject).mkdirs();
    localObject = new File(paramString1).listFiles();
    if (localObject == null)
      AppMethodBeat.o(4003);
    while (true)
    {
      return bool;
      for (int i = 0; ; i++)
      {
        if (i >= localObject.length)
          break label235;
        if ((localObject[i].isFile()) && (!m(localObject[i], new File(new File(paramString2).getAbsolutePath() + File.separator + localObject[i].getName()))))
        {
          AppMethodBeat.o(4003);
          break;
        }
        if ((localObject[i].isDirectory()) && (iI(paramString1 + "/" + localObject[i].getName(), paramString2 + "/" + localObject[i].getName())))
        {
          AppMethodBeat.o(4003);
          break;
        }
      }
      label235: bool = true;
      AppMethodBeat.o(4003);
    }
  }

  // ERROR //
  public static boolean m(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: sipush 4002
    //   5: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 75	java/io/FileInputStream
    //   11: astore_3
    //   12: aload_3
    //   13: aload_0
    //   14: invokespecial 194	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   17: new 196	java/io/BufferedInputStream
    //   20: astore 4
    //   22: aload 4
    //   24: aload_3
    //   25: invokespecial 199	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   28: new 65	java/io/FileOutputStream
    //   31: astore 5
    //   33: aload 5
    //   35: aload_1
    //   36: invokespecial 68	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   39: new 201	java/io/BufferedOutputStream
    //   42: astore_0
    //   43: aload_0
    //   44: aload 5
    //   46: invokespecial 204	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   49: aload_0
    //   50: astore 6
    //   52: aload 5
    //   54: astore 7
    //   56: aload 4
    //   58: astore 8
    //   60: aload_3
    //   61: astore 9
    //   63: sipush 5120
    //   66: newarray byte
    //   68: astore_1
    //   69: aload_0
    //   70: astore 6
    //   72: aload 5
    //   74: astore 7
    //   76: aload 4
    //   78: astore 8
    //   80: aload_3
    //   81: astore 9
    //   83: aload 4
    //   85: aload_1
    //   86: invokevirtual 205	java/io/BufferedInputStream:read	([B)I
    //   89: istore 10
    //   91: iload 10
    //   93: iconst_m1
    //   94: if_icmpeq +126 -> 220
    //   97: aload_0
    //   98: astore 6
    //   100: aload 5
    //   102: astore 7
    //   104: aload 4
    //   106: astore 8
    //   108: aload_3
    //   109: astore 9
    //   111: aload_0
    //   112: aload_1
    //   113: iconst_0
    //   114: iload 10
    //   116: invokevirtual 206	java/io/BufferedOutputStream:write	([BII)V
    //   119: goto -50 -> 69
    //   122: astore_1
    //   123: aload_0
    //   124: astore 6
    //   126: aload 5
    //   128: astore 7
    //   130: aload 4
    //   132: astore 8
    //   134: aload_3
    //   135: astore 9
    //   137: new 27	java/lang/StringBuilder
    //   140: astore 11
    //   142: aload_0
    //   143: astore 6
    //   145: aload 5
    //   147: astore 7
    //   149: aload 4
    //   151: astore 8
    //   153: aload_3
    //   154: astore 9
    //   156: aload 11
    //   158: ldc 208
    //   160: invokespecial 33	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   163: aload_0
    //   164: astore 6
    //   166: aload 5
    //   168: astore 7
    //   170: aload 4
    //   172: astore 8
    //   174: aload_3
    //   175: astore 9
    //   177: ldc 25
    //   179: aload 11
    //   181: aload_1
    //   182: invokevirtual 37	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   185: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: invokestatic 50	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   194: aload 4
    //   196: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   199: aload_0
    //   200: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   203: aload_3
    //   204: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   207: aload 5
    //   209: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   212: sipush 4002
    //   215: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   218: iload_2
    //   219: ireturn
    //   220: aload_0
    //   221: astore 6
    //   223: aload 5
    //   225: astore 7
    //   227: aload 4
    //   229: astore 8
    //   231: aload_3
    //   232: astore 9
    //   234: aload_0
    //   235: invokevirtual 209	java/io/BufferedOutputStream:flush	()V
    //   238: aload 4
    //   240: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   243: aload_0
    //   244: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   247: aload_3
    //   248: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   251: aload 5
    //   253: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   256: iconst_1
    //   257: istore_2
    //   258: sipush 4002
    //   261: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   264: goto -46 -> 218
    //   267: astore_0
    //   268: aconst_null
    //   269: astore_1
    //   270: aconst_null
    //   271: astore 5
    //   273: aconst_null
    //   274: astore 4
    //   276: aconst_null
    //   277: astore_3
    //   278: aload 4
    //   280: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   283: aload_1
    //   284: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   287: aload_3
    //   288: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   291: aload 5
    //   293: invokestatic 89	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   296: sipush 4002
    //   299: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   302: aload_0
    //   303: athrow
    //   304: astore_0
    //   305: aconst_null
    //   306: astore_1
    //   307: aconst_null
    //   308: astore 5
    //   310: aconst_null
    //   311: astore 4
    //   313: goto -35 -> 278
    //   316: astore_0
    //   317: aconst_null
    //   318: astore_1
    //   319: aconst_null
    //   320: astore 5
    //   322: goto -44 -> 278
    //   325: astore_0
    //   326: aconst_null
    //   327: astore_1
    //   328: goto -50 -> 278
    //   331: astore_0
    //   332: aload 6
    //   334: astore_1
    //   335: aload 7
    //   337: astore 5
    //   339: aload 8
    //   341: astore 4
    //   343: aload 9
    //   345: astore_3
    //   346: goto -68 -> 278
    //   349: astore_1
    //   350: aconst_null
    //   351: astore_0
    //   352: aconst_null
    //   353: astore 5
    //   355: aconst_null
    //   356: astore 4
    //   358: aconst_null
    //   359: astore_3
    //   360: goto -237 -> 123
    //   363: astore_1
    //   364: aconst_null
    //   365: astore_0
    //   366: aconst_null
    //   367: astore 5
    //   369: aconst_null
    //   370: astore 4
    //   372: goto -249 -> 123
    //   375: astore_1
    //   376: aconst_null
    //   377: astore_0
    //   378: aconst_null
    //   379: astore 5
    //   381: goto -258 -> 123
    //   384: astore_1
    //   385: aconst_null
    //   386: astore_0
    //   387: goto -264 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   63	69	122	java/lang/Exception
    //   83	91	122	java/lang/Exception
    //   111	119	122	java/lang/Exception
    //   234	238	122	java/lang/Exception
    //   8	17	267	finally
    //   17	28	304	finally
    //   28	39	316	finally
    //   39	49	325	finally
    //   63	69	331	finally
    //   83	91	331	finally
    //   111	119	331	finally
    //   137	142	331	finally
    //   156	163	331	finally
    //   177	194	331	finally
    //   234	238	331	finally
    //   8	17	349	java/lang/Exception
    //   17	28	363	java/lang/Exception
    //   28	39	375	java/lang/Exception
    //   39	49	384	java/lang/Exception
  }

  public static void tryClose(Closeable paramCloseable)
  {
    AppMethodBeat.i(4007);
    if (paramCloseable == null)
      AppMethodBeat.o(4007);
    while (true)
    {
      return;
      try
      {
        paramCloseable.close();
        AppMethodBeat.o(4007);
      }
      catch (Exception paramCloseable)
      {
        Log.e("FileUtils", "closeable close  failed " + paramCloseable.getMessage());
        AppMethodBeat.o(4007);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.util.b
 * JD-Core Version:    0.6.2
 */