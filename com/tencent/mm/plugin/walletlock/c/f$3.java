package com.tencent.mm.plugin.walletlock.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.tr;
import com.tencent.mm.g.a.tr.a;
import com.tencent.mm.plugin.walletlock.gesture.a.d;
import com.tencent.mm.plugin.walletlock.gesture.a.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bim;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class f$3 extends c<tr>
{
  f$3(f paramf)
  {
    AppMethodBeat.i(51711);
    this.xxI = tr.class.getName().hashCode();
    AppMethodBeat.o(51711);
  }

  private static boolean a(tr paramtr)
  {
    AppMethodBeat.i(51712);
    bim localbim = paramtr.cPQ.cPR;
    paramtr = g.tWY;
    g.cTq();
    boolean bool = e.b(localbim);
    if (bool)
    {
      ab.i("MicroMsg.WalletLockInitTask", "tom update PatternLockInfo, sign_len:%d,valid:%b,status:%d,ver:%d", new Object[] { Integer.valueOf(localbim.wLS.getILen()), Boolean.valueOf(bool), Integer.valueOf(localbim.wLT), Integer.valueOf(localbim.wLR) });
      d.a(localbim);
    }
    while (true)
    {
      bool = e.cTz();
      ab.i("MicroMsg.WalletLockInitTask", "alvinluo after update gesture server info, isUserSetGesturePwd: %b", new Object[] { Boolean.valueOf(bool) });
      com.tencent.mm.plugin.walletlock.gesture.a.b.nx(bool);
      ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.walletlock.a.b.class)).init();
      AppMethodBeat.o(51712);
      return false;
      ab.w("MicroMsg.WalletLockInitTask", "UserInfoExt.PatternLockInfo is null or invalid.");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.c.f.3
 * JD-Core Version:    0.6.2
 */