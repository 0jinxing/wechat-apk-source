package com.tencent.mm.plugin.wallet_payu.create.a;

import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class c$4 extends g
{
  c$4(c paramc, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(48380);
    if (((paramm instanceof a)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.d("MicroMsg.PayUOpenProcess", "hy: create user success");
      com.tencent.mm.wallet_core.a.b(this.hwd, this.tTg.mqu, 0);
      c.d(this.tTg).putInt("key_open_error_code", 0);
      t.makeText(this.hwd, this.hwd.getString(2131305226), 0).show();
      AppMethodBeat.o(48380);
    }
    while (true)
    {
      return bool;
      if (((paramm instanceof b)) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        ab.d("MicroMsg.PayUOpenProcess", "hy: link user success");
        com.tencent.mm.wallet_core.a.b(this.hwd, this.tTg.mqu, 0);
        c.e(this.tTg).putInt("key_open_error_code", 0);
        t.makeText(this.hwd, this.hwd.getString(2131305226), 0).show();
        AppMethodBeat.o(48380);
      }
      else
      {
        AppMethodBeat.o(48380);
        bool = false;
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48381);
    Object localObject = (s)paramArrayOfObject[0];
    paramArrayOfObject = this.tTg.mqu.getString("dial_code");
    String str1 = this.tTg.mqu.getString("key_mobile");
    String str2 = ((s)localObject).guu;
    localObject = this.tTg.mqu.getString("key_question_id");
    String str3 = this.tTg.mqu.getString("key_question_answer");
    String str4 = this.tTg.mqu.getString("payu_reference");
    if (!this.tTg.mqu.getBoolean("key_is_has_mobile"))
      this.Agm.a(new a(paramArrayOfObject, str1, str2, (String)localObject, str3, str4), true);
    while (true)
    {
      AppMethodBeat.o(48381);
      return true;
      this.Agm.a(new b(paramArrayOfObject, str1, str2, str4), true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.a.c.4
 * JD-Core Version:    0.6.2
 */