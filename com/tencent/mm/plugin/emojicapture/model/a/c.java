package com.tencent.mm.plugin.emojicapture.model.a;

import a.f.a.a;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerMgr;", "", "()V", "TAG", "", "callbacks", "Ljava/util/HashSet;", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerMgr$StickerResCallback;", "Lkotlin/collections/HashSet;", "emptySticker", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "getEmptySticker", "()Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "orderIndex", "", "requestSticker", "Ljava/util/LinkedList;", "scene", "stickerConfig", "Lcom/tencent/mm/plugin/emojicapture/model/xml/EmoticonLensConfig;", "stickerList", "addCallback", "", "callback", "checkResUpdate", "subType", "destroy", "init", "onResUpdate", "parseFile", "removeCallback", "StickerResCallback", "plugin-emojicapture_release"})
public final class c
{
  private static final String TAG = "MicroMsg.EmojiStickerMgr";
  private static final b lhN;
  private static final LinkedList<b> lhO;
  private static com.tencent.mm.plugin.emojicapture.model.c.b lhP;
  private static final HashSet<c.a> lhQ;
  private static final LinkedList<Integer> lhR;
  public static final c lhS;
  private static int scene;

  static
  {
    AppMethodBeat.i(2645);
    lhS = new c();
    TAG = "MicroMsg.EmojiStickerMgr";
    lhN = new b();
    lhO = new LinkedList();
    lhP = new com.tencent.mm.plugin.emojicapture.model.c.b();
    lhQ = new HashSet();
    lhR = new LinkedList();
    AppMethodBeat.o(2645);
  }

  public static void a(c.a parama)
  {
    AppMethodBeat.i(2643);
    j.p(parama, "callback");
    lhQ.add(parama);
    parama.S(lhO);
    parama.bny();
    AppMethodBeat.o(2643);
  }

  public static b bns()
  {
    return lhN;
  }

  public static void destroy()
  {
    AppMethodBeat.i(2642);
    lhO.clear();
    lhQ.clear();
    lhR.clear();
    AppMethodBeat.o(2642);
  }

  public static void init(int paramInt)
  {
    AppMethodBeat.i(2641);
    scene = paramInt;
    e locale = e.lii;
    e.bnC();
    AppMethodBeat.o(2641);
  }

  public static void uu(int paramInt)
  {
    AppMethodBeat.i(2644);
    com.tencent.mm.ab.b.a("EmojiStickerMgr_onResUpdate", (a)new c.b(paramInt));
    AppMethodBeat.o(2644);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.a.c
 * JD-Core Version:    0.6.2
 */