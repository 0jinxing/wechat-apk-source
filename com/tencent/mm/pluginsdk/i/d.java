package com.tencent.mm.pluginsdk.i;

import android.content.Context;
import android.hardware.SensorManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public final class d
{
  private SensorManager vfZ;
  private d.a vga;

  public d(Context paramContext)
  {
    AppMethodBeat.i(79650);
    this.vfZ = ((SensorManager)paramContext.getSystemService("sensor"));
    AppMethodBeat.o(79650);
  }

  private boolean diL()
  {
    boolean bool = false;
    AppMethodBeat.i(79655);
    if (this.vfZ == null)
    {
      ab.e("MicroMsg.ShakeSensorService", "cannot init sensor manager");
      AppMethodBeat.o(79655);
    }
    while (true)
    {
      return bool;
      List localList = this.vfZ.getSensorList(1);
      if ((localList != null) && (localList.size() > 0))
      {
        AppMethodBeat.o(79655);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(79655);
      }
    }
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(79652);
    bgr();
    if (diL())
    {
      this.vga = parama;
      this.vfZ.registerListener(this.vga, this.vfZ.getDefaultSensor(1), 1);
      AppMethodBeat.o(79652);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.ShakeSensorService", "no sensor found for shake detection");
      AppMethodBeat.o(79652);
    }
  }

  public final void bgr()
  {
    AppMethodBeat.i(79653);
    if (this.vga != null)
    {
      this.vfZ.unregisterListener(this.vga, this.vfZ.getDefaultSensor(1));
      this.vga = null;
    }
    AppMethodBeat.o(79653);
  }

  public final boolean diI()
  {
    if (this.vga != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void diJ()
  {
    AppMethodBeat.i(79651);
    if (this.vga != null)
      d.a.reset();
    AppMethodBeat.o(79651);
  }

  public final boolean diK()
  {
    AppMethodBeat.i(79654);
    boolean bool;
    if (diL())
    {
      bool = true;
      AppMethodBeat.o(79654);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79654);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.i.d
 * JD-Core Version:    0.6.2
 */