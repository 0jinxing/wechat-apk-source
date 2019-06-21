package com.tencent.mm.plugin.mmsight.model.a;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  private static int ove = 4;
  static int ovf = 4;
  ak handler;
  HandlerThread[] ovg;
  int ovh;
  private int ovi;
  private LinkedList<b> ovj;
  private a.a ovk;
  boolean ovl;
  b.a ovm;

  public a(a.a parama)
  {
    AppMethodBeat.i(76564);
    this.ovh = 0;
    this.ovi = 0;
    this.ovj = new LinkedList();
    this.ovl = false;
    this.ovm = new a.1(this);
    this.ovk = parama;
    ovf = -1;
    if (CaptureMMProxy.getInstance() != null)
      ovf = CaptureMMProxy.getInstance().getInt(ac.a.xPi, -1);
    if (ovf == -1)
    {
      ovf = Runtime.getRuntime().availableProcessors();
      ovf = Math.min(ove, ovf);
      ab.i("MicroMsg.ForwardMgr", "ForwardMgr THREAD_COUNT from runtime %d, availableProcessors: %s", new Object[] { Integer.valueOf(ovf), Integer.valueOf(Runtime.getRuntime().availableProcessors()) });
    }
    while (true)
    {
      this.ovg = new HandlerThread[ovf];
      SightVideoJNI.initScaleAndRoateBuffer(ovf);
      for (int i = 0; i < this.ovg.length; i++)
      {
        this.ovg[i] = d.ek("BigSightMediaCodecMP4MuxRecorder_FrameBufProcessMgr_".concat(String.valueOf(i)), -1);
        this.ovg[i].start();
      }
      ab.i("MicroMsg.ForwardMgr", "ForwardMgr THREAD_COUNT from config %d", new Object[] { Integer.valueOf(ovf) });
    }
    this.ovl = false;
    AppMethodBeat.o(76564);
  }

  private void bPK()
  {
    AppMethodBeat.i(76565);
    ab.i("MicroMsg.ForwardMgr", "processBufList %d %d", new Object[] { Integer.valueOf(this.ovj.size()), Integer.valueOf(this.ovi) });
    label176: 
    while (true)
    {
      if (this.ovj.size() == 0)
      {
        AppMethodBeat.o(76565);
        return;
      }
      ab.i("MicroMsg.ForwardMgr", "loop processBufList %d %d", new Object[] { Integer.valueOf(this.ovj.size()), Integer.valueOf(this.ovi) });
      Iterator localIterator = this.ovj.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (this.ovi == localb.ovt)
        {
          this.ovi += 1;
          this.ovk.output(localb.ovr);
          this.ovj.remove(localb);
        }
      }
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label176;
        AppMethodBeat.o(76565);
        break;
      }
    }
  }

  public final boolean bPL()
  {
    if (this.ovi == this.ovh);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected final void finalize()
  {
    AppMethodBeat.i(76567);
    try
    {
      stop();
      label9: super.finalize();
      AppMethodBeat.o(76567);
      return;
    }
    catch (Throwable localThrowable)
    {
      break label9;
    }
  }

  public final void stop()
  {
    int i = 0;
    AppMethodBeat.i(76566);
    ab.i("MicroMsg.ForwardMgr", "stop FrameBufProcessMgr %s", new Object[] { bo.dpG().toString() });
    while (i < this.ovg.length)
    {
      if (this.ovg[i] != null)
      {
        this.ovg[i].quit();
        this.ovg[i] = null;
      }
      i++;
    }
    SightVideoJNI.releaseScaleAndRoateBuffer(ovf);
    this.ovl = true;
    AppMethodBeat.o(76566);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.a
 * JD-Core Version:    0.6.2
 */