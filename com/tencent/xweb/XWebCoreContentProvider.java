package com.tencent.xweb;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.util.f;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;

public class XWebCoreContentProvider extends ContentProvider
{
  private static void a(Context paramContext, XWebCoreContentProvider.c paramc)
  {
    AppMethodBeat.i(3950);
    String str1;
    Object localObject;
    label58: String str2;
    if (paramc.ANh.length() > 100)
    {
      str1 = paramc.ANh.substring(0, 99);
      if (paramc.ANi.ANj.length() <= 100)
        break label225;
      localObject = paramc.ANi.ANj.substring(0, 99);
      if (paramc.ANi.ANk.length() <= 100)
        break label236;
      str2 = paramc.ANi.ANk.substring(0, 99);
      label88: str1 = paramc.errCode + "," + str1 + "," + paramc.ANi.opType + "," + (String)localObject + "," + paramc.ANi.ihB + "," + str2;
      if ((paramContext == null) || ("com.tencent.mm".equals(paramc.ANh)))
        break label308;
      Log.d("XWebCoreContentProvider", "doReport need post to mm ".concat(String.valueOf(str1)));
      localObject = paramContext.getContentResolver();
      if (localObject != null)
        break label248;
      Log.e("XWebCoreContentProvider", "doReport content resolver is null");
      AppMethodBeat.o(3950);
    }
    while (true)
    {
      return;
      str1 = paramc.ANh;
      break;
      label225: localObject = paramc.ANi.ANj;
      break label58;
      label236: str2 = paramc.ANi.ANk;
      break label88;
      try
      {
        label248: paramContext = new android/content/ContentValues;
        paramContext.<init>();
        paramContext.put("15625", str1);
        ((ContentResolver)localObject).insert(b("com.tencent.mm", paramc.ANh, 3, 0, ""), paramContext);
        AppMethodBeat.o(3950);
      }
      catch (Exception paramContext)
      {
        Log.d("XWebCoreContentProvider", "doReport error post to mm");
        AppMethodBeat.o(3950);
      }
      continue;
      label308: if (f.hasInit())
      {
        Log.d("XWebCoreContentProvider", "doReport ".concat(String.valueOf(str1)));
        f.bX(15625, str1);
        AppMethodBeat.o(3950);
      }
      else
      {
        Log.d("XWebCoreContentProvider", "doReport reporter not init, cache ".concat(String.valueOf(str1)));
        paramContext = new b();
        paramContext.key = 15625;
        paramContext.value = str1;
        XWebCoreContentProvider.a.a(paramContext);
        AppMethodBeat.o(3950);
      }
    }
  }

  // ERROR //
  private static Map<String, String> ax(File paramFile)
  {
    // Byte code:
    //   0: sipush 3951
    //   3: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 165	java/util/HashMap
    //   9: dup
    //   10: invokespecial 166	java/util/HashMap:<init>	()V
    //   13: astore_1
    //   14: new 168	java/io/BufferedReader
    //   17: astore_2
    //   18: new 170	java/io/FileReader
    //   21: astore_3
    //   22: aload_3
    //   23: aload_0
    //   24: invokespecial 173	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   27: aload_2
    //   28: aload_3
    //   29: invokespecial 176	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   32: aload_2
    //   33: astore_0
    //   34: aload_2
    //   35: invokevirtual 179	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   38: astore_3
    //   39: aload_3
    //   40: ifnull +163 -> 203
    //   43: aload_2
    //   44: astore_0
    //   45: aload_3
    //   46: invokevirtual 182	java/lang/String:isEmpty	()Z
    //   49: ifne -17 -> 32
    //   52: aload_2
    //   53: astore_0
    //   54: aload_3
    //   55: ldc 184
    //   57: invokevirtual 188	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   60: astore_3
    //   61: aload_2
    //   62: astore_0
    //   63: aload_3
    //   64: arraylength
    //   65: iconst_2
    //   66: if_icmpne -34 -> 32
    //   69: aload_3
    //   70: iconst_0
    //   71: aaload
    //   72: ifnull -40 -> 32
    //   75: aload_2
    //   76: astore_0
    //   77: aload_3
    //   78: iconst_0
    //   79: aaload
    //   80: invokevirtual 182	java/lang/String:isEmpty	()Z
    //   83: ifne -51 -> 32
    //   86: aload_3
    //   87: iconst_1
    //   88: aaload
    //   89: ifnull -57 -> 32
    //   92: aload_2
    //   93: astore_0
    //   94: aload_3
    //   95: iconst_1
    //   96: aaload
    //   97: invokevirtual 182	java/lang/String:isEmpty	()Z
    //   100: ifne -68 -> 32
    //   103: aload_2
    //   104: astore_0
    //   105: aload_1
    //   106: aload_3
    //   107: iconst_0
    //   108: aaload
    //   109: aload_3
    //   110: iconst_1
    //   111: aaload
    //   112: invokeinterface 193 3 0
    //   117: pop
    //   118: aload_2
    //   119: astore_0
    //   120: new 54	java/lang/StringBuilder
    //   123: astore 4
    //   125: aload_2
    //   126: astore_0
    //   127: aload 4
    //   129: ldc 195
    //   131: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   134: aload_2
    //   135: astore_0
    //   136: ldc 86
    //   138: aload 4
    //   140: aload_3
    //   141: iconst_0
    //   142: aaload
    //   143: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: invokestatic 102	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   152: goto -120 -> 32
    //   155: astore_3
    //   156: aload_2
    //   157: astore_0
    //   158: new 54	java/lang/StringBuilder
    //   161: astore 4
    //   163: aload_2
    //   164: astore_0
    //   165: aload 4
    //   167: ldc 200
    //   169: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   172: aload_2
    //   173: astore_0
    //   174: ldc 86
    //   176: aload 4
    //   178: aload_3
    //   179: invokevirtual 203	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   182: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   188: invokestatic 113	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   191: aload_2
    //   192: invokestatic 209	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   195: sipush 3951
    //   198: invokestatic 116	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   201: aload_1
    //   202: areturn
    //   203: aload_2
    //   204: invokestatic 209	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   207: goto -12 -> 195
    //   210: astore_2
    //   211: aconst_null
    //   212: astore_0
    //   213: aload_0
    //   214: invokestatic 209	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   217: sipush 3951
    //   220: invokestatic 116	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   223: aload_2
    //   224: athrow
    //   225: astore_2
    //   226: goto -13 -> 213
    //   229: astore_3
    //   230: aconst_null
    //   231: astore_2
    //   232: goto -76 -> 156
    //
    // Exception table:
    //   from	to	target	type
    //   34	39	155	java/lang/Exception
    //   45	52	155	java/lang/Exception
    //   54	61	155	java/lang/Exception
    //   63	69	155	java/lang/Exception
    //   77	86	155	java/lang/Exception
    //   94	103	155	java/lang/Exception
    //   105	118	155	java/lang/Exception
    //   120	125	155	java/lang/Exception
    //   127	134	155	java/lang/Exception
    //   136	152	155	java/lang/Exception
    //   14	32	210	finally
    //   34	39	225	finally
    //   45	52	225	finally
    //   54	61	225	finally
    //   63	69	225	finally
    //   77	86	225	finally
    //   94	103	225	finally
    //   105	118	225	finally
    //   120	125	225	finally
    //   127	134	225	finally
    //   136	152	225	finally
    //   158	163	225	finally
    //   165	172	225	finally
    //   174	191	225	finally
    //   14	32	229	java/lang/Exception
  }

  public static Uri b(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3)
  {
    AppMethodBeat.i(3953);
    String str = paramString2;
    if (paramString2.isEmpty())
      str = " ";
    switch (paramInt1)
    {
    default:
      paramString1 = Uri.parse("content://" + paramString1 + ".sdk.xweb.XWebCoreProvider/" + str + "/" + paramInt1);
      AppMethodBeat.o(3953);
    case 2:
    }
    while (true)
    {
      return paramString1;
      paramString1 = Uri.parse("content://" + paramString1 + ".sdk.xweb.XWebCoreProvider/" + str + "/" + paramInt1 + "/" + paramInt2 + "/" + paramString3);
      AppMethodBeat.o(3953);
    }
  }

  public static void dUm()
  {
    AppMethodBeat.i(3954);
    XWebCoreContentProvider.a.dUn();
    AppMethodBeat.o(3954);
  }

  private static XWebCoreContentProvider.d y(Uri paramUri)
  {
    AppMethodBeat.i(3952);
    XWebCoreContentProvider.d locald = new XWebCoreContentProvider.d();
    locald.opType = -1;
    Object localObject = paramUri.toString();
    if (((String)localObject).length() > 1000)
    {
      Log.d("XWebCoreContentProvider", "parseUri exceed max length");
      AppMethodBeat.o(3952);
    }
    int i;
    while (true)
    {
      return locald;
      Log.d("XWebCoreContentProvider", "parseUri ".concat(String.valueOf(localObject)));
      localObject = paramUri.getPathSegments();
      if ((localObject == null) || (((List)localObject).size() < 2))
      {
        Log.d("XWebCoreContentProvider", "parseUri strList invalid");
        AppMethodBeat.o(3952);
      }
      else
      {
        paramUri = (String)((List)localObject).get(0);
        if ((paramUri == null) || (paramUri.isEmpty()))
        {
          Log.d("XWebCoreContentProvider", "parseUri callerName invalid");
          AppMethodBeat.o(3952);
        }
        else
        {
          locald.ANj = paramUri;
          try
          {
            i = Integer.parseInt((String)((List)localObject).get(1));
            switch (i)
            {
            default:
              Log.d("XWebCoreContentProvider", "parseUri invalid opType");
              AppMethodBeat.o(3952);
            case 1:
            case 3:
            case 2:
            }
          }
          catch (Exception paramUri)
          {
            Log.d("XWebCoreContentProvider", "parseUri error parse opType");
            AppMethodBeat.o(3952);
          }
        }
      }
    }
    if (((List)localObject).size() == 2)
    {
      locald.opType = i;
      Log.d("XWebCoreContentProvider", "parseUri result: ".concat(String.valueOf(i)));
    }
    while (true)
    {
      AppMethodBeat.o(3952);
      break;
      Log.d("XWebCoreContentProvider", "parseUri wrong params on test or report");
    }
    paramUri = null;
    if (((List)localObject).size() == 4)
      paramUri = (String)((List)localObject).get(3);
    while (true)
    {
      try
      {
        j = Integer.parseInt((String)((List)localObject).get(2));
        if ((j != -1) && (paramUri != null) && (!paramUri.isEmpty()))
        {
          locald.opType = i;
          locald.ihB = j;
          locald.ANk = paramUri;
          Log.d("XWebCoreContentProvider", "parseUri result: " + i + " " + j + " " + paramUri);
          AppMethodBeat.o(3952);
        }
      }
      catch (Exception localException)
      {
        Log.d("XWebCoreContentProvider", "parseUri error parse targetVersion");
        j = -1;
        continue;
        Log.d("XWebCoreContentProvider", "parseUri wrong params on get file");
        continue;
      }
      int j = -1;
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    AppMethodBeat.i(3948);
    if ((paramContentValues == null) || (paramContentValues.size() == 0))
    {
      Log.d("XWebCoreContentProvider", "insert values is null or empty");
      AppMethodBeat.o(3948);
    }
    while (true)
    {
      return null;
      if (y(paramUri).opType != 3)
      {
        Log.d("XWebCoreContentProvider", "insert wrong opType");
        AppMethodBeat.o(3948);
      }
      else
      {
        paramUri = getContext();
        if (paramUri == null)
        {
          Log.e("XWebCoreContentProvider", "insert context is null");
          AppMethodBeat.o(3948);
        }
        else if (!"com.tencent.mm".equals(paramUri.getPackageName()))
        {
          Log.e("XWebCoreContentProvider", "insert current not mm, return");
          AppMethodBeat.o(3948);
        }
        else
        {
          Log.d("XWebCoreContentProvider", "insert start report");
          paramUri = paramContentValues.valueSet().iterator();
          while (paramUri.hasNext())
          {
            paramContentValues = (Map.Entry)paramUri.next();
            int i;
            try
            {
              i = Integer.parseInt((String)paramContentValues.getKey());
              paramContentValues = (String)paramContentValues.getValue();
              if ((!f.Sw(i)) || (paramContentValues == null) || (paramContentValues.isEmpty()))
                continue;
              if (!f.hasInit())
                break label256;
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>("insert report ");
              Log.d("XWebCoreContentProvider", i + " " + paramContentValues);
              f.bX(i, paramContentValues);
            }
            catch (Exception paramContentValues)
            {
              Log.d("XWebCoreContentProvider", "insert parse error");
            }
            continue;
            label256: Object localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("insert reporter not init, cache ");
            Log.d("XWebCoreContentProvider", i + " " + paramContentValues);
            localObject = new com/tencent/xweb/XWebCoreContentProvider$b;
            ((b)localObject).<init>();
            ((b)localObject).key = i;
            ((b)localObject).value = paramContentValues;
            XWebCoreContentProvider.a.a((b)localObject);
          }
          AppMethodBeat.o(3948);
        }
      }
    }
  }

  public boolean onCreate()
  {
    return true;
  }

  public ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    AppMethodBeat.i(3949);
    XWebCoreContentProvider.d locald = y(paramUri);
    XWebCoreContentProvider.c localc = new XWebCoreContentProvider.c();
    localc.errCode = -1;
    localc.ANi = locald;
    Context localContext = getContext();
    if (localContext == null)
    {
      Log.e("XWebCoreContentProvider", "openFile context is null");
      localc.errCode = -2;
      a(null, localc);
      AppMethodBeat.o(3949);
      paramUri = null;
    }
    while (true)
    {
      return paramUri;
      int i;
      try
      {
        paramUri = localContext.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (paramUri == null)
        {
          paramUri = localContext.getPackageName();
          localc.ANh = paramUri;
          Log.d("XWebCoreContentProvider", "openFile current package: ".concat(String.valueOf(paramUri)));
          if (XWalkEnvironment.isProvider(paramUri))
            break label266;
          Log.e("XWebCoreContentProvider", "openFile current is not provider");
          localc.errCode = -3;
          a(localContext, localc);
          AppMethodBeat.o(3949);
          paramUri = null;
          continue;
        }
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        i = 0;
        if (i < paramUri.length)
        {
          if (i != paramUri.length - 1)
            paramString.append(paramUri[i]).append("+");
          while (true)
          {
            i++;
            break;
            paramString.append(paramUri[i]);
          }
        }
      }
      catch (Exception paramUri)
      {
        while (true)
        {
          Log.e("XWebCoreContentProvider", "tryRefillCallerName error " + paramUri.getMessage());
          continue;
          paramUri = paramString.toString();
          if (!paramUri.isEmpty())
            locald.ANj = paramUri;
        }
        label266: switch (locald.opType)
        {
        default:
          Log.d("XWebCoreContentProvider", "openFile invalid uri");
          localc.errCode = -1;
          a(localContext, localc);
          AppMethodBeat.o(3949);
          paramUri = null;
        case 1:
        case 2:
        }
      }
      continue;
      Log.d("XWebCoreContentProvider", "openFile test msg from " + locald.ANj);
      localc.errCode = 2;
      a(localContext, localc);
      AppMethodBeat.o(3949);
      paramUri = null;
      continue;
      Log.d("XWebCoreContentProvider", "openFile request from " + locald.ANj);
      paramString = new File(XWalkEnvironment.getPatchFileListConfig(localContext, locald.ihB));
      paramUri = paramString;
      if (!paramString.exists())
      {
        paramString = new File(XWalkEnvironment.getDownloadZipFileListConfig(localContext, locald.ihB));
        paramUri = paramString;
        if (!paramString.exists())
        {
          Log.d("XWebCoreContentProvider", "openFile cannot find listConfigFile of ver " + locald.ihB);
          localc.errCode = -4;
          a(localContext, localc);
          AppMethodBeat.o(3949);
          paramUri = null;
        }
      }
      else if (locald.ANk.equals("filelist.config"))
      {
        i = XWalkEnvironment.readAvailableVersionFromSP(localContext);
        if (i == -1)
        {
          Log.d("XWebCoreContentProvider", "openFile can not get current version");
          localc.errCode = -8;
          a(localContext, localc);
          AppMethodBeat.o(3949);
          paramUri = null;
        }
        else if (locald.ihB > i)
        {
          Log.d("XWebCoreContentProvider", "openFile target version installing");
          localc.errCode = -9;
          a(localContext, localc);
          AppMethodBeat.o(3949);
          paramUri = null;
        }
        else
        {
          Log.d("XWebCoreContentProvider", "openFile return listConfigFile");
          localc.errCode = 1;
          a(localContext, localc);
          paramUri = ParcelFileDescriptor.open(paramUri, 268435456);
          AppMethodBeat.o(3949);
        }
      }
      else
      {
        paramUri = ax(paramUri);
        if (paramUri.size() == 0)
        {
          Log.e("XWebCoreContentProvider", "openFile fileMap is null or empty");
          localc.errCode = -5;
          a(localContext, localc);
          AppMethodBeat.o(3949);
          paramUri = null;
        }
        else if (paramUri.containsKey(locald.ANk))
        {
          if (locald.ANk.equals("base.apk"));
          for (paramUri = new File(XWalkEnvironment.getDownloadApkPath(localContext, locald.ihB)); ; paramUri = new File(XWalkEnvironment.getExtractedCoreFile(localContext, locald.ihB, locald.ANk)))
          {
            if (!paramUri.exists())
              break label815;
            Log.d("XWebCoreContentProvider", "openFile return file " + locald.ANk);
            localc.errCode = 0;
            a(localContext, localc);
            paramUri = ParcelFileDescriptor.open(paramUri, 268435456);
            AppMethodBeat.o(3949);
            break;
          }
          label815: Log.d("XWebCoreContentProvider", "openFile file not exist " + locald.ANk);
          localc.errCode = -6;
          a(localContext, localc);
          AppMethodBeat.o(3949);
          paramUri = null;
        }
        else
        {
          Log.d("XWebCoreContentProvider", "openFile caller attempt to get file " + locald.ANk);
          localc.errCode = -7;
          a(localContext, localc);
          AppMethodBeat.o(3949);
          paramUri = null;
        }
      }
    }
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public static final class b
  {
    public int key = -1;
    public String value = "";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.XWebCoreContentProvider
 * JD-Core Version:    0.6.2
 */