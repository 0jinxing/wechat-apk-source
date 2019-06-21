package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.product.a.a;
import com.tencent.mm.plugin.product.b.b;
import com.tencent.mm.plugin.product.b.e;
import com.tencent.mm.plugin.product.b.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class MallProductSelectSkuUI extends MallBaseUI
  implements x.a
{
  private TextView iDT;
  private m pgO;
  private e phd;
  private com.tencent.mm.plugin.product.b.c piK;
  private ImageView pjm;
  private TextView pjn;
  private TextView pjo;
  private Button pjp;
  private ListView pjq;
  private MallProductSelectAmountView pjr = null;
  private i pjs = null;
  private f pjt;

  private void cu()
  {
    AppMethodBeat.i(44115);
    if (this.pgO != null)
    {
      if ((this.phd == null) || (this.pgO.phs == null))
        break label180;
      this.pjn.setText(b.s(this.phd.phh, this.phd.phi, this.pgO.phs.pcl));
    }
    while (true)
    {
      if (this.pgO.phs != null)
        this.iDT.setText(this.pgO.phs.name);
      if (!bo.isNullOrNil(this.piK.bZG()))
      {
        Bitmap localBitmap = x.a(new c(this.piK.bZG()));
        this.pjm.setImageBitmap(localBitmap);
        x.a(this);
      }
      this.pjo.setVisibility(8);
      this.pjr.eY(this.piK.bZO(), this.piK.pgO.phr);
      this.pjs.notifyDataSetChanged();
      AppMethodBeat.o(44115);
      return;
      label180: this.pjn.setText(b.s(this.pgO.phs.phE, this.pgO.phs.phF, this.pgO.phs.pcl));
    }
  }

  public final int getLayoutId()
  {
    return 2130970397;
  }

  public final void initView()
  {
    AppMethodBeat.i(44114);
    setMMTitle(2131301360);
    this.pjm = ((ImageView)findViewById(2131826608));
    this.iDT = ((TextView)findViewById(2131826609));
    this.pjn = ((TextView)findViewById(2131826610));
    this.pjo = ((TextView)findViewById(2131826613));
    this.pjp = ((Button)findViewById(2131826614));
    this.pjq = ((ListView)findViewById(2131826611));
    this.pjr = ((MallProductSelectAmountView)findViewById(2131826612));
    this.pjr.setAmount(this.piK.mCount);
    this.pjs = new i(this);
    if ((this.pgO != null) && (this.pgO.phs != null) && (this.pgO.phs.phM != null))
      this.pjs.pjv = this.pgO.phs.phM;
    while (true)
    {
      this.pjs.pjw = new MallProductSelectSkuUI.2(this);
      this.pjq.setAdapter(this.pjs);
      this.pjr.setOnAmountChangeListener(new MallProductSelectSkuUI.3(this));
      this.pjp.setOnClickListener(new MallProductSelectSkuUI.4(this));
      this.pjm.setFocusable(true);
      this.pjm.setFocusableInTouchMode(true);
      this.pjm.requestFocus();
      AppMethodBeat.o(44114);
      return;
      ab.e("MicroMsg.MallProductSelectSkuUI", "Illage mProductInfo.base_attr.sku_table");
    }
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(44117);
    paramString = new StringBuilder().append(paramString).append(", bitmap = ");
    boolean bool;
    if (paramBitmap == null)
    {
      bool = true;
      ab.d("MicroMsg.MallProductSelectSkuUI", bool);
      if (!bo.isNullOrNil(this.piK.bZG()))
        break label68;
      AppMethodBeat.o(44117);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label68: this.pjm.post(new MallProductSelectSkuUI.5(this, paramBitmap));
      AppMethodBeat.o(44117);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(44116);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.pjt.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(44116);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44111);
    super.onCreate(paramBundle);
    this.pjt = new f(this.mController.ylL, new MallProductSelectSkuUI.1(this));
    a.bZC();
    this.piK = a.bZD();
    this.pgO = this.piK.pgO;
    initView();
    cu();
    AppMethodBeat.o(44111);
  }

  public void onStart()
  {
    AppMethodBeat.i(44112);
    this.pjt.onStart();
    super.onStart();
    AppMethodBeat.o(44112);
  }

  public void onStop()
  {
    AppMethodBeat.i(44113);
    this.pjt.onStop();
    super.onStop();
    AppMethodBeat.o(44113);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI
 * JD-Core Version:    0.6.2
 */