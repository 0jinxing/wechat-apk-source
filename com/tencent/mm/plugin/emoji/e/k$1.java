package com.tencent.mm.plugin.emoji.e;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.m;
import com.tencent.mm.storage.emotion.n;
import java.util.HashMap;

public final class k$1
  implements Runnable
{
  public k$1(k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(52976);
    Object localObject1;
    k localk;
    Object localObject2;
    if (this.kUH.kUC)
    {
      localObject1 = this.kUH;
      if (j.getEmojiStorageMgr().xYu != null)
        ((k)localObject1).kUF = j.getEmojiStorageMgr().xYu.dvk();
      localk = this.kUH;
      localObject1 = null;
      localObject2 = null;
    }
    while (true)
    {
      try
      {
        Cursor localCursor = j.getEmojiStorageMgr().xYu.baR();
        if (localCursor != null)
        {
          localObject2 = localCursor;
          localObject1 = localCursor;
          if (localCursor.moveToFirst())
          {
            localObject2 = localCursor;
            localObject1 = localCursor;
            m localm = new com/tencent/mm/storage/emotion/m;
            localObject2 = localCursor;
            localObject1 = localCursor;
            localm.<init>();
            localObject2 = localCursor;
            localObject1 = localCursor;
            localm.d(localCursor);
            localObject2 = localCursor;
            localObject1 = localCursor;
            localk.kUG.put(localm.field_prodcutID, localm);
            localObject2 = localCursor;
            localObject1 = localCursor;
            boolean bool = localCursor.moveToNext();
            if (bool)
              continue;
          }
        }
        if (localCursor != null)
        {
          localCursor.close();
          AppMethodBeat.o(52976);
          return;
        }
      }
      catch (Exception localException)
      {
        localObject1 = localObject2;
        ab.w("MicroMsg.emoji.EmojiRewardTipMgr", bo.l(localException));
        if (localObject2 != null)
        {
          localObject2.close();
          AppMethodBeat.o(52976);
          continue;
        }
      }
      finally
      {
        if (localObject1 != null)
          ((Cursor)localObject1).close();
        AppMethodBeat.o(52976);
      }
      AppMethodBeat.o(52976);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.k.1
 * JD-Core Version:    0.6.2
 */