package com.tencent.mm.plugin.bizui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class StoryListView extends ListView
{
  private boolean jEH;

  public StoryListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void layoutChildren()
  {
    AppMethodBeat.i(70048);
    if (!this.jEH)
      super.layoutChildren();
    AppMethodBeat.o(70048);
  }

  public void setBlockLayoutChildren(boolean paramBoolean)
  {
    this.jEH = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bizui.widget.StoryListView
 * JD-Core Version:    0.6.2
 */