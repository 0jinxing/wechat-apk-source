package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.k;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;

public class MailImageDownloadUI extends MMActivity
  implements com.tencent.mm.ai.f, com.tencent.mm.ai.g
{
  private long cKK;
  private long cvx;
  private int fDC;
  private ak handler;
  private TextView kPu;
  private ProgressBar pyV;
  private TextView pyW;
  private TextView pyX;
  private TextView pyY;
  private RelativeLayout pyZ;
  private com.tencent.mm.at.e pza;
  private k pzb;
  private ImageView pzc;
  private LinearLayout pzd;
  private String username;

  public MailImageDownloadUI()
  {
    AppMethodBeat.i(68382);
    this.handler = new ak(Looper.getMainLooper());
    this.cvx = 0L;
    this.cKK = 0L;
    AppMethodBeat.o(68382);
  }

  private void Bv(int paramInt)
  {
    AppMethodBeat.i(68387);
    this.pyW.setText(getString(2131299966, new Object[] { Integer.valueOf(paramInt) }));
    if (paramInt < this.pyV.getMax())
      AppMethodBeat.o(68387);
    while (true)
    {
      return;
      com.tencent.mm.at.e locale = o.ahl().b(Long.valueOf(this.pzb.fEX));
      if (this.fDC == 1)
        com.tencent.mm.at.f.c(locale);
      finish();
      startActivity(getIntent());
      AppMethodBeat.o(68387);
    }
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(68388);
    ab.d("MicroMsg.MailImageDownloadUI", "offset " + paramInt1 + "totaolLen  " + paramInt2);
    if (paramm.getType() == 109)
      if (paramInt2 == 0)
        break label72;
    label72: for (paramInt1 = paramInt1 * 100 / paramInt2 - 1; ; paramInt1 = 0)
    {
      Bv(Math.max(0, paramInt1));
      AppMethodBeat.o(68388);
      return;
    }
  }

  public final int getLayoutId()
  {
    return 2130970017;
  }

  public final void initView()
  {
    AppMethodBeat.i(68386);
    this.pyW = ((TextView)findViewById(2131825712));
    this.pyX = ((TextView)findViewById(2131825712));
    this.kPu = ((TextView)findViewById(2131825713));
    this.pyY = ((TextView)findViewById(2131825714));
    this.pzc = ((ImageView)findViewById(2131825710));
    this.pyW.setVisibility(0);
    this.pzd = ((LinearLayout)findViewById(2131825711));
    this.pyZ = ((RelativeLayout)findViewById(2131825708));
    this.pyX.setVisibility(8);
    this.kPu.setVisibility(8);
    this.pyY.setVisibility(8);
    setTitleVisibility(8);
    setBackBtn(new MailImageDownloadUI.1(this));
    this.pyV = ((ProgressBar)findViewById(2131825709));
    AppMethodBeat.o(68386);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(68383);
    super.onCreate(paramBundle);
    this.cvx = getIntent().getLongExtra("img_msg_id", 0L);
    this.cKK = getIntent().getLongExtra("img_server_id", 0L);
    this.fDC = getIntent().getIntExtra("img_download_compress_type", 0);
    this.username = getIntent().getStringExtra("img_download_username");
    initView();
    if (this.cvx > 0L)
      this.pza = o.ahl().fJ(this.cvx);
    if (((this.pza == null) || (this.pza.fDy <= 0L)) && (this.cKK > 0L))
      this.pza = o.ahl().fI(this.cKK);
    if ((this.pza == null) || (this.pza.fDy <= 0L))
    {
      ab.e("MicroMsg.MailImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.cvx + ", or msgSvrId = " + this.cKK);
      AppMethodBeat.o(68383);
    }
    while (true)
    {
      return;
      if ((this.cvx <= 0L) && (this.cKK > 0L))
        this.cvx = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Q(this.username, this.cKK).field_msgId;
      String str = this.pza.fDz;
      paramBundle = o.ahl().q(str, null, null);
      if ((!bo.isNullOrNil(str)) && (com.tencent.mm.vfs.e.ct(paramBundle)))
      {
        ab.i("MicroMsg.MailImageDownloadUI", "has big image, bigImgPath = %s, hasHDImg = %b, fullPath = %s", new Object[] { str, Boolean.valueOf(this.pza.agQ()), paramBundle });
        if ((paramBundle == null) || (paramBundle.equals("")) || (!com.tencent.mm.vfs.e.ct(paramBundle)))
        {
          ab.d("MicroMsg.MailImageDownloadUI", "showImg : imgPath is null");
          AppMethodBeat.o(68383);
        }
        else
        {
          this.pzd.setVisibility(8);
          this.pyV.setVisibility(8);
          this.pzc.setVisibility(0);
          paramBundle = d.aml(paramBundle);
          this.pzc.setImageBitmap(paramBundle);
          this.pyZ.invalidate();
          AppMethodBeat.o(68383);
        }
      }
      else
      {
        this.pzb = new k(this.pza.fDy, this.cvx, this.fDC, this);
        com.tencent.mm.kernel.g.RO().eJo.a(this.pzb, 0);
        AppMethodBeat.o(68383);
      }
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(68384);
    super.onPause();
    com.tencent.mm.kernel.g.RO().eJo.b(109, this);
    AppMethodBeat.o(68384);
  }

  public void onResume()
  {
    AppMethodBeat.i(68385);
    super.onResume();
    com.tencent.mm.kernel.g.RO().eJo.a(109, this);
    AppMethodBeat.o(68385);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(68389);
    if (paramm.getType() != 109)
      AppMethodBeat.o(68389);
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Bv(this.pyV.getMax());
        AppMethodBeat.o(68389);
      }
      else
      {
        ab.e("MicroMsg.MailImageDownloadUI", "onSceneEnd : fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
        Toast.makeText(this, 2131300609, 1).show();
        AppMethodBeat.o(68389);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailImageDownloadUI
 * JD-Core Version:    0.6.2
 */