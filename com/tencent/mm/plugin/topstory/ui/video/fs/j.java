package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;

public final class j extends g
{
  public j(View paramView, b paramb)
  {
    super(paramView, paramb);
  }

  public final void cGz()
  {
    AppMethodBeat.i(2012);
    if (this.sGq == null)
    {
      this.sGq = new e(this.sDN.bKU(), this.sDN, this);
      this.sGq.setOnlyFS(true);
      this.sGr.removeAllViews();
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.sDN.cFW().x, this.sDN.cFW().y);
      this.sGr.addView(this.sGq, localLayoutParams);
    }
    this.sGq.a(this.sAX, cFP());
    AppMethodBeat.o(2012);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.j
 * JD-Core Version:    0.6.2
 */