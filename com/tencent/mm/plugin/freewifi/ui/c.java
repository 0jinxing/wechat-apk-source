package com.tencent.mm.plugin.freewifi.ui;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class c
{
  private static String TAG = "MicroMsg.FreeWifi.FreeWifiGetLocation";
  private boolean isRunning = false;
  private b mzn = null;
  private b.a mzo = null;
  private ak mzp = null;

  public static c bzM()
  {
    AppMethodBeat.i(20996);
    c localc = c.b.bzN();
    AppMethodBeat.o(20996);
    return localc;
  }

  public final void a(final c.a parama)
  {
    AppMethodBeat.i(20997);
    if (this.isRunning)
      AppMethodBeat.o(20997);
    while (true)
    {
      return;
      this.isRunning = true;
      this.mzn = d.agz();
      if (this.mzn == null)
      {
        ab.e(TAG, "doGeoLocation fail, iGetLocation is null");
        AppMethodBeat.o(20997);
      }
      else
      {
        if (this.mzo == null)
          this.mzo = new b.a()
          {
            public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
            {
              AppMethodBeat.i(20993);
              if (!paramAnonymousBoolean)
              {
                paramAnonymousBoolean = true;
                AppMethodBeat.o(20993);
              }
              while (true)
              {
                return paramAnonymousBoolean;
                ab.v(c.TAG, "doGeoLocation.onGetLocation, fLongitude:%f, fLatitude:%f, locType:%d, speed:%f, accuracy:%f", new Object[] { Float.valueOf(paramAnonymousFloat1), Float.valueOf(paramAnonymousFloat2), Integer.valueOf(paramAnonymousInt), Double.valueOf(paramAnonymousDouble1), Double.valueOf(paramAnonymousDouble2) });
                if (c.a(c.this) != null)
                  c.a(c.this).c(c.b(c.this));
                if (c.b(c.this) == null)
                {
                  ab.w(c.TAG, "already callback");
                  paramAnonymousBoolean = false;
                  AppMethodBeat.o(20993);
                }
                else
                {
                  c.c(c.this);
                  parama.Q(paramAnonymousFloat1, paramAnonymousFloat2);
                  paramAnonymousBoolean = false;
                  AppMethodBeat.o(20993);
                }
              }
            }
          };
        if (this.mzp == null)
          this.mzp = new ak(Looper.myLooper());
        this.mzp.postDelayed(new c.2(this), 20000L);
        this.mzn.a(this.mzo);
        AppMethodBeat.o(20997);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.c
 * JD-Core Version:    0.6.2
 */