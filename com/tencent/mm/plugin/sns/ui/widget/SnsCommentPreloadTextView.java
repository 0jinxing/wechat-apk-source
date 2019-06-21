package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kiss.widget.textview.PLTextView;
import com.tencent.mm.kiss.widget.textview.a.a;

public class SnsCommentPreloadTextView extends PLTextView
{
  private static a rMO = null;
  private static int rMP = 0;
  private boolean rMQ = false;

  public SnsCommentPreloadTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SnsCommentPreloadTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static a getTextViewConfig()
  {
    AppMethodBeat.i(40495);
    if (rMO == null)
      rMO = c.cvy().getTextViewConfig();
    a locala = rMO;
    AppMethodBeat.o(40495);
    return locala;
  }

  public static int getViewWidth()
  {
    AppMethodBeat.i(40498);
    if (rMP == 0)
      rMP = c.cvy().getViewWidth();
    int i = rMP;
    AppMethodBeat.o(40498);
    return i;
  }

  public final a SQ()
  {
    AppMethodBeat.i(40494);
    if (rMO == null)
      rMO = c.cvy().getTextViewConfig();
    a locala = rMO;
    AppMethodBeat.o(40494);
    return locala;
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(40499);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(40499);
  }

  public final void v(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(40497);
    super.v(paramCharSequence);
    AppMethodBeat.o(40497);
  }

  public final void w(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(40496);
    super.w(paramCharSequence);
    AppMethodBeat.o(40496);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView
 * JD-Core Version:    0.6.2
 */