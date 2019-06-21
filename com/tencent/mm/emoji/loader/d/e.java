package com.tencent.mm.emoji.loader.d;

import a.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/request/EmojiViewRequest;", "Lcom/tencent/mm/emoji/loader/request/ViewRequest;", "Lcom/tencent/mm/emoji/view/BaseEmojiView;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "view", "callback", "Lcom/tencent/mm/emoji/loader/request/Request$Callback;", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;Lcom/tencent/mm/emoji/view/BaseEmojiView;Lcom/tencent/mm/emoji/loader/request/Request$Callback;)V", "getCallback", "()Lcom/tencent/mm/emoji/loader/request/Request$Callback;", "setCallback", "(Lcom/tencent/mm/emoji/loader/request/Request$Callback;)V", "cancel", "", "onLoad", "success", "", "start", "plugin-emojisdk_release"})
public class e extends i<BaseEmojiView>
{
  h.a eyf;

  public e(EmojiInfo paramEmojiInfo, BaseEmojiView paramBaseEmojiView, h.a parama)
  {
    super(paramEmojiInfo, (View)paramBaseEmojiView);
    AppMethodBeat.i(63214);
    this.eyf = parama;
    AppMethodBeat.o(63214);
  }

  public void bX(boolean paramBoolean)
  {
    Drawable localDrawable = null;
    AppMethodBeat.i(63212);
    String str = f.Ow();
    StringBuilder localStringBuilder = new StringBuilder("onLoad ").append(this).append(' ');
    Object localObject = this.eyi;
    if (localObject != null)
    {
      localObject = (BaseEmojiView)((WeakReference)localObject).get();
      ab.i(str, localObject + ' ' + paramBoolean);
      localObject = this.eyi;
      if (localObject == null)
        break label146;
    }
    label146: for (localObject = (BaseEmojiView)((WeakReference)localObject).get(); ; localObject = null)
    {
      if (paramBoolean)
        localDrawable = new com.tencent.mm.emoji.loader.b.a().a(this.exP, null);
      b.a((a.f.a.a)new e.a(this, paramBoolean, localDrawable, (BaseEmojiView)localObject));
      AppMethodBeat.o(63212);
      return;
      localObject = null;
      break;
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(63213);
    super.cancel();
    this.eyf = null;
    AppMethodBeat.o(63213);
  }

  public void start()
  {
    AppMethodBeat.i(63211);
    if (this.exP.duP())
    {
      bX(true);
      AppMethodBeat.o(63211);
    }
    while (true)
    {
      return;
      Object localObject = this.eyi;
      if (localObject != null)
      {
        localObject = (BaseEmojiView)((WeakReference)localObject).get();
        if (localObject != null)
          ((BaseEmojiView)localObject).init();
      }
      reload();
      AppMethodBeat.o(63211);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.d.e
 * JD-Core Version:    0.6.2
 */