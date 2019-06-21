package com.tencent.mm.plugin.remittance.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class F2fDynamicCodeItemLayout extends LinearLayout
{
  TextView kRK;
  TextView pQF;

  public F2fDynamicCodeItemLayout(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(44804);
    init();
    AppMethodBeat.o(44804);
  }

  public F2fDynamicCodeItemLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(44805);
    init();
    AppMethodBeat.o(44805);
  }

  public F2fDynamicCodeItemLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(44806);
    init();
    AppMethodBeat.o(44806);
  }

  private void init()
  {
    AppMethodBeat.i(44807);
    View localView = LayoutInflater.from(getContext()).inflate(2130970511, this);
    this.pQF = ((TextView)localView.findViewById(2131827062));
    this.kRK = ((TextView)localView.findViewById(2131827063));
    AppMethodBeat.o(44807);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.F2fDynamicCodeItemLayout
 * JD-Core Version:    0.6.2
 */