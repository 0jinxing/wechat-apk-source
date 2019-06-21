package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.backup.i.aa;
import com.tencent.mm.plugin.backup.i.z;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class d extends b
{
  private f fur;
  private z jxx;
  public aa jxy;

  public d(String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3, LinkedList<String> paramLinkedList, f paramf)
  {
    AppMethodBeat.i(17655);
    this.jxx = new z();
    this.jxy = new aa();
    ab.i("MicroMsg.BackupDataTagScene", "init DataTag, BakChatName:%s, startTime:%d, endTime:%d, mediaIdList size:%d", new Object[] { paramString1, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramLinkedList.size()) });
    this.jxx.jBt = paramString1;
    this.jxx.jCE = paramLong1;
    this.jxx.jCF = paramLong2;
    this.jxx.jCG = paramString2;
    this.jxx.jCH = paramString3;
    this.jxx.jCl = paramLinkedList;
    this.fur = paramf;
    AppMethodBeat.o(17655);
  }

  public final a aTS()
  {
    return this.jxy;
  }

  public final a aTT()
  {
    return this.jxx;
  }

  public final boolean aUc()
  {
    AppMethodBeat.i(17656);
    boolean bool = super.aUd();
    if (!bool)
      this.fur.onSceneEnd(1, -2, "doScene failed", this);
    AppMethodBeat.o(17656);
    return bool;
  }

  public final int getType()
  {
    return 15;
  }

  public final void rw(int paramInt)
  {
    AppMethodBeat.i(17657);
    ab.i("MicroMsg.BackupDataTagScene", "onSceneEnd");
    l(0, 0, "success");
    this.fur.onSceneEnd(0, 0, "", this);
    AppMethodBeat.o(17657);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.d
 * JD-Core Version:    0.6.2
 */