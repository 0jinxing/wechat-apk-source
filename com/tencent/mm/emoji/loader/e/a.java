package com.tencent.mm.emoji.loader.e;

import a.f.b.j;
import a.k.m;
import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.loader.c.b.b;
import com.tencent.mm.emoji.loader.d.h;
import com.tencent.mm.emoji.loader.d.h.a;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.vfs.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/task/EmojiCoverTask;", "Lcom/tencent/mm/emoji/loader/task/IEmojiLoadTask;", "Ljava/lang/Runnable;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;)V", "dependRequest", "Lcom/tencent/mm/emoji/loader/request/Request;", "taskKey", "", "getTaskKey", "onResult", "", "success", "", "run", "plugin-emojisdk_release"})
public final class a extends c
  implements Runnable
{
  private final String eyl;
  private h<?> eym;

  public a(EmojiInfo paramEmojiInfo)
  {
    super(paramEmojiInfo);
    AppMethodBeat.i(63220);
    this.eyl = (paramEmojiInfo.Aq() + "_cover");
    AppMethodBeat.o(63220);
  }

  public final String OA()
  {
    return this.eyl;
  }

  public final void bV(boolean paramBoolean)
  {
    AppMethodBeat.i(63219);
    h localh = this.eym;
    if (localh != null)
      localh.cancel();
    super.bV(paramBoolean);
    AppMethodBeat.o(63219);
  }

  public final void run()
  {
    AppMethodBeat.i(63218);
    super.run();
    new com.tencent.mm.emoji.loader.c.b();
    EmojiInfo localEmojiInfo = this.exP;
    a.f.a.b localb = (a.f.a.b)new a.a(this);
    j.p(localEmojiInfo, "emojiInfo");
    Object localObject1 = com.tencent.mm.emoji.loader.a.b.exB;
    localObject1 = com.tencent.mm.emoji.loader.a.b.kR(localEmojiInfo.Aq());
    int i;
    if (localObject1 != null)
    {
      i = 1;
      if (i == 0)
        break label346;
      ab.i("MicroMsg.EmojiCoverFetcher", "fetch: from cache " + localEmojiInfo.Aq());
      localb.am(Boolean.TRUE);
    }
    label98: for (localObject1 = null; ; localObject1 = (h)com.tencent.mm.emoji.loader.a.a(localEmojiInfo, (h.a)new b.b(localEmojiInfo, localb)))
    {
      this.eym = ((h)localObject1);
      AppMethodBeat.o(63218);
      return;
      Object localObject2;
      if ((j.j(localEmojiInfo.awa(), String.valueOf(EmojiGroupInfo.yac))) || (localEmojiInfo.getGroup() == EmojiGroupInfo.yad) || (localEmojiInfo.getGroup() == EmojiInfo.yak) || (localEmojiInfo.getGroup() == EmojiInfo.yaj))
      {
        localObject2 = localEmojiInfo.getName();
        if (!bo.isNullOrNil((String)localObject2))
        {
          j.o(localObject2, "name");
          localObject1 = m.i((String)localObject2, ".png", "", false);
          localObject2 = ah.getContext();
          j.o(localObject2, "MMApplicationContext.getContext()");
          localObject2 = ((Context)localObject2).getResources();
          localObject1 = MMBitmapFactory.decodeResource((Resources)localObject2, ((Resources)localObject2).getIdentifier((String)localObject1, "drawable", ah.getPackageName()));
        }
      }
      while (true)
        if (localObject1 != null)
        {
          localObject2 = com.tencent.mm.emoji.loader.a.b.exB;
          com.tencent.mm.emoji.loader.a.b.c(localEmojiInfo.Aq(), (Bitmap)localObject1);
          i = 1;
          break;
          if (e.ct(localEmojiInfo.dvf()))
          {
            localObject1 = new BitmapFactory.Options();
            ((BitmapFactory.Options)localObject1).outWidth = 120;
            ((BitmapFactory.Options)localObject1).outHeight = 120;
            localObject2 = d.decodeFile(localEmojiInfo.dvf(), (BitmapFactory.Options)localObject1);
            if (localObject2 != null)
              break label299;
          }
        }
      while (true)
      {
        i = 0;
        break;
        if (((Bitmap)localObject2).getWidth() <= 120)
        {
          localObject1 = localObject2;
          if (((Bitmap)localObject2).getHeight() <= 120)
            break label225;
        }
        localObject2 = d.a((Bitmap)localObject2, 120, 120, false, true);
        localObject1 = localObject2;
        if (localObject2 != null)
          break label225;
      }
      if (!bo.isNullOrNil(localEmojiInfo.field_thumbUrl))
      {
        ab.i("MicroMsg.EmojiCoverFetcher", "loadDataImp: load by url " + localEmojiInfo.Aq());
        localObject2 = new com.tencent.mm.plugin.emoji.d.a().sE(localEmojiInfo.field_thumbUrl);
        if (localObject2 != null);
        for (localObject1 = ((com.tencent.mm.at.a.d.b)localObject2).data; ; localObject1 = null)
        {
          if (localObject1 == null)
            break label466;
          Bitmap localBitmap = d.bQ(((com.tencent.mm.at.a.d.b)localObject2).data);
          localObject1 = com.tencent.mm.emoji.loader.a.b.exB;
          com.tencent.mm.emoji.loader.a.b.c(localEmojiInfo.Aq(), localBitmap);
          e.q(localEmojiInfo.dvf(), ((com.tencent.mm.at.a.d.b)localObject2).data);
          localb.am(Boolean.TRUE);
          break;
        }
        localb.am(Boolean.FALSE);
        break label98;
      }
      ab.i("MicroMsg.EmojiCoverFetcher", "loadDataImp: load by gif " + localEmojiInfo.Aq());
      localObject1 = com.tencent.mm.emoji.loader.a.exs;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.e.a
 * JD-Core Version:    0.6.2
 */