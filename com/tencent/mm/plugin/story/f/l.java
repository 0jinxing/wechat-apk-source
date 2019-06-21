package com.tencent.mm.plugin.story.f;

import a.k.m;
import a.v;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.editor.a.h;
import com.tencent.mm.media.g.i;
import com.tencent.mm.media.g.i.a;
import com.tencent.mm.model.cb;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.story.c.a.f.a;
import com.tencent.mm.plugin.story.d.b.b;
import com.tencent.mm.plugin.story.e.c.a.a;
import com.tencent.mm.plugin.story.h.a.c;
import com.tencent.mm.plugin.story.h.a.d;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.q;
import com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ayv;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.ced;
import com.tencent.mm.protocal.protobuf.cee;
import com.tencent.mm.protocal.protobuf.cei;
import com.tencent.mm.protocal.protobuf.cej;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.protocal.protobuf.cgu;
import com.tencent.mm.protocal.protobuf.cnw;
import com.tencent.mm.protocal.protobuf.hk;
import com.tencent.mm.protocal.protobuf.xy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.ak;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/StoryDataProtoUtil;", "", "()V", "TAG", "", "safeAreaRect", "Landroid/graphics/Rect;", "getSafeAreaRect", "()Landroid/graphics/Rect;", "setSafeAreaRect", "(Landroid/graphics/Rect;)V", "checkMD5", "", "file", "destMD5", "checkStoryEditorFileMD5", "storyEditorProtoData", "Lcom/tencent/mm/protocal/protobuf/StoryEditorProtoData;", "cleanDirtyData", "", "cleanNullData", "timeStamp", "", "cleanUnAvailableData", "data", "getAudioCacheInfo", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "getFakeVideoData", "getStoryCaptureInfo", "Lcom/tencent/mm/plugin/story/data/StoryCaptureInfo;", "getStoryDataEditorItem", "Ljava/util/ArrayList;", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "getStoryDataEditorItemReport", "dataType", "", "getStoryFileMD5", "Lcom/tencent/mm/protocal/protobuf/StoryEditorFileMD5;", "insertCompositeVideo", "Lcom/tencent/mm/plugin/story/storage/StoryEditorData;", "view", "Lcom/tencent/mm/plugin/story/contract/EditorContract$IView;", "muteOrigin", "mixAudio", "captureInfo", "location", "Lcom/tencent/mm/protocal/protobuf/StoryLocation;", "insertEditorInfo", "Lcom/tencent/mm/protocal/protobuf/StoryMediaEditorInfo;", "onUnSerializeStoryDataDrawingRect", "", "reshowEmojiEditorItem", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "viewMatrix", "Landroid/graphics/Matrix;", "validArea", "reshowEmojiItem", "itemLayout", "Landroid/view/ViewGroup;", "reshowPositionEditorItem", "cityName", "poiName", "reshowPositionItem", "reshowStoryDataEditorItem", "reshowStoryDataEditorItemFrame", "Lcom/tencent/mm/plugin/story/model/mix/StoryFrameRetriever;", "reshowTextEditorItem", "text", "", "textColor", "textBgColor", "reshowTextItem", "serializeStoryDataToByteArray", "", "signStoryDataMix", "localId", "mixVideoPath", "mixThumbPath", "needExport", "signStoryDataMixEnable", "storyEditorData", "signStoryDataMixError", "signStoryDataMixTime", "plugin-story_release"})
public final class l
{
  private static Rect eUN;
  public static final l sac;

  static
  {
    AppMethodBeat.i(109684);
    sac = new l();
    eUN = new Rect(0, 0, ak.hy(ah.getContext()).x, ak.hy(ah.getContext()).y);
    AppMethodBeat.o(109684);
  }

  public static com.tencent.mm.plugin.story.h.d a(b.b paramb, boolean paramBoolean, AudioCacheInfo paramAudioCacheInfo, com.tencent.mm.plugin.story.e.a parama, long paramLong, cei paramcei)
  {
    AppMethodBeat.i(109669);
    a.f.b.j.p(paramb, "view");
    a.f.b.j.p(parama, "captureInfo");
    a.f.b.j.p(paramcei, "location");
    com.tencent.mm.plugin.story.h.d locald;
    Object localObject;
    int i;
    try
    {
      new com.tencent.mm.ab.a("insertCompositeVideo");
      locald = new com/tencent/mm/plugin/story/h/d;
      locald.<init>();
      locald.field_mixFlag = 0;
      locald.field_mixRetryTime = 0;
      locald.field_timeStamp = paramLong;
      localObject = com.tencent.mm.plugin.story.model.j.rST;
      if (j.a.cye() == f.a.rRE)
      {
        i = 1;
        if (i == 0)
          break label631;
        i = 1;
        label86: locald.field_available = i;
        ab.i("MicroMsg.Media.StoryDataProtoUtil", "is running serialize the story to bytearray");
        if (!paramBoolean)
          break label643;
        if (paramAudioCacheInfo != null)
          break label637;
        i = 0;
        label111: localObject = new com/tencent/mm/protocal/protobuf/cee;
        ((cee)localObject).<init>();
        ab.i("MicroMsg.Media.StoryDataProtoUtil", "input the timeStamp is ".concat(String.valueOf(paramLong)));
        if (i == 3)
        {
          i.a locala = i.eYK;
          if (com.tencent.mm.vfs.e.ct(i.a.lY(parama.fbT)))
          {
            locala = i.eYK;
            ((cee)localObject).xdR = i.a.lY(parama.fbT);
          }
        }
        ((cee)localObject).timeStamp = paramLong;
        if (parama.rRG != -1L)
          break label659;
        paramLong = 0L;
        label198: ((cee)localObject).startTime = paramLong;
        ((cee)localObject).endTime = parama.rRH;
        ((cee)localObject).thumbPath = parama.fbU;
        ((cee)localObject).videoPath = parama.fbT;
        ((cee)localObject).fbV = parama.fbV;
        ((cee)localObject).smk = paramcei;
        paramcei = com.tencent.mm.plugin.sight.base.d.WR(parama.fbT);
        if ((paramcei != null) && ((parama.rRH == -1L) || (parama.rRH == 0L)))
          ((cee)localObject).endTime = paramcei.eWK;
        ((cee)localObject).eTb = i;
        ((cee)localObject).xdS = paramb.getItemContainer().getLeft();
        ((cee)localObject).xdU = paramb.getItemContainer().getTop();
        ((cee)localObject).xdT = paramb.getItemContainer().getRight();
        ((cee)localObject).xdV = paramb.getItemContainer().getBottom();
        parama = new java/util/LinkedList;
        parama.<init>();
        ((cee)localObject).xdW = parama;
        if (paramAudioCacheInfo != null)
        {
          ((cee)localObject).eYi = paramAudioCacheInfo.cachePath;
          ((cee)localObject).rTW = paramAudioCacheInfo.rTW;
          ((cee)localObject).musicUrl = paramAudioCacheInfo.musicUrl;
          ((cee)localObject).aIM = paramAudioCacheInfo.aIM;
          ((cee)localObject).rTZ = paramAudioCacheInfo.rTZ;
          ((cee)localObject).xdZ = paramAudioCacheInfo.position;
          ((cee)localObject).xea = paramAudioCacheInfo.rUb;
        }
        a.f.b.j.p(localObject, "storyEditorProtoData");
        paramAudioCacheInfo = new com/tencent/mm/protocal/protobuf/ced;
        paramAudioCacheInfo.<init>();
        paramAudioCacheInfo.xdP = com.tencent.mm.a.g.cz(((cee)localObject).xdR);
        paramAudioCacheInfo.xdO = com.tencent.mm.a.g.cz(((cee)localObject).eYi);
        paramAudioCacheInfo.xdN = com.tencent.mm.a.g.cz(((cee)localObject).videoPath);
        paramAudioCacheInfo.xdQ = com.tencent.mm.a.g.cz(((cee)localObject).thumbPath);
        ((cee)localObject).xdY = paramAudioCacheInfo;
        parama = ((Iterable)paramb.getItemContainer().getAllItemViews()).iterator();
        while (parama.hasNext())
        {
          paramb = ((h)parama.next()).UJ();
          if (paramb != null)
          {
            paramAudioCacheInfo = new com/tencent/mm/protocal/protobuf/hk;
            paramAudioCacheInfo.<init>();
            paramAudioCacheInfo.dataType = paramb.eUi.value;
            paramAudioCacheInfo.vKa = aa.ad(paramb.UG().toByteArray());
            ((cee)localObject).xdW.add(paramAudioCacheInfo);
          }
        }
      }
    }
    catch (Exception paramb)
    {
      ab.printErrStackTrace("MicroMsg.Media.StoryDataProtoUtil", (Throwable)paramb, "", new Object[0]);
      paramb = null;
      AppMethodBeat.o(109669);
    }
    while (true)
    {
      return paramb;
      i = 0;
      break;
      label631: i = 0;
      break label86;
      label637: i = 2;
      break label111;
      label643: if (paramAudioCacheInfo == null)
      {
        i = 1;
        break label111;
      }
      i = 3;
      break label111;
      label659: paramLong = parama.rRG;
      break label198;
      paramAudioCacheInfo = ((cee)localObject).toByteArray();
      paramb = new java/lang/StringBuilder;
      paramb.<init>("storyEditorItem ");
      ab.i("MicroMsg.Media.StoryDataProtoUtil", ((cee)localObject).videoPath + " thumb " + ((cee)localObject).thumbPath + " and result " + com.tencent.mm.vfs.e.ct(((cee)localObject).thumbPath) + " music " + ((cee)localObject).eYi + " ret " + bo.ga(paramAudioCacheInfo.length * 1L) + '}');
      a.f.b.j.o(paramAudioCacheInfo, "ret");
      a.f.b.j.p(paramAudioCacheInfo, "value");
      locald.field_baseItemData = paramAudioCacheInfo;
      paramb = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cxY().b((com.tencent.mm.sdk.e.c)locald);
      AppMethodBeat.o(109669);
      paramb = locald;
    }
  }

  public static cej a(b.b paramb, AudioCacheInfo paramAudioCacheInfo)
  {
    AppMethodBeat.i(109670);
    a.f.b.j.p(paramb, "view");
    cej localcej = new cej();
    Iterator localIterator = ((Iterable)paramb.getItemContainer().getAllItemViews()).iterator();
    while (localIterator.hasNext())
    {
      paramb = ((h)localIterator.next()).UJ();
      if (paramb != null)
      {
        int i = paramb.eUi.value;
        if (i == com.tencent.mm.media.editor.a.e.eUm.value)
        {
          if (paramb == null)
          {
            paramb = new v("null cannot be cast to non-null type com.tencent.mm.media.editor.item.TextItem");
            AppMethodBeat.o(109670);
            throw paramb;
          }
          localcej.xeh.add(String.valueOf(((com.tencent.mm.media.editor.a.j)paramb).text));
        }
        else if (i == com.tencent.mm.media.editor.a.e.eUn.value)
        {
          if (paramb == null)
          {
            paramb = new v("null cannot be cast to non-null type com.tencent.mm.media.editor.item.EmojiItem");
            AppMethodBeat.o(109670);
            throw paramb;
          }
          LinkedList localLinkedList = localcej.xeg;
          paramb = ((com.tencent.mm.media.editor.a.g)paramb).exP;
          if (paramb != null);
          for (paramb = paramb.Aq(); ; paramb = null)
          {
            localLinkedList.add(paramb);
            break;
          }
        }
      }
    }
    if (paramAudioCacheInfo != null)
    {
      localcej.xef = true;
      localcej.rTW = paramAudioCacheInfo.rTW;
      localcej.xdZ = paramAudioCacheInfo.position;
      localcej.xee = paramAudioCacheInfo.rUb;
    }
    while (true)
    {
      AppMethodBeat.o(109670);
      return localcej;
      localcej.xef = false;
    }
  }

  public static ArrayList<com.tencent.mm.media.editor.a.b> a(cee paramcee, Context paramContext)
  {
    AppMethodBeat.i(109671);
    a.f.b.j.p(paramcee, "storyEditorProtoData");
    a.f.b.j.p(paramContext, "context");
    ArrayList localArrayList = new ArrayList();
    ab.i("MicroMsg.Media.StoryDataProtoUtil", "get the editor data which is waiting for run mixing");
    paramcee = paramcee.xdW;
    a.f.b.j.o(paramcee, "storyEditorProtoData.baseItemData");
    Iterator localIterator1 = ((Iterable)paramcee).iterator();
    while (localIterator1.hasNext())
    {
      Object localObject1 = (hk)localIterator1.next();
      int i = ((hk)localObject1).dataType;
      Object localObject2;
      Object localObject3;
      Iterator localIterator2;
      if (i == com.tencent.mm.media.editor.a.e.eUm.value)
      {
        paramcee = (com.tencent.mm.bt.a)new cgu();
        localObject1 = ((hk)localObject1).vKa;
        a.f.b.j.o(localObject1, "it.itemData");
        localObject1 = ((SKBuiltinBuffer_t)localObject1).getBuffer();
        a.f.b.j.o(localObject1, "it.itemData.buffer");
        localObject1 = ((com.tencent.mm.bt.b)localObject1).getBytes();
        try
        {
          paramcee.parseFrom((byte[])localObject1);
          localObject2 = (cgu)paramcee;
          if (localObject2 == null)
            continue;
          ab.i("MicroMsg.Media.StoryDataProtoUtil", "text string is " + ((cgu)localObject2).text);
          localObject1 = new com.tencent.mm.plugin.story.ui.view.editor.item.f(paramContext).f((CharSequence)((cgu)localObject2).text, ((cgu)localObject2).textColor, ((cgu)localObject2).eUv);
          paramcee = new Matrix();
          localObject3 = new float[9];
          i = 0;
          localObject2 = ((cgu)localObject2).wCL.xls;
          a.f.b.j.o(localObject2, "it.matrix.value");
          localIterator2 = ((Iterable)localObject2).iterator();
          while (localIterator2.hasNext())
          {
            localObject2 = (Float)localIterator2.next();
            a.f.b.j.o(localObject2, "data");
            localObject3[i] = ((Float)localObject2).floatValue();
            i++;
          }
        }
        catch (Exception paramcee)
        {
          while (true)
          {
            ab.b("safeParser", "", new Object[] { paramcee });
            paramcee = null;
          }
          paramcee.setValues((float[])localObject3);
          localArrayList.add(new com.tencent.mm.media.editor.a.d((Bitmap)localObject1, paramcee));
        }
      }
      else if (i == com.tencent.mm.media.editor.a.e.eUn.value)
      {
        paramcee = (com.tencent.mm.bt.a)new xy();
        localObject1 = ((hk)localObject1).vKa;
        a.f.b.j.o(localObject1, "it.itemData");
        localObject1 = ((SKBuiltinBuffer_t)localObject1).getBuffer();
        a.f.b.j.o(localObject1, "it.itemData.buffer");
        localObject1 = ((com.tencent.mm.bt.b)localObject1).getBytes();
        try
        {
          paramcee.parseFrom((byte[])localObject1);
          localObject1 = (xy)paramcee;
          if (localObject1 == null)
            continue;
          ab.i("MicroMsg.Media.StoryDataProtoUtil", "emoji md5 is " + ((xy)localObject1).cvZ);
          paramcee = new Matrix();
          localObject3 = new float[9];
          i = 0;
          localObject2 = ((xy)localObject1).wdG.xls;
          a.f.b.j.o(localObject2, "it.editorMatrix.value");
          localIterator2 = ((Iterable)localObject2).iterator();
          while (localIterator2.hasNext())
          {
            localObject2 = (Float)localIterator2.next();
            a.f.b.j.o(localObject2, "data");
            localObject3[i] = ((Float)localObject2).floatValue();
            i++;
          }
        }
        catch (Exception paramcee)
        {
          while (true)
          {
            ab.b("safeParser", "", new Object[] { paramcee });
            paramcee = null;
          }
          paramcee.setValues((float[])localObject3);
          localObject3 = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
          a.f.b.j.o(localObject3, "MMKernel.plugin(IPluginEmoji::class.java)");
          localObject1 = ((com.tencent.mm.plugin.emoji.b.d)localObject3).getProvider().Je(((xy)localObject1).cvZ);
          a.f.b.j.o(localObject1, "MMKernel.plugin(IPluginE…der.getEmojiByMd5(it.md5)");
          localArrayList.add(new com.tencent.mm.media.editor.a.f((EmojiInfo)localObject1, paramcee));
        }
      }
      else if (i == com.tencent.mm.media.editor.a.e.eUo.value)
      {
        paramcee = (com.tencent.mm.bt.a)new ayv();
        localObject1 = ((hk)localObject1).vKa;
        a.f.b.j.o(localObject1, "it.itemData");
        localObject1 = ((SKBuiltinBuffer_t)localObject1).getBuffer();
        a.f.b.j.o(localObject1, "it.itemData.buffer");
        localObject1 = ((com.tencent.mm.bt.b)localObject1).getBytes();
        try
        {
          paramcee.parseFrom((byte[])localObject1);
          localObject1 = (ayv)paramcee;
          if (localObject1 != null)
          {
            ab.i("MicroMsg.Media.StoryDataProtoUtil", "location data is  " + ((ayv)localObject1).eUt + " - " + ((ayv)localObject1).eUu + " and matrix is " + ((ayv)localObject1).wCL.xls);
            paramcee = new Matrix();
            localObject3 = new float[9];
            i = 0;
            localObject2 = ((ayv)localObject1).wCL.xls;
            a.f.b.j.o(localObject2, "it.matrix.value");
            localIterator2 = ((Iterable)localObject2).iterator();
            while (localIterator2.hasNext())
            {
              localObject2 = (Float)localIterator2.next();
              a.f.b.j.o(localObject2, "data");
              localObject3[i] = ((Float)localObject2).floatValue();
              i++;
            }
          }
        }
        catch (Exception paramcee)
        {
          while (true)
          {
            ab.b("safeParser", "", new Object[] { paramcee });
            paramcee = null;
          }
          paramcee.setValues((float[])localObject3);
          localObject3 = new com.tencent.mm.plugin.story.ui.view.editor.item.e(paramContext);
          localObject2 = ((ayv)localObject1).eUt;
          a.f.b.j.o(localObject2, "it.cityName");
          localObject1 = ((ayv)localObject1).eUu;
          a.f.b.j.o(localObject1, "it.poiName");
          localArrayList.add(new com.tencent.mm.media.editor.a.d(((com.tencent.mm.plugin.story.ui.view.editor.item.e)localObject3).gD((String)localObject2, (String)localObject1), paramcee));
        }
      }
    }
    AppMethodBeat.o(109671);
    return localArrayList;
  }

  public static void a(long paramLong, com.tencent.mm.plugin.story.h.d paramd)
  {
    AppMethodBeat.i(109677);
    a.f.b.j.p(paramd, "storyEditorData");
    ab.i("MicroMsg.Media.StoryDataProtoUtil", "signStoryDataMixEnable ".concat(String.valueOf(paramLong)));
    if (paramd.cBG())
    {
      int i = paramd.field_mixFlag;
      Object localObject = a.d.sdv;
      paramd.field_mixFlag = (i | a.d.cBx());
      localObject = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cxY().b(paramLong, paramd);
    }
    AppMethodBeat.o(109677);
  }

  public static void a(long paramLong, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(109675);
    a.f.b.j.p(paramString1, "mixVideoPath");
    a.f.b.j.p(paramString2, "mixThumbPath");
    Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    com.tencent.mm.plugin.story.h.d locald = j.a.cxY().ls(paramLong);
    Object localObject2 = new StringBuilder("signStoryDataMix ").append(paramLong).append(" storyLocalId ");
    if (locald != null);
    int i;
    for (localObject1 = Integer.valueOf(locald.field_storyLocalId); ; localObject1 = null)
    {
      ab.i("MicroMsg.Media.StoryDataProtoUtil", localObject1 + ", needExport:" + paramBoolean);
      if (locald == null)
        break label723;
      i = locald.field_mixFlag;
      localObject1 = a.d.sdv;
      if (!com.tencent.mm.ab.b.cf(i, a.d.cBx()))
        break label723;
      ab.i("MicroMsg.Media.StoryDataProtoUtil", "sign the data " + paramLong + " is mix end");
      i = locald.field_mixFlag;
      localObject1 = a.d.sdv;
      locald.field_mixFlag = (i & (a.d.cBx() ^ 0xFFFFFFFF));
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cxY().b(paramLong, locald);
      if (paramBoolean)
      {
        localObject1 = com.tencent.mm.plugin.story.e.c.rRS;
        com.tencent.mm.plugin.story.e.c.a.aai(paramString1);
      }
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      localObject1 = j.a.cxT().Fe(locald.field_storyLocalId);
      if (localObject1 == null)
        break label713;
      i = ((com.tencent.mm.plugin.story.h.j)localObject1).field_localFlag;
      localObject2 = a.c.sds;
      ((com.tencent.mm.plugin.story.h.j)localObject1).field_localFlag = (i & (a.c.cBw() ^ 0xFFFFFFFF));
      ((com.tencent.mm.plugin.story.h.j)localObject1).cBS();
      localObject2 = q.rTk;
      localObject2 = new cek();
      localObject3 = new StringBuilder();
      localObject4 = com.tencent.mm.plugin.story.e.c.rRS;
      localObject3 = ((StringBuilder)localObject3).append(com.tencent.mm.plugin.story.e.c.cxr());
      localObject5 = cb.aaE() + '-' + bo.yz();
      localObject4 = a.k.d.UTF_8;
      if (localObject5 != null)
        break;
      paramString1 = new v("null cannot be cast to non-null type java.lang.String");
      AppMethodBeat.o(109675);
      throw paramString1;
    }
    Object localObject4 = ((String)localObject5).getBytes((Charset)localObject4);
    a.f.b.j.o(localObject4, "(this as java.lang.String).getBytes(charset)");
    ((cek)localObject2).Id = com.tencent.mm.a.g.x((byte[])localObject4);
    Object localObject3 = com.tencent.mm.plugin.story.model.l.rTg;
    localObject3 = com.tencent.mm.plugin.story.model.l.aat(((cek)localObject2).Id);
    localObject4 = com.tencent.mm.plugin.story.model.l.rTg;
    localObject4 = com.tencent.mm.plugin.story.model.l.aas(((cek)localObject2).Id);
    Object localObject5 = com.tencent.mm.plugin.story.model.l.rTg;
    com.tencent.mm.plugin.story.model.l.aax((String)localObject3);
    localObject5 = com.tencent.mm.plugin.story.model.l.rTg;
    com.tencent.mm.plugin.story.model.l.aax((String)localObject4);
    localObject5 = com.tencent.mm.plugin.story.model.l.rTg;
    com.tencent.mm.plugin.story.model.l.aay((String)localObject3);
    localObject5 = com.tencent.mm.plugin.story.model.l.rTg;
    com.tencent.mm.plugin.story.model.l.aay((String)localObject4);
    paramLong = com.tencent.mm.vfs.e.y(paramString1, (String)localObject3);
    long l = com.tencent.mm.vfs.e.y(paramString2, (String)localObject4);
    ab.i("MicroMsg.Media.StoryDataProtoUtil", "copy video from " + paramString1 + " to " + (String)localObject3 + ", ret:" + paramLong);
    ab.i("MicroMsg.Media.StoryDataProtoUtil", "copy thumb from " + paramString2 + " to " + (String)localObject4 + ", ret:" + l);
    paramString1 = com.tencent.mm.plugin.sight.base.d.WR((String)localObject3);
    float f;
    if (paramString1 != null)
    {
      f = paramString1.eWK / 1000.0F;
      ((cek)localObject2).duration = f;
      paramString1 = ((com.tencent.mm.plugin.story.h.j)localObject1).cBR();
      if (paramString1.xeA.wbK.size() != 0)
        break label736;
      paramString1.xeA.wbK.add(localObject2);
    }
    while (true)
    {
      ((com.tencent.mm.plugin.story.h.j)localObject1).b(paramString1);
      paramString1 = com.tencent.mm.plugin.story.model.j.rST;
      i = j.a.cxT().a(locald.field_storyLocalId, (com.tencent.mm.plugin.story.h.j)localObject1);
      ab.i("MicroMsg.Media.StoryDataProtoUtil", "update mix storyInfo " + locald.field_storyLocalId + " newVideoPath:" + (String)localObject3 + "  newThumbPath:" + (String)localObject4 + " ret:" + i);
      label713: paramString1 = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cya().checkPost();
      label723: AppMethodBeat.o(109675);
      return;
      f = 0.0F;
      break;
      label736: paramString1.xeA.wbK.set(0, localObject2);
    }
  }

  public static void a(cee paramcee, Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(109672);
    a.f.b.j.p(paramcee, "storyEditorProtoData");
    a.f.b.j.p(paramContext, "context");
    a.f.b.j.p(paramViewGroup, "itemLayout");
    ab.i("MicroMsg.Media.StoryDataProtoUtil", "reshow the fake story which has editor item");
    Object localObject1 = (com.tencent.mm.plugin.story.c.a.c.a)com.tencent.mm.plugin.story.c.a.c.rRk.Uw();
    Object localObject2 = paramcee.videoPath;
    a.f.b.j.o(localObject2, "storyEditorProtoData.videoPath");
    ((com.tencent.mm.plugin.story.c.a.c.a)localObject1).aaa((String)localObject2);
    localObject2 = paramcee.xdW;
    a.f.b.j.o(localObject2, "storyEditorProtoData.baseItemData");
    localObject1 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject5 = (hk)((Iterator)localObject1).next();
      int i = ((hk)localObject5).dataType;
      Object localObject6;
      Object localObject7;
      Float localFloat;
      Object localObject3;
      if (i == com.tencent.mm.media.editor.a.e.eUm.value)
      {
        localObject2 = (com.tencent.mm.bt.a)new cgu();
        localObject5 = ((hk)localObject5).vKa;
        a.f.b.j.o(localObject5, "it.itemData");
        localObject5 = ((SKBuiltinBuffer_t)localObject5).getBuffer();
        a.f.b.j.o(localObject5, "it.itemData.buffer");
        localObject5 = ((com.tencent.mm.bt.b)localObject5).getBytes();
        try
        {
          ((com.tencent.mm.bt.a)localObject2).parseFrom((byte[])localObject5);
          localObject5 = (cgu)localObject2;
          if (localObject5 == null)
            continue;
          ab.i("MicroMsg.Media.StoryDataProtoUtil", "text string is " + ((cgu)localObject5).text);
          localObject2 = new Matrix();
          localObject6 = new float[9];
          i = 0;
          localObject7 = ((cgu)localObject5).wCL.xls;
          a.f.b.j.o(localObject7, "it.matrix.value");
          localObject7 = ((Iterable)localObject7).iterator();
          while (((Iterator)localObject7).hasNext())
          {
            localFloat = (Float)((Iterator)localObject7).next();
            a.f.b.j.o(localFloat, "data");
            localObject6[i] = localFloat.floatValue();
            i++;
          }
        }
        catch (Exception localException1)
        {
          while (true)
          {
            ab.b("safeParser", "", new Object[] { localException1 });
            localObject3 = null;
          }
          ((Matrix)localObject3).setValues((float[])localObject6);
          al.d((Runnable)new l.a((cgu)localObject5, (Matrix)localObject3, paramContext, paramViewGroup, paramcee));
        }
      }
      else
      {
        Object localObject4;
        if (i == com.tencent.mm.media.editor.a.e.eUn.value)
        {
          localObject3 = (com.tencent.mm.bt.a)new xy();
          localObject5 = ((hk)localObject5).vKa;
          a.f.b.j.o(localObject5, "it.itemData");
          localObject5 = ((SKBuiltinBuffer_t)localObject5).getBuffer();
          a.f.b.j.o(localObject5, "it.itemData.buffer");
          localObject5 = ((com.tencent.mm.bt.b)localObject5).getBytes();
          try
          {
            ((com.tencent.mm.bt.a)localObject3).parseFrom((byte[])localObject5);
            localObject5 = (xy)localObject3;
            if (localObject5 == null)
              continue;
            ab.i("MicroMsg.Media.StoryDataProtoUtil", "emoji md5 is " + ((xy)localObject5).cvZ);
            localObject6 = new Matrix();
            localObject3 = new float[9];
            i = 0;
            if (((xy)localObject5).wdH == null)
              continue;
            localObject7 = ((xy)localObject5).wdH.xls;
            a.f.b.j.o(localObject7, "it.showMatrix.value");
            localObject7 = ((Iterable)localObject7).iterator();
            while (((Iterator)localObject7).hasNext())
            {
              localFloat = (Float)((Iterator)localObject7).next();
              a.f.b.j.o(localFloat, "data");
              localObject3[i] = localFloat.floatValue();
              i++;
            }
          }
          catch (Exception localException2)
          {
            while (true)
            {
              ab.b("safeParser", "", new Object[] { localException2 });
              localObject4 = null;
            }
            ((Matrix)localObject6).setValues((float[])localObject4);
            al.d((Runnable)new l.b((xy)localObject5, (Matrix)localObject6, new Rect(paramcee.xdS, paramcee.xdU, paramcee.xdT, paramcee.xdV), paramContext, paramViewGroup, paramcee));
          }
        }
        else if (i == com.tencent.mm.media.editor.a.e.eUo.value)
        {
          localObject4 = (com.tencent.mm.bt.a)new ayv();
          localObject5 = ((hk)localObject5).vKa;
          a.f.b.j.o(localObject5, "it.itemData");
          localObject5 = ((SKBuiltinBuffer_t)localObject5).getBuffer();
          a.f.b.j.o(localObject5, "it.itemData.buffer");
          localObject5 = ((com.tencent.mm.bt.b)localObject5).getBytes();
          try
          {
            ((com.tencent.mm.bt.a)localObject4).parseFrom((byte[])localObject5);
            localObject6 = (ayv)localObject4;
            if (localObject6 != null)
            {
              ab.i("MicroMsg.Media.StoryDataProtoUtil", "reshow location data is  " + ((ayv)localObject6).eUt + " - " + ((ayv)localObject6).eUu + " and matrix is " + ((ayv)localObject6).wCL.xls);
              localObject4 = new Matrix();
              localObject5 = new float[9];
              i = 0;
              localObject7 = ((ayv)localObject6).wCL.xls;
              a.f.b.j.o(localObject7, "it.matrix.value");
              localObject7 = ((Iterable)localObject7).iterator();
              while (((Iterator)localObject7).hasNext())
              {
                localFloat = (Float)((Iterator)localObject7).next();
                a.f.b.j.o(localFloat, "data");
                localObject5[i] = localFloat.floatValue();
                i++;
              }
            }
          }
          catch (Exception localException3)
          {
            Matrix localMatrix;
            while (true)
            {
              ab.b("safeParser", "", new Object[] { localException3 });
              localMatrix = null;
            }
            localMatrix.setValues((float[])localObject5);
            al.d((Runnable)new l.c((ayv)localObject6, localMatrix, paramContext, paramViewGroup, paramcee));
          }
        }
      }
    }
    AppMethodBeat.o(109672);
  }

  public static float[] a(cee paramcee)
  {
    AppMethodBeat.i(109674);
    a.f.b.j.p(paramcee, "storyEditorProtoData");
    float f1 = paramcee.xdS;
    float f2 = paramcee.xdU;
    float f3 = paramcee.xdT;
    float f4 = paramcee.xdV;
    AppMethodBeat.o(109674);
    return new float[] { f1, f2, f3, f4 };
  }

  public static com.tencent.mm.plugin.story.model.e.a b(cee paramcee, Context paramContext)
  {
    AppMethodBeat.i(109673);
    a.f.b.j.p(paramcee, "storyEditorProtoData");
    a.f.b.j.p(paramContext, "context");
    ab.i("MicroMsg.Media.StoryDataProtoUtil", "reshow the fake story as frame retriever");
    com.tencent.mm.plugin.story.c.a.c.a locala = (com.tencent.mm.plugin.story.c.a.c.a)com.tencent.mm.plugin.story.c.a.c.rRk.Uw();
    Object localObject1 = paramcee.videoPath;
    a.f.b.j.o(localObject1, "storyEditorProtoData.videoPath");
    locala.aaa((String)localObject1);
    List localList = (List)new ArrayList();
    localObject1 = paramcee.xdW;
    a.f.b.j.o(localObject1, "storyEditorProtoData.baseItemData");
    Iterator localIterator = ((Iterable)localObject1).iterator();
    int k;
    while (localIterator.hasNext())
    {
      Object localObject5 = (hk)localIterator.next();
      i = ((hk)localObject5).dataType;
      Object localObject6;
      Object localObject7;
      Object localObject8;
      Object localObject2;
      if (i == com.tencent.mm.media.editor.a.e.eUm.value)
      {
        localObject1 = (com.tencent.mm.bt.a)new cgu();
        localObject5 = ((hk)localObject5).vKa;
        a.f.b.j.o(localObject5, "it.itemData");
        localObject5 = ((SKBuiltinBuffer_t)localObject5).getBuffer();
        a.f.b.j.o(localObject5, "it.itemData.buffer");
        localObject5 = ((com.tencent.mm.bt.b)localObject5).getBytes();
        int j;
        try
        {
          ((com.tencent.mm.bt.a)localObject1).parseFrom((byte[])localObject5);
          localObject5 = (cgu)localObject1;
          if (localObject5 == null)
            continue;
          ab.i("MicroMsg.Media.StoryDataProtoUtil", "text string is " + ((cgu)localObject5).text);
          localObject1 = new Matrix();
          localObject6 = new float[9];
          i = 0;
          localObject7 = ((cgu)localObject5).wCL.xls;
          a.f.b.j.o(localObject7, "it.matrix.value");
          localObject8 = ((Iterable)localObject7).iterator();
          while (((Iterator)localObject8).hasNext())
          {
            localObject7 = (Float)((Iterator)localObject8).next();
            a.f.b.j.o(localObject7, "data");
            localObject6[i] = ((Float)localObject7).floatValue();
            i++;
          }
        }
        catch (Exception localException1)
        {
          while (true)
          {
            ab.b("safeParser", "", new Object[] { localException1 });
            localObject2 = null;
          }
          ((Matrix)localObject2).setValues((float[])localObject6);
          localObject6 = (CharSequence)((cgu)localObject5).text;
          j = ((cgu)localObject5).textColor;
          k = ((cgu)localObject5).eUv;
          ab.i("MicroMsg.Media.StoryDataProtoUtil", "fake story reshow the text editor item");
          if (localObject6 == null)
            break label389;
        }
        if (m.ar((CharSequence)localObject6))
        {
          label389: i = 1;
          label392: if (i == 0)
            break label421;
        }
        for (localObject2 = null; ; localObject2 = ((com.tencent.mm.plugin.story.ui.view.editor.item.f)localObject5).UI())
        {
          if (localObject2 == null)
            break label450;
          localList.add(localObject2);
          break;
          i = 0;
          break label392;
          label421: localObject5 = new com.tencent.mm.plugin.story.ui.view.editor.item.f(paramContext);
          ((com.tencent.mm.plugin.story.ui.view.editor.item.f)localObject5).a((CharSequence)localObject6, j, k, (Matrix)localObject2);
        }
      }
      else
      {
        label450: Object localObject3;
        if (i == com.tencent.mm.media.editor.a.e.eUn.value)
        {
          localObject2 = (com.tencent.mm.bt.a)new xy();
          localObject5 = ((hk)localObject5).vKa;
          a.f.b.j.o(localObject5, "it.itemData");
          localObject5 = ((SKBuiltinBuffer_t)localObject5).getBuffer();
          a.f.b.j.o(localObject5, "it.itemData.buffer");
          localObject5 = ((com.tencent.mm.bt.b)localObject5).getBytes();
          try
          {
            ((com.tencent.mm.bt.a)localObject2).parseFrom((byte[])localObject5);
            localObject5 = (xy)localObject2;
            if (localObject5 == null)
              continue;
            ab.i("MicroMsg.Media.StoryDataProtoUtil", "emoji md5 is " + ((xy)localObject5).cvZ);
            localObject2 = new Matrix();
            localObject6 = new float[9];
            i = 0;
            if (((xy)localObject5).wdH == null)
              continue;
            localObject7 = ((xy)localObject5).wdH.xls;
            a.f.b.j.o(localObject7, "it.showMatrix.value");
            localObject7 = ((Iterable)localObject7).iterator();
            while (((Iterator)localObject7).hasNext())
            {
              localObject8 = (Float)((Iterator)localObject7).next();
              a.f.b.j.o(localObject8, "data");
              localObject6[i] = ((Float)localObject8).floatValue();
              i++;
            }
          }
          catch (Exception localException2)
          {
            while (true)
            {
              ab.b("safeParser", "", new Object[] { localException2 });
              localObject3 = null;
            }
            ((Matrix)localObject3).setValues((float[])localObject6);
            new Rect(paramcee.xdS, paramcee.xdU, paramcee.xdT, paramcee.xdV);
            localObject6 = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
            a.f.b.j.o(localObject6, "MMKernel.plugin(IPluginEmoji::class.java)");
            localObject5 = ((com.tencent.mm.plugin.emoji.b.d)localObject6).getProvider().Je(((xy)localObject5).cvZ);
            a.f.b.j.o(localObject5, "MMKernel.plugin(IPluginE…der.getEmojiByMd5(it.md5)");
            ab.i("MicroMsg.Media.StoryDataProtoUtil", "fake story reshow the emoji editor item");
            localObject6 = new com.tencent.mm.plugin.story.ui.view.editor.item.b(paramContext, true);
            ((com.tencent.mm.plugin.story.ui.view.editor.item.b)localObject6).setViewMatrix((Matrix)localObject3);
            ((com.tencent.mm.plugin.story.ui.view.editor.item.b)localObject6).setEmojiInfo((EmojiInfo)localObject5);
            localObject3 = ((com.tencent.mm.plugin.story.ui.view.editor.item.b)localObject6).UI();
          }
          if (localObject3 != null)
            localList.add(localObject3);
        }
        else if (i == com.tencent.mm.media.editor.a.e.eUo.value)
        {
          localObject3 = (com.tencent.mm.bt.a)new ayv();
          localObject5 = ((hk)localObject5).vKa;
          a.f.b.j.o(localObject5, "it.itemData");
          localObject5 = ((SKBuiltinBuffer_t)localObject5).getBuffer();
          a.f.b.j.o(localObject5, "it.itemData.buffer");
          localObject5 = ((com.tencent.mm.bt.b)localObject5).getBytes();
          Object localObject4;
          try
          {
            ((com.tencent.mm.bt.a)localObject3).parseFrom((byte[])localObject5);
            localObject5 = (ayv)localObject3;
            if (localObject5 == null)
              continue;
            ab.i("MicroMsg.Media.StoryDataProtoUtil", "reshow location data is  " + ((ayv)localObject5).eUt + " - " + ((ayv)localObject5).eUu + " and matrix is " + ((ayv)localObject5).wCL.xls);
            localObject3 = new Matrix();
            localObject6 = new float[9];
            i = 0;
            localObject7 = ((ayv)localObject5).wCL.xls;
            a.f.b.j.o(localObject7, "it.matrix.value");
            localObject7 = ((Iterable)localObject7).iterator();
            while (((Iterator)localObject7).hasNext())
            {
              localObject8 = (Float)((Iterator)localObject7).next();
              a.f.b.j.o(localObject8, "data");
              localObject6[i] = ((Float)localObject8).floatValue();
              i++;
            }
          }
          catch (Exception localException3)
          {
            while (true)
            {
              ab.b("safeParser", "", new Object[] { localException3 });
              localObject4 = null;
            }
            ((Matrix)localObject4).setValues((float[])localObject6);
            localObject6 = ((ayv)localObject5).eUt;
            a.f.b.j.o(localObject6, "it.cityName");
            localObject5 = ((ayv)localObject5).eUu;
            a.f.b.j.o(localObject5, "it.poiName");
            ab.i("MicroMsg.Media.StoryDataProtoUtil", "fake story reshow the position editor item");
            localObject7 = new com.tencent.mm.plugin.story.ui.view.editor.item.e(paramContext);
            ((com.tencent.mm.plugin.story.ui.view.editor.item.e)localObject7).a((String)localObject6, (String)localObject5, (Matrix)localObject4);
            localObject4 = ((com.tencent.mm.plugin.story.ui.view.editor.item.e)localObject7).UI();
          }
          if (localObject4 != null)
            localList.add(localObject4);
        }
      }
    }
    int i = locala.eXL;
    if ((i == 270) || (i == 90))
    {
      k = 1;
      if (k == 0)
        break label1217;
      i = locala.eTj;
      label1180: if (k == 0)
        break label1226;
      k = locala.eTi;
      label1191: if (localList.size() != 0)
        break label1235;
      paramcee = null;
      AppMethodBeat.o(109673);
    }
    while (true)
    {
      return paramcee;
      k = 0;
      break;
      label1217: i = locala.eTi;
      break label1180;
      label1226: k = locala.eTj;
      break label1191;
      label1235: if ((i == 0) || (k == 0))
      {
        ab.i("MicroMsg.Media.StoryDataProtoUtil", "error width " + i + " height " + k);
        paramcee = null;
        AppMethodBeat.o(109673);
      }
      else
      {
        paramContext = com.tencent.mm.plugin.story.e.c.rRS;
        paramContext = paramcee.videoPath;
        a.f.b.j.o(paramContext, "storyEditorProtoData.videoPath");
        paramContext = com.tencent.mm.plugin.story.e.c.a.aaj(paramContext);
        if ((!paramcee.fbV) && (paramContext != null) && (!paramContext.rRT))
        {
          paramcee = new com.tencent.mm.plugin.story.model.e.a(a(paramcee), localList, i, k, paramContext.width, paramContext.height, 0);
          AppMethodBeat.o(109673);
        }
        else
        {
          paramcee = new com.tencent.mm.plugin.story.model.e.a(a(paramcee), localList, i, k, 0, 0, 0);
          AppMethodBeat.o(109673);
        }
      }
    }
  }

  public static void b(cee paramcee)
  {
    Object localObject1 = null;
    AppMethodBeat.i(109682);
    ab.c("MicroMsg.Media.StoryDataProtoUtil", "cleanUnAvailableData, videoPath " + paramcee + "?.videoPath", new Object[0]);
    if ((paramcee != null) && (paramcee.fbV == true))
      com.tencent.mm.vfs.e.deleteFile(paramcee.videoPath);
    if (paramcee != null)
    {
      localObject2 = paramcee.xdR;
      com.tencent.mm.vfs.e.deleteFile((String)localObject2);
      if (paramcee == null)
        break label116;
    }
    label116: for (Object localObject2 = paramcee.eYi; ; localObject2 = null)
    {
      com.tencent.mm.vfs.e.deleteFile((String)localObject2);
      localObject2 = localObject1;
      if (paramcee != null)
        localObject2 = paramcee.thumbPath;
      com.tencent.mm.vfs.e.deleteFile((String)localObject2);
      AppMethodBeat.o(109682);
      return;
      localObject2 = null;
      break;
    }
  }

  public static Rect czI()
  {
    return eUN;
  }

  public static void czJ()
  {
    AppMethodBeat.i(109679);
    ab.i("MicroMsg.Media.StoryDataProtoUtil", "run clean dirty data which is the ismixed equals true");
    Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxY();
    localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    Object localObject2 = j.a.cxY();
    localObject1 = new ArrayList();
    localObject2 = ((com.tencent.mm.plugin.story.h.e)localObject2).bSd;
    Object localObject3 = new StringBuilder("mixFlag&");
    a.d locald = a.d.sdv;
    localObject3 = ((com.tencent.mm.sdk.e.e)localObject2).query("StoryEditorInfo", null, a.d.cBx() + "=0", null, null, null, null);
    if ((localObject3 != null) && (((Cursor)localObject3).moveToFirst()))
    {
      do
      {
        localObject2 = new com.tencent.mm.plugin.story.h.d();
        ((com.tencent.mm.plugin.story.h.d)localObject2).d((Cursor)localObject3);
        ((ArrayList)localObject1).add(Long.valueOf(((com.tencent.mm.plugin.story.h.d)localObject2).field_timeStamp));
      }
      while (((Cursor)localObject3).moveToNext());
      ((Cursor)localObject3).close();
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Long)((Iterator)localObject1).next();
      ab.i("MicroMsg.Media.StoryDataProtoUtil", "delete the source data which is mix up");
      a.f.b.j.o(localObject2, "i");
      b(lh(((Long)localObject2).longValue()));
    }
    AppMethodBeat.o(109679);
  }

  public static boolean gA(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(109683);
    a.f.b.j.p(paramString1, "file");
    paramString1 = com.tencent.mm.a.g.cz(paramString1);
    if ((paramString1 != null) && (paramString2 != null) && (m.I(paramString2, paramString1, true)))
      AppMethodBeat.o(109683);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109683);
    }
  }

  public static void lf(long paramLong)
  {
    AppMethodBeat.i(109676);
    ab.i("MicroMsg.Media.StoryDataProtoUtil", "signStoryDataMixError ".concat(String.valueOf(paramLong)));
    Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    localObject1 = j.a.cxY().ls(paramLong);
    if ((localObject1 != null) && (((com.tencent.mm.plugin.story.h.d)localObject1).cBG()))
    {
      int i = ((com.tencent.mm.plugin.story.h.d)localObject1).field_mixFlag;
      Object localObject2 = a.d.sdv;
      ((com.tencent.mm.plugin.story.h.d)localObject1).field_mixFlag = (i & (a.d.cBx() ^ 0xFFFFFFFF));
      i = ((com.tencent.mm.plugin.story.h.d)localObject1).field_mixFlag;
      localObject2 = a.d.sdv;
      ((com.tencent.mm.plugin.story.h.d)localObject1).field_mixFlag = (i | a.d.cBy());
      localObject2 = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cxY().b(paramLong, (com.tencent.mm.plugin.story.h.d)localObject1);
      localObject2 = com.tencent.mm.plugin.story.model.j.rST;
      localObject2 = j.a.cxT().Fe(((com.tencent.mm.plugin.story.h.d)localObject1).field_storyLocalId);
      if (localObject2 != null)
      {
        ((com.tencent.mm.plugin.story.h.j)localObject2).cqY();
        j.a locala = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cxT().a(((com.tencent.mm.plugin.story.h.d)localObject1).field_storyLocalId, (com.tencent.mm.plugin.story.h.j)localObject2);
      }
    }
    AppMethodBeat.o(109676);
  }

  public static void lg(long paramLong)
  {
    AppMethodBeat.i(109678);
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    localObject = j.a.cxY().ls(paramLong);
    if ((localObject != null) && (((com.tencent.mm.plugin.story.h.d)localObject).cBG()))
    {
      ((com.tencent.mm.plugin.story.h.d)localObject).field_mixRetryTime += 1;
      j.a locala = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cxY().b(paramLong, (com.tencent.mm.plugin.story.h.d)localObject);
    }
    AppMethodBeat.o(109678);
  }

  public static cee lh(long paramLong)
  {
    cee localcee1 = null;
    AppMethodBeat.i(109680);
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    Cursor localCursor = j.a.cxY().bSd.query("StoryEditorInfo", null, "timeStamp=".concat(String.valueOf(paramLong)), null, null, null, null);
    if (localCursor != null)
      if (localCursor.moveToFirst())
      {
        localObject = new com.tencent.mm.plugin.story.h.d();
        ((com.tencent.mm.plugin.story.h.d)localObject).d(localCursor);
        localCursor.close();
      }
    while (true)
    {
      if ((localObject != null) && (((com.tencent.mm.plugin.story.h.d)localObject).cBG()))
      {
        ab.i("MicroMsg.Media.StoryDataProtoUtil", "is running mix and use the editor data to show " + ((com.tencent.mm.plugin.story.h.d)localObject).field_mixFlag);
        localcee1 = new cee();
      }
      while (true)
      {
        try
        {
          localObject = ((com.tencent.mm.plugin.story.h.d)localObject).field_baseItemData;
          a.f.b.j.o(localObject, "field_baseItemData");
          localcee1.parseFrom((byte[])localObject);
          AppMethodBeat.o(109680);
          localObject = localcee1;
          return localObject;
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.Media.StoryDataProtoUtil", (Throwable)localException, "", new Object[0]);
          continue;
        }
        ab.i("MicroMsg.Media.StoryDataProtoUtil", "has no editor data ".concat(String.valueOf(paramLong)));
        AppMethodBeat.o(109680);
        localcee2 = localcee1;
      }
      cee localcee2 = null;
      break;
      localcee2 = null;
    }
  }

  public static void li(long paramLong)
  {
    AppMethodBeat.i(109681);
    ab.i("MicroMsg.Media.StoryDataProtoUtil", "run clean null data");
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxY().bSd.delete("StoryEditorInfo", "timeStamp=".concat(String.valueOf(paramLong)), null);
    AppMethodBeat.o(109681);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.l
 * JD-Core Version:    0.6.2
 */