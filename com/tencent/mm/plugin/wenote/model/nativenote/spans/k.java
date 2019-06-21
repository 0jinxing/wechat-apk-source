package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.ref.WeakReference;

public class k
  implements LeadingMarginSpan, f<Boolean>, g<Boolean>
{
  private int uRU;
  public boolean uRV;
  public boolean uRY;
  public boolean uRZ;
  public boolean uSa;
  public boolean uSb;
  private WeakReference<Drawable> uSc;

  public k(boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    AppMethodBeat.i(26947);
    this.uRY = false;
    this.uRZ = false;
    this.uSa = false;
    this.uSb = false;
    this.uRU = paramInt;
    boolean bool2 = bool1;
    if (paramBoolean2)
    {
      bool2 = bool1;
      if (paramBoolean4)
      {
        bool2 = bool1;
        if (!paramBoolean3)
          bool2 = true;
      }
    }
    this.uRV = bool2;
    this.uSb = paramBoolean1;
    this.uRY = paramBoolean3;
    this.uRZ = paramBoolean4;
    this.uSa = paramBoolean2;
    AppMethodBeat.o(26947);
  }

  private k dfE()
  {
    AppMethodBeat.i(26949);
    k localk = new k(this.uSb, this.uRU, this.uSa, this.uRY, this.uRZ);
    AppMethodBeat.o(26949);
    return localk;
  }

  public final void a(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent, k paramk)
  {
    AppMethodBeat.i(26950);
    if (paramMotionEvent.getX() > this.uRU)
    {
      ab.e("MicroMsg.NoteTodoSpan", "x > mGapWidth");
      AppMethodBeat.o(26950);
      return;
    }
    int i = paramSpannable.getSpanStart(paramk);
    int j = paramSpannable.getSpanEnd(paramk);
    if (this.uSb)
    {
      paramMotionEvent = "true";
      label63: ab.i("MicroMsg.NoteTodoSpan", "current mIsTodoCheck: %s", new Object[] { paramMotionEvent });
      paramSpannable.removeSpan(this);
      if (this.uSb)
        break label178;
    }
    label178: for (boolean bool = true; ; bool = false)
    {
      this.uSb = bool;
      paramSpannable.setSpan(dfE(), i, j, 33);
      paramTextView = (WXRTEditText)paramTextView;
      if (paramTextView.getEditTextType() == 0)
      {
        paramTextView = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(paramTextView.getRecyclerItemPosition());
        if ((paramTextView != null) && (paramTextView.getType() == 1))
          ((i)paramTextView).content = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(paramSpannable);
      }
      AppMethodBeat.o(26950);
      break;
      paramMotionEvent = "false";
      break label63;
    }
  }

  public void drawLeadingMargin(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, boolean paramBoolean, Layout paramLayout)
  {
    AppMethodBeat.i(26948);
    paramCharSequence = (Spanned)paramCharSequence;
    if ((!this.uRV) && (paramCharSequence.getSpanStart(this) == paramInt6))
    {
      paramLayout = this.uSc;
      paramCharSequence = null;
      if (paramLayout != null)
        paramCharSequence = (Drawable)paramLayout.get();
      paramLayout = paramCharSequence;
      if (paramCharSequence == null)
      {
        if (this.uSb)
        {
          paramCharSequence = android.support.v4.content.b.g(ah.getContext(), 2130839719);
          this.uSc = new WeakReference(paramCharSequence);
          paramLayout = paramCharSequence;
        }
      }
      else
      {
        if (paramLayout != null)
          break label125;
        AppMethodBeat.o(26948);
      }
    }
    while (true)
    {
      return;
      paramCharSequence = android.support.v4.content.b.g(ah.getContext(), 2130839720);
      break;
      label125: paramLayout.setBounds(0, 0, paramLayout.getIntrinsicWidth(), paramLayout.getIntrinsicHeight());
      paramCanvas.save();
      paramPaint = paramPaint.getFontMetricsInt();
      paramInt1 = paramPaint.descent;
      paramCanvas.translate(0.0F, (paramPaint.ascent + (paramInt1 + paramInt4 + paramInt4)) / 2 - paramLayout.getBounds().bottom / 2);
      paramLayout.draw(paramCanvas);
      paramCanvas.restore();
      AppMethodBeat.o(26948);
    }
  }

  public int getLeadingMargin(boolean paramBoolean)
  {
    if (this.uRV);
    for (int i = 0; ; i = this.uRU)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.k
 * JD-Core Version:    0.6.2
 */