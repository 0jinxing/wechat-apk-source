package com.tencent.mm.emoji.loader;

import a.f.b.j;
import a.l;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.loader.d.h.a;
import com.tencent.mm.emoji.loader.d.i;
import com.tencent.mm.emoji.loader.d.i.a;
import com.tencent.mm.emoji.loader.e.c;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.HashMap;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/EmojiLoader;", "", "()V", "TAG", "", "taskMap", "Ljava/util/HashMap;", "Lcom/tencent/mm/emoji/loader/task/IEmojiLoadTask;", "Lkotlin/collections/HashMap;", "addTask", "", "key", "task", "buildCoverTask", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "buildTask", "cancel", "view", "Landroid/view/View;", "load", "Lcom/tencent/mm/emoji/loader/request/EmojiViewRequest;", "emojiView", "Lcom/tencent/mm/emoji/view/BaseEmojiView;", "callback", "Lcom/tencent/mm/emoji/loader/request/Request$Callback;", "Lcom/tencent/mm/emoji/loader/request/ChatEmojiViewRequest;", "Lcom/tencent/mm/pluginsdk/ui/emoji/ChattingEmojiView;", "cacheKey", "loadCover", "Lcom/tencent/mm/emoji/loader/request/EmojiCoverRequest;", "Landroid/widget/ImageView;", "loadFile", "Lcom/tencent/mm/emoji/loader/request/EmojiFileRequest;", "loadForRemote", "Lcom/tencent/mm/emoji/loader/request/ProcessRequest;", "notifyTaskResult", "md5", "success", "", "removeTask", "plugin-emojisdk_release"})
public final class a
{
  private static final String TAG = "MicroMsg.EmojiLoader";
  private static final HashMap<String, c> exr;
  public static final a exs;

  static
  {
    AppMethodBeat.i(63161);
    exs = new a();
    TAG = "MicroMsg.EmojiLoader";
    exr = new HashMap();
    AppMethodBeat.o(63161);
  }

  public static com.tencent.mm.emoji.loader.d.a a(EmojiInfo paramEmojiInfo, ChattingEmojiView paramChattingEmojiView, String paramString)
  {
    AppMethodBeat.i(63153);
    j.p(paramEmojiInfo, "emojiInfo");
    j.p(paramChattingEmojiView, "emojiView");
    j.p(paramString, "cacheKey");
    ab.d(TAG, "load emoji " + paramEmojiInfo.Aq());
    paramEmojiInfo = new com.tencent.mm.emoji.loader.d.a(paramEmojiInfo, paramChattingEmojiView, paramString);
    paramEmojiInfo.start();
    AppMethodBeat.o(63153);
    return paramEmojiInfo;
  }

  public static com.tencent.mm.emoji.loader.d.b a(EmojiInfo paramEmojiInfo, ImageView paramImageView)
  {
    AppMethodBeat.i(63155);
    j.p(paramEmojiInfo, "emojiInfo");
    j.p(paramImageView, "view");
    paramEmojiInfo = new com.tencent.mm.emoji.loader.d.b(paramEmojiInfo, paramImageView);
    paramEmojiInfo.start();
    AppMethodBeat.o(63155);
    return paramEmojiInfo;
  }

  public static com.tencent.mm.emoji.loader.d.d a(EmojiInfo paramEmojiInfo, h.a parama)
  {
    AppMethodBeat.i(63154);
    j.p(paramEmojiInfo, "emojiInfo");
    paramEmojiInfo = new com.tencent.mm.emoji.loader.d.d(paramEmojiInfo, parama);
    paramEmojiInfo.start();
    AppMethodBeat.o(63154);
    return paramEmojiInfo;
  }

  public static com.tencent.mm.emoji.loader.d.e a(EmojiInfo paramEmojiInfo, BaseEmojiView paramBaseEmojiView, h.a parama)
  {
    AppMethodBeat.i(63152);
    j.p(paramEmojiInfo, "emojiInfo");
    j.p(paramBaseEmojiView, "emojiView");
    ab.d(TAG, "load emoji " + paramEmojiInfo.Aq());
    paramEmojiInfo = new com.tencent.mm.emoji.loader.d.e(paramEmojiInfo, paramBaseEmojiView, parama);
    paramEmojiInfo.start();
    AppMethodBeat.o(63152);
    return paramEmojiInfo;
  }

  public static c a(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63150);
    j.p(paramEmojiInfo, "emojiInfo");
    c localc = (c)exr.get(paramEmojiInfo.Aq());
    Object localObject = localc;
    if (localc == null)
    {
      localObject = com.tencent.mm.kernel.g.RM().Rn();
      j.o(localObject, "MMKernel.process().current()");
      if (!((com.tencent.mm.kernel.b.h)localObject).SG())
        break label73;
    }
    label73: for (localObject = (c)new com.tencent.mm.emoji.loader.e.b(paramEmojiInfo); ; localObject = (c)new com.tencent.mm.emoji.loader.e.e(paramEmojiInfo))
    {
      AppMethodBeat.o(63150);
      return localObject;
    }
  }

  public static void a(String paramString, c paramc)
  {
    AppMethodBeat.i(63159);
    j.p(paramString, "key");
    j.p(paramc, "task");
    ((Map)exr).put(paramString, paramc);
    AppMethodBeat.o(63159);
  }

  public static c b(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63151);
    j.p(paramEmojiInfo, "emojiInfo");
    Object localObject = paramEmojiInfo.Aq() + "_cover";
    c localc = (c)exr.get(localObject);
    localObject = localc;
    if (localc == null)
      localObject = (c)new com.tencent.mm.emoji.loader.e.a(paramEmojiInfo);
    AppMethodBeat.o(63151);
    return localObject;
  }

  public static com.tencent.mm.emoji.loader.d.g c(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63156);
    j.p(paramEmojiInfo, "emojiInfo");
    paramEmojiInfo = new com.tencent.mm.emoji.loader.d.g(paramEmojiInfo);
    paramEmojiInfo.start();
    AppMethodBeat.o(63156);
    return paramEmojiInfo;
  }

  public static void cf(View paramView)
  {
    AppMethodBeat.i(63158);
    j.p(paramView, "view");
    ab.i(TAG, "cancel: ".concat(String.valueOf(paramView)));
    i.a locala = i.eyk;
    paramView = (com.tencent.mm.emoji.loader.d.h)paramView.getTag(i.Oz());
    if (paramView != null)
    {
      paramView.cancel();
      AppMethodBeat.o(63158);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(63158);
    }
  }

  public static void kP(String paramString)
  {
    AppMethodBeat.i(63160);
    j.p(paramString, "key");
    exr.remove(paramString);
    AppMethodBeat.o(63160);
  }

  public static void q(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(63157);
    j.p(paramString, "md5");
    paramString = (c)exr.get(paramString);
    if (paramString != null)
    {
      paramString.bV(paramBoolean);
      AppMethodBeat.o(63157);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(63157);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.a
 * JD-Core Version:    0.6.2
 */