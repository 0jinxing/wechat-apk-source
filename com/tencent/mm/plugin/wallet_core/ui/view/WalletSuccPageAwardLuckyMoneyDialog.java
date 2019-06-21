package com.tencent.mm.plugin.wallet_core.ui.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import d.a.a.e;
import java.io.IOException;

@a(3)
public class WalletSuccPageAwardLuckyMoneyDialog extends MMActivity
{
  private ViewGroup sis;
  private ImageView tOu;
  private e tOv;

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971170;
  }

  public void onCreate(final Bundle paramBundle)
  {
    AppMethodBeat.i(47939);
    super.onCreate(paramBundle);
    if (getSupportActionBar() != null)
      getSupportActionBar().hide();
    if (d.iW(19))
      getWindow().setFlags(67108864, 67108864);
    paramBundle = getIntent().getByteArrayExtra("key_layer_info");
    if (paramBundle == null)
    {
      ab.e("MicroMsg.WalletSuccPageAwardLuckyMoneyDialog", "WalletSuccPageAwardLuckyMoneyDialog onCreate error! cannot get layerInfoBytes!");
      finish();
    }
    this.tOv = new e();
    try
    {
      this.tOv.parseFrom(paramBundle);
      this.sis = ((ViewGroup)findViewById(2131821686));
      this.tOu = ((ImageView)findViewById(2131827693));
      this.tOu.setOnClickListener(new WalletSuccPageAwardLuckyMoneyDialog.1(this));
      final ViewGroup localViewGroup = this.sis;
      WalletSuccPageAwardLuckyMoneyDialog.2 local2 = new WalletSuccPageAwardLuckyMoneyDialog.2(this);
      ScaleAnimation localScaleAnimation = new ScaleAnimation(0.0F, 0.96F, 0.0F, 0.96F, 1, 0.5F, 1, 0.5F);
      localScaleAnimation.setDuration(300L);
      localScaleAnimation.setInterpolator(new OvershootInterpolator());
      localScaleAnimation.setFillAfter(true);
      paramBundle = new ScaleAnimation(0.96F, 1.0F, 0.96F, 1.0F, 1, 0.5F, 1, 0.5F);
      paramBundle.setDuration(100L);
      paramBundle.setFillAfter(true);
      localScaleAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          AppMethodBeat.i(47938);
          localViewGroup.startAnimation(paramBundle);
          AppMethodBeat.o(47938);
        }

        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
        }

        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
        }
      });
      paramBundle.setAnimationListener(local2);
      if (localViewGroup != null)
        localViewGroup.startAnimation(localScaleAnimation);
      AppMethodBeat.o(47939);
      return;
    }
    catch (IOException paramBundle)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletSuccPageAwardLuckyMoneyDialog", paramBundle, "parse layer info byte error! %s", new Object[] { paramBundle.getMessage() });
        finish();
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardLuckyMoneyDialog
 * JD-Core Version:    0.6.2
 */