package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@TargetApi(21)
@VisibleForTesting
final class GcmTaskService$zzd extends Handler
{
  GcmTaskService$zzd(GcmTaskService paramGcmTaskService, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(69955);
    if (!UidVerifier.uidHasPackageName(this.zzy, paramMessage.sendingUid, "com.google.android.gms"))
      AppMethodBeat.o(69955);
    while (true)
    {
      return;
      switch (paramMessage.what)
      {
      case 3:
      default:
        paramMessage = String.valueOf(paramMessage);
        new StringBuilder(String.valueOf(paramMessage).length() + 31).append("Unrecognized message received: ").append(paramMessage);
        AppMethodBeat.o(69955);
        break;
      case 1:
        Bundle localBundle = paramMessage.getData();
        if (!localBundle.isEmpty())
        {
          Messenger localMessenger = paramMessage.replyTo;
          if (localMessenger != null)
          {
            paramMessage = localBundle.getString("tag");
            ArrayList localArrayList = localBundle.getParcelableArrayList("triggered_uris");
            if (!GcmTaskService.zzd(this.zzy, paramMessage))
            {
              localBundle = localBundle.getBundle("extras");
              paramMessage = new GcmTaskService.zze(this.zzy, paramMessage, localMessenger, localBundle, localArrayList);
              GcmTaskService.zzd(this.zzy, paramMessage);
            }
          }
        }
        AppMethodBeat.o(69955);
        break;
      case 2:
        if (Log.isLoggable("GcmTaskService", 3))
        {
          paramMessage = String.valueOf(paramMessage);
          new StringBuilder(String.valueOf(paramMessage).length() + 45).append("ignoring unimplemented stop message for now: ").append(paramMessage);
        }
        AppMethodBeat.o(69955);
        break;
      case 4:
        this.zzy.onInitializeTasks();
        AppMethodBeat.o(69955);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.GcmTaskService.zzd
 * JD-Core Version:    0.6.2
 */