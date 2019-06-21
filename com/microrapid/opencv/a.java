package com.microrapid.opencv;

import android.graphics.Bitmap;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.QImage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;
import java.util.Map;

public final class a extends BaseFilter
{
  float alpha = 1.0F;
  int bCo = 0;
  int bCp = 0;
  int bCq = 0;
  Bitmap bCr = null;
  int color = 0;
  int paramTEXTRUEID = 0;
  int radius = 0;
  int type = 0;
  int width = 0;

  public a()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86262);
    this.paramTEXTRUEID = g.dSO();
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86262);
  }

  public final void ClearGLSL()
  {
    AppMethodBeat.i(86261);
    if (this.bCr != null)
    {
      this.bCr.recycle();
      this.bCr = null;
    }
    g.Sk(this.paramTEXTRUEID);
    super.ClearGLSL();
    AppMethodBeat.o(86261);
  }

  public final void beforeRender(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86263);
    Bitmap localBitmap = g.aK(paramInt1, paramInt2, paramInt3);
    if (localBitmap == null)
    {
      AppMethodBeat.o(86263);
      return;
    }
    QImage localQImage = QImage.BindBitmap(localBitmap);
    switch (this.type)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      GLSLRender.nativeTextImage(localQImage, this.paramTEXTRUEID);
      localQImage.UnBindBitmap(localBitmap);
      localQImage.Dispose();
      AppMethodBeat.o(86263);
      break;
      OpencvAlgorithm.nativeGlowFilterGlow(localQImage, this.color, this.radius, this.alpha);
      continue;
      OpencvAlgorithm.nativeGlowFilterPolyFit(localQImage, this.bCr, this.width, this.alpha);
      continue;
      OpencvAlgorithm.nativeGlowFilterDropShadow(localQImage, this.bCo, this.bCp, this.bCq, this.alpha);
    }
  }

  public final boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86264);
    boolean bool = super.renderTexture(this.paramTEXTRUEID, paramInt2, paramInt3);
    AppMethodBeat.o(86264);
    return bool;
  }

  public final void setParameterDic(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(86260);
    if (paramMap.containsKey("pstbitmap"))
      this.bCr = ((Bitmap)paramMap.get("pstbitmap"));
    if (paramMap.containsKey("effectIndex"))
      this.type = ((Integer)paramMap.get("effectIndex")).intValue();
    if (paramMap.containsKey("color"))
      this.color = ((Integer)paramMap.get("color")).intValue();
    if (paramMap.containsKey("radius"))
      this.radius = ((Integer)paramMap.get("radius")).intValue();
    if (paramMap.containsKey("width"))
      this.width = ((Integer)paramMap.get("width")).intValue();
    if (paramMap.containsKey("alpha"))
      this.alpha = ((Float)paramMap.get("alpha")).floatValue();
    if (paramMap.containsKey("xOffset"))
      this.bCo = ((Integer)paramMap.get("xOffset")).intValue();
    if (paramMap.containsKey("yOffset"))
      this.bCp = ((Integer)paramMap.get("yOffset")).intValue();
    if (paramMap.containsKey("grayVal"))
      this.bCq = ((Integer)paramMap.get("grayVal")).intValue();
    AppMethodBeat.o(86260);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.microrapid.opencv.a
 * JD-Core Version:    0.6.2
 */