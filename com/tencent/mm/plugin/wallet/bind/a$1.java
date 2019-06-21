package com.tencent.mm.plugin.wallet.bind;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.bind.a.d;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class a$1 extends g
{
  private String czZ = null;

  a$1(a parama, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final CharSequence Au(int paramInt)
  {
    AppMethodBeat.i(45717);
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.Au(paramInt);
      AppMethodBeat.o(45717);
    case 1:
    }
    while (true)
    {
      return localObject;
      localObject = this.hwd.getString(2131304857);
      AppMethodBeat.o(45717);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45714);
    if ((paramm instanceof d))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.tld.mqu.putInt("key_process_result_code", -1);
        if (this.tld.c(this.hwd, null))
        {
          this.Agm.a(new y(this.czZ, 14), true, 1);
          AppMethodBeat.o(45714);
        }
      }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      this.tld.a(this.hwd, 0, null);
      if ((this.hwd instanceof WalletBaseUI))
        ((WalletBaseUI)this.hwd).wU(0);
      this.hwd.finish();
      break;
      this.tld.mqu.putInt("key_process_result_code", 1);
      AppMethodBeat.o(45714);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    boolean bool1 = true;
    AppMethodBeat.i(45716);
    Object localObject = (Bankcard)a.d(this.tld).getParcelable("key_bankcard");
    String str = (String)paramArrayOfObject[0];
    this.czZ = ((String)paramArrayOfObject[1]);
    if (localObject != null)
    {
      i locali = this.Agm;
      paramArrayOfObject = ((Bankcard)localObject).field_bankcardType;
      localObject = ((Bankcard)localObject).field_bindSerial;
      if (a.e(this.tld).getInt("scene", -1) == 2)
      {
        bool2 = true;
        locali.a(new d(paramArrayOfObject, (String)localObject, str, bool2), true, 1);
        AppMethodBeat.o(45716);
      }
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      this.tld.mqu.putInt("key_process_result_code", 1);
      AppMethodBeat.o(45716);
    }
  }

  public final boolean w(Object[] paramArrayOfObject)
  {
    boolean bool1 = true;
    AppMethodBeat.i(45715);
    Object localObject = (Bankcard)a.a(this.tld).getParcelable("key_bankcard");
    boolean bool2;
    if ((localObject != null) && (((Bankcard)localObject).field_bankcardState == 1))
    {
      paramArrayOfObject = this.Agm;
      String str = ((Bankcard)localObject).field_bankcardType;
      localObject = ((Bankcard)localObject).field_bindSerial;
      if (a.b(this.tld).getInt("scene", -1) == 2)
      {
        bool2 = true;
        paramArrayOfObject.a(new d(str, (String)localObject, bool2), true, 1);
        a.c(this.tld).putBoolean("key_is_expired_bankcard", true);
        AppMethodBeat.o(45715);
        bool2 = bool1;
      }
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      this.tld.mqu.putInt("key_process_result_code", 1);
      bool2 = super.w(paramArrayOfObject);
      AppMethodBeat.o(45715);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.a.1
 * JD-Core Version:    0.6.2
 */