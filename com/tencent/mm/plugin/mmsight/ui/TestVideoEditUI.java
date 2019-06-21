package com.tencent.mm.plugin.mmsight.ui;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.c;
import com.tencent.mm.api.g;
import com.tencent.mm.api.s;
import com.tencent.mm.api.s.a.a;
import com.tencent.mm.api.s.b;
import com.tencent.mm.api.s.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class TestVideoEditUI extends MMActivity
  implements g
{
  private s oDy;

  public final int getLayoutId()
  {
    return 2130970923;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(55298);
    if (!this.oDy.Ab())
      finish();
    AppMethodBeat.o(55298);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(55296);
    super.onCreate(paramBundle);
    fullScreenNoTitleBar(true);
    paramBundle = (FrameLayout)findViewById(2131821019);
    this.oDy = s.ccQ.Ae();
    s locals = this.oDy;
    Object localObject = new s.a.a();
    ((s.a.a)localObject).ccS = false;
    ((s.a.a)localObject).ccU = true;
    ((s.a.a)localObject).ccV = new Rect(0, 0, 1080, 1080);
    ((s.a.a)localObject).ccR = s.c.ccW;
    locals.a(((s.a.a)localObject).AB());
    localObject = this.oDy.aQ(this.mController.ylL);
    ((c)localObject).setActionBarCallback(this);
    paramBundle.addView((View)localObject, new FrameLayout.LayoutParams(-1, -1));
    ((c)localObject).setSelectedFeatureListener(new TestVideoEditUI.1(this));
    AppMethodBeat.o(55296);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(55297);
    super.onDestroy();
    this.oDy.onDestroy();
    AppMethodBeat.o(55297);
  }

  public final void onExit()
  {
    AppMethodBeat.i(55301);
    finish();
    AppMethodBeat.o(55301);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(55300);
    this.oDy.a(new TestVideoEditUI.2(this));
    AppMethodBeat.o(55300);
  }

  public void onSwipeBack()
  {
    AppMethodBeat.i(55299);
    super.onSwipeBack();
    AppMethodBeat.o(55299);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.TestVideoEditUI
 * JD-Core Version:    0.6.2
 */