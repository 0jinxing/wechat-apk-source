package com.tencent.mm.plugin.fts.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.o.b;

@a(19)
public abstract class FTSBaseVoiceSearchUI extends MMActivity
  implements d.a, e, o.b
{
  private ak mHE = new ak()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      AppMethodBeat.i(61784);
      if ((paramAnonymousMessage.what == 1) && (!bo.isNullOrNil(FTSBaseVoiceSearchUI.a(FTSBaseVoiceSearchUI.this))))
        FTSBaseVoiceSearchUI.this.bAM();
      AppMethodBeat.o(61784);
    }
  };
  ListView mIn;
  private d mIo;
  TextView mIp;
  private boolean mIq = false;
  protected com.tencent.mm.plugin.fts.ui.widget.d mIu;
  private RelativeLayout mIv;
  private boolean mIw;
  String query;

  public void U(int paramInt, boolean paramBoolean)
  {
    ab.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onEnd resultCount=%d | isFinished=%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      bAX();
      if (paramInt > 0)
        bAU();
    }
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
      {
        bAU();
        bAW();
      }
      else
      {
        bAS();
        bAX();
      }
    }
  }

  protected abstract d a(e parame);

  protected View aWz()
  {
    return null;
  }

  public final void apo()
  {
    ab.d("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onQuitSearch");
    finish();
  }

  public final void app()
  {
    ab.d("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onEnterSearch");
  }

  public final void apq()
  {
  }

  public final void apr()
  {
  }

  protected void bAM()
  {
    this.mIq = true;
    this.mIo.Nu(this.query);
    bAS();
  }

  protected void bAQ()
  {
  }

  protected void bAS()
  {
    this.mIp.setVisibility(8);
    if (this.mIv != null)
      this.mIv.setVisibility(8);
    this.mIn.setVisibility(8);
  }

  protected void bAT()
  {
    this.mIp.setVisibility(0);
    this.mIp.setText(f.a(getString(2131302819), getString(2131302818), com.tencent.mm.plugin.fts.a.a.d.b(this.query, this.query)).mDR);
    if (this.mIv != null)
      this.mIv.setVisibility(8);
    this.mIn.setVisibility(8);
  }

  protected void bAU()
  {
    this.mIp.setVisibility(8);
    if (this.mIv != null)
      this.mIv.setVisibility(8);
    this.mIn.setVisibility(0);
  }

  protected void bAV()
  {
    this.mIp.setVisibility(8);
    if (this.mIv != null)
      this.mIv.setVisibility(8);
    this.mIn.setVisibility(8);
  }

  protected void bAW()
  {
  }

  protected void bAX()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    dyf();
    setMMTitle("");
    xE(this.mController.ylL.getResources().getColor(2131690310));
    bAQ();
    this.mIu = new com.tencent.mm.plugin.fts.ui.widget.d();
    this.mIu.zHa = this;
    this.mIu.mNe = false;
    this.mIn = ((ListView)findViewById(2131824198));
    if (aWz() != null)
    {
      ab.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "searchResultLV addFooterView");
      this.mIn.addFooterView(aWz());
    }
    this.mIo = a(this);
    this.mIo.mIm = this;
    this.mIn.setAdapter(this.mIo);
    this.mIn.setOnScrollListener(this.mIo);
    this.mIn.setOnItemClickListener(this.mIo);
    this.mIn.setOnTouchListener(new FTSBaseVoiceSearchUI.1(this));
    this.mIp = ((TextView)findViewById(2131820903));
    setBackBtn(new FTSBaseVoiceSearchUI.2(this));
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    this.mIu.a(this, paramMenu);
    if (!this.mIw)
    {
      this.mIu.qQ(true);
      this.mIw = true;
    }
    return true;
  }

  public void onDestroy()
  {
    this.mHE.removeMessages(1);
    this.mIo.finish();
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    this.mIu.clearFocus();
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    this.mIu.a(this, paramMenu);
    return true;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public boolean vN(String paramString)
  {
    ab.d("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onSearchKeyDown %s", new Object[] { paramString });
    aqX();
    if (this.mIu != null)
      this.mIu.clearFocus();
    return false;
  }

  public void vO(String paramString)
  {
    ab.v("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onSearchChange %s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
    {
      if (!this.mIu.dJs())
      {
        this.mIu.dJt();
        showVKB();
      }
      bAV();
    }
    paramString = com.tencent.mm.plugin.fts.a.d.Nc(paramString);
    if ((!bo.isNullOrNil(this.query)) && (this.query.equals(paramString)))
      ab.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "Same query %s %s", new Object[] { this.query, paramString });
    while (true)
    {
      return;
      this.query = paramString;
      if (!bo.isNullOrNil(this.query))
      {
        this.mHE.removeMessages(1);
        this.mHE.sendEmptyMessageDelayed(1, 300L);
      }
      else
      {
        this.mHE.removeMessages(1);
        this.mIq = false;
        this.mIo.stopSearch();
        bAV();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
 * JD-Core Version:    0.6.2
 */