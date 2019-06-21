package com.tencent.mm.plugin.story.api;

import android.content.Context;
import com.tencent.mm.kernel.b.d;
import com.tencent.mm.protocal.protobuf.cfc;
import java.util.List;

public abstract interface e extends d
{
  public abstract void addStoryStatusNotifyListener(l paraml);

  public abstract boolean canPostStory();

  public abstract void checkPost();

  public abstract boolean checkReportFromChatting(int paramInt, String paramString);

  public abstract void enterGallery(List<String> paramList);

  public abstract String getAccStoryCachePath();

  public abstract String getAccStoryPath();

  public abstract String getAccStoryTmpPath();

  public abstract k.c getContactFetcher();

  public abstract b getFavourUserChecker();

  public abstract f getStoryBasicConfig();

  public abstract k getStoryStateFetcher(String paramString);

  public abstract m getStoryUIFactory();

  public abstract cfc getStoryUserInfo();

  public abstract boolean hasNewStory(String paramString);

  public abstract boolean isShowStoryCheck();

  public abstract boolean isStoryExist(String paramString);

  public abstract boolean isStoryUnread(String paramString);

  public abstract void loadStory(String paramString1, String paramString2);

  public abstract boolean preLoadVideoViewMgr(String paramString);

  public abstract void preloadForSnsUser(String paramString, boolean paramBoolean);

  public abstract void reportWaitPlayList(List<String> paramList, long paramLong);

  public abstract boolean showStoryEntranceDialog(Context paramContext, String paramString, int paramInt);

  public abstract void updateStoryUserInfo(String paramString, cfc paramcfc);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.api.e
 * JD-Core Version:    0.6.2
 */