package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public final class ai$a
{
  // ERROR //
  public static int N(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: iconst_0
    //   5: istore 4
    //   7: sipush 16707
    //   10: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   13: aload_0
    //   14: aload_1
    //   15: iconst_0
    //   16: invokevirtual 27	android/content/Context:createPackageContext	(Ljava/lang/String;I)Landroid/content/Context;
    //   19: astore 5
    //   21: aload 5
    //   23: ifnonnull +35 -> 58
    //   26: sipush 16707
    //   29: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: iload 4
    //   34: istore 6
    //   36: iload 6
    //   38: ireturn
    //   39: astore_1
    //   40: ldc 32
    //   42: aload_1
    //   43: ldc 34
    //   45: iconst_0
    //   46: anewarray 4	java/lang/Object
    //   49: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   52: aconst_null
    //   53: astore 5
    //   55: goto -34 -> 21
    //   58: aload 5
    //   60: invokevirtual 44	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   63: astore 7
    //   65: new 46	android/content/res/Resources
    //   68: dup
    //   69: aload 7
    //   71: aload_0
    //   72: invokevirtual 50	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   75: invokevirtual 54	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   78: aconst_null
    //   79: invokespecial 58	android/content/res/Resources:<init>	(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V
    //   82: astore 8
    //   84: aload_3
    //   85: astore_1
    //   86: aload_2
    //   87: astore_0
    //   88: aload 5
    //   90: aload 7
    //   92: invokestatic 61	com/tencent/mm/platformtools/ai$a:a	(Landroid/content/Context;Landroid/content/res/AssetManager;)Landroid/content/res/XmlResourceParser;
    //   95: astore 5
    //   97: aload 5
    //   99: ifnonnull +28 -> 127
    //   102: aload 5
    //   104: ifnull +10 -> 114
    //   107: aload 5
    //   109: invokeinterface 67 1 0
    //   114: sipush 16707
    //   117: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: iload 4
    //   122: istore 6
    //   124: goto -88 -> 36
    //   127: aload 5
    //   129: astore_1
    //   130: aload 5
    //   132: astore_0
    //   133: aload 5
    //   135: invokeinterface 71 1 0
    //   140: istore 6
    //   142: iload 6
    //   144: iconst_1
    //   145: if_icmpeq +311 -> 456
    //   148: iload 6
    //   150: tableswitch	default:+18 -> 168, 2:+62->212
    //   169: iconst_2
    //   170: astore_0
    //   171: aload 5
    //   173: invokeinterface 74 1 0
    //   178: istore 9
    //   180: iload 9
    //   182: istore 6
    //   184: goto -42 -> 142
    //   187: astore_2
    //   188: aload 5
    //   190: astore_1
    //   191: aload 5
    //   193: astore_0
    //   194: ldc 32
    //   196: aload_2
    //   197: ldc 34
    //   199: iconst_0
    //   200: anewarray 4	java/lang/Object
    //   203: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   206: iconst_0
    //   207: istore 6
    //   209: goto -67 -> 142
    //   212: aload 5
    //   214: astore_1
    //   215: aload 5
    //   217: astore_0
    //   218: aload 5
    //   220: invokeinterface 78 1 0
    //   225: astore_2
    //   226: aload 5
    //   228: astore_1
    //   229: aload 5
    //   231: astore_0
    //   232: aload_2
    //   233: invokestatic 84	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   236: ifne -68 -> 168
    //   239: aload 5
    //   241: astore_1
    //   242: aload 5
    //   244: astore_0
    //   245: aload_2
    //   246: ldc 86
    //   248: invokevirtual 92	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   251: ifeq -83 -> 168
    //   254: aload 5
    //   256: astore_1
    //   257: aload 5
    //   259: astore_0
    //   260: aload 5
    //   262: ldc 94
    //   264: ldc 96
    //   266: invokeinterface 100 3 0
    //   271: aload 8
    //   273: invokestatic 103	com/tencent/mm/platformtools/ai$a:a	(Ljava/lang/String;Landroid/content/res/Resources;)Ljava/lang/String;
    //   276: astore_2
    //   277: aload 5
    //   279: astore_1
    //   280: aload 5
    //   282: astore_0
    //   283: aload_2
    //   284: invokestatic 84	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   287: istore 10
    //   289: iload 10
    //   291: ifeq +28 -> 319
    //   294: aload 5
    //   296: ifnull +10 -> 306
    //   299: aload 5
    //   301: invokeinterface 67 1 0
    //   306: sipush 16707
    //   309: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   312: iload 4
    //   314: istore 6
    //   316: goto -280 -> 36
    //   319: aload 5
    //   321: astore_1
    //   322: aload 5
    //   324: astore_0
    //   325: aload_2
    //   326: iconst_0
    //   327: invokestatic 109	com/tencent/mm/platformtools/ah:getInt	(Ljava/lang/String;I)I
    //   330: istore 6
    //   332: aload 5
    //   334: ifnull +10 -> 344
    //   337: aload 5
    //   339: invokeinterface 67 1 0
    //   344: sipush 16707
    //   347: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   350: goto -314 -> 36
    //   353: astore_2
    //   354: aload 5
    //   356: astore_1
    //   357: aload 5
    //   359: astore_0
    //   360: ldc 32
    //   362: aload_2
    //   363: ldc 34
    //   365: iconst_0
    //   366: anewarray 4	java/lang/Object
    //   369: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   372: goto -230 -> 142
    //   375: astore 5
    //   377: aload_1
    //   378: astore_0
    //   379: ldc 32
    //   381: aload 5
    //   383: ldc 34
    //   385: iconst_0
    //   386: anewarray 4	java/lang/Object
    //   389: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   392: aload_1
    //   393: ifnull +9 -> 402
    //   396: aload_1
    //   397: invokeinterface 67 1 0
    //   402: sipush 16707
    //   405: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   408: iload 4
    //   410: istore 6
    //   412: goto -376 -> 36
    //   415: astore_2
    //   416: aload 5
    //   418: astore_1
    //   419: aload 5
    //   421: astore_0
    //   422: ldc 32
    //   424: aload_2
    //   425: ldc 34
    //   427: iconst_0
    //   428: anewarray 4	java/lang/Object
    //   431: invokestatic 40	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   434: goto -292 -> 142
    //   437: astore_1
    //   438: aload_0
    //   439: ifnull +9 -> 448
    //   442: aload_0
    //   443: invokeinterface 67 1 0
    //   448: sipush 16707
    //   451: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   454: aload_1
    //   455: athrow
    //   456: aload 5
    //   458: ifnull -56 -> 402
    //   461: aload 5
    //   463: invokeinterface 67 1 0
    //   468: goto -66 -> 402
    //
    // Exception table:
    //   from	to	target	type
    //   13	21	39	android/content/pm/PackageManager$NameNotFoundException
    //   133	142	187	org/xmlpull/v1/XmlPullParserException
    //   171	180	353	org/xmlpull/v1/XmlPullParserException
    //   88	97	375	java/io/IOException
    //   133	142	375	java/io/IOException
    //   194	206	375	java/io/IOException
    //   218	226	375	java/io/IOException
    //   232	239	375	java/io/IOException
    //   245	254	375	java/io/IOException
    //   260	277	375	java/io/IOException
    //   283	289	375	java/io/IOException
    //   325	332	375	java/io/IOException
    //   360	372	375	java/io/IOException
    //   422	434	375	java/io/IOException
    //   171	180	415	java/io/IOException
    //   88	97	437	finally
    //   133	142	437	finally
    //   171	180	437	finally
    //   194	206	437	finally
    //   218	226	437	finally
    //   232	239	437	finally
    //   245	254	437	finally
    //   260	277	437	finally
    //   283	289	437	finally
    //   325	332	437	finally
    //   360	372	437	finally
    //   379	392	437	finally
    //   422	434	437	finally
  }

  private static XmlResourceParser a(Context paramContext, AssetManager paramAssetManager)
  {
    int i = 1;
    AppMethodBeat.i(16708);
    try
    {
      String str1 = (String)Context.class.getMethod("getPackageResourcePath", new Class[0]).invoke(paramContext, new Object[0]);
      Method localMethod = AssetManager.class.getMethod("getCookieName", new Class[] { Integer.TYPE });
      String str2 = str1;
      int j = i;
      if (str1 == null)
      {
        str2 = str1;
        j = i;
        if (paramContext.getPackageName().equals("android"))
          str2 = "/system/framework/framework-res.apk";
      }
      for (j = i; j < 20; j++)
        if (str2 != null)
          if (str2.equals(localMethod.invoke(paramAssetManager, new Object[] { Integer.valueOf(j) })))
          {
            paramContext = paramAssetManager.openXmlResourceParser(j, "AndroidManifest.xml");
            AppMethodBeat.o(16708);
            return paramContext;
          }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = paramAssetManager.openXmlResourceParser("AndroidManifest.xml");
        AppMethodBeat.o(16708);
      }
    }
  }

  private static String a(String paramString, Resources paramResources)
  {
    AppMethodBeat.i(16709);
    if ((paramString == null) || (!paramString.startsWith("@")))
      AppMethodBeat.o(16709);
    while (true)
    {
      return paramString;
      try
      {
        paramResources = paramResources.getString(Integer.parseInt(paramString.substring(1)));
        paramString = paramResources;
        AppMethodBeat.o(16709);
      }
      catch (NumberFormatException paramResources)
      {
        AppMethodBeat.o(16709);
      }
      catch (Resources.NotFoundException paramResources)
      {
        AppMethodBeat.o(16709);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ai.a
 * JD-Core Version:    0.6.2
 */