package com.tencent.mm.plugin.api.recordView;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

final class d
{
  static float[] eZY;
  static final float[] eZZ;
  static final Object lock;
  volatile boolean eWi;
  int eZH;
  int eZI;
  int eZJ;
  int eZM;
  int eZN;
  int eZR;
  int eZS;
  ByteBuffer eZU;
  ByteBuffer eZV;
  FloatBuffer eZh;
  FloatBuffer eZi;
  private int fcn;
  private int fco;
  float[] gLB;
  volatile boolean gLJ;
  boolean gLv;
  int gLw;
  int gLx;
  int gLy;
  float[] gLz;
  int rotate;

  static
  {
    AppMethodBeat.i(76336);
    eZY = new float[] { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
    eZZ = new float[] { 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F };
    lock = new Object();
    AppMethodBeat.o(76336);
  }

  public d()
  {
    AppMethodBeat.i(76334);
    this.fcn = 0;
    this.fco = 0;
    this.gLv = false;
    this.gLw = 0;
    this.gLx = 0;
    this.rotate = 0;
    this.eZM = -1;
    this.eZN = -1;
    this.eZH = -1;
    this.gLz = new float[16];
    this.gLB = eZY;
    this.eWi = false;
    this.gLJ = false;
    this.eWi = false;
    AppMethodBeat.o(76334);
  }

  public final void cM(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(76335);
    ab.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), this });
    if ((paramInt1 != this.fcn) || (paramInt2 != this.fco))
    {
      ab.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceChanged change viewpoint");
      GLES20.glViewport(0, 0, paramInt1, paramInt2);
      this.fcn = paramInt1;
      this.fco = paramInt2;
    }
    AppMethodBeat.o(76335);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.d
 * JD-Core Version:    0.6.2
 */