package com.tencent.mm.plugin.card.ui.v2;

import a.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardLabelTextView;", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fillColor", "p", "Landroid/graphics/Paint;", "radius", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setFillColor", "color", "setRadius", "plugin-card_release"})
public final class CardLabelTextView extends TextView
{
  private int fillColor;
  private final Paint kpQ;
  private float radius;

  public CardLabelTextView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(89281);
    this.radius = a.fromDPToPix(getContext(), 1);
    this.kpQ = new Paint();
    AppMethodBeat.o(89281);
  }

  public CardLabelTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(89282);
    this.radius = a.fromDPToPix(getContext(), 1);
    this.kpQ = new Paint();
    AppMethodBeat.o(89282);
  }

  public CardLabelTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(89283);
    this.radius = a.fromDPToPix(getContext(), 1);
    this.kpQ = new Paint();
    AppMethodBeat.o(89283);
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(89280);
    RectF localRectF = new RectF();
    localRectF.left = 0.0F;
    localRectF.right = getWidth();
    localRectF.top = 0.0F;
    localRectF.bottom = getHeight();
    this.kpQ.setAntiAlias(true);
    this.kpQ.setColor(this.fillColor);
    this.kpQ.setStyle(Paint.Style.FILL);
    if (paramCanvas != null)
      paramCanvas.drawRoundRect(localRectF, this.radius, this.radius, this.kpQ);
    super.onDraw(paramCanvas);
    AppMethodBeat.o(89280);
  }

  public final void setFillColor(int paramInt)
  {
    this.fillColor = paramInt;
  }

  public final void setRadius(float paramFloat)
  {
    this.radius = paramFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardLabelTextView
 * JD-Core Version:    0.6.2
 */