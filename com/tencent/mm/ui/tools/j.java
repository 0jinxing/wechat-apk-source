package com.tencent.mm.ui.tools;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.base.k;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n.a;
import com.tencent.mm.ui.base.n.b;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.Iterator;
import java.util.List;

public final class j
  implements AdapterView.OnItemClickListener
{
  private DialogInterface.OnDismissListener jbD;
  private Context mContext;
  private LayoutInflater mInflater;
  public k rBk;
  public n.c rBl;
  public n.d rBm;
  private l rBn;
  private j.a zFS;
  public n.a zFT;
  public n.b zFU;

  public j(Context paramContext)
  {
    AppMethodBeat.i(107706);
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.rBk = new k(paramContext);
    this.rBn = new l(paramContext);
    AppMethodBeat.o(107706);
  }

  public final void a(View paramView, int paramInt, long paramLong, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, n.d paramd)
  {
    AppMethodBeat.i(107708);
    if (((this.mContext instanceof MMFragmentActivity)) && (((MMFragmentActivity)this.mContext).isSwiping()))
    {
      ab.w("MicroMsg.MMSubMenuHelper", "is swiping, PASS openContextMenuForAdapterView");
      AppMethodBeat.o(107708);
    }
    while (true)
    {
      return;
      this.rBn.clear();
      AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = new AdapterView.AdapterContextMenuInfo(paramView, paramInt, paramLong);
      paramOnCreateContextMenuListener.onCreateContextMenu(this.rBn, paramView, localAdapterContextMenuInfo);
      paramView = this.rBn.yvT.iterator();
      while (paramView.hasNext())
        ((m)paramView.next()).yvW = localAdapterContextMenuInfo;
      cuu();
      this.rBm = paramd;
      AppMethodBeat.o(107708);
    }
  }

  public final void a(View paramView, final View.OnCreateContextMenuListener paramOnCreateContextMenuListener, n.d paramd)
  {
    AppMethodBeat.i(107707);
    this.rBm = paramd;
    ab.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu");
    if ((paramView instanceof AbsListView))
    {
      ab.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu AbsListView");
      ((AbsListView)paramView).setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          AppMethodBeat.i(107701);
          j.a(j.this).clear();
          ab.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu AbsListView long click");
          paramAnonymousAdapterView = new AdapterView.AdapterContextMenuInfo(paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
          paramOnCreateContextMenuListener.onCreateContextMenu(j.a(j.this), paramAnonymousView, paramAnonymousAdapterView);
          paramAnonymousView = j.a(j.this).yvT.iterator();
          while (paramAnonymousView.hasNext())
            ((m)paramAnonymousView.next()).yvW = paramAnonymousAdapterView;
          j.this.cuu();
          AppMethodBeat.o(107701);
          return true;
        }
      });
      AppMethodBeat.o(107707);
    }
    while (true)
    {
      return;
      if ((paramView instanceof MMWebView))
      {
        ab.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu for webview");
        paramView.setOnLongClickListener(new j.2(this, paramOnCreateContextMenuListener));
        AppMethodBeat.o(107707);
      }
      else
      {
        ab.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu normal view");
        paramView.setOnLongClickListener(new j.3(this, paramOnCreateContextMenuListener));
        AppMethodBeat.o(107707);
      }
    }
  }

  public final void a(View paramView, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, n.d paramd, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    AppMethodBeat.i(107709);
    if (((this.mContext instanceof MMFragmentActivity)) && (((MMFragmentActivity)this.mContext).isSwiping()))
    {
      ab.w("MicroMsg.MMSubMenuHelper", "is swiping, PASS openContextMenu");
      AppMethodBeat.o(107709);
    }
    while (true)
    {
      return;
      this.jbD = paramOnDismissListener;
      this.rBn.clear();
      paramOnCreateContextMenuListener.onCreateContextMenu(this.rBn, paramView, null);
      cuu();
      this.rBm = paramd;
      AppMethodBeat.o(107709);
    }
  }

  public final void a(n.c paramc)
  {
    this.rBl = paramc;
  }

  public final void a(n.d paramd)
  {
    this.rBm = paramd;
  }

  public final void b(View paramView, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, n.d paramd)
  {
    AppMethodBeat.i(107710);
    a(paramView, paramOnCreateContextMenuListener, paramd, null);
    AppMethodBeat.o(107710);
  }

  public final Dialog cuu()
  {
    AppMethodBeat.i(107714);
    if (this.rBl != null)
    {
      this.rBn.clear();
      this.rBn = new l(this.mContext);
      this.rBl.a(this.rBn);
    }
    Object localObject;
    if (this.rBn.dzR())
    {
      ab.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
      localObject = null;
      AppMethodBeat.o(107714);
    }
    while (true)
    {
      return localObject;
      if (this.zFS == null)
        this.zFS = new j.a(this, (byte)0);
      this.rBk.khG = this.zFS;
      this.rBk.vtI = this;
      this.rBk.setTitle(this.rBn.abz);
      this.rBk.setOnDismissListener(this.jbD);
      this.rBk.show();
      localObject = this.rBk;
      AppMethodBeat.o(107714);
    }
  }

  public final void dismiss()
  {
    AppMethodBeat.i(107713);
    if (this.rBk.isShowing())
      this.rBk.dismiss();
    AppMethodBeat.o(107713);
  }

  public final void e(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(107711);
    this.rBk.setOnCancelListener(paramOnCancelListener);
    AppMethodBeat.o(107711);
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(107712);
    paramAdapterView = (m)this.rBn.yvT.get(paramInt);
    if (paramAdapterView.performClick())
    {
      ab.i("MicroMsg.MMSubMenuHelper", "onItemClick menu item has listener");
      dismiss();
      AppMethodBeat.o(107712);
    }
    while (true)
    {
      return;
      if (this.rBm != null)
        this.rBm.onMMMenuItemSelected(paramAdapterView, paramInt);
      dismiss();
      AppMethodBeat.o(107712);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.j
 * JD-Core Version:    0.6.2
 */