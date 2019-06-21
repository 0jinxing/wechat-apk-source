package com.tencent.mm.plugin.emoji.sync.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.emoji.sync.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.a;

public final class c extends com.tencent.mm.plugin.emoji.sync.c
{
  private String kWz;
  private d kXJ;

  public c(String paramString)
  {
    AppMethodBeat.i(53207);
    if (bo.isNullOrNil(paramString))
      ab.e("MicroMsg.BKGLoader.EmojiStoreTukaziSyncTask", "[cpan] empty productid");
    this.kWz = paramString;
    AppMethodBeat.o(53207);
  }

  public final void a(d paramd)
  {
    this.kXJ = paramd;
  }

  public final void cancel()
  {
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(53209);
    boolean bool;
    if ((paramObject != null) && ((paramObject instanceof c)))
    {
      paramObject = (c)paramObject;
      if ((!bo.isNullOrNil(this.kWz)) && (!bo.isNullOrNil(paramObject.getKey())) && (this.kWz.equals(paramObject.getKey())))
      {
        bool = true;
        AppMethodBeat.o(53209);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(53209);
    }
  }

  public final String getKey()
  {
    if (this.kWz == null);
    for (String str = ""; ; str = this.kWz)
      return str;
  }

  public final void run()
  {
    AppMethodBeat.i(53208);
    if (this.kXJ != null)
      this.kXJ.JH(getKey());
    while (true)
    {
      EmojiGroupInfo localEmojiGroupInfo = j.getEmojiStorageMgr().xYo.bZ(EmojiGroupInfo.yac, false);
      localEmojiGroupInfo.field_flag = 0;
      j.getEmojiStorageMgr().xYo.a(localEmojiGroupInfo);
      if (this.kXJ != null)
        this.kXJ.m(getKey(), 2, true);
      AppMethodBeat.o(53208);
      return;
      ab.w("MicroMsg.BKGLoader.EmojiStoreTukaziSyncTask", "call back is null");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.sync.a.c
 * JD-Core Version:    0.6.2
 */