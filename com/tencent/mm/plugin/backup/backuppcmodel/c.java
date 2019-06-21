package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.plugin.backup.g.b.c;
import com.tencent.mm.plugin.backup.g.b.d;
import com.tencent.mm.plugin.backup.g.h.a;
import com.tencent.mm.plugin.backup.g.j.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public final class c
{
  private static boolean aGz = false;
  private static int eRu = 2;
  private ap jtF;
  final f jtG;
  private final f jtH;
  b.c jtL;
  private final j.a jtM;
  public int jwa;
  public String jwb;
  String jwc;
  int jwd;
  boolean jwe;
  private com.tencent.mm.bt.b jwf;
  public int jwg;
  public boolean jwh;
  private final b.d jwi;
  public final h.a jwj;

  public c()
  {
    AppMethodBeat.i(17510);
    this.jwa = 0;
    this.jwh = true;
    this.jtG = new c.1(this);
    this.jtH = new c.3(this);
    this.jwi = new c.4(this);
    this.jtM = new c.6(this);
    this.jwj = new h.a()
    {
      public final void aTK()
      {
        AppMethodBeat.i(17507);
        ab.i("MicroMsg.BackupPcProcessMgr", "reconnectCallback callback to reconnect");
        int i;
        if (b.aTD().aSu().jqW != 5)
        {
          b.aTD().aSu().jqW = 5;
          i = b.aTD().aTE().jwa;
          if ((1 != i) && (3 != i))
            break label82;
          b.aTD().aTF().ru(5);
        }
        while (true)
        {
          c.this.rs(9);
          AppMethodBeat.o(17507);
          return;
          label82: if ((2 == i) || (4 == i))
            b.aTD().aTG().rj(5);
        }
      }

      public final void aTL()
      {
        AppMethodBeat.i(17508);
        int i = c.this.jwa;
        ab.i("MicroMsg.BackupPcProcessMgr", "reconnectCallback reconnectFail, commandMode[%d]", new Object[] { Integer.valueOf(i) });
        if ((1 == i) || (3 == i))
        {
          b.aTD().aTF();
          e.aTN();
          b.aTD().aTF().cancel(true);
          b.aTD().aTa().stop();
          b.aTD().aSu().jqW = -4;
          b.aTD().aTF().ru(-4);
          h.pYm.a(400L, 9L, 1L, false);
          b.aTD().aTF().rt(3);
          AppMethodBeat.o(17508);
        }
        while (true)
        {
          return;
          if ((2 == i) || (4 == i))
          {
            b.aTD().aTG();
            d.aTM();
            b.aTD().aTG().c(true, false, -4);
            b.aTD().aTa().stop();
            h.pYm.a(400L, 17L, 1L, false);
            b.aTD().aTG().rt(3);
          }
          AppMethodBeat.o(17508);
        }
      }
    };
    this.jtL = new c.8(this);
    AppMethodBeat.o(17510);
  }

  private void aTI()
  {
    AppMethodBeat.i(17511);
    b.aTD().aTa().connect(this.jwc, this.jwd);
    com.tencent.mm.plugin.backup.g.b.clear();
    com.tencent.mm.plugin.backup.g.b.a(1, this.jtH);
    com.tencent.mm.plugin.backup.g.a locala = new com.tencent.mm.plugin.backup.g.a(b.aTD().jqP, b.aTD().jqQ, com.tencent.mm.plugin.backup.b.d.aSy(), b.aTD().jqO, 0, 1);
    locala.u(true, true);
    locala.jwX.jCv = 1;
    locala.aUc();
    ab.i("MicroMsg.BackupPcProcessMgr", "tryConnect start backupConnectTimerHandler.");
    if (this.jtF == null)
      this.jtF = new ap(new c.2(this), false);
    this.jtF.ae(3000L, 3000L);
    AppMethodBeat.o(17511);
  }

  public static String aTJ()
  {
    AppMethodBeat.i(17512);
    String str = com.tencent.mm.plugin.backup.g.b.aTY();
    AppMethodBeat.o(17512);
    return str;
  }

  public static void aTj()
  {
    AppMethodBeat.i(17515);
    ab.i("MicroMsg.BackupPcProcessMgr", "backupSendCancelRequest.");
    com.tencent.mm.plugin.backup.i.a locala = new com.tencent.mm.plugin.backup.i.a();
    locala.ID = b.aTD().jqO;
    try
    {
      com.tencent.mm.plugin.backup.g.b.K(locala.toByteArray(), 5);
      AppMethodBeat.o(17515);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupPcProcessMgr", localException, "BackupCancelRequest to buf err.", new Object[0]);
        AppMethodBeat.o(17515);
      }
    }
  }

  public static void dA(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(17514);
    ab.i("MicroMsg.BackupPcProcessMgr", "backupSendCommandResponse cmd:%d", new Object[] { Integer.valueOf(paramInt1) });
    com.tencent.mm.plugin.backup.i.c localc = new com.tencent.mm.plugin.backup.i.c();
    localc.jBh = paramInt1;
    try
    {
      com.tencent.mm.plugin.backup.g.b.r(localc.toByteArray(), 18, paramInt2);
      AppMethodBeat.o(17514);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupPcProcessMgr", localException, "BackupCommandResponse to buf err.", new Object[0]);
        AppMethodBeat.o(17514);
      }
    }
  }

  public final void a(boolean paramBoolean, com.tencent.mm.bt.b paramb)
  {
    this.jwe = paramBoolean;
    this.jwf = paramb;
  }

  public final void rs(int paramInt)
  {
    AppMethodBeat.i(17513);
    ab.i("MicroMsg.BackupPcProcessMgr", "backupSendCommandRequest cmd:%d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.backup.i.b localb = new com.tencent.mm.plugin.backup.i.b();
    localb.jBh = paramInt;
    if (paramInt == 9)
      localb.jBi = this.jwf;
    try
    {
      com.tencent.mm.plugin.backup.g.b.K(localb.toByteArray(), 17);
      AppMethodBeat.o(17513);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupPcProcessMgr", localException, "BackupCommandRequest to buf err.", new Object[0]);
        AppMethodBeat.o(17513);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.c
 * JD-Core Version:    0.6.2
 */