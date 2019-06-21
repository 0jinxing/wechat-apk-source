package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.i;
import com.tencent.mm.ui.base.CustomViewPager;
import java.util.HashMap;

@i
public class AlbumUI extends MMActivity
{
  private DoubleTabView yen;
  private CustomViewPager yeo;
  private HashMap<Integer, MMFragment> yep;
  private boolean yeq;

  public AlbumUI()
  {
    AppMethodBeat.i(29109);
    this.yen = null;
    this.yeo = null;
    this.yep = new HashMap();
    this.yeq = false;
    AppMethodBeat.o(29109);
  }

  protected final void dealContentView(View paramView)
  {
    AppMethodBeat.i(29110);
    super.dealContentView(paramView);
    this.yeq = getIntent().getBooleanExtra("story_dot", false);
    this.yen = ((DoubleTabView)findViewById(2131825967));
    this.yeo = ((CustomViewPager)findViewById(2131825968));
    this.yen.setFirstTabString(getResources().getString(2131296500));
    this.yen.setSecondTabString(getResources().getString(2131296501));
    if (this.yeq)
      this.yen.pC(true);
    this.yen.setOnTabClickListener(new AlbumUI.1(this));
    this.yeo.setOnPageChangeListener(new AlbumUI.2(this));
    this.yeo.setAdapter(new AlbumUI.a(this, getSupportFragmentManager()));
    AppMethodBeat.o(29110);
  }

  protected final int getLayoutId()
  {
    return 2130970089;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(138619);
    this.yll = true;
    super.onCreate(paramBundle);
    AppMethodBeat.o(138619);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AlbumUI
 * JD-Core Version:    0.6.2
 */