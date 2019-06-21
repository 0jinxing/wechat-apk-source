package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.g.a.nx;
import com.tencent.mm.g.a.tz;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.protobuf.anz;
import com.tencent.mm.protocal.protobuf.cfx;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import java.util.Iterator;
import java.util.LinkedList;

public class ServiceNotifySettingsUI extends MMActivity
  implements f
{
  private DataSetObserver PL;
  private ListView mListView;
  private int mMode;
  private String mSceneId;
  private MMSwitchBtn omp;
  private com.tencent.mm.ui.base.p sfa;
  private a ypX;

  private boolean dzb()
  {
    AppMethodBeat.i(29865);
    ac.a locala = ac.a.xON;
    if (this.mMode == 1)
      locala = ac.a.xOO;
    aw.ZK();
    boolean bool = com.tencent.mm.model.c.Ry().getBoolean(locala, true);
    AppMethodBeat.o(29865);
    return bool;
  }

  protected final int getLayoutId()
  {
    return 2130970619;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29862);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.mMode = paramBundle.getIntExtra("mode", 0);
    this.mSceneId = paramBundle.getStringExtra("scene_id");
    paramBundle.putExtra("scene_id", this.mSceneId);
    paramBundle = paramBundle.getStringExtra("title");
    if (TextUtils.isEmpty(paramBundle))
    {
      setMMTitle(2131301855);
      setBackBtn(new ServiceNotifySettingsUI.1(this));
      this.omp = ((MMSwitchBtn)findViewById(2131820932));
      this.mListView = ((ListView)findViewById(2131821698));
      paramBundle = (TextView)findViewById(2131827357);
      if (this.mMode != 1)
        break label311;
      i = 2131301838;
      label127: paramBundle.setText(i);
      paramBundle = (TextView)findViewById(2131827356);
      if (this.mMode != 1)
        break label318;
    }
    label311: label318: for (int i = 2131301839; ; i = 2131301841)
    {
      paramBundle.setText(i);
      this.ypX = new a(this, getLayoutInflater(), this.mMode, this.mSceneId);
      this.mListView.setAdapter(this.ypX);
      getString(2131297061);
      this.sfa = com.tencent.mm.ui.base.h.b(this, getString(2131297086), true, new ServiceNotifySettingsUI.2(this));
      this.PL = new ServiceNotifySettingsUI.3(this);
      this.ypX.registerDataSetObserver(this.PL);
      i = 3;
      if (this.mMode == 1)
        i = 12;
      aw.Rg().a(1145, this);
      aw.Rg().a(new com.tencent.mm.modelappbrand.p(i), 0);
      this.omp.setCheck(dzb());
      AppMethodBeat.o(29862);
      return;
      setMMTitle(paramBundle);
      break;
      i = 2131301835;
      break label127;
    }
  }

  public void onDestroy()
  {
    int i = 3;
    AppMethodBeat.i(29863);
    aw.Rg().b(1145, this);
    boolean bool1 = dzb();
    boolean bool2;
    LinkedList localLinkedList;
    Object localObject1;
    int j;
    label71: label89: boolean bool3;
    label111: Object localObject2;
    if (this.omp.zMU != bool1)
    {
      bool2 = true;
      localLinkedList = new LinkedList();
      if (bool2)
      {
        localObject1 = new cfx();
        if (!this.omp.zMU)
          break label434;
        j = 1;
        ((cfx)localObject1).xeW = j;
        if (this.mMode != 1)
          break label440;
        j = 2;
        ((cfx)localObject1).jCt = j;
        localLinkedList.add(localObject1);
        if (bool1)
          break label446;
        bool3 = true;
        localObject2 = ac.a.xON;
        if (this.mMode == 1)
          localObject2 = ac.a.xOO;
        aw.ZK();
        com.tencent.mm.model.c.Ry().set((ac.a)localObject2, Boolean.valueOf(bool3));
        com.tencent.mm.sdk.b.a.xxA.m(new nx());
        if (this.mMode != 1)
          break label458;
        if (((cfx)localObject1).xeW != 1)
          break label452;
        j = 3;
        label180: ab.d("MicroMsg.ServiceNotifySettingsUI", "stev report(%s), eventId : %s, mSceneId %s", new Object[] { Integer.valueOf(13798), Integer.valueOf(j), this.mSceneId });
        com.tencent.mm.plugin.report.service.h.pYm.e(13798, new Object[] { Integer.valueOf(j), "", Integer.valueOf(0), this.mSceneId, Long.valueOf(bo.anT()) });
      }
      if (this.mMode != 1)
        break label530;
      j = 2;
      label278: localObject2 = this.ypX.yqe;
      if ((localObject2 == null) || (((LinkedList)localObject2).isEmpty()))
        break label541;
      if (this.mMode != 1)
        break label536;
    }
    while (true)
    {
      localObject2 = ((LinkedList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (ServiceNotifySettingsUI.a.a)((Iterator)localObject2).next();
        Object localObject3 = new cfx();
        ((cfx)localObject3).xeX = ((ServiceNotifySettingsUI.a.a)localObject1).username;
        ((cfx)localObject3).jCt = i;
        ((cfx)localObject3).xeW = 1;
        localLinkedList.add(localObject3);
        localObject3 = new tz();
        ((tz)localObject3).cQf.csl = ((ServiceNotifySettingsUI.a.a)localObject1).username;
        ((tz)localObject3).cQf.action = 2;
        ((tz)localObject3).cQf.cQh = j;
        com.tencent.mm.sdk.b.a.xxA.m((b)localObject3);
      }
      bool2 = false;
      break;
      label434: j = 0;
      break label71;
      label440: j = 0;
      break label89;
      label446: bool3 = false;
      break label111;
      label452: j = 2;
      break label180;
      label458: if (((cfx)localObject1).xeW == 1);
      for (j = 11; ; j = 10)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(13796, new Object[] { Integer.valueOf(j), "", "", Integer.valueOf(0), Long.valueOf(bo.anT()) });
        break;
      }
      label530: j = 1;
      break label278;
      label536: i = 1;
    }
    label541: if (!localLinkedList.isEmpty())
    {
      aw.Rg().a(1176, new ServiceNotifySettingsUI.4(this, bool2, bool1, localLinkedList, j));
      aw.Rg().a(new com.tencent.mm.modelappbrand.o(localLinkedList), 0);
    }
    this.ypX.unregisterDataSetObserver(this.PL);
    super.onDestroy();
    AppMethodBeat.o(29863);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, final String paramString, m paramm)
  {
    AppMethodBeat.i(29864);
    if (this.sfa != null)
      this.sfa.dismiss();
    ab.i("MicroMsg.ServiceNotifySettingsUI", "onSceneEnd(GetServiceNotifyOptions), errType : %s, errCode : %s, errMsg : %s.", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      t.makeText(this, 2131301844, 0).show();
      AppMethodBeat.o(29864);
      return;
    }
    paramString = ((com.tencent.mm.modelappbrand.p)paramm).abG();
    if (this.mMode == 1)
      this.omp.setCheck(paramString.wsw);
    while (true)
    {
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(29854);
          if (ServiceNotifySettingsUI.b(ServiceNotifySettingsUI.this) == 1)
          {
            ServiceNotifySettingsUI.a(ServiceNotifySettingsUI.this, paramString.wsx);
            AppMethodBeat.o(29854);
          }
          while (true)
          {
            return;
            ServiceNotifySettingsUI.a(ServiceNotifySettingsUI.this, paramString.vKP);
            AppMethodBeat.o(29854);
          }
        }
      });
      AppMethodBeat.o(29864);
      break;
      this.omp.setCheck(paramString.vKO);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static final class a extends BaseAdapter
  {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private int mMode;
    private View.OnClickListener mOnClickListener;
    private String mSceneId;
    LinkedList<ServiceNotifySettingsUI.a.a> yqd;
    LinkedList<ServiceNotifySettingsUI.a.a> yqe;
    private com.tencent.mm.at.a.a.c yqf;

    public a(Context paramContext, LayoutInflater paramLayoutInflater, int paramInt, String paramString)
    {
      AppMethodBeat.i(29857);
      this.mContext = paramContext;
      this.mMode = paramInt;
      this.mSceneId = paramString;
      this.mLayoutInflater = paramLayoutInflater;
      this.yqd = new LinkedList();
      this.yqe = new LinkedList();
      this.mOnClickListener = new ServiceNotifySettingsUI.a.1(this, paramInt);
      paramContext = new c.a();
      paramContext.eQf = true;
      paramContext.ePW = com.tencent.mm.modelappbrand.a.a.abQ();
      this.yqf = paramContext.ahG();
      AppMethodBeat.o(29857);
    }

    private ServiceNotifySettingsUI.a.a Nv(int paramInt)
    {
      AppMethodBeat.i(29859);
      ServiceNotifySettingsUI.a.a locala = (ServiceNotifySettingsUI.a.a)this.yqd.get(paramInt);
      AppMethodBeat.o(29859);
      return locala;
    }

    public final int getCount()
    {
      AppMethodBeat.i(29858);
      int i = this.yqd.size();
      AppMethodBeat.o(29858);
      return i;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(29860);
      ServiceNotifySettingsUI.a.a locala = Nv(paramInt);
      if (paramView == null)
      {
        paramView = this.mLayoutInflater.inflate(2130970618, paramViewGroup, false);
        paramViewGroup = new ServiceNotifySettingsUI.a.b((byte)0);
        paramViewGroup.eks = ((ImageView)paramView.findViewById(2131827354));
        paramViewGroup.gne = ((TextView)paramView.findViewById(2131821314));
        paramViewGroup.yqj = ((TextView)paramView.findViewById(2131827355));
        paramView.setTag(paramViewGroup);
        com.tencent.mm.at.o.ahp().a(locala.url, paramViewGroup.eks, this.yqf);
        paramViewGroup.gne.setText(locala.title);
        if (this.mMode != 1)
          break label179;
        paramViewGroup.yqj.setText(this.mContext.getString(2131301846));
      }
      while (true)
      {
        paramViewGroup.yqj.setTag(locala.username);
        paramViewGroup.yqj.setOnClickListener(this.mOnClickListener);
        AppMethodBeat.o(29860);
        return paramView;
        paramViewGroup = (ServiceNotifySettingsUI.a.b)paramView.getTag();
        break;
        label179: paramViewGroup.yqj.setText(this.mContext.getString(2131301847));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ServiceNotifySettingsUI
 * JD-Core Version:    0.6.2
 */