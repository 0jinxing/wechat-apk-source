package com.tencent.mm.plugin.facedetect.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetectlight.Utils.a.b;
import com.tencent.mm.protocal.protobuf.blr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

@com.tencent.mm.ui.base.a(3)
public class FaceDetectConfirmUI extends MMActivity
  implements f
{
  private String appId;
  private int businessType;
  private String iBt;
  private String lSJ = null;
  private String lSK = null;
  private String lSL = null;
  private float lSM;
  private String lSO;
  private TextView lWk;
  private Button lWl;
  private CheckBox lWm;
  private TextView lWn;
  private TextView lWo;
  private blr lWp = null;
  private String lWq;
  private int lWr;
  private int lWs;
  private ImageView lWt;
  private TextView lWu;
  private String lWv;
  private String lWw;
  private com.tencent.mm.ui.base.p tipDialog;

  private void bth()
  {
    AppMethodBeat.i(374);
    Intent localIntent = new Intent();
    localIntent.putExtra("err_code", com.tencent.mm.plugin.facedetect.model.l.vm(90024));
    localIntent.putExtra("err_msg", "user cancel in confirm ui");
    FaceDetectReporter.bsJ().c(this.businessType, false, 3, 1, 90024);
    FaceDetectReporter.bsJ().lUB = System.currentTimeMillis();
    FaceDetectReporter.bsJ().ce(this.iBt, this.businessType);
    setResult(0, localIntent);
    finish();
    AppMethodBeat.o(374);
  }

  private void dismissDialog()
  {
    AppMethodBeat.i(377);
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    AppMethodBeat.o(377);
  }

  public void finish()
  {
    AppMethodBeat.i(376);
    dismissDialog();
    super.finish();
    AppMethodBeat.o(376);
  }

  public final int getLayoutId()
  {
    return 2130969458;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(373);
    ab.i("MicroMsg.FaceDetectConfirmUI", "onActiviyResult reqeustCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    FaceDetectReporter.bsJ().lUB = System.currentTimeMillis();
    FaceDetectReporter.bsJ().ce(this.iBt, this.businessType);
    setResult(paramInt2, paramIntent);
    finish();
    AppMethodBeat.o(373);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(375);
    bth();
    super.onBackPressed();
    AppMethodBeat.o(375);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(371);
    super.onCreate(paramBundle);
    this.appId = getIntent().getStringExtra("k_app_id");
    this.lWq = getIntent().getStringExtra("request_verify_pre_info");
    this.iBt = getIntent().getStringExtra("key_function_name");
    this.businessType = getIntent().getIntExtra("key_business_type", -1);
    this.lWr = getIntent().getIntExtra("check_alive_type", 0);
    ab.i("MicroMsg.FaceDetectConfirmUI", "carson check_alive_type : %s", new Object[] { Integer.valueOf(this.lWr) });
    ab.i("MicroMsg.FaceDetectConfirmUI", "carson businessType : %s", new Object[] { Integer.valueOf(this.businessType) });
    setMMTitle(getString(2131299448));
    setBackBtn(new FaceDetectConfirmUI.1(this));
    this.lWk = ((TextView)findViewById(2131823765));
    this.lWl = ((Button)findViewById(2131823768));
    this.lWt = ((ImageView)findViewById(2131823763));
    this.lWu = ((TextView)findViewById(2131823764));
    this.lWm = ((CheckBox)findViewById(2131823766));
    this.lWm.setOnCheckedChangeListener(new FaceDetectConfirmUI.2(this));
    this.lWm.setVisibility(8);
    this.lWn = ((TextView)findViewById(2131823767));
    this.lWn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(365);
        paramAnonymousView = FaceDetectConfirmUI.c(FaceDetectConfirmUI.this);
        if (!FaceDetectConfirmUI.c(FaceDetectConfirmUI.this).isChecked());
        for (boolean bool = true; ; bool = false)
        {
          paramAnonymousView.setChecked(bool);
          AppMethodBeat.o(365);
          return;
        }
      }
    });
    this.lWo = ((TextView)findViewById(2131823769));
    this.lWl.setOnClickListener(new FaceDetectConfirmUI.4(this));
    ab.i("MicroMsg.FaceDetectConfirmUI", "alvinluo start get confirm info");
    paramBundle = this.mController.ylL;
    getString(2131297061);
    this.tipDialog = h.b(paramBundle, getString(2131297086), false, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
      }
    });
    paramBundle = new com.tencent.mm.plugin.facedetect.b.l(this.appId, this.lWq, this.lWr);
    g.Rg().a(1147, this);
    g.Rg().a(paramBundle, 0);
    a.b.btT().dM(this);
    AppMethodBeat.o(371);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(378);
    super.onDestroy();
    a.b.btT().stop();
    AppMethodBeat.o(378);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(372);
    ab.i("MicroMsg.FaceDetectConfirmUI", "alvinluo scene: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    blr localblr;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.lWp = ((com.tencent.mm.plugin.facedetect.b.l)paramm).lSG;
      this.lSJ = ((com.tencent.mm.plugin.facedetect.b.l)paramm).lSJ;
      this.lSK = ((com.tencent.mm.plugin.facedetect.b.l)paramm).lSK;
      this.lSL = ((com.tencent.mm.plugin.facedetect.b.l)paramm).lSL;
      this.lSM = ((com.tencent.mm.plugin.facedetect.b.l)paramm).lSM;
      this.lWs = ((com.tencent.mm.plugin.facedetect.b.l)paramm).lSN;
      this.lSO = ((com.tencent.mm.plugin.facedetect.b.l)paramm).lSO;
      this.lWv = ((com.tencent.mm.plugin.facedetect.b.l)paramm).lSH;
      this.lWw = ((com.tencent.mm.plugin.facedetect.b.l)paramm).lSI;
      ab.d("MicroMsg.FaceDetectConfirmUI", paramm.toString());
      if (bo.isNullOrNil(this.lSJ))
        this.lSJ = getString(2131299446);
      dismissDialog();
      this.lWl.setEnabled(true);
      this.lWk.setText(this.lSJ);
      paramString = String.format(getString(2131299447), new Object[] { this.lWw });
      paramm = new SpannableString(paramString);
      paramInt1 = paramString.lastIndexOf(" ");
      paramm.setSpan(new StyleSpan(1), 0, paramInt1, 17);
      this.lWu.setText(paramm);
      o.ahp().a(this.lWv, this.lWt);
      if (this.lWp != null)
      {
        ab.v("MicroMsg.FaceDetectConfirmUI", "alvinluo provider wording: %s, url_wording: %s, url: %s", new Object[] { this.lWp.cEh, this.lWp.wOM, this.lWp.url });
        localblr = this.lWp;
        ab.i("MicroMsg.FaceDetectConfirmUI", "alvinluo protocol info: %s", new Object[] { localblr.cEh });
        if (!bo.isNullOrNil(localblr.cEh))
          break label584;
        paramString = getString(2131299444);
        if (!bo.isNullOrNil(localblr.wOM))
          break label593;
        paramm = getString(2131299443);
        label411: Spannable localSpannable = Spannable.Factory.getInstance().newSpannable(paramString + paramm);
        localSpannable.setSpan(new FaceDetectConfirmUI.7(this, localblr), paramString.length(), paramString.length() + paramm.length(), 33);
        this.lWm.setVisibility(0);
        this.lWn.setVisibility(0);
        this.lWn.setText(localSpannable);
        this.lWn.setMovementMethod(LinkMovementMethod.getInstance());
        if (localblr.wON != 0)
          break label603;
        this.lWm.setChecked(false);
        this.lWl.setEnabled(false);
        label530: this.lWo.setText(getString(2131299441));
        this.lWo.setOnClickListener(new FaceDetectConfirmUI.8(this));
        this.lWo.setVisibility(0);
      }
    }
    while (true)
    {
      g.Rg().b(1147, this);
      AppMethodBeat.o(372);
      return;
      label584: paramString = localblr.cEh;
      break;
      label593: paramm = localblr.wOM;
      break label411;
      label603: if (localblr.wON != 1)
        break label530;
      this.lWm.setChecked(true);
      this.lWl.setEnabled(true);
      break label530;
      paramm = paramString;
      if (bo.isNullOrNil(paramString))
        paramm = getString(2131299490);
      dismissDialog();
      h.a(this, paramm, getString(2131297061), false, new FaceDetectConfirmUI.6(this));
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI
 * JD-Core Version:    0.6.2
 */