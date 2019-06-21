package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.support.v4.f.a;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzjr
  implements zzec
{
  private zzgl zzacw;
  zzgf zzaqa;
  zzfk zzaqb;
  private zzei zzaqc;
  private zzfp zzaqd;
  private zzjn zzaqe;
  private zzeb zzaqf;
  private boolean zzaqg;

  @VisibleForTesting
  private long zzaqh;
  private List<Runnable> zzaqi;
  private int zzaqj;
  private int zzaqk;
  private boolean zzaql;
  private boolean zzaqm;
  private boolean zzaqn;
  private FileLock zzaqo;
  private FileChannel zzaqp;
  private List<Long> zzaqq;
  private List<Long> zzaqr;
  long zzaqs;
  private boolean zzvo = false;

  @VisibleForTesting
  private final int zza(FileChannel paramFileChannel)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(69469);
    zzab();
    if ((paramFileChannel == null) || (!paramFileChannel.isOpen()))
    {
      zzge().zzim().log("Bad channel to read from");
      AppMethodBeat.o(69469);
      i = j;
    }
    while (true)
    {
      return i;
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
      try
      {
        paramFileChannel.position(0L);
        int k = paramFileChannel.read(localByteBuffer);
        if (k != 4)
        {
          if (k != -1)
            zzge().zzip().zzg("Unexpected data length. Bytes read", Integer.valueOf(k));
          AppMethodBeat.o(69469);
          i = j;
          continue;
        }
        localByteBuffer.flip();
        j = localByteBuffer.getInt();
        i = j;
        AppMethodBeat.o(69469);
      }
      catch (IOException paramFileChannel)
      {
        while (true)
          zzge().zzim().zzg("Failed to read from channel", paramFileChannel);
      }
    }
  }

  // ERROR //
  private final zzdz zza(Context paramContext, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, long paramLong)
  {
    // Byte code:
    //   0: ldc 142
    //   2: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 144
    //   7: astore 9
    //   9: ldc 144
    //   11: astore 10
    //   13: ldc 145
    //   15: istore 11
    //   17: aload_1
    //   18: invokevirtual 151	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   21: astore 12
    //   23: aload 12
    //   25: ifnonnull +24 -> 49
    //   28: aload_0
    //   29: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   32: invokevirtual 80	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   35: ldc 153
    //   37: invokevirtual 88	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   40: aconst_null
    //   41: astore_1
    //   42: ldc 142
    //   44: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   47: aload_1
    //   48: areturn
    //   49: aload 12
    //   51: aload_2
    //   52: invokevirtual 159	android/content/pm/PackageManager:getInstallerPackageName	(Ljava/lang/String;)Ljava/lang/String;
    //   55: astore 12
    //   57: aload 12
    //   59: astore 9
    //   61: aload 9
    //   63: ifnonnull +163 -> 226
    //   66: ldc 161
    //   68: astore 12
    //   70: aload_1
    //   71: invokestatic 167	com/google/android/gms/common/wrappers/Wrappers:packageManager	(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;
    //   74: aload_2
    //   75: iconst_0
    //   76: invokevirtual 173	com/google/android/gms/common/wrappers/PackageManagerWrapper:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   79: astore 13
    //   81: aload 10
    //   83: astore 9
    //   85: aload 13
    //   87: ifnull +48 -> 135
    //   90: aload_1
    //   91: invokestatic 167	com/google/android/gms/common/wrappers/Wrappers:packageManager	(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;
    //   94: aload_2
    //   95: invokevirtual 177	com/google/android/gms/common/wrappers/PackageManagerWrapper:getApplicationLabel	(Ljava/lang/String;)Ljava/lang/CharSequence;
    //   98: astore 9
    //   100: aload 9
    //   102: invokestatic 183	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   105: ifne +179 -> 284
    //   108: aload 9
    //   110: invokeinterface 189 1 0
    //   115: astore 9
    //   117: aload 13
    //   119: getfield 195	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   122: astore 10
    //   124: aload 13
    //   126: getfield 198	android/content/pm/PackageInfo:versionCode	I
    //   129: istore 11
    //   131: aload 10
    //   133: astore 9
    //   135: lconst_0
    //   136: lstore 14
    //   138: aload_0
    //   139: invokevirtual 202	com/google/android/gms/internal/measurement/zzjr:zzgg	()Lcom/google/android/gms/internal/measurement/zzef;
    //   142: aload_2
    //   143: invokevirtual 208	com/google/android/gms/internal/measurement/zzef:zzba	(Ljava/lang/String;)Z
    //   146: ifeq +7 -> 153
    //   149: lload 7
    //   151: lstore 14
    //   153: new 210	com/google/android/gms/internal/measurement/zzdz
    //   156: dup
    //   157: aload_2
    //   158: aload_3
    //   159: aload 9
    //   161: iload 11
    //   163: i2l
    //   164: aload 12
    //   166: ldc2_w 211
    //   169: aload_0
    //   170: invokevirtual 216	com/google/android/gms/internal/measurement/zzjr:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   173: aload_1
    //   174: aload_2
    //   175: invokevirtual 222	com/google/android/gms/internal/measurement/zzka:zzd	(Landroid/content/Context;Ljava/lang/String;)J
    //   178: aconst_null
    //   179: iload 4
    //   181: iconst_0
    //   182: ldc 224
    //   184: lconst_0
    //   185: lload 14
    //   187: iconst_0
    //   188: iload 5
    //   190: iload 6
    //   192: iconst_0
    //   193: invokespecial 227	com/google/android/gms/internal/measurement/zzdz:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZZ)V
    //   196: astore_1
    //   197: ldc 142
    //   199: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: goto -155 -> 47
    //   205: astore 12
    //   207: aload_0
    //   208: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   211: invokevirtual 80	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   214: ldc 229
    //   216: aload_2
    //   217: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   220: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   223: goto -162 -> 61
    //   226: aload 9
    //   228: astore 12
    //   230: ldc 235
    //   232: aload 9
    //   234: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   237: ifeq -167 -> 70
    //   240: ldc 224
    //   242: astore 12
    //   244: goto -174 -> 70
    //   247: astore_1
    //   248: ldc 144
    //   250: astore 9
    //   252: aload_0
    //   253: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   256: invokevirtual 80	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   259: ldc 243
    //   261: aload_2
    //   262: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   265: aload 9
    //   267: invokevirtual 247	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   270: aconst_null
    //   271: astore_1
    //   272: ldc 142
    //   274: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   277: goto -230 -> 47
    //   280: astore_1
    //   281: goto -29 -> 252
    //   284: ldc 144
    //   286: astore 9
    //   288: goto -171 -> 117
    //
    // Exception table:
    //   from	to	target	type
    //   49	57	205	java/lang/IllegalArgumentException
    //   70	81	247	android/content/pm/PackageManager$NameNotFoundException
    //   90	117	247	android/content/pm/PackageManager$NameNotFoundException
    //   117	131	280	android/content/pm/PackageManager$NameNotFoundException
  }

  private static void zza(zzjq paramzzjq)
  {
    AppMethodBeat.i(69450);
    if (paramzzjq == null)
    {
      paramzzjq = new IllegalStateException("Upload component not created");
      AppMethodBeat.o(69450);
      throw paramzzjq;
    }
    if (!paramzzjq.isInitialized())
    {
      paramzzjq = String.valueOf(paramzzjq.getClass());
      paramzzjq = new IllegalStateException(String.valueOf(paramzzjq).length() + 27 + "Component not initialized: " + paramzzjq);
      AppMethodBeat.o(69450);
      throw paramzzjq;
    }
    AppMethodBeat.o(69450);
  }

  @VisibleForTesting
  private final boolean zza(int paramInt, FileChannel paramFileChannel)
  {
    boolean bool = true;
    AppMethodBeat.i(69470);
    zzab();
    if ((paramFileChannel == null) || (!paramFileChannel.isOpen()))
    {
      zzge().zzim().log("Bad channel to read from");
      AppMethodBeat.o(69470);
      bool = false;
    }
    while (true)
    {
      return bool;
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
      localByteBuffer.putInt(paramInt);
      localByteBuffer.flip();
      try
      {
        paramFileChannel.truncate(0L);
        paramFileChannel.write(localByteBuffer);
        paramFileChannel.force(true);
        if (paramFileChannel.size() != 4L)
          zzge().zzim().zzg("Error writing to channel. Bytes written", Long.valueOf(paramFileChannel.size()));
        AppMethodBeat.o(69470);
      }
      catch (IOException paramFileChannel)
      {
        zzge().zzim().zzg("Failed to write to channel", paramFileChannel);
        AppMethodBeat.o(69470);
        bool = false;
      }
    }
  }

  private final boolean zza(String paramString, zzeu paramzzeu)
  {
    AppMethodBeat.i(69456);
    String str = paramzzeu.zzafq.getString("currency");
    double d2;
    long l1;
    zzei localzzei;
    int i;
    if ("ecommerce_purchase".equals(paramzzeu.name))
    {
      double d1 = paramzzeu.zzafq.zzbh("value").doubleValue() * 1000000.0D;
      d2 = d1;
      if (d1 == 0.0D)
        d2 = paramzzeu.zzafq.getLong("value").longValue() * 1000000.0D;
      if ((d2 <= 9.223372036854776E+018D) && (d2 >= -9.223372036854776E+018D))
      {
        l1 = Math.round(d2);
        if (!TextUtils.isEmpty(str))
        {
          Object localObject = str.toUpperCase(Locale.US);
          if (((String)localObject).matches("[A-Z]{3}"))
          {
            str = String.valueOf("_ltv_");
            localObject = String.valueOf(localObject);
            if (((String)localObject).length() == 0)
              break label403;
            str = str.concat((String)localObject);
            localObject = zzix().zzh(paramString, str);
            if ((localObject != null) && ((((zzjz)localObject).value instanceof Long)))
              break label440;
            localzzei = zzix();
            i = zzgg().zzb(paramString, zzew.zzahm);
            Preconditions.checkNotEmpty(paramString);
            localzzei.zzab();
            localzzei.zzch();
          }
        }
      }
    }
    while (true)
    {
      try
      {
        localzzei.getWritableDatabase().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[] { paramString, paramString, String.valueOf(i - 1) });
        paramzzeu = new zzjz(paramString, paramzzeu.origin, str, zzbt().currentTimeMillis(), Long.valueOf(l1));
        if (!zzix().zza(paramzzeu))
        {
          zzge().zzim().zzd("Too many unique user properties are set. Ignoring user property. appId", zzfg.zzbm(paramString), zzga().zzbl(paramzzeu.name), paramzzeu.value);
          zzgb().zza(paramString, 9, null, null, 0);
        }
        boolean bool = true;
        AppMethodBeat.o(69456);
        return bool;
        zzge().zzip().zze("Data lost. Currency value is too big. appId", zzfg.zzbm(paramString), Double.valueOf(d2));
        bool = false;
        AppMethodBeat.o(69456);
        continue;
        l1 = paramzzeu.zzafq.getLong("value").longValue();
        break;
        label403: str = new String(str);
      }
      catch (SQLiteException localSQLiteException)
      {
        localzzei.zzge().zzim().zze("Error pruning currencies. appId", zzfg.zzbm(paramString), localSQLiteException);
        continue;
      }
      label440: long l2 = ((Long)localSQLiteException.value).longValue();
      paramzzeu = new zzjz(paramString, paramzzeu.origin, str, zzbt().currentTimeMillis(), Long.valueOf(l1 + l2));
    }
  }

  private final zzkm[] zza(String paramString, zzks[] paramArrayOfzzks, zzkn[] paramArrayOfzzkn)
  {
    AppMethodBeat.i(69459);
    Preconditions.checkNotEmpty(paramString);
    paramString = zziw().zza(paramString, paramArrayOfzzkn, paramArrayOfzzks);
    AppMethodBeat.o(69459);
    return paramString;
  }

  private final void zzb(zzdy paramzzdy)
  {
    AppMethodBeat.i(69462);
    zzab();
    if (TextUtils.isEmpty(paramzzdy.getGmpAppId()))
    {
      zzb(paramzzdy.zzah(), 204, null, null, null);
      AppMethodBeat.o(69462);
      return;
    }
    Object localObject1 = paramzzdy.getGmpAppId();
    Object localObject3 = paramzzdy.getAppInstanceId();
    Object localObject4 = new Uri.Builder();
    Object localObject5 = ((Uri.Builder)localObject4).scheme((String)zzew.zzagm.get()).encodedAuthority((String)zzew.zzagn.get());
    localObject1 = String.valueOf(localObject1);
    if (((String)localObject1).length() != 0)
    {
      localObject1 = "config/app/".concat((String)localObject1);
      ((Uri.Builder)localObject5).path((String)localObject1).appendQueryParameter("app_instance_id", (String)localObject3).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "12451");
      localObject5 = ((Uri.Builder)localObject4).build().toString();
    }
    while (true)
    {
      try
      {
        localObject4 = new java/net/URL;
        ((URL)localObject4).<init>((String)localObject5);
        zzge().zzit().zzg("Fetching remote configuration", paramzzdy.zzah());
        localObject1 = zzkm().zzbu(paramzzdy.zzah());
        localObject3 = zzkm().zzbv(paramzzdy.zzah());
        if ((localObject1 == null) || (TextUtils.isEmpty((CharSequence)localObject3)))
          break label368;
        localObject1 = new android/support/v4/f/a;
        ((a)localObject1).<init>();
        ((Map)localObject1).put("If-Modified-Since", localObject3);
        this.zzaql = true;
        zzfk localzzfk = zzkn();
        String str = paramzzdy.zzah();
        localObject3 = new com/google/android/gms/internal/measurement/zzjt;
        ((zzjt)localObject3).<init>(this);
        localzzfk.zzab();
        localzzfk.zzch();
        Preconditions.checkNotNull(localObject4);
        Preconditions.checkNotNull(localObject3);
        zzgg localzzgg = localzzfk.zzgd();
        zzfo localzzfo = new com/google/android/gms/internal/measurement/zzfo;
        localzzfo.<init>(localzzfk, str, (URL)localObject4, null, (Map)localObject1, (zzfm)localObject3);
        localzzgg.zzd(localzzfo);
        AppMethodBeat.o(69462);
        break;
        localObject1 = new String("config/app/");
      }
      catch (MalformedURLException localMalformedURLException)
      {
        zzge().zzim().zze("Failed to parse config URL. Not fetching. appId", zzfg.zzbm(paramzzdy.zzah()), localObject5);
        AppMethodBeat.o(69462);
      }
      break;
      label368: Object localObject2 = null;
    }
  }

  private final Boolean zzc(zzdy paramzzdy)
  {
    AppMethodBeat.i(69467);
    try
    {
      if (paramzzdy.zzgm() != -2147483648L)
      {
        int i = Wrappers.packageManager(getContext()).getPackageInfo(paramzzdy.zzah(), 0).versionCode;
        if (paramzzdy.zzgm() == i)
        {
          paramzzdy = Boolean.TRUE;
          AppMethodBeat.o(69467);
        }
      }
      else
      {
        while (true)
        {
          return paramzzdy;
          String str = Wrappers.packageManager(getContext()).getPackageInfo(paramzzdy.zzah(), 0).versionName;
          if ((paramzzdy.zzag() == null) || (!paramzzdy.zzag().equals(str)))
            break;
          paramzzdy = Boolean.TRUE;
          AppMethodBeat.o(69467);
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramzzdy)
    {
      while (true)
      {
        paramzzdy = null;
        AppMethodBeat.o(69467);
        continue;
        paramzzdy = Boolean.FALSE;
        AppMethodBeat.o(69467);
      }
    }
  }

  private final void zzc(zzeu paramzzeu, zzdz paramzzdz)
  {
    AppMethodBeat.i(69455);
    Preconditions.checkNotNull(paramzzdz);
    Preconditions.checkNotEmpty(paramzzdz.packageName);
    long l1 = System.nanoTime();
    zzab();
    zzkq();
    Object localObject1 = paramzzdz.packageName;
    zzgb();
    if (!zzka.zzd(paramzzeu, paramzzdz))
      AppMethodBeat.o(69455);
    while (true)
    {
      return;
      if (!paramzzdz.zzadw)
      {
        zzg(paramzzdz);
        AppMethodBeat.o(69455);
        continue;
      }
      int i;
      if (zzkm().zzn((String)localObject1, paramzzeu.name))
      {
        zzge().zzip().zze("Dropping blacklisted event. appId", zzfg.zzbm((String)localObject1), zzga().zzbj(paramzzeu.name));
        if ((zzkm().zzby((String)localObject1)) || (zzkm().zzbz((String)localObject1)));
        for (i = 1; ; i = 0)
        {
          if ((i == 0) && (!"_err".equals(paramzzeu.name)))
            zzgb().zza((String)localObject1, 11, "_ev", paramzzeu.name, 0);
          if (i != 0)
          {
            paramzzeu = zzix().zzbc((String)localObject1);
            if (paramzzeu != null)
            {
              l1 = Math.max(paramzzeu.zzgs(), paramzzeu.zzgr());
              if (Math.abs(zzbt().currentTimeMillis() - l1) > ((Long)zzew.zzahh.get()).longValue())
              {
                zzge().zzis().log("Fetching config for blacklisted app");
                zzb(paramzzeu);
              }
            }
          }
          AppMethodBeat.o(69455);
          break;
        }
      }
      if (zzge().isLoggable(2))
        zzge().zzit().zzg("Logging event", zzga().zzb(paramzzeu));
      zzix().beginTransaction();
      boolean bool1;
      Object localObject2;
      long l2;
      while (true)
      {
        Object localObject3;
        try
        {
          zzg(paramzzdz);
          if ((("_iap".equals(paramzzeu.name)) || ("ecommerce_purchase".equals(paramzzeu.name))) && (!zza((String)localObject1, paramzzeu)))
          {
            zzix().setTransactionSuccessful();
            zzix().endTransaction();
            AppMethodBeat.o(69455);
            break;
          }
          bool1 = zzka.zzcc(paramzzeu.name);
          boolean bool2 = "_err".equals(paramzzeu.name);
          localObject2 = zzix().zza(zzkr(), (String)localObject1, true, bool1, false, bool2, false);
          l2 = ((zzej)localObject2).zzafe - ((Integer)zzew.zzags.get()).intValue();
          if (l2 > 0L)
          {
            if (l2 % 1000L == 1L)
              zzge().zzim().zze("Data loss. Too many events logged. appId, count", zzfg.zzbm((String)localObject1), Long.valueOf(((zzej)localObject2).zzafe));
            zzix().setTransactionSuccessful();
            zzix().endTransaction();
            AppMethodBeat.o(69455);
            break;
          }
          if (bool1)
          {
            l2 = ((zzej)localObject2).zzafd - ((Integer)zzew.zzagu.get()).intValue();
            if (l2 > 0L)
            {
              if (l2 % 1000L == 1L)
                zzge().zzim().zze("Data loss. Too many public events logged. appId, count", zzfg.zzbm((String)localObject1), Long.valueOf(((zzej)localObject2).zzafd));
              zzgb().zza((String)localObject1, 16, "_ev", paramzzeu.name, 0);
              zzix().setTransactionSuccessful();
              zzix().endTransaction();
              AppMethodBeat.o(69455);
              break;
            }
          }
          if (bool2)
          {
            l2 = ((zzej)localObject2).zzafg - Math.max(0, Math.min(1000000, zzgg().zzb(paramzzdz.packageName, zzew.zzagt)));
            if (l2 > 0L)
            {
              if (l2 == 1L)
                zzge().zzim().zze("Too many error events logged. appId, count", zzfg.zzbm((String)localObject1), Long.valueOf(((zzej)localObject2).zzafg));
              zzix().setTransactionSuccessful();
              zzix().endTransaction();
              AppMethodBeat.o(69455);
              break;
            }
          }
          localObject3 = paramzzeu.zzafq.zzif();
          zzgb().zza((Bundle)localObject3, "_o", paramzzeu.origin);
          if (zzgb().zzcj((String)localObject1))
          {
            zzgb().zza((Bundle)localObject3, "_dbg", Long.valueOf(1L));
            zzgb().zza((Bundle)localObject3, "_r", Long.valueOf(1L));
          }
          l2 = zzix().zzbd((String)localObject1);
          if (l2 > 0L)
            zzge().zzip().zze("Data lost. Too many events stored on disk, deleted. appId", zzfg.zzbm((String)localObject1), Long.valueOf(l2));
          localObject2 = new com/google/android/gms/internal/measurement/zzep;
          ((zzep)localObject2).<init>(this.zzacw, paramzzeu.origin, (String)localObject1, paramzzeu.name, paramzzeu.zzagb, 0L, (Bundle)localObject3);
          localObject3 = zzix().zzf((String)localObject1, ((zzep)localObject2).name);
          if (localObject3 == null)
          {
            if ((zzix().zzbg((String)localObject1) >= 500L) && (bool1))
            {
              zzge().zzim().zzd("Too many event names used, ignoring event. appId, name, supported count", zzfg.zzbm((String)localObject1), zzga().zzbj(((zzep)localObject2).name), Integer.valueOf(500));
              zzgb().zza((String)localObject1, 8, null, null, 0);
              zzix().endTransaction();
              AppMethodBeat.o(69455);
              break;
            }
            localObject3 = new com/google/android/gms/internal/measurement/zzeq;
            ((zzeq)localObject3).<init>((String)localObject1, ((zzep)localObject2).name, 0L, 0L, ((zzep)localObject2).timestamp, 0L, null, null, null);
            paramzzeu = (zzeu)localObject2;
            localObject2 = localObject3;
            zzix().zza((zzeq)localObject2);
            zzab();
            zzkq();
            Preconditions.checkNotNull(paramzzeu);
            Preconditions.checkNotNull(paramzzdz);
            Preconditions.checkNotEmpty(paramzzeu.zzti);
            Preconditions.checkArgument(paramzzeu.zzti.equals(paramzzdz.packageName));
            localObject1 = new com/google/android/gms/internal/measurement/zzkq;
            ((zzkq)localObject1).<init>();
            ((zzkq)localObject1).zzath = Integer.valueOf(1);
            ((zzkq)localObject1).zzatp = "android";
            ((zzkq)localObject1).zzti = paramzzdz.packageName;
            ((zzkq)localObject1).zzadt = paramzzdz.zzadt;
            ((zzkq)localObject1).zzth = paramzzdz.zzth;
            if (paramzzdz.zzads != -2147483648L)
              continue;
            localObject2 = null;
            ((zzkq)localObject1).zzaub = ((Integer)localObject2);
            ((zzkq)localObject1).zzatt = Long.valueOf(paramzzdz.zzadu);
            ((zzkq)localObject1).zzadm = paramzzdz.zzadm;
            if (paramzzdz.zzadv != 0L)
              continue;
            localObject2 = null;
            ((zzkq)localObject1).zzatx = ((Long)localObject2);
            localObject2 = zzgf().zzbo(paramzzdz.packageName);
            if ((localObject2 == null) || (TextUtils.isEmpty((CharSequence)((Pair)localObject2).first)))
              continue;
            if (paramzzdz.zzady)
            {
              ((zzkq)localObject1).zzatv = ((String)((Pair)localObject2).first);
              ((zzkq)localObject1).zzatw = ((Boolean)((Pair)localObject2).second);
            }
            zzfw().zzch();
            ((zzkq)localObject1).zzatr = Build.MODEL;
            zzfw().zzch();
            ((zzkq)localObject1).zzatq = Build.VERSION.RELEASE;
            ((zzkq)localObject1).zzats = Integer.valueOf((int)zzfw().zzic());
            ((zzkq)localObject1).zzafn = zzfw().zzid();
            ((zzkq)localObject1).zzatu = null;
            ((zzkq)localObject1).zzatk = null;
            ((zzkq)localObject1).zzatl = null;
            ((zzkq)localObject1).zzatm = null;
            ((zzkq)localObject1).zzaug = Long.valueOf(paramzzdz.zzadx);
            if ((this.zzacw.isEnabled()) && (zzef.zzhk()))
              ((zzkq)localObject1).zzauh = null;
            localObject3 = zzix().zzbc(paramzzdz.packageName);
            localObject2 = localObject3;
            if (localObject3 == null)
            {
              localObject2 = new com/google/android/gms/internal/measurement/zzdy;
              ((zzdy)localObject2).<init>(this.zzacw, paramzzdz.packageName);
              ((zzdy)localObject2).zzal(this.zzacw.zzfv().zzii());
              ((zzdy)localObject2).zzao(paramzzdz.zzado);
              ((zzdy)localObject2).zzam(paramzzdz.zzadm);
              ((zzdy)localObject2).zzan(zzgf().zzbp(paramzzdz.packageName));
              ((zzdy)localObject2).zzr(0L);
              ((zzdy)localObject2).zzm(0L);
              ((zzdy)localObject2).zzn(0L);
              ((zzdy)localObject2).setAppVersion(paramzzdz.zzth);
              ((zzdy)localObject2).zzo(paramzzdz.zzads);
              ((zzdy)localObject2).zzap(paramzzdz.zzadt);
              ((zzdy)localObject2).zzp(paramzzdz.zzadu);
              ((zzdy)localObject2).zzq(paramzzdz.zzadv);
              ((zzdy)localObject2).setMeasurementEnabled(paramzzdz.zzadw);
              ((zzdy)localObject2).zzaa(paramzzdz.zzadx);
              zzix().zza((zzdy)localObject2);
            }
            ((zzkq)localObject1).zzadl = ((zzdy)localObject2).getAppInstanceId();
            ((zzkq)localObject1).zzado = ((zzdy)localObject2).zzgj();
            localObject2 = zzix().zzbb(paramzzdz.packageName);
            ((zzkq)localObject1).zzatj = new zzks[((List)localObject2).size()];
            i = 0;
            if (i >= ((List)localObject2).size())
              break label1875;
            paramzzdz = new com/google/android/gms/internal/measurement/zzks;
            paramzzdz.<init>();
            ((zzkq)localObject1).zzatj[i] = paramzzdz;
            paramzzdz.name = ((zzjz)((List)localObject2).get(i)).name;
            paramzzdz.zzaun = Long.valueOf(((zzjz)((List)localObject2).get(i)).zzaqz);
            zzgb().zza(paramzzdz, ((zzjz)((List)localObject2).get(i)).value);
            i++;
            continue;
          }
          paramzzeu = ((zzep)localObject2).zza(this.zzacw, ((zzeq)localObject3).zzaft);
          localObject2 = ((zzeq)localObject3).zzac(paramzzeu.timestamp);
          continue;
          localObject2 = Integer.valueOf((int)paramzzdz.zzads);
          continue;
          localObject2 = Long.valueOf(paramzzdz.zzadv);
          continue;
          if ((zzfw().zzf(getContext())) || (!paramzzdz.zzadz))
            continue;
          localObject3 = Settings.Secure.getString(getContext().getContentResolver(), "android_id");
          if (localObject3 == null)
          {
            zzge().zzip().zzg("null secure ID. appId", zzfg.zzbm(((zzkq)localObject1).zzti));
            localObject2 = "null";
            ((zzkq)localObject1).zzaue = ((String)localObject2);
            continue;
          }
        }
        finally
        {
          zzix().endTransaction();
          AppMethodBeat.o(69455);
        }
        localObject2 = localObject3;
        if (((String)localObject3).isEmpty())
        {
          zzge().zzip().zzg("empty secure ID. appId", zzfg.zzbm(((zzkq)localObject1).zzti));
          localObject2 = localObject3;
        }
      }
      try
      {
        label1875: l2 = zzix().zza((zzkq)localObject1);
        paramzzdz = zzix();
        if (paramzzeu.zzafq != null)
        {
          localObject2 = paramzzeu.zzafq.iterator();
          do
            if (!((Iterator)localObject2).hasNext())
              break;
          while (!"_r".equals((String)((Iterator)localObject2).next()));
          bool1 = true;
          if (paramzzdz.zza(paramzzeu, l2, bool1))
            this.zzaqh = 0L;
          zzix().setTransactionSuccessful();
          if (zzge().isLoggable(2))
            zzge().zzit().zzg("Event recorded", zzga().zza(paramzzeu));
          zzix().endTransaction();
          zzku();
          zzge().zzit().zzg("Background event processing time, ms", Long.valueOf((System.nanoTime() - l1 + 500000L) / 1000000L));
          AppMethodBeat.o(69455);
        }
      }
      catch (IOException paramzzdz)
      {
        while (true)
        {
          zzge().zzim().zze("Data loss. Failed to insert raw event metadata. appId", zzfg.zzbm(((zzkq)localObject1).zzti), paramzzdz);
          continue;
          bool1 = zzkm().zzo(paramzzeu.zzti, paramzzeu.name);
          localObject2 = zzix().zza(zzkr(), paramzzeu.zzti, false, false, false, false, false);
          if (bool1)
          {
            long l3 = ((zzej)localObject2).zzafh;
            i = zzgg().zzar(paramzzeu.zzti);
            if (l3 < i)
              bool1 = true;
          }
          else
          {
            bool1 = false;
          }
        }
      }
    }
  }

  // ERROR //
  private final boolean zzd(String paramString, long paramLong)
  {
    // Byte code:
    //   0: ldc_w 1158
    //   3: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   10: invokevirtual 722	com/google/android/gms/internal/measurement/zzei:beginTransaction	()V
    //   13: new 1160	com/google/android/gms/internal/measurement/zzjv
    //   16: astore 4
    //   18: aload 4
    //   20: aload_0
    //   21: aconst_null
    //   22: invokespecial 1163	com/google/android/gms/internal/measurement/zzjv:<init>	(Lcom/google/android/gms/internal/measurement/zzjr;Lcom/google/android/gms/internal/measurement/zzjs;)V
    //   25: aload_0
    //   26: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   29: astore 5
    //   31: aconst_null
    //   32: astore 6
    //   34: aload_0
    //   35: getfield 1165	com/google/android/gms/internal/measurement/zzjr:zzaqs	J
    //   38: lstore 7
    //   40: aload 4
    //   42: invokestatic 604	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   45: pop
    //   46: aload 5
    //   48: invokevirtual 417	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   51: aload 5
    //   53: invokevirtual 420	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   56: aconst_null
    //   57: astore 9
    //   59: aconst_null
    //   60: astore 10
    //   62: aload 10
    //   64: astore_1
    //   65: aload 9
    //   67: astore 11
    //   69: aload 6
    //   71: astore 12
    //   73: aload 5
    //   75: invokevirtual 424	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   78: astore 13
    //   80: aload 10
    //   82: astore_1
    //   83: aload 9
    //   85: astore 11
    //   87: aload 6
    //   89: astore 12
    //   91: aconst_null
    //   92: invokestatic 183	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   95: ifeq +683 -> 778
    //   98: lload 7
    //   100: ldc2_w 1166
    //   103: lcmp
    //   104: ifeq +447 -> 551
    //   107: aload 10
    //   109: astore_1
    //   110: aload 9
    //   112: astore 11
    //   114: aload 6
    //   116: astore 12
    //   118: iconst_2
    //   119: anewarray 237	java/lang/String
    //   122: dup
    //   123: iconst_0
    //   124: lload 7
    //   126: invokestatic 1170	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   129: aastore
    //   130: dup
    //   131: iconst_1
    //   132: lload_2
    //   133: invokestatic 1170	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   136: aastore
    //   137: astore 14
    //   139: lload 7
    //   141: ldc2_w 1166
    //   144: lcmp
    //   145: ifeq +433 -> 578
    //   148: ldc_w 1172
    //   151: astore 15
    //   153: aload 10
    //   155: astore_1
    //   156: aload 9
    //   158: astore 11
    //   160: aload 6
    //   162: astore 12
    //   164: aload 15
    //   166: invokestatic 267	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   169: invokevirtual 272	java/lang/String:length	()I
    //   172: istore 16
    //   174: aload 10
    //   176: astore_1
    //   177: aload 9
    //   179: astore 11
    //   181: aload 6
    //   183: astore 12
    //   185: new 269	java/lang/StringBuilder
    //   188: astore 17
    //   190: aload 10
    //   192: astore_1
    //   193: aload 9
    //   195: astore 11
    //   197: aload 6
    //   199: astore 12
    //   201: aload 17
    //   203: iload 16
    //   205: sipush 148
    //   208: iadd
    //   209: invokespecial 274	java/lang/StringBuilder:<init>	(I)V
    //   212: aload 10
    //   214: astore_1
    //   215: aload 9
    //   217: astore 11
    //   219: aload 6
    //   221: astore 12
    //   223: aload 13
    //   225: aload 17
    //   227: ldc_w 1174
    //   230: invokevirtual 280	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: aload 15
    //   235: invokevirtual 280	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: ldc_w 1176
    //   241: invokevirtual 280	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: invokevirtual 281	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   247: aload 14
    //   249: invokevirtual 1180	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   252: astore 14
    //   254: aload 14
    //   256: astore_1
    //   257: aload 14
    //   259: astore 11
    //   261: aload 6
    //   263: astore 12
    //   265: aload 14
    //   267: invokeinterface 1185 1 0
    //   272: istore 18
    //   274: iload 18
    //   276: ifne +309 -> 585
    //   279: aload 14
    //   281: ifnull +10 -> 291
    //   284: aload 14
    //   286: invokeinterface 1188 1 0
    //   291: aload 4
    //   293: getfield 1191	com/google/android/gms/internal/measurement/zzjv:zzaqx	Ljava/util/List;
    //   296: ifnull +16 -> 312
    //   299: aload 4
    //   301: getfield 1191	com/google/android/gms/internal/measurement/zzjv:zzaqx	Ljava/util/List;
    //   304: invokeinterface 1192 1 0
    //   309: ifeq +1403 -> 1712
    //   312: iconst_1
    //   313: istore 16
    //   315: iload 16
    //   317: ifne +4398 -> 4715
    //   320: iconst_0
    //   321: istore 18
    //   323: aload 4
    //   325: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   328: astore 12
    //   330: aload 12
    //   332: aload 4
    //   334: getfield 1191	com/google/android/gms/internal/measurement/zzjv:zzaqx	Ljava/util/List;
    //   337: invokeinterface 1052 1 0
    //   342: anewarray 1198	com/google/android/gms/internal/measurement/zzkn
    //   345: putfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   348: iconst_0
    //   349: istore 16
    //   351: lconst_0
    //   352: lstore_2
    //   353: aload_0
    //   354: invokevirtual 202	com/google/android/gms/internal/measurement/zzjr:zzgg	()Lcom/google/android/gms/internal/measurement/zzef;
    //   357: aload 12
    //   359: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   362: invokevirtual 1205	com/google/android/gms/internal/measurement/zzef:zzav	(Ljava/lang/String;)Z
    //   365: istore 19
    //   367: iconst_0
    //   368: istore 20
    //   370: iload 20
    //   372: aload 4
    //   374: getfield 1191	com/google/android/gms/internal/measurement/zzjv:zzaqx	Ljava/util/List;
    //   377: invokeinterface 1052 1 0
    //   382: if_icmpge +2265 -> 2647
    //   385: aload 4
    //   387: getfield 1191	com/google/android/gms/internal/measurement/zzjv:zzaqx	Ljava/util/List;
    //   390: iload 20
    //   392: invokeinterface 1062 2 0
    //   397: checkcast 1198	com/google/android/gms/internal/measurement/zzkn
    //   400: astore 14
    //   402: aload_0
    //   403: invokespecial 569	com/google/android/gms/internal/measurement/zzjr:zzkm	()Lcom/google/android/gms/internal/measurement/zzgf;
    //   406: aload 4
    //   408: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   411: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   414: aload 14
    //   416: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   419: invokevirtual 667	com/google/android/gms/internal/measurement/zzgf:zzn	(Ljava/lang/String;Ljava/lang/String;)Z
    //   422: ifeq +1302 -> 1724
    //   425: aload_0
    //   426: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   429: invokevirtual 108	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   432: ldc_w 1208
    //   435: aload 4
    //   437: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   440: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   443: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   446: aload_0
    //   447: invokevirtual 459	com/google/android/gms/internal/measurement/zzjr:zzga	()Lcom/google/android/gms/internal/measurement/zzfe;
    //   450: aload 14
    //   452: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   455: invokevirtual 672	com/google/android/gms/internal/measurement/zzfe:zzbj	(Ljava/lang/String;)Ljava/lang/String;
    //   458: invokevirtual 247	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   461: aload_0
    //   462: invokespecial 569	com/google/android/gms/internal/measurement/zzjr:zzkm	()Lcom/google/android/gms/internal/measurement/zzgf;
    //   465: aload 4
    //   467: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   470: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   473: invokevirtual 675	com/google/android/gms/internal/measurement/zzgf:zzby	(Ljava/lang/String;)Z
    //   476: ifne +21 -> 497
    //   479: aload_0
    //   480: invokespecial 569	com/google/android/gms/internal/measurement/zzjr:zzkm	()Lcom/google/android/gms/internal/measurement/zzgf;
    //   483: aload 4
    //   485: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   488: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   491: invokevirtual 678	com/google/android/gms/internal/measurement/zzgf:zzbz	(Ljava/lang/String;)Z
    //   494: ifeq +1224 -> 1718
    //   497: iconst_1
    //   498: istore 21
    //   500: iload 21
    //   502: ifne +4279 -> 4781
    //   505: ldc_w 680
    //   508: aload 14
    //   510: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   513: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   516: ifne +4265 -> 4781
    //   519: aload_0
    //   520: invokevirtual 216	com/google/android/gms/internal/measurement/zzjr:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   523: aload 4
    //   525: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   528: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   531: bipush 11
    //   533: ldc_w 682
    //   536: aload 14
    //   538: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   541: iconst_0
    //   542: invokevirtual 471	com/google/android/gms/internal/measurement/zzka:zza	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    //   545: iinc 20 1
    //   548: goto -178 -> 370
    //   551: aload 10
    //   553: astore_1
    //   554: aload 9
    //   556: astore 11
    //   558: aload 6
    //   560: astore 12
    //   562: iconst_1
    //   563: anewarray 237	java/lang/String
    //   566: dup
    //   567: iconst_0
    //   568: lload_2
    //   569: invokestatic 1170	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   572: aastore
    //   573: astore 14
    //   575: goto -436 -> 139
    //   578: ldc 224
    //   580: astore 15
    //   582: goto -429 -> 153
    //   585: aload 14
    //   587: astore_1
    //   588: aload 14
    //   590: astore 11
    //   592: aload 6
    //   594: astore 12
    //   596: aload 14
    //   598: iconst_0
    //   599: invokeinterface 1210 2 0
    //   604: astore 15
    //   606: aload 14
    //   608: astore_1
    //   609: aload 14
    //   611: astore 11
    //   613: aload 15
    //   615: astore 12
    //   617: aload 14
    //   619: iconst_1
    //   620: invokeinterface 1210 2 0
    //   625: astore 6
    //   627: aload 14
    //   629: astore_1
    //   630: aload 14
    //   632: astore 11
    //   634: aload 15
    //   636: astore 12
    //   638: aload 14
    //   640: invokeinterface 1188 1 0
    //   645: aload 14
    //   647: astore_1
    //   648: aload 15
    //   650: astore 11
    //   652: aload 6
    //   654: astore 15
    //   656: aload_1
    //   657: astore 12
    //   659: aload 13
    //   661: ldc_w 1212
    //   664: iconst_1
    //   665: anewarray 237	java/lang/String
    //   668: dup
    //   669: iconst_0
    //   670: ldc_w 1214
    //   673: aastore
    //   674: ldc_w 1216
    //   677: iconst_2
    //   678: anewarray 237	java/lang/String
    //   681: dup
    //   682: iconst_0
    //   683: aload 11
    //   685: aastore
    //   686: dup
    //   687: iconst_1
    //   688: aload 15
    //   690: aastore
    //   691: aconst_null
    //   692: aconst_null
    //   693: ldc_w 1218
    //   696: ldc_w 1220
    //   699: invokevirtual 1224	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   702: astore 14
    //   704: aload 14
    //   706: astore 12
    //   708: aload 14
    //   710: astore_1
    //   711: aload 14
    //   713: invokeinterface 1185 1 0
    //   718: ifne +331 -> 1049
    //   721: aload 14
    //   723: astore 12
    //   725: aload 14
    //   727: astore_1
    //   728: aload 5
    //   730: invokevirtual 478	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   733: invokevirtual 80	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   736: ldc_w 1226
    //   739: aload 11
    //   741: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   744: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   747: aload 14
    //   749: ifnull -458 -> 291
    //   752: aload 14
    //   754: invokeinterface 1188 1 0
    //   759: goto -468 -> 291
    //   762: astore_1
    //   763: aload_0
    //   764: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   767: invokevirtual 732	com/google/android/gms/internal/measurement/zzei:endTransaction	()V
    //   770: ldc_w 1158
    //   773: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   776: aload_1
    //   777: athrow
    //   778: lload 7
    //   780: ldc2_w 1166
    //   783: lcmp
    //   784: ifeq +186 -> 970
    //   787: aload 10
    //   789: astore_1
    //   790: aload 9
    //   792: astore 11
    //   794: aload 6
    //   796: astore 12
    //   798: iconst_2
    //   799: anewarray 237	java/lang/String
    //   802: dup
    //   803: iconst_0
    //   804: aconst_null
    //   805: aastore
    //   806: dup
    //   807: iconst_1
    //   808: lload 7
    //   810: invokestatic 1170	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   813: aastore
    //   814: astore 14
    //   816: lload 7
    //   818: ldc2_w 1166
    //   821: lcmp
    //   822: ifeq +172 -> 994
    //   825: ldc_w 1228
    //   828: astore 15
    //   830: aload 10
    //   832: astore_1
    //   833: aload 9
    //   835: astore 11
    //   837: aload 6
    //   839: astore 12
    //   841: aload 15
    //   843: invokestatic 267	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   846: invokevirtual 272	java/lang/String:length	()I
    //   849: istore 16
    //   851: aload 10
    //   853: astore_1
    //   854: aload 9
    //   856: astore 11
    //   858: aload 6
    //   860: astore 12
    //   862: new 269	java/lang/StringBuilder
    //   865: astore 17
    //   867: aload 10
    //   869: astore_1
    //   870: aload 9
    //   872: astore 11
    //   874: aload 6
    //   876: astore 12
    //   878: aload 17
    //   880: iload 16
    //   882: bipush 84
    //   884: iadd
    //   885: invokespecial 274	java/lang/StringBuilder:<init>	(I)V
    //   888: aload 10
    //   890: astore_1
    //   891: aload 9
    //   893: astore 11
    //   895: aload 6
    //   897: astore 12
    //   899: aload 13
    //   901: aload 17
    //   903: ldc_w 1230
    //   906: invokevirtual 280	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   909: aload 15
    //   911: invokevirtual 280	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   914: ldc_w 1232
    //   917: invokevirtual 280	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   920: invokevirtual 281	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   923: aload 14
    //   925: invokevirtual 1180	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   928: astore 14
    //   930: aload 14
    //   932: astore_1
    //   933: aload 14
    //   935: astore 11
    //   937: aload 6
    //   939: astore 12
    //   941: aload 14
    //   943: invokeinterface 1185 1 0
    //   948: istore 18
    //   950: iload 18
    //   952: ifne +49 -> 1001
    //   955: aload 14
    //   957: ifnull -666 -> 291
    //   960: aload 14
    //   962: invokeinterface 1188 1 0
    //   967: goto -676 -> 291
    //   970: aload 10
    //   972: astore_1
    //   973: aload 9
    //   975: astore 11
    //   977: aload 6
    //   979: astore 12
    //   981: iconst_1
    //   982: anewarray 237	java/lang/String
    //   985: dup
    //   986: iconst_0
    //   987: aconst_null
    //   988: aastore
    //   989: astore 14
    //   991: goto -175 -> 816
    //   994: ldc 224
    //   996: astore 15
    //   998: goto -168 -> 830
    //   1001: aload 14
    //   1003: astore_1
    //   1004: aload 14
    //   1006: astore 11
    //   1008: aload 6
    //   1010: astore 12
    //   1012: aload 14
    //   1014: iconst_0
    //   1015: invokeinterface 1210 2 0
    //   1020: astore 15
    //   1022: aload 14
    //   1024: astore_1
    //   1025: aload 14
    //   1027: astore 11
    //   1029: aload 6
    //   1031: astore 12
    //   1033: aload 14
    //   1035: invokeinterface 1188 1 0
    //   1040: aload 14
    //   1042: astore_1
    //   1043: aconst_null
    //   1044: astore 11
    //   1046: goto -390 -> 656
    //   1049: aload 14
    //   1051: astore 12
    //   1053: aload 14
    //   1055: astore_1
    //   1056: aload 14
    //   1058: iconst_0
    //   1059: invokeinterface 1236 2 0
    //   1064: astore 6
    //   1066: aload 14
    //   1068: astore 12
    //   1070: aload 14
    //   1072: astore_1
    //   1073: aload 6
    //   1075: iconst_0
    //   1076: aload 6
    //   1078: arraylength
    //   1079: invokestatic 1241	com/google/android/gms/internal/measurement/zzabv:zza	([BII)Lcom/google/android/gms/internal/measurement/zzabv;
    //   1082: astore 6
    //   1084: aload 14
    //   1086: astore 12
    //   1088: aload 14
    //   1090: astore_1
    //   1091: new 842	com/google/android/gms/internal/measurement/zzkq
    //   1094: astore 10
    //   1096: aload 14
    //   1098: astore 12
    //   1100: aload 14
    //   1102: astore_1
    //   1103: aload 10
    //   1105: invokespecial 843	com/google/android/gms/internal/measurement/zzkq:<init>	()V
    //   1108: aload 14
    //   1110: astore 12
    //   1112: aload 14
    //   1114: astore_1
    //   1115: aload 10
    //   1117: aload 6
    //   1119: invokevirtual 1246	com/google/android/gms/internal/measurement/zzace:zzb	(Lcom/google/android/gms/internal/measurement/zzabv;)Lcom/google/android/gms/internal/measurement/zzace;
    //   1122: pop
    //   1123: aload 14
    //   1125: astore 12
    //   1127: aload 14
    //   1129: astore_1
    //   1130: aload 14
    //   1132: invokeinterface 1249 1 0
    //   1137: ifeq +29 -> 1166
    //   1140: aload 14
    //   1142: astore 12
    //   1144: aload 14
    //   1146: astore_1
    //   1147: aload 5
    //   1149: invokevirtual 478	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   1152: invokevirtual 108	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   1155: ldc_w 1251
    //   1158: aload 11
    //   1160: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   1163: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   1166: aload 14
    //   1168: astore 12
    //   1170: aload 14
    //   1172: astore_1
    //   1173: aload 14
    //   1175: invokeinterface 1188 1 0
    //   1180: aload 14
    //   1182: astore 12
    //   1184: aload 14
    //   1186: astore_1
    //   1187: aload 4
    //   1189: aload 10
    //   1191: invokeinterface 1256 2 0
    //   1196: lload 7
    //   1198: ldc2_w 1166
    //   1201: lcmp
    //   1202: ifeq +207 -> 1409
    //   1205: ldc_w 1258
    //   1208: astore 6
    //   1210: aload 14
    //   1212: astore 12
    //   1214: aload 14
    //   1216: astore_1
    //   1217: iconst_3
    //   1218: anewarray 237	java/lang/String
    //   1221: astore 10
    //   1223: aload 10
    //   1225: iconst_0
    //   1226: aload 11
    //   1228: aastore
    //   1229: aload 10
    //   1231: iconst_1
    //   1232: aload 15
    //   1234: aastore
    //   1235: aload 14
    //   1237: astore 12
    //   1239: aload 14
    //   1241: astore_1
    //   1242: aload 10
    //   1244: iconst_2
    //   1245: lload 7
    //   1247: invokestatic 1170	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   1250: aastore
    //   1251: aload 10
    //   1253: astore 15
    //   1255: aload 14
    //   1257: astore 12
    //   1259: aload 14
    //   1261: astore_1
    //   1262: aload 13
    //   1264: ldc_w 1260
    //   1267: iconst_4
    //   1268: anewarray 237	java/lang/String
    //   1271: dup
    //   1272: iconst_0
    //   1273: ldc_w 1218
    //   1276: aastore
    //   1277: dup
    //   1278: iconst_1
    //   1279: ldc_w 1261
    //   1282: aastore
    //   1283: dup
    //   1284: iconst_2
    //   1285: ldc_w 1262
    //   1288: aastore
    //   1289: dup
    //   1290: iconst_3
    //   1291: ldc_w 1264
    //   1294: aastore
    //   1295: aload 6
    //   1297: aload 15
    //   1299: aconst_null
    //   1300: aconst_null
    //   1301: ldc_w 1218
    //   1304: aconst_null
    //   1305: invokevirtual 1224	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   1308: astore 14
    //   1310: aload 14
    //   1312: astore 12
    //   1314: aload 12
    //   1316: astore_1
    //   1317: aload 12
    //   1319: invokeinterface 1185 1 0
    //   1324: ifne +173 -> 1497
    //   1327: aload 12
    //   1329: astore_1
    //   1330: aload 5
    //   1332: invokevirtual 478	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   1335: invokevirtual 108	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   1338: ldc_w 1266
    //   1341: aload 11
    //   1343: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   1346: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   1349: aload 12
    //   1351: ifnull -1060 -> 291
    //   1354: aload 12
    //   1356: invokeinterface 1188 1 0
    //   1361: goto -1070 -> 291
    //   1364: astore 15
    //   1366: aload 14
    //   1368: astore 12
    //   1370: aload 14
    //   1372: astore_1
    //   1373: aload 5
    //   1375: invokevirtual 478	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   1378: invokevirtual 80	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   1381: ldc_w 1268
    //   1384: aload 11
    //   1386: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   1389: aload 15
    //   1391: invokevirtual 247	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1394: aload 14
    //   1396: ifnull -1105 -> 291
    //   1399: aload 14
    //   1401: invokeinterface 1188 1 0
    //   1406: goto -1115 -> 291
    //   1409: ldc_w 1216
    //   1412: astore 6
    //   1414: aload 14
    //   1416: astore 12
    //   1418: aload 14
    //   1420: astore_1
    //   1421: iconst_2
    //   1422: anewarray 237	java/lang/String
    //   1425: astore 10
    //   1427: aload 10
    //   1429: iconst_0
    //   1430: aload 11
    //   1432: aastore
    //   1433: aload 10
    //   1435: iconst_1
    //   1436: aload 15
    //   1438: aastore
    //   1439: aload 10
    //   1441: astore 15
    //   1443: goto -188 -> 1255
    //   1446: astore 14
    //   1448: aload 12
    //   1450: astore_1
    //   1451: aload 11
    //   1453: astore 12
    //   1455: aload_1
    //   1456: astore 11
    //   1458: aload 11
    //   1460: astore_1
    //   1461: aload 5
    //   1463: invokevirtual 478	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   1466: invokevirtual 80	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   1469: ldc_w 1270
    //   1472: aload 12
    //   1474: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   1477: aload 14
    //   1479: invokevirtual 247	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1482: aload 11
    //   1484: ifnull -1193 -> 291
    //   1487: aload 11
    //   1489: invokeinterface 1188 1 0
    //   1494: goto -1203 -> 291
    //   1497: aload 12
    //   1499: astore_1
    //   1500: aload 12
    //   1502: iconst_0
    //   1503: invokeinterface 1273 2 0
    //   1508: lstore_2
    //   1509: aload 12
    //   1511: astore_1
    //   1512: aload 12
    //   1514: iconst_3
    //   1515: invokeinterface 1236 2 0
    //   1520: astore 14
    //   1522: aload 12
    //   1524: astore_1
    //   1525: aload 14
    //   1527: iconst_0
    //   1528: aload 14
    //   1530: arraylength
    //   1531: invokestatic 1241	com/google/android/gms/internal/measurement/zzabv:zza	([BII)Lcom/google/android/gms/internal/measurement/zzabv;
    //   1534: astore 14
    //   1536: aload 12
    //   1538: astore_1
    //   1539: new 1198	com/google/android/gms/internal/measurement/zzkn
    //   1542: astore 15
    //   1544: aload 12
    //   1546: astore_1
    //   1547: aload 15
    //   1549: invokespecial 1274	com/google/android/gms/internal/measurement/zzkn:<init>	()V
    //   1552: aload 12
    //   1554: astore_1
    //   1555: aload 15
    //   1557: aload 14
    //   1559: invokevirtual 1246	com/google/android/gms/internal/measurement/zzace:zzb	(Lcom/google/android/gms/internal/measurement/zzabv;)Lcom/google/android/gms/internal/measurement/zzace;
    //   1562: pop
    //   1563: aload 12
    //   1565: astore_1
    //   1566: aload 15
    //   1568: aload 12
    //   1570: iconst_1
    //   1571: invokeinterface 1210 2 0
    //   1576: putfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   1579: aload 12
    //   1581: astore_1
    //   1582: aload 15
    //   1584: aload 12
    //   1586: iconst_2
    //   1587: invokeinterface 1273 2 0
    //   1592: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1595: putfield 1277	com/google/android/gms/internal/measurement/zzkn:zzatb	Ljava/lang/Long;
    //   1598: aload 12
    //   1600: astore_1
    //   1601: aload 4
    //   1603: lload_2
    //   1604: aload 15
    //   1606: invokeinterface 1280 4 0
    //   1611: istore 18
    //   1613: iload 18
    //   1615: ifne +44 -> 1659
    //   1618: aload 12
    //   1620: ifnull -1329 -> 291
    //   1623: aload 12
    //   1625: invokeinterface 1188 1 0
    //   1630: goto -1339 -> 291
    //   1633: astore 14
    //   1635: aload 12
    //   1637: astore_1
    //   1638: aload 5
    //   1640: invokevirtual 478	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   1643: invokevirtual 80	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   1646: ldc_w 1282
    //   1649: aload 11
    //   1651: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   1654: aload 14
    //   1656: invokevirtual 247	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1659: aload 12
    //   1661: astore_1
    //   1662: aload 12
    //   1664: invokeinterface 1249 1 0
    //   1669: istore 18
    //   1671: iload 18
    //   1673: ifne -176 -> 1497
    //   1676: aload 12
    //   1678: ifnull -1387 -> 291
    //   1681: aload 12
    //   1683: invokeinterface 1188 1 0
    //   1688: goto -1397 -> 291
    //   1691: astore 11
    //   1693: aload_1
    //   1694: ifnull +9 -> 1703
    //   1697: aload_1
    //   1698: invokeinterface 1188 1 0
    //   1703: ldc_w 1158
    //   1706: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1709: aload 11
    //   1711: athrow
    //   1712: iconst_0
    //   1713: istore 16
    //   1715: goto -1400 -> 315
    //   1718: iconst_0
    //   1719: istore 21
    //   1721: goto -1221 -> 500
    //   1724: aload_0
    //   1725: invokespecial 569	com/google/android/gms/internal/measurement/zzjr:zzkm	()Lcom/google/android/gms/internal/measurement/zzgf;
    //   1728: aload 4
    //   1730: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   1733: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   1736: aload 14
    //   1738: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   1741: invokevirtual 1149	com/google/android/gms/internal/measurement/zzgf:zzo	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1744: istore 22
    //   1746: iload 22
    //   1748: ifne +23 -> 1771
    //   1751: aload_0
    //   1752: invokevirtual 216	com/google/android/gms/internal/measurement/zzjr:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   1755: pop
    //   1756: iload 18
    //   1758: istore 23
    //   1760: aload 14
    //   1762: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   1765: invokestatic 1285	com/google/android/gms/internal/measurement/zzka:zzcl	(Ljava/lang/String;)Z
    //   1768: ifeq +814 -> 2582
    //   1771: iconst_0
    //   1772: istore 24
    //   1774: iconst_0
    //   1775: istore 21
    //   1777: aload 14
    //   1779: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   1782: ifnonnull +12 -> 1794
    //   1785: aload 14
    //   1787: iconst_0
    //   1788: anewarray 1291	com/google/android/gms/internal/measurement/zzko
    //   1791: putfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   1794: aload 14
    //   1796: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   1799: astore_1
    //   1800: aload_1
    //   1801: arraylength
    //   1802: istore 25
    //   1804: iconst_0
    //   1805: istore 26
    //   1807: iload 26
    //   1809: iload 25
    //   1811: if_icmpge +70 -> 1881
    //   1814: aload_1
    //   1815: iload 26
    //   1817: aaload
    //   1818: astore 11
    //   1820: ldc_w 1293
    //   1823: aload 11
    //   1825: getfield 1294	com/google/android/gms/internal/measurement/zzko:name	Ljava/lang/String;
    //   1828: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1831: ifeq +21 -> 1852
    //   1834: aload 11
    //   1836: lconst_1
    //   1837: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1840: putfield 1297	com/google/android/gms/internal/measurement/zzko:zzate	Ljava/lang/Long;
    //   1843: iconst_1
    //   1844: istore 24
    //   1846: iinc 26 1
    //   1849: goto -42 -> 1807
    //   1852: ldc_w 795
    //   1855: aload 11
    //   1857: getfield 1294	com/google/android/gms/internal/measurement/zzko:name	Ljava/lang/String;
    //   1860: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1863: ifeq +2933 -> 4796
    //   1866: aload 11
    //   1868: lconst_1
    //   1869: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1872: putfield 1297	com/google/android/gms/internal/measurement/zzko:zzate	Ljava/lang/Long;
    //   1875: iconst_1
    //   1876: istore 21
    //   1878: goto -32 -> 1846
    //   1881: iload 24
    //   1883: ifne +94 -> 1977
    //   1886: iload 22
    //   1888: ifeq +89 -> 1977
    //   1891: aload_0
    //   1892: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   1895: invokevirtual 563	com/google/android/gms/internal/measurement/zzfg:zzit	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   1898: ldc_w 1299
    //   1901: aload_0
    //   1902: invokevirtual 459	com/google/android/gms/internal/measurement/zzjr:zzga	()Lcom/google/android/gms/internal/measurement/zzfe;
    //   1905: aload 14
    //   1907: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   1910: invokevirtual 672	com/google/android/gms/internal/measurement/zzfe:zzbj	(Ljava/lang/String;)Ljava/lang/String;
    //   1913: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   1916: aload 14
    //   1918: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   1921: aload 14
    //   1923: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   1926: arraylength
    //   1927: iconst_1
    //   1928: iadd
    //   1929: invokestatic 1305	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   1932: checkcast 1306	[Lcom/google/android/gms/internal/measurement/zzko;
    //   1935: astore_1
    //   1936: new 1291	com/google/android/gms/internal/measurement/zzko
    //   1939: astore 11
    //   1941: aload 11
    //   1943: invokespecial 1307	com/google/android/gms/internal/measurement/zzko:<init>	()V
    //   1946: aload 11
    //   1948: ldc_w 1293
    //   1951: putfield 1294	com/google/android/gms/internal/measurement/zzko:name	Ljava/lang/String;
    //   1954: aload 11
    //   1956: lconst_1
    //   1957: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1960: putfield 1297	com/google/android/gms/internal/measurement/zzko:zzate	Ljava/lang/Long;
    //   1963: aload_1
    //   1964: aload_1
    //   1965: arraylength
    //   1966: iconst_1
    //   1967: isub
    //   1968: aload 11
    //   1970: aastore
    //   1971: aload 14
    //   1973: aload_1
    //   1974: putfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   1977: iload 21
    //   1979: ifne +88 -> 2067
    //   1982: aload_0
    //   1983: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   1986: invokevirtual 563	com/google/android/gms/internal/measurement/zzfg:zzit	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   1989: ldc_w 1309
    //   1992: aload_0
    //   1993: invokevirtual 459	com/google/android/gms/internal/measurement/zzjr:zzga	()Lcom/google/android/gms/internal/measurement/zzfe;
    //   1996: aload 14
    //   1998: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   2001: invokevirtual 672	com/google/android/gms/internal/measurement/zzfe:zzbj	(Ljava/lang/String;)Ljava/lang/String;
    //   2004: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   2007: aload 14
    //   2009: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2012: aload 14
    //   2014: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2017: arraylength
    //   2018: iconst_1
    //   2019: iadd
    //   2020: invokestatic 1305	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   2023: checkcast 1306	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2026: astore 11
    //   2028: new 1291	com/google/android/gms/internal/measurement/zzko
    //   2031: astore_1
    //   2032: aload_1
    //   2033: invokespecial 1307	com/google/android/gms/internal/measurement/zzko:<init>	()V
    //   2036: aload_1
    //   2037: ldc_w 795
    //   2040: putfield 1294	com/google/android/gms/internal/measurement/zzko:name	Ljava/lang/String;
    //   2043: aload_1
    //   2044: lconst_1
    //   2045: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2048: putfield 1297	com/google/android/gms/internal/measurement/zzko:zzate	Ljava/lang/Long;
    //   2051: aload 11
    //   2053: aload 11
    //   2055: arraylength
    //   2056: iconst_1
    //   2057: isub
    //   2058: aload_1
    //   2059: aastore
    //   2060: aload 14
    //   2062: aload 11
    //   2064: putfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2067: aload_0
    //   2068: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   2071: aload_0
    //   2072: invokespecial 738	com/google/android/gms/internal/measurement/zzjr:zzkr	()J
    //   2075: aload 4
    //   2077: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   2080: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   2083: iconst_0
    //   2084: iconst_0
    //   2085: iconst_0
    //   2086: iconst_0
    //   2087: iconst_1
    //   2088: invokevirtual 741	com/google/android/gms/internal/measurement/zzei:zza	(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/internal/measurement/zzej;
    //   2091: getfield 1152	com/google/android/gms/internal/measurement/zzej:zzafh	J
    //   2094: aload_0
    //   2095: invokevirtual 202	com/google/android/gms/internal/measurement/zzjr:zzgg	()Lcom/google/android/gms/internal/measurement/zzef;
    //   2098: aload 4
    //   2100: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   2103: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   2106: invokevirtual 1156	com/google/android/gms/internal/measurement/zzef:zzar	(Ljava/lang/String;)I
    //   2109: i2l
    //   2110: lcmp
    //   2111: ifle +2679 -> 4790
    //   2114: iconst_0
    //   2115: istore 21
    //   2117: iload 18
    //   2119: istore 27
    //   2121: iload 21
    //   2123: aload 14
    //   2125: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2128: arraylength
    //   2129: if_icmpge +90 -> 2219
    //   2132: ldc_w 795
    //   2135: aload 14
    //   2137: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2140: iload 21
    //   2142: aaload
    //   2143: getfield 1294	com/google/android/gms/internal/measurement/zzko:name	Ljava/lang/String;
    //   2146: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2149: ifeq +229 -> 2378
    //   2152: aload 14
    //   2154: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2157: arraylength
    //   2158: iconst_1
    //   2159: isub
    //   2160: anewarray 1291	com/google/android/gms/internal/measurement/zzko
    //   2163: astore_1
    //   2164: iload 21
    //   2166: ifle +16 -> 2182
    //   2169: aload 14
    //   2171: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2174: iconst_0
    //   2175: aload_1
    //   2176: iconst_0
    //   2177: iload 21
    //   2179: invokestatic 1313	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2182: iload 21
    //   2184: aload_1
    //   2185: arraylength
    //   2186: if_icmpge +23 -> 2209
    //   2189: aload 14
    //   2191: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2194: iload 21
    //   2196: iconst_1
    //   2197: iadd
    //   2198: aload_1
    //   2199: iload 21
    //   2201: aload_1
    //   2202: arraylength
    //   2203: iload 21
    //   2205: isub
    //   2206: invokestatic 1313	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2209: aload 14
    //   2211: aload_1
    //   2212: putfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2215: iload 18
    //   2217: istore 27
    //   2219: iload 27
    //   2221: istore 23
    //   2223: aload 14
    //   2225: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   2228: invokestatic 735	com/google/android/gms/internal/measurement/zzka:zzcc	(Ljava/lang/String;)Z
    //   2231: ifeq +351 -> 2582
    //   2234: iload 27
    //   2236: istore 23
    //   2238: iload 22
    //   2240: ifeq +342 -> 2582
    //   2243: iload 27
    //   2245: istore 23
    //   2247: aload_0
    //   2248: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   2251: aload_0
    //   2252: invokespecial 738	com/google/android/gms/internal/measurement/zzjr:zzkr	()J
    //   2255: aload 4
    //   2257: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   2260: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   2263: iconst_0
    //   2264: iconst_0
    //   2265: iconst_1
    //   2266: iconst_0
    //   2267: iconst_0
    //   2268: invokevirtual 741	com/google/android/gms/internal/measurement/zzei:zza	(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/internal/measurement/zzej;
    //   2271: getfield 1316	com/google/android/gms/internal/measurement/zzej:zzaff	J
    //   2274: aload_0
    //   2275: invokevirtual 202	com/google/android/gms/internal/measurement/zzjr:zzgg	()Lcom/google/android/gms/internal/measurement/zzef;
    //   2278: aload 4
    //   2280: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   2283: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   2286: getstatic 1319	com/google/android/gms/internal/measurement/zzew:zzagv	Lcom/google/android/gms/internal/measurement/zzex;
    //   2289: invokevirtual 409	com/google/android/gms/internal/measurement/zzef:zzb	(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzex;)I
    //   2292: i2l
    //   2293: lcmp
    //   2294: ifle +288 -> 2582
    //   2297: aload_0
    //   2298: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   2301: invokevirtual 108	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   2304: ldc_w 1321
    //   2307: aload 4
    //   2309: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   2312: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   2315: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   2318: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   2321: iconst_0
    //   2322: istore 26
    //   2324: aconst_null
    //   2325: astore_1
    //   2326: aload 14
    //   2328: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2331: astore 15
    //   2333: aload 15
    //   2335: arraylength
    //   2336: istore 24
    //   2338: iconst_0
    //   2339: istore 21
    //   2341: iload 21
    //   2343: iload 24
    //   2345: if_icmpge +59 -> 2404
    //   2348: aload 15
    //   2350: iload 21
    //   2352: aaload
    //   2353: astore 11
    //   2355: ldc_w 1293
    //   2358: aload 11
    //   2360: getfield 1294	com/google/android/gms/internal/measurement/zzko:name	Ljava/lang/String;
    //   2363: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2366: ifeq +18 -> 2384
    //   2369: aload 11
    //   2371: astore_1
    //   2372: iinc 21 1
    //   2375: goto -34 -> 2341
    //   2378: iinc 21 1
    //   2381: goto -264 -> 2117
    //   2384: ldc_w 680
    //   2387: aload 11
    //   2389: getfield 1294	com/google/android/gms/internal/measurement/zzko:name	Ljava/lang/String;
    //   2392: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2395: ifeq +2392 -> 4787
    //   2398: iconst_1
    //   2399: istore 26
    //   2401: goto -29 -> 2372
    //   2404: iload 26
    //   2406: ifeq +120 -> 2526
    //   2409: aload_1
    //   2410: ifnull +116 -> 2526
    //   2413: aload 14
    //   2415: aload 14
    //   2417: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2420: iconst_1
    //   2421: anewarray 1291	com/google/android/gms/internal/measurement/zzko
    //   2424: dup
    //   2425: iconst_0
    //   2426: aload_1
    //   2427: aastore
    //   2428: invokestatic 1327	com/google/android/gms/common/util/ArrayUtils:removeAll	([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    //   2431: checkcast 1306	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2434: putfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2437: iload 27
    //   2439: istore 18
    //   2441: iload 19
    //   2443: ifeq +2341 -> 4784
    //   2446: ldc_w 1329
    //   2449: aload 14
    //   2451: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   2454: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2457: ifeq +2327 -> 4784
    //   2460: aload 14
    //   2462: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2465: ifnull +12 -> 2477
    //   2468: aload 14
    //   2470: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   2473: arraylength
    //   2474: ifne +115 -> 2589
    //   2477: aload_0
    //   2478: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   2481: invokevirtual 108	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   2484: ldc_w 1331
    //   2487: aload 4
    //   2489: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   2492: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   2495: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   2498: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   2501: aload 12
    //   2503: getfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   2506: astore_1
    //   2507: iload 16
    //   2509: iconst_1
    //   2510: iadd
    //   2511: istore 21
    //   2513: aload_1
    //   2514: iload 16
    //   2516: aload 14
    //   2518: aastore
    //   2519: iload 21
    //   2521: istore 16
    //   2523: goto -1978 -> 545
    //   2526: aload_1
    //   2527: ifnull +27 -> 2554
    //   2530: aload_1
    //   2531: ldc_w 680
    //   2534: putfield 1294	com/google/android/gms/internal/measurement/zzko:name	Ljava/lang/String;
    //   2537: aload_1
    //   2538: ldc2_w 1332
    //   2541: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2544: putfield 1297	com/google/android/gms/internal/measurement/zzko:zzate	Ljava/lang/Long;
    //   2547: iload 27
    //   2549: istore 18
    //   2551: goto -110 -> 2441
    //   2554: aload_0
    //   2555: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   2558: invokevirtual 80	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   2561: ldc_w 1335
    //   2564: aload 4
    //   2566: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   2569: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   2572: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   2575: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   2578: iload 27
    //   2580: istore 23
    //   2582: iload 23
    //   2584: istore 18
    //   2586: goto -145 -> 2441
    //   2589: aload_0
    //   2590: invokevirtual 216	com/google/android/gms/internal/measurement/zzjr:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   2593: pop
    //   2594: aload 14
    //   2596: ldc_w 1337
    //   2599: invokestatic 1340	com/google/android/gms/internal/measurement/zzka:zzb	(Lcom/google/android/gms/internal/measurement/zzkn;Ljava/lang/String;)Ljava/lang/Object;
    //   2602: checkcast 306	java/lang/Long
    //   2605: astore_1
    //   2606: aload_1
    //   2607: ifnonnull +30 -> 2637
    //   2610: aload_0
    //   2611: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   2614: invokevirtual 108	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   2617: ldc_w 1342
    //   2620: aload 4
    //   2622: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   2625: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   2628: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   2631: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   2634: goto -133 -> 2501
    //   2637: lload_2
    //   2638: aload_1
    //   2639: invokevirtual 354	java/lang/Long:longValue	()J
    //   2642: ladd
    //   2643: lstore_2
    //   2644: goto -143 -> 2501
    //   2647: iload 16
    //   2649: aload 4
    //   2651: getfield 1191	com/google/android/gms/internal/measurement/zzjv:zzaqx	Ljava/util/List;
    //   2654: invokeinterface 1052 1 0
    //   2659: if_icmpge +21 -> 2680
    //   2662: aload 12
    //   2664: aload 12
    //   2666: getfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   2669: iload 16
    //   2671: invokestatic 1305	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   2674: checkcast 1343	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   2677: putfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   2680: iload 19
    //   2682: ifeq +243 -> 2925
    //   2685: aload_0
    //   2686: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   2689: aload 12
    //   2691: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   2694: ldc_w 1345
    //   2697: invokevirtual 394	com/google/android/gms/internal/measurement/zzei:zzh	(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzjz;
    //   2700: astore_1
    //   2701: aload_1
    //   2702: ifnull +10 -> 2712
    //   2705: aload_1
    //   2706: getfield 399	com/google/android/gms/internal/measurement/zzjz:value	Ljava/lang/Object;
    //   2709: ifnonnull +512 -> 3221
    //   2712: new 396	com/google/android/gms/internal/measurement/zzjz
    //   2715: astore_1
    //   2716: aload_1
    //   2717: aload 12
    //   2719: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   2722: ldc_w 1347
    //   2725: ldc_w 1345
    //   2728: aload_0
    //   2729: invokevirtual 442	com/google/android/gms/internal/measurement/zzjr:zzbt	()Lcom/google/android/gms/common/util/Clock;
    //   2732: invokeinterface 447 1 0
    //   2737: lload_2
    //   2738: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2741: invokespecial 450	com/google/android/gms/internal/measurement/zzjz:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   2744: new 1054	com/google/android/gms/internal/measurement/zzks
    //   2747: astore 11
    //   2749: aload 11
    //   2751: invokespecial 1059	com/google/android/gms/internal/measurement/zzks:<init>	()V
    //   2754: aload 11
    //   2756: ldc_w 1345
    //   2759: putfield 1063	com/google/android/gms/internal/measurement/zzks:name	Ljava/lang/String;
    //   2762: aload 11
    //   2764: aload_0
    //   2765: invokevirtual 442	com/google/android/gms/internal/measurement/zzjr:zzbt	()Lcom/google/android/gms/common/util/Clock;
    //   2768: invokeinterface 447 1 0
    //   2773: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2776: putfield 1069	com/google/android/gms/internal/measurement/zzks:zzaun	Ljava/lang/Long;
    //   2779: aload 11
    //   2781: aload_1
    //   2782: getfield 399	com/google/android/gms/internal/measurement/zzjz:value	Ljava/lang/Object;
    //   2785: checkcast 306	java/lang/Long
    //   2788: putfield 1348	com/google/android/gms/internal/measurement/zzks:zzate	Ljava/lang/Long;
    //   2791: iconst_0
    //   2792: istore 20
    //   2794: iconst_0
    //   2795: istore 16
    //   2797: iload 20
    //   2799: istore 21
    //   2801: iload 16
    //   2803: aload 12
    //   2805: getfield 1058	com/google/android/gms/internal/measurement/zzkq:zzatj	[Lcom/google/android/gms/internal/measurement/zzks;
    //   2808: arraylength
    //   2809: if_icmpge +36 -> 2845
    //   2812: ldc_w 1345
    //   2815: aload 12
    //   2817: getfield 1058	com/google/android/gms/internal/measurement/zzkq:zzatj	[Lcom/google/android/gms/internal/measurement/zzks;
    //   2820: iload 16
    //   2822: aaload
    //   2823: getfield 1063	com/google/android/gms/internal/measurement/zzks:name	Ljava/lang/String;
    //   2826: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2829: ifeq +438 -> 3267
    //   2832: aload 12
    //   2834: getfield 1058	com/google/android/gms/internal/measurement/zzkq:zzatj	[Lcom/google/android/gms/internal/measurement/zzks;
    //   2837: iload 16
    //   2839: aload 11
    //   2841: aastore
    //   2842: iconst_1
    //   2843: istore 21
    //   2845: iload 21
    //   2847: ifne +46 -> 2893
    //   2850: aload 12
    //   2852: aload 12
    //   2854: getfield 1058	com/google/android/gms/internal/measurement/zzkq:zzatj	[Lcom/google/android/gms/internal/measurement/zzks;
    //   2857: aload 12
    //   2859: getfield 1058	com/google/android/gms/internal/measurement/zzkq:zzatj	[Lcom/google/android/gms/internal/measurement/zzks;
    //   2862: arraylength
    //   2863: iconst_1
    //   2864: iadd
    //   2865: invokestatic 1305	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   2868: checkcast 1349	[Lcom/google/android/gms/internal/measurement/zzks;
    //   2871: putfield 1058	com/google/android/gms/internal/measurement/zzkq:zzatj	[Lcom/google/android/gms/internal/measurement/zzks;
    //   2874: aload 12
    //   2876: getfield 1058	com/google/android/gms/internal/measurement/zzkq:zzatj	[Lcom/google/android/gms/internal/measurement/zzks;
    //   2879: aload 4
    //   2881: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   2884: getfield 1058	com/google/android/gms/internal/measurement/zzkq:zzatj	[Lcom/google/android/gms/internal/measurement/zzks;
    //   2887: arraylength
    //   2888: iconst_1
    //   2889: isub
    //   2890: aload 11
    //   2892: aastore
    //   2893: lload_2
    //   2894: lconst_0
    //   2895: lcmp
    //   2896: ifle +29 -> 2925
    //   2899: aload_0
    //   2900: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   2903: aload_1
    //   2904: invokevirtual 453	com/google/android/gms/internal/measurement/zzei:zza	(Lcom/google/android/gms/internal/measurement/zzjz;)Z
    //   2907: pop
    //   2908: aload_0
    //   2909: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   2912: invokevirtual 706	com/google/android/gms/internal/measurement/zzfg:zzis	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   2915: ldc_w 1351
    //   2918: aload_1
    //   2919: getfield 399	com/google/android/gms/internal/measurement/zzjz:value	Ljava/lang/Object;
    //   2922: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   2925: aload 12
    //   2927: aload_0
    //   2928: aload 12
    //   2930: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   2933: aload 12
    //   2935: getfield 1058	com/google/android/gms/internal/measurement/zzkq:zzatj	[Lcom/google/android/gms/internal/measurement/zzks;
    //   2938: aload 12
    //   2940: getfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   2943: invokespecial 1353	com/google/android/gms/internal/measurement/zzjr:zza	(Ljava/lang/String;[Lcom/google/android/gms/internal/measurement/zzks;[Lcom/google/android/gms/internal/measurement/zzkn;)[Lcom/google/android/gms/internal/measurement/zzkm;
    //   2946: putfield 1357	com/google/android/gms/internal/measurement/zzkq:zzaua	[Lcom/google/android/gms/internal/measurement/zzkm;
    //   2949: aload_0
    //   2950: invokevirtual 202	com/google/android/gms/internal/measurement/zzjr:zzgg	()Lcom/google/android/gms/internal/measurement/zzef;
    //   2953: aload 4
    //   2955: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   2958: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   2961: invokevirtual 1360	com/google/android/gms/internal/measurement/zzef:zzau	(Ljava/lang/String;)Z
    //   2964: ifeq +1096 -> 4060
    //   2967: new 1362	java/util/HashMap
    //   2970: astore 9
    //   2972: aload 9
    //   2974: invokespecial 1363	java/util/HashMap:<init>	()V
    //   2977: aload 12
    //   2979: getfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   2982: arraylength
    //   2983: anewarray 1198	com/google/android/gms/internal/measurement/zzkn
    //   2986: astore 6
    //   2988: iconst_0
    //   2989: istore 21
    //   2991: aload_0
    //   2992: invokevirtual 216	com/google/android/gms/internal/measurement/zzjr:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   2995: invokevirtual 1367	com/google/android/gms/internal/measurement/zzka:zzlc	()Ljava/security/SecureRandom;
    //   2998: astore 14
    //   3000: aload 12
    //   3002: getfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   3005: astore 10
    //   3007: aload 10
    //   3009: arraylength
    //   3010: istore 24
    //   3012: iconst_0
    //   3013: istore 20
    //   3015: iload 20
    //   3017: iload 24
    //   3019: if_icmpge +962 -> 3981
    //   3022: aload 10
    //   3024: iload 20
    //   3026: aaload
    //   3027: astore 15
    //   3029: aload 15
    //   3031: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   3034: ldc_w 1369
    //   3037: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3040: ifeq +233 -> 3273
    //   3043: aload_0
    //   3044: invokevirtual 216	com/google/android/gms/internal/measurement/zzjr:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   3047: pop
    //   3048: aload 15
    //   3050: ldc_w 1371
    //   3053: invokestatic 1340	com/google/android/gms/internal/measurement/zzka:zzb	(Lcom/google/android/gms/internal/measurement/zzkn;Ljava/lang/String;)Ljava/lang/Object;
    //   3056: checkcast 237	java/lang/String
    //   3059: astore 5
    //   3061: aload 9
    //   3063: aload 5
    //   3065: invokeinterface 1373 2 0
    //   3070: checkcast 825	com/google/android/gms/internal/measurement/zzeq
    //   3073: astore 11
    //   3075: aload 11
    //   3077: astore_1
    //   3078: aload 11
    //   3080: ifnonnull +32 -> 3112
    //   3083: aload_0
    //   3084: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   3087: aload 4
    //   3089: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   3092: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   3095: aload 5
    //   3097: invokevirtual 816	com/google/android/gms/internal/measurement/zzei:zzf	(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzeq;
    //   3100: astore_1
    //   3101: aload 9
    //   3103: aload 5
    //   3105: aload_1
    //   3106: invokeinterface 589 3 0
    //   3111: pop
    //   3112: aload_1
    //   3113: getfield 1376	com/google/android/gms/internal/measurement/zzeq:zzafv	Ljava/lang/Long;
    //   3116: ifnonnull +858 -> 3974
    //   3119: aload_1
    //   3120: getfield 1379	com/google/android/gms/internal/measurement/zzeq:zzafw	Ljava/lang/Long;
    //   3123: invokevirtual 354	java/lang/Long:longValue	()J
    //   3126: lconst_1
    //   3127: lcmp
    //   3128: ifle +28 -> 3156
    //   3131: aload_0
    //   3132: invokevirtual 216	com/google/android/gms/internal/measurement/zzjr:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   3135: pop
    //   3136: aload 15
    //   3138: aload 15
    //   3140: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   3143: ldc_w 1381
    //   3146: aload_1
    //   3147: getfield 1379	com/google/android/gms/internal/measurement/zzeq:zzafw	Ljava/lang/Long;
    //   3150: invokestatic 1384	com/google/android/gms/internal/measurement/zzka:zza	([Lcom/google/android/gms/internal/measurement/zzko;Ljava/lang/String;Ljava/lang/Object;)[Lcom/google/android/gms/internal/measurement/zzko;
    //   3153: putfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   3156: aload_1
    //   3157: getfield 1387	com/google/android/gms/internal/measurement/zzeq:zzafx	Ljava/lang/Boolean;
    //   3160: ifnull +38 -> 3198
    //   3163: aload_1
    //   3164: getfield 1387	com/google/android/gms/internal/measurement/zzeq:zzafx	Ljava/lang/Boolean;
    //   3167: invokevirtual 1390	java/lang/Boolean:booleanValue	()Z
    //   3170: ifeq +28 -> 3198
    //   3173: aload_0
    //   3174: invokevirtual 216	com/google/android/gms/internal/measurement/zzjr:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   3177: pop
    //   3178: aload 15
    //   3180: aload 15
    //   3182: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   3185: ldc_w 1392
    //   3188: lconst_1
    //   3189: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3192: invokestatic 1384	com/google/android/gms/internal/measurement/zzka:zza	([Lcom/google/android/gms/internal/measurement/zzko;Ljava/lang/String;Ljava/lang/Object;)[Lcom/google/android/gms/internal/measurement/zzko;
    //   3195: putfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   3198: iload 21
    //   3200: iconst_1
    //   3201: iadd
    //   3202: istore 16
    //   3204: aload 6
    //   3206: iload 21
    //   3208: aload 15
    //   3210: aastore
    //   3211: iinc 20 1
    //   3214: iload 16
    //   3216: istore 21
    //   3218: goto -203 -> 3015
    //   3221: new 396	com/google/android/gms/internal/measurement/zzjz
    //   3224: dup
    //   3225: aload 12
    //   3227: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   3230: ldc_w 1347
    //   3233: ldc_w 1345
    //   3236: aload_0
    //   3237: invokevirtual 442	com/google/android/gms/internal/measurement/zzjr:zzbt	()Lcom/google/android/gms/common/util/Clock;
    //   3240: invokeinterface 447 1 0
    //   3245: aload_1
    //   3246: getfield 399	com/google/android/gms/internal/measurement/zzjz:value	Ljava/lang/Object;
    //   3249: checkcast 306	java/lang/Long
    //   3252: invokevirtual 354	java/lang/Long:longValue	()J
    //   3255: lload_2
    //   3256: ladd
    //   3257: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3260: invokespecial 450	com/google/android/gms/internal/measurement/zzjz:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   3263: astore_1
    //   3264: goto -520 -> 2744
    //   3267: iinc 16 1
    //   3270: goto -473 -> 2797
    //   3273: lconst_1
    //   3274: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3277: astore 5
    //   3279: ldc_w 793
    //   3282: invokestatic 183	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   3285: ifne +8 -> 3293
    //   3288: aload 5
    //   3290: ifnonnull +77 -> 3367
    //   3293: iconst_0
    //   3294: istore 16
    //   3296: iload 16
    //   3298: ifne +1477 -> 4775
    //   3301: aload_0
    //   3302: invokespecial 569	com/google/android/gms/internal/measurement/zzjr:zzkm	()Lcom/google/android/gms/internal/measurement/zzgf;
    //   3305: aload 4
    //   3307: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   3310: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   3313: aload 15
    //   3315: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   3318: invokevirtual 1395	com/google/android/gms/internal/measurement/zzgf:zzp	(Ljava/lang/String;Ljava/lang/String;)I
    //   3321: istore 16
    //   3323: iload 16
    //   3325: ifgt +127 -> 3452
    //   3328: aload_0
    //   3329: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   3332: invokevirtual 108	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   3335: ldc_w 1397
    //   3338: aload 15
    //   3340: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   3343: iload 16
    //   3345: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3348: invokevirtual 247	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3351: iload 21
    //   3353: iconst_1
    //   3354: iadd
    //   3355: istore 16
    //   3357: aload 6
    //   3359: iload 21
    //   3361: aload 15
    //   3363: aastore
    //   3364: goto -153 -> 3211
    //   3367: aload 15
    //   3369: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   3372: astore_1
    //   3373: aload_1
    //   3374: arraylength
    //   3375: istore 26
    //   3377: iconst_0
    //   3378: istore 16
    //   3380: iload 16
    //   3382: iload 26
    //   3384: if_icmpge +62 -> 3446
    //   3387: aload_1
    //   3388: iload 16
    //   3390: aaload
    //   3391: astore 11
    //   3393: ldc_w 793
    //   3396: aload 11
    //   3398: getfield 1294	com/google/android/gms/internal/measurement/zzko:name	Ljava/lang/String;
    //   3401: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3404: ifeq +36 -> 3440
    //   3407: aload 5
    //   3409: instanceof 306
    //   3412: ifeq +16 -> 3428
    //   3415: aload 5
    //   3417: aload 11
    //   3419: getfield 1297	com/google/android/gms/internal/measurement/zzko:zzate	Ljava/lang/Long;
    //   3422: invokevirtual 1398	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   3425: ifne +9 -> 3434
    //   3428: iconst_0
    //   3429: istore 16
    //   3431: goto -135 -> 3296
    //   3434: iconst_1
    //   3435: istore 16
    //   3437: goto -141 -> 3296
    //   3440: iinc 16 1
    //   3443: goto -63 -> 3380
    //   3446: iconst_0
    //   3447: istore 16
    //   3449: goto -153 -> 3296
    //   3452: aload 9
    //   3454: aload 15
    //   3456: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   3459: invokeinterface 1373 2 0
    //   3464: checkcast 825	com/google/android/gms/internal/measurement/zzeq
    //   3467: astore_1
    //   3468: aload_1
    //   3469: ifnonnull +1303 -> 4772
    //   3472: aload_0
    //   3473: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   3476: aload 4
    //   3478: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   3481: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   3484: aload 15
    //   3486: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   3489: invokevirtual 816	com/google/android/gms/internal/measurement/zzei:zzf	(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzeq;
    //   3492: astore 11
    //   3494: aload 11
    //   3496: astore_1
    //   3497: aload 11
    //   3499: ifnonnull +64 -> 3563
    //   3502: aload_0
    //   3503: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   3506: invokevirtual 108	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   3509: ldc_w 1400
    //   3512: aload 4
    //   3514: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   3517: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   3520: aload 15
    //   3522: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   3525: invokevirtual 247	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3528: new 825	com/google/android/gms/internal/measurement/zzeq
    //   3531: astore_1
    //   3532: aload_1
    //   3533: aload 4
    //   3535: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   3538: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   3541: aload 15
    //   3543: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   3546: lconst_1
    //   3547: lconst_1
    //   3548: aload 15
    //   3550: getfield 1277	com/google/android/gms/internal/measurement/zzkn:zzatb	Ljava/lang/Long;
    //   3553: invokevirtual 354	java/lang/Long:longValue	()J
    //   3556: lconst_0
    //   3557: aconst_null
    //   3558: aconst_null
    //   3559: aconst_null
    //   3560: invokespecial 831	com/google/android/gms/internal/measurement/zzeq:<init>	(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
    //   3563: aload_0
    //   3564: invokevirtual 216	com/google/android/gms/internal/measurement/zzjr:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   3567: pop
    //   3568: aload 15
    //   3570: ldc_w 1402
    //   3573: invokestatic 1340	com/google/android/gms/internal/measurement/zzka:zzb	(Lcom/google/android/gms/internal/measurement/zzkn;Ljava/lang/String;)Ljava/lang/Object;
    //   3576: checkcast 306	java/lang/Long
    //   3579: astore 11
    //   3581: aload 11
    //   3583: ifnull +98 -> 3681
    //   3586: iconst_1
    //   3587: istore 27
    //   3589: iload 27
    //   3591: invokestatic 1405	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   3594: astore 5
    //   3596: iload 16
    //   3598: iconst_1
    //   3599: if_icmpne +88 -> 3687
    //   3602: iload 21
    //   3604: iconst_1
    //   3605: iadd
    //   3606: istore 26
    //   3608: aload 6
    //   3610: iload 21
    //   3612: aload 15
    //   3614: aastore
    //   3615: iload 26
    //   3617: istore 16
    //   3619: aload 5
    //   3621: invokevirtual 1390	java/lang/Boolean:booleanValue	()Z
    //   3624: ifeq -413 -> 3211
    //   3627: aload_1
    //   3628: getfield 1376	com/google/android/gms/internal/measurement/zzeq:zzafv	Ljava/lang/Long;
    //   3631: ifnonnull +21 -> 3652
    //   3634: aload_1
    //   3635: getfield 1379	com/google/android/gms/internal/measurement/zzeq:zzafw	Ljava/lang/Long;
    //   3638: ifnonnull +14 -> 3652
    //   3641: iload 26
    //   3643: istore 16
    //   3645: aload_1
    //   3646: getfield 1387	com/google/android/gms/internal/measurement/zzeq:zzafx	Ljava/lang/Boolean;
    //   3649: ifnull -438 -> 3211
    //   3652: aload_1
    //   3653: aconst_null
    //   3654: aconst_null
    //   3655: aconst_null
    //   3656: invokevirtual 1408	com/google/android/gms/internal/measurement/zzeq:zza	(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzeq;
    //   3659: astore_1
    //   3660: aload 9
    //   3662: aload 15
    //   3664: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   3667: aload_1
    //   3668: invokeinterface 589 3 0
    //   3673: pop
    //   3674: iload 26
    //   3676: istore 16
    //   3678: goto -467 -> 3211
    //   3681: iconst_0
    //   3682: istore 27
    //   3684: goto -95 -> 3589
    //   3687: aload 14
    //   3689: iload 16
    //   3691: invokevirtual 1414	java/security/SecureRandom:nextInt	(I)I
    //   3694: ifne +101 -> 3795
    //   3697: aload_0
    //   3698: invokevirtual 216	com/google/android/gms/internal/measurement/zzjr:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   3701: pop
    //   3702: aload 15
    //   3704: aload 15
    //   3706: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   3709: ldc_w 1381
    //   3712: iload 16
    //   3714: i2l
    //   3715: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3718: invokestatic 1384	com/google/android/gms/internal/measurement/zzka:zza	([Lcom/google/android/gms/internal/measurement/zzko;Ljava/lang/String;Ljava/lang/Object;)[Lcom/google/android/gms/internal/measurement/zzko;
    //   3721: putfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   3724: iload 21
    //   3726: iconst_1
    //   3727: iadd
    //   3728: istore 26
    //   3730: aload 6
    //   3732: iload 21
    //   3734: aload 15
    //   3736: aastore
    //   3737: aload_1
    //   3738: astore 11
    //   3740: aload 5
    //   3742: invokevirtual 1390	java/lang/Boolean:booleanValue	()Z
    //   3745: ifeq +17 -> 3762
    //   3748: aload_1
    //   3749: aconst_null
    //   3750: iload 16
    //   3752: i2l
    //   3753: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3756: aconst_null
    //   3757: invokevirtual 1408	com/google/android/gms/internal/measurement/zzeq:zza	(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzeq;
    //   3760: astore 11
    //   3762: aload 9
    //   3764: aload 15
    //   3766: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   3769: aload 11
    //   3771: aload 15
    //   3773: getfield 1277	com/google/android/gms/internal/measurement/zzkn:zzatb	Ljava/lang/Long;
    //   3776: invokevirtual 354	java/lang/Long:longValue	()J
    //   3779: invokevirtual 1417	com/google/android/gms/internal/measurement/zzeq:zzad	(J)Lcom/google/android/gms/internal/measurement/zzeq;
    //   3782: invokeinterface 589 3 0
    //   3787: pop
    //   3788: iload 26
    //   3790: istore 16
    //   3792: goto -581 -> 3211
    //   3795: aload_1
    //   3796: getfield 1420	com/google/android/gms/internal/measurement/zzeq:zzafu	J
    //   3799: lstore_2
    //   3800: aload 15
    //   3802: getfield 1277	com/google/android/gms/internal/measurement/zzkn:zzatb	Ljava/lang/Long;
    //   3805: invokevirtual 354	java/lang/Long:longValue	()J
    //   3808: lload_2
    //   3809: lsub
    //   3810: invokestatic 700	java/lang/Math:abs	(J)J
    //   3813: ldc2_w 1421
    //   3816: lcmp
    //   3817: iflt +128 -> 3945
    //   3820: aload_0
    //   3821: invokevirtual 216	com/google/android/gms/internal/measurement/zzjr:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   3824: pop
    //   3825: aload 15
    //   3827: aload 15
    //   3829: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   3832: ldc_w 1392
    //   3835: lconst_1
    //   3836: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3839: invokestatic 1384	com/google/android/gms/internal/measurement/zzka:zza	([Lcom/google/android/gms/internal/measurement/zzko;Ljava/lang/String;Ljava/lang/Object;)[Lcom/google/android/gms/internal/measurement/zzko;
    //   3842: putfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   3845: aload_0
    //   3846: invokevirtual 216	com/google/android/gms/internal/measurement/zzjr:zzgb	()Lcom/google/android/gms/internal/measurement/zzka;
    //   3849: pop
    //   3850: aload 15
    //   3852: aload 15
    //   3854: getfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   3857: ldc_w 1381
    //   3860: iload 16
    //   3862: i2l
    //   3863: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3866: invokestatic 1384	com/google/android/gms/internal/measurement/zzka:zza	([Lcom/google/android/gms/internal/measurement/zzko;Ljava/lang/String;Ljava/lang/Object;)[Lcom/google/android/gms/internal/measurement/zzko;
    //   3869: putfield 1289	com/google/android/gms/internal/measurement/zzkn:zzata	[Lcom/google/android/gms/internal/measurement/zzko;
    //   3872: iload 21
    //   3874: iconst_1
    //   3875: iadd
    //   3876: istore 26
    //   3878: aload 6
    //   3880: iload 21
    //   3882: aload 15
    //   3884: aastore
    //   3885: aload_1
    //   3886: astore 11
    //   3888: aload 5
    //   3890: invokevirtual 1390	java/lang/Boolean:booleanValue	()Z
    //   3893: ifeq +19 -> 3912
    //   3896: aload_1
    //   3897: aconst_null
    //   3898: iload 16
    //   3900: i2l
    //   3901: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3904: getstatic 638	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   3907: invokevirtual 1408	com/google/android/gms/internal/measurement/zzeq:zza	(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzeq;
    //   3910: astore 11
    //   3912: aload 9
    //   3914: aload 15
    //   3916: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   3919: aload 11
    //   3921: aload 15
    //   3923: getfield 1277	com/google/android/gms/internal/measurement/zzkn:zzatb	Ljava/lang/Long;
    //   3926: invokevirtual 354	java/lang/Long:longValue	()J
    //   3929: invokevirtual 1417	com/google/android/gms/internal/measurement/zzeq:zzad	(J)Lcom/google/android/gms/internal/measurement/zzeq;
    //   3932: invokeinterface 589 3 0
    //   3937: pop
    //   3938: iload 26
    //   3940: istore 16
    //   3942: goto -731 -> 3211
    //   3945: aload 5
    //   3947: invokevirtual 1390	java/lang/Boolean:booleanValue	()Z
    //   3950: ifeq +24 -> 3974
    //   3953: aload 9
    //   3955: aload 15
    //   3957: getfield 1206	com/google/android/gms/internal/measurement/zzkn:name	Ljava/lang/String;
    //   3960: aload_1
    //   3961: aload 11
    //   3963: aconst_null
    //   3964: aconst_null
    //   3965: invokevirtual 1408	com/google/android/gms/internal/measurement/zzeq:zza	(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzeq;
    //   3968: invokeinterface 589 3 0
    //   3973: pop
    //   3974: iload 21
    //   3976: istore 16
    //   3978: goto -767 -> 3211
    //   3981: iload 21
    //   3983: aload 12
    //   3985: getfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   3988: arraylength
    //   3989: if_icmpge +18 -> 4007
    //   3992: aload 12
    //   3994: aload 6
    //   3996: iload 21
    //   3998: invokestatic 1305	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   4001: checkcast 1343	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   4004: putfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   4007: aload 9
    //   4009: invokeinterface 1426 1 0
    //   4014: invokeinterface 1429 1 0
    //   4019: astore_1
    //   4020: aload_1
    //   4021: invokeinterface 1123 1 0
    //   4026: ifeq +34 -> 4060
    //   4029: aload_1
    //   4030: invokeinterface 1126 1 0
    //   4035: checkcast 1431	java/util/Map$Entry
    //   4038: astore 11
    //   4040: aload_0
    //   4041: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   4044: aload 11
    //   4046: invokeinterface 1434 1 0
    //   4051: checkcast 825	com/google/android/gms/internal/measurement/zzeq
    //   4054: invokevirtual 834	com/google/android/gms/internal/measurement/zzei:zza	(Lcom/google/android/gms/internal/measurement/zzeq;)V
    //   4057: goto -37 -> 4020
    //   4060: aload 12
    //   4062: ldc2_w 1435
    //   4065: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4068: putfield 955	com/google/android/gms/internal/measurement/zzkq:zzatl	Ljava/lang/Long;
    //   4071: aload 12
    //   4073: ldc2_w 1437
    //   4076: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4079: putfield 958	com/google/android/gms/internal/measurement/zzkq:zzatm	Ljava/lang/Long;
    //   4082: iconst_0
    //   4083: istore 16
    //   4085: iload 16
    //   4087: aload 12
    //   4089: getfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   4092: arraylength
    //   4093: if_icmpge +74 -> 4167
    //   4096: aload 12
    //   4098: getfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   4101: iload 16
    //   4103: aaload
    //   4104: astore_1
    //   4105: aload_1
    //   4106: getfield 1277	com/google/android/gms/internal/measurement/zzkn:zzatb	Ljava/lang/Long;
    //   4109: invokevirtual 354	java/lang/Long:longValue	()J
    //   4112: aload 12
    //   4114: getfield 955	com/google/android/gms/internal/measurement/zzkq:zzatl	Ljava/lang/Long;
    //   4117: invokevirtual 354	java/lang/Long:longValue	()J
    //   4120: lcmp
    //   4121: ifge +12 -> 4133
    //   4124: aload 12
    //   4126: aload_1
    //   4127: getfield 1277	com/google/android/gms/internal/measurement/zzkn:zzatb	Ljava/lang/Long;
    //   4130: putfield 955	com/google/android/gms/internal/measurement/zzkq:zzatl	Ljava/lang/Long;
    //   4133: aload_1
    //   4134: getfield 1277	com/google/android/gms/internal/measurement/zzkn:zzatb	Ljava/lang/Long;
    //   4137: invokevirtual 354	java/lang/Long:longValue	()J
    //   4140: aload 12
    //   4142: getfield 958	com/google/android/gms/internal/measurement/zzkq:zzatm	Ljava/lang/Long;
    //   4145: invokevirtual 354	java/lang/Long:longValue	()J
    //   4148: lcmp
    //   4149: ifle +12 -> 4161
    //   4152: aload 12
    //   4154: aload_1
    //   4155: getfield 1277	com/google/android/gms/internal/measurement/zzkn:zzatb	Ljava/lang/Long;
    //   4158: putfield 958	com/google/android/gms/internal/measurement/zzkq:zzatm	Ljava/lang/Long;
    //   4161: iinc 16 1
    //   4164: goto -79 -> 4085
    //   4167: aload 4
    //   4169: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   4172: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   4175: astore 11
    //   4177: aload_0
    //   4178: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   4181: aload 11
    //   4183: invokevirtual 686	com/google/android/gms/internal/measurement/zzei:zzbc	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;
    //   4186: astore 14
    //   4188: aload 14
    //   4190: ifnonnull +195 -> 4385
    //   4193: aload_0
    //   4194: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   4197: invokevirtual 80	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   4200: ldc_w 1440
    //   4203: aload 4
    //   4205: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   4208: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   4211: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   4214: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   4217: aload 12
    //   4219: getfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   4222: arraylength
    //   4223: ifle +67 -> 4290
    //   4226: aload_0
    //   4227: invokespecial 569	com/google/android/gms/internal/measurement/zzjr:zzkm	()Lcom/google/android/gms/internal/measurement/zzgf;
    //   4230: aload 4
    //   4232: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   4235: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   4238: invokevirtual 575	com/google/android/gms/internal/measurement/zzgf:zzbu	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzkk;
    //   4241: astore_1
    //   4242: aload_1
    //   4243: ifnull +10 -> 4253
    //   4246: aload_1
    //   4247: getfield 1445	com/google/android/gms/internal/measurement/zzkk:zzasp	Ljava/lang/Long;
    //   4250: ifnonnull +302 -> 4552
    //   4253: aload 4
    //   4255: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   4258: getfield 876	com/google/android/gms/internal/measurement/zzkq:zzadm	Ljava/lang/String;
    //   4261: invokestatic 183	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   4264: ifeq +261 -> 4525
    //   4267: aload 12
    //   4269: ldc2_w 1166
    //   4272: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4275: putfield 1448	com/google/android/gms/internal/measurement/zzkq:zzauf	Ljava/lang/Long;
    //   4278: aload_0
    //   4279: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   4282: aload 12
    //   4284: iload 18
    //   4286: invokevirtual 1451	com/google/android/gms/internal/measurement/zzei:zza	(Lcom/google/android/gms/internal/measurement/zzkq;Z)Z
    //   4289: pop
    //   4290: aload_0
    //   4291: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   4294: astore_1
    //   4295: aload 4
    //   4297: getfield 1454	com/google/android/gms/internal/measurement/zzjv:zzaqw	Ljava/util/List;
    //   4300: astore 12
    //   4302: aload 12
    //   4304: invokestatic 604	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4307: pop
    //   4308: aload_1
    //   4309: invokevirtual 417	com/google/android/gms/internal/measurement/zzhg:zzab	()V
    //   4312: aload_1
    //   4313: invokevirtual 420	com/google/android/gms/internal/measurement/zzjq:zzch	()V
    //   4316: new 269	java/lang/StringBuilder
    //   4319: astore 14
    //   4321: aload 14
    //   4323: ldc_w 1456
    //   4326: invokespecial 1457	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4329: iconst_0
    //   4330: istore 16
    //   4332: iload 16
    //   4334: aload 12
    //   4336: invokeinterface 1052 1 0
    //   4341: if_icmpge +223 -> 4564
    //   4344: iload 16
    //   4346: ifeq +12 -> 4358
    //   4349: aload 14
    //   4351: ldc_w 1459
    //   4354: invokevirtual 280	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4357: pop
    //   4358: aload 14
    //   4360: aload 12
    //   4362: iload 16
    //   4364: invokeinterface 1062 2 0
    //   4369: checkcast 306	java/lang/Long
    //   4372: invokevirtual 354	java/lang/Long:longValue	()J
    //   4375: invokevirtual 1462	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   4378: pop
    //   4379: iinc 16 1
    //   4382: goto -50 -> 4332
    //   4385: aload 12
    //   4387: getfield 1202	com/google/android/gms/internal/measurement/zzkq:zzati	[Lcom/google/android/gms/internal/measurement/zzkn;
    //   4390: arraylength
    //   4391: ifle -174 -> 4217
    //   4394: aload 14
    //   4396: invokevirtual 1465	com/google/android/gms/internal/measurement/zzdy:zzgl	()J
    //   4399: lstore_2
    //   4400: lload_2
    //   4401: lconst_0
    //   4402: lcmp
    //   4403: ifeq +112 -> 4515
    //   4406: lload_2
    //   4407: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4410: astore_1
    //   4411: aload 12
    //   4413: aload_1
    //   4414: putfield 1468	com/google/android/gms/internal/measurement/zzkq:zzato	Ljava/lang/Long;
    //   4417: aload 14
    //   4419: invokevirtual 1471	com/google/android/gms/internal/measurement/zzdy:zzgk	()J
    //   4422: lstore 7
    //   4424: lload 7
    //   4426: lconst_0
    //   4427: lcmp
    //   4428: ifne +338 -> 4766
    //   4431: lload_2
    //   4432: lconst_0
    //   4433: lcmp
    //   4434: ifeq +86 -> 4520
    //   4437: lload_2
    //   4438: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4441: astore_1
    //   4442: aload 12
    //   4444: aload_1
    //   4445: putfield 1474	com/google/android/gms/internal/measurement/zzkq:zzatn	Ljava/lang/Long;
    //   4448: aload 14
    //   4450: invokevirtual 1477	com/google/android/gms/internal/measurement/zzdy:zzgt	()V
    //   4453: aload 12
    //   4455: aload 14
    //   4457: invokevirtual 1480	com/google/android/gms/internal/measurement/zzdy:zzgq	()J
    //   4460: l2i
    //   4461: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   4464: putfield 1483	com/google/android/gms/internal/measurement/zzkq:zzaty	Ljava/lang/Integer;
    //   4467: aload 14
    //   4469: aload 12
    //   4471: getfield 955	com/google/android/gms/internal/measurement/zzkq:zzatl	Ljava/lang/Long;
    //   4474: invokevirtual 354	java/lang/Long:longValue	()J
    //   4477: invokevirtual 1012	com/google/android/gms/internal/measurement/zzdy:zzm	(J)V
    //   4480: aload 14
    //   4482: aload 12
    //   4484: getfield 958	com/google/android/gms/internal/measurement/zzkq:zzatm	Ljava/lang/Long;
    //   4487: invokevirtual 354	java/lang/Long:longValue	()J
    //   4490: invokevirtual 1014	com/google/android/gms/internal/measurement/zzdy:zzn	(J)V
    //   4493: aload 12
    //   4495: aload 14
    //   4497: invokevirtual 1486	com/google/android/gms/internal/measurement/zzdy:zzhb	()Ljava/lang/String;
    //   4500: putfield 1489	com/google/android/gms/internal/measurement/zzkq:zzaek	Ljava/lang/String;
    //   4503: aload_0
    //   4504: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   4507: aload 14
    //   4509: invokevirtual 1037	com/google/android/gms/internal/measurement/zzei:zza	(Lcom/google/android/gms/internal/measurement/zzdy;)V
    //   4512: goto -295 -> 4217
    //   4515: aconst_null
    //   4516: astore_1
    //   4517: goto -106 -> 4411
    //   4520: aconst_null
    //   4521: astore_1
    //   4522: goto -80 -> 4442
    //   4525: aload_0
    //   4526: invokevirtual 74	com/google/android/gms/internal/measurement/zzjr:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   4529: invokevirtual 108	com/google/android/gms/internal/measurement/zzfg:zzip	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   4532: ldc_w 1491
    //   4535: aload 4
    //   4537: getfield 1196	com/google/android/gms/internal/measurement/zzjv:zzaqv	Lcom/google/android/gms/internal/measurement/zzkq;
    //   4540: getfield 851	com/google/android/gms/internal/measurement/zzkq:zzti	Ljava/lang/String;
    //   4543: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   4546: invokevirtual 120	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   4549: goto -271 -> 4278
    //   4552: aload 12
    //   4554: aload_1
    //   4555: getfield 1445	com/google/android/gms/internal/measurement/zzkk:zzasp	Ljava/lang/Long;
    //   4558: putfield 1448	com/google/android/gms/internal/measurement/zzkq:zzauf	Ljava/lang/Long;
    //   4561: goto -283 -> 4278
    //   4564: aload 14
    //   4566: ldc_w 1493
    //   4569: invokevirtual 280	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4572: pop
    //   4573: aload_1
    //   4574: invokevirtual 424	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4577: ldc_w 1260
    //   4580: aload 14
    //   4582: invokevirtual 281	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4585: aconst_null
    //   4586: invokevirtual 1497	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   4589: istore 16
    //   4591: iload 16
    //   4593: aload 12
    //   4595: invokeinterface 1052 1 0
    //   4600: if_icmpeq +31 -> 4631
    //   4603: aload_1
    //   4604: invokevirtual 478	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   4607: invokevirtual 80	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   4610: ldc_w 1499
    //   4613: iload 16
    //   4615: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   4618: aload 12
    //   4620: invokeinterface 1052 1 0
    //   4625: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   4628: invokevirtual 247	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4631: aload_0
    //   4632: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   4635: astore_1
    //   4636: aload_1
    //   4637: invokevirtual 424	com/google/android/gms/internal/measurement/zzei:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4640: astore 12
    //   4642: aload 12
    //   4644: ldc_w 1501
    //   4647: iconst_2
    //   4648: anewarray 237	java/lang/String
    //   4651: dup
    //   4652: iconst_0
    //   4653: aload 11
    //   4655: aastore
    //   4656: dup
    //   4657: iconst_1
    //   4658: aload 11
    //   4660: aastore
    //   4661: invokevirtual 435	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   4664: aload_0
    //   4665: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   4668: invokevirtual 729	com/google/android/gms/internal/measurement/zzei:setTransactionSuccessful	()V
    //   4671: aload_0
    //   4672: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   4675: invokevirtual 732	com/google/android/gms/internal/measurement/zzei:endTransaction	()V
    //   4678: iconst_1
    //   4679: istore 18
    //   4681: ldc_w 1158
    //   4684: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   4687: iload 18
    //   4689: ireturn
    //   4690: astore 12
    //   4692: aload_1
    //   4693: invokevirtual 478	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   4696: invokevirtual 80	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   4699: ldc_w 1503
    //   4702: aload 11
    //   4704: invokestatic 233	com/google/android/gms/internal/measurement/zzfg:zzbm	(Ljava/lang/String;)Ljava/lang/Object;
    //   4707: aload 12
    //   4709: invokevirtual 247	com/google/android/gms/internal/measurement/zzfi:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4712: goto -48 -> 4664
    //   4715: aload_0
    //   4716: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   4719: invokevirtual 729	com/google/android/gms/internal/measurement/zzei:setTransactionSuccessful	()V
    //   4722: aload_0
    //   4723: invokevirtual 388	com/google/android/gms/internal/measurement/zzjr:zzix	()Lcom/google/android/gms/internal/measurement/zzei;
    //   4726: invokevirtual 732	com/google/android/gms/internal/measurement/zzei:endTransaction	()V
    //   4729: iconst_0
    //   4730: istore 18
    //   4732: ldc_w 1158
    //   4735: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   4738: goto -51 -> 4687
    //   4741: astore 11
    //   4743: goto -3050 -> 1693
    //   4746: astore 14
    //   4748: goto -3290 -> 1458
    //   4751: astore 14
    //   4753: aload 11
    //   4755: astore_1
    //   4756: aload 12
    //   4758: astore 11
    //   4760: aload_1
    //   4761: astore 12
    //   4763: goto -3305 -> 1458
    //   4766: lload 7
    //   4768: lstore_2
    //   4769: goto -338 -> 4431
    //   4772: goto -1209 -> 3563
    //   4775: iconst_1
    //   4776: istore 16
    //   4778: goto -1455 -> 3323
    //   4781: goto -4236 -> 545
    //   4784: goto -2283 -> 2501
    //   4787: goto -2415 -> 2372
    //   4790: iconst_1
    //   4791: istore 27
    //   4793: goto -2574 -> 2219
    //   4796: goto -2950 -> 1846
    //
    // Exception table:
    //   from	to	target	type
    //   13	31	762	finally
    //   34	56	762	finally
    //   284	291	762	finally
    //   291	312	762	finally
    //   323	348	762	finally
    //   353	367	762	finally
    //   370	497	762	finally
    //   505	545	762	finally
    //   752	759	762	finally
    //   960	967	762	finally
    //   1354	1361	762	finally
    //   1399	1406	762	finally
    //   1487	1494	762	finally
    //   1623	1630	762	finally
    //   1681	1688	762	finally
    //   1697	1703	762	finally
    //   1703	1712	762	finally
    //   1724	1746	762	finally
    //   1751	1756	762	finally
    //   1760	1771	762	finally
    //   1777	1794	762	finally
    //   1794	1804	762	finally
    //   1820	1843	762	finally
    //   1852	1875	762	finally
    //   1891	1977	762	finally
    //   1982	2067	762	finally
    //   2067	2114	762	finally
    //   2121	2164	762	finally
    //   2169	2182	762	finally
    //   2182	2209	762	finally
    //   2209	2215	762	finally
    //   2223	2234	762	finally
    //   2247	2321	762	finally
    //   2326	2338	762	finally
    //   2355	2369	762	finally
    //   2384	2398	762	finally
    //   2413	2437	762	finally
    //   2446	2477	762	finally
    //   2477	2501	762	finally
    //   2501	2507	762	finally
    //   2530	2547	762	finally
    //   2554	2578	762	finally
    //   2589	2606	762	finally
    //   2610	2634	762	finally
    //   2637	2644	762	finally
    //   2647	2680	762	finally
    //   2685	2701	762	finally
    //   2705	2712	762	finally
    //   2712	2744	762	finally
    //   2744	2791	762	finally
    //   2801	2842	762	finally
    //   2850	2893	762	finally
    //   2899	2925	762	finally
    //   2925	2988	762	finally
    //   2991	3012	762	finally
    //   3029	3075	762	finally
    //   3083	3112	762	finally
    //   3112	3156	762	finally
    //   3156	3198	762	finally
    //   3221	3264	762	finally
    //   3273	3288	762	finally
    //   3301	3323	762	finally
    //   3328	3351	762	finally
    //   3367	3377	762	finally
    //   3393	3428	762	finally
    //   3452	3468	762	finally
    //   3472	3494	762	finally
    //   3502	3563	762	finally
    //   3563	3581	762	finally
    //   3589	3596	762	finally
    //   3619	3641	762	finally
    //   3645	3652	762	finally
    //   3652	3674	762	finally
    //   3687	3724	762	finally
    //   3740	3762	762	finally
    //   3762	3788	762	finally
    //   3795	3872	762	finally
    //   3888	3912	762	finally
    //   3912	3938	762	finally
    //   3945	3974	762	finally
    //   3981	4007	762	finally
    //   4007	4020	762	finally
    //   4020	4057	762	finally
    //   4060	4082	762	finally
    //   4085	4133	762	finally
    //   4133	4161	762	finally
    //   4167	4188	762	finally
    //   4193	4217	762	finally
    //   4217	4242	762	finally
    //   4246	4253	762	finally
    //   4253	4278	762	finally
    //   4278	4290	762	finally
    //   4290	4329	762	finally
    //   4332	4344	762	finally
    //   4349	4358	762	finally
    //   4358	4379	762	finally
    //   4385	4400	762	finally
    //   4406	4411	762	finally
    //   4411	4424	762	finally
    //   4437	4442	762	finally
    //   4442	4512	762	finally
    //   4525	4549	762	finally
    //   4552	4561	762	finally
    //   4564	4631	762	finally
    //   4631	4642	762	finally
    //   4642	4664	762	finally
    //   4664	4671	762	finally
    //   4692	4712	762	finally
    //   4715	4722	762	finally
    //   1115	1123	1364	java/io/IOException
    //   659	704	1446	android/database/sqlite/SQLiteException
    //   711	721	1446	android/database/sqlite/SQLiteException
    //   728	747	1446	android/database/sqlite/SQLiteException
    //   1056	1066	1446	android/database/sqlite/SQLiteException
    //   1073	1084	1446	android/database/sqlite/SQLiteException
    //   1091	1096	1446	android/database/sqlite/SQLiteException
    //   1103	1108	1446	android/database/sqlite/SQLiteException
    //   1115	1123	1446	android/database/sqlite/SQLiteException
    //   1130	1140	1446	android/database/sqlite/SQLiteException
    //   1147	1166	1446	android/database/sqlite/SQLiteException
    //   1173	1180	1446	android/database/sqlite/SQLiteException
    //   1187	1196	1446	android/database/sqlite/SQLiteException
    //   1217	1223	1446	android/database/sqlite/SQLiteException
    //   1242	1251	1446	android/database/sqlite/SQLiteException
    //   1262	1310	1446	android/database/sqlite/SQLiteException
    //   1373	1394	1446	android/database/sqlite/SQLiteException
    //   1421	1427	1446	android/database/sqlite/SQLiteException
    //   1555	1563	1633	java/io/IOException
    //   73	80	1691	finally
    //   91	98	1691	finally
    //   118	139	1691	finally
    //   164	174	1691	finally
    //   185	190	1691	finally
    //   201	212	1691	finally
    //   223	254	1691	finally
    //   265	274	1691	finally
    //   562	575	1691	finally
    //   596	606	1691	finally
    //   617	627	1691	finally
    //   638	645	1691	finally
    //   798	816	1691	finally
    //   841	851	1691	finally
    //   862	867	1691	finally
    //   878	888	1691	finally
    //   899	930	1691	finally
    //   941	950	1691	finally
    //   981	991	1691	finally
    //   1012	1022	1691	finally
    //   1033	1040	1691	finally
    //   1317	1327	1691	finally
    //   1330	1349	1691	finally
    //   1461	1482	1691	finally
    //   1500	1509	1691	finally
    //   1512	1522	1691	finally
    //   1525	1536	1691	finally
    //   1539	1544	1691	finally
    //   1547	1552	1691	finally
    //   1555	1563	1691	finally
    //   1566	1579	1691	finally
    //   1582	1598	1691	finally
    //   1601	1613	1691	finally
    //   1638	1659	1691	finally
    //   1662	1671	1691	finally
    //   4642	4664	4690	android/database/sqlite/SQLiteException
    //   659	704	4741	finally
    //   711	721	4741	finally
    //   728	747	4741	finally
    //   1056	1066	4741	finally
    //   1073	1084	4741	finally
    //   1091	1096	4741	finally
    //   1103	1108	4741	finally
    //   1115	1123	4741	finally
    //   1130	1140	4741	finally
    //   1147	1166	4741	finally
    //   1173	1180	4741	finally
    //   1187	1196	4741	finally
    //   1217	1223	4741	finally
    //   1242	1251	4741	finally
    //   1262	1310	4741	finally
    //   1373	1394	4741	finally
    //   1421	1427	4741	finally
    //   73	80	4746	android/database/sqlite/SQLiteException
    //   91	98	4746	android/database/sqlite/SQLiteException
    //   118	139	4746	android/database/sqlite/SQLiteException
    //   164	174	4746	android/database/sqlite/SQLiteException
    //   185	190	4746	android/database/sqlite/SQLiteException
    //   201	212	4746	android/database/sqlite/SQLiteException
    //   223	254	4746	android/database/sqlite/SQLiteException
    //   265	274	4746	android/database/sqlite/SQLiteException
    //   562	575	4746	android/database/sqlite/SQLiteException
    //   596	606	4746	android/database/sqlite/SQLiteException
    //   617	627	4746	android/database/sqlite/SQLiteException
    //   638	645	4746	android/database/sqlite/SQLiteException
    //   798	816	4746	android/database/sqlite/SQLiteException
    //   841	851	4746	android/database/sqlite/SQLiteException
    //   862	867	4746	android/database/sqlite/SQLiteException
    //   878	888	4746	android/database/sqlite/SQLiteException
    //   899	930	4746	android/database/sqlite/SQLiteException
    //   941	950	4746	android/database/sqlite/SQLiteException
    //   981	991	4746	android/database/sqlite/SQLiteException
    //   1012	1022	4746	android/database/sqlite/SQLiteException
    //   1033	1040	4746	android/database/sqlite/SQLiteException
    //   1317	1327	4751	android/database/sqlite/SQLiteException
    //   1330	1349	4751	android/database/sqlite/SQLiteException
    //   1500	1509	4751	android/database/sqlite/SQLiteException
    //   1512	1522	4751	android/database/sqlite/SQLiteException
    //   1525	1536	4751	android/database/sqlite/SQLiteException
    //   1539	1544	4751	android/database/sqlite/SQLiteException
    //   1547	1552	4751	android/database/sqlite/SQLiteException
    //   1555	1563	4751	android/database/sqlite/SQLiteException
    //   1566	1579	4751	android/database/sqlite/SQLiteException
    //   1582	1598	4751	android/database/sqlite/SQLiteException
    //   1601	1613	4751	android/database/sqlite/SQLiteException
    //   1638	1659	4751	android/database/sqlite/SQLiteException
    //   1662	1671	4751	android/database/sqlite/SQLiteException
  }

  private final zzdy zzg(zzdz paramzzdz)
  {
    int i = 1;
    AppMethodBeat.i(69481);
    zzab();
    zzkq();
    Preconditions.checkNotNull(paramzzdz);
    Preconditions.checkNotEmpty(paramzzdz.packageName);
    zzdy localzzdy1 = zzix().zzbc(paramzzdz.packageName);
    String str = zzgf().zzbp(paramzzdz.packageName);
    int j = 0;
    zzdy localzzdy2;
    int m;
    if (localzzdy1 == null)
    {
      localzzdy2 = new zzdy(this.zzacw, paramzzdz.packageName);
      localzzdy2.zzal(this.zzacw.zzfv().zzii());
      localzzdy2.zzan(str);
      j = 1;
      int k = j;
      if (!TextUtils.isEmpty(paramzzdz.zzadm))
      {
        k = j;
        if (!paramzzdz.zzadm.equals(localzzdy2.getGmpAppId()))
        {
          localzzdy2.zzam(paramzzdz.zzadm);
          k = 1;
        }
      }
      m = k;
      if (!TextUtils.isEmpty(paramzzdz.zzado))
      {
        m = k;
        if (!paramzzdz.zzado.equals(localzzdy2.zzgj()))
        {
          localzzdy2.zzao(paramzzdz.zzado);
          m = 1;
        }
      }
      j = m;
      if (paramzzdz.zzadu != 0L)
      {
        j = m;
        if (paramzzdz.zzadu != localzzdy2.zzgo())
        {
          localzzdy2.zzp(paramzzdz.zzadu);
          j = 1;
        }
      }
      m = j;
      if (!TextUtils.isEmpty(paramzzdz.zzth))
      {
        m = j;
        if (!paramzzdz.zzth.equals(localzzdy2.zzag()))
        {
          localzzdy2.setAppVersion(paramzzdz.zzth);
          m = 1;
        }
      }
      if (paramzzdz.zzads != localzzdy2.zzgm())
      {
        localzzdy2.zzo(paramzzdz.zzads);
        m = 1;
      }
      j = m;
      if (paramzzdz.zzadt != null)
      {
        j = m;
        if (!paramzzdz.zzadt.equals(localzzdy2.zzgn()))
        {
          localzzdy2.zzap(paramzzdz.zzadt);
          j = 1;
        }
      }
      if (paramzzdz.zzadv != localzzdy2.zzgp())
      {
        localzzdy2.zzq(paramzzdz.zzadv);
        j = 1;
      }
      if (paramzzdz.zzadw != localzzdy2.isMeasurementEnabled())
      {
        localzzdy2.setMeasurementEnabled(paramzzdz.zzadw);
        j = 1;
      }
      m = j;
      if (!TextUtils.isEmpty(paramzzdz.zzaek))
      {
        m = j;
        if (!paramzzdz.zzaek.equals(localzzdy2.zzha()))
        {
          localzzdy2.zzaq(paramzzdz.zzaek);
          m = 1;
        }
      }
      if (paramzzdz.zzadx != localzzdy2.zzhc())
      {
        localzzdy2.zzaa(paramzzdz.zzadx);
        m = 1;
      }
      if (paramzzdz.zzady != localzzdy2.zzhd())
      {
        localzzdy2.zzd(paramzzdz.zzady);
        m = 1;
      }
      if (paramzzdz.zzadz == localzzdy2.zzhe())
        break label581;
      localzzdy2.zze(paramzzdz.zzadz);
      m = i;
    }
    label581: 
    while (true)
    {
      if (m != 0)
        zzix().zza(localzzdy2);
      AppMethodBeat.o(69481);
      return localzzdy2;
      localzzdy2 = localzzdy1;
      if (str.equals(localzzdy1.zzgi()))
        break;
      localzzdy1.zzan(str);
      localzzdy1.zzal(this.zzacw.zzfv().zzii());
      j = 1;
      localzzdy2 = localzzdy1;
      break;
    }
  }

  private final zzgf zzkm()
  {
    AppMethodBeat.i(69437);
    zza(this.zzaqa);
    zzgf localzzgf = this.zzaqa;
    AppMethodBeat.o(69437);
    return localzzgf;
  }

  private final zzfp zzko()
  {
    AppMethodBeat.i(69440);
    if (this.zzaqd == null)
    {
      localObject = new IllegalStateException("Network broadcast receiver not created");
      AppMethodBeat.o(69440);
      throw ((Throwable)localObject);
    }
    Object localObject = this.zzaqd;
    AppMethodBeat.o(69440);
    return localObject;
  }

  private final zzjn zzkp()
  {
    AppMethodBeat.i(69441);
    zza(this.zzaqe);
    zzjn localzzjn = this.zzaqe;
    AppMethodBeat.o(69441);
    return localzzjn;
  }

  private final long zzkr()
  {
    AppMethodBeat.i(69452);
    long l1 = zzbt().currentTimeMillis();
    zzfr localzzfr = zzgf();
    localzzfr.zzch();
    localzzfr.zzab();
    long l2 = localzzfr.zzajy.get();
    long l3 = l2;
    if (l2 == 0L)
    {
      l3 = 1L + localzzfr.zzgb().zzlc().nextInt(86400000);
      localzzfr.zzajy.set(l3);
    }
    l3 = (l3 + l1) / 1000L / 60L / 60L / 24L;
    AppMethodBeat.o(69452);
    return l3;
  }

  private final boolean zzkt()
  {
    AppMethodBeat.i(69461);
    zzab();
    zzkq();
    boolean bool;
    if ((zzix().zzhs()) || (!TextUtils.isEmpty(zzix().zzhn())))
    {
      bool = true;
      AppMethodBeat.o(69461);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(69461);
    }
  }

  private final void zzku()
  {
    AppMethodBeat.i(69464);
    zzab();
    zzkq();
    if (!zzky())
      AppMethodBeat.o(69464);
    long l1;
    while (true)
    {
      return;
      if (this.zzaqh > 0L)
      {
        l1 = 3600000L - Math.abs(zzbt().elapsedRealtime() - this.zzaqh);
        if (l1 > 0L)
        {
          zzge().zzit().zzg("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(l1));
          zzko().unregister();
          zzkp().cancel();
          AppMethodBeat.o(69464);
        }
        else
        {
          this.zzaqh = 0L;
        }
      }
      else
      {
        if ((this.zzacw.zzjv()) && (zzkt()))
          break;
        zzge().zzit().log("Nothing to upload or uploading impossible");
        zzko().unregister();
        zzkp().cancel();
        AppMethodBeat.o(69464);
      }
    }
    long l2 = zzbt().currentTimeMillis();
    long l3 = Math.max(0L, ((Long)zzew.zzahi.get()).longValue());
    int i;
    if ((zzix().zzht()) || (zzix().zzho()))
    {
      i = 1;
      label214: if (i == 0)
        break label384;
      String str = zzgg().zzhj();
      if ((TextUtils.isEmpty(str)) || (".none.".equals(str)))
        break label364;
      l1 = Math.max(0L, ((Long)zzew.zzahd.get()).longValue());
    }
    while (true)
    {
      l4 = zzgf().zzaju.get();
      l5 = zzgf().zzajv.get();
      l6 = Math.max(zzix().zzhq(), zzix().zzhr());
      if (l6 != 0L)
        break label404;
      l1 = 0L;
      label316: if (l1 != 0L)
        break label591;
      zzge().zzit().log("Next upload time is 0");
      zzko().unregister();
      zzkp().cancel();
      AppMethodBeat.o(69464);
      break;
      i = 0;
      break label214;
      label364: l1 = Math.max(0L, ((Long)zzew.zzahc.get()).longValue());
      continue;
      label384: l1 = Math.max(0L, ((Long)zzew.zzahb.get()).longValue());
    }
    label404: long l6 = l2 - Math.abs(l6 - l2);
    long l4 = Math.abs(l4 - l2);
    long l5 = l2 - Math.abs(l5 - l2);
    l4 = Math.max(l2 - l4, l5);
    l2 = l6 + l3;
    l3 = l2;
    if (i != 0)
    {
      l3 = l2;
      if (l4 > 0L)
        l3 = Math.min(l6, l4) + l1;
    }
    if (!zzgb().zza(l4, l1));
    for (l1 += l4; ; l1 = l3)
    {
      if ((l5 != 0L) && (l5 >= l6))
      {
        for (i = 0; ; i++)
        {
          if (i >= Math.min(20, Math.max(0, ((Integer)zzew.zzahk.get()).intValue())))
            break label583;
          l1 = Math.max(0L, ((Long)zzew.zzahj.get()).longValue()) * (1L << i) + l1;
          if (l1 > l5)
            break;
        }
        label583: l1 = 0L;
        break label316;
      }
      break label316;
      label591: if (!zzkn().zzex())
      {
        zzge().zzit().log("No network");
        zzko().zzeu();
        zzkp().cancel();
        AppMethodBeat.o(69464);
        break;
      }
      l3 = zzgf().zzajw.get();
      l2 = Math.max(0L, ((Long)zzew.zzagz.get()).longValue());
      if (!zzgb().zza(l3, l2))
        l1 = Math.max(l1, l2 + l3);
      while (true)
      {
        zzko().unregister();
        l3 = l1 - zzbt().currentTimeMillis();
        l1 = l3;
        if (l3 <= 0L)
        {
          l1 = Math.max(0L, ((Long)zzew.zzahe.get()).longValue());
          zzgf().zzaju.set(zzbt().currentTimeMillis());
        }
        zzge().zzit().zzg("Upload scheduled in approximately ms", Long.valueOf(l1));
        zzkp().zzh(l1);
        AppMethodBeat.o(69464);
        break;
      }
    }
  }

  private final void zzkv()
  {
    AppMethodBeat.i(69466);
    zzab();
    if ((this.zzaql) || (this.zzaqm) || (this.zzaqn))
    {
      zzge().zzit().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzaql), Boolean.valueOf(this.zzaqm), Boolean.valueOf(this.zzaqn));
      AppMethodBeat.o(69466);
    }
    while (true)
    {
      return;
      zzge().zzit().log("Stopping uploading service(s)");
      if (this.zzaqi == null)
      {
        AppMethodBeat.o(69466);
      }
      else
      {
        Iterator localIterator = this.zzaqi.iterator();
        while (localIterator.hasNext())
          ((Runnable)localIterator.next()).run();
        this.zzaqi.clear();
        AppMethodBeat.o(69466);
      }
    }
  }

  @VisibleForTesting
  private final boolean zzkw()
  {
    AppMethodBeat.i(69468);
    zzab();
    File localFile = new File(getContext().getFilesDir(), "google_app_measurement.db");
    try
    {
      RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
      localRandomAccessFile.<init>(localFile, "rw");
      this.zzaqp = localRandomAccessFile.getChannel();
      this.zzaqo = this.zzaqp.tryLock();
      boolean bool;
      if (this.zzaqo != null)
      {
        zzge().zzit().log("Storage concurrent access okay");
        bool = true;
        AppMethodBeat.o(69468);
      }
      while (true)
      {
        return bool;
        zzge().zzim().log("Storage concurrent data access panic");
        bool = false;
        AppMethodBeat.o(69468);
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
        zzge().zzim().zzg("Failed to acquire storage lock", localFileNotFoundException);
    }
    catch (IOException localIOException)
    {
      while (true)
        zzge().zzim().zzg("Failed to access storage lock file", localIOException);
    }
  }

  private final boolean zzky()
  {
    AppMethodBeat.i(69472);
    zzab();
    zzkq();
    boolean bool;
    if (this.zzaqg)
    {
      bool = true;
      AppMethodBeat.o(69472);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(69472);
    }
  }

  public Context getContext()
  {
    AppMethodBeat.i(69444);
    Context localContext = this.zzacw.getContext();
    AppMethodBeat.o(69444);
    return localContext;
  }

  protected void start()
  {
    AppMethodBeat.i(69432);
    zzab();
    zzix().zzhp();
    if (zzgf().zzaju.get() == 0L)
      zzgf().zzaju.set(zzbt().currentTimeMillis());
    zzku();
    AppMethodBeat.o(69432);
  }

  @VisibleForTesting
  protected final void zza(int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(69460);
    zzab();
    zzkq();
    Object localObject = paramArrayOfByte;
    if (paramArrayOfByte == null);
    while (true)
    {
      try
      {
        localObject = new byte[0];
        paramArrayOfByte = this.zzaqq;
        this.zzaqq = null;
        if (((paramInt != 200) && (paramInt != 204)) || (paramThrowable != null))
          break;
        try
        {
          zzgf().zzaju.set(zzbt().currentTimeMillis());
          zzgf().zzajv.set(0L);
          zzku();
          zzge().zzit().zze("Successful upload. Got network response. code, size", Integer.valueOf(paramInt), Integer.valueOf(localObject.length));
          zzix().beginTransaction();
          try
          {
            paramThrowable = paramArrayOfByte.iterator();
            if (!paramThrowable.hasNext())
              continue;
            paramArrayOfByte = (Long)paramThrowable.next();
            try
            {
              paramString = zzix();
              long l = paramArrayOfByte.longValue();
              paramString.zzab();
              paramString.zzch();
              localObject = paramString.getWritableDatabase();
              try
              {
                if (((SQLiteDatabase)localObject).delete("queue", "rowid=?", new String[] { String.valueOf(l) }) == 1)
                  continue;
                localObject = new android/database/sqlite/SQLiteException;
                ((SQLiteException)localObject).<init>("Deleted fewer rows from queue than expected");
                AppMethodBeat.o(69460);
                throw ((Throwable)localObject);
              }
              catch (SQLiteException localSQLiteException)
              {
                paramString.zzge().zzim().zzg("Failed to delete a bundle in a queue table", localSQLiteException);
                AppMethodBeat.o(69460);
                throw localSQLiteException;
              }
            }
            catch (SQLiteException paramString)
            {
            }
            if ((this.zzaqr != null) && (this.zzaqr.contains(paramArrayOfByte)))
              continue;
            AppMethodBeat.o(69460);
            throw paramString;
          }
          finally
          {
            zzix().endTransaction();
            AppMethodBeat.o(69460);
          }
        }
        catch (SQLiteException paramThrowable)
        {
          zzge().zzim().zzg("Database error while trying to delete uploaded bundles", paramThrowable);
          this.zzaqh = zzbt().elapsedRealtime();
          zzge().zzit().zzg("Disable upload, time", Long.valueOf(this.zzaqh));
        }
        return;
        zzix().setTransactionSuccessful();
        zzix().endTransaction();
        this.zzaqr = null;
        if ((zzkn().zzex()) && (zzkt()))
        {
          zzks();
          this.zzaqh = 0L;
          continue;
        }
      }
      finally
      {
        this.zzaqm = false;
        zzkv();
        AppMethodBeat.o(69460);
      }
      this.zzaqs = -1L;
      zzku();
    }
    zzge().zzit().zze("Network upload failed. Will retry later. code, error", Integer.valueOf(paramInt), paramThrowable);
    zzgf().zzajv.set(zzbt().currentTimeMillis());
    if ((paramInt == 503) || (paramInt == 429));
    for (paramInt = 1; ; paramInt = 0)
    {
      if (paramInt != 0)
        zzgf().zzajw.set(zzbt().currentTimeMillis());
      if (zzgg().zzax(paramString))
        zzix().zzc(paramArrayOfByte);
      zzku();
      break;
    }
  }

  final void zza(zzgl paramzzgl)
  {
    this.zzacw = paramzzgl;
  }

  final void zza(zzjw paramzzjw)
  {
    AppMethodBeat.i(69431);
    zzab();
    paramzzjw = new zzei(this.zzacw);
    paramzzjw.zzm();
    this.zzaqc = paramzzjw;
    zzgg().zza(this.zzaqa);
    paramzzjw = new zzeb(this.zzacw);
    paramzzjw.zzm();
    this.zzaqf = paramzzjw;
    paramzzjw = new zzjn(this.zzacw);
    paramzzjw.zzm();
    this.zzaqe = paramzzjw;
    this.zzaqd = new zzfp(this.zzacw);
    if (this.zzaqj != this.zzaqk)
      zzge().zzim().zze("Not all upload components initialized", Integer.valueOf(this.zzaqj), Integer.valueOf(this.zzaqk));
    this.zzvo = true;
    AppMethodBeat.o(69431);
  }

  public final byte[] zza(zzeu paramzzeu, String paramString)
  {
    AppMethodBeat.i(69482);
    zzkq();
    zzab();
    zzgl.zzfr();
    Preconditions.checkNotNull(paramzzeu);
    Preconditions.checkNotEmpty(paramString);
    zzkp localzzkp = new zzkp();
    zzix().beginTransaction();
    label909: label1558: 
    while (true)
    {
      zzdy localzzdy;
      boolean bool;
      zzkq localzzkq;
      long l1;
      Object localObject3;
      int i;
      Object localObject4;
      try
      {
        localzzdy = zzix().zzbc(paramString);
        if (localzzdy == null)
        {
          zzge().zzis().zzg("Log and bundle not available. package_name", paramString);
          paramzzeu = new byte[0];
          return paramzzeu;
        }
        if (!localzzdy.isMeasurementEnabled())
        {
          zzge().zzis().zzg("Log and bundle disabled. package_name", paramString);
          paramzzeu = new byte[0];
          zzix().endTransaction();
          AppMethodBeat.o(69482);
          continue;
        }
        if ((("_iap".equals(paramzzeu.name)) || ("ecommerce_purchase".equals(paramzzeu.name))) && (!zza(paramString, paramzzeu)))
          zzge().zzip().zzg("Failed to handle purchase event at single event bundle creation. appId", zzfg.zzbm(paramString));
        bool = zzgg().zzav(paramString);
        localObject1 = Long.valueOf(0L);
        localObject2 = localObject1;
        if (bool)
        {
          localObject2 = localObject1;
          if ("_e".equals(paramzzeu.name))
          {
            if ((paramzzeu.zzafq != null) && (paramzzeu.zzafq.size() != 0))
              continue;
            zzge().zzip().zzg("The engagement event does not contain any parameters. appId", zzfg.zzbm(paramString));
            localObject2 = localObject1;
          }
        }
        localzzkq = new com/google/android/gms/internal/measurement/zzkq;
        localzzkq.<init>();
        localzzkp.zzatf = new zzkq[] { localzzkq };
        localzzkq.zzath = Integer.valueOf(1);
        localzzkq.zzatp = "android";
        localzzkq.zzti = localzzdy.zzah();
        localzzkq.zzadt = localzzdy.zzgn();
        localzzkq.zzth = localzzdy.zzag();
        l1 = localzzdy.zzgm();
        if (l1 != -2147483648L)
          break label909;
        localObject1 = null;
        localzzkq.zzaub = ((Integer)localObject1);
        localzzkq.zzatt = Long.valueOf(localzzdy.zzgo());
        localzzkq.zzadm = localzzdy.getGmpAppId();
        localzzkq.zzatx = Long.valueOf(localzzdy.zzgp());
        if ((this.zzacw.isEnabled()) && (zzef.zzhk()) && (zzgg().zzat(localzzkq.zzti)))
          localzzkq.zzauh = null;
        localObject1 = zzgf().zzbo(localzzdy.zzah());
        if ((localzzdy.zzhd()) && (localObject1 != null) && (!TextUtils.isEmpty((CharSequence)((Pair)localObject1).first)))
        {
          localzzkq.zzatv = ((String)((Pair)localObject1).first);
          localzzkq.zzatw = ((Boolean)((Pair)localObject1).second);
        }
        zzfw().zzch();
        localzzkq.zzatr = Build.MODEL;
        zzfw().zzch();
        localzzkq.zzatq = Build.VERSION.RELEASE;
        localzzkq.zzats = Integer.valueOf((int)zzfw().zzic());
        localzzkq.zzafn = zzfw().zzid();
        localzzkq.zzadl = localzzdy.getAppInstanceId();
        localzzkq.zzado = localzzdy.zzgj();
        List localList = zzix().zzbb(localzzdy.zzah());
        localzzkq.zzatj = new zzks[localList.size()];
        localObject1 = null;
        if (bool)
        {
          localObject1 = zzix().zzh(localzzkq.zzti, "_lte");
          if ((localObject1 != null) && (((zzjz)localObject1).value != null))
            break label920;
          localObject1 = new com/google/android/gms/internal/measurement/zzjz;
          ((zzjz)localObject1).<init>(localzzkq.zzti, "auto", "_lte", zzbt().currentTimeMillis(), localObject2);
        }
        localObject3 = null;
        i = 0;
        if (i >= localList.size())
          break label982;
        localObject4 = new com/google/android/gms/internal/measurement/zzks;
        ((zzks)localObject4).<init>();
        localzzkq.zzatj[i] = localObject4;
        ((zzks)localObject4).name = ((zzjz)localList.get(i)).name;
        ((zzks)localObject4).zzaun = Long.valueOf(((zzjz)localList.get(i)).zzaqz);
        zzgb().zza((zzks)localObject4, ((zzjz)localList.get(i)).value);
        if ((!bool) || (!"_lte".equals(((zzks)localObject4).name)))
          break label1793;
        ((zzks)localObject4).zzate = ((Long)((zzjz)localObject1).value);
        ((zzks)localObject4).zzaun = Long.valueOf(zzbt().currentTimeMillis());
        localObject3 = localObject4;
        i++;
        continue;
        if (paramzzeu.zzafq.getLong("_et") == null)
        {
          zzge().zzip().zzg("The engagement event does not include duration. appId", zzfg.zzbm(paramString));
          localObject2 = localObject1;
          continue;
        }
      }
      finally
      {
        zzix().endTransaction();
        AppMethodBeat.o(69482);
      }
      Object localObject2 = paramzzeu.zzafq.getLong("_et");
      continue;
      Object localObject1 = Integer.valueOf((int)l1);
      continue;
      label920: if (((Long)localObject2).longValue() > 0L)
      {
        localObject1 = new zzjz(localzzkq.zzti, "auto", "_lte", zzbt().currentTimeMillis(), Long.valueOf(((Long)((zzjz)localObject1).value).longValue() + ((Long)localObject2).longValue()));
        continue;
        label982: if ((bool) && (localObject3 == null))
        {
          localObject3 = new com/google/android/gms/internal/measurement/zzks;
          ((zzks)localObject3).<init>();
          ((zzks)localObject3).name = "_lte";
          ((zzks)localObject3).zzaun = Long.valueOf(zzbt().currentTimeMillis());
          ((zzks)localObject3).zzate = ((Long)((zzjz)localObject1).value);
          localzzkq.zzatj = ((zzks[])Arrays.copyOf(localzzkq.zzatj, localzzkq.zzatj.length + 1));
          localzzkq.zzatj[(localzzkq.zzatj.length - 1)] = localObject3;
        }
        if (((Long)localObject2).longValue() > 0L)
          zzix().zza((zzjz)localObject1);
        localObject3 = paramzzeu.zzafq.zzif();
        if ("_iap".equals(paramzzeu.name))
        {
          ((Bundle)localObject3).putLong("_c", 1L);
          zzge().zzis().log("Marking in-app purchase as real-time");
          ((Bundle)localObject3).putLong("_r", 1L);
        }
        ((Bundle)localObject3).putString("_o", paramzzeu.origin);
        if (zzgb().zzcj(localzzkq.zzti))
        {
          zzgb().zza((Bundle)localObject3, "_dbg", Long.valueOf(1L));
          zzgb().zza((Bundle)localObject3, "_r", Long.valueOf(1L));
        }
        localObject1 = zzix().zzf(paramString, paramzzeu.name);
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/internal/measurement/zzeq;
          ((zzeq)localObject1).<init>(paramString, paramzzeu.name, 1L, 0L, paramzzeu.zzagb, 0L, null, null, null);
          zzix().zza((zzeq)localObject1);
          l1 = 0L;
        }
        while (true)
        {
          localObject1 = new com/google/android/gms/internal/measurement/zzep;
          ((zzep)localObject1).<init>(this.zzacw, paramzzeu.origin, paramString, paramzzeu.name, paramzzeu.zzagb, l1, (Bundle)localObject3);
          localObject3 = new com/google/android/gms/internal/measurement/zzkn;
          ((zzkn)localObject3).<init>();
          localzzkq.zzati = new zzkn[] { localObject3 };
          ((zzkn)localObject3).zzatb = Long.valueOf(((zzep)localObject1).timestamp);
          ((zzkn)localObject3).name = ((zzep)localObject1).name;
          ((zzkn)localObject3).zzatc = Long.valueOf(((zzep)localObject1).zzafp);
          ((zzkn)localObject3).zzata = new zzko[((zzep)localObject1).zzafq.size()];
          localObject2 = ((zzep)localObject1).zzafq.iterator();
          for (i = 0; ((Iterator)localObject2).hasNext(); i++)
          {
            localObject4 = (String)((Iterator)localObject2).next();
            paramzzeu = new com/google/android/gms/internal/measurement/zzko;
            paramzzeu.<init>();
            ((zzkn)localObject3).zzata[i] = paramzzeu;
            paramzzeu.name = ((String)localObject4);
            localObject4 = ((zzep)localObject1).zzafq.get((String)localObject4);
            zzgb().zza(paramzzeu, localObject4);
          }
          l1 = ((zzeq)localObject1).zzaft;
          localObject1 = ((zzeq)localObject1).zzac(paramzzeu.zzagb).zzie();
          zzix().zza((zzeq)localObject1);
        }
        localzzkq.zzaua = zza(localzzdy.zzah(), localzzkq.zzatj, localzzkq.zzati);
        localzzkq.zzatl = ((zzkn)localObject3).zzatb;
        localzzkq.zzatm = ((zzkn)localObject3).zzatb;
        long l2 = localzzdy.zzgl();
        if (l2 != 0L)
        {
          paramzzeu = Long.valueOf(l2);
          localzzkq.zzato = paramzzeu;
          l1 = localzzdy.zzgk();
          if (l1 != 0L)
            break label1790;
          l1 = l2;
        }
        label1790: 
        while (true)
        {
          while (true)
          {
            if (l1 != 0L)
            {
              paramzzeu = Long.valueOf(l1);
              localzzkq.zzatn = paramzzeu;
              localzzdy.zzgt();
              localzzkq.zzaty = Integer.valueOf((int)localzzdy.zzgq());
              localzzkq.zzatu = Long.valueOf(12451L);
              localzzkq.zzatk = Long.valueOf(zzbt().currentTimeMillis());
              localzzkq.zzatz = Boolean.TRUE;
              localzzdy.zzm(localzzkq.zzatl.longValue());
              localzzdy.zzn(localzzkq.zzatm.longValue());
              zzix().zza(localzzdy);
              zzix().setTransactionSuccessful();
              zzix().endTransaction();
            }
            try
            {
              paramzzeu = new byte[localzzkp.zzvm()];
              localObject1 = zzabw.zzb(paramzzeu, 0, paramzzeu.length);
              localzzkp.zza((zzabw)localObject1);
              ((zzabw)localObject1).zzve();
              paramzzeu = zzgb().zza(paramzzeu);
              AppMethodBeat.o(69482);
              break;
              paramzzeu = null;
              break label1558;
              paramzzeu = null;
            }
            catch (IOException paramzzeu)
            {
              zzge().zzim().zze("Data loss. Failed to bundle and serialize. appId", zzfg.zzbm(paramString), paramzzeu);
              paramzzeu = null;
              AppMethodBeat.o(69482);
            }
          }
          break;
        }
      }
    }
  }

  public void zzab()
  {
    AppMethodBeat.i(69448);
    zzgd().zzab();
    AppMethodBeat.o(69448);
  }

  final void zzb(zzed paramzzed, zzdz paramzzdz)
  {
    int i = 1;
    AppMethodBeat.i(69479);
    Preconditions.checkNotNull(paramzzed);
    Preconditions.checkNotEmpty(paramzzed.packageName);
    Preconditions.checkNotNull(paramzzed.origin);
    Preconditions.checkNotNull(paramzzed.zzaep);
    Preconditions.checkNotEmpty(paramzzed.zzaep.name);
    zzab();
    zzkq();
    if (TextUtils.isEmpty(paramzzdz.zzadm))
      AppMethodBeat.o(69479);
    while (true)
    {
      return;
      if (paramzzdz.zzadw)
        break;
      zzg(paramzzdz);
      AppMethodBeat.o(69479);
    }
    paramzzed = new zzed(paramzzed);
    paramzzed.active = false;
    zzix().beginTransaction();
    while (true)
    {
      Object localObject2;
      try
      {
        Object localObject1 = zzix().zzi(paramzzed.packageName, paramzzed.zzaep.name);
        if ((localObject1 != null) && (!((zzed)localObject1).origin.equals(paramzzed.origin)))
          zzge().zzip().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", zzga().zzbl(paramzzed.zzaep.name), paramzzed.origin, ((zzed)localObject1).origin);
        if ((localObject1 != null) && (((zzed)localObject1).active))
        {
          paramzzed.origin = ((zzed)localObject1).origin;
          paramzzed.creationTimestamp = ((zzed)localObject1).creationTimestamp;
          paramzzed.triggerTimeout = ((zzed)localObject1).triggerTimeout;
          paramzzed.triggerEventName = ((zzed)localObject1).triggerEventName;
          paramzzed.zzaer = ((zzed)localObject1).zzaer;
          paramzzed.active = ((zzed)localObject1).active;
          localObject2 = new com/google/android/gms/internal/measurement/zzjx;
          ((zzjx)localObject2).<init>(paramzzed.zzaep.name, ((zzed)localObject1).zzaep.zzaqz, paramzzed.zzaep.getValue(), ((zzed)localObject1).zzaep.origin);
          paramzzed.zzaep = ((zzjx)localObject2);
          i = 0;
          if (paramzzed.active)
          {
            localObject1 = paramzzed.zzaep;
            localObject2 = new com/google/android/gms/internal/measurement/zzjz;
            ((zzjz)localObject2).<init>(paramzzed.packageName, paramzzed.origin, ((zzjx)localObject1).name, ((zzjx)localObject1).zzaqz, ((zzjx)localObject1).getValue());
            if (!zzix().zza((zzjz)localObject2))
              break label582;
            zzge().zzis().zzd("User property updated immediately", paramzzed.packageName, zzga().zzbl(((zzjz)localObject2).name), ((zzjz)localObject2).value);
            if ((i != 0) && (paramzzed.zzaer != null))
            {
              localObject2 = new com/google/android/gms/internal/measurement/zzeu;
              ((zzeu)localObject2).<init>(paramzzed.zzaer, paramzzed.creationTimestamp);
              zzc((zzeu)localObject2, paramzzdz);
            }
          }
          if (!zzix().zza(paramzzed))
            break label622;
          zzge().zzis().zzd("Conditional property added", paramzzed.packageName, zzga().zzbl(paramzzed.zzaep.name), paramzzed.zzaep.getValue());
          zzix().setTransactionSuccessful();
          zzix().endTransaction();
          AppMethodBeat.o(69479);
          break;
        }
        if (!TextUtils.isEmpty(paramzzed.triggerEventName))
          break label666;
        localObject2 = new com/google/android/gms/internal/measurement/zzjx;
        ((zzjx)localObject2).<init>(paramzzed.zzaep.name, paramzzed.creationTimestamp, paramzzed.zzaep.getValue(), paramzzed.zzaep.origin);
        paramzzed.zzaep = ((zzjx)localObject2);
        paramzzed.active = true;
        continue;
      }
      finally
      {
        zzix().endTransaction();
        AppMethodBeat.o(69479);
      }
      label582: zzge().zzim().zzd("(2)Too many active user properties, ignoring", zzfg.zzbm(paramzzed.packageName), zzga().zzbl(((zzjz)localObject2).name), ((zzjz)localObject2).value);
      continue;
      label622: zzge().zzim().zzd("Too many conditional properties, ignoring", zzfg.zzbm(paramzzed.packageName), zzga().zzbl(paramzzed.zzaep.name), paramzzed.zzaep.getValue());
      continue;
      label666: i = 0;
    }
  }

  final void zzb(zzeu paramzzeu, zzdz paramzzdz)
  {
    AppMethodBeat.i(69454);
    Preconditions.checkNotNull(paramzzdz);
    Preconditions.checkNotEmpty(paramzzdz.packageName);
    zzab();
    zzkq();
    Object localObject1 = paramzzdz.packageName;
    long l = paramzzeu.zzagb;
    zzgb();
    if (!zzka.zzd(paramzzeu, paramzzdz))
      AppMethodBeat.o(69454);
    while (true)
    {
      return;
      if (!paramzzdz.zzadw)
      {
        zzg(paramzzdz);
        AppMethodBeat.o(69454);
      }
      else
      {
        zzix().beginTransaction();
        Object localObject3;
        while (true)
        {
          try
          {
            localObject2 = zzix();
            Preconditions.checkNotEmpty((String)localObject1);
            ((zzhg)localObject2).zzab();
            ((zzjq)localObject2).zzch();
            if (l < 0L)
            {
              ((zzhg)localObject2).zzge().zzip().zze("Invalid time querying timed out conditional properties", zzfg.zzbm((String)localObject1), Long.valueOf(l));
              localObject2 = Collections.emptyList();
              localObject3 = ((List)localObject2).iterator();
              if (!((Iterator)localObject3).hasNext())
                break;
              localObject4 = (zzed)((Iterator)localObject3).next();
              if (localObject4 == null)
                continue;
              zzge().zzis().zzd("User property timed out", ((zzed)localObject4).packageName, zzga().zzbl(((zzed)localObject4).zzaep.name), ((zzed)localObject4).zzaep.getValue());
              if (((zzed)localObject4).zzaeq != null)
              {
                localObject2 = new com/google/android/gms/internal/measurement/zzeu;
                ((zzeu)localObject2).<init>(((zzed)localObject4).zzaeq, l);
                zzc((zzeu)localObject2, paramzzdz);
              }
              zzix().zzj((String)localObject1, ((zzed)localObject4).zzaep.name);
              continue;
            }
          }
          finally
          {
            zzix().endTransaction();
            AppMethodBeat.o(69454);
          }
          localObject2 = ((zzei)localObject2).zzb("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[] { localObject1, String.valueOf(l) });
        }
        Object localObject2 = zzix();
        Preconditions.checkNotEmpty((String)localObject1);
        ((zzhg)localObject2).zzab();
        ((zzjq)localObject2).zzch();
        if (l < 0L)
          ((zzhg)localObject2).zzge().zzip().zze("Invalid time querying expired conditional properties", zzfg.zzbm((String)localObject1), Long.valueOf(l));
        for (localObject2 = Collections.emptyList(); ; localObject2 = ((zzei)localObject2).zzb("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[] { localObject1, String.valueOf(l) }))
        {
          localObject4 = new java/util/ArrayList;
          ((ArrayList)localObject4).<init>(((List)localObject2).size());
          localObject3 = ((List)localObject2).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject2 = (zzed)((Iterator)localObject3).next();
            if (localObject2 != null)
            {
              zzge().zzis().zzd("User property expired", ((zzed)localObject2).packageName, zzga().zzbl(((zzed)localObject2).zzaep.name), ((zzed)localObject2).zzaep.getValue());
              zzix().zzg((String)localObject1, ((zzed)localObject2).zzaep.name);
              if (((zzed)localObject2).zzaes != null)
                ((List)localObject4).add(((zzed)localObject2).zzaes);
              zzix().zzj((String)localObject1, ((zzed)localObject2).zzaep.name);
            }
          }
        }
        localObject2 = (ArrayList)localObject4;
        int i = ((ArrayList)localObject2).size();
        int j = 0;
        while (j < i)
        {
          localObject4 = ((ArrayList)localObject2).get(j);
          j++;
          localObject4 = (zzeu)localObject4;
          localObject3 = new com/google/android/gms/internal/measurement/zzeu;
          ((zzeu)localObject3).<init>((zzeu)localObject4, l);
          zzc((zzeu)localObject3, paramzzdz);
        }
        localObject2 = zzix();
        Object localObject4 = paramzzeu.name;
        Preconditions.checkNotEmpty((String)localObject1);
        Preconditions.checkNotEmpty((String)localObject4);
        ((zzhg)localObject2).zzab();
        ((zzjq)localObject2).zzch();
        label722: zzjx localzzjx;
        if (l < 0L)
        {
          ((zzhg)localObject2).zzge().zzip().zzd("Invalid time querying triggered conditional properties", zzfg.zzbm((String)localObject1), ((zzhg)localObject2).zzga().zzbj((String)localObject4), Long.valueOf(l));
          localObject2 = Collections.emptyList();
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>(((List)localObject2).size());
          localObject2 = ((List)localObject2).iterator();
          do
          {
            if (!((Iterator)localObject2).hasNext())
              break;
            localObject3 = (zzed)((Iterator)localObject2).next();
          }
          while (localObject3 == null);
          localzzjx = ((zzed)localObject3).zzaep;
          localObject4 = new com/google/android/gms/internal/measurement/zzjz;
          ((zzjz)localObject4).<init>(((zzed)localObject3).packageName, ((zzed)localObject3).origin, localzzjx.name, l, localzzjx.getValue());
          if (!zzix().zza((zzjz)localObject4))
            break label927;
          zzge().zzis().zzd("User property triggered", ((zzed)localObject3).packageName, zzga().zzbl(((zzjz)localObject4).name), ((zzjz)localObject4).value);
        }
        while (true)
        {
          if (((zzed)localObject3).zzaer != null)
            ((List)localObject1).add(((zzed)localObject3).zzaer);
          localzzjx = new com/google/android/gms/internal/measurement/zzjx;
          localzzjx.<init>((zzjz)localObject4);
          ((zzed)localObject3).zzaep = localzzjx;
          ((zzed)localObject3).active = true;
          zzix().zza((zzed)localObject3);
          break label722;
          localObject2 = ((zzei)localObject2).zzb("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[] { localObject1, localObject4, String.valueOf(l) });
          break;
          label927: zzge().zzim().zzd("Too many active user properties, ignoring", zzfg.zzbm(((zzed)localObject3).packageName), zzga().zzbl(((zzjz)localObject4).name), ((zzjz)localObject4).value);
        }
        zzc(paramzzeu, paramzzdz);
        paramzzeu = (ArrayList)localObject1;
        i = paramzzeu.size();
        j = 0;
        while (j < i)
        {
          localObject2 = paramzzeu.get(j);
          j++;
          localObject1 = (zzeu)localObject2;
          localObject2 = new com/google/android/gms/internal/measurement/zzeu;
          ((zzeu)localObject2).<init>((zzeu)localObject1, l);
          zzc((zzeu)localObject2, paramzzdz);
        }
        zzix().setTransactionSuccessful();
        zzix().endTransaction();
        AppMethodBeat.o(69454);
      }
    }
  }

  final void zzb(zzjq paramzzjq)
  {
    this.zzaqj += 1;
  }

  final void zzb(zzjx paramzzjx, zzdz paramzzdz)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(69475);
    zzab();
    zzkq();
    if (TextUtils.isEmpty(paramzzdz.zzadm))
      AppMethodBeat.o(69475);
    while (true)
    {
      return;
      if (!paramzzdz.zzadw)
      {
        zzg(paramzzdz);
        AppMethodBeat.o(69475);
      }
      else
      {
        int k = zzgb().zzcf(paramzzjx.name);
        Object localObject;
        if (k != 0)
        {
          zzgb();
          localObject = zzka.zza(paramzzjx.name, 24, true);
          if (paramzzjx.name != null)
            j = paramzzjx.name.length();
          zzgb().zza(paramzzdz.packageName, k, "_ev", (String)localObject, j);
          AppMethodBeat.o(69475);
        }
        else
        {
          k = zzgb().zzi(paramzzjx.name, paramzzjx.getValue());
          if (k != 0)
          {
            zzgb();
            localObject = zzka.zza(paramzzjx.name, 24, true);
            paramzzjx = paramzzjx.getValue();
            j = i;
            if (paramzzjx != null)
              if (!(paramzzjx instanceof String))
              {
                j = i;
                if (!(paramzzjx instanceof CharSequence));
              }
              else
              {
                j = String.valueOf(paramzzjx).length();
              }
            zzgb().zza(paramzzdz.packageName, k, "_ev", (String)localObject, j);
            AppMethodBeat.o(69475);
          }
          else
          {
            localObject = zzgb().zzj(paramzzjx.name, paramzzjx.getValue());
            if (localObject == null)
            {
              AppMethodBeat.o(69475);
            }
            else
            {
              paramzzjx = new zzjz(paramzzdz.packageName, paramzzjx.origin, paramzzjx.name, paramzzjx.zzaqz, localObject);
              zzge().zzis().zze("Setting user property", zzga().zzbl(paramzzjx.name), localObject);
              zzix().beginTransaction();
              try
              {
                zzg(paramzzdz);
                boolean bool = zzix().zza(paramzzjx);
                zzix().setTransactionSuccessful();
                if (bool)
                  zzge().zzis().zze("User property set", zzga().zzbl(paramzzjx.name), paramzzjx.value);
                while (true)
                {
                  zzix().endTransaction();
                  AppMethodBeat.o(69475);
                  break;
                  zzge().zzim().zze("Too many unique user properties are set. Ignoring user property", zzga().zzbl(paramzzjx.name), paramzzjx.value);
                  zzgb().zza(paramzzdz.packageName, 9, null, null, 0);
                }
              }
              finally
              {
                zzix().endTransaction();
                AppMethodBeat.o(69475);
              }
            }
          }
        }
      }
    }
    throw paramzzjx;
  }

  @VisibleForTesting
  final void zzb(String paramString, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte, Map<String, List<String>> paramMap)
  {
    int i = 1;
    AppMethodBeat.i(69463);
    zzab();
    zzkq();
    Preconditions.checkNotEmpty(paramString);
    byte[] arrayOfByte = paramArrayOfByte;
    if (paramArrayOfByte == null);
    while (true)
    {
      try
      {
        arrayOfByte = new byte[0];
        zzge().zzit().zzg("onConfigFetched. Response size", Integer.valueOf(arrayOfByte.length));
        zzix().beginTransaction();
        try
        {
          paramArrayOfByte = zzix().zzbc(paramString);
          if (((paramInt == 200) || (paramInt == 204) || (paramInt == 304)) && (paramThrowable == null))
          {
            j = 1;
            if (paramArrayOfByte == null)
            {
              zzge().zzip().zzg("App does not exist in onConfigFetched. appId", zzfg.zzbm(paramString));
              zzix().setTransactionSuccessful();
              zzix().endTransaction();
            }
          }
          else
          {
            j = 0;
            continue;
          }
          if ((j == 0) && (paramInt != 404))
            break;
          if (paramMap != null)
          {
            paramThrowable = (List)paramMap.get("Last-Modified");
            if ((paramThrowable == null) || (paramThrowable.size() <= 0))
              continue;
            paramThrowable = (String)paramThrowable.get(0);
            if ((paramInt != 404) && (paramInt != 304))
              continue;
            if (zzkm().zzbu(paramString) != null)
              continue;
            bool = zzkm().zza(paramString, null, null);
            if (bool)
              continue;
            zzix().endTransaction();
            this.zzaql = false;
            zzkv();
            AppMethodBeat.o(69463);
            continue;
          }
          paramThrowable = null;
          continue;
          paramThrowable = null;
          continue;
          boolean bool = zzkm().zza(paramString, arrayOfByte, paramThrowable);
          if (!bool)
          {
            zzix().endTransaction();
            this.zzaql = false;
            zzkv();
            AppMethodBeat.o(69463);
            continue;
          }
          paramArrayOfByte.zzs(zzbt().currentTimeMillis());
          zzix().zza(paramArrayOfByte);
          if (paramInt == 404)
          {
            zzge().zziq().zzg("Config not found. Using empty config. appId", paramString);
            if ((!zzkn().zzex()) || (!zzkt()))
              break label461;
            zzks();
            continue;
          }
        }
        finally
        {
          zzix().endTransaction();
          AppMethodBeat.o(69463);
        }
      }
      finally
      {
        this.zzaql = false;
        zzkv();
        AppMethodBeat.o(69463);
      }
      zzge().zzit().zze("Successfully fetched config. Got network response. code, size", Integer.valueOf(paramInt), Integer.valueOf(arrayOfByte.length));
      continue;
      label461: zzku();
    }
    paramArrayOfByte.zzt(zzbt().currentTimeMillis());
    zzix().zza(paramArrayOfByte);
    zzge().zzit().zze("Fetching config failed. code, error", Integer.valueOf(paramInt), paramThrowable);
    zzkm().zzbw(paramString);
    zzgf().zzajv.set(zzbt().currentTimeMillis());
    int j = i;
    if (paramInt != 503)
      if (paramInt != 429)
        break label589;
    label589: for (j = i; ; j = 0)
    {
      if (j != 0)
        zzgf().zzajw.set(zzbt().currentTimeMillis());
      zzku();
      break;
    }
  }

  public Clock zzbt()
  {
    AppMethodBeat.i(69445);
    Clock localClock = this.zzacw.zzbt();
    AppMethodBeat.o(69445);
    return localClock;
  }

  final void zzc(zzed paramzzed, zzdz paramzzdz)
  {
    AppMethodBeat.i(69480);
    Preconditions.checkNotNull(paramzzed);
    Preconditions.checkNotEmpty(paramzzed.packageName);
    Preconditions.checkNotNull(paramzzed.zzaep);
    Preconditions.checkNotEmpty(paramzzed.zzaep.name);
    zzab();
    zzkq();
    if (TextUtils.isEmpty(paramzzdz.zzadm))
      AppMethodBeat.o(69480);
    while (true)
    {
      return;
      if (!paramzzdz.zzadw)
      {
        zzg(paramzzdz);
        AppMethodBeat.o(69480);
      }
      else
      {
        zzix().beginTransaction();
        try
        {
          zzg(paramzzdz);
          zzed localzzed = zzix().zzi(paramzzed.packageName, paramzzed.zzaep.name);
          if (localzzed != null)
          {
            zzge().zzis().zze("Removing conditional user property", paramzzed.packageName, zzga().zzbl(paramzzed.zzaep.name));
            zzix().zzj(paramzzed.packageName, paramzzed.zzaep.name);
            if (localzzed.active)
              zzix().zzg(paramzzed.packageName, paramzzed.zzaep.name);
            if (paramzzed.zzaes != null)
            {
              Bundle localBundle = null;
              if (paramzzed.zzaes.zzafq != null)
                localBundle = paramzzed.zzaes.zzafq.zzif();
              zzc(zzgb().zza(paramzzed.zzaes.name, localBundle, localzzed.origin, paramzzed.zzaes.zzagb, true, false), paramzzdz);
            }
          }
          while (true)
          {
            zzix().setTransactionSuccessful();
            zzix().endTransaction();
            AppMethodBeat.o(69480);
            break;
            zzge().zzip().zze("Conditional user property doesn't exist", zzfg.zzbm(paramzzed.packageName), zzga().zzbl(paramzzed.zzaep.name));
          }
        }
        finally
        {
          zzix().endTransaction();
          AppMethodBeat.o(69480);
        }
      }
    }
    throw paramzzed;
  }

  final void zzc(zzeu paramzzeu, String paramString)
  {
    AppMethodBeat.i(69453);
    zzdy localzzdy = zzix().zzbc(paramString);
    if ((localzzdy == null) || (TextUtils.isEmpty(localzzdy.zzag())))
    {
      zzge().zzis().zzg("No app data available; dropping event", paramString);
      AppMethodBeat.o(69453);
    }
    while (true)
    {
      return;
      Boolean localBoolean = zzc(localzzdy);
      if (localBoolean == null)
        if (!"_ui".equals(paramzzeu.name))
          zzge().zzip().zzg("Could not find package. appId", zzfg.zzbm(paramString));
      while (localBoolean.booleanValue())
      {
        zzb(paramzzeu, new zzdz(paramString, localzzdy.getGmpAppId(), localzzdy.zzag(), localzzdy.zzgm(), localzzdy.zzgn(), localzzdy.zzgo(), localzzdy.zzgp(), null, localzzdy.isMeasurementEnabled(), false, localzzdy.zzgj(), localzzdy.zzhc(), 0L, 0, localzzdy.zzhd(), localzzdy.zzhe(), false));
        AppMethodBeat.o(69453);
        break;
      }
      zzge().zzim().zzg("App version does not match; dropping event. appId", zzfg.zzbm(paramString));
      AppMethodBeat.o(69453);
    }
  }

  final void zzc(zzjx paramzzjx, zzdz paramzzdz)
  {
    AppMethodBeat.i(69476);
    zzab();
    zzkq();
    if (TextUtils.isEmpty(paramzzdz.zzadm))
      AppMethodBeat.o(69476);
    while (true)
    {
      return;
      if (!paramzzdz.zzadw)
      {
        zzg(paramzzdz);
        AppMethodBeat.o(69476);
        continue;
      }
      zzge().zzis().zzg("Removing user property", zzga().zzbl(paramzzjx.name));
      zzix().beginTransaction();
      try
      {
        zzg(paramzzdz);
        zzix().zzg(paramzzdz.packageName, paramzzjx.name);
        zzix().setTransactionSuccessful();
        zzge().zzis().zzg("User property removed", zzga().zzbl(paramzzjx.name));
        zzix().endTransaction();
        AppMethodBeat.o(69476);
      }
      finally
      {
        zzix().endTransaction();
        AppMethodBeat.o(69476);
      }
    }
  }

  final zzdz zzcb(String paramString)
  {
    AppMethodBeat.i(69478);
    zzdy localzzdy = zzix().zzbc(paramString);
    if ((localzzdy == null) || (TextUtils.isEmpty(localzzdy.zzag())))
    {
      zzge().zzis().zzg("No app data available; dropping", paramString);
      paramString = null;
      AppMethodBeat.o(69478);
    }
    while (true)
    {
      return paramString;
      Boolean localBoolean = zzc(localzzdy);
      if ((localBoolean != null) && (!localBoolean.booleanValue()))
      {
        zzge().zzim().zzg("App version does not match; dropping. appId", zzfg.zzbm(paramString));
        paramString = null;
        AppMethodBeat.o(69478);
      }
      else
      {
        paramString = new zzdz(paramString, localzzdy.getGmpAppId(), localzzdy.zzag(), localzzdy.zzgm(), localzzdy.zzgn(), localzzdy.zzgo(), localzzdy.zzgp(), null, localzzdy.isMeasurementEnabled(), false, localzzdy.zzgj(), localzzdy.zzhc(), 0L, 0, localzzdy.zzhd(), localzzdy.zzhe(), false);
        AppMethodBeat.o(69478);
      }
    }
  }

  @VisibleForTesting
  final void zzd(zzdz paramzzdz)
  {
    AppMethodBeat.i(69473);
    if (this.zzaqq != null)
    {
      this.zzaqr = new ArrayList();
      this.zzaqr.addAll(this.zzaqq);
    }
    zzei localzzei = zzix();
    Object localObject = paramzzdz.packageName;
    Preconditions.checkNotEmpty((String)localObject);
    localzzei.zzab();
    localzzei.zzch();
    try
    {
      SQLiteDatabase localSQLiteDatabase = localzzei.getWritableDatabase();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = localObject;
      int i = localSQLiteDatabase.delete("apps", "app_id=?", arrayOfString);
      int j = localSQLiteDatabase.delete("events", "app_id=?", arrayOfString);
      int k = localSQLiteDatabase.delete("user_attributes", "app_id=?", arrayOfString);
      int m = localSQLiteDatabase.delete("conditional_properties", "app_id=?", arrayOfString);
      int n = localSQLiteDatabase.delete("raw_events", "app_id=?", arrayOfString);
      int i1 = localSQLiteDatabase.delete("raw_events_metadata", "app_id=?", arrayOfString);
      int i2 = localSQLiteDatabase.delete("queue", "app_id=?", arrayOfString);
      int i3 = localSQLiteDatabase.delete("audience_filter_values", "app_id=?", arrayOfString);
      k = localSQLiteDatabase.delete("main_event_params", "app_id=?", arrayOfString) + (i + 0 + j + k + m + n + i1 + i2 + i3);
      if (k > 0)
        localzzei.zzge().zzit().zze("Reset analytics data. app, records", localObject, Integer.valueOf(k));
      localObject = zza(getContext(), paramzzdz.packageName, paramzzdz.zzadm, paramzzdz.zzadw, paramzzdz.zzady, paramzzdz.zzadz, paramzzdz.zzaem);
      if ((!zzgg().zzaz(paramzzdz.packageName)) || (paramzzdz.zzadw))
        zzf((zzdz)localObject);
      AppMethodBeat.o(69473);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      while (true)
        localzzei.zzge().zzim().zze("Error resetting analytics data. appId, error", zzfg.zzbm((String)localObject), localSQLiteException);
    }
  }

  final void zze(zzdz paramzzdz)
  {
    AppMethodBeat.i(69451);
    zzab();
    zzkq();
    Preconditions.checkNotEmpty(paramzzdz.packageName);
    zzg(paramzzdz);
    AppMethodBeat.o(69451);
  }

  public final void zzf(zzdz paramzzdz)
  {
    AppMethodBeat.i(69477);
    zzab();
    zzkq();
    Preconditions.checkNotNull(paramzzdz);
    Preconditions.checkNotEmpty(paramzzdz.packageName);
    if (TextUtils.isEmpty(paramzzdz.zzadm))
      AppMethodBeat.o(69477);
    Object localObject1;
    while (true)
    {
      return;
      localObject1 = zzix().zzbc(paramzzdz.packageName);
      if ((localObject1 != null) && (TextUtils.isEmpty(((zzdy)localObject1).getGmpAppId())) && (!TextUtils.isEmpty(paramzzdz.zzadm)))
      {
        ((zzdy)localObject1).zzs(0L);
        zzix().zza((zzdy)localObject1);
        zzkm().zzbx(paramzzdz.packageName);
      }
      if (paramzzdz.zzadw)
        break;
      zzg(paramzzdz);
      AppMethodBeat.o(69477);
    }
    long l1 = paramzzdz.zzaem;
    long l2 = l1;
    if (l1 == 0L)
      l2 = zzbt().currentTimeMillis();
    int i = paramzzdz.zzaen;
    if ((i != 0) && (i != 1))
    {
      zzge().zzip().zze("Incorrect app type, assuming installed app. appId, appType", zzfg.zzbm(paramzzdz.packageName), Integer.valueOf(i));
      i = 0;
    }
    label1289: label1295: label1327: label1464: 
    while (true)
    {
      zzix().beginTransaction();
      label1085: label1109: 
      while (true)
      {
        Object localObject3;
        try
        {
          while (true)
          {
            localObject3 = zzix().zzbc(paramzzdz.packageName);
            localObject1 = localObject3;
            if (localObject3 != null)
            {
              localObject1 = localObject3;
              if (((zzdy)localObject3).getGmpAppId() != null)
              {
                localObject1 = localObject3;
                if (!((zzdy)localObject3).getGmpAppId().equals(paramzzdz.zzadm))
                {
                  zzge().zzip().zzg("New GMP App Id passed in. Removing cached database data. appId", zzfg.zzbm(((zzdy)localObject3).zzah()));
                  localObject1 = zzix();
                  localObject3 = ((zzdy)localObject3).zzah();
                  ((zzjq)localObject1).zzch();
                  ((zzhg)localObject1).zzab();
                  Preconditions.checkNotEmpty((String)localObject3);
                }
              }
            }
            try
            {
              SQLiteDatabase localSQLiteDatabase = ((zzei)localObject1).getWritableDatabase();
              Object localObject5 = new String[1];
              localObject5[0] = localObject3;
              int j = localSQLiteDatabase.delete("events", "app_id=?", (String[])localObject5);
              int k = localSQLiteDatabase.delete("user_attributes", "app_id=?", (String[])localObject5);
              int m = localSQLiteDatabase.delete("conditional_properties", "app_id=?", (String[])localObject5);
              int n = localSQLiteDatabase.delete("apps", "app_id=?", (String[])localObject5);
              int i1 = localSQLiteDatabase.delete("raw_events", "app_id=?", (String[])localObject5);
              int i2 = localSQLiteDatabase.delete("raw_events_metadata", "app_id=?", (String[])localObject5);
              int i3 = localSQLiteDatabase.delete("event_filters", "app_id=?", (String[])localObject5);
              int i4 = localSQLiteDatabase.delete("property_filters", "app_id=?", (String[])localObject5);
              j = localSQLiteDatabase.delete("audience_filter_values", "app_id=?", (String[])localObject5) + (j + 0 + k + m + n + i1 + i2 + i3 + i4);
              if (j > 0)
                ((zzhg)localObject1).zzge().zzit().zze("Deleted application data. app, records", localObject3, Integer.valueOf(j));
              localObject1 = null;
              if (localObject1 != null)
              {
                if (((zzdy)localObject1).zzgm() == -2147483648L)
                  break label1003;
                if (((zzdy)localObject1).zzgm() != paramzzdz.zzads)
                {
                  localObject3 = new android/os/Bundle;
                  ((Bundle)localObject3).<init>();
                  ((Bundle)localObject3).putString("_pv", ((zzdy)localObject1).zzag());
                  localObject1 = new com/google/android/gms/internal/measurement/zzeu;
                  localObject5 = new com/google/android/gms/internal/measurement/zzer;
                  ((zzer)localObject5).<init>((Bundle)localObject3);
                  ((zzeu)localObject1).<init>("_au", (zzer)localObject5, "auto", l2);
                  zzb((zzeu)localObject1, paramzzdz);
                }
              }
              zzg(paramzzdz);
              localObject1 = null;
              if (i != 0)
                break label1085;
              localObject1 = zzix().zzf(paramzzdz.packageName, "_f");
              if (localObject1 != null)
                break label1464;
              l1 = (1L + l2 / 3600000L) * 3600000L;
              if (i != 0)
                break label1327;
              localObject1 = new com/google/android/gms/internal/measurement/zzjx;
              ((zzjx)localObject1).<init>("_fot", l2, Long.valueOf(l1), "auto");
              zzb((zzjx)localObject1, paramzzdz);
              zzab();
              zzkq();
              localObject5 = new android/os/Bundle;
              ((Bundle)localObject5).<init>();
              ((Bundle)localObject5).putLong("_c", 1L);
              ((Bundle)localObject5).putLong("_r", 1L);
              ((Bundle)localObject5).putLong("_uwa", 0L);
              ((Bundle)localObject5).putLong("_pfo", 0L);
              ((Bundle)localObject5).putLong("_sys", 0L);
              ((Bundle)localObject5).putLong("_sysu", 0L);
              if ((zzgg().zzaz(paramzzdz.packageName)) && (paramzzdz.zzaeo))
                ((Bundle)localObject5).putLong("_dac", 1L);
              if (getContext().getPackageManager() != null)
                break label1109;
              zzge().zzim().zzg("PackageManager is null, first open report might be inaccurate. appId", zzfg.zzbm(paramzzdz.packageName));
              localObject1 = zzix();
              localObject3 = paramzzdz.packageName;
              Preconditions.checkNotEmpty((String)localObject3);
              ((zzhg)localObject1).zzab();
              ((zzjq)localObject1).zzch();
              l1 = ((zzei)localObject1).zzm((String)localObject3, "first_open_count");
              if (l1 >= 0L)
                ((Bundle)localObject5).putLong("_pfo", l1);
              localObject1 = new com/google/android/gms/internal/measurement/zzeu;
              localObject3 = new com/google/android/gms/internal/measurement/zzer;
              ((zzer)localObject3).<init>((Bundle)localObject5);
              ((zzeu)localObject1).<init>("_f", (zzer)localObject3, "auto", l2);
              zzb((zzeu)localObject1, paramzzdz);
              localObject1 = new android/os/Bundle;
              ((Bundle)localObject1).<init>();
              ((Bundle)localObject1).putLong("_et", 1L);
              localObject3 = new com/google/android/gms/internal/measurement/zzeu;
              localObject5 = new com/google/android/gms/internal/measurement/zzer;
              ((zzer)localObject5).<init>((Bundle)localObject1);
              ((zzeu)localObject3).<init>("_e", (zzer)localObject5, "auto", l2);
              zzb((zzeu)localObject3, paramzzdz);
              zzix().setTransactionSuccessful();
            }
            catch (SQLiteException localSQLiteException)
            {
              while (true)
                ((zzhg)localObject1).zzge().zzim().zze("Error deleting application data. appId, error", zzfg.zzbm((String)localObject3), localSQLiteException);
            }
          }
        }
        finally
        {
          zzix().endTransaction();
          AppMethodBeat.o(69477);
        }
        label1003: if ((((zzdy)localObject1).zzag() != null) && (!((zzdy)localObject1).zzag().equals(paramzzdz.zzth)))
        {
          localObject3 = new android/os/Bundle;
          ((Bundle)localObject3).<init>();
          ((Bundle)localObject3).putString("_pv", ((zzdy)localObject1).zzag());
          localObject1 = new com/google/android/gms/internal/measurement/zzeu;
          Object localObject6 = new com/google/android/gms/internal/measurement/zzer;
          ((zzer)localObject6).<init>((Bundle)localObject3);
          ((zzeu)localObject1).<init>("_au", (zzer)localObject6, "auto", l2);
          zzb((zzeu)localObject1, paramzzdz);
          continue;
          if (i == 1)
          {
            localObject1 = zzix().zzf(paramzzdz.packageName, "_v");
            continue;
            localObject1 = null;
            Object localObject2;
            try
            {
              localObject3 = Wrappers.packageManager(getContext()).getPackageInfo(paramzzdz.packageName, 0);
              localObject1 = localObject3;
              if ((localObject1 != null) && (((PackageInfo)localObject1).firstInstallTime != 0L))
              {
                i = 0;
                if (((PackageInfo)localObject1).firstInstallTime == ((PackageInfo)localObject1).lastUpdateTime)
                  break label1289;
                ((Bundle)localObject6).putLong("_uwa", 1L);
                localObject1 = new com/google/android/gms/internal/measurement/zzjx;
                if (i == 0)
                  break label1295;
                l1 = 1L;
                ((zzjx)localObject1).<init>("_fi", l2, Long.valueOf(l1), "auto");
                zzb((zzjx)localObject1, paramzzdz);
              }
            }
            catch (PackageManager.NameNotFoundException localNameNotFoundException2)
            {
              try
              {
                while (true)
                {
                  localObject1 = Wrappers.packageManager(getContext()).getApplicationInfo(paramzzdz.packageName, 0);
                  if (localObject1 == null)
                    break;
                  if ((((ApplicationInfo)localObject1).flags & 0x1) != 0)
                    ((Bundle)localObject6).putLong("_sys", 1L);
                  if ((((ApplicationInfo)localObject1).flags & 0x80) == 0)
                    break;
                  ((Bundle)localObject6).putLong("_sysu", 1L);
                  break;
                  localNameNotFoundException2 = localNameNotFoundException2;
                  zzge().zzim().zze("Package info is null, first open report might be inaccurate. appId", zzfg.zzbm(paramzzdz.packageName), localNameNotFoundException2);
                  continue;
                  i = 1;
                }
                l1 = 0L;
              }
              catch (PackageManager.NameNotFoundException localNameNotFoundException1)
              {
                while (true)
                {
                  zzge().zzim().zze("Application info is null, first open report might be inaccurate. appId", zzfg.zzbm(paramzzdz.packageName), localNameNotFoundException1);
                  localObject2 = null;
                }
              }
            }
            if (i == 1)
            {
              localObject2 = new com/google/android/gms/internal/measurement/zzjx;
              ((zzjx)localObject2).<init>("_fvt", l2, Long.valueOf(l1), "auto");
              zzb((zzjx)localObject2, paramzzdz);
              zzab();
              zzkq();
              localObject6 = new android/os/Bundle;
              ((Bundle)localObject6).<init>();
              ((Bundle)localObject6).putLong("_c", 1L);
              ((Bundle)localObject6).putLong("_r", 1L);
              if ((zzgg().zzaz(paramzzdz.packageName)) && (paramzzdz.zzaeo))
                ((Bundle)localObject6).putLong("_dac", 1L);
              localObject2 = new com/google/android/gms/internal/measurement/zzeu;
              Object localObject4 = new com/google/android/gms/internal/measurement/zzer;
              ((zzer)localObject4).<init>((Bundle)localObject6);
              ((zzeu)localObject2).<init>("_v", (zzer)localObject4, "auto", l2);
              zzb((zzeu)localObject2, paramzzdz);
              continue;
              if (paramzzdz.zzael)
              {
                localObject2 = new android/os/Bundle;
                ((Bundle)localObject2).<init>();
                localObject4 = new com/google/android/gms/internal/measurement/zzeu;
                localObject6 = new com/google/android/gms/internal/measurement/zzer;
                ((zzer)localObject6).<init>((Bundle)localObject2);
                ((zzeu)localObject4).<init>("_cd", (zzer)localObject6, "auto", l2);
                zzb((zzeu)localObject4, paramzzdz);
              }
            }
          }
        }
      }
    }
  }

  public zzeo zzfw()
  {
    AppMethodBeat.i(69447);
    zzeo localzzeo = this.zzacw.zzfw();
    AppMethodBeat.o(69447);
    return localzzeo;
  }

  final void zzg(Runnable paramRunnable)
  {
    AppMethodBeat.i(69465);
    zzab();
    if (this.zzaqi == null)
      this.zzaqi = new ArrayList();
    this.zzaqi.add(paramRunnable);
    AppMethodBeat.o(69465);
  }

  public zzfe zzga()
  {
    AppMethodBeat.i(69443);
    zzfe localzzfe = this.zzacw.zzga();
    AppMethodBeat.o(69443);
    return localzzfe;
  }

  public zzka zzgb()
  {
    AppMethodBeat.i(69446);
    zzka localzzka = this.zzacw.zzgb();
    AppMethodBeat.o(69446);
    return localzzka;
  }

  public zzgg zzgd()
  {
    AppMethodBeat.i(69436);
    zzgg localzzgg = this.zzacw.zzgd();
    AppMethodBeat.o(69436);
    return localzzgg;
  }

  public zzfg zzge()
  {
    AppMethodBeat.i(69435);
    zzfg localzzfg = this.zzacw.zzge();
    AppMethodBeat.o(69435);
    return localzzfg;
  }

  public zzfr zzgf()
  {
    AppMethodBeat.i(69434);
    zzfr localzzfr = this.zzacw.zzgf();
    AppMethodBeat.o(69434);
    return localzzfr;
  }

  public zzef zzgg()
  {
    AppMethodBeat.i(69433);
    zzef localzzef = this.zzacw.zzgg();
    AppMethodBeat.o(69433);
    return localzzef;
  }

  public final String zzh(zzdz paramzzdz)
  {
    AppMethodBeat.i(69483);
    Object localObject = zzgd().zzb(new zzju(this, paramzzdz));
    try
    {
      localObject = (String)((Future)localObject).get(30000L, TimeUnit.MILLISECONDS);
      AppMethodBeat.o(69483);
      paramzzdz = (zzdz)localObject;
      return paramzzdz;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        zzge().zzim().zze("Failed to get app instance id. appId", zzfg.zzbm(paramzzdz.packageName), localInterruptedException);
        paramzzdz = null;
        AppMethodBeat.o(69483);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      break label50;
    }
    catch (TimeoutException localTimeoutException)
    {
      label50: break label50;
    }
  }

  public final zzeb zziw()
  {
    AppMethodBeat.i(69442);
    zza(this.zzaqf);
    zzeb localzzeb = this.zzaqf;
    AppMethodBeat.o(69442);
    return localzzeb;
  }

  public final zzei zzix()
  {
    AppMethodBeat.i(69439);
    zza(this.zzaqc);
    zzei localzzei = this.zzaqc;
    AppMethodBeat.o(69439);
    return localzzei;
  }

  public final zzfk zzkn()
  {
    AppMethodBeat.i(69438);
    zza(this.zzaqb);
    zzfk localzzfk = this.zzaqb;
    AppMethodBeat.o(69438);
    return localzzfk;
  }

  final void zzkq()
  {
    AppMethodBeat.i(69449);
    if (!this.zzvo)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("UploadController is not initialized");
      AppMethodBeat.o(69449);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(69449);
  }

  public final void zzks()
  {
    AppMethodBeat.i(69457);
    zzab();
    zzkq();
    this.zzaqn = true;
    while (true)
    {
      long l1;
      Object localObject4;
      try
      {
        Object localObject1 = this.zzacw.zzfx().zzkf();
        if (localObject1 == null)
        {
          zzge().zzip().log("Upload data called on the client side before use of service was decided");
          return;
        }
        if (((Boolean)localObject1).booleanValue())
        {
          zzge().zzim().log("Upload called in the client side when service should be used");
          this.zzaqn = false;
          zzkv();
          AppMethodBeat.o(69457);
          continue;
        }
        if (this.zzaqh > 0L)
        {
          zzku();
          this.zzaqn = false;
          zzkv();
          AppMethodBeat.o(69457);
          continue;
        }
        zzab();
        if (this.zzaqq != null)
        {
          i = 1;
          if (i == 0)
            continue;
          zzge().zzit().log("Uploading requested multiple times");
          this.zzaqn = false;
          zzkv();
          AppMethodBeat.o(69457);
          continue;
        }
        int i = 0;
        continue;
        if (!zzkn().zzex())
        {
          zzge().zzit().log("Network not connected, ignoring upload request");
          zzku();
          this.zzaqn = false;
          zzkv();
          AppMethodBeat.o(69457);
          continue;
        }
        l1 = zzbt().currentTimeMillis();
        zzd(null, l1 - zzef.zzhi());
        long l2 = zzgf().zzaju.get();
        if (l2 != 0L)
          zzge().zzis().zzg("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(l1 - l2)));
        String str = zzix().zzhn();
        if (!TextUtils.isEmpty(str))
        {
          if (this.zzaqs == -1L)
            this.zzaqs = zzix().zzhu();
          i = zzgg().zzb(str, zzew.zzago);
          int j = Math.max(0, zzgg().zzb(str, zzew.zzagp));
          localObject4 = zzix().zzb(str, i, j);
          Object localObject5;
          Object localObject6;
          byte[] arrayOfByte;
          if (!((List)localObject4).isEmpty())
          {
            localObject1 = ((List)localObject4).iterator();
            if (!((Iterator)localObject1).hasNext())
              break label1090;
            localObject5 = (zzkq)((Pair)((Iterator)localObject1).next()).first;
            if (TextUtils.isEmpty(((zzkq)localObject5).zzatv))
              continue;
            localObject1 = ((zzkq)localObject5).zzatv;
            if (localObject1 == null)
              break label1084;
            i = 0;
            if (i >= ((List)localObject4).size())
              break label1084;
            localObject5 = (zzkq)((Pair)((List)localObject4).get(i)).first;
            if ((!TextUtils.isEmpty(((zzkq)localObject5).zzatv)) && (!((zzkq)localObject5).zzatv.equals(localObject1)))
            {
              localObject1 = ((List)localObject4).subList(0, i);
              localObject6 = new com/google/android/gms/internal/measurement/zzkp;
              ((zzkp)localObject6).<init>();
              ((zzkp)localObject6).zzatf = new zzkq[((List)localObject1).size()];
              localObject4 = new java/util/ArrayList;
              ((ArrayList)localObject4).<init>(((List)localObject1).size());
              if ((zzef.zzhk()) && (zzgg().zzat(str)))
              {
                i = 1;
                j = 0;
                if (j >= ((zzkp)localObject6).zzatf.length)
                  continue;
                ((zzkp)localObject6).zzatf[j] = ((zzkq)((Pair)((List)localObject1).get(j)).first);
                ((List)localObject4).add((Long)((Pair)((List)localObject1).get(j)).second);
                localObject6.zzatf[j].zzatu = Long.valueOf(12451L);
                localObject6.zzatf[j].zzatk = Long.valueOf(l1);
                localObject6.zzatf[j].zzatz = Boolean.FALSE;
                if (i == 0)
                  localObject6.zzatf[j].zzauh = null;
                j++;
                continue;
              }
            }
            else
            {
              i++;
              continue;
            }
            i = 0;
            continue;
            if (!zzge().isLoggable(2))
              break label1079;
            localObject1 = zzga().zza((zzkp)localObject6);
            arrayOfByte = zzgb().zzb((zzkp)localObject6);
            localObject5 = (String)zzew.zzagy.get();
          }
          try
          {
            URL localURL = new java/net/URL;
            localURL.<init>((String)localObject5);
            if (!((List)localObject4).isEmpty())
            {
              bool = true;
              Preconditions.checkArgument(bool);
              if (this.zzaqq == null)
                continue;
              zzge().zzim().log("Set uploading progress before finishing the previous upload");
              zzgf().zzajv.set(l1);
              localObject4 = "?";
              if (((zzkp)localObject6).zzatf.length > 0)
                localObject4 = localObject6.zzatf[0].zzti;
              zzge().zzit().zzd("Uploading data. app, uncompressed size, data", localObject4, Integer.valueOf(arrayOfByte.length), localObject1);
              this.zzaqm = true;
              localObject1 = zzkn();
              localObject6 = new com/google/android/gms/internal/measurement/zzjs;
              ((zzjs)localObject6).<init>(this, str);
              ((zzhg)localObject1).zzab();
              ((zzjq)localObject1).zzch();
              Preconditions.checkNotNull(localURL);
              Preconditions.checkNotNull(arrayOfByte);
              Preconditions.checkNotNull(localObject6);
              localObject7 = ((zzhg)localObject1).zzgd();
              localObject4 = new com/google/android/gms/internal/measurement/zzfo;
              ((zzfo)localObject4).<init>((zzfk)localObject1, str, localURL, arrayOfByte, null, (zzfm)localObject6);
              ((zzgg)localObject7).zzd((Runnable)localObject4);
              this.zzaqn = false;
              zzkv();
              AppMethodBeat.o(69457);
              continue;
            }
            boolean bool = false;
            continue;
            Object localObject7 = new java/util/ArrayList;
            ((ArrayList)localObject7).<init>((Collection)localObject4);
            this.zzaqq = ((List)localObject7);
            continue;
          }
          catch (MalformedURLException localMalformedURLException)
          {
            zzge().zzim().zze("Failed to parse upload URL. Not uploading. appId", zzfg.zzbm(str), localObject5);
            continue;
          }
        }
      }
      finally
      {
        this.zzaqn = false;
        zzkv();
        AppMethodBeat.o(69457);
      }
      this.zzaqs = -1L;
      Object localObject3 = zzix().zzab(l1 - zzef.zzhi());
      if (!TextUtils.isEmpty((CharSequence)localObject3))
      {
        localObject3 = zzix().zzbc((String)localObject3);
        if (localObject3 != null)
        {
          zzb((zzdy)localObject3);
          continue;
          label1079: localObject3 = null;
          continue;
          label1084: localObject3 = localObject4;
          continue;
          label1090: localObject3 = null;
        }
      }
    }
  }

  final void zzkx()
  {
    AppMethodBeat.i(69471);
    zzab();
    zzkq();
    int i;
    int j;
    if (!this.zzaqg)
    {
      zzge().zzir().log("This instance being marked as an uploader");
      zzab();
      zzkq();
      if ((zzky()) && (zzkw()))
      {
        i = zza(this.zzaqp);
        j = this.zzacw.zzfv().zzij();
        zzab();
        if (i <= j)
          break label122;
        zzge().zzim().zze("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(j));
      }
    }
    while (true)
    {
      this.zzaqg = true;
      zzku();
      AppMethodBeat.o(69471);
      return;
      label122: if (i < j)
        if (zza(j, this.zzaqp))
          zzge().zzit().zze("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(j));
        else
          zzge().zzim().zze("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(j));
    }
  }

  final void zzkz()
  {
    this.zzaqk += 1;
  }

  final zzgl zzla()
  {
    return this.zzacw;
  }

  public final void zzm(boolean paramBoolean)
  {
    AppMethodBeat.i(69484);
    zzku();
    AppMethodBeat.o(69484);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjr
 * JD-Core Version:    0.6.2
 */