package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.e.g;
import com.tencent.mm.plugin.ipcall.a.e.j;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.pluginsdk.model.h.a;
import com.tencent.mm.protocal.protobuf.aqo;
import com.tencent.mm.protocal.protobuf.crt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IPCallRechargeUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  TextView kEq;
  private h.a lbF;
  private int lbo;
  private String[] lbs;
  private ak mHandler;
  ProgressDialog nBv;
  private String[] nEc;
  private String[] nEd;
  private String nEe;
  private String nEf;
  private boolean nEg;
  private int nEh;
  private int nEi;
  private String nEj;
  private String nEk;
  private com.tencent.mm.plugin.ipcall.a.e.h nEl;
  private g nEm;
  private j nEn;
  RelativeLayout nEo;
  GridView nEp;
  ListView nEq;
  IPCallRechargeUI.a nEr;
  Button nEs;
  com.tencent.mm.plugin.ipcall.a.d.f nEt;

  public IPCallRechargeUI()
  {
    AppMethodBeat.i(22268);
    this.nEg = false;
    this.lbo = -1;
    this.nEi = -1;
    this.nEl = new com.tencent.mm.plugin.ipcall.a.e.h();
    this.nEm = new g();
    this.nEn = new j();
    this.lbF = new IPCallRechargeUI.1(this);
    this.mHandler = new IPCallRechargeUI.3(this);
    AppMethodBeat.o(22268);
  }

  private void JD(String paramString)
  {
    AppMethodBeat.i(22273);
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
      str = getString(2131300813);
    com.tencent.mm.ui.base.h.a(this, str, getString(2131300813), new IPCallRechargeUI.12(this));
    AppMethodBeat.o(22273);
  }

  private void Ph(String paramString)
  {
    AppMethodBeat.i(22271);
    Object localObject = com.tencent.mm.plugin.ipcall.a.c.bHc().bHf();
    if (((List)localObject).size() == 0);
    for (localObject = a.Pr(com.tencent.mm.plugin.ipcall.b.c.bIR()); ; localObject = a.Pr(((Integer)((List)localObject).get(0)).toString()))
    {
      this.nEt = new com.tencent.mm.plugin.ipcall.a.d.f((String)localObject, paramString);
      aw.Rg().a(this.nEt, 0);
      AppMethodBeat.o(22271);
      return;
    }
  }

  private boolean Pi(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(22274);
    if ((com.tencent.mm.plugin.ipcall.b.c.bIS()) && (this.nEi >= 0))
    {
      Object localObject = this.nEr.getItem(this.nEi);
      if (((localObject instanceof crt)) && (!bo.isNullOrNil(((crt)localObject).xpt)))
      {
        localObject = ((crt)localObject).xpt;
        ab.i("MicroMsg.IPCallRechargeUI", "tryHandleShowWebViewPayDialog:".concat(String.valueOf(localObject)));
        com.tencent.mm.ui.base.h.a(this, paramString, getString(2131300813), getString(2131300788), getString(2131296868), true, new IPCallRechargeUI.2(this, (String)localObject), null);
        AppMethodBeat.o(22274);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(22274);
    }
  }

  public final void bIt()
  {
    AppMethodBeat.i(22276);
    if (this.mHandler != null)
      this.mHandler.sendEmptyMessage(1002);
    AppMethodBeat.o(22276);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969906;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(22272);
    ab.i("MicroMsg.IPCallRechargeUI", "onActivityResult. requestCode:[%d] resultCode:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    boolean bool1;
    Object localObject;
    int i;
    int j;
    if (paramInt1 == 2001)
    {
      bool1 = false;
      if (paramIntent == null)
        break label1184;
      paramInt1 = paramIntent.getIntExtra("key_err_code", 0);
      localObject = paramIntent.getStringExtra("key_err_msg");
      long l = paramIntent.getLongExtra("key_launch_ts", 0L);
      i = paramIntent.getIntExtra("key_gw_error_code", 0);
      j = paramIntent.getIntExtra("key_response_position", 0);
      if (paramInt1 == 100000001)
        bool1 = true;
      ab.i("MicroMsg.IPCallRechargeUI", "onActivityResult pay.errCode:[%d] errMsg:[%s] errGWCode:[%s] errPosition:[%d] isFailedConsume:[%s]", new Object[] { Integer.valueOf(paramInt1), localObject, Integer.valueOf(i), Integer.valueOf(j), String.valueOf(bool1) });
      if ((paramInt1 == 6) && (i != 0))
      {
        this.nEm.nzd = i;
        if (j != 3)
          break label347;
        com.tencent.mm.plugin.report.service.h.pYm.a(257L, 9L, 1L, true);
        com.tencent.mm.plugin.report.service.h.pYm.a(257L, 11L, 1L, true);
        this.nEm.nzd = 0L;
        this.nEm.nze = 2L;
        localObject = getString(2131300851);
        label234: this.nEm.nzc = l;
        this.nEm.nyL = bo.anU();
        this.nEm.finish();
      }
    }
    while (true)
    {
      if (paramInt2 == -1)
        if ((paramIntent != null) && (paramInt1 == 0))
        {
          localObject = paramIntent.getStringArrayListExtra("key_response_product_ids");
          paramIntent.getStringArrayListExtra("key_response_series_ids");
          paramIntent = ((ArrayList)localObject).iterator();
          while (true)
            if (paramIntent.hasNext())
            {
              ab.i("MicroMsg.IPCallRechargeUI", "buy product ok productId:", new Object[] { bo.nullAsNil((String)paramIntent.next()) });
              continue;
              this.nEm.nzd = paramInt1;
              break;
              label347: if (j != 1)
              {
                if ((paramInt2 == -1) && (paramInt1 == 0))
                {
                  com.tencent.mm.plugin.report.service.h.pYm.a(257L, 9L, 1L, true);
                  break label234;
                }
                if (bool1)
                {
                  com.tencent.mm.plugin.report.service.h.pYm.a(257L, 9L, 1L, true);
                  com.tencent.mm.plugin.report.service.h.pYm.a(257L, 12L, 1L, true);
                  this.nEm.nzd = 0L;
                  this.nEm.nze = 1L;
                }
              }
              break label234;
            }
          com.tencent.mm.plugin.report.service.h.pYm.a(257L, 6L, 1L, true);
          com.tencent.mm.plugin.report.service.h.pYm.a(257L, 10L, 1L, true);
          Toast.makeText(this, 2131300814, 0).show();
          finish();
          AppMethodBeat.o(22272);
        }
      while (true)
      {
        return;
        if ((paramIntent != null) && (paramInt1 == 100000002))
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(257L, 6L, 1L, true);
          JD((String)localObject);
          AppMethodBeat.o(22272);
        }
        else if ((paramIntent != null) && (paramInt1 == 109))
        {
          JD((String)localObject);
          AppMethodBeat.o(22272);
        }
        else if ((paramIntent != null) && (paramInt1 == 1))
        {
          paramIntent = getString(2131300812);
          com.tencent.mm.plugin.report.service.h.pYm.a(257L, 8L, 1L, true);
          Toast.makeText(this, paramIntent, 0).show();
          AppMethodBeat.o(22272);
        }
        else if ((paramIntent != null) && (paramInt1 == 113))
        {
          com.tencent.mm.ui.base.h.a(this, getString(2131300797), getString(2131300813), new IPCallRechargeUI.10(this));
          AppMethodBeat.o(22272);
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(257L, 7L, 1L, true);
          if (j == 3)
          {
            JD((String)localObject);
            AppMethodBeat.o(22272);
          }
          else if ((paramInt1 == 100000001) || (paramInt1 == 6))
          {
            if (i == 0)
            {
              Toast.makeText(this, getString(2131300736), 0).show();
              AppMethodBeat.o(22272);
            }
            else
            {
              paramIntent = getString(2131300738);
              if (!Pi(paramIntent))
                Toast.makeText(this, paramIntent, 0).show();
            }
          }
          else
          {
            AppMethodBeat.o(22272);
          }
        }
      }
      if (paramInt1 == 2002)
      {
        if ((this.nBv != null) && (this.nBv.isShowing()))
          this.nBv.dismiss();
        localObject = "";
        j = 0;
        paramInt1 = 0;
        bool1 = false;
        boolean bool2 = false;
        if (paramIntent != null)
        {
          j = paramIntent.getIntExtra("key_err_code", 0);
          localObject = paramIntent.getStringExtra("key_err_msg");
          paramInt1 = paramIntent.getIntExtra("key_response_position", 0);
          bool1 = bool2;
          if (j == 100000001)
            bool1 = true;
          ab.i("MicroMsg.IPCallRechargeUI", "onActivityResult restore.errCode:[%d] errMsg:[%s] errPosition:[%d] isFailedConsume:[%s]", new Object[] { Integer.valueOf(j), localObject, Integer.valueOf(paramInt1), String.valueOf(bool1) });
        }
        this.nEn.nzm = j;
        this.nEn.nzk = 0L;
        if (paramInt2 != -1)
          break label1152;
        if ((paramIntent == null) || (j != 0))
          break label1050;
        paramIntent = paramIntent.getStringArrayListExtra("key_response_product_ids");
        if ((paramIntent == null) || (paramIntent.size() <= 0))
          break label1018;
        this.nEn.nzl = 0L;
        com.tencent.mm.plugin.report.service.h.pYm.a(257L, 15L, 1L, true);
        ab.i("MicroMsg.IPCallRechargeUI", "onActivityResult. restore ok");
        com.tencent.mm.ui.base.h.a(this, getString(2131300830), getString(2131300831), new IPCallRechargeUI.11(this));
      }
      while (true)
      {
        this.nEn.nyL = bo.anU();
        this.nEn.finish();
        AppMethodBeat.o(22272);
        break;
        label1018: this.nEn.nzl = 3L;
        ab.i("MicroMsg.IPCallRechargeUI", "onActivityResult. no product can be restored");
        Toast.makeText(this, 2131300829, 0).show();
        continue;
        label1050: if (bool1)
        {
          this.nEn.nzl = 1L;
          com.tencent.mm.plugin.report.service.h.pYm.a(257L, 17L, 1L, true);
          localObject = getString(2131300829);
        }
        while (true)
        {
          ab.i("MicroMsg.IPCallRechargeUI", "onActivityResult. restore not ok");
          Toast.makeText(this, (CharSequence)localObject, 0).show();
          break;
          if (paramInt1 == 3)
          {
            this.nEn.nzl = 2L;
            com.tencent.mm.plugin.report.service.h.pYm.a(257L, 16L, 1L, true);
          }
          else
          {
            this.nEn.nzl = 2L;
          }
        }
        label1152: this.nEn.nzl = 2L;
        ab.i("MicroMsg.IPCallRechargeUI", "onActivityResult. restore failed");
        Toast.makeText(this, 2131300828, 0).show();
      }
      label1184: i = 0;
      j = 0;
      paramInt1 = 0;
      localObject = "";
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22269);
    super.onCreate(paramBundle);
    aw.Rg().a(929, this);
    setMMTitle(2131300757);
    setBackBtn(new IPCallRechargeUI.5(this));
    addIconOptionMenu(0, 2130839555, new IPCallRechargeUI.6(this));
    this.nEo = ((RelativeLayout)findViewById(2131824244));
    this.nEp = ((GridView)findViewById(2131825189));
    this.nEq = ((ListView)findViewById(2131825181));
    paramBundle = (ViewGroup)View.inflate(this.mController.ylL, 2130969904, null);
    this.nEq.addFooterView(paramBundle, null, false);
    this.nEr = new IPCallRechargeUI.a(this);
    this.nEq.setAdapter(this.nEr);
    this.kEq = ((TextView)paramBundle.findViewById(2131821051));
    this.nEs = ((Button)findViewById(2131825190));
    String str = getString(2131300763);
    paramBundle = Spannable.Factory.getInstance().newSpannable(str);
    paramBundle.setSpan(new IPCallRechargeUI.7(this), 0, str.length(), 33);
    this.kEq.setText(paramBundle);
    this.kEq.setMovementMethod(LinkMovementMethod.getInstance());
    paramBundle = this.mController.ylL;
    getString(2131297061);
    this.nBv = com.tencent.mm.ui.base.h.b(paramBundle, getString(2131300739), true, new IPCallRechargeUI.8(this));
    Ph("");
    this.nEl.start();
    com.tencent.mm.plugin.report.service.h.pYm.a(257L, 4L, 1L, true);
    AppMethodBeat.o(22269);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22270);
    super.onDestroy();
    this.nEl.nyL = bo.anU();
    this.nEl.finish();
    aw.Rg().b(929, this);
    AppMethodBeat.o(22270);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 0;
    AppMethodBeat.i(22275);
    ab.i("MicroMsg.IPCallRechargeUI", "onSceneEnd>errCode:%d,onSceneEnd>errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
    if ((paramm instanceof com.tencent.mm.plugin.ipcall.a.d.f))
    {
      paramString = this.nEl;
      paramString.nzh = bo.anU();
      paramString.nzi = paramInt2;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((com.tencent.mm.plugin.ipcall.a.d.f)paramm).nyq;
        this.nEr.ngC = paramString.CellList;
        this.nEr.nEx = paramString;
        this.nEr.notifyDataSetChanged();
        this.lbs = new String[paramString.CellList.size()];
        Iterator localIterator = paramString.CellList.iterator();
        for (paramInt1 = 0; localIterator.hasNext(); paramInt1++)
        {
          crt localcrt = (crt)localIterator.next();
          this.lbs[paramInt1] = localcrt.ProductID;
        }
        this.nEj = paramString.wup;
        this.nEk = paramString.wuq;
        this.nEe = paramString.wuk;
        this.nEf = paramString.wuo;
        this.nEh = paramString.wun;
        if (this.nEg)
        {
          this.nEd = new String[paramString.CellList.size()];
          for (paramInt1 = 0; paramInt1 < this.nEd.length; paramInt1++)
            this.nEd[paramInt1] = paramString.wuo;
          this.nEc = new String[paramString.CellList.size()];
          for (paramInt1 = i; paramInt1 < this.nEc.length; paramInt1++)
            this.nEc[paramInt1] = IPCallDynamicTextView.Pg(((crt)paramString.CellList.get(paramInt1)).wOs);
        }
        if (((com.tencent.mm.plugin.ipcall.a.d.f)paramm).nyr)
        {
          ab.i("MicroMsg.IPCallRechargeUI", "onSceneEnd IsUnkownCurency=true");
          if ((this.lbs != null) && (this.lbs.length > 0))
          {
            ab.i("MicroMsg.IPCallRechargeUI", "startQueryGooglePrice");
            com.tencent.mm.pluginsdk.model.h.a(this, this.lbs, this.lbF);
          }
          AppMethodBeat.o(22275);
        }
      }
    }
    while (true)
    {
      return;
      if ((this.nBv != null) && (this.nBv.isShowing()))
        this.nBv.dismiss();
      bIt();
      AppMethodBeat.o(22275);
      continue;
      if ((this.nBv != null) && (this.nBv.isShowing()))
        this.nBv.dismiss();
      Toast.makeText(this.mController.ylL, getString(2131300736), 0).show();
      finish();
      AppMethodBeat.o(22275);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI
 * JD-Core Version:    0.6.2
 */