package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;

@a(19)
public class GameGalleryUI extends MMActivity
  implements ViewPager.OnPageChangeListener
{
  private String appId = "";
  private MMDotView jiG;
  private int lTe = -1;
  private int nja = 0;
  private ViewPager sq;

  public final int getLayoutId()
  {
    return 2130969718;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(111967);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.sq = ((ViewPager)findViewById(2131824509));
    this.jiG = ((MMDotView)findViewById(2131824510));
    paramBundle = getIntent().getStringArrayExtra("URLS");
    if (paramBundle == null)
    {
      finish();
      AppMethodBeat.o(111967);
    }
    while (true)
    {
      return;
      int i = getIntent().getIntExtra("CURRENT", 0);
      int j;
      if (i >= 0)
      {
        j = i;
        if (i < paramBundle.length);
      }
      else
      {
        j = 0;
      }
      this.appId = getIntent().getStringExtra("REPORT_APPID");
      this.lTe = getIntent().getIntExtra("REPORT_SCENE", -1);
      this.nja = getIntent().getIntExtra("SOURCE_SCENE", 0);
      GameGalleryUI.a locala = new GameGalleryUI.a(this, paramBundle);
      this.sq.setAdapter(locala);
      this.sq.setOnPageChangeListener(this);
      this.sq.setCurrentItem(j, false);
      this.jiG.setInvertedStyle(true);
      this.jiG.setDotCount(paramBundle.length);
      this.jiG.setSelectedDot(j);
      if (j == 0)
        b.a(this, this.lTe, 1202, 1, 12, this.appId, this.nja, null);
      AppMethodBeat.o(111967);
    }
  }

  public void onPageScrollStateChanged(int paramInt)
  {
  }

  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(111968);
    this.jiG.setSelectedDot(paramInt);
    b.a(this, this.lTe, 1202, paramInt + 1, 12, this.appId, this.nja, null);
    AppMethodBeat.o(111968);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameGalleryUI
 * JD-Core Version:    0.6.2
 */