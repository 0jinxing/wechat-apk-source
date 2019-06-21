package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ListViewInScrollView;
import com.tencent.mm.ui.widget.a.c;

final class AppChooserUI$e
{
  DialogInterface.OnDismissListener Uf;
  public c gLj;
  BaseAdapter khG;
  Context mContext;
  String mTitle;
  ListViewInScrollView vtH;
  AdapterView.OnItemClickListener vtI;
  DialogInterface.OnClickListener vtJ;
  DialogInterface.OnClickListener vtv;

  public AppChooserUI$e(AppChooserUI paramAppChooserUI, Context paramContext)
  {
    AppMethodBeat.i(125874);
    this.mContext = paramContext;
    this.vtH = ((ListViewInScrollView)View.inflate(this.mContext, 2130968748, null));
    AppMethodBeat.o(125874);
  }

  public final void oU(boolean paramBoolean)
  {
    AppMethodBeat.i(125875);
    if (this.gLj != null)
      if (!paramBoolean)
      {
        this.gLj.a(2131297073, null);
        this.gLj.b(2131297072, null);
        AppMethodBeat.o(125875);
      }
    while (true)
    {
      return;
      this.gLj.a(2131297073, this.vtv);
      this.gLj.b(2131297072, this.vtJ);
      AppMethodBeat.o(125875);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.e
 * JD-Core Version:    0.6.2
 */