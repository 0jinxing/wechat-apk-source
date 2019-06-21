package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;

public class SightAtContactWidget extends AtContactWidget
{
  public SightAtContactWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  @TargetApi(11)
  public SightAtContactWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected int getLayoutResource()
  {
    return 2130970681;
  }

  protected int getWithDrawableId()
  {
    return 2131231935;
  }

  protected int getWithEmptyDrawableId()
  {
    return 2131231935;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SightAtContactWidget
 * JD-Core Version:    0.6.2
 */