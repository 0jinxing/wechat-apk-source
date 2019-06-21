package com.tencent.mm.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import dalvik.system.PathClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public final class a
{
  private static boolean crE;
  private static String crF;
  private static String crG;
  private static String crH;
  private static Set<a> crI;
  public static final boolean wY;

  static
  {
    AppMethodBeat.i(115061);
    crE = false;
    wY = F(System.getProperty("java.vm.version"));
    AppMethodBeat.o(115061);
  }

  private static boolean F(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(115052);
    boolean bool2 = bool1;
    Object localObject;
    if (paramString != null)
    {
      localObject = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(paramString);
      bool2 = bool1;
      if (!((Matcher)localObject).matches());
    }
    try
    {
      int i = Integer.parseInt(((Matcher)localObject).group(1));
      int j = Integer.parseInt(((Matcher)localObject).group(2));
      if (i <= 2)
      {
        bool2 = bool1;
        if (i == 2)
        {
          bool2 = bool1;
          if (j <= 0);
        }
      }
      else
      {
        bool2 = true;
      }
      localObject = new StringBuilder("VM with version ").append(paramString);
      if (bool2);
      for (paramString = " has multidex support"; ; paramString = " does not have multidex support")
      {
        ab.i("MicroMsg.MultiDex", paramString);
        AppMethodBeat.o(115052);
        return bool2;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
        bool2 = bool1;
    }
  }

  private static void a(Context paramContext, String paramString, List<File> paramList)
  {
    AppMethodBeat.i(115054);
    paramContext = (PathClassLoader)paramContext.getClassLoader();
    ab.i("MicroMsg.MultiDex", "before reflectPathClassLoader for debug: ClassLoader ".concat(String.valueOf(paramContext)));
    Collections.sort(paramList, new Comparator()
    {
    });
    Object localObject1 = paramList.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (File)((Iterator)localObject1).next();
      ab.i("MicroMsg.MultiDex", "real reflectPathClassLoader dexname: " + ((File)localObject2).getName());
    }
    paramString = new File(paramString);
    if (!paramList.isEmpty())
      if (Build.VERSION.SDK_INT >= 19)
      {
        localObject1 = b(paramContext, "pathList").get(paramContext);
        localObject2 = new ArrayList();
        b(localObject1, "dexElements", b.a(localObject1, new ArrayList(paramList), paramString, (ArrayList)localObject2));
        if (((ArrayList)localObject2).size() > 0)
        {
          paramString = ((ArrayList)localObject2).iterator();
          if (paramString.hasNext())
          {
            paramContext = (IOException)paramString.next();
            ab.w("MicroMsg.MultiDex", "Exception in makeDexElement", new Object[] { paramContext });
            AppMethodBeat.o(115054);
            throw paramContext;
          }
        }
      }
      else
      {
        localObject2 = b(paramContext, "pathList").get(paramContext);
        paramList = new ArrayList(paramList);
        b(localObject2, "dexElements", (Object[])b(localObject2, "makeDexElements", new Class[] { ArrayList.class, File.class }).invoke(localObject2, new Object[] { paramList, paramString }));
      }
    ab.i("MicroMsg.MultiDex", "after reflectPathClassloader for debug: ClassLoader ".concat(String.valueOf(paramContext)));
    AppMethodBeat.o(115054);
  }

  // ERROR //
  private static boolean a(a parama)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: ldc 232
    //   4: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 87	java/lang/StringBuilder
    //   10: dup
    //   11: invokespecial 233	java/lang/StringBuilder:<init>	()V
    //   14: getstatic 235	com/tencent/mm/f/a:crG	Ljava/lang/String;
    //   17: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: ldc 237
    //   22: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: aload_0
    //   26: getfield 240	com/tencent/mm/f/a$a:crJ	Ljava/lang/String;
    //   29: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: astore_2
    //   36: new 156	java/io/File
    //   39: dup
    //   40: aload_2
    //   41: invokespecial 162	java/io/File:<init>	(Ljava/lang/String;)V
    //   44: astore_3
    //   45: aload_3
    //   46: invokevirtual 243	java/io/File:isFile	()Z
    //   49: ifeq +10 -> 59
    //   52: aload_3
    //   53: invokevirtual 246	java/io/File:exists	()Z
    //   56: ifne +27 -> 83
    //   59: ldc 100
    //   61: ldc 248
    //   63: iconst_1
    //   64: anewarray 4	java/lang/Object
    //   67: dup
    //   68: iconst_0
    //   69: aload_2
    //   70: aastore
    //   71: invokestatic 250	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   74: ldc 232
    //   76: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   79: iconst_0
    //   80: istore_1
    //   81: iload_1
    //   82: ireturn
    //   83: new 156	java/io/File
    //   86: dup
    //   87: getstatic 252	com/tencent/mm/f/a:crH	Ljava/lang/String;
    //   90: invokespecial 162	java/io/File:<init>	(Ljava/lang/String;)V
    //   93: astore 4
    //   95: invokestatic 256	java/lang/System:currentTimeMillis	()J
    //   98: lstore 5
    //   100: aload 4
    //   102: invokestatic 262	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:ao	(Ljava/io/File;)Lcom/tencent/tinker/loader/shareutil/ShareFileLockHelper;
    //   105: astore_3
    //   106: ldc 100
    //   108: ldc_w 264
    //   111: iconst_2
    //   112: anewarray 4	java/lang/Object
    //   115: dup
    //   116: iconst_0
    //   117: lload 5
    //   119: invokestatic 270	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   122: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   125: aastore
    //   126: dup
    //   127: iconst_1
    //   128: getstatic 252	com/tencent/mm/f/a:crH	Ljava/lang/String;
    //   131: aastore
    //   132: invokestatic 250	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: new 277	java/io/FileInputStream
    //   138: astore 7
    //   140: aload 7
    //   142: aload_2
    //   143: invokespecial 278	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   146: aload 7
    //   148: astore 8
    //   150: aload_3
    //   151: astore_2
    //   152: aload 7
    //   154: ldc_w 279
    //   157: invokestatic 284	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   160: astore 9
    //   162: aload 9
    //   164: ifnull +66 -> 230
    //   167: aload 7
    //   169: astore 8
    //   171: aload_3
    //   172: astore_2
    //   173: aload 9
    //   175: aload_0
    //   176: getfield 287	com/tencent/mm/f/a$a:crK	Ljava/lang/String;
    //   179: invokevirtual 290	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   182: istore 10
    //   184: iload 10
    //   186: ifeq +44 -> 230
    //   189: aload_3
    //   190: invokevirtual 293	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   193: aload 7
    //   195: invokestatic 297	com/tencent/mm/f/a:closeQuietly	(Ljava/io/Closeable;)V
    //   198: ldc 232
    //   200: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   203: goto -122 -> 81
    //   206: astore_0
    //   207: ldc 100
    //   209: ldc_w 299
    //   212: iconst_1
    //   213: anewarray 4	java/lang/Object
    //   216: dup
    //   217: iconst_0
    //   218: aload 4
    //   220: invokevirtual 302	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   223: aastore
    //   224: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   227: goto -34 -> 193
    //   230: aload_3
    //   231: invokevirtual 293	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   234: aload 7
    //   236: invokestatic 297	com/tencent/mm/f/a:closeQuietly	(Ljava/io/Closeable;)V
    //   239: ldc 232
    //   241: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   244: iconst_0
    //   245: istore_1
    //   246: goto -165 -> 81
    //   249: astore_0
    //   250: ldc 100
    //   252: ldc_w 299
    //   255: iconst_1
    //   256: anewarray 4	java/lang/Object
    //   259: dup
    //   260: iconst_0
    //   261: aload 4
    //   263: invokevirtual 302	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   266: aastore
    //   267: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   270: goto -36 -> 234
    //   273: astore 9
    //   275: aconst_null
    //   276: astore_0
    //   277: aconst_null
    //   278: astore_3
    //   279: aload_0
    //   280: astore 8
    //   282: aload_3
    //   283: astore_2
    //   284: ldc 100
    //   286: aload 9
    //   288: ldc_w 307
    //   291: iconst_0
    //   292: anewarray 4	java/lang/Object
    //   295: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   298: aload_0
    //   299: astore 8
    //   301: aload_3
    //   302: astore_2
    //   303: ldc 100
    //   305: ldc_w 313
    //   308: iconst_1
    //   309: anewarray 4	java/lang/Object
    //   312: dup
    //   313: iconst_0
    //   314: aload 4
    //   316: invokevirtual 302	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   319: aastore
    //   320: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   323: aload_3
    //   324: ifnull +7 -> 331
    //   327: aload_3
    //   328: invokevirtual 293	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   331: aload_0
    //   332: invokestatic 297	com/tencent/mm/f/a:closeQuietly	(Ljava/io/Closeable;)V
    //   335: goto -96 -> 239
    //   338: astore_3
    //   339: ldc 100
    //   341: ldc_w 299
    //   344: iconst_1
    //   345: anewarray 4	java/lang/Object
    //   348: dup
    //   349: iconst_0
    //   350: aload 4
    //   352: invokevirtual 302	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   355: aastore
    //   356: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   359: goto -28 -> 331
    //   362: astore_0
    //   363: aconst_null
    //   364: astore 8
    //   366: aconst_null
    //   367: astore_3
    //   368: aload_3
    //   369: ifnull +7 -> 376
    //   372: aload_3
    //   373: invokevirtual 293	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   376: aload 8
    //   378: invokestatic 297	com/tencent/mm/f/a:closeQuietly	(Ljava/io/Closeable;)V
    //   381: ldc 232
    //   383: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   386: aload_0
    //   387: athrow
    //   388: astore_3
    //   389: ldc 100
    //   391: ldc_w 299
    //   394: iconst_1
    //   395: anewarray 4	java/lang/Object
    //   398: dup
    //   399: iconst_0
    //   400: aload 4
    //   402: invokevirtual 302	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   405: aastore
    //   406: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   409: goto -33 -> 376
    //   412: astore_0
    //   413: aconst_null
    //   414: astore 8
    //   416: goto -48 -> 368
    //   419: astore_0
    //   420: aload_2
    //   421: astore_3
    //   422: goto -54 -> 368
    //   425: astore 9
    //   427: aconst_null
    //   428: astore_0
    //   429: goto -150 -> 279
    //   432: astore 9
    //   434: aload 7
    //   436: astore_0
    //   437: goto -158 -> 279
    //
    // Exception table:
    //   from	to	target	type
    //   189	193	206	java/lang/Exception
    //   230	234	249	java/lang/Exception
    //   95	106	273	java/io/IOException
    //   327	331	338	java/lang/Exception
    //   95	106	362	finally
    //   372	376	388	java/lang/Exception
    //   106	146	412	finally
    //   152	162	419	finally
    //   173	184	419	finally
    //   284	298	419	finally
    //   303	323	419	finally
    //   106	146	425	java/io/IOException
    //   152	162	432	java/io/IOException
    //   173	184	432	java/io/IOException
  }

  // ERROR //
  private static boolean a(ZipFile paramZipFile, a parama)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc_w 315
    //   5: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc 100
    //   10: ldc_w 317
    //   13: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: new 156	java/io/File
    //   19: dup
    //   20: getstatic 252	com/tencent/mm/f/a:crH	Ljava/lang/String;
    //   23: invokespecial 162	java/io/File:<init>	(Ljava/lang/String;)V
    //   26: astore_3
    //   27: new 87	java/lang/StringBuilder
    //   30: dup
    //   31: invokespecial 233	java/lang/StringBuilder:<init>	()V
    //   34: getstatic 235	com/tencent/mm/f/a:crG	Ljava/lang/String;
    //   37: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: ldc 237
    //   42: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: aload_1
    //   46: getfield 240	com/tencent/mm/f/a$a:crJ	Ljava/lang/String;
    //   49: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: astore 4
    //   57: aconst_null
    //   58: astore 5
    //   60: aconst_null
    //   61: astore 6
    //   63: aload 6
    //   65: astore 7
    //   67: aload 5
    //   69: astore 8
    //   71: invokestatic 256	java/lang/System:currentTimeMillis	()J
    //   74: lstore 9
    //   76: aload 6
    //   78: astore 7
    //   80: aload 5
    //   82: astore 8
    //   84: aload_3
    //   85: invokestatic 262	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:ao	(Ljava/io/File;)Lcom/tencent/tinker/loader/shareutil/ShareFileLockHelper;
    //   88: astore 6
    //   90: aload 6
    //   92: astore 7
    //   94: aload 6
    //   96: astore 8
    //   98: ldc 100
    //   100: ldc_w 319
    //   103: iconst_2
    //   104: anewarray 4	java/lang/Object
    //   107: dup
    //   108: iconst_0
    //   109: lload 9
    //   111: invokestatic 270	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   114: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   117: aastore
    //   118: dup
    //   119: iconst_1
    //   120: getstatic 252	com/tencent/mm/f/a:crH	Ljava/lang/String;
    //   123: aastore
    //   124: invokestatic 250	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: aload 6
    //   129: astore 7
    //   131: aload 6
    //   133: astore 8
    //   135: aload_0
    //   136: aload_0
    //   137: aload_1
    //   138: getfield 240	com/tencent/mm/f/a$a:crJ	Ljava/lang/String;
    //   141: invokevirtual 325	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   144: invokevirtual 329	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   147: astore_0
    //   148: aload 6
    //   150: astore 7
    //   152: aload 6
    //   154: astore 8
    //   156: new 331	java/io/FileOutputStream
    //   159: astore_1
    //   160: aload 6
    //   162: astore 7
    //   164: aload 6
    //   166: astore 8
    //   168: aload_1
    //   169: aload 4
    //   171: invokespecial 332	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   174: new 334	java/io/BufferedOutputStream
    //   177: astore 8
    //   179: aload 8
    //   181: aload_1
    //   182: invokespecial 337	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   185: sipush 16384
    //   188: newarray byte
    //   190: astore_1
    //   191: aload_0
    //   192: aload_1
    //   193: invokevirtual 343	java/io/InputStream:read	([B)I
    //   196: istore 11
    //   198: iload 11
    //   200: iconst_m1
    //   201: if_icmpeq +22 -> 223
    //   204: aload 8
    //   206: aload_1
    //   207: iconst_0
    //   208: iload 11
    //   210: invokevirtual 347	java/io/BufferedOutputStream:write	([BII)V
    //   213: aload_0
    //   214: aload_1
    //   215: invokevirtual 343	java/io/InputStream:read	([B)I
    //   218: istore 11
    //   220: goto -22 -> 198
    //   223: aload 8
    //   225: invokevirtual 348	java/io/BufferedOutputStream:close	()V
    //   228: aload 6
    //   230: astore 7
    //   232: aload 6
    //   234: astore 8
    //   236: aload_0
    //   237: invokestatic 297	com/tencent/mm/f/a:closeQuietly	(Ljava/io/Closeable;)V
    //   240: aload 6
    //   242: astore 7
    //   244: aload 6
    //   246: astore 8
    //   248: ldc 100
    //   250: ldc_w 350
    //   253: iconst_1
    //   254: anewarray 4	java/lang/Object
    //   257: dup
    //   258: iconst_0
    //   259: getstatic 252	com/tencent/mm/f/a:crH	Ljava/lang/String;
    //   262: aastore
    //   263: invokestatic 250	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   266: aload 6
    //   268: invokevirtual 293	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   271: ldc_w 315
    //   274: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   277: iload_2
    //   278: ireturn
    //   279: astore_1
    //   280: aload 8
    //   282: invokevirtual 348	java/io/BufferedOutputStream:close	()V
    //   285: ldc_w 315
    //   288: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   291: aload_1
    //   292: athrow
    //   293: astore_1
    //   294: aload 6
    //   296: astore 7
    //   298: aload 6
    //   300: astore 8
    //   302: aload_0
    //   303: invokestatic 297	com/tencent/mm/f/a:closeQuietly	(Ljava/io/Closeable;)V
    //   306: aload 6
    //   308: astore 7
    //   310: aload 6
    //   312: astore 8
    //   314: ldc_w 315
    //   317: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   320: aload 6
    //   322: astore 7
    //   324: aload 6
    //   326: astore 8
    //   328: aload_1
    //   329: athrow
    //   330: astore_0
    //   331: aload 7
    //   333: astore 8
    //   335: ldc 100
    //   337: aload_0
    //   338: ldc_w 307
    //   341: iconst_0
    //   342: anewarray 4	java/lang/Object
    //   345: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   348: aload 7
    //   350: astore 8
    //   352: ldc 100
    //   354: ldc_w 352
    //   357: iconst_1
    //   358: anewarray 4	java/lang/Object
    //   361: dup
    //   362: iconst_0
    //   363: aload_3
    //   364: invokevirtual 302	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   367: aastore
    //   368: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   371: aload 7
    //   373: ifnull +8 -> 381
    //   376: aload 7
    //   378: invokevirtual 293	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   381: ldc_w 315
    //   384: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   387: iconst_0
    //   388: istore_2
    //   389: goto -112 -> 277
    //   392: astore_0
    //   393: ldc 100
    //   395: aload_0
    //   396: ldc_w 307
    //   399: iconst_0
    //   400: anewarray 4	java/lang/Object
    //   403: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   406: goto -135 -> 271
    //   409: astore_0
    //   410: ldc 100
    //   412: aload_0
    //   413: ldc_w 307
    //   416: iconst_0
    //   417: anewarray 4	java/lang/Object
    //   420: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   423: goto -42 -> 381
    //   426: astore_0
    //   427: aload 8
    //   429: ifnull +8 -> 437
    //   432: aload 8
    //   434: invokevirtual 293	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   437: ldc_w 315
    //   440: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   443: aload_0
    //   444: athrow
    //   445: astore_1
    //   446: ldc 100
    //   448: aload_1
    //   449: ldc_w 307
    //   452: iconst_0
    //   453: anewarray 4	java/lang/Object
    //   456: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   459: goto -22 -> 437
    //
    // Exception table:
    //   from	to	target	type
    //   185	198	279	finally
    //   204	220	279	finally
    //   174	185	293	finally
    //   223	228	293	finally
    //   280	293	293	finally
    //   71	76	330	java/io/IOException
    //   84	90	330	java/io/IOException
    //   98	127	330	java/io/IOException
    //   135	148	330	java/io/IOException
    //   156	160	330	java/io/IOException
    //   168	174	330	java/io/IOException
    //   236	240	330	java/io/IOException
    //   248	266	330	java/io/IOException
    //   302	306	330	java/io/IOException
    //   314	320	330	java/io/IOException
    //   328	330	330	java/io/IOException
    //   266	271	392	java/lang/Exception
    //   376	381	409	java/lang/Exception
    //   71	76	426	finally
    //   84	90	426	finally
    //   98	127	426	finally
    //   135	148	426	finally
    //   156	160	426	finally
    //   168	174	426	finally
    //   236	240	426	finally
    //   248	266	426	finally
    //   302	306	426	finally
    //   314	320	426	finally
    //   328	330	426	finally
    //   335	348	426	finally
    //   352	371	426	finally
    //   432	437	445	java/lang/Exception
  }

  private static Field b(Object paramObject, String paramString)
  {
    AppMethodBeat.i(115057);
    Class localClass = paramObject.getClass();
    while (localClass != null)
      try
      {
        Field localField = localClass.getDeclaredField(paramString);
        if (!localField.isAccessible())
          localField.setAccessible(true);
        AppMethodBeat.o(115057);
        return localField;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        localClass = localClass.getSuperclass();
      }
    paramObject = new NoSuchFieldException("Field " + paramString + " not found in " + paramObject.getClass());
    AppMethodBeat.o(115057);
    throw paramObject;
  }

  private static Method b(Object paramObject, String paramString, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(115058);
    Class localClass = paramObject.getClass();
    while (localClass != null)
      try
      {
        Method localMethod = localClass.getDeclaredMethod(paramString, paramArrayOfClass);
        if (!localMethod.isAccessible())
          localMethod.setAccessible(true);
        AppMethodBeat.o(115058);
        return localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localClass = localClass.getSuperclass();
      }
    paramObject = new NoSuchMethodException("Method " + paramString + " with parameters " + Arrays.asList(paramArrayOfClass) + " not found in " + paramObject.getClass());
    AppMethodBeat.o(115058);
    throw paramObject;
  }

  private static void b(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(115059);
    Field localField = b(paramObject, paramString);
    paramString = (Object[])localField.get(paramObject);
    Object[] arrayOfObject = (Object[])Array.newInstance(paramString.getClass().getComponentType(), paramString.length + paramArrayOfObject.length);
    System.arraycopy(paramString, 0, arrayOfObject, 0, paramString.length);
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, paramString.length, paramArrayOfObject.length);
    localField.set(paramObject, arrayOfObject);
    AppMethodBeat.o(115059);
  }

  private static boolean b(Context paramContext, String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(115050);
    try
    {
      paramContext = Class.forName(paramString, false, paramContext.getClassLoader());
      if (paramContext != null)
      {
        paramBoolean = true;
        AppMethodBeat.o(115050);
        return paramBoolean;
      }
    }
    catch (ClassNotFoundException paramContext)
    {
      while (true)
      {
        if (paramBoolean)
          ab.printErrStackTrace("MicroMsg.MultiDex", paramContext, "Failed to load a dex.", new Object[0]);
        if (paramBoolean)
          ab.w("MicroMsg.MultiDex", "checkDexLoaded fail.... ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(115050);
        paramBoolean = bool;
      }
    }
  }

  public static boolean ba(Context paramContext)
  {
    AppMethodBeat.i(115048);
    boolean bool;
    if (wY)
    {
      ab.i("MultiDex", "if need dexopt: VM has multidex support, MultiDex support library is disabled.");
      AppMethodBeat.o(115048);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (crE)
      {
        ab.i("MultiDex", "if need dexopt: has inited.");
        AppMethodBeat.o(115048);
        bool = false;
      }
      else
      {
        long l = System.currentTimeMillis();
        bl(paramContext);
        if ((crI == null) || (crI.size() <= 0))
        {
          AppMethodBeat.o(115048);
          bool = true;
        }
        else
        {
          crF = paramContext.getDir("cache", 0).getAbsolutePath();
          crG = paramContext.getDir("dex", 0).getAbsolutePath();
          crH = paramContext.getDir("cache", 0).getParentFile().getAbsolutePath() + "/dex.lock";
          File localFile = new File(crG);
          if (((!localFile.exists()) || (!localFile.isDirectory())) && (!localFile.mkdirs()))
          {
            ab.f("MicroMsg.MultiDex", "if need dexopt: extractZipEntryToFile: create target dex directory failed");
            AppMethodBeat.o(115048);
            bool = true;
          }
          else
          {
            int i = crI.size();
            Object localObject = new File(crF);
            if (((!((File)localObject).exists()) || (!((File)localObject).isDirectory())) && (!((File)localObject).mkdirs()))
            {
              ab.f("MicroMsg.MultiDex", "if need dexopt: extractZipEntryToFile: create target dexopt directory failed");
              AppMethodBeat.o(115048);
              bool = true;
            }
            else
            {
              ab.i("MicroMsg.MultiDex", "if need dexopt: install Build.VERSION: %d, tryLoadDexFileCount: %d, installDir: %d, optDir: %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(i), Integer.valueOf(localFile.list().length), Integer.valueOf(((File)localObject).list().length) });
              if ((localFile.list() == null) || (localFile.list().length < i) || (((File)localObject).list() == null) || (((File)localObject).list().length < i))
              {
                int j;
                if (localFile.list() == null)
                {
                  j = -1;
                  label380: if (((File)localObject).list() != null)
                    break label457;
                }
                label457: for (int k = -1; ; k = ((File)localObject).list().length)
                {
                  ab.i("MicroMsg.MultiDex", "if need dexopt: dex file count not equal, install path: %s vs %s, opt path: %s vs %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(i) });
                  AppMethodBeat.o(115048);
                  bool = true;
                  break;
                  j = localFile.list().length;
                  break label380;
                }
              }
              if (paramContext.getApplicationInfo() == null)
              {
                AppMethodBeat.o(115048);
                bool = false;
              }
              else
              {
                paramContext = crI.iterator();
                while (true)
                {
                  if (!paramContext.hasNext())
                    break label641;
                  localObject = (a)paramContext.next();
                  try
                  {
                    ab.i("MicroMsg.MultiDex", "if need dexopt: prepare dex to load, file: %s, md5: %s, loadClass: %s", new Object[] { ((a)localObject).crJ, ((a)localObject).crK, ((a)localObject).crL });
                    if (a((a)localObject))
                      ab.i("MicroMsg.MultiDex", "if need dexopt: verify dex for check md5: targetFilePath: [%s] time: %d", new Object[] { ((a)localObject).crJ, Long.valueOf(bo.gb(l)) });
                  }
                  finally
                  {
                    AppMethodBeat.o(115048);
                  }
                }
                ab.e("MicroMsg.MultiDex", "if need dexopt: targetDexFile md5 mismatch or not exists: %s", new Object[] { ((a)localObject).crJ });
                AppMethodBeat.o(115048);
                bool = true;
                continue;
                label641: AppMethodBeat.o(115048);
                bool = false;
              }
            }
          }
        }
      }
    }
  }

  // ERROR //
  public static void bb(Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 511
    //   3: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 516	android/os/Environment:getDataDirectory	()Ljava/io/File;
    //   9: astore_1
    //   10: new 518	android/os/StatFs
    //   13: astore_2
    //   14: aload_2
    //   15: aload_1
    //   16: invokevirtual 521	java/io/File:getPath	()Ljava/lang/String;
    //   19: invokespecial 522	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   22: aload_2
    //   23: invokevirtual 525	android/os/StatFs:getAvailableBlocks	()I
    //   26: i2l
    //   27: lstore_3
    //   28: aload_2
    //   29: invokevirtual 528	android/os/StatFs:getBlockSize	()I
    //   32: istore 5
    //   34: lload_3
    //   35: iload 5
    //   37: i2l
    //   38: lmul
    //   39: lstore_3
    //   40: aload_2
    //   41: invokevirtual 531	android/os/StatFs:getBlockCount	()I
    //   44: i2l
    //   45: lstore 6
    //   47: aload_2
    //   48: invokevirtual 528	android/os/StatFs:getBlockSize	()I
    //   51: istore 5
    //   53: iload 5
    //   55: i2l
    //   56: lload 6
    //   58: lmul
    //   59: lstore 6
    //   61: ldc 100
    //   63: ldc_w 533
    //   66: iconst_2
    //   67: anewarray 4	java/lang/Object
    //   70: dup
    //   71: iconst_0
    //   72: lload_3
    //   73: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   76: aastore
    //   77: dup
    //   78: iconst_1
    //   79: lload 6
    //   81: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   84: aastore
    //   85: invokestatic 250	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   88: lload 6
    //   90: lconst_0
    //   91: lcmp
    //   92: ifeq +107 -> 199
    //   95: lload_3
    //   96: ldc2_w 534
    //   99: lcmp
    //   100: ifge +99 -> 199
    //   103: aload_0
    //   104: invokestatic 540	android/os/Process:myPid	()I
    //   107: invokestatic 544	com/tencent/mm/sdk/platformtools/bo:aw	(Landroid/content/Context;I)Ljava/lang/String;
    //   110: astore_1
    //   111: ldc 100
    //   113: ldc_w 546
    //   116: iconst_3
    //   117: anewarray 4	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_1
    //   123: aastore
    //   124: dup
    //   125: iconst_1
    //   126: lload_3
    //   127: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   130: aastore
    //   131: dup
    //   132: iconst_2
    //   133: ldc2_w 534
    //   136: invokestatic 275	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   139: aastore
    //   140: invokestatic 250	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: aload_1
    //   144: ldc_w 307
    //   147: invokevirtual 550	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   150: ifne +49 -> 199
    //   153: aload_1
    //   154: ldc_w 552
    //   157: invokevirtual 555	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   160: ifne +39 -> 199
    //   163: new 557	android/content/Intent
    //   166: dup
    //   167: invokespecial 558	android/content/Intent:<init>	()V
    //   170: astore_1
    //   171: aload_1
    //   172: aload_0
    //   173: ldc_w 560
    //   176: invokevirtual 564	android/content/Intent:setClassName	(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    //   179: pop
    //   180: aload_1
    //   181: ldc_w 565
    //   184: invokevirtual 569	android/content/Intent:setFlags	(I)Landroid/content/Intent;
    //   187: pop
    //   188: aload_0
    //   189: aload_1
    //   190: invokevirtual 573	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   193: invokestatic 540	android/os/Process:myPid	()I
    //   196: invokestatic 576	android/os/Process:killProcess	(I)V
    //   199: ldc_w 511
    //   202: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   205: return
    //   206: astore_1
    //   207: lconst_0
    //   208: lstore_3
    //   209: ldc 100
    //   211: ldc_w 578
    //   214: invokestatic 580	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   217: lconst_0
    //   218: lstore 6
    //   220: goto -159 -> 61
    //   223: astore_1
    //   224: goto -15 -> 209
    //
    // Exception table:
    //   from	to	target	type
    //   6	34	206	java/lang/Exception
    //   40	53	223	java/lang/Exception
  }

  public static boolean bk(Context paramContext)
  {
    boolean bool;
    label172: ApplicationInfo localApplicationInfo;
    File localFile;
    ArrayList localArrayList;
    int j;
    label453: int k;
    Object localObject3;
    while (true)
    {
      try
      {
        AppMethodBeat.i(115049);
        ab.i("MicroMsg.MultiDex", "install multidex hasinit: %b, force: %b", new Object[] { Boolean.valueOf(crE), Boolean.TRUE });
        if (wY)
        {
          ab.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
          bool = true;
          AppMethodBeat.o(115049);
          return bool;
        }
        if (crE)
        {
          bool = true;
          AppMethodBeat.o(115049);
          continue;
        }
      }
      finally
      {
      }
      Object localObject1;
      if (paramContext.getClassLoader() != null)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("classloader: ");
        ab.i("MicroMsg.MultiDex", paramContext.getClassLoader().toString());
      }
      long l;
      while (true)
      {
        l = System.currentTimeMillis();
        bl(paramContext);
        if ((crI != null) && (crI.size() > 0))
          break label172;
        bool = false;
        AppMethodBeat.o(115049);
        break;
        ab.e("MicroMsg.MultiDex", "classloader is null");
      }
      try
      {
        localApplicationInfo = paramContext.getApplicationInfo();
        if (localApplicationInfo == null)
        {
          bool = false;
          AppMethodBeat.o(115049);
        }
        else
        {
          crF = paramContext.getDir("cache", 0).getAbsolutePath();
          crG = paramContext.getDir("dex", 0).getAbsolutePath();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          crH = paramContext.getDir("cache", 0).getParentFile().getAbsolutePath() + "/dex.lock";
          localObject1 = new java/io/File;
          ((File)localObject1).<init>(crG);
          if (((!((File)localObject1).exists()) || (!((File)localObject1).isDirectory())) && (!((File)localObject1).mkdirs()))
          {
            ab.f("MicroMsg.MultiDex", "extractZipEntryToFile: create target dex directory failed");
            bool = false;
            AppMethodBeat.o(115049);
          }
          else
          {
            i = crI.size();
            localFile = new java/io/File;
            localFile.<init>(crF);
            if (((!localFile.exists()) || (!localFile.isDirectory())) && (!localFile.mkdirs()))
            {
              ab.f("MicroMsg.MultiDex", "extractZipEntryToFile: create target dexopt directory failed");
              bool = false;
              AppMethodBeat.o(115049);
            }
            else
            {
              ab.i("MicroMsg.MultiDex", "install Build.VERSION: %d, tryLoadDexFileCount: %d, installDir: %d, optDir: %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(i), Integer.valueOf(((File)localObject1).list().length), Integer.valueOf(localFile.list().length) });
              localArrayList = new java/util/ArrayList;
              localArrayList.<init>(crI.size());
              i = 0;
              j = 0;
              k = i;
              if (j >= 5)
                break label888;
              k = i;
              if (i != 0)
                break label888;
              localArrayList.clear();
              localObject1 = crI.iterator();
              while (true)
              {
                if (!((Iterator)localObject1).hasNext())
                  break label867;
                localObject3 = (a)((Iterator)localObject1).next();
                ab.i("MicroMsg.MultiDex", "prepare dex to load, file: %s, md5: %s, loadClass: %s", new Object[] { ((a)localObject3).crJ, ((a)localObject3).crK, ((a)localObject3).crL });
                if (!a((a)localObject3))
                  break label777;
                ab.i("MicroMsg.MultiDex", "verify dex for check md5: targetFilePath: [%s] time: %d", new Object[] { ((a)localObject3).crJ, Long.valueOf(bo.gb(l)) });
                if (!b(paramContext, ((a)localObject3).crL, false))
                  break;
                ab.i("MicroMsg.MultiDex", "dex has been loaded, skip. targetFilePath: [%s]", new Object[] { ((a)localObject3).crJ });
              }
            }
          }
        }
      }
      catch (Throwable localThrowable)
      {
        ab.e("MicroMsg.MultiDex", "Multidex installation failure", new Object[] { localThrowable });
        ab.printErrStackTrace("MicroMsg.MultiDex", localThrowable, "Multidex installation failure", new Object[0]);
        bb(paramContext);
        paramContext = new java/lang/RuntimeException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("Multi dex installation failed (");
        paramContext.<init>(localThrowable.getMessage() + ").", localThrowable);
        AppMethodBeat.o(115049);
        throw paramContext;
      }
    }
    ab.w("MicroMsg.MultiDex", "dex [%s] is not load, it should be reload in further steps.", new Object[] { ((a)localObject3).crJ });
    label777: Object localObject2;
    while (true)
    {
      Object localObject4 = new java/io/File;
      StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>();
      ((File)localObject4).<init>(crG + "/" + ((a)localObject3).crJ);
      localArrayList.add(localObject4);
      break;
      ab.e("MicroMsg.MultiDex", "targetDexFile md5 mismatch or not exists: %s, force: %b", new Object[] { ((a)localObject3).crJ, Boolean.TRUE });
      localObject4 = new java/util/zip/ZipFile;
      ((ZipFile)localObject4).<init>(localApplicationInfo.sourceDir);
      bool = a((ZipFile)localObject4, (a)localObject3);
      try
      {
        ((ZipFile)localObject4).close();
        if (!bool)
        {
          localObject2 = new java/lang/Exception;
          ((Exception)localObject2).<init>("overwriteLocalSecondaryDexFromApk fail");
          AppMethodBeat.o(115049);
          throw ((Throwable)localObject2);
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.w("MicroMsg.MultiDex", "base apk file close quietly failed");
      }
    }
    label867: if (localArrayList.isEmpty())
    {
      ab.i("MicroMsg.MultiDex", "Nothing needs to be installed.");
      k = 1;
      label888: if (k == 0)
      {
        localObject2 = new java/lang/RuntimeException;
        ((RuntimeException)localObject2).<init>("Some dex is not installed successfully after 5 times retry !!");
        AppMethodBeat.o(115049);
        throw ((Throwable)localObject2);
      }
    }
    else
    {
      a(paramContext, crF, localArrayList);
      localObject3 = crI.iterator();
      while (true)
        if (((Iterator)localObject3).hasNext())
        {
          localObject2 = (a)((Iterator)localObject3).next();
          if (!b(paramContext, ((a)localObject2).crL, true))
          {
            ab.w("MicroMsg.MultiDex", "Failed to load dex [%s] in %d round, retry.", new Object[] { ((a)localObject2).crJ, Integer.valueOf(j + 1) });
            localObject3 = new java/io/File;
            StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
            localStringBuilder1.<init>();
            ((File)localObject3).<init>(crG + "/" + ((a)localObject2).crJ);
            localObject3 = ((File)localObject3).getName();
            localObject2 = localObject3;
            if (!((String)localObject3).endsWith(".dex"))
            {
              i = ((String)localObject3).lastIndexOf(".");
              if (i < 0)
              {
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                localObject2 = (String)localObject3 + ".dex";
              }
            }
            else
            {
              localObject3 = new java/io/File;
              ((File)localObject3).<init>(localFile, (String)localObject2);
              if (((File)localObject3).exists())
              {
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>("Remove perhaps broken odex file: ");
                ab.w("MicroMsg.MultiDex", ((File)localObject3).getAbsolutePath());
                if (!((File)localObject3).delete())
                {
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>("Failed to remove perhaps broken odex file: ");
                  ab.w("MicroMsg.MultiDex", ((File)localObject3).getAbsolutePath());
                }
              }
            }
          }
        }
    }
    label1096: for (int i = 0; ; i = 1)
    {
      j++;
      break label453;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>(i + 4);
      ((StringBuilder)localObject2).append((CharSequence)localObject3, 0, i);
      ((StringBuilder)localObject2).append(".dex");
      localObject2 = ((StringBuilder)localObject2).toString();
      break label1096;
      crE = true;
      ab.i("MicroMsg.MultiDex", "install done");
      bool = true;
      AppMethodBeat.o(115049);
      break;
    }
  }

  private static int bl(Context paramContext)
  {
    int i = 1;
    AppMethodBeat.i(115056);
    if (crI != null)
    {
      ab.w("MicroMsg.MultiDex", "preloaded dex files not empty, skipped preloading");
      AppMethodBeat.o(115056);
    }
    while (true)
    {
      return i;
      try
      {
        paramContext = bo.convertStreamToString(paramContext.getAssets().open("secondary-program-dex-jars/metadata.txt"));
        if ((paramContext == null) || (paramContext.length() <= 0))
        {
          paramContext = null;
          crI = paramContext;
          AppMethodBeat.o(115056);
          i = 0;
          continue;
        }
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        String[] arrayOfString = paramContext.split("\n");
        int j = arrayOfString.length;
        for (i = 0; ; i++)
        {
          paramContext = localHashSet;
          if (i >= j)
            break;
          paramContext = arrayOfString[i];
          if ((paramContext != null) && (paramContext.length() > 0))
          {
            Object localObject = paramContext.split(" ", 3);
            if ((localObject != null) && (localObject.length >= 3))
            {
              paramContext = localObject[0].trim();
              String str = localObject[1].trim();
              localObject = localObject[2].trim();
              ab.i("MicroMsg.MultiDex", "try parse dexname: %s, dexmd5:%s, classname:%s", new Object[] { paramContext, str, localObject });
              if ((paramContext != null) && (paramContext.length() > 0))
              {
                a locala = new com/tencent/mm/f/a$a;
                locala.<init>(paramContext, str, (String)localObject);
                localHashSet.add(locala);
              }
            }
          }
        }
      }
      catch (Exception paramContext)
      {
        while (true)
        {
          ab.e("MicroMsg.MultiDex", "load preload libraries failed");
          ab.printErrStackTrace("MicroMsg.MultiDex", paramContext, "", new Object[0]);
        }
      }
    }
  }

  private static void closeQuietly(Closeable paramCloseable)
  {
    AppMethodBeat.i(115055);
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      AppMethodBeat.o(115055);
      return;
    }
    catch (IOException paramCloseable)
    {
      while (true)
      {
        ab.w("MicroMsg.MultiDex", "Failed to close resource", new Object[] { paramCloseable });
        AppMethodBeat.o(115055);
      }
    }
  }

  static final class a
  {
    String crJ;
    String crK;
    String crL;

    public a(String paramString1, String paramString2, String paramString3)
    {
      this.crJ = paramString1;
      this.crK = paramString2;
      this.crL = paramString3;
    }
  }

  static final class b
  {
    static Object[] a(Object paramObject, ArrayList<File> paramArrayList, File paramFile, ArrayList<IOException> paramArrayList1)
    {
      AppMethodBeat.i(115046);
      try
      {
        Method localMethod1 = a.e(paramObject, "makeDexElements", new Class[] { ArrayList.class, File.class, ArrayList.class });
        paramObject = (Object[])localMethod1.invoke(paramObject, new Object[] { paramArrayList, paramFile, paramArrayList1 });
        AppMethodBeat.o(115046);
        return paramObject;
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        while (true)
        {
          ab.e("MicroMsg.MultiDex", "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure");
          try
          {
            Method localMethod2 = a.e(paramObject, "makeDexElements", new Class[] { List.class, File.class, List.class });
          }
          catch (NoSuchMethodException localNoSuchMethodException2)
          {
            ab.e("MicroMsg.MultiDex", "NoSuchMethodException: makeDexElements(List,File,List) failure");
            try
            {
              Method localMethod3 = a.e(paramObject, "makePathElements", new Class[] { List.class, File.class, List.class });
            }
            catch (NoSuchMethodException paramObject)
            {
              ab.e("MicroMsg.MultiDex", "NoSuchMethodException: makePathElements(List,File,List) failure");
              AppMethodBeat.o(115046);
            }
          }
        }
      }
      throw paramObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.f.a
 * JD-Core Version:    0.6.2
 */