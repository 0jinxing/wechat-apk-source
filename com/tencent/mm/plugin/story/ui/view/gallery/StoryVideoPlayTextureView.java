package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPlayTextureView;", "Lcom/tencent/mm/pluginsdk/ui/tools/VideoPlayerTextureView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "handleOnSurfaceTextureUpdated", "", "surface", "Landroid/graphics/SurfaceTexture;", "seekTo", "time", "", "plugin-story_release"})
public final class StoryVideoPlayTextureView extends VideoPlayerTextureView
{
  public StoryVideoPlayTextureView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(110860);
    setScaleType(h.d.vhG);
    AppMethodBeat.o(110860);
  }

  public StoryVideoPlayTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(110861);
    setScaleType(h.d.vhG);
    AppMethodBeat.o(110861);
  }

  public StoryVideoPlayTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110862);
    setScaleType(h.d.vhG);
    AppMethodBeat.o(110862);
  }

  public final void B(double paramDouble)
  {
    AppMethodBeat.i(110858);
    if (this.VN)
    {
      super.B(paramDouble);
      AppMethodBeat.o(110858);
    }
    while (true)
    {
      return;
      ab.c("MicroMsg.VideoPlayerTextureView", hashCode() + " error seekTo " + this.VN + ' ', new Object[0]);
      AppMethodBeat.o(110858);
    }
  }

  public final void i(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(110859);
    super.i(paramSurfaceTexture);
    this.llE.dG(getCurrentPosition(), getDuration());
    AppMethodBeat.o(110859);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView
 * JD-Core Version:    0.6.2
 */