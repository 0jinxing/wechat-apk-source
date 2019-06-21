package com.tencent.mm.vfs;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Environment;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.OperationCanceledException;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import com.tencent.e.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class FileSystemManager
  implements Handler.Callback
{

  @SuppressLint({"StaticFieldLeak"})
  public static volatile Context sContext = null;
  private static volatile b zYR = null;
  private static volatile boolean zYS = true;
  private final Object mLock;
  private HashMap<String, FileSystem> zYT;
  private TreeMap<String, String> zYU;
  private ArrayList<c> zYV;
  private HashMap<String, String> zYW;
  private FileSystem zYX;
  private int zYY;
  private d zYZ;
  final HashMap<String, String> zZa;
  private final FileSystem zZb;
  private final FileSystem zZc;
  private final File zZd;
  final HandlerThread zZe;
  public final MaintenanceBroadcastReceiver zZf;
  private final Handler zZg;
  public volatile long zZh;
  public volatile long zZi;
  public volatile boolean zZj;
  public volatile boolean zZk;
  private volatile BroadcastReceiver zZl;

  private FileSystemManager()
  {
    AppMethodBeat.i(54526);
    this.mLock = new Object();
    this.zZa = new HashMap();
    Object localObject = sContext;
    if (localObject == null)
    {
      localObject = new IllegalStateException("Call FileSystemManager.setContext(Context) before calling instance()");
      AppMethodBeat.o(54526);
      throw ((Throwable)localObject);
    }
    this.zZd = new File(((Context)localObject).getCacheDir(), ".vfs");
    this.zZe = new HandlerThread("VFS.Maintenance", 4);
    this.zZe.start();
    this.zZg = new Handler(this.zZe.getLooper(), this);
    this.zZf = new MaintenanceBroadcastReceiver((byte)0);
    this.zZh = -1L;
    this.zZi = 9223372036854775807L;
    this.zZk = true;
    this.zZb = new RawFileSystem("", (byte)0);
    this.zZc = new AssetsFileSystem((Context)localObject);
    this.zYY = 0;
    this.zYT = new HashMap();
    this.zYU = new TreeMap();
    this.zYV = new ArrayList();
    this.zYW = new HashMap();
    this.zYX = this.zZb;
    this.zYZ = new d(null, null, this.zYY, (byte)0);
    io((Context)localObject);
    AppMethodBeat.o(54526);
  }

  static RandomAccessFile a(d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(54523);
    String str = a(paramd, paramBoolean, false);
    if (str == null)
    {
      paramd = null;
      AppMethodBeat.o(54523);
      return paramd;
    }
    if (paramBoolean);
    for (paramd = "rw"; ; paramd = "r")
    {
      paramd = new RandomAccessFile(str, paramd);
      AppMethodBeat.o(54523);
      break;
    }
  }

  static String a(d paramd, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = null;
    AppMethodBeat.i(54522);
    int i = paramd.zZs.aiR();
    if ((paramBoolean2) && ((i & 0x4) == 0))
    {
      AppMethodBeat.o(54522);
      paramd = localObject;
    }
    while (true)
    {
      return paramd;
      if ((!paramBoolean2) && ((i & 0x2) == 0))
      {
        AppMethodBeat.o(54522);
        paramd = localObject;
      }
      else
      {
        paramd = paramd.zZs.O(paramd.path, paramBoolean1);
        AppMethodBeat.o(54522);
      }
    }
  }

  private static ArrayList<c> a(HashMap<String, FileSystem> paramHashMap, TreeMap<String, String> paramTreeMap, Map<String, String> paramMap)
  {
    AppMethodBeat.i(54531);
    ArrayList localArrayList = new ArrayList(paramTreeMap.size());
    Iterator localIterator = paramTreeMap.entrySet().iterator();
    paramTreeMap = null;
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      FileSystem localFileSystem = (FileSystem)paramHashMap.get(localObject);
      if (localFileSystem == null)
      {
        paramHashMap = new IllegalArgumentException("FileSystem '" + (String)localObject + "' for mount point '" + str + "' not exist.");
        AppMethodBeat.o(54531);
        throw paramHashMap;
      }
      str = j.H(str, paramMap);
      if (str != null)
      {
        if ((paramTreeMap != null) && (str.startsWith(paramTreeMap)));
        for (boolean bool = true; ; bool = false)
        {
          localArrayList.add(new c(str, (String)localObject, localFileSystem, bool));
          paramTreeMap = str;
          break;
        }
      }
    }
    AppMethodBeat.o(54531);
    return localArrayList;
  }

  public static void a(b paramb)
  {
    zYR = paramb;
  }

  // ERROR //
  private void a(HashMap<String, FileSystem> paramHashMap, TreeMap<String, String> paramTreeMap, HashMap<String, String> paramHashMap1, FileSystem paramFileSystem)
  {
    // Byte code:
    //   0: ldc_w 391
    //   3: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 393	android/os/Bundle
    //   9: dup
    //   10: invokespecial 394	android/os/Bundle:<init>	()V
    //   13: astore 5
    //   15: new 393	android/os/Bundle
    //   18: dup
    //   19: invokespecial 394	android/os/Bundle:<init>	()V
    //   22: astore 6
    //   24: aload_1
    //   25: invokevirtual 395	java/util/HashMap:entrySet	()Ljava/util/Set;
    //   28: invokeinterface 255 1 0
    //   33: astore 7
    //   35: aload 7
    //   37: invokeinterface 261 1 0
    //   42: ifeq +40 -> 82
    //   45: aload 7
    //   47: invokeinterface 265 1 0
    //   52: checkcast 267	java/util/Map$Entry
    //   55: astore_1
    //   56: aload 6
    //   58: aload_1
    //   59: invokeinterface 270 1 0
    //   64: checkcast 272	java/lang/String
    //   67: aload_1
    //   68: invokeinterface 275 1 0
    //   73: checkcast 397	android/os/Parcelable
    //   76: invokevirtual 401	android/os/Bundle:putParcelable	(Ljava/lang/String;Landroid/os/Parcelable;)V
    //   79: goto -44 -> 35
    //   82: aload 5
    //   84: ldc_w 403
    //   87: aload 6
    //   89: invokevirtual 407	android/os/Bundle:putBundle	(Ljava/lang/String;Landroid/os/Bundle;)V
    //   92: new 393	android/os/Bundle
    //   95: dup
    //   96: invokespecial 394	android/os/Bundle:<init>	()V
    //   99: astore_1
    //   100: aload_2
    //   101: invokevirtual 249	java/util/TreeMap:entrySet	()Ljava/util/Set;
    //   104: invokeinterface 255 1 0
    //   109: astore 6
    //   111: aload 6
    //   113: invokeinterface 261 1 0
    //   118: ifeq +39 -> 157
    //   121: aload 6
    //   123: invokeinterface 265 1 0
    //   128: checkcast 267	java/util/Map$Entry
    //   131: astore_2
    //   132: aload_1
    //   133: aload_2
    //   134: invokeinterface 270 1 0
    //   139: checkcast 272	java/lang/String
    //   142: aload_2
    //   143: invokeinterface 275 1 0
    //   148: checkcast 272	java/lang/String
    //   151: invokevirtual 410	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   154: goto -43 -> 111
    //   157: aload 5
    //   159: ldc_w 412
    //   162: aload_1
    //   163: invokevirtual 407	android/os/Bundle:putBundle	(Ljava/lang/String;Landroid/os/Bundle;)V
    //   166: new 393	android/os/Bundle
    //   169: dup
    //   170: invokespecial 394	android/os/Bundle:<init>	()V
    //   173: astore_1
    //   174: aload_3
    //   175: invokevirtual 395	java/util/HashMap:entrySet	()Ljava/util/Set;
    //   178: invokeinterface 255 1 0
    //   183: astore_3
    //   184: aload_3
    //   185: invokeinterface 261 1 0
    //   190: ifeq +38 -> 228
    //   193: aload_3
    //   194: invokeinterface 265 1 0
    //   199: checkcast 267	java/util/Map$Entry
    //   202: astore_2
    //   203: aload_1
    //   204: aload_2
    //   205: invokeinterface 270 1 0
    //   210: checkcast 272	java/lang/String
    //   213: aload_2
    //   214: invokeinterface 275 1 0
    //   219: checkcast 272	java/lang/String
    //   222: invokevirtual 410	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   225: goto -41 -> 184
    //   228: aload 5
    //   230: ldc_w 414
    //   233: aload_1
    //   234: invokevirtual 407	android/os/Bundle:putBundle	(Ljava/lang/String;Landroid/os/Bundle;)V
    //   237: aload 5
    //   239: ldc_w 416
    //   242: aload 4
    //   244: invokevirtual 401	android/os/Bundle:putParcelable	(Ljava/lang/String;Landroid/os/Parcelable;)V
    //   247: invokestatic 422	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   250: astore_1
    //   251: aload_1
    //   252: aload 5
    //   254: invokevirtual 426	android/os/Parcel:writeBundle	(Landroid/os/Bundle;)V
    //   257: aload_1
    //   258: invokevirtual 430	android/os/Parcel:marshall	()[B
    //   261: astore_3
    //   262: aload_1
    //   263: invokevirtual 433	android/os/Parcel:recycle	()V
    //   266: new 110	java/io/File
    //   269: astore_1
    //   270: aload_1
    //   271: aload_0
    //   272: getfield 123	com/tencent/mm/vfs/FileSystemManager:zZd	Ljava/io/File;
    //   275: ldc_w 435
    //   278: invokespecial 121	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   281: new 437	java/io/DataOutputStream
    //   284: astore_2
    //   285: new 439	java/io/FileOutputStream
    //   288: astore 4
    //   290: aload 4
    //   292: aload_1
    //   293: invokespecial 442	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   296: aload_2
    //   297: aload 4
    //   299: invokespecial 445	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   302: aload_2
    //   303: astore_1
    //   304: aload_2
    //   305: iconst_1
    //   306: invokevirtual 448	java/io/DataOutputStream:writeInt	(I)V
    //   309: aload_2
    //   310: astore_1
    //   311: aload_2
    //   312: aload_3
    //   313: invokevirtual 452	java/io/DataOutputStream:write	([B)V
    //   316: aload_2
    //   317: invokevirtual 455	java/io/DataOutputStream:close	()V
    //   320: getstatic 76	com/tencent/mm/vfs/FileSystemManager:sContext	Landroid/content/Context;
    //   323: astore_1
    //   324: aload_1
    //   325: invokevirtual 458	android/content/Context:getPackageName	()Ljava/lang/String;
    //   328: astore_2
    //   329: new 460	android/content/Intent
    //   332: dup
    //   333: new 283	java/lang/StringBuilder
    //   336: dup
    //   337: invokespecial 322	java/lang/StringBuilder:<init>	()V
    //   340: aload_2
    //   341: invokevirtual 290	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: ldc_w 462
    //   347: invokevirtual 290	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: invokevirtual 298	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: invokespecial 463	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   356: astore_2
    //   357: aload_2
    //   358: aload 5
    //   360: invokevirtual 467	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   363: pop
    //   364: aload_2
    //   365: ldc_w 469
    //   368: invokestatic 474	android/os/Process:myPid	()I
    //   371: invokevirtual 478	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   374: pop
    //   375: aload_1
    //   376: aload_2
    //   377: invokevirtual 482	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
    //   380: ldc_w 347
    //   383: ldc_w 484
    //   386: invokestatic 353	com/tencent/e/a/b:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   389: ldc_w 391
    //   392: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   395: return
    //   396: astore_3
    //   397: aconst_null
    //   398: astore_2
    //   399: aload_2
    //   400: astore_1
    //   401: new 283	java/lang/StringBuilder
    //   404: astore 4
    //   406: aload_2
    //   407: astore_1
    //   408: aload 4
    //   410: ldc_w 486
    //   413: invokespecial 286	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   416: aload_2
    //   417: astore_1
    //   418: ldc_w 347
    //   421: aload 4
    //   423: aload_3
    //   424: invokevirtual 489	java/io/IOException:getMessage	()Ljava/lang/String;
    //   427: invokevirtual 290	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: invokevirtual 298	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   433: invokestatic 491	com/tencent/e/a/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   436: aload_2
    //   437: ifnull -117 -> 320
    //   440: aload_2
    //   441: invokevirtual 455	java/io/DataOutputStream:close	()V
    //   444: goto -124 -> 320
    //   447: astore_1
    //   448: goto -128 -> 320
    //   451: astore_2
    //   452: aconst_null
    //   453: astore_1
    //   454: aload_1
    //   455: ifnull +7 -> 462
    //   458: aload_1
    //   459: invokevirtual 455	java/io/DataOutputStream:close	()V
    //   462: ldc_w 391
    //   465: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   468: aload_2
    //   469: athrow
    //   470: astore_1
    //   471: goto -151 -> 320
    //   474: astore_1
    //   475: goto -13 -> 462
    //   478: astore_2
    //   479: goto -25 -> 454
    //   482: astore_3
    //   483: goto -84 -> 399
    //
    // Exception table:
    //   from	to	target	type
    //   266	302	396	java/io/IOException
    //   440	444	447	java/io/IOException
    //   266	302	451	finally
    //   316	320	470	java/io/IOException
    //   458	462	474	java/io/IOException
    //   304	309	478	finally
    //   311	316	478	finally
    //   401	406	478	finally
    //   408	416	478	finally
    //   418	436	478	finally
    //   304	309	482	java/io/IOException
    //   311	316	482	java/io/IOException
  }

  private static <K, V> void a(Map<K, V> paramMap, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(54529);
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      paramStringBuilder.append("  ").append(localEntry.getKey().toString());
      if (localEntry.getValue() == null)
        paramStringBuilder.append(" (deleted)\n");
      else
        paramStringBuilder.append(" => ").append(localEntry.getValue().toString()).append('\n');
    }
    AppMethodBeat.o(54529);
  }

  private void aC(Bundle arg1)
  {
    AppMethodBeat.i(54527);
    Bundle localBundle = ???;
    if (??? == null)
      localBundle = new Bundle();
    if (localBundle.getInt("pid") == Process.myPid());
    HashMap localHashMap;
    synchronized (this.mLock)
    {
      if (this.zYX != null)
      {
        AppMethodBeat.o(54527);
        return;
      }
      localObject3 = localBundle.getBundle("fs");
      localHashMap = new HashMap();
      if (localObject3 != null)
      {
        ((Bundle)localObject3).setClassLoader(localBundle.getClassLoader());
        ??? = ((Bundle)localObject3).keySet().iterator();
        if (???.hasNext())
        {
          localObject4 = (String)???.next();
          localHashMap.put(localObject4, ((Bundle)localObject3).getParcelable((String)localObject4));
        }
      }
    }
    Object localObject3 = localObject1.getBundle("mp");
    Object localObject4 = new TreeMap();
    Object localObject5;
    if (localObject3 != null)
    {
      ((Bundle)localObject3).setClassLoader(localObject1.getClassLoader());
      localObject5 = ((Bundle)localObject3).keySet().iterator();
      while (((Iterator)localObject5).hasNext())
      {
        ??? = (String)((Iterator)localObject5).next();
        ((TreeMap)localObject4).put(???, ((Bundle)localObject3).getString(???));
      }
    }
    Object localObject6 = localObject1.getBundle("env");
    localObject3 = new HashMap();
    if (localObject6 != null)
    {
      localObject5 = ((Bundle)localObject6).keySet().iterator();
      while (((Iterator)localObject5).hasNext())
      {
        ??? = (String)((Iterator)localObject5).next();
        ((HashMap)localObject3).put(???, ((Bundle)localObject6).getString(???));
      }
    }
    ??? = (FileSystem)localObject1.getParcelable("root");
    if (??? == null)
      ??? = this.zZb;
    while (true)
    {
      ??? = new HashMap(this.zZa);
      ((Map)???).putAll((Map)localObject3);
      localObject6 = a(localHashMap, (TreeMap)localObject4, (Map)???);
      localObject5 = Collections.unmodifiableMap((Map)???);
      synchronized (this.mLock)
      {
        this.zYT = localHashMap;
        this.zYU = ((TreeMap)localObject4);
        this.zYV = ((ArrayList)localObject6);
        this.zYW = ((HashMap)localObject3);
        this.zYX = ???;
        this.zYY += 1;
        localObject6 = new com/tencent/mm/vfs/FileSystemManager$d;
        ((d)localObject6).<init>(null, null, this.zYY, (byte)0);
        this.zYZ = ((d)localObject6);
        this.zYX.p((Map)localObject5);
        localObject6 = localHashMap.values().iterator();
        if (((Iterator)localObject6).hasNext())
          ((FileSystem)((Iterator)localObject6).next()).p((Map)localObject5);
      }
      ??? = new StringBuilder(1024);
      ((StringBuilder)???).append("[File systems]\n");
      a(localHashMap, (StringBuilder)???);
      ((StringBuilder)???).append("[Mount points]\n");
      a((Map)localObject4, (StringBuilder)???);
      ((StringBuilder)???).append("[Environment]\n");
      a((Map)localObject3, (StringBuilder)???);
      ((StringBuilder)???).append("[Root]\n  ").append(???.toString()).append('\n');
      b.i("VFS.FileSystemManager", "Loaded file system from bundle:\n" + ((StringBuilder)???).toString());
      AppMethodBeat.o(54527);
      break;
    }
  }

  private static String asX(String paramString)
  {
    AppMethodBeat.i(54520);
    File localFile = new File(paramString);
    try
    {
      paramString = localFile.getCanonicalPath();
      AppMethodBeat.o(54520);
      return paramString;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        paramString = localFile.getAbsolutePath();
        AppMethodBeat.o(54520);
      }
    }
  }

  public static FileSystemManager dMv()
  {
    return e.zZu;
  }

  static b dMw()
  {
    return zYR;
  }

  private static <K, V> void e(Map<K, V> paramMap1, Map<K, V> paramMap2)
  {
    AppMethodBeat.i(54528);
    paramMap2 = paramMap2.entrySet().iterator();
    while (paramMap2.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap2.next();
      if (localEntry.getValue() == null)
        paramMap1.remove(localEntry.getKey());
      else
        paramMap1.put(localEntry.getKey(), localEntry.getValue());
    }
    AppMethodBeat.o(54528);
  }

  private void io(Context paramContext)
  {
    AppMethodBeat.i(54519);
    this.zZa.put("data", paramContext.getCacheDir().getParent());
    this.zZa.put("dataCache", paramContext.getCacheDir().getPath());
    try
    {
      paramContext = paramContext.getExternalCacheDir();
      if (paramContext != null)
      {
        this.zZa.put("extData", paramContext.getParent());
        this.zZa.put("extCache", paramContext.getPath());
      }
      paramContext = Environment.getExternalStorageDirectory();
      if (paramContext != null)
        this.zZa.put("storage", paramContext.getPath());
      b.i("VFS.FileSystemManager", "Static environment:");
      paramContext = this.zZa.entrySet().iterator();
      while (paramContext.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramContext.next();
        b.i("VFS.FileSystemManager", "  " + (String)localEntry.getKey() + " => " + (String)localEntry.getValue());
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        b.b("VFS.FileSystemManager", paramContext, "Cannot get external cache directory.");
      AppMethodBeat.o(54519);
    }
  }

  public static void rh(boolean paramBoolean)
  {
    zYS = paramBoolean;
  }

  public static void setContext(Context paramContext)
  {
    AppMethodBeat.i(54518);
    Context localContext = paramContext.getApplicationContext();
    if (localContext == null);
    while (true)
    {
      sContext = paramContext;
      AppMethodBeat.o(54518);
      return;
      paramContext = localContext;
    }
  }

  final d a(Uri paramUri, d paramd)
  {
    AppMethodBeat.i(54521);
    Object localObject1 = this.mLock;
    if (paramd != null);
    HashMap localHashMap;
    ArrayList localArrayList;
    int i;
    String str;
    try
    {
      if (paramd.bal == this.zYY);
      while (true)
      {
        return paramd;
        localHashMap = this.zYT;
        localArrayList = this.zYV;
        paramd = this.zYX;
        i = this.zYY;
        localObject2 = this.zYZ;
        localObject1 = paramUri.getPath();
        str = paramUri.getScheme();
        if ((str != null) && (!str.equals("file")))
          break label335;
        if ((localObject1 != null) && (!((String)localObject1).isEmpty()))
          break;
        AppMethodBeat.o(54521);
        paramd = (d)localObject2;
      }
    }
    finally
    {
      AppMethodBeat.o(54521);
    }
    Object localObject2 = asX((String)localObject1);
    int j = Collections.binarySearch(localArrayList, localObject2);
    if (j >= 0)
      paramd = ((c)localArrayList.get(j)).zZs;
    for (paramUri = ""; ; paramUri = ((String)localObject2).substring(paramUri.zZq.length() + 1))
    {
      label167: paramd = new d(paramd, paramUri, i, (byte)0);
      AppMethodBeat.o(54521);
      break;
      j = -j - 2;
      if (j >= 0)
        paramUri = (c)localArrayList.get(j);
      while ((paramUri != null) && ((!((String)localObject2).startsWith(paramUri.zZq)) || (((String)localObject2).charAt(paramUri.zZq.length()) != '/')))
        if (paramUri.zZt)
        {
          j--;
          paramUri = (c)localArrayList.get(j);
          continue;
          paramUri = null;
        }
        else
        {
          paramUri = null;
        }
      if (paramUri == null)
        break label306;
      paramd = paramUri.zZs;
    }
    label306: if ((!((String)localObject2).isEmpty()) && (((String)localObject2).charAt(0) == '/'));
    for (paramUri = ((String)localObject2).substring(1); ; paramUri = (Uri)localObject2)
    {
      break label167;
      label335: if (str.equals("wcf"))
      {
        paramUri = (FileSystem)localHashMap.get(paramUri.getAuthority());
        if (localObject1 == null)
        {
          localObject2 = "";
          paramd = paramUri;
          paramUri = (Uri)localObject2;
          break label167;
        }
        localObject2 = j.k((String)localObject1, true, true);
        paramd = paramUri;
        paramUri = (Uri)localObject2;
        break label167;
      }
      if (str.equals("assets"))
      {
        paramd = this.zZc;
        if (localObject1 == null)
        {
          paramUri = "";
          break label167;
        }
        paramUri = j.k((String)localObject1, true, true);
        break label167;
      }
      AppMethodBeat.o(54521);
      paramd = (d)localObject2;
      break;
    }
  }

  public final a dMx()
  {
    AppMethodBeat.i(54524);
    a locala = new a();
    AppMethodBeat.o(54524);
    return locala;
  }

  public final void dMy()
  {
    AppMethodBeat.i(54525);
    synchronized (this.mLock)
    {
      HashMap localHashMap1 = this.zYT;
      TreeMap localTreeMap = this.zYU;
      HashMap localHashMap2 = this.zYW;
      FileSystem localFileSystem = this.zYX;
      a(localHashMap1, localTreeMap, localHashMap2, localFileSystem);
      AppMethodBeat.o(54525);
      return;
    }
  }

  public final boolean handleMessage(Message arg1)
  {
    AppMethodBeat.i(54532);
    switch (???.what)
    {
    default:
      bool = false;
      AppMethodBeat.o(54532);
    case 1:
    case 2:
    }
    CancellationSignal localCancellationSignal;
    while (true)
    {
      return bool;
      ??? = (Intent)???.obj;
      ???.setExtrasClassLoader(FileSystem.class.getClassLoader());
      b.i("VFS.FileSystemManager", "Refresh file system from broadcast.");
      try
      {
        aC(???.getExtras());
        bool = true;
        AppMethodBeat.o(54532);
      }
      catch (RuntimeException )
      {
        while (true)
          b.b("VFS.FileSystemManager", ???, "Failed to refresh file system from broadcast.");
      }
      localCancellationSignal = (CancellationSignal)???.obj;
      long l1 = this.zZi;
      File localFile = new File(this.zZd, "maintain.timestamp");
      long l2 = System.currentTimeMillis();
      long l3 = localFile.lastModified();
      if (l2 - l3 >= l1)
        break;
      b.i("VFS.FileSystemManager", "Maintenance interval not match, skip maintenance. ct=%d, ts=%d, int=%d", new Object[] { Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l1) });
      bool = true;
      AppMethodBeat.o(54532);
    }
    Object localObject3 = sContext;
    boolean bool = this.zZj;
    if (bool)
      if (((Context)localObject3).checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0)
        bool = true;
    while (true)
    {
      label229: Object localObject4;
      synchronized (this.mLock)
      {
        localObject4 = this.zYT;
        if (bool)
          ??? = ((PowerManager)((Context)localObject3).getSystemService("power")).newWakeLock(1, "VFS:Maintenance");
      }
      while (true)
      {
        try
        {
          b.i("VFS.FileSystemManager", "Maintenance started. WakeLock: ".concat(String.valueOf(bool)));
          if (??? != null)
            ???.acquire(1200000L);
          Iterator localIterator = ((HashMap)localObject4).entrySet().iterator();
          if (localIterator.hasNext())
          {
            localObject4 = (Map.Entry)localIterator.next();
            FileSystem localFileSystem = (FileSystem)((Map.Entry)localObject4).getValue();
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("[Maintenance] ");
            b.i("VFS.FileSystemManager", (String)((Map.Entry)localObject4).getKey() + " => " + localFileSystem.toString());
            localFileSystem.a(localCancellationSignal);
            continue;
          }
        }
        catch (OperationCanceledException localOperationCanceledException)
        {
          b.i("VFS.FileSystemManager", "Maintenance cancelled.");
          if ((??? == null) || (!???.isHeld()))
            break;
          ???.release();
          break;
          bool = false;
          break label229;
          localObject1 = finally;
          AppMethodBeat.o(54532);
          throw localObject1;
          localObject1.createNewFile();
          localObject1.setLastModified(System.currentTimeMillis());
          b.i("VFS.FileSystemManager", "Maintenance finished.");
          if ((??? == null) || (!???.isHeld()))
            break;
          ???.release();
          break;
        }
        catch (Exception localException)
        {
          b.b("VFS.FileSystemManager", localException, "Maintenance failed.");
          if ((??? == null) || (!???.isHeld()))
            break;
          ???.release();
          break;
        }
        finally
        {
          if ((??? != null) && (???.isHeld()))
            ???.release();
          AppMethodBeat.o(54532);
        }
        ??? = null;
      }
    }
  }

  public final class MaintenanceBroadcastReceiver extends BroadcastReceiver
  {
    public boolean jZS;
    public boolean jZT;
    private CancellationSignal zZp;

    private MaintenanceBroadcastReceiver()
    {
    }

    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      AppMethodBeat.i(54514);
      paramContext = paramIntent.getAction();
      if (paramContext == null)
        AppMethodBeat.o(54514);
      while (true)
      {
        return;
        int i = -1;
        switch (paramContext.hashCode())
        {
        default:
          label68: switch (i)
          {
          default:
          case 0:
          case 1:
          case 2:
          case 3:
          }
          break;
        case -1454123155:
        case -2128145023:
        case 1019184907:
        case -1886648615:
        }
        while (true)
        {
          b.d("VFS.FileSystemManager", "Idle status changed: charging = " + this.jZS + ", interactive = " + this.jZT);
          if ((!this.jZS) || (this.jZT) || (this.zZp != null))
            break label339;
          long l = FileSystemManager.a(FileSystemManager.this);
          if (l < 0L)
            break label390;
          this.zZp = new CancellationSignal();
          FileSystemManager.b(FileSystemManager.this).sendMessageDelayed(Message.obtain(FileSystemManager.b(FileSystemManager.this), 2, this.zZp), l);
          b.i("VFS.FileSystemManager", "System idle, trigger maintenance timer for " + l / 1000L + " seconds.");
          AppMethodBeat.o(54514);
          break;
          if (!paramContext.equals("android.intent.action.SCREEN_ON"))
            break label68;
          i = 0;
          break label68;
          if (!paramContext.equals("android.intent.action.SCREEN_OFF"))
            break label68;
          i = 1;
          break label68;
          if (!paramContext.equals("android.intent.action.ACTION_POWER_CONNECTED"))
            break label68;
          i = 2;
          break label68;
          if (!paramContext.equals("android.intent.action.ACTION_POWER_DISCONNECTED"))
            break label68;
          i = 3;
          break label68;
          this.jZT = true;
          continue;
          this.jZT = false;
          continue;
          this.jZS = true;
          continue;
          this.jZS = false;
        }
        label339: if (((!this.jZS) || (this.jZT)) && (this.zZp != null))
        {
          FileSystemManager.b(FileSystemManager.this).removeMessages(2);
          this.zZp.cancel();
          this.zZp = null;
          b.i("VFS.FileSystemManager", "Exit idle state, maintenance cancelled.");
        }
        label390: AppMethodBeat.o(54514);
      }
    }
  }

  public final class a
  {
    public final HashMap<String, FileSystem> zYT;
    public final TreeMap<String, String> zYU;
    public final HashMap<String, String> zYW;
    public FileSystem zZn;
    public boolean zZo;

    public a()
    {
      AppMethodBeat.i(54508);
      this.zYT = new HashMap();
      this.zYU = new TreeMap();
      this.zYW = new HashMap();
      this.zZn = null;
      this.zZo = false;
      AppMethodBeat.o(54508);
    }

    public final a a(String paramString, FileSystem paramFileSystem)
    {
      AppMethodBeat.i(54509);
      this.zYT.put(paramString, paramFileSystem);
      AppMethodBeat.o(54509);
      return this;
    }

    public final void commit()
    {
      AppMethodBeat.i(54512);
      ri(FileSystemManager.d(FileSystemManager.this));
      AppMethodBeat.o(54512);
    }

    public final a iq(String paramString1, String paramString2)
    {
      AppMethodBeat.i(54510);
      this.zYU.put(paramString1, paramString2);
      AppMethodBeat.o(54510);
      return this;
    }

    public final a ir(String paramString1, String paramString2)
    {
      AppMethodBeat.i(54511);
      this.zYW.put(paramString1, paramString2);
      AppMethodBeat.o(54511);
      return this;
    }

    public final void ri(boolean paramBoolean)
    {
      AppMethodBeat.i(54513);
      FileSystemManager.a(FileSystemManager.this, this.zYT, this.zYU, this.zYW, this.zZn, this.zZo, paramBoolean);
      this.zYT.clear();
      this.zYU.clear();
      this.zYW.clear();
      this.zZo = false;
      AppMethodBeat.o(54513);
    }
  }

  public static abstract interface b
  {
    public abstract Key e(String paramString, Map<String, String> paramMap);
  }

  static final class c
    implements Comparable<String>
  {
    final String zZq;
    final String zZr;
    final FileSystem zZs;
    final boolean zZt;

    c(String paramString1, String paramString2, FileSystem paramFileSystem, boolean paramBoolean)
    {
      this.zZq = paramString1;
      this.zZr = paramString2;
      this.zZs = paramFileSystem;
      this.zZt = paramBoolean;
    }
  }

  public static final class d
  {
    final int bal;
    public final String path;
    public final FileSystem zZs;

    private d(FileSystem paramFileSystem, String paramString, int paramInt)
    {
      this.zZs = paramFileSystem;
      this.path = paramString;
      this.bal = paramInt;
    }

    public final String toString()
    {
      AppMethodBeat.i(54516);
      String str = this.path + " -> " + this.zZs.toString();
      AppMethodBeat.o(54516);
      return str;
    }

    public final boolean valid()
    {
      if (this.zZs != null);
      for (boolean bool = true; ; bool = false)
        return bool;
    }
  }

  static final class e
  {

    @SuppressLint({"StaticFieldLeak"})
    static final FileSystemManager zZu;

    static
    {
      AppMethodBeat.i(54517);
      FileSystemManager localFileSystemManager = new FileSystemManager((byte)0);
      zZu = localFileSystemManager;
      FileSystemManager.c(localFileSystemManager);
      AppMethodBeat.o(54517);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.FileSystemManager
 * JD-Core Version:    0.6.2
 */