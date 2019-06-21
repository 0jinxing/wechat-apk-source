package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
  implements a
{
  private static volatile a buL;
  private final AppMeasurement buK;

  @VisibleForTesting
  final Map<String, Object> buM;

  private b(AppMeasurement paramAppMeasurement)
  {
    AppMethodBeat.i(67871);
    Preconditions.checkNotNull(paramAppMeasurement);
    this.buK = paramAppMeasurement;
    this.buM = new ConcurrentHashMap();
    AppMethodBeat.o(67871);
  }

  @KeepForSdk
  public static a an(Context paramContext)
  {
    AppMethodBeat.i(67872);
    Preconditions.checkNotNull(paramContext);
    Preconditions.checkNotNull(paramContext.getApplicationContext());
    if (buL == null);
    try
    {
      if (buL == null)
      {
        b localb = new com/google/firebase/analytics/connector/b;
        localb.<init>(AppMeasurement.getInstance(paramContext));
        buL = localb;
      }
      paramContext = buL;
      AppMethodBeat.o(67872);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(67872);
    }
    throw paramContext;
  }

  @KeepForSdk
  public final void logEvent(String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(67873);
    if (!com.google.firebase.analytics.connector.internal.b.aV(paramString1))
    {
      paramString1 = String.valueOf(paramString1);
      if (paramString1.length() != 0)
      {
        "Origin not allowed : ".concat(paramString1);
        AppMethodBeat.o(67873);
      }
    }
    while (true)
    {
      return;
      new String("Origin not allowed : ");
      AppMethodBeat.o(67873);
      continue;
      if (!com.google.firebase.analytics.connector.internal.b.e(paramString2, paramBundle))
      {
        AppMethodBeat.o(67873);
      }
      else if (!com.google.firebase.analytics.connector.internal.b.a(paramString1, paramString2, paramBundle))
      {
        AppMethodBeat.o(67873);
      }
      else
      {
        this.buK.logEventInternal(paramString1, paramString2, paramBundle);
        AppMethodBeat.o(67873);
      }
    }
  }

  @KeepForSdk
  public final void setUserProperty(String paramString1, String paramString2, Object paramObject)
  {
    AppMethodBeat.i(67874);
    if (!com.google.firebase.analytics.connector.internal.b.aV(paramString1))
    {
      paramString1 = String.valueOf(paramString1);
      if (paramString1.length() != 0)
      {
        "Origin not allowed : ".concat(paramString1);
        AppMethodBeat.o(67874);
      }
    }
    while (true)
    {
      return;
      new String("Origin not allowed : ");
      AppMethodBeat.o(67874);
      continue;
      if (!com.google.firebase.analytics.connector.internal.b.aW(paramString2))
      {
        paramString1 = String.valueOf(paramString2);
        if (paramString1.length() != 0)
        {
          "User Property not allowed : ".concat(paramString1);
          AppMethodBeat.o(67874);
        }
        else
        {
          new String("User Property not allowed : ");
          AppMethodBeat.o(67874);
        }
      }
      else if (((paramString2.equals("_ce1")) || (paramString2.equals("_ce2"))) && (!paramString1.equals("fcm")) && (!paramString1.equals("frc")))
      {
        paramString1 = String.valueOf(paramString2);
        if (paramString1.length() != 0)
        {
          "User Property not allowed for this origin: ".concat(paramString1);
          AppMethodBeat.o(67874);
        }
        else
        {
          new String("User Property not allowed for this origin: ");
          AppMethodBeat.o(67874);
        }
      }
      else
      {
        this.buK.setUserPropertyInternal(paramString1, paramString2, paramObject);
        AppMethodBeat.o(67874);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.firebase.analytics.connector.b
 * JD-Core Version:    0.6.2
 */