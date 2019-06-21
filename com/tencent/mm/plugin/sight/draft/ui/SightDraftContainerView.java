package com.tencent.mm.plugin.sight.draft.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.j;

public class SightDraftContainerView extends ListView
{
  private boolean qzQ;
  private a qzR;
  b qzS;

  public SightDraftContainerView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(25018);
    init();
    AppMethodBeat.o(25018);
  }

  public SightDraftContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(25017);
    init();
    AppMethodBeat.o(25017);
  }

  public SightDraftContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(25016);
    init();
    AppMethodBeat.o(25016);
  }

  private void init()
  {
    AppMethodBeat.i(25019);
    setBackgroundColor(getResources().getColor(2131689761));
    setSelector(2131690597);
    int i = getResources().getDimensionPixelSize(2131427858);
    int j = getResources().getDimensionPixelSize(2131427776);
    TextView localTextView = new TextView(getContext());
    localTextView.setText(2131303543);
    localTextView.setTextSize(0, com.tencent.mm.bz.a.al(getContext(), 2131427762));
    localTextView.setGravity(17);
    localTextView.setTextColor(getResources().getColor(2131690165));
    localTextView.setTextSize(1, 11.0F);
    localTextView.setPadding(0, i, 0, j);
    addFooterView(localTextView);
    setOnTouchListener(new SightDraftContainerView.1(this));
    AppMethodBeat.o(25019);
  }

  public final void clx()
  {
    AppMethodBeat.i(25020);
    if (this.qzQ)
    {
      this.qzS.qzC = 12;
      this.qzS.a(b.d.qzI, false);
      this.qzS.a(null, null);
      setSelection(0);
      AppMethodBeat.o(25020);
    }
    while (true)
    {
      return;
      this.qzQ = true;
      this.qzS = new b(getContext(), this.qzR);
      this.qzS.qzC = 12;
      setAdapter(this.qzS);
      AppMethodBeat.o(25020);
    }
  }

  public j getLastDrafInfo()
  {
    Object localObject = this.qzS;
    if (((b)localObject).qzG == null);
    for (localObject = null; ; localObject = ((b)localObject).qzG.qzO)
      return localObject;
  }

  public void setSightDraftCallback(a parama)
  {
    this.qzR = parama;
    if (this.qzS != null)
      this.qzS.qzA = parama;
  }

  public void setTipsResId(int paramInt)
  {
    if (this.qzS == null);
    while (true)
    {
      return;
      this.qzS.qzB = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.SightDraftContainerView
 * JD-Core Version:    0.6.2
 */