package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.mmsight.model.e.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

final class SightCaptureUI$10
  implements Runnable
{
  SightCaptureUI$10(SightCaptureUI paramSightCaptureUI, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55195);
    ab.c("MicroMsg.SightCaptureUI", "call stop callback now, currentStatus: %s", new Object[] { SightCaptureUI.zb(SightCaptureUI.g(this.oDf)) });
    SightCaptureUI.j(this.oDf).a(e.a.ouk);
    SightCaptureUI.B(this.oDf);
    long l = com.tencent.mm.plugin.mmsight.d.RN("TIME_RECODER_2_PLAY");
    com.tencent.mm.sdk.g.d.post(new SightCaptureUI.10.1(this, l), "BigSightFFMpegRecorder_markAfterCaptureFinish_idkeystat");
    ab.v("MicroMsg.TestCaptureUiEvent", "doStopRecorderAndStartPreviewDone %s", new Object[] { bo.dpG().toString() });
    ab.i("MicroMsg.SightCaptureUI", "stop finish, filepath: %s %s time_takevideo %s", new Object[] { SightCaptureUI.p(this.oDf).getFilePath(), Long.valueOf(com.tencent.mm.vfs.e.asZ(SightCaptureUI.p(this.oDf).getFilePath())), Long.valueOf(l) });
    SightCaptureUI.a(this.oDf, SightCaptureUI.p(this.oDf).Aq());
    SightCaptureUI.A(this.oDf);
    SightCaptureUI.L(this.oDf);
    SightCaptureUI.M(this.oDf);
    al.n(SightCaptureUI.N(this.oDf), 1000L);
    if ((SightCaptureUI.a(this.oDf).scene == 1) || (SightCaptureUI.a(this.oDf).scene == 2) || (SightCaptureUI.a(this.oDf).scene == 7))
      h.pYm.e(13819, new Object[] { Integer.valueOf(2), Integer.valueOf(SightCaptureUI.a(this.oDf).scene), SightCaptureUI.a(this.oDf).osR, Long.valueOf(bo.anT()) });
    AppMethodBeat.o(55195);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.10
 * JD-Core Version:    0.6.2
 */