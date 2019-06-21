package com.tencent.mm.plugin.topstory.ui.video;

import android.content.Context;
import android.widget.TextView;
import com.tencent.mm.plugin.websearch.ui.WebSearchVideoPlayerSeekBar;

public abstract class g extends WebSearchVideoPlayerSeekBar
{
  public g(Context paramContext)
  {
    super(paramContext);
  }

  public abstract void hide();

  public void setCurrentPlaySecond(int paramInt)
  {
    this.mPosition = paramInt;
    this.qyp.setText(oy(paramInt / 60) + ":" + oy(paramInt % 60));
    In(Im(paramInt));
  }

  public abstract void show();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.g
 * JD-Core Version:    0.6.2
 */