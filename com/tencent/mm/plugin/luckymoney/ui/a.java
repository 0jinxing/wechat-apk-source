package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.i;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends i
{
  a.a obT;

  public a(Context paramContext)
  {
    super(paramContext, 2131493175);
    AppMethodBeat.i(42555);
    fA();
    AppMethodBeat.o(42555);
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(42557);
    if (this.obT != null)
      this.obT.bMl();
    AppMethodBeat.o(42557);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42556);
    super.onCreate(paramBundle);
    getWindow().setGravity(80);
    paramBundle = getWindow().getWindowManager().getDefaultDisplay();
    WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
    localLayoutParams.width = paramBundle.getWidth();
    getWindow().setAttributes(localLayoutParams);
    AppMethodBeat.o(42556);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.a
 * JD-Core Version:    0.6.2
 */