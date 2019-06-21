package com.tencent.mm.plugin.qqmail.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.plugin.qqmail.b.i;
import com.tencent.mm.plugin.qqmail.b.k;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.plugin.qqmail.b.v.a;
import com.tencent.mm.ui.base.h;
import java.io.File;
import java.util.Map;

final class ComposeUI$15 extends v.a
{
  ComposeUI$15(ComposeUI paramComposeUI)
  {
  }

  public final void onComplete()
  {
    AppMethodBeat.i(68193);
    if (ComposeUI.G(this.pwY) != null)
    {
      ComposeUI.G(this.pwY).dismiss();
      ComposeUI.a(this.pwY, null);
    }
    AppMethodBeat.o(68193);
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(68192);
    if (paramInt == -5)
    {
      this.pwY.pwy.a(new ComposeUI.15.2(this));
      AppMethodBeat.o(68192);
    }
    while (true)
    {
      return;
      h.a(this.pwY, paramString, this.pwY.getString(2131301966), null);
      AppMethodBeat.o(68192);
    }
  }

  public final void onSuccess(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(68191);
    h.a(this.pwY, 2131301968, 2131297061, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(68189);
        paramAnonymousDialogInterface = ac.ccC().puE;
        String str = ComposeUI.J(ComposeUI.15.this.pwY);
        paramAnonymousInt = ComposeUI.K(ComposeUI.15.this.pwY);
        paramAnonymousDialogInterface = new File(paramAnonymousDialogInterface.ptG.ptQ + i.cR(str, paramAnonymousInt));
        if (paramAnonymousDialogInterface.exists())
          paramAnonymousDialogInterface.delete();
        ComposeUI.15.this.pwY.setResult(-1);
        ComposeUI.15.this.pwY.finish();
        AppMethodBeat.o(68189);
      }
    });
    ComposeUI.d(this.pwY).cG(this.pwY.pwf.getMailAddrs());
    ComposeUI.d(this.pwY).cG(ComposeUI.e(this.pwY).getMailAddrs());
    ComposeUI.d(this.pwY).cG(ComposeUI.f(this.pwY).getMailAddrs());
    AppMethodBeat.o(68191);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.15
 * JD-Core Version:    0.6.2
 */