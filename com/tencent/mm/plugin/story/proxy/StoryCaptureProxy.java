package com.tencent.mm.plugin.story.proxy;

import a.f.a.r;
import a.k.m;
import a.l;
import a.v;
import a.y;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.story.model.g.c;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.protocal.protobuf.ann;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.protocal.protobuf.cei;
import com.tencent.mm.protocal.protobuf.cej;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/proxy/StoryCaptureProxy;", "Lcom/tencent/mm/remoteservice/BaseClientRequest;", "Lcom/tencent/mm/plugin/story/proxy/IProxyAction;", "serverProxy", "Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "(Lcom/tencent/mm/remoteservice/RemoteServiceProxy;)V", "musicCallback", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "errType", "errCode", "", "errMsg", "Lcom/tencent/mm/protocal/protobuf/GetRecommendedMusicResponse;", "resp", "", "getMusicCallback", "()Lkotlin/jvm/functions/Function4;", "setMusicCallback", "(Lkotlin/jvm/functions/Function4;)V", "commitStory", "storyEditorData", "Lcom/tencent/mm/plugin/story/storage/StoryEditorData;", "thumbPath", "location", "Lcom/tencent/mm/protocal/protobuf/StoryLocation;", "isCaptureVideo", "", "editorInfo", "Lcom/tencent/mm/protocal/protobuf/StoryMediaEditorInfo;", "scope", "favorite", "videoPath", "mediaDes", "commitStoryRemote", "get", "", "key", "Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;", "defva", "getAccPath", "getAccPathRemote", "getRecommendMusic", "imageData", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protobuf/ByteString;", "latitude", "", "longitude", "requestId", "", "callback", "getRecommendMusicCallback", "respBytes", "", "getRecommendMusicRemote", "imageDataBytes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getVideoPara", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "getVideoParaRemote", "onCallback", "methodName", "data", "Landroid/os/Bundle;", "clientCall", "set", "Companion", "plugin-story_release"})
public final class StoryCaptureProxy extends com.tencent.mm.remoteservice.a
  implements a
{
  private static final String RESULT_KEY = "result_key";
  private static final String TAG = "MicroMsg.StoryCaptureProxy";
  public static StoryCaptureProxy sav;
  public static final StoryCaptureProxy.a saw;
  private r<? super Integer, ? super Integer, ? super String, ? super ann, y> sau;

  static
  {
    AppMethodBeat.i(109721);
    saw = new StoryCaptureProxy.a((byte)0);
    TAG = "MicroMsg.StoryCaptureProxy";
    RESULT_KEY = "result_key";
    AppMethodBeat.o(109721);
  }

  public StoryCaptureProxy(com.tencent.mm.remoteservice.d paramd)
  {
    super(paramd);
  }

  public static final void createInstance(com.tencent.mm.remoteservice.d paramd)
  {
    AppMethodBeat.i(109723);
    StoryCaptureProxy.a.createInstance(paramd);
    AppMethodBeat.o(109723);
  }

  public final int commitStory(com.tencent.mm.plugin.story.h.d paramd, String paramString, cei paramcei, boolean paramBoolean, cej paramcej, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(138831);
    a.f.b.j.p(paramd, "storyEditorData");
    a.f.b.j.p(paramString, "thumbPath");
    a.f.b.j.p(paramcei, "location");
    a.f.b.j.p(paramcej, "editorInfo");
    com.tencent.mm.plugin.story.model.g.d locald = new com.tencent.mm.plugin.story.model.g.d();
    baa localbaa = new baa();
    ab.d(TAG, "storyEditorData " + paramd.xDa + " isCaptureVideo:" + paramBoolean);
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
    AppMethodBeat.o(138831);
    return paramInt1;
  }

  public final int commitStory(String paramString1, String paramString2, String paramString3, cei paramcei, boolean paramBoolean, cej paramcej, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(138830);
    a.f.b.j.p(paramString1, "videoPath");
    a.f.b.j.p(paramString2, "thumbPath");
    a.f.b.j.p(paramString3, "mediaDes");
    a.f.b.j.p(paramcei, "location");
    a.f.b.j.p(paramcej, "editorInfo");
    String str = com.tencent.mm.c.g.cz(paramString1);
    com.tencent.mm.plugin.story.model.g.d locald = new com.tencent.mm.plugin.story.model.g.d();
    baa localbaa = new baa();
    ab.d(TAG, "videoPath:" + paramString1 + " thumbPath:" + paramString2 + " mediaDes:" + paramString3 + " videoMd5:" + str + " isCaptureVideo:" + paramBoolean);
    localbaa.wDP = paramBoolean;
    a.f.b.j.o(str, "md5");
    locald.am(paramString1, paramString2, str);
    locald.a(paramcej);
    locald.a(paramcei);
    locald.b(localbaa);
    locald.EM(paramInt1);
    locald.EN(paramInt2);
    paramInt1 = locald.commit();
    paramString1 = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cya().checkPost();
    AppMethodBeat.o(138830);
    return paramInt1;
  }

  @com.tencent.mm.remoteservice.f
  public final void commitStoryRemote(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(109717);
    a.f.b.j.p(paramString1, "videoPath");
    a.f.b.j.p(paramString2, "thumbPath");
    a.f.b.j.p(paramString3, "mediaDes");
    String str = com.tencent.mm.c.g.cz(paramString1);
    com.tencent.mm.plugin.story.model.g.d locald = new com.tencent.mm.plugin.story.model.g.d();
    baa localbaa = new baa();
    ab.d(TAG, "videoPath:" + paramString1 + " thumbPath:" + paramString2 + " mediaDes:" + paramString3 + " videoMd5:" + str + " isCaptureVideo:" + paramBoolean);
    localbaa.wDP = paramBoolean;
    a.f.b.j.o(str, "md5");
    locald.am(paramString1, paramString2, str);
    locald.b(localbaa);
    locald.commit();
    paramString1 = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cya().checkPost();
    AppMethodBeat.o(109717);
  }

  public final Object get(ac.a parama, Object paramObject)
  {
    AppMethodBeat.i(109719);
    a.f.b.j.p(parama, "key");
    a.f.b.j.p(paramObject, "defva");
    ac.a locala = ((ac.a[])ac.a.class.getEnumConstants())[parama.ordinal()];
    ab.i(TAG, "getConfigStorage, %s %s", new Object[] { locala, paramObject });
    parama = com.tencent.mm.kernel.g.RP();
    a.f.b.j.o(parama, "MMKernel.storage()");
    parama = parama.Ry().get(locala, paramObject);
    a.f.b.j.o(parama, "MMKernel.storage().configStg.get(index, defva)");
    AppMethodBeat.o(109719);
    return parama;
  }

  public final String getAccPath()
  {
    AppMethodBeat.i(109708);
    String str = REMOTE_CALL("getAccPathRemote", new Object[0]).toString();
    AppMethodBeat.o(109708);
    return str;
  }

  @com.tencent.mm.remoteservice.f
  public final String getAccPathRemote()
  {
    AppMethodBeat.i(109709);
    Object localObject = com.tencent.mm.kernel.g.RP();
    a.f.b.j.o(localObject, "storage()");
    localObject = ((com.tencent.mm.kernel.e)localObject).getAccPath();
    a.f.b.j.o(localObject, "storage().accPath");
    AppMethodBeat.o(109709);
    return localObject;
  }

  public final r<Integer, Integer, String, ann, y> getMusicCallback()
  {
    return this.sau;
  }

  public final void getRecommendMusic(LinkedList<b> paramLinkedList, float paramFloat1, float paramFloat2, long paramLong, r<? super Integer, ? super Integer, ? super String, ? super ann, y> paramr)
  {
    AppMethodBeat.i(109712);
    a.f.b.j.p(paramLinkedList, "imageData");
    ab.i(TAG, "LogStory: getRecommendMusic");
    this.sau = paramr;
    paramr = new ArrayList();
    paramLinkedList = ((Iterable)paramLinkedList).iterator();
    while (paramLinkedList.hasNext())
      paramr.add(((b)paramLinkedList.next()).getBytes());
    REMOTE_CALL("getRecommendMusicRemote", new Object[] { paramr, Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Long.valueOf(paramLong) });
    AppMethodBeat.o(109712);
  }

  @com.tencent.mm.remoteservice.e
  public final void getRecommendMusicCallback(int paramInt1, int paramInt2, String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(109713);
    a.f.b.j.p(paramArrayOfByte, "respBytes");
    ab.i(TAG, "LogStory: getRecommendMusicCallback");
    ann localann = new ann();
    localann.parseFrom(paramArrayOfByte);
    paramArrayOfByte = this.sau;
    if (paramArrayOfByte != null)
    {
      paramArrayOfByte.a(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, localann);
      AppMethodBeat.o(109713);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109713);
    }
  }

  @com.tencent.mm.remoteservice.f
  public final void getRecommendMusicRemote(ArrayList<byte[]> paramArrayList, float paramFloat1, float paramFloat2, long paramLong)
  {
    AppMethodBeat.i(109714);
    a.f.b.j.p(paramArrayList, "imageDataBytes");
    ab.i(TAG, "LogStory: getRecommendMusicRemote");
    LinkedList localLinkedList = new LinkedList();
    paramArrayList = ((Iterable)paramArrayList).iterator();
    while (paramArrayList.hasNext())
      localLinkedList.add(new b((byte[])paramArrayList.next()));
    new com.tencent.mm.plugin.story.model.audio.d(localLinkedList, paramFloat1, paramFloat2, paramLong, (byte)0).acy().j((com.tencent.mm.vending.c.a)new StoryCaptureProxy.b(this));
    AppMethodBeat.o(109714);
  }

  public final VideoTransPara getVideoPara()
  {
    AppMethodBeat.i(109710);
    VideoTransPara localVideoTransPara = (VideoTransPara)REMOTE_CALL("getVideoParaRemote", new Object[0]);
    if (localVideoTransPara == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(109710);
    return localVideoTransPara;
  }

  @com.tencent.mm.remoteservice.f
  public final VideoTransPara getVideoParaRemote()
  {
    AppMethodBeat.i(109711);
    Object localObject = com.tencent.mm.modelcontrol.d.afF();
    a.f.b.j.o(localObject, "SubCoreVideoControl.getCore()");
    localObject = ((com.tencent.mm.modelcontrol.d)localObject).afJ();
    a.f.b.j.o(localObject, "para");
    AppMethodBeat.o(109711);
    return localObject;
  }

  public final void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(109720);
    a.f.b.j.p(paramString, "methodName");
    a.f.b.j.p(paramBundle, "data");
    ab.i(TAG, "class:%s, method:%s, clientCall:%B", new Object[] { getClass().getName(), paramString, Boolean.valueOf(paramBoolean) });
    Object localObject1 = null;
    try
    {
      Method[] arrayOfMethod = getClass().getMethods();
      int i = arrayOfMethod.length;
      int j = 0;
      localObject2 = localObject1;
      if (j < i)
      {
        localObject2 = arrayOfMethod[j];
        a.f.b.j.o(localObject2, "mth");
        if (!m.I(((Method)localObject2).getName(), paramString, true));
      }
      else
      {
        if (localObject2 == null)
          break label260;
        if (!paramBoolean)
          break label201;
      }
      label201: for (paramString = com.tencent.mm.remoteservice.e.class; ; paramString = com.tencent.mm.remoteservice.f.class)
      {
        if (!((Method)localObject2).isAnnotationPresent(paramString))
          break label260;
        paramString = getArgs(paramBundle);
        paramString = ((Method)localObject2).invoke(this, Arrays.copyOf(paramString, paramString.length));
        if (!(a.f.b.j.j(((Method)localObject2).getReturnType(), Void.TYPE) ^ true))
          break label260;
        if (!(paramString instanceof Parcelable))
          break label208;
        paramBundle.putParcelable(RESULT_KEY, (Parcelable)paramString);
        AppMethodBeat.o(109720);
        return;
        j++;
        break;
      }
      label208: localObject2 = RESULT_KEY;
      if (paramString == null)
      {
        paramString = new a/v;
        paramString.<init>("null cannot be cast to non-null type java.io.Serializable");
        AppMethodBeat.o(109720);
        throw paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        Object localObject2;
        ab.e(TAG, "exception:%s", new Object[] { bo.l((Throwable)paramString) });
        label260: AppMethodBeat.o(109720);
        continue;
        paramBundle.putSerializable((String)localObject2, (Serializable)paramString);
        AppMethodBeat.o(109720);
      }
    }
  }

  public final void set(ac.a parama, Object paramObject)
  {
    AppMethodBeat.i(109718);
    a.f.b.j.p(parama, "key");
    a.f.b.j.p(paramObject, "defva");
    ab.i(TAG, "get %s %s", new Object[] { parama, paramObject });
    ac.a locala = ((ac.a[])ac.a.class.getEnumConstants())[parama.ordinal()];
    ab.i(TAG, "setConfigStorage, %s %s", new Object[] { locala, paramObject });
    parama = com.tencent.mm.kernel.g.RP();
    a.f.b.j.o(parama, "MMKernel.storage()");
    parama.Ry().set(locala, paramObject);
    AppMethodBeat.o(109718);
  }

  public final void setMusicCallback(r<? super Integer, ? super Integer, ? super String, ? super ann, y> paramr)
  {
    this.sau = paramr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.proxy.StoryCaptureProxy
 * JD-Core Version:    0.6.2
 */