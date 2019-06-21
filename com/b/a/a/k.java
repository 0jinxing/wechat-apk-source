package com.b.a.a;

import android.content.Context;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.GpsStatus.Listener;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

final class k extends c
  implements GpsStatus.Listener, LocationListener
{
  private static k bEC;
  private Context Gn;
  private LocationManager Wx;
  private boolean bED;
  private GpsStatus bEE;
  private k.a bEF;
  private final l bEG;
  private Looper mLooper;

  private k()
  {
    AppMethodBeat.i(55593);
    this.bEG = new l();
    AppMethodBeat.o(55593);
  }

  private void a(long paramLong, float paramFloat)
  {
    AppMethodBeat.i(55601);
    this.Wx.requestLocationUpdates("gps", paramLong, paramFloat, this, this.mLooper);
    AppMethodBeat.o(55601);
  }

  static k wc()
  {
    AppMethodBeat.i(55594);
    if (bEC == null)
      bEC = new k();
    k localk = bEC;
    AppMethodBeat.o(55594);
    return localk;
  }

  final void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    AppMethodBeat.i(55597);
    if (!this.bED)
    {
      AppMethodBeat.o(55597);
      return;
    }
    this.bEF = ((k.a)parama);
    if (paramHandler != null);
    for (paramContext = paramHandler.getLooper(); ; paramContext = null)
    {
      this.mLooper = paramContext;
      a(this.bEF.bCP, this.bEF.bEH);
      this.Wx.addGpsStatusListener(this);
      this.bEG.bEO = Math.max(5000L, Math.min(this.bEF.bCP + 5000L, 65000L));
      AppMethodBeat.o(55597);
      break;
    }
  }

  final void a(Handler paramHandler, d.a parama)
  {
    try
    {
      AppMethodBeat.i(55595);
      if (parama == null)
      {
        parama = new com/b/a/a/k$a;
        parama.<init>(30000L);
      }
      while (true)
      {
        super.a(paramHandler, parama);
        AppMethodBeat.o(55595);
        return;
        if ((parama instanceof k.a))
          parama = (k.a)parama;
        else
          parama = new k.a(parama.bCP);
      }
    }
    finally
    {
    }
    throw paramHandler;
  }

  final void at(Context paramContext)
  {
    AppMethodBeat.i(55596);
    this.Gn = paramContext;
    this.Wx = ((LocationManager)paramContext.getSystemService("location"));
    if ((this.Wx != null) && (this.Wx.getProvider("gps") != null));
    for (boolean bool = true; ; bool = false)
    {
      this.bED = bool;
      AppMethodBeat.o(55596);
      return;
    }
  }

  final void au(Context paramContext)
  {
    AppMethodBeat.i(55598);
    if (!this.bED)
      AppMethodBeat.o(55598);
    while (true)
    {
      return;
      this.Wx.removeUpdates(this);
      this.Wx.removeGpsStatusListener(this);
      AppMethodBeat.o(55598);
    }
  }

  public final void onGpsStatusChanged(int paramInt)
  {
    AppMethodBeat.i(55600);
    if (paramInt == 4)
      if (this.bEE == null)
      {
        this.bEE = this.Wx.getGpsStatus(null);
        AppMethodBeat.o(55600);
      }
    while (true)
    {
      return;
      this.Wx.getGpsStatus(this.bEE);
      AppMethodBeat.o(55600);
    }
  }

  public final void onLocationChanged(Location paramLocation)
  {
    AppMethodBeat.i(55599);
    if (!y.bIM)
    {
      if (Settings.Secure.getString(this.Gn.getContentResolver(), "mock_location").equals("0"));
      for (i = 0; i != 0; i = 1)
      {
        AppMethodBeat.o(55599);
        return;
      }
    }
    int i = 0;
    Iterator localIterator;
    int j;
    label73: int k;
    if (this.bEE != null)
    {
      localIterator = this.bEE.getSatellites().iterator();
      j = 0;
      if (!localIterator.hasNext())
      {
        k = j;
        j = i;
        i = k;
      }
    }
    while (true)
    {
      this.bEG.a(paramLocation.getAccuracy(), i, paramLocation.getTime());
      c(new k.b(paramLocation.getLatitude(), paramLocation.getLongitude(), paramLocation.getAltitude(), paramLocation.getAccuracy(), paramLocation.getSpeed(), j, i, this.bEG.bEK, this.bEG.bES / 1000L, (byte)0));
      AppMethodBeat.o(55599);
      break;
      GpsSatellite localGpsSatellite = (GpsSatellite)localIterator.next();
      k = i + 1;
      i = k;
      if (!localGpsSatellite.usedInFix())
        break label73;
      j++;
      i = k;
      break label73;
      i = 0;
      j = 0;
    }
  }

  public final void onProviderDisabled(String paramString)
  {
  }

  public final void onProviderEnabled(String paramString)
  {
  }

  public final void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
  }

  final void vV()
  {
  }

  final void vW()
  {
    AppMethodBeat.i(55602);
    if ((!this.bED) || (!this.isRunning) || (this.bEF.bCP >= 300000L))
      AppMethodBeat.o(55602);
    while (true)
    {
      return;
      a(300000L, this.bEF.bEH);
      AppMethodBeat.o(55602);
    }
  }

  final void vX()
  {
    AppMethodBeat.i(55603);
    if ((!this.bED) || (!this.isRunning) || (this.bEF.bCP >= 300000L))
      AppMethodBeat.o(55603);
    while (true)
    {
      return;
      a(this.bEF.bCP, this.bEF.bEH);
      AppMethodBeat.o(55603);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.b.a.a.k
 * JD-Core Version:    0.6.2
 */