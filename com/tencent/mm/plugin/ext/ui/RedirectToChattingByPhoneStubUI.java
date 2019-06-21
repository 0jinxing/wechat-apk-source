package com.tencent.mm.plugin.ext.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.h;

public class RedirectToChattingByPhoneStubUI extends Activity
  implements f
{
  private com.tencent.mm.ui.base.p lRg = null;

  public final boolean hideVKB()
  {
    boolean bool = false;
    AppMethodBeat.i(20438);
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null)
      AppMethodBeat.o(20438);
    while (true)
    {
      return bool;
      Object localObject = getCurrentFocus();
      if (localObject == null)
      {
        AppMethodBeat.o(20438);
        continue;
      }
      localObject = ((View)localObject).getWindowToken();
      if (localObject == null)
      {
        AppMethodBeat.o(20438);
        continue;
      }
      try
      {
        bool = localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
        ab.v("MicroMsg.RedirectToChattingByPhoneStubUI", "hide VKB result %B", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(20438);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        while (true)
        {
          ab.e("MicroMsg.RedirectToChattingByPhoneStubUI", "hide VKB exception %s", new Object[] { localIllegalArgumentException });
          bool = false;
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(20435);
    super.onCreate(paramBundle);
    getString(2131297086);
    this.lRg = h.b(this, "", false, null);
    al.n(new RedirectToChattingByPhoneStubUI.1(this), 500L);
    aw.Rg().a(106, this);
    AppMethodBeat.o(20435);
  }

  protected void onDestroy()
  {
    AppMethodBeat.i(20436);
    super.onDestroy();
    aw.Rg().b(106, this);
    if (this.lRg != null)
    {
      this.lRg.dismiss();
      this.lRg = null;
    }
    AppMethodBeat.o(20436);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(20437);
    finish();
    AppMethodBeat.o(20437);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.ui.RedirectToChattingByPhoneStubUI
 * JD-Core Version:    0.6.2
 */