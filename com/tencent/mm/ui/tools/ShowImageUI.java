package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public class ShowImageUI extends MMActivity
{
  private MMGestureGallery kkn;
  private boolean zHE;
  private ShowImageUI.a zHF;
  private boolean zHG;

  public final int getLayoutId()
  {
    return 2130970677;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34996);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_title");
    if (!bo.isNullOrNil(paramBundle))
      setMMTitle(paramBundle);
    this.zHE = getIntent().getBooleanExtra("key_favorite", false);
    this.zHG = getIntent().getBooleanExtra("show_menu", true);
    this.kkn = ((MMGestureGallery)findViewById(2131822081));
    this.kkn.setVerticalFadingEdgeEnabled(false);
    this.kkn.setHorizontalFadingEdgeEnabled(false);
    this.zHF = new ShowImageUI.a(this, (byte)0);
    this.zHF.imagePath = getIntent().getStringExtra("key_image_path");
    this.kkn.setAdapter(this.zHF);
    setBackBtn(new ShowImageUI.1(this));
    if (this.zHG)
      addIconOptionMenu(0, 2131231770, new ShowImageUI.2(this));
    AppMethodBeat.o(34996);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShowImageUI
 * JD-Core Version:    0.6.2
 */