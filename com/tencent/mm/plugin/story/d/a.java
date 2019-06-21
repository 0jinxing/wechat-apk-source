package com.tencent.mm.plugin.story.d;

import a.l;
import com.tencent.mm.plugin.story.ui.album.c;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/contract/AlbumContract;", "", "IFavAlbumPresenter", "IFavAlbumView", "IFavSelectPresenter", "IFavSelectView", "IPresenter", "IView", "plugin-story_release"})
public abstract interface a
{
  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/contract/AlbumContract$IPresenter;", "", "checkStoryPost", "", "loadDBData", "loadFpData", "loadNpData", "onCreate", "userName", "", "onDestory", "plugin-story_release"})
  public static abstract interface e
  {
    public abstract void bMO();

    public abstract void cxk();

    public abstract void cxl();

    public abstract void cxo();

    public abstract void onCreate(String paramString);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/contract/AlbumContract$IView;", "", "onBubbleFail", "", "onIsAll", "onLoadFinish", "datas", "", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumInfo;", "onStoryPostFail", "list", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "plugin-story_release"})
  public static abstract interface f
  {
    public abstract void cxn();

    public abstract void du(List<c> paramList);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.d.a
 * JD-Core Version:    0.6.2
 */