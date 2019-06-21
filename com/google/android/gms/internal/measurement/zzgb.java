package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzgb
{
  private final zzge zzala;

  public zzgb(zzge paramzzge)
  {
    AppMethodBeat.i(68981);
    Preconditions.checkNotNull(paramzzge);
    this.zzala = paramzzge;
    AppMethodBeat.o(68981);
  }

  public static boolean zza(Context paramContext)
  {
    boolean bool1 = false;
    AppMethodBeat.i(68982);
    Preconditions.checkNotNull(paramContext);
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null)
        AppMethodBeat.o(68982);
      while (true)
      {
        return bool1;
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(paramContext, "com.google.android.gms.measurement.AppMeasurementReceiver");
        paramContext = localPackageManager.getReceiverInfo(localComponentName, 0);
        if (paramContext == null)
          break;
        boolean bool2 = paramContext.enabled;
        if (!bool2)
          break;
        bool1 = true;
        AppMethodBeat.o(68982);
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
        AppMethodBeat.o(68982);
    }
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(68983);
    zzgl localzzgl = zzgl.zzg(paramContext);
    zzfg localzzfg = localzzgl.zzge();
    if (paramIntent == null)
    {
      localzzfg.zzip().log("Receiver called with null intent");
      AppMethodBeat.o(68983);
    }
    while (true)
    {
      return;
      Object localObject1 = paramIntent.getAction();
      localzzfg.zzit().zzg("Local receiver got", localObject1);
      if ("com.google.android.gms.measurement.UPLOAD".equals(localObject1))
      {
        paramIntent = new Intent().setClassName(paramContext, "com.google.android.gms.measurement.AppMeasurementService");
        paramIntent.setAction("com.google.android.gms.measurement.UPLOAD");
        localzzfg.zzit().log("Starting wakeful intent.");
        this.zzala.doStartService(paramContext, paramIntent);
        AppMethodBeat.o(68983);
      }
      else if ("com.android.vending.INSTALL_REFERRER".equals(localObject1))
      {
        try
        {
          localObject1 = localzzgl.zzgd();
          localObject3 = new com/google/android/gms/internal/measurement/zzgc;
          ((zzgc)localObject3).<init>(this, localzzgl, localzzfg);
          ((zzgg)localObject1).zzc((Runnable)localObject3);
          localPendingResult = this.zzala.doGoAsync();
          localObject3 = paramIntent.getStringExtra("referrer");
          if (localObject3 == null)
          {
            localzzfg.zzit().log("Install referrer extras are null");
            if (localPendingResult != null)
              localPendingResult.finish();
            AppMethodBeat.o(68983);
          }
        }
        catch (Exception localException)
        {
          Object localObject3;
          BroadcastReceiver.PendingResult localPendingResult;
          while (true)
            localzzfg.zzip().zzg("Install Referrer Reporter encountered a problem", localException);
          localzzfg.zzir().zzg("Install referrer extras are", localObject3);
          Object localObject2 = localObject3;
          if (!((String)localObject3).contains("?"))
          {
            localObject2 = String.valueOf(localObject3);
            if (((String)localObject2).length() == 0)
              break label321;
          }
          label321: for (localObject2 = "?".concat((String)localObject2); ; localObject2 = new String("?"))
          {
            localObject2 = Uri.parse((String)localObject2);
            localObject2 = localzzgl.zzgb().zza((Uri)localObject2);
            if (localObject2 != null)
              break label335;
            localzzfg.zzit().log("No campaign defined in install referrer broadcast");
            if (localPendingResult == null)
              break label390;
            localPendingResult.finish();
            AppMethodBeat.o(68983);
            break;
          }
          label335: long l = 1000L * paramIntent.getLongExtra("referrer_timestamp_seconds", 0L);
          if (l == 0L)
            localzzfg.zzip().log("Install referrer is missing timestamp");
          localzzgl.zzgd().zzc(new zzgd(this, localzzgl, l, (Bundle)localObject2, paramContext, localzzfg, localPendingResult));
        }
      }
      else
      {
        label390: AppMethodBeat.o(68983);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgb
 * JD-Core Version:    0.6.2
 */