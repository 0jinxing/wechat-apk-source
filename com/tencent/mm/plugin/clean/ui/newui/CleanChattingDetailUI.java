package com.tencent.mm.plugin.clean.ui.newui;

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
import com.tencent.mm.plugin.clean.c.d;
import com.tencent.mm.plugin.clean.c.e;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.gridviewheaders.GridHeadersGridView;
import com.tencent.mm.ui.widget.textview.MMAutoAdjustTextView;
import java.util.ArrayList;

public class CleanChattingDetailUI extends MMActivity
  implements com.tencent.mm.plugin.clean.c.h
{
  private ProgressDialog ehJ;
  private Button gzI;
  private int index;
  private View kxA;
  CheckBox kxB;
  MMAutoAdjustTextView kxC;
  private GridHeadersGridView kxy;
  private b kyJ;
  private com.tencent.mm.plugin.clean.c.b kyK;
  private e kyL;

  public final void dP(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(18871);
    this.ehJ.setMessage(getString(2131298315, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
    AppMethodBeat.o(18871);
  }

  public final int getLayoutId()
  {
    return 2130969142;
  }

  public final void hi(long paramLong)
  {
    AppMethodBeat.i(18872);
    this.ehJ.dismiss();
    d.hg(d.bfW() + paramLong);
    d.hd(d.bfT() - paramLong);
    com.tencent.mm.ui.base.h.a(this, getString(2131298296, new Object[] { bo.ga(paramLong) }), "", new CleanChattingDetailUI.5(this));
    AppMethodBeat.o(18872);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18868);
    super.onCreate(paramBundle);
    d.bfZ();
    this.index = getIntent().getIntExtra("key_position", -1);
    if (this.index < 0)
    {
      finish();
      AppMethodBeat.o(18868);
    }
    while (true)
    {
      return;
      if (d.bfS() != null)
        break;
      finish();
      AppMethodBeat.o(18868);
    }
    this.kxA = findViewById(2131821612);
    this.kxB = ((CheckBox)findViewById(2131821610));
    this.kxC = ((MMAutoAdjustTextView)findViewById(2131822773));
    this.gzI = ((Button)findViewById(2131822772));
    tx(0);
    this.kyK = ((com.tencent.mm.plugin.clean.c.b)d.bfS().get(this.index));
    if (t.kH(this.kyK.username))
      setMMTitle(s.getDisplayName(this.kyK.username, this.kyK.username));
    while (true)
    {
      this.kxy = ((GridHeadersGridView)findViewById(2131822771));
      this.kxy.setNumColumns(3);
      this.kyJ = new b(this, this.kyK.kwf);
      this.kxy.setOnHeaderClickListener(this.kyJ.kxn);
      this.kxy.setOnItemClickListener(this.kyJ.jMk);
      this.kxy.setOnScrollListener(this.kyJ.kxp);
      this.kxy.setAdapter(this.kyJ);
      setBackBtn(new CleanChattingDetailUI.1(this));
      this.kxA.setOnClickListener(new CleanChattingDetailUI.2(this));
      this.gzI.setOnClickListener(new CleanChattingDetailUI.3(this));
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131298295), false, new CleanChattingDetailUI.4(this));
      this.ehJ.dismiss();
      AppMethodBeat.o(18868);
      break;
      setMMTitle(s.mJ(this.kyK.username));
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(18870);
    if (this.ehJ.isShowing())
      this.ehJ.dismiss();
    if (this.kyL != null)
      this.kyL.bgb();
    d.bga();
    d.bfY();
    super.onDestroy();
    AppMethodBeat.o(18870);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void tx(int paramInt)
  {
    AppMethodBeat.i(18869);
    if (paramInt > 0);
    for (boolean bool = true; ; bool = false)
    {
      this.gzI.setEnabled(bool);
      AppMethodBeat.o(18869);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanChattingDetailUI
 * JD-Core Version:    0.6.2
 */