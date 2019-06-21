package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bf;
import com.tencent.mm.sdk.platformtools.bo;

public final class d
  implements SensorController.a
{
  private boolean mfR;
  public bf mfS;
  long mfT;
  public SensorController mfW;
  public a nxu;

  public d()
  {
    AppMethodBeat.i(21820);
    this.mfT = -1L;
    this.mfR = false;
    this.nxu = null;
    this.mfW = new SensorController(ah.getContext());
    this.mfS = new bf(ah.getContext());
    AppMethodBeat.o(21820);
  }

  public final void he(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(21821);
    ab.i("MicroMsg.IPCallSensorManager", "onSensorEvent, isON:" + paramBoolean + "  hasSkip:" + this.mfR + " tick:" + bo.az(this.mfT) + "  lt:" + this.mfT);
    if (this.mfR)
      if (!paramBoolean)
      {
        paramBoolean = bool;
        this.mfR = paramBoolean;
        AppMethodBeat.o(21821);
      }
    while (true)
    {
      return;
      paramBoolean = false;
      break;
      if ((!paramBoolean) && (this.mfT != -1L) && (bo.az(this.mfT) > 400L))
      {
        this.mfR = true;
        AppMethodBeat.o(21821);
      }
      else
      {
        this.mfR = false;
        ab.i("MicroMsg.IPCallSensorManager", "onSensorEvent, isNeedOffScreen: %b", new Object[] { Boolean.valueOf(paramBoolean) });
        new ap(new d.2(this, paramBoolean), false).ae(50L, 50L);
        AppMethodBeat.o(21821);
      }
    }
  }

  public static abstract interface a
  {
    public abstract void iq(boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.b.d
 * JD-Core Version:    0.6.2
 */