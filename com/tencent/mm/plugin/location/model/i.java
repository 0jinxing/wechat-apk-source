package com.tencent.mm.plugin.location.model;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

public final class i
{
  private SensorManager bCW;
  private b.a ecy;
  private d fwu;
  private i.b nJL;
  HashSet<WeakReference<i.a>> nJM;
  double nJN;
  double nJO;
  double nJP;
  double nJQ;
  double nJR;
  boolean nJS;

  public i()
  {
    AppMethodBeat.i(113320);
    this.nJL = new i.b(this);
    this.nJM = new HashSet();
    this.nJN = 900.0D;
    this.nJO = 900.0D;
    this.nJP = -1000.0D;
    this.nJQ = -1000.0D;
    this.nJR = 0.0D;
    this.nJS = false;
    this.ecy = new i.1(this);
    this.bCW = ((SensorManager)ah.getContext().getSystemService("sensor"));
    AppMethodBeat.o(113320);
  }

  private void bJs()
  {
    AppMethodBeat.i(113322);
    ab.i("MicroMsg.OrientationSensorMgr", "registerSensor ");
    if (this.fwu == null)
      this.fwu = d.agz();
    this.fwu.b(this.ecy, true);
    Sensor localSensor = this.bCW.getDefaultSensor(3);
    this.bCW.registerListener(this.nJL, localSensor, 1);
    AppMethodBeat.o(113322);
  }

  public final void a(i.a parama)
  {
    AppMethodBeat.i(113324);
    Iterator localIterator = this.nJM.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((i.a)localWeakReference.get()).equals(parama)))
        AppMethodBeat.o(113324);
    }
    while (true)
    {
      return;
      this.nJM.add(new WeakReference(parama));
      ab.i("MicroMsg.OrientationSensorMgr", "registerSensorListener %d", new Object[] { Integer.valueOf(this.nJM.size()) });
      if (this.nJM.size() == 1)
        bJs();
      AppMethodBeat.o(113324);
    }
  }

  public final void b(i.a parama)
  {
    AppMethodBeat.i(113325);
    if ((this.nJM == null) || (parama == null))
      AppMethodBeat.o(113325);
    while (true)
    {
      return;
      Iterator localIterator = this.nJM.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if ((localWeakReference != null) && (localWeakReference.get() != null) && (((i.a)localWeakReference.get()).equals(parama)))
          this.nJM.remove(localWeakReference);
      }
      ab.i("MicroMsg.OrientationSensorMgr", "unregisterSensorListener %d", new Object[] { Integer.valueOf(this.nJM.size()) });
      if (this.nJM.size() == 0)
        bJt();
      AppMethodBeat.o(113325);
    }
  }

  public final double bJr()
  {
    AppMethodBeat.i(113321);
    double d;
    if (this.nJS)
    {
      ab.d("MicroMsg.OrientationSensorMgr", "getHeading, mIsMove = true, result = %f", new Object[] { Double.valueOf(this.nJN) });
      d = this.nJN;
      AppMethodBeat.o(113321);
    }
    while (true)
    {
      return d;
      ab.d("MicroMsg.OrientationSensorMgr", "getHeading, mIsMove = false, result = %f", new Object[] { Double.valueOf(this.nJR) });
      d = this.nJR;
      AppMethodBeat.o(113321);
    }
  }

  final void bJt()
  {
    AppMethodBeat.i(113323);
    ab.i("MicroMsg.OrientationSensorMgr", "unregisterSensor ");
    this.bCW.unregisterListener(this.nJL);
    d.agz().c(this.ecy);
    AppMethodBeat.o(113323);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.i
 * JD-Core Version:    0.6.2
 */