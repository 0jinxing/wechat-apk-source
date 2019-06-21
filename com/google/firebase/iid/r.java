package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

final class r
  implements Runnable
{
  private final f bvt;
  private final long bwg;
  private final PowerManager.WakeLock bwh;
  private final FirebaseInstanceId bwi;

  @VisibleForTesting
  r(FirebaseInstanceId paramFirebaseInstanceId, f paramf, long paramLong)
  {
    AppMethodBeat.i(108765);
    this.bwi = paramFirebaseInstanceId;
    this.bvt = paramf;
    this.bwg = paramLong;
    this.bwh = ((PowerManager)getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
    this.bwh.setReferenceCounted(false);
    AppMethodBeat.o(108765);
  }

  private final boolean bc(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(108769);
    Object localObject1 = paramString.split("!");
    int i;
    if (localObject1.length == 2)
    {
      paramString = localObject1[0];
      localObject1 = localObject1[1];
      i = -1;
    }
    label103: Object localObject2;
    Object localObject3;
    try
    {
      int j = paramString.hashCode();
      int k = i;
      switch (j)
      {
      default:
        k = i;
      case 84:
      case 83:
      case 85:
      }
      while (true)
        switch (k)
        {
        default:
          AppMethodBeat.o(108769);
          bool = true;
          return bool;
          k = i;
          if (paramString.equals("S"))
          {
            k = 0;
            continue;
            k = i;
            if (paramString.equals("U"))
              k = 1;
          }
          break;
        case 0:
        case 1:
        }
      localObject2 = this.bwi;
      localObject3 = ((FirebaseInstanceId)localObject2).uF();
      if ((localObject3 != null) && (!((q)localObject3).bb(((FirebaseInstanceId)localObject2).bvt.uO())))
        break label225;
      paramString = new java/io/IOException;
      paramString.<init>("token not available");
      AppMethodBeat.o(108769);
      throw paramString;
    }
    catch (IOException paramString)
    {
      paramString = String.valueOf(paramString.getMessage());
      if (paramString.length() == 0)
        break label523;
    }
    "Topic sync failed: ".concat(paramString);
    while (true)
    {
      AppMethodBeat.o(108769);
      break label103;
      label225: Object localObject4 = new android/os/Bundle;
      ((Bundle)localObject4).<init>();
      paramString = String.valueOf("/topics/");
      String str = String.valueOf(localObject1);
      if (str.length() != 0)
      {
        paramString = paramString.concat(str);
        label262: ((Bundle)localObject4).putString("gcm.topic", paramString);
        localObject3 = ((q)localObject3).bwe;
        paramString = String.valueOf("/topics/");
        localObject1 = String.valueOf(localObject1);
        if (((String)localObject1).length() == 0)
          break label333;
      }
      label333: for (paramString = paramString.concat((String)localObject1); ; paramString = new String(paramString))
      {
        ((FirebaseInstanceId)localObject2).b((String)localObject3, paramString, (Bundle)localObject4);
        if (!FirebaseInstanceId.uH())
          break;
        break;
        paramString = new String(paramString);
        break label262;
      }
      localObject4 = this.bwi;
      localObject3 = ((FirebaseInstanceId)localObject4).uF();
      if ((localObject3 == null) || (((q)localObject3).bb(((FirebaseInstanceId)localObject4).bvt.uO())))
      {
        paramString = new java/io/IOException;
        paramString.<init>("token not available");
        AppMethodBeat.o(108769);
        throw paramString;
      }
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      str = String.valueOf("/topics/");
      paramString = String.valueOf(localObject1);
      if (paramString.length() != 0)
      {
        paramString = str.concat(paramString);
        label432: ((Bundle)localObject2).putString("gcm.topic", paramString);
        ((Bundle)localObject2).putString("delete", "1");
        localObject3 = ((q)localObject3).bwe;
        paramString = String.valueOf("/topics/");
        localObject1 = String.valueOf(localObject1);
        if (((String)localObject1).length() == 0)
          break label511;
      }
      label511: for (paramString = paramString.concat((String)localObject1); ; paramString = new String(paramString))
      {
        ((FirebaseInstanceId)localObject4).b((String)localObject3, paramString, (Bundle)localObject2);
        FirebaseInstanceId.uH();
        break;
        paramString = new String(str);
        break label432;
      }
      label523: new String("Topic sync failed: ");
    }
  }

  @VisibleForTesting
  private final boolean uU()
  {
    boolean bool = true;
    AppMethodBeat.i(108767);
    Object localObject1 = this.bwi.uF();
    if ((localObject1 != null) && (!((q)localObject1).bb(this.bvt.uO())))
      AppMethodBeat.o(108767);
    while (true)
    {
      return bool;
      try
      {
        Object localObject2 = this.bwi;
        localObject4 = f.b(((FirebaseInstanceId)localObject2).bvs);
        if (Looper.getMainLooper() == Looper.myLooper())
        {
          localObject2 = new java/io/IOException;
          ((IOException)localObject2).<init>("MAIN_THREAD");
          AppMethodBeat.o(108767);
          throw ((Throwable)localObject2);
        }
      }
      catch (IOException localIOException)
      {
        Object localObject4;
        Object localObject3 = String.valueOf(localIOException.getMessage());
        if (((String)localObject3).length() != 0)
          "Token retrieval failed: ".concat((String)localObject3);
        while (true)
        {
          AppMethodBeat.o(108767);
          bool = false;
          break;
          if ((!"*".isEmpty()) && (!"*".equalsIgnoreCase("fcm")) && ("*".equalsIgnoreCase("gcm")));
          Object localObject5 = FirebaseInstanceId.bvq.d("", (String)localObject4, "*");
          if ((localObject5 != null) && (!((q)localObject5).bb(((FirebaseInstanceId)localObject3).bvt.uO())));
          aa localaa;
          for (localObject3 = ((q)localObject5).bwe; ; localObject3 = ((i)localObject5).a((String)localObject4, "*", localaa).zzp())
          {
            if (localObject3 != null)
              break label236;
            AppMethodBeat.o(108767);
            bool = false;
            break;
            localObject5 = ((FirebaseInstanceId)localObject3).bvv;
            localaa = new com/google/firebase/iid/aa;
            localaa.<init>((FirebaseInstanceId)localObject3, (String)localObject4, "*");
          }
          Log.isLoggable("FirebaseInstanceId", 3);
          if ((localObject1 == null) || ((localObject1 != null) && (!((String)localObject3).equals(((q)localObject1).bwe))))
          {
            localObject4 = getContext();
            localObject1 = new android/content/Intent;
            ((Intent)localObject1).<init>("com.google.firebase.iid.TOKEN_REFRESH");
            localObject3 = new android/content/Intent;
            ((Intent)localObject3).<init>("com.google.firebase.INSTANCE_ID_EVENT");
            ((Intent)localObject3).setClass((Context)localObject4, FirebaseInstanceIdReceiver.class);
            ((Intent)localObject3).putExtra("wrapped_intent", (Parcelable)localObject1);
            ((Context)localObject4).sendBroadcast((Intent)localObject3);
          }
          AppMethodBeat.o(108767);
          break;
          new String("Token retrieval failed: ");
        }
      }
      catch (SecurityException localSecurityException)
      {
        label81: label236: break label81;
      }
    }
  }

  @VisibleForTesting
  private final boolean uV()
  {
    AppMethodBeat.i(108768);
    while (true)
    {
      synchronized (this.bwi)
      {
        String str1 = FirebaseInstanceId.uG().uT();
        boolean bool;
        if (str1 == null)
        {
          bool = true;
          AppMethodBeat.o(108768);
          return bool;
        }
        if (!bc(str1))
        {
          bool = false;
          AppMethodBeat.o(108768);
        }
      }
      FirebaseInstanceId.uG().zzf(str2);
    }
  }

  final Context getContext()
  {
    AppMethodBeat.i(108770);
    Context localContext = this.bwi.bvs.getApplicationContext();
    AppMethodBeat.o(108770);
    return localContext;
  }

  public final void run()
  {
    int i = 1;
    AppMethodBeat.i(108766);
    this.bwh.acquire();
    try
    {
      this.bwi.zza(true);
      if (this.bvt.zzx() != 0)
      {
        if (i != 0)
          break label64;
        this.bwi.zza(false);
      }
      while (true)
      {
        return;
        i = 0;
        break;
        label64: if (zzaj())
          break label124;
        s locals = new com/google/firebase/iid/s;
        locals.<init>(this);
        FirebaseInstanceId.uH();
        IntentFilter localIntentFilter = new android/content/IntentFilter;
        localIntentFilter.<init>("android.net.conn.CONNECTIVITY_CHANGE");
        locals.bwj.getContext().registerReceiver(locals, localIntentFilter);
        this.bwh.release();
        AppMethodBeat.o(108766);
      }
      label124: if ((uU()) && (uV()))
        this.bwi.zza(false);
      while (true)
      {
        this.bwh.release();
        AppMethodBeat.o(108766);
        break;
        this.bwi.zza(this.bwg);
      }
    }
    finally
    {
      this.bwh.release();
      AppMethodBeat.o(108766);
    }
  }

  final boolean zzaj()
  {
    AppMethodBeat.i(108771);
    Object localObject = (ConnectivityManager)getContext().getSystemService("connectivity");
    boolean bool;
    if (localObject != null)
    {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if ((localObject == null) || (!((NetworkInfo)localObject).isConnected()))
        break label55;
      bool = true;
      AppMethodBeat.o(108771);
    }
    while (true)
    {
      return bool;
      localObject = null;
      break;
      label55: bool = false;
      AppMethodBeat.o(108771);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.r
 * JD-Core Version:    0.6.2
 */