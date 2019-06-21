package com.tencent.mm.plugin.emoji.sync.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.al.f;
import com.tencent.mm.g.a.cx;
import com.tencent.mm.plugin.emoji.f.l;
import com.tencent.mm.plugin.emoji.sync.c;
import com.tencent.mm.plugin.emoji.sync.d;
import com.tencent.mm.protocal.protobuf.GetEmotionDetailResponse;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.i;
import java.io.IOException;

public final class b extends c
{
  private boolean kWV;
  private String kWz;
  private d kXJ;
  private com.tencent.mm.plugin.emoji.f.g kXT;

  public b(String paramString)
  {
    AppMethodBeat.i(53202);
    this.kWV = false;
    if (bo.isNullOrNil(paramString))
      ab.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "[cpan]");
    this.kWz = paramString;
    AppMethodBeat.o(53202);
  }

  public b(String paramString, byte paramByte)
  {
    AppMethodBeat.i(53203);
    this.kWV = false;
    if (bo.isNullOrNil(paramString))
      ab.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "[cpan]");
    this.kWz = paramString;
    this.kWV = true;
    AppMethodBeat.o(53203);
  }

  public final void a(d paramd)
  {
    this.kXJ = paramd;
  }

  public final void cancel()
  {
    AppMethodBeat.i(53206);
    if ((this.kXT != null) && (!bo.isNullOrNil(this.kXT.fFa)))
    {
      f.afx().rO(this.kXT.fFa);
      ab.i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "success cancel exchange emotion pack clientid:%s", new Object[] { this.kXT.fFa });
      AppMethodBeat.o(53206);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "failed cancel exchange emotion pack.");
      AppMethodBeat.o(53206);
    }
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(53205);
    boolean bool;
    if ((paramObject != null) && ((paramObject instanceof b)))
    {
      paramObject = (b)paramObject;
      if ((!bo.isNullOrNil(this.kWz)) && (!bo.isNullOrNil(paramObject.getKey())) && (this.kWz.equals(paramObject.getKey())))
      {
        bool = true;
        AppMethodBeat.o(53205);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(53205);
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
    AppMethodBeat.i(53204);
    Object localObject;
    if (this.kXJ != null)
    {
      this.kXJ.JH(getKey());
      localObject = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYo.bZ(getKey(), true);
      if ((this.kWV) || (localObject == null) || (((EmojiGroupInfo)localObject).field_sync != 2) || (((EmojiGroupInfo)localObject).field_status != 7))
        break label127;
      localObject = new cx();
      ((cx)localObject).cvY.cvZ = getKey();
      ((cx)localObject).cvY.cuy = 2;
      ((cx)localObject).cvY.success = true;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      AppMethodBeat.o(53204);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "call back is null");
      break;
      label127: this.kXT = new com.tencent.mm.plugin.emoji.f.g(this.kWz);
      com.tencent.mm.kernel.g.RO().eJo.a(this.kXT, 0);
      localObject = new GetEmotionDetailResponse();
      i locali = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYr.aqp(this.kWz);
      if ((locali != null) && (locali.field_content != null));
      try
      {
        ((GetEmotionDetailResponse)localObject).parseFrom(locali.field_content);
        if (((GetEmotionDetailResponse)localObject).EmotionDetail == null)
        {
          localObject = new l(this.kWz, 15);
          com.tencent.mm.kernel.g.RO().eJo.a((m)localObject, 0);
        }
        AppMethodBeat.o(53204);
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "exception:%s", new Object[] { bo.l(localIOException) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.sync.a.b
 * JD-Core Version:    0.6.2
 */