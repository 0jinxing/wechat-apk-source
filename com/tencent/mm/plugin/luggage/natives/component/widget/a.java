package com.tencent.mm.plugin.luggage.natives.component.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PathDashPathEffect;
import android.graphics.PathDashPathEffect.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luggage.natives.a.a.a;
import com.tencent.mm.plugin.luggage.natives.a.a.f;
import com.tencent.mm.plugin.luggage.natives.a.a.g;
import java.util.HashMap;

public final class a extends Drawable
{
  private int HD;
  private int iUG;
  private int mColor;
  private Paint mPaint;
  private a.a oiB;
  public a.a[] oiC;
  public a.g[] oiD;
  public int[] oiE;
  public a.g[] oiF;
  private int oiG;
  private int oiH;
  float[] oiI;
  private HashMap<int[], Integer> oiJ;
  private HashMap<int[], Integer> oiK;
  private ColorStateList oiL;
  private ColorStateList oiM;
  private float uW;

  public a()
  {
    AppMethodBeat.i(116828);
    this.uW = 0.0F;
    this.mColor = -2147483648;
    this.iUG = 0;
    this.HD = 0;
    this.oiG = 0;
    this.oiH = 0;
    this.oiJ = new HashMap();
    this.oiK = new HashMap();
    AppMethodBeat.o(116828);
  }

  private static float T(float paramFloat1, float paramFloat2)
  {
    float f = 0.0F;
    if (paramFloat1 > 0.0F)
      f = paramFloat2 / paramFloat1;
    return f;
  }

  private void a(Canvas paramCanvas, float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(116831);
    if ((this.oiC == null) || (this.oiE == null) || (this.oiD == null))
    {
      AppMethodBeat.o(116831);
      return;
    }
    int[] arrayOfInt = new int[4];
    for (int i = 0; i < 4; i++)
    {
      arrayOfInt[i] = this.oiE[i];
      if (arrayOfInt[i] == -2147483648)
        arrayOfInt[i] = this.oiH;
    }
    float[] arrayOfFloat1 = paramArrayOfFloat;
    if (paramArrayOfFloat == null)
    {
      arrayOfFloat1 = new float[8];
      float[] tmp94_92 = arrayOfFloat1;
      tmp94_92[0] = 0.0F;
      float[] tmp98_94 = tmp94_92;
      tmp98_94[1] = 0.0F;
      float[] tmp102_98 = tmp98_94;
      tmp102_98[2] = 0.0F;
      float[] tmp106_102 = tmp102_98;
      tmp106_102[3] = 0.0F;
      float[] tmp110_106 = tmp106_102;
      tmp110_106[4] = 0.0F;
      float[] tmp114_110 = tmp110_106;
      tmp114_110[5] = 0.0F;
      float[] tmp118_114 = tmp114_110;
      tmp118_114[6] = 0.0F;
      float[] tmp123_118 = tmp118_114;
      tmp123_118[7] = 0.0F;
      tmp123_118;
    }
    paramArrayOfFloat = getBounds();
    int j = paramArrayOfFloat.width();
    int k = paramArrayOfFloat.height();
    paramArrayOfFloat = null;
    float f1 = this.uW / 2.0F;
    RectF localRectF = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    i = 0;
    label172: float[] arrayOfFloat2;
    float f2;
    label447: label460: float f3;
    float f4;
    float f5;
    if (i < 4)
    {
      arrayOfFloat2 = paramArrayOfFloat;
      f2 = f1;
      if (this.oiC[i] != a.a.ojY)
      {
        arrayOfFloat2 = paramArrayOfFloat;
        f2 = f1;
        if (this.oiD[i] != null)
        {
          arrayOfFloat2 = paramArrayOfFloat;
          if (arrayOfInt[i] != this.mColor)
          {
            arrayOfFloat2 = paramArrayOfFloat;
            if (arrayOfInt[i] != -2147483648)
            {
              arrayOfFloat2 = paramArrayOfFloat;
              if (paramArrayOfFloat != null)
              {
                paramCanvas.drawPath(paramArrayOfFloat, this.mPaint);
                arrayOfFloat2 = null;
              }
              this.mColor = arrayOfInt[i];
              this.mPaint.setColor(this.mColor);
            }
          }
          paramArrayOfFloat = arrayOfFloat2;
          if (Math.abs(this.uW - this.oiD[i].value) > 0.0001D)
          {
            paramArrayOfFloat = arrayOfFloat2;
            if (arrayOfFloat2 != null)
            {
              paramCanvas.drawPath(arrayOfFloat2, this.mPaint);
              paramArrayOfFloat = null;
            }
            this.uW = this.oiD[i].value;
            f1 = this.uW / 2.0F;
            this.mPaint.setStrokeWidth(this.uW);
          }
          arrayOfFloat2 = paramArrayOfFloat;
          if (this.oiC[i] != this.oiB)
          {
            arrayOfFloat2 = paramArrayOfFloat;
            if (paramArrayOfFloat != null)
            {
              paramCanvas.drawPath(paramArrayOfFloat, this.mPaint);
              arrayOfFloat2 = null;
            }
            this.oiB = this.oiC[i];
            if (this.oiB != a.a.oka)
              break label590;
            this.mPaint.setPathEffect(new DashPathEffect(new float[] { 15.0F, 15.0F }, 0.0F));
          }
          if (arrayOfFloat2 != null)
            break label1037;
          paramArrayOfFloat = new Path();
          if (i != 0)
            break label656;
          f3 = arrayOfFloat1[1];
          f4 = j - arrayOfFloat1[2];
          if (arrayOfFloat1[1] <= 0.0F)
            break label1077;
          localRectF.left = f1;
          localRectF.top = f1;
          localRectF.right = (arrayOfFloat1[1] * 2.0F + 2.0F * f1);
          localRectF.bottom = (arrayOfFloat1[0] * 2.0F + 2.0F * f1);
          paramArrayOfFloat.arcTo(localRectF, 180.0F, 90.0F);
          f2 = f1;
          f5 = f1;
        }
      }
    }
    while (true)
    {
      paramArrayOfFloat.moveTo(f3, f2);
      paramArrayOfFloat.lineTo(f4, f5);
      f2 = f1;
      arrayOfFloat2 = paramArrayOfFloat;
      i++;
      paramArrayOfFloat = arrayOfFloat2;
      f1 = f2;
      break label172;
      label590: if (this.oiB == a.a.okb)
      {
        paramArrayOfFloat = new Path();
        paramArrayOfFloat.addCircle(0.0F, 0.0F, 4.0F, Path.Direction.CW);
        this.mPaint.setPathEffect(new PathDashPathEffect(paramArrayOfFloat, 15.0F, 0.0F, PathDashPathEffect.Style.ROTATE));
        break label447;
      }
      this.mPaint.setPathEffect(null);
      break label447;
      label656: float f6;
      if (i == 1)
      {
        f2 = j - f1;
        f6 = arrayOfFloat1[3];
        f5 = k - arrayOfFloat1[4];
        if (arrayOfFloat1[3] > 0.0F)
        {
          localRectF.left = (j - arrayOfFloat1[2] * 2.0F - 2.0F * f1);
          localRectF.top = f1;
          localRectF.right = (j - f1);
          localRectF.bottom = (arrayOfFloat1[3] * 2.0F + 2.0F * f1);
          paramArrayOfFloat.arcTo(localRectF, 270.0F, 90.0F);
          f4 = f2;
          f3 = f2;
          f2 = f6;
        }
      }
      else if (i == 2)
      {
        f6 = j - arrayOfFloat1[5];
        f2 = k - f1;
        f4 = arrayOfFloat1[6];
        if (arrayOfFloat1[5] > 0.0F)
        {
          localRectF.left = (j - arrayOfFloat1[5] * 2.0F - 2.0F * f1);
          localRectF.top = (k - arrayOfFloat1[4] * 2.0F - 2.0F * f1);
          localRectF.right = (j - f1);
          localRectF.bottom = (k - f1);
          paramArrayOfFloat.arcTo(localRectF, 0.0F, 90.0F);
          f3 = f2;
          f5 = f2;
          f2 = f3;
          f3 = f6;
        }
      }
      else
      {
        f2 = k;
        f3 = arrayOfFloat1[7];
        f5 = arrayOfFloat1[0];
        if (arrayOfFloat1[7] > 0.0F)
        {
          localRectF.left = f1;
          localRectF.top = (k - arrayOfFloat1[7] * 2.0F - 2.0F * f1);
          localRectF.right = (arrayOfFloat1[6] * 2.0F + 2.0F * f1);
          localRectF.bottom = (k - f1);
          paramArrayOfFloat.arcTo(localRectF, 90.0F, 90.0F);
        }
        f4 = f1;
        f2 -= f3;
        f3 = f1;
        continue;
        if (paramArrayOfFloat != null)
          paramCanvas.drawPath(paramArrayOfFloat, this.mPaint);
        AppMethodBeat.o(116831);
        break;
        label1037: paramArrayOfFloat = arrayOfFloat2;
        break label460;
        f3 = f2;
        f5 = f2;
        f2 = f3;
        f3 = f6;
        continue;
        f4 = f2;
        f3 = f2;
        f2 = f6;
        continue;
        label1077: f2 = f1;
        f5 = f1;
      }
    }
  }

  private void bMR()
  {
    AppMethodBeat.i(116829);
    if ((this.oiD == null) || (this.oiC == null) || (this.oiE == null))
      AppMethodBeat.o(116829);
    while (true)
    {
      return;
      this.mPaint = new Paint();
      this.mPaint.setStyle(Paint.Style.STROKE);
      this.mPaint.setAntiAlias(true);
      for (int i = 0; ; i++)
        if (i < 4)
        {
          if ((this.oiD[i] != null) && (this.oiC[i] != a.a.ojY))
          {
            this.uW = this.oiD[i].value;
            this.mPaint.setStrokeWidth(this.oiD[i].value);
            if (this.oiE[i] != -2147483648)
            {
              this.mColor = this.oiE[i];
              this.mPaint.setColor(this.oiE[i]);
            }
            this.oiB = this.oiC[i];
          }
        }
        else
        {
          if (this.oiB != a.a.oka)
            break label215;
          this.mPaint.setPathEffect(new DashPathEffect(new float[] { 15.0F, 15.0F }, 0.0F));
          AppMethodBeat.o(116829);
          break;
        }
      label215: if (this.oiB == a.a.okb)
      {
        Path localPath = new Path();
        localPath.addCircle(0.0F, 0.0F, 4.0F, Path.Direction.CW);
        this.mPaint.setPathEffect(new PathDashPathEffect(localPath, 15.0F, 0.0F, PathDashPathEffect.Style.ROTATE));
      }
      AppMethodBeat.o(116829);
    }
  }

  final float[] bMS()
  {
    AppMethodBeat.i(116833);
    Object localObject;
    if (this.oiF == null)
    {
      localObject = null;
      AppMethodBeat.o(116833);
      return localObject;
    }
    int i = 0;
    label23: if (i < 4)
      if (this.oiF[i] == null);
    for (i = 1; ; i = 0)
    {
      if (i == 0)
      {
        localObject = null;
        AppMethodBeat.o(116833);
        break;
        i++;
        break label23;
      }
      localObject = getBounds();
      int j = ((Rect)localObject).width();
      int k = ((Rect)localObject).height();
      localObject = new float[8];
      Object tmp81_80 = localObject;
      tmp81_80[0] = 0.0F;
      Object tmp85_81 = tmp81_80;
      tmp85_81[1] = 0.0F;
      Object tmp89_85 = tmp85_81;
      tmp89_85[2] = 0.0F;
      Object tmp93_89 = tmp89_85;
      tmp93_89[3] = 0.0F;
      Object tmp97_93 = tmp93_89;
      tmp97_93[4] = 0.0F;
      Object tmp101_97 = tmp97_93;
      tmp101_97[5] = 0.0F;
      Object tmp105_101 = tmp101_97;
      tmp105_101[6] = 0.0F;
      Object tmp110_105 = tmp105_101;
      tmp110_105[7] = 0.0F;
      tmp110_105;
      i = 0;
      label205: label251: float f1;
      if (i < 4)
      {
        if (this.oiF[i] != null)
        {
          if (this.oiF[i].okI != a.f.okD)
            break label251;
          if ((i != 0) && (i != 2))
            break label205;
          localObject[(i * 2)] = (this.oiF[i].value * k / 100.0F);
          localObject[(i * 2 + 1)] = (this.oiF[i].value * j / 100.0F);
        }
        while (true)
        {
          i++;
          break;
          localObject[(i * 2)] = (this.oiF[i].value * j / 100.0F);
          localObject[(i * 2 + 1)] = (this.oiF[i].value * k / 100.0F);
          continue;
          f1 = this.oiF[i].value;
          localObject[(i * 2 + 1)] = f1;
          localObject[(i * 2)] = f1;
        }
      }
      float f2 = T(localObject[1] + localObject[2], j - this.uW * 2.0F);
      if ((f2 > 0.0F) && (f2 < 1.0F));
      while (true)
      {
        float f3 = T(localObject[5] + localObject[6], j - this.uW * 2.0F);
        f1 = f2;
        if (f3 > 0.0F)
        {
          f1 = f2;
          if (f3 < f2)
            f1 = f3;
        }
        f3 = T(localObject[0] + localObject[7], k - this.uW * 2.0F);
        f2 = f1;
        if (f3 > 0.0F)
        {
          f2 = f1;
          if (f3 < f1)
            f2 = f3;
        }
        f1 = T(localObject[3] + localObject[4], k - this.uW * 2.0F);
        if ((f1 > 0.0F) && (f1 < f2))
          f2 = f1;
        while (true)
        {
          if (1.0F - f2 > 1.0E-006D)
            for (i = 0; i < 8; i++)
              localObject[i] *= f2;
          AppMethodBeat.o(116833);
          break;
        }
        f2 = 1.0F;
      }
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116830);
    this.oiI = bMS();
    Path localPath;
    Object localObject1;
    Object localObject2;
    if (this.oiI == null)
    {
      localPath = null;
      if (localPath != null)
        paramCanvas.clipPath(localPath);
      if (this.HD != 0)
      {
        localObject1 = this.oiI;
        localPath = new Path();
        localObject2 = getBounds();
        int i = ((Rect)localObject2).width();
        int j = ((Rect)localObject2).height();
        localObject2 = new RectF(this.uW, this.uW, i - this.uW, j - this.uW);
        if (this.oiF == null)
          break label194;
        localPath.addRoundRect((RectF)localObject2, (float[])localObject1, Path.Direction.CW);
      }
    }
    while (true)
    {
      localObject1 = new Paint();
      ((Paint)localObject1).setColor(this.HD);
      ((Paint)localObject1).setStrokeWidth(0.0F);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      paramCanvas.drawPath(localPath, (Paint)localObject1);
      if (this.mPaint == null)
        bMR();
      a(paramCanvas, this.oiI);
      AppMethodBeat.o(116830);
      return;
      localPath = j(this.oiI);
      break;
      label194: localPath.addRect((RectF)localObject2, Path.Direction.CW);
    }
  }

  public final int getOpacity()
  {
    return -1;
  }

  public final boolean isStateful()
  {
    AppMethodBeat.i(116835);
    boolean bool;
    if (((this.oiL == null) || (this.oiJ.size() == 0)) && ((this.oiM == null) || (this.oiK.size() == 0)))
    {
      bool = false;
      AppMethodBeat.o(116835);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(116835);
    }
  }

  final Path j(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(116832);
    if (this.oiF != null)
    {
      Path localPath = new Path();
      Rect localRect = getBounds();
      int i = localRect.width();
      int j = localRect.height();
      localPath.addRoundRect(new RectF(0.0F, 0.0F, i, j), paramArrayOfFloat, Path.Direction.CW);
      AppMethodBeat.o(116832);
      paramArrayOfFloat = localPath;
    }
    while (true)
    {
      return paramArrayOfFloat;
      paramArrayOfFloat = null;
      AppMethodBeat.o(116832);
    }
  }

  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(116834);
    boolean bool1 = false;
    boolean bool2 = bool1;
    int i;
    if (this.oiL != null)
    {
      i = this.oiL.getColorForState(paramArrayOfInt, this.iUG);
      bool2 = bool1;
      if (i != this.HD)
      {
        this.HD = i;
        bool2 = true;
      }
    }
    bool1 = bool2;
    if (this.oiM != null)
    {
      i = this.oiM.getColorForState(paramArrayOfInt, this.oiG);
      bool1 = bool2;
      if (i != this.oiH)
      {
        this.oiH = i;
        this.mColor = i;
        if (this.mPaint != null)
          this.mPaint.setColor(i);
        bool1 = true;
      }
    }
    AppMethodBeat.o(116834);
    return bool1;
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luggage.natives.component.widget.a
 * JD-Core Version:    0.6.2
 */