package com.google.android.gms.gcm;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.google.android.gms.iid.zze;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Deprecated
public class GcmListenerService extends zze
{
  static void zzd(Bundle paramBundle)
  {
    AppMethodBeat.i(69934);
    paramBundle = paramBundle.keySet().iterator();
    while (paramBundle.hasNext())
    {
      String str = (String)paramBundle.next();
      if ((str != null) && (str.startsWith("google.c.")))
        paramBundle.remove();
    }
    AppMethodBeat.o(69934);
  }

  public void handleIntent(Intent paramIntent)
  {
    AppMethodBeat.i(69933);
    if (!"com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction()))
    {
      paramIntent = String.valueOf(paramIntent.getAction());
      if (paramIntent.length() != 0)
      {
        "Unknown intent action: ".concat(paramIntent);
        AppMethodBeat.o(69933);
      }
    }
    while (true)
    {
      label44: return;
      new String("Unknown intent action: ");
      AppMethodBeat.o(69933);
      continue;
      Object localObject1 = paramIntent.getStringExtra("message_type");
      Object localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = "gcm";
      int i = -1;
      switch (((String)localObject2).hashCode())
      {
      default:
      case 102161:
      case -2062414158:
      case 814800675:
      case 814694033:
      }
      while (true)
        switch (i)
        {
        default:
          paramIntent = String.valueOf(localObject2);
          if (paramIntent.length() == 0)
            break label671;
          "Received message with unknown type: ".concat(paramIntent);
          AppMethodBeat.o(69933);
          break label44;
          if (((String)localObject2).equals("gcm"))
          {
            i = 0;
            continue;
            if (((String)localObject2).equals("deleted_messages"))
            {
              i = 1;
              continue;
              if (((String)localObject2).equals("send_event"))
              {
                i = 2;
                continue;
                if (((String)localObject2).equals("send_error"))
                  i = 3;
              }
            }
          }
          break;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      localObject1 = paramIntent.getExtras();
      ((Bundle)localObject1).remove("message_type");
      ((Bundle)localObject1).remove("android.support.content.wakelockid");
      if (("1".equals(zzd.zzd((Bundle)localObject1, "gcm.n.e"))) || (zzd.zzd((Bundle)localObject1, "gcm.n.icon") != null))
      {
        i = 1;
        label290: if (i == 0)
          break label571;
        if (((KeyguardManager)getSystemService("keyguard")).inKeyguardRestrictedInputMode())
          break label413;
        i = Process.myPid();
        paramIntent = ((ActivityManager)getSystemService("activity")).getRunningAppProcesses();
        if (paramIntent == null)
          break label413;
        localObject2 = paramIntent.iterator();
        while (true)
          if (((Iterator)localObject2).hasNext())
          {
            paramIntent = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject2).next();
            if (paramIntent.pid == i)
              if (paramIntent.importance == 100)
                i = 1;
          }
      }
      while (true)
      {
        if (i != 0)
          break label419;
        zzd.zzd(this).zze((Bundle)localObject1);
        AppMethodBeat.o(69933);
        break;
        i = 0;
        break label290;
        i = 0;
        continue;
        label413: i = 0;
      }
      label419: Bundle localBundle = new Bundle();
      Iterator localIterator = ((Bundle)localObject1).keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        String str = ((Bundle)localObject1).getString((String)localObject2);
        paramIntent = (Intent)localObject2;
        if (((String)localObject2).startsWith("gcm.notification."))
          paramIntent = ((String)localObject2).replace("gcm.notification.", "gcm.n.");
        if (paramIntent.startsWith("gcm.n."))
        {
          if (!"gcm.n.e".equals(paramIntent))
            localBundle.putString(paramIntent.substring(6), str);
          localIterator.remove();
        }
      }
      paramIntent = localBundle.getString("sound2");
      if (paramIntent != null)
      {
        localBundle.remove("sound2");
        localBundle.putString("sound", paramIntent);
      }
      if (!localBundle.isEmpty())
        ((Bundle)localObject1).putBundle("notification", localBundle);
      label571: paramIntent = ((Bundle)localObject1).getString("from");
      ((Bundle)localObject1).remove("from");
      zzd((Bundle)localObject1);
      onMessageReceived(paramIntent, (Bundle)localObject1);
      AppMethodBeat.o(69933);
      continue;
      onDeletedMessages();
      AppMethodBeat.o(69933);
      continue;
      onMessageSent(paramIntent.getStringExtra("google.message_id"));
      AppMethodBeat.o(69933);
      continue;
      localObject1 = paramIntent.getStringExtra("google.message_id");
      localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = paramIntent.getStringExtra("message_id");
      onSendError((String)localObject2, paramIntent.getStringExtra("error"));
      AppMethodBeat.o(69933);
      continue;
      label671: new String("Received message with unknown type: ");
      AppMethodBeat.o(69933);
    }
  }

  public void onDeletedMessages()
  {
  }

  public void onMessageReceived(String paramString, Bundle paramBundle)
  {
  }

  public void onMessageSent(String paramString)
  {
  }

  public void onSendError(String paramString1, String paramString2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.GcmListenerService
 * JD-Core Version:    0.6.2
 */