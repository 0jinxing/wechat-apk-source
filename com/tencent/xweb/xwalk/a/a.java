package com.tencent.xweb.xwalk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.d.a;
import com.tencent.xweb.m;
import com.tencent.xweb.v;
import dalvik.system.DexClassLoader;
import java.io.File;
import org.xwalk.core.Log;

public final class a extends c
{
  // ERROR //
  private static String a(DexClassLoader paramDexClassLoader)
  {
    // Byte code:
    //   0: sipush 4175
    //   3: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ldc 21
    //   9: invokevirtual 27	dalvik/system/DexClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   12: ldc 29
    //   14: iconst_0
    //   15: anewarray 31	java/lang/Class
    //   18: invokevirtual 35	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   21: astore_0
    //   22: aload_0
    //   23: iconst_1
    //   24: invokevirtual 41	java/lang/reflect/Method:setAccessible	(Z)V
    //   27: aload_0
    //   28: aconst_null
    //   29: iconst_0
    //   30: anewarray 43	java/lang/Object
    //   33: invokevirtual 47	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast 49	java/lang/String
    //   39: astore_1
    //   40: aload_1
    //   41: astore_0
    //   42: aload_1
    //   43: ifnonnull +6 -> 49
    //   46: ldc 51
    //   48: astore_0
    //   49: aload_0
    //   50: astore_1
    //   51: invokestatic 57	org/xwalk/core/XWalkEnvironment:getApplicationContext	()Landroid/content/Context;
    //   54: ifnonnull +20 -> 74
    //   57: aload_0
    //   58: astore_1
    //   59: ldc 59
    //   61: ldc 61
    //   63: invokestatic 67	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: sipush 4175
    //   69: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: aload_0
    //   73: areturn
    //   74: aload_0
    //   75: astore_1
    //   76: ldc 72
    //   78: invokestatic 76	org/xwalk/core/XWalkEnvironment:getSharedPreferencesForPluginVersionInfo	(Ljava/lang/String;)Landroid/content/SharedPreferences;
    //   81: astore_2
    //   82: aload_2
    //   83: ifnonnull +21 -> 104
    //   86: aload_0
    //   87: astore_1
    //   88: ldc 59
    //   90: ldc 78
    //   92: invokestatic 67	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   95: sipush 4175
    //   98: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   101: goto -29 -> 72
    //   104: aload_0
    //   105: astore_1
    //   106: aload_2
    //   107: invokeinterface 84 1 0
    //   112: astore_2
    //   113: aload_0
    //   114: astore_1
    //   115: aload_2
    //   116: ldc 86
    //   118: aload_0
    //   119: invokeinterface 92 3 0
    //   124: pop
    //   125: aload_0
    //   126: astore_1
    //   127: aload_2
    //   128: invokeinterface 96 1 0
    //   133: istore_3
    //   134: aload_0
    //   135: astore_1
    //   136: new 98	java/lang/StringBuilder
    //   139: astore_2
    //   140: aload_0
    //   141: astore_1
    //   142: aload_2
    //   143: ldc 100
    //   145: invokespecial 103	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   148: aload_0
    //   149: astore_1
    //   150: ldc 59
    //   152: aload_2
    //   153: iload_3
    //   154: invokevirtual 107	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   157: ldc 109
    //   159: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: aload_0
    //   163: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: invokestatic 118	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: sipush 4175
    //   175: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: goto -106 -> 72
    //   181: astore_1
    //   182: ldc 51
    //   184: astore_0
    //   185: ldc 59
    //   187: new 98	java/lang/StringBuilder
    //   190: dup
    //   191: ldc 120
    //   193: invokespecial 103	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   196: aload_1
    //   197: invokevirtual 123	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   200: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: invokestatic 67	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   209: goto -37 -> 172
    //   212: astore_2
    //   213: aload_1
    //   214: astore_0
    //   215: aload_2
    //   216: astore_1
    //   217: goto -32 -> 185
    //
    // Exception table:
    //   from	to	target	type
    //   6	40	181	java/lang/Exception
    //   51	57	212	java/lang/Exception
    //   59	66	212	java/lang/Exception
    //   76	82	212	java/lang/Exception
    //   88	95	212	java/lang/Exception
    //   106	113	212	java/lang/Exception
    //   115	125	212	java/lang/Exception
    //   127	134	212	java/lang/Exception
    //   136	140	212	java/lang/Exception
    //   142	148	212	java/lang/Exception
    //   150	172	212	java/lang/Exception
  }

  public final int a(d paramd)
  {
    AppMethodBeat.i(4174);
    int i;
    if (!b(paramd))
    {
      Log.e("XWalkFileReaderPlugin", "performInstall unZipAndCheck failed, return");
      AppMethodBeat.o(4174);
      i = -1;
    }
    while (true)
    {
      return i;
      String str = bY(paramd.version, "filereader.apk");
      Object localObject1 = SE(paramd.version);
      label76: Object localObject2;
      if ((localObject1 == null) || (((String)localObject1).isEmpty()))
      {
        Log.e("XWalkFileReaderPlugin", "getDexDir versionDir is empty");
        localObject1 = "";
        localObject2 = new File((String)localObject1);
        if (((File)localObject2).exists())
          break label197;
        ((File)localObject2).mkdirs();
      }
      try
      {
        label197: File[] arrayOfFile;
        do
        {
          localObject2 = new dalvik/system/DexClassLoader;
          ((DexClassLoader)localObject2).<init>(str, (String)localObject1, null, ClassLoader.getSystemClassLoader());
          localObject1 = a((DexClassLoader)localObject2).split(",");
          m.dTZ().a((String[])localObject1, d.a.ALW);
          v.ab((String[])localObject1);
          SD(paramd.version);
          AppMethodBeat.o(4174);
          i = 0;
          break;
          localObject1 = (String)localObject1 + File.separator + "dex";
          break label76;
          arrayOfFile = ((File)localObject2).listFiles();
        }
        while ((arrayOfFile == null) || (arrayOfFile.length <= 0));
        int j = arrayOfFile.length;
        for (i = 0; i < j; i++)
        {
          localObject2 = arrayOfFile[i];
          if ((localObject2 != null) && (((File)localObject2).exists()))
            ((File)localObject2).delete();
        }
      }
      catch (Exception paramd)
      {
        Log.e("XWalkFileReaderPlugin", "performInstall error: " + paramd.getMessage());
        AppMethodBeat.o(4174);
        i = -1;
      }
    }
  }

  public final String aM(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(4173);
    String str = SE(paramInt);
    if ((str == null) || (str.isEmpty()))
    {
      str = "";
      AppMethodBeat.o(4173);
    }
    while (true)
    {
      return str;
      if (!paramBoolean)
      {
        str = str + File.separator + "FileReader.zip";
        AppMethodBeat.o(4173);
      }
      else
      {
        str = str + File.separator + "FileReader.patch";
        AppMethodBeat.o(4173);
      }
    }
  }

  public final String dVM()
  {
    return "FileReader";
  }

  public final boolean dVN()
  {
    return false;
  }

  public final boolean dVO()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.a.a
 * JD-Core Version:    0.6.2
 */