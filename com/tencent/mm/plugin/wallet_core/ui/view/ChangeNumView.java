package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class ChangeNumView extends TextView
{
  private int max = 0;
  private int min = 0;
  private int svV = -1;
  private int tNq = 0;
  private boolean tNr = false;
  private final int tNs = 100;

  public ChangeNumView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ChangeNumView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void setInteral(int paramInt)
  {
    this.svV = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.ChangeNumView
 * JD-Core Version:    0.6.2
 */