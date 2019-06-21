package com.tencent.mm.plugin.choosemsgfile.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.a.a;
import com.tencent.mm.plugin.choosemsgfile.b.c.e;
import com.tencent.mm.plugin.choosemsgfile.b.c.e.3;
import com.tencent.mm.plugin.choosemsgfile.b.d.b;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.p;

public class ChooseMsgFileListUI extends MMActivity
  implements a
{
  private RecyclerView aiB;
  private String edV;
  private TextView emq;
  private String kux;
  private ProgressDialog kvA;
  private String kvv;
  private e kvw;
  private com.tencent.mm.plugin.choosemsgfile.b.d.a kvx;
  private RelativeLayout kvy;
  private Button kvz;
  private int mCount;

  public ChooseMsgFileListUI()
  {
    AppMethodBeat.i(54417);
    this.kvx = new com.tencent.mm.plugin.choosemsgfile.b.d.a();
    AppMethodBeat.o(54417);
  }

  public static void b(MMActivity paramMMActivity, String paramString1, int paramInt, String paramString2, a.a parama)
  {
    AppMethodBeat.i(54429);
    Intent localIntent = new Intent(paramMMActivity, ChooseMsgFileListUI.class);
    localIntent.putExtra("USERNAME", paramString1);
    localIntent.putExtra("COUNT", paramInt);
    localIntent.putExtra("EXTENSION", paramString2);
    paramMMActivity.ifE = new MMActivity.a()
    {
      public final void c(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(54416);
        ab.i("MicroMsg.ChooseMsgFileListUI", "requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        ab.d("MicroMsg.ChooseMsgFileListUI", "data:%s", new Object[] { paramAnonymousIntent });
        b.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousIntent, this.ktR);
        AppMethodBeat.o(54416);
      }
    };
    paramMMActivity.startActivityForResult(localIntent, 291);
    AppMethodBeat.o(54429);
  }

  private void fE(boolean paramBoolean)
  {
    AppMethodBeat.i(54427);
    ab.i("MicroMsg.ChooseMsgFileListUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.kvA = p.b(this, getString(2131300968), true, null);
      AppMethodBeat.o(54427);
    }
    while (true)
    {
      return;
      if ((this.kvA != null) && (this.kvA.isShowing()))
      {
        this.kvA.dismiss();
        this.kvA = null;
      }
      AppMethodBeat.o(54427);
    }
  }

  public final void bfG()
  {
    AppMethodBeat.i(54428);
    al.d(new ChooseMsgFileListUI.4(this));
    AppMethodBeat.o(54428);
  }

  public final com.tencent.mm.plugin.choosemsgfile.b.d.a bfn()
  {
    return this.kvx;
  }

  public final void fO(boolean paramBoolean)
  {
    AppMethodBeat.i(54424);
    fE(true);
    AppMethodBeat.o(54424);
  }

  public void finish()
  {
    AppMethodBeat.i(54423);
    super.finish();
    overridePendingTransition(2131034229, 2131034227);
    AppMethodBeat.o(54423);
  }

  public final View getChildAt(int paramInt)
  {
    AppMethodBeat.i(54426);
    View localView = this.aiB.getChildAt(paramInt);
    AppMethodBeat.o(54426);
    return localView;
  }

  public final int getLayoutId()
  {
    return 2130969136;
  }

  public final String getUserName()
  {
    return this.edV;
  }

  public final void initView()
  {
    AppMethodBeat.i(54419);
    this.emq = ((TextView)findViewById(2131822748));
    this.aiB = ((RecyclerView)findViewById(2131822749));
    this.kvy = ((RelativeLayout)findViewById(2131822750));
    this.kvz = ((Button)findViewById(2131822751));
    AppMethodBeat.o(54419);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(54418);
    f.m(this);
    super.onCreate(paramBundle);
    overridePendingTransition(2131034229, 2131034227);
    this.edV = getIntent().getStringExtra("USERNAME");
    this.kux = b.mI(this.edV);
    this.mCount = getIntent().getIntExtra("COUNT", 9);
    this.kvv = getIntent().getStringExtra("EXTENSION");
    ab.i("MicroMsg.ChooseMsgFileListUI", "onCreate mCount:%d mExtension:%s", new Object[] { Integer.valueOf(this.mCount), this.kvv });
    this.kvw = new e(this);
    initView();
    findViewById(2131821476).setBackgroundColor(-1);
    this.aiB.setBackgroundColor(-1);
    paramBundle = this.aiB;
    e locale = this.kvw;
    if (locale.jop == null)
      locale.jop = new LinearLayoutManager();
    paramBundle.setLayoutManager(locale.jop);
    this.aiB.a(new e.3(this.kvw));
    this.aiB.setAdapter(this.kvw.bfB());
    this.aiB.setHasFixedSize(true);
    setMMTitle(this.kux);
    setBackBtn(new ChooseMsgFileListUI.1(this));
    addTextOptionMenu(0, getString(2131296868), new ChooseMsgFileListUI.2(this));
    this.kvz.setOnClickListener(new ChooseMsgFileListUI.3(this));
    this.kvw.dx("file", this.kvv);
    f.n(this);
    this.kvx.init(this.mCount);
    AppMethodBeat.o(54418);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(54422);
    super.onDestroy();
    this.kvw.onDestroy();
    this.kvx.uninit();
    AppMethodBeat.o(54422);
  }

  public void onPause()
  {
    AppMethodBeat.i(54421);
    super.onPause();
    this.kvw.onPause();
    AppMethodBeat.o(54421);
  }

  public void onResume()
  {
    AppMethodBeat.i(54420);
    super.onResume();
    this.kvw.onResume();
    AppMethodBeat.o(54420);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void p(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(54425);
    fE(false);
    ab.i("MicroMsg.ChooseMsgFileListUI", "[onDataLoaded] isFirst:%s addCount:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (paramInt <= 0)
    {
      this.emq.setVisibility(0);
      this.aiB.setVisibility(8);
      this.emq.setText(getString(2131298280));
      AppMethodBeat.o(54425);
    }
    while (true)
    {
      return;
      this.emq.setVisibility(8);
      this.aiB.setVisibility(0);
      this.aiB.getAdapter().aop.notifyChanged();
      AppMethodBeat.o(54425);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI
 * JD-Core Version:    0.6.2
 */