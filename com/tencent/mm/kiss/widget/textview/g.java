package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kiss.widget.textview.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

public final class g
{
  protected f eNQ;
  public a eNR;
  protected StaticLayout eNS;
  protected boolean eNT = false;
  int eNU;
  int eNV;
  private boolean eNW = false;
  boolean eNX = false;
  boolean eNY = false;
  private boolean eNZ = false;
  private View eOa;
  private int eOb = 0;
  private int eOc = 0;
  protected CharSequence text = null;

  public g(View paramView, a parama)
  {
    this.eOa = paramView;
    this.eNR = parama;
  }

  private boolean jT(int paramInt)
  {
    AppMethodBeat.i(105775);
    boolean bool;
    if ((this.eNT) || (this.eNQ == null) || (this.eNS == null))
      if (this.eNR == null)
      {
        AppMethodBeat.o(105775);
        bool = false;
      }
    while (true)
    {
      return bool;
      if (paramInt > 0)
      {
        SR();
        long l1 = 0L;
        if (h.DEBUG)
          l1 = System.nanoTime();
        this.eNQ = d.a(this.text, paramInt, this.eNR).SO();
        this.eNS = this.eNQ.eNO;
        this.eNT = false;
        if (h.DEBUG)
        {
          long l2 = System.nanoTime();
          ab.d("MicroMsg.StaticTextViewHolder", "recreateLayoutIfNeed, width: %d, hasCode: %d, used: %fms, text: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(hashCode()), Double.valueOf((l2 - l1) / 1000000.0D), this.text });
        }
        AppMethodBeat.o(105775);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(105775);
        bool = false;
      }
    }
  }

  private void setRawTextSize(float paramFloat)
  {
    AppMethodBeat.i(105760);
    if ((paramFloat != 0.0F) && (this.eNR != null) && (paramFloat != this.eNR.eOg))
    {
      this.eNR.eOg = paramFloat;
      this.eNT = true;
      if (h.DEBUG)
        ab.i("MicroMsg.StaticTextViewHolder", "setRawTextSize isNeedRecreateLayout");
    }
    AppMethodBeat.o(105760);
  }

  final void SR()
  {
    this.eOc = 0;
    this.eOb = 0;
    this.eNU = 0;
    this.eNV = 0;
  }

  public final Point ce(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105776);
    long l = 0L;
    if (h.DEBUG)
      l = System.nanoTime();
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    jT(k);
    if (this.eNS != null)
      if (i == 1073741824)
        paramInt1 = k;
    while (true)
    {
      if (j == 1073741824)
        k = m;
      Object localObject1;
      Object localObject2;
      while (true)
      {
        localObject1 = new Point(paramInt1, k);
        if (h.DEBUG)
        {
          double d = (System.nanoTime() - l) / 1000000.0D;
          paramInt1 = hashCode();
          CharSequence localCharSequence = this.text;
          if (localObject1 != null)
            break label595;
          localObject2 = "";
          label126: ab.d("MicroMsg.StaticTextViewHolder", "onMeasure used: %fms, hashCode: %d, text: %s result: %s", new Object[] { Double.valueOf(d), Integer.valueOf(paramInt1), localCharSequence, localObject2 });
        }
        AppMethodBeat.o(105776);
        return localObject1;
        paramInt1 = 0;
        if (this.eNR.eND == null)
        {
          localObject1 = this.eNS;
          if (this.eOb == 0)
            break label294;
          paramInt1 = this.eOb;
        }
        while (true)
        {
          n = (int)Math.ceil(Layout.getDesiredWidth(this.eNS.getText(), this.eNS.getPaint()));
          paramInt2 = paramInt1;
          if (n > paramInt1)
            paramInt2 = n;
          if (h.DEBUG)
            ab.d("MicroMsg.StaticTextViewHolder", "onMeasure  hashCode: %d, des: %d newdes: %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt2), Integer.valueOf(n) });
          if (i != -2147483648)
            break label611;
          paramInt1 = Math.min(k, paramInt2);
          break;
          label294: paramInt2 = ((Layout)localObject1).getLineCount();
          localObject2 = ((Layout)localObject1).getText();
          float f = 0.0F;
          for (paramInt1 = 0; ; paramInt1++)
          {
            if (paramInt1 >= paramInt2 - 1)
              break label350;
            if (((CharSequence)localObject2).charAt(((Layout)localObject1).getLineEnd(paramInt1) - 1) != '\n')
            {
              paramInt1 = -1;
              break;
            }
          }
          label350: for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
            f = Math.max(f, ((Layout)localObject1).getLineWidth(paramInt1));
          this.eOb = ((int)Math.ceil(f));
          this.eOb += this.eOa.getPaddingLeft() + this.eOa.getPaddingRight();
          paramInt1 = this.eOb;
        }
        localObject1 = this.eNS;
        if (this.eOc == 0)
          break label458;
        paramInt2 = this.eOc;
        label437: k = paramInt2;
        if (j == -2147483648)
          k = Math.min(paramInt2, m);
      }
      label458: k = ((Layout)localObject1).getLineCount();
      paramInt2 = k;
      if (this.eNQ.maxLines > 0)
      {
        paramInt2 = k;
        if (this.eNQ.maxLines < k)
          paramInt2 = this.eNQ.maxLines;
      }
      int n = this.eOa.getPaddingTop();
      i = this.eOa.getPaddingBottom();
      k = ((Layout)localObject1).getLineTop(paramInt2);
      int i1;
      if ((this.eNR.minLines > 0) && (paramInt2 < this.eNR.minLines))
        i1 = getLineHeight();
      for (paramInt2 = (this.eNR.minLines - paramInt2) * i1 + k; ; paramInt2 = k)
      {
        this.eOc = (paramInt2 + (n + i));
        paramInt2 = this.eOc;
        break label437;
        localObject1 = null;
        break;
        label595: localObject2 = ((Point)localObject1).toString();
        break label126;
      }
      label611: paramInt1 = paramInt2;
    }
  }

  public final f getLayoutWrapper()
  {
    return this.eNQ;
  }

  public final int getLineCount()
  {
    AppMethodBeat.i(105770);
    int i;
    if (this.eNS == null)
    {
      i = 0;
      AppMethodBeat.o(105770);
    }
    while (true)
    {
      return i;
      i = this.eNS.getLineCount();
      AppMethodBeat.o(105770);
    }
  }

  public final int getLineHeight()
  {
    AppMethodBeat.i(105766);
    TextPaint localTextPaint1 = this.eNQ.eNO.getPaint();
    TextPaint localTextPaint2 = localTextPaint1;
    if (localTextPaint1 == null)
      localTextPaint2 = this.eNR.eNN;
    int i = Math.round(localTextPaint2.getFontMetricsInt(null) * this.eNR.eNH + this.eNR.eNG);
    AppMethodBeat.o(105766);
    return i;
  }

  public final int getMaxLines()
  {
    if (this.eNR != null);
    for (int i = this.eNR.maxLines; ; i = -1)
      return i;
  }

  public final int getSelectionEnd()
  {
    AppMethodBeat.i(105772);
    int i;
    if (this.text == null)
    {
      i = -1;
      AppMethodBeat.o(105772);
    }
    while (true)
    {
      return i;
      i = Selection.getSelectionEnd(this.text);
      AppMethodBeat.o(105772);
    }
  }

  public final int getSelectionStart()
  {
    AppMethodBeat.i(105771);
    int i;
    if (this.text == null)
    {
      i = -1;
      AppMethodBeat.o(105771);
    }
    while (true)
    {
      return i;
      i = Selection.getSelectionStart(this.text);
      AppMethodBeat.o(105771);
    }
  }

  public final CharSequence getText()
  {
    return this.text;
  }

  public final int getTextColor()
  {
    AppMethodBeat.i(105769);
    int i;
    if (this.eNQ == null)
      if (this.eNR != null)
      {
        i = this.eNR.textColor;
        AppMethodBeat.o(105769);
      }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(105769);
      continue;
      i = this.eNQ.eNN.getColor();
      AppMethodBeat.o(105769);
    }
  }

  public final float getTextSize()
  {
    AppMethodBeat.i(105768);
    float f;
    if (this.eNQ == null)
      if (this.eNR != null)
      {
        f = this.eNR.eOg;
        AppMethodBeat.o(105768);
      }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(105768);
      continue;
      f = this.eNQ.eNN.getTextSize();
      AppMethodBeat.o(105768);
    }
  }

  public final Layout getTvLayout()
  {
    return this.eNS;
  }

  public final void init()
  {
    AppMethodBeat.i(105756);
    this.text = "";
    this.eOa.setWillNotDraw(false);
    AppMethodBeat.o(105756);
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(105774);
    if ((this.eNS == null) || (this.eNQ == null))
    {
      boolean bool = jT(this.eOa.getMeasuredWidth());
      if (h.DEBUG)
        ab.d("MicroMsg.StaticTextViewHolder", "onDraw, textLayout==null:%b, layoutWrapper==null:%b recreate:%b", new Object[] { this.eNS, this.eNQ, Boolean.valueOf(bool) });
      if (bool)
      {
        this.eOa.requestLayout();
        this.eOa.invalidate();
      }
      AppMethodBeat.o(105774);
    }
    int n;
    int i1;
    int i2;
    int i3;
    while (true)
    {
      return;
      long l = 0L;
      if (h.DEBUG)
        l = System.nanoTime();
      paramCanvas.save();
      int i = this.eOa.getPaddingLeft();
      int j = this.eOa.getPaddingTop();
      int k = this.eOa.getRight() - this.eOa.getLeft() - this.eOa.getPaddingRight();
      int m = this.eOa.getBottom() - this.eOa.getTop() - this.eOa.getPaddingBottom();
      paramCanvas.clipRect(i, j, k, m);
      if ((this.eNU == 0) || (this.eNV == 0))
      {
        n = this.eOa.getPaddingLeft();
        i1 = this.eOa.getRight() - this.eOa.getLeft() - this.eOa.getPaddingLeft() - this.eOa.getPaddingRight();
        i2 = this.eNS.getWidth();
        if (i2 <= i1)
          break;
        i2 = n;
        this.eNU = i2;
        n = this.eOa.getPaddingTop();
        i1 = this.eOa.getBottom() - this.eOa.getTop() - this.eOa.getPaddingTop() - this.eOa.getPaddingBottom();
        i2 = 0;
        i3 = this.eNS.getHeight();
        if (i3 <= i1)
          break label583;
        i2 = n;
        this.eNV = i2;
      }
      paramCanvas.translate(this.eNU, this.eNV);
      this.eNS.draw(paramCanvas, null, null, 0);
      paramCanvas.restore();
      if (h.DEBUG)
        ab.d("MicroMsg.StaticTextViewHolder", "onDraw used: %fms, hashCode: %d, text: %s clipLeft:%d clipTop:%d clipRight:%d clipBottom:%d", new Object[] { Double.valueOf((System.nanoTime() - l) / 1000000.0D), Integer.valueOf(hashCode()), this.text, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
      AppMethodBeat.o(105774);
    }
    switch (this.eNQ.gravity & 0x800007)
    {
    default:
      i2 = 0;
    case 3:
    case 8388611:
    case 1:
    case 17:
    case 5:
    case 8388613:
    }
    while (true)
    {
      i2 += n;
      break;
      i2 = 0;
      continue;
      i2 = i1 / 2 - i2 / 2;
      continue;
      i2 = i1 - i2;
    }
    label583: switch (this.eNQ.gravity & 0x70)
    {
    default:
    case 48:
    case 16:
    case 80:
    }
    while (true)
    {
      i2 += n;
      break;
      i2 = 0;
      continue;
      i2 = i1 / 2 - i3 / 2;
      continue;
      i2 = i1 - i3;
    }
  }

  public final boolean performClick()
  {
    if ((this.eNZ) || (!this.eNX));
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final void setGravity(int paramInt)
  {
    AppMethodBeat.i(105763);
    if ((this.eNR != null) && (paramInt != this.eNR.gravity))
    {
      this.eNR.gravity = paramInt;
      this.eNT = true;
      if (h.DEBUG)
        ab.i("MicroMsg.StaticTextViewHolder", "setGravity isNeedRecreateLayout");
    }
    AppMethodBeat.o(105763);
  }

  public final void setLines(int paramInt)
  {
    AppMethodBeat.i(105758);
    if ((this.eNR.maxLines != paramInt) || (this.eNR.minLines != paramInt))
    {
      this.eNT = true;
      SR();
      this.eNR.maxLines = paramInt;
      this.eNR.minLines = paramInt;
      this.eOa.requestLayout();
      this.eOa.invalidate();
      if (h.DEBUG)
        ab.i("MicroMsg.StaticTextViewHolder", "setLines isNeedRecreateLayout");
    }
    AppMethodBeat.o(105758);
  }

  public final void setMaxLines(int paramInt)
  {
    AppMethodBeat.i(105764);
    if ((this.eNR != null) && (paramInt != this.eNR.maxLines))
    {
      this.eNR.maxLines = paramInt;
      this.eNT = true;
      SR();
      if (h.DEBUG)
        ab.i("MicroMsg.StaticTextViewHolder", "setMaxLines isNeedRecreateLayout");
      this.eOa.requestLayout();
      this.eOa.invalidate();
    }
    AppMethodBeat.o(105764);
  }

  public final void setMinLines(int paramInt)
  {
    AppMethodBeat.i(105765);
    if (this.eNR.minLines != paramInt)
    {
      this.eNR.minLines = paramInt;
      SR();
      this.eOa.requestLayout();
      this.eOa.invalidate();
    }
    AppMethodBeat.o(105765);
  }

  public final void setSingleLine(boolean paramBoolean)
  {
    AppMethodBeat.i(105757);
    if (paramBoolean);
    for (int i = 1; ; i = 2147483647)
    {
      if (this.eNR.maxLines != i)
      {
        this.eNR.maxLines = i;
        this.eNT = true;
        SR();
        this.eOa.requestLayout();
        this.eOa.invalidate();
      }
      AppMethodBeat.o(105757);
      return;
    }
  }

  public final void setText(CharSequence paramCharSequence, boolean paramBoolean)
  {
    AppMethodBeat.i(105767);
    if (paramCharSequence == null)
      AppMethodBeat.o(105767);
    while (true)
    {
      return;
      if ((this.text == null) || (!this.text.equals(paramCharSequence)) || (paramBoolean))
      {
        this.text = paramCharSequence;
        this.eNT = true;
        this.eOa.requestLayout();
        this.eOa.invalidate();
        if (h.DEBUG)
          ab.i("MicroMsg.StaticTextViewHolder", "setText isNeedRecreateLayout " + paramCharSequence + " hashcode " + hashCode() + " " + bo.dpG().toString());
      }
      AppMethodBeat.o(105767);
    }
  }

  public final void setTextColor(int paramInt)
  {
    AppMethodBeat.i(105762);
    if ((this.eNR != null) && (paramInt != this.eNR.textColor))
    {
      this.eNR.textColor = paramInt;
      this.eNT = true;
      if (h.DEBUG)
        ab.i("MicroMsg.StaticTextViewHolder", "setTextColor isNeedRecreateLayout");
    }
    AppMethodBeat.o(105762);
  }

  public final void setTextLayout(f paramf)
  {
    AppMethodBeat.i(105761);
    if ((paramf == null) || (paramf.eNO == null))
    {
      this.eNQ = null;
      AppMethodBeat.o(105761);
    }
    while (true)
    {
      return;
      if (this.eNR == null)
      {
        com.tencent.mm.kiss.widget.textview.a.b localb = new com.tencent.mm.kiss.widget.textview.a.b();
        localb.eNR = new a();
        localb.eNR.maxLines = paramf.maxLines;
        localb.eNR.maxLength = paramf.maxLength;
        localb.eNR.eNN = paramf.eNN;
        localb.eNR.eNC = paramf.eNC;
        localb.eNR.eND = paramf.eND;
        localb.eNR.gravity = paramf.gravity;
        localb.eNR.eOg = paramf.eNN.getTextSize();
        localb.eNR.textColor = paramf.eNN.getColor();
        this.eNR = localb.eNR;
      }
      SR();
      this.eOa.setWillNotDraw(false);
      this.eNQ = paramf;
      this.eNS = paramf.eNO;
      this.text = paramf.text;
      this.eNW = (this.text instanceof Spannable);
      if (this.eNW)
      {
        this.text = this.eNQ.text;
        com.tencent.mm.kiss.widget.textview.b.b.SV();
        com.tencent.mm.kiss.widget.textview.b.b.a((Spannable)this.text);
      }
      this.eOa.requestLayout();
      this.eOa.invalidate();
      AppMethodBeat.o(105761);
    }
  }

  public final void setTextSize(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(105759);
    Object localObject = ah.getContext();
    if (localObject == null);
    for (localObject = Resources.getSystem(); ; localObject = ((Context)localObject).getResources())
    {
      setRawTextSize(TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics()));
      AppMethodBeat.o(105759);
      return;
    }
  }

  public final boolean t(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(105773);
    int i;
    boolean bool2;
    float f2;
    if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
    {
      i = 1;
      bool2 = bool1;
      if (this.eOa.isEnabled())
      {
        bool2 = bool1;
        if (this.eNW)
        {
          com.tencent.mm.kiss.widget.textview.b.b.SV();
          bool2 = com.tencent.mm.kiss.widget.textview.b.b.a(this.eOa, this.eNS, (Spannable)this.text, paramMotionEvent);
          this.eNZ = bool2;
          if ((!this.eNY) || (i == 0))
            break label246;
          float f1 = paramMotionEvent.getX();
          f2 = paramMotionEvent.getY();
          if ((f1 >= this.eNU) && (f1 <= this.eNS.getWidth() + this.eNU))
            break label206;
          i = 0;
          label135: if (i == 0)
            break label246;
          paramMotionEvent = (ClickableSpan[])((Spannable)this.text).getSpans(getSelectionStart(), getSelectionEnd(), ClickableSpan.class);
          if (paramMotionEvent.length <= 0)
            break label246;
          ab.d("MicroMsg.StaticTextViewHolder", "perform clickable span click");
          paramMotionEvent[0].onClick(this.eOa);
          bool2 = true;
        }
      }
    }
    label206: label246: 
    while (true)
    {
      AppMethodBeat.o(105773);
      return bool2;
      i = 0;
      break;
      if ((f2 < this.eNV) || (f2 > this.eNS.getHeight() + this.eNV))
      {
        i = 0;
        break label135;
      }
      i = 1;
      break label135;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.widget.textview.g
 * JD-Core Version:    0.6.2
 */