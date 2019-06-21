package com.tencent.mm.plugin.story.api;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.ui.base.preference.Preference;

public abstract class AbsStoryPreference extends Preference
{
  public AbsStoryPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AbsStoryPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public abstract void a(d paramd);

  public abstract void cwO();

  public abstract void cwP();

  public abstract void cwQ();

  public abstract void onCreate(String paramString);

  public abstract void onDestroy();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.api.AbsStoryPreference
 * JD-Core Version:    0.6.2
 */