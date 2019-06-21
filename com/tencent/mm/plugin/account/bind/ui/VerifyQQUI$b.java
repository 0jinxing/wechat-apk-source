package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.bind.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.lang.ref.WeakReference;

final class VerifyQQUI$b
  implements MenuItem.OnMenuItemClickListener
{
  WeakReference<VerifyQQUI> bSI;

  protected VerifyQQUI$b(VerifyQQUI paramVerifyQQUI)
  {
    AppMethodBeat.i(13784);
    this.bSI = new WeakReference(paramVerifyQQUI);
    AppMethodBeat.o(13784);
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13785);
    paramMenuItem = (VerifyQQUI)this.bSI.get();
    if ((paramMenuItem == null) || (paramMenuItem.isFinishing()))
      AppMethodBeat.o(13785);
    while (true)
    {
      return true;
      Object localObject = (EditText)paramMenuItem.findViewById(2131821782);
      EditText localEditText = (EditText)paramMenuItem.findViewById(2131821783);
      localObject = ((EditText)localObject).getText().toString().trim();
      VerifyQQUI.a(paramMenuItem, localEditText.getText().toString().trim());
      try
      {
        VerifyQQUI.a(paramMenuItem, bo.getLong((String)localObject, 0L));
        if (VerifyQQUI.c(paramMenuItem) >= 10000L)
          break label152;
        h.g(paramMenuItem.mController.ylL, 2131297618, 2131297616);
        AppMethodBeat.o(13785);
      }
      catch (Exception localException)
      {
        h.g(paramMenuItem.mController.ylL, 2131297618, 2131297616);
        AppMethodBeat.o(13785);
      }
      continue;
      label152: if (VerifyQQUI.d(paramMenuItem).equals(""))
      {
        h.g(paramMenuItem.mController.ylL, 2131297617, 2131297616);
        AppMethodBeat.o(13785);
      }
      else
      {
        paramMenuItem.aqX();
        localObject = new b(VerifyQQUI.c(paramMenuItem), VerifyQQUI.d(paramMenuItem), "", "", "", VerifyQQUI.f(paramMenuItem), VerifyQQUI.g(paramMenuItem), false);
        g.Rg().a((m)localObject, 0);
        AppCompatActivity localAppCompatActivity = paramMenuItem.mController.ylL;
        paramMenuItem.getString(2131297620);
        VerifyQQUI.a(paramMenuItem, h.b(localAppCompatActivity, paramMenuItem.getString(2131297611), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            AppMethodBeat.i(13783);
            g.Rg().c(this.guz);
            AppMethodBeat.o(13783);
          }
        }));
        AppMethodBeat.o(13785);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.VerifyQQUI.b
 * JD-Core Version:    0.6.2
 */