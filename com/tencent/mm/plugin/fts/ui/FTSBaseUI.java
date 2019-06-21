package com.tencent.mm.plugin.fts.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.content.b;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.a;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a.a;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.List;

public abstract class FTSBaseUI extends MMActivity
  implements d.a, e, FTSEditTextView.a, a.a
{
  private ak mHE = new FTSBaseUI.3(this);
  ListView mIn;
  private d mIo;
  private TextView mIp;
  private boolean mIq = false;
  com.tencent.mm.plugin.fts.ui.widget.a mIr;
  private String mIs = null;
  String query;

  protected void Nv(String paramString)
  {
    if (!bo.isNullOrNil(paramString))
    {
      this.query = paramString;
      this.mHE.removeMessages(1);
      this.mHE.sendEmptyMessageDelayed(1, 300L);
    }
    while (true)
    {
      return;
      stopSearch();
    }
  }

  public final void U(int paramInt, boolean paramBoolean)
  {
    ab.i("MicroMsg.FTS.FTSBaseUI", "onEnd resultCount=%d | isFinished=%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
      if (paramInt > 0)
        bAU();
    while (true)
    {
      if (this.mIq)
      {
        this.mIq = false;
        this.mIn.setSelection(0);
      }
      return;
      bAT();
      continue;
      if (paramInt > 0)
        bAU();
      else
        bAS();
    }
  }

  protected abstract d a(e parame);

  public void a(com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
  }

  public void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    if (paramb == FTSEditTextView.b.mLX)
    {
      paramString1 = com.tencent.mm.plugin.fts.a.d.Nc(paramString1);
      if ((bo.isNullOrNil(this.query)) || (!this.query.equals(paramString1)))
        break label57;
      ab.i("MicroMsg.FTS.FTSBaseUI", "Same query %s %s", new Object[] { this.query, paramString1 });
    }
    while (true)
    {
      return;
      label57: Nv(paramString1);
    }
  }

  public boolean aMo()
  {
    aqX();
    this.mIr.getFtsEditText().mLL.clearFocus();
    return false;
  }

  protected void bAM()
  {
    this.mIq = true;
    this.mIo.Nu(this.query);
    bAS();
  }

  protected void bAP()
  {
    this.mIr = new com.tencent.mm.plugin.fts.ui.widget.a(this);
    this.mIr.setSearchViewListener(this);
    this.mIr.getFtsEditText().setHint(getHint());
    this.mIr.getFtsEditText().setFtsEditTextListener(this);
    this.mIr.getFtsEditText().setCanDeleteTag(false);
    getSupportActionBar().setCustomView(this.mIr);
    this.mIn = ((ListView)findViewById(2131824198));
    this.mIo = a(this);
    this.mIo.mIm = this;
    this.mIn.setAdapter(this.mIo);
    this.mIn.setOnScrollListener(this.mIo);
    this.mIn.setOnItemClickListener(this.mIo);
    this.mIn.setOnTouchListener(new FTSBaseUI.1(this));
    this.mIp = ((TextView)findViewById(2131820903));
    setBackBtn(new FTSBaseUI.2(this));
  }

  protected void bAQ()
  {
  }

  public final void bAR()
  {
  }

  protected void bAS()
  {
    this.mIp.setVisibility(8);
    this.mIn.setVisibility(8);
  }

  protected void bAT()
  {
    this.mIp.setVisibility(0);
    this.mIp.setText(f.a(getString(2131302819), getString(2131302818), com.tencent.mm.plugin.fts.a.a.d.b(this.query, this.query)).mDR);
    this.mIn.setVisibility(8);
  }

  protected void bAU()
  {
    this.mIp.setVisibility(8);
    this.mIn.setVisibility(0);
  }

  protected void bAV()
  {
    this.mIp.setVisibility(8);
    this.mIn.setVisibility(8);
  }

  public String getHint()
  {
    if (this.mIs != null);
    for (String str = this.mIs; ; str = getString(2131297040))
      return str;
  }

  public final void hz(boolean paramBoolean)
  {
  }

  protected final void l(String paramString, List<a.b> paramList)
  {
    this.query = paramString;
    this.mIr.getFtsEditText().n(paramString, paramList);
  }

  public void onClickBackBtn(View paramView)
  {
    finish();
  }

  public void onClickCancelBtn(View paramView)
  {
  }

  public void onClickClearTextBtn(View paramView)
  {
    stopSearch();
    this.mIr.getFtsEditText().bBo();
    showVKB();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    dyf();
    setMMTitle("");
    xE(b.i(this.mController.ylL, 2131690310));
    bAQ();
    bAP();
  }

  public void onDestroy()
  {
    this.mHE.removeMessages(1);
    this.mIo.finish();
    super.onDestroy();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void setHint(String paramString)
  {
    this.mIs = paramString;
    this.mIr.getFtsEditText().setHint(getHint());
  }

  protected void stopSearch()
  {
    this.query = "";
    this.mHE.removeMessages(1);
    this.mIq = false;
    this.mIo.stopSearch();
    this.mIr.getFtsEditText().setHint(getHint());
    bAV();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSBaseUI
 * JD-Core Version:    0.6.2
 */