package com.tencent.smtt.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.TbsExtensionFunctionManager;
import com.tencent.smtt.sdk.TbsPVConfig;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
{
  public static int a(Context paramContext, File paramFile)
  {
    boolean bool1 = false;
    AppMethodBeat.i(65165);
    boolean bool2 = bool1;
    if (Build.VERSION.SDK_INT >= 23)
    {
      bool2 = bool1;
      if (!TbsExtensionFunctionManager.getInstance().canUseFunction(paramContext, "disable_get_apk_version_switch.txt"))
        bool2 = true;
    }
    int i = a(paramContext, paramFile, bool2);
    AppMethodBeat.o(65165);
    return i;
  }

  public static int a(Context paramContext, File paramFile, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(65167);
    if (paramFile != null);
    while (true)
    {
      try
      {
        if (paramFile.exists())
        {
          if (paramFile.getName().contains("tbs.org"))
          {
            k = c(paramFile);
            if (k > 0)
            {
              AppMethodBeat.o(65167);
              return k;
            }
            if ("com.tencent.mobileqq".equals(paramContext.getApplicationInfo().packageName))
              if (!paramFile.getAbsolutePath().contains("com.tencent.mm"))
              {
                boolean bool = paramFile.getAbsolutePath().contains("com.qzone");
                if (!bool);
              }
              else
              {
                AppMethodBeat.o(65167);
                k = j;
                continue;
              }
          }
          if (((Build.VERSION.SDK_INT != 23) && (Build.VERSION.SDK_INT != 25)) || (!Build.MANUFACTURER.toLowerCase().contains("mi")))
            break label274;
          k = 1;
          TbsPVConfig.releaseInstance();
          int m = TbsPVConfig.getInstance(paramContext).getReadApk();
          if (m == 1)
          {
            k = 0;
            paramBoolean = false;
            if ((!paramBoolean) && (k == 0))
              break label211;
            k = b(paramFile);
            if (k <= 0)
              break label211;
            AppMethodBeat.o(65167);
            continue;
          }
          if (m != 2)
            continue;
          AppMethodBeat.o(65167);
          k = j;
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
      }
      label211: int k = i;
      if (paramFile != null)
      {
        k = i;
        if (!paramFile.exists());
      }
      try
      {
        paramContext = paramContext.getPackageManager().getPackageArchiveInfo(paramFile.getAbsolutePath(), 1);
        k = i;
        if (paramContext != null)
          k = paramContext.versionCode;
        AppMethodBeat.o(65167);
      }
      catch (Throwable paramContext)
      {
        k = -1;
        AppMethodBeat.o(65167);
      }
      continue;
      label274: k = 0;
    }
  }

  // ERROR //
  public static String a(File paramFile)
  {
    // Byte code:
    //   0: ldc 138
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: bipush 16
    //   7: newarray char
    //   9: astore_1
    //   10: aload_1
    //   11: dup
    //   12: iconst_0
    //   13: ldc 139
    //   15: castore
    //   16: dup
    //   17: iconst_1
    //   18: ldc 140
    //   20: castore
    //   21: dup
    //   22: iconst_2
    //   23: ldc 141
    //   25: castore
    //   26: dup
    //   27: iconst_3
    //   28: ldc 142
    //   30: castore
    //   31: dup
    //   32: iconst_4
    //   33: ldc 143
    //   35: castore
    //   36: dup
    //   37: iconst_5
    //   38: ldc 144
    //   40: castore
    //   41: dup
    //   42: bipush 6
    //   44: ldc 145
    //   46: castore
    //   47: dup
    //   48: bipush 7
    //   50: ldc 146
    //   52: castore
    //   53: dup
    //   54: bipush 8
    //   56: ldc 147
    //   58: castore
    //   59: dup
    //   60: bipush 9
    //   62: ldc 148
    //   64: castore
    //   65: dup
    //   66: bipush 10
    //   68: ldc 149
    //   70: castore
    //   71: dup
    //   72: bipush 11
    //   74: ldc 150
    //   76: castore
    //   77: dup
    //   78: bipush 12
    //   80: ldc 151
    //   82: castore
    //   83: dup
    //   84: bipush 13
    //   86: ldc 152
    //   88: castore
    //   89: dup
    //   90: bipush 14
    //   92: ldc 153
    //   94: castore
    //   95: dup
    //   96: bipush 15
    //   98: ldc 154
    //   100: castore
    //   101: pop
    //   102: bipush 32
    //   104: newarray char
    //   106: astore_2
    //   107: ldc 156
    //   109: invokestatic 161	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   112: astore_3
    //   113: new 163	java/io/FileInputStream
    //   116: astore 4
    //   118: aload 4
    //   120: aload_0
    //   121: invokespecial 166	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   124: sipush 8192
    //   127: newarray byte
    //   129: astore_0
    //   130: aload 4
    //   132: aload_0
    //   133: invokevirtual 170	java/io/FileInputStream:read	([B)I
    //   136: istore 5
    //   138: iload 5
    //   140: iconst_m1
    //   141: if_icmpeq +35 -> 176
    //   144: aload_3
    //   145: aload_0
    //   146: iconst_0
    //   147: iload 5
    //   149: invokevirtual 174	java/security/MessageDigest:update	([BII)V
    //   152: goto -22 -> 130
    //   155: astore_0
    //   156: aload 4
    //   158: astore_0
    //   159: aload_0
    //   160: ifnull +7 -> 167
    //   163: aload_0
    //   164: invokevirtual 177	java/io/FileInputStream:close	()V
    //   167: ldc 138
    //   169: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   172: aconst_null
    //   173: astore_0
    //   174: aload_0
    //   175: areturn
    //   176: aload_3
    //   177: invokevirtual 181	java/security/MessageDigest:digest	()[B
    //   180: astore_0
    //   181: iconst_0
    //   182: istore 5
    //   184: iconst_0
    //   185: istore 6
    //   187: iload 5
    //   189: bipush 16
    //   191: if_icmpge +53 -> 244
    //   194: aload_0
    //   195: iload 5
    //   197: baload
    //   198: istore 7
    //   200: iload 6
    //   202: iconst_1
    //   203: iadd
    //   204: istore 8
    //   206: aload_2
    //   207: iload 6
    //   209: aload_1
    //   210: iload 7
    //   212: iconst_4
    //   213: iushr
    //   214: bipush 15
    //   216: iand
    //   217: caload
    //   218: i2c
    //   219: castore
    //   220: aload_2
    //   221: iload 8
    //   223: aload_1
    //   224: iload 7
    //   226: bipush 15
    //   228: iand
    //   229: caload
    //   230: i2c
    //   231: castore
    //   232: iinc 5 1
    //   235: iload 8
    //   237: iconst_1
    //   238: iadd
    //   239: istore 6
    //   241: goto -54 -> 187
    //   244: new 59	java/lang/String
    //   247: dup
    //   248: aload_2
    //   249: invokespecial 184	java/lang/String:<init>	([C)V
    //   252: astore_0
    //   253: aload 4
    //   255: ifnull +8 -> 263
    //   258: aload 4
    //   260: invokevirtual 177	java/io/FileInputStream:close	()V
    //   263: ldc 138
    //   265: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   268: goto -94 -> 174
    //   271: astore_0
    //   272: aconst_null
    //   273: astore 4
    //   275: aload 4
    //   277: ifnull +8 -> 285
    //   280: aload 4
    //   282: invokevirtual 177	java/io/FileInputStream:close	()V
    //   285: ldc 138
    //   287: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   290: aload_0
    //   291: athrow
    //   292: astore_0
    //   293: goto -126 -> 167
    //   296: astore 4
    //   298: goto -13 -> 285
    //   301: astore 4
    //   303: goto -40 -> 263
    //   306: astore_0
    //   307: goto -32 -> 275
    //   310: astore_0
    //   311: aconst_null
    //   312: astore_0
    //   313: goto -154 -> 159
    //
    // Exception table:
    //   from	to	target	type
    //   124	130	155	java/lang/Exception
    //   130	138	155	java/lang/Exception
    //   144	152	155	java/lang/Exception
    //   176	181	155	java/lang/Exception
    //   244	253	155	java/lang/Exception
    //   107	124	271	finally
    //   163	167	292	java/io/IOException
    //   280	285	296	java/io/IOException
    //   258	263	301	java/io/IOException
    //   124	130	306	finally
    //   130	138	306	finally
    //   144	152	306	finally
    //   176	181	306	finally
    //   244	253	306	finally
    //   107	124	310	java/lang/Exception
  }

  public static boolean a(Context paramContext, File paramFile, long paramLong, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(65163);
    if ((paramFile == null) || (!paramFile.exists()))
      AppMethodBeat.o(65163);
    while (true)
    {
      return bool1;
      if ((paramLong > 0L) && (paramLong != paramFile.length()))
      {
        AppMethodBeat.o(65163);
      }
      else
      {
        try
        {
          int i = a(paramContext, paramFile);
          if (paramInt != i)
          {
            AppMethodBeat.o(65163);
            continue;
          }
          boolean bool2 = "3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a".equals(b.a(paramContext, true, paramFile));
          if (bool2)
            break label107;
          AppMethodBeat.o(65163);
        }
        catch (Exception paramContext)
        {
          AppMethodBeat.o(65163);
        }
        continue;
        label107: AppMethodBeat.o(65163);
        bool1 = true;
      }
    }
  }

  // ERROR //
  public static int b(File paramFile)
  {
    // Byte code:
    //   0: ldc 200
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 2
    //   7: monitorenter
    //   8: new 202	java/util/jar/JarFile
    //   11: astore_1
    //   12: aload_1
    //   13: aload_0
    //   14: invokespecial 203	java/util/jar/JarFile:<init>	(Ljava/io/File;)V
    //   17: aload_1
    //   18: aload_1
    //   19: ldc 205
    //   21: invokevirtual 209	java/util/jar/JarFile:getJarEntry	(Ljava/lang/String;)Ljava/util/jar/JarEntry;
    //   24: invokevirtual 213	java/util/jar/JarFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   27: astore_2
    //   28: new 215	java/io/InputStreamReader
    //   31: astore_0
    //   32: aload_0
    //   33: aload_2
    //   34: invokespecial 218	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   37: new 220	java/io/BufferedReader
    //   40: astore_2
    //   41: aload_2
    //   42: aload_0
    //   43: invokespecial 223	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   46: aload_2
    //   47: invokevirtual 226	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   50: astore_0
    //   51: aload_0
    //   52: ifnull +138 -> 190
    //   55: aload_0
    //   56: ldc 228
    //   58: invokevirtual 63	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   61: ifeq -15 -> 46
    //   64: aload_0
    //   65: ldc 230
    //   67: invokevirtual 234	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   70: astore_0
    //   71: aload_0
    //   72: ifnull -26 -> 46
    //   75: aload_0
    //   76: arraylength
    //   77: iconst_2
    //   78: if_icmpne -32 -> 46
    //   81: aload_0
    //   82: iconst_1
    //   83: aaload
    //   84: invokevirtual 237	java/lang/String:trim	()Ljava/lang/String;
    //   87: invokestatic 243	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   90: istore_3
    //   91: aload_2
    //   92: ifnull +7 -> 99
    //   95: aload_2
    //   96: invokevirtual 244	java/io/BufferedReader:close	()V
    //   99: aload_1
    //   100: ifnull +7 -> 107
    //   103: aload_1
    //   104: invokevirtual 245	java/util/jar/JarFile:close	()V
    //   107: ldc 2
    //   109: monitorexit
    //   110: ldc 200
    //   112: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: iload_3
    //   116: ireturn
    //   117: astore_0
    //   118: aconst_null
    //   119: astore_2
    //   120: aconst_null
    //   121: astore_1
    //   122: aload_2
    //   123: ifnull +7 -> 130
    //   126: aload_2
    //   127: invokevirtual 244	java/io/BufferedReader:close	()V
    //   130: aload_1
    //   131: ifnull +7 -> 138
    //   134: aload_1
    //   135: invokevirtual 245	java/util/jar/JarFile:close	()V
    //   138: ldc 200
    //   140: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: aload_0
    //   144: athrow
    //   145: astore_0
    //   146: ldc 2
    //   148: monitorexit
    //   149: ldc 200
    //   151: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: aload_0
    //   155: athrow
    //   156: astore_0
    //   157: aconst_null
    //   158: astore_0
    //   159: aconst_null
    //   160: astore_1
    //   161: aload_0
    //   162: ifnull +7 -> 169
    //   165: aload_0
    //   166: invokevirtual 244	java/io/BufferedReader:close	()V
    //   169: aload_1
    //   170: ifnull +7 -> 177
    //   173: aload_1
    //   174: invokevirtual 245	java/util/jar/JarFile:close	()V
    //   177: iconst_m1
    //   178: istore_3
    //   179: ldc 2
    //   181: monitorexit
    //   182: ldc 200
    //   184: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: goto -72 -> 115
    //   190: aload_2
    //   191: ifnull +7 -> 198
    //   194: aload_2
    //   195: invokevirtual 244	java/io/BufferedReader:close	()V
    //   198: aload_1
    //   199: ifnull -22 -> 177
    //   202: aload_1
    //   203: invokevirtual 245	java/util/jar/JarFile:close	()V
    //   206: goto -29 -> 177
    //   209: astore_0
    //   210: goto -33 -> 177
    //   213: astore_0
    //   214: goto -107 -> 107
    //   217: astore_2
    //   218: goto -80 -> 138
    //   221: astore_0
    //   222: aconst_null
    //   223: astore_2
    //   224: goto -102 -> 122
    //   227: astore_0
    //   228: goto -106 -> 122
    //   231: astore_0
    //   232: aconst_null
    //   233: astore_0
    //   234: goto -73 -> 161
    //   237: astore_0
    //   238: aload_2
    //   239: astore_0
    //   240: goto -79 -> 161
    //
    // Exception table:
    //   from	to	target	type
    //   8	17	117	finally
    //   95	99	145	finally
    //   103	107	145	finally
    //   107	110	145	finally
    //   126	130	145	finally
    //   134	138	145	finally
    //   138	145	145	finally
    //   146	149	145	finally
    //   165	169	145	finally
    //   173	177	145	finally
    //   179	182	145	finally
    //   194	198	145	finally
    //   202	206	145	finally
    //   8	17	156	java/lang/Exception
    //   165	169	209	java/lang/Exception
    //   173	177	209	java/lang/Exception
    //   194	198	209	java/lang/Exception
    //   202	206	209	java/lang/Exception
    //   95	99	213	java/lang/Exception
    //   103	107	213	java/lang/Exception
    //   126	130	217	java/lang/Exception
    //   134	138	217	java/lang/Exception
    //   17	46	221	finally
    //   46	51	227	finally
    //   55	71	227	finally
    //   75	91	227	finally
    //   17	46	231	java/lang/Exception
    //   46	51	237	java/lang/Exception
    //   55	71	237	java/lang/Exception
    //   75	91	237	java/lang/Exception
  }

  private static int c(File paramFile)
  {
    AppMethodBeat.i(65166);
    try
    {
      paramFile = paramFile.getParentFile();
      if (paramFile != null)
      {
        File[] arrayOfFile = paramFile.listFiles();
        paramFile = Pattern.compile("x5.backup(.*)");
        int i = arrayOfFile.length;
        for (j = 0; j < i; j++)
        {
          File localFile = arrayOfFile[j];
          if ((paramFile.matcher(localFile.getName()).find()) && (localFile.isFile()) && (localFile.exists()))
          {
            j = Integer.parseInt(localFile.getName().substring(localFile.getName().lastIndexOf(".") + 1));
            AppMethodBeat.o(65166);
            return j;
          }
        }
      }
    }
    catch (Exception paramFile)
    {
      while (true)
      {
        int j = -1;
        AppMethodBeat.o(65166);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.a
 * JD-Core Version:    0.6.2
 */