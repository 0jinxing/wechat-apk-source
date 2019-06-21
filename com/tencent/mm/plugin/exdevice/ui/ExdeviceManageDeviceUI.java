package com.tencent.mm.plugin.exdevice.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.dk;
import com.tencent.mm.g.c.ce;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.j;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public class ExdeviceManageDeviceUI extends MMActivity
{
  private a lBi;
  private ListView mListView;

  public final int getLayoutId()
  {
    return 2130969426;
  }

  public final void initView()
  {
    AppMethodBeat.i(19998);
    this.mListView = ((ListView)findViewById(2131821698));
    this.lBi = new a(this);
    View.inflate(this, 2130969414, null);
    this.mListView.setAdapter(this.lBi);
    AppMethodBeat.o(19998);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(19999);
    this.lBi.bw(ad.boW().bpB());
    this.lBi.notifyDataSetChanged();
    AppMethodBeat.o(19999);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(19997);
    super.onCreate(paramBundle);
    setBackBtn(new ExdeviceManageDeviceUI.1(this));
    setMMTitle(2131299333);
    paramBundle = new dk();
    paramBundle.cwH.cwI = true;
    com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
    initView();
    aw.Rg().a(537, this.lBi);
    AppMethodBeat.o(19997);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(20000);
    super.onDestroy();
    aw.Rg().b(537, this.lBi);
    AppMethodBeat.o(20000);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(20001);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0) && (this.lBi.lBk))
    {
      updateOptionMenuText(0, getString(2131296894));
      paramKeyEvent = this.lBi;
      if (paramKeyEvent.lBk)
      {
        paramKeyEvent.lBk = false;
        al.d(new ExdeviceManageDeviceUI.a.5(paramKeyEvent));
      }
      bool = true;
      AppMethodBeat.o(20001);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(20001);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static final class a extends BaseAdapter
    implements f
  {
    private n.d jMV;
    private WeakReference<Context> jQk;
    boolean lBk;
    private View.OnClickListener lBl;
    private j lBm;
    private volatile int lBn;
    private List<com.tencent.mm.plugin.exdevice.h.b> lyd;
    private com.tencent.mm.at.a.a.c lyr;
    private com.tencent.mm.ui.base.p tipDialog;

    public a(Context paramContext)
    {
      AppMethodBeat.i(19988);
      this.tipDialog = null;
      this.lBn = -1;
      this.jQk = new WeakReference(paramContext);
      this.lyd = new LinkedList();
      this.lBm = new j(paramContext);
      paramContext = new c.a();
      paramContext.ePT = 2130838615;
      this.lyr = paramContext.ahG();
      this.jMV = new ExdeviceManageDeviceUI.a.1(this);
      this.lBl = new ExdeviceManageDeviceUI.a.2(this);
      bw(ad.boW().bpB());
      AppMethodBeat.o(19988);
    }

    public final void bw(List<com.tencent.mm.plugin.exdevice.h.b> paramList)
    {
      AppMethodBeat.i(19989);
      this.lyd.clear();
      if ((paramList == null) || (paramList.size() == 0))
        AppMethodBeat.o(19989);
      while (true)
      {
        return;
        this.lyd.addAll(paramList);
        AppMethodBeat.o(19989);
      }
    }

    public final int getCount()
    {
      AppMethodBeat.i(19990);
      int i = this.lyd.size();
      AppMethodBeat.o(19990);
      return i;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(19992);
      com.tencent.mm.plugin.exdevice.h.b localb = uT(paramInt);
      View localView;
      if (paramView == null)
      {
        paramView = new a((byte)0);
        localView = View.inflate(paramViewGroup.getContext(), 2130969425, null);
        paramView.lBq = localView.findViewById(2131821064);
        paramView.gxi = ((TextView)localView.findViewById(2131823625));
        paramView.lBr = localView.findViewById(2131823666);
        paramView.iqT = ((ImageView)localView.findViewById(2131823624));
        localView.setTag(paramView);
        paramViewGroup = paramView;
      }
      while (localb == null)
      {
        paramView = "";
        ab.d("MicroMsg.ExdeviceManageDeviceUI", "position(%s), name(%s), mac(%s).", new Object[] { Integer.valueOf(paramInt), paramView, Long.valueOf(localb.field_mac) });
        paramViewGroup.gxi.setText(paramView);
        o.ahp().a(localb.iconUrl, paramViewGroup.iqT, this.lyr);
        paramViewGroup.lBr.setTag(Integer.valueOf(paramInt));
        if (!this.lBk)
          break label329;
        paramViewGroup.lBr.setVisibility(0);
        label197: paramViewGroup.lBq.setTag(Integer.valueOf(paramInt));
        paramViewGroup.lBq.setOnClickListener(this.lBl);
        AppMethodBeat.o(19992);
        return localView;
        paramViewGroup = (a)paramView.getTag();
        localView = paramView;
      }
      if (!bo.isNullOrNil(localb.dFl))
        paramView = localb.dFl;
      while (true)
      {
        paramView = bo.nullAsNil(paramView);
        break;
        if (!bo.isNullOrNil(localb.dFm))
        {
          paramView = localb.dFm;
        }
        else if (localb.field_mac != 0L)
        {
          paramView = com.tencent.mm.plugin.exdevice.j.b.ie(localb.field_mac);
        }
        else
        {
          if (!bo.isNullOrNil(localb.field_deviceID))
          {
            paramView = localb.field_deviceID;
            continue;
            label329: paramViewGroup.lBr.setVisibility(8);
            break label197;
          }
          paramView = null;
        }
      }
    }

    public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
    {
      AppMethodBeat.i(19993);
      if (paramm == null)
      {
        ab.e("MicroMsg.ExdeviceManageDeviceUI", "scene is null.");
        AppMethodBeat.o(19993);
      }
      while (true)
      {
        return;
        if ((paramm instanceof x))
        {
          if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
            this.tipDialog.dismiss();
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            if ((this.lBn < 0) || (this.lBn >= this.lyd.size()))
            {
              AppMethodBeat.o(19993);
              continue;
            }
            al.d(new ExdeviceManageDeviceUI.a.6(this));
          }
        }
        else
        {
          AppMethodBeat.o(19993);
        }
      }
    }

    public final com.tencent.mm.plugin.exdevice.h.b uT(int paramInt)
    {
      AppMethodBeat.i(19991);
      com.tencent.mm.plugin.exdevice.h.b localb = (com.tencent.mm.plugin.exdevice.h.b)this.lyd.get(paramInt);
      AppMethodBeat.o(19991);
      return localb;
    }

    static final class a
    {
      TextView gxi;
      ImageView iqT;
      View lBq;
      View lBr;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI
 * JD-Core Version:    0.6.2
 */