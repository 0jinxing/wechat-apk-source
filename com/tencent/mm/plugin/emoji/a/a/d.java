package com.tencent.mm.plugin.emoji.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class d extends c
{
  private final String TAG = "MicroMsg.emoji.EmojiListMineData";

  public d(com.tencent.mm.plugin.emoji.model.f paramf)
  {
    super(paramf);
  }

  public final void bjD()
  {
  }

  public final void clear()
  {
    AppMethodBeat.i(52796);
    super.clear();
    AppMethodBeat.o(52796);
  }

  public final void notifyDataSetChanged()
  {
    try
    {
      AppMethodBeat.i(52795);
      Object localObject1 = j.getEmojiStorageMgr().xYo.duM();
      boolean bool = com.tencent.mm.plugin.emoji.h.a.blE();
      Object localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      this.mItemList = ((ArrayList)localObject3);
      ab.v("MicroMsg.emoji.EmojiListMineData", "============= refresh Data By DB");
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        localObject3 = ((EmojiGroupInfo)localIterator.next()).duw();
        f localf = new com/tencent/mm/plugin/emoji/a/a/f;
        localf.<init>((EmotionSummary)localObject3);
        if ((com.tencent.mm.plugin.emoji.h.a.g((EmotionSummary)localObject3)) && (bool))
        {
          localObject1 = new com/tencent/mm/storage/ar;
          ((ar)localObject1).<init>(((EmotionSummary)localObject3).ProductID);
          this.kSX.put(((EmotionSummary)localObject3).ProductID, localObject1);
        }
        localf.setStatus(9);
        this.mItemList.add(localf);
      }
    }
    finally
    {
    }
    AppMethodBeat.o(52795);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.a.d
 * JD-Core Version:    0.6.2
 */