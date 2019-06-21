package com.tencent.mm.plugin.forcenotify.ui;

import a.a.j;
import a.l;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.forcenotify.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.util.concurrent.ConcurrentLinkedQueue;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/forcenotify/ui/BaseForceNotifyShowUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "username", "getUsername", "setUsername", "(Ljava/lang/String;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "plugin-force-notify_release"})
@com.tencent.mm.ui.base.a(3)
public abstract class BaseForceNotifyShowUI extends MMActivity
{
  final String TAG = "MicroMsg.ForceNotifyListUI";
  String username;

  public void onBackPressed()
  {
    super.onBackPressed();
    finish();
    overridePendingTransition(0, 2131034227);
  }

  public void onCreate(Bundle paramBundle)
  {
    overridePendingTransition(2131034229, 2131034221);
    getWindow().addFlags(6815872);
    super.onCreate(paramBundle);
    fullScreenNoTitleBar(true);
    setBackBtn((MenuItem.OnMenuItemClickListener)new a(this));
    if (!c.mtf.msT.isEmpty())
      this.username = ((String)j.e((Iterable)c.mtf.msT));
    if (TextUtils.isEmpty((CharSequence)this.username))
    {
      ab.e(this.TAG, "username is null");
      this.username = "";
      finish();
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    c.mtf.msT.remove(this.username);
    if (!c.mtf.msT.isEmpty())
      startActivity(getIntent());
    ab.i(this.TAG, "[onDestroy]");
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
  static final class a
    implements MenuItem.OnMenuItemClickListener
  {
    a(BaseForceNotifyShowUI paramBaseForceNotifyShowUI)
    {
    }

    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      AppMethodBeat.i(51063);
      this.mti.onBackPressed();
      AppMethodBeat.o(51063);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.BaseForceNotifyShowUI
 * JD-Core Version:    0.6.2
 */