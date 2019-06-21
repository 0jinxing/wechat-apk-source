package com.tencent.mm.plugin.fts.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import java.util.ArrayList;
import java.util.List;

public class FTSConvMessageUI extends FTSBaseUI
{
  private String mEp;
  private int mFa;
  private g mIG;
  private String query;

  protected final d a(e parame)
  {
    AppMethodBeat.i(61821);
    if (this.mIG == null)
      this.mIG = new g(parame, this.mEp, this.mFa);
    parame = this.mIG;
    AppMethodBeat.o(61821);
    return parame;
  }

  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    AppMethodBeat.i(61823);
    super.a(paramString2, paramString2, paramList, paramb);
    AppMethodBeat.o(61823);
  }

  public final boolean aMo()
  {
    return false;
  }

  protected final void bAQ()
  {
    AppMethodBeat.i(61818);
    super.bAQ();
    this.mEp = getIntent().getStringExtra("key_conv");
    this.query = getIntent().getStringExtra("key_query");
    this.mFa = getIntent().getIntExtra("Search_Scene", 0);
    AppMethodBeat.o(61818);
  }

  public final String getHint()
  {
    AppMethodBeat.i(61822);
    String str = getString(2131302864);
    AppMethodBeat.o(61822);
    return str;
  }

  public final int getLayoutId()
  {
    return 2130969618;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(61819);
    super.onCreate(paramBundle);
    a locala = new a((byte)0);
    a.a(locala, com.tencent.mm.plugin.fts.a.d.LC(this.mEp));
    paramBundle = new ArrayList();
    paramBundle.add(locala);
    l(this.query, paramBundle);
    bAM();
    AppMethodBeat.o(61819);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(61820);
    this.mIG.finish();
    super.onDestroy();
    AppMethodBeat.o(61820);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a
    implements a.b
  {
    private String eoz;

    private a()
    {
    }

    public final int compareTo(Object paramObject)
    {
      return 0;
    }

    public final String getTagName()
    {
      return this.eoz;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSConvMessageUI
 * JD-Core Version:    0.6.2
 */