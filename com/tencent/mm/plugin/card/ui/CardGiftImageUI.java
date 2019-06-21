package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.a.a;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.e;
import com.tencent.mm.ui.tools.j;

@com.tencent.mm.ui.base.a(3)
public class CardGiftImageUI extends MMActivity
  implements a.a
{
  private j icA;
  private String imgPath;
  private Bundle jWy;
  private boolean jYD;
  private e jYE;
  private CardGiftInfo kkk;
  private ImageView kkl;
  private RelativeLayout kkm;
  private MMGestureGallery kkn;
  private ProgressBar kko;
  private ak kkp;
  private int kkq;
  private int kkr;
  private int kks;
  private int kkt;
  private CardGiftImageUI.a kku;

  public CardGiftImageUI()
  {
    AppMethodBeat.i(88403);
    this.kkp = new ak(Looper.getMainLooper());
    this.jYD = false;
    this.kkq = 0;
    this.kkr = 0;
    this.kks = 0;
    this.kkt = 0;
    AppMethodBeat.o(88403);
  }

  public final void GS(String paramString)
  {
  }

  public final void bN(String paramString, int paramInt)
  {
    AppMethodBeat.i(88412);
    this.kkp.post(new CardGiftImageUI.7(this));
    AppMethodBeat.o(88412);
  }

  public final void bcW()
  {
    AppMethodBeat.i(88411);
    this.jYE.L(this.kkr, this.kkq, this.kks, this.kkt);
    this.jYE.a(this.kkm, this.kkl, new CardGiftImageUI.6(this), null);
    AppMethodBeat.o(88411);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(88410);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.CardGiftImageUI", "dispatchKeyEvent");
      bcW();
      bool = true;
      AppMethodBeat.o(88410);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(88410);
    }
  }

  public final void dr(String paramString1, String paramString2)
  {
    AppMethodBeat.i(88413);
    this.kkp.post(new CardGiftImageUI.8(this, paramString2));
    AppMethodBeat.o(88413);
  }

  public final int getLayoutId()
  {
    return 2130968923;
  }

  public final void initView()
  {
    AppMethodBeat.i(88405);
    this.kkl = ((ImageView)findViewById(2131822079));
    this.kkl.setLayerType(2, null);
    this.kko = ((ProgressBar)findViewById(2131822082));
    this.kkm = ((RelativeLayout)findViewById(2131822080));
    this.kkn = ((MMGestureGallery)findViewById(2131822081));
    this.kkn.setVerticalFadingEdgeEnabled(false);
    this.kkn.setHorizontalFadingEdgeEnabled(false);
    this.kku = new CardGiftImageUI.a(this, (byte)0);
    this.kkn.setAdapter(this.kku);
    this.kkn.setSingleClickOverListener(new CardGiftImageUI.1(this));
    this.kkn.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(88394);
        h.a(CardGiftImageUI.this, CardGiftImageUI.a(CardGiftImageUI.this).cuu());
        AppMethodBeat.o(88394);
        return true;
      }
    });
    this.jYE = new e(this);
    AppMethodBeat.o(88405);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88404);
    if (getIntent().getExtras() != null)
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.jWy = paramBundle;
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setFlags(1024, 1024);
    this.kkk = ((CardGiftInfo)getIntent().getParcelableExtra("key_gift_into"));
    if (this.kkk == null)
    {
      paramBundle = "null";
      ab.d("MicroMsg.CardGiftImageUI", "cardGiftInfo:%s", new Object[] { paramBundle });
      ab.i("MicroMsg.CardGiftImageUI", "imgPath:%s", new Object[] { this.imgPath });
      initView();
      com.tencent.mm.plugin.card.d.a.a(this);
      if ((this.kkk == null) || (bo.isNullOrNil(this.kkk.kcn)))
        break label203;
      com.tencent.mm.plugin.card.d.a.g(this.kkk.kcn, this.kkk.kcq, this.kkk.kcz, 2);
      AppMethodBeat.o(88404);
    }
    while (true)
    {
      return;
      paramBundle = this.kkk.toString();
      break;
      label203: ab.e("MicroMsg.CardGiftImageUI", "fromUserContentPicUrl is null");
      AppMethodBeat.o(88404);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88409);
    super.onDestroy();
    com.tencent.mm.plugin.card.d.a.b(this);
    AppMethodBeat.o(88409);
  }

  public void onPause()
  {
    AppMethodBeat.i(88408);
    super.onPause();
    AppMethodBeat.o(88408);
  }

  public void onResume()
  {
    AppMethodBeat.i(88407);
    super.onResume();
    if (this.kku != null)
      this.kku.notifyDataSetChanged();
    AppMethodBeat.o(88407);
  }

  public void onStart()
  {
    AppMethodBeat.i(88406);
    Bundle localBundle = this.jWy;
    if (!this.jYD)
    {
      this.jYD = true;
      if (Build.VERSION.SDK_INT >= 12)
        break label63;
      ab.e("MicroMsg.CardGiftImageUI", "version is %d, no animation", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
    }
    while (true)
    {
      super.onStart();
      AppMethodBeat.o(88406);
      return;
      label63: this.kkq = getIntent().getIntExtra("img_top", 0);
      this.kkr = getIntent().getIntExtra("img_left", 0);
      this.kks = getIntent().getIntExtra("img_width", 0);
      this.kkt = getIntent().getIntExtra("img_height", 0);
      this.jYE.L(this.kkr, this.kkq, this.kks, this.kkt);
      if (localBundle == null)
        this.kkm.getViewTreeObserver().addOnPreDrawListener(new CardGiftImageUI.5(this));
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftImageUI
 * JD-Core Version:    0.6.2
 */