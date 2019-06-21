package com.google.android.gms.gcm;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class GcmTaskService$zze
  implements Runnable
{
  private final Bundle extras;
  private final String tag;
  private final zzg zzaa;
  private final Messenger zzab;
  private final List<Uri> zzz;

  GcmTaskService$zze(String paramString, IBinder paramIBinder, Bundle paramBundle, List<Uri> paramList)
  {
    AppMethodBeat.i(69956);
    this.tag = paramIBinder;
    if (paramBundle == null)
      paramString = null;
    while (true)
    {
      this.zzaa = paramString;
      this.extras = paramList;
      Object localObject;
      this.zzz = localObject;
      this.zzab = null;
      AppMethodBeat.o(69956);
      return;
      paramString = paramBundle.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
      if ((paramString instanceof zzg))
        paramString = (zzg)paramString;
      else
        paramString = new zzh(paramBundle);
    }
  }

  GcmTaskService$zze(String paramString, Messenger paramMessenger, Bundle paramBundle, List<Uri> paramList)
  {
    this.tag = paramMessenger;
    this.zzab = paramBundle;
    this.extras = paramList;
    Object localObject;
    this.zzz = localObject;
    this.zzaa = null;
  }

  private final void zze(int paramInt)
  {
    AppMethodBeat.i(69958);
    Object localObject1 = GcmTaskService.zzd(this.zzy);
    try
    {
      boolean bool = GcmTaskService.zzf(this.zzy).zzf(this.tag, GcmTaskService.zze(this.zzy).getClassName());
      if (!bool);
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        Messenger localMessenger;
        Message localMessage;
        Bundle localBundle;
        String str;
        new String("Error reporting result of operation to scheduler for ");
      }
    }
    finally
    {
      GcmTaskService.zzf(this.zzy).zze(this.tag, GcmTaskService.zze(this.zzy).getClassName());
      if ((!zzf()) && (!GcmTaskService.zzf(this.zzy).zzf(GcmTaskService.zze(this.zzy).getClassName())))
        this.zzy.stopSelf(GcmTaskService.zzg(this.zzy));
      AppMethodBeat.o(69958);
    }
  }

  private final boolean zzf()
  {
    if (this.zzab != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void run()
  {
    AppMethodBeat.i(69957);
    TaskParams localTaskParams = new TaskParams(this.tag, this.extras, this.zzz);
    zze(this.zzy.onRunTask(localTaskParams));
    AppMethodBeat.o(69957);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.GcmTaskService.zze
 * JD-Core Version:    0.6.2
 */