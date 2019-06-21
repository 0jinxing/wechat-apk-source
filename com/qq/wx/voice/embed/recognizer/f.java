package com.qq.wx.voice.embed.recognizer;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileNotFoundException;

final class f
{
  private boolean a = false;
  String b = null;

  private static boolean a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(123208);
    boolean bool = new File(paramString2 + "/" + paramString1).exists();
    AppMethodBeat.o(123208);
    return bool;
  }

  private static boolean a(String paramString, String[] paramArrayOfString)
  {
    boolean bool = false;
    AppMethodBeat.i(123206);
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfString.length)
        AppMethodBeat.o(123206);
      while (true)
      {
        return bool;
        if (paramString.compareTo(paramArrayOfString[i]) != 0)
          break;
        bool = true;
        AppMethodBeat.o(123206);
      }
    }
  }

  // ERROR //
  private static String b(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 68
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 27	java/io/File
    //   8: dup
    //   9: new 29	java/lang/StringBuilder
    //   12: dup
    //   13: aload_1
    //   14: invokestatic 35	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   17: invokespecial 38	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: ldc 40
    //   22: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: aload_0
    //   26: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokespecial 49	java/io/File:<init>	(Ljava/lang/String;)V
    //   35: astore_0
    //   36: new 70	java/io/FileInputStream
    //   39: dup
    //   40: aload_0
    //   41: invokespecial 73	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   44: astore_1
    //   45: aload_1
    //   46: invokevirtual 77	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   49: getstatic 83	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   52: lconst_0
    //   53: aload_0
    //   54: invokevirtual 87	java/io/File:length	()J
    //   57: invokevirtual 93	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   60: astore_2
    //   61: ldc 95
    //   63: invokestatic 101	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   66: astore_0
    //   67: aload_0
    //   68: aload_2
    //   69: invokevirtual 105	java/security/MessageDigest:update	(Ljava/nio/ByteBuffer;)V
    //   72: new 107	java/math/BigInteger
    //   75: astore_2
    //   76: aload_2
    //   77: iconst_1
    //   78: aload_0
    //   79: invokevirtual 111	java/security/MessageDigest:digest	()[B
    //   82: invokespecial 114	java/math/BigInteger:<init>	(I[B)V
    //   85: aload_2
    //   86: bipush 16
    //   88: invokevirtual 117	java/math/BigInteger:toString	(I)Ljava/lang/String;
    //   91: astore_0
    //   92: aload_1
    //   93: invokevirtual 120	java/io/FileInputStream:close	()V
    //   96: ldc 68
    //   98: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   101: aload_0
    //   102: areturn
    //   103: astore_0
    //   104: aload_1
    //   105: invokevirtual 120	java/io/FileInputStream:close	()V
    //   108: aconst_null
    //   109: astore_0
    //   110: goto -14 -> 96
    //   113: astore_0
    //   114: aconst_null
    //   115: astore_0
    //   116: goto -20 -> 96
    //   119: astore_0
    //   120: aload_1
    //   121: invokevirtual 120	java/io/FileInputStream:close	()V
    //   124: ldc 68
    //   126: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: aload_0
    //   130: athrow
    //   131: astore_1
    //   132: goto -8 -> 124
    //   135: astore_1
    //   136: goto -40 -> 96
    //
    // Exception table:
    //   from	to	target	type
    //   45	92	103	java/lang/Exception
    //   104	108	113	java/io/IOException
    //   45	92	119	finally
    //   120	124	131	java/io/IOException
    //   92	96	135	java/io/IOException
  }

  // ERROR //
  private static void f(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: ldc 123
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 27	java/io/File
    //   8: dup
    //   9: new 29	java/lang/StringBuilder
    //   12: dup
    //   13: aload_1
    //   14: invokestatic 35	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   17: invokespecial 38	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: ldc 40
    //   22: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: aload_0
    //   26: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokespecial 49	java/io/File:<init>	(Ljava/lang/String;)V
    //   35: astore_1
    //   36: new 27	java/io/File
    //   39: dup
    //   40: new 29	java/lang/StringBuilder
    //   43: dup
    //   44: aload_2
    //   45: invokestatic 35	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   48: invokespecial 38	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   51: ldc 40
    //   53: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: aload_0
    //   57: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokespecial 49	java/io/File:<init>	(Ljava/lang/String;)V
    //   66: astore_2
    //   67: new 70	java/io/FileInputStream
    //   70: astore_0
    //   71: aload_0
    //   72: aload_1
    //   73: invokespecial 73	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   76: new 125	java/io/FileOutputStream
    //   79: astore_3
    //   80: aload_3
    //   81: aload_2
    //   82: invokespecial 126	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   85: aload_0
    //   86: invokevirtual 77	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   89: astore_1
    //   90: aload_3
    //   91: invokevirtual 127	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   94: astore 4
    //   96: aload_1
    //   97: lconst_0
    //   98: aload_1
    //   99: invokevirtual 130	java/nio/channels/FileChannel:size	()J
    //   102: aload 4
    //   104: invokevirtual 134	java/nio/channels/FileChannel:transferTo	(JJLjava/nio/channels/WritableByteChannel;)J
    //   107: pop2
    //   108: aload_0
    //   109: invokevirtual 120	java/io/FileInputStream:close	()V
    //   112: aload_1
    //   113: invokevirtual 135	java/nio/channels/FileChannel:close	()V
    //   116: aload_3
    //   117: invokevirtual 136	java/io/FileOutputStream:close	()V
    //   120: aload 4
    //   122: invokevirtual 135	java/nio/channels/FileChannel:close	()V
    //   125: ldc 123
    //   127: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: return
    //   131: astore_0
    //   132: aconst_null
    //   133: astore_2
    //   134: aconst_null
    //   135: astore 5
    //   137: aconst_null
    //   138: astore_0
    //   139: aconst_null
    //   140: astore_1
    //   141: aload_1
    //   142: invokevirtual 120	java/io/FileInputStream:close	()V
    //   145: aload 5
    //   147: invokevirtual 135	java/nio/channels/FileChannel:close	()V
    //   150: aload_0
    //   151: invokevirtual 136	java/io/FileOutputStream:close	()V
    //   154: aload_2
    //   155: invokevirtual 135	java/nio/channels/FileChannel:close	()V
    //   158: ldc 123
    //   160: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: goto -33 -> 130
    //   166: astore_0
    //   167: ldc 123
    //   169: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   172: goto -42 -> 130
    //   175: astore_1
    //   176: aconst_null
    //   177: astore 5
    //   179: aconst_null
    //   180: astore_2
    //   181: aconst_null
    //   182: astore_3
    //   183: aconst_null
    //   184: astore_0
    //   185: aload_0
    //   186: invokevirtual 120	java/io/FileInputStream:close	()V
    //   189: aload_2
    //   190: invokevirtual 135	java/nio/channels/FileChannel:close	()V
    //   193: aload_3
    //   194: invokevirtual 136	java/io/FileOutputStream:close	()V
    //   197: aload 5
    //   199: invokevirtual 135	java/nio/channels/FileChannel:close	()V
    //   202: ldc 123
    //   204: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   207: aload_1
    //   208: athrow
    //   209: astore_0
    //   210: ldc 123
    //   212: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   215: goto -85 -> 130
    //   218: astore_0
    //   219: goto -17 -> 202
    //   222: astore_1
    //   223: aconst_null
    //   224: astore 5
    //   226: aconst_null
    //   227: astore_2
    //   228: aconst_null
    //   229: astore_3
    //   230: goto -45 -> 185
    //   233: astore_1
    //   234: aconst_null
    //   235: astore 5
    //   237: aconst_null
    //   238: astore_2
    //   239: goto -54 -> 185
    //   242: astore 5
    //   244: aconst_null
    //   245: astore 4
    //   247: aload_1
    //   248: astore_2
    //   249: aload 5
    //   251: astore_1
    //   252: aload 4
    //   254: astore 5
    //   256: goto -71 -> 185
    //   259: astore 5
    //   261: aload_1
    //   262: astore_2
    //   263: aload 5
    //   265: astore_1
    //   266: aload 4
    //   268: astore 5
    //   270: goto -85 -> 185
    //   273: astore_1
    //   274: aconst_null
    //   275: astore_2
    //   276: aconst_null
    //   277: astore 5
    //   279: aconst_null
    //   280: astore_3
    //   281: aload_0
    //   282: astore_1
    //   283: aload_3
    //   284: astore_0
    //   285: goto -144 -> 141
    //   288: astore_1
    //   289: aconst_null
    //   290: astore_2
    //   291: aconst_null
    //   292: astore 5
    //   294: aload_0
    //   295: astore_1
    //   296: aload_3
    //   297: astore_0
    //   298: goto -157 -> 141
    //   301: astore_2
    //   302: aconst_null
    //   303: astore 4
    //   305: aload_0
    //   306: astore_2
    //   307: aload_1
    //   308: astore 5
    //   310: aload_3
    //   311: astore_0
    //   312: aload_2
    //   313: astore_1
    //   314: aload 4
    //   316: astore_2
    //   317: goto -176 -> 141
    //   320: astore_2
    //   321: aload_0
    //   322: astore_2
    //   323: aload_1
    //   324: astore 5
    //   326: aload_3
    //   327: astore_0
    //   328: aload_2
    //   329: astore_1
    //   330: aload 4
    //   332: astore_2
    //   333: goto -192 -> 141
    //
    // Exception table:
    //   from	to	target	type
    //   67	76	131	java/io/IOException
    //   141	158	166	java/io/IOException
    //   67	76	175	finally
    //   108	125	209	java/io/IOException
    //   185	202	218	java/io/IOException
    //   76	85	222	finally
    //   85	90	233	finally
    //   90	96	242	finally
    //   96	108	259	finally
    //   76	85	273	java/io/IOException
    //   85	90	288	java/io/IOException
    //   90	96	301	java/io/IOException
    //   96	108	320	java/io/IOException
  }

  public final int c(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    AppMethodBeat.i(123204);
    if (this.a)
      AppMethodBeat.o(123204);
    while (true)
    {
      return i;
      if (!a("libwxvoiceembed.so", paramString1))
      {
        i = -201;
        AppMethodBeat.o(123204);
      }
      else if (!a("libwxvoiceembed.bin", paramString1))
      {
        i = -202;
        AppMethodBeat.o(123204);
      }
      else
      {
        paramContext = paramContext.getFilesDir().getAbsolutePath() + "/NamesSearch/";
        Object localObject = new File(paramContext);
        if (!((File)localObject).exists())
          ((File)localObject).mkdirs();
        if (!a("libwxvoiceembed.so", paramContext))
          f("libwxvoiceembed.so", paramString1, paramContext);
        if (!a("libwxvoiceembed.bin", paramContext))
          f("libwxvoiceembed.bin", paramString1, paramContext);
        try
        {
          String str = b("libwxvoiceembed.so", paramContext);
          localObject = b("libwxvoiceembed.so", paramString1);
          if (str.compareTo((String)localObject) != 0)
            f("libwxvoiceembed.so", paramString1, paramContext);
          if (a(str, paramString2.split(";")))
            break label223;
          AppMethodBeat.o(123204);
          i = -203;
        }
        catch (FileNotFoundException paramContext)
        {
          AppMethodBeat.o(123204);
          i = -203;
        }
        continue;
        try
        {
          label223: paramString2 = b("libwxvoiceembed.bin", paramContext);
          localObject = b("libwxvoiceembed.bin", paramString1);
          if (paramString2.compareTo((String)localObject) != 0)
            f("libwxvoiceembed.bin", paramString1, paramContext);
          if (a(paramString2, paramString3.split(";")))
            break label295;
          AppMethodBeat.o(123204);
          i = -204;
        }
        catch (FileNotFoundException paramContext)
        {
          AppMethodBeat.o(123204);
          i = -204;
        }
        continue;
        label295: this.b = paramContext;
        this.a = true;
        AppMethodBeat.o(123204);
      }
    }
  }

  public final int e(String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    AppMethodBeat.i(123205);
    if (this.a)
      AppMethodBeat.o(123205);
    while (true)
    {
      return i;
      if (!a("libwxvoiceembed.so", paramString1))
      {
        i = -201;
        AppMethodBeat.o(123205);
      }
      else if (!a("libwxvoiceembed.bin", paramString1))
      {
        i = -202;
        AppMethodBeat.o(123205);
      }
      else
      {
        try
        {
          String str = b("libwxvoiceembed.so", paramString1);
          if (a(str, paramString2.split(";")))
            break label116;
          AppMethodBeat.o(123205);
          i = -203;
        }
        catch (FileNotFoundException paramString1)
        {
          AppMethodBeat.o(123205);
          i = -203;
        }
        continue;
        try
        {
          label116: paramString2 = b("libwxvoiceembed.bin", paramString1);
          if (a(paramString2, paramString3.split(";")))
            break label163;
          AppMethodBeat.o(123205);
          i = -204;
        }
        catch (FileNotFoundException paramString1)
        {
          AppMethodBeat.o(123205);
          i = -204;
        }
        continue;
        label163: this.b = paramString1;
        this.a = true;
        AppMethodBeat.o(123205);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.qq.wx.voice.embed.recognizer.f
 * JD-Core Version:    0.6.2
 */