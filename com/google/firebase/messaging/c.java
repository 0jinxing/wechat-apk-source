package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.app.v.b;
import android.support.v4.app.v.c;
import android.support.v4.content.b;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.iid.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

final class c
{
  private static c bxf;
  private final Context bvF;
  private Bundle bxg;
  private Method bxh;
  private Method bxi;
  private final AtomicInteger bxj;

  private c(Context paramContext)
  {
    AppMethodBeat.i(77221);
    this.bxj = new AtomicInteger((int)SystemClock.elapsedRealtime());
    this.bvF = paramContext.getApplicationContext();
    AppMethodBeat.o(77221);
  }

  @TargetApi(26)
  private final Notification a(CharSequence paramCharSequence, String paramString1, int paramInt, Integer paramInteger, Uri paramUri, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, String paramString2)
  {
    AppMethodBeat.i(77223);
    Notification.Builder localBuilder = new Notification.Builder(this.bvF).setAutoCancel(true).setSmallIcon(paramInt);
    if (!TextUtils.isEmpty(paramCharSequence))
      localBuilder.setContentTitle(paramCharSequence);
    if (!TextUtils.isEmpty(paramString1))
    {
      localBuilder.setContentText(paramString1);
      localBuilder.setStyle(new Notification.BigTextStyle().bigText(paramString1));
    }
    if (paramInteger != null)
      localBuilder.setColor(paramInteger.intValue());
    if (paramUri != null)
      localBuilder.setSound(paramUri);
    if (paramPendingIntent1 != null)
      localBuilder.setContentIntent(paramPendingIntent1);
    if (paramPendingIntent2 != null)
      localBuilder.setDeleteIntent(paramPendingIntent2);
    if (paramString2 != null)
    {
      if (this.bxh == null)
        this.bxh = bd("setChannelId");
      if (this.bxh == null)
        this.bxh = bd("setChannel");
      if (this.bxh == null);
    }
    try
    {
      this.bxh.invoke(localBuilder, new Object[] { paramString2 });
      label189: paramCharSequence = localBuilder.build();
      AppMethodBeat.o(77223);
      return paramCharSequence;
    }
    catch (IllegalArgumentException paramCharSequence)
    {
      break label189;
    }
    catch (SecurityException paramCharSequence)
    {
      break label189;
    }
    catch (InvocationTargetException paramCharSequence)
    {
      break label189;
    }
    catch (IllegalAccessException paramCharSequence)
    {
      break label189;
    }
  }

  static c as(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(77218);
      if (bxf == null)
      {
        c localc = new com/google/firebase/messaging/c;
        localc.<init>(paramContext);
        bxf = localc;
      }
      paramContext = bxf;
      AppMethodBeat.o(77218);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  private static void b(Intent paramIntent, Bundle paramBundle)
  {
    AppMethodBeat.i(77229);
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.startsWith("google.c.a.")) || (str.equals("from")))
        paramIntent.putExtra(str, paramBundle.getString(str));
    }
    AppMethodBeat.o(77229);
  }

  @TargetApi(26)
  private static Method bd(String paramString)
  {
    AppMethodBeat.i(77224);
    try
    {
      paramString = Notification.Builder.class.getMethod(paramString, new Class[] { String.class });
      AppMethodBeat.o(77224);
      return paramString;
    }
    catch (SecurityException paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(77224);
      }
    }
    catch (NoSuchMethodException paramString)
    {
      label29: break label29;
    }
  }

  private final Integer be(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(77227);
    if (Build.VERSION.SDK_INT < 21)
      AppMethodBeat.o(77227);
    for (paramString = localObject; ; paramString = localObject)
    {
      while (true)
      {
        return paramString;
        int i;
        if (!TextUtils.isEmpty(paramString))
        {
          try
          {
            i = Color.parseColor(paramString);
            paramString = Integer.valueOf(i);
            AppMethodBeat.o(77227);
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            new StringBuilder(String.valueOf(paramString).length() + 54).append("Color ").append(paramString).append(" not valid. Notification will use default color.");
          }
        }
        else
        {
          i = vb().getInt("com.google.firebase.messaging.default_notification_color", 0);
          if (i != 0)
            try
            {
              i = b.i(this.bvF, i);
              paramString = Integer.valueOf(i);
              AppMethodBeat.o(77227);
            }
            catch (Resources.NotFoundException paramString)
            {
            }
        }
      }
      AppMethodBeat.o(77227);
    }
  }

  static String d(Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(77219);
    String str1 = paramBundle.getString(paramString);
    String str2 = str1;
    if (str1 == null)
      str2 = paramBundle.getString(paramString.replace("gcm.n.", "gcm.notification."));
    AppMethodBeat.o(77219);
    return str2;
  }

  private static Object[] e(Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(77220);
    Object localObject = String.valueOf(paramString);
    String str = String.valueOf("_loc_args");
    if (str.length() != 0)
    {
      str = ((String)localObject).concat(str);
      str = d(paramBundle, str);
      if (!TextUtils.isEmpty(str))
        break label66;
      AppMethodBeat.o(77220);
      paramBundle = null;
    }
    while (true)
    {
      return paramBundle;
      str = new String((String)localObject);
      break;
      try
      {
        label66: localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>(str);
        paramBundle = new String[((JSONArray)localObject).length()];
        for (int i = 0; i < paramBundle.length; i++)
          paramBundle[i] = ((JSONArray)localObject).opt(i);
        AppMethodBeat.o(77220);
      }
      catch (JSONException paramBundle)
      {
        paramString = String.valueOf(paramString);
        paramBundle = String.valueOf("_loc_args");
        if (paramBundle.length() == 0);
      }
    }
    for (paramBundle = paramString.concat(paramBundle); ; paramBundle = new String(paramString))
    {
      paramBundle = paramBundle.substring(6);
      new StringBuilder(String.valueOf(paramBundle).length() + 41 + String.valueOf(str).length()).append("Malformed ").append(paramBundle).append(": ").append(str).append("  Default value will be used.");
      AppMethodBeat.o(77220);
      paramBundle = null;
      break;
    }
  }

  @TargetApi(26)
  private final boolean fl(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(77226);
    if (Build.VERSION.SDK_INT != 26)
      AppMethodBeat.o(77226);
    while (true)
    {
      return bool;
      try
      {
        if ((this.bvF.getResources().getDrawable(paramInt, null) instanceof AdaptiveIconDrawable))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(77);
          localStringBuilder.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ").append(paramInt);
          AppMethodBeat.o(77226);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(77226);
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        AppMethodBeat.o(77226);
        bool = false;
      }
    }
  }

  private final Bundle vb()
  {
    AppMethodBeat.i(77230);
    Object localObject;
    if (this.bxg != null)
    {
      localObject = this.bxg;
      AppMethodBeat.o(77230);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      try
      {
        ApplicationInfo localApplicationInfo = this.bvF.getPackageManager().getApplicationInfo(this.bvF.getPackageName(), 128);
        localObject = localApplicationInfo;
        label51: if ((localObject != null) && (((ApplicationInfo)localObject).metaData != null))
        {
          this.bxg = ((ApplicationInfo)localObject).metaData;
          localObject = this.bxg;
          AppMethodBeat.o(77230);
          continue;
        }
        localObject = Bundle.EMPTY;
        AppMethodBeat.o(77230);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        break label51;
      }
    }
  }

  private final String zzd(Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(77225);
    String str = d(paramBundle, paramString);
    if (!TextUtils.isEmpty(str))
    {
      AppMethodBeat.o(77225);
      paramBundle = str;
    }
    while (true)
    {
      return paramBundle;
      str = String.valueOf(paramString);
      Object localObject = String.valueOf("_loc_key");
      if (((String)localObject).length() != 0);
      for (str = str.concat((String)localObject); ; str = new String(str))
      {
        str = d(paramBundle, str);
        if (!TextUtils.isEmpty(str))
          break label93;
        AppMethodBeat.o(77225);
        paramBundle = null;
        break;
      }
      label93: localObject = this.bvF.getResources();
      int i = ((Resources)localObject).getIdentifier(str, "string", this.bvF.getPackageName());
      if (i == 0)
      {
        paramBundle = String.valueOf(paramString);
        paramString = String.valueOf("_loc_key");
        if (paramString.length() != 0);
        for (paramBundle = paramBundle.concat(paramString); ; paramBundle = new String(paramBundle))
        {
          paramBundle = paramBundle.substring(6);
          new StringBuilder(String.valueOf(paramBundle).length() + 49 + String.valueOf(str).length()).append(paramBundle).append(" resource not found: ").append(str).append(" Default value will be used.");
          AppMethodBeat.o(77225);
          paramBundle = null;
          break;
        }
      }
      paramString = e(paramBundle, paramString);
      if (paramString == null)
      {
        paramBundle = ((Resources)localObject).getString(i);
        AppMethodBeat.o(77225);
      }
      else
      {
        try
        {
          paramBundle = ((Resources)localObject).getString(i, paramString);
          AppMethodBeat.o(77225);
        }
        catch (MissingFormatArgumentException paramBundle)
        {
          paramBundle = Arrays.toString(paramString);
          new StringBuilder(String.valueOf(str).length() + 58 + String.valueOf(paramBundle).length()).append("Missing format argument for ").append(str).append(": ").append(paramBundle).append(" Default value will be used.");
          AppMethodBeat.o(77225);
          paramBundle = null;
        }
      }
    }
  }

  @TargetApi(26)
  private final String zzn(String paramString)
  {
    AppMethodBeat.i(77228);
    if (!PlatformVersion.isAtLeastO())
    {
      paramString = null;
      AppMethodBeat.o(77228);
    }
    while (true)
    {
      return paramString;
      NotificationManager localNotificationManager = (NotificationManager)this.bvF.getSystemService(NotificationManager.class);
      try
      {
        if (this.bxi == null)
          this.bxi = localNotificationManager.getClass().getMethod("getNotificationChannel", new Class[] { String.class });
        Object localObject;
        if (!TextUtils.isEmpty(paramString))
        {
          localObject = this.bxi.invoke(localNotificationManager, new Object[] { paramString });
          if (localObject != null)
          {
            AppMethodBeat.o(77228);
            continue;
          }
          int i = String.valueOf(paramString).length();
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>(i + 122);
          ((StringBuilder)localObject).append("Notification Channel requested (").append(paramString).append(") has not been created by the app. Manifest configuration, or default, value will be used.");
        }
        paramString = vb().getString("com.google.firebase.messaging.default_notification_channel_id");
        if (!TextUtils.isEmpty(paramString))
        {
          localObject = this.bxi.invoke(localNotificationManager, new Object[] { paramString });
          if (localObject != null)
          {
            AppMethodBeat.o(77228);
            continue;
          }
        }
        if (this.bxi.invoke(localNotificationManager, new Object[] { "fcm_fallback_notification_channel" }) == null)
        {
          localObject = Class.forName("android.app.NotificationChannel");
          paramString = ((Class)localObject).getConstructor(new Class[] { String.class, CharSequence.class, Integer.TYPE }).newInstance(new Object[] { "fcm_fallback_notification_channel", this.bvF.getString(2131296256), Integer.valueOf(3) });
          localNotificationManager.getClass().getMethod("createNotificationChannel", new Class[] { localObject }).invoke(localNotificationManager, new Object[] { paramString });
        }
        paramString = "fcm_fallback_notification_channel";
        AppMethodBeat.o(77228);
      }
      catch (LinkageError paramString)
      {
        paramString = null;
        AppMethodBeat.o(77228);
      }
      catch (IllegalArgumentException paramString)
      {
        break label323;
      }
      catch (SecurityException paramString)
      {
        break label323;
      }
      catch (ClassNotFoundException paramString)
      {
        break label323;
      }
      catch (IllegalAccessException paramString)
      {
        break label323;
      }
      catch (NoSuchMethodException paramString)
      {
        break label323;
      }
      catch (InvocationTargetException paramString)
      {
        break label323;
      }
      catch (InstantiationException paramString)
      {
        label323: break label323;
      }
    }
  }

  final boolean k(Bundle paramBundle)
  {
    v.c localc = null;
    AppMethodBeat.i(77222);
    boolean bool;
    if ("1".equals(d(paramBundle, "gcm.n.noui")))
    {
      AppMethodBeat.o(77222);
      bool = true;
      return bool;
    }
    int i;
    if (!((KeyguardManager)this.bvF.getSystemService("keyguard")).inKeyguardRestrictedInputMode())
    {
      if (!PlatformVersion.isAtLeastLollipop())
        SystemClock.sleep(10L);
      i = Process.myPid();
      localObject1 = ((ActivityManager)this.bvF.getSystemService("activity")).getRunningAppProcesses();
      if (localObject1 != null)
      {
        localObject2 = ((List)localObject1).iterator();
        while (true)
          if (((Iterator)localObject2).hasNext())
          {
            localObject1 = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject2).next();
            if (((ActivityManager.RunningAppProcessInfo)localObject1).pid == i)
              if (((ActivityManager.RunningAppProcessInfo)localObject1).importance == 100)
                i = 1;
          }
      }
    }
    while (true)
    {
      if (i == 0)
        break label175;
      AppMethodBeat.o(77222);
      bool = false;
      break;
      i = 0;
      continue;
      i = 0;
    }
    label175: Object localObject1 = zzd(paramBundle, "gcm.n.title");
    Object localObject3 = localObject1;
    if (TextUtils.isEmpty((CharSequence)localObject1))
      localObject3 = this.bvF.getApplicationInfo().loadLabel(this.bvF.getPackageManager());
    String str1 = zzd(paramBundle, "gcm.n.body");
    localObject1 = d(paramBundle, "gcm.n.icon");
    label285: Integer localInteger;
    label339: Object localObject4;
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject2 = this.bvF.getResources();
      i = ((Resources)localObject2).getIdentifier((String)localObject1, "drawable", this.bvF.getPackageName());
      if ((i != 0) && (fl(i)))
      {
        localInteger = be(d(paramBundle, "gcm.n.color"));
        localObject2 = d(paramBundle, "gcm.n.sound2");
        localObject1 = localObject2;
        if (TextUtils.isEmpty((CharSequence)localObject2))
          localObject1 = d(paramBundle, "gcm.n.sound");
        if (!TextUtils.isEmpty((CharSequence)localObject1))
          break label777;
        localObject1 = null;
        localObject2 = d(paramBundle, "gcm.n.click_action");
        if (TextUtils.isEmpty((CharSequence)localObject2))
          break label891;
        localObject2 = new Intent((String)localObject2);
        ((Intent)localObject2).setPackage(this.bvF.getPackageName());
        ((Intent)localObject2).setFlags(268435456);
        label389: if (localObject2 != null)
          break label1009;
        localObject2 = null;
        label397: if (!FirebaseMessagingService.j(paramBundle))
          break label1257;
        localObject4 = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
        b((Intent)localObject4, paramBundle);
        ((Intent)localObject4).putExtra("pending_intent", (Parcelable)localObject2);
        localObject4 = o.a(this.bvF, this.bxj.incrementAndGet(), (Intent)localObject4);
        localObject2 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
        b((Intent)localObject2, paramBundle);
      }
    }
    for (Object localObject2 = o.a(this.bvF, this.bxj.incrementAndGet(), (Intent)localObject2); ; localObject2 = localc)
    {
      if ((PlatformVersion.isAtLeastO()) && (this.bvF.getApplicationInfo().targetSdkVersion > 25));
      for (localObject1 = a((CharSequence)localObject3, str1, i, localInteger, (Uri)localObject1, (PendingIntent)localObject4, (PendingIntent)localObject2, zzn(d(paramBundle, "gcm.n.android_channel_id"))); ; localObject1 = localc.build())
      {
        localObject2 = d(paramBundle, "gcm.n.tag");
        Log.isLoggable("FirebaseMessaging", 3);
        localObject3 = (NotificationManager)this.bvF.getSystemService("notification");
        paramBundle = (Bundle)localObject2;
        if (TextUtils.isEmpty((CharSequence)localObject2))
        {
          long l = SystemClock.uptimeMillis();
          paramBundle = 37 + "FCM-Notification:" + l;
        }
        ((NotificationManager)localObject3).notify(paramBundle, 0, (Notification)localObject1);
        AppMethodBeat.o(77222);
        bool = true;
        break;
        int j = ((Resources)localObject2).getIdentifier((String)localObject1, "mipmap", this.bvF.getPackageName());
        if (j != 0)
        {
          i = j;
          if (fl(j))
            break label285;
        }
        new StringBuilder(String.valueOf(localObject1).length() + 61).append("Icon resource ").append((String)localObject1).append(" not found. Notification will use default icon.");
        j = vb().getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (j != 0)
        {
          i = j;
          if (fl(j));
        }
        else
        {
          i = this.bvF.getApplicationInfo().icon;
        }
        if (i != 0)
        {
          j = i;
          if (fl(i));
        }
        else
        {
          j = 17301651;
        }
        i = j;
        break label285;
        label777: if ((!"default".equals(localObject1)) && (this.bvF.getResources().getIdentifier((String)localObject1, "raw", this.bvF.getPackageName()) != 0))
        {
          localObject2 = this.bvF.getPackageName();
          localObject1 = Uri.parse(String.valueOf(localObject2).length() + 24 + String.valueOf(localObject1).length() + "android.resource://" + (String)localObject2 + "/raw/" + (String)localObject1);
          break label339;
        }
        localObject1 = RingtoneManager.getDefaultUri(2);
        break label339;
        label891: localObject4 = d(paramBundle, "gcm.n.link_android");
        localObject2 = localObject4;
        if (TextUtils.isEmpty((CharSequence)localObject4))
          localObject2 = d(paramBundle, "gcm.n.link");
        if (!TextUtils.isEmpty((CharSequence)localObject2));
        for (localObject2 = Uri.parse((String)localObject2); ; localObject2 = null)
        {
          if (localObject2 == null)
            break label987;
          localObject4 = new Intent("android.intent.action.VIEW");
          ((Intent)localObject4).setPackage(this.bvF.getPackageName());
          ((Intent)localObject4).setData((Uri)localObject2);
          localObject2 = localObject4;
          break;
        }
        label987: localObject2 = this.bvF.getPackageManager().getLaunchIntentForPackage(this.bvF.getPackageName());
        break label389;
        label1009: ((Intent)localObject2).addFlags(67108864);
        localObject4 = new Bundle(paramBundle);
        FirebaseMessagingService.i((Bundle)localObject4);
        ((Intent)localObject2).putExtras((Bundle)localObject4);
        localObject4 = ((Bundle)localObject4).keySet().iterator();
        while (((Iterator)localObject4).hasNext())
        {
          String str2 = (String)((Iterator)localObject4).next();
          if ((str2.startsWith("gcm.n.")) || (str2.startsWith("gcm.notification.")))
            ((Intent)localObject2).removeExtra(str2);
        }
        localObject2 = PendingIntent.getActivity(this.bvF, this.bxj.incrementAndGet(), (Intent)localObject2, 1073741824);
        break label397;
        localc = new v.c(this.bvF).z(true).as(i);
        if (!TextUtils.isEmpty((CharSequence)localObject3))
          localc.d((CharSequence)localObject3);
        if (!TextUtils.isEmpty(str1))
        {
          localc.e(str1);
          localc.a(new v.b().c(str1));
        }
        if (localInteger != null)
          localc.mColor = localInteger.intValue();
        if (localObject1 != null)
          localc.b((Uri)localObject1);
        if (localObject4 != null)
          localc.EI = ((PendingIntent)localObject4);
        if (localObject2 != null)
          localc.a((PendingIntent)localObject2);
      }
      label1257: localObject4 = localObject2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.firebase.messaging.c
 * JD-Core Version:    0.6.2
 */