package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPageControlView;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/StoryPageControlView;", "Lcom/tencent/mm/ui/base/MMPageControlView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mPageIndicatorStatusInterface", "Lcom/tencent/mm/plugin/story/ui/view/StoryPageControlView$IPageIndicatorStatusInterface;", "generatePageControl", "", "currentIndex", "", "setPageIndicatorStatusInterface", "pageControlInterface", "IPageIndicatorStatusInterface", "plugin-story_release"})
public final class StoryPageControlView extends MMPageControlView
{
  private StoryPageControlView.a sjZ;

  public StoryPageControlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(110450);
    AppMethodBeat.o(110450);
  }

  public final void Dr(int paramInt)
  {
    AppMethodBeat.i(110449);
    super.Dr(paramInt);
    int i = this.count;
    int j = 0;
    if (j < i)
    {
      this.cAw = ((ImageView)this.map.get(Integer.valueOf(j)));
      ImageView localImageView = this.cAw;
      j.o(localImageView, "imageView");
      if (paramInt == j);
      for (boolean bool = true; ; bool = false)
      {
        localImageView.setSelected(bool);
        j++;
        break;
      }
    }
    AppMethodBeat.o(110449);
  }

  public final void setPageIndicatorStatusInterface(StoryPageControlView.a parama)
  {
    this.sjZ = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryPageControlView
 * JD-Core Version:    0.6.2
 */