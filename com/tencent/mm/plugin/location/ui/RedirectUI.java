package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mu;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.g.a.ta;
import com.tencent.mm.kernel.e;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.plugin.location.ui.impl.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.location.LocationIntent;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(23)
public class RedirectUI extends Activity
{
  private static long ecD = 86400000L;
  private boolean cFy;
  private long cvx;
  private final ak handler;
  private String info;
  private int klY;
  private double nJu;
  private double nJv;
  private int nJw;
  private boolean nLD;
  private String nMk;
  private String nMl;
  private int nMm;
  private final int nMn;
  private boolean nMo;
  private final int nMp;
  private final int nMq;
  private final int nMr;
  private final int nMs;
  private int type;

  public RedirectUI()
  {
    AppMethodBeat.i(113474);
    this.type = 0;
    this.cFy = false;
    this.nLD = true;
    this.nJu = 0.0D;
    this.nJv = 0.0D;
    this.nMk = "";
    this.nMl = "";
    this.nJw = 0;
    this.info = "";
    this.handler = new ak();
    this.nMn = 1;
    this.nMo = false;
    this.nMp = 0;
    this.nMq = 1;
    this.nMr = 0;
    this.nMs = 1;
    AppMethodBeat.o(113474);
  }

  private void a(Intent paramIntent, double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(113478);
    if (paramIntent != null)
    {
      paramIntent.putExtra("kShowshare", getIntent().getBooleanExtra("kShowshare", true));
      paramIntent.putExtra("kimg_path", com.tencent.mm.plugin.i.c.XW());
      paramIntent.putExtra("kPoi_url", bo.bc(getIntent().getStringExtra("kPoi_url"), ""));
      paramIntent.putExtra("map_view_type", getIntent().getIntExtra("map_view_type", 0));
      paramIntent.putExtra("kFavInfoLocalId", getIntent().getLongExtra("kFavInfoLocalId", -1L));
      paramIntent.putExtra("kFavCanDel", getIntent().getBooleanExtra("kFavCanDel", true));
      paramIntent.putExtra("kFavCanRemark", getIntent().getBooleanExtra("kFavCanRemark", true));
      paramIntent.putExtra("kwebmap_slat", paramDouble1);
      paramIntent.putExtra("kwebmap_lng", paramDouble2);
      paramIntent.putExtra("kPoiid", getIntent().getStringExtra("kPoiid"));
      paramIntent.putExtra("kPoiName", getIntent().getStringExtra("kPoiName"));
      paramIntent.putExtra("kisUsername", bo.bc(getIntent().getStringExtra("kisUsername"), ""));
      paramIntent.putExtra("map_talker_name", this.nMl);
      paramIntent.putExtra("kIs_pick_poi", getIntent().getBooleanExtra("kIs_pick_poi", false));
      paramIntent.putExtra("KFavLocSigleView", getIntent().getBooleanExtra("KFavLocSigleView", false));
      ta localta = new ta();
      localta.cPk.cPl = true;
      com.tencent.mm.sdk.b.a.xxA.m(localta);
      if (this.type == 6)
      {
        paramIntent.putExtra("kMsgId", getIntent().getLongExtra("kMsgId", -1L));
        paramIntent.putExtra("kRemark", getIntent().getStringExtra("kRemark"));
        if (this.nJw > 0)
          paramIntent.putExtra("kwebmap_scale", this.nJw);
        paramIntent.putExtra("Kwebmap_locaion", this.info);
        paramIntent.putExtra("soso_street_view_url", getIntent().getStringExtra("soso_street_view_url"));
        startActivityForResult(paramIntent, 3);
        AppMethodBeat.o(113478);
      }
    }
    while (true)
    {
      return;
      if ((this.type == 1) || (this.type == 2) || (this.type == 7) || (this.type == 9))
      {
        paramIntent.putExtra("kMsgId", getIntent().getLongExtra("kMsgId", -1L));
        paramIntent.putExtra("kRemark", getIntent().getStringExtra("kRemark"));
        paramIntent.putExtra("kTags", getIntent().getStringArrayListExtra("kTags"));
        if (this.nJw > 0)
          paramIntent.putExtra("kwebmap_scale", this.nJw);
        paramIntent.putExtra("Kwebmap_locaion", this.info);
        paramIntent.putExtra("soso_street_view_url", getIntent().getStringExtra("soso_street_view_url"));
        startActivityForResult(paramIntent, 3);
        AppMethodBeat.o(113478);
      }
      else if (this.type == 0)
      {
        startActivityForResult(paramIntent, 2);
        AppMethodBeat.o(113478);
      }
      else if (this.type == 3)
      {
        startActivityForResult(paramIntent, 5);
        AppMethodBeat.o(113478);
      }
      else
      {
        if (this.type == 8)
          startActivityForResult(paramIntent, 6);
        AppMethodBeat.o(113478);
        continue;
        finish();
        AppMethodBeat.o(113478);
      }
    }
  }

  private Intent bJP()
  {
    AppMethodBeat.i(113477);
    Intent localIntent1 = d.P(this);
    Intent localIntent2;
    switch (this.type)
    {
    case 4:
    case 5:
    default:
      ab.d("MicroMsg.RedirectUI", "view type error");
      localIntent2 = null;
    case 6:
    case 1:
    case 2:
    case 7:
    case 9:
    case 0:
    case 3:
    case 8:
    }
    while (true)
    {
      AppMethodBeat.o(113477);
      return localIntent2;
      String str = getIntent().getStringExtra("fromWhereShare");
      ab.d("MicroMsg.RedirectUI", "location resume");
      localIntent1.putExtra("intent_map_key", 5);
      localIntent2 = localIntent1;
      if (!bo.isNullOrNil(str))
      {
        localIntent1.putExtra("fromWhereShare", str);
        localIntent2 = localIntent1;
        continue;
        ab.d("MicroMsg.RedirectUI", "view normal");
        localIntent1.putExtra("intent_map_key", 4);
        localIntent2 = localIntent1;
        continue;
        localIntent1.putExtra("intent_map_key", 4);
        localIntent2 = localIntent1;
        continue;
        ab.d("MicroMsg.RedirectUI", "view poi      isHidePoiOversea : " + com.tencent.mm.m.g.Nv().Nh());
        localIntent1.putExtra("intent_map_key", 2);
        localIntent2 = localIntent1;
      }
    }
  }

  private void k(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(113476);
    this.cFy = true;
    Intent localIntent = bJP();
    switch (this.type)
    {
    default:
      if (ae.ghX)
      {
        this.handler.postDelayed(new RedirectUI.1(this, localIntent, paramDouble1, paramDouble2), 2000L);
        AppMethodBeat.o(113476);
      }
      break;
    case 0:
    }
    while (true)
    {
      return;
      localIntent.putExtra("location_scene", 1);
      break;
      a(localIntent, paramDouble1, paramDouble2);
      AppMethodBeat.o(113476);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(113481);
    super.finish();
    AppMethodBeat.o(113481);
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(113479);
    ab.i("MicroMsg.RedirectUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (paramInt2 != -1)
    {
      finish();
      AppMethodBeat.o(113479);
    }
    while (true)
    {
      return;
      if (paramIntent != null)
        break;
      finish();
      AppMethodBeat.o(113479);
    }
    switch (paramInt1)
    {
    case 3:
    case 4:
    default:
    case 2:
    case 5:
    case 6:
    }
    while (true)
    {
      setResult(paramInt2, paramIntent);
      finish();
      AppMethodBeat.o(113479);
      break;
      String str1 = this.nMl;
      LocationIntent localLocationIntent = (LocationIntent)paramIntent.getParcelableExtra("KLocationIntent");
      ab.i("MicroMsg.RedirectUI", "locationintent " + localLocationIntent.SY());
      Object localObject = new mu();
      ((mu)localObject).cII.bJt = this.nMm;
      ((mu)localObject).cII.lat = localLocationIntent.lat;
      ((mu)localObject).cII.lng = localLocationIntent.lng;
      ((mu)localObject).cII.cED = localLocationIntent.cED;
      ((mu)localObject).cII.label = localLocationIntent.label;
      ((mu)localObject).cII.cIK = localLocationIntent.eUu;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
      double d1 = localLocationIntent.lat;
      double d2 = localLocationIntent.lng;
      paramInt1 = localLocationIntent.cED;
      String str2 = localLocationIntent.label;
      String str3 = localLocationIntent.eUu;
      String str4 = localLocationIntent.vaO;
      String str5 = localLocationIntent.nJB;
      localObject = str3;
      if (str3 == null)
        localObject = "";
      str3 = "<msg><location x=\"" + d1 + "\" y=\"" + d2 + "\" scale=\"" + paramInt1 + "\" label=\"" + bo.ani(str2) + "\" poiname=\"" + bo.ani((String)localObject) + "\" infourl=\"" + bo.ani(str4) + "\" maptype=\"0\" poiid=\"" + str5 + "\" /></msg>";
      ab.d("MicroMsg.RedirectUI", "xml ".concat(String.valueOf(str3)));
      localObject = new qb();
      ((qb)localObject).cMq.cMr = str1;
      ((qb)localObject).cMq.content = str3;
      ((qb)localObject).cMq.type = 48;
      ((qb)localObject).cMq.flags = 0;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
      o.a(2004, (float)localLocationIntent.lng, (float)localLocationIntent.lat, 0);
      continue;
      localObject = (LocationIntent)paramIntent.getParcelableExtra("KLocationIntent");
      ab.i("MicroMsg.RedirectUI", "locationintent " + ((LocationIntent)localObject).SY());
      if (((LocationIntent)localObject).vaP == 3)
      {
        h.pYm.e(10822, new Object[] { Integer.valueOf(1), ((LocationIntent)localObject).nJz, Integer.valueOf(1) });
        label584: paramIntent.putExtra("kwebmap_slat", ((LocationIntent)localObject).lat);
        paramIntent.putExtra("kwebmap_lng", ((LocationIntent)localObject).lng);
        paramIntent.putExtra("kwebmap_scale", ((LocationIntent)localObject).cED);
        paramIntent.putExtra("Kwebmap_locaion", ((LocationIntent)localObject).label);
        paramIntent.putExtra("kTags", paramIntent.getStringArrayListExtra("kTags"));
        if (!((LocationIntent)localObject).eUu.equals(""))
          break label712;
      }
      label712: for (localObject = ""; ; localObject = ((LocationIntent)localObject).eUu)
      {
        paramIntent.putExtra("kPoiName", (String)localObject);
        break;
        h.pYm.e(10822, new Object[] { Integer.valueOf(1), ((LocationIntent)localObject).nJz, Integer.valueOf(0) });
        break label584;
      }
      localObject = (LocationIntent)paramIntent.getParcelableExtra("KLocationIntent");
      ab.i("MicroMsg.RedirectUI", "locationintent " + ((LocationIntent)localObject).SY());
      if (((LocationIntent)localObject).fBB != null)
        ab.d("MicroMsg.RedirectUI", "addr: " + ((LocationIntent)localObject).fBB.toString());
      paramIntent.putExtra("key_pick_addr", ((LocationIntent)localObject).fBB);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(113475);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      getWindow().addFlags(-2147483648);
      getWindow().setStatusBarColor(0);
    }
    int i;
    if (bo.fp(bo.c((Long)com.tencent.mm.kernel.g.RP().Ry().get(81938, null))) * 1000L > ecD)
    {
      i = 1;
      if (i != 0)
        com.tencent.mm.ba.c.aiq().update();
      this.type = getIntent().getIntExtra("map_view_type", -1);
      if (this.type == -1)
        finish();
      this.cvx = getIntent().getLongExtra("kMsgId", -1L);
      this.nMl = getIntent().getStringExtra("map_talker_name");
      ab.d("MicroMsg.RedirectUI", "tofutest type: %s", new Object[] { Integer.valueOf(this.type) });
      switch (this.type)
      {
      case 4:
      case 5:
      default:
      case 6:
      case 1:
      case 2:
      case 7:
      case 9:
      case 0:
      case 3:
      case 8:
      }
    }
    while (true)
    {
      AppMethodBeat.o(113475);
      while (true)
      {
        return;
        i = 0;
        break;
        com.tencent.mm.plugin.location.a.a locala = l.bJz().PQ(this.nMl);
        paramBundle = new StringBuilder("resume try to enter trackRoom ");
        if (locala != null);
        for (boolean bool = true; ; bool = false)
        {
          ab.i("MicroMsg.RedirectUI", bool);
          if (locala == null)
            break label383;
          this.nJu = locala.latitude;
          this.nJv = locala.longitude;
          this.info = locala.nJq;
          ab.i("MicroMsg.RedirectUI", "resume lat %f lng %f %s member size %d", new Object[] { Double.valueOf(this.nJu), Double.valueOf(this.nJv), this.info, Integer.valueOf(locala.cGh.size()) });
          this.nJw = 0;
          k(this.nJu, this.nJv);
          AppMethodBeat.o(113475);
          break;
        }
        label383: k(-1000.0D, -1000.0D);
        AppMethodBeat.o(113475);
        continue;
        this.nJu = getIntent().getDoubleExtra("kwebmap_slat", -85.0D);
        this.nJv = getIntent().getDoubleExtra("kwebmap_lng", -1000.0D);
        this.nJw = getIntent().getIntExtra("kwebmap_scale", 0);
        this.info = getIntent().getStringExtra("Kwebmap_locaion");
        k(this.nJu, this.nJv);
        AppMethodBeat.o(113475);
      }
      this.nMk = getIntent().getStringExtra("map_sender_name");
      this.klY = getIntent().getIntExtra("view_type_key", 1);
      this.nMm = getIntent().getIntExtra("key_get_location_type", 0);
      k(-85.0D, -1000.0D);
    }
  }

  protected void onDestroy()
  {
    AppMethodBeat.i(113480);
    this.nLD = false;
    super.onDestroy();
    AppMethodBeat.o(113480);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.RedirectUI
 * JD-Core Version:    0.6.2
 */