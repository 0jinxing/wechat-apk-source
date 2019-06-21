package com.tencent.mm.plugin.wallet_core.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.c;

public final class i
{
  public int tyd;
  public String tye;
  public int tyf;
  public String tyg;
  public int tyh;
  public c tyi;

  public i()
  {
    AppMethodBeat.i(46739);
    this.tyd = 0;
    this.tye = "";
    this.tyf = 0;
    this.tyg = "";
    this.tyh = 0;
    this.tyi = new c();
    AppMethodBeat.o(46739);
  }

  public i(Bundle paramBundle)
  {
    AppMethodBeat.i(46740);
    this.tyd = 0;
    this.tye = "";
    this.tyf = 0;
    this.tyg = "";
    this.tyh = 0;
    this.tyi = new c();
    this.tyd = paramBundle.getInt("key_is_gen_cert", 0);
    this.tyf = paramBundle.getInt("key_is_hint_crt", 0);
    this.tyh = paramBundle.getInt("key_is_ignore_cert", 0);
    this.tye = paramBundle.getString("key_crt_token", "");
    this.tyg = paramBundle.getString("key_crt_wording", "");
    this.tyi = new c(this.tyg);
    AppMethodBeat.o(46740);
  }

  public final boolean cPm()
  {
    AppMethodBeat.i(46741);
    boolean bool;
    if ((this.tyf != 0) && (!bo.isNullOrNil(this.tyg)))
    {
      bool = true;
      AppMethodBeat.o(46741);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46741);
    }
  }

  public final boolean cPn()
  {
    boolean bool = true;
    if (this.tyd == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean cPo()
  {
    AppMethodBeat.i(46742);
    boolean bool;
    if ((cPn()) && (this.tyh == 0))
    {
      bool = true;
      AppMethodBeat.o(46742);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46742);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.i
 * JD-Core Version:    0.6.2
 */