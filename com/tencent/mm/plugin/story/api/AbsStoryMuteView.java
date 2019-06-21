package com.tencent.mm.plugin.story.api;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public abstract class AbsStoryMuteView extends RelativeLayout
{
  public AbsStoryMuteView(Context paramContext)
  {
    super(paramContext);
  }

  public AbsStoryMuteView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AbsStoryMuteView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public abstract void cwM();

  public abstract void cwN();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.api.AbsStoryMuteView
 * JD-Core Version:    0.6.2
 */