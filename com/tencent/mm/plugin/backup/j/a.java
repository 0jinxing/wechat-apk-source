package com.tencent.mm.plugin.backup.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public class a
  implements at
{
  private static a jCS;
  private c jCT;
  private c jCU;
  private c jCV;
  private c jCW;
  private bz.a jCX;
  private bz.a jCY;

  public a()
  {
    AppMethodBeat.i(18097);
    this.jCT = new a.1(this);
    this.jCU = new a.2(this);
    this.jCV = new a.3(this);
    this.jCW = new a.4(this);
    this.jCX = new a.5(this);
    this.jCY = new a.6(this);
    ab.i("MicroMsg.BackupCore", "BackupCore init");
    AppMethodBeat.o(18097);
  }

  public static void reset()
  {
    AppMethodBeat.i(18098);
    if (d.aSB())
      AppMethodBeat.o(18098);
    while (true)
    {
      return;
      jCS = null;
      com.tencent.mm.plugin.backup.b.a.aSo();
      d.aSC();
      AppMethodBeat.o(18098);
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(18099);
    b localb = b.aVg();
    ab.i("MicroMsg.BackupEventListener", "init addListener");
    localb.jDe = new b.1(localb);
    com.tencent.mm.sdk.b.a.xxA.c(localb.jDe);
    localb.jDf = new b.2(localb);
    com.tencent.mm.sdk.b.a.xxA.c(localb.jDf);
    localb.gRa = new b.3(localb);
    com.tencent.mm.sdk.b.a.xxA.c(localb.gRa);
    aw.getSysCmdMsgExtension().a("MMBakChatNotify", this.jCX, true);
    aw.getSysCmdMsgExtension().a("ChatSync", this.jCY, true);
    com.tencent.mm.sdk.b.a.xxA.b(this.jCT);
    com.tencent.mm.sdk.b.a.xxA.b(this.jCU);
    com.tencent.mm.sdk.b.a.xxA.b(this.jCV);
    com.tencent.mm.sdk.b.a.xxA.b(this.jCW);
    AppMethodBeat.o(18099);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(18100);
    b localb = b.aVg();
    com.tencent.mm.sdk.b.a.xxA.d(localb.jDe);
    com.tencent.mm.sdk.b.a.xxA.d(localb.jDf);
    com.tencent.mm.sdk.b.a.xxA.d(localb.gRa);
    aw.getSysCmdMsgExtension().b("MMBakChatNotify", this.jCX, true);
    aw.getSysCmdMsgExtension().b("ChatSync", this.jCY, true);
    com.tencent.mm.sdk.b.a.xxA.d(this.jCT);
    com.tencent.mm.sdk.b.a.xxA.d(this.jCU);
    com.tencent.mm.sdk.b.a.xxA.d(this.jCV);
    com.tencent.mm.sdk.b.a.xxA.d(this.jCW);
    AppMethodBeat.o(18100);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.j.a
 * JD-Core Version:    0.6.2
 */