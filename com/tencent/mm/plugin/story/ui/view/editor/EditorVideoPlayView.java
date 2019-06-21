package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/EditorVideoPlayView;", "Lcom/tencent/mm/pluginsdk/ui/tools/VideoPlayerTextureView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "handleOnSurfaceTextureUpdated", "", "surface", "Landroid/graphics/SurfaceTexture;", "plugin-story_release"})
public final class EditorVideoPlayView extends VideoPlayerTextureView
{
  public EditorVideoPlayView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public EditorVideoPlayView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void i(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(110569);
    super.i(paramSurfaceTexture);
    this.llE.dG(getCurrentPosition(), getDuration());
    AppMethodBeat.o(110569);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorVideoPlayView
 * JD-Core Version:    0.6.2
 */