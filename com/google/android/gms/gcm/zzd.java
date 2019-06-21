package com.google.android.gms.gcm;

import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.v.c;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

final class zzd
{
  static zzd zzj;
  private final Context zzk;
  private String zzl;
  private final AtomicInteger zzm;

  private zzd(Context paramContext)
  {
    AppMethodBeat.i(70023);
    this.zzm = new AtomicInteger((int)SystemClock.elapsedRealtime());
    this.zzk = paramContext.getApplicationContext();
    AppMethodBeat.o(70023);
  }

  static zzd zzd(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(70021);
      if (zzj == null)
      {
        zzd localzzd = new com/google/android/gms/gcm/zzd;
        localzzd.<init>(paramContext);
        zzj = localzzd;
      }
      paramContext = zzj;
      AppMethodBeat.o(70021);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  static String zzd(Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(70022);
    String str1 = paramBundle.getString(paramString);
    String str2 = str1;
    if (str1 == null)
      str2 = paramBundle.getString(paramString.replace("gcm.n.", "gcm.notification."));
    AppMethodBeat.o(70022);
    return str2;
  }

  private final Bundle zze()
  {
    AppMethodBeat.i(70026);
    Object localObject = null;
    try
    {
      ApplicationInfo localApplicationInfo = this.zzk.getPackageManager().getApplicationInfo(this.zzk.getPackageName(), 128);
      localObject = localApplicationInfo;
      label30: if ((localObject != null) && (((ApplicationInfo)localObject).metaData != null))
      {
        localObject = ((ApplicationInfo)localObject).metaData;
        AppMethodBeat.o(70026);
      }
      while (true)
      {
        return localObject;
        localObject = Bundle.EMPTY;
        AppMethodBeat.o(70026);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label30;
    }
  }

  private final String zze(Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(70025);
    String str1 = zzd(paramBundle, paramString);
    if (!TextUtils.isEmpty(str1))
    {
      AppMethodBeat.o(70025);
      paramBundle = str1;
    }
    while (true)
    {
      return paramBundle;
      str1 = String.valueOf(paramString);
      String str2 = String.valueOf("_loc_key");
      if (str2.length() != 0);
      for (str1 = str1.concat(str2); ; str1 = new String(str1))
      {
        str2 = zzd(paramBundle, str1);
        if (!TextUtils.isEmpty(str2))
          break label91;
        AppMethodBeat.o(70025);
        paramBundle = null;
        break;
      }
      label91: Resources localResources = this.zzk.getResources();
      int i = localResources.getIdentifier(str2, "string", this.zzk.getPackageName());
      if (i == 0)
      {
        paramBundle = String.valueOf(paramString);
        paramString = String.valueOf("_loc_key");
        if (paramString.length() != 0);
        for (paramBundle = paramBundle.concat(paramString); ; paramBundle = new String(paramBundle))
        {
          paramBundle = paramBundle.substring(6);
          new StringBuilder(String.valueOf(paramBundle).length() + 49 + String.valueOf(str2).length()).append(paramBundle).append(" resource not found: ").append(str2).append(" Default value will be used.");
          AppMethodBeat.o(70025);
          paramBundle = null;
          break;
        }
      }
      Object localObject = String.valueOf(paramString);
      str1 = String.valueOf("_loc_args");
      if (str1.length() != 0);
      for (str1 = ((String)localObject).concat(str1); ; str1 = new String((String)localObject))
      {
        str1 = zzd(paramBundle, str1);
        if (!TextUtils.isEmpty(str1))
          break label290;
        paramBundle = localResources.getString(i);
        AppMethodBeat.o(70025);
        break;
      }
      try
      {
        label290: paramBundle = new org/json/JSONArray;
        paramBundle.<init>(str1);
        localObject = new String[paramBundle.length()];
        for (int j = 0; j < localObject.length; j++)
          localObject[j] = paramBundle.opt(j);
        paramBundle = localResources.getString(i, (Object[])localObject);
        AppMethodBeat.o(70025);
      }
      catch (JSONException paramBundle)
      {
        paramString = String.valueOf(paramString);
        paramBundle = String.valueOf("_loc_args");
        if (paramBundle.length() != 0);
        for (paramBundle = paramString.concat(paramBundle); ; paramBundle = new String(paramString))
        {
          paramBundle = paramBundle.substring(6);
          new StringBuilder(String.valueOf(paramBundle).length() + 41 + String.valueOf(str1).length()).append("Malformed ").append(paramBundle).append(": ").append(str1).append("  Default value will be used.");
          AppMethodBeat.o(70025);
          paramBundle = null;
          break;
        }
      }
      catch (MissingFormatArgumentException paramBundle)
      {
        while (true)
          new StringBuilder(String.valueOf(str2).length() + 58 + String.valueOf(str1).length()).append("Missing format argument for ").append(str2).append(": ").append(str1).append(" Default value will be used.");
      }
    }
  }

  final boolean zze(Bundle paramBundle)
  {
    Object localObject1 = null;
    AppMethodBeat.i(70024);
    Object localObject2 = zze(paramBundle, "gcm.n.title");
    if (TextUtils.isEmpty((CharSequence)localObject2))
      localObject2 = this.zzk.getApplicationInfo().loadLabel(this.zzk.getPackageManager());
    while (true)
    {
      String str1 = zze(paramBundle, "gcm.n.body");
      Object localObject3 = zzd(paramBundle, "gcm.n.icon");
      Object localObject4;
      int i;
      String str2;
      if (!TextUtils.isEmpty((CharSequence)localObject3))
      {
        localObject4 = this.zzk.getResources();
        i = ((Resources)localObject4).getIdentifier((String)localObject3, "drawable", this.zzk.getPackageName());
        if (i != 0)
        {
          str2 = zzd(paramBundle, "gcm.n.color");
          localObject3 = zzd(paramBundle, "gcm.n.sound2");
          if (!TextUtils.isEmpty((CharSequence)localObject3))
            break label351;
          localObject4 = null;
          label124: localObject3 = zzd(paramBundle, "gcm.n.click_action");
          if (TextUtils.isEmpty((CharSequence)localObject3))
            break label465;
          localObject3 = new Intent((String)localObject3);
          ((Intent)localObject3).setPackage(this.zzk.getPackageName());
          ((Intent)localObject3).setFlags(268435456);
        }
      }
      label531: label1053: 
      while (true)
      {
        Object localObject5 = new Bundle(paramBundle);
        GcmListenerService.zzd((Bundle)localObject5);
        ((Intent)localObject3).putExtras((Bundle)localObject5);
        localObject5 = ((Bundle)localObject5).keySet().iterator();
        while (true)
          if (((Iterator)localObject5).hasNext())
          {
            String str3 = (String)((Iterator)localObject5).next();
            if ((str3.startsWith("gcm.n.")) || (str3.startsWith("gcm.notification.")))
            {
              ((Intent)localObject3).removeExtra(str3);
              continue;
              i = ((Resources)localObject4).getIdentifier((String)localObject3, "mipmap", this.zzk.getPackageName());
              if (i != 0)
                break;
              new StringBuilder(String.valueOf(localObject3).length() + 57).append("Icon resource ").append((String)localObject3).append(" not found. Notification will use app icon.");
              int j = this.zzk.getApplicationInfo().icon;
              i = j;
              if (j == 0)
                i = 17301651;
              break;
              label351: if ((!"default".equals(localObject3)) && (this.zzk.getResources().getIdentifier((String)localObject3, "raw", this.zzk.getPackageName()) != 0))
              {
                localObject4 = this.zzk.getPackageName();
                localObject4 = Uri.parse(String.valueOf(localObject4).length() + 24 + String.valueOf(localObject3).length() + "android.resource://" + (String)localObject4 + "/raw/" + (String)localObject3);
                break label124;
              }
              localObject4 = RingtoneManager.getDefaultUri(2);
              break label124;
              label465: localObject3 = this.zzk.getPackageManager().getLaunchIntentForPackage(this.zzk.getPackageName());
              if (localObject3 != null)
                break label1053;
              localObject5 = null;
              if ((!PlatformVersion.isAtLeastO()) || (this.zzk.getApplicationInfo().targetSdkVersion < 26))
                break label948;
              localObject3 = zzd(paramBundle, "gcm.n.android_channel_id");
              if (PlatformVersion.isAtLeastO())
                break label767;
              localObject3 = localObject1;
              localObject1 = new Notification.Builder(this.zzk).setAutoCancel(true).setSmallIcon(i);
              if (!TextUtils.isEmpty((CharSequence)localObject2))
                ((Notification.Builder)localObject1).setContentTitle((CharSequence)localObject2);
              if (!TextUtils.isEmpty(str1))
              {
                ((Notification.Builder)localObject1).setContentText(str1);
                ((Notification.Builder)localObject1).setStyle(new Notification.BigTextStyle().bigText(str1));
              }
              if (!TextUtils.isEmpty(str2))
                ((Notification.Builder)localObject1).setColor(Color.parseColor(str2));
              if (localObject4 != null)
                ((Notification.Builder)localObject1).setSound((Uri)localObject4);
              if (localObject5 != null)
                ((Notification.Builder)localObject1).setContentIntent((PendingIntent)localObject5);
              if (localObject3 != null)
                ((Notification.Builder)localObject1).setChannelId((String)localObject3);
            }
          }
        for (localObject3 = ((Notification.Builder)localObject1).build(); ; localObject3 = ((v.c)localObject3).build())
        {
          localObject4 = zzd(paramBundle, "gcm.n.tag");
          Log.isLoggable("GcmNotification", 3);
          localObject2 = (NotificationManager)this.zzk.getSystemService("notification");
          paramBundle = (Bundle)localObject4;
          if (TextUtils.isEmpty((CharSequence)localObject4))
          {
            long l = SystemClock.uptimeMillis();
            paramBundle = 37 + "GCM-Notification:" + l;
          }
          ((NotificationManager)localObject2).notify(paramBundle, 0, (Notification)localObject3);
          AppMethodBeat.o(70024);
          return true;
          localObject5 = PendingIntent.getActivity(this.zzk, this.zzm.getAndIncrement(), (Intent)localObject3, 1073741824);
          break;
          label767: localObject1 = (NotificationManager)this.zzk.getSystemService(NotificationManager.class);
          if (!TextUtils.isEmpty((CharSequence)localObject3))
          {
            if (((NotificationManager)localObject1).getNotificationChannel((String)localObject3) != null)
              break label531;
            new StringBuilder(String.valueOf(localObject3).length() + 122).append("Notification Channel requested (").append((String)localObject3).append(") has not been created by the app. Manifest configuration, or default, value will be used.");
          }
          if (this.zzl != null)
          {
            localObject3 = this.zzl;
            break label531;
          }
          this.zzl = zze().getString("com.google.android.gms.gcm.default_notification_channel_id");
          if ((!TextUtils.isEmpty(this.zzl)) && (((NotificationManager)localObject1).getNotificationChannel(this.zzl) != null))
          {
            localObject3 = this.zzl;
            break label531;
          }
          if (((NotificationManager)localObject1).getNotificationChannel("fcm_fallback_notification_channel") == null)
            ((NotificationManager)localObject1).createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", this.zzk.getString(2131296292), 3));
          this.zzl = "fcm_fallback_notification_channel";
          localObject3 = this.zzl;
          break label531;
          label948: localObject3 = new v.c(this.zzk).z(true).as(i);
          if (!TextUtils.isEmpty((CharSequence)localObject2))
            ((v.c)localObject3).d((CharSequence)localObject2);
          if (!TextUtils.isEmpty(str1))
            ((v.c)localObject3).e(str1);
          if (!TextUtils.isEmpty(str2))
            ((v.c)localObject3).mColor = Color.parseColor(str2);
          if (localObject4 != null)
            ((v.c)localObject3).b((Uri)localObject4);
          if (localObject5 != null)
            ((v.c)localObject3).EI = ((PendingIntent)localObject5);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.zzd
 * JD-Core Version:    0.6.2
 */