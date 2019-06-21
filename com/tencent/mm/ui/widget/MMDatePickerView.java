package com.tencent.mm.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.v;

public class MMDatePickerView extends LinearLayout
  implements View.OnClickListener
{
  private MMSpinnerDatePicker kHG;
  private Button zMi;
  private Button zMj;
  private Button zMk;

  public MMDatePickerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107870);
    init(paramContext);
    AppMethodBeat.o(107870);
  }

  public MMDatePickerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107871);
    init(paramContext);
    AppMethodBeat.o(107871);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(107872);
    paramContext = v.hu(paramContext).inflate(2130970109, this);
    this.zMi = ((Button)paramContext.findViewById(2131822820));
    this.zMj = ((Button)paramContext.findViewById(2131822821));
    this.zMk = ((Button)paramContext.findViewById(2131822822));
    this.kHG = ((MMSpinnerDatePicker)paramContext.findViewById(2131825994));
    this.zMi.setOnClickListener(this);
    this.zMj.setOnClickListener(this);
    this.zMk.setOnClickListener(this);
    AppMethodBeat.o(107872);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(107873);
    int i = paramView.getId();
    if (i == 2131822820)
    {
      this.kHG.setPickerMode(0);
      AppMethodBeat.o(107873);
    }
    while (true)
    {
      return;
      if (i == 2131822821)
      {
        this.kHG.setPickerMode(1);
        AppMethodBeat.o(107873);
      }
      else
      {
        this.kHG.setPickerMode(2);
        AppMethodBeat.o(107873);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMDatePickerView
 * JD-Core Version:    0.6.2
 */