package com.tencent.mm.emoji.loader.d;

import a.f.a.m;
import a.f.b.j;
import a.l;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/request/ChatEmojiViewRequest;", "Lcom/tencent/mm/emoji/loader/request/EmojiViewRequest;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "view", "Lcom/tencent/mm/pluginsdk/ui/emoji/ChattingEmojiView;", "cacheKey", "", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;Lcom/tencent/mm/pluginsdk/ui/emoji/ChattingEmojiView;Ljava/lang/String;)V", "firstLoad", "", "onLoad", "", "success", "onSize", "width", "", "height", "start", "plugin-emojisdk_release"})
public final class a extends e
{
  private final String cacheKey;
  private boolean exX;

  public a(EmojiInfo paramEmojiInfo, ChattingEmojiView paramChattingEmojiView, String paramString)
  {
    super(paramEmojiInfo, (BaseEmojiView)paramChattingEmojiView, (h.a)paramChattingEmojiView);
    AppMethodBeat.i(63201);
    this.cacheKey = paramString;
    this.exX = true;
    AppMethodBeat.o(63201);
  }

  public final void bX(boolean paramBoolean)
  {
    Drawable localDrawable = null;
    AppMethodBeat.i(63200);
    StringBuilder localStringBuilder = new StringBuilder("onLoad ").append(this).append(' ');
    Object localObject = this.eyi;
    if (localObject != null)
    {
      localObject = (BaseEmojiView)((WeakReference)localObject).get();
      ab.i("MicroMsg.ChatEmojiViewRequest", localObject + ' ' + paramBoolean);
      localObject = this.eyi;
      if (localObject == null)
        break label153;
      localObject = (BaseEmojiView)((WeakReference)localObject).get();
      label91: if (paramBoolean)
        localDrawable = new com.tencent.mm.emoji.loader.b.a().a(this.exP, (m)new a.b(this));
      if ((localDrawable != null) || (!this.exX))
        break label159;
      this.exX = false;
      reload();
      AppMethodBeat.o(63200);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label153: localObject = null;
      break label91;
      label159: b.a((a.f.a.a)new a.a(this, localDrawable, (BaseEmojiView)localObject, paramBoolean));
      AppMethodBeat.o(63200);
    }
  }

  public final void start()
  {
    AppMethodBeat.i(63199);
    Object localObject1 = com.tencent.mm.emoji.loader.a.a.exz;
    Drawable localDrawable = com.tencent.mm.emoji.loader.a.a.kQ(this.cacheKey);
    Object localObject2 = new StringBuilder("start: ").append(localDrawable).append(' ');
    localObject1 = this.eyi;
    if (localObject1 != null)
    {
      localObject1 = (BaseEmojiView)((WeakReference)localObject1).get();
      ab.i("MicroMsg.ChatEmojiViewRequest", localObject1 + ' ' + this.cacheKey);
      if (localDrawable == null)
        break label210;
      if (localDrawable.getCallback() != null)
      {
        localObject2 = localDrawable.getCallback();
        localObject1 = this.eyi;
        if (localObject1 == null)
          break label197;
        localObject1 = (BaseEmojiView)((WeakReference)localObject1).get();
        label111: if (!j.j(localObject2, localObject1))
          break label210;
      }
      localObject1 = this.eyi;
      if (localObject1 != null)
      {
        localObject1 = (BaseEmojiView)((WeakReference)localObject1).get();
        if (localObject1 != null)
          ((BaseEmojiView)localObject1).setImageDrawable(localDrawable);
      }
      localObject1 = this.eyi;
      if (localObject1 != null)
      {
        localObject1 = (BaseEmojiView)((WeakReference)localObject1).get();
        if (localObject1 != null)
          ((BaseEmojiView)localObject1).resume();
      }
      localObject1 = this.eyf;
      if (localObject1 == null)
        break label202;
      ((h.a)localObject1).bV(true);
      AppMethodBeat.o(63199);
    }
    while (true)
    {
      return;
      localObject1 = null;
      break;
      label197: localObject1 = null;
      break label111;
      label202: AppMethodBeat.o(63199);
      continue;
      label210: reload();
      AppMethodBeat.o(63199);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.d.a
 * JD-Core Version:    0.6.2
 */