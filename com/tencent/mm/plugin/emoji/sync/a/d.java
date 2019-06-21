package com.tencent.mm.plugin.emoji.sync.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.f.f;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.emoji.sync.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;

public final class d extends c
{
  private com.tencent.mm.plugin.emoji.sync.d kXJ;
  private m kXU;
  private EmojiInfo kXV;
  private String mKey;

  public d(String paramString)
  {
    AppMethodBeat.i(53210);
    if (bo.isNullOrNil(paramString))
      ab.e("MicroMsg.BKGLoader.EmojiUploadTask", "[cpan] can not create task. md5 is null.");
    this.mKey = paramString;
    this.kXV = j.getEmojiStorageMgr().xYn.aqi(this.mKey);
    AppMethodBeat.o(53210);
  }

  public final void a(com.tencent.mm.plugin.emoji.sync.d paramd)
  {
    this.kXJ = paramd;
  }

  public final void cancel()
  {
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(53212);
    boolean bool;
    if ((paramObject != null) && ((paramObject instanceof d)))
    {
      paramObject = (d)paramObject;
      if ((!bo.isNullOrNil(this.mKey)) && (!bo.isNullOrNil(paramObject.mKey)) && (this.mKey.equals(paramObject.mKey)))
      {
        bool = true;
        AppMethodBeat.o(53212);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(53212);
    }
  }

  public final String getKey()
  {
    return this.mKey;
  }

  public final void run()
  {
    AppMethodBeat.i(53211);
    if (this.kXJ != null)
    {
      this.kXJ.JH(this.mKey);
      if (this.kXV != null)
        break label63;
      this.kXJ.m(this.mKey, 1, false);
      AppMethodBeat.o(53211);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.BKGLoader.EmojiUploadTask", "call back is null.");
      break;
      label63: this.kXU = new f(this.kXV);
      g.RO().eJo.a(this.kXU, 0);
      AppMethodBeat.o(53211);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.sync.a.d
 * JD-Core Version:    0.6.2
 */