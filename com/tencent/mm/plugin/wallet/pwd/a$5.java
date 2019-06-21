package com.tencent.mm.plugin.wallet.pwd;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pwd.a.l;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.i;

final class a$5 extends com.tencent.mm.wallet_core.d.g
{
  a$5(a parama, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(46134);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (((paramm instanceof l)) || ((paramm instanceof com.tencent.mm.plugin.wallet.pwd.a.g))))
    {
      this.tqt.a(this.hwd, 0, a.f(this.tqt));
      bool = true;
      AppMethodBeat.o(46134);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(46134);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(46135);
    paramArrayOfObject = (s)paramArrayOfObject[0];
    if (this.tqt.mqu.getBoolean("key_is_set_pwd_after_face_action"))
    {
      ab.i("MicroMsg.ProcessManager", "WalletPwdConfirmUI controller onNext, after face verify, reset pwd by face");
      String str = this.tqt.mqu.getString("key_face_action_result_token");
      this.Agm.a(new com.tencent.mm.plugin.wallet.pwd.a.g(str, paramArrayOfObject.guu), true, 1);
    }
    while (true)
    {
      AppMethodBeat.o(46135);
      return true;
      ab.i("MicroMsg.ProcessManager", "WalletPwdConfirmUI controller onNext, not after face verify, reset pwd normal");
      this.Agm.a(new l(paramArrayOfObject), true, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.5
 * JD-Core Version:    0.6.2
 */