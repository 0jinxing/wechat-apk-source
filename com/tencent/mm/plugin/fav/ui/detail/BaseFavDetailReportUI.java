package com.tencent.mm.plugin.fav.ui.detail;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.c;
import com.tencent.mm.plugin.fav.ui.widget.FavDetailScrollView;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMLoadScrollView;

public abstract class BaseFavDetailReportUI extends MMActivity
{
  protected boolean mlA;
  private String mlB = null;
  public h.a mlz = new h.a();

  protected final void F(com.tencent.mm.plugin.fav.a.g paramg)
  {
    if ((paramg != null) && (this.mlz.scene > 0))
    {
      this.mlz.meT = paramg.field_id;
      this.mlz.type = paramg.field_type;
      this.mlz.cvd = paramg.field_sourceType;
      this.mlz.timestamp = (paramg.field_sourceCreateTime / 1000L);
      if (this.mlz.timestamp == 0L)
        this.mlz.timestamp = (paramg.field_updateTime / 1000L);
      if (this.mlz.timestamp == 0L)
        this.mlz.timestamp = paramg.field_edittime;
      this.mlz.meU = b.r(paramg);
      this.mlA = true;
    }
  }

  protected MMLoadScrollView bwd()
  {
    return null;
  }

  protected final void iL(long paramLong)
  {
    com.tencent.mm.plugin.fav.a.g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramLong);
    if (localg != null)
      F(localg);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramIntent != null))
    {
      long l = paramIntent.getLongExtra("key_activity_browse_time", 0L);
      h.a locala = this.mlz;
      locala.meW += l;
      ab.v("MicroMsg.Fav.BaseFavDetailReportUI", "onActivityResult subDetailPeriod[%d] subUIBrowserTime[%d]", new Object[] { Long.valueOf(this.mlz.meW), Long.valueOf(l) });
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mlz.scene = getIntent().getIntExtra("key_detail_fav_scene", 0);
    this.mlz.jSW = getIntent().getIntExtra("key_detail_fav_sub_scene", 0);
    this.mlz.index = getIntent().getIntExtra("key_detail_fav_index", 0);
    this.mlz.query = getIntent().getStringExtra("key_detail_fav_query");
    this.mlz.sid = getIntent().getStringExtra("key_detail_fav_sessionid");
    this.mlz.mfg = getIntent().getStringExtra("key_detail_fav_tags");
    h.a locala = this.mlz;
    if (this.mlz.query == null)
    {
      paramBundle = "";
      locala.query = paramBundle;
      locala = this.mlz;
      if (this.mlz.sid != null)
        break label268;
      paramBundle = "";
      label145: locala.sid = paramBundle;
      locala = this.mlz;
      if (this.mlz.mfg != null)
        break label279;
    }
    label268: label279: for (paramBundle = ""; ; paramBundle = this.mlz.mfg)
    {
      locala.mfg = paramBundle;
      paramBundle = bwd();
      if (paramBundle != null)
      {
        paramBundle.setOnTopOrBottomListerner(new BaseFavDetailReportUI.1(this));
        if ((paramBundle instanceof FavDetailScrollView))
          ((FavDetailScrollView)paramBundle).setOnScrollChangeListener(new BaseFavDetailReportUI.2(this));
      }
      if (this.mlz.scene == 0)
        ab.i("MicroMsg.Fav.BaseFavDetailReportUI", "report object scene is 0");
      xE(this.mController.ylL.getResources().getColor(2131689651));
      dyb();
      return;
      paramBundle = this.mlz.query;
      break;
      paramBundle = this.mlz.sid;
      break label145;
    }
  }

  public void onDestroy()
  {
    if (this.mlA)
      d.post(new BaseFavDetailReportUI.3(this), "BaseFavReport");
    setResult(-1, getIntent().putExtra("key_activity_browse_time", dyi()));
    c.bvC();
    super.onDestroy();
  }

  public void onPause()
  {
    this.mlz.meV = dyi();
    String str1 = com.tencent.mm.modelstat.f.akh().fSS;
    h.a locala;
    long l1;
    com.tencent.mm.modelstat.f localf;
    String str2;
    if ((!bo.isEqual(getClass().getName(), str1)) && (!bo.isEqual(str1, this.mlB)))
    {
      locala = this.mlz;
      l1 = locala.meW;
      localf = com.tencent.mm.modelstat.f.akh();
      str2 = com.tencent.mm.modelstat.f.akh().fSS;
      if (localf.fSR == null)
        break label149;
    }
    label149: for (long l2 = ((Long)localf.fSR.get(str2)).longValue(); ; l2 = 0L)
    {
      locala.meW = (l2 + l1);
      ab.v("MicroMsg.Fav.BaseFavDetailReportUI", "onPause lastClassname[%s] detailPeriod[%d] subDetailPeriod[%d]", new Object[] { str1, Long.valueOf(this.mlz.meV), Long.valueOf(this.mlz.meW) });
      super.onPause();
      return;
    }
  }

  public void onResume()
  {
    super.onResume();
    if (bo.isNullOrNil(this.mlB))
      this.mlB = com.tencent.mm.modelstat.f.akh().fSS;
    ab.v("MicroMsg.Fav.BaseFavDetailReportUI", "onResume firstResumeClassname[%s]", new Object[] { this.mlB });
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI
 * JD-Core Version:    0.6.2
 */