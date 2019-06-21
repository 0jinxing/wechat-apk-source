package com.tencent.mm.plugin.n;

import android.os.Message;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.a;
import com.tencent.mm.sdk.platformtools.bo;

final class j$2
  implements ak.a
{
  j$2(j paramj)
  {
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(117893);
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
      AppMethodBeat.o(117893);
      while (true)
      {
        return false;
        if (this.osm.osg.prepare())
        {
          this.osm.bfi = this.osm.osg.bfi;
          j.a(this.osm, this.osm.osb, SystemClock.elapsedRealtime(), 0L);
          break;
        }
        this.osm.orI.obtainMessage(5, -1, -1).sendToTarget();
        AppMethodBeat.o(117893);
      }
      paramMessage = this.osm.orH;
      long l = bo.az(paramMessage.orB);
      if ((paramMessage.orB > 0L) && (l >= 30L))
      {
        ab.w("MicroMsg.PlayTimeLine", "%s do some work delay 30ms!!![%d, %d]", new Object[] { paramMessage.aZm(), Long.valueOf(paramMessage.orB), Long.valueOf(l) });
        paramMessage.orC = 0L;
      }
      if (d.yD(this.osm.osg.state))
      {
        this.osm.osd.obtainMessage(9).sendToTarget();
        this.osm.osb.removeMessages(2);
      }
      else
      {
        int i = this.osm.osg.M(this.osm.aOw, this.osm.ose);
        if (d.yA(i))
          this.osm.osd.obtainMessage(2).sendToTarget();
        if (i == 7);
        for (int j = 1; ; j = 0)
        {
          if (j == 0)
            break label350;
          this.osm.osd.obtainMessage(7).sendToTarget();
          this.osm.osb.removeMessages(2);
          break;
        }
        label350: if (d.yF(i))
        {
          j.a(this.osm, this.osm.osb, SystemClock.elapsedRealtime(), 0L);
          this.osm.orH.orB = bo.yz();
        }
        else
        {
          if (this.osm.state == 3)
            j.a(this.osm, this.osm.osb, SystemClock.elapsedRealtime(), this.osm.orH.orC);
          while (true)
          {
            this.osm.orH.orB = bo.yz();
            break;
            if (this.osm.state == 5)
              j.a(this.osm, this.osm.osb, SystemClock.elapsedRealtime(), 0L);
            else if (this.osm.state == 1)
              j.a(this.osm, this.osm.osb, SystemClock.elapsedRealtime(), 0L);
            else if (this.osm.state == 0)
              j.a(this.osm, this.osm.osb, SystemClock.elapsedRealtime(), 0L);
            else if (this.osm.state == 6)
              j.a(this.osm, this.osm.osb, SystemClock.elapsedRealtime(), 0L);
            else
              this.osm.osb.removeMessages(2);
          }
          this.osm.yJ(3);
          this.osm.osg.start();
          j.a(this.osm, this.osm.osb, SystemClock.elapsedRealtime(), 0L);
          continue;
          this.osm.yJ(4);
          j.a(this.osm, this.osm.osb, SystemClock.elapsedRealtime(), 0L);
          this.osm.osg.pause();
          continue;
          this.osm.osg.release();
          this.osm.osf = true;
          this.osm.osd.obtainMessage(0).sendToTarget();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.n.j.2
 * JD-Core Version:    0.6.2
 */