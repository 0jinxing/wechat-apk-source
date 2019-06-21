package com.tencent.filter.art;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.QImage;
import com.tencent.filter.m.f;
import com.tencent.filter.m.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public class DofCpuFilter extends BaseFilter
{
  int bNA = 0;
  int bNB = 0;
  Bitmap bNf = null;
  int bNt = 0;
  int bNu = 0;
  int bNv = 0;
  int bNw = 0;
  int bNx = 0;
  int bNy = 0;
  int bNz = 0;
  int paramTEXTRUEID = 0;
  int type = 0;

  public DofCpuFilter(int paramInt)
  {
    super(GLSLRender.bJB);
    this.type = paramInt;
  }

  private static Bitmap n(Bitmap paramBitmap)
  {
    AppMethodBeat.i(86299);
    QImage localQImage1 = QImage.BindBitmap(paramBitmap);
    QImage localQImage2 = nativeSacle(localQImage1, 2);
    nativeRoundBlurProcess(localQImage2, 4);
    localQImage1.UnBindBitmap(paramBitmap);
    paramBitmap = Bitmap.createBitmap(localQImage2.getWidth(), localQImage2.getHeight(), Bitmap.Config.ARGB_8888);
    localQImage2.ToBitmap(paramBitmap);
    localQImage2.Dispose();
    AppMethodBeat.o(86299);
    return paramBitmap;
  }

  public static native void nativeRoundBlurProcess(QImage paramQImage, int paramInt);

  public static native QImage nativeSacle(QImage paramQImage, int paramInt);

  public static native void nativeblurBorder(Bitmap paramBitmap, int paramInt);

  public void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86297);
    float f1;
    float f3;
    float f4;
    float f6;
    Object localObject;
    if (this.type == 0)
    {
      this.glsl_programID = GLSLRender.bKB;
      if (this.bNf != null)
        addParam(new m.k("inputImageTexture2", n(this.bNf), 33986, true));
      if ((this.bNt != 0) || (this.bNv != 0) || (this.bNu != 0) || (this.bNw != 0))
      {
        f1 = this.bNw - this.bNu;
        float f2 = this.bNu;
        f3 = f1 / 2.0F;
        f4 = paramFloat2 / 2.0F;
        float f5 = f1 / this.bNw;
        f6 = (this.bNw - this.bNu) / paramFloat2;
        float f7 = (this.bNv - this.bNt) / paramFloat1;
        f4 = Math.abs(f2 + f3 - f4) / paramFloat2;
        f3 = Math.abs(paramFloat2 - this.bNw) / paramFloat2;
        this.bNx = this.bNw;
        this.bNz = 0;
        if ((f6 > 0.7F) && (f7 > 0.8F))
        {
          this.bNy = ((int)((1.0F - f5) * f1));
          this.bNA = ((int)(f1 * (1.0F - f5) + 50.0F));
        }
      }
      else
      {
        addParam(new m.f("py", this.bNx / paramFloat2));
        addParam(new m.f("up_innerradius", this.bNy / paramFloat2));
        addParam(new m.f("down_innerradius", this.bNz / paramFloat2));
        addParam(new m.f("up_outerradius", this.bNA / paramFloat2));
        addParam(new m.f("down_outerradius", this.bNB / paramFloat2));
        localObject = new BaseFilter(GLSLRender.bKn);
        if (this.bNf != null)
        {
          Bitmap localBitmap = this.bNf.copy(this.bNf.getConfig(), false);
          nativeblurBorder(localBitmap, 2);
          ((BaseFilter)localObject).addParam(new m.k("inputImageTexture3", localBitmap, 33987, true));
        }
        setNextFilter((BaseFilter)localObject, new int[] { this.srcTextureIndex });
      }
    }
    while (true)
    {
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86297);
      return;
      this.bNy = ((int)(f1 * 0.3F));
      this.bNA = ((int)(this.bNy + 0.5F * f1));
      f6 = this.bNA;
      f6 = this.bNy / f6;
      if (this.bNA > paramFloat2 * 0.6F)
      {
        this.bNA = ((int)(paramFloat2 * 0.6F));
        this.bNy = ((int)(f6 * (paramFloat2 * 0.6F)));
      }
      while (true)
        if (f4 < f3)
        {
          this.bNz = ((int)(0.1F * f1));
          this.bNB = ((int)(f1 * 0.5F + this.bNz));
          f1 = this.bNB;
          f1 = this.bNz / f1;
          if (this.bNB > paramFloat2 * 0.6F)
          {
            this.bNB = ((int)(paramFloat2 * 0.6F));
            this.bNz = ((int)(f1 * (paramFloat2 * 0.6F)));
            break;
            if (this.bNA >= paramFloat2 * 0.3F)
              continue;
            this.bNA = ((int)(paramFloat2 * 0.3F));
            this.bNy = ((int)(f6 * (paramFloat2 * 0.3F)));
            continue;
          }
          if (this.bNB >= paramFloat2 * 0.2F)
            break;
          this.bNB = ((int)(paramFloat2 * 0.2F));
          this.bNz = ((int)(f1 * (paramFloat2 * 0.2F)));
          break;
        }
      this.bNz = 0;
      break;
      this.glsl_programID = GLSLRender.bKC;
      if (this.bNf != null)
      {
        localObject = this.bNf.copy(this.bNf.getConfig(), false);
        nativeblurBorder((Bitmap)localObject, 2);
        addParam(new m.k("inputImageTexture3", (Bitmap)localObject, 33987, true));
        addParam(new m.k("inputImageTexture2", n(this.bNf), 33986, true));
      }
    }
  }

  public void ClearGLSL()
  {
    AppMethodBeat.i(86298);
    this.bNf = null;
    super.ClearGLSL();
    AppMethodBeat.o(86298);
  }

  public void setParameterDic(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(86296);
    if (paramMap.containsKey("xmin"))
      this.bNt = ((Integer)paramMap.get("xmin")).intValue();
    if (paramMap.containsKey("ymin"))
      this.bNu = ((Integer)paramMap.get("ymin")).intValue();
    if (paramMap.containsKey("xmax"))
      this.bNv = ((Integer)paramMap.get("xmax")).intValue();
    if (paramMap.containsKey("ymax"))
      this.bNw = ((Integer)paramMap.get("ymax")).intValue();
    if (paramMap.containsKey("maskbmp"))
      this.bNf = ((Bitmap)paramMap.get("maskbmp"));
    AppMethodBeat.o(86296);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.filter.art.DofCpuFilter
 * JD-Core Version:    0.6.2
 */