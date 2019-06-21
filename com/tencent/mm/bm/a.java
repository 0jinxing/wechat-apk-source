package com.tencent.mm.bm;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@TargetApi(3)
public final class a extends OrientationEventListener
{
  private a.a gfP = a.a.gfS;
  private int gfQ = 45;
  private a.b gfR;

  public a(Context paramContext, a.b paramb)
  {
    super(paramContext);
    this.gfR = paramb;
  }

  public final void disable()
  {
    AppMethodBeat.i(78999);
    super.disable();
    this.gfP = a.a.gfS;
    AppMethodBeat.o(78999);
  }

  public final void enable()
  {
    AppMethodBeat.i(78998);
    super.enable();
    AppMethodBeat.o(78998);
  }

  public final void onOrientationChanged(int paramInt)
  {
    AppMethodBeat.i(79000);
    if (paramInt == -1)
    {
      AppMethodBeat.o(79000);
      return;
    }
    a.a locala1 = this.gfP;
    a.a locala2;
    if (((paramInt >= 360 - this.gfQ) && (paramInt < 360)) || ((paramInt >= 0) && (paramInt <= this.gfQ + 0)))
      locala2 = a.a.gfT;
    while (true)
    {
      if (locala2 != this.gfP)
      {
        if ((this.gfR != null) && (this.gfP != a.a.gfS))
          this.gfR.a(this.gfP, locala2);
        this.gfP = locala2;
      }
      ab.i("MicroMsg.OrientationListenerHelper", "OrientationListener onOrientationChanged:".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(79000);
      break;
      if ((paramInt >= 270 - this.gfQ) && (paramInt <= this.gfQ + 270))
      {
        locala2 = a.a.gfU;
      }
      else if ((paramInt >= 180 - this.gfQ) && (paramInt <= this.gfQ + 180))
      {
        locala2 = a.a.gfV;
      }
      else
      {
        locala2 = locala1;
        if (paramInt >= 90 - this.gfQ)
        {
          locala2 = locala1;
          if (paramInt <= this.gfQ + 90)
            locala2 = a.a.gfW;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bm.a
 * JD-Core Version:    0.6.2
 */