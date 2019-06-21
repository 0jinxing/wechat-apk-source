package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.l;
import com.tencent.mm.plugin.backup.b.c;
import com.tencent.mm.plugin.backup.i.v;
import com.tencent.mm.plugin.backup.i.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends b
{
  final String authId;
  public v jwX;
  public w jwY;
  final int jwZ;
  final String jxa;
  final byte[] jxb;

  public a(String paramString1, String paramString2, byte[] paramArrayOfByte, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(17636);
    this.jwX = new v();
    this.jwY = new w();
    ab.i("MicroMsg.BackupAuthScene", "BackupAuthScene init, backupType[%d], stack:%s", new Object[] { Integer.valueOf(paramInt2), bo.dpG() });
    this.jwX.jBi = new com.tencent.mm.bt.b(l.d(paramString1.getBytes(), paramArrayOfByte));
    this.jwX.jCs = 0;
    this.jwX.ID = paramString3;
    this.jwX.Version = paramInt1;
    this.jxa = paramString2;
    this.authId = paramString3;
    this.jxb = paramArrayOfByte;
    this.jwZ = paramInt2;
    AppMethodBeat.o(17636);
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
    AppMethodBeat.i(17637);
    if (this.jwY.jBT != 0)
    {
      ab.e("MicroMsg.BackupAuthScene", "onSceneEnd errType[%d]", new Object[] { Integer.valueOf(this.jwY.jBT) });
      l(4, this.jwY.jBT, "onSceneEnd status failed");
      AppMethodBeat.o(17637);
    }
    while (true)
    {
      return;
      if (!this.authId.equals(this.jwY.ID))
      {
        ab.e("MicroMsg.BackupAuthScene", "onSceneEnd not the same id");
        l(4, -1, "onSceneEnd not the same id");
        AppMethodBeat.o(17637);
      }
      else
      {
        String str = new String(l.c(this.jwY.jBi.wR, this.jxb));
        if (str.length() != this.jxa.length());
        for (boolean bool = false; ; bool = str.equals(this.jxa))
        {
          ab.i("MicroMsg.BackupAuthScene", "onSceneEnd check ok result[%b]", new Object[] { Boolean.valueOf(bool) });
          if (bool)
            break label202;
          ab.e("MicroMsg.BackupAuthScene", "onSceneEnd check ok failed");
          l(4, -3, "onSceneEnd check ok failed");
          AppMethodBeat.o(17637);
          break;
        }
        label202: l(0, 0, "onSceneEnd auth success");
        if ((this.jwZ == 22) && (this.jwY.Version < c.jqG))
        {
          AppMethodBeat.o(17637);
        }
        else
        {
          this.jwX.jBi = new com.tencent.mm.bt.b(l.d(this.jxa.getBytes(), this.jxb));
          this.jwX.jCs = 1;
          this.jwX.ID = this.authId;
          try
          {
            ab.i("MicroMsg.BackupAuthScene", "directSendAuthOk");
            b.r(this.jwX.toByteArray(), 1, paramInt);
            AppMethodBeat.o(17637);
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.BackupAuthScene", localException, "directSendAuthOk req to bur err.", new Object[0]);
            AppMethodBeat.o(17637);
          }
        }
      }
    }
  }

  public final void u(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      localv = this.jwX;
      localv.jCu |= c.jqK;
    }
    v localv = this.jwX;
    localv.jCu |= c.jqL;
    localv = this.jwX;
    localv.jCu |= c.jqM;
    if (paramBoolean2)
    {
      localv = this.jwX;
      localv.jCu |= c.jqN;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.a
 * JD-Core Version:    0.6.2
 */