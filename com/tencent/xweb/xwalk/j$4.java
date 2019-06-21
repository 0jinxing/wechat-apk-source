package com.tencent.xweb.xwalk;

import android.widget.AbsoluteLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.r;
import org.xwalk.core.XWalkView.ScrollChangedListener;

final class j$4
  implements XWalkView.ScrollChangedListener
{
  j$4(j paramj)
  {
  }

  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(85291);
    this.ASs.ASj.scrollTo(paramInt1, paramInt2);
    if (this.ASs.icr != null)
      this.ASs.icr.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, this.ASs.ARZ);
    AppMethodBeat.o(85291);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.j.4
 * JD-Core Version:    0.6.2
 */