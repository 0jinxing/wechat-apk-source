package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.gridviewheaders.GridHeadersGridView;
import com.tencent.mm.ui.widget.textview.MMAutoAdjustTextView;

public class CleanChattingDetailUI extends MMActivity
  implements com.tencent.mm.plugin.clean.c.h
{
  private ProgressDialog ehJ;
  private Button gzI;
  private long kvY;
  private View kxA;
  CheckBox kxB;
  MMAutoAdjustTextView kxC;
  private com.tencent.mm.plugin.clean.b.b kxD;
  private GridHeadersGridView kxy;
  private b kxz;
  private int pos;
  private String username;

  public final void dP(final int paramInt1, final int paramInt2)
  {
    AppMethodBeat.i(18775);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(18770);
        CleanChattingDetailUI.c(CleanChattingDetailUI.this).setMessage(CleanChattingDetailUI.this.getString(2131298315, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
        AppMethodBeat.o(18770);
      }
    });
    AppMethodBeat.o(18775);
  }

  public final int getLayoutId()
  {
    return 2130969142;
  }

  public final void hi(long paramLong)
  {
    AppMethodBeat.i(18776);
    ab.i("MicroMsg.CleanChattingDetailUI", "%s onDeleteEnd [%d] ", new Object[] { hashCode(), Long.valueOf(paramLong) });
    j.bgd().kvW -= paramLong;
    j.bgd().kvV -= paramLong;
    this.kvY += paramLong;
    al.d(new CleanChattingDetailUI.6(this, paramLong));
    AppMethodBeat.o(18776);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18772);
    super.onCreate(paramBundle);
    this.username = getIntent().getStringExtra("key_username");
    this.pos = getIntent().getIntExtra("key_pos", 0);
    if (bo.isNullOrNil(this.username))
    {
      ab.w("MicroMsg.CleanChattingDetailUI", "username is null");
      finish();
      AppMethodBeat.o(18772);
      return;
    }
    this.kxA = ((View)findViewById(2131821612));
    this.kxB = ((CheckBox)findViewById(2131821610));
    this.kxC = ((MMAutoAdjustTextView)findViewById(2131822773));
    this.gzI = ((Button)findViewById(2131822772));
    tx(0);
    if (t.kH(this.username))
      setMMTitle(s.getDisplayName(this.username, this.username));
    while (true)
    {
      this.kxy = ((GridHeadersGridView)findViewById(2131822771));
      this.kxy.setNumColumns(3);
      this.kxz = new b(this, this.username);
      this.kxy.setOnHeaderClickListener(this.kxz.kxn);
      this.kxy.setOnItemClickListener(this.kxz.jMk);
      this.kxy.setOnScrollListener(this.kxz.kxp);
      this.kxy.setAdapter(this.kxz);
      setBackBtn(new CleanChattingDetailUI.1(this));
      this.kxA.setOnClickListener(new CleanChattingDetailUI.2(this));
      this.gzI.setOnClickListener(new CleanChattingDetailUI.3(this));
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131298295), false, new CleanChattingDetailUI.4(this));
      this.ehJ.dismiss();
      if (this.kxz != null)
        d.post(new b.b(this.kxz, (byte)0), "load_clean_detail");
      com.tencent.mm.plugin.report.service.h.pYm.a(714L, 30L, 1L, false);
      AppMethodBeat.o(18772);
      break;
      setMMTitle(s.mJ(this.username));
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(18774);
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
      this.ehJ.dismiss();
    if (this.kxz != null)
      this.kxz.isStop = true;
    super.onDestroy();
    AppMethodBeat.o(18774);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void tx(int paramInt)
  {
    AppMethodBeat.i(18773);
    if (paramInt > 0);
    for (boolean bool = true; ; bool = false)
    {
      this.gzI.setEnabled(bool);
      AppMethodBeat.o(18773);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI
 * JD-Core Version:    0.6.2
 */