package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.emoji.ui.widget.MMCopiableTextView;
import com.tencent.mm.protocal.protobuf.GetEmotionRewardResponse;
import com.tencent.mm.protocal.protobuf.yi;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.vfs.e;

public class EmojiStoreV2RewardThanksUI extends MMActivity
{
  private String kWl;
  private GetEmotionRewardResponse laG;
  private EmojiStoreV2RewardBannerView lek;
  private View lel;
  private MMCopiableTextView lem;
  private TextView len;
  private TextView leo;
  private AnimationDrawable lep;
  private ak mHandler;

  public EmojiStoreV2RewardThanksUI()
  {
    AppMethodBeat.i(53691);
    this.mHandler = new EmojiStoreV2RewardThanksUI.1(this);
    AppMethodBeat.o(53691);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969376;
  }

  public final void initView()
  {
    AppMethodBeat.i(53694);
    setMMTitle(2131299153);
    setBackBtn(new EmojiStoreV2RewardThanksUI.2(this));
    this.lek = ((EmojiStoreV2RewardBannerView)findViewById(2131823574));
    this.lek.setScale(1.0F);
    this.lel = findViewById(2131823575);
    this.lem = ((MMCopiableTextView)findViewById(2131823577));
    this.len = ((TextView)findViewById(2131823578));
    this.leo = ((TextView)findViewById(2131823576));
    this.lep = ((AnimationDrawable)getResources().getDrawable(2130838556));
    AppMethodBeat.o(53694);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53692);
    super.onCreate(paramBundle);
    this.kWl = getIntent().getStringExtra("extra_id");
    initView();
    this.laG = j.getEmojiStorageMgr().xYs.aqq(this.kWl);
    String str;
    if (this.laG != null)
      if ((this.laG.Reward != null) && (!bo.isNullOrNil(this.laG.Reward.web)))
      {
        str = this.laG.Reward.wec;
        paramBundle = EmojiLogic.K(b.Yb(), this.kWl, str);
        if (e.ct(paramBundle))
        {
          this.lek.setImageFilePath(paramBundle);
          this.lek.setScaleType(ImageView.ScaleType.FIT_XY);
          if ((this.lep != null) && (this.lep.isRunning()))
            this.lep.stop();
          if ((this.laG == null) || (this.laG.Reward == null))
            break label403;
          this.lel.setVisibility(0);
          bo.isNullOrNil(this.laG.Reward.wee);
          this.lem.setVisibility(0);
          this.lem.setText(2131299154);
          this.len.setVisibility(8);
          this.leo.setVisibility(8);
          AppMethodBeat.o(53692);
        }
      }
    while (true)
    {
      return;
      o.ahp().a(str, this.lek, g.k(this.kWl, str, new Object[0]), new EmojiStoreV2RewardThanksUI.3(this, str, paramBundle));
      this.lek.setBackgroundDrawable(getResources().getDrawable(2130840850));
      this.lek.setImageDrawable(this.lep);
      this.lek.setScaleType(ImageView.ScaleType.CENTER);
      this.lep.start();
      break;
      this.lek.setBackgroundDrawable(getResources().getDrawable(2130840850));
      this.lek.setImageDrawable(this.lep);
      this.lek.setScaleType(ImageView.ScaleType.CENTER);
      this.lep.start();
      break;
      this.lek.setBackgroundDrawable(getResources().getDrawable(2130840850));
      this.lek.setImageDrawable(this.lep);
      this.lek.setScaleType(ImageView.ScaleType.CENTER);
      this.lep.start();
      break;
      label403: this.lel.setVisibility(8);
      AppMethodBeat.o(53692);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53693);
    if ((this.lep != null) && (this.lep.isRunning()))
      this.lep.stop();
    super.onDestroy();
    AppMethodBeat.o(53693);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardThanksUI
 * JD-Core Version:    0.6.2
 */