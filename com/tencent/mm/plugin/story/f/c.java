package com.tencent.mm.plugin.story.f;

import a.f.a.m;
import a.f.a.q;
import a.y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.exoplayer2.g.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ak;
import com.tencent.mm.g.b.a.al;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.d.b.b;
import com.tencent.mm.plugin.story.e.c.a.a;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo.a;
import com.tencent.mm.plugin.story.model.audio.g.a;
import com.tencent.mm.plugin.story.model.i;
import com.tencent.mm.plugin.story.model.i.a;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.proxy.StoryAudioManagerProxy;
import com.tencent.mm.plugin.story.proxy.StoryAudioManagerProxy.a;
import com.tencent.mm.plugin.story.ui.StoryCaptureUI.b;
import com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer;
import com.tencent.mm.plugin.story.ui.view.editor.item.e;
import com.tencent.mm.plugin.story.ui.view.editor.item.f;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.protocal.protobuf.bqk;
import com.tencent.mm.protocal.protobuf.cej;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/EditorPresenter;", "Lcom/tencent/mm/plugin/story/contract/EditorContract$IPresenter;", "context", "Landroid/content/Context;", "uiNavigation", "Lcom/tencent/mm/plugin/story/ui/StoryCaptureUI$UINavigation;", "view", "Lcom/tencent/mm/plugin/story/contract/EditorContract$IView;", "(Landroid/content/Context;Lcom/tencent/mm/plugin/story/ui/StoryCaptureUI$UINavigation;Lcom/tencent/mm/plugin/story/contract/EditorContract$IView;)V", "TAG", "", "captureInfo", "Lcom/tencent/mm/plugin/story/data/StoryCaptureInfo;", "getContext", "()Landroid/content/Context;", "exoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "isFavorite", "", "isNotifyMoment", "loading", "Lcom/tencent/mm/plugin/story/presenter/EditorPresenter$StoryProgressDialog;", "mixAudio", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "muteOrigin", "showLoading", "com/tencent/mm/plugin/story/presenter/EditorPresenter$showLoading$1", "Lcom/tencent/mm/plugin/story/presenter/EditorPresenter$showLoading$1;", "startPerformance", "", "getUiNavigation", "()Lcom/tencent/mm/plugin/story/ui/StoryCaptureUI$UINavigation;", "getView", "()Lcom/tencent/mm/plugin/story/contract/EditorContract$IView;", "checkAudioCache", "", "callback", "Lkotlin/Function0;", "commit", "storyEditorData", "Lcom/tencent/mm/plugin/story/storage/StoryEditorData;", "thumbPath", "editorInfo", "Lcom/tencent/mm/protocal/protobuf/StoryMediaEditorInfo;", "onFinish", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "retId", "videoPath", "mediaDes", "needExport", "resId", "destroy", "getEditorItemList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "Lkotlin/collections/ArrayList;", "getMixer", "Lcom/tencent/mm/plugin/story/model/mix/StoryVideoMixer;", "editorItems", "mix", "mute", "notifyFavorite", "notifyMoment", "isNotify", "onBack", "onPlayerRepeat", "pause", "pauseAudio", "playAudio", "info", "prepareReport", "reset", "resume", "runMix", "runMixInBackground", "setup", "StoryProgressDialog", "plugin-story_release"})
public final class c
  implements com.tencent.mm.plugin.story.d.b.a
{
  final String TAG;
  final Context context;
  int ehv;
  com.tencent.mm.plugin.story.e.a rWx;
  private com.google.android.exoplayer2.v rYo;
  boolean rYp;
  boolean rYq;
  boolean rYr;
  AudioCacheInfo rYs;
  c.a rYt;
  c.j rYu;
  final StoryCaptureUI.b rYv;
  public final b.b rYw;

  public c(Context paramContext, StoryCaptureUI.b paramb, b.b paramb1)
  {
    AppMethodBeat.i(109553);
    this.context = paramContext;
    this.rYv = paramb;
    this.rYw = paramb1;
    this.TAG = "MicroMsg.Story.EditorPresenter";
    this.rWx = new com.tencent.mm.plugin.story.e.a();
    this.rYq = true;
    this.rYu = new c.j(this);
    AppMethodBeat.o(109553);
  }

  private final void czy()
  {
    AppMethodBeat.i(109547);
    com.tencent.mm.media.i.a locala = new com.tencent.mm.media.i.a("runMix");
    pause();
    Object localObject1 = new c.a();
    Object localObject2 = this.context;
    a.f.b.j.p(localObject2, "context");
    ((c.a)localObject1).a((Context)localObject2, true, (a.f.a.a)c.a.b.rYz);
    this.rYt = ((c.a)localObject1);
    Object localObject3;
    boolean bool;
    int j;
    int k;
    int m;
    if (this.rYp)
      if (this.rYs == null)
      {
        i = 0;
        this.rWx.rRI = i;
        this.rWx.rRJ = this.rYs;
        localObject2 = czz();
        localObject1 = U((ArrayList)localObject2);
        localObject3 = l.sac;
        localObject3 = l.a(this.rYw, this.rYs);
        bool = WXHardCoderJNI.hcEncodeVideoEnable;
        j = WXHardCoderJNI.hcEncodeVideoDelay;
        k = WXHardCoderJNI.hcEncodeVideoCPU;
        m = WXHardCoderJNI.hcEncodeVideoIO;
        if (!WXHardCoderJNI.hcEncodeVideoThr)
          break label251;
      }
    label251: for (int i = Process.myTid(); ; i = 0)
    {
      this.ehv = WXHardCoderJNI.startPerformance(bool, j, k, m, i, 35000, 603, WXHardCoderJNI.hcEncodeVideoAction, "MicroMsg.Media.StoryVideoMixer");
      ab.i("MicroMsg.Media.StoryVideoMixer", "hardcoder summerPerformance startPerformance: %s", new Object[] { Integer.valueOf(this.ehv) });
      ((com.tencent.mm.plugin.story.model.e.b)localObject1).a((q)new c.g(this, locala, (ArrayList)localObject2, (cej)localObject3));
      AppMethodBeat.o(109547);
      return;
      i = 2;
      break;
      if (this.rYs == null)
      {
        i = 1;
        break;
      }
      i = 3;
      break;
    }
  }

  public final boolean Ab()
  {
    AppMethodBeat.i(109551);
    boolean bool;
    if (this.rYw.aFF())
    {
      cxp();
      if (this.rYw.cxq())
      {
        AppMethodBeat.o(109551);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      Object localObject = com.tencent.mm.plugin.story.model.audio.b.rUx;
      com.tencent.mm.plugin.story.model.audio.b localb = com.tencent.mm.plugin.story.model.audio.b.cyS();
      if ((localb != null) && (localb.pvG != 0L))
      {
        localObject = new bqk();
        ((bqk)localObject).wSJ = localb.rUp;
        if (!localb.rUr)
          break label198;
        i = localb.cvd;
        locala = AudioCacheInfo.rUj;
        if (i != AudioCacheInfo.cyP())
          break label192;
      }
      label192: for (int i = 11; ; i = 5)
      {
        ((bqk)localObject).wSK = i;
        ((bqk)localObject).wSM = ((int)bo.anT());
        localb.cyQ();
        localb.rUs.add(localObject);
        ab.i(com.tencent.mm.plugin.story.model.audio.b.TAG, "record cancel " + com.tencent.mm.plugin.story.model.audio.c.a((bqk)localObject));
        localb.cyR();
        reset();
        this.rYv.bnN();
        AppMethodBeat.o(109551);
        bool = true;
        break;
      }
      label198: i = localb.cvd;
      AudioCacheInfo.a locala = AudioCacheInfo.rUj;
      if (i == AudioCacheInfo.cyP());
      for (i = 13; ; i = 7)
      {
        ((bqk)localObject).wSK = i;
        break;
      }
      bool = false;
      AppMethodBeat.o(109551);
    }
  }

  final com.tencent.mm.plugin.story.model.e.b U(ArrayList<com.tencent.mm.media.editor.a.b> paramArrayList)
  {
    AppMethodBeat.i(109548);
    float f1 = this.rYw.getItemContainer().getLeft();
    float f2 = this.rYw.getItemContainer().getTop();
    float f3 = this.rYw.getItemContainer().getRight();
    float f4 = this.rYw.getItemContainer().getBottom();
    long l = cb.aaE();
    com.tencent.mm.plugin.story.e.a locala = this.rWx;
    List localList = (List)paramArrayList;
    paramArrayList = com.tencent.mm.plugin.story.model.l.aau(String.valueOf(l));
    String str = com.tencent.mm.plugin.story.model.l.aav(String.valueOf(l));
    paramArrayList = new com.tencent.mm.plugin.story.model.e.b(locala, localList, new float[] { f1, f2, f3, f4 }, paramArrayList, str, (byte)0);
    AppMethodBeat.o(109548);
    return paramArrayList;
  }

  public final void a(com.tencent.mm.plugin.story.e.a parama)
  {
    AppMethodBeat.i(109540);
    a.f.b.j.p(parama, "captureInfo");
    this.rWx = parama;
    com.tencent.mm.plugin.story.model.audio.b.a locala = com.tencent.mm.plugin.story.model.audio.b.rUx;
    com.tencent.mm.plugin.story.model.audio.b.a(new com.tencent.mm.plugin.story.model.audio.b());
    this.rYw.a(parama.fbT, parama.rRG, parama.rRH, (a.f.a.a)new i(this));
    AppMethodBeat.o(109540);
  }

  public final void a(AudioCacheInfo paramAudioCacheInfo)
  {
    Object localObject1 = null;
    AppMethodBeat.i(109544);
    String str = this.TAG;
    StringBuilder localStringBuilder = new StringBuilder("play audio ");
    if (paramAudioCacheInfo != null);
    for (Object localObject2 = Integer.valueOf(paramAudioCacheInfo.rTW); ; localObject2 = null)
    {
      localStringBuilder = localStringBuilder.append(localObject2).append(' ');
      localObject2 = localObject1;
      if (paramAudioCacheInfo != null)
        localObject2 = paramAudioCacheInfo.musicUrl;
      ab.i(str, (String)localObject2);
      localObject2 = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAm().fn("");
      localObject2 = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAm().bg(0L);
      localObject2 = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAm().bh(0L);
      localObject2 = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAq().cb(0L);
      pauseAudio();
      this.rYs = paramAudioCacheInfo;
      if (paramAudioCacheInfo != null)
      {
        localObject2 = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAm().fn(String.valueOf(paramAudioCacheInfo.rTW));
        localObject2 = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAm().bg(paramAudioCacheInfo.position + 1);
        localObject2 = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAm().bh(paramAudioCacheInfo.rUb);
        localObject2 = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAq().cb(1L);
        localObject2 = com.tencent.mm.plugin.story.model.audio.b.rUx;
        localObject2 = com.tencent.mm.plugin.story.model.audio.b.cyS();
        if (localObject2 != null)
        {
          int i = paramAudioCacheInfo.rTW;
          int j = paramAudioCacheInfo.type;
          ((com.tencent.mm.plugin.story.model.audio.b)localObject2).rUp = i;
          ((com.tencent.mm.plugin.story.model.audio.b)localObject2).rUq = System.currentTimeMillis();
          ((com.tencent.mm.plugin.story.model.audio.b)localObject2).rUr = true;
          ((com.tencent.mm.plugin.story.model.audio.b)localObject2).cHY = false;
          ((com.tencent.mm.plugin.story.model.audio.b)localObject2).cvd = j;
        }
        localObject1 = new com.google.android.exoplayer2.g.c((com.google.android.exoplayer2.g.f.a)new a.a((com.google.android.exoplayer2.h.d)new com.google.android.exoplayer2.h.k()));
        localObject2 = com.google.android.exoplayer2.i.v.i(this.context, this.context.getString(2131296982));
        this.rYo = com.google.android.exoplayer2.g.a(this.context, (com.google.android.exoplayer2.g.h)localObject1);
        localObject1 = com.tencent.mm.plugin.story.model.audio.g.rUG;
        a.f.b.j.o(localObject2, "userAgent");
        paramAudioCacheInfo = g.a.a(paramAudioCacheInfo, (String)localObject2);
        localObject2 = this.rYo;
        if (localObject2 != null)
          ((com.google.android.exoplayer2.v)localObject2).aE(true);
        localObject2 = this.rYo;
        if (localObject2 != null)
          ((com.google.android.exoplayer2.v)localObject2).a(paramAudioCacheInfo);
        paramAudioCacheInfo = this.rYo;
        if (paramAudioCacheInfo != null)
          paramAudioCacheInfo.setRepeatMode(2);
        if (this.rYo != null)
        {
          localObject2 = this.rYw;
          paramAudioCacheInfo = this.rYo;
          if (paramAudioCacheInfo == null)
            a.f.b.j.dWJ();
          ((b.b)localObject2).setMusicPlayer(paramAudioCacheInfo);
        }
      }
      AppMethodBeat.o(109544);
      return;
    }
  }

  public final void bmz()
  {
    int i = 2;
    AppMethodBeat.i(109550);
    Object localObject1 = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAC().aT(System.currentTimeMillis());
    localObject1 = com.tencent.mm.plugin.story.model.audio.b.rUx;
    localObject1 = com.tencent.mm.plugin.story.model.audio.b.cyS();
    Object localObject2;
    int j;
    Object localObject3;
    if ((localObject1 != null) && (((com.tencent.mm.plugin.story.model.audio.b)localObject1).pvG != 0L))
    {
      localObject2 = new bqk();
      ((bqk)localObject2).wSJ = ((com.tencent.mm.plugin.story.model.audio.b)localObject1).rUp;
      if (!((com.tencent.mm.plugin.story.model.audio.b)localObject1).rUr)
        break label331;
      j = ((com.tencent.mm.plugin.story.model.audio.b)localObject1).cvd;
      localObject3 = AudioCacheInfo.rUj;
      if (j == AudioCacheInfo.cyP())
      {
        j = 10;
        ((bqk)localObject2).wSK = j;
        ((bqk)localObject2).wSM = ((int)bo.anT());
        ((com.tencent.mm.plugin.story.model.audio.b)localObject1).cyQ();
        ((com.tencent.mm.plugin.story.model.audio.b)localObject1).rUs.add(localObject2);
        ab.i(com.tencent.mm.plugin.story.model.audio.b.TAG, "record send " + com.tencent.mm.plugin.story.model.audio.c.a((bqk)localObject2));
        if (((com.tencent.mm.plugin.story.model.audio.b)localObject1).pvG != 0L)
        {
          localObject2 = ah.getContext();
          if (!com.tencent.mm.sdk.platformtools.at.isWifi((Context)localObject2))
            break label370;
          j = 1;
          label165: localObject2 = com.tencent.mm.plugin.report.service.h.pYm;
          long l1 = com.tencent.mm.plugin.story.model.audio.b.rUu;
          long l2 = com.tencent.mm.plugin.story.model.audio.b.rUv;
          long l3 = ((com.tencent.mm.plugin.story.model.audio.b)localObject1).pvG;
          if (!((com.tencent.mm.plugin.story.model.audio.b)localObject1).rUr)
            break label429;
          label192: ((com.tencent.mm.plugin.report.service.h)localObject2).e(16208, new Object[] { Integer.valueOf(j), Integer.valueOf(1), "", Long.valueOf(l1), Long.valueOf(l2), "", Long.valueOf(l3), Integer.valueOf(i), Integer.valueOf(((com.tencent.mm.plugin.story.model.audio.b)localObject1).rUp), "", "" });
        }
        ((com.tencent.mm.plugin.story.model.audio.b)localObject1).cyR();
      }
    }
    else
    {
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      if (j.a.cye() != com.tencent.mm.plugin.story.c.a.f.a.rRD)
        break label434;
      localObject1 = com.tencent.mm.plugin.story.g.g.sbU;
      com.tencent.mm.plugin.story.g.g.lK(true);
      czy();
      AppMethodBeat.o(109550);
    }
    while (true)
    {
      return;
      j = 2;
      break;
      label331: j = ((com.tencent.mm.plugin.story.model.audio.b)localObject1).cvd;
      localObject3 = AudioCacheInfo.rUj;
      if (j == AudioCacheInfo.cyP());
      for (j = 12; ; j = 6)
      {
        ((bqk)localObject2).wSK = j;
        break;
      }
      label370: if (com.tencent.mm.sdk.platformtools.at.is4G((Context)localObject2))
      {
        j = 6;
        break label165;
      }
      if (com.tencent.mm.sdk.platformtools.at.is3G((Context)localObject2))
      {
        j = 5;
        break label165;
      }
      if (com.tencent.mm.sdk.platformtools.at.is2G((Context)localObject2))
      {
        j = 4;
        break label165;
      }
      if (com.tencent.mm.sdk.platformtools.at.isWap((Context)localObject2))
      {
        j = 3;
        break label165;
      }
      j = 2;
      break label165;
      label429: i = 1;
      break label192;
      label434: localObject1 = com.tencent.mm.plugin.story.g.g.sbU;
      com.tencent.mm.plugin.story.g.g.lK(false);
      localObject1 = (a.f.a.a)new c.f(this);
      localObject2 = this.rYs;
      if ((localObject2 != null) && (!((AudioCacheInfo)localObject2).aIM))
      {
        ab.i(this.TAG, "checkAudioCache false");
        localObject3 = new c.a();
        ((c.a)localObject3).a(this.context, true, (a.f.a.a)new b(this, (AudioCacheInfo)localObject2));
        this.rYt = ((c.a)localObject3);
        localObject3 = com.tencent.mm.plugin.story.model.audio.g.rUG;
        com.tencent.mm.plugin.story.model.audio.g.cyW().a((AudioCacheInfo)localObject2, (m)new c.c(this, (AudioCacheInfo)localObject2, (a.f.a.a)localObject1));
        AppMethodBeat.o(109550);
      }
      else
      {
        ab.i(this.TAG, "checkAudioCache done");
        ((a.f.a.a)localObject1).invoke();
        AppMethodBeat.o(109550);
      }
    }
  }

  public final void cxp()
  {
    long l1 = 1L;
    AppMethodBeat.i(109546);
    Object localObject1 = ((Iterable)this.rYw.getItemContainer().getAllItemViews()).iterator();
    int i = 0;
    int j = 0;
    Object localObject2;
    int k;
    if (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.tencent.mm.media.editor.a.h)((Iterator)localObject1).next();
      k = j;
      if ((localObject2 instanceof com.tencent.mm.plugin.story.ui.view.editor.item.b))
        k = j + 1;
      if (!(localObject2 instanceof f))
        break label360;
      i++;
    }
    label275: label348: label354: label360: 
    while (true)
    {
      if ((localObject2 instanceof e))
      {
        com.tencent.mm.plugin.story.g.h localh = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAm().fo(((e)localObject2).getReportPositionString().toString());
        localh = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAm().fp(String.valueOf(((e)localObject2).getLatitude()));
        localh = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAm().fq(String.valueOf(((e)localObject2).getLongitude()));
        localObject2 = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAq().FX();
      }
      j = k;
      break;
      localObject1 = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAm().be(j);
      localObject1 = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAm().bf(i);
      localObject1 = com.tencent.mm.plugin.story.g.h.scu;
      localObject1 = com.tencent.mm.plugin.story.g.h.cAm();
      if (this.rYq)
      {
        l2 = 1L;
        ((al)localObject1).bk(l2);
        localObject1 = com.tencent.mm.plugin.story.g.h.scu;
        localObject1 = com.tencent.mm.plugin.story.g.h.cAm();
        localObject2 = this.rYs;
        if (localObject2 == null)
          break label348;
        k = ((AudioCacheInfo)localObject2).type;
        localObject2 = AudioCacheInfo.rUj;
        if (k != AudioCacheInfo.cyL())
          break label348;
        l2 = 1L;
        ((al)localObject1).bj(l2);
        localObject1 = com.tencent.mm.plugin.story.g.h.scu;
        localObject1 = com.tencent.mm.plugin.story.g.h.cAq();
        if (!this.rYq)
          break label354;
      }
      for (long l2 = l1; ; l2 = 0L)
      {
        ((com.tencent.mm.g.b.a.at)localObject1).cd(l2);
        localObject1 = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAq().bZ(j);
        localObject1 = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAq().ca(i);
        AppMethodBeat.o(109546);
        return;
        l2 = 0L;
        break;
        l2 = 0L;
        break label275;
      }
    }
  }

  final ArrayList<com.tencent.mm.media.editor.a.b> czz()
  {
    AppMethodBeat.i(109549);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((Iterable)this.rYw.getItemContainer().getAllItemViews()).iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.media.editor.a.b localb = ((com.tencent.mm.media.editor.a.h)localIterator.next()).UI();
      if (localb != null)
        localArrayList.add(localb);
    }
    AppMethodBeat.o(109549);
    return localArrayList;
  }

  public final void lt(boolean paramBoolean)
  {
    AppMethodBeat.i(109543);
    this.rYp = paramBoolean;
    this.rYw.getVideoPlayView().setMute(this.rYp);
    AppMethodBeat.o(109543);
  }

  public final void lu(boolean paramBoolean)
  {
    this.rYq = paramBoolean;
  }

  public final void lv(boolean paramBoolean)
  {
    this.rYr = paramBoolean;
  }

  public final void pause()
  {
    AppMethodBeat.i(109541);
    ab.c(this.TAG, "pause", new Object[0]);
    EditorItemContainer localEditorItemContainer = this.rYw.getItemContainer();
    int i = localEditorItemContainer.lnI.getChildCount();
    for (int j = 0; j < i; j++)
    {
      localObject = localEditorItemContainer.lnI.getChildAt(j);
      if ((localObject instanceof com.tencent.mm.plugin.story.ui.view.editor.item.b))
        ((com.tencent.mm.plugin.story.ui.view.editor.item.b)localObject).pause();
    }
    this.rYw.getVideoPlayView().pause();
    Object localObject = this.rYo;
    if (localObject != null)
    {
      ((com.google.android.exoplayer2.v)localObject).aE(false);
      AppMethodBeat.o(109541);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109541);
    }
  }

  public final void pauseAudio()
  {
    AppMethodBeat.i(109545);
    Object localObject = this.rYo;
    if ((localObject == null) || (((com.google.android.exoplayer2.v)localObject).pO() != 4))
    {
      localObject = com.tencent.mm.plugin.story.model.audio.b.rUx;
      localObject = com.tencent.mm.plugin.story.model.audio.b.cyS();
      if (localObject != null)
        ((com.tencent.mm.plugin.story.model.audio.b)localObject).cyQ();
      localObject = this.rYo;
      if (localObject != null)
        ((com.google.android.exoplayer2.v)localObject).stop();
      localObject = this.rYo;
      if (localObject != null)
        ((com.google.android.exoplayer2.v)localObject).release();
      this.rYo = null;
      this.rYs = null;
    }
    AppMethodBeat.o(109545);
  }

  public final void reset()
  {
    AppMethodBeat.i(109552);
    this.rYp = false;
    this.rYq = true;
    this.rYw.reset();
    this.rYw.getVideoPlayView().setMute(this.rYp);
    this.rYw.getVideoPlayView().stop();
    pauseAudio();
    this.rYs = null;
    this.rWx.reset();
    StoryAudioManagerProxy.a locala = StoryAudioManagerProxy.sas;
    StoryAudioManagerProxy.access$getInstance$cp().cancelAll();
    AppMethodBeat.o(109552);
  }

  public final void resume()
  {
    AppMethodBeat.i(109542);
    ab.c(this.TAG, "resume", new Object[0]);
    EditorItemContainer localEditorItemContainer = this.rYw.getItemContainer();
    int i = localEditorItemContainer.lnI.getChildCount();
    for (int j = 0; j < i; j++)
    {
      localObject = localEditorItemContainer.lnI.getChildAt(j);
      if ((localObject instanceof com.tencent.mm.plugin.story.ui.view.editor.item.b))
        ((com.tencent.mm.plugin.story.ui.view.editor.item.b)localObject).resume();
    }
    this.rYw.getVideoPlayView().start();
    Object localObject = this.rYo;
    if (localObject != null)
    {
      ((com.google.android.exoplayer2.v)localObject).aE(true);
      AppMethodBeat.o(109542);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109542);
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke", "com/tencent/mm/plugin/story/presenter/EditorPresenter$checkAudioCache$1$1"})
  static final class b extends a.f.b.k
    implements a.f.a.a<y>
  {
    b(c paramc, AudioCacheInfo paramAudioCacheInfo)
    {
      super();
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class h
    implements Runnable
  {
    h(c paramc)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(109536);
      final com.tencent.mm.media.i.a locala = new com.tencent.mm.media.i.a("runMixInBackground");
      this.rYB.pause();
      ab.i(this.rYB.TAG, "man pause ".concat(String.valueOf(locala)));
      long l1 = cb.aaE();
      Object localObject1 = this.rYB.czz();
      Object localObject2 = this.rYB.U((ArrayList)localObject1);
      Object localObject3 = this.rYB.rWx;
      a.f.b.j.p(localObject3, "captureInfo");
      try
      {
        localObject1 = ((com.tencent.mm.plugin.story.e.a)localObject3).fbU;
        i = ((com.tencent.mm.plugin.story.model.e.b)localObject2).eXL;
        long l2;
        Object localObject4;
        int j;
        label203: int k;
        if (TextUtils.isEmpty((CharSequence)localObject1))
          if (((com.tencent.mm.plugin.story.e.a)localObject3).rRG > 0L)
          {
            l2 = ((com.tencent.mm.plugin.story.e.a)localObject3).rRG;
            ab.i("MicroMsg.Media.StoryVideoMixer", "create thumb bitmap : ".concat(String.valueOf(l2)));
            if (((com.tencent.mm.plugin.story.e.a)localObject3).fbV)
              break label592;
            localObject1 = (com.tencent.mm.plugin.story.c.a.c.a)com.tencent.mm.plugin.story.c.a.c.rRk.Uw();
            ((com.tencent.mm.plugin.story.c.a.c.a)localObject1).aaa(((com.tencent.mm.plugin.story.e.a)localObject3).fbT);
            localObject4 = com.tencent.mm.plugin.mmsight.d.ag(((com.tencent.mm.plugin.story.e.a)localObject3).fbT, l2);
            if ((((com.tencent.mm.plugin.story.c.a.c.a)localObject1).eXL != 270) && (((com.tencent.mm.plugin.story.c.a.c.a)localObject1).eXL != 90))
              break label566;
            j = 1;
            if (j == 0)
              break label572;
            k = ((com.tencent.mm.plugin.story.c.a.c.a)localObject1).eTj;
            label215: if (j == 0)
              break label582;
            j = ((com.tencent.mm.plugin.story.c.a.c.a)localObject1).eTi;
            label227: localObject1 = Bitmap.createScaledBitmap((Bitmap)localObject4, k, j, true);
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>("createGraffitiThumb not capture, thumb size:[");
            a.f.b.j.o(localObject1, "thumb");
            ab.i("MicroMsg.Media.StoryVideoMixer", ((Bitmap)localObject1).getWidth() + ", " + ((Bitmap)localObject1).getHeight() + "], thumbRotate:" + i + ", drawingRect:" + Arrays.toString(((com.tencent.mm.plugin.story.model.e.b)localObject2).rWy));
            label315: localObject4 = i.rSv;
            ((com.tencent.mm.plugin.story.e.a)localObject3).aae(i.a.kY(cb.aaE()));
            localObject5 = ((com.tencent.mm.plugin.story.e.a)localObject3).fbU;
            localObject4 = localObject1;
            localObject1 = localObject5;
            label346: if (localObject4 != null)
              break label643;
            ab.e("MicroMsg.Media.StoryVideoMixer", "createGraffitiThumb thumb is null");
            localObject1 = com.tencent.mm.plugin.story.g.g.sbU;
            com.tencent.mm.plugin.story.g.g.cAj();
          }
        while (true)
        {
          ab.i(this.rYB.TAG, "man createGraffitiThumb ".concat(String.valueOf(locala)));
          localObject1 = l.sac;
          localObject1 = l.a(this.rYB.rYw, this.rYB.rYs);
          localObject4 = l.sac;
          localObject4 = l.a(this.rYB.rYw, this.rYB.rYp, this.rYB.rYs, this.rYB.rWx, l1, this.rYB.rYw.getLocation());
          ab.i(this.rYB.TAG, "man insertdone ".concat(String.valueOf(locala)));
          if (localObject4 == null)
            break label982;
          com.tencent.mm.ab.b.a("StoryCapture_commit", (a.f.a.a)new c.e(this.rYB, (com.tencent.mm.plugin.story.h.d)localObject4, this.rYB.rWx.fbU, (cej)localObject1, (a.f.a.b)new a(this, (cej)localObject1, (com.tencent.mm.plugin.story.h.d)localObject4, locala)));
          com.tencent.mm.ab.b.a((a.f.a.a)new c.h.b(this, (cej)localObject1, (com.tencent.mm.plugin.story.h.d)localObject4, locala));
          AppMethodBeat.o(109536);
          return;
          l2 = 0L;
          break;
          label566: j = 0;
          break label203;
          label572: k = ((com.tencent.mm.plugin.story.c.a.c.a)localObject1).eTi;
          break label215;
          label582: j = ((com.tencent.mm.plugin.story.c.a.c.a)localObject1).eTj;
          break label227;
          label592: localObject1 = com.tencent.mm.plugin.mmsight.d.ag(((com.tencent.mm.plugin.story.e.a)localObject3).fbT, l2);
          break label315;
          localObject4 = new android/graphics/BitmapFactory$Options;
          ((BitmapFactory.Options)localObject4).<init>();
          ab.i("MicroMsg.Media.StoryVideoMixer", "exist thumb bitmap ");
          ((BitmapFactory.Options)localObject4).inMutable = true;
          localObject4 = com.tencent.mm.sdk.platformtools.d.decodeFile((String)localObject1, (BitmapFactory.Options)localObject4);
          break label346;
          label643: localObject5 = com.tencent.mm.plugin.story.model.e.b.fL(((Bitmap)localObject4).getWidth(), ((Bitmap)localObject4).getHeight());
          Object localObject6 = com.tencent.mm.plugin.story.e.c.rRS;
          localObject6 = com.tencent.mm.plugin.story.e.c.a.aaj(((com.tencent.mm.plugin.story.e.a)localObject3).fbT);
          if ((((com.tencent.mm.plugin.story.e.a)localObject3).fbV) || (localObject6 == null) || (((c.a.a)localObject6).rRT))
            break label932;
          localObject3 = new com/tencent/mm/plugin/story/model/e/a;
          ((com.tencent.mm.plugin.story.model.e.a)localObject3).<init>(((com.tencent.mm.plugin.story.model.e.b)localObject2).rWy, ((com.tencent.mm.plugin.story.model.e.b)localObject2).eWG, ((Point)localObject5).x, ((Point)localObject5).y, ((c.a.a)localObject6).width, ((c.a.a)localObject6).height, i);
          ((com.tencent.mm.plugin.story.model.e.b)localObject2).rWw = ((com.tencent.mm.plugin.story.model.e.a)localObject3);
          localObject5 = ((com.tencent.mm.plugin.story.model.e.b)localObject2).rWw;
          if (localObject5 == null)
            a.f.b.j.avw("frameRetriever");
          ((com.tencent.mm.plugin.story.model.e.a)localObject5).start();
          localObject5 = (Bitmap)((com.tencent.mm.plugin.story.model.e.b)localObject2).eXh.am(Long.valueOf(1L));
          localObject2 = ((com.tencent.mm.plugin.story.model.e.b)localObject2).rWw;
          if (localObject2 == null)
            a.f.b.j.avw("frameRetriever");
          ((com.tencent.mm.plugin.story.model.e.a)localObject2).destroy();
          if (localObject5 != null)
          {
            localObject2 = new android/graphics/Canvas;
            ((Canvas)localObject2).<init>((Bitmap)localObject4);
            ((Canvas)localObject2).drawBitmap((Bitmap)localObject5, 0.0F, 0.0F, null);
          }
          com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject4, 70, Bitmap.CompressFormat.JPEG, (String)localObject1, true);
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("createGraffitiThumb : ");
          localObject1 = ((StringBuilder)localObject4).append((String)localObject1).append("   graffiti : ");
          if (localObject5 != null)
            break label976;
          bool = true;
          ab.i("MicroMsg.Media.StoryVideoMixer", bool);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          int i;
          Object localObject5;
          ab.printErrStackTrace("MicroMsg.Media.StoryVideoMixer", (Throwable)localException, "createGraffitiThumb error", new Object[0]);
          com.tencent.mm.plugin.story.g.g localg = com.tencent.mm.plugin.story.g.g.sbU;
          com.tencent.mm.plugin.story.g.g.cAj();
          continue;
          label932: localObject3 = new com/tencent/mm/plugin/story/model/e/a;
          ((com.tencent.mm.plugin.story.model.e.a)localObject3).<init>(((com.tencent.mm.plugin.story.model.e.b)localObject2).rWy, ((com.tencent.mm.plugin.story.model.e.b)localObject2).eWG, ((Point)localObject5).x, ((Point)localObject5).y, 0, 0, i);
          ((com.tencent.mm.plugin.story.model.e.b)localObject2).rWw = ((com.tencent.mm.plugin.story.model.e.a)localObject3);
          continue;
          label976: boolean bool = false;
          continue;
          label982: com.tencent.mm.ab.b.a((a.f.a.a)new c.h.1(this));
          ab.i(this.rYB.TAG, "error when runMixInBackground");
          AppMethodBeat.o(109536);
        }
      }
    }

    @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "storyLocalId", "", "invoke", "com/tencent/mm/plugin/story/presenter/EditorPresenter$runMixInBackground$1$1$1"})
    static final class a extends a.f.b.k
      implements a.f.a.b<Integer, y>
    {
      a(c.h paramh, cej paramcej, com.tencent.mm.plugin.story.h.d paramd, com.tencent.mm.media.i.a parama)
      {
        super();
      }
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class i extends a.f.b.k
    implements a.f.a.a<y>
  {
    i(c paramc)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.c
 * JD-Core Version:    0.6.2
 */