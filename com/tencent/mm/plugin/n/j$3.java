package com.tencent.mm.plugin.n;

import android.os.Message;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.a;

final class j$3
  implements ak.a
{
  j$3(j paramj)
  {
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(117894);
    if (this.osm.osi == null)
    {
      AppMethodBeat.o(117894);
      return false;
    }
    switch (paramMessage.what)
    {
    case 5:
    case 6:
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 7:
    }
    while (true)
    {
      AppMethodBeat.o(117894);
      break;
      if (!this.osm.osi.prepare())
      {
        ab.i("MicroMsg.VideoPlayerImpl", "%s audio track prepare error, release now.", new Object[] { this.osm.orH.aZm() });
        this.osm.osi.release();
        this.osm.osh = true;
        this.osm.osi = null;
      }
      j.a(this.osm, this.osm.osc, SystemClock.elapsedRealtime(), 0L);
      continue;
      if (d.yD(this.osm.osi.state))
      {
        this.osm.osd.obtainMessage(9).sendToTarget();
        this.osm.osc.removeMessages(2);
      }
      else
      {
        if (d.yA(this.osm.osi.M(this.osm.aOw, this.osm.ose)))
          this.osm.osd.sendMessageDelayed(this.osm.osd.obtainMessage(2), 10L);
        if (this.osm.state == 3)
        {
          j.a(this.osm, this.osm.osc, SystemClock.elapsedRealtime(), this.osm.orH.orC);
        }
        else if (this.osm.state == 5)
        {
          j.a(this.osm, this.osm.osc, SystemClock.elapsedRealtime(), 0L);
        }
        else if (this.osm.state == 1)
        {
          j.a(this.osm, this.osm.osc, SystemClock.elapsedRealtime(), 0L);
        }
        else if (this.osm.state == 0)
        {
          j.a(this.osm, this.osm.osc, SystemClock.elapsedRealtime(), 0L);
        }
        else
        {
          this.osm.osc.removeMessages(2);
          continue;
          this.osm.osi.start();
          j.a(this.osm, this.osm.osc, SystemClock.elapsedRealtime(), 0L);
          continue;
          j.a(this.osm, this.osm.osc, SystemClock.elapsedRealtime(), 0L);
          this.osm.osi.pause();
          continue;
          this.osm.osi.release();
          this.osm.osh = true;
          this.osm.osd.obtainMessage(0).sendToTarget();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.n.j.3
 * JD-Core Version:    0.6.2
 */