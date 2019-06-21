package com.tencent.mm.plugin.n;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.a;

final class j$1
  implements ak.a
{
  j$1(j paramj)
  {
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(117892);
    int i = paramMessage.what;
    ab.i("MicroMsg.VideoPlayerImpl", "%s inner callback %d %d [%d]", new Object[] { this.osm.orH.aZm(), Integer.valueOf(i), Integer.valueOf(this.osm.state), Integer.valueOf(this.osm.osg.state) });
    switch (i)
    {
    default:
    case 2:
    case 7:
    case 9:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(117892);
      while (true)
      {
        return false;
        if (this.osm.state < 2);
        for (i = 1; ; i = 0)
        {
          if (i != 0)
            break label149;
          AppMethodBeat.o(117892);
          break;
        }
        label149: bool1 = d.yA(this.osm.osg.state);
        bool2 = bool1;
        if (this.osm.osi != null)
          bool2 = bool1 & d.yA(this.osm.osi.state);
        if (!bool2)
          break;
        this.osm.setState(2);
        this.osm.orI.obtainMessage(1).sendToTarget();
        break;
        j.a(this.osm);
        break;
        if (d.yD(this.osm.state))
        {
          AppMethodBeat.o(117892);
        }
        else
        {
          if ((!d.yE(this.osm.state)) && (!d.yC(this.osm.state)))
            break label311;
          this.osm.setState(9);
          this.osm.orI.obtainMessage(2).sendToTarget();
          AppMethodBeat.o(117892);
        }
      }
      label311: boolean bool1 = d.yD(this.osm.osg.state);
      boolean bool2 = bool1;
      if (this.osm.osi != null)
        bool2 = bool1 & d.yD(this.osm.osi.state);
      if (bool2)
      {
        this.osm.setState(9);
        this.osm.orI.obtainMessage(2).sendToTarget();
        continue;
        if ((this.osm.osf) && ((this.osm.eif) || (this.osm.osh)))
          this.osm.orI.obtainMessage(6).sendToTarget();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.n.j.1
 * JD-Core Version:    0.6.2
 */