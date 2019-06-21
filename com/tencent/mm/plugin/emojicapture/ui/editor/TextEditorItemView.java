package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.a.e;
import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.c.c.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.aa;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/TextEditorItemView;", "Landroid/view/View;", "Lcom/tencent/mm/plugin/emojicapture/contract/EditorItemContract$IView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "animCount", "animIndex", "bitmapArray", "", "Landroid/graphics/Bitmap;", "[Landroid/graphics/Bitmap;", "bitmapOffset", "Landroid/graphics/PointF;", "bottomMargin", "", "clipPath", "Landroid/graphics/Path;", "contentPadding", "drawingOffset", "fontPaths", "[Ljava/lang/String;", "framePadding", "framePaint", "Landroid/graphics/Paint;", "framePath", "framePathRect", "Landroid/graphics/RectF;", "frameStrokeWidth", "isClipping", "", "isEditing", "isEditingBeforeTouch", "isValid", "maxScale", "minScale", "strokeColor", "switchRunnable", "Ljava/lang/Runnable;", "text", "", "textColor", "textDrawer", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/TextDrawer;", "touchDownX", "touchDownY", "touchMoved", "touchSlop", "touchTracker", "Lcom/tencent/mm/media/editor/touch/TouchTracker;", "typefaceIndex", "validRect", "wxTypeFaces", "Landroid/graphics/Typeface;", "[Landroid/graphics/Typeface;", "createEditorData", "Lcom/tencent/mm/media/editor/item/BaseEditorData;", "createEditorItem", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "createTextBitmap", "typeface", "getItemContainer", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "getText", "getTextColor", "handleRemove", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "pause", "preSetMatrix", "refresh", "resetFrame", "contentWidth", "contentHeight", "resume", "setEditing", "editing", "setValidArea", "bounds", "radius", "switchFont", "updateText", "color", "change", "Companion", "plugin-emojicapture_release"})
public final class TextEditorItemView extends View
  implements c.b
{
  public static final TextEditorItemView.a loz;
  private final String TAG;
  private float aJf;
  private float aJg;
  private boolean bYN;
  private final float eVg;
  private final float jgH;
  private final com.tencent.mm.media.editor.c.c lkf;
  private final Path lkh;
  private boolean lkj;
  private boolean lkk;
  private RectF lnL;
  private com.tencent.mm.plugin.emojicapture.ui.editor.a.c lod;
  private String[] lof;
  private Typeface[] loh;
  private int loi;
  private final Runnable loj;
  private final Paint lok;
  private final float lol;
  private final Path lom;
  private final RectF lon;
  private final int loo;
  private int lop;
  private final Bitmap[] loq;
  private final float lor;
  private boolean los;
  private float lot;
  private float lou;
  private boolean lov;
  private final float low;
  private final PointF lox;
  private final PointF loy;
  private int strokeColor;
  private CharSequence text;
  private int textColor;

  static
  {
    AppMethodBeat.i(3129);
    loz = new TextEditorItemView.a((byte)0);
    AppMethodBeat.o(3129);
  }

  public TextEditorItemView(Context paramContext)
  {
    this(paramContext, null);
  }

  public TextEditorItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public TextEditorItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(3128);
    this.TAG = "MicroMsg.TextEditorItemView";
    this.loj = ((Runnable)new TextEditorItemView.d(this));
    this.lok = new Paint(1);
    this.lom = new Path();
    this.lon = new RectF();
    this.lnL = new RectF();
    this.textColor = -1;
    this.strokeColor = -1;
    this.lox = new PointF();
    this.loy = new PointF();
    this.lkf = new com.tencent.mm.media.editor.c.c();
    this.lkh = new Path();
    this.aJf = 2.0F;
    this.aJg = 0.25F;
    if (paramContext == null)
      j.dWJ();
    float f = paramContext.getResources().getDimension(2131428327);
    label185: int i;
    if (com.tencent.mm.ao.b.afY().agb())
    {
      paramAttributeSet = com.tencent.mm.plugin.emojicapture.model.c.lhw;
      paramAttributeSet = aa.dor();
      if (paramAttributeSet == null);
      do
        while (true)
        {
          paramInt = 1;
          if (paramInt == 0)
            break label383;
          j.o(com.tencent.mm.ao.b.afY(), "FontResLogic.getInstance()");
          paramAttributeSet = com.tencent.mm.ao.b.agc();
          j.o(paramAttributeSet, "FontResLogic.getInstance().fontPath");
          this.lof = paramAttributeSet;
          paramAttributeSet = com.tencent.mm.plugin.emojicapture.model.c.lhw;
          this.lod = ((com.tencent.mm.plugin.emojicapture.ui.editor.a.c)new com.tencent.mm.plugin.emojicapture.ui.editor.a.b(this.lof, (int)f));
          i = this.lof.length;
          paramAttributeSet = new Typeface[i];
          for (paramInt = 0; paramInt < i; paramInt++)
            paramAttributeSet[paramInt] = Typeface.createFromFile(this.lof[paramInt]);
          switch (paramAttributeSet.hashCode())
          {
          default:
          case 115861428:
          case 115861812:
          }
        }
      while (!paramAttributeSet.equals("zh_HK"));
      while (true)
      {
        paramInt = 0;
        break label185;
        if (!paramAttributeSet.equals("zh_TW"))
          break;
      }
    }
    for (this.loh = paramAttributeSet; ; this.loh = new Typeface[] { null })
    {
      this.loo = this.loh.length;
      i = this.loo;
      paramAttributeSet = new Bitmap[i];
      for (paramInt = 0; paramInt < i; paramInt++)
        paramAttributeSet[paramInt] = null;
      label383: this.lof = new String[] { "" };
      h.pYm.z(933L, 3L);
      this.lod = ((com.tencent.mm.plugin.emojicapture.ui.editor.a.c)new com.tencent.mm.plugin.emojicapture.ui.editor.a.a());
    }
    this.loq = paramAttributeSet;
    boc();
    this.eVg = getResources().getDimension(2131428324);
    this.lol = getResources().getDimension(2131428325);
    this.lok.setColor(-1);
    this.lok.setStyle(Paint.Style.STROKE);
    this.lok.setStrokeWidth(this.lol);
    this.loy.set(this.eVg, this.eVg);
    this.low = getResources().getDimension(2131428323);
    this.lor = getResources().getDimension(2131428326);
    paramContext = ViewConfiguration.get(paramContext);
    j.o(paramContext, "ViewConfiguration.get(context)");
    this.jgH = paramContext.getScaledTouchSlop();
    this.lkf.aJf = this.aJf;
    this.lkf.aJg = this.aJg;
    AppMethodBeat.o(3128);
  }

  private final void bod()
  {
    AppMethodBeat.i(3124);
    this.lkf.aKk.setTranslate(this.lox.x, this.lox.y);
    AppMethodBeat.o(3124);
  }

  private final Bitmap d(Typeface paramTypeface)
  {
    AppMethodBeat.i(3125);
    FontTextView localFontTextView = new FontTextView(getContext());
    localFontTextView.setMaxWidth(this.lnL.width());
    localFontTextView.setTextDrawer(this.lod);
    localFontTextView.setTypeface(paramTypeface);
    localFontTextView.d(this.text, this.textColor, this.strokeColor);
    localFontTextView.measure(View.MeasureSpec.makeMeasureSpec((int)(this.lnL.width() - 2.0F * this.lor), -2147483648), 0);
    Bitmap localBitmap = Bitmap.createBitmap(localFontTextView.getMeasuredWidth(), localFontTextView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
    paramTypeface = new Canvas(localBitmap);
    paramTypeface.save();
    localFontTextView.draw(paramTypeface);
    paramTypeface.restore();
    j.o(localBitmap, "bitmap");
    AppMethodBeat.o(3125);
    return localBitmap;
  }

  private final void dX(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3123);
    float f1 = paramInt1 + this.eVg * 2.0F;
    float f2 = paramInt2 + this.eVg * 2.0F;
    float f3 = this.lon.width();
    float f4 = this.lon.height();
    if (this.lon.isEmpty())
      this.lox.offset(f1 / 2.0F, -f2);
    while (true)
    {
      this.lon.set(0.0F, 0.0F, f1, f2);
      this.lom.reset();
      this.lom.addRoundRect(this.lon, this.eVg, this.eVg, Path.Direction.CW);
      this.lkf.aKk.preTranslate((this.lkf.width - f1) / 2.0F, this.lkf.height - f2);
      if (!this.bYN)
        bod();
      this.lkf.width = ((int)f1);
      this.lkf.height = ((int)f2);
      AppMethodBeat.o(3123);
      return;
      this.lox.offset((f3 - f1) / 2.0F, (f4 - f2) / 2.0F);
    }
  }

  private final void refresh()
  {
    AppMethodBeat.i(3121);
    e.K(this.loq);
    this.lop = 0;
    this.loi = 0;
    boc();
    AppMethodBeat.o(3121);
  }

  public final com.tencent.mm.media.editor.a.b UI()
  {
    AppMethodBeat.i(3127);
    Object localObject;
    if (!this.bYN)
    {
      localObject = null;
      AppMethodBeat.o(3127);
    }
    while (true)
    {
      return localObject;
      localObject = new Matrix();
      ((Matrix)localObject).postConcat(this.lkf.aKk);
      ((Matrix)localObject).postTranslate(this.loy.x, this.loy.y);
      localObject = (com.tencent.mm.media.editor.a.b)new com.tencent.mm.media.editor.a.c(this.loq, (Matrix)localObject);
      AppMethodBeat.o(3127);
    }
  }

  public final com.tencent.mm.media.editor.a.a UJ()
  {
    return null;
  }

  public final void a(RectF paramRectF, float paramFloat)
  {
    AppMethodBeat.i(3115);
    j.p(paramRectF, "bounds");
    this.lnL.set(paramRectF);
    this.lkh.addRoundRect(new RectF(paramRectF.left, paramRectF.top, paramRectF.right, paramRectF.bottom), paramFloat, paramFloat, Path.Direction.CW);
    this.lox.set(paramRectF.left + paramRectF.width() / 2.0F - this.lon.width() / 2.0F, paramRectF.bottom - this.low - this.lon.height());
    bod();
    AppMethodBeat.o(3115);
  }

  public final void a(CharSequence paramCharSequence, int paramInt, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(3118);
    if (paramBoolean)
    {
      this.text = paramCharSequence;
      this.textColor = paramInt;
      this.strokeColor = com.tencent.mm.plugin.emojicapture.ui.a.uB(this.textColor);
      if ((paramCharSequence != null) && (paramCharSequence.length() != 0))
        break label72;
      paramInt = 1;
      if (paramInt != 0)
        break label77;
    }
    label72: label77: for (paramBoolean = bool; ; paramBoolean = false)
    {
      this.bYN = paramBoolean;
      refresh();
      AppMethodBeat.o(3118);
      return;
      paramInt = 0;
      break;
    }
  }

  public final boolean bob()
  {
    AppMethodBeat.i(3117);
    a((CharSequence)"", 0, true);
    post((Runnable)new TextEditorItemView.b(this));
    AppMethodBeat.o(3117);
    return true;
  }

  public final void boc()
  {
    AppMethodBeat.i(3122);
    Object localObject;
    if (this.bYN)
    {
      this.lop += 1;
      this.lop %= this.loo;
      localObject = this.loh[this.loi];
      this.lod.Kd(this.lof[this.loi]);
      this.loi += 1;
      this.loi %= this.loh.length;
      if (this.loq[this.lop] == null)
      {
        localObject = d((Typeface)localObject);
        this.loq[this.lop] = localObject;
        dX(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
      }
      removeCallbacks(this.loj);
      postDelayed(this.loj, 100L);
    }
    while (true)
    {
      invalidate();
      AppMethodBeat.o(3122);
      return;
      if (this.loq[this.lop] == null)
      {
        localObject = this.loh[0];
        this.lod.Kd(this.lof[this.loi]);
        localObject = d((Typeface)localObject);
        this.loq[this.lop] = localObject;
        dX(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
      }
    }
  }

  public final EditorItemContainer getItemContainer()
  {
    AppMethodBeat.i(3126);
    Object localObject = getParent();
    j.o(localObject, "parent");
    if ((((ViewParent)localObject).getParent() instanceof EditorItemContainer))
    {
      localObject = getParent();
      j.o(localObject, "parent");
      localObject = ((ViewParent)localObject).getParent();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer");
        AppMethodBeat.o(3126);
        throw ((Throwable)localObject);
      }
      localObject = (EditorItemContainer)localObject;
      AppMethodBeat.o(3126);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(3126);
    }
  }

  public final CharSequence getText()
  {
    if (this.bYN);
    for (CharSequence localCharSequence = this.text; ; localCharSequence = null)
      return localCharSequence;
  }

  public final int getTextColor()
  {
    if (this.bYN);
    for (int i = this.textColor; ; i = 0)
      return i;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(3120);
    j.p(paramCanvas, "canvas");
    if (this.lkk)
      paramCanvas.clipPath(this.lkh);
    paramCanvas.save();
    paramCanvas.concat(this.lkf.aKk);
    if (this.lkj)
      paramCanvas.drawPath(this.lom, this.lok);
    Bitmap localBitmap = this.loq[this.lop];
    if (localBitmap != null)
      paramCanvas.drawBitmap(localBitmap, this.loy.x, this.loy.y, null);
    paramCanvas.restore();
    AppMethodBeat.o(3120);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(3119);
    j.p(paramMotionEvent, "event");
    boolean bool2 = this.lkf.u(paramMotionEvent);
    if (bool2)
    {
      postInvalidate();
      switch (paramMotionEvent.getActionMasked())
      {
      case 4:
      default:
        if (!this.bYN)
          bod();
        break;
      case 0:
      case 2:
      case 1:
      case 3:
      case 5:
      case 6:
      }
    }
    while (true)
    {
      AppMethodBeat.o(3119);
      while (true)
      {
        return bool2;
        AppMethodBeat.o(3119);
        bool2 = bool1;
        continue;
        this.los = this.lkj;
        this.lov = false;
        this.lot = paramMotionEvent.getX();
        this.lou = paramMotionEvent.getY();
        this.lkk = true;
        break;
        this.lkk = false;
        if ((Math.abs(paramMotionEvent.getX() - this.lot) <= this.jgH) && (Math.abs(paramMotionEvent.getY() - this.lou) <= this.jgH))
          break;
        this.lov = true;
        break;
        this.lkk = true;
        if (((!this.bYN) || (this.los)) && (!this.lov))
          performClick();
        localObject = new com.tencent.mm.media.editor.c.a();
        ((com.tencent.mm.media.editor.c.a)localObject).aJg = this.aJg;
        ((com.tencent.mm.media.editor.c.a)localObject).aJf = this.aJf;
        ((com.tencent.mm.media.editor.c.a)localObject).g(new float[] { this.lon.width() / 2.0F, this.lon.height() / 2.0F });
        ((com.tencent.mm.media.editor.c.a)localObject).b(new RectF(this.lnL.left, this.lnL.top, this.lnL.right, this.lnL.bottom));
        ((com.tencent.mm.media.editor.c.a)localObject).a(this.lkf.aKk, (a.f.a.b)new TextEditorItemView.c(this));
        break;
        if (this.bYN)
          break;
        AppMethodBeat.o(3119);
        bool2 = bool1;
      }
      Object localObject = getItemContainer();
      if (localObject != null)
        ((EditorItemContainer)localObject).a((a)this, paramMotionEvent);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(3114);
    removeCallbacks(this.loj);
    AppMethodBeat.o(3114);
  }

  public final void resume()
  {
    AppMethodBeat.i(3113);
    boc();
    AppMethodBeat.o(3113);
  }

  public final void setEditing(boolean paramBoolean)
  {
    AppMethodBeat.i(3116);
    this.lkj = paramBoolean;
    postInvalidate();
    AppMethodBeat.o(3116);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView
 * JD-Core Version:    0.6.2
 */