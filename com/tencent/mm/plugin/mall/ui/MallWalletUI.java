package com.tencent.mm.plugin.mall.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.mall.a.i;
import com.tencent.mm.plugin.mall.a.i.a;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.auj;
import com.tencent.mm.protocal.protobuf.ave;
import com.tencent.mm.protocal.protobuf.bif;
import com.tencent.mm.protocal.protobuf.bqn;
import com.tencent.mm.protocal.protobuf.btq;
import com.tencent.mm.protocal.protobuf.cgd;
import com.tencent.mm.protocal.protobuf.cge;
import com.tencent.mm.protocal.protobuf.cgv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class MallWalletUI extends WalletBaseUI
{
  private static final int onM;
  private Dialog msu;
  private boolean ohG = false;
  private LinearLayout onN;
  private LinearLayout onO;
  private cge onP;
  private Dialog onQ;
  private i.a onR;

  static
  {
    AppMethodBeat.i(43278);
    onM = a.fromDPToPix(ah.getContext(), 8);
    AppMethodBeat.o(43278);
  }

  private void a(LinearLayout paramLinearLayout, ave paramave)
  {
    AppMethodBeat.i(43276);
    if (paramave.wzb != null)
    {
      int i = paramave.wzb.size();
      Iterator localIterator1 = null;
      com.tencent.mm.kernel.g.RQ();
      Object localObject1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUn, "");
      Object localObject2 = localIterator1;
      if (!bo.isNullOrNil((String)localObject1));
      label901: label1037: 
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        ab.i("MicroMsg.MallWalletUI", "cell size: %s", new Object[] { Integer.valueOf(i) });
        localIterator1 = paramave.wzb.iterator();
        for (int j = 0; ; j++)
        {
          if (!localIterator1.hasNext())
            break label1066;
          paramave = (cgd)localIterator1.next();
          localObject1 = new MallWalletSectionCellView(this.mController.ylL);
          if (j >= i - 1)
            break;
          k = 1;
          com.tencent.mm.plugin.wallet_core.utils.e.a(((MallWalletSectionCellView)localObject1).onz, paramave.xff);
          if ((paramave.xfi == null) || (bo.isNullOrNil(paramave.xfi.url)))
            break label732;
          com.tencent.mm.plugin.wallet_core.utils.e.a(((MallWalletSectionCellView)localObject1).onC, paramave.xfi, 2130840652, true);
          if ((paramave.xfg == null) || (paramave.xfg.size() <= 0))
            break label745;
          com.tencent.mm.plugin.wallet_core.utils.e.a(((MallWalletSectionCellView)localObject1).onA, (cgv)paramave.xfg.get(0), null);
          if (paramave.xfk == null)
            break label875;
          localTextView = ((MallWalletSectionCellView)localObject1).onI;
          localObject3 = paramave.xfk;
          if ((localObject3 != null) && (localTextView != null))
            break label758;
          ((MallWalletSectionCellView)localObject1).onI.setVisibility(0);
          if ((paramave.xfh == null) || (paramave.xfh.size() <= 0))
            break label888;
          com.tencent.mm.plugin.wallet_core.utils.e.a(((MallWalletSectionCellView)localObject1).onB, (cgv)paramave.xfh.get(0), null);
          if ((paramave.xfh == null) || (paramave.xfh.size() <= 1))
            break label901;
          com.tencent.mm.plugin.wallet_core.utils.e.a(((MallWalletSectionCellView)localObject1).onD, (cgv)paramave.xfh.get(1), null);
          if ((paramave.xfj == null) || (localObject2 == null))
            break label1045;
          if (((JSONObject)localObject2).optInt(paramave.xfj.wpJ, 0) != 1)
            break label914;
          m = 1;
          long l = ((JSONObject)localObject2).optLong(String.format("%s_expiretime", new Object[] { paramave.xfj.wpJ }), 0L);
          int n = m;
          if (l > 0L)
          {
            n = m;
            if (System.currentTimeMillis() > l)
            {
              ab.i("MicroMsg.MallWalletSectionCellView", "red dot expired: %s, %s", new Object[] { paramave.xfj.wpJ, Long.valueOf(l) });
              n = 0;
            }
          }
          if (n == 0)
            break label1037;
          if (paramave.xfj.type != 1)
            break label920;
          ((MallWalletSectionCellView)localObject1).onE.setVisibility(0);
          ((MallWalletSectionCellView)localObject1).onF.setVisibility(8);
          ((MallWalletSectionCellView)localObject1).onG.setVisibility(8);
          m = MallWalletSectionCellView.koS;
          int i1 = MallWalletSectionCellView.koS;
          n = MallWalletSectionCellView.koS;
          int i2 = MallWalletSectionCellView.koS;
          if (paramave.wVz != null)
          {
            localObject3 = paramave.wVz;
            if (((bif)localObject3).left > 0.0F)
              m = ((MallWalletSectionCellView)localObject1).aN(((bif)localObject3).left);
            if (((bif)localObject3).right > 0.0F)
              n = ((MallWalletSectionCellView)localObject1).aN(((bif)localObject3).right);
            if (((bif)localObject3).top > 0.0F)
              i1 = ((MallWalletSectionCellView)localObject1).aN(((bif)localObject3).top);
            if (((bif)localObject3).bottom > 0.0F)
              i2 = ((MallWalletSectionCellView)localObject1).aN(((bif)localObject3).bottom);
            ((MallWalletSectionCellView)localObject1).onH.setPadding(m, i1, n, i2);
          }
          if (k == 0)
            break label1053;
          ((MallWalletSectionCellView)localObject1).onA.post(new MallWalletSectionCellView.1((MallWalletSectionCellView)localObject1));
          if (paramave.vCP != null)
            ((MallWalletSectionCellView)localObject1).setOnClickListener(new MallWalletSectionCellView.2((MallWalletSectionCellView)localObject1, paramave, (JSONObject)localObject2));
          paramLinearLayout.addView((View)localObject1);
        }
      }
      catch (JSONException localJSONException)
      {
        label914: label1045: 
        while (true)
        {
          TextView localTextView;
          Object localObject3;
          ab.printErrStackTrace("MicroMsg.MallWalletUI", localJSONException, "", new Object[0]);
          Iterator localIterator2 = localIterator1;
          continue;
          int k = 0;
          continue;
          label732: ((MallWalletSectionCellView)localObject1).onC.setImageResource(2130840652);
          continue;
          label745: ((MallWalletSectionCellView)localObject1).onA.setText("");
          continue;
          label758: com.tencent.mm.plugin.wallet_core.utils.e.a(localTextView, ((btq)localObject3).wbo, null);
          com.tencent.mm.plugin.wallet_core.utils.e.a(localTextView, ((btq)localObject3).wVz);
          int m = (int)((btq)localObject3).wVB;
          if ((((btq)localObject3).wVB & 0xFF000000) == 0L)
            m = (int)(((btq)localObject3).wVB | 0xFF000000);
          GradientDrawable localGradientDrawable = new GradientDrawable();
          localGradientDrawable.setShape(0);
          if (((btq)localObject3).wVA > 0.0F)
            localGradientDrawable.setCornerRadius(a.fromDPToPix(localTextView.getContext(), (int)((btq)localObject3).wVA));
          localGradientDrawable.setColor(m);
          localTextView.setBackground(localGradientDrawable);
          continue;
          label875: ((MallWalletSectionCellView)localObject1).onI.setVisibility(8);
          continue;
          label888: ((MallWalletSectionCellView)localObject1).onB.setText("");
          continue;
          ((MallWalletSectionCellView)localObject1).onD.setVisibility(8);
          continue;
          m = 0;
          continue;
          label920: if (paramave.xfj.type == 2)
          {
            ((MallWalletSectionCellView)localObject1).onE.setVisibility(8);
            ((MallWalletSectionCellView)localObject1).onF.setVisibility(0);
            ((MallWalletSectionCellView)localObject1).onG.setVisibility(8);
          }
          else if (paramave.xfj.type == 3)
          {
            ((MallWalletSectionCellView)localObject1).onG.setText(com.tencent.mm.plugin.wallet_core.utils.e.a(((MallWalletSectionCellView)localObject1).getContext(), paramave.xfj.wbo));
            ((MallWalletSectionCellView)localObject1).onE.setVisibility(8);
            ((MallWalletSectionCellView)localObject1).onF.setVisibility(8);
            ((MallWalletSectionCellView)localObject1).onG.setVisibility(0);
          }
          else
          {
            ((MallWalletSectionCellView)localObject1).bNs();
            continue;
            ((MallWalletSectionCellView)localObject1).bNs();
            continue;
            ((MallWalletSectionCellView)localObject1).bNs();
            continue;
            label1053: ((MallWalletSectionCellView)localObject1).kiH.setVisibility(8);
          }
        }
      }
    }
    label1066: AppMethodBeat.o(43276);
  }

  private void bNt()
  {
    AppMethodBeat.i(43274);
    ab.i("MicroMsg.MallWalletUI", "do query wechat wallet");
    this.msu = com.tencent.mm.wallet_core.ui.g.b(this, false, null);
    i.a(this.onR, true);
    AppMethodBeat.o(43274);
  }

  private void co(List<cgv> paramList)
  {
    AppMethodBeat.i(43275);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(43275);
    while (true)
    {
      return;
      this.onO.removeAllViews();
      paramList.size();
      paramList = paramList.iterator();
      for (int i = 0; paramList.hasNext(); i++)
      {
        Object localObject = (cgv)paramList.next();
        TextView localTextView = new TextView(this);
        com.tencent.mm.plugin.wallet_core.utils.e.a(localTextView, (cgv)localObject, new MallWalletUI.3(this));
        localObject = new LinearLayout.LayoutParams(-2, -2);
        if (i != 0)
          ((LinearLayout.LayoutParams)localObject).topMargin = a.fromDPToPix(this, 8);
        this.onO.addView(localTextView, (ViewGroup.LayoutParams)localObject);
      }
      AppMethodBeat.o(43275);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130970066;
  }

  public final void initView()
  {
    AppMethodBeat.i(43269);
    this.onN = ((LinearLayout)findViewById(2131825910));
    this.onO = ((LinearLayout)findViewById(2131825911));
    AppMethodBeat.o(43269);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(43273);
    ab.i("MicroMsg.MallWalletUI", "requestCode: %s, resultCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 65281) || (paramInt1 == 65286))
    {
      bNt();
      AppMethodBeat.o(43273);
    }
    while (true)
    {
      return;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(43273);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(43268);
    this.yll = true;
    super.onCreate(paramBundle);
    xE(Color.parseColor("#f7f7f7"));
    dyb();
    setMMTitle("");
    initView();
    this.onR = new MallWalletUI.1(this);
    bNt();
    AppMethodBeat.o(43268);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(43272);
    super.onDestroy();
    i.a(this.onR);
    AppMethodBeat.o(43272);
  }

  public void onPause()
  {
    AppMethodBeat.i(43271);
    super.onPause();
    AppMethodBeat.o(43271);
  }

  public void onResume()
  {
    AppMethodBeat.i(43270);
    super.onResume();
    AppMethodBeat.o(43270);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallWalletUI
 * JD-Core Version:    0.6.2
 */