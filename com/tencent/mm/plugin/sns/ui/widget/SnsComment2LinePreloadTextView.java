package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kiss.widget.textview.PLTextView;
import com.tencent.mm.kiss.widget.textview.a.a;

public class SnsComment2LinePreloadTextView extends PLTextView
{
  private static a rMO = null;
  private static int rMP = 0;
  private boolean rMQ = false;

  public SnsComment2LinePreloadTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SnsComment2LinePreloadTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static a getTextViewConfig()
  {
    AppMethodBeat.i(40471);
    if (rMO == null)
      rMO = b.cvx().getTextViewConfig();
    a locala = rMO;
    AppMethodBeat.o(40471);
    return locala;
  }

  public static int getViewWidth()
  {
    AppMethodBeat.i(40474);
    if (rMP == 0)
      rMP = b.cvx().getViewWidth();
    int i = rMP;
    AppMethodBeat.o(40474);
    return i;
  }

  public final a SQ()
  {
    AppMethodBeat.i(40470);
    if (rMO == null)
      rMO = b.cvx().getTextViewConfig();
    a locala = rMO;
    AppMethodBeat.o(40470);
    return locala;
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(40475);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(40475);
  }

  public final void v(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(40473);
    super.v(paramCharSequence);
    AppMethodBeat.o(40473);
  }

  public final void w(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(40472);
    super.w(paramCharSequence);
    AppMethodBeat.o(40472);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView
 * JD-Core Version:    0.6.2
 */