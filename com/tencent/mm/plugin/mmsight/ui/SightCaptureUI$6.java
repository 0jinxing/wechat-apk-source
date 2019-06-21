package com.tencent.mm.plugin.mmsight.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.model.e.b;
import com.tencent.mm.plugin.mmsight.model.k;
import com.tencent.mm.plugin.mmsight.ui.cameraglview.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class SightCaptureUI$6
  implements e.b
{
  SightCaptureUI$6(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(55190);
    if ((paramArrayOfByte == null) || (paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0))
    {
      ab.e("MicroMsg.SightCaptureUI", "onPictureYuvTaken, data is null!!");
      SightCaptureUI.z(this.oDf);
      AppMethodBeat.o(55190);
      return;
    }
    ab.i("MicroMsg.SightCaptureUI", "data frameWidth %s frameHeight %s rotate %s deviceDegree %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    SightCaptureUI.A(this.oDf);
    SightCaptureUI.B(this.oDf);
    SightCaptureUI.b(this.oDf, paramInt1);
    SightCaptureUI.c(this.oDf, paramInt2);
    SightCaptureUI.d(this.oDf, paramInt3);
    SightCaptureUI.e(this.oDf, paramInt4);
    if (SightCaptureUI.C(this.oDf) != null)
    {
      j.owk.g(SightCaptureUI.C(this.oDf));
      SightCaptureUI.a(this.oDf, null);
    }
    SightCaptureUI.a(this.oDf, j.owk.g(Integer.valueOf(paramArrayOfByte.length)));
    System.arraycopy(paramArrayOfByte, 0, SightCaptureUI.C(this.oDf), 0, paramArrayOfByte.length);
    SightCaptureUI.a(this.oDf, com.tencent.mm.sdk.g.d.h(new SightCaptureUI.6.1(this), "SightCaptureUI_saveCaptureBitmap"));
    SightCaptureUI.E(this.oDf).start();
    k.d(true, com.tencent.mm.plugin.mmsight.d.RN("TIME_RECODER_2_PLAY"));
    if (SightCaptureUI.F(this.oDf))
    {
      if (Math.abs(paramInt3 - paramInt4) == 0);
      for (paramInt3 = 180; ; paramInt3 = 0)
      {
        paramArrayOfByte = com.tencent.mm.plugin.mmsight.d.c(paramArrayOfByte, paramInt1, paramInt2, paramInt3 % 360);
        SightCaptureUI.e(this.oDf).a(paramArrayOfByte, true, 0);
        paramInt2 = paramInt3;
        SightCaptureUI.b(this.oDf, paramArrayOfByte);
        SightCaptureUI.f(this.oDf, paramInt2);
        SightCaptureUI.g(this.oDf, 3);
        SightCaptureUI.H(this.oDf).post(new SightCaptureUI.6.2(this));
        if ((SightCaptureUI.a(this.oDf).scene == 1) || (SightCaptureUI.a(this.oDf).scene == 2) || (SightCaptureUI.a(this.oDf).scene == 7))
          h.pYm.e(13819, new Object[] { Integer.valueOf(1), Integer.valueOf(SightCaptureUI.a(this.oDf).scene), SightCaptureUI.a(this.oDf).osR, Long.valueOf(bo.anT()) });
        AppMethodBeat.o(55190);
        break;
      }
    }
    if (paramInt4 == 180);
    for (paramInt1 = paramInt3 + paramInt4; ; paramInt1 = paramInt3)
    {
      paramInt2 = paramInt1;
      if (paramInt1 > 360)
        paramInt2 = paramInt1 - 360;
      SightCaptureUI.e(this.oDf).a(paramArrayOfByte, false, paramInt2);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.6
 * JD-Core Version:    0.6.2
 */