package com.tencent.mm.plugin.fts.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.d.c;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public class FTSTalkerMessageUI extends FTSBaseUI
{
  private String mEq;
  private int mFa;
  private l mJM;
  private String query;

  protected final d a(e parame)
  {
    AppMethodBeat.i(61952);
    if (this.mJM == null)
      this.mJM = new l(this, this.mEq, this.mFa);
    parame = this.mJM;
    AppMethodBeat.o(61952);
    return parame;
  }

  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    AppMethodBeat.i(61954);
    super.a(paramString2, paramString2, paramList, paramb);
    AppMethodBeat.o(61954);
  }

  protected final void bAQ()
  {
    AppMethodBeat.i(61951);
    super.bAQ();
    this.mEq = getIntent().getStringExtra("key_talker_query");
    this.query = getIntent().getStringExtra("key_query");
    this.mFa = getIntent().getIntExtra("Search_Scene", 0);
    ab.i("MicroMsg.FTS.FTSTalkerMessageUI", "initSearchData query=%s talkerQuery=%s", new Object[] { this.query, this.mEq });
    AppMethodBeat.o(61951);
  }

  public final int getLayoutId()
  {
    return 2130969639;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(61950);
    super.onCreate(paramBundle);
    ((n)g.M(n.class)).getFTSImageLoader().bzY();
    FTSTalkerMessageUI.a locala = new FTSTalkerMessageUI.a(this, (byte)0);
    FTSTalkerMessageUI.a.a(locala, this.mEq);
    paramBundle = new ArrayList();
    paramBundle.add(locala);
    l(this.query, paramBundle);
    bAM();
    AppMethodBeat.o(61950);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(61953);
    this.mJM.finish();
    ((n)g.M(n.class)).getFTSImageLoader().bzW();
    super.onDestroy();
    AppMethodBeat.o(61953);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSTalkerMessageUI
 * JD-Core Version:    0.6.2
 */