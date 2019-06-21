package com.tencent.mm.plugin.emoji.e;

import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.a.a;
import com.tencent.mm.emoji.decode.MMGIFJNIFactory;
import com.tencent.mm.emoji.decode.MMGIFJNIFactory.Companion;
import com.tencent.mm.emoji.decode.b;
import com.tencent.mm.plugin.gif.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.vfs.e;
import java.util.Iterator;
import java.util.List;

final class b$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(52822);
    Object localObject1 = a.OB().bZ(true);
    ((List)localObject1).addAll(at.dsZ().xYn.dvj());
    Object localObject2 = ((List)localObject1).iterator();
    long l2;
    while (true)
      if (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = (EmojiInfo)((Iterator)localObject2).next();
        long l1 = System.currentTimeMillis();
        localObject3 = f.bjK().l((EmojiInfo)localObject3);
        l2 = System.currentTimeMillis() - l1;
        try
        {
          if (r.bU((byte[])localObject3))
            new h((byte[])localObject3);
          while (true)
          {
            label90: ab.i("MicroMsg.emoji.EmojiCommandMgr", "run: %s, %s", new Object[] { Long.valueOf(l2), Long.valueOf(System.currentTimeMillis() - l1 - l2) });
            break;
            new com.tencent.mm.plugin.gif.d((byte[])localObject3);
          }
        }
        catch (Exception localException)
        {
          break label90;
        }
      }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      EmojiInfo localEmojiInfo = (EmojiInfo)((Iterator)localObject1).next();
      l2 = System.currentTimeMillis();
      e.asZ(localEmojiInfo.dve());
      localObject2 = MMGIFJNIFactory.Companion.getDecoder(localEmojiInfo);
      ((b)localObject2).Or();
      ((b)localObject2).destroy();
      ab.i("MicroMsg.emoji.EmojiCommandMgr", "run: time is %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
      e.tf("/sdcard/temp/emoji/");
      l2 = System.currentTimeMillis();
      BitmapFactory.decodeFile("/sdcard/temp/emoji/" + localEmojiInfo.field_md5 + ".jpg");
      ab.i("MicroMsg.emoji.EmojiCommandMgr", "run: file time is %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
    }
    AppMethodBeat.o(52822);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.b.1
 * JD-Core Version:    0.6.2
 */