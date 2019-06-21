package com.tencent.mm.plugin.fts.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.d.c;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.sdk.platformtools.ab;

public class FTSDetailUI extends FTSBaseUI
{
  private int mFa;
  private int mFl;
  private i mIQ;

  protected final d a(e parame)
  {
    AppMethodBeat.i(61847);
    if (this.mIQ == null)
      this.mIQ = new i(parame, this.mFl, this.mFa);
    parame = this.mIQ;
    AppMethodBeat.o(61847);
    return parame;
  }

  public final void a(com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
  }

  protected final void bAQ()
  {
    AppMethodBeat.i(61846);
    this.mFl = getIntent().getIntExtra("detail_type", 0);
    this.mFa = getIntent().getIntExtra("Search_Scene", 0);
    AppMethodBeat.o(61846);
  }

  public final String getHint()
  {
    AppMethodBeat.i(61849);
    String str = m.wf(this.mFl);
    if (str == null)
    {
      str = getString(2131297040);
      AppMethodBeat.o(61849);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(61849);
    }
  }

  public final int getLayoutId()
  {
    return 2130969618;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(61845);
    super.onCreate(paramBundle);
    ((n)g.M(n.class)).getFTSImageLoader().bzY();
    paramBundle = getIntent().getStringExtra("detail_query");
    this.query = paramBundle;
    this.mIr.getFtsEditText().n(paramBundle, null);
    ab.i("MicroMsg.FTS.FTSDetailUI", "onCreate query=%s, searchType=%d, kvScene=%d", new Object[] { this.query, Integer.valueOf(this.mFl), Integer.valueOf(this.mFa) });
    bAM();
    AppMethodBeat.o(61845);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(61848);
    this.mIQ.finish();
    ((n)g.M(n.class)).getFTSImageLoader().bzV();
    super.onDestroy();
    AppMethodBeat.o(61848);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSDetailUI
 * JD-Core Version:    0.6.2
 */