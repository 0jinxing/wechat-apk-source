package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.cjg;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class WalletUniversalPayOrderUI$a extends BaseAdapter
{
  List<cjg> khh;
  private Context mContext;

  public WalletUniversalPayOrderUI$a(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private cjg Hl(int paramInt)
  {
    AppMethodBeat.i(46435);
    cjg localcjg;
    if (this.khh == null)
    {
      localcjg = null;
      AppMethodBeat.o(46435);
    }
    while (true)
    {
      return localcjg;
      localcjg = (cjg)this.khh.get(paramInt);
      AppMethodBeat.o(46435);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(46434);
    int i;
    if (this.khh == null)
    {
      i = 0;
      AppMethodBeat.o(46434);
    }
    while (true)
    {
      return i;
      i = this.khh.size();
      AppMethodBeat.o(46434);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(46436);
    View localView = paramView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.mContext).inflate(2130971090, paramViewGroup, false);
      localView.setTag(new WalletUniversalPayOrderUI.b(localView));
    }
    paramView = Hl(paramInt);
    paramViewGroup = (WalletUniversalPayOrderUI.b)localView.getTag();
    paramViewGroup.ttA.setImageBitmap(null);
    paramViewGroup.ttA.eb(paramView.kbV, 2130840857);
    paramViewGroup.ttB.setText(paramView.nuL);
    AppMethodBeat.o(46436);
    return localView;
  }

  public final void gg(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(46433);
    ab.i("MicroMsg.WalletUniversalPayOrderUI", "swipe: %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    cjg localcjg = (cjg)this.khh.remove(paramInt1);
    this.khh.add(paramInt2, localcjg);
    AppMethodBeat.o(46433);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI.a
 * JD-Core Version:    0.6.2
 */