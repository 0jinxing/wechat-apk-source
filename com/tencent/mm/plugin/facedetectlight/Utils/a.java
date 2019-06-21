package com.tencent.mm.plugin.facedetectlight.Utils;

import android.content.Context;
import android.hardware.SensorManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private SensorManager bCW;
  private a.a mdn;
  private boolean mdo = false;

  public final float btS()
  {
    AppMethodBeat.i(752);
    float f;
    if (this.mdn != null)
    {
      new StringBuilder("Light lux: ").append(a.a.a(this.mdn));
      f = a.a.a(this.mdn);
      AppMethodBeat.o(752);
    }
    while (true)
    {
      return f;
      f = -1.0F;
      AppMethodBeat.o(752);
    }
  }

  public final void dM(Context paramContext)
  {
    AppMethodBeat.i(751);
    if (this.mdo)
      AppMethodBeat.o(751);
    while (true)
    {
      return;
      this.mdo = true;
      new StringBuilder("lightSensor has started:").append(this.mdo);
      this.bCW = ((SensorManager)paramContext.getApplicationContext().getSystemService("sensor"));
      paramContext = this.bCW.getDefaultSensor(5);
      if (paramContext != null)
      {
        this.mdn = new a.a(this, (byte)0);
        this.bCW.registerListener(this.mdn, paramContext, 3);
      }
      AppMethodBeat.o(751);
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(753);
    if ((!this.mdo) || (this.bCW == null))
      AppMethodBeat.o(753);
    while (true)
    {
      return;
      this.mdo = false;
      this.bCW.unregisterListener(this.mdn);
      AppMethodBeat.o(753);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.Utils.a
 * JD-Core Version:    0.6.2
 */