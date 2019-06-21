package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.f.a;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.zzaf;
import com.google.android.gms.iid.zzak;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class GoogleCloudMessaging
{
  public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
  public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
  public static final String INSTANCE_ID_SCOPE = "GCM";

  @Deprecated
  public static final String MESSAGE_TYPE_DELETED = "deleted_messages";

  @Deprecated
  public static final String MESSAGE_TYPE_MESSAGE = "gcm";

  @Deprecated
  public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";

  @Deprecated
  public static final String MESSAGE_TYPE_SEND_EVENT = "send_event";
  private static GoogleCloudMessaging zzac;
  private static final AtomicInteger zzaf;
  private PendingIntent zzad;
  private final Map<String, Handler> zzae;
  private final BlockingQueue<Intent> zzag;
  private final Messenger zzah;
  private Context zzk;

  static
  {
    AppMethodBeat.i(69976);
    zzaf = new AtomicInteger(1);
    AppMethodBeat.o(69976);
  }

  public GoogleCloudMessaging()
  {
    AppMethodBeat.i(69962);
    this.zzae = Collections.synchronizedMap(new a());
    this.zzag = new LinkedBlockingQueue();
    this.zzah = new Messenger(new zzf(this, Looper.getMainLooper()));
    AppMethodBeat.o(69962);
  }

  @Deprecated
  public static GoogleCloudMessaging getInstance(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(69960);
      if (zzac == null)
      {
        zze(paramContext);
        GoogleCloudMessaging localGoogleCloudMessaging = new com/google/android/gms/gcm/GoogleCloudMessaging;
        localGoogleCloudMessaging.<init>();
        zzac = localGoogleCloudMessaging;
        localGoogleCloudMessaging.zzk = paramContext.getApplicationContext();
      }
      paramContext = zzac;
      AppMethodBeat.o(69960);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  @Deprecated
  private final Intent zzd(Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(69970);
    if (Looper.getMainLooper() == Looper.myLooper())
    {
      paramBundle = new IOException("MAIN_THREAD");
      AppMethodBeat.o(69970);
      throw paramBundle;
    }
    if (zzf(this.zzk) < 0)
    {
      paramBundle = new IOException("Google Play Services missing");
      AppMethodBeat.o(69970);
      throw paramBundle;
    }
    Object localObject;
    if (paramBoolean)
      localObject = "com.google.iid.TOKEN_REQUEST";
    while (true)
    {
      localObject = new Intent((String)localObject);
      ((Intent)localObject).setPackage(zzaf.zzl(this.zzk));
      zze((Intent)localObject);
      int i = zzaf.getAndIncrement();
      ((Intent)localObject).putExtra("google.message_id", 21 + "google.rpc" + i);
      ((Intent)localObject).putExtras(paramBundle);
      ((Intent)localObject).putExtra("google.messenger", this.zzah);
      if (paramBoolean)
        this.zzk.sendBroadcast((Intent)localObject);
      try
      {
        while (true)
        {
          paramBundle = (Intent)this.zzag.poll(30000L, TimeUnit.MILLISECONDS);
          AppMethodBeat.o(69970);
          return paramBundle;
          localObject = "com.google.android.c2dm.intent.REGISTER";
          break;
          this.zzk.startService((Intent)localObject);
        }
      }
      catch (InterruptedException paramBundle)
      {
        paramBundle = new IOException(paramBundle.getMessage());
        AppMethodBeat.o(69970);
      }
    }
    throw paramBundle;
  }

  @Deprecated
  @VisibleForTesting
  private final String zzd(boolean paramBoolean, String[] paramArrayOfString)
  {
    Object localObject1;
    try
    {
      AppMethodBeat.i(69969);
      localObject1 = zzaf.zzl(this.zzk);
      if (localObject1 == null)
      {
        paramArrayOfString = new java/io/IOException;
        paramArrayOfString.<init>("SERVICE_NOT_AVAILABLE");
        AppMethodBeat.o(69969);
        throw paramArrayOfString;
      }
    }
    finally
    {
    }
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      paramArrayOfString = new java/lang/IllegalArgumentException;
      paramArrayOfString.<init>("No senderIds");
      AppMethodBeat.o(69969);
      throw paramArrayOfString;
    }
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>(paramArrayOfString[0]);
    for (int i = 1; i < paramArrayOfString.length; i++)
      ((StringBuilder)localObject2).append(',').append(paramArrayOfString[i]);
    paramArrayOfString = ((StringBuilder)localObject2).toString();
    localObject2 = new android/os/Bundle;
    ((Bundle)localObject2).<init>();
    if (((String)localObject1).contains(".gsf"))
    {
      ((Bundle)localObject2).putString("legacy.sender", paramArrayOfString);
      paramArrayOfString = InstanceID.getInstance(this.zzk).getToken(paramArrayOfString, "GCM", (Bundle)localObject2);
      AppMethodBeat.o(69969);
    }
    while (true)
    {
      return paramArrayOfString;
      ((Bundle)localObject2).putString("sender", paramArrayOfString);
      localObject1 = zzd((Bundle)localObject2, paramBoolean);
      if (localObject1 == null)
      {
        paramArrayOfString = new java/io/IOException;
        paramArrayOfString.<init>("SERVICE_NOT_AVAILABLE");
        AppMethodBeat.o(69969);
        throw paramArrayOfString;
      }
      paramArrayOfString = ((Intent)localObject1).getStringExtra("registration_id");
      if (paramArrayOfString == null)
        break;
      AppMethodBeat.o(69969);
    }
    paramArrayOfString = ((Intent)localObject1).getStringExtra("error");
    if (paramArrayOfString != null)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>(paramArrayOfString);
      AppMethodBeat.o(69969);
      throw ((Throwable)localObject1);
    }
    paramArrayOfString = new java/io/IOException;
    paramArrayOfString.<init>("SERVICE_NOT_AVAILABLE");
    AppMethodBeat.o(69969);
    throw paramArrayOfString;
  }

  private final boolean zzd(Intent paramIntent)
  {
    AppMethodBeat.i(69966);
    Object localObject1 = paramIntent.getStringExtra("In-Reply-To");
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = localObject1;
      if (paramIntent.hasExtra("error"))
        localObject2 = paramIntent.getStringExtra("google.message_id");
    }
    boolean bool;
    if (localObject2 != null)
    {
      localObject1 = (Handler)this.zzae.remove(localObject2);
      if (localObject1 != null)
      {
        localObject2 = Message.obtain();
        ((Message)localObject2).obj = paramIntent;
        bool = ((Handler)localObject1).sendMessage((Message)localObject2);
        AppMethodBeat.o(69966);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(69966);
    }
  }

  static void zze(Context paramContext)
  {
    AppMethodBeat.i(69961);
    paramContext = paramContext.getPackageName();
    new StringBuilder(String.valueOf(paramContext).length() + 48).append("GCM SDK is deprecated, ").append(paramContext).append(" should update to use FCM");
    AppMethodBeat.o(69961);
  }

  private final void zze(Intent paramIntent)
  {
    try
    {
      AppMethodBeat.i(69972);
      if (this.zzad == null)
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.setPackage("com.google.example.invalidpackage");
        this.zzad = PendingIntent.getBroadcast(this.zzk, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", this.zzad);
      AppMethodBeat.o(69972);
      return;
    }
    finally
    {
    }
    throw paramIntent;
  }

  public static int zzf(Context paramContext)
  {
    AppMethodBeat.i(69974);
    String str = zzaf.zzl(paramContext);
    if (str != null);
    while (true)
    {
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(str, 0);
        if (paramContext != null)
        {
          i = paramContext.versionCode;
          AppMethodBeat.o(69974);
          return i;
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
      }
      int i = -1;
      AppMethodBeat.o(69974);
    }
  }

  private final void zzg()
  {
    try
    {
      AppMethodBeat.i(69973);
      if (this.zzad != null)
      {
        this.zzad.cancel();
        this.zzad = null;
      }
      AppMethodBeat.o(69973);
      return;
    }
    finally
    {
    }
  }

  @Deprecated
  public void close()
  {
    AppMethodBeat.i(69963);
    zzac = null;
    zzd.zzj = null;
    zzg();
    AppMethodBeat.o(69963);
  }

  @Deprecated
  public String getMessageType(Intent paramIntent)
  {
    AppMethodBeat.i(69971);
    if (!"com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction()))
    {
      paramIntent = null;
      AppMethodBeat.o(69971);
    }
    while (true)
    {
      return paramIntent;
      paramIntent = paramIntent.getStringExtra("message_type");
      if (paramIntent != null)
      {
        AppMethodBeat.o(69971);
      }
      else
      {
        paramIntent = "gcm";
        AppMethodBeat.o(69971);
      }
    }
  }

  @Deprecated
  public String register(String[] paramArrayOfString)
  {
    try
    {
      AppMethodBeat.i(69968);
      paramArrayOfString = zzd(zzaf.zzk(this.zzk), paramArrayOfString);
      AppMethodBeat.o(69968);
      return paramArrayOfString;
    }
    finally
    {
      paramArrayOfString = finally;
    }
    throw paramArrayOfString;
  }

  @Deprecated
  public void send(String paramString1, String paramString2, long paramLong, Bundle paramBundle)
  {
    AppMethodBeat.i(69965);
    if (paramString1 == null)
    {
      paramString1 = new IllegalArgumentException("Missing 'to'");
      AppMethodBeat.o(69965);
      throw paramString1;
    }
    Object localObject1 = zzaf.zzl(this.zzk);
    if (localObject1 == null)
    {
      paramString1 = new IOException("SERVICE_NOT_AVAILABLE");
      AppMethodBeat.o(69965);
      throw paramString1;
    }
    Object localObject2 = new Intent("com.google.android.gcm.intent.SEND");
    if (paramBundle != null)
      ((Intent)localObject2).putExtras(paramBundle);
    zze((Intent)localObject2);
    ((Intent)localObject2).setPackage((String)localObject1);
    ((Intent)localObject2).putExtra("google.to", paramString1);
    ((Intent)localObject2).putExtra("google.message_id", paramString2);
    ((Intent)localObject2).putExtra("google.ttl", Long.toString(paramLong));
    int i = paramString1.indexOf('@');
    if (i > 0);
    for (String str = paramString1.substring(0, i); ; str = paramString1)
    {
      InstanceID.getInstance(this.zzk);
      ((Intent)localObject2).putExtra("google.from", InstanceID.zzn().zze("", str, "GCM"));
      if (((String)localObject1).contains(".gsf"))
      {
        localObject1 = new Bundle();
        Iterator localIterator = paramBundle.keySet().iterator();
        while (localIterator.hasNext())
        {
          str = (String)localIterator.next();
          localObject2 = paramBundle.get(str);
          if ((localObject2 instanceof String))
          {
            str = String.valueOf(str);
            if (str.length() != 0);
            for (str = "gcm.".concat(str); ; str = new String("gcm."))
            {
              ((Bundle)localObject1).putString(str, (String)localObject2);
              break;
            }
          }
        }
        ((Bundle)localObject1).putString("google.to", paramString1);
        ((Bundle)localObject1).putString("google.message_id", paramString2);
        InstanceID.getInstance(this.zzk).zze("GCM", "upstream", (Bundle)localObject1);
        AppMethodBeat.o(69965);
      }
      while (true)
      {
        return;
        this.zzk.sendOrderedBroadcast((Intent)localObject2, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
        AppMethodBeat.o(69965);
      }
    }
  }

  @Deprecated
  public void send(String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(69964);
    send(paramString1, paramString2, -1L, paramBundle);
    AppMethodBeat.o(69964);
  }

  @Deprecated
  public void unregister()
  {
    try
    {
      AppMethodBeat.i(69967);
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("MAIN_THREAD");
        AppMethodBeat.o(69967);
        throw localIOException;
      }
    }
    finally
    {
    }
    InstanceID.getInstance(this.zzk).deleteInstanceID();
    AppMethodBeat.o(69967);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.GoogleCloudMessaging
 * JD-Core Version:    0.6.2
 */