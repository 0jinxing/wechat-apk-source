package com.tencent.mm.sdk.h;

import android.os.Build;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  private static Boolean evF = null;
  private static Boolean evG = null;
  private static Boolean xES = null;
  private static Boolean xET = null;
  private static Boolean xEU = null;

  // ERROR //
  public static boolean Ms()
  {
    // Byte code:
    //   0: ldc 28
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 14	com/tencent/mm/sdk/h/b:evF	Ljava/lang/Boolean;
    //   8: ifnonnull +62 -> 70
    //   11: new 36	java/io/FileInputStream
    //   14: astore_0
    //   15: new 38	java/io/File
    //   18: astore_1
    //   19: aload_1
    //   20: invokestatic 44	android/os/Environment:getRootDirectory	()Ljava/io/File;
    //   23: ldc 46
    //   25: invokespecial 50	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   28: aload_0
    //   29: aload_1
    //   30: invokespecial 53	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: aload_0
    //   34: astore_1
    //   35: new 55	java/util/Properties
    //   38: astore_2
    //   39: aload_0
    //   40: astore_1
    //   41: aload_2
    //   42: invokespecial 57	java/util/Properties:<init>	()V
    //   45: aload_0
    //   46: astore_1
    //   47: aload_2
    //   48: aload_0
    //   49: invokevirtual 61	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   52: aload_0
    //   53: astore_1
    //   54: aload_2
    //   55: ldc 63
    //   57: invokevirtual 67	java/util/Properties:containsKey	(Ljava/lang/Object;)Z
    //   60: invokestatic 73	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   63: putstatic 14	com/tencent/mm/sdk/h/b:evF	Ljava/lang/Boolean;
    //   66: aload_0
    //   67: invokevirtual 76	java/io/FileInputStream:close	()V
    //   70: getstatic 14	com/tencent/mm/sdk/h/b:evF	Ljava/lang/Boolean;
    //   73: invokevirtual 79	java/lang/Boolean:booleanValue	()Z
    //   76: istore_3
    //   77: ldc 28
    //   79: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   82: iload_3
    //   83: ireturn
    //   84: astore_2
    //   85: aconst_null
    //   86: astore_0
    //   87: aload_0
    //   88: astore_1
    //   89: ldc 84
    //   91: ldc 86
    //   93: iconst_1
    //   94: anewarray 4	java/lang/Object
    //   97: dup
    //   98: iconst_0
    //   99: aload_2
    //   100: aastore
    //   101: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   104: aload_0
    //   105: astore_1
    //   106: getstatic 95	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   109: putstatic 14	com/tencent/mm/sdk/h/b:evF	Ljava/lang/Boolean;
    //   112: aload_0
    //   113: ifnull -43 -> 70
    //   116: aload_0
    //   117: invokevirtual 76	java/io/FileInputStream:close	()V
    //   120: goto -50 -> 70
    //   123: astore_1
    //   124: goto -54 -> 70
    //   127: astore_0
    //   128: aconst_null
    //   129: astore_1
    //   130: aload_1
    //   131: ifnull +7 -> 138
    //   134: aload_1
    //   135: invokevirtual 76	java/io/FileInputStream:close	()V
    //   138: ldc 28
    //   140: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: aload_0
    //   144: athrow
    //   145: astore_1
    //   146: goto -76 -> 70
    //   149: astore_1
    //   150: goto -12 -> 138
    //   153: astore_0
    //   154: goto -24 -> 130
    //   157: astore_2
    //   158: goto -71 -> 87
    //
    // Exception table:
    //   from	to	target	type
    //   11	33	84	java/lang/Exception
    //   116	120	123	java/lang/Exception
    //   11	33	127	finally
    //   66	70	145	java/lang/Exception
    //   134	138	149	java/lang/Exception
    //   35	39	153	finally
    //   41	45	153	finally
    //   47	52	153	finally
    //   54	66	153	finally
    //   89	104	153	finally
    //   106	112	153	finally
    //   35	39	157	java/lang/Exception
    //   41	45	157	java/lang/Exception
    //   47	52	157	java/lang/Exception
    //   54	66	157	java/lang/Exception
  }

  // ERROR //
  public static boolean Mt()
  {
    // Byte code:
    //   0: ldc 97
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 16	com/tencent/mm/sdk/h/b:evG	Ljava/lang/Boolean;
    //   8: ifnonnull +93 -> 101
    //   11: new 36	java/io/FileInputStream
    //   14: astore_0
    //   15: new 38	java/io/File
    //   18: astore_1
    //   19: aload_1
    //   20: invokestatic 44	android/os/Environment:getRootDirectory	()Ljava/io/File;
    //   23: ldc 46
    //   25: invokespecial 50	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   28: aload_0
    //   29: aload_1
    //   30: invokespecial 53	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: aload_0
    //   34: astore_1
    //   35: new 55	java/util/Properties
    //   38: astore_2
    //   39: aload_0
    //   40: astore_1
    //   41: aload_2
    //   42: invokespecial 57	java/util/Properties:<init>	()V
    //   45: aload_0
    //   46: astore_1
    //   47: aload_2
    //   48: aload_0
    //   49: invokevirtual 61	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   52: aload_0
    //   53: astore_1
    //   54: ldc 84
    //   56: ldc 99
    //   58: iconst_1
    //   59: anewarray 4	java/lang/Object
    //   62: dup
    //   63: iconst_0
    //   64: aload_2
    //   65: ldc 63
    //   67: ldc 101
    //   69: invokevirtual 105	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   72: aastore
    //   73: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   76: aload_0
    //   77: astore_1
    //   78: aload_2
    //   79: ldc 63
    //   81: ldc 101
    //   83: invokevirtual 105	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   86: ldc 107
    //   88: invokevirtual 113	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   91: invokestatic 73	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   94: putstatic 16	com/tencent/mm/sdk/h/b:evG	Ljava/lang/Boolean;
    //   97: aload_0
    //   98: invokevirtual 76	java/io/FileInputStream:close	()V
    //   101: getstatic 16	com/tencent/mm/sdk/h/b:evG	Ljava/lang/Boolean;
    //   104: invokevirtual 79	java/lang/Boolean:booleanValue	()Z
    //   107: istore_3
    //   108: ldc 97
    //   110: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: iload_3
    //   114: ireturn
    //   115: astore_2
    //   116: aconst_null
    //   117: astore_0
    //   118: aload_0
    //   119: astore_1
    //   120: ldc 84
    //   122: ldc 86
    //   124: iconst_1
    //   125: anewarray 4	java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: aload_2
    //   131: aastore
    //   132: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: aload_0
    //   136: astore_1
    //   137: getstatic 95	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   140: putstatic 16	com/tencent/mm/sdk/h/b:evG	Ljava/lang/Boolean;
    //   143: aload_0
    //   144: ifnull -43 -> 101
    //   147: aload_0
    //   148: invokevirtual 76	java/io/FileInputStream:close	()V
    //   151: goto -50 -> 101
    //   154: astore_1
    //   155: goto -54 -> 101
    //   158: astore_0
    //   159: aconst_null
    //   160: astore_1
    //   161: aload_1
    //   162: ifnull +7 -> 169
    //   165: aload_1
    //   166: invokevirtual 76	java/io/FileInputStream:close	()V
    //   169: ldc 97
    //   171: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   174: aload_0
    //   175: athrow
    //   176: astore_1
    //   177: goto -76 -> 101
    //   180: astore_1
    //   181: goto -12 -> 169
    //   184: astore_0
    //   185: goto -24 -> 161
    //   188: astore_2
    //   189: goto -71 -> 118
    //
    // Exception table:
    //   from	to	target	type
    //   11	33	115	java/lang/Exception
    //   147	151	154	java/lang/Exception
    //   11	33	158	finally
    //   97	101	176	java/lang/Exception
    //   165	169	180	java/lang/Exception
    //   35	39	184	finally
    //   41	45	184	finally
    //   47	52	184	finally
    //   54	76	184	finally
    //   78	97	184	finally
    //   120	135	184	finally
    //   137	143	184	finally
    //   35	39	188	java/lang/Exception
    //   41	45	188	java/lang/Exception
    //   47	52	188	java/lang/Exception
    //   54	76	188	java/lang/Exception
    //   78	97	188	java/lang/Exception
  }

  public static boolean dqv()
  {
    AppMethodBeat.i(65370);
    if (xES == null)
    {
      String str = Build.MANUFACTURER;
      com.tencent.mm.sdk.platformtools.ab.i("Vendor.MIUI", "Build.MANUFACTURER = %s", new Object[] { str });
      if ((TextUtils.isEmpty(str)) || (!str.equalsIgnoreCase("Xiaomi")))
        break label88;
      if (!bo.isEqual(com.tencent.mm.compatible.e.ab.get("ro.miui.ui.version.code"), "8"))
        break label79;
      xES = Boolean.TRUE;
    }
    while (true)
    {
      boolean bool = xES.booleanValue();
      AppMethodBeat.o(65370);
      return bool;
      label79: xES = Boolean.FALSE;
      continue;
      label88: xES = Boolean.FALSE;
    }
  }

  public static boolean dqw()
  {
    AppMethodBeat.i(65371);
    if (xET == null)
    {
      String str = Build.MANUFACTURER;
      com.tencent.mm.sdk.platformtools.ab.i("Vendor.MIUI", "Build.MANUFACTURER = %s", new Object[] { str });
      if ((TextUtils.isEmpty(str)) || (!str.equalsIgnoreCase("Xiaomi")))
        break label66;
    }
    label66: for (xET = Boolean.TRUE; ; xET = Boolean.FALSE)
    {
      boolean bool = xET.booleanValue();
      AppMethodBeat.o(65371);
      return bool;
    }
  }

  public static boolean dqx()
  {
    AppMethodBeat.i(65372);
    if (xEU == null)
    {
      String str = Build.MANUFACTURER;
      com.tencent.mm.sdk.platformtools.ab.i("Vendor.MIUI", "Build.MANUFACTURER = %s, Build.MODEL = %s", new Object[] { str, Build.MODEL });
      if ((TextUtils.isEmpty(str)) || (!str.equals("Xiaomi")))
        break label144;
      str = getSystemProperty("ro.miui.version.code_time");
      com.tencent.mm.sdk.platformtools.ab.w("Vendor.MIUI", "ifNotificationChannelSupportNativeActionJump() versionCode:%s", new Object[] { str });
      if (Long.valueOf(str).longValue() <= Long.valueOf("1536681600").longValue())
        break label135;
      xEU = Boolean.TRUE;
    }
    while (true)
    {
      com.tencent.mm.sdk.platformtools.ab.i("Vendor.MIUI", "ifNotificationChannelSupportNativeActionJump() ifNotificationChannelSupportNativeActionJump:%s", new Object[] { Boolean.valueOf(xEU.booleanValue()) });
      boolean bool = xEU.booleanValue();
      AppMethodBeat.o(65372);
      return bool;
      label135: xEU = Boolean.FALSE;
      continue;
      label144: xEU = Boolean.FALSE;
    }
  }

  public static boolean g(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    boolean bool1 = true;
    AppMethodBeat.i(65373);
    boolean bool2;
    if (paramInt >= Integer.parseInt(paramString1))
    {
      if (!bo.isEqual(paramString2, ""))
        break label97;
      bool2 = bool1;
      if (dqw())
      {
        paramString1 = getSystemProperty("ro.miui.version.code_time");
        if (!bo.isNullOrNil(paramString3))
          break label69;
        paramInt = 1;
        bool2 = bool1;
        if (paramInt != 0);
      }
    }
    else
    {
      bool2 = false;
    }
    while (true)
    {
      AppMethodBeat.o(65373);
      return bool2;
      label69: if (Long.valueOf(paramString1).longValue() < Long.valueOf(paramString3).longValue())
      {
        paramInt = 1;
        break;
      }
      paramInt = 0;
      break;
      label97: bool2 = bool1;
      if (paramInt > Integer.parseInt(paramString2))
        bool2 = false;
    }
  }

  // ERROR //
  private static String getSystemProperty(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 207
    //   4: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 213	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   10: ldc 215
    //   12: aload_0
    //   13: invokestatic 218	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   16: invokevirtual 221	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   19: invokevirtual 225	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   22: astore_2
    //   23: new 227	java/io/BufferedReader
    //   26: astore_3
    //   27: new 229	java/io/InputStreamReader
    //   30: astore 4
    //   32: aload 4
    //   34: aload_2
    //   35: invokevirtual 235	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   38: invokespecial 237	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   41: aload_3
    //   42: aload 4
    //   44: sipush 1024
    //   47: invokespecial 240	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   50: aload_3
    //   51: astore_1
    //   52: aload_3
    //   53: invokevirtual 244	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   56: astore 4
    //   58: aload_3
    //   59: astore_1
    //   60: aload_3
    //   61: invokevirtual 245	java/io/BufferedReader:close	()V
    //   64: aload_3
    //   65: invokevirtual 245	java/io/BufferedReader:close	()V
    //   68: ldc 207
    //   70: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: aload 4
    //   75: astore_0
    //   76: aload_0
    //   77: areturn
    //   78: astore_0
    //   79: ldc 84
    //   81: ldc 247
    //   83: iconst_1
    //   84: anewarray 4	java/lang/Object
    //   87: dup
    //   88: iconst_0
    //   89: aload_0
    //   90: invokevirtual 250	java/io/IOException:getMessage	()Ljava/lang/String;
    //   93: aastore
    //   94: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   97: goto -29 -> 68
    //   100: astore 4
    //   102: aconst_null
    //   103: astore_3
    //   104: aload_3
    //   105: astore_1
    //   106: ldc 84
    //   108: ldc 252
    //   110: iconst_2
    //   111: anewarray 4	java/lang/Object
    //   114: dup
    //   115: iconst_0
    //   116: aload_0
    //   117: aastore
    //   118: dup
    //   119: iconst_1
    //   120: aload 4
    //   122: invokevirtual 250	java/io/IOException:getMessage	()Ljava/lang/String;
    //   125: aastore
    //   126: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aload_3
    //   130: ifnull +7 -> 137
    //   133: aload_3
    //   134: invokevirtual 245	java/io/BufferedReader:close	()V
    //   137: ldc 207
    //   139: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   142: aconst_null
    //   143: astore_0
    //   144: goto -68 -> 76
    //   147: astore_0
    //   148: ldc 84
    //   150: ldc 247
    //   152: iconst_1
    //   153: anewarray 4	java/lang/Object
    //   156: dup
    //   157: iconst_0
    //   158: aload_0
    //   159: invokevirtual 250	java/io/IOException:getMessage	()Ljava/lang/String;
    //   162: aastore
    //   163: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   166: goto -29 -> 137
    //   169: astore_0
    //   170: aload_1
    //   171: ifnull +7 -> 178
    //   174: aload_1
    //   175: invokevirtual 245	java/io/BufferedReader:close	()V
    //   178: ldc 207
    //   180: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   183: aload_0
    //   184: athrow
    //   185: astore_1
    //   186: ldc 84
    //   188: ldc 247
    //   190: iconst_1
    //   191: anewarray 4	java/lang/Object
    //   194: dup
    //   195: iconst_0
    //   196: aload_1
    //   197: invokevirtual 250	java/io/IOException:getMessage	()Ljava/lang/String;
    //   200: aastore
    //   201: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   204: goto -26 -> 178
    //   207: astore_0
    //   208: goto -38 -> 170
    //   211: astore 4
    //   213: goto -109 -> 104
    //
    // Exception table:
    //   from	to	target	type
    //   64	68	78	java/io/IOException
    //   7	50	100	java/io/IOException
    //   133	137	147	java/io/IOException
    //   7	50	169	finally
    //   174	178	185	java/io/IOException
    //   52	58	207	finally
    //   60	64	207	finally
    //   106	129	207	finally
    //   52	58	211	java/io/IOException
    //   60	64	211	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.h.b
 * JD-Core Version:    0.6.2
 */