package com.tencent.mm.plugin.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.a.k;
import com.tencent.mm.plugin.mmsight.model.a.l;
import com.tencent.mm.plugin.mmsight.model.j;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends com.tencent.mm.plugin.mmsight.api.b
{
  private com.tencent.mm.plugin.mmsight.model.a.d gLs;
  private VideoTransPara gLt;

  public final void a(com.tencent.mm.remoteservice.d paramd, VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76305);
    if (paramd != null)
      CaptureMMProxy.createProxy(new CaptureMMProxy(paramd));
    j.c(paramVideoTransPara);
    this.gLt = paramVideoTransPara;
    AppMethodBeat.o(76305);
  }

  public final com.tencent.mm.plugin.mmsight.model.a.d asl()
  {
    AppMethodBeat.i(76307);
    if (this.gLt != null)
    {
      k.bPR();
      this.gLs = k.p(this.gLt);
    }
    if ((this.gLs instanceof l))
    {
      localObject = (l)this.gLs;
      ab.i("MicroMsg.MMSightFFMpegRecorder", "setStopOnCameraDataThread: %s", new Object[] { Boolean.TRUE });
      ((l)localObject).oww = true;
    }
    Object localObject = this.gLs;
    AppMethodBeat.o(76307);
    return localObject;
  }

  public final void b(com.tencent.mm.remoteservice.d paramd, VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76306);
    if (paramd != null)
      CaptureMMProxy.createProxy(new CaptureMMProxy(paramd));
    j.c(paramVideoTransPara);
    j.ouz.etz = 1;
    this.gLt = paramVideoTransPara;
    AppMethodBeat.o(76306);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.b
 * JD-Core Version:    0.6.2
 */