package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.ui.NewMyLocationButton;
import com.tencent.mm.plugin.location.ui.f;
import com.tencent.mm.plugin.location.ui.l;
import com.tencent.mm.plugin.location.ui.l.a;
import com.tencent.mm.plugin.location.ui.m;
import com.tencent.mm.plugin.location.ui.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.a.d;
import java.util.ArrayList;
import java.util.Map;

public final class h extends i
{
  m nQG;
  private l nQI;
  private NewMyLocationButton nQU;
  private f nQV;
  View nQW;
  private d nQX;
  Map<String, String> nQY;
  int nQZ;
  View nRa;

  public h(Activity paramActivity)
  {
    super(paramActivity);
  }

  public final void bKA()
  {
    AppMethodBeat.i(113713);
    super.bKA();
    AppMethodBeat.o(113713);
  }

  public final void bKC()
  {
    AppMethodBeat.i(113714);
    super.bKC();
    ab.i("MicroMsg.TrackMapUI", "onDown");
    AppMethodBeat.o(113714);
  }

  protected final void bKD()
  {
    AppMethodBeat.i(113715);
    this.nQX = new d(this.activity, 1, false);
    this.nQX.rBl = new h.8(this);
    this.nQX.rBm = new h.9(this);
    this.nQX.cpD();
    AppMethodBeat.o(113715);
  }

  final void bKm()
  {
    AppMethodBeat.i(113711);
    super.bKm();
    ((TextView)findViewById(2131825948)).setText(2131300975);
    findViewById(2131825950).setVisibility(8);
    Object localObject = (ViewStub)findViewById(2131824672);
    ((ViewStub)localObject).setOnInflateListener(new h.1(this));
    this.nQW = ((ViewStub)localObject).inflate();
    findViewById(2131824674).setVisibility(8);
    this.activity.getWindow().getDecorView().post(new h.2(this));
    this.nQG = new m(this.activity, this.nOL.nLY, false);
    this.nQG.nNX = false;
    this.nQG.nNY = false;
    localObject = this.nQG;
    ((m)localObject).nNV = true;
    if (((m)localObject).nNO != null)
    {
      ((m)localObject).nNO.setOnAvatarOnClickListener(null);
      ((m)localObject).nNO.setOnLocationOnClickListener(null);
      ((m)localObject).nNO.bKE();
    }
    this.nQG.nNS = false;
    this.nQI = new l(this.activity, new l.a()
    {
      public final void bKd()
      {
      }

      public final void bKe()
      {
      }

      public final void xD(int paramAnonymousInt)
      {
      }
    });
    findViewById(2131824677).setVisibility(8);
    this.nOL.lnh.setOnClickListener(new h.5(this));
    this.nQU = ((NewMyLocationButton)this.nQW.findViewById(2131826349));
    this.nQU.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(113699);
        h.this.nQG.a(h.this.nOL.nLY);
        AppMethodBeat.o(113699);
      }
    });
    localObject = this.activity.getIntent().getStringExtra("kPoi_url");
    if (bo.isNullOrNil((String)localObject))
      this.nOL.nHi.setVisibility(8);
    while (true)
    {
      this.nRp.nOz.setImageResource(2130839178);
      this.nQV = new f(this.nOL.nLY, this.activity);
      if (this.nOJ.bJp())
      {
        if ((this.eUu != null) && (!this.eUu.equals("")))
          this.nQV.eUu = this.eUu;
        this.nQV.setText(this.nRp.getPreText() + this.nOJ.nJx);
      }
      localObject = new h.3(this);
      f localf = this.nQV;
      localf.nMb.setOnClickListener((View.OnClickListener)localObject);
      localf.nMb.setVisibility(0);
      this.nRa = findViewById(2131824681);
      AppMethodBeat.o(113711);
      return;
      this.nOL.nHi.setVisibility(0);
      this.nOL.nHi.setOnClickListener(new h.7(this, (String)localObject));
    }
  }

  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(113712);
    if (paramKeyEvent.getKeyCode() == 4)
      paramKeyEvent.getAction();
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    AppMethodBeat.o(113712);
    return bool;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(113710);
    super.onCreate(paramBundle);
    this.nQZ = ((Integer)g.RP().Ry().get(ac.a.xRD, Integer.valueOf(0))).intValue();
    ab.i("MicroMsg.TrackMapUI", "count: %s", new Object[] { Integer.valueOf(this.nQZ) });
    this.nOJ.nJB = this.activity.getIntent().getStringExtra("kPoiid");
    xE(ah.getResources().getColor(2131690310));
    AppMethodBeat.o(113710);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(113716);
    super.onDestroy();
    if (this.nQG != null)
      this.nQG.destroy();
    AppMethodBeat.o(113716);
  }

  public final void onPause()
  {
    AppMethodBeat.i(113718);
    super.onPause();
    if (this.nQG != null)
      this.nQG.onPause();
    AppMethodBeat.o(113718);
  }

  public final void onResume()
  {
    AppMethodBeat.i(113717);
    super.onResume();
    if (this.nQG != null)
      this.nQG.onResume();
    gh localgh;
    if (this.type == 2)
    {
      localgh = new gh();
      localgh.cAH.cvv = this.activity.getIntent().getLongExtra("kFavInfoLocalId", -1L);
      localgh.cAH.type = 4;
      com.tencent.mm.sdk.b.a.xxA.m(localgh);
      if (localgh.cAI.bka != null)
      {
        if (this.nOQ != null)
          break label133;
        this.nOQ = new ArrayList();
      }
    }
    while (true)
    {
      this.nOQ.addAll(localgh.cAI.bka);
      bKi();
      AppMethodBeat.o(113717);
      return;
      label133: this.nOQ.clear();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.h
 * JD-Core Version:    0.6.2
 */