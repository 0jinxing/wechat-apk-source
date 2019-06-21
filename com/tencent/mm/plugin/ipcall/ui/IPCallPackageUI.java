package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.d.e;
import com.tencent.mm.plugin.ipcall.a.d.j;
import com.tencent.mm.protocal.protobuf.aqm;
import com.tencent.mm.protocal.protobuf.crx;
import com.tencent.mm.protocal.protobuf.crz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IPCallPackageUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private ListView nDI;
  private TextView nDJ;
  private ProgressDialog nDK;
  private ProgressDialog nDL;
  private IPCallPackageUI.a nDM;
  private e nDN;
  private j nDO;
  private com.tencent.mm.plugin.ipcall.a.e.f nDP;

  public IPCallPackageUI()
  {
    AppMethodBeat.i(22230);
    this.nDI = null;
    this.nDJ = null;
    this.nDK = null;
    this.nDL = null;
    this.nDM = null;
    this.nDN = null;
    this.nDO = null;
    this.nDP = new com.tencent.mm.plugin.ipcall.a.e.f();
    AppMethodBeat.o(22230);
  }

  private void bIr()
  {
    AppMethodBeat.i(22233);
    ab.i("MicroMsg.IPCallPackageUI", "startGetPackageProductList");
    if (this.nDM != null)
    {
      this.nDM.ngC = null;
      this.nDM.notifyDataSetChanged();
    }
    if (this.nDI != null)
      this.nDI.setVisibility(8);
    if (this.nDJ != null)
      this.nDJ.setVisibility(8);
    bIs();
    this.nDN = new e();
    aw.Rg().a(this.nDN, 0);
    AppMethodBeat.o(22233);
  }

  private void bIs()
  {
    AppMethodBeat.i(22234);
    if (this.nDK == null)
    {
      AppCompatActivity localAppCompatActivity = this.mController.ylL;
      getString(2131297061);
      this.nDK = h.b(localAppCompatActivity, getString(2131300739), true, new IPCallPackageUI.2(this));
      AppMethodBeat.o(22234);
    }
    while (true)
    {
      return;
      this.nDK.show();
      AppMethodBeat.o(22234);
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969903;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22231);
    super.onCreate(paramBundle);
    aw.Rg().a(831, this);
    aw.Rg().a(277, this);
    this.nDP.start();
    paramBundle = this.nDP;
    paramBundle.nyR += 1;
    this.nDP.finish();
    setMMTitle(2131300823);
    setBackBtn(new IPCallPackageUI.1(this));
    this.nDI = ((ListView)findViewById(2131825179));
    this.nDM = new IPCallPackageUI.a(this);
    this.nDI.setAdapter(this.nDM);
    this.nDJ = ((TextView)findViewById(2131825180));
    bIr();
    AppMethodBeat.o(22231);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22232);
    super.onDestroy();
    aw.Rg().b(831, this);
    aw.Rg().b(277, this);
    AppMethodBeat.o(22232);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(22235);
    if ((this.nDK != null) && (this.nDK.isShowing()))
      this.nDK.dismiss();
    if ((this.nDL != null) && (this.nDL.isShowing()))
      this.nDL.dismiss();
    if ((paramm instanceof e))
    {
      ab.i("MicroMsg.IPCallPackageUI", "onSceneEnd NetSceneIPCallGetPackageProductList errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((e)paramm).nyo;
        if ((paramString != null) && (paramString.wuh != null) && (paramString.wuh.size() > 0))
        {
          this.nDM.ngC = paramString.wuh;
          this.nDM.notifyDataSetChanged();
          this.nDI.setVisibility(0);
          AppMethodBeat.o(22235);
        }
      }
    }
    while (true)
    {
      return;
      this.nDM.ngC = null;
      this.nDM.notifyDataSetChanged();
      this.nDJ.setVisibility(0);
      AppMethodBeat.o(22235);
      continue;
      Toast.makeText(this.mController.ylL, getString(2131300736), 0).show();
      finish();
      AppMethodBeat.o(22235);
      continue;
      if ((paramm instanceof j))
      {
        ab.i("MicroMsg.IPCallPackageUI", "onSceneEnd NetSceneIPCallPurchasePackage errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
        this.nDP.nyV = paramInt2;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.nDP.finish();
          Toast.makeText(this.mController.ylL, getString(2131300825), 0).show();
          bIr();
          AppMethodBeat.o(22235);
        }
        else if (paramInt2 == 101)
        {
          Object localObject = this.nDM;
          paramString = (j)paramm;
          if (paramString.nyy != null)
          {
            paramString = paramString.nyy.ProductID;
            label339: if ((bo.isNullOrNil(paramString)) || (((IPCallPackageUI.a)localObject).ngC == null))
              break label464;
            localObject = ((IPCallPackageUI.a)localObject).ngC.iterator();
            do
            {
              if (!((Iterator)localObject).hasNext())
                break;
              paramm = (crx)((Iterator)localObject).next();
            }
            while ((paramm == null) || (!paramm.ProductID.equals(paramString)));
          }
          label464: for (paramString = paramm; ; paramString = null)
          {
            if (paramString != null)
              break label469;
            ab.e("MicroMsg.IPCallPackageUI", "onSceneEnd: proToBuy is null");
            this.nDP.finish();
            Toast.makeText(this.mController.ylL, getString(2131300819), 0).show();
            AppMethodBeat.o(22235);
            break;
            paramString = "";
            break label339;
          }
          label469: h.a(this.mController.ylL, this.mController.ylL.getString(2131300821, new Object[] { paramString.wOs, paramString.Title }), this.mController.ylL.getString(2131300822), this.mController.ylL.getString(2131300757), this.mController.ylL.getString(2131300816), false, new IPCallPackageUI.4(this), new IPCallPackageUI.5(this));
          AppMethodBeat.o(22235);
        }
        else
        {
          this.nDP.finish();
          Toast.makeText(this.mController.ylL, getString(2131300819), 0).show();
          bIr();
          AppMethodBeat.o(22235);
        }
      }
      else
      {
        ab.i("MicroMsg.IPCallPackageUI", "onSceneEnd errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
        AppMethodBeat.o(22235);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI
 * JD-Core Version:    0.6.2
 */