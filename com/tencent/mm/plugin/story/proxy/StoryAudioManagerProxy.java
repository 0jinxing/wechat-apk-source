package com.tencent.mm.plugin.story.proxy;

import a.f.a.b;
import a.f.b.j;
import a.l;
import a.v;
import a.y;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import com.tencent.mm.plugin.story.model.audio.g;
import com.tencent.mm.plugin.story.model.audio.g.a;
import com.tencent.mm.remoteservice.a;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.remoteservice.e;
import com.tencent.mm.remoteservice.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/proxy/StoryAudioManagerProxy;", "Lcom/tencent/mm/remoteservice/BaseClientRequest;", "serverProxy", "Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "(Lcom/tencent/mm/remoteservice/RemoteServiceProxy;)V", "audioTaskMap", "Landroid/util/SparseArray;", "Ljava/util/LinkedList;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "", "cacheAudio", "info", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "callback", "cacheAudioCallback", "musicId", "", "cacheAudioRemote", "cancelAll", "cancelAllRemote", "cancelCache", "cancelCacheRemote", "onCallback", "methodName", "", "data", "Landroid/os/Bundle;", "clientCall", "Companion", "plugin-story_release"})
public final class StoryAudioManagerProxy extends a
{
  private static final String RESULT_KEY = "result_key";
  private static final String TAG = "MicroMsg.StoryAudioManagerProxy";
  public static StoryAudioManagerProxy sar;
  public static final StoryAudioManagerProxy.a sas;
  private final SparseArray<LinkedList<b<Boolean, y>>> saq;

  static
  {
    AppMethodBeat.i(109702);
    sas = new StoryAudioManagerProxy.a((byte)0);
    TAG = "MicroMsg.StoryAudioManagerProxy";
    RESULT_KEY = "result_key";
    AppMethodBeat.o(109702);
  }

  public StoryAudioManagerProxy(d paramd)
  {
    super(paramd);
    AppMethodBeat.i(109701);
    this.saq = new SparseArray();
    AppMethodBeat.o(109701);
  }

  public static final void createInstance(d paramd)
  {
    AppMethodBeat.i(109704);
    StoryAudioManagerProxy.a.createInstance(paramd);
    AppMethodBeat.o(109704);
  }

  public final void cacheAudio(AudioCacheInfo paramAudioCacheInfo, b<? super Boolean, y> paramb)
  {
    AppMethodBeat.i(109692);
    j.p(paramAudioCacheInfo, "info");
    LinkedList localLinkedList1 = (LinkedList)this.saq.get(paramAudioCacheInfo.rTW);
    LinkedList localLinkedList2 = localLinkedList1;
    if (localLinkedList1 == null)
    {
      localLinkedList2 = new LinkedList();
      this.saq.put(paramAudioCacheInfo.rTW, localLinkedList2);
    }
    if (paramb != null)
      localLinkedList2.add(paramb);
    paramb = g.rUG;
    g.cyW().a(paramAudioCacheInfo, (a.f.a.m)new StoryAudioManagerProxy.b(this, paramAudioCacheInfo));
    AppMethodBeat.o(109692);
  }

  @e
  public final void cacheAudioCallback(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(109694);
    Object localObject = (LinkedList)this.saq.get(paramInt);
    if (localObject != null)
    {
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        ((b)((Iterator)localObject).next()).am(Boolean.valueOf(paramBoolean));
      AppMethodBeat.o(109694);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109694);
    }
  }

  @f
  public final void cacheAudioRemote(AudioCacheInfo paramAudioCacheInfo)
  {
    AppMethodBeat.i(109695);
    j.p(paramAudioCacheInfo, "info");
    g.a locala = g.rUG;
    g.cyW().a(paramAudioCacheInfo, (a.f.a.m)new StoryAudioManagerProxy.c(this, paramAudioCacheInfo));
    AppMethodBeat.o(109695);
  }

  public final void cancelAll()
  {
    AppMethodBeat.i(109698);
    this.saq.clear();
    REMOTE_CALL("cancelAllRemote", new Object[0]);
    AppMethodBeat.o(109698);
  }

  @f
  public final void cancelAllRemote()
  {
    AppMethodBeat.i(109699);
    g.a locala = g.rUG;
    g.cyW().cancelAll();
    AppMethodBeat.o(109699);
  }

  public final void cancelCache(AudioCacheInfo paramAudioCacheInfo)
  {
    AppMethodBeat.i(109696);
    if (paramAudioCacheInfo != null)
    {
      this.saq.removeAt(paramAudioCacheInfo.rTW);
      REMOTE_CALL("cancelCacheRemote", new Object[] { paramAudioCacheInfo });
    }
    AppMethodBeat.o(109696);
  }

  @f
  public final void cancelCacheRemote(AudioCacheInfo paramAudioCacheInfo)
  {
    AppMethodBeat.i(109697);
    g.a locala = g.rUG;
    g.cyW().cancelCache(paramAudioCacheInfo);
    AppMethodBeat.o(109697);
  }

  public final void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(109700);
    j.p(paramString, "methodName");
    j.p(paramBundle, "data");
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
        j.o(localObject2, "mth");
        if (!a.k.m.I(((Method)localObject2).getName(), paramString, true));
      }
      else
      {
        if (localObject2 == null)
          break label262;
        if (!paramBoolean)
          break label204;
      }
      label204: for (paramString = e.class; ; paramString = f.class)
      {
        if (!((Method)localObject2).isAnnotationPresent(paramString))
          break label262;
        paramBundle.setClassLoader(AudioCacheInfo.class.getClassLoader());
        paramString = getArgs(paramBundle);
        paramString = ((Method)localObject2).invoke(this, Arrays.copyOf(paramString, paramString.length));
        if (!(j.j(((Method)localObject2).getReturnType(), Void.TYPE) ^ true))
          break label262;
        if (!(paramString instanceof Parcelable))
          break label211;
        paramBundle.putParcelable(RESULT_KEY, (Parcelable)paramString);
        AppMethodBeat.o(109700);
        return;
        j++;
        break;
      }
      label211: localObject2 = RESULT_KEY;
      if (paramString == null)
      {
        paramString = new a/v;
        paramString.<init>("null cannot be cast to non-null type java.io.Serializable");
        AppMethodBeat.o(109700);
        throw paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        Object localObject2;
        ab.e(TAG, "exception:%s", new Object[] { bo.l((Throwable)paramString) });
        label262: AppMethodBeat.o(109700);
        continue;
        paramBundle.putSerializable((String)localObject2, (Serializable)paramString);
        AppMethodBeat.o(109700);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.proxy.StoryAudioManagerProxy
 * JD-Core Version:    0.6.2
 */