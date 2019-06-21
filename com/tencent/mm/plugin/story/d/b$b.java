package com.tencent.mm.plugin.story.d;

import a.f.a.a;
import a.l;
import a.y;
import com.google.android.exoplayer2.v;
import com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.protocal.protobuf.cei;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/contract/EditorContract$IView;", "", "back", "", "checkLocation", "", "destroy", "getItemContainer", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/EditorItemContainer;", "getLocation", "Lcom/tencent/mm/protocal/protobuf/StoryLocation;", "getMusicRequestId", "", "getVideoPlayView", "Lcom/tencent/mm/pluginsdk/ui/tools/VideoPlayerTextureView;", "isShow", "isShowSmileyPanel", "isShowTextEditor", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "reset", "setMusicPlayer", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "setup", "videoPath", "", "startTime", "endTime", "videoPreparedCallback", "Lkotlin/Function0;", "toggleSmileyPanel", "show", "toggleTextEditor", "text", "", "textColor", "textBgColor", "plugin-story_release"})
public abstract interface b$b
{
  public abstract void a(String paramString, long paramLong1, long paramLong2, a<y> parama);

  public abstract boolean aFF();

  public abstract boolean cxq();

  public abstract void destroy();

  public abstract EditorItemContainer getItemContainer();

  public abstract cei getLocation();

  public abstract VideoPlayerTextureView getVideoPlayView();

  public abstract void reset();

  public abstract void setMusicPlayer(v paramv);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.d.b.b
 * JD-Core Version:    0.6.2
 */