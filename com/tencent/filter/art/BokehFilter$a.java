package com.tencent.filter.art;

import android.graphics.Bitmap;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.QImage;
import com.tencent.filter.m.f;
import com.tencent.filter.m.i;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.b;
import com.tencent.view.g;

public final class BokehFilter$a extends BaseFilter
{
  int bNh;
  float bNj;
  float bNk;
  int bNl;
  int paramTEXTRUEID;
  int radius;

  public BokehFilter$a(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3)
  {
    super(GLSLRender.bJB);
    AppMethodBeat.i(86284);
    this.radius = 8;
    this.bNj = ((float)(1.0D / Math.exp(0.0D)));
    this.bNk = 0.0F;
    this.paramTEXTRUEID = -2000;
    this.bNh = 1;
    this.bNl = 1;
    this.radius = paramInt1;
    this.bNj = paramFloat1;
    this.bNk = paramFloat2;
    this.bNh = paramInt2;
    this.bNl = paramInt3;
    if (this.bNl > 0)
    {
      addParam(new m.o("inputImageTexture2", fN(this.bNh), 33986));
      addParam(new m.f("lumi_threshold", this.bNk));
      addParam(new m.f("lumi_weight", this.bNj));
      if (this.bNl == 1)
      {
        this.glsl_programID = GLSLRender.bKc;
        addParam(new m.i("r", this.radius));
        AppMethodBeat.o(86284);
      }
    }
    while (true)
    {
      return;
      this.glsl_programID = GLSLRender.bKo;
      AppMethodBeat.o(86284);
      continue;
      this.paramTEXTRUEID = g.dSO();
      AppMethodBeat.o(86284);
    }
  }

  private static String fN(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "bokeh/shape1.jpg";
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return str;
      str = "bokeh/circle.jpg";
      continue;
      str = "bokeh/shape2.jpg";
      continue;
      str = "bokeh/heart.jpg";
    }
  }

  public final void ClearGLSL()
  {
    AppMethodBeat.i(86287);
    if (this.paramTEXTRUEID != -2000)
    {
      g.Sk(this.paramTEXTRUEID);
      this.paramTEXTRUEID = -2000;
    }
    super.ClearGLSL();
    AppMethodBeat.o(86287);
  }

  public final void beforeRender(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86285);
    if (this.bNl == 0)
    {
      Bitmap localBitmap = b.vt(fN(this.bNh));
      QImage localQImage1 = g.aL(paramInt1, paramInt2, paramInt3);
      QImage localQImage2 = QImage.BindBitmap(localBitmap);
      BokehFilter.nativeBokehProcess(localQImage1, localQImage2, this.radius, this.bNj, this.bNk);
      localQImage2.UnBindBitmap(localBitmap);
      localBitmap.recycle();
      GLSLRender.nativeTextImage(localQImage1, this.paramTEXTRUEID);
      localQImage1.Dispose();
    }
    AppMethodBeat.o(86285);
  }

  public final boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86286);
    boolean bool;
    if (this.paramTEXTRUEID != -2000)
    {
      bool = super.renderTexture(this.paramTEXTRUEID, paramInt2, paramInt3);
      AppMethodBeat.o(86286);
    }
    while (true)
    {
      return bool;
      bool = super.renderTexture(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(86286);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.filter.art.BokehFilter.a
 * JD-Core Version:    0.6.2
 */