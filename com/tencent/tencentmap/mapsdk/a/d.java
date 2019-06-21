package com.tencent.tencentmap.mapsdk.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ag;
import com.tencent.tencentmap.mapsdk.maps.a.ax;
import com.tencent.tencentmap.mapsdk.maps.a.t;

public final class d extends BroadcastReceiver
{
  private boolean a;
  private Context b;
  private Runnable c;

  public d()
  {
    AppMethodBeat.i(97773);
    this.a = false;
    this.c = new d.1();
    AppMethodBeat.o(97773);
  }

  public final void a(Context paramContext)
  {
    AppMethodBeat.i(97775);
    if (paramContext == null)
    {
      ag.c(" Context is null!", new Object[0]);
      AppMethodBeat.o(97775);
    }
    while (true)
    {
      return;
      if (!this.a)
      {
        this.a = true;
        paramContext.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
      }
      AppMethodBeat.o(97775);
    }
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(97774);
    if (paramContext == null);
    try
    {
      ag.c(" onReceive context is null!", new Object[0]);
      AppMethodBeat.o(97774);
      while (true)
      {
        return;
        if (this.b == null)
          this.b = paramContext;
        localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
        if (localObject == null)
        {
          ag.c(" onReceive ConnectivityManager is null!", new Object[0]);
          AppMethodBeat.o(97774);
        }
        else
        {
          paramIntent = ((ConnectivityManager)localObject).getNetworkInfo(1);
          localObject = ((ConnectivityManager)localObject).getNetworkInfo(0);
          if (paramIntent == null)
            break label202;
          paramIntent = paramIntent.getState();
          if (localObject == null)
            break;
          localObject = ((NetworkInfo)localObject).getState();
          if ((paramIntent != null) || (localObject != null))
          {
            paramContext = t.a(paramContext);
            if ((!paramContext.a()) && (ax.d().h() != 0) && (paramContext.j() != 2))
              b.a().a(paramContext.d());
          }
          if (((paramIntent != null) || (localObject != null)) && ((NetworkInfo.State.CONNECTED == localObject) || (NetworkInfo.State.CONNECTED == paramIntent)))
            b.a().a(this.c);
          AppMethodBeat.o(97774);
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ag.a(paramContext);
        AppMethodBeat.o(97774);
        continue;
        Object localObject = null;
        continue;
        label202: paramIntent = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.d
 * JD-Core Version:    0.6.2
 */