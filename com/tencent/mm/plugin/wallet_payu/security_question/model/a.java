package com.tencent.mm.plugin.wallet_payu.security_question.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public final class a extends g
{
  private Bundle mqu;

  public a(MMActivity paramMMActivity, i parami, Bundle paramBundle)
  {
    super(paramMMActivity, parami);
    this.mqu = paramBundle;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48566);
    if (((paramm instanceof c)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (c)paramm;
      this.mqu.putParcelable("key_security_question", new PayUSecurityQuestion(paramString.id, paramString.tUL));
      AppMethodBeat.o(48566);
    }
    while (true)
    {
      return bool;
      if ((paramm instanceof b))
      {
        paramString = (b)paramm;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (paramString.lSP)
          {
            this.mqu.putString("payu_reference", paramString.tUK);
            com.tencent.mm.wallet_core.a.j(this.hwd, this.mqu);
            bool = true;
            AppMethodBeat.o(48566);
            continue;
          }
          AppMethodBeat.o(48566);
        }
      }
      else
      {
        AppMethodBeat.o(48566);
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48567);
    PayUSecurityQuestion localPayUSecurityQuestion = (PayUSecurityQuestion)this.mqu.getParcelable("key_security_question");
    String str = this.mqu.getString("key_question_answer");
    paramArrayOfObject = this.mqu.getString("payu_reference");
    this.Agm.a(new b(paramArrayOfObject, localPayUSecurityQuestion.id, str), true);
    AppMethodBeat.o(48567);
    return false;
  }

  public final boolean w(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48565);
    this.Agm.a(new c(this.mqu.getString("payu_reference")), true);
    AppMethodBeat.o(48565);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.security_question.model.a
 * JD-Core Version:    0.6.2
 */