package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.v;

public class LaunchAAByPersonNameAmountRow extends LinearLayout
{
  TextView gng;
  TextView goa;
  private View goc;

  public LaunchAAByPersonNameAmountRow(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(40814);
    init(paramContext);
    AppMethodBeat.o(40814);
  }

  public LaunchAAByPersonNameAmountRow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(40815);
    init(paramContext);
    AppMethodBeat.o(40815);
  }

  public LaunchAAByPersonNameAmountRow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(40816);
    init(paramContext);
    AppMethodBeat.o(40816);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(40817);
    v.hu(paramContext).inflate(2130969919, this, true);
    this.goa = ((TextView)findViewById(2131821556));
    this.gng = ((TextView)findViewById(2131825213));
    this.goc = findViewById(2131821128);
    AppMethodBeat.o(40817);
  }

  public void setDividerVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(40818);
    View localView = this.goc;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      AppMethodBeat.o(40818);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAByPersonNameAmountRow
 * JD-Core Version:    0.6.2
 */