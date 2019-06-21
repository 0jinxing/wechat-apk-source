package com.tencent.mm.plugin.brandservice.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.ba.k;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelvoiceaddr.ui.b.a;
import com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView;
import com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.o;

@a(3)
public class BrandServiceLocalSearchUI extends MMActivity
  implements b.a, BrandServiceSortView.a
{
  private com.tencent.mm.modelvoiceaddr.ui.b jLK;
  private BrandServiceSortView jLL;

  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
  }

  public final boolean aWe()
  {
    AppMethodBeat.i(13936);
    aqX();
    AppMethodBeat.o(13936);
    return false;
  }

  public final void amJ()
  {
    AppMethodBeat.i(13931);
    aqX();
    AppMethodBeat.o(13931);
  }

  public final void apo()
  {
    AppMethodBeat.i(13928);
    finish();
    AppMethodBeat.o(13928);
  }

  public final void app()
  {
  }

  public final void apq()
  {
  }

  public final void apr()
  {
  }

  public final int getLayoutId()
  {
    return 2130968884;
  }

  public final void initView()
  {
    AppMethodBeat.i(13927);
    this.jLL = ((BrandServiceSortView)findViewById(2131821896));
    this.jLL.setMode(1);
    this.jLL.setReturnResult(getIntent().getBooleanExtra("is_return_result", false));
    this.jLL.dAH();
    this.jLL.ql(false);
    this.jLL.setShowFooterView(false);
    this.jLL.setITransferToChildOnTouchListener(this);
    this.jLK = new com.tencent.mm.modelvoiceaddr.ui.b();
    this.jLK.qQ(true);
    this.jLK.a(this);
    this.jLK.gcl = false;
    AppMethodBeat.o(13927);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13926);
    super.onCreate(paramBundle);
    xE(android.support.v4.content.b.i(this.mController.ylL, 2131690310));
    initView();
    paramBundle = new k(18);
    g.Rg().a(paramBundle, 0);
    AppMethodBeat.o(13926);
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(13934);
    this.jLK.a(this, paramMenu);
    AppMethodBeat.o(13934);
    return true;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13933);
    super.onDestroy();
    this.jLL.release();
    AppMethodBeat.o(13933);
  }

  public void onPause()
  {
    AppMethodBeat.i(13932);
    super.onPause();
    this.jLK.cancel();
    this.jLK.clearFocus();
    AppMethodBeat.o(13932);
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(13935);
    this.jLK.a(this, paramMenu);
    AppMethodBeat.o(13935);
    return true;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final boolean vN(String paramString)
  {
    AppMethodBeat.i(13930);
    aqX();
    AppMethodBeat.o(13930);
    return true;
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(13929);
    ab.i("MicroMsg.BrandServiceLocalSearchUI", "search biz, key word : %s", new Object[] { paramString });
    this.jLL.aqS(paramString);
    AppMethodBeat.o(13929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.BrandServiceLocalSearchUI
 * JD-Core Version:    0.6.2
 */