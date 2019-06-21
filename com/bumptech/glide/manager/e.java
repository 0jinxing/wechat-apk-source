package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e
  implements c
{
  private boolean aGA;
  private final BroadcastReceiver aGB;
  final c.a aGy;
  boolean aGz;
  private final Context context;

  e(Context paramContext, c.a parama)
  {
    AppMethodBeat.i(92379);
    this.aGB = new e.1(this);
    this.context = paramContext.getApplicationContext();
    this.aGy = parama;
    AppMethodBeat.o(92379);
  }

  @SuppressLint({"MissingPermission"})
  static boolean isConnected(Context paramContext)
  {
    AppMethodBeat.i(92380);
    paramContext = (ConnectivityManager)i.d((ConnectivityManager)paramContext.getSystemService("connectivity"), "Argument must not be null");
    try
    {
      paramContext = paramContext.getActiveNetworkInfo();
      if ((paramContext != null) && (paramContext.isConnected()))
      {
        AppMethodBeat.o(92380);
        bool = true;
        return bool;
      }
    }
    catch (RuntimeException paramContext)
    {
      while (true)
      {
        Log.isLoggable("ConnectivityMonitor", 5);
        AppMethodBeat.o(92380);
        boolean bool = true;
        continue;
        bool = false;
        AppMethodBeat.o(92380);
      }
    }
  }

  public final void onDestroy()
  {
  }

  public final void onStart()
  {
    AppMethodBeat.i(92381);
    if (!this.aGA)
      this.aGz = isConnected(this.context);
    while (true)
    {
      try
      {
        Context localContext = this.context;
        BroadcastReceiver localBroadcastReceiver = this.aGB;
        IntentFilter localIntentFilter = new android/content/IntentFilter;
        localIntentFilter.<init>("android.net.conn.CONNECTIVITY_CHANGE");
        localContext.registerReceiver(localBroadcastReceiver, localIntentFilter);
        this.aGA = true;
        AppMethodBeat.o(92381);
        return;
      }
      catch (SecurityException localSecurityException)
      {
        Log.isLoggable("ConnectivityMonitor", 5);
      }
      AppMethodBeat.o(92381);
    }
  }

  public final void onStop()
  {
    AppMethodBeat.i(92382);
    if (this.aGA)
    {
      this.context.unregisterReceiver(this.aGB);
      this.aGA = false;
    }
    AppMethodBeat.o(92382);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.manager.e
 * JD-Core Version:    0.6.2
 */