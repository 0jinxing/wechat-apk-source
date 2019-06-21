package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.ui.editor.a.c;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/FontTextView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "alignment", "Landroid/text/Layout$Alignment;", "contentLeft", "", "contentPadding", "defaultText", "", "drawStroke", "", "getDrawStroke", "()Z", "setDrawStroke", "(Z)V", "includePadding", "layout", "Landroid/text/StaticLayout;", "lineHeight", "lineSpacing", "maxWidth", "newLayout", "spacingAddition", "spacingMultiplier", "strokePaint", "Landroid/text/TextPaint;", "text", "", "textDrawer", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/TextDrawer;", "getTextDrawer", "()Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/TextDrawer;", "setTextDrawer", "(Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/TextDrawer;)V", "textPaint", "drawLine", "", "canvas", "Landroid/graphics/Canvas;", "line", "lineSpace", "makeNewLayout", "width", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setMaxWidth", "setTypeface", "typeface", "Landroid/graphics/Typeface;", "updateText", "color", "strokeColor", "change", "plugin-emojicapture_release"})
public final class FontTextView extends View
{
  private final Layout.Alignment eNC;
  private TextPaint eNN;
  private float hcW;
  private StaticLayout layout;
  private String lnT;
  private final float lnU;
  private final float lnV;
  private final boolean lnW;
  private TextPaint lnX;
  private final int lnY;
  private float lnZ;
  private float loa;
  private float lob;
  private boolean loc;
  private c lod;
  private boolean loe;
  private CharSequence text;

  public FontTextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public FontTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FontTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(3109);
    this.eNC = Layout.Alignment.ALIGN_CENTER;
    this.lnU = 1.0F;
    this.eNN = new TextPaint();
    this.lnX = new TextPaint();
    this.text = ((CharSequence)"");
    if (paramContext == null)
      j.dWJ();
    float f = paramContext.getResources().getDimension(2131428327);
    this.loa = paramContext.getResources().getDimension(2131428329);
    this.lob = paramContext.getResources().getDimension(2131428330);
    paramAttributeSet = paramContext.getResources().getString(2131297786);
    j.o(paramAttributeSet, "context.resources.getStr…pture_emoji_text_default)");
    this.lnT = paramAttributeSet;
    this.lnY = com.tencent.mm.bz.a.fromDPToPix(paramContext, 2);
    this.eNN.setAntiAlias(true);
    this.eNN.setTextSize(f);
    this.eNN.setColor(2147483647);
    f = com.tencent.mm.bz.a.fromDPToPix(paramContext, 1);
    this.eNN.setShadowLayer(f, 0.0F, f, -16777216);
    this.lnX.setStrokeWidth(paramContext.getResources().getDimension(2131428331));
    this.lnX.setAntiAlias(true);
    this.lnX.setTextSize(this.eNN.getTextSize());
    this.lnX.setStyle(Paint.Style.STROKE);
    this.layout = new StaticLayout(this.text, this.eNN, getWidth(), this.eNC, this.lnU, this.lnV, this.lnW);
    setLayerType(1, null);
    this.lod = ((c)new com.tencent.mm.plugin.emojicapture.ui.editor.a.a());
    this.text = ((CharSequence)this.lnT);
    paramContext = this.lod;
    if (paramContext != null)
    {
      paramContext.setText(this.text);
      AppMethodBeat.o(3109);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(3109);
    }
  }

  private final void a(Canvas paramCanvas, int paramInt, float paramFloat)
  {
    AppMethodBeat.i(3107);
    if ((paramInt < 0) || (paramInt >= this.layout.getLineCount()))
      AppMethodBeat.o(3107);
    while (true)
    {
      return;
      float f = this.layout.getLineLeft(paramInt) + getPaddingLeft();
      paramFloat = this.layout.getLineBaseline(paramInt) + paramFloat + getPaddingTop();
      boolean bool;
      if (this.layout.getEllipsisCount(paramInt) > 0)
      {
        bool = true;
        label76: if (!bool)
          break label204;
      }
      label204: for (int i = this.layout.getLineStart(paramInt) + this.layout.getEllipsisStart(paramInt); ; i = this.layout.getLineEnd(paramInt))
      {
        if (this.loe)
        {
          localc = this.lod;
          if (localc != null)
            localc.a(paramCanvas, this.layout.getLineStart(paramInt), i, f, paramFloat, (Paint)this.lnX, bool);
        }
        c localc = this.lod;
        if (localc == null)
          break label217;
        localc.a(paramCanvas, this.layout.getLineStart(paramInt), i, f, paramFloat, (Paint)this.eNN, bool);
        AppMethodBeat.o(3107);
        break;
        bool = false;
        break label76;
      }
      label217: AppMethodBeat.o(3107);
    }
  }

  public final void d(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3104);
    int i;
    if ((paramCharSequence == null) || (paramCharSequence.length() == 0))
    {
      i = 1;
      if (i == 0)
        break label132;
      this.loe = false;
      this.text = ((CharSequence)this.lnT);
      this.eNN.setColor(2147483647);
      float f = com.tencent.mm.bz.a.fromDPToPix(getContext(), 1);
      this.eNN.setShadowLayer(f, 0.0F, f, -16777216);
      label77: this.lnX.setColor(paramInt2);
      paramCharSequence = this.lod;
      if (paramCharSequence != null)
        paramCharSequence.setText(this.text);
      paramCharSequence = this.lod;
      if (paramCharSequence == null)
        break label167;
      paramCharSequence.refresh();
      AppMethodBeat.o(3104);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label132: this.loe = true;
      if (paramCharSequence == null)
        j.dWJ();
      this.text = paramCharSequence;
      this.eNN.setColor(paramInt1);
      this.eNN.clearShadowLayer();
      break label77;
      label167: AppMethodBeat.o(3104);
    }
  }

  public final boolean getDrawStroke()
  {
    return this.loe;
  }

  public final c getTextDrawer()
  {
    return this.lod;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(3106);
    j.p(paramCanvas, "canvas");
    paramCanvas.save();
    paramCanvas.translate(-this.lnZ, 0.0F);
    a(paramCanvas, 0, 0.0F);
    a(paramCanvas, 1, this.lob);
    paramCanvas.restore();
    AppMethodBeat.o(3106);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3108);
    super.onMeasure(paramInt1, paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = paramInt2;
    if (paramInt2 > this.hcW)
      paramInt1 = (int)this.hcW;
    this.loc = true;
    paramInt1 -= this.lnY * 2;
    StaticLayout localStaticLayout = this.layout;
    Object localObject = localStaticLayout;
    if (this.loc)
    {
      if (paramInt1 < 0)
        localObject = localStaticLayout;
    }
    else
    {
      this.layout = ((StaticLayout)localObject);
      paramInt1 = this.layout.getLineBottom(0) - this.layout.getLineTop(0);
      if (paramInt1 > this.loa)
        this.loa = paramInt1;
      if (this.layout.getLineCount() > 1)
        break label426;
    }
    label426: for (paramInt1 = (int)this.loa; ; paramInt1 = (int)(2.0F * this.loa + this.lob))
    {
      paramInt2 = getPaddingBottom();
      int i = getPaddingTop();
      float f1 = this.layout.getLineLeft(0);
      float f2 = this.layout.getLineRight(0);
      float f3 = f1;
      float f4 = f2;
      if (this.layout.getLineCount() > 1)
      {
        float f5 = f1;
        if (f1 > this.layout.getLineLeft(1))
          f5 = this.layout.getLineLeft(1);
        f3 = f5;
        f4 = f2;
        if (f2 < this.layout.getLineRight(1))
        {
          f4 = this.layout.getLineRight(1);
          f3 = f5;
        }
      }
      this.lnZ = (f3 - this.lnY);
      setMeasuredDimension((int)(f4 - f3 + this.lnY * 2), paramInt1 + (paramInt2 + i));
      AppMethodBeat.o(3108);
      return;
      localObject = this.lod;
      if (localObject != null)
        ((c)localObject).refresh();
      if (Build.VERSION.SDK_INT >= 23)
      {
        localObject = StaticLayout.Builder.obtain(this.text, 0, this.text.length(), this.eNN, paramInt1).setAlignment(this.eNC).setIncludePad(this.lnW).setMaxLines(2).setLineSpacing(this.lnV, this.lnU).setEllipsize(TextUtils.TruncateAt.END).build();
        j.o(localObject, "StaticLayout.Builder.obt…                 .build()");
      }
      while (true)
      {
        this.loc = false;
        break;
        localObject = new StaticLayout(this.text, this.eNN, paramInt1, this.eNC, this.lnU, this.lnV, this.lnW);
      }
    }
  }

  public final void setDrawStroke(boolean paramBoolean)
  {
    this.loe = paramBoolean;
  }

  public final void setMaxWidth(float paramFloat)
  {
    this.hcW = paramFloat;
  }

  public final void setTextDrawer(c paramc)
  {
    this.lod = paramc;
  }

  public final void setTypeface(Typeface paramTypeface)
  {
    AppMethodBeat.i(3105);
    this.eNN.setTypeface(paramTypeface);
    this.lnX.setTypeface(paramTypeface);
    AppMethodBeat.o(3105);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.FontTextView
 * JD-Core Version:    0.6.2
 */