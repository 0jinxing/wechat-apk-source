package com.tencent.mm.plugin.emoji.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class k
{
  Set<String> kVY;
  Set<String> kVZ;
  Set<String> kWa;
  c kWb;
  c kWc;

  public k()
  {
    AppMethodBeat.i(53082);
    this.kWb = new k.1(this);
    this.kWc = new k.2(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.kWb);
    com.tencent.mm.sdk.b.a.xxA.c(this.kWc);
    this.kVY = Collections.synchronizedSet(new HashSet());
    this.kVZ = Collections.synchronizedSet(new HashSet());
    this.kWa = Collections.synchronizedSet(new HashSet());
    AppMethodBeat.o(53082);
  }

  final void bkp()
  {
    AppMethodBeat.i(53083);
    if (this.kVZ.isEmpty())
    {
      ab.i("MicroMsg.emoji.WearEmojiLogic", "no emoji need download");
      AppMethodBeat.o(53083);
    }
    while (true)
    {
      return;
      if (!this.kWa.isEmpty())
      {
        ab.i("MicroMsg.emoji.WearEmojiLogic", "downloading emoji %s", new Object[] { this.kWa.toString() });
        AppMethodBeat.o(53083);
      }
      else
      {
        Object localObject = this.kVZ.iterator();
        if (localObject != null)
        {
          localObject = (String)((Iterator)localObject).next();
          this.kVZ.remove(localObject);
          EmojiGroupInfo localEmojiGroupInfo = j.getEmojiStorageMgr().xYo.bZ((String)localObject, true);
          if ((localEmojiGroupInfo != null) && ((localEmojiGroupInfo.field_flag & 0x100) > 0))
          {
            ab.i("MicroMsg.emoji.WearEmojiLogic", "emoji already exist %s", new Object[] { localObject });
            break;
          }
          ab.i("MicroMsg.emoji.WearEmojiLogic", "start to download emoji %s", new Object[] { localObject });
          this.kWa.add(localObject);
          localObject = new com.tencent.mm.plugin.emoji.f.g((String)localObject, "");
          com.tencent.mm.kernel.g.RO().eJo.a((m)localObject, 0);
        }
        AppMethodBeat.o(53083);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.k
 * JD-Core Version:    0.6.2
 */