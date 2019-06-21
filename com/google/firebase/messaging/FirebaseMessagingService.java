package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.ai;
import com.google.firebase.iid.o;
import com.google.firebase.iid.zzb;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseMessagingService extends zzb
{
  private static final Queue<String> bxc;

  static
  {
    AppMethodBeat.i(77214);
    bxc = new ArrayDeque(10);
    AppMethodBeat.o(77214);
  }

  static void i(Bundle paramBundle)
  {
    AppMethodBeat.i(77212);
    paramBundle = paramBundle.keySet().iterator();
    while (paramBundle.hasNext())
    {
      String str = (String)paramBundle.next();
      if ((str != null) && (str.startsWith("google.c.")))
        paramBundle.remove();
    }
    AppMethodBeat.o(77212);
  }

  static boolean j(Bundle paramBundle)
  {
    AppMethodBeat.i(77213);
    boolean bool;
    if (paramBundle == null)
    {
      bool = false;
      AppMethodBeat.o(77213);
    }
    while (true)
    {
      return bool;
      bool = "1".equals(paramBundle.getString("google.c.a.e"));
      AppMethodBeat.o(77213);
    }
  }

  public void a(RemoteMessage paramRemoteMessage)
  {
  }

  public void a(String paramString, Exception paramException)
  {
  }

  public final Intent f(Intent paramIntent)
  {
    AppMethodBeat.i(77209);
    paramIntent = (Intent)o.uS().bvZ.poll();
    AppMethodBeat.o(77209);
    return paramIntent;
  }

  public final void g(Intent paramIntent)
  {
    int i = -1;
    int j = 0;
    AppMethodBeat.i(77211);
    Object localObject1 = paramIntent.getAction();
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = "";
    int k;
    switch (((String)localObject2).hashCode())
    {
    default:
      k = -1;
      switch (k)
      {
      default:
        label63: paramIntent = String.valueOf(paramIntent.getAction());
        if (paramIntent.length() != 0)
        {
          "Unknown intent action: ".concat(paramIntent);
          AppMethodBeat.o(77211);
        }
        break;
      case 0:
      case 1:
      }
      break;
    case 366519424:
    case 75300319:
    }
    while (true)
    {
      return;
      if (!((String)localObject2).equals("com.google.android.c2dm.intent.RECEIVE"))
        break;
      k = 0;
      break label63;
      if (!((String)localObject2).equals("com.google.firebase.messaging.NOTIFICATION_DISMISS"))
        break;
      k = 1;
      break label63;
      localObject1 = paramIntent.getStringExtra("google.message_id");
      label170: label181: Object localObject3;
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        localObject2 = Tasks.forResult(null);
        if (!TextUtils.isEmpty((CharSequence)localObject1))
          break label378;
        k = 0;
        if (k == 0)
        {
          localObject3 = paramIntent.getStringExtra("message_type");
          localObject1 = localObject3;
          if (localObject3 == null)
            localObject1 = "gcm";
          switch (((String)localObject1).hashCode())
          {
          default:
            k = i;
            switch (k)
            {
            default:
              label259: paramIntent = String.valueOf(localObject1);
              if (paramIntent.length() != 0)
                "Received message with unknown type: ".concat(paramIntent);
              break;
            case 0:
            case 1:
            case 2:
            case 3:
            }
            break;
          case 102161:
          case -2062414158:
          case 814800675:
          case 814694033:
          }
        }
      }
      try
      {
        while (true)
        {
          Tasks.await((Task)localObject2, 1L, TimeUnit.SECONDS);
          AppMethodBeat.o(77211);
          break;
          localObject3 = new Bundle();
          ((Bundle)localObject3).putString("google.message_id", (String)localObject1);
          localObject2 = ai.ar(this);
          localObject2 = ((ai)localObject2).a(new com.google.firebase.iid.b(((ai)localObject2).uX(), (Bundle)localObject3));
          break label170;
          label378: if (bxc.contains(localObject1))
          {
            if (Log.isLoggable("FirebaseMessaging", 3))
            {
              localObject1 = String.valueOf(localObject1);
              if (((String)localObject1).length() == 0)
                break label429;
              "Received duplicate message: ".concat((String)localObject1);
            }
            while (true)
            {
              k = 1;
              break;
              new String("Received duplicate message: ");
            }
          }
          label429: if (bxc.size() >= 10)
            bxc.remove();
          bxc.add(localObject1);
          k = 0;
          break label181;
          k = i;
          if (!((String)localObject1).equals("gcm"))
            break label259;
          k = 0;
          break label259;
          k = i;
          if (!((String)localObject1).equals("deleted_messages"))
            break label259;
          k = 1;
          break label259;
          k = i;
          if (!((String)localObject1).equals("send_event"))
            break label259;
          k = 2;
          break label259;
          k = i;
          if (!((String)localObject1).equals("send_error"))
            break label259;
          k = 3;
          break label259;
          if (j(paramIntent.getExtras()))
            d.a("_nr", paramIntent);
          localObject3 = paramIntent.getExtras();
          localObject1 = localObject3;
          if (localObject3 == null)
            localObject1 = new Bundle();
          ((Bundle)localObject1).remove("android.support.content.wakelockid");
          if (!"1".equals(c.d((Bundle)localObject1, "gcm.n.e")))
          {
            k = j;
            if (c.d((Bundle)localObject1, "gcm.n.icon") == null);
          }
          else
          {
            k = 1;
          }
          if (k != 0)
          {
            if (!c.as(this).k((Bundle)localObject1))
              if (j((Bundle)localObject1))
                d.a("_nf", paramIntent);
          }
          else
          {
            a(new RemoteMessage((Bundle)localObject1));
            continue;
            onDeletedMessages();
            continue;
            paramIntent.getStringExtra("google.message_id");
            continue;
            localObject3 = paramIntent.getStringExtra("google.message_id");
            localObject1 = localObject3;
            if (localObject3 == null)
              localObject1 = paramIntent.getStringExtra("message_id");
            a((String)localObject1, new b(paramIntent.getStringExtra("error")));
            continue;
            new String("Received message with unknown type: ");
          }
        }
      }
      catch (InterruptedException paramIntent)
      {
        paramIntent = String.valueOf(paramIntent);
        new StringBuilder(String.valueOf(paramIntent).length() + 20).append("Message ack failed: ").append(paramIntent);
        AppMethodBeat.o(77211);
        continue;
        if (j(paramIntent.getExtras()))
        {
          d.a("_nd", paramIntent);
          AppMethodBeat.o(77211);
          continue;
          new String("Unknown intent action: ");
        }
        AppMethodBeat.o(77211);
      }
      catch (ExecutionException paramIntent)
      {
        break label763;
      }
      catch (TimeoutException paramIntent)
      {
        label763: break label763;
      }
    }
  }

  public final boolean i(Intent paramIntent)
  {
    AppMethodBeat.i(77210);
    Object localObject;
    if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(paramIntent.getAction()))
    {
      localObject = (PendingIntent)paramIntent.getParcelableExtra("pending_intent");
      if (localObject == null);
    }
    try
    {
      ((PendingIntent)localObject).send();
      label38: boolean bool;
      if (j(paramIntent.getExtras()))
      {
        if (paramIntent != null)
        {
          if (!"1".equals(paramIntent.getStringExtra("google.c.a.tc")))
            break label185;
          localObject = (com.google.firebase.analytics.connector.a)com.google.firebase.a.ut().x(com.google.firebase.analytics.connector.a.class);
          Log.isLoggable("FirebaseMessaging", 3);
          if (localObject != null)
          {
            String str = paramIntent.getStringExtra("google.c.a.c_id");
            ((com.google.firebase.analytics.connector.a)localObject).setUserProperty("fcm", "_ln", str);
            Bundle localBundle = new Bundle();
            localBundle.putString("source", "Firebase");
            localBundle.putString("medium", "notification");
            localBundle.putString("campaign", str);
            ((com.google.firebase.analytics.connector.a)localObject).logEvent("fcm", "_cmp", localBundle);
          }
        }
        d.a("_no", paramIntent);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(77210);
      }
      while (true)
      {
        return bool;
        label185: Log.isLoggable("FirebaseMessaging", 3);
        break;
        bool = false;
        AppMethodBeat.o(77210);
      }
    }
    catch (PendingIntent.CanceledException localCanceledException)
    {
      break label38;
    }
  }

  public void onDeletedMessages()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.firebase.messaging.FirebaseMessagingService
 * JD-Core Version:    0.6.2
 */