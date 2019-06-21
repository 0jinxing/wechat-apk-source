package com.tencent.mm.plugin.fav.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.j;
import com.tencent.mm.compatible.b.c.a;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.v;
import java.util.LinkedList;

public class FavPostVoiceUI extends MMBaseActivity
{
  private static final int[] gcc = { 2130837686, 2130837687, 2130837688, 2130837689, 2130837690, 2130837691, 2130837692 };
  private static final int[] miN = { 0, 15, 30, 45, 60, 75, 90, 100 };
  private long duration;
  private final ap gci;
  private int iev;
  private long ljM;
  private Button miA;
  private boolean miB;
  private boolean miC;
  private long miD;
  private Toast miE;
  private View miF;
  private View miG;
  private ImageView miH;
  private View miI;
  private View miJ;
  private TextView miK;
  private View miL;
  private j miM;
  private final ak miO;
  private final ap miP;
  boolean miQ;
  private String path;

  public FavPostVoiceUI()
  {
    AppMethodBeat.i(74050);
    this.miD = -1L;
    this.gci = new ap(new ap.a()
    {
      public final boolean BI()
      {
        int i = 0;
        AppMethodBeat.i(74041);
        j localj = FavPostVoiceUI.a(FavPostVoiceUI.this);
        int j;
        if (localj.status == 1)
        {
          j = localj.crg.getMaxAmplitude();
          if (j > j.cri)
            j.cri = j;
          j = j * 100 / j.cri;
        }
        while (true)
        {
          if (i < FavPostVoiceUI.gcc.length)
          {
            if ((j >= FavPostVoiceUI.bvK()[i]) && (j < FavPostVoiceUI.bvK()[(i + 1)]))
              FavPostVoiceUI.b(FavPostVoiceUI.this).setBackgroundResource(FavPostVoiceUI.gcc[i]);
          }
          else
          {
            AppMethodBeat.o(74041);
            return true;
            j = 0;
            continue;
          }
          i++;
        }
      }
    }
    , true);
    this.miO = new FavPostVoiceUI.6(this);
    this.miP = new ap(new FavPostVoiceUI.7(this), true);
    this.miQ = false;
    AppMethodBeat.o(74050);
  }

  private j bvF()
  {
    AppMethodBeat.i(74052);
    Object localObject = c.a.eoR;
    localObject = new j();
    ((j)localObject).crh = new FavPostVoiceUI.4(this);
    AppMethodBeat.o(74052);
    return localObject;
  }

  private void bvG()
  {
    long l = 0L;
    AppMethodBeat.i(74053);
    if (!this.miB)
    {
      AppMethodBeat.o(74053);
      return;
    }
    this.miA.setKeepScreenOn(true);
    this.miA.setBackgroundResource(2130840008);
    this.miA.setText(2131299690);
    this.miM.EB();
    label63: int i;
    label81: String str;
    if (this.ljM == 0L)
    {
      this.duration = l;
      if (this.duration >= 800L)
        break label165;
      i = 1;
      this.gci.stopTimer();
      this.miP.stopTimer();
      if (i != 0)
        break label296;
      str = this.path;
      i = (int)this.duration;
      if (!bo.isNullOrNil(str))
        break label170;
      ab.e("MicroMsg.FavPostLogic", "postVoice path null");
      label126: setResult(-1);
      finish();
      overridePendingTransition(0, 0);
    }
    while (true)
    {
      this.miB = false;
      AppMethodBeat.o(74053);
      break;
      l = bo.az(this.ljM);
      break label63;
      label165: i = 0;
      break label81;
      label170: g localg = new g();
      localg.field_type = 3;
      localg.field_sourceType = 6;
      h.E(localg);
      aar localaar = new aar();
      localaar.akV(str);
      localaar.LD(i);
      localaar.oY(true);
      localaar.LE(localg.field_type);
      localaar.akR("amr");
      localg.field_favProto.wiv.add(localaar);
      b.B(localg);
      com.tencent.mm.plugin.report.service.h.pYm.e(10648, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
      break label126;
      label296: bvI();
      this.miA.setEnabled(false);
      this.miA.setBackgroundResource(2130840007);
      this.miG.setVisibility(0);
      this.miF.setVisibility(8);
      this.miO.sendEmptyMessageDelayed(0, 500L);
    }
  }

  private void bvI()
  {
    AppMethodBeat.i(74055);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(this.path);
    if (localb.exists())
      localb.delete();
    AppMethodBeat.o(74055);
  }

  private void bvJ()
  {
    AppMethodBeat.i(74060);
    if (this.miQ)
      AppMethodBeat.o(74060);
    while (true)
    {
      return;
      this.miQ = true;
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
      localTranslateAnimation.setDuration(300L);
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
      localAlphaAnimation.setDuration(300L);
      localTranslateAnimation.setAnimationListener(new FavPostVoiceUI.8(this));
      findViewById(2131823954).setVisibility(8);
      findViewById(2131823964).setVisibility(8);
      this.miL.setVisibility(8);
      this.miL.startAnimation(localAlphaAnimation);
      findViewById(2131823954).startAnimation(localAlphaAnimation);
      findViewById(2131823964).startAnimation(localTranslateAnimation);
      AppMethodBeat.o(74060);
    }
  }

  public final void bvH()
  {
    AppMethodBeat.i(74054);
    this.miF.setVisibility(0);
    this.miG.setVisibility(8);
    this.miJ.setVisibility(8);
    this.miI.setVisibility(0);
    this.miK.setText(2131299585);
    this.miA.setBackgroundResource(2130840009);
    this.miA.setText(2131299690);
    this.miH.setVisibility(4);
    this.miB = false;
    AppMethodBeat.o(74054);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74051);
    super.onCreate(paramBundle);
    setContentView(v.hu(this).inflate(2130969523, null));
    this.miH = ((ImageView)findViewById(2131823958));
    this.miI = findViewById(2131823956);
    this.miJ = findViewById(2131823960);
    this.miF = findViewById(2131823955);
    this.miG = findViewById(2131823963);
    this.miK = ((TextView)findViewById(2131823959));
    this.miL = findViewById(2131823953);
    findViewById(2131823954).setVisibility(8);
    this.miL.setVisibility(8);
    findViewById(2131823954).setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(74042);
        FavPostVoiceUI.c(FavPostVoiceUI.this);
        AppMethodBeat.o(74042);
        return false;
      }
    });
    findViewById(2131823964).setVisibility(8);
    this.miM = bvF();
    this.miA = ((Button)findViewById(2131823965));
    this.miA.setOnTouchListener(new FavPostVoiceUI.5(this));
    bvH();
    paramBundle = com.tencent.mm.plugin.fav.a.b.bun();
    Object localObject = new com.tencent.mm.vfs.b(paramBundle);
    if (!((com.tencent.mm.vfs.b)localObject).exists())
      ((com.tencent.mm.vfs.b)localObject).mkdirs();
    do
      localObject = paramBundle + "/" + System.currentTimeMillis();
    while (new com.tencent.mm.vfs.b((String)localObject).exists());
    this.path = ((String)localObject);
    this.miK.post(new FavPostVoiceUI.3(this));
    AppMethodBeat.o(74051);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74056);
    super.onDestroy();
    AppMethodBeat.o(74056);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(74059);
    boolean bool;
    if (4 == paramInt)
    {
      bvJ();
      bool = true;
      AppMethodBeat.o(74059);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(74059);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(74058);
    super.onPause();
    bvG();
    AppMethodBeat.o(74058);
  }

  public void onResume()
  {
    AppMethodBeat.i(74057);
    super.onResume();
    AppMethodBeat.o(74057);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavPostVoiceUI
 * JD-Core Version:    0.6.2
 */