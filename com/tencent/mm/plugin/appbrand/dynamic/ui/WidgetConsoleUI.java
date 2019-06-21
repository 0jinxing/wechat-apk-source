package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ce.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.l;
import com.tencent.mm.modelappbrand.l.a;
import com.tencent.mm.plugin.appbrand.wxawidget.console.ConsolePanel;
import com.tencent.mm.plugin.appbrand.wxawidget.console.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public class WidgetConsoleUI extends MMActivity
  implements l.a
{
  String appId;
  int cBc;
  int gVu;
  ConsolePanel hoZ;
  String id;

  private boolean aAk()
  {
    boolean bool = false;
    AppMethodBeat.i(11006);
    Intent localIntent = getIntent();
    String str = localIntent.getStringExtra("id");
    this.appId = localIntent.getStringExtra("app_id");
    this.cBc = localIntent.getIntExtra("pkg_type", 0);
    this.gVu = localIntent.getIntExtra("pkg_version", 0);
    setMMSubTitle(String.format("(%s)", new Object[] { str }));
    if (bo.isNullOrNil(str))
      AppMethodBeat.o(11006);
    while (true)
    {
      return bool;
      if (str.equals(this.id))
      {
        AppMethodBeat.o(11006);
        bool = true;
      }
      else
      {
        ((e)g.K(e.class)).abz().b(this.id, this);
        ((e)g.K(e.class)).abz().a(str, this);
        this.id = str;
        d.a(this.hoZ);
        AppMethodBeat.o(11006);
        bool = true;
      }
    }
  }

  public void finish()
  {
    AppMethodBeat.i(11009);
    if ((isFinishing()) || (this.uiu))
    {
      AppMethodBeat.o(11009);
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
      finishAndRemoveTask();
    while (true)
    {
      TypedArray localTypedArray = obtainStyledAttributes(16973825, new int[] { 16842938, 16842939 });
      int i = localTypedArray.getResourceId(0, 0);
      int j = localTypedArray.getResourceId(1, 0);
      localTypedArray.recycle();
      overridePendingTransition(i, j);
      AppMethodBeat.o(11009);
      break;
      super.finish();
    }
  }

  public final int getLayoutId()
  {
    return 2130971235;
  }

  public final void kS(int paramInt)
  {
    AppMethodBeat.i(11007);
    String str;
    switch (paramInt)
    {
    default:
      str = "";
    case 3:
    case 2:
    case 1:
    case 4:
    }
    while (true)
    {
      a.q(new WidgetConsoleUI.2(this, str));
      AppMethodBeat.o(11007);
      return;
      str = "(PAUSE)";
      continue;
      str = "(RESUME)";
      continue;
      str = "(START)";
      continue;
      str = "(STOP)";
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(11004);
    super.onCreate(paramBundle);
    setBackBtn(new WidgetConsoleUI.1(this));
    setMMTitle(2131306075);
    this.hoZ = ((ConsolePanel)findViewById(2131829224));
    if (!aAk())
    {
      finish();
      AppMethodBeat.o(11004);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(11004);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(11008);
    super.onDestroy();
    ((e)g.K(e.class)).abz().b(this.id, this);
    d.b(this.hoZ);
    AppMethodBeat.o(11008);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(11005);
    super.onNewIntent(paramIntent);
    if (!aAk())
    {
      finish();
      AppMethodBeat.o(11005);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(11005);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WidgetConsoleUI
 * JD-Core Version:    0.6.2
 */