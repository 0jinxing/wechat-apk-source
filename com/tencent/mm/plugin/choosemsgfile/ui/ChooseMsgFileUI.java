package com.tencent.mm.plugin.choosemsgfile.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.a.a;
import com.tencent.mm.plugin.choosemsgfile.b.c.f.4;
import com.tencent.mm.plugin.choosemsgfile.b.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.p;

public class ChooseMsgFileUI extends MMActivity
  implements a
{
  private String edV;
  private TextView emq;
  private String kux;
  private ProgressDialog kvA;
  private com.tencent.mm.plugin.choosemsgfile.b.c.f kvH;
  private TextView kvI;
  private RecyclerView kvJ;
  private TextView kvK;
  private TextView kvL;
  private ImageButton kvM;
  private TextView kvN;
  private boolean kvO;
  private int kvP;
  private String kvv;
  private com.tencent.mm.plugin.choosemsgfile.b.d.a kvx;
  private RelativeLayout kvy;
  private Button kvz;
  private int mCount;
  private String mType;

  public ChooseMsgFileUI()
  {
    AppMethodBeat.i(54457);
    this.kvx = new com.tencent.mm.plugin.choosemsgfile.b.d.a();
    this.kvO = true;
    AppMethodBeat.o(54457);
  }

  private void HM(String paramString)
  {
    AppMethodBeat.i(54463);
    if (("image".equals(paramString)) || ("all".equals(paramString)))
    {
      this.kvM.setVisibility(0);
      this.kvN.setVisibility(0);
      if (!"all".equals(this.mType))
        break label97;
      this.kvK.setVisibility(0);
      this.kvL.setVisibility(0);
      HN(paramString);
      AppMethodBeat.o(54463);
    }
    while (true)
    {
      return;
      this.kvM.setVisibility(4);
      this.kvN.setVisibility(4);
      break;
      label97: this.kvK.setVisibility(4);
      this.kvL.setVisibility(4);
      AppMethodBeat.o(54463);
    }
  }

  private void HN(String paramString)
  {
    AppMethodBeat.i(54464);
    if ("all".equals(paramString))
    {
      this.kvL.setText("");
      AppMethodBeat.o(54464);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    if ("image".equals(paramString))
      localStringBuilder.append(getString(2131298284));
    while (true)
    {
      localStringBuilder.append(")");
      this.kvL.setText(localStringBuilder.toString());
      AppMethodBeat.o(54464);
      break;
      if ("video".equals(paramString))
        localStringBuilder.append(getString(2131298285));
      else if ("file".equals(paramString))
        localStringBuilder.append(getString(2131298283));
    }
  }

  public static void a(MMActivity paramMMActivity, String paramString1, String paramString2, int paramInt, String paramString3, a.a parama)
  {
    AppMethodBeat.i(54470);
    Intent localIntent = new Intent(paramMMActivity, ChooseMsgFileUI.class);
    localIntent.putExtra("USERNAME", paramString1);
    localIntent.putExtra("TYPE", paramString2);
    localIntent.putExtra("COUNT", paramInt);
    localIntent.putExtra("EXTENSION", paramString3);
    paramMMActivity.ifE = new ChooseMsgFileUI.4(parama);
    paramMMActivity.startActivityForResult(localIntent, 291);
    AppMethodBeat.o(54470);
  }

  private void fP(boolean paramBoolean)
  {
    AppMethodBeat.i(54466);
    ab.i("MicroMsg.ChooseMsgFileUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.kvA = p.b(this, getString(2131300968), true, null);
      AppMethodBeat.o(54466);
    }
    while (true)
    {
      return;
      if ((this.kvA != null) && (this.kvA.isShowing()))
      {
        this.kvA.dismiss();
        this.kvA = null;
      }
      AppMethodBeat.o(54466);
    }
  }

  public final void bfG()
  {
    AppMethodBeat.i(54468);
    al.d(new ChooseMsgFileUI.3(this));
    AppMethodBeat.o(54468);
  }

  public final com.tencent.mm.plugin.choosemsgfile.b.d.a bfn()
  {
    return this.kvx;
  }

  public final void fO(boolean paramBoolean)
  {
    AppMethodBeat.i(54465);
    if (paramBoolean)
    {
      fP(true);
      AppMethodBeat.o(54465);
    }
    while (true)
    {
      return;
      this.kvP = ((GridLayoutManager)this.kvJ.getLayoutManager()).iS();
      AppMethodBeat.o(54465);
    }
  }

  public final View getChildAt(int paramInt)
  {
    AppMethodBeat.i(54469);
    View localView = this.kvJ.getChildAt(paramInt);
    AppMethodBeat.o(54469);
    return localView;
  }

  public final int getLayoutId()
  {
    return 2130969137;
  }

  public final String getUserName()
  {
    return this.edV;
  }

  public final void initView()
  {
    AppMethodBeat.i(54462);
    this.emq = ((TextView)findViewById(2131822748));
    this.kvI = ((TextView)findViewById(2131820787));
    this.kvJ = ((RecyclerView)findViewById(2131822749));
    this.kvy = ((RelativeLayout)findViewById(2131822750));
    this.kvK = ((TextView)findViewById(2131822753));
    this.kvL = ((TextView)findViewById(2131822754));
    this.kvM = ((ImageButton)findViewById(2131822755));
    this.kvN = ((TextView)findViewById(2131822756));
    this.kvz = ((Button)findViewById(2131822751));
    AppMethodBeat.o(54462);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(54458);
    com.tencent.mm.pluginsdk.f.m(this);
    super.onCreate(paramBundle);
    this.edV = getIntent().getStringExtra("USERNAME");
    this.kux = b.mI(this.edV);
    this.mType = b.HK(getIntent().getStringExtra("TYPE"));
    this.mCount = getIntent().getIntExtra("COUNT", 9);
    this.kvv = getIntent().getStringExtra("EXTENSION");
    ab.i("MicroMsg.ChooseMsgFileUI", "select msg file from username:%s nickname:%s, type:%s, count:%d", new Object[] { this.edV, this.kux, this.mType, Integer.valueOf(this.mCount) });
    ab.i("MicroMsg.ChooseMsgFileUI", "select msg file from extension:%s", new Object[] { this.kvv });
    this.kvx.init(this.mCount);
    this.kvH = new com.tencent.mm.plugin.choosemsgfile.b.c.f(this);
    initView();
    this.kvJ.setLayoutManager(this.kvH.bfC());
    this.kvJ.a(new f.4(this.kvH, this));
    this.kvJ.setAdapter(this.kvH.bfB());
    this.kvJ.setHasFixedSize(true);
    this.kvJ.a(new ChooseMsgFileUI.2(this));
    setMMTitle(this.kux);
    setBackBtn(new ChooseMsgFileUI.1(this));
    addTextOptionMenu(0, getString(2131296868), new ChooseMsgFileUI.5(this));
    this.kvM.setOnClickListener(new ChooseMsgFileUI.6(this));
    this.kvN.setOnClickListener(new ChooseMsgFileUI.7(this));
    this.kvK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(54451);
        ChooseMsgFileUI.c(ChooseMsgFileUI.this);
        AppMethodBeat.o(54451);
      }
    });
    this.kvL.setOnClickListener(new ChooseMsgFileUI.9(this));
    this.kvz.setOnClickListener(new ChooseMsgFileUI.10(this));
    this.kvH.dx(this.mType, this.kvv);
    HM(this.mType);
    com.tencent.mm.pluginsdk.f.n(this);
    AppMethodBeat.o(54458);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(54461);
    super.onDestroy();
    this.kvH.onDestroy();
    this.kvx.uninit();
    AppMethodBeat.o(54461);
  }

  public void onPause()
  {
    AppMethodBeat.i(54460);
    super.onPause();
    ab.i("MicroMsg.ChooseMsgFileUIController", "onPause");
    AppMethodBeat.o(54460);
  }

  public void onResume()
  {
    AppMethodBeat.i(54459);
    super.onResume();
    this.kvH.onResume();
    AppMethodBeat.o(54459);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void p(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(54467);
    ab.i("MicroMsg.ChooseMsgFileUI", "[onDataLoaded] isFirst:%s addCount:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (paramBoolean)
    {
      fP(false);
      this.kvJ.getAdapter().aop.notifyChanged();
      int i = this.kvJ.getAdapter().getItemCount();
      this.kvJ.bY(i - 1);
      if (paramInt <= 0)
      {
        this.emq.setVisibility(0);
        this.kvJ.setVisibility(8);
        this.emq.setText(getString(2131298280));
        AppMethodBeat.o(54467);
      }
    }
    while (true)
    {
      return;
      this.emq.setVisibility(8);
      this.kvJ.setVisibility(0);
      AppMethodBeat.o(54467);
      continue;
      if (paramInt > 0)
      {
        this.kvJ.getAdapter().at(0, paramInt);
        this.kvJ.getAdapter().ar(paramInt, this.kvP + paramInt);
        AppMethodBeat.o(54467);
      }
      else
      {
        this.kvJ.getAdapter().cg(0);
        AppMethodBeat.o(54467);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI
 * JD-Core Version:    0.6.2
 */