package com.tencent.mm.plugin.voip.video.a;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTFilter;
import com.tencent.ttpic.PTFilter.PTCopyFilter;
import com.tencent.ttpic.config.BeautyRealConfig.TYPE;

public class a
{
  public static float FACE_DETECT_IMG_WIDTH;
  static final String TAG;
  private boolean bZi;
  int eYW;
  int eYX;
  byte[] lho;
  PTFilter mPTFilter;
  private PTFilter.PTCopyFilter tbG;
  PTFilter.PTCopyFilter tbH;
  private int tbI;
  int tbJ;
  int tbK;
  private int tbL;
  private int tbM;
  private int tbN;
  int tbO;
  private boolean[] tbP;

  static
  {
    AppMethodBeat.i(5124);
    TAG = a.class.getSimpleName();
    FACE_DETECT_IMG_WIDTH = 180.0F;
    AppMethodBeat.o(5124);
  }

  public a()
  {
    AppMethodBeat.i(5119);
    this.tbG = null;
    this.mPTFilter = null;
    this.tbH = null;
    this.tbP = new boolean[7];
    this.bZi = false;
    AppMethodBeat.o(5119);
  }

  private void a(BeautyRealConfig.TYPE paramTYPE, int paramInt)
  {
    int i = 1;
    int j = 1;
    int k = 1;
    int m = 1;
    int n = 1;
    int i1 = 1;
    int i2 = 0;
    AppMethodBeat.i(5122);
    switch (a.1.$SwitchMap$com$tencent$ttpic$config$BeautyRealConfig$TYPE[paramTYPE.ordinal()])
    {
    default:
      AppMethodBeat.o(5122);
    case 1:
    case 2:
      while (true)
      {
        return;
        paramTYPE = this.tbP;
        if (paramInt != 0);
        while (true)
        {
          paramTYPE[0] = i1;
          AppMethodBeat.o(5122);
          break;
          i1 = 0;
        }
        paramTYPE = this.tbP;
        i1 = i2;
        if (paramInt != 0)
          i1 = 1;
        paramTYPE[1] = i1;
        AppMethodBeat.o(5122);
      }
    case 3:
      paramTYPE = this.tbP;
      if (paramInt != 0);
      for (i1 = i; ; i1 = 0)
      {
        paramTYPE[2] = i1;
        AppMethodBeat.o(5122);
        break;
      }
    case 4:
      paramTYPE = this.tbP;
      if (paramInt != 0);
      for (i1 = j; ; i1 = 0)
      {
        paramTYPE[3] = i1;
        AppMethodBeat.o(5122);
        break;
      }
    case 5:
      paramTYPE = this.tbP;
      if (paramInt != 0);
      for (i1 = k; ; i1 = 0)
      {
        paramTYPE[4] = i1;
        AppMethodBeat.o(5122);
        break;
      }
    case 6:
      paramTYPE = this.tbP;
      if (paramInt != 0);
      for (i1 = m; ; i1 = 0)
      {
        paramTYPE[5] = i1;
        AppMethodBeat.o(5122);
        break;
      }
    case 7:
    }
    paramTYPE = this.tbP;
    if (paramInt != 0);
    for (i1 = n; ; i1 = 0)
    {
      paramTYPE[6] = i1;
      break;
    }
  }

  private void cLR()
  {
    AppMethodBeat.i(5121);
    a(BeautyRealConfig.TYPE.BASIC3, 10);
    a(BeautyRealConfig.TYPE.FACE_V, 0);
    a(BeautyRealConfig.TYPE.EYE, 0);
    a(BeautyRealConfig.TYPE.NOSE, 0);
    a(BeautyRealConfig.TYPE.CHIN, 0);
    AppMethodBeat.o(5121);
  }

  public final void clear()
  {
    AppMethodBeat.i(5123);
    if (this.mPTFilter != null)
    {
      this.mPTFilter.destroy();
      this.mPTFilter = null;
    }
    if (this.tbG != null)
      this.tbG.destroy();
    this.tbG = null;
    if (this.tbH != null)
      this.tbH.destroy();
    this.tbH = null;
    GLES20.glDeleteTextures(4, new int[] { this.tbK, this.tbL, this.tbM, this.tbN }, 0);
    GLES20.glDeleteFramebuffers(1, new int[] { this.tbO }, 0);
    AppMethodBeat.o(5123);
  }

  public final void initial(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5120);
    clear();
    cLR();
    this.tbG = new PTFilter.PTCopyFilter();
    this.tbG.init();
    this.tbH = new PTFilter.PTCopyFilter();
    this.tbH.init();
    int[] arrayOfInt = new int[4];
    GLES20.glGenTextures(4, arrayOfInt, 0);
    this.tbK = arrayOfInt[0];
    this.tbL = arrayOfInt[1];
    this.tbM = arrayOfInt[2];
    this.tbN = arrayOfInt[3];
    this.tbI = paramInt1;
    this.tbJ = paramInt2;
    arrayOfInt = new int[1];
    GLES20.glGenFramebuffers(1, arrayOfInt, 0);
    this.tbO = arrayOfInt[0];
    AppMethodBeat.o(5120);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.a.a
 * JD-Core Version:    0.6.2
 */