package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.f.a;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzaf
{
  private static int zzck;
  private static final zzaj<Boolean> zzco;
  private static String zzcp;
  private static boolean zzcq;
  private static int zzcr;
  private static int zzcs;
  private static BroadcastReceiver zzct;
  private PendingIntent zzad;
  private Messenger zzah;
  private Map<String, Object> zzcu;
  private Messenger zzcv;
  private MessengerCompat zzcw;
  private Context zzk;

  static
  {
    AppMethodBeat.i(57546);
    zzco = zzai.zzw().zzd("gcm_iid_use_messenger_ipc", true);
    zzcp = null;
    zzcq = false;
    zzcr = 0;
    zzcs = 0;
    zzck = 0;
    zzct = null;
    AppMethodBeat.o(57546);
  }

  public zzaf(Context paramContext)
  {
    AppMethodBeat.i(57530);
    this.zzcu = new a();
    this.zzk = paramContext;
    AppMethodBeat.o(57530);
  }

  private static void zzd(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(57540);
    if ((paramObject1 instanceof ConditionVariable))
      ((ConditionVariable)paramObject1).open();
    Messenger localMessenger;
    if ((paramObject1 instanceof Messenger))
    {
      localMessenger = (Messenger)paramObject1;
      paramObject1 = Message.obtain();
      paramObject1.obj = paramObject2;
    }
    while (true)
    {
      try
      {
        localMessenger.send(paramObject1);
        AppMethodBeat.o(57540);
        return;
      }
      catch (RemoteException paramObject1)
      {
        paramObject1 = String.valueOf(paramObject1);
        new StringBuilder(String.valueOf(paramObject1).length() + 24).append("Failed to send response ").append(paramObject1);
      }
      AppMethodBeat.o(57540);
    }
  }

  private final void zzd(String paramString, Object paramObject)
  {
    AppMethodBeat.i(57539);
    synchronized (getClass())
    {
      Object localObject = this.zzcu.get(paramString);
      this.zzcu.put(paramString, paramObject);
      zzd(localObject, paramObject);
      AppMethodBeat.o(57539);
      return;
    }
  }

  private static boolean zzd(PackageManager paramPackageManager, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(57534);
    try
    {
      paramPackageManager = paramPackageManager.getApplicationInfo(paramString, 0);
      zzcp = paramPackageManager.packageName;
      zzcs = paramPackageManager.uid;
      bool = true;
      AppMethodBeat.o(57534);
      return bool;
    }
    catch (PackageManager.NameNotFoundException paramPackageManager)
    {
      while (true)
        AppMethodBeat.o(57534);
    }
  }

  private static boolean zzd(PackageManager paramPackageManager, String paramString1, String paramString2)
  {
    AppMethodBeat.i(57533);
    boolean bool;
    if (paramPackageManager.checkPermission("com.google.android.c2dm.permission.SEND", paramString1) == 0)
    {
      bool = zzd(paramPackageManager, paramString1);
      AppMethodBeat.o(57533);
    }
    while (true)
    {
      return bool;
      new StringBuilder(String.valueOf(paramString1).length() + 56 + String.valueOf(paramString2).length()).append("Possible malicious package ").append(paramString1).append(" declares ").append(paramString2).append(" without permission");
      bool = false;
      AppMethodBeat.o(57533);
    }
  }

  private final void zzg(Intent paramIntent)
  {
    try
    {
      AppMethodBeat.i(57537);
      if (this.zzad == null)
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.setPackage("com.google.example.invalidpackage");
        this.zzad = PendingIntent.getBroadcast(this.zzk, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", this.zzad);
      AppMethodBeat.o(57537);
      return;
    }
    finally
    {
    }
    throw paramIntent;
  }

  static String zzi(Bundle paramBundle)
  {
    AppMethodBeat.i(57538);
    if (paramBundle == null)
    {
      paramBundle = new IOException("SERVICE_NOT_AVAILABLE");
      AppMethodBeat.o(57538);
      throw paramBundle;
    }
    String str1 = paramBundle.getString("registration_id");
    String str2 = str1;
    if (str1 == null)
      str2 = paramBundle.getString("unregistered");
    if (str2 == null)
    {
      str2 = paramBundle.getString("error");
      if (str2 != null)
      {
        paramBundle = new IOException(str2);
        AppMethodBeat.o(57538);
        throw paramBundle;
      }
      paramBundle = String.valueOf(paramBundle);
      new StringBuilder(String.valueOf(paramBundle).length() + 29).append("Unexpected response from GCM ").append(paramBundle);
      new Throwable();
      paramBundle = new IOException("SERVICE_NOT_AVAILABLE");
      AppMethodBeat.o(57538);
      throw paramBundle;
    }
    AppMethodBeat.o(57538);
    return str2;
  }

  private final Bundle zzj(Bundle paramBundle)
  {
    AppMethodBeat.i(57543);
    Bundle localBundle1 = zzk(paramBundle);
    Bundle localBundle2 = localBundle1;
    if (localBundle1 != null)
    {
      localBundle2 = localBundle1;
      if (localBundle1.containsKey("google.messenger"))
      {
        paramBundle = zzk(paramBundle);
        localBundle2 = paramBundle;
        if (paramBundle != null)
        {
          localBundle2 = paramBundle;
          if (paramBundle.containsKey("google.messenger"))
            localBundle2 = null;
        }
      }
    }
    AppMethodBeat.o(57543);
    return localBundle2;
  }

  // ERROR //
  private final Bundle zzk(Bundle arg1)
  {
    // Byte code:
    //   0: ldc 242
    //   2: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 86	android/os/ConditionVariable
    //   8: dup
    //   9: invokespecial 243	android/os/ConditionVariable:<init>	()V
    //   12: astore_2
    //   13: invokestatic 247	com/google/android/gms/iid/zzaf:zzv	()Ljava/lang/String;
    //   16: astore_3
    //   17: aload_0
    //   18: invokevirtual 131	java/lang/Object:getClass	()Ljava/lang/Class;
    //   21: astore 4
    //   23: aload 4
    //   25: monitorenter
    //   26: aload_0
    //   27: getfield 78	com/google/android/gms/iid/zzaf:zzcu	Ljava/util/Map;
    //   30: aload_3
    //   31: aload_2
    //   32: invokeinterface 141 3 0
    //   37: pop
    //   38: aload 4
    //   40: monitorexit
    //   41: aload_0
    //   42: getfield 249	com/google/android/gms/iid/zzaf:zzah	Landroid/os/Messenger;
    //   45: ifnonnull +33 -> 78
    //   48: aload_0
    //   49: getfield 80	com/google/android/gms/iid/zzaf:zzk	Landroid/content/Context;
    //   52: invokestatic 253	com/google/android/gms/iid/zzaf:zzl	(Landroid/content/Context;)Ljava/lang/String;
    //   55: pop
    //   56: aload_0
    //   57: new 91	android/os/Messenger
    //   60: dup
    //   61: new 255	com/google/android/gms/iid/zzag
    //   64: dup
    //   65: aload_0
    //   66: invokestatic 261	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   69: invokespecial 264	com/google/android/gms/iid/zzag:<init>	(Lcom/google/android/gms/iid/zzaf;Landroid/os/Looper;)V
    //   72: invokespecial 267	android/os/Messenger:<init>	(Landroid/os/Handler;)V
    //   75: putfield 249	com/google/android/gms/iid/zzaf:zzah	Landroid/os/Messenger;
    //   78: getstatic 54	com/google/android/gms/iid/zzaf:zzcp	Ljava/lang/String;
    //   81: ifnonnull +32 -> 113
    //   84: new 208	java/io/IOException
    //   87: dup
    //   88: ldc_w 269
    //   91: invokespecial 213	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   94: astore_1
    //   95: ldc 242
    //   97: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: aload_1
    //   101: athrow
    //   102: astore_1
    //   103: aload 4
    //   105: monitorexit
    //   106: ldc 242
    //   108: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: aload_1
    //   112: athrow
    //   113: getstatic 56	com/google/android/gms/iid/zzaf:zzcq	Z
    //   116: ifeq +295 -> 411
    //   119: ldc_w 271
    //   122: astore 4
    //   124: new 184	android/content/Intent
    //   127: dup
    //   128: aload 4
    //   130: invokespecial 272	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   133: astore 4
    //   135: aload 4
    //   137: getstatic 54	com/google/android/gms/iid/zzaf:zzcp	Ljava/lang/String;
    //   140: invokevirtual 191	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   143: pop
    //   144: aload 4
    //   146: aload_1
    //   147: invokevirtual 276	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   150: pop
    //   151: aload_0
    //   152: aload 4
    //   154: invokespecial 278	com/google/android/gms/iid/zzaf:zzg	(Landroid/content/Intent;)V
    //   157: aload 4
    //   159: ldc_w 280
    //   162: new 113	java/lang/StringBuilder
    //   165: dup
    //   166: aload_3
    //   167: invokestatic 111	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   170: invokevirtual 117	java/lang/String:length	()I
    //   173: iconst_5
    //   174: iadd
    //   175: invokespecial 119	java/lang/StringBuilder:<init>	(I)V
    //   178: ldc_w 282
    //   181: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: aload_3
    //   185: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: ldc_w 284
    //   191: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: invokevirtual 287	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   197: invokevirtual 290	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   200: pop
    //   201: aload 4
    //   203: ldc_w 292
    //   206: new 113	java/lang/StringBuilder
    //   209: dup
    //   210: aload_3
    //   211: invokestatic 111	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   214: invokevirtual 117	java/lang/String:length	()I
    //   217: iconst_5
    //   218: iadd
    //   219: invokespecial 119	java/lang/StringBuilder:<init>	(I)V
    //   222: ldc_w 282
    //   225: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: aload_3
    //   229: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: ldc_w 284
    //   235: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: invokevirtual 287	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   241: invokevirtual 290	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   244: pop
    //   245: ldc_w 294
    //   248: getstatic 54	com/google/android/gms/iid/zzaf:zzcp	Ljava/lang/String;
    //   251: invokevirtual 298	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   254: istore 5
    //   256: aload 4
    //   258: ldc_w 300
    //   261: invokevirtual 303	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   264: astore_1
    //   265: aload_1
    //   266: ifnull +12 -> 278
    //   269: ldc_w 305
    //   272: aload_1
    //   273: invokevirtual 298	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   276: istore 5
    //   278: ldc_w 307
    //   281: iconst_3
    //   282: invokestatic 313	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   285: ifeq +40 -> 325
    //   288: aload 4
    //   290: invokevirtual 317	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   293: invokestatic 111	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   296: astore_1
    //   297: new 113	java/lang/StringBuilder
    //   300: dup
    //   301: aload_1
    //   302: invokestatic 111	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   305: invokevirtual 117	java/lang/String:length	()I
    //   308: bipush 8
    //   310: iadd
    //   311: invokespecial 119	java/lang/StringBuilder:<init>	(I)V
    //   314: ldc_w 319
    //   317: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: aload_1
    //   321: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: pop
    //   325: aload_0
    //   326: getfield 321	com/google/android/gms/iid/zzaf:zzcv	Landroid/os/Messenger;
    //   329: ifnull +99 -> 428
    //   332: aload 4
    //   334: ldc 237
    //   336: aload_0
    //   337: getfield 249	com/google/android/gms/iid/zzaf:zzah	Landroid/os/Messenger;
    //   340: invokevirtual 203	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   343: pop
    //   344: invokestatic 97	android/os/Message:obtain	()Landroid/os/Message;
    //   347: astore_1
    //   348: aload_1
    //   349: aload 4
    //   351: putfield 101	android/os/Message:obj	Ljava/lang/Object;
    //   354: aload_0
    //   355: getfield 321	com/google/android/gms/iid/zzaf:zzcv	Landroid/os/Messenger;
    //   358: aload_1
    //   359: invokevirtual 105	android/os/Messenger:send	(Landroid/os/Message;)V
    //   362: aload_2
    //   363: ldc2_w 322
    //   366: invokevirtual 327	android/os/ConditionVariable:block	(J)Z
    //   369: pop
    //   370: aload_0
    //   371: invokevirtual 131	java/lang/Object:getClass	()Ljava/lang/Class;
    //   374: astore_1
    //   375: aload_1
    //   376: monitorenter
    //   377: aload_0
    //   378: getfield 78	com/google/android/gms/iid/zzaf:zzcu	Ljava/util/Map;
    //   381: aload_3
    //   382: invokeinterface 330 2 0
    //   387: astore_3
    //   388: aload_3
    //   389: instanceof 217
    //   392: ifeq +223 -> 615
    //   395: aload_3
    //   396: checkcast 217	android/os/Bundle
    //   399: astore 4
    //   401: aload_1
    //   402: monitorexit
    //   403: ldc 242
    //   405: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   408: aload 4
    //   410: areturn
    //   411: ldc_w 332
    //   414: astore 4
    //   416: goto -292 -> 124
    //   419: astore_1
    //   420: ldc_w 307
    //   423: iconst_3
    //   424: invokestatic 313	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   427: pop
    //   428: iload 5
    //   430: ifeq +93 -> 523
    //   433: aload_0
    //   434: monitorenter
    //   435: getstatic 64	com/google/android/gms/iid/zzaf:zzct	Landroid/content/BroadcastReceiver;
    //   438: ifnonnull +61 -> 499
    //   441: new 334	com/google/android/gms/iid/zzah
    //   444: astore_1
    //   445: aload_1
    //   446: aload_0
    //   447: invokespecial 337	com/google/android/gms/iid/zzah:<init>	(Lcom/google/android/gms/iid/zzaf;)V
    //   450: aload_1
    //   451: putstatic 64	com/google/android/gms/iid/zzaf:zzct	Landroid/content/BroadcastReceiver;
    //   454: ldc_w 307
    //   457: iconst_3
    //   458: invokestatic 313	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   461: pop
    //   462: new 339	android/content/IntentFilter
    //   465: astore_1
    //   466: aload_1
    //   467: ldc_w 341
    //   470: invokespecial 342	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
    //   473: aload_1
    //   474: aload_0
    //   475: getfield 80	com/google/android/gms/iid/zzaf:zzk	Landroid/content/Context;
    //   478: invokevirtual 347	android/content/Context:getPackageName	()Ljava/lang/String;
    //   481: invokevirtual 350	android/content/IntentFilter:addCategory	(Ljava/lang/String;)V
    //   484: aload_0
    //   485: getfield 80	com/google/android/gms/iid/zzaf:zzk	Landroid/content/Context;
    //   488: getstatic 64	com/google/android/gms/iid/zzaf:zzct	Landroid/content/BroadcastReceiver;
    //   491: aload_1
    //   492: ldc 165
    //   494: aconst_null
    //   495: invokevirtual 354	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    //   498: pop
    //   499: aload_0
    //   500: monitorexit
    //   501: aload_0
    //   502: getfield 80	com/google/android/gms/iid/zzaf:zzk	Landroid/content/Context;
    //   505: aload 4
    //   507: invokevirtual 357	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
    //   510: goto -148 -> 362
    //   513: astore_1
    //   514: aload_0
    //   515: monitorexit
    //   516: ldc 242
    //   518: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   521: aload_1
    //   522: athrow
    //   523: aload 4
    //   525: ldc 237
    //   527: aload_0
    //   528: getfield 249	com/google/android/gms/iid/zzaf:zzah	Landroid/os/Messenger;
    //   531: invokevirtual 203	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   534: pop
    //   535: aload 4
    //   537: ldc_w 359
    //   540: ldc_w 305
    //   543: invokevirtual 290	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   546: pop
    //   547: aload_0
    //   548: getfield 361	com/google/android/gms/iid/zzaf:zzcw	Lcom/google/android/gms/iid/MessengerCompat;
    //   551: ifnull +33 -> 584
    //   554: invokestatic 97	android/os/Message:obtain	()Landroid/os/Message;
    //   557: astore_1
    //   558: aload_1
    //   559: aload 4
    //   561: putfield 101	android/os/Message:obj	Ljava/lang/Object;
    //   564: aload_0
    //   565: getfield 361	com/google/android/gms/iid/zzaf:zzcw	Lcom/google/android/gms/iid/MessengerCompat;
    //   568: aload_1
    //   569: invokevirtual 364	com/google/android/gms/iid/MessengerCompat:send	(Landroid/os/Message;)V
    //   572: goto -210 -> 362
    //   575: astore_1
    //   576: ldc_w 307
    //   579: iconst_3
    //   580: invokestatic 313	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   583: pop
    //   584: getstatic 56	com/google/android/gms/iid/zzaf:zzcq	Z
    //   587: ifeq +15 -> 602
    //   590: aload_0
    //   591: getfield 80	com/google/android/gms/iid/zzaf:zzk	Landroid/content/Context;
    //   594: aload 4
    //   596: invokevirtual 357	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
    //   599: goto -237 -> 362
    //   602: aload_0
    //   603: getfield 80	com/google/android/gms/iid/zzaf:zzk	Landroid/content/Context;
    //   606: aload 4
    //   608: invokevirtual 368	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   611: pop
    //   612: goto -250 -> 362
    //   615: aload_3
    //   616: instanceof 107
    //   619: ifeq +37 -> 656
    //   622: new 208	java/io/IOException
    //   625: astore 4
    //   627: aload 4
    //   629: aload_3
    //   630: checkcast 107	java/lang/String
    //   633: invokespecial 213	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   636: ldc 242
    //   638: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   641: aload 4
    //   643: athrow
    //   644: astore 4
    //   646: aload_1
    //   647: monitorexit
    //   648: ldc 242
    //   650: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   653: aload 4
    //   655: athrow
    //   656: aload_3
    //   657: invokestatic 111	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   660: astore_3
    //   661: aload_3
    //   662: invokestatic 111	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   665: invokevirtual 117	java/lang/String:length	()I
    //   668: istore 6
    //   670: new 113	java/lang/StringBuilder
    //   673: astore 4
    //   675: aload 4
    //   677: iload 6
    //   679: bipush 12
    //   681: iadd
    //   682: invokespecial 119	java/lang/StringBuilder:<init>	(I)V
    //   685: aload 4
    //   687: ldc_w 370
    //   690: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   693: aload_3
    //   694: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   697: pop
    //   698: new 208	java/io/IOException
    //   701: astore 4
    //   703: aload 4
    //   705: ldc_w 372
    //   708: invokespecial 213	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   711: ldc 242
    //   713: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   716: aload 4
    //   718: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   26	41	102	finally
    //   103	106	102	finally
    //   354	362	419	android/os/RemoteException
    //   435	499	513	finally
    //   499	501	513	finally
    //   514	516	513	finally
    //   564	572	575	android/os/RemoteException
    //   377	403	644	finally
    //   615	644	644	finally
    //   646	648	644	finally
    //   656	719	644	finally
  }

  public static boolean zzk(Context paramContext)
  {
    AppMethodBeat.i(57531);
    if (zzcp != null)
      zzl(paramContext);
    boolean bool = zzcq;
    AppMethodBeat.o(57531);
    return bool;
  }

  public static String zzl(Context paramContext)
  {
    AppMethodBeat.i(57532);
    if (zzcp != null)
    {
      paramContext = zzcp;
      AppMethodBeat.o(57532);
    }
    while (true)
    {
      return paramContext;
      zzcr = Process.myUid();
      paramContext = paramContext.getPackageManager();
      if (!PlatformVersion.isAtLeastO())
      {
        localIterator = paramContext.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
        while (localIterator.hasNext())
          if (zzd(paramContext, ((ResolveInfo)localIterator.next()).serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER"))
            zzcq = false;
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label124;
          paramContext = zzcp;
          AppMethodBeat.o(57532);
          break;
        }
      }
      label124: Iterator localIterator = paramContext.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
      while (localIterator.hasNext())
        if (zzd(paramContext, ((ResolveInfo)localIterator.next()).activityInfo.packageName, "com.google.iid.TOKEN_REQUEST"))
          zzcq = true;
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label207;
        paramContext = zzcp;
        AppMethodBeat.o(57532);
        break;
      }
      label207: if (zzd(paramContext, "com.google.android.gms"))
      {
        zzcq = PlatformVersion.isAtLeastO();
        paramContext = zzcp;
        AppMethodBeat.o(57532);
      }
      else if ((!PlatformVersion.isAtLeastLollipop()) && (zzd(paramContext, "com.google.android.gsf")))
      {
        zzcq = false;
        paramContext = zzcp;
        AppMethodBeat.o(57532);
      }
      else
      {
        paramContext = null;
        AppMethodBeat.o(57532);
      }
    }
  }

  private static int zzm(Context paramContext)
  {
    AppMethodBeat.i(57535);
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      i = localPackageManager.getPackageInfo(zzl(paramContext), 0).versionCode;
      AppMethodBeat.o(57535);
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        int i = -1;
        AppMethodBeat.o(57535);
      }
    }
  }

  private static String zzv()
  {
    try
    {
      AppMethodBeat.i(57544);
      int i = zzck;
      zzck = i + 1;
      String str = Integer.toString(i);
      AppMethodBeat.o(57544);
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final Bundle zzd(Bundle paramBundle, KeyPair paramKeyPair)
  {
    AppMethodBeat.i(57542);
    int i = zzm(this.zzk);
    paramBundle.putString("gmsv", Integer.toString(i));
    paramBundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
    paramBundle.putString("app_ver", Integer.toString(InstanceID.zzg(this.zzk)));
    paramBundle.putString("app_ver_name", InstanceID.zzh(this.zzk));
    paramBundle.putString("cliv", "iid-12451000");
    paramBundle.putString("appid", InstanceID.zzd(paramKeyPair));
    if ((i >= 12000000) && (((Boolean)zzco.get()).booleanValue()))
      paramKeyPair = new zzr(this.zzk).zzd(1, paramBundle);
    try
    {
      paramKeyPair = (Bundle)Tasks.await(paramKeyPair);
      AppMethodBeat.o(57542);
      paramBundle = paramKeyPair;
      return paramBundle;
    }
    catch (InterruptedException paramKeyPair)
    {
      while (true)
      {
        if (Log.isLoggable("InstanceID", 3))
        {
          String str = String.valueOf(paramKeyPair);
          new StringBuilder(String.valueOf(str).length() + 22).append("Error making request: ").append(str);
        }
        if (((paramKeyPair.getCause() instanceof zzaa)) && (((zzaa)paramKeyPair.getCause()).getErrorCode() == 4))
        {
          paramBundle = zzj(paramBundle);
          AppMethodBeat.o(57542);
        }
        else
        {
          paramBundle = null;
          AppMethodBeat.o(57542);
          continue;
          paramBundle = zzj(paramBundle);
          AppMethodBeat.o(57542);
        }
      }
    }
    catch (ExecutionException paramKeyPair)
    {
      label150: break label150;
    }
  }

  public final void zze(Message paramMessage)
  {
    AppMethodBeat.i(57536);
    if (paramMessage == null)
      AppMethodBeat.o(57536);
    while (true)
    {
      return;
      if ((paramMessage.obj instanceof Intent))
      {
        Object localObject = (Intent)paramMessage.obj;
        ((Intent)localObject).setExtrasClassLoader(MessengerCompat.class.getClassLoader());
        if (((Intent)localObject).hasExtra("google.messenger"))
        {
          localObject = ((Intent)localObject).getParcelableExtra("google.messenger");
          if ((localObject instanceof MessengerCompat))
            this.zzcw = ((MessengerCompat)localObject);
          if ((localObject instanceof Messenger))
            this.zzcv = ((Messenger)localObject);
        }
        zzh((Intent)paramMessage.obj);
        AppMethodBeat.o(57536);
      }
      else
      {
        AppMethodBeat.o(57536);
      }
    }
  }

  public final void zzh(Intent arg1)
  {
    AppMethodBeat.i(57541);
    if (??? == null)
    {
      Log.isLoggable("InstanceID", 3);
      AppMethodBeat.o(57541);
    }
    while (true)
    {
      return;
      Object localObject1 = ???.getAction();
      if ((!"com.google.android.c2dm.intent.REGISTRATION".equals(localObject1)) && (!"com.google.android.gms.iid.InstanceID".equals(localObject1)))
      {
        if (Log.isLoggable("InstanceID", 3))
        {
          ??? = String.valueOf(???.getAction());
          if (???.length() != 0)
          {
            "Unexpected response ".concat(???);
            AppMethodBeat.o(57541);
          }
          else
          {
            new String("Unexpected response ");
          }
        }
        else
        {
          AppMethodBeat.o(57541);
        }
      }
      else
      {
        Object localObject3 = ???.getStringExtra("registration_id");
        localObject1 = localObject3;
        if (localObject3 == null)
          localObject1 = ???.getStringExtra("unregistered");
        label286: label443: label457: String str;
        if (localObject1 == null)
        {
          Object localObject4 = ???.getStringExtra("error");
          if (localObject4 == null)
          {
            ??? = String.valueOf(???.getExtras());
            new StringBuilder(String.valueOf(???).length() + 49).append("Unexpected response, no error or registration id ").append(???);
            AppMethodBeat.o(57541);
          }
          else
          {
            Object localObject5;
            if (Log.isLoggable("InstanceID", 3))
            {
              localObject1 = String.valueOf(localObject4);
              if (((String)localObject1).length() != 0)
                "Received InstanceID error ".concat((String)localObject1);
            }
            else
            {
              localObject3 = null;
              localObject5 = null;
              localObject1 = localObject4;
              if (((String)localObject4).startsWith("|"))
              {
                localObject1 = ((String)localObject4).split("\\|");
                if (!"ID".equals(localObject1[1]))
                {
                  localObject3 = String.valueOf(localObject4);
                  if (((String)localObject3).length() == 0)
                    break label443;
                  "Unexpected structured response ".concat((String)localObject3);
                }
                if (localObject1.length <= 2)
                  break label457;
                localObject5 = localObject1[2];
                localObject4 = localObject1[3];
                localObject3 = localObject5;
                localObject1 = localObject4;
                if (((String)localObject4).startsWith(":"))
                  localObject1 = ((String)localObject4).substring(1);
              }
            }
            for (localObject3 = localObject5; ; localObject3 = localObject5)
            {
              ???.putExtra("error", (String)localObject1);
              if (localObject3 != null)
                break label478;
              synchronized (getClass())
              {
                localObject4 = this.zzcu.keySet().iterator();
                if (!((Iterator)localObject4).hasNext())
                  break label467;
                localObject3 = (String)((Iterator)localObject4).next();
                localObject5 = this.zzcu.get(localObject3);
                this.zzcu.put(localObject3, localObject1);
                zzd(localObject5, localObject1);
              }
              new String("Received InstanceID error ");
              break;
              new String("Unexpected structured response ");
              break label286;
              str = "UNKNOWN";
            }
            label467: AppMethodBeat.o(57541);
            continue;
            label478: zzd((String)localObject3, str);
            AppMethodBeat.o(57541);
          }
        }
        else
        {
          localObject3 = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(str);
          if (!((Matcher)localObject3).matches())
          {
            if (Log.isLoggable("InstanceID", 3))
            {
              ??? = String.valueOf(str);
              if (???.length() != 0)
              {
                "Unexpected response string: ".concat(???);
                AppMethodBeat.o(57541);
              }
              else
              {
                new String("Unexpected response string: ");
              }
            }
            else
            {
              AppMethodBeat.o(57541);
            }
          }
          else
          {
            str = ((Matcher)localObject3).group(1);
            localObject3 = ((Matcher)localObject3).group(2);
            ??? = ???.getExtras();
            ???.putString("registration_id", (String)localObject3);
            zzd(str, ???);
            AppMethodBeat.o(57541);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzaf
 * JD-Core Version:    0.6.2
 */