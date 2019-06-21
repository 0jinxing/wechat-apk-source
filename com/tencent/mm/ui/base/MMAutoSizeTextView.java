package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;

public class MMAutoSizeTextView extends TextView
{
  private float noa;
  private Paint vQ;
  private float ytH;
  private float ytI;

  public MMAutoSizeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106485);
    init();
    AppMethodBeat.o(106485);
  }

  public MMAutoSizeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106484);
    init();
    AppMethodBeat.o(106484);
  }

  private void dzD()
  {
    AppMethodBeat.i(106488);
    this.noa = getTextSize();
    if (this.noa <= this.ytH)
      this.noa = this.ytI;
    AppMethodBeat.o(106488);
  }

  private void ex(String paramString, int paramInt)
  {
    AppMethodBeat.i(106487);
    ab.i("MicroMsg.MMAutoSizeTextView", "autoAdjustTextSize[text=%s, viewWidth=%d]", new Object[] { paramString, Integer.valueOf(paramInt) });
    if (paramInt <= 0)
    {
      AppMethodBeat.o(106487);
      return;
    }
    paramInt = paramInt - getPaddingLeft() - getPaddingRight();
    dzD();
    float f1 = this.noa;
    this.vQ.setTextSize(f1);
    while (true)
    {
      float f2 = f1;
      if (f1 > this.ytH)
      {
        f2 = f1;
        if (this.vQ.measureText(paramString) > paramInt)
        {
          f1 -= 1.0F;
          if (f1 > this.ytH)
            break label179;
          f2 = this.ytH;
        }
      }
      ab.i("MicroMsg.MMAutoSizeTextView", "try size[%f], maxSize[%f], measureTextSize[%f], availableWidth[%d]", new Object[] { Float.valueOf(f2), Float.valueOf(this.noa), Float.valueOf(this.vQ.measureText(paramString)), Integer.valueOf(paramInt) });
      setTextSize(0, f2);
      AppMethodBeat.o(106487);
      break;
      label179: this.vQ.setTextSize(f1);
    }
  }

  private void init()
  {
    AppMethodBeat.i(106486);
    setSingleLine();
    setEllipsize(TextUtils.TruncateAt.END);
    this.ytH = a.fromDPToPix(getContext(), 8);
    this.ytI = a.fromDPToPix(getContext(), 22);
    this.vQ = new Paint();
    this.vQ.set(getPaint());
    dzD();
    AppMethodBeat.o(106486);
  }

  public int getBaseline()
  {
    AppMethodBeat.i(106493);
    try
    {
      i = super.getBaseline();
      AppMethodBeat.o(106493);
      return i;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMAutoSizeTextView", localThrowable, "", new Object[0]);
        int i = -1;
        AppMethodBeat.o(106493);
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(106492);
    try
    {
      super.onDraw(paramCanvas);
      AppMethodBeat.o(106492);
      return;
    }
    catch (Throwable paramCanvas)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMAutoSizeTextView", paramCanvas, "", new Object[0]);
        AppMethodBeat.o(106492);
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106491);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(106491);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMAutoSizeTextView", localThrowable, "", new Object[0]);
        AppMethodBeat.o(106491);
      }
    }
  }

  public boolean onPreDraw()
  {
    AppMethodBeat.i(106494);
    try
    {
      bool = super.onPreDraw();
      AppMethodBeat.o(106494);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = true;
        AppMethodBeat.o(106494);
      }
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106490);
    ab.w("MicroMsg.MMAutoSizeTextView", "on size changed");
    if (paramInt1 != paramInt3)
      ex(getText().toString(), paramInt1);
    AppMethodBeat.o(106490);
  }

  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(106489);
    ab.w("MicroMsg.MMAutoSizeTextView", "on text changed");
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    ex(paramCharSequence.toString(), getWidth());
    AppMethodBeat.o(106489);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoSizeTextView
 * JD-Core Version:    0.6.2
 */