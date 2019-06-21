package com.tencent.mm.plugin.wear.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.wear.model.d.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.concurrent.atomic.AtomicInteger;

public class WearYoUI extends Activity
{
  private ImageView ejo;
  private TextView ejp;
  private Vibrator kgA;
  private c sWj;
  private ImageView tYQ;
  private ImageView tYR;
  private ImageView tYS;
  private ObjectAnimator[][] tYT;
  private c tYU;
  private boolean tYV;
  private AtomicInteger tYW;
  private Runnable tYX;
  private BroadcastReceiver tYY;
  private String username;

  public WearYoUI()
  {
    AppMethodBeat.i(26471);
    this.tYT = new ObjectAnimator[3][3];
    this.tYU = new WearYoUI.2(this);
    this.tYW = new AtomicInteger();
    this.tYX = new WearYoUI.3(this);
    this.tYY = new WearYoUI.4(this);
    this.sWj = new WearYoUI.5(this);
    AppMethodBeat.o(26471);
  }

  private void a(int paramInt, ImageView paramImageView, long paramLong)
  {
    AppMethodBeat.i(26473);
    this.tYT[paramInt][0] = ObjectAnimator.ofFloat(paramImageView, "scaleX", new float[] { 1.0F, 2.5F });
    this.tYT[paramInt][0].setRepeatCount(-1);
    this.tYT[paramInt][0].setStartDelay(paramLong);
    this.tYT[paramInt][0].setDuration(3900L);
    this.tYT[paramInt][0].start();
    this.tYT[paramInt][1] = ObjectAnimator.ofFloat(paramImageView, "scaleY", new float[] { 1.0F, 2.5F });
    this.tYT[paramInt][1].setRepeatCount(-1);
    this.tYT[paramInt][1].setStartDelay(paramLong);
    this.tYT[paramInt][1].setDuration(3900L);
    this.tYT[paramInt][1].start();
    this.tYT[paramInt][2] = ObjectAnimator.ofFloat(paramImageView, "alpha", new float[] { 1.0F, 0.0F });
    this.tYT[paramInt][2].setRepeatCount(-1);
    this.tYT[paramInt][2].setInterpolator(new AccelerateInterpolator());
    this.tYT[paramInt][2].setStartDelay(paramLong);
    this.tYT[paramInt][2].setDuration(3900L);
    this.tYT[paramInt][2].start();
    AppMethodBeat.o(26473);
  }

  public void onClickCheck(View paramView)
  {
    AppMethodBeat.i(26474);
    ab.i("MicroMsg.Wear.WearYoUI", "onClickCheck %s", new Object[] { this.username });
    paramView = new b(this.username);
    aw.Rg().a(paramView, 0);
    finish();
    AppMethodBeat.o(26474);
  }

  public void onClickNoCheck(View paramView)
  {
    AppMethodBeat.i(26475);
    ab.i("MicroMsg.Wear.WearYoUI", "onClickNoCheck %s", new Object[] { this.username });
    finish();
    AppMethodBeat.o(26475);
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26472);
    super.onCreate(paramBundle);
    getWindow().addFlags(4718592);
    setContentView(2130971200);
    this.kgA = ((Vibrator)getSystemService("vibrator"));
    this.username = getIntent().getStringExtra("key_talker");
    this.ejo = ((ImageView)findViewById(2131821183));
    this.ejp = ((TextView)findViewById(2131823149));
    this.tYQ = ((ImageView)findViewById(2131829145));
    this.tYR = ((ImageView)findViewById(2131829146));
    this.tYS = ((ImageView)findViewById(2131829147));
    a.b.r(this.ejo, this.username);
    this.ejp.setText(s.mJ(this.username));
    this.ejo.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(26462);
        com.tencent.mm.plugin.wear.model.a.cUn();
        paramAnonymousView = WearYoUI.a(WearYoUI.this);
        ab.i("MicroMsg.wear.WearYoLogic", "click avatarIV %s", new Object[] { paramAnonymousView });
        Intent localIntent = new Intent();
        localIntent.putExtra("Main_User", paramAnonymousView);
        localIntent.putExtra("From_fail_notify", true);
        localIntent.addFlags(536870912);
        localIntent.addFlags(67108864);
        d.f(ah.getContext(), "com.tencent.mm.ui.LauncherUI", localIntent);
        WearYoUI.this.finish();
        AppMethodBeat.o(26462);
      }
    });
    com.tencent.mm.sdk.b.a.xxA.c(this.tYU);
    com.tencent.mm.sdk.b.a.xxA.c(this.sWj);
    a(0, this.tYQ, 0L);
    a(1, this.tYR, 1300L);
    a(2, this.tYS, 2600L);
    this.kgA.vibrate(200L);
    registerReceiver(this.tYY, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    overridePendingTransition(2131034158, 2131034159);
    AppMethodBeat.o(26472);
  }

  protected void onDestroy()
  {
    AppMethodBeat.i(26476);
    for (int i = 0; i < this.tYT.length; i++)
      for (int j = 0; j < this.tYT[i].length; j++)
        this.tYT[i][j].cancel();
    unregisterReceiver(this.tYY);
    com.tencent.mm.sdk.b.a.xxA.d(this.sWj);
    com.tencent.mm.sdk.b.a.xxA.d(this.tYU);
    com.tencent.mm.plugin.wear.model.a.cUn().tXA.cUD();
    super.onDestroy();
    AppMethodBeat.o(26476);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.ui.WearYoUI
 * JD-Core Version:    0.6.2
 */