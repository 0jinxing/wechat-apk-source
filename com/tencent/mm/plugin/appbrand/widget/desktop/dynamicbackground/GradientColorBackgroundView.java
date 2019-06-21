package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import a.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GradientColorBackgroundView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backGradient", "Landroid/graphics/LinearGradient;", "beginColor", "endColor", "mColorHelper", "Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/DynamicBackgroundColorHelper;", "mLastUpdateColorTime", "", "paint", "Landroid/graphics/Paint;", "updateMode", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "resetGradient", "needInvalidate", "", "setUpdateMode", "updateColor", "Companion", "plugin-appbrand-integration_release"})
public final class GradientColorBackgroundView extends View
{
  public static final GradientColorBackgroundView.a jam;
  private Paint aFY;
  private int beginColor;
  private int cdh;
  private int endColor;
  private LinearGradient jaj;
  private a jak;
  private long jal;

  static
  {
    AppMethodBeat.i(135262);
    jam = new GradientColorBackgroundView.a((byte)0);
    AppMethodBeat.o(135262);
  }

  public GradientColorBackgroundView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(135260);
    this.aFY = new Paint();
    this.beginColor = -5778734;
    this.endColor = -14072734;
    this.jak = new a();
    this.jal = -1L;
    init();
    AppMethodBeat.o(135260);
  }

  public GradientColorBackgroundView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(135261);
    this.aFY = new Paint();
    this.beginColor = -5778734;
    this.endColor = -14072734;
    this.jak = new a();
    this.jal = -1L;
    init();
    AppMethodBeat.o(135261);
  }

  private final void eX(boolean paramBoolean)
  {
    AppMethodBeat.i(135259);
    this.jaj = new LinearGradient(0.0F, 0.0F, getWidth(), getHeight(), this.beginColor, this.endColor, Shader.TileMode.CLAMP);
    this.aFY.setShader((Shader)this.jaj);
    if (paramBoolean)
      invalidate();
    AppMethodBeat.o(135259);
  }

  private final void init()
  {
    AppMethodBeat.i(135256);
    this.cdh = 1;
    this.jak.aPy();
    this.beginColor = a.i(this.jak.aPx().iZb);
    this.endColor = a.i(this.jak.aPx().iZc);
    AppMethodBeat.o(135256);
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(135258);
    super.onDraw(paramCanvas);
    if (this.cdh == 1)
      if ((this.jal == -1L) || (System.currentTimeMillis() - this.jal >= 60000L))
      {
        this.jal = System.currentTimeMillis();
        this.jak.aPy();
        this.beginColor = a.i(this.jak.aPx().iZb);
        this.endColor = a.i(this.jak.aPx().iZc);
        eX(false);
      }
    label148: 
    while (true)
    {
      if (paramCanvas != null)
      {
        paramCanvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), this.aFY);
        AppMethodBeat.o(135258);
      }
      while (true)
      {
        return;
        if (this.jaj != null)
          break label148;
        eX(true);
        break;
        AppMethodBeat.o(135258);
      }
    }
  }

  public final void setUpdateMode(int paramInt)
  {
    AppMethodBeat.i(135257);
    ab.i("MicroMsg.GradientColorBackgroundView", "alvinluo setUpdateMode: %d", new Object[] { Integer.valueOf(paramInt) });
    if (this.cdh != paramInt)
    {
      this.cdh = paramInt;
      this.jal = -1L;
      this.jaj = null;
    }
    AppMethodBeat.o(135257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GradientColorBackgroundView
 * JD-Core Version:    0.6.2
 */