package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.ai.g;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.plugin.backup.i.ad;
import com.tencent.mm.plugin.backup.i.ae;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

public final class d extends com.tencent.mm.plugin.backup.g.b
{
  private static int progress;
  private int frO;
  public String id;
  private g jAi;
  private ad jAk;
  private ae jAl;
  private String jAm;
  private byte[] key;
  private int offset;
  private int start;

  public d(String paramString1, String paramString2, int paramInt1, int paramInt2, g paramg, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17887);
    this.jAk = new ad();
    this.jAl = new ae();
    this.jAi = null;
    this.start = 0;
    this.offset = 0;
    if (paramInt1 == 1);
    for (this.jAm = (paramString1 + "backupItem/" + com.tencent.mm.plugin.backup.bakoldlogic.a.a.Fb(paramString2)); ; this.jAm = (paramString1 + "backupMeida/" + com.tencent.mm.plugin.backup.bakoldlogic.a.a.Fb(paramString2)))
    {
      this.id = paramString2;
      this.jAk.jCx = paramString2;
      this.jAk.jCy = paramInt1;
      this.frO = paramInt2;
      ab.i("MicroMsg.BakSceneRestoreData", "BakSceneRestoreData init, %s, type:%d, totalLen:%d", new Object[] { this.jAk.jCx, Integer.valueOf(this.jAk.jCy), Integer.valueOf(this.frO) });
      this.jAi = paramg;
      this.key = paramArrayOfByte;
      AppMethodBeat.o(17887);
      return;
    }
  }

  public static void setProgress(int paramInt)
  {
    AppMethodBeat.i(17889);
    ab.i("MicroMsg.BakSceneRestoreData", "setProgress %d", new Object[] { Integer.valueOf(paramInt) });
    progress = paramInt;
    AppMethodBeat.o(17889);
  }

  public final com.tencent.mm.bt.a aTS()
  {
    return this.jAl;
  }

  public final com.tencent.mm.bt.a aTT()
  {
    return this.jAk;
  }

  public final boolean aUc()
  {
    long l = 524288L;
    AppMethodBeat.i(17888);
    ab.i("MicroMsg.BakSceneRestoreData", "doSecne");
    int i = this.frO;
    if (this.jAk.jCy == 2)
      if (this.frO - this.offset > 524288L)
        i = (int)l;
    while (true)
    {
      this.start = this.offset;
      this.offset = (i + this.start);
      this.jAk.jCA = this.start;
      this.jAk.jCB = this.offset;
      this.jAk.jCD = progress;
      boolean bool = super.aUc();
      AppMethodBeat.o(17888);
      return bool;
      l = this.frO - this.offset;
      break;
    }
  }

  public final int getType()
  {
    return 7;
  }

  public final void rw(int paramInt)
  {
    AppMethodBeat.i(17890);
    ab.i("MicroMsg.BakSceneRestoreData", "onSceneEnd id:%s, type:%d, s:%d, e:%d, status:%d", new Object[] { this.jAl.jCx, Integer.valueOf(this.jAl.jCy), Integer.valueOf(this.jAl.jCA), Integer.valueOf(this.jAl.jCB), Integer.valueOf(this.jAl.jBT) });
    if ((this.jAl.jBT != 0) && (this.jAl.jBT != 10))
    {
      l(4, this.jAl.jBT, "error");
      AppMethodBeat.o(17890);
    }
    while (true)
    {
      return;
      if ((this.jAl.jCA == this.start) && (this.jAl.jCB == this.offset))
        break;
      ab.e("MicroMsg.BakSceneRestoreData", "err local:%d, %d;   server:%d,%d", new Object[] { Integer.valueOf(this.start), Integer.valueOf(this.offset), Integer.valueOf(this.jAl.jCA), Integer.valueOf(this.jAl.jCB) });
      l(3, -1, "error");
      AppMethodBeat.o(17890);
    }
    this.jAi.a(this.jAk.jCB - this.jAk.jCA, this.frO, this);
    byte[] arrayOfByte = this.jAl.jBi.wR;
    Object localObject;
    boolean bool;
    if (this.key != null)
    {
      localObject = this.key;
      if (this.offset == this.frO)
      {
        bool = true;
        label290: arrayOfByte = AesEcb.aesCryptEcb(arrayOfByte, (byte[])localObject, false, bool);
      }
    }
    while (true)
    {
      String str = this.jAm;
      localObject = this.id;
      File localFile = new File(str + (String)localObject);
      long l1;
      label353: long l2;
      if (localFile.exists())
      {
        l1 = localFile.length();
        e.b(str, (String)localObject, arrayOfByte);
        localFile = new File(str + (String)localObject);
        if (!localFile.exists())
          break label545;
        l2 = localFile.length();
        label404: if (l1 == l2)
        {
          ab.e("MicroMsg.BakSceneRestoreData", "append failed and try again:%s", new Object[] { str + (String)localObject });
          e.b(str, (String)localObject, arrayOfByte);
        }
        if (arrayOfByte != null)
          break label551;
      }
      label545: label551: for (paramInt = 0; ; paramInt = arrayOfByte.length)
      {
        ab.i("MicroMsg.BakSceneRestoreData", "onSceneEnd appendbuf len:%d", new Object[] { Integer.valueOf(paramInt) });
        if (this.offset != this.frO)
          break label557;
        ab.i("MicroMsg.BakSceneRestoreData", "recover cmoplete:%s  %d", new Object[] { this.id, Integer.valueOf(this.frO) });
        l(0, 0, "success");
        AppMethodBeat.o(17890);
        break;
        bool = false;
        break label290;
        l1 = 0L;
        break label353;
        l2 = 0L;
        break label404;
      }
      label557: aUc();
      AppMethodBeat.o(17890);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.c.d
 * JD-Core Version:    0.6.2
 */