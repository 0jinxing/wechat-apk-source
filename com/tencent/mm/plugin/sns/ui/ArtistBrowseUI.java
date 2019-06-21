package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ba.n;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public class ArtistBrowseUI extends SnsBaseGalleryUI
  implements s.a
{
  private String nJy = "";
  private String rgC = "";

  public final void dg(String paramString, int paramInt)
  {
    AppMethodBeat.i(38103);
    if (this.rpp != null)
      this.rpp.btt();
    AppMethodBeat.o(38103);
  }

  public final void dh(String paramString, int paramInt)
  {
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(38100);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.ArtistBrowseUI", "dispatchKeyEvent");
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("sns_cmd_list", this.rpl.rjk);
      setResult(-1, paramKeyEvent);
      finish();
      bool = true;
      AppMethodBeat.o(38100);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(38100);
    }
  }

  public final int getLayoutId()
  {
    return 2130970761;
  }

  public final void initView()
  {
    AppMethodBeat.i(38101);
    this.nJy = getIntent().getStringExtra("sns_gallery_artist_lan");
    int i = getIntent().getIntExtra("sns_gallery_position", 0);
    com.tencent.mm.ba.r.aix();
    this.rgC = n.aiu();
    D(false, 2);
    this.rpp = new SnsInfoFlip(this);
    List localList = aj.fY(this.nJy, this.rgC);
    this.rpp.setShowTitle(true);
    this.rpp.a(localList, "", i, this.rpk, this);
    addView(this.rpp);
    setBackBtn(new ArtistBrowseUI.1(this));
    setMMTitle(2131303841);
    showOptionMenu(false);
    this.rpk.setCallBack(new ArtistBrowseUI.2(this));
    AppMethodBeat.o(38101);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(38104);
    ab.i("MicroMsg.ArtistBrowseUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (paramInt2 != -1)
      AppMethodBeat.o(38104);
    while (true)
    {
      return;
      paramInt1 = paramIntent.getIntExtra("sns_gallery_op_id", 0);
      this.rpl.DN(paramInt1);
      AppMethodBeat.o(38104);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(38097);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(38097);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(38098);
    if (this.rpp != null)
    {
      this.rpp.ctm();
      this.rpp.onDestroy();
    }
    af.cnC().ab(this);
    super.onDestroy();
    AppMethodBeat.o(38098);
  }

  public void onPause()
  {
    AppMethodBeat.i(38102);
    if (this.rpp != null)
      this.rpp.onPause();
    super.onPause();
    AppMethodBeat.o(38102);
  }

  public void onResume()
  {
    AppMethodBeat.i(38099);
    super.onResume();
    if (this.rpp != null)
      this.rpp.btt();
    AppMethodBeat.o(38099);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ArtistBrowseUI
 * JD-Core Version:    0.6.2
 */