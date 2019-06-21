package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.a;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.b;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.AlphabetScrollBar;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.a.b;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.d;
import com.tencent.mm.ui.tools.o.b;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.List;

public abstract class MMBaseSelectContactUI extends MMActivity
  implements AdapterView.OnItemClickListener, MultiSelectContactView.a, MultiSelectContactView.b, MultiSelectContactView.c, VerticalScrollBar.a, l, o.b
{
  protected com.tencent.mm.ui.tools.o elS;
  public MultiSelectContactView opo;
  private ListView pxq;
  private View qzN;
  protected int scene;
  private AlphabetScrollBar zmY;
  private o zmZ;
  public m zna;
  private com.tencent.mm.ui.base.o znb;
  private View znc;
  private View znd;
  private TextView zne;
  private LabelContainerView znf;
  private TextView zng;
  private MMTagPanel znh;
  private boolean zni = true;
  private List<String> znj = new ArrayList();

  private String dHX()
  {
    String str;
    if (this.elS != null)
      str = this.elS.getSearchContent();
    while (true)
    {
      return str;
      if (this.opo != null)
        str = this.opo.getSearchContent();
      else
        str = "";
    }
  }

  private void dHY()
  {
    boolean bool;
    if (this.elS != null)
    {
      bool = this.elS.dJs();
      if ((!bool) || (!bo.isNullOrNil(dHX())))
        break label104;
      if ((this.znj == null) || (this.znj.size() <= 0))
        break label92;
      this.znf.setVisibility(0);
      this.znh.a(null, this.znj);
    }
    while (true)
    {
      return;
      if (this.opo != null)
      {
        bool = this.opo.hasFocus();
        break;
      }
      bool = false;
      break;
      label92: this.znf.setVisibility(8);
      continue;
      label104: if (this.znf != null)
        this.znf.setVisibility(8);
    }
  }

  private void dIa()
  {
    ab.i("MicroMsg.MMBaseSelectContactUI", "setInitStatus");
    a(this.pxq, 0);
    this.pxq.setAdapter(this.zmZ);
    this.zmZ.notifyDataSetChanged();
    if ((aox()) && (this.zmY != null))
      this.zmY.setVisibility(0);
    this.znd.setVisibility(8);
  }

  protected void Kh()
  {
    this.scene = getIntent().getIntExtra("scene", 0);
  }

  protected void QA(String paramString)
  {
    ab.i("MicroMsg.MMBaseSelectContactUI", "select label=%s", new Object[] { paramString });
  }

  public final void Qa(String paramString)
  {
    ab.i("MicroMsg.MMBaseSelectContactUI", "onSearchTextChange: text=%s", new Object[] { paramString });
    if (bOd())
      dHY();
    if (this.zna != null)
    {
      if (bo.isNullOrNil(paramString))
        break label57;
      this.zna.a(paramString, bMP(), dHZ());
    }
    while (true)
    {
      return;
      label57: this.zna.clearData();
      this.zna.notifyDataSetChanged();
      dIa();
    }
  }

  protected void a(ListView paramListView, int paramInt)
  {
  }

  public boolean a(a parama)
  {
    return false;
  }

  protected abstract m aoA();

  protected abstract boolean aow();

  protected abstract boolean aox();

  protected abstract String aoy();

  protected abstract o aoz();

  public final void apo()
  {
    dIa();
    if (bOd())
      dHY();
  }

  public final void app()
  {
  }

  public final void apq()
  {
  }

  public final void apr()
  {
  }

  public boolean b(a parama)
  {
    return false;
  }

  public int[] bMP()
  {
    return new int[] { 131072, 131075, 131081 };
  }

  public void bMQ()
  {
    aqX();
    finish();
  }

  protected boolean bOd()
  {
    return false;
  }

  public final n dHV()
  {
    if (getContentLV().getHeaderViewsCount() > 0);
    for (n localn = (n)((HeaderViewListAdapter)getContentLV().getAdapter()).getWrappedAdapter(); ; localn = (n)getContentLV().getAdapter())
      return localn;
  }

  public o dHW()
  {
    return this.zmZ;
  }

  protected boolean dHZ()
  {
    return false;
  }

  protected final void dIb()
  {
    if (this.elS != null)
      if (!bo.isNullOrNil(this.elS.getSearchContent()))
      {
        com.tencent.mm.ui.tools.o localo = this.elS;
        if (localo.zGZ != null)
          localo.zGZ.qO(true);
      }
    while (true)
    {
      return;
      if ((this.opo != null) && (!bo.isNullOrNil(this.opo.getSearchContent())))
        this.opo.vhY.setText("");
    }
  }

  protected final void dIc()
  {
    if (this.elS != null)
      if (this.elS.dJs())
        this.elS.clearFocus();
    while (true)
    {
      return;
      if ((this.opo != null) && (this.opo.hasFocus()))
        this.opo.clearFocus();
    }
  }

  public boolean dId()
  {
    if (this.zna != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void dji()
  {
    if (bOd())
      dHY();
  }

  public Activity getActivity()
  {
    return this;
  }

  public ListView getContentLV()
  {
    return this.pxq;
  }

  public int getLayoutId()
  {
    return 2130970216;
  }

  public void initView()
  {
    setMMTitle(aoy());
    this.pxq = ((ListView)findViewById(2131820897));
    this.zmZ = aoz();
    this.zna = aoA();
    this.qzN = findViewById(2131820899);
    if (dId())
    {
      this.znd = findViewById(2131820903);
      this.zne = ((TextView)findViewById(2131820904));
      this.znd.setOnTouchListener(new MMBaseSelectContactUI.1(this));
      if (!aow())
        break label361;
      this.elS = new com.tencent.mm.ui.tools.o((byte)0);
      this.elS.zHa = this;
      a(this.elS);
    }
    while (true)
    {
      a(this.pxq, 0);
      this.pxq.setAdapter(this.zmZ);
      setBackBtn(new MMBaseSelectContactUI.2(this));
      if (this.zna != null)
        this.zna.a(new MMBaseSelectContactUI.3(this));
      this.pxq.setOnScrollListener(new MMBaseSelectContactUI.4(this));
      this.pxq.setOnItemClickListener(this);
      if (aox())
      {
        this.zmY = ((AlphabetScrollBar)findViewById(2131820900));
        this.zmY.setVisibility(0);
        this.zmY.setOnScrollBarTouchListener(this);
      }
      if (bOd())
      {
        this.znf = ((LabelContainerView)findViewById(2131820901));
        this.zng = ((TextView)this.znf.findViewById(16908310));
        this.zng.setText(2131302869);
        this.znh = ((MMTagPanel)this.znf.findViewById(2131820902));
        this.znh.setTagSelectedBG(2130840382);
        this.znh.setTagSelectedTextColorRes(2131690316);
        this.znf.setOnLabelContainerListener(new MMBaseSelectContactUI.5(this));
        this.znh.setCallBack(new MMBaseSelectContactUI.6(this));
      }
      return;
      label361: this.opo = ((MultiSelectContactView)findViewById(2131820898));
      this.opo.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, -2147483648), View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels, -2147483648));
      this.opo.setOnSearchTextChangeListener(this);
      this.opo.setOnSearchTextFouceChangeListener(this);
      this.opo.setOnContactDeselectListener(this);
      this.opo.setVisibility(0);
      this.znc = new View(this.mController.ylL);
      AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, this.opo.getMeasuredHeight());
      this.znc.setLayoutParams(localLayoutParams);
      this.znc.setVisibility(4);
      this.pxq.addHeaderView(this.znc);
      findViewById(2131820896).setVisibility(0);
    }
  }

  public final void kp(String paramString)
  {
    int i;
    if (this.zmZ != null)
    {
      i = this.zmZ.arM(paramString);
      if (i != 0)
        break label29;
      this.pxq.setSelection(0);
    }
    while (true)
    {
      return;
      label29: if (i > 0)
      {
        if (aow())
          this.pxq.setSelection(i);
        else if (this.opo != null)
          this.pxq.setSelectionFromTop(i, this.opo.getMeasuredHeight());
      }
      else
        ab.i("MicroMsg.MMBaseSelectContactUI", "Select unkown head selectPosition=%d | header=%s", new Object[] { Integer.valueOf(i), paramString });
    }
  }

  public void mO(int paramInt)
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ab.i("MicroMsg.MMBaseSelectContactUI", "onCreate!");
    if (!g.RK())
    {
      ab.e("MicroMsg.MMBaseSelectContactUI", "onCreate acc not ready finish");
      ab.dou();
      finish();
    }
    while (true)
    {
      return;
      Kh();
      ab.i("MicroMsg.MMBaseSelectContactUI", "initData done!");
      initView();
      ab.i("MicroMsg.MMBaseSelectContactUI", "initView done!");
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.zmY != null)
      this.zmY.yAU = null;
    if (this.zmZ != null)
      this.zmZ.finish();
    if (this.zna != null)
      this.zna.finish();
    if (this.znb != null)
      this.znb.dismiss();
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = paramInt - getContentLV().getHeaderViewsCount();
    int j;
    if (i >= 0)
    {
      paramAdapterView = dHV().Pn(i);
      paramAdapterView.aou().aov();
      if (paramAdapterView.eDk)
      {
        j = paramAdapterView.mFr;
        i = paramAdapterView.mFs;
        if (!paramAdapterView.bAv())
          break label235;
        i = 15;
        switch (paramAdapterView.mFr)
        {
        default:
          j = 0;
        case 131072:
        case 131075:
        case 131076:
        case 65536:
        }
      }
    }
    while (true)
    {
      if (paramAdapterView.zpC)
        j = 1;
      if (paramAdapterView.klY == 5)
        j = 7;
      paramAdapterView = String.format("%s,%d,%d,%d,%d", new Object[] { paramAdapterView.query, Integer.valueOf(paramAdapterView.scene), Integer.valueOf(j), Integer.valueOf(paramAdapterView.mFm), Integer.valueOf(i) });
      ab.v("MicroMsg.SelectContactReportLogic", "reportClick: %s", new Object[] { paramAdapterView });
      h.pYm.X(13234, paramAdapterView);
      if (!dHV().Po(paramInt))
        mO(paramInt);
      return;
      label235: if (j == 131072)
        switch (i)
        {
        case 8:
        case 9:
        case 10:
        case 12:
        case 13:
        case 14:
        default:
          i = 0;
          break;
        case 1:
          i = 1;
          break;
        case 2:
          i = 2;
          break;
        case 3:
          i = 3;
          break;
        case 4:
          i = 4;
          break;
        case 5:
          i = 5;
          break;
        case 6:
          i = 6;
          break;
        case 7:
          i = 7;
          break;
        case 11:
          i = 8;
          break;
        case 16:
          i = 10;
          break;
        case 17:
        case 18:
          i = 9;
          break;
        case 15:
          i = 16;
          break;
        }
      if (j == 131075)
        switch (i)
        {
        default:
          i = 0;
          break;
        case 1:
        case 5:
          i = 12;
          break;
        case 2:
        case 6:
          i = 13;
          break;
        case 3:
        case 7:
          i = 14;
          break;
        case 29:
        case 30:
        case 31:
        case 32:
        case 34:
        case 35:
        case 36:
        case 37:
        case 38:
          i = 11;
          break;
        }
      if (j == 65536)
      {
        i = 17;
        break;
      }
      i = 0;
      break;
      j = 2;
      continue;
      j = 3;
      continue;
      j = 4;
      continue;
      j = 5;
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4)
      bMQ();
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    super.onPause();
    if (this.znb != null)
      this.znb.dismiss();
  }

  public void onResume()
  {
    super.onResume();
    if ((bOd()) && (this.zni))
    {
      this.zni = false;
      g.RS().aa(new MMBaseSelectContactUI.7(this));
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public void vI(String paramString)
  {
  }

  public final boolean vN(String paramString)
  {
    return false;
  }

  public final void vO(String paramString)
  {
    ab.i("MicroMsg.MMBaseSelectContactUI", "onSearchChange: searchText=%s", new Object[] { paramString });
    if (bOd())
    {
      if (this.elS != null)
        this.elS.dJt();
      dHY();
    }
    if (!bo.isNullOrNil(paramString))
      this.zna.a(paramString, bMP(), dHZ());
    while (true)
    {
      return;
      this.zna.clearData();
      this.zna.notifyDataSetChanged();
      dIa();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.MMBaseSelectContactUI
 * JD-Core Version:    0.6.2
 */