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

public class FTSConvTalkerMessageUI extends FTSBaseUI
{
  private String mEp;
  private String mEq;
  private int mFa;
  private h mIJ;
  private String query;
  private int showType;
  private String talker;

  protected final d a(e parame)
  {
    AppMethodBeat.i(61833);
    if (this.mIJ == null)
      this.mIJ = new h(this, this.talker, this.mEq, this.mEp, this.mFa, this.showType);
    parame = this.mIJ;
    AppMethodBeat.o(61833);
    return parame;
  }

  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    AppMethodBeat.i(61834);
    super.a(paramString2, paramString2, paramList, paramb);
    AppMethodBeat.o(61834);
  }

  protected final void bAQ()
  {
    AppMethodBeat.i(61832);
    super.bAQ();
    this.mEp = getIntent().getStringExtra("key_conv");
    this.talker = getIntent().getStringExtra("key_talker");
    this.query = getIntent().getStringExtra("key_query");
    this.mEq = getIntent().getStringExtra("key_talker_query");
    this.showType = getIntent().getIntExtra("detail_type", 1);
    this.mFa = getIntent().getIntExtra("Search_Scene", 0);
    ab.i("MicroMsg.FTS.FTSConvTalkerMessageUI", "initSearchData query=%s talker=%s conversation=%s showType=%d", new Object[] { this.query, this.talker, this.mEp, Integer.valueOf(this.showType) });
    AppMethodBeat.o(61832);
  }

  public final int getLayoutId()
  {
    return 2130969639;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(61831);
    super.onCreate(paramBundle);
    ((n)g.M(n.class)).getFTSImageLoader().bzY();
    paramBundle = new a((byte)0);
    a.a(paramBundle, this.mEq);
    a locala1 = new a((byte)0);
    a.a(locala1, ">");
    a locala2 = new a((byte)0);
    a.a(locala2, com.tencent.mm.plugin.fts.a.d.LC(this.mEp));
    ArrayList localArrayList = new ArrayList();
    if (this.showType == 2)
    {
      localArrayList.add(paramBundle);
      localArrayList.add(locala1);
      localArrayList.add(locala2);
    }
    while (true)
    {
      l(this.query, localArrayList);
      bAM();
      AppMethodBeat.o(61831);
      return;
      localArrayList.add(locala2);
      localArrayList.add(locala1);
      localArrayList.add(paramBundle);
    }
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSConvTalkerMessageUI
 * JD-Core Version:    0.6.2
 */