package com.tencent.mm.ui.widget.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cg.a.a;
import com.tencent.mm.ui.aj;

public class MMAutoAdjustTextView extends TextView
{
  private float eOg;
  private float scale;
  private Paint vQ;

  public MMAutoAdjustTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(113111);
    b(paramContext.obtainStyledAttributes(paramAttributeSet, a.a.MMAutoAdjustTextView));
    init();
    AppMethodBeat.o(113111);
  }

  public MMAutoAdjustTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(113112);
    b(paramContext.obtainStyledAttributes(paramAttributeSet, a.a.MMAutoAdjustTextView));
    init();
    AppMethodBeat.o(113112);
  }

  private void Qx(int paramInt)
  {
    AppMethodBeat.i(113115);
    if (paramInt <= 0)
      AppMethodBeat.o(113115);
    while (true)
    {
      return;
      while (true)
      {
        measure(0, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        if (getMeasuredWidth() <= paramInt)
          break;
        this.eOg -= aj.getDensity(getContext());
        setTextSize(0, this.eOg * this.scale);
      }
      AppMethodBeat.o(113115);
    }
  }

  private static void b(TypedArray paramTypedArray)
  {
    AppMethodBeat.i(113114);
    if (paramTypedArray != null)
      paramTypedArray.recycle();
    AppMethodBeat.o(113114);
  }

  private void init()
  {
    AppMethodBeat.i(113113);
    this.eOg = getTextSize();
    this.scale = aj.dm(getContext());
    this.vQ = new Paint();
    this.vQ.set(getPaint());
    AppMethodBeat.o(113113);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(113117);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      getText().toString();
      Qx(paramInt1);
    }
    AppMethodBeat.o(113117);
  }

  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(113116);
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    paramCharSequence.toString();
    Qx(getWidth());
    AppMethodBeat.o(113116);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.MMAutoAdjustTextView
 * JD-Core Version:    0.6.2
 */