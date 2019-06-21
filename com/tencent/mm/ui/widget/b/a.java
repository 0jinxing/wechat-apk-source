package com.tencent.mm.ui.widget.b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.aj;
import com.tencent.mm.ui.base.MMListPopupWindow;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.o;
import java.util.Iterator;
import java.util.List;

public class a
  implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private static int zRR;
  private static int zRS;
  private static boolean zRT = false;
  private DisplayMetrics cbh;
  private Context mContext;
  private LayoutInflater mInflater;
  private View nWa;
  public n.d rBm;
  private l rBn;
  private MMListPopupWindow yHM;
  public PopupWindow.OnDismissListener zHM;
  private a.a zRU;
  private o zRV;
  private int zRW;
  private boolean zRX;
  public View zRY;
  public View.OnCreateContextMenuListener zRZ;
  public boolean zSa;
  public boolean zSb;
  public boolean zSc;
  private View zbD;

  public a(Context paramContext)
  {
    AppMethodBeat.i(112765);
    this.mContext = null;
    this.zbD = null;
    this.zRU = null;
    this.zRX = false;
    this.zSa = false;
    this.zSb = true;
    this.zSc = false;
    this.mContext = paramContext;
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    initView();
    AppMethodBeat.o(112765);
  }

  public a(Context paramContext, View paramView)
  {
    AppMethodBeat.i(112764);
    this.mContext = null;
    this.zbD = null;
    this.zRU = null;
    this.zRX = false;
    this.zSa = false;
    this.zSb = true;
    this.zSc = false;
    this.mContext = paramContext;
    this.zbD = paramView;
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    initView();
    dLi();
    AppMethodBeat.o(112764);
  }

  private int b(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(112777);
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = paramListAdapter.getCount();
    int m = 0;
    int n = 0;
    View localView = null;
    int i1 = 0;
    int i2;
    if (m < k)
    {
      i2 = paramListAdapter.getItemViewType(m);
      if (i2 == n)
        break label137;
      localView = null;
      n = i2;
    }
    label137: 
    while (true)
    {
      localView = paramListAdapter.getView(m, localView, new FrameLayout(this.mContext));
      i2 = i1;
      if (localView != null)
      {
        localView.measure(i, j);
        i2 = Math.max(i1, localView.getMeasuredWidth());
      }
      m++;
      i1 = i2;
      break;
      AppMethodBeat.o(112777);
      return i1;
    }
  }

  private boolean dLh()
  {
    AppMethodBeat.i(112772);
    boolean bool;
    if ((this.zRV != null) && (this.zRV.isShowing()))
    {
      bool = true;
      AppMethodBeat.o(112772);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112772);
    }
  }

  private void dLi()
  {
    AppMethodBeat.i(112776);
    this.zbD.setOnTouchListener(new a.5(this));
    AppMethodBeat.o(112776);
  }

  private boolean hC(int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(112769);
    if ((isShowing()) || (dLh()))
    {
      AppMethodBeat.o(112769);
      bool2 = bool1;
      return bool2;
    }
    Object localObject;
    if ((this.mContext instanceof Activity))
    {
      View localView = ((ViewGroup)((Activity)this.mContext).getWindow().getDecorView()).findViewById(16908290);
      if (localView != null)
      {
        localObject = new Rect();
        localView.getGlobalVisibleRect((Rect)localObject);
        if (((Rect)localObject).left <= 0);
      }
    }
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label131;
      ai.w("MicroMsg.MMPopupMenu", "is swiping, PASS tryShow", new Object[0]);
      AppMethodBeat.o(112769);
      bool2 = bool1;
      break;
    }
    label131: if (this.zRZ != null)
      this.zRZ.onCreateContextMenu(this.rBn, this.zbD, null);
    int j = this.zRU.getCount();
    int k = this.mContext.getResources().getDimensionPixelSize(2131427857);
    int m = this.mContext.getResources().getDimensionPixelSize(2131428307);
    int n = b(this.zRU);
    i = aj.am(this.mContext, 2131428547);
    if (n < i)
      label222: if (this.rBn.size() < 3)
        break label676;
    label258: label665: label676: for (boolean bool2 = false; ; bool2 = true)
    {
      if (!this.zRX)
      {
        if (this.zRY != null)
          this.zRY.setSelected(true);
      }
      else
      {
        if (!this.zSa)
          break label300;
        hD(paramInt1, paramInt2);
      }
      while (true)
      {
        AppMethodBeat.o(112769);
        bool2 = true;
        break;
        i = n;
        break label222;
        this.zbD.setSelected(true);
        break label258;
        label300: localObject = b.a(this.mContext, i, paramInt1, paramInt2, j * k, m, bool2);
        this.zRW = (paramInt2 - this.mContext.getResources().getDimensionPixelSize(2131428307));
        ai.d("MicroMsg.MMPopupMenu", "showPointY=" + paramInt2 + "verticalOffset=" + this.zRW, new Object[0]);
        this.yHM = new MMListPopupWindow(this.mContext, null, 0);
        this.yHM.setOnDismissListener(this);
        this.yHM.amz = new a.3(this);
        this.yHM.setAdapter(this.zRU);
        this.yHM.setModal(this.zSb);
        this.yHM.amt = this.zSc;
        this.yHM.setBackgroundDrawable(this.mContext.getResources().getDrawable(2130840364));
        this.yHM.setAnimationStyle(((b.a)localObject).zSf);
        this.yHM.amm = ((b.a)localObject).jiV;
        this.yHM.setVerticalOffset(((b.a)localObject).rDO);
        this.yHM.amx = this.zbD;
        this.yHM.setContentWidth(i);
        this.yHM.iZ();
        if ((!(this.mContext instanceof Activity)) || (((Activity)this.mContext).isFinishing()))
          break label665;
        this.yHM.show();
        this.yHM.yvM.setOnKeyListener(this);
        this.yHM.yvM.setDivider(new ColorDrawable(this.mContext.getResources().getColor(2131690464)));
        this.yHM.yvM.setSelector(this.mContext.getResources().getDrawable(2130839848));
        this.yHM.yvM.setDividerHeight(0);
        this.yHM.yvM.setVerticalScrollBarEnabled(false);
        this.yHM.yvM.setHorizontalScrollBarEnabled(false);
      }
      AppMethodBeat.o(112769);
      bool2 = bool1;
      break;
    }
  }

  private void hD(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112770);
    int i = this.mContext.getResources().getDimensionPixelOffset(2131427812);
    int j = this.mContext.getResources().getDimensionPixelOffset(2131427776);
    this.zRV = new o(this.mContext);
    this.zRV.setWidth(-2);
    this.zRV.setHeight(-2);
    this.zRV.setBackgroundDrawable(this.mContext.getResources().getDrawable(2130840364));
    LinearLayout localLinearLayout = new LinearLayout(this.mContext);
    localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    localLinearLayout.setOrientation(0);
    localLinearLayout.setBackgroundColor(this.mContext.getResources().getColor(2131690691));
    int k = 0;
    if (k < this.rBn.size())
    {
      TextView localTextView = (TextView)this.mInflater.inflate(2130969839, null, false);
      localTextView.setBackground(this.mContext.getResources().getDrawable(2130839848));
      if (k == 0)
        localTextView.setPadding(j, 0, i, 0);
      while (true)
      {
        localTextView.setText(((MenuItem)this.rBn.yvT.get(k)).getTitle());
        localTextView.setOnClickListener(new a.4(this, k));
        localLinearLayout.addView(localTextView);
        k++;
        break;
        if (k == this.rBn.size() - 1)
          localTextView.setPadding(i, 0, j, 0);
      }
    }
    localLinearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    k = localLinearLayout.getMeasuredHeight();
    this.zRV.setContentView(localLinearLayout);
    if (((this.mContext instanceof Activity)) && (!((Activity)this.mContext).isFinishing()))
      this.zRV.showAtLocation(this.zbD, 0, paramInt1, paramInt2 - k);
    AppMethodBeat.o(112770);
  }

  private void initView()
  {
    AppMethodBeat.i(112775);
    dBX();
    this.rBn = new l(this.mContext);
    this.zRU = new a.a(this, (byte)0);
    this.cbh = this.mContext.getResources().getDisplayMetrics();
    AppMethodBeat.o(112775);
  }

  private boolean isShowing()
  {
    AppMethodBeat.i(112771);
    boolean bool;
    if ((this.yHM != null) && (this.yHM.gKG.isShowing()))
    {
      bool = true;
      AppMethodBeat.o(112771);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112771);
    }
  }

  public final void a(View paramView, int paramInt1, long paramLong, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, n.d paramd, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(112767);
    this.rBm = paramd;
    this.zbD = paramView;
    dLi();
    this.rBn.clear();
    paramd = new AdapterView.AdapterContextMenuInfo(paramView, paramInt1, paramLong);
    paramOnCreateContextMenuListener.onCreateContextMenu(this.rBn, paramView, paramd);
    paramView = this.rBn.yvT.iterator();
    while (paramView.hasNext())
      ((m)paramView.next()).yvW = paramd;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      dn(0, 0);
      AppMethodBeat.o(112767);
    }
    while (true)
    {
      return;
      dn(paramInt2, paramInt3);
      AppMethodBeat.o(112767);
    }
  }

  public final void a(View paramView, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, n.d paramd, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112768);
    this.rBm = paramd;
    this.zbD = paramView;
    if ((!(paramView instanceof TextView)) && ((paramInt1 == 0) || (paramInt2 == 0)))
      dLi();
    this.rBn.clear();
    paramOnCreateContextMenuListener.onCreateContextMenu(this.rBn, paramView, null);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      dn(0, 0);
      AppMethodBeat.o(112768);
    }
    while (true)
    {
      return;
      dn(paramInt1, paramInt2);
      AppMethodBeat.o(112768);
    }
  }

  public final void c(View paramView, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, n.d paramd)
  {
    AppMethodBeat.i(112766);
    this.zbD = paramView;
    dLi();
    this.rBm = paramd;
    if ((paramView instanceof AbsListView))
    {
      ai.v("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView", new Object[0]);
      ((AbsListView)paramView).setOnItemLongClickListener(new a.1(this, paramOnCreateContextMenuListener));
      AppMethodBeat.o(112766);
    }
    while (true)
    {
      return;
      ai.v("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view", new Object[0]);
      paramView.setOnLongClickListener(new a.2(this, paramOnCreateContextMenuListener));
      AppMethodBeat.o(112766);
    }
  }

  public final boolean dBX()
  {
    boolean bool = true;
    AppMethodBeat.i(112773);
    if (isShowing())
    {
      if (this.yHM != null)
        this.yHM.dismiss();
      AppMethodBeat.o(112773);
    }
    while (true)
    {
      return bool;
      if (dLh())
      {
        if (this.zRV != null)
          this.zRV.dismiss();
        AppMethodBeat.o(112773);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(112773);
      }
    }
  }

  public boolean dn(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112774);
    if (((this.zbD != null) && (!this.zbD.equals(this.nWa))) || ((!zRT) && ((paramInt1 != 0) || (paramInt2 != 0))))
    {
      zRR = paramInt1;
      zRS = paramInt2;
    }
    this.nWa = null;
    int i = zRR;
    int j = zRS;
    zRT = false;
    if (this.cbh == null)
      this.cbh = this.mContext.getResources().getDisplayMetrics();
    int k = i;
    int m;
    if (this.zbD != null)
    {
      int[] arrayOfInt = new int[2];
      this.zbD.getLocationOnScreen(arrayOfInt);
      m = i;
      if (i == 0)
        m = arrayOfInt[0] + this.zbD.getWidth() / 2;
      int n = arrayOfInt[1];
      k = arrayOfInt[1] + this.zbD.getHeight();
      i = n;
      if (n < 0)
        i = 0;
      n = k;
      if (k > this.cbh.heightPixels)
        n = this.cbh.heightPixels;
      k = m;
      if (j == 0)
      {
        k = (i + n) / 2;
        i = m;
      }
    }
    while (true)
    {
      ai.i("MicroMsg.MMPopupMenu", "show popMenu , xDown:%s, yDown:%s, showPointX:%s, showPointY:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(k) });
      boolean bool;
      if ((!isShowing()) || (!dLh()))
      {
        bool = hC(i, k);
        AppMethodBeat.o(112774);
      }
      while (true)
      {
        return bool;
        bool = dBX();
        bool = hC(i, k) & bool;
        AppMethodBeat.o(112774);
      }
      m = j;
      i = k;
      k = m;
    }
  }

  public void onDismiss()
  {
    AppMethodBeat.i(112778);
    if (!this.zRX)
    {
      if (this.zRY == null)
        break label51;
      this.zRY.setSelected(false);
    }
    while (true)
    {
      if (this.zHM != null)
        this.zHM.onDismiss();
      AppMethodBeat.o(112778);
      return;
      label51: this.zbD.setSelected(false);
    }
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
  }

  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.b.a
 * JD-Core Version:    0.6.2
 */