package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class EllipsizeTextView extends TextView
{
  private String ysq;
  private int ysr;
  private int yss;
  private EllipsizeTextView.a yst;
  private CharSequence ysu;
  private long ysv = -1L;

  public EllipsizeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public EllipsizeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(CharSequence paramCharSequence, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106264);
    this.ysq = paramString;
    this.ysr = paramInt1;
    this.yss = paramInt2;
    this.ysu = paramCharSequence;
    setText(this.ysu + "  " + paramString);
    AppMethodBeat.o(106264);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106265);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((getMeasuredWidth() > 0) && (!bo.isNullOrNil(this.ysq)) && (this.yst != null) && (getText() != null) && (getText().length() > 0))
    {
      CharSequence localCharSequence = this.yst.a(this, this.ysu, this.ysq, this.ysr, this.yss);
      this.ysq = null;
      setText(localCharSequence, TextView.BufferType.SPANNABLE);
      requestLayout();
    }
    AppMethodBeat.o(106265);
  }

  public void setLayoutCallback(EllipsizeTextView.a parama)
  {
    this.yst = parama;
  }

  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    AppMethodBeat.i(106266);
    super.setText(paramCharSequence, paramBufferType);
    AppMethodBeat.o(106266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.EllipsizeTextView
 * JD-Core Version:    0.6.2
 */