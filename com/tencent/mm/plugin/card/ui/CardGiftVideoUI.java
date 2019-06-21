package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.card.d.a.a;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

@com.tencent.mm.ui.base.a(3)
public class CardGiftVideoUI extends MMActivity
  implements a.a, e.a
{
  private j contextMenuHelper;
  int duration;
  private boolean eif;
  private Bundle jWy;
  private boolean jYD;
  private com.tencent.mm.ui.tools.e jYE;
  private CardGiftInfo kkk;
  private ImageView kkl;
  private ProgressBar kko;
  private ak kkp;
  private int kkq;
  private int kkr;
  private int kks;
  private int kkt;
  private RelativeLayout klp;
  private com.tencent.mm.pluginsdk.ui.tools.e klq;
  private RelativeLayout klr;
  private ImageView kls;
  TextView klt;
  private MMPinProgressBtn klu;
  private TextView klv;
  private ap klw;
  private String videoPath;

  public CardGiftVideoUI()
  {
    AppMethodBeat.i(88461);
    this.kkp = new ak(Looper.getMainLooper());
    this.jYD = false;
    this.kkq = 0;
    this.kkr = 0;
    this.kks = 0;
    this.kkt = 0;
    this.klw = new ap(new CardGiftVideoUI.10(this), true);
    this.duration = 0;
    AppMethodBeat.o(88461);
  }

  private void GT(String paramString)
  {
    AppMethodBeat.i(88463);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.CardGiftVideoUI", "the videoPath is null, fail~!!!");
      setResult(0);
      finish();
      AppMethodBeat.o(88463);
    }
    while (true)
    {
      return;
      if (!com.tencent.mm.vfs.e.ct(paramString))
      {
        ab.e("MicroMsg.CardGiftVideoUI", "the videoPath is %s, the file isn't exist~!!!", new Object[] { paramString });
        setResult(0);
        finish();
        AppMethodBeat.o(88463);
      }
      else
      {
        this.klq.setVideoPath(paramString);
        AppMethodBeat.o(88463);
      }
    }
  }

  private void bdd()
  {
    AppMethodBeat.i(88464);
    if (this.contextMenuHelper == null)
      this.contextMenuHelper = new j(this.mController.ylL);
    if (bo.isNullOrNil(this.videoPath))
    {
      ab.e("MicroMsg.CardGiftVideoUI", "videoPath is null");
      AppMethodBeat.o(88464);
    }
    while (true)
    {
      return;
      this.contextMenuHelper.a((VideoTextureView)this.klq, new CardGiftVideoUI.1(this), new n.d()
      {
        public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          AppMethodBeat.i(88452);
          switch (paramAnonymousMenuItem.getItemId())
          {
          default:
          case 0:
          }
          while (true)
          {
            AppMethodBeat.o(88452);
            while (true)
            {
              return;
              paramAnonymousMenuItem = u.uu(CardGiftVideoUI.a(CardGiftVideoUI.this));
              if (!bo.isNullOrNil(paramAnonymousMenuItem))
                break;
              Toast.makeText(CardGiftVideoUI.this, CardGiftVideoUI.this.getString(2131304256), 1).show();
              AppMethodBeat.o(88452);
            }
            Toast.makeText(CardGiftVideoUI.this, CardGiftVideoUI.this.getString(2131304257, new Object[] { paramAnonymousMenuItem }), 1).show();
            n.a(paramAnonymousMenuItem, CardGiftVideoUI.this);
          }
        }
      });
      AppMethodBeat.o(88464);
    }
  }

  public final void EA()
  {
    AppMethodBeat.i(88474);
    ab.i("MicroMsg.CardGiftVideoUI", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    this.klq.B(0.0D);
    AppMethodBeat.o(88474);
  }

  public final void GS(String paramString)
  {
  }

  public final void bN(String paramString, int paramInt)
  {
    AppMethodBeat.i(88475);
    if (paramString.equals(this.kkk.kco))
      this.kkp.post(new CardGiftVideoUI.2(this, paramInt));
    AppMethodBeat.o(88475);
  }

  public final void bcW()
  {
    AppMethodBeat.i(88471);
    this.jYE.L(this.kkr, this.kkq, this.kks, this.kkt);
    this.jYE.a(this.klp, this.kkl, new CardGiftVideoUI.9(this), null);
    AppMethodBeat.o(88471);
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(88470);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.CardGiftVideoUI", "dispatchKeyEvent");
      bcW();
      bool = true;
      AppMethodBeat.o(88470);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(88470);
    }
  }

  public final void dr(String paramString1, String paramString2)
  {
    AppMethodBeat.i(88476);
    if (paramString1.equals(this.kkk.kco))
    {
      this.kkp.post(new CardGiftVideoUI.3(this, paramString2));
      AppMethodBeat.o(88476);
    }
    while (true)
    {
      return;
      if (paramString1.equals(this.kkk.kcp))
      {
        this.kkp.post(new CardGiftVideoUI.4(this, paramString2));
        AppMethodBeat.o(88476);
      }
      else
      {
        ab.i("MicroMsg.CardGiftVideoUI", "fieldId:%s is unsuitable", new Object[] { paramString1 });
        AppMethodBeat.o(88476);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130968927;
  }

  public final void initView()
  {
    AppMethodBeat.i(88465);
    this.klp = ((RelativeLayout)findViewById(2131822132));
    this.klr = ((RelativeLayout)findViewById(2131822134));
    this.kls = ((ImageView)findViewById(2131822133));
    this.klt = ((TextView)findViewById(2131822135));
    this.klu = ((MMPinProgressBtn)findViewById(2131822136));
    this.kko = ((ProgressBar)findViewById(2131821891));
    this.klv = ((TextView)findViewById(2131822138));
    this.klq = new VideoTextureView(this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(13);
    this.klq.setMute(this.eif);
    this.klq.setVideoCallback(this);
    this.klr.addView((View)this.klq, localLayoutParams);
    this.kkl = ((ImageView)findViewById(2131822079));
    this.kkl.setLayerType(2, null);
    this.klp.setOnTouchListener(new CardGiftVideoUI.6(this));
    ((View)this.klq).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(88454);
        CardGiftVideoUI.this.bcW();
        AppMethodBeat.o(88454);
      }
    });
    this.jYE = new com.tencent.mm.ui.tools.e(this);
    AppMethodBeat.o(88465);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88462);
    if (getIntent().getExtras() != null)
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.jWy = paramBundle;
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setFlags(1024, 1024);
    if (com.tencent.mm.booter.a.Ib() != null)
      com.tencent.mm.booter.a.Ib().Id();
    this.kkk = ((CardGiftInfo)getIntent().getParcelableExtra("key_gift_into"));
    this.videoPath = getIntent().getStringExtra("key_video_path");
    this.eif = getIntent().getBooleanExtra("key_is_mute", false);
    if (this.kkk == null)
    {
      paramBundle = "null";
      ab.d("MicroMsg.CardGiftVideoUI", "cardGiftInfo %s", new Object[] { paramBundle });
      ab.d("MicroMsg.CardGiftVideoUI", "videoPath:%s, isMute:%b", new Object[] { this.videoPath, Boolean.valueOf(this.eif) });
      initView();
      com.tencent.mm.plugin.card.d.a.a(this);
      bdd();
      if (this.kkk != null)
        break label230;
      ab.e("MicroMsg.CardGiftVideoUI", "cardGiftInfo is null");
      AppMethodBeat.o(88462);
    }
    while (true)
    {
      return;
      paramBundle = this.kkk.toString();
      break;
      label230: if (!bo.isNullOrNil(this.kkk.kco))
      {
        com.tencent.mm.plugin.card.d.a.g(this.kkk.kcp, this.kkk.kcs, this.kkk.kcB, 2);
        com.tencent.mm.plugin.card.d.a.g(this.kkk.kco, this.kkk.kcr, this.kkk.kcA, 1);
        AppMethodBeat.o(88462);
      }
      else
      {
        ab.e("MicroMsg.CardGiftVideoUI", "fromUserContentVideoUrl is null");
        AppMethodBeat.o(88462);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88469);
    this.klq.stop();
    this.klw.stopTimer();
    com.tencent.mm.plugin.card.d.a.b(this);
    super.onDestroy();
    AppMethodBeat.o(88469);
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(88472);
    setResult(0);
    this.klq.stop();
    ab.e("MicroMsg.CardGiftVideoUI", "%d on play video error what %d extra %d.", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(88472);
  }

  public void onPause()
  {
    AppMethodBeat.i(88468);
    this.klq.pause();
    super.onPause();
    AppMethodBeat.o(88468);
  }

  public void onResume()
  {
    AppMethodBeat.i(88467);
    if (!bo.isNullOrNil(this.videoPath))
      GT(this.videoPath);
    super.onResume();
    AppMethodBeat.o(88467);
  }

  public void onStart()
  {
    AppMethodBeat.i(88466);
    Bundle localBundle = this.jWy;
    if (!this.jYD)
    {
      this.jYD = true;
      if (Build.VERSION.SDK_INT >= 12)
        break label63;
      ab.e("MicroMsg.CardGiftVideoUI", "version is %d, no animation", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
    }
    while (true)
    {
      super.onStart();
      AppMethodBeat.o(88466);
      return;
      label63: this.kkq = getIntent().getIntExtra("img_top", 0);
      this.kkr = getIntent().getIntExtra("img_left", 0);
      this.kks = getIntent().getIntExtra("img_width", 0);
      this.kkt = getIntent().getIntExtra("img_height", 0);
      this.jYE.L(this.kkr, this.kkq, this.kks, this.kkt);
      if (localBundle == null)
        this.klp.getViewTreeObserver().addOnPreDrawListener(new CardGiftVideoUI.8(this));
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void pL()
  {
    AppMethodBeat.i(88473);
    setResult(-1);
    this.kkp.post(new CardGiftVideoUI.11(this));
    this.kkp.post(new CardGiftVideoUI.12(this));
    this.klq.start();
    this.duration = (this.klq.getDuration() / 1000);
    this.klw.ae(500L, 500L);
    ab.i("MicroMsg.CardGiftVideoUI", "onPrepared videoView.start duration:%d", new Object[] { Integer.valueOf(this.duration) });
    AppMethodBeat.o(88473);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftVideoUI
 * JD-Core Version:    0.6.2
 */