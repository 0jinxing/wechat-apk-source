package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.e;
import com.tencent.mm.plugin.location.ui.n;
import com.tencent.mm.plugin.location.ui.n.a;
import com.tencent.mm.plugin.location_soso.ViewManager;
import com.tencent.mm.pluginsdk.ui.tools.AppChooserUI;
import com.tencent.mm.pluginsdk.ui.tools.t;
import com.tencent.mm.protocal.protobuf.buf;
import com.tencent.mm.protocal.protobuf.bug;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;

public class i extends a
  implements f
{
  private boolean cHc;
  protected long cvx;
  public com.tencent.mm.remoteservice.d ext;
  private boolean hOy;
  private long nOa;
  private String nRo;
  n nRp;
  com.tencent.mm.ui.widget.a.d nRq;
  boolean nRr;
  private Runnable nRs;
  private b.a nRt;

  public i(Activity paramActivity)
  {
    super(paramActivity);
    AppMethodBeat.i(113746);
    this.cvx = -1L;
    this.nRo = "";
    this.cHc = true;
    this.ext = new com.tencent.mm.remoteservice.d(this.activity);
    this.nRr = false;
    this.nRt = new i.5(this);
    this.hOy = false;
    this.nOa = 0L;
    g.Rg().a(424, this);
    AppMethodBeat.o(113746);
  }

  protected final String aoy()
  {
    AppMethodBeat.i(113759);
    String str = getString(2131300986);
    AppMethodBeat.o(113759);
    return str;
  }

  public void bKA()
  {
  }

  protected void bKB()
  {
  }

  public void bKC()
  {
  }

  protected void bKD()
  {
  }

  final void bKH()
  {
    AppMethodBeat.i(113748);
    this.nRq = new com.tencent.mm.ui.widget.a.d(this.activity, 1, false);
    this.nRq.rBl = new i.1(this);
    this.nRq.rBm = new i.2(this);
    AppMethodBeat.o(113748);
  }

  protected final void bKI()
  {
    AppMethodBeat.i(113750);
    if (this.nRr)
    {
      t.a(new com.tencent.mm.pluginsdk.ui.tools.d());
      Intent localIntent = new Intent();
      localIntent.putExtra("show_bottom", false);
      localIntent.putExtra("jsapi_args_appid", "wx751a1acca5688ba3");
      localIntent.putExtra("rawUrl", this.nRo);
      localIntent.putExtra("title", 2131302738);
      localIntent.putExtra("webview_bg_color_rsID", 2131689761);
      com.tencent.mm.bp.d.b(this.activity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    }
    AppMethodBeat.o(113750);
  }

  protected final void bKJ()
  {
    AppMethodBeat.i(113755);
    ab.d("MicroMsg.ViewMapUI", "directlyFavorite lat %s, long %s, scale", new Object[] { Double.valueOf(this.nOJ.nJu), Double.valueOf(this.nOJ.nJv) });
    Intent localIntent = new Intent();
    localIntent.putExtra("kfavorite", true);
    localIntent.putExtra("kopenGmapNums", this.nOI.nLB);
    localIntent.putExtra("kopenOthersNums", this.nOI.nLC);
    localIntent.putExtra("kopenreportType", this.nOI.cKB);
    localIntent.putExtra("kRemark", bKk());
    localIntent.putExtra("kwebmap_slat", this.nOJ.nJu);
    localIntent.putExtra("kwebmap_lng", this.nOJ.nJv);
    localIntent.putExtra("Kwebmap_locaion", this.nOJ.nJx);
    localIntent.putExtra("kPoiName", this.eUu);
    this.activity.setResult(-1, localIntent);
    this.activity.getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", -1);
    this.activity.getIntent().getIntExtra("MMActivity.OverrideExitAnimation", -1);
    this.activity.finish();
    AppMethodBeat.o(113755);
  }

  protected final void bKK()
  {
    AppMethodBeat.i(113756);
    com.tencent.mm.plugin.report.service.h.pYm.e(12809, new Object[] { Integer.valueOf(3), "" });
    ab.d("MicroMsg.ViewMapUI", "locationLine, locationInfo.slat=%f, locationInfo.slong=%f, myLocation.slat=%f, myLocation.slong=%f", new Object[] { Double.valueOf(this.nOJ.nJu), Double.valueOf(this.nOJ.nJv), Double.valueOf(this.nOK.nJu), Double.valueOf(this.nOK.nJv) });
    if (this.nOK.bJo())
    {
      bKD();
      AppMethodBeat.o(113756);
    }
    while (true)
    {
      return;
      this.nOP = true;
      if (this.handler == null)
      {
        AppMethodBeat.o(113756);
      }
      else
      {
        if (this.nRs != null)
          this.handler.removeCallbacks(this.nRs);
        this.nRs = new i.6(this);
        this.handler.postDelayed(this.nRs, 10000L);
        Activity localActivity = this.activity;
        getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b(localActivity, getString(2131300411), true, new i.7(this));
        AppMethodBeat.o(113756);
      }
    }
  }

  protected void bKl()
  {
    AppMethodBeat.i(113754);
    Intent localIntent = new Intent();
    localIntent.putExtra("kopenGmapNums", this.nOI.nLB);
    localIntent.putExtra("kopenOthersNums", this.nOI.nLC);
    localIntent.putExtra("kopenreportType", this.nOI.cKB);
    localIntent.putExtra("kRemark", bKk());
    localIntent.putExtra("soso_street_view_url", this.nRo);
    this.activity.setResult(-1, localIntent);
    AppMethodBeat.o(113754);
  }

  void bKm()
  {
    AppMethodBeat.i(113749);
    this.nOL.nPb.setEnabled(true);
    this.nOL.nOX.setVisibility(8);
    b(this.nOJ);
    this.nOL.nLY.getIController().setZoom(this.nJw);
    this.nOL.nOZ.setEnabled(true);
    this.cHc = this.activity.getIntent().getBooleanExtra("kShowshare", true);
    label150: Object localObject1;
    Object localObject2;
    if (this.cHc)
    {
      this.nOL.nOZ.setVisibility(0);
      this.nRo = this.activity.getIntent().getStringExtra("soso_street_view_url");
      if ((bo.isNullOrNil(this.nRo)) || ((!aa.dop()) && (!aa.doo())))
        break label599;
      this.nRr = true;
      this.nOL.nOZ.setOnClickListener(new i.3(this));
      this.nRp = new n(this.nOL.nLY, this.activity);
      localObject1 = this.nRp;
      if (((n)localObject1).mViewManager != null)
      {
        ((n)localObject1).mViewManager.addView(((n)localObject1).nOz, 0.0D, 0.0D);
        ((n)localObject1).mViewManager.setMarkerTag(((n)localObject1).nOz, "info_window_tag");
        if (((n)localObject1).nOC)
        {
          ((n)localObject1).mViewManager.setInfoWindowAdapter(new n.a((n)localObject1, (byte)0));
          ((n)localObject1).mViewManager.showInfoWindowByView(((n)localObject1).nOz);
        }
      }
      localObject1 = this.nRp;
      localObject2 = this.nOJ;
      ((n)localObject1).nJu = ((LocationInfo)localObject2).nJu;
      ((n)localObject1).nJv = ((LocationInfo)localObject2).nJv;
      if (!e.j(this.nOJ.nJu, this.nOJ.nJv))
      {
        ab.d("MicroMsg.ViewMapUI", "isValidLatLng %f %f", new Object[] { Double.valueOf(this.nOJ.nJu), Double.valueOf(this.nOJ.nJv) });
        localObject1 = this.nRp;
        ((n)localObject1).nLW = false;
        ((n)localObject1).nOA.setVisibility(8);
      }
      if (2 == this.type)
      {
        ab.i("MicroMsg.ViewMapUI", "location id %s", new Object[] { this.nOJ.nJt });
        if (this.activity.getIntent().getBooleanExtra("kFavCanRemark", true))
          bKj();
        if (!bo.isNullOrNil(this.nOJ.nJx))
          this.nOL.nOY.setVisibility(0);
      }
      this.nON.put(this.nOJ.nJt, this.nRp);
      if (!this.nOJ.bJp())
        break label701;
      if ((this.eUu != null) && (!this.eUu.equals("")))
        this.nRp.eUu = this.eUu;
      this.nRp.setText(this.nRp.getPreText() + this.nOJ.nJx);
    }
    while (true)
    {
      while (true)
      {
        localObject2 = this.nRp;
        localObject1 = new i.4(this);
        if ((((n)localObject2).nOC) && (((n)localObject2).mViewManager != null))
          ((n)localObject2).mViewManager.setMarkerClick(((n)localObject2).nOz, (View.OnClickListener)localObject1);
        AppMethodBeat.o(113749);
        return;
        this.nOL.nOZ.setVisibility(8);
        break;
        label599: if ((!aa.dop()) && (!aa.doo()))
          break label150;
        this.nRr = false;
        try
        {
          localObject1 = new com/tencent/mm/modelsimple/u;
          ((u)localObject1).<init>((float)this.nOJ.nJv, (float)this.nOJ.nJu, this.cvx);
          buf localbuf = (buf)((u)localObject1).ehh.fsG.fsP;
          new u(localbuf);
          localObject1 = g.Rg();
          localObject2 = new com/tencent/mm/modelsimple/u;
          ((u)localObject2).<init>(localbuf);
          ((p)localObject1).a((m)localObject2, 0);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.ViewMapUI", localException.toString());
        }
      }
      break label150;
      label701: if (e.j(this.nOJ.nJu, this.nOJ.nJv))
        this.nOO.a(this.nOJ.nJu, this.nOJ.nJv, this.nOV, this.nOJ.nJt);
    }
  }

  public boolean bKn()
  {
    AppMethodBeat.i(113747);
    if ((this.nRq != null) && (this.nRq.isShowing()))
      this.nRq.cpE();
    while (true)
    {
      AppMethodBeat.o(113747);
      return true;
      bKH();
      this.nRq.cpD();
    }
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(113760);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 2:
    case 0:
    case 1:
    }
    while (true)
    {
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(113760);
      return bool;
      if ((Math.abs(paramMotionEvent.getX() - this.neG) > 10.0F) || (Math.abs(paramMotionEvent.getY() - this.neH) > 10.0F))
      {
        this.hOy = true;
        bKA();
        continue;
        this.neG = paramMotionEvent.getX();
        this.neH = paramMotionEvent.getY();
        this.nOa = System.currentTimeMillis();
        this.hOy = false;
        bKC();
        continue;
        if (!this.hOy)
          System.currentTimeMillis();
      }
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(113757);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
    case 4098:
    case 4099:
    }
    while (true)
    {
      AppMethodBeat.o(113757);
      com.tencent.mm.plugin.location.ui.d locald;
      Object localObject1;
      Object localObject2;
      while (true)
      {
        return;
        locald = this.nOI;
        switch (paramInt1)
        {
        default:
          break;
        case 4098:
          if ((-1 != paramInt2) || (paramIntent == null))
            break label155;
          localObject1 = paramIntent.getStringExtra("selectpkg");
          localObject2 = paramIntent.getBundleExtra("transferback");
          boolean bool = paramIntent.getBooleanExtra("isalways", false);
          paramIntent = ((Bundle)localObject2).getParcelableArrayList("locations");
          locald.a((LocationInfo)paramIntent.get(0), (LocationInfo)paramIntent.get(1), (String)localObject1, bool);
          AppMethodBeat.o(113757);
        case 4099:
        }
      }
      label155: if (4097 == paramInt2)
      {
        if (paramIntent.getBooleanExtra("isalways", false))
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(11091, new Object[] { Integer.valueOf(6), Integer.valueOf(2) });
          label201: paramIntent = paramIntent.getBundleExtra("transferback").getParcelableArrayList("locations");
          localObject1 = (LocationInfo)paramIntent.get(0);
          localObject2 = (LocationInfo)paramIntent.get(1);
          if (!bo.isNullOrNil(((LocationInfo)localObject1).nJy))
            break label486;
        }
        label486: for (paramIntent = "zh-cn"; ; paramIntent = ((LocationInfo)localObject1).nJy)
        {
          localObject1 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://maps.google.com/maps?f=d&saddr=%f,%f&daddr=%f,%f&hl=".concat(String.valueOf(paramIntent)), new Object[] { Double.valueOf(((LocationInfo)localObject2).nJu), Double.valueOf(((LocationInfo)localObject2).nJv), Double.valueOf(((LocationInfo)localObject1).nJu), Double.valueOf(((LocationInfo)localObject1).nJv) })));
          paramIntent = new Bundle();
          paramIntent.putParcelable("targetintent", (Parcelable)localObject1);
          localObject2 = new Intent();
          ((Intent)localObject2).setClass(locald.context, AppChooserUI.class);
          ((Intent)localObject2).putExtra("type", 1);
          ((Intent)localObject2).putExtra("title", locald.context.getResources().getString(2131300976));
          ((Intent)localObject2).putExtra("targetintent", (Parcelable)localObject1);
          ((Intent)localObject2).putExtra("transferback", paramIntent);
          ((Intent)localObject2).putExtra("scene", 6);
          ((Activity)locald.context).startActivityForResult((Intent)localObject2, 4099);
          AppMethodBeat.o(113757);
          break;
          com.tencent.mm.plugin.report.service.h.pYm.e(11091, new Object[] { Integer.valueOf(6), Integer.valueOf(1) });
          break label201;
        }
        if ((-1 == paramInt2) && (paramIntent != null))
        {
          localObject1 = paramIntent.getStringExtra("selectpkg");
          paramIntent = new Intent((Intent)paramIntent.getBundleExtra("transferback").getParcelable("targetintent"));
          paramIntent.setPackage((String)localObject1);
          paramIntent.addFlags(524288);
          locald.context.startActivity(paramIntent);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(113753);
    super.onCreate(paramBundle);
    double d1 = this.activity.getIntent().getDoubleExtra("kwebmap_slat", 0.0D);
    double d2 = this.activity.getIntent().getDoubleExtra("kwebmap_lng", 0.0D);
    ab.i("MicroMsg.ViewMapUI", "start dslat " + d1 + " " + d2);
    this.nJw = this.activity.getIntent().getIntExtra("kwebmap_scale", 15);
    if (this.nJw <= 0)
      this.nJw = 15;
    this.eUu = this.activity.getIntent().getStringExtra("kPoiName");
    paramBundle = this.activity.getIntent().getStringExtra("Kwebmap_locaion");
    ab.d("MicroMsg.ViewMapUI", "view " + d1 + " " + d2);
    LocationInfo localLocationInfo = this.nOJ;
    localLocationInfo.nJu = d1;
    localLocationInfo.nJv = d2;
    localLocationInfo.nJx = paramBundle;
    localLocationInfo.nJw = this.nJw;
    localLocationInfo.cIK = this.eUu;
    this.cvx = this.activity.getIntent().getLongExtra("kMsgId", -1L);
    this.nKN = this.activity.getIntent().getStringExtra("map_talker_name");
    initView();
    AppMethodBeat.o(113753);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(113758);
    this.ext.release();
    this.handler.removeCallbacks(this.nRs);
    this.handler = null;
    g.Rg().b(424, this);
    super.onDestroy();
    AppMethodBeat.o(113758);
  }

  public void onPause()
  {
    AppMethodBeat.i(113752);
    ab.d("MicroMsg.ViewMapUI", "onbaseGeoResume");
    if (this.nOU != null)
      this.nOU.c(this.nRt);
    super.onPause();
    AppMethodBeat.o(113752);
  }

  public void onResume()
  {
    AppMethodBeat.i(113751);
    super.onResume();
    ab.d("MicroMsg.ViewMapUI", "onbaseGeoResume");
    if (this.nOU != null)
      this.nOU.b(this.nRt, true);
    AppMethodBeat.o(113751);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(113761);
    ab.d("MicroMsg.ViewMapUI", "onScene end %d %d %d", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramm.getType() == 424)
    {
      if ((paramInt2 != 0) || (paramInt1 != 0))
        break label187;
      paramString = u.tu(((u)paramm).ajC().vOt);
      ab.d("MicroMsg.ViewMapUI", "getUrl success! url is %s", new Object[] { paramString });
      this.nRo = paramString;
      if (!bo.isNullOrNil(paramString))
        this.nRr = true;
      if ((this.type == 9) && (!bo.isNullOrNil(paramString)))
      {
        paramString = (TextView)findViewById(2131824675);
        paramString.setVisibility(0);
        paramString.setOnClickListener(new i.8(this));
      }
      AppMethodBeat.o(113761);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.ViewMapUI", "msg failed.errtype:%d, errcode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      label187: AppMethodBeat.o(113761);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.i
 * JD-Core Version:    0.6.2
 */