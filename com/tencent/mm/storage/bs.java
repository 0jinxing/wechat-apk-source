package com.tencent.mm.storage;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;

public final class bs extends k
{
  private z xZX = null;

  public bs(z paramz)
  {
    this.xZX = paramz;
  }

  public static boolean apW(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(59014);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(59014);
    while (true)
    {
      return bool;
      try
      {
        Map localMap = br.z(paramString, "deviceinfoconfig");
        if (localMap != null)
          break label67;
        AppMethodBeat.o(59014);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.ServerConfigInfoStorage", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(59014);
      }
      continue;
      label67: if (!g.RK())
      {
        AppMethodBeat.o(59014);
      }
      else
      {
        g.RQ();
        g.RP().Rz().apV(paramString);
        AppMethodBeat.o(59014);
        bool = true;
      }
    }
  }

  // ERROR //
  private static boolean apX(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: ldc 85
    //   4: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 87	java/io/File
    //   10: dup
    //   11: getstatic 93	com/tencent/mm/storage/ac:eSj	Ljava/lang/String;
    //   14: invokespecial 96	java/io/File:<init>	(Ljava/lang/String;)V
    //   17: astore_2
    //   18: aload_2
    //   19: invokevirtual 99	java/io/File:exists	()Z
    //   22: ifne +8 -> 30
    //   25: aload_2
    //   26: invokevirtual 102	java/io/File:mkdirs	()Z
    //   29: pop
    //   30: aconst_null
    //   31: astore_2
    //   32: new 104	java/lang/StringBuilder
    //   35: astore_3
    //   36: aload_3
    //   37: invokespecial 105	java/lang/StringBuilder:<init>	()V
    //   40: ldc 43
    //   42: ldc 107
    //   44: iconst_2
    //   45: anewarray 47	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: aload_3
    //   51: getstatic 93	com/tencent/mm/storage/ac:eSj	Ljava/lang/String;
    //   54: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: ldc 113
    //   59: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: aastore
    //   66: dup
    //   67: iconst_1
    //   68: aload_0
    //   69: aastore
    //   70: invokestatic 119	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: new 121	java/io/FileWriter
    //   76: astore_3
    //   77: new 104	java/lang/StringBuilder
    //   80: astore 4
    //   82: aload 4
    //   84: invokespecial 105	java/lang/StringBuilder:<init>	()V
    //   87: aload_3
    //   88: aload 4
    //   90: getstatic 93	com/tencent/mm/storage/ac:eSj	Ljava/lang/String;
    //   93: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc 113
    //   98: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokespecial 122	java/io/FileWriter:<init>	(Ljava/lang/String;)V
    //   107: aload_3
    //   108: astore_2
    //   109: aload_3
    //   110: aload_0
    //   111: invokevirtual 125	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   114: aload_3
    //   115: astore_2
    //   116: aload_3
    //   117: invokevirtual 128	java/io/FileWriter:close	()V
    //   120: aload_3
    //   121: invokevirtual 128	java/io/FileWriter:close	()V
    //   124: ldc 85
    //   126: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: iload_1
    //   130: ireturn
    //   131: astore_0
    //   132: ldc 43
    //   134: ldc 45
    //   136: iconst_1
    //   137: anewarray 47	java/lang/Object
    //   140: dup
    //   141: iconst_0
    //   142: aload_0
    //   143: invokestatic 51	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   146: aastore
    //   147: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: goto -26 -> 124
    //   153: astore_0
    //   154: aconst_null
    //   155: astore_3
    //   156: iconst_0
    //   157: istore_1
    //   158: aload_3
    //   159: astore_2
    //   160: ldc 43
    //   162: ldc 45
    //   164: iconst_1
    //   165: anewarray 47	java/lang/Object
    //   168: dup
    //   169: iconst_0
    //   170: aload_0
    //   171: invokestatic 51	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   174: aastore
    //   175: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: aload_3
    //   179: ifnull +86 -> 265
    //   182: aload_3
    //   183: invokevirtual 128	java/io/FileWriter:close	()V
    //   186: goto -62 -> 124
    //   189: astore_0
    //   190: ldc 43
    //   192: ldc 45
    //   194: iconst_1
    //   195: anewarray 47	java/lang/Object
    //   198: dup
    //   199: iconst_0
    //   200: aload_0
    //   201: invokestatic 51	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   204: aastore
    //   205: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   208: goto -84 -> 124
    //   211: astore_0
    //   212: aload_2
    //   213: ifnull +7 -> 220
    //   216: aload_2
    //   217: invokevirtual 128	java/io/FileWriter:close	()V
    //   220: ldc 85
    //   222: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   225: aload_0
    //   226: athrow
    //   227: astore_2
    //   228: ldc 43
    //   230: ldc 45
    //   232: iconst_1
    //   233: anewarray 47	java/lang/Object
    //   236: dup
    //   237: iconst_0
    //   238: aload_2
    //   239: invokestatic 51	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   242: aastore
    //   243: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   246: goto -26 -> 220
    //   249: astore_0
    //   250: goto -38 -> 212
    //   253: astore_0
    //   254: iconst_0
    //   255: istore_1
    //   256: goto -98 -> 158
    //   259: astore_0
    //   260: iconst_1
    //   261: istore_1
    //   262: goto -104 -> 158
    //   265: goto -141 -> 124
    //
    // Exception table:
    //   from	to	target	type
    //   120	124	131	java/io/IOException
    //   32	107	153	java/lang/Exception
    //   182	186	189	java/io/IOException
    //   32	107	211	finally
    //   216	220	227	java/io/IOException
    //   109	114	249	finally
    //   116	120	249	finally
    //   160	178	249	finally
    //   109	114	253	java/lang/Exception
    //   116	120	259	java/lang/Exception
  }

  private boolean dup()
  {
    AppMethodBeat.i(59008);
    String str = (String)this.xZX.get(77825, null);
    ab.i("MicroMsg.ServerConfigInfoStorage", "hy: readConfig xml ".concat(String.valueOf(str)));
    if (!bo.isNullOrNil(str))
      super.anF(str);
    boolean bool;
    if (!bo.isNullOrNil(str))
    {
      bool = true;
      AppMethodBeat.o(59008);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59008);
    }
  }

  private int duq()
  {
    int i = -1;
    AppMethodBeat.i(59009);
    Object localObject;
    if (!dup())
    {
      localObject = ac.eSj + "deviceconfig.cfg";
      if (!com.tencent.mm.a.e.ct((String)localObject))
        AppMethodBeat.o(59009);
    }
    while (true)
    {
      return i;
      localObject = com.tencent.mm.a.e.f((String)localObject, 0, -1);
      if (bo.cb((byte[])localObject))
      {
        i = -2;
        AppMethodBeat.o(59009);
      }
      else
      {
        localObject = new String((byte[])localObject, Charset.defaultCharset());
        if (bo.isNullOrNil((String)localObject))
        {
          i = -3;
          AppMethodBeat.o(59009);
        }
        else
        {
          ab.i("MicroMsg.ServerConfigInfoStorage", "hy: read from file: %s", new Object[] { localObject });
          apV((String)localObject);
          AppMethodBeat.o(59009);
          i = 0;
          continue;
          ab.i("MicroMsg.ServerConfigInfoStorage", "hy: got conf from db");
          AppMethodBeat.o(59009);
          i = 0;
        }
      }
    }
  }

  public static String dus()
  {
    AppMethodBeat.i(59012);
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    String str1 = Build.FINGERPRINT;
    String str2 = str1;
    if (str1 != null)
      str2 = str1.replace("/", ":");
    localLinkedHashMap.put("fingerprint", str2);
    localLinkedHashMap.put("manufacturer", Build.MANUFACTURER);
    localLinkedHashMap.put("device", Build.DEVICE);
    localLinkedHashMap.put("model", Build.MODEL);
    localLinkedHashMap.put("product", Build.PRODUCT);
    localLinkedHashMap.put("board", Build.BOARD);
    localLinkedHashMap.put("release", Build.VERSION.RELEASE);
    localLinkedHashMap.put("codename", Build.VERSION.CODENAME);
    localLinkedHashMap.put("incremental", Build.VERSION.INCREMENTAL);
    localLinkedHashMap.put("display", Build.DISPLAY);
    str2 = bo.a(localLinkedHashMap);
    ab.d("MicroMsg.ServerConfigInfoStorage", "getLocalFingerprint  ".concat(String.valueOf(str2)));
    AppMethodBeat.o(59012);
    return str2;
  }

  public static String dut()
  {
    AppMethodBeat.i(59013);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("<deviceinfo>");
    ((StringBuffer)localObject).append("<MANUFACTURER name=\"");
    ((StringBuffer)localObject).append(Build.MANUFACTURER);
    ((StringBuffer)localObject).append("\">");
    ((StringBuffer)localObject).append("<MODEL name=\"");
    ((StringBuffer)localObject).append(Build.MODEL);
    ((StringBuffer)localObject).append("\">");
    ((StringBuffer)localObject).append("<VERSION_RELEASE name=\"");
    ((StringBuffer)localObject).append(Build.VERSION.RELEASE);
    ((StringBuffer)localObject).append("\">");
    ((StringBuffer)localObject).append("<VERSION_INCREMENTAL name=\"");
    ((StringBuffer)localObject).append(Build.VERSION.INCREMENTAL);
    ((StringBuffer)localObject).append("\">");
    ((StringBuffer)localObject).append("<DISPLAY name=\"");
    ((StringBuffer)localObject).append(Build.DISPLAY);
    ((StringBuffer)localObject).append("\">");
    ((StringBuffer)localObject).append("</DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>");
    ab.d("MicroMsg.ServerConfigInfoStorage", "getFingerprint  " + ((StringBuffer)localObject).toString());
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(59013);
    return localObject;
  }

  public final int apV(String paramString)
  {
    AppMethodBeat.i(59011);
    ab.d("MicroMsg.ServerConfigInfoStorage", "dkconf info:[%s] ", new Object[] { paramString });
    this.xZX.set(77825, paramString);
    apX(paramString);
    super.anF(paramString);
    AppMethodBeat.o(59011);
    return 0;
  }

  public final void duo()
  {
    AppMethodBeat.i(59007);
    ab.i("MicroMsg.ServerConfigInfoStorage", "hy: read from local retcode: %d", new Object[] { Integer.valueOf(duq()) });
    AppMethodBeat.o(59007);
  }

  public final String dur()
  {
    AppMethodBeat.i(59010);
    String str = (String)this.xZX.get(77825, null);
    ab.d("MicroMsg.ServerConfigInfoStorage", "getInfoByKey xml " + str + " key 77825");
    AppMethodBeat.o(59010);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bs
 * JD-Core Version:    0.6.2
 */