package com.tencent.mm.plugin.story.proxy;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.story.model.g.c;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.protocal.protobuf.cei;
import com.tencent.mm.protocal.protobuf.cej;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/proxy/StoryProxy;", "Lcom/tencent/mm/plugin/story/proxy/IProxyAction;", "()V", "musicCallback", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "errType", "errCode", "", "errMsg", "Lcom/tencent/mm/protocal/protobuf/GetRecommendedMusicResponse;", "resp", "", "getMusicCallback", "()Lkotlin/jvm/functions/Function4;", "setMusicCallback", "(Lkotlin/jvm/functions/Function4;)V", "commitStory", "storyEditorData", "Lcom/tencent/mm/plugin/story/storage/StoryEditorData;", "thumbPath", "location", "Lcom/tencent/mm/protocal/protobuf/StoryLocation;", "isCaptureVideo", "", "editorInfo", "Lcom/tencent/mm/protocal/protobuf/StoryMediaEditorInfo;", "scope", "favorite", "videoPath", "mediaDes", "get", "", "key", "Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;", "defva", "getAccPath", "getRecommendMusic", "imageData", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protobuf/ByteString;", "latitude", "", "longitude", "requestId", "", "callback", "getRecommendMusicCallback", "respBytes", "", "getVideoPara", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "set", "Companion", "plugin-story_release"})
public final class d
  implements a
{
  private static final String TAG = "MicroMsg.StoryProxy";
  private static final d sbe;
  public static final d.a sbf;

  static
  {
    AppMethodBeat.i(109760);
    sbf = new d.a((byte)0);
    TAG = "MicroMsg.StoryProxy";
    sbe = new d();
    AppMethodBeat.o(109760);
  }

  public static String getAccPath()
  {
    AppMethodBeat.i(109756);
    Object localObject;
    if (ah.bqo())
    {
      localObject = com.tencent.mm.kernel.g.RP();
      a.f.b.j.o(localObject, "MMKernel.storage()");
      localObject = ((e)localObject).getAccPath();
      a.f.b.j.o(localObject, "MMKernel.storage().accPath");
      AppMethodBeat.o(109756);
    }
    while (true)
    {
      return localObject;
      localObject = StoryCaptureProxy.saw;
      localObject = StoryCaptureProxy.access$getInstance$cp().getAccPath();
      AppMethodBeat.o(109756);
    }
  }

  public static VideoTransPara getVideoPara()
  {
    AppMethodBeat.i(109757);
    Object localObject;
    if (ah.bqo())
    {
      localObject = com.tencent.mm.modelcontrol.d.afF();
      a.f.b.j.o(localObject, "SubCoreVideoControl.getCore()");
      localObject = ((com.tencent.mm.modelcontrol.d)localObject).afJ();
      a.f.b.j.o(localObject, "SubCoreVideoControl.getCore().storyRecordVideoPara");
      AppMethodBeat.o(109757);
    }
    while (true)
    {
      return localObject;
      localObject = StoryCaptureProxy.saw;
      localObject = StoryCaptureProxy.access$getInstance$cp().getVideoPara();
      AppMethodBeat.o(109757);
    }
  }

  public final int commitStory(com.tencent.mm.plugin.story.h.d paramd, String paramString, cei paramcei, boolean paramBoolean, cej paramcej, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(138833);
    a.f.b.j.p(paramd, "storyEditorData");
    a.f.b.j.p(paramString, "thumbPath");
    a.f.b.j.p(paramcei, "location");
    a.f.b.j.p(paramcej, "editorInfo");
    StoryCaptureProxy.a locala;
    if (ah.bqo())
    {
      com.tencent.mm.plugin.story.model.g.d locald = new com.tencent.mm.plugin.story.model.g.d();
      baa localbaa = new baa();
      locala = StoryCaptureProxy.saw;
      ab.i(StoryCaptureProxy.access$getTAG$cp(), "storyEditorData " + paramd.xDa + " isCaptureVideo:" + paramBoolean + " scope:" + paramInt1);
      localbaa.wDP = paramBoolean;
      locald.a(paramd, paramString);
      locald.a(paramcej);
      locald.a(paramcei);
      locald.b(localbaa);
      locald.EM(paramInt1);
      locald.EN(paramInt2);
      paramInt1 = locald.commit();
      paramd = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cya().checkPost();
      AppMethodBeat.o(138833);
    }
    while (true)
    {
      return paramInt1;
      locala = StoryCaptureProxy.saw;
      paramInt1 = StoryCaptureProxy.access$getInstance$cp().commitStory(paramd, paramString, paramcei, paramBoolean, paramcej, paramInt1, 0);
      AppMethodBeat.o(138833);
    }
  }

  public final int commitStory(String paramString1, String paramString2, String paramString3, cei paramcei, boolean paramBoolean, cej paramcej, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(138832);
    a.f.b.j.p(paramString1, "videoPath");
    a.f.b.j.p(paramString2, "thumbPath");
    a.f.b.j.p(paramString3, "mediaDes");
    a.f.b.j.p(paramcei, "location");
    a.f.b.j.p(paramcej, "editorInfo");
    StoryCaptureProxy.a locala;
    if (ah.bqo())
    {
      String str = com.tencent.mm.c.g.cz(paramString1);
      com.tencent.mm.plugin.story.model.g.d locald = new com.tencent.mm.plugin.story.model.g.d();
      baa localbaa = new baa();
      locala = StoryCaptureProxy.saw;
      ab.i(StoryCaptureProxy.access$getTAG$cp(), "videoPath:" + paramString1 + " thumbPath:" + paramString2 + " mediaDes:" + paramString3 + " videoMd5:" + str + " isCaptureVideo:" + paramBoolean + " scope:" + paramInt1);
      localbaa.wDP = paramBoolean;
      a.f.b.j.o(str, "md5");
      locald.am(paramString1, paramString2, str);
      locald.a(paramcei);
      locald.a(paramcej);
      locald.b(localbaa);
      locald.EM(paramInt1);
      locald.EN(paramInt2);
      paramInt1 = locald.commit();
      paramString1 = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cya().checkPost();
      AppMethodBeat.o(138832);
    }
    while (true)
    {
      return paramInt1;
      locala = StoryCaptureProxy.saw;
      paramInt1 = StoryCaptureProxy.access$getInstance$cp().commitStory(paramString1, paramString2, paramString3, paramcei, paramBoolean, paramcej, paramInt1, 0);
      AppMethodBeat.o(138832);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.proxy.d
 * JD-Core Version:    0.6.2
 */