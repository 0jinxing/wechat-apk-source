package com.tencent.mm.plugin.mmsight.ui.cameraglview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public f fcA;
  MMSightCameraGLSurfaceView oDD;

  public a(MMSightCameraGLSurfaceView paramMMSightCameraGLSurfaceView)
  {
    AppMethodBeat.i(55311);
    this.fcA = new a.1(this);
    this.oDD = paramMMSightCameraGLSurfaceView;
    AppMethodBeat.o(55311);
  }

  public final void WB()
  {
    AppMethodBeat.i(55313);
    if (this.oDD != null)
      this.oDD.WB();
    AppMethodBeat.o(55313);
  }

  public final void a(byte[] paramArrayOfByte, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(55310);
    if (this.oDD != null)
      this.oDD.f(paramArrayOfByte, paramInt, paramBoolean);
    AppMethodBeat.o(55310);
  }

  public final void ab(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(55312);
    ab.d("MicroMsg.MMSightCameraDrawController", "cameraPreviewWidth: " + paramInt1 + " cameraPreviewHeight : " + paramInt2 + " rotate : " + paramInt3);
    if (this.oDD != null)
      if ((paramInt3 != 0) && (paramInt3 != 180))
        break label95;
    label95: for (int i = paramInt1; ; i = paramInt2)
    {
      if ((paramInt3 == 0) || (paramInt3 == 180))
        paramInt1 = paramInt2;
      this.oDD.ab(i, paramInt1, paramInt3);
      AppMethodBeat.o(55312);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.cameraglview.a
 * JD-Core Version:    0.6.2
 */