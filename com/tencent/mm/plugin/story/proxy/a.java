package com.tencent.mm.plugin.story.proxy;

import a.l;
import com.tencent.mm.plugin.story.h.d;
import com.tencent.mm.protocal.protobuf.cei;
import com.tencent.mm.protocal.protobuf.cej;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/proxy/IProxyAction;", "", "commitStory", "", "storyEditorData", "Lcom/tencent/mm/plugin/story/storage/StoryEditorData;", "thumbPath", "", "location", "Lcom/tencent/mm/protocal/protobuf/StoryLocation;", "isCaptureVideo", "", "editorInfo", "Lcom/tencent/mm/protocal/protobuf/StoryMediaEditorInfo;", "scope", "favorite", "videoPath", "mediaDes", "get", "key", "Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;", "defva", "getAccPath", "getRecommendMusic", "", "imageData", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protobuf/ByteString;", "latitude", "", "longitude", "requestId", "", "callback", "Lkotlin/Function4;", "Lcom/tencent/mm/protocal/protobuf/GetRecommendedMusicResponse;", "getRecommendMusicCallback", "errType", "errCode", "errMsg", "respBytes", "", "getVideoPara", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "set", "plugin-story_release"})
public abstract interface a
{
  public abstract int commitStory(d paramd, String paramString, cei paramcei, boolean paramBoolean, cej paramcej, int paramInt1, int paramInt2);

  public abstract int commitStory(String paramString1, String paramString2, String paramString3, cei paramcei, boolean paramBoolean, cej paramcej, int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.proxy.a
 * JD-Core Version:    0.6.2
 */