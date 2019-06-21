package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.b.a.a;
import com.tencent.mm.plugin.account.friend.a.ak;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;

public class RegByFacebookSetPwdUI extends SetPwdUI
{
  protected final ProgressDialog a(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(125328);
    paramContext = h.b(paramContext, getString(2131302257), true, paramOnCancelListener);
    AppMethodBeat.o(125328);
    return paramContext;
  }

  protected final void a(a.a parama)
  {
    AppMethodBeat.i(125332);
    switch (RegByFacebookSetPwdUI.2.gzb[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(125332);
      while (true)
      {
        return;
        h.g(this, 2131302253, 2131302255);
        AppMethodBeat.o(125332);
        continue;
        h.g(this, 2131302254, 2131302255);
        AppMethodBeat.o(125332);
        continue;
        h.g(this, 2131304234, 2131296904);
        AppMethodBeat.o(125332);
      }
      h.g(this, 2131304236, 2131296904);
    }
  }

  protected final m ark()
  {
    AppMethodBeat.i(125329);
    ak localak = new ak(this.gHW);
    AppMethodBeat.o(125329);
    return localak;
  }

  protected final String arl()
  {
    AppMethodBeat.i(125330);
    String str = ((EditText)findViewById(2131826922)).getText().toString();
    AppMethodBeat.o(125330);
    return str;
  }

  protected final String arm()
  {
    AppMethodBeat.i(125331);
    String str = ((EditText)findViewById(2131826923)).getText().toString();
    AppMethodBeat.o(125331);
    return str;
  }

  protected final int arn()
  {
    return 382;
  }

  public final int getLayoutId()
  {
    return 2130970495;
  }

  public final void initView()
  {
    AppMethodBeat.i(138726);
    setMMTitle(2131302266);
    AppMethodBeat.o(138726);
  }

  protected final boolean k(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(125333);
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      g.RP().Ry().set(57, Integer.valueOf(0));
      h.a(this, getString(2131302264, new Object[] { (String)g.RP().Ry().get(5, null) }), getString(2131302255), new RegByFacebookSetPwdUI.1(this));
      AppMethodBeat.o(125333);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = j(paramInt1, paramInt2, paramString);
      AppMethodBeat.o(125333);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125325);
    super.onCreate(paramBundle);
    setMMTitle(2131302266);
    AppMethodBeat.o(125325);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125326);
    super.onDestroy();
    AppMethodBeat.o(125326);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByFacebookSetPwdUI
 * JD-Core Version:    0.6.2
 */