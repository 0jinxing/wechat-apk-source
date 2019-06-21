package com.tencent.mm.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.test.suitebuilder.annotation.Suppress;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class MMTextView extends TextView
{
  private long edW;
  private MMTextView.b zNj;
  private boolean zNk;
  private boolean zNl;
  private boolean zNm;
  private MMTextView.a zNn;
  private boolean zhd;
  private GestureDetector zhe;

  public MMTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107922);
    this.zhd = false;
    this.zNj = null;
    this.zhe = null;
    this.zNk = false;
    this.zNl = false;
    this.zNm = false;
    this.edW = -1L;
    this.zNn = null;
    init();
    AppMethodBeat.o(107922);
  }

  public MMTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107923);
    this.zhd = false;
    this.zNj = null;
    this.zhe = null;
    this.zNk = false;
    this.zNl = false;
    this.zNm = false;
    this.edW = -1L;
    this.zNn = null;
    init();
    AppMethodBeat.o(107923);
  }

  private void init()
  {
    AppMethodBeat.i(107924);
    this.zhe = new GestureDetector(getContext(), new MMTextView.1(this));
    AppMethodBeat.o(107924);
  }

  public void cancelLongPress()
  {
    AppMethodBeat.i(107928);
    ab.d("MicroMsg.MMTextView", "cancelLongPress , should ignore Action Up Event next time");
    this.zhd = true;
    super.cancelLongPress();
    AppMethodBeat.o(107928);
  }

  public int getBaseline()
  {
    AppMethodBeat.i(107933);
    try
    {
      i = super.getBaseline();
      AppMethodBeat.o(107933);
      return i;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMTextView", localThrowable, "", new Object[0]);
        int i = -1;
        AppMethodBeat.o(107933);
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107931);
    try
    {
      super.onDraw(paramCanvas);
      AppMethodBeat.o(107931);
      return;
    }
    catch (Throwable paramCanvas)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMTextView", paramCanvas, "", new Object[0]);
        AppMethodBeat.o(107931);
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107930);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(107930);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMTextView", localThrowable, "", new Object[0]);
        AppMethodBeat.o(107930);
      }
    }
  }

  public boolean onPreDraw()
  {
    AppMethodBeat.i(107932);
    try
    {
      bool = super.onPreDraw();
      AppMethodBeat.o(107932);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = true;
        AppMethodBeat.o(107932);
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(107925);
    int i = paramMotionEvent.getAction();
    if ((i == 1) && (this.zhd));
    for (int j = 1; j != 0; j = 0)
    {
      ab.d("MicroMsg.MMTextView", "ignore Action Up Event this time");
      AppMethodBeat.o(107925);
      return bool1;
    }
    if (i == 0)
      this.zhd = false;
    if ((this.zNj != null) && (this.zhe != null));
    for (boolean bool2 = this.zhe.onTouchEvent(paramMotionEvent); ; bool2 = false)
    {
      bool1 = bool2;
      if (!bool2)
        bool1 = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(107925);
      break;
    }
  }

  public boolean performLongClick()
  {
    AppMethodBeat.i(107929);
    ab.d("MicroMsg.MMTextView", "performLongClick , should ignore Action Up Event next time");
    this.zhd = true;
    boolean bool = super.performLongClick();
    AppMethodBeat.o(107929);
    return bool;
  }

  public void setIsFromChatting(boolean paramBoolean)
  {
    if (!this.zNk)
      this.zNk = paramBoolean;
  }

  public void setMMTextViewCallBack(MMTextView.a parama)
  {
    if ((!this.zNm) && (parama != null))
    {
      this.zNn = parama;
      this.zNm = true;
    }
  }

  public void setMsgId(long paramLong)
  {
    this.edW = paramLong;
  }

  public void setOnDoubleClickLitsener(MMTextView.b paramb)
  {
    this.zNj = paramb;
  }

  @Suppress
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    AppMethodBeat.i(107927);
    super.setText(paramCharSequence, paramBufferType);
    if ((this.zNn != null) && (this.zNk) && ((paramCharSequence instanceof Spannable)) && (((Spannable)paramCharSequence).getSpans(0, paramCharSequence.length(), Object.class) != null))
      this.zNn.a(paramCharSequence, this.edW);
    this.zNl = false;
    AppMethodBeat.o(107927);
  }

  public void setTextInternal(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(107926);
    this.zNl = true;
    setText(paramCharSequence);
    AppMethodBeat.o(107926);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMTextView
 * JD-Core Version:    0.6.2
 */