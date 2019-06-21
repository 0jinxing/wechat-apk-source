package com.tencent.mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public final class ac$b
{
  boolean hfz;
  int id;
  WeakReference<View> iuM;
  public int iuN;
  boolean iuO;
  ac.a iuP;
  int z;

  public ac$b(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(91096);
    this.iuM = new WeakReference(paramView);
    this.id = paramInt1;
    this.iuN = paramInt2;
    this.z = paramInt3;
    this.iuO = paramBoolean1;
    this.hfz = paramBoolean2;
    AppMethodBeat.o(91096);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.ac.b
 * JD-Core Version:    0.6.2
 */