package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.k;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SightUploadUI extends MMActivity
{
  private String desc = "";
  DisplayMetrics pFD;
  private String rmH = "";
  private String rmI = "";
  private SnsEditText rnb;
  private y rnc = null;
  private LinearLayout rnd;
  private SnsSightUploadSayFooter rne;
  private int rnf = 0;
  private int rng = 0;
  private ArrayList<String> rnh;
  private boolean rni = false;
  private int rnj = 0;
  private boolean rnk = false;
  private long rnl = 0L;

  public final int getLayoutId()
  {
    return 2130970799;
  }

  public final void initView()
  {
    AppMethodBeat.i(38592);
    this.rnb = ((SnsEditText)findViewById(2131825373));
    int i = this.rnb.getPaddingLeft();
    int j = this.rnd.getPaddingRight();
    int k = this.pFD.widthPixels;
    this.rnb.postDelayed(new SightUploadUI.1(this, k - (i + j)), 100L);
    if (!bo.isNullOrNil(getIntent().getStringExtra(e.k.ygd)))
      this.rnb.setText(getIntent().getStringExtra(e.k.ygd));
    this.rnb.setBackListener(new SightUploadUI.2(this));
    this.rne = ((SnsSightUploadSayFooter)findViewById(2131827849));
    this.rne.setMMEditText(this.rnb);
    this.rne.setVisibility(0);
    setBackBtn(new SightUploadUI.3(this));
    if (getIntent().getBooleanExtra("KSightDraftEntrance", true))
      addIconOptionMenu(1, 2131231928, new SightUploadUI.4(this));
    a(0, getString(2131297041), new SightUploadUI.5(this), q.b.ymw);
    enableOptionMenu(true);
    AppMethodBeat.o(38592);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(38596);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(38596);
      return;
    }
    Object localObject1;
    if ((paramInt1 == 6) || (paramInt1 == 5) || (paramInt1 == 10))
    {
      localObject1 = this.rne;
      if (paramIntent != null)
      {
        if (paramInt1 != 10)
          break label83;
        ((SnsSightUploadSayFooter)localObject1).rwZ.ao(paramIntent);
      }
    }
    while (true)
      if (paramInt1 == 5)
      {
        if (paramIntent == null)
        {
          AppMethodBeat.o(38596);
          break;
          label83: if (paramInt1 != 5)
            continue;
          ((SnsSightUploadSayFooter)localObject1).rwY.a(paramInt1, paramInt2, paramIntent, null);
          continue;
        }
        paramInt2 = paramIntent.getIntExtra("Ktag_range_index", 0);
        if (paramInt2 >= 2)
        {
          this.rmH = paramIntent.getStringExtra("Klabel_name_list");
          this.rmI = paramIntent.getStringExtra("Kother_user_name_list");
          localObject1 = Arrays.asList(this.rmH.split(","));
          if (bo.isNullOrNil(this.rmI))
            break label534;
        }
      }
    label518: label531: label534: for (paramIntent = Arrays.asList(this.rmI.split(",")); ; paramIntent = null)
    {
      this.rnh = new ArrayList();
      label209: Object localObject2;
      if ((localObject1 != null) && (((List)localObject1).size() > 0))
      {
        Iterator localIterator = ((List)localObject1).iterator();
        if (localIterator.hasNext())
        {
          localObject2 = (String)localIterator.next();
          localObject2 = a.bJa().PH(a.bJa().PE((String)localObject2));
          if ((localObject2 != null) && (((List)localObject2).size() != 0))
            break label323;
          ab.e("MicroMsg.SightUploadUI", "dz: getContactNamesFromLabels,namelist get bu label is null");
        }
      }
      if (localObject1 != null)
      {
        localObject1 = ((List)localObject1).iterator();
        paramInt1 = 0;
        label291: if (((Iterator)localObject1).hasNext())
        {
          if (bo.isNullOrNil((String)((Iterator)localObject1).next()))
            break label531;
          paramInt1++;
        }
      }
      while (true)
      {
        break label291;
        label323: localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          if (!this.rnh.contains(str))
          {
            this.rnh.add(str);
            ab.d("MicroMsg.SightUploadUI", "dz:name : %s", new Object[] { str });
          }
        }
        break label209;
        this.rnf = paramInt1;
        this.rng = 0;
        if ((paramIntent != null) && (paramIntent.size() > 0))
        {
          localObject1 = paramIntent.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            paramIntent = (String)((Iterator)localObject1).next();
            if (!this.rnh.contains(paramIntent))
            {
              this.rnh.add(paramIntent);
              this.rng += 1;
            }
          }
        }
        if (paramInt2 == 2);
        for (this.rni = false; ; this.rni = true)
        {
          if (1 != paramInt2)
            break label518;
          this.rnj = 1;
          AppMethodBeat.o(38596);
          break;
        }
        this.rnj = 0;
        AppMethodBeat.o(38596);
        break;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(38591);
    f.m(this);
    super.onCreate(paramBundle);
    this.pFD = getResources().getDisplayMetrics();
    this.rnc = new ak(this);
    this.rnc.M(paramBundle);
    this.rnd = ((LinearLayout)findViewById(2131827848));
    this.rnd.addView(this.rnc.crH());
    setMMTitle(2131303831);
    getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(2131689761));
    this.rnk = getIntent().getBooleanExtra("KSnsPostManu", false);
    this.rnl = getIntent().getLongExtra("KTouchCameraTime", 0L);
    initView();
    f.n(this);
    AppMethodBeat.o(38591);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(38594);
    super.onDestroy();
    this.rnc.crI();
    this.rne.rwZ.stop();
    SnsSightUploadSayFooter localSnsSightUploadSayFooter = this.rne;
    if (localSnsSightUploadSayFooter.eAk != null)
    {
      localSnsSightUploadSayFooter.eAk.AC();
      localSnsSightUploadSayFooter.eAk.destroy();
    }
    AppMethodBeat.o(38594);
  }

  public void onPause()
  {
    AppMethodBeat.i(38595);
    super.onPause();
    aqX();
    AppMethodBeat.o(38595);
  }

  public void onResume()
  {
    AppMethodBeat.i(38593);
    super.onResume();
    ab.d("MicroMsg.SightUploadUI", "onResume");
    SnsSightUploadSayFooter localSnsSightUploadSayFooter = this.rne;
    if (localSnsSightUploadSayFooter.eAk.getVisibility() == 8)
      localSnsSightUploadSayFooter.crP.showVKB();
    AppMethodBeat.o(38593);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SightUploadUI
 * JD-Core Version:    0.6.2
 */