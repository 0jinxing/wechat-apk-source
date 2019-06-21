package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatEditText;
import android.text.Layout;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/PhotoEditText;", "Landroid/support/v7/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mBgColor", "", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "radius", "", "rectF", "Landroid/graphics/RectF;", "drawBg", "", "canvas", "Landroid/graphics/Canvas;", "onDraw", "setTextBackground", "color", "plugin-story_release"})
public final class PhotoEditText extends AppCompatEditText
{
  private final Paint aFY;
  private final Path eAv;
  private int eHE;
  private final RectF kPM;
  private final float radius;

  public PhotoEditText(Context paramContext)
  {
    this(paramContext, null);
    AppMethodBeat.i(110618);
    AppMethodBeat.o(110618);
  }

  public PhotoEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(110617);
    this.eAv = new Path();
    this.aFY = new Paint();
    this.kPM = new RectF();
    this.radius = a.fromDPToPix(paramContext, 12);
    this.aFY.setStyle(Paint.Style.FILL);
    this.aFY.setAntiAlias(true);
    AppMethodBeat.o(110617);
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(110616);
    j.p(paramCanvas, "canvas");
    int i;
    float f1;
    float f2;
    float f3;
    float f4;
    if (this.eHE != 0)
    {
      CharSequence localCharSequence = (CharSequence)getText();
      if ((localCharSequence != null) && (localCharSequence.length() != 0))
        break label209;
      i = 1;
      if (i == 0)
      {
        this.aFY.setColor(this.eHE);
        f1 = this.radius * 2.0F;
        this.eAv.reset();
        if (getLineCount() != 0)
        {
          f2 = getLayout().getLineBottom(getLineCount() - 1) + getPaddingTop() + getPaddingBottom();
          if (getLineCount() != 1)
            break label214;
          f1 = getLayout().getLineWidth(0);
          f3 = getPaddingLeft();
          f4 = getPaddingRight();
          this.kPM.set(0.0F, 0.0F, f1 + f3 + f4, f2);
          this.eAv.addRoundRect(this.kPM, this.radius, this.radius, Path.Direction.CW);
        }
      }
    }
    while (true)
    {
      this.eAv.close();
      paramCanvas.drawPath(this.eAv, this.aFY);
      super.onDraw(paramCanvas);
      AppMethodBeat.o(110616);
      return;
      label209: i = 0;
      break;
      label214: f3 = getMeasuredWidth();
      float f5 = getLayout().getLineWidth(getLineCount() - 1);
      if (f5 >= f3 - f1 - getPaddingLeft() - getPaddingRight())
      {
        this.kPM.set(0.0F, 0.0F, f3, f2);
        this.eAv.addRoundRect(this.kPM, this.radius, this.radius, Path.Direction.CW);
      }
      else
      {
        f4 = getLayout().getLineTop(getLineCount() - 1) + getPaddingTop() + getPaddingBottom();
        f5 = f5 + getPaddingRight() + getPaddingLeft();
        this.eAv.moveTo(0.0F, this.radius);
        this.kPM.set(0.0F, 0.0F, f1, f1);
        this.eAv.arcTo(this.kPM, 180.0F, 90.0F);
        this.eAv.lineTo(f3 - f1, 0.0F);
        this.kPM.set(f3 - f1, 0.0F, f3, f1);
        this.eAv.arcTo(this.kPM, 270.0F, 90.0F);
        this.eAv.lineTo(f3, f4 - this.radius);
        this.kPM.set(f3 - f1, f4 - f1, f3, f4);
        this.eAv.arcTo(this.kPM, 0.0F, 90.0F);
        this.eAv.lineTo(this.radius + f5, f4);
        this.kPM.set(f5, f4, f5 + f1, f4 + f1);
        this.eAv.arcTo(this.kPM, 270.0F, -90.0F);
        this.eAv.lineTo(f5, f2 - this.radius);
        this.kPM.set(f5 - f1, f2 - f1, f5, f2);
        this.eAv.arcTo(this.kPM, 0.0F, 90.0F);
        this.eAv.lineTo(this.radius, f2);
        this.kPM.set(0.0F, f2 - f1, f1, f2);
        this.eAv.arcTo(this.kPM, 90.0F, 90.0F);
        this.eAv.lineTo(0.0F, this.radius);
      }
    }
  }

  public final void setTextBackground(int paramInt)
  {
    AppMethodBeat.i(110615);
    this.eHE = paramInt;
    invalidate();
    AppMethodBeat.o(110615);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.PhotoEditText
 * JD-Core Version:    0.6.2
 */