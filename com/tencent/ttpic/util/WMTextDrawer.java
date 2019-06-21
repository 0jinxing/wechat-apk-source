package com.tencent.ttpic.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.text.TextPaint;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.cache.VideoMemoryManager;
import com.tencent.ttpic.model.TextWMElement;
import com.tencent.util.i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public class WMTextDrawer
{
  protected static final String INT_D = "%d";
  private static final String TAG;
  private static Map<String, Typeface> typefaceCache;
  private WMTextDrawer.AsyncDrawRunnable asyncDrawRunnable;
  private boolean isAsyncDrawFinished = true;
  public String lastDrawText = "";

  static
  {
    AppMethodBeat.i(84290);
    TAG = WMTextDrawer.class.getSimpleName();
    typefaceCache = new HashMap();
    AppMethodBeat.o(84290);
  }

  private void drawHorizontalText(TextWMElement paramTextWMElement, Canvas paramCanvas, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(84283);
    new WMTextDrawer.TextHorizontalLayout(this, paramTextWMElement, paramInt1, paramInt2, paramString).draw(paramCanvas);
    AppMethodBeat.o(84283);
  }

  private void drawNormalVerticalText(TextWMElement paramTextWMElement, Canvas paramCanvas, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(84285);
    new WMTextDrawer.TextVerticalLayout(this, paramTextWMElement, paramInt1, paramInt2, paramString).draw(paramCanvas);
    AppMethodBeat.o(84285);
  }

  private void drawRotatedVerticalText(TextWMElement paramTextWMElement, String paramString)
  {
    AppMethodBeat.i(84286);
    Bitmap localBitmap = Bitmap.createBitmap(paramTextWMElement.height, paramTextWMElement.width, Bitmap.Config.ARGB_8888);
    drawHorizontalText(paramTextWMElement, new Canvas(localBitmap), localBitmap.getWidth(), localBitmap.getHeight(), paramString);
    if (BitmapUtils.isLegal(paramTextWMElement.getIdleBitmap()))
      paramTextWMElement.getIdleBitmap().recycle();
    paramTextWMElement.setIdleBitmap(rotateBitmap(localBitmap, paramTextWMElement.rotate));
    AppMethodBeat.o(84286);
  }

  private void drawVerticalText(TextWMElement paramTextWMElement, Canvas paramCanvas, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(84284);
    if ((paramTextWMElement.rotate == 90) || (paramTextWMElement.rotate == -90))
    {
      drawRotatedVerticalText(paramTextWMElement, paramString);
      AppMethodBeat.o(84284);
    }
    while (true)
    {
      return;
      drawNormalVerticalText(paramTextWMElement, paramCanvas, paramInt1, paramInt2, paramString);
      AppMethodBeat.o(84284);
    }
  }

  private Bitmap rotateBitmap(Bitmap paramBitmap, float paramFloat)
  {
    AppMethodBeat.i(84287);
    if (paramBitmap == null)
    {
      paramBitmap = null;
      AppMethodBeat.o(84287);
    }
    while (true)
    {
      return paramBitmap;
      int i = paramBitmap.getWidth();
      int j = paramBitmap.getHeight();
      Object localObject = new Matrix();
      ((Matrix)localObject).setRotate(paramFloat);
      localObject = Bitmap.createBitmap(paramBitmap, 0, 0, i, j, (Matrix)localObject, false);
      if (localObject.equals(paramBitmap))
      {
        AppMethodBeat.o(84287);
        paramBitmap = (Bitmap)localObject;
      }
      else
      {
        paramBitmap.recycle();
        AppMethodBeat.o(84287);
        paramBitmap = (Bitmap)localObject;
      }
    }
  }

  public void cancelAsyncDrawTask()
  {
    if ((!this.isAsyncDrawFinished) && (this.asyncDrawRunnable != null))
    {
      this.asyncDrawRunnable.isTaskCanceled = true;
      this.isAsyncDrawFinished = true;
    }
  }

  public void drawTextToBitmap(TextWMElement paramTextWMElement, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(84282);
    if ((paramString != null) && (!TextUtils.isEmpty(paramString)))
      this.lastDrawText = paramString;
    this.isAsyncDrawFinished = false;
    this.asyncDrawRunnable = new WMTextDrawer.1(this, paramTextWMElement, paramString, paramBoolean1);
    if (paramBoolean2)
    {
      this.asyncDrawRunnable.run();
      AppMethodBeat.o(84282);
    }
    while (true)
    {
      return;
      AsyncTask.SERIAL_EXECUTOR.execute(this.asyncDrawRunnable);
      AppMethodBeat.o(84282);
    }
  }

  public boolean isAsyncDrawFinished()
  {
    return this.isAsyncDrawFinished;
  }

  public static abstract class TextLayout
  {
    protected TextPaint mOuterStrokePaint;
    protected TextPaint mPaint;
    protected TextPaint mStrokePaint;
    protected String mText;
    protected TextWMElement mWMElement;
    protected WMTokenizer mWMTokenizer;

    protected TextLayout(TextWMElement paramTextWMElement, int paramInt1, int paramInt2, String paramString)
    {
      this.mText = paramString;
      this.mWMElement = paramTextWMElement;
      this.mPaint = genPaint(this.mWMElement);
      paramTextWMElement = WMTokenizer.from(this.mText, this.mPaint).setWidth(paramInt1).setHeight(paramInt2).setAlign(this.mWMElement.alignment);
      if (!this.mWMElement.multiRow)
      {
        bool2 = true;
        paramTextWMElement = paramTextWMElement.setSingleLine(bool2).setSpacingPlus(this.mWMElement.kern);
        if (this.mWMElement.vertical != 1)
          break label141;
      }
      label141: for (boolean bool2 = bool1; ; bool2 = false)
      {
        this.mWMTokenizer = paramTextWMElement.setVertical(bool2);
        adjustPaintIfNeed();
        this.mWMTokenizer.tokenizer();
        this.mWMTokenizer.doLayout();
        return;
        bool2 = false;
        break;
      }
    }

    private void adjustPaintIfNeed()
    {
      if (this.mWMElement.fontFit == 1)
      {
        fontKernCompat();
        this.mWMTokenizer.tokenizer();
        if (!this.mWMTokenizer.isFitIn())
          break label257;
        while (this.mWMTokenizer.isFitIn())
        {
          this.mPaint.setTextSize(this.mPaint.getTextSize() + 4.0F);
          fontKernCompat();
          this.mWMTokenizer.tokenizer();
        }
        this.mPaint.setTextSize(this.mPaint.getTextSize() - 4.0F);
        fontKernCompat();
      }
      while (true)
      {
        if (this.mWMElement.strokeSize > 0.0F)
        {
          this.mStrokePaint = new TextPaint(this.mPaint);
          this.mStrokePaint.setShader(null);
          this.mStrokePaint.setMaskFilter(null);
          this.mStrokePaint.setStyle(Paint.Style.STROKE);
          this.mStrokePaint.setColor(Color.parseColor(this.mWMElement.strokeColor));
          this.mStrokePaint.setStrokeWidth(this.mWMElement.strokeSize * (this.mPaint.getTextSize() / 20.0F) * 1.2F);
        }
        if (this.mWMElement.outerStrokeSize > 0.0F)
        {
          this.mOuterStrokePaint = new TextPaint(this.mPaint);
          this.mOuterStrokePaint.setShader(null);
          this.mOuterStrokePaint.setMaskFilter(null);
          this.mOuterStrokePaint.setColor(Color.parseColor(this.mWMElement.outerStrokeColor));
        }
        return;
        label257: 
        while (!this.mWMTokenizer.isFitIn())
        {
          this.mPaint.setTextSize(this.mPaint.getTextSize() - 4.0F);
          fontKernCompat();
          this.mWMTokenizer.tokenizer();
        }
        this.mPaint.setTextSize(this.mPaint.getTextSize() + 4.0F);
        fontKernCompat();
      }
    }

    private TextPaint genPaint(TextWMElement paramTextWMElement)
    {
      TextPaint localTextPaint = new TextPaint();
      localTextPaint.setAntiAlias(true);
      if (!TextUtils.isEmpty(paramTextWMElement.fontName));
      try
      {
        Object localObject1 = (Typeface)WMTextDrawer.typefaceCache.get(paramTextWMElement.fontName);
        Object localObject2 = localObject1;
        if (localObject1 == null)
        {
          if (!paramTextWMElement.fontName.equals("sans_serif"))
            break label411;
          if (!WMTextDrawer.typefaceCache.containsKey(paramTextWMElement.fontName))
            break label399;
          localObject2 = (Typeface)WMTextDrawer.typefaceCache.get(paramTextWMElement.fontName);
        }
        while (true)
        {
          if (localObject2 != null)
          {
            localTextPaint.setTypeface((Typeface)localObject2);
            if (!WMTextDrawer.typefaceCache.containsKey(paramTextWMElement.fontName))
              WMTextDrawer.typefaceCache.put(paramTextWMElement.fontName, localObject2);
          }
          if (paramTextWMElement.fontSize <= 0.0F)
            break label570;
          f1 = paramTextWMElement.fontSize;
          float f2 = f1;
          if (f1 < 4.0F)
            f2 = f1 + 20.0F;
          localTextPaint.setTextSize(f2);
          if (paramTextWMElement.emboss)
            localTextPaint.setMaskFilter(new EmbossMaskFilter(new float[] { 1.0F, 1.0F, -1.0F }, 1.0F, 6.0F, 3.5F));
          if (!TextUtils.isEmpty(paramTextWMElement.shaderBmp))
          {
            localObject2 = paramTextWMElement.shaderBmp.replace("%d", String.valueOf(paramTextWMElement.getFrameIndex()));
            if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (!((String)localObject2).equals(paramTextWMElement.curShaderBmp)) && (BitmapUtils.isLegal(VideoMemoryManager.getInstance().loadImage(paramTextWMElement.itemId, (String)localObject2))))
              paramTextWMElement.curShaderBmp = ((String)localObject2);
            localObject2 = VideoMemoryManager.getInstance().loadImage(paramTextWMElement.itemId, paramTextWMElement.curShaderBmp);
            if (BitmapUtils.isLegal((Bitmap)localObject2))
            {
              localObject1 = Shader.TileMode.MIRROR;
              localTextPaint.setShader(new BitmapShader((Bitmap)localObject2, (Shader.TileMode)localObject1, (Shader.TileMode)localObject1));
            }
          }
          localTextPaint.setFakeBoldText(paramTextWMElement.fontBold);
          if (!paramTextWMElement.fontItalics)
            break label578;
          f1 = -0.2F;
          localTextPaint.setTextSkewX(f1);
          if (paramTextWMElement.shadowSize > 0.0F)
            localTextPaint.setShadowLayer(paramTextWMElement.shadowSize, paramTextWMElement.shadowDx, paramTextWMElement.shadowDy, Color.parseColor(paramTextWMElement.shadowColor));
          localTextPaint.setColor(Color.parseColor(paramTextWMElement.color));
          return localTextPaint;
          label399: localObject2 = Typeface.create(Typeface.SANS_SERIF, 0);
          continue;
          label411: if (paramTextWMElement.fontName.equals("serif"))
          {
            localObject2 = Typeface.create(Typeface.SERIF, 0);
          }
          else
          {
            if (!paramTextWMElement.fontName.equals("monospace"))
              break;
            localObject2 = Typeface.create(Typeface.MONOSPACE, 0);
          }
        }
        if (paramTextWMElement.fontName.contains("."))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("fonts/");
        }
        for (localObject2 = paramTextWMElement.fontName; ; localObject2 = paramTextWMElement.fontName + ".ttf")
        {
          localObject2 = Typeface.createFromAsset(VideoGlobalContext.getContext().getAssets(), (String)localObject2);
          break;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("fonts/");
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          i.m(WMTextDrawer.TAG, localException.getMessage());
          continue;
          label570: float f1 = 40.0F;
          continue;
          label578: f1 = 0.0F;
        }
      }
    }

    public void draw(Canvas paramCanvas)
    {
      BenchUtil.benchStart("TextLayout::draw.drawText(canvas)");
      drawText(paramCanvas);
      BenchUtil.benchEnd("TextLayout::draw.drawText(canvas)");
    }

    protected void draw(Canvas paramCanvas, String paramString, float paramFloat1, float paramFloat2)
    {
      if (this.mStrokePaint != null)
        paramCanvas.drawText(paramString, paramFloat1, paramFloat2, this.mStrokePaint);
      if (this.mOuterStrokePaint != null)
      {
        float f = this.mWMElement.outerStrokeSize;
        paramCanvas.drawText(paramString, paramFloat1 - f, paramFloat2 - f, this.mOuterStrokePaint);
        paramCanvas.drawText(paramString, paramFloat1 + f, paramFloat2 - f, this.mOuterStrokePaint);
        paramCanvas.drawText(paramString, paramFloat1 + f, paramFloat2 + f, this.mOuterStrokePaint);
        paramCanvas.drawText(paramString, paramFloat1 - f, f + paramFloat2, this.mOuterStrokePaint);
      }
      paramCanvas.drawText(paramString, paramFloat1, paramFloat2, this.mPaint);
    }

    protected abstract void drawText(Canvas paramCanvas);

    public void fontKernCompat()
    {
      if ("HYHeiLiZhiTiJ".equals(this.mWMElement.fontName))
        this.mWMElement.kern = ((int)(this.mWMElement.kern * (this.mPaint.getTextSize() / 141.0F)));
      this.mWMTokenizer.setSpacingPlus(this.mWMElement.kern);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.WMTextDrawer
 * JD-Core Version:    0.6.2
 */