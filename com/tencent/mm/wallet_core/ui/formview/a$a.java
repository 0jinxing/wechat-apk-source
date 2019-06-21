package com.tencent.mm.wallet_core.ui.formview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tenpay.android.wechat.TenpaySecureEditText;

public final class a$a extends a.b
{
  private int AhT;
  private WalletFormView AhU;

  public a$a(WalletFormView paramWalletFormView)
  {
    this(paramWalletFormView, (byte)0);
  }

  public a$a(WalletFormView paramWalletFormView, byte paramByte)
  {
    super((byte)0);
    AppMethodBeat.i(49368);
    this.AhT = 1;
    this.AhU = paramWalletFormView;
    this.AhT = 1;
    dOO();
    AppMethodBeat.o(49368);
  }

  private void dOO()
  {
    AppMethodBeat.i(49370);
    if (this.AhT == 1)
    {
      if (this.AhU == null)
        break label56;
      this.AhU.setKeyListener(new a.a.1(this));
      AppMethodBeat.o(49370);
    }
    while (true)
    {
      return;
      if (this.AhU != null)
        this.AhU.setInputType(1);
      label56: AppMethodBeat.o(49370);
    }
  }

  public final void QT(int paramInt)
  {
    AppMethodBeat.i(49369);
    this.AhT = paramInt;
    dOO();
    AppMethodBeat.o(49369);
  }

  public final boolean a(WalletFormView paramWalletFormView)
  {
    AppMethodBeat.i(49371);
    int i = this.AhT;
    boolean bool;
    if (paramWalletFormView.Aih == null)
    {
      bool = false;
      AppMethodBeat.o(49371);
    }
    while (true)
    {
      return bool;
      bool = paramWalletFormView.Aih.isAreaIDCardNum(i);
      AppMethodBeat.o(49371);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.a.a
 * JD-Core Version:    0.6.2
 */