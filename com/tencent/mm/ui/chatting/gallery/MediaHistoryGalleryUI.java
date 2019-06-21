package com.tencent.mm.ui.chatting.gallery;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.e.b;
import com.tencent.matrix.trace.f.c;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.chatting.e.a.a;
import com.tencent.mm.ui.chatting.e.a.b;
import com.tencent.mm.ui.chatting.e.a.c;
import com.tencent.mm.ui.q;

public class MediaHistoryGalleryUI extends MMActivity
  implements View.OnClickListener, a.b
{
  private RecyclerView aiB;
  private long eEO;
  private int ehv;
  private String emo;
  private TextView emq;
  private long fAq;
  private ProgressDialog kvA;
  private boolean kvO;
  private int kvP;
  private TextView mnJ;
  private boolean mnK;
  private int mnL;
  private b mnM;
  private long yNB;
  private View yUN;
  private View yUP;
  private View yUQ;
  private View yUR;
  private View yUS;
  private a.a yXO;
  private boolean yXP;
  private boolean yXQ;
  private boolean yXR;

  public MediaHistoryGalleryUI()
  {
    AppMethodBeat.i(32417);
    this.mnK = false;
    this.mnL = -1;
    this.kvO = true;
    this.eEO = 0L;
    this.fAq = 0L;
    this.mnM = new MediaHistoryGalleryUI.1(this);
    AppMethodBeat.o(32417);
  }

  private void Ph(int paramInt)
  {
    AppMethodBeat.i(32436);
    if ((this.yXO.bwy()) && (paramInt > 0))
    {
      this.yUP.setEnabled(true);
      this.yUQ.setEnabled(true);
      this.yUR.setEnabled(true);
      this.yUS.setEnabled(true);
      AppMethodBeat.o(32436);
    }
    while (true)
    {
      return;
      this.yUP.setEnabled(false);
      this.yUQ.setEnabled(false);
      this.yUR.setEnabled(false);
      this.yUS.setEnabled(false);
      AppMethodBeat.o(32436);
    }
  }

  private void dGJ()
  {
    AppMethodBeat.i(32428);
    this.yUN = findViewById(2131824973);
    this.yUQ = findViewById(2131823944);
    this.yUS = findViewById(2131822772);
    this.yUR = findViewById(2131824975);
    this.yUP = findViewById(2131824974);
    this.yUP.setTag(Integer.valueOf(1));
    this.yUQ.setTag(Integer.valueOf(0));
    this.yUR.setTag(Integer.valueOf(3));
    this.yUS.setTag(Integer.valueOf(2));
    this.yUP.setOnClickListener(this);
    this.yUQ.setOnClickListener(this);
    this.yUR.setOnClickListener(this);
    this.yUS.setOnClickListener(this);
    AppMethodBeat.o(32428);
  }

  private void y(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(32437);
    ab.i("MicroMsg.MediaHistoryGalleryUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      String str = paramString;
      if (paramString == null)
        str = getString(2131300968);
      this.kvA = p.b(this, str, true, null);
      AppMethodBeat.o(32437);
    }
    while (true)
    {
      return;
      if ((this.kvA != null) && (this.kvA.isShowing()))
      {
        this.kvA.dismiss();
        this.kvA = null;
      }
      AppMethodBeat.o(32437);
    }
  }

  public final void OI(int paramInt)
  {
    AppMethodBeat.i(32435);
    bwr();
    y(false, "");
    int i = paramInt;
    if (paramInt == 0)
      i = 2131300205;
    if (this.yXR)
      h.a(this, i, 2131297061, true, null);
    this.yXR = false;
    AppMethodBeat.o(32435);
  }

  public final void bwq()
  {
    AppMethodBeat.i(32430);
    this.yXO.bwq();
    setMMTitle(getString(2131300207, new Object[] { Integer.valueOf(this.yXO.dFB()) }));
    this.yUN.setVisibility(0);
    this.yUN.startAnimation(AnimationUtils.loadAnimation(this, 2131034229));
    Ph(this.yXO.dFB());
    removeOptionMenu(0);
    addTextOptionMenu(0, getString(2131300171), new MediaHistoryGalleryUI.5(this));
    AppMethodBeat.o(32430);
  }

  public final void bwr()
  {
    AppMethodBeat.i(32431);
    this.yXO.bwr();
    setMMTitle(this.yXO.aoy());
    this.yUN.setVisibility(8);
    this.yUN.startAnimation(AnimationUtils.loadAnimation(this, 2131034227));
    removeOptionMenu(0);
    addTextOptionMenu(0, getString(2131300172), new MediaHistoryGalleryUI.6(this));
    AppMethodBeat.o(32431);
  }

  public final void dFC()
  {
    AppMethodBeat.i(32433);
    bwr();
    this.yXR = false;
    y(false, "");
    AppMethodBeat.o(32433);
  }

  public final void dFD()
  {
    AppMethodBeat.i(32432);
    this.yXR = true;
    y(true, getString(2131300606));
    AppMethodBeat.o(32432);
  }

  public final void dFE()
  {
    AppMethodBeat.i(32434);
    bwr();
    this.yXR = false;
    y(false, "");
    String str = e.euR;
    Toast.makeText(this, getString(2131298211, new Object[] { str.substring(str.indexOf("tencent/MicroMsg")) }), 1).show();
    AppMethodBeat.o(32434);
  }

  public final boolean dFF()
  {
    return this.yXR;
  }

  public final void fO(boolean paramBoolean)
  {
    AppMethodBeat.i(32423);
    if (paramBoolean)
    {
      y(true, null);
      AppMethodBeat.o(32423);
    }
    while (true)
    {
      return;
      this.kvP = ((GridLayoutManager)this.aiB.getLayoutManager()).iS();
      AppMethodBeat.o(32423);
    }
  }

  public final View getChildAt(int paramInt)
  {
    AppMethodBeat.i(32425);
    View localView = this.aiB.getChildAt(paramInt);
    AppMethodBeat.o(32425);
    return localView;
  }

  public final int getLayoutId()
  {
    return 2130970080;
  }

  public final void initView()
  {
    AppMethodBeat.i(32422);
    super.initView();
    dGJ();
    this.mnJ = ((TextView)findViewById(2131823946));
    this.emq = ((TextView)findViewById(2131821477));
    this.aiB = ((RecyclerView)findViewById(2131821478));
    this.aiB.setBackgroundColor(getResources().getColor(2131689663));
    findViewById(2131821476).setBackgroundColor(getResources().getColor(2131689663));
    this.aiB.setLayoutManager(this.yXO.bfC());
    this.aiB.a(this.yXO.dN(this));
    this.aiB.setAdapter(this.yXO.aT(this.emo, this.yNB));
    this.aiB.setHasFixedSize(true);
    this.aiB.setOnScrollListener(new MediaHistoryGalleryUI.2(this));
    this.aiB.a(new MediaHistoryGalleryUI.3(this));
    setMMTitle(this.yXO.aoy());
    setBackBtn(new MediaHistoryGalleryUI.4(this));
    AppMethodBeat.o(32422);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(32429);
    super.onBackPressed();
    ab.i("MicroMsg.MediaHistoryGalleryUI", "[onBackPressed] ");
    if (this.yXR)
    {
      this.yXO.dFC();
      AppMethodBeat.o(32429);
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(32429);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(32427);
    this.yXO.vH(((Integer)paramView.getTag()).intValue());
    AppMethodBeat.o(32427);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(32418);
    f.m(this);
    super.onCreate(paramBundle);
    this.mnK = true;
    paramBundle = getIntent();
    boolean bool;
    if (paramBundle.getIntExtra("kintent_intent_source", 0) == 1)
    {
      bool = true;
      this.yXP = bool;
      this.emo = paramBundle.getStringExtra("kintent_talker");
      this.mnL = paramBundle.getIntExtra("kintent_image_index", -1);
      this.yXQ = paramBundle.getBooleanExtra("key_is_biz_chat", false);
      this.yNB = getIntent().getLongExtra("key_biz_chat_id", -1L);
      switch (getIntent().getIntExtra("key_media_type", -1))
      {
      default:
      case 1:
      }
    }
    for (paramBundle = MediaHistoryGalleryUI.a.a(this, a.c.yTC); ; paramBundle = MediaHistoryGalleryUI.a.a(this, a.c.yTC))
    {
      paramBundle.a(this);
      xE(this.mController.ylL.getResources().getColor(2131689913));
      Nb(this.mController.ylL.getResources().getColor(2131689913));
      initView();
      this.yXO.s(true, this.mnL);
      f.n(this);
      AppMethodBeat.o(32418);
      return;
      bool = false;
      break;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(32421);
    super.onDestroy();
    this.yXO.onDetach();
    AppMethodBeat.o(32421);
  }

  public void onPause()
  {
    AppMethodBeat.i(32420);
    super.onPause();
    WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcMediaGalleryScrollEnable, this.ehv);
    this.ehv = 0;
    if ((com.tencent.matrix.a.isInstalled()) && (com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class) != null))
    {
      c localc = ((com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class)).bYx;
      if (localc != null)
        localc.b(this.mnM);
    }
    if (bo.anT() > this.fAq);
    for (long l = bo.anT() - this.fAq; ; l = 1L)
    {
      this.fAq = l;
      WXHardCoderJNI.reportFPS(703, WXHardCoderJNI.hcMediaGalleryScrollAction, 1, this.eEO, this.fAq);
      this.eEO = 0L;
      this.fAq = 0L;
      AppMethodBeat.o(32420);
      return;
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(32419);
    this.fAq = bo.anT();
    if ((com.tencent.matrix.a.isInstalled()) && (com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class) != null))
    {
      c localc = ((com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class)).bYx;
      if (localc != null)
        localc.a(this.mnM);
    }
    super.onResume();
    this.yXO.onResume();
    if (this.mnK)
    {
      if (!this.yXO.bwy())
        break label107;
      bwq();
    }
    while (true)
    {
      this.mnK = false;
      AppMethodBeat.o(32419);
      return;
      label107: bwr();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void p(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(32424);
    ab.i("MicroMsg.MediaHistoryGalleryUI", "[onDataLoaded] isFirst:%s addCount:%s mIntentPos:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Integer.valueOf(this.mnL) });
    int i;
    if (paramBoolean)
    {
      y(false, null);
      this.aiB.getAdapter().aop.notifyChanged();
      if (this.mnL > 0)
      {
        if (this.mnL % 4 == 0)
          this.mnL += 1;
        i = this.aiB.getAdapter().getItemCount();
        this.aiB.bY(Math.min(i - 1, this.mnL));
        if (paramInt > 0)
          break label185;
        this.emq.setVisibility(0);
        this.aiB.setVisibility(8);
        this.emq.setText(getString(2131298210));
        AppMethodBeat.o(32424);
      }
    }
    while (true)
    {
      return;
      i = this.aiB.getAdapter().getItemCount();
      this.aiB.bY(i - 1);
      break;
      label185: this.emq.setVisibility(8);
      this.aiB.setVisibility(0);
      AppMethodBeat.o(32424);
      continue;
      if (paramInt > 0)
      {
        this.aiB.getAdapter().at(0, paramInt);
        this.aiB.getAdapter().ar(paramInt, this.kvP + paramInt);
        AppMethodBeat.o(32424);
      }
      else
      {
        this.aiB.getAdapter().cg(0);
        AppMethodBeat.o(32424);
      }
    }
  }

  public final void vF(int paramInt)
  {
    AppMethodBeat.i(32426);
    setMMTitle(getString(2131300207, new Object[] { Integer.valueOf(paramInt) }));
    Ph(paramInt);
    AppMethodBeat.o(32426);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI
 * JD-Core Version:    0.6.2
 */