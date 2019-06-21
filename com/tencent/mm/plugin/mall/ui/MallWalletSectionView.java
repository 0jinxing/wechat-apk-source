package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MallWalletSectionView extends LinearLayout
{
  public MallWalletSectionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(43259);
    init(paramContext);
    AppMethodBeat.o(43259);
  }

  public MallWalletSectionView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(43260);
    init(paramContext);
    AppMethodBeat.o(43260);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(43261);
    inflate(paramContext, 2130970065, this);
    setOrientation(1);
    AppMethodBeat.o(43261);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallWalletSectionView
 * JD-Core Version:    0.6.2
 */