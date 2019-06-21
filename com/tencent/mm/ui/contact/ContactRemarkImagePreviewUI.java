package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.n;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.MMGestureGallery;

public class ContactRemarkImagePreviewUI extends MMActivity
{
  private MMGestureGallery kkn;
  private String username;
  private View zlv;
  private String zlw;
  private boolean zlx;
  private boolean zly;
  private ContactRemarkImagePreviewUI.a zlz;

  private void dHG()
  {
    AppMethodBeat.i(33624);
    this.kkn.setVerticalFadingEdgeEnabled(false);
    this.kkn.setHorizontalFadingEdgeEnabled(false);
    n.ci(this.kkn);
    this.zlz = new ContactRemarkImagePreviewUI.a(this);
    this.zlz.imagePath = this.zlw;
    this.kkn.setAdapter(this.zlz);
    this.kkn.setOnItemClickListener(new ContactRemarkImagePreviewUI.3(this));
    AppMethodBeat.o(33624);
  }

  private void qC(boolean paramBoolean)
  {
    AppMethodBeat.i(33623);
    if (paramBoolean)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("response_delete", true);
      setResult(-1, localIntent);
    }
    finish();
    AppMethodBeat.o(33623);
  }

  public final int getLayoutId()
  {
    return 2130969233;
  }

  public final void initView()
  {
    AppMethodBeat.i(33622);
    this.zlv = findViewById(2131822738);
    this.kkn = ((MMGestureGallery)findViewById(2131822081));
    setMMTitle(2131301489);
    dHG();
    addIconOptionMenu(0, 2131230740, new ContactRemarkImagePreviewUI.1(this));
    setBackBtn(new ContactRemarkImagePreviewUI.2(this));
    AppMethodBeat.o(33622);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33619);
    super.onCreate(paramBundle);
    this.username = getIntent().getStringExtra("Contact_User");
    this.zlw = getIntent().getStringExtra("remark_image_path");
    this.zlx = getIntent().getBooleanExtra("view_temp_remark_image", false);
    this.zly = getIntent().getBooleanExtra("view_only", false);
    if (bo.isNullOrNil(this.username))
    {
      finish();
      AppMethodBeat.o(33619);
    }
    while (true)
    {
      return;
      initView();
      AppMethodBeat.o(33619);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(33621);
    super.onDestroy();
    AppMethodBeat.o(33621);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(33625);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      qC(false);
      bool = true;
      AppMethodBeat.o(33625);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(33625);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(33620);
    super.onPause();
    AppMethodBeat.o(33620);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI
 * JD-Core Version:    0.6.2
 */