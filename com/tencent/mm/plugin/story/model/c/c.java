package com.tencent.mm.plugin.story.model.c;

import a.f.b.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.i.e;
import com.tencent.mm.i.g.a;
import com.tencent.mm.loader.d.b.b;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/download/StoryDownloader;", "Lcom/tencent/mm/loader/common/IDataFetcher;", "Lcom/tencent/mm/plugin/story/model/download/StoryImage;", "()V", "attachSnsImgTaskInfo", "", "story", "tmpFilePath", "", "taskInfo", "Lcom/tencent/mm/cdn/keep_SnsImageTaskInfo;", "isDcIp", "referer", "getStringArray", "", "strList", "", "(Ljava/util/List;)[Ljava/lang/String;", "idDcIp", "scene", "Lcom/tencent/mm/storage/FROM_SCENE;", "url", "configTime", "", "hostname", "loadDataImp", "", "data", "Lcom/tencent/mm/loader/model/data/DataItem;", "fileNameCreator", "Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;", "callback", "Lcom/tencent/mm/loader/common/IDataFetcher$IDataReady2;", "Companion", "plugin-story_release"})
public final class c extends com.tencent.mm.loader.d.b<d>
{
  private static final String TAG = "MicroMsg.Loader.StoryDownloader";
  public static final c.a rVM;

  static
  {
    AppMethodBeat.i(109298);
    rVM = new c.a((byte)0);
    TAG = "MicroMsg.Loader.StoryDownloader";
    AppMethodBeat.o(109298);
  }

  private static boolean a(d paramd, String paramString1, e parame, String paramString2)
  {
    AppMethodBeat.i(109296);
    cek localcek;
    Object localObject1;
    String str;
    int i;
    ArrayList localArrayList;
    int j;
    Object localObject2;
    boolean bool;
    try
    {
      localcek = paramd.rVQ;
      localObject1 = new java/net/URL;
      ((URL)localObject1).<init>(localcek.wEH);
      str = ((URL)localObject1).getHost();
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      i = com.tencent.mm.network.b.a(str, false, (List)localObject1);
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      j = com.tencent.mm.network.b.a(str, true, (List)localArrayList);
      localObject2 = new java/util/Random;
      ((Random)localObject2).<init>();
      ((Random)localObject2).setSeed(bo.anU());
      Collections.shuffle((List)localObject1, (Random)localObject2);
      Collections.shuffle((List)localArrayList, (Random)localObject2);
      while (((ArrayList)localObject1).size() > 2)
        ((ArrayList)localObject1).remove(0);
    }
    catch (MalformedURLException paramd)
    {
      ab.printErrStackTrace(TAG, (Throwable)paramd, "", new Object[0]);
      ab.w(TAG, "attachSnsImgTaskInfo fail:".concat(String.valueOf(paramd)));
      bool = false;
      AppMethodBeat.o(109296);
    }
    while (true)
    {
      return bool;
      while (localArrayList.size() > 2)
        localArrayList.remove(0);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      parame.field_mediaId = (localcek.Id + "_");
      parame.url = localcek.wEH;
      parame.host = str;
      parame.referer = paramString2;
      parame.egd = paramString1;
      parame.ege = di((List)localObject1);
      parame.egf = di((List)localArrayList);
      parame.egg = i;
      parame.egh = j;
      parame.isColdSnsData = false;
      paramString1 = new java/lang/StringBuilder;
      paramString1.<init>();
      parame.signalQuality = at.getStrength(ah.getContext());
      parame.snsScene = "";
      parame.snsCipherKey = paramd.rVQ.wFb;
      parame.duk = 3;
      parame.egi = 100;
      parame.fileType = 20201;
      ab.i(TAG, "attachSnsImgTaskInfo reqDownType:%s", new Object[] { parame });
      bool = true;
      AppMethodBeat.o(109296);
    }
  }

  private static String[] di(List<String> paramList)
  {
    AppMethodBeat.i(109297);
    String[] arrayOfString = new String[paramList.size()];
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
      arrayOfString[j] = ((String)paramList.get(j));
    AppMethodBeat.o(109297);
    return arrayOfString;
  }

  public final void a(final com.tencent.mm.loader.h.a.a<d> parama, com.tencent.mm.loader.f.f paramf, final b.b paramb)
  {
    AppMethodBeat.i(109295);
    a.f.b.j.p(parama, "data");
    a.f.b.j.p(paramf, "fileNameCreator");
    a.f.b.j.p(paramb, "callback");
    d locald = (d)parama.value();
    Object localObject1 = y.AVH;
    int i = com.tencent.mm.protocal.d.vxo;
    localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    a.f.b.j.o(com.tencent.mm.kernel.g.RN(), "MMKernel.account()");
    String str1 = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d%s", Arrays.copyOf(new Object[] { Integer.valueOf(i), p.getString(com.tencent.mm.kernel.a.QF()), Integer.valueOf(at.getNetTypeForStat(ah.getContext())), Integer.valueOf(at.getStrength(ah.getContext())), "" }, 5));
    a.f.b.j.o(str1, "java.lang.String.format(format, *args)");
    e locale = new e();
    ab.i(TAG, "loadDataImp " + (d)parama.value() + " story " + locald.rVQ.Url);
    StringBuilder localStringBuilder = new StringBuilder();
    localObject1 = com.tencent.mm.plugin.story.model.l.rTg;
    Object localObject2 = ((d)parama.value()).rVQ.Url;
    String str2 = ((d)parama.value()).username;
    if (localObject2 == null)
    {
      localObject1 = "";
      parama = (String)localObject1 + paramf.c(parama);
      a.f.b.j.o(locald, "story");
      if (!a(locald, parama, locale, str1))
        break label432;
      locale.egl = ((g.a)new b(locald, paramb, parama));
      if (!com.tencent.mm.al.f.afx().d((com.tencent.mm.i.g)locale))
        break label408;
      ab.i(TAG, "SubCoreCdnTransport addRecvTask suc");
      AppMethodBeat.o(109295);
    }
    while (true)
    {
      return;
      localObject1 = new StringBuilder();
      str2 = com.tencent.mm.plugin.story.model.l.aar(str2) + "/pic/";
      localObject2 = ((String)localObject2).getBytes(a.k.d.UTF_8);
      a.f.b.j.o(localObject2, "(this as java.lang.String).getBytes(charset)");
      localObject1 = com.tencent.mm.plugin.story.model.l.gv(str2, com.tencent.mm.a.g.x((byte[])localObject2)) + ".d";
      break;
      label408: ab.w(TAG, "SubCoreCdnTransport addRecvTask failed");
      paramb.onError();
      AppMethodBeat.o(109295);
      continue;
      label432: ab.w(TAG, "attachSnsImgTaskInfo failed");
      paramb.onError();
      AppMethodBeat.o(109295);
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/model/download/StoryDownloader$loadDataImp$1", "Lcom/tencent/mm/cdn/keep_TaskInfo$TaskCallback;", "callback", "", "mediaId", "", "startRet", "progressInfo", "Lcom/tencent/mm/cdn/keep_ProgressInfo;", "sceneResult", "Lcom/tencent/mm/cdn/keep_SceneResult;", "onlyCheckExist", "", "decodePrepareResponse", "", "inbuf", "getCdnAuthInfo", "", "buff", "Ljava/io/ByteArrayOutputStream;", "plugin-story_release"})
  public static final class b
    implements g.a
  {
    b(d paramd, b.b paramb, String paramString)
    {
    }

    public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
    {
      AppMethodBeat.i(109292);
      a.f.b.j.p(paramString, "mediaId");
      ab.i(c.access$getTAG$cp(), "mediaId " + paramString + " startRet " + paramInt + " sceneResult " + paramd + " onlyCheckExist " + paramBoolean);
      if (paramd != null)
        if (this.rVN == null)
          AppMethodBeat.o(109292);
      while (true)
      {
        return 0;
        paramString = paramb;
        paramc = com.tencent.mm.loader.h.a.S(parama, "");
        a.f.b.j.o(paramc, "HttpFileResponse.create(tmpFilePath, \"\")");
        paramString.a((com.tencent.mm.loader.h.f)paramc);
        AppMethodBeat.o(109292);
      }
    }

    public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
    {
      AppMethodBeat.i(109293);
      a.f.b.j.p(paramString, "mediaId");
      a.f.b.j.p(paramByteArrayOutputStream, "buff");
      AppMethodBeat.o(109293);
    }

    public final byte[] l(String paramString, byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(109294);
      a.f.b.j.p(paramString, "mediaId");
      a.f.b.j.p(paramArrayOfByte, "inbuf");
      AppMethodBeat.o(109294);
      return new byte[0];
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.c.c
 * JD-Core Version:    0.6.2
 */