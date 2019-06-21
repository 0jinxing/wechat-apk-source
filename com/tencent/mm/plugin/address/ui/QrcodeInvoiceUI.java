package com.tencent.mm.plugin.address.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.j.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.q.b;

public class QrcodeInvoiceUI extends MMActivity
{
  private Dialog gII;
  private int gJi;
  private TextView gJm;
  private b gJw;
  private InvoiceQrcodeTextView gKA;
  private InvoiceQrcodeTextView gKB;
  private InvoiceQrcodeTextView gKC;
  private InvoiceQrcodeTextView gKD;
  private InvoiceQrcodeTextView gKE;
  private Bitmap gKF;
  private o gKG;
  private ImageView gKH;
  private View gKI;
  private float gKJ;
  private View.OnClickListener gKK;
  private View.OnClickListener gKL;
  private InvoiceQrcodeTextView gKy;
  private InvoiceQrcodeTextView gKz;

  public QrcodeInvoiceUI()
  {
    AppMethodBeat.i(16918);
    this.gJi = 0;
    this.gJw = null;
    this.gII = null;
    this.gKG = null;
    this.gKJ = 0.0F;
    this.gKK = new QrcodeInvoiceUI.5(this);
    this.gKL = new QrcodeInvoiceUI.6(this);
    AppMethodBeat.o(16918);
  }

  private void ase()
  {
    AppMethodBeat.i(16922);
    if (this.gKG != null)
      AppMethodBeat.o(16922);
    while (true)
    {
      return;
      View localView = View.inflate(this, 2130969877, null);
      localView.setOnClickListener(new QrcodeInvoiceUI.3(this));
      this.gKI = localView.findViewById(2131825033);
      this.gKH = ((ImageView)localView.findViewById(2131825034));
      this.gKG = new o(localView, -1, -1, true);
      this.gKG.setClippingEnabled(false);
      this.gKG.update();
      this.gKG.setBackgroundDrawable(new ColorDrawable(16777215));
      this.gKG.setOnDismissListener(new PopupWindow.OnDismissListener()
      {
        public final void onDismiss()
        {
          AppMethodBeat.i(16915);
          QrcodeInvoiceUI.c(QrcodeInvoiceUI.this);
          AppMethodBeat.o(16915);
        }
      });
      AppMethodBeat.o(16922);
    }
  }

  public final int getLayoutId()
  {
    return 2130970215;
  }

  public final void initView()
  {
    AppMethodBeat.i(16921);
    findViewById(2131826085);
    this.gKy = ((InvoiceQrcodeTextView)findViewById(2131826087));
    if (this.gKy != null)
      this.gKy.asd();
    this.gKz = ((InvoiceQrcodeTextView)findViewById(2131826088));
    if (this.gKz != null)
      this.gKz.asd();
    this.gKA = ((InvoiceQrcodeTextView)findViewById(2131826089));
    if (this.gKA != null)
      this.gKA.asd();
    this.gKB = ((InvoiceQrcodeTextView)findViewById(2131826090));
    if (this.gKB != null)
      this.gKB.asd();
    this.gKC = ((InvoiceQrcodeTextView)findViewById(2131826091));
    if (this.gKC != null)
      this.gKC.asd();
    this.gKD = ((InvoiceQrcodeTextView)findViewById(2131826092));
    if (this.gKD != null)
      this.gKD.asd();
    this.gKE = ((InvoiceQrcodeTextView)findViewById(2131826093));
    if (this.gKE != null)
      this.gKE.asd();
    this.gKA.gJU = true;
    this.gKA.gJN = true;
    label418: label465: label606: Object localObject;
    if (this.gJi != 0)
    {
      this.gJm = ((TextView)findViewById(2131826086));
      this.gJw = com.tencent.mm.plugin.address.a.a.arR().nd(this.gJi);
      if (this.gJw == null)
      {
        ab.i("MicroMsg.QrcodeInvoiceUI", "invoiceSvrObj is null ,now finish..");
        finish();
      }
      if ((this.gJw != null) && (this.gJw.type != null) && (this.gJw.type.equals("0")))
      {
        this.gJm.setText(getString(2131300678));
        this.gKz.setVisibility(8);
        if ((this.gJw.nuJ != null) && (!this.gJw.nuJ.equals("")))
        {
          this.gKA.setVisibility(0);
          this.gKA.setValStr(this.gJw.nuJ);
          if ((this.gJw.nuP == null) || (this.gJw.nuP.equals("")))
            break label783;
          this.gKB.setVisibility(0);
          this.gKB.setValStr(this.gJw.nuP);
          if ((this.gJw.nuN == null) || (this.gJw.nuN.equals("")))
            break label795;
          this.gKC.setVisibility(0);
          this.gKC.setValStr(this.gJw.nuN);
          if ((this.gJw.nuL == null) || (this.gJw.nuL.equals("")))
            break label807;
          this.gKD.setVisibility(0);
          this.gKD.setValStr(this.gJw.nuL);
          label512: if ((this.gJw.nuK == null) || (this.gJw.nuK.equals("")))
            break label819;
          this.gKE.setVisibility(0);
          this.gKE.setValStr(this.gJw.nuK);
          label559: this.gJm.setVisibility(0);
          if (this.gJw != null)
          {
            this.gKy.setValStr(this.gJw.title);
            this.gKz.setValStr(this.gJw.nuI);
          }
          ase();
          setBackBtn(new QrcodeInvoiceUI.1(this));
          a(0, getString(2131296894), new QrcodeInvoiceUI.2(this), q.b.ymu);
          if ((this.gJw == null) || (this.gJw.nuQ == null) || (this.gJw.nuQ.equals("")))
            break label950;
          localObject = (ImageView)findViewById(2131826095);
          if (localObject != null)
          {
            ((ImageView)localObject).setVisibility(0);
            this.gKF = com.tencent.mm.bw.a.a.b(this, this.gJw.nuQ, 12, 3);
            ((ImageView)localObject).setImageBitmap(this.gKF);
            ((ImageView)localObject).setOnClickListener(this.gKL);
          }
          localObject = findViewById(2131826094);
          if (localObject != null)
            ((View)localObject).setVisibility(0);
          localObject = (TextView)findViewById(2131826096);
          if (localObject != null)
            ((TextView)localObject).setVisibility(0);
          AppMethodBeat.o(16921);
        }
      }
    }
    while (true)
    {
      return;
      this.gKA.setVisibility(8);
      break;
      label783: this.gKB.setVisibility(8);
      break label418;
      label795: this.gKC.setVisibility(8);
      break label465;
      label807: this.gKD.setVisibility(8);
      break label512;
      label819: this.gKE.setVisibility(8);
      break label559;
      if ((this.gJw == null) || (this.gJw.type == null) || (!this.gJw.type.equals("1")))
        break label559;
      this.gJm.setText(getString(2131300684));
      this.gKy.setVisibility(8);
      this.gKA.setVisibility(8);
      this.gKB.setVisibility(8);
      this.gKC.setVisibility(8);
      this.gKD.setVisibility(8);
      this.gKE.setVisibility(8);
      break label559;
      ab.i("MicroMsg.QrcodeInvoiceUI", "serverId is 0,now finish...");
      finish();
      break label606;
      label950: localObject = (ImageView)findViewById(2131826095);
      if (localObject != null)
        ((ImageView)localObject).setVisibility(8);
      localObject = findViewById(2131826094);
      if (localObject != null)
        ((View)localObject).setVisibility(8);
      localObject = (TextView)findViewById(2131826096);
      if (localObject != null)
        ((TextView)localObject).setVisibility(8);
      AppMethodBeat.o(16921);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(16925);
    switch (paramInt1)
    {
    case 2:
    default:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(16925);
      while (true)
      {
        return;
        if (paramInt2 != -1)
          break;
        String str = paramIntent.getStringExtra("karea_result");
        if (!bo.isNullOrNil(str))
        {
          ab.d("MicroMsg.QrcodeInvoiceUI", "AREA_RESULT:".concat(String.valueOf(str)));
          this.gKC.setValStr(str);
        }
        paramIntent = paramIntent.getStringExtra("kpost_code");
        if (!bo.isNullOrNil(paramIntent))
        {
          ab.d("MicroMsg.QrcodeInvoiceUI", "post:".concat(String.valueOf(paramIntent)));
          this.gKC.setValStr(paramIntent);
        }
        AppMethodBeat.o(16925);
      }
      if (paramInt2 != -1)
        ab.i("MicroMsg.QrcodeInvoiceUI", "MallRecharge pay result : cancel");
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(16919);
    super.onCreate(paramBundle);
    ab.d("MicroMsg.QrcodeInvoiceUI", "index Oncreate");
    this.gJi = getIntent().getIntExtra("invoice_id", 0);
    setMMTitle(2131300689);
    AppMethodBeat.o(16919);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(16924);
    super.onDestroy();
    AppMethodBeat.o(16924);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(16926);
    boolean bool;
    if (paramInt == 4)
    {
      setResult(0);
      finish();
      bool = true;
      AppMethodBeat.o(16926);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(16926);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(16920);
    getWindow().setSoftInputMode(3);
    super.onResume();
    initView();
    AppMethodBeat.o(16920);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public void showPopupWindow(View paramView)
  {
    AppMethodBeat.i(16923);
    if ((this.gKG != null) && (!this.gKG.isShowing()))
    {
      this.gKG.showAtLocation(paramView.getRootView(), 17, 0, 0);
      this.gKG.setFocusable(true);
      this.gKG.setTouchable(true);
      this.gKG.setBackgroundDrawable(new ColorDrawable(16777215));
      this.gKG.setOutsideTouchable(true);
      this.gKI.setVisibility(0);
      this.gKH.setOnClickListener(this.gKK);
      this.gKH.setImageBitmap(this.gKF);
      if (this.gKF == null)
        break label137;
      ab.e("MicroMsg.QrcodeInvoiceUI", "updatePopWindowContent mQRCodeBmp != null");
    }
    while (true)
    {
      this.gKG.update();
      AppMethodBeat.o(16923);
      return;
      label137: ab.i("MicroMsg.QrcodeInvoiceUI", "updatePopWindowContent mQRCodeBmp == null");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI
 * JD-Core Version:    0.6.2
 */