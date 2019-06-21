package com.tencent.mm.plugin.sns.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.k;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import java.util.HashMap;
import java.util.List;

public final class ax
  implements AdapterView.OnItemClickListener
{
  private Context mContext;
  private LayoutInflater mInflater;
  k rBk;
  n.c rBl;
  n.d rBm;
  private l rBn;
  private ax.a rBo;
  private HashMap<Integer, CharSequence> rBp;
  private HashMap<Integer, Integer> rBq;

  public ax(Context paramContext)
  {
    AppMethodBeat.i(39617);
    this.rBp = new HashMap();
    this.rBq = new HashMap();
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.rBk = new k(paramContext);
    this.rBn = new l(paramContext);
    AppMethodBeat.o(39617);
  }

  private void dismiss()
  {
    AppMethodBeat.i(39620);
    if (this.rBk.isShowing())
      this.rBk.dismiss();
    AppMethodBeat.o(39620);
  }

  public final void c(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(39618);
    this.rBp.put(Integer.valueOf(paramInt), paramCharSequence);
    AppMethodBeat.o(39618);
  }

  public final Dialog cuu()
  {
    AppMethodBeat.i(39621);
    if (this.rBl != null)
    {
      this.rBn.clear();
      this.rBn = new l(this.mContext);
      this.rBl.a(this.rBn);
    }
    Object localObject;
    if (this.rBn.dzR())
    {
      ab.w("MicroMsg.SnsTimelineListMenu", "show, menu empty");
      localObject = null;
      AppMethodBeat.o(39621);
    }
    while (true)
    {
      return localObject;
      if (this.rBo == null)
        this.rBo = new ax.a(this, (byte)0);
      this.rBk.khG = this.rBo;
      this.rBk.vtI = this;
      this.rBk.setTitle(this.rBn.abz);
      this.rBk.show();
      localObject = this.rBk;
      AppMethodBeat.o(39621);
    }
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(39619);
    paramAdapterView = (m)this.rBn.yvT.get(paramInt);
    if (paramAdapterView.performClick())
    {
      ab.i("MicroMsg.SnsTimelineListMenu", "onItemClick menu item has listener");
      dismiss();
      AppMethodBeat.o(39619);
    }
    while (true)
    {
      return;
      if (this.rBm != null)
        this.rBm.onMMMenuItemSelected(paramAdapterView, paramInt);
      dismiss();
      AppMethodBeat.o(39619);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ax
 * JD-Core Version:    0.6.2
 */