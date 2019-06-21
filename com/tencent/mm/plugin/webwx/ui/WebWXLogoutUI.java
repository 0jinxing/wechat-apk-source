package com.tencent.mm.plugin.webwx.ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.sk;
import com.tencent.mm.model.as;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsimple.l;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.webwx.a.b;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class WebWXLogoutUI extends MMActivity
  implements com.tencent.mm.ai.f, as
{
  private boolean jZK;
  private com.tencent.mm.sdk.b.c qLL;
  private ProgressDialog qlZ;
  private ImageView uLA;
  private int uLB;
  private int uLC;
  private int uLD;
  private Animator uLE;
  private int uLF;
  private boolean uLr;
  private boolean uLx;
  private ImageButton uLy;
  private ImageButton uLz;

  public WebWXLogoutUI()
  {
    AppMethodBeat.i(26549);
    this.qlZ = null;
    this.uLr = false;
    this.qLL = new com.tencent.mm.sdk.b.c()
    {
    };
    AppMethodBeat.o(26549);
  }

  private void aMk()
  {
    AppMethodBeat.i(26555);
    if (!bo.isNullOrNil(l.fOP))
    {
      ((TextView)findViewById(2131829189)).setText(l.fOP);
      if (l.ajf() == 1)
      {
        if (this.uLx)
          break label413;
        this.uLA.setImageResource(2131231154);
        this.uLA.setPadding(this.uLC - this.uLB, this.uLD, 0, 0);
        AppMethodBeat.o(26555);
      }
    }
    while (true)
    {
      return;
      if (l.ajf() == 2)
      {
        if (this.uLx)
          ((TextView)findViewById(2131829190)).setText(2131305616);
        while (true)
        {
          if (!this.jZK)
            break label257;
          ((TextView)findViewById(2131829189)).setText(getString(2131305600, new Object[] { "Mac" }));
          this.uLA.setImageResource(2131231148);
          this.uLA.setPadding(0, this.uLD, 0, 0);
          if ((!com.tencent.mm.m.f.MC()) || (this.uLx))
            break label436;
          ((TextView)findViewById(2131829190)).setText(2131305596);
          this.uLA.setImageResource(2131231150);
          this.uLA.setPadding(this.uLC - this.uLB, this.uLD, 0, 0);
          AppMethodBeat.o(26555);
          break;
          if (!com.tencent.mm.m.f.MC())
            ((TextView)findViewById(2131829190)).setText("");
        }
        label257: ((TextView)findViewById(2131829189)).setText(getString(2131305603, new Object[] { "Mac" }));
        this.uLA.setImageResource(2131231147);
        this.uLA.setPadding(0, this.uLD, 0, 0);
        if ((com.tencent.mm.m.f.MC()) && (!this.uLx))
        {
          ((TextView)findViewById(2131829190)).setText(2131305596);
          this.uLA.setImageResource(2131231149);
          this.uLA.setPadding(this.uLC - this.uLB, this.uLD, 0, 0);
          AppMethodBeat.o(26555);
        }
      }
      else if (l.ajf() == 3)
      {
        this.uLA.setImageResource(2131231146);
        this.uLA.setPadding(0, this.uLD, 0, 0);
        AppMethodBeat.o(26555);
      }
      else
      {
        label413: this.uLA.setImageResource(2131231152);
        this.uLA.setPadding(0, this.uLD, 0, 0);
        label436: AppMethodBeat.o(26555);
      }
    }
  }

  private boolean ddi()
  {
    AppMethodBeat.i(26558);
    boolean bool;
    if (!aw.RK())
    {
      bool = false;
      AppMethodBeat.o(26558);
      return bool;
    }
    int i = r.YF();
    if (this.uLx)
      i |= 8192;
    while (true)
    {
      com.tencent.mm.m.f.iZ(i);
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(40, Integer.valueOf(i));
      this.uLr = true;
      aMk();
      AppMethodBeat.o(26558);
      bool = true;
      break;
      i &= -8193;
    }
  }

  private void og(boolean paramBoolean)
  {
    AppMethodBeat.i(26556);
    if (this.uLy != null)
      if (paramBoolean)
      {
        this.uLy.setImageResource(2130840784);
        ((TextView)findViewById(2131829197)).setText(2131305617);
        AppMethodBeat.o(26556);
      }
    while (true)
    {
      return;
      this.uLy.setImageResource(2130840782);
      ((TextView)findViewById(2131829197)).setText(2131305599);
      AppMethodBeat.o(26556);
    }
  }

  private void oh(boolean paramBoolean)
  {
    AppMethodBeat.i(26557);
    if (this.uLz != null)
      if (paramBoolean)
      {
        this.uLz.setImageResource(2130840780);
        AppMethodBeat.o(26557);
      }
    while (true)
    {
      return;
      this.uLz.setImageResource(2130840783);
      AppMethodBeat.o(26557);
    }
  }

  public final void ZB()
  {
    AppMethodBeat.i(26560);
    aw.ZK();
    if (!com.tencent.mm.model.c.XI())
    {
      finish();
      AppMethodBeat.o(26560);
    }
    while (true)
    {
      return;
      if ((l.ajh()) && (!this.jZK))
      {
        ab.d("MicroMsg.WebWXLogoutUI", "extDevice remote lock");
        this.jZK = true;
        og(this.jZK);
        aMk();
      }
      AppMethodBeat.o(26560);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(26550);
    super.finish();
    overridePendingTransition(2131034130, 2131034227);
    AppMethodBeat.o(26550);
  }

  public final int getLayoutId()
  {
    return 2130971221;
  }

  public final void initView()
  {
    AppMethodBeat.i(26554);
    setMMTitle("");
    setBackBtn(new WebWXLogoutUI.1(this), 2131230735);
    dyb();
    Object localObject;
    label202: label255: Drawable localDrawable;
    if (!com.tencent.mm.m.f.MC())
    {
      findViewById(2131829191).setVisibility(8);
      this.uLx = false;
      this.uLA = ((ImageView)findViewById(2131823276));
      ab.d("MicroMsg.WebWXLogoutUI", "need hide lock bt ?: " + l.ajj());
      if (l.ajj())
        break label421;
      localObject = AnimatorInflater.loadAnimator(this, 2131099650);
      ((Animator)localObject).setTarget(findViewById(2131829196));
      this.uLE = AnimatorInflater.loadAnimator(this, 2131099651);
      this.uLE.setTarget(findViewById(2131829196));
      this.uLE.addListener(new WebWXLogoutUI.3(this));
      this.jZK = l.ajh();
      this.uLy = ((ImageButton)findViewById(2131829195));
      og(this.jZK);
      this.uLy.setOnClickListener(new WebWXLogoutUI.4(this, (Animator)localObject));
      localObject = (ImageButton)findViewById(2131829198);
      ab.d("MicroMsg.WebWXLogoutUI", "need hide file bt ?: " + l.ajk());
      if (l.ajk())
        break label436;
      ((ImageButton)localObject).setOnClickListener(new WebWXLogoutUI.5(this));
      localObject = (Button)findViewById(2131829199);
      ((Button)localObject).setText(l.fOX);
      ((Button)localObject).setOnClickListener(new WebWXLogoutUI.6(this));
      if (l.ajf() != 1)
        break label445;
      localDrawable = getResources().getDrawable(2131231152);
      localObject = getResources().getDrawable(2131231154);
      if ((localDrawable != null) && (localObject != null))
      {
        this.uLB = localDrawable.getIntrinsicWidth();
        this.uLC = ((Drawable)localObject).getIntrinsicWidth();
      }
    }
    while (true)
    {
      this.uLA.post(new WebWXLogoutUI.7(this));
      AppMethodBeat.o(26554);
      return;
      this.uLz = ((ImageButton)findViewById(2131829192));
      if (r.ku(r.YF()));
      for (this.uLx = true; ; this.uLx = false)
      {
        oh(this.uLx);
        this.uLz.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(26539);
            paramAnonymousView = WebWXLogoutUI.this;
            if (!WebWXLogoutUI.a(WebWXLogoutUI.this));
            for (boolean bool = true; ; bool = false)
            {
              WebWXLogoutUI.a(paramAnonymousView, bool);
              WebWXLogoutUI.b(WebWXLogoutUI.this, WebWXLogoutUI.a(WebWXLogoutUI.this));
              WebWXLogoutUI.b(WebWXLogoutUI.this);
              AppMethodBeat.o(26539);
              return;
            }
          }
        });
        break;
      }
      label421: findViewById(2131829194).setVisibility(8);
      break label202;
      label436: ((ImageButton)localObject).setVisibility(8);
      break label255;
      label445: if (l.ajf() == 2)
      {
        localDrawable = getResources().getDrawable(2131231147);
        localObject = getResources().getDrawable(2131231149);
        if ((localDrawable != null) && (localObject != null))
        {
          this.uLB = localDrawable.getIntrinsicWidth();
          this.uLC = ((Drawable)localObject).getIntrinsicWidth();
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26551);
    super.onCreate(paramBundle);
    if (getIntent() != null)
      this.uLF = getIntent().getIntExtra("intent.key.online_version", 0);
    initView();
    overridePendingTransition(2131034229, 2131034130);
    aw.Rg().a(281, this);
    aw.Rg().a(792, this);
    aw.ZK();
    com.tencent.mm.model.c.a(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.qLL);
    AppMethodBeat.o(26551);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(26553);
    super.onDestroy();
    overridePendingTransition(2131034130, 2131034227);
    aw.Rg().b(281, this);
    aw.Rg().b(792, this);
    aw.ZK();
    com.tencent.mm.model.c.b(this);
    com.tencent.mm.sdk.b.a.xxA.d(this.qLL);
    AppMethodBeat.o(26553);
  }

  public void onPause()
  {
    AppMethodBeat.i(26552);
    super.onPause();
    act localact;
    if ((this.uLr) && (aw.RK()))
    {
      localact = new act();
      localact.wkw = 27;
      if (!r.ku(r.YF()))
        break label87;
    }
    label87: for (int i = 1; ; i = 2)
    {
      localact.pvD = i;
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new j.a(23, localact));
      this.uLr = false;
      AppMethodBeat.o(26552);
      return;
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(26559);
    if (this.qlZ != null)
    {
      this.qlZ.dismiss();
      this.qlZ = null;
    }
    if (paramm.getType() == 281)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        Toast.makeText(this, 2131305614, 1).show();
      finish();
      AppMethodBeat.o(26559);
    }
    int i;
    while (true)
    {
      return;
      if (paramm.getType() != 792)
        break label208;
      i = ((b)paramm).czE;
      if (this.uLE != null)
        this.uLE.start();
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break;
      if (i == 1)
      {
        Toast.makeText(this, 2131305601, 0).show();
        AppMethodBeat.o(26559);
      }
      else
      {
        Toast.makeText(this, 2131305618, 0).show();
        AppMethodBeat.o(26559);
      }
    }
    boolean bool;
    if (i == 1)
    {
      bool = true;
      label164: this.jZK = bool;
      l.cR(this.jZK);
      aMk();
      if (!this.jZK)
        break label223;
    }
    label208: label223: for (paramString = "lock"; ; paramString = "unlock")
    {
      ab.d("MicroMsg.WebWXLogoutUI", "%s extDevice success", new Object[] { paramString });
      AppMethodBeat.o(26559);
      break;
      bool = false;
      break label164;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWXLogoutUI
 * JD-Core Version:    0.6.2
 */