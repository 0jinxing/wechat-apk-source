package com.tencent.mm.plugin.label.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTagPanel;

public class MMLabelPanel extends MMTagPanel
{
  public MMLabelPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MMLabelPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void bwC()
  {
    AppMethodBeat.i(22716);
    ab.d("MicroMsg.Label.MMLabelPanel", "cpan[onPreDelTag]");
    if (getTagCount() > 0)
      AppMethodBeat.o(22716);
    while (true)
    {
      return;
      AppMethodBeat.o(22716);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.widget.MMLabelPanel
 * JD-Core Version:    0.6.2
 */