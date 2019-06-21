package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.l;
import com.tencent.mm.plugin.backup.i.v;
import com.tencent.mm.plugin.backup.i.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends com.tencent.mm.plugin.backup.g.b
{
  final String jAd;
  final String jAe;
  private boolean jAf;
  final int jqS;
  private v jwX;
  private w jwY;
  final byte[] key;

  public a(String paramString1, String paramString2, byte[] paramArrayOfByte, String paramString3)
  {
    AppMethodBeat.i(17879);
    this.jwX = new v();
    this.jwY = new w();
    this.jAf = false;
    ab.i("MicroMsg.BakOldAuthScene", "summerbak init id:%s,  hello:%s, ok:%s, stack[%s]", new Object[] { paramString3, paramString1, paramString2, bo.dpG() });
    this.jwX.jBi = new com.tencent.mm.bt.b(l.d(paramString1.getBytes(), paramArrayOfByte));
    this.jwX.jCs = 0;
    this.jwX.ID = paramString3;
    this.jwX.Version = 0;
    this.jAd = paramString2;
    this.jAe = paramString3;
    this.key = paramArrayOfByte;
    this.jqS = -1;
    AppMethodBeat.o(17879);
  }

  public final com.tencent.mm.bt.a aTS()
  {
    return this.jwY;
  }

  public final com.tencent.mm.bt.a aTT()
  {
    return this.jwX;
  }

  public final int getType()
  {
    return 1;
  }

  public final void rw(int paramInt)
  {
    AppMethodBeat.i(17880);
    String str;
    boolean bool;
    if (this.jwY.jBT == 0)
      if (this.jAe.equals(this.jwY.ID))
      {
        str = new String(l.c(this.jwY.jBi.wR, this.key));
        if (str.length() != this.jAd.length())
        {
          bool = false;
          this.jAf = bool;
          ab.i("MicroMsg.BakOldAuthScene", "check ok result:%b", new Object[] { Boolean.valueOf(this.jAf) });
          if (!this.jAf)
            break label223;
          l(0, 0, "auth ok");
          this.jwX.jBi = new com.tencent.mm.bt.b(l.d(this.jAd.getBytes(), this.key));
          this.jwX.jCs = 1;
          this.jwX.ID = this.jAe;
        }
      }
    while (true)
    {
      try
      {
        ab.i("MicroMsg.BakOldAuthScene", "directSendAuthOk");
        com.tencent.mm.plugin.backup.g.b.r(this.jwX.toByteArray(), 1, paramInt);
        AppMethodBeat.o(17880);
        return;
        bool = str.equals(this.jAd);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.BakOldAuthScene", localException, "directSendAuthOk req to bur err.", new Object[0]);
        AppMethodBeat.o(17880);
        continue;
      }
      label223: ab.e("MicroMsg.BakOldAuthScene", "check ok failed");
      l(4, 1, "not ok packet");
      AppMethodBeat.o(17880);
      continue;
      ab.e("MicroMsg.BakOldAuthScene", "not the same id");
      l(4, -1, "not the same id");
      AppMethodBeat.o(17880);
      continue;
      ab.e("MicroMsg.BakOldAuthScene", "errType %d", new Object[] { Integer.valueOf(this.jwY.jBT) });
      l(4, this.jwY.jBT, "not not success");
      AppMethodBeat.o(17880);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.c.a
 * JD-Core Version:    0.6.2
 */