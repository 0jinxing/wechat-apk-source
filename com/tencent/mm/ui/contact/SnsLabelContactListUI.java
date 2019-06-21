package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ia;
import com.tencent.mm.g.a.ia.b;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class SnsLabelContactListUI extends MMActivity
{
  private ListView nIv;
  private cbf qBX;
  private SnsLabelContactListUI.a zph;
  private ArrayList<String> zpi;
  private int zpj;
  private String zpk;
  private SnsLabelContactListUI.b zpl;

  public SnsLabelContactListUI()
  {
    AppMethodBeat.i(33948);
    this.zpi = new ArrayList();
    AppMethodBeat.o(33948);
  }

  private void dIm()
  {
    AppMethodBeat.i(33950);
    Iterator localIterator;
    if (this.qBX.wGz == 3)
    {
      this.zpk = getString(2131303662);
      localIterator = this.qBX.xaB.iterator();
      while (localIterator.hasNext())
        this.zpi.add(((bts)localIterator.next()).wVI);
      AppMethodBeat.o(33950);
    }
    while (true)
    {
      return;
      if (this.qBX.wGz == 5)
      {
        this.zpk = getString(2131303663);
        localIterator = this.qBX.wFp.iterator();
        while (localIterator.hasNext())
          this.zpi.add(((bts)localIterator.next()).wVI);
      }
      AppMethodBeat.o(33950);
    }
  }

  public final int getLayoutId()
  {
    return 2130968638;
  }

  public final void initView()
  {
    AppMethodBeat.i(33951);
    setMMTitle(this.zpk);
    findViewById(2131828206).setVisibility(8);
    this.nIv = ((ListView)findViewById(2131821054));
    ((TextView)findViewById(2131821056)).setVisibility(8);
    findViewById(2131821057).setVisibility(8);
    this.nIv.setBackgroundColor(getResources().getColor(2131690691));
    ((View)this.nIv.getParent()).setBackgroundColor(getResources().getColor(2131690691));
    setBackBtn(new SnsLabelContactListUI.1(this));
    showOptionMenu(false);
    if ((this.zpi != null) && (this.zpi.size() != 0))
    {
      this.zph = new SnsLabelContactListUI.a(this, this.zpi);
      this.nIv.setAdapter(this.zph);
      this.nIv.setVisibility(0);
      this.nIv.setOnItemClickListener(new SnsLabelContactListUI.2(this));
    }
    AppMethodBeat.o(33951);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33949);
    super.onCreate(paramBundle);
    this.zpl = new SnsLabelContactListUI.b(this, (byte)0);
    a.xxA.c(this.zpl);
    this.zpj = getIntent().getIntExtra("sns_label_sns_info", -1);
    if (this.zpj == -1)
    {
      finish();
      AppMethodBeat.o(33949);
    }
    while (true)
    {
      return;
      paramBundle = new ia();
      paramBundle.cCX.cyN = this.zpj;
      a.xxA.m(paramBundle);
      this.qBX = paramBundle.cCY.cCZ;
      if ((this.qBX != null) && (((this.qBX.wGz == 3) && (this.qBX.xaB != null) && (this.qBX.xaB.size() > 0)) || ((this.qBX.wGz == 5) && (this.qBX.wFp != null) && (this.qBX.wFp.size() > 0))))
      {
        dIm();
        initView();
      }
      AppMethodBeat.o(33949);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(33953);
    a.xxA.d(this.zpl);
    super.onDestroy();
    AppMethodBeat.o(33953);
  }

  public void onResume()
  {
    AppMethodBeat.i(33952);
    super.onResume();
    if (this.zph != null)
      this.zph.notifyDataSetChanged();
    AppMethodBeat.o(33952);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static final class c
  {
    MaskLayout emP;
    TextView emg;
    TextView nBN;
    TextView zpr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsLabelContactListUI
 * JD-Core Version:    0.6.2
 */