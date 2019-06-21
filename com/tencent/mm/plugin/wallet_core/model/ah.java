package com.tencent.mm.plugin.wallet_core.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;

public final class ah
{
  public ArrayList<Bankcard> tCN;
  public String tCO;

  public ah()
  {
    AppMethodBeat.i(46944);
    this.tCN = new ArrayList();
    AppMethodBeat.o(46944);
  }

  public final Bankcard acB(String paramString)
  {
    AppMethodBeat.i(46945);
    Bankcard localBankcard;
    if (this.tCN.size() > 0)
    {
      Iterator localIterator = this.tCN.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localBankcard = (Bankcard)localIterator.next();
      }
      while (!localBankcard.field_bindSerial.equals(paramString));
    }
    for (paramString = localBankcard; ; paramString = null)
    {
      if (paramString == null)
        ab.e("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo return null");
      while (true)
      {
        AppMethodBeat.o(46945);
        return paramString;
        ab.i("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo succ");
        continue;
        ab.e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list size is 0");
        paramString = null;
      }
    }
  }

  public final boolean cPU()
  {
    AppMethodBeat.i(46946);
    boolean bool;
    if (this.tCN.size() > 0)
    {
      bool = true;
      AppMethodBeat.o(46946);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46946);
    }
  }

  public final Bankcard cPV()
  {
    AppMethodBeat.i(46947);
    Bankcard localBankcard;
    if (cPU())
      if (!TextUtils.isEmpty(this.tCO))
      {
        localBankcard = acB(this.tCO);
        AppMethodBeat.o(46947);
      }
    while (true)
    {
      return localBankcard;
      ab.i("MicroMsg.WalletRepaymentBankcardMgr", "last_use_card_serialno is empty,return the first one");
      localBankcard = (Bankcard)this.tCN.get(0);
      AppMethodBeat.o(46947);
      continue;
      ab.e("MicroMsg.WalletRepaymentBankcardMgr", "Repayment card list is null");
      localBankcard = null;
      AppMethodBeat.o(46947);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.ah
 * JD-Core Version:    0.6.2
 */