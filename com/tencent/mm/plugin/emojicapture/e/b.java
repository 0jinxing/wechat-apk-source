package com.tencent.mm.plugin.emojicapture.e;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.editor.c.c;
import com.tencent.mm.plugin.emojicapture.c.c.a;
import com.tencent.mm.plugin.emojicapture.c.c.b;
import com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/presenter/EditorItemPresenter;", "Lcom/tencent/mm/plugin/emojicapture/contract/EditorItemContract$IPresenter;", "view", "Lcom/tencent/mm/plugin/emojicapture/contract/EditorItemContract$IView;", "(Lcom/tencent/mm/plugin/emojicapture/contract/EditorItemContract$IView;)V", "basicScale", "", "clipPath", "Landroid/graphics/Path;", "drawingBounds", "Landroid/graphics/Rect;", "framePadding", "frameRect", "frameStroke", "isClipping", "", "isEditing", "maxScale", "minScale", "paint", "Landroid/graphics/Paint;", "touchTracker", "Lcom/tencent/mm/media/editor/touch/TouchTracker;", "validBounds", "Landroid/graphics/RectF;", "drawCommon", "", "canvas", "Landroid/graphics/Canvas;", "drawOutside", "getTouchTracker", "onTouch", "event", "Landroid/view/MotionEvent;", "resetMatrix", "setDrawingSize", "width", "", "height", "setEditing", "editing", "setValidArea", "bounds", "radius", "Companion", "plugin-emojicapture_release"})
public final class b
  implements c.a
{
  public static final b.a lkm;
  private final Paint aFY;
  private float aJf;
  private float aJg;
  private float eVd;
  private final float eVe;
  private final float eVf;
  private final float eVg;
  private final c lkf;
  private final RectF lkg;
  private final Path lkh;
  private final Rect lki;
  private boolean lkj;
  private boolean lkk;
  private final c.b lkl;

  static
  {
    AppMethodBeat.i(2764);
    lkm = new b.a((byte)0);
    AppMethodBeat.o(2764);
  }

  public b(c.b paramb)
  {
    AppMethodBeat.i(2763);
    this.lkl = paramb;
    this.lkf = new c();
    this.lkg = new RectF();
    this.lkh = new Path();
    this.lki = new Rect();
    this.aFY = new Paint();
    this.eVd = 1.0F;
    this.aJf = 2.0F;
    this.aJg = 0.25F;
    paramb = this.lkl;
    if (paramb == null)
    {
      paramb = new v("null cannot be cast to non-null type android.view.View");
      AppMethodBeat.o(2763);
      throw paramb;
    }
    paramb = ((View)paramb).getContext();
    j.o(paramb, "(view as View).context");
    paramb = paramb.getResources();
    this.lkf.aJf = this.aJf;
    this.lkf.aJg = this.aJg;
    this.aFY.setColor(-1);
    this.aFY.setAntiAlias(true);
    this.aFY.setStrokeWidth(paramb.getDimension(2131428322));
    this.aFY.setStyle(Paint.Style.FILL);
    this.eVf = paramb.getDimension(2131428322);
    this.eVg = paramb.getDimension(2131428320);
    this.eVe = paramb.getDimension(2131428321);
    AppMethodBeat.o(2763);
  }

  private final void bnJ()
  {
    AppMethodBeat.i(2758);
    this.lkf.aKk.reset();
    this.lkf.aKk.postTranslate(-this.lki.width() / 2.0F, -this.lki.height() / 2.0F);
    if ((!this.lkg.isEmpty()) && (!this.lki.isEmpty()))
    {
      int i = Math.max(this.lki.width(), this.lki.height());
      this.eVd = (this.lkg.width() / i);
      float f = this.eVd * 0.5F;
      this.aJf = (this.eVd * 2.0F);
      this.aJg = (this.eVd * 0.25F);
      this.lkf.aJf = this.aJf;
      this.lkf.aJg = this.aJg;
      this.lkf.aKk.postScale(f, f);
    }
    this.lkf.aKk.postTranslate((this.lkg.left + this.lkg.right) / 2.0F, (this.lkg.top + this.lkg.bottom) / 2.0F);
    AppMethodBeat.o(2758);
  }

  public final boolean G(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(2760);
    j.p(paramMotionEvent, "event");
    EditorItemContainer localEditorItemContainer = this.lkl.getItemContainer();
    if (this.lkf.u(paramMotionEvent))
    {
      if (localEditorItemContainer != null)
        localEditorItemContainer.a((com.tencent.mm.plugin.emojicapture.ui.editor.a)this.lkl, paramMotionEvent);
      switch (paramMotionEvent.getActionMasked())
      {
      default:
      case 0:
      case 2:
      case 1:
      case 3:
      }
      while (true)
      {
        paramMotionEvent = this.lkl;
        if (paramMotionEvent != null)
          break;
        paramMotionEvent = new v("null cannot be cast to non-null type android.view.View");
        AppMethodBeat.o(2760);
        throw paramMotionEvent;
        this.lkk = true;
        paramMotionEvent = this.lkl;
        if (paramMotionEvent == null)
        {
          paramMotionEvent = new v("null cannot be cast to non-null type android.view.View");
          AppMethodBeat.o(2760);
          throw paramMotionEvent;
        }
        ((View)paramMotionEvent).bringToFront();
        continue;
        this.lkk = false;
        continue;
        this.lkk = true;
        paramMotionEvent = new com.tencent.mm.media.editor.c.a();
        paramMotionEvent.aJg = this.aJg;
        paramMotionEvent.aJf = this.aJf;
        paramMotionEvent.g(new float[] { this.lki.width() / 2.0F, this.lki.height() / 2.0F });
        paramMotionEvent.b(new RectF(this.lkg.left, this.lkg.top, this.lkg.right, this.lkg.bottom));
        paramMotionEvent.a(this.lkf.aKk, (a.f.a.b)new b.b(this));
      }
      ((View)paramMotionEvent).invalidate();
      AppMethodBeat.o(2760);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(2760);
    }
  }

  public final void a(RectF paramRectF, float paramFloat)
  {
    AppMethodBeat.i(2757);
    j.p(paramRectF, "bounds");
    this.lkg.set(paramRectF);
    this.lkh.addRoundRect(new RectF(paramRectF.left, paramRectF.top, paramRectF.right, paramRectF.bottom), paramFloat, paramFloat, Path.Direction.CW);
    bnJ();
    AppMethodBeat.o(2757);
  }

  public final void dV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2756);
    this.lkf.width = paramInt1;
    this.lkf.height = paramInt2;
    this.lki.right = paramInt1;
    this.lki.bottom = paramInt2;
    bnJ();
    AppMethodBeat.o(2756);
  }

  public final c getTouchTracker()
  {
    return this.lkf;
  }

  public final void h(Canvas paramCanvas)
  {
    AppMethodBeat.i(2761);
    j.p(paramCanvas, "canvas");
    if (this.lkk)
      paramCanvas.clipPath(this.lkh);
    paramCanvas.setMatrix(this.lkf.aKk);
    if (this.lkj)
    {
      float f1 = this.lki.left - this.eVg / this.eVd;
      float f2 = this.lki.top - this.eVg / this.eVd;
      float f3 = this.lki.right + this.eVg / this.eVd;
      float f4 = this.lki.bottom + this.eVg / this.eVd;
      float f5 = this.eVe / 2.0F / this.eVd;
      this.aFY.setStrokeWidth(this.eVf / this.eVd);
      paramCanvas.drawRect(f1 - f5, f2 - f5, f1 + f5, f2 + f5, this.aFY);
      paramCanvas.drawRect(f3 - f5, f2 - f5, f3 + f5, f2 + f5, this.aFY);
      paramCanvas.drawRect(f3 - f5, f4 - f5, f3 + f5, f4 + f5, this.aFY);
      paramCanvas.drawRect(f1 - f5, f4 - f5, f1 + f5, f4 + f5, this.aFY);
      Paint localPaint = this.aFY;
      paramCanvas.drawLines(new float[] { f1, f2, f3, f2, f3, f2, f3, f4, f3, f4, f1, f4, f1, f4, f1, f2 }, localPaint);
    }
    AppMethodBeat.o(2761);
  }

  public final void i(Canvas paramCanvas)
  {
    AppMethodBeat.i(2762);
    j.p(paramCanvas, "canvas");
    AppMethodBeat.o(2762);
  }

  public final void setEditing(boolean paramBoolean)
  {
    AppMethodBeat.i(2759);
    this.lkj = paramBoolean;
    Object localObject = this.lkl;
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type android.view.View");
      AppMethodBeat.o(2759);
      throw ((Throwable)localObject);
    }
    ((View)localObject).postInvalidate();
    AppMethodBeat.o(2759);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.e.b
 * JD-Core Version:    0.6.2
 */