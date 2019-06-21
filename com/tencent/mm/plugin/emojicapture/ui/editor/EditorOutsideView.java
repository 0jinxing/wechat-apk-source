package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorOutsideView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clipPath", "Landroid/graphics/Path;", "outsidePaint", "Landroid/graphics/Paint;", "outsidePath", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setValidArea", "bounds", "Landroid/graphics/RectF;", "radius", "", "plugin-emojicapture_release"})
public final class EditorOutsideView extends View
{
  public final Path lkh;
  private final Paint lnR;
  private final Path lnS;

  public EditorOutsideView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(3095);
    AppMethodBeat.o(3095);
  }

  public EditorOutsideView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(3094);
    this.lkh = new Path();
    this.lnR = new Paint();
    this.lnS = new Path();
    this.lnR.setAntiAlias(true);
    this.lnR.setColor(getResources().getColor(2131689495));
    this.lnR.setAlpha(127);
    AppMethodBeat.o(3094);
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(3093);
    j.p(paramCanvas, "canvas");
    super.onDraw(paramCanvas);
    this.lnS.reset();
    this.lnS.addPath(this.lkh);
    this.lnS.addRect(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight(), Path.Direction.CCW);
    paramCanvas.drawPath(this.lnS, this.lnR);
    AppMethodBeat.o(3093);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.EditorOutsideView
 * JD-Core Version:    0.6.2
 */