package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.backup.i.m;
import com.tencent.mm.plugin.backup.i.n;
import com.tencent.mm.plugin.backup.i.o;
import com.tencent.mm.sdk.platformtools.ab;

public final class k extends b
{
  private n jyf;
  public o jyg;

  public k(String paramString)
  {
    AppMethodBeat.i(17679);
    this.jyf = new n();
    this.jyg = new o();
    ab.i("MicroMsg.BackupStartScene", "BackupStartScene, id[%s]", new Object[] { paramString });
    this.jyf.ID = paramString;
    AppMethodBeat.o(17679);
  }

  public final void a(long paramLong, m paramm, int paramInt)
  {
    this.jyf.jBL = 0L;
    this.jyf.jBM = paramLong;
    this.jyf.jBN = 0L;
    this.jyf.jBO = paramm;
    this.jyf.jBP = 0L;
    this.jyf.jBQ = paramInt;
  }

  public final a aTT()
  {
    return this.jyf;
  }

  public final int getType()
  {
    return 3;
  }

  public final void rw(int paramInt)
  {
    AppMethodBeat.i(17680);
    ab.i("MicroMsg.BackupStartScene", "onSceneEnd.");
    if (this.jyg.jBT != 0)
    {
      l(4, this.jyg.jBT, "BackupStartScene onSceneEnd failed");
      AppMethodBeat.o(17680);
    }
    while (true)
    {
      return;
      l(0, this.jyg.jBT, "BackupStartScene onSceneEnd success");
      AppMethodBeat.o(17680);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.k
 * JD-Core Version:    0.6.2
 */