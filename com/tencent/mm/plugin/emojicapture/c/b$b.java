package com.tencent.mm.plugin.emojicapture.c;

import a.l;
import a.y;
import com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView;
import com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/contract/EditorContract$IView;", "", "destroy", "", "getItemContainer", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "getVideoPlayView", "Lcom/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureView;", "isShow", "", "isShowSmileyPanel", "isShowTextEditor", "reset", "setup", "captureInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;", "videoPath", "", "removeBgEnable", "removeBg", "videoPreparedCallback", "Lkotlin/Function0;", "toggleSmileyPanel", "show", "toggleTextEditor", "text", "", "textColor", "", "viewPrepared", "plugin-emojicapture_release"})
public abstract interface b$b
{
  public abstract void a(com.tencent.mm.plugin.emojicapture.model.a.a parama, String paramString, boolean paramBoolean1, boolean paramBoolean2, a.f.a.a<y> parama1);

  public abstract void a(boolean paramBoolean, CharSequence paramCharSequence, int paramInt);

  public abstract boolean aFF();

  public abstract void bmA();

  public abstract boolean bmB();

  public abstract boolean bmC();

  public abstract void destroy();

  public abstract void gC(boolean paramBoolean);

  public abstract EditorItemContainer getItemContainer();

  public abstract EmojiVideoPlayTextureView getVideoPlayView();

  public abstract void reset();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.c.b.b
 * JD-Core Version:    0.6.2
 */