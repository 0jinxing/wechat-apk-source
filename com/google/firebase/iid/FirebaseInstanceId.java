package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public class FirebaseInstanceId
{
  private static final long bvp;
  static p bvq;

  @VisibleForTesting
  @GuardedBy("FirebaseInstanceId.class")
  private static ScheduledThreadPoolExecutor bvr;
  final a bvs;
  final f bvt;
  final ae bvu;
  final i bvv;

  @GuardedBy("this")
  private boolean bvw;

  @GuardedBy("this")
  private boolean bvx;

  static
  {
    AppMethodBeat.i(108706);
    bvp = TimeUnit.HOURS.toSeconds(8L);
    AppMethodBeat.o(108706);
  }

  FirebaseInstanceId(a parama)
  {
    this(parama, new f(parama.getApplicationContext()));
    AppMethodBeat.i(108690);
    AppMethodBeat.o(108690);
  }

  private FirebaseInstanceId(a parama, f paramf)
  {
    AppMethodBeat.i(108691);
    this.bvv = new i();
    this.bvw = false;
    if (f.b(parama) == null)
    {
      parama = new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
      AppMethodBeat.o(108691);
      throw parama;
    }
    try
    {
      if (bvq == null)
      {
        p localp = new com/google/firebase/iid/p;
        localp.<init>(parama.getApplicationContext());
        bvq = localp;
      }
      this.bvs = parama;
      this.bvt = paramf;
      this.bvu = new ab(parama, this, paramf);
      this.bvx = uJ();
      if (uL())
        uE();
      AppMethodBeat.o(108691);
      return;
    }
    finally
    {
      AppMethodBeat.o(108691);
    }
    throw parama;
  }

  static <T> T a(Task<T> paramTask)
  {
    AppMethodBeat.i(108699);
    try
    {
      paramTask = Tasks.await(paramTask);
      AppMethodBeat.o(108699);
      return paramTask;
    }
    catch (ExecutionException paramTask)
    {
      Throwable localThrowable = paramTask.getCause();
      if ((localThrowable instanceof IOException))
      {
        paramTask = (IOException)localThrowable;
        AppMethodBeat.o(108699);
        throw paramTask;
      }
      if ((localThrowable instanceof RuntimeException))
      {
        paramTask = new IOException(localThrowable);
        AppMethodBeat.o(108699);
        throw paramTask;
      }
      paramTask = new IOException(paramTask);
      AppMethodBeat.o(108699);
      throw paramTask;
    }
    catch (InterruptedException paramTask)
    {
      paramTask = new IOException("SERVICE_NOT_AVAILABLE");
      AppMethodBeat.o(108699);
    }
    throw paramTask;
  }

  static void c(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(108695);
    try
    {
      if (bvr == null)
      {
        ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        localScheduledThreadPoolExecutor.<init>(1);
        bvr = localScheduledThreadPoolExecutor;
      }
      bvr.schedule(paramRunnable, paramLong, TimeUnit.SECONDS);
      return;
    }
    finally
    {
      AppMethodBeat.o(108695);
    }
    throw paramRunnable;
  }

  @Keep
  public static FirebaseInstanceId getInstance(a parama)
  {
    try
    {
      AppMethodBeat.i(108689);
      parama = (FirebaseInstanceId)parama.x(FirebaseInstanceId.class);
      AppMethodBeat.o(108689);
      return parama;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public static FirebaseInstanceId uD()
  {
    AppMethodBeat.i(108688);
    FirebaseInstanceId localFirebaseInstanceId = getInstance(a.ut());
    AppMethodBeat.o(108688);
    return localFirebaseInstanceId;
  }

  static p uG()
  {
    return bvq;
  }

  static boolean uH()
  {
    AppMethodBeat.i(108701);
    boolean bool;
    if ((Log.isLoggable("FirebaseInstanceId", 3)) || ((Build.VERSION.SDK_INT == 23) && (Log.isLoggable("FirebaseInstanceId", 3))))
    {
      bool = true;
      AppMethodBeat.o(108701);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(108701);
    }
  }

  private final boolean uJ()
  {
    AppMethodBeat.i(108703);
    Object localObject1 = this.bvs.getApplicationContext();
    Object localObject2 = ((Context)localObject1).getSharedPreferences("com.google.firebase.messaging", 0);
    boolean bool;
    if (((SharedPreferences)localObject2).contains("auto_init"))
    {
      bool = ((SharedPreferences)localObject2).getBoolean("auto_init", true);
      AppMethodBeat.o(108703);
    }
    while (true)
    {
      return bool;
      try
      {
        localObject2 = ((Context)localObject1).getPackageManager();
        if (localObject2 != null)
        {
          localObject1 = ((PackageManager)localObject2).getApplicationInfo(((Context)localObject1).getPackageName(), 128);
          if ((localObject1 != null) && (((ApplicationInfo)localObject1).metaData != null) && (((ApplicationInfo)localObject1).metaData.containsKey("firebase_messaging_auto_init_enabled")))
          {
            bool = ((ApplicationInfo)localObject1).metaData.getBoolean("firebase_messaging_auto_init_enabled");
            AppMethodBeat.o(108703);
          }
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        bool = uK();
        AppMethodBeat.o(108703);
      }
    }
  }

  private final boolean uK()
  {
    boolean bool = true;
    AppMethodBeat.i(108704);
    try
    {
      Class.forName("com.google.firebase.messaging.a");
      AppMethodBeat.o(108704);
      return bool;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        Object localObject = this.bvs.getApplicationContext();
        Intent localIntent = new Intent("com.google.firebase.MESSAGING_EVENT");
        localIntent.setPackage(((Context)localObject).getPackageName());
        localObject = ((Context)localObject).getPackageManager().resolveService(localIntent, 0);
        if ((localObject != null) && (((ResolveInfo)localObject).serviceInfo != null))
        {
          AppMethodBeat.o(108704);
        }
        else
        {
          AppMethodBeat.o(108704);
          bool = false;
        }
      }
    }
  }

  @VisibleForTesting
  private boolean uL()
  {
    try
    {
      boolean bool = this.bvx;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static String zzf()
  {
    AppMethodBeat.i(108696);
    String str = f.a(bvq.aY("").bwM);
    AppMethodBeat.o(108696);
    return str;
  }

  final String b(String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(108700);
    ab localab = (ab)this.bvu;
    localab.c(paramString1, paramString2, paramBundle);
    paramString1 = localab.h(localab.bwH.f(paramBundle));
    AppMethodBeat.o(108700);
    return paramString1;
  }

  public final String getToken()
  {
    AppMethodBeat.i(108697);
    Object localObject = uF();
    if ((localObject == null) || (((q)localObject).bb(this.bvt.uO())))
      startSync();
    if (localObject != null)
    {
      localObject = ((q)localObject).bwe;
      AppMethodBeat.o(108697);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(108697);
    }
  }

  final void startSync()
  {
    try
    {
      AppMethodBeat.i(108693);
      if (!this.bvw)
        zza(0L);
      AppMethodBeat.o(108693);
      return;
    }
    finally
    {
    }
  }

  public final void uE()
  {
    AppMethodBeat.i(108692);
    q localq = uF();
    if ((localq == null) || (localq.bb(this.bvt.uO())) || (bvq.uT() != null))
      startSync();
    AppMethodBeat.o(108692);
  }

  final q uF()
  {
    AppMethodBeat.i(108698);
    q localq = bvq.d("", f.b(this.bvs), "*");
    AppMethodBeat.o(108698);
    return localq;
  }

  final void uI()
  {
    try
    {
      AppMethodBeat.i(108702);
      bvq.zzag();
      if (uL())
        startSync();
      AppMethodBeat.o(108702);
      return;
    }
    finally
    {
    }
  }

  @VisibleForTesting
  public final void uM()
  {
    try
    {
      AppMethodBeat.i(108705);
      SharedPreferences.Editor localEditor = this.bvs.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
      localEditor.putBoolean("auto_init", true);
      localEditor.apply();
      if (!this.bvx)
        uE();
      this.bvx = true;
      AppMethodBeat.o(108705);
      return;
    }
    finally
    {
    }
  }

  final void zza(long paramLong)
  {
    try
    {
      AppMethodBeat.i(108694);
      long l = Math.min(Math.max(30L, paramLong << 1), bvp);
      r localr = new com/google/firebase/iid/r;
      localr.<init>(this, this.bvt, l);
      c(localr, paramLong);
      this.bvw = true;
      AppMethodBeat.o(108694);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final void zza(boolean paramBoolean)
  {
    try
    {
      this.bvw = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.FirebaseInstanceId
 * JD-Core Version:    0.6.2
 */