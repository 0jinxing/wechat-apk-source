package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMLoadMoreListView extends ListView
{
  private View kZq;
  private MMLoadMoreListView.a yvO;
  private boolean yvP;
  private TextView yvQ;
  private boolean yvR;

  public MMLoadMoreListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106688);
    this.kZq = null;
    this.yvO = null;
    this.yvP = false;
    this.yvR = false;
    init();
    AppMethodBeat.o(106688);
  }

  public MMLoadMoreListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106689);
    this.kZq = null;
    this.yvO = null;
    this.yvP = false;
    this.yvR = false;
    init();
    AppMethodBeat.o(106689);
  }

  private void ctT()
  {
    AppMethodBeat.i(106690);
    this.kZq = View.inflate(getContext(), 2130970112, null);
    this.yvQ = ((TextView)this.kZq.findViewById(2131825998));
    this.kZq.setVisibility(8);
    AppMethodBeat.o(106690);
  }

  private void init()
  {
    AppMethodBeat.i(106691);
    if (this.kZq == null)
    {
      ctT();
      addFooterView(this.kZq);
      this.kZq.setVisibility(8);
    }
    AppMethodBeat.o(106691);
  }

  public final void dzM()
  {
    AppMethodBeat.i(106692);
    if (this.kZq == null)
      ctT();
    try
    {
      removeFooterView(this.kZq);
      addFooterView(this.kZq);
      AppMethodBeat.o(106692);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(106692);
    }
  }

  public final void dzN()
  {
    AppMethodBeat.i(106693);
    this.yvP = true;
    setOnScrollListener(new MMLoadMoreListView.1(this));
    AppMethodBeat.o(106693);
  }

  public final void dzO()
  {
    AppMethodBeat.i(106696);
    if (this.kZq != null)
    {
      this.yvQ.setVisibility(8);
      this.kZq.setVisibility(8);
    }
    AppMethodBeat.o(106696);
  }

  public final void dzP()
  {
    AppMethodBeat.i(106697);
    this.yvQ.setVisibility(0);
    this.kZq.setVisibility(0);
    AppMethodBeat.o(106697);
  }

  public final void dzQ()
  {
    AppMethodBeat.i(106698);
    removeFooterView(this.kZq);
    AppMethodBeat.o(106698);
  }

  public boolean getScroll2Top()
  {
    return this.yvR;
  }

  public void setFooterTips(String paramString)
  {
    AppMethodBeat.i(106695);
    this.yvQ.setText(paramString);
    AppMethodBeat.o(106695);
  }

  public void setOnFootrClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(106694);
    this.yvQ.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(106694);
  }

  public void setOnLoadMoreListener(MMLoadMoreListView.a parama)
  {
    this.yvO = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMLoadMoreListView
 * JD-Core Version:    0.6.2
 */