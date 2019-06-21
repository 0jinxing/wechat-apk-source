package com.tencent.mm.plugin.story.ui.view.editor.item;

import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.editor.a.b;
import com.tencent.mm.media.editor.a.d;
import com.tencent.mm.media.editor.a.e;
import com.tencent.mm.media.editor.a.h;
import com.tencent.mm.media.editor.a.i;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/item/BitmapItemView;", "Landroid/view/View;", "Lcom/tencent/mm/media/editor/item/IEditable;", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/IEditView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "Landroid/graphics/Bitmap;", "bitmap", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "color", "", "getColor", "()I", "setColor", "(I)V", "frameDrawable", "Lcom/tencent/mm/media/editor/view/ActiveFrameDrawable;", "location", "Lcom/tencent/mm/media/editor/item/LocationItem;", "getLocation", "()Lcom/tencent/mm/media/editor/item/LocationItem;", "setLocation", "(Lcom/tencent/mm/media/editor/item/LocationItem;)V", "sourceDataType", "Lcom/tencent/mm/media/editor/item/EditorDataType;", "getSourceDataType", "()Lcom/tencent/mm/media/editor/item/EditorDataType;", "setSourceDataType", "(Lcom/tencent/mm/media/editor/item/EditorDataType;)V", "stateResolve", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/EditorItemContainer$ItemStateResolve;", "text", "", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "textBg", "getTextBg", "setTextBg", "touchDownX", "", "getTouchDownX", "()F", "setTouchDownX", "(F)V", "touchDownY", "getTouchDownY", "setTouchDownY", "touchMoved", "", "getTouchMoved", "()Z", "setTouchMoved", "(Z)V", "touchSlop", "getTouchSlop", "touchTracker", "Lcom/tencent/mm/media/editor/touch/TouchTracker;", "getTouchTracker", "()Lcom/tencent/mm/media/editor/touch/TouchTracker;", "Landroid/graphics/Matrix;", "viewMatrix", "getViewMatrix", "()Landroid/graphics/Matrix;", "setViewMatrix", "(Landroid/graphics/Matrix;)V", "createEditorData", "Lcom/tencent/mm/media/editor/item/BaseEditorData;", "createEditorItem", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "getContentBoundary", "", "getSafeArea", "Landroid/graphics/Rect;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "setSafeArea", "safeRect", "setStateResolve", "setValidArea", "validRect", "plugin-story_release"})
public class a extends View
  implements h, c
{
  private Bitmap bitmap;
  private int color;
  private final com.tencent.mm.media.editor.c.c lkf;
  private float lot;
  private float lou;
  private boolean lov;
  private final int nfE;
  private final com.tencent.mm.media.editor.view.a smB;
  private EditorItemContainer.b smC;
  private int smD;
  private i smE;
  private e smF;
  private Matrix smG;
  private CharSequence text;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(110631);
    this.lkf = new com.tencent.mm.media.editor.c.c();
    this.smF = e.eUm;
    this.lkf.aJg = 0.5F;
    this.lkf.aJf = 3.0F;
    Resources localResources = getResources();
    a.f.b.j.o(localResources, "resources");
    this.smB = new com.tencent.mm.media.editor.view.a(localResources);
    paramContext = ViewConfiguration.get(paramContext);
    a.f.b.j.o(paramContext, "ViewConfiguration.get(context)");
    this.nfE = paramContext.getScaledTouchSlop();
    AppMethodBeat.o(110631);
  }

  public final b UI()
  {
    AppMethodBeat.i(110626);
    b localb;
    if (this.bitmap == null)
    {
      localb = null;
      AppMethodBeat.o(110626);
    }
    while (true)
    {
      return localb;
      localb = (b)new d(this.bitmap, this.lkf.aKk);
      AppMethodBeat.o(110626);
    }
  }

  public final com.tencent.mm.media.editor.a.a UJ()
  {
    AppMethodBeat.i(110627);
    Object localObject;
    if (this.bitmap == null)
    {
      localObject = null;
      AppMethodBeat.o(110627);
    }
    while (true)
    {
      return localObject;
      if (this.smF == e.eUm)
      {
        localObject = (com.tencent.mm.media.editor.a.a)new com.tencent.mm.media.editor.a.j(this.text, this.color, this.smD, this.lkf.aKk);
        AppMethodBeat.o(110627);
      }
      else
      {
        localObject = this.smE;
        if (localObject == null)
          a.f.b.j.dWJ();
        String str = ((i)localObject).eUt;
        localObject = this.smE;
        if (localObject == null)
          a.f.b.j.dWJ();
        localObject = (com.tencent.mm.media.editor.a.a)new i(str, ((i)localObject).eUu, this.lkf.aKk);
        AppMethodBeat.o(110627);
      }
    }
  }

  public final Bitmap getBitmap()
  {
    return this.bitmap;
  }

  public final int getColor()
  {
    return this.color;
  }

  public float[] getContentBoundary()
  {
    AppMethodBeat.i(110630);
    float[] arrayOfFloat = (float[])this.lkf.eUT.clone();
    AppMethodBeat.o(110630);
    return arrayOfFloat;
  }

  public final i getLocation()
  {
    return this.smE;
  }

  public Rect getSafeArea()
  {
    AppMethodBeat.i(110629);
    Rect localRect = this.lkf.eUN;
    Object localObject = localRect;
    if (localRect == null)
    {
      localObject = getResources();
      a.f.b.j.o(localObject, "resources");
      int i = ((Resources)localObject).getDisplayMetrics().widthPixels;
      localObject = getResources();
      a.f.b.j.o(localObject, "resources");
      localObject = new Rect(0, 0, i, ((Resources)localObject).getDisplayMetrics().heightPixels);
    }
    AppMethodBeat.o(110629);
    return localObject;
  }

  public final e getSourceDataType()
  {
    return this.smF;
  }

  public final CharSequence getText()
  {
    return this.text;
  }

  public final int getTextBg()
  {
    return this.smD;
  }

  public final float getTouchDownX()
  {
    return this.lot;
  }

  public final float getTouchDownY()
  {
    return this.lou;
  }

  public final boolean getTouchMoved()
  {
    return this.lov;
  }

  public final int getTouchSlop()
  {
    return this.nfE;
  }

  protected final com.tencent.mm.media.editor.c.c getTouchTracker()
  {
    return this.lkf;
  }

  public final Matrix getViewMatrix()
  {
    return this.smG;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(110625);
    a.f.b.j.p(paramCanvas, "canvas");
    paramCanvas.save();
    if (this.smG != null)
      paramCanvas.setMatrix(this.smG);
    while (true)
    {
      if (isActivated())
        this.smB.draw(paramCanvas);
      if (this.bitmap != null)
        paramCanvas.drawBitmap(this.bitmap, 0.0F, 0.0F, null);
      paramCanvas.restore();
      AppMethodBeat.o(110625);
      return;
      paramCanvas.setMatrix(this.lkf.aKk);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(110624);
    a.f.b.j.p(paramMotionEvent, "event");
    boolean bool1 = this.lkf.u(paramMotionEvent);
    if (bool1)
    {
      EditorItemContainer.b localb = this.smC;
      if (localb != null)
        localb.e((View)this, paramMotionEvent);
      bringToFront();
      postInvalidate();
    }
    if (bool1)
      switch (paramMotionEvent.getActionMasked())
      {
      default:
      case 0:
      case 2:
      case 1:
      }
    while (true)
    {
      AppMethodBeat.o(110624);
      return bool1;
      this.lot = paramMotionEvent.getX();
      this.lou = paramMotionEvent.getY();
      this.lov = false;
      continue;
      float f = Math.max(Math.abs(paramMotionEvent.getX() - this.lot), Math.abs(paramMotionEvent.getY() - this.lou));
      if (!this.lov)
      {
        if (f > this.nfE);
        for (boolean bool2 = true; ; bool2 = false)
        {
          this.lov = bool2;
          break;
        }
        if (!this.lov)
          performClick();
      }
    }
  }

  public final void setBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(110620);
    this.bitmap = paramBitmap;
    if (paramBitmap != null)
    {
      this.lkf.width = paramBitmap.getWidth();
      this.lkf.height = paramBitmap.getHeight();
      this.lkf.aKk.preTranslate(-paramBitmap.getWidth() / 2.0F, -paramBitmap.getHeight() / 2.0F);
      this.smB.setBounds(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
      this.lkf.h(new float[] { 0.0F, 0.0F, paramBitmap.getWidth(), 0.0F, 0.0F, paramBitmap.getHeight(), paramBitmap.getWidth(), paramBitmap.getHeight() });
    }
    AppMethodBeat.o(110620);
  }

  public final void setColor(int paramInt)
  {
    this.color = paramInt;
  }

  public final void setLocation(i parami)
  {
    this.smE = parami;
  }

  public void setSafeArea(Rect paramRect)
  {
    AppMethodBeat.i(110628);
    a.f.b.j.p(paramRect, "safeRect");
    this.lkf.eUN = paramRect;
    this.lkf.eUO = com.tencent.mm.bz.a.fromDPToPix(getContext(), 54);
    AppMethodBeat.o(110628);
  }

  public final void setSourceDataType(e parame)
  {
    AppMethodBeat.i(110619);
    a.f.b.j.p(parame, "<set-?>");
    this.smF = parame;
    AppMethodBeat.o(110619);
  }

  public final void setStateResolve(EditorItemContainer.b paramb)
  {
    AppMethodBeat.i(110623);
    a.f.b.j.p(paramb, "stateResolve");
    this.smC = paramb;
    AppMethodBeat.o(110623);
  }

  public final void setText(CharSequence paramCharSequence)
  {
    this.text = paramCharSequence;
  }

  public final void setTextBg(int paramInt)
  {
    this.smD = paramInt;
  }

  public final void setTouchDownX(float paramFloat)
  {
    this.lot = paramFloat;
  }

  public final void setTouchDownY(float paramFloat)
  {
    this.lou = paramFloat;
  }

  public final void setTouchMoved(boolean paramBoolean)
  {
    this.lov = paramBoolean;
  }

  public void setValidArea(Rect paramRect)
  {
    AppMethodBeat.i(110622);
    a.f.b.j.p(paramRect, "validRect");
    this.lkf.aKk.postTranslate(paramRect.width() / 2.0F, paramRect.height() / 2.0F);
    AppMethodBeat.o(110622);
  }

  public final void setViewMatrix(Matrix paramMatrix)
  {
    AppMethodBeat.i(110621);
    this.smG = paramMatrix;
    if (paramMatrix != null)
    {
      this.lkf.setMatrix(paramMatrix);
      Canvas localCanvas = new Canvas();
      localCanvas.save();
      if (this.smG != null)
        localCanvas.setMatrix(paramMatrix);
      if (isActivated())
        this.smB.draw(localCanvas);
      if (this.bitmap != null)
        localCanvas.drawBitmap(this.bitmap, 0.0F, 0.0F, null);
    }
    AppMethodBeat.o(110621);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.item.a
 * JD-Core Version:    0.6.2
 */