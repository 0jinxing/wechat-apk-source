package com.tencent.mm.emoji.loader.d;

import a.l;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/request/EmojiCoverRequest;", "Lcom/tencent/mm/emoji/loader/request/ViewRequest;", "Landroid/widget/ImageView;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "view", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;Landroid/widget/ImageView;)V", "createTask", "Lcom/tencent/mm/emoji/loader/task/IEmojiLoadTask;", "onLoad", "", "success", "", "start", "plugin-emojisdk_release"})
public final class b extends i<ImageView>
{
  public b(EmojiInfo paramEmojiInfo, ImageView paramImageView)
  {
    super(paramEmojiInfo, (View)paramImageView);
    AppMethodBeat.i(63207);
    AppMethodBeat.o(63207);
  }

  protected final com.tencent.mm.emoji.loader.e.c Oy()
  {
    AppMethodBeat.i(63205);
    Object localObject = com.tencent.mm.emoji.loader.a.exs;
    localObject = com.tencent.mm.emoji.loader.a.b(this.exP);
    AppMethodBeat.o(63205);
    return localObject;
  }

  public final void bX(boolean paramBoolean)
  {
    AppMethodBeat.i(63206);
    super.bX(paramBoolean);
    Object localObject1 = this.eyi;
    if (localObject1 != null);
    for (localObject1 = (ImageView)((WeakReference)localObject1).get(); ; localObject1 = null)
    {
      Object localObject2 = com.tencent.mm.emoji.loader.a.b.exB;
      localObject2 = com.tencent.mm.emoji.loader.a.b.kR(this.exP.Aq());
      ab.i(c.Ow(), "onLoad: " + this.exP.Aq() + ", " + localObject2);
      com.tencent.mm.ab.b.a((a.f.a.a)new b.a(paramBoolean, (Bitmap)localObject2, (ImageView)localObject1));
      AppMethodBeat.o(63206);
      return;
    }
  }

  public final void start()
  {
    AppMethodBeat.i(63204);
    Object localObject = com.tencent.mm.emoji.loader.a.b.exB;
    localObject = com.tencent.mm.emoji.loader.a.b.kR(this.exP.Aq());
    ab.i(c.Ow(), "start: " + this.exP.Aq() + ", " + localObject);
    if (localObject != null)
    {
      bX(true);
      AppMethodBeat.o(63204);
    }
    while (true)
    {
      return;
      localObject = this.eyi;
      if (localObject != null)
      {
        localObject = (ImageView)((WeakReference)localObject).get();
        if (localObject != null)
          ((ImageView)localObject).setImageDrawable(null);
      }
      reload();
      AppMethodBeat.o(63204);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.d.b
 * JD-Core Version:    0.6.2
 */