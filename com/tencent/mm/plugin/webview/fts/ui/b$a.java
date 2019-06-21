package com.tencent.mm.plugin.webview.fts.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public final class b$a
{
  int id;
  public WeakReference<View> iuM;
  int iuN;
  int z;

  public b$a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(5917);
    this.iuM = new WeakReference(paramView);
    this.id = paramInt1;
    this.iuN = paramInt2;
    this.z = paramInt3;
    AppMethodBeat.o(5917);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.ui.b.a
 * JD-Core Version:    0.6.2
 */