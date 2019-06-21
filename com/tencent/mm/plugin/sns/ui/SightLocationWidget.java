package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;

public class SightLocationWidget extends LocationWidget
{
  public SightLocationWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SightLocationWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected int getLayoutResource()
  {
    return 2130969948;
  }

  protected int getNormalStateImageResource()
  {
    return 2131231933;
  }

  protected int getSelectedStateImageResource()
  {
    return 2131231934;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SightLocationWidget
 * JD-Core Version:    0.6.2
 */