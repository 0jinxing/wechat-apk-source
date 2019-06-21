package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/EditorFrameView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBoundaryColor", "mMaskColor", "mPaint", "Landroid/graphics/Paint;", "mPath", "Landroid/graphics/Path;", "mPosition", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorFramePosition;", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setMaskColor", "maskColor", "setPosition", "position", "plugin-story_release"})
public final class EditorFrameView extends View
{
  private Paint mPaint;
  private int slu;
  private int slv;
  private a slw;
  private Path vr;

  public EditorFrameView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(110547);
    this.slu = -1;
    this.slv = -1;
    this.slw = a.slp;
    this.mPaint = new Paint();
    this.vr = new Path();
    init();
    AppMethodBeat.o(110547);
  }

  public EditorFrameView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(110548);
    this.slu = -1;
    this.slv = -1;
    this.slw = a.slp;
    this.mPaint = new Paint();
    this.vr = new Path();
    init();
    AppMethodBeat.o(110548);
  }

  public EditorFrameView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110549);
    this.slu = -1;
    this.slv = -1;
    this.slw = a.slp;
    this.mPaint = new Paint();
    this.vr = new Path();
    init();
    AppMethodBeat.o(110549);
  }

  private final void init()
  {
    AppMethodBeat.i(110544);
    Context localContext = getContext();
    j.o(localContext, "context");
    this.slu = localContext.getResources().getColor(2131690527);
    int i = com.tencent.mm.bz.a.fromDPToPix(getContext(), 1);
    this.mPaint.setStyle(Paint.Style.STROKE);
    this.mPaint.setAntiAlias(true);
    this.mPaint.setStrokeWidth(2.0F * i);
    this.mPaint.setColor(this.slv);
    this.mPaint.setPathEffect((PathEffect)new DashPathEffect(new float[] { i * 4.0F, i * 4.0F }, 0.0F));
    AppMethodBeat.o(110544);
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(110546);
    super.onDraw(paramCanvas);
    if (paramCanvas != null)
      paramCanvas.save();
    if (paramCanvas != null)
      paramCanvas.drawColor(this.slu);
    a locala = this.slw;
    switch (b.eQZ[locala.ordinal()])
    {
    default:
      if (paramCanvas != null)
      {
        paramCanvas.restore();
        AppMethodBeat.o(110546);
      }
      break;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return;
      this.vr.moveTo(getWidth(), 0.0F);
      this.vr.lineTo(getWidth(), getHeight());
      if (paramCanvas == null)
        break;
      paramCanvas.drawPath(this.vr, this.mPaint);
      break;
      this.vr.moveTo(0.0F, getHeight());
      this.vr.lineTo(getWidth(), getHeight());
      if (paramCanvas == null)
        break;
      paramCanvas.drawPath(this.vr, this.mPaint);
      break;
      this.vr.moveTo(0.0F, 0.0F);
      this.vr.lineTo(0.0F, getHeight());
      if (paramCanvas == null)
        break;
      paramCanvas.drawPath(this.vr, this.mPaint);
      break;
      this.vr.moveTo(0.0F, 0.0F);
      this.vr.lineTo(getWidth(), 0.0F);
      if (paramCanvas == null)
        break;
      paramCanvas.drawPath(this.vr, this.mPaint);
      break;
      AppMethodBeat.o(110546);
    }
  }

  public final void setMaskColor(int paramInt)
  {
    this.slu = paramInt;
  }

  public final void setPosition(a parama)
  {
    AppMethodBeat.i(110545);
    j.p(parama, "position");
    this.slw = parama;
    AppMethodBeat.o(110545);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorFrameView
 * JD-Core Version:    0.6.2
 */