package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SightRangeWidget extends RangeWidget
{
  public SightRangeWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SightRangeWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final boolean a(int paramInt1, int paramInt2, Intent paramIntent, AtContactWidget paramAtContactWidget)
  {
    AppMethodBeat.i(38582);
    super.a(paramInt1, paramInt2, paramIntent, paramAtContactWidget);
    if (paramAtContactWidget != null)
    {
      if (getLabelRange() != 1)
        break label46;
      paramAtContactWidget.setVisibility(4);
      paramAtContactWidget.crA();
    }
    while (true)
    {
      AppMethodBeat.o(38582);
      return true;
      label46: paramAtContactWidget.setVisibility(0);
    }
  }

  protected int getLayoutResource()
  {
    return 2130970694;
  }

  protected int getMaxTagNameLen()
  {
    return 10;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SightRangeWidget
 * JD-Core Version:    0.6.2
 */