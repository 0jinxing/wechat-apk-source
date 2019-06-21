package com.tencent.mm.plugin.mmsight.model.a;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class l$a
  implements Runnable
{
  float bSi;
  Runnable callback;
  int duration;
  volatile int eVU;
  final Object fYV;
  boolean owA;
  boolean owB;
  boolean owC;
  boolean owD;
  int owy;
  volatile boolean owz;

  public l$a(l paraml)
  {
    AppMethodBeat.i(76604);
    this.eVU = 0;
    this.owz = true;
    this.owA = false;
    this.owB = false;
    this.owC = false;
    this.owD = false;
    this.fYV = new Object();
    this.callback = null;
    synchronized (this.fYV)
    {
      try
      {
        Object localObject2 = com.tencent.mm.vfs.e.atb(paraml.fcE);
        Object localObject3 = localObject2;
        if (!((String)localObject2).endsWith("/"))
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = (String)localObject2 + "/";
        }
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        paraml.fcS = ((String)localObject3 + "tempRotate.mp4");
        AppMethodBeat.o(76604);
        return;
      }
      catch (Exception paraml)
      {
        while (true)
          ab.e("MicroMsg.MMSightFFMpegRecorder", "retrieve file name error: %s", new Object[] { paraml.getMessage() });
      }
    }
  }

  public final void run()
  {
    AppMethodBeat.i(76605);
    if (this.owx.fYT == -1)
    {
      this.owx.fYT = Process.myTid();
      Process.setThreadPriority(Process.myTid(), -2);
      ab.i("MicroMsg.MMSightFFMpegRecorder", "encodeTid: %s", new Object[] { Integer.valueOf(this.owx.fYT) });
    }
    int i;
    int j;
    while (true)
    {
      synchronized (this.fYV)
      {
        if (this.owB)
          break label202;
        l = bo.yz();
        i = SightVideoJNI.triggerEncode(this.owy, Math.max(0, this.eVU), false);
        ab.i("MicroMsg.MMSightFFMpegRecorder", "ing: trgger encode use %dms, Encode index[%d, %d), threadId: %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(this.eVU), Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()) });
        j = Math.abs(i - this.eVU);
        if (j > 5);
      }
      try
      {
        Thread.sleep(100L);
        this.eVU = i;
        continue;
        localObject2 = finally;
        AppMethodBeat.o(76605);
        throw localObject2;
      }
      catch (Exception localException1)
      {
        while (true)
          ab.e("MicroMsg.MMSightFFMpegRecorder", "thread sleep error");
      }
    }
    label202: long l = bo.yz();
    if (!this.owC)
      this.eVU = SightVideoJNI.triggerEncode(this.owy, this.eVU, true);
    ab.i("MicroMsg.MMSightFFMpegRecorder", "end: trgger encode use %dms, curEncode index %d, markCancel %B, threadId: %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(this.eVU), Boolean.valueOf(this.owC), Long.valueOf(Thread.currentThread().getId()) });
    Object localObject3;
    Object localObject4;
    if (!this.owC)
    {
      j = Math.max(1000, this.duration);
      if (this.owx.fcH > 0)
        j = this.owx.fcH;
      float f = this.bSi;
      if (this.owx.fcI > 0.0F)
        f = this.owx.fcI;
      localObject3 = this.owx;
      localObject4 = new com/tencent/mm/plugin/mmsight/model/a/m;
      ((m)localObject4).<init>(this.owy, this.owx.fcE, f, this.owx.fcN, j, this.owx.fcY.audioSampleRate, false);
      ((l)localObject3).owq = ((e)localObject4);
      l = bo.yz();
      boolean bool = this.owx.owq.bPO();
      ab.i("MicroMsg.MMSightFFMpegRecorder", "mux used %sms, success: %s", new Object[] { Long.valueOf(bo.az(l)), Boolean.valueOf(bool) });
      if (!bool)
      {
        ab.e("MicroMsg.MMSightFFMpegRecorder", "mux failed!");
        SightVideoJNI.releaseBigSightDataBuffer(this.owy);
        localObject3 = new com/tencent/mm/plugin/mmsight/model/a/l$a$1;
        ((l.a.1)localObject3).<init>(this);
        al.d((Runnable)localObject3);
        ab.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegCaptureMuxError");
        h.pYm.a(440L, 30L, 1L, false);
        AppMethodBeat.o(76605);
      }
    }
    while (true)
    {
      return;
      if (((this.owx.fdb) && (this.owx.ouL)) || ((!this.owx.ouL) && (!this.owx.fdb)) || ((this.owx.fdb) && (Math.abs(this.owx.fcR - this.owx.fdc) == 0)) || (this.owx.fdc == 180))
      {
        l = bo.yz();
        if ((this.owx.ouL) || (this.owx.fdb))
          break label924;
        j = this.owx.fcR;
        label632: i = j;
        if (this.owx.fdc == 180)
        {
          i = j;
          if (!this.owx.ouL)
          {
            j += 180;
            i = j;
            if (j > 360)
              i = j - 360;
          }
        }
        if (i > 0)
        {
          SightVideoJNI.tagRotateVideo(this.owx.fcE, this.owx.fcS, i);
          ab.i("MicroMsg.MMSightFFMpegRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(this.owx.fcR), Boolean.valueOf(this.owx.fdb), Integer.valueOf(this.owx.fdc), Integer.valueOf(i) });
          localObject3 = this.owx.fcS;
        }
      }
      try
      {
        com.tencent.mm.vfs.e.y(this.owx.fcS, this.owx.fcE);
        localObject4 = new com/tencent/mm/plugin/mmsight/model/a/l$a$3;
        ((l.a.3)localObject4).<init>(this, (String)localObject3);
        d.post((Runnable)localObject4, "BigSightFFMpegRecorder_tagRotate_after_process");
        ab.i("MicroMsg.MMSightFFMpegRecorder", "tag rotate used %sms", new Object[] { Long.valueOf(bo.az(l)) });
        SightVideoJNI.releaseBigSightDataBuffer(this.owy);
        ab.i("MicroMsg.MMSightFFMpegRecorder", "all finish, callback: %s", new Object[] { this.callback });
        this.owx.reset();
        al.d(this.callback);
        this.owD = true;
        this.owx.fYT = -1;
        this.owx.owt = -1;
        AppMethodBeat.o(76605);
        continue;
        label924: if (this.owx.ouL)
        {
          j = this.owx.fdc;
          break label632;
        }
        j = 180;
      }
      catch (Exception localException2)
      {
        ab.e("MicroMsg.MMSightFFMpegRecorder", "stop, copy file error");
        SightVideoJNI.releaseBigSightDataBuffer(this.owy);
        l.a.2 local2 = new com/tencent/mm/plugin/mmsight/model/a/l$a$2;
        local2.<init>(this);
        al.d(local2);
        AppMethodBeat.o(76605);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.l.a
 * JD-Core Version:    0.6.2
 */