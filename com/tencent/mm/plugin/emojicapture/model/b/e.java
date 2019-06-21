package com.tencent.mm.plugin.emojicapture.model.b;

import a.f.b.j;
import a.l;
import a.y;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.g.f;
import com.tencent.mm.plugin.emojicapture.model.c.a;
import com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureService;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixManager;", "", "()V", "mixCallback", "com/tencent/mm/plugin/emojicapture/model/mix/EmojiMixManager$mixCallback$1", "Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixManager$mixCallback$1;", "mixQueue", "Lcom/tencent/mm/loader/loader/LoaderCore;", "Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixTask;", "mixTasks", "", "Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixInfo;", "kotlin.jvm.PlatformType", "", "stopServiceRunnable", "Lkotlin/Function0;", "", "addTask", "info", "scene", "", "timeEnter", "", "videoPath", "", "retriever", "Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiFrameRetriever;", "videoPlayRate", "isRemoveBg", "", "hasSticker", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "plugin-emojicapture_release"})
public final class e
{
  private static final com.tencent.mm.loader.g.d<h> liD;
  private static a.f.a.a<y> liE;
  private static final List<d> liF;
  private static final e.a liG;
  public static final e liH;

  static
  {
    AppMethodBeat.i(2675);
    liH = new e();
    liD = new com.tencent.mm.loader.g.d((com.tencent.mm.loader.g.a.d)new com.tencent.mm.loader.g.a.g((com.tencent.mm.loader.g.a.c)new com.tencent.mm.loader.g.a.a(20), new com.tencent.mm.loader.g.a.h(), "EmojiMix"));
    liE = (a.f.a.a)e.b.liI;
    liF = Collections.synchronizedList((List)new LinkedList());
    liG = new e.a();
    liD.a((f)liG);
    AppMethodBeat.o(2675);
  }

  public static d a(int paramInt1, long paramLong, String paramString, a parama, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(2674);
    j.p(paramString, "videoPath");
    j.p(parama, "retriever");
    j.p(paramEmojiInfo, "emojiInfo");
    c.a locala = com.tencent.mm.plugin.emojicapture.model.c.lhw;
    String str = c.a.bmO() + "temp_gif" + bo.anU();
    locala = com.tencent.mm.plugin.emojicapture.model.c.lhw;
    boolean bool;
    if (!com.tencent.mm.plugin.emojicapture.model.c.bmK())
    {
      bool = true;
      parama = new d(paramInt1, paramLong, paramString, str, parama, paramInt2, paramBoolean1, paramBoolean2, bool, paramEmojiInfo);
      j.p(parama, "info");
      liF.add(parama);
      liD.a((com.tencent.mm.loader.g.c)new h(parama));
      paramString = liE;
      if (paramString == null)
        break label192;
      paramString = new g(paramString);
    }
    label192: 
    while (true)
    {
      al.af((Runnable)paramString);
      com.tencent.mm.bp.d.j(new Intent(ah.getContext(), EmojiCaptureService.class), "tools");
      AppMethodBeat.o(2674);
      return parama;
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b.e
 * JD-Core Version:    0.6.2
 */