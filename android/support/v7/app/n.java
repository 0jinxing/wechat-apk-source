package android.support.v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.content.f;
import java.util.Calendar;

final class n
{
  private static n Ww;
  private final LocationManager Wx;
  private final a Wy = new a();
  private final Context mContext;

  private n(Context paramContext, LocationManager paramLocationManager)
  {
    this.mContext = paramContext;
    this.Wx = paramLocationManager;
  }

  private Location P(String paramString)
  {
    try
    {
      if (this.Wx.isProviderEnabled(paramString))
      {
        paramString = this.Wx.getLastKnownLocation(paramString);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
        paramString = null;
    }
  }

  static n W(Context paramContext)
  {
    if (Ww == null)
    {
      paramContext = paramContext.getApplicationContext();
      Ww = new n(paramContext, (LocationManager)paramContext.getSystemService("location"));
    }
    return Ww;
  }

  private void a(Location paramLocation)
  {
    a locala = this.Wy;
    long l1 = System.currentTimeMillis();
    m localm = m.fB();
    localm.a(l1 - 86400000L, paramLocation.getLatitude(), paramLocation.getLongitude());
    long l2 = localm.Wu;
    localm.a(l1, paramLocation.getLatitude(), paramLocation.getLongitude());
    if (localm.state == 1);
    long l3;
    long l4;
    long l5;
    for (boolean bool = true; ; bool = false)
    {
      l3 = localm.Wv;
      l4 = localm.Wu;
      localm.a(86400000L + l1, paramLocation.getLatitude(), paramLocation.getLongitude());
      l5 = localm.Wv;
      if ((l3 != -1L) && (l4 != -1L))
        break;
      l1 = 43200000L + l1;
      locala.Wz = bool;
      locala.WA = l2;
      locala.WB = l3;
      locala.WC = l4;
      locala.WD = l5;
      locala.WE = l1;
      return;
    }
    if (l1 > l4)
      l1 = 0L + l5;
    while (true)
    {
      l1 += 60000L;
      break;
      if (l1 > l3)
        l1 = 0L + l4;
      else
        l1 = 0L + l3;
    }
  }

  @SuppressLint({"MissingPermission"})
  private Location fD()
  {
    Location localLocation1 = null;
    if (f.checkSelfPermission(this.mContext, "android.permission.ACCESS_COARSE_LOCATION") == 0);
    for (Location localLocation2 = P("network"); ; localLocation2 = null)
    {
      if (f.checkSelfPermission(this.mContext, "android.permission.ACCESS_FINE_LOCATION") == 0)
        localLocation1 = P("gps");
      Location localLocation3;
      if ((localLocation1 != null) && (localLocation2 != null))
      {
        localLocation3 = localLocation2;
        if (localLocation1.getTime() > localLocation2.getTime())
          localLocation3 = localLocation1;
      }
      while (true)
      {
        return localLocation3;
        localLocation3 = localLocation2;
        if (localLocation1 != null)
          localLocation3 = localLocation1;
      }
    }
  }

  private boolean fE()
  {
    if (this.Wy.WE > System.currentTimeMillis());
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final boolean fC()
  {
    a locala = this.Wy;
    boolean bool;
    if (fE())
      bool = locala.Wz;
    while (true)
    {
      return bool;
      Location localLocation = fD();
      if (localLocation != null)
      {
        a(localLocation);
        bool = locala.Wz;
      }
      else
      {
        int i = Calendar.getInstance().get(11);
        if ((i < 6) || (i >= 22))
          bool = true;
        else
          bool = false;
      }
    }
  }

  static final class a
  {
    long WA;
    long WB;
    long WC;
    long WD;
    long WE;
    boolean Wz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.n
 * JD-Core Version:    0.6.2
 */