package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.bp;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.alj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.io.File;

public class SelfQRCodeUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private static final String PATH;
  private ProgressDialog ehJ = null;
  private Bitmap fru = null;
  private ImageView iqT = null;
  private TextView jPp = null;
  private long kFU;
  private ImageView qkD = null;
  private byte[] qkE = null;
  private TextView qlv = null;
  private boolean qlw = false;
  private SelfQRCodeUI.b qlx;
  private String userName = "";

  static
  {
    AppMethodBeat.i(127039);
    PATH = com.tencent.mm.compatible.util.h.getExternalStorageDirectory().toString() + "/Pictures/Screenshots/";
    AppMethodBeat.o(127039);
  }

  private void Ck(int paramInt)
  {
    AppMethodBeat.i(127031);
    if (this.qlw);
    for (int i = bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(66561, null)); ; i = 0)
    {
      Object localObject;
      if (t.mP(this.userName))
      {
        localObject = new com.tencent.mm.openim.b.g(this.userName);
        com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      }
      while (true)
      {
        AppCompatActivity localAppCompatActivity = this.mController.ylL;
        getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b(localAppCompatActivity, getString(2131302916), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            AppMethodBeat.i(127019);
            com.tencent.mm.kernel.g.Rg().c(this.crb);
            if ((t.mN(SelfQRCodeUI.c(SelfQRCodeUI.this))) || (com.tencent.mm.aj.f.rc(SelfQRCodeUI.c(SelfQRCodeUI.this))))
              SelfQRCodeUI.this.finish();
            AppMethodBeat.o(127019);
          }
        });
        AppMethodBeat.o(127031);
        return;
        localObject = new com.tencent.mm.bb.a(this.userName, i, paramInt);
        com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      }
    }
  }

  private void a(int paramInt1, int paramInt2, String paramString, SelfQRCodeUI.a parama)
  {
    AppMethodBeat.i(127033);
    if (com.tencent.mm.plugin.setting.b.gkF.b(this.mController.ylL, paramInt1, paramInt2, paramString))
      AppMethodBeat.o(127033);
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break;
      Toast.makeText(this, getString(2131299997, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      AppMethodBeat.o(127033);
    }
    this.qkE = parama.ciy();
    this.fru = d.bQ(this.qkE);
    if ((t.mN(this.userName)) || (com.tencent.mm.aj.f.rc(this.userName)))
    {
      enableOptionMenu(true);
      paramString = parama.ciz();
      if (!bo.isNullOrNil(paramString))
        ((TextView)findViewById(2131821050)).setText(paramString);
    }
    while (true)
    {
      this.qkD.setImageBitmap(this.fru);
      AppMethodBeat.o(127033);
      break;
      if (this.qlw)
      {
        parama = parama.ciA();
        TextView localTextView = (TextView)findViewById(2131827340);
        paramString = (View)localTextView.getParent();
        if (!bo.isNullOrNil(parama))
        {
          localTextView.setText(parama);
          paramString.setOnClickListener(new SelfQRCodeUI.3(this));
          paramString.setVisibility(0);
        }
        else
        {
          paramString.setVisibility(8);
        }
      }
    }
  }

  public static void cix()
  {
    AppMethodBeat.i(127034);
    com.tencent.mm.plugin.report.service.h.pYm.a(219L, 14L, 1L, true);
    AppMethodBeat.o(127034);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130970612;
  }

  public final void initView()
  {
    AppMethodBeat.i(127030);
    this.userName = getIntent().getStringExtra("from_userName");
    if (bo.isNullOrNil(this.userName))
      this.userName = r.Yz();
    if (r.Yz().equals(this.userName))
      this.qlw = true;
    Object localObject1;
    Object localObject2;
    if (t.mN(this.userName))
    {
      setMMTitle(2131303237);
      ((TextView)findViewById(2131821050)).setText("");
      enableOptionMenu(false);
      this.qkD = ((ImageView)findViewById(2131821047));
      this.iqT = ((ImageView)findViewById(2131821043));
      this.jPp = ((TextView)findViewById(2131821045));
      this.qlv = ((TextView)findViewById(2131821046));
      if ((!t.mN(this.userName)) && (!com.tencent.mm.aj.f.rc(this.userName)))
        break label439;
      Ck(1);
      a.b.b(this.iqT, this.userName);
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.userName);
      this.jPp.setSingleLine(false);
      this.jPp.setMaxLines(3);
      if (!t.mP(this.userName))
        break label413;
      localObject2 = getResources().getDrawable(2131231778);
      this.jPp.setCompoundDrawablesWithIntrinsicBounds(null, null, (Drawable)localObject2, null);
      label255: if (localObject1 == null)
        break label427;
      localObject1 = ((ap)localObject1).field_nickname;
      localObject2 = localObject1;
      if (bo.isNullOrNil((String)localObject1))
        localObject2 = ((c)com.tencent.mm.kernel.g.K(c.class)).XV().ob(this.userName).field_displayname;
      this.jPp.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject2, this.jPp.getTextSize()));
      label319: this.qlv.setVisibility(8);
    }
    while (true)
    {
      addIconOptionMenu(0, 2130839555, new SelfQRCodeUI.4(this));
      setBackBtn(new SelfQRCodeUI.5(this));
      AppMethodBeat.o(127030);
      return;
      if (com.tencent.mm.aj.f.rc(this.userName))
      {
        setMMTitle(2131299229);
        ((TextView)findViewById(2131821050)).setText(2131299230);
        enableOptionMenu(false);
        break;
      }
      setMMTitle(2131303225);
      break;
      label413: this.jPp.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      break label255;
      label427: this.jPp.setVisibility(8);
      break label319;
      label439: localObject1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(42, null);
      localObject2 = getString(2131296930);
      if (!bo.isNullOrNil((String)localObject1))
      {
        localObject2 = (String)localObject2 + (String)localObject1;
        label489: ab.d("MicroMsg.SelfQRCodeNewUI", "display user name = %s", new Object[] { localObject2 });
        if (this.fru != null)
          break label785;
        ab.d("MicroMsg.SelfQRCodeNewUI", "%s", new Object[] { "bitmap == null" });
        Ck(1);
      }
      while (true)
      {
        a.b.b(this.iqT, r.Yz());
        localObject2 = (String)com.tencent.mm.kernel.g.RP().Ry().get(4, null);
        ab.d("MicroMsg.SelfQRCodeNewUI", "nick name = %s", new Object[] { localObject2 });
        this.jPp.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject2, com.tencent.mm.bz.a.al(this.mController.ylL, 2131427762)));
        localObject1 = bp.aao();
        localObject2 = bo.nullAsNil(((bp)localObject1).getProvince());
        localObject1 = bo.nullAsNil(((bp)localObject1).getCity());
        localObject2 = s.mL((String)localObject2) + " " + (String)localObject1;
        ab.d("MicroMsg.SelfQRCodeNewUI", "display location = %s", new Object[] { localObject2 });
        this.qlv.setText((CharSequence)localObject2);
        switch (bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(12290, null), 0))
        {
        default:
          break;
        case 1:
          this.jPp.setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.bz.a.g(this, 2131231387), null);
          break;
          localObject1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(2, null);
          localObject2 = (String)localObject2 + (String)localObject1;
          ad.aoA((String)localObject1);
          break label489;
          label785: this.qkD.setImageBitmap(this.fru);
        case 2:
        }
      }
      this.jPp.setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.bz.a.g(this, 2131231386), null);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127027);
    super.onCreate(paramBundle);
    dyb();
    this.qlx = new SelfQRCodeUI.b(this, this);
    this.qlx.start();
    com.tencent.mm.kernel.g.Rg().a(168, this);
    com.tencent.mm.kernel.g.Rg().a(890, this);
    initView();
    this.qkD.post(new SelfQRCodeUI.1(this));
    AppMethodBeat.o(127027);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127028);
    com.tencent.mm.kernel.g.Rg().b(168, this);
    com.tencent.mm.kernel.g.Rg().b(890, this);
    if (this.qlx != null)
      this.qlx.stop();
    if ((this.fru != null) && (!this.fru.isRecycled()))
    {
      ab.i("MicroMsg.SelfQRCodeNewUI", "bitmap recycle %s", new Object[] { this.fru.toString() });
      this.fru.recycle();
    }
    super.onDestroy();
    AppMethodBeat.o(127028);
  }

  public void onResume()
  {
    AppMethodBeat.i(127029);
    super.onResume();
    if ((t.mN(this.userName)) || (com.tencent.mm.aj.f.rc(this.userName)))
      AppMethodBeat.o(127029);
    while (true)
    {
      return;
      View localView = findViewById(2131821048);
      this.kFU = r.YE();
      ab.d("MicroMsg.SelfQRCodeNewUI", (this.kFU & 0x2) + ",extstatus:" + this.kFU);
      if ((this.kFU & 0x2) != 0L)
      {
        localView.setVisibility(0);
        this.qkD.setAlpha(0.1F);
        findViewById(2131821049).setOnClickListener(new SelfQRCodeUI.6(this));
        AppMethodBeat.o(127029);
      }
      else
      {
        localView.setVisibility(8);
        this.qkD.setAlpha(1.0F);
        AppMethodBeat.o(127029);
      }
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(127032);
    ab.i("MicroMsg.SelfQRCodeNewUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if ((paramm instanceof com.tencent.mm.bb.a))
    {
      a(paramInt1, paramInt2, paramString, new SelfQRCodeUI.a()
      {
        public final String ciA()
        {
          return this.qlA.fMD;
        }

        public final byte[] ciy()
        {
          return this.qlA.fME;
        }

        public final String ciz()
        {
          return this.qlA.fMC;
        }
      });
      AppMethodBeat.o(127032);
    }
    while (true)
    {
      return;
      if ((paramm instanceof com.tencent.mm.openim.b.g))
      {
        paramm = (alj)((com.tencent.mm.ai.b)((com.tencent.mm.openim.b.g)paramm).ftl).fsH.fsP;
        a(paramInt1, paramInt2, paramString, new SelfQRCodeUI.2(this, paramm.wqK.wR, paramm.vBP));
      }
      AppMethodBeat.o(127032);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI
 * JD-Core Version:    0.6.2
 */