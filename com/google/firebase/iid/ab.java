package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.a;
import com.google.firebase.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

final class ab
  implements ae
{
  private final a bvs;
  private final f bvt;
  final m bwH;
  private final ScheduledThreadPoolExecutor bwI;
  private final FirebaseInstanceId bwi;

  ab(a parama, FirebaseInstanceId paramFirebaseInstanceId, f paramf)
  {
    AppMethodBeat.i(108794);
    this.bvs = parama;
    this.bwi = paramFirebaseInstanceId;
    this.bvt = paramf;
    this.bwH = new m(parama.getApplicationContext(), paramf);
    this.bwI = new ScheduledThreadPoolExecutor(1);
    AppMethodBeat.o(108794);
  }

  final Bundle c(String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(108796);
    paramBundle.putString("scope", paramString2);
    paramBundle.putString("sender", paramString1);
    paramBundle.putString("subtype", paramString1);
    paramBundle.putString("appid", FirebaseInstanceId.zzf());
    paramBundle.putString("gmp_app_id", this.bvs.us().zzs);
    paramBundle.putString("gmsv", Integer.toString(this.bvt.uQ()));
    paramBundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
    paramBundle.putString("app_ver", this.bvt.uO());
    paramBundle.putString("app_ver_name", this.bvt.uP());
    paramBundle.putString("cliv", "fiid-12451000");
    AppMethodBeat.o(108796);
    return paramBundle;
  }

  final String h(Bundle paramBundle)
  {
    AppMethodBeat.i(108797);
    if (paramBundle == null)
    {
      paramBundle = new IOException("SERVICE_NOT_AVAILABLE");
      AppMethodBeat.o(108797);
      throw paramBundle;
    }
    String str = paramBundle.getString("registration_id");
    if (str != null)
      AppMethodBeat.o(108797);
    for (paramBundle = str; ; paramBundle = str)
    {
      return paramBundle;
      str = paramBundle.getString("unregistered");
      if (str == null)
        break;
      AppMethodBeat.o(108797);
    }
    str = paramBundle.getString("error");
    if ("RST".equals(str))
    {
      this.bwi.uI();
      paramBundle = new IOException("INSTANCE_ID_RESET");
      AppMethodBeat.o(108797);
      throw paramBundle;
    }
    if (str != null)
    {
      paramBundle = new IOException(str);
      AppMethodBeat.o(108797);
      throw paramBundle;
    }
    paramBundle = String.valueOf(paramBundle);
    new StringBuilder(String.valueOf(paramBundle).length() + 21).append("Unexpected response: ").append(paramBundle);
    new Throwable();
    paramBundle = new IOException("SERVICE_NOT_AVAILABLE");
    AppMethodBeat.o(108797);
    throw paramBundle;
  }

  public final Task<String> q(String paramString1, String paramString2)
  {
    AppMethodBeat.i(108795);
    Bundle localBundle = new Bundle();
    c(paramString1, paramString2, localBundle);
    paramString1 = new TaskCompletionSource();
    this.bwI.execute(new ac(this, localBundle, paramString1));
    paramString1 = paramString1.getTask().continueWith(this.bwI, new ad(this));
    AppMethodBeat.o(108795);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.ab
 * JD-Core Version:    0.6.2
 */