package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.kernel.a;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelgeo.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.t;
import com.tencent.mm.protocal.protobuf.axw;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bq;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LocationWidget extends LinearLayout
{
  private float bEJ;
  private int dtW;
  private String dud;
  private String eUu;
  private boolean fBD;
  private float fBr;
  private float fBs;
  private Activity gNy;
  private c.a nJD;
  private c nOO;
  private String nQB;
  private com.tencent.mm.modelgeo.d oRD;
  private float oRJ;
  private b.a oRX;
  private axw oSn;
  private ImageView rhd;
  private TextView rii;
  private View rjZ;
  private View rka;
  private int[] rkb;
  private ImageView[] rkc;
  private int rkd;
  private TextView rke;
  private byte[] rkf;
  private String rkg;
  private String rkh;
  private int rki;
  private float rkj;
  private int rkk;
  private LocationWidget.a rkl;
  private boolean rkm;
  private LocationWidget.b rkn;
  private int score;

  public LocationWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38290);
    this.rkb = new int[] { 2131825283, 2131825284, 2131825285, 2131825286, 2131825287 };
    this.rkc = new ImageView[5];
    this.fBr = -1000.0F;
    this.fBs = -1000.0F;
    this.rki = 0;
    this.oSn = null;
    this.dtW = 0;
    this.rkj = 0.0F;
    this.oRJ = 0.0F;
    this.bEJ = 0.0F;
    this.rkk = -1;
    this.fBD = true;
    this.oRD = com.tencent.mm.modelgeo.d.agz();
    this.rkl = null;
    this.rkm = false;
    this.nJD = new LocationWidget.3(this);
    this.oRX = new LocationWidget.4(this);
    this.rkn = null;
    j((MMActivity)paramContext);
    AppMethodBeat.o(38290);
  }

  public LocationWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(38289);
    this.rkb = new int[] { 2131825283, 2131825284, 2131825285, 2131825286, 2131825287 };
    this.rkc = new ImageView[5];
    this.fBr = -1000.0F;
    this.fBs = -1000.0F;
    this.rki = 0;
    this.oSn = null;
    this.dtW = 0;
    this.rkj = 0.0F;
    this.oRJ = 0.0F;
    this.bEJ = 0.0F;
    this.rkk = -1;
    this.fBD = true;
    this.oRD = com.tencent.mm.modelgeo.d.agz();
    this.rkl = null;
    this.rkm = false;
    this.nJD = new LocationWidget.3(this);
    this.oRX = new LocationWidget.4(this);
    this.rkn = null;
    j((MMActivity)paramContext);
    AppMethodBeat.o(38289);
  }

  private void R(ArrayList<Exif.a> paramArrayList)
  {
    AppMethodBeat.i(38294);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      AppMethodBeat.o(38294);
      return;
    }
    h.pYm.X(11139, "1");
    Exif.a locala1;
    if ((Math.abs(-1000.0F - this.fBr) > 1.0E-006D) && (Math.abs(-1000.0F - this.fBs) > 1.0E-006D))
    {
      locala1 = (Exif.a)paramArrayList.get(paramArrayList.size() - 1);
      if (b(locala1.latitude, locala1.longitude, this.fBr, this.fBs))
        h.pYm.X(11139, "2");
    }
    int i = 0;
    label120: if (i < paramArrayList.size())
    {
      j = i + 1;
      if (j >= paramArrayList.size())
        break label225;
      locala1 = (Exif.a)paramArrayList.get(i);
      Exif.a locala2 = (Exif.a)paramArrayList.get(j);
      if (b(locala1.latitude, locala1.longitude, locala2.latitude, locala2.longitude))
        h.pYm.X(11139, "3");
    }
    label133: label225: for (int j = 0; ; j = 1)
    {
      if (j != 0)
      {
        i++;
        break label120;
        j++;
        break label133;
      }
      AppMethodBeat.o(38294);
      break;
    }
  }

  private static boolean b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    AppMethodBeat.i(38295);
    boolean bool;
    if (t.c(paramDouble1, paramDouble2, paramDouble3, paramDouble4) > 1000.0D)
    {
      bool = true;
      AppMethodBeat.o(38295);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(38295);
    }
  }

  private void crR()
  {
    int i = 0;
    AppMethodBeat.i(38292);
    ab.i("MicroMsg.LocationWidget", "updateScoreItem scoreSwtich:%d, classifyId:%s, poiClassifyType:%d, showFlag:%d, isOverSea:%b", new Object[] { Integer.valueOf(this.rkd), this.rkh, Integer.valueOf(this.rki), Integer.valueOf(this.dtW), Boolean.valueOf(bq.dpN()) });
    if ((bq.dpN()) || (this.rkd == 0) || (bo.isNullOrNil(this.rkh)) || (this.rki == 1) || ((this.dtW & 0x1) == 0))
    {
      this.rka.setVisibility(8);
      AppMethodBeat.o(38292);
    }
    while (true)
    {
      return;
      this.rka.setVisibility(0);
      while (i < this.score)
      {
        this.rkc[i].setImageResource(getSelectedStarImageResource());
        i++;
      }
      for (i = this.score; i < 5; i++)
        this.rkc[i].setImageResource(getNormalStarImageResource());
      AppMethodBeat.o(38292);
    }
  }

  private void crT()
  {
    AppMethodBeat.i(38298);
    if ((this.rke != null) && (this.rii != null))
    {
      if (!bo.isNullOrNil(this.eUu))
      {
        this.rke.setText(this.eUu);
        this.rke.setTextColor(getResources().getColor(2131690135));
        this.rii.setVisibility(8);
      }
    }
    else
    {
      if ((bo.isNullOrNil(this.eUu)) && (bo.isNullOrNil(this.dud)))
        break label213;
      this.rhd.setImageDrawable(ah.f(this.gNy, 2131230777, getContext().getResources().getColor(2131690683)));
      AppMethodBeat.o(38298);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.dud))
      {
        this.rke.setText(this.dud);
        this.rke.setTextColor(getResources().getColor(2131690135));
        this.rii.setVisibility(8);
        break;
      }
      this.rke.setText(2131303691);
      this.rke.setTextColor(getResources().getColor(2131690316));
      this.rii.setVisibility(8);
      break;
      label213: this.rhd.setImageDrawable(ah.f(this.gNy, 2131230776, -16777216));
      AppMethodBeat.o(38298);
    }
  }

  private void crU()
  {
    AppMethodBeat.i(38301);
    boolean bool;
    Object localObject;
    if (this.rkl != null)
    {
      bool = this.rkl.crW();
      localObject = this.rkl.crV();
      if ((localObject == null) || (((ArrayList)localObject).size() == 0))
        AppMethodBeat.o(38301);
    }
    while (true)
    {
      return;
      localObject = ((ArrayList)localObject).iterator();
      if (((Iterator)localObject).hasNext())
      {
        Exif.a locala = (Exif.a)((Iterator)localObject).next();
        ab.d("MicroMsg.LocationWidget", "snsreport lat lng %f, %f", new Object[] { Double.valueOf(locala.latitude), Double.valueOf(locala.longitude) });
        h localh = h.pYm;
        int i = (int)(locala.latitude * 1000000.0D);
        int j = (int)(locala.longitude * 1000000.0D);
        if (bool);
        for (int k = 1; ; k = 2)
        {
          localh.e(11345, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(2) });
          break;
        }
      }
      AppMethodBeat.o(38301);
    }
  }

  private void j(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(38291);
    this.gNy = paramMMActivity;
    View localView = View.inflate(paramMMActivity, getLayoutResource(), this);
    this.rjZ = localView.findViewById(2131825277);
    this.rke = ((TextView)this.rjZ.findViewById(2131825276));
    this.rii = ((TextView)this.rjZ.findViewById(2131825279));
    this.rhd = ((ImageView)this.rjZ.findViewById(2131825278));
    this.rka = localView.findViewById(2131825280);
    for (int i = 0; i < 5; i++)
    {
      this.rkc[i] = ((ImageView)this.rka.findViewById(this.rkb[i]));
      this.rkc[i].setOnClickListener(new LocationWidget.1(this, i));
    }
    this.nOO = c.agw();
    this.rjZ.setOnClickListener(new LocationWidget.2(this));
    this.rkh = paramMMActivity.getIntent().getStringExtra("kpoi_id");
    if (!bo.isNullOrNil(this.rkh))
    {
      this.fBr = paramMMActivity.getIntent().getFloatExtra("k_lat", -1000.0F);
      this.fBs = paramMMActivity.getIntent().getFloatExtra("k_lng", -1000.0F);
      this.eUu = paramMMActivity.getIntent().getStringExtra("kpoi_name");
      this.rkg = paramMMActivity.getIntent().getStringExtra("Kpoi_address");
      crT();
    }
    if (com.tencent.mm.kernel.g.RN().QY());
    for (this.rkd = bo.getInt(com.tencent.mm.m.g.Nu().getValue("SnsPostPOICommentSwitch"), 0); ; this.rkd = 0)
    {
      crR();
      AppMethodBeat.o(38291);
      return;
    }
  }

  public final boolean ao(Intent paramIntent)
  {
    AppMethodBeat.i(38297);
    if (paramIntent == null)
    {
      AppMethodBeat.o(38297);
      return true;
    }
    this.rki = paramIntent.getIntExtra("get_poi_classify_type", 0);
    this.dtW = paramIntent.getIntExtra("get_poi_showflag", 0);
    ab.d("MicroMsg.LocationWidget", "onactivity result ok poiClassifyType %d", new Object[] { Integer.valueOf(this.rki) });
    this.eUu = bo.bc(paramIntent.getStringExtra("get_poi_name"), "");
    this.dud = bo.bc(paramIntent.getStringExtra("get_city"), "");
    this.fBr = paramIntent.getFloatExtra("get_lat", -1000.0F);
    this.fBs = paramIntent.getFloatExtra("get_lng", -1000.0F);
    ab.i("MicroMsg.LocationWidget", "check cur lat " + this.rkj + " " + this.oRJ);
    this.rkj = paramIntent.getFloatExtra("get_cur_lat", 0.0F);
    this.oRJ = paramIntent.getFloatExtra("get_cur_lng", 0.0F);
    this.rkk = paramIntent.getIntExtra("get_loctype", -1);
    this.bEJ = paramIntent.getFloatExtra("get_accuracy", 0.0F);
    this.fBD = paramIntent.getBooleanExtra("get_is_mars", true);
    this.nQB = paramIntent.getStringExtra("request_id");
    Object localObject = com.tencent.mm.modelstat.e.akf();
    boolean bool;
    if (this.rkk == 0)
    {
      bool = false;
      ((com.tencent.mm.modelstat.e)localObject).a(2003, bool, this.fBD, this.fBs, this.fBr, (int)this.bEJ);
      this.rkf = paramIntent.getByteArrayExtra("location_ctx");
      if (bo.isNullOrNil(this.eUu))
        break label611;
      this.rkg = bo.bc(paramIntent.getStringExtra("get_poi_address"), "");
      this.rkh = bo.bc(paramIntent.getStringExtra("get_poi_classify_id"), "");
      this.oSn = new axw();
    }
    while (true)
    {
      try
      {
        this.oSn = ((axw)this.oSn.parseFrom(paramIntent.getByteArrayExtra("get_poi_item_buf")));
        if (!bo.isNullOrNil(this.rkh))
        {
          this.oSn = new axw();
          this.oSn.oQU = this.rkh;
          this.oSn.jCt = this.rki;
          this.oSn.Title = this.eUu;
          this.oSn.oQZ.add(new bts().alV(this.rkg));
        }
        ab.d("MicroMsg.LocationWidget", "label %s poiname %s", new Object[] { this.rkg, this.eUu });
        crT();
        crR();
        this.rkn = new LocationWidget.b(this);
        localObject = this.rkn;
        if (paramIntent != null)
        {
          ((LocationWidget.b)localObject).index = paramIntent.getIntExtra("report_index", -1);
          ((LocationWidget.b)localObject).oRM = paramIntent.getLongExtra("first_start_time", 0L);
          ((LocationWidget.b)localObject).oRN = paramIntent.getLongExtra("lastSuccStamp", 0L);
          ((LocationWidget.b)localObject).oRO = paramIntent.getLongExtra("firstSuccStamp", 0L);
          ((LocationWidget.b)localObject).oRP = paramIntent.getIntExtra("reqLoadCnt", 0);
          ((LocationWidget.b)localObject).nPQ = paramIntent.getIntExtra("entry_time", 0);
          ((LocationWidget.b)localObject).hlm = paramIntent.getStringExtra("search_id");
        }
        AppMethodBeat.o(38297);
        break;
        bool = true;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.LocationWidget", localException, "", new Object[0]);
        this.oSn = null;
        continue;
      }
      label611: if (!bo.isNullOrNil(this.dud))
      {
        this.eUu = "";
        this.rkg = "";
        this.rkh = "";
        this.oSn = null;
      }
      else
      {
        this.fBr = -1000.0F;
        this.fBs = -1000.0F;
        this.eUu = "";
        this.rkg = "";
        this.dud = "";
        this.rkh = "";
        this.oSn = null;
      }
    }
  }

  public final void crS()
  {
    AppMethodBeat.i(38293);
    Intent localIntent = new Intent();
    localIntent.putExtra("near_life_scene", 1);
    try
    {
      localIntent.putExtra("get_poi_item_buf", this.oSn.toByteArray());
      if (!bo.isNullOrNil(this.rkh))
      {
        localIntent.putExtra("get_poi_classify_id", this.rkh);
        localIntent.putExtra("get_lat", this.fBr);
        localIntent.putExtra("get_lng", this.fBs);
        localIntent.putExtra("request_id", this.nQB);
        if (this.rkl == null)
          break label237;
        Object localObject = this.rkl.crV();
        if (localObject == null)
          break label237;
        R((ArrayList)localObject);
        ArrayList localArrayList = new ArrayList();
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          Exif.a locala = (Exif.a)((Iterator)localObject).next();
          localArrayList.add(String.format("%f\n%f", new Object[] { Double.valueOf(locala.latitude), Double.valueOf(locala.longitude) }));
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LocationWidget", localException, "", new Object[0]);
        continue;
        if (!bo.isNullOrNil(this.dud))
          localIntent.putExtra("get_city", this.dud);
      }
      label237: com.tencent.mm.bp.d.b(getContext(), "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", localIntent, 10);
      AppMethodBeat.o(38293);
    }
  }

  public ayt getCurLocation()
  {
    AppMethodBeat.i(38300);
    ayt localayt = new ayt();
    localayt.vRq = this.rkj;
    localayt.vRp = this.oRJ;
    localayt.bEJ = this.bEJ;
    localayt.rkk = this.rkk;
    AppMethodBeat.o(38300);
    return localayt;
  }

  protected int getLayoutResource()
  {
    return 2130969948;
  }

  public ayt getLocation()
  {
    AppMethodBeat.i(38299);
    ayt localayt = new ayt();
    localayt.vRq = this.fBr;
    localayt.vRp = this.fBs;
    localayt.wCF = 0;
    localayt.score = this.score;
    if (this.rkf != null)
      localayt.wCG = new b(this.rkf);
    if (!bo.isNullOrNil(this.eUu))
    {
      localayt.rkg = this.rkg;
      localayt.eUu = this.eUu;
      localayt.wCC = this.rkh;
      localayt.guP = this.dud;
      if ((this.rki != 0) && (this.rki == 1))
      {
        localayt.rki = 2;
        ab.d("MicroMsg.LocationWidget", "getlocation type %d", new Object[] { Integer.valueOf(localayt.rki) });
      }
    }
    while (true)
    {
      if (this.rkn != null)
      {
        String str = String.format("%f/%f", new Object[] { Float.valueOf(localayt.vRq), Float.valueOf(localayt.vRp) });
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("index " + this.rkn.index);
        localStringBuffer.append("firstStartStamp " + this.rkn.oRM);
        localStringBuffer.append("lastSuccStamp " + this.rkn.oRO);
        localStringBuffer.append("firstSuccStamp " + this.rkn.oRN);
        localStringBuffer.append("reqLoadCnt " + this.rkn.oRP);
        localStringBuffer.append("classifyId " + this.rkh);
        localStringBuffer.append("entryTime " + this.rkn.nPQ);
        localStringBuffer.append("searchId" + this.rkn.hlm);
        ab.d("MicroMsg.LocationWidget", "report %s", new Object[] { localStringBuffer.toString() });
        h.pYm.e(11135, new Object[] { Integer.valueOf(5), Integer.valueOf(this.rkn.index + 1), Long.valueOf(this.rkn.oRM), Long.valueOf(this.rkn.oRO), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.rkn.oRN), Integer.valueOf(this.rkn.oRP), str, this.rkh, Integer.valueOf(this.rkn.nPQ), this.rkn.hlm, q.LK() });
      }
      crU();
      AppMethodBeat.o(38299);
      return localayt;
      localayt.rki = 1;
      break;
      if (!bo.isNullOrNil(this.dud))
        localayt.guP = this.dud;
    }
  }

  protected int getNormalStarImageResource()
  {
    return 2131231975;
  }

  protected int getNormalStateImageResource()
  {
    return 2131230776;
  }

  protected int getSelectedStarImageResource()
  {
    return 2131231976;
  }

  protected int getSelectedStateImageResource()
  {
    return 2131230777;
  }

  public int getShowFlag()
  {
    return this.dtW;
  }

  public void setLocationWidgetListener(LocationWidget.a parama)
  {
    this.rkl = parama;
  }

  public final void stop()
  {
    AppMethodBeat.i(38296);
    if (this.oRD != null)
      this.oRD.c(this.oRX);
    if (this.nOO != null)
      this.nOO.a(this.nJD);
    AppMethodBeat.o(38296);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.LocationWidget
 * JD-Core Version:    0.6.2
 */