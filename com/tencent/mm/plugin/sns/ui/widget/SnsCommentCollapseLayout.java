package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public class SnsCommentCollapseLayout extends RelativeLayout
{
  private SnsComment2LinePreloadTextView rMS;
  private SnsCommentPreloadTextView rMT;
  private TextView rMU;
  private CharSequence rMV;
  private int rMW;

  public SnsCommentCollapseLayout(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(40481);
    this.rMS = null;
    this.rMT = null;
    this.rMU = null;
    this.rMV = null;
    this.rMW = 0;
    init();
    AppMethodBeat.o(40481);
  }

  public SnsCommentCollapseLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(40482);
    this.rMS = null;
    this.rMT = null;
    this.rMU = null;
    this.rMV = null;
    this.rMW = 0;
    init();
    AppMethodBeat.o(40482);
  }

  public SnsCommentCollapseLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(40483);
    this.rMS = null;
    this.rMT = null;
    this.rMU = null;
    this.rMV = null;
    this.rMW = 0;
    init();
    AppMethodBeat.o(40483);
  }

  private void init()
  {
    AppMethodBeat.i(40484);
    LayoutInflater.from(getContext()).inflate(2130970751, this, true);
    this.rMS = ((SnsComment2LinePreloadTextView)findViewById(2131827700));
    this.rMT = ((SnsCommentPreloadTextView)findViewById(2131827701));
    this.rMU = ((TextView)findViewById(2131827702));
    this.rMW = a.fromDPToPix(getContext(), 22);
    setOnTouchListener(new SnsCommentCollapseLayout.1(this));
    AppMethodBeat.o(40484);
  }

  public final void k(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(40491);
    post(new SnsCommentCollapseLayout.2(this, paramCharSequence, paramInt));
    AppMethodBeat.o(40491);
  }

  public void setGravity(int paramInt)
  {
    AppMethodBeat.i(40490);
    this.rMS.setGravity(paramInt);
    this.rMT.setGravity(paramInt);
    AppMethodBeat.o(40490);
  }

  public void setOpClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(40485);
    this.rMU.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(40485);
  }

  public void setPressTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    AppMethodBeat.i(40486);
    this.rMS.setOnTouchListener(paramOnTouchListener);
    this.rMT.setOnTouchListener(paramOnTouchListener);
    AppMethodBeat.o(40486);
  }

  public void setTextColor(int paramInt)
  {
    AppMethodBeat.i(40489);
    this.rMS.setTextColor(paramInt);
    this.rMT.setTextColor(paramInt);
    AppMethodBeat.o(40489);
  }

  public void setTextSize(float paramFloat)
  {
    AppMethodBeat.i(40487);
    this.rMS.setTextSize(paramFloat);
    this.rMT.setTextSize(paramFloat);
    AppMethodBeat.o(40487);
  }

  public final void setTextSize$255e752(float paramFloat)
  {
    AppMethodBeat.i(40488);
    this.rMS.setTextSize$255e752(paramFloat);
    this.rMT.setTextSize$255e752(paramFloat);
    this.rMU.setTextSize(1, paramFloat);
    AppMethodBeat.o(40488);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout
 * JD-Core Version:    0.6.2
 */