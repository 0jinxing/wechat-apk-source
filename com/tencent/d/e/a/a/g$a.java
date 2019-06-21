package com.tencent.d.e.a.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class g$a
  implements SensorEventListener
{
  long AtD;
  final AtomicBoolean AtO;
  int AtP;
  long AtQ;

  g$a(g paramg)
  {
    AppMethodBeat.i(114555);
    this.AtO = new AtomicBoolean(false);
    this.AtD = 0L;
    this.AtP = 0;
    this.AtQ = 0L;
    AppMethodBeat.o(114555);
  }

  public final long dQx()
  {
    synchronized (this.AtO)
    {
      long l = this.AtD;
      return l;
    }
  }

  public final long dQy()
  {
    synchronized (this.AtO)
    {
      long l = this.AtQ;
      return l;
    }
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent arg1)
  {
    AppMethodBeat.i(114556);
    j localj;
    int i;
    int j;
    while (true)
    {
      synchronized (this.AtO)
      {
        if (!this.AtO.get())
        {
          AppMethodBeat.o(114556);
          return;
        }
        if ((??? == null) || (???.sensor == null))
          AppMethodBeat.o(114556);
      }
      localj = new j(???, System.currentTimeMillis());
      synchronized (this.AtO)
      {
        long l = localj.timestamp - this.AtD;
        if (l < 0L)
        {
          AppMethodBeat.o(114556);
        }
        else
        {
          i = localj.AtV;
          j = (int)(l / f.AtH);
        }
      }
    }
    while (true)
      synchronized (g.a(this.AtR))
      {
        ??? = (i)g.a(this.AtR).get(i);
        if (??? == null)
        {
          ??? = new com/tencent/d/e/a/a/i;
          ???.<init>(i, f.AtI, this.AtP);
          g.a(this.AtR).put(i, ???);
          if ((j < ???.mCapacity) && (j > ???.mbt))
          {
            i = j / ???.Adk;
            List localList = (List)???.Ll[i];
            ??? = localList;
            if (localList == null)
            {
              ??? = new java/util/ArrayList;
              ((ArrayList)???).<init>();
              ???.Ll[i] = ???;
            }
            ((List)???).add(localj);
            ???.mbt = j;
          }
          AppMethodBeat.o(114556);
          break;
          localObject2 = finally;
          AppMethodBeat.o(114556);
          throw localObject2;
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.a.g.a
 * JD-Core Version:    0.6.2
 */