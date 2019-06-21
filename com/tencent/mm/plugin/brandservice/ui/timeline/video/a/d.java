package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.p;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.s;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/KV17149;", "", "()V", "SPLITOR", "", "TAG", "controller", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "endPlayTime", "", "getEndPlayTime", "()I", "setEndPlayTime", "(I)V", "playErrType", "getPlayErrType", "()Ljava/lang/String;", "setPlayErrType", "(Ljava/lang/String;)V", "realPlayTime", "getRealPlayTime", "setRealPlayTime", "stayTimeInPage", "getStayTimeInPage", "setStayTimeInPage", "doReport", "", "eventType", "getPlayType", "playStatus", "init", "plugin-brandservice_release"})
public final class d
{
  private final String TAG = "MicroMsg.MPDataReportHelper";
  public b jWx;
  public String jYA = "";
  private final String jYw = ",";
  public int jYx;
  public int jYy;
  public int jYz;

  public final void sE(int paramInt)
  {
    AppMethodBeat.i(15325);
    int i = com.tencent.mm.af.l.Me();
    int j = i;
    if (i == 100)
      j = -1;
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(j);
    ((StringBuilder)localObject).append(this.jYw);
    b localb = this.jWx;
    if (localb == null)
      j.avw("controller");
    ((StringBuilder)localObject).append(localb.HE());
    ((StringBuilder)localObject).append(this.jYw);
    localb = this.jWx;
    if (localb == null)
      j.avw("controller");
    ((StringBuilder)localObject).append(localb.jVD);
    ((StringBuilder)localObject).append(this.jYw);
    localb = this.jWx;
    if (localb == null)
      j.avw("controller");
    ((StringBuilder)localObject).append(localb.jVE);
    ((StringBuilder)localObject).append(this.jYw);
    ((StringBuilder)localObject).append(s.getSessionId());
    ((StringBuilder)localObject).append(this.jYw);
    localb = this.jWx;
    if (localb == null)
      j.avw("controller");
    ((StringBuilder)localObject).append(localb.jVF);
    ((StringBuilder)localObject).append(this.jYw);
    localb = this.jWx;
    if (localb == null)
      j.avw("controller");
    ((StringBuilder)localObject).append(localb.fgd);
    ((StringBuilder)localObject).append(this.jYw);
    localb = this.jWx;
    if (localb == null)
      j.avw("controller");
    ((StringBuilder)localObject).append(localb.aYl().fjB);
    ((StringBuilder)localObject).append(this.jYw);
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(this.jYw);
    ((StringBuilder)localObject).append((int)(System.currentTimeMillis() / 1000L));
    ((StringBuilder)localObject).append(this.jYw);
    ((StringBuilder)localObject).append(this.jYx);
    ((StringBuilder)localObject).append(this.jYw);
    ((StringBuilder)localObject).append(this.jYy);
    ((StringBuilder)localObject).append(this.jYw);
    ((StringBuilder)localObject).append(this.jYz);
    ((StringBuilder)localObject).append(this.jYw);
    localb = this.jWx;
    if (localb == null)
      j.avw("controller");
    ((StringBuilder)localObject).append(localb.scene);
    ((StringBuilder)localObject).append(this.jYw);
    localb = this.jWx;
    if (localb == null)
      j.avw("controller");
    ((StringBuilder)localObject).append(localb.jSW);
    ((StringBuilder)localObject).append(this.jYw);
    ((StringBuilder)localObject).append(this.jYA);
    localObject = ((StringBuilder)localObject).toString();
    j.o(localObject, "sb.toString()");
    ab.d(this.TAG, "eventType: " + paramInt + " reportData: " + (String)localObject);
    h.pYm.X(17149, (String)localObject);
    AppMethodBeat.o(15325);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.d
 * JD-Core Version:    0.6.2
 */