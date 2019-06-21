package com.tencent.mm.plugin.welab.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.i;
import com.tencent.mm.plugin.welab.d;
import com.tencent.mm.plugin.welab.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@i
public class WelabMainUI extends MMActivity
{
  private Comparator<com.tencent.mm.plugin.welab.d.a.a> uMA;
  private View.OnClickListener uMB;
  private boolean uMi;
  private LinearLayout uMt;
  private LinearLayout uMu;
  private LinearLayout uMv;
  private LinearLayout uMw;
  private View uMx;
  private View uMy;
  private List<String> uMz;

  public WelabMainUI()
  {
    AppMethodBeat.i(80619);
    this.uMi = false;
    this.uMA = new WelabMainUI.3(this);
    this.uMB = new WelabMainUI.4(this);
    AppMethodBeat.o(80619);
  }

  private void a(com.tencent.mm.plugin.welab.d.a.a parama, LinearLayout paramLinearLayout)
  {
    AppMethodBeat.i(80625);
    LinearLayout localLinearLayout = (LinearLayout)getLayoutInflater().inflate(2130971224, paramLinearLayout, false);
    ImageView localImageView1 = (ImageView)localLinearLayout.findViewById(2131829201);
    ImageView localImageView2 = (ImageView)localLinearLayout.findViewById(2131829200);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(2131820678);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(2131821841);
    if (b.ddC().e(parama))
      localImageView1.setVisibility(0);
    while (true)
    {
      com.tencent.mm.at.a.a.ahv().a(parama.agR("field_ThumbUrl"), localImageView2, com.tencent.mm.plugin.welab.a.ddj().udB);
      com.tencent.mm.plugin.welab.a.ddj();
      localTextView1.setText(com.tencent.mm.plugin.welab.a.a(parama));
      localTextView2.setText(parama.agR("field_Desc"));
      localLinearLayout.setTag(parama);
      localLinearLayout.setOnClickListener(this.uMB);
      paramLinearLayout.addView(localLinearLayout);
      AppMethodBeat.o(80625);
      return;
      localImageView1.setVisibility(8);
    }
  }

  private void ddB()
  {
    AppMethodBeat.i(80624);
    List localList = com.tencent.mm.plugin.welab.a.ddj().uLQ.dds();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.welab.d.a.a locala = (com.tencent.mm.plugin.welab.d.a.a)localIterator.next();
      if ((System.currentTimeMillis() / 1000L - locala.field_endtime >= 2592000L) || ("labs1de6f3".equals(locala.field_LabsAppId)))
      {
        localIterator.remove();
        com.tencent.mm.plugin.welab.a.uLP.uLQ.a(locala, new String[0]);
      }
      else if ((locala.isExpired()) && (locala.field_Switch != 3))
      {
        locala.field_Switch = 3;
        com.tencent.mm.plugin.welab.a.uLP.uLQ.c(locala, new String[0]);
      }
      else if (locala.field_Switch != 3)
      {
        localIterator.remove();
      }
    }
    ab.i("WelabMgr", "stopped lab %s", new Object[] { localList.toString() });
    if (localList.isEmpty())
    {
      this.uMu.setVisibility(8);
      AppMethodBeat.o(80624);
    }
    while (true)
    {
      return;
      this.uMu.setVisibility(0);
      Collections.sort(localList, this.uMA);
      localIterator = localList.iterator();
      while (localIterator.hasNext())
        a((com.tencent.mm.plugin.welab.d.a.a)localIterator.next(), this.uMw);
      ab.d("MicroMsg.WelabMainUI", "get online app count " + this.uMw.getChildCount());
      AppMethodBeat.o(80624);
    }
  }

  public final int getLayoutId()
  {
    return 2130971226;
  }

  public final void initView()
  {
    AppMethodBeat.i(80621);
    setMMTitle(2131305641);
    xE(getResources().getColor(2131690690));
    Nc(getResources().getColor(2131689613));
    this.uMt = ((LinearLayout)findViewById(2131829209));
    this.uMv = ((LinearLayout)findViewById(2131829210));
    this.uMu = ((LinearLayout)findViewById(2131829211));
    this.uMw = ((LinearLayout)findViewById(2131829212));
    this.uMx = findViewById(2131829213);
    this.uMy = findViewById(2131829208);
    this.uMx.setOnClickListener(new WelabMainUI.1(this));
    setBackBtn(new WelabMainUI.2(this));
    AppMethodBeat.o(80621);
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    AppMethodBeat.i(80620);
    super.onCreate(paramBundle);
    pO(true);
    dyb();
    if (getIntent() != null)
    {
      if (getIntent().getIntExtra("para_from_with_red_point", 0) == 1)
        bool = true;
      this.uMi = bool;
      this.uMz = getIntent().getStringArrayListExtra("key_exclude_apps");
    }
    initView();
    b.ddC();
    ah.doB().edit().putBoolean("key_has_enter_welab", true).commit();
    b.ddD();
    d.t("", 1, this.uMi);
    AppMethodBeat.o(80620);
  }

  public void onPause()
  {
    AppMethodBeat.i(80623);
    super.onPause();
    AppMethodBeat.o(80623);
  }

  public void onResume()
  {
    AppMethodBeat.i(80622);
    super.onResume();
    this.uMv.removeAllViews();
    this.uMw.removeAllViews();
    List localList = com.tencent.mm.plugin.welab.a.ddj().ddk();
    if ((localList == null) || (localList.isEmpty()))
    {
      this.uMt.setVisibility(8);
      ddB();
      if ((this.uMt.getVisibility() == 0) || (this.uMu.getVisibility() == 0))
        break label256;
      this.uMy.setVisibility(0);
      AppMethodBeat.o(80622);
    }
    while (true)
    {
      return;
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.welab.d.a.a locala = (com.tencent.mm.plugin.welab.d.a.a)localIterator.next();
        if ((!bo.isNullOrNil(locala.field_LabsAppId)) && (this.uMz.contains(locala.field_LabsAppId)))
          localIterator.remove();
      }
      if (localList.isEmpty())
      {
        this.uMt.setVisibility(8);
        break;
      }
      this.uMt.setVisibility(0);
      Collections.sort(localList, this.uMA);
      localIterator = localList.iterator();
      while (localIterator.hasNext())
        a((com.tencent.mm.plugin.welab.d.a.a)localIterator.next(), this.uMv);
      ab.d("MicroMsg.WelabMainUI", "get online app count " + this.uMv.getChildCount());
      break;
      label256: this.uMy.setVisibility(8);
      AppMethodBeat.o(80622);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.ui.WelabMainUI
 * JD-Core Version:    0.6.2
 */