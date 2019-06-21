package com.tencent.mm.ui.chatting.gallery;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.au;
import com.tencent.mm.g.a.au.b;
import com.tencent.mm.g.c.eb;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.scanner.b.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.MMGestureGallery;

@com.tencent.mm.ui.base.a(35)
public class TranslationResultUI extends MMActivity
{
  private String cvZ;
  private long cvx;
  private float eX;
  private float eY;
  private int fgI;
  private int fgJ;
  private View jWH;
  private MultiTouchImageView mSF;
  private ImageView mmX;
  private Bitmap qfU;
  private MMGestureGallery qfY;
  private boolean qrd;
  private float scaleX;
  private float scaleY;
  private String yYb;
  private eb yYc;
  private TranslationResultUI.a yYd;
  private View yYe;
  private int yYf;
  private int yYg;
  private ValueAnimator yYh;

  private void dGT()
  {
    AppMethodBeat.i(138656);
    this.qfY.setGalleryScaleListener(new TranslationResultUI.4(this));
    AppMethodBeat.o(138656);
  }

  private void dGU()
  {
    AppMethodBeat.i(138657);
    this.yYh = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.yYh.setDuration(200L).setInterpolator(new DecelerateInterpolator(1.2F));
    this.yYh.addUpdateListener(new TranslationResultUI.5(this));
    this.yYh.addListener(new TranslationResultUI.6(this));
    AppMethodBeat.o(138657);
  }

  private void dGV()
  {
    AppMethodBeat.i(138658);
    if (this.qrd)
      AppMethodBeat.o(138658);
    while (true)
    {
      return;
      this.qrd = true;
      ab.i("MicroMsg.TranslationResultUI", "runExitAnimation");
      this.fgJ = 0;
      this.fgI = 0;
      this.yYf = (this.qfY.getWidth() / 2);
      this.yYg = (this.qfY.getHeight() / 2);
      bi localbi = ((j)g.K(j.class)).bOr().jf(this.cvx);
      au localau = new au();
      localau.ctR.csG = localbi;
      com.tencent.mm.sdk.b.a.xxA.m(localau);
      this.fgJ = localau.ctS.ctV;
      this.fgI = localau.ctS.ctW;
      this.yYf = localau.ctS.ctT;
      this.yYg = localau.ctS.ctU;
      if ((this.yYf == 0) && (this.yYg == 0))
      {
        this.yYf = (this.qfY.getWidth() / 2);
        this.yYg = (this.qfY.getHeight() / 2);
      }
      ab.i("MicroMsg.TranslationResultUI", "thumbLeft %d, thumbTop %d, thumbWidth %d, thumbHeight %d", new Object[] { Integer.valueOf(this.yYf), Integer.valueOf(this.yYg), Integer.valueOf(this.fgJ), Integer.valueOf(this.fgI) });
      this.yYh.start();
      AppMethodBeat.o(138658);
    }
  }

  public boolean convertActivityFromTranslucent()
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130969863;
  }

  public final void initView()
  {
    AppMethodBeat.i(138654);
    this.jWH = findViewById(2131823601);
    this.yYe = ((ViewStub)findViewById(2131825010)).inflate();
    this.mmX = ((ImageView)findViewById(2131822079));
    this.yYb = getIntent().getStringExtra("original_file_path");
    this.cvx = getIntent().getLongExtra("msg_id", -1L);
    ab.i("MicroMsg.TranslationResultUI", "file path %s", new Object[] { this.yYb });
    if (com.tencent.mm.vfs.e.ct(this.yYb))
    {
      this.cvZ = ag.ck(this.yYb + com.tencent.mm.vfs.e.ata(this.yYb));
      ab.i("MicroMsg.TranslationResultUI", "md5 %s", new Object[] { this.cvZ });
      View localView = findViewById(2131825009);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      localLayoutParams.bottomMargin += ae.fr(this);
      localView.setLayoutParams(localLayoutParams);
      getSupportActionBar().hide();
      this.mController.l(this, getResources().getColor(2131690597));
      this.mController.Nb(getResources().getColor(2131690597));
      this.qfY = ((MMGestureGallery)findViewById(2131825008));
      this.yYd = new TranslationResultUI.a(this, (byte)0);
      this.qfY.setAdapter(this.yYd);
      this.qfY.setSingleClickOverListener(new TranslationResultUI.1(this));
      this.yYc = com.tencent.mm.plugin.scanner.e.cgy().cgD().Wf(this.cvZ);
      if (this.yYc == null)
        break label411;
      if (this.qfU != null)
        break label390;
      d.g(new TranslationResultUI.2(this), "decode_translate_result_img");
      label335: this.yYe.findViewById(2131824965).setOnClickListener(new TranslationResultUI.3(this));
      this.yYe.setVisibility(0);
      dGT();
      dGU();
      AppMethodBeat.o(138654);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.TranslationResultUI", "translation original file not exist!");
      break;
      label390: this.yYd.bitmap = this.qfU;
      this.yYd.notifyDataSetChanged();
      break label335;
      label411: ab.e("MicroMsg.TranslationResultUI", "translation result not found!");
      dGV();
      AppMethodBeat.o(138654);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(138653);
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(138653);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(138660);
    super.onDestroy();
    this.qfU = null;
    AppMethodBeat.o(138660);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(138659);
    boolean bool;
    if (paramInt == 4)
    {
      dGV();
      bool = true;
      AppMethodBeat.o(138659);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(138659);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(138655);
    super.onResume();
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
    getWindow().getDecorView().setBackgroundDrawable(null);
    View localView = getWindow().getDecorView();
    int i = 1796;
    if (Build.VERSION.SDK_INT >= 19)
      i = 5892;
    localView.setSystemUiVisibility(i);
    AppMethodBeat.o(138655);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.TranslationResultUI
 * JD-Core Version:    0.6.2
 */