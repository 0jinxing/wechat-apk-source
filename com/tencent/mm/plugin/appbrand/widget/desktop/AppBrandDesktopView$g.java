package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AppBrandDesktopView$g extends RecyclerView.v
{
  protected EditText iXZ;
  private long iYa;

  public AppBrandDesktopView$g(AppBrandDesktopView paramAppBrandDesktopView, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(133852);
    this.iYa = 0L;
    this.iXZ = ((EditText)paramView.findViewById(2131821170));
    if (this.iXZ != null)
    {
      this.iXZ.setFocusable(false);
      this.iXZ.setOnClickListener(new AppBrandDesktopView.g.1(this, paramAppBrandDesktopView));
    }
    AppMethodBeat.o(133852);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.g
 * JD-Core Version:    0.6.2
 */