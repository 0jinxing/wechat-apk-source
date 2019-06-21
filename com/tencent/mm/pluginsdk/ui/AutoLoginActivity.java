package com.tencent.mm.pluginsdk.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public abstract class AutoLoginActivity extends MMActivity
{
  private void KJ(int paramInt)
  {
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.AutoLoginActivity", "onNewIntent, should not reach here, resultCode = ".concat(String.valueOf(paramInt)));
      a(AutoLoginActivity.a.vgK, getIntent());
    case -1:
    case 0:
    case 1:
    }
    while (true)
    {
      return;
      a(AutoLoginActivity.a.vgJ, getIntent());
      continue;
      bVD();
      continue;
      a(AutoLoginActivity.a.vgL, getIntent());
    }
  }

  protected abstract boolean O(Intent paramIntent);

  protected abstract void a(AutoLoginActivity.a parama, Intent paramIntent);

  protected boolean bVD()
  {
    g.RN();
    if ((!com.tencent.mm.kernel.a.QX()) || (com.tencent.mm.kernel.a.QT()))
    {
      ab.w("MicroMsg.AutoLoginActivity", "not login");
      Intent localIntent1 = new Intent(this, getClass());
      localIntent1.putExtras(getIntent());
      localIntent1.addFlags(67108864);
      localIntent1.setDataAndType(getIntent().getData(), getIntent().getType());
      localIntent1.setAction(getIntent().getAction());
      Intent localIntent2 = new Intent();
      localIntent2.putExtras(getIntent());
      d.a(this, "account", "com.tencent.mm.plugin.account.ui.SimpleLoginUI", localIntent2, localIntent1);
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setTitleVisibility(8);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      ab.e("MicroMsg.AutoLoginActivity", "onCreate intent is null");
      finish();
    }
    while (true)
    {
      return;
      d.dlL();
      ab.i("MicroMsg.AutoLoginActivity", "onCreate, intent action = " + paramBundle.getAction());
      int i = w.a(paramBundle, "wizard_activity_result_code", -2);
      ab.i("MicroMsg.AutoLoginActivity", "onCreate, resultCode = ".concat(String.valueOf(i)));
      if (i != -2)
      {
        KJ(i);
      }
      else if (!O(paramBundle))
      {
        ab.e("MicroMsg.AutoLoginActivity", "preLogin fail, no need to process");
        finish();
      }
      else if (bVD())
      {
        finish();
        ab.w("MicroMsg.AutoLoginActivity", "not login, go to SimpleLogin");
      }
      else
      {
        a(AutoLoginActivity.a.vgJ, paramBundle);
      }
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public void onNewIntent(Intent paramIntent)
  {
    if (paramIntent == null);
    while (true)
    {
      return;
      super.onNewIntent(paramIntent);
      setIntent(paramIntent);
      int i = w.a(paramIntent, "wizard_activity_result_code", 0);
      ab.i("MicroMsg.AutoLoginActivity", "onNewIntent, resultCode = ".concat(String.valueOf(i)));
      KJ(i);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.AutoLoginActivity
 * JD-Core Version:    0.6.2
 */