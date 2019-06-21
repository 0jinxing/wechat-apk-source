package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMListPopupWindow;
import com.tencent.mm.ui.base.o;
import java.util.List;

public final class g
  implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private int height;
  private Context mContext;
  private int mCount;
  private LayoutInflater mInflater;
  AdapterView.OnItemClickListener yHJ;
  private ViewGroup yHK;
  private g.b yHL;
  private MMListPopupWindow yHM;
  private int yHN;
  private int yHO;
  j yHP;
  private boolean yHQ;

  public g(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(30501);
    this.yHJ = null;
    this.mContext = null;
    this.yHK = null;
    this.yHL = null;
    this.yHN = 2131493688;
    this.yHP = null;
    this.yHQ = true;
    this.mContext = paramContext;
    this.yHK = paramViewGroup;
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    dBX();
    this.yHL = new g.b(this, (byte)0);
    AppMethodBeat.o(30501);
  }

  private int b(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(30505);
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = paramListAdapter.getCount();
    int m = 0;
    int n = 0;
    View localView = null;
    int i1 = 0;
    if (m < k)
    {
      int i2 = paramListAdapter.getItemViewType(m);
      if (i2 == n)
        break label141;
      localView = null;
      n = i2;
    }
    label141: 
    while (true)
    {
      if (this.yHK == null)
        this.yHK = new FrameLayout(this.mContext);
      localView = paramListAdapter.getView(m, localView, this.yHK);
      localView.measure(i, j);
      i1 = Math.max(i1, localView.getMeasuredWidth());
      m++;
      break;
      AppMethodBeat.o(30505);
      return i1;
    }
  }

  @SuppressLint({"WrongCall"})
  public final boolean a(j paramj, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(30502);
    if ((!isShowing()) && (paramj != null) && (paramj.fwr != null) && (paramj.fwr.size() > 0))
    {
      this.yHQ = false;
      this.yHP = paramj;
      this.mCount = paramj.fwr.size();
      this.yHL.notifyDataSetChanged();
      this.height = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getHeight();
      TextView localTextView = (TextView)((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(2130970371, null);
      paramj = g.a.a(this.mContext, localTextView.getPaint(), paramj.fwr, paramInt1);
      this.yHO = (paramInt2 - this.yHL.getCount() * this.mContext.getResources().getDimensionPixelSize(2131427857) - this.mContext.getResources().getDimensionPixelSize(2131427669));
      ab.d("MicroMsg.ChatFooterCustomSubmenu", "showPointY=" + paramInt2 + "verticalOffset=" + this.yHO);
      this.yHM = new MMListPopupWindow(this.mContext, null, 0);
      this.yHM.setOnDismissListener(this);
      this.yHM.amz = this.yHJ;
      this.yHM.setAdapter(this.yHL);
      this.yHM.setModal(true);
      this.yHM.setBackgroundDrawable(this.mContext.getResources().getDrawable(2130840364));
      this.yHM.setAnimationStyle(this.yHN);
      this.yHM.amm = paramj.jiV;
      this.yHM.setVerticalOffset(this.yHO);
      this.yHM.amx = this.yHK;
      this.yHM.setContentWidth(b(this.yHL));
      this.yHM.iZ();
      this.yHM.show();
      this.yHM.yvM.setOnKeyListener(this);
      this.yHM.yvM.setDivider(new ColorDrawable(this.mContext.getResources().getColor(2131690464)));
      this.yHM.yvM.setSelector(this.mContext.getResources().getDrawable(2130839848));
      this.yHM.yvM.setDividerHeight(1);
      this.yHM.yvM.setVerticalScrollBarEnabled(false);
      this.yHM.yvM.setHorizontalScrollBarEnabled(false);
      AppMethodBeat.o(30502);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(30502);
    }
  }

  public final boolean dBX()
  {
    AppMethodBeat.i(30504);
    boolean bool;
    if (isShowing())
    {
      this.yHM.dismiss();
      bool = true;
      AppMethodBeat.o(30504);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30504);
    }
  }

  public final boolean isShowing()
  {
    AppMethodBeat.i(30503);
    boolean bool;
    if ((this.yHM != null) && (this.yHM.gKG.isShowing()))
    {
      bool = true;
      AppMethodBeat.o(30503);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30503);
    }
  }

  public final void onDismiss()
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.g
 * JD-Core Version:    0.6.2
 */