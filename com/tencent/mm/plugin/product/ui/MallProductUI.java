package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextPaint;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nd;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.product.b.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public class MallProductUI extends MallBaseUI
  implements x.a
{
  private Button gHn;
  private TextView kEq;
  protected com.tencent.mm.plugin.product.b.c piK;
  private HtmlTextView pir;
  private ListView pjS;
  private a pjT;
  private LinearLayout pjV;
  private LinearLayout pjW;
  private ImageView pjX;
  private TextView pjY;
  private HtmlTextView pjZ;
  private TextView pjn;
  private f pjt;
  private RelativeLayout pka;
  private ListView pkb;
  private k pkc = null;
  private Button pkd;

  protected final void cu()
  {
    AppMethodBeat.i(44171);
    Object localObject = this.piK.pgO;
    if (localObject == null)
    {
      showOptionMenu(false);
      AppMethodBeat.o(44171);
      return;
    }
    showOptionMenu(true);
    AM(0);
    this.pjV.setVisibility(0);
    this.pjW.setVisibility(8);
    if (((m)localObject).phs != null)
    {
      this.kEq.setText(((m)localObject).phs.name);
      this.pjn.setText(com.tencent.mm.plugin.product.b.b.s(((m)localObject).phs.phE, ((m)localObject).phs.phF, ((m)localObject).phs.pcl));
      this.pjY.setText(com.tencent.mm.plugin.product.b.b.d(((m)localObject).phs.phD, ((m)localObject).phs.pcl));
    }
    if (this.piK.bZO() <= 0)
    {
      this.gHn.setEnabled(false);
      this.gHn.setText(2131301364);
      label159: if ((((m)localObject).phs == null) || (((m)localObject).phs.phN == null) || (((m)localObject).phs.phN.size() <= 0))
        break label431;
      this.pjS.setVisibility(0);
      this.pjT.cz(((m)localObject).phs.phN);
      this.pjT.notifyDataSetChanged();
      label218: if ((((m)localObject).phs == null) || (bo.isNullOrNil(((m)localObject).phs.detail)))
        break label443;
      this.pka.setVisibility(0);
      this.pir.setVisibility(0);
      this.pir.setText(((m)localObject).phs.detail);
      label268: if (bo.isNullOrNil(((m)localObject).phy))
        break label464;
      this.pjZ.setVisibility(0);
      this.pjZ.setText(((m)localObject).phy);
    }
    while (true)
    {
      showOptionMenu(true);
      if (!bo.isNullOrNil(this.piK.pgW))
      {
        localObject = x.a(new c(this.piK.pgW));
        this.pjX.setImageBitmap((Bitmap)localObject);
        x.a(this);
      }
      AppMethodBeat.o(44171);
      break;
      if (this.piK.pgO.phr <= 0)
      {
        this.gHn.setEnabled(false);
        this.gHn.setText(2131301363);
        break label159;
      }
      this.gHn.setEnabled(true);
      if (!bo.isNullOrNil(((m)localObject).phx))
      {
        this.gHn.setText(((m)localObject).phx);
        break label159;
      }
      this.gHn.setText(2131301351);
      break label159;
      label431: this.pjS.setVisibility(8);
      break label218;
      label443: this.pka.setVisibility(8);
      this.pir.setVisibility(8);
      break label268;
      label464: this.pjZ.setVisibility(8);
    }
  }

  public final int getLayoutId()
  {
    return 2130970402;
  }

  public final void initView()
  {
    AppMethodBeat.i(44169);
    setMMTitle(2131301380);
    setBackBtn(new MallProductUI.2(this));
    this.pjV = ((LinearLayout)findViewById(2131826636));
    this.pjW = ((LinearLayout)findViewById(2131826647));
    this.pjX = ((ImageView)findViewById(2131826637));
    this.kEq = ((TextView)findViewById(2131826638));
    this.pjn = ((TextView)findViewById(2131826639));
    this.pjY = ((TextView)findViewById(2131826640));
    this.pjY.getPaint().setFlags(16);
    this.pka = ((RelativeLayout)findViewById(2131826644));
    this.pir = ((HtmlTextView)findViewById(2131826645));
    this.pjZ = ((HtmlTextView)findViewById(2131826642));
    this.pjS = ((ListView)findViewById(2131826646));
    this.pjT = new a(this);
    this.pjS.setAdapter(this.pjT);
    this.pjS.setOnItemClickListener(new MallProductUI.3(this));
    this.pkd = ((Button)findViewById(2131826641));
    this.pkd.setOnClickListener(new MallProductUI.4(this));
    this.pkb = ((ListView)findViewById(2131826648));
    this.pkc = new k(this);
    this.pkc.pjw = new MallProductUI.5(this);
    this.pkb.setAdapter(this.pkc);
    this.gHn = ((Button)findViewById(2131826643));
    this.gHn.setOnClickListener(new MallProductUI.6(this));
    addIconOptionMenu(0, 2130839555, new MallProductUI.7(this));
    showOptionMenu(false);
    this.pjX.setFocusable(true);
    this.pjX.setFocusableInTouchMode(true);
    this.pjX.requestFocus();
    AppMethodBeat.o(44169);
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(44172);
    if ((paramString != null) && (paramString.equals(this.piK.pgW)))
      this.pjX.post(new MallProductUI.8(this, paramBitmap));
    AppMethodBeat.o(44172);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44166);
    super.onCreate(paramBundle);
    AM(8);
    boolean bool = getIntent().getBooleanExtra("key_go_finish", false);
    setResult(-1);
    if (bool)
    {
      finish();
      AppMethodBeat.o(44166);
    }
    while (true)
    {
      return;
      initView();
      com.tencent.mm.plugin.product.a.a.bZC();
      this.piK = com.tencent.mm.plugin.product.a.a.bZD();
      this.pjt = new f(this.mController.ylL, new MallProductUI.1(this));
      paramBundle = this.pjt;
      Object localObject = getIntent();
      m localm = new m();
      g.RS().a(new f.1(paramBundle, (Intent)localObject, localm));
      paramBundle.piI = true;
      localObject = new nd();
      ((nd)localObject).cJm.errCode = -1;
      ((nd)localObject).callback = new f.2(paramBundle, (nd)localObject);
      com.tencent.mm.sdk.b.a.xxA.a((com.tencent.mm.sdk.b.b)localObject, Looper.getMainLooper());
      AppMethodBeat.o(44166);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(44170);
    super.onNewIntent(paramIntent);
    ab.v("MicroMsg.MallProductUI", "onNewIntent");
    setIntent(paramIntent);
    AppMethodBeat.o(44170);
  }

  public void onPause()
  {
    AppMethodBeat.i(44168);
    this.pjt.onStop();
    super.onPause();
    AppMethodBeat.o(44168);
  }

  public void onResume()
  {
    AppMethodBeat.i(44167);
    super.onResume();
    this.pjt.onStart();
    AppMethodBeat.o(44167);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductUI
 * JD-Core Version:    0.6.2
 */