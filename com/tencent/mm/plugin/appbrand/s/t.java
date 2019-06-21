package com.tencent.mm.plugin.appbrand.s;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@TargetApi(3)
public final class t extends OrientationEventListener
{
  private int gfQ = 45;
  private a iRL = a.iRN;
  private t.b iRM;

  public t(Context paramContext, t.b paramb)
  {
    super(paramContext);
    this.iRM = paramb;
  }

  public final void disable()
  {
    AppMethodBeat.i(126642);
    super.disable();
    this.iRL = a.iRN;
    AppMethodBeat.o(126642);
  }

  public final void enable()
  {
    AppMethodBeat.i(126641);
    super.enable();
    AppMethodBeat.o(126641);
  }

  public final void onOrientationChanged(int paramInt)
  {
    AppMethodBeat.i(126643);
    if (paramInt == -1)
    {
      AppMethodBeat.o(126643);
      return;
    }
    a locala1 = this.iRL;
    a locala2;
    if (((paramInt >= 360 - this.gfQ) && (paramInt < 360)) || ((paramInt >= 0) && (paramInt <= this.gfQ + 0)))
      locala2 = a.iRO;
    while (true)
    {
      if (locala2 != this.iRL)
      {
        if ((this.iRM != null) && (this.iRL != a.iRN))
          this.iRM.a(this.iRL, locala2);
        this.iRL = locala2;
      }
      ab.i("MicroMsg.OrientationListenerHelper", "OrientationListener onOrientationChanged:".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(126643);
      break;
      if ((paramInt >= 270 - this.gfQ) && (paramInt <= this.gfQ + 270))
      {
        locala2 = a.iRP;
      }
      else if ((paramInt >= 180 - this.gfQ) && (paramInt <= this.gfQ + 180))
      {
        locala2 = a.iRQ;
      }
      else
      {
        locala2 = locala1;
        if (paramInt >= 90 - this.gfQ)
        {
          locala2 = locala1;
          if (paramInt <= this.gfQ + 90)
            locala2 = a.iRR;
        }
      }
    }
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(126640);
      iRN = new a("NONE", 0);
      iRO = new a("PORTRAIT", 1);
      iRP = new a("LANDSCAPE", 2);
      iRQ = new a("REVERSE_PORTRAIT", 3);
      iRR = new a("REVERSE_LANDSCAPE", 4);
      iRS = new a[] { iRN, iRO, iRP, iRQ, iRR };
      AppMethodBeat.o(126640);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.t
 * JD-Core Version:    0.6.2
 */