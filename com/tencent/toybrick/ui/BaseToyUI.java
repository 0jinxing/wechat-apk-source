package com.tencent.toybrick.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.BaseActivity;
import com.tencent.toybrick.c.f;
import java.util.HashMap;

public abstract class BaseToyUI<T extends f> extends BaseActivity
{
  private HashMap<String, f> cS = new HashMap();

  public void onDestroy()
  {
    super.onDestroy();
    this.cS.clear();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.ui.BaseToyUI
 * JD-Core Version:    0.6.2
 */