package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.model.ap.b;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import java.io.IOException;

public class SnsSingleTextViewUI extends MMActivity
{
  private String czD;
  private n.d jOb;
  private ClipboardManager mmO;
  private n qNM;
  protected int requestType;
  private TextView rxb;
  private String rxc;
  private String rxd;
  private int rxe;
  private byte[] rxf;
  private cat rxg;
  private boolean rxh;
  private SnsTranslateResultView rxi;
  private c rxj;
  private c rxk;
  private c rxl;
  private String text;

  public SnsSingleTextViewUI()
  {
    AppMethodBeat.i(39306);
    this.requestType = 0;
    this.rxc = null;
    this.rxd = null;
    this.rxf = null;
    this.rxg = null;
    this.rxh = false;
    this.rxj = new SnsSingleTextViewUI.1(this);
    this.rxk = new SnsSingleTextViewUI.2(this);
    this.rxl = new SnsSingleTextViewUI.3(this);
    this.jOb = new SnsSingleTextViewUI.5(this);
    AppMethodBeat.o(39306);
  }

  private boolean ctO()
  {
    boolean bool1 = false;
    AppMethodBeat.i(39310);
    boolean bool2;
    if (this.rxg == null)
      bool2 = bool1;
    while (true)
    {
      AppMethodBeat.o(39310);
      return bool2;
      if (this.rxg.wZG == 0)
      {
        bool2 = bool1;
        if (this.rxg.wZJ == 0L);
      }
      else
      {
        bool2 = bool1;
        if (!bo.isNullOrNil(this.rxg.ncM))
          bool2 = true;
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130970801;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39307);
    super.onCreate(paramBundle);
    this.mmO = ((ClipboardManager)ah.getContext().getSystemService("clipboard"));
    setMMTitle(2131303597);
    setBackBtn(new SnsSingleTextViewUI.4(this));
    this.text = getIntent().getStringExtra("sns_text_show");
    this.czD = bo.bc(getIntent().getStringExtra("sns_local_id"), "");
    this.rxf = getIntent().getByteArrayExtra("sns_comment_buf");
    if ((this.rxf != null) && (this.rxf.length > 0))
      this.rxg = new cat();
    try
    {
      this.rxg.parseFrom(this.rxf);
      paramBundle = new java/lang/StringBuilder;
      paramBundle.<init>();
      if (this.rxg.wZG != 0);
      for (long l = this.rxg.wZG; ; l = this.rxg.wZJ)
      {
        this.rxc = l;
        this.qNM = af.cnF().YT(this.czD);
        if (bo.isNullOrNil(this.text))
          this.text = "";
        this.rxb = ((TextView)findViewById(2131827850));
        this.rxb.setText(this.text, TextView.BufferType.SPANNABLE);
        com.tencent.mm.pluginsdk.ui.e.j.h(this.rxb, 2);
        this.rxb.setOnTouchListener(new m());
        new com.tencent.mm.ui.tools.j(this).a(this.rxb, this, this.jOb);
        this.rxi = ((SnsTranslateResultView)findViewById(2131827715));
        this.rxi.setResultTextSize(this.rxb.getTextSize());
        if (this.qNM != null)
        {
          if (ctO())
            break;
          this.rxd = this.qNM.cqA();
          this.rxe = 1;
          if (ap.db(this.rxd, 8))
          {
            paramBundle = ap.Ye(this.rxd);
            if ((paramBundle != null) && (paramBundle.foa))
            {
              this.rxi.setVisibility(0);
              this.rxi.a(null, this.rxe, paramBundle.result, paramBundle.fwM, false);
              this.rxh = true;
            }
          }
        }
        a.xxA.c(this.rxj);
        a.xxA.c(this.rxk);
        a.xxA.c(this.rxl);
        AppMethodBeat.o(39307);
        return;
      }
    }
    catch (IOException paramBundle)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsSingleTextViewUI", paramBundle, "initCommentInfo error.", new Object[0]);
        continue;
        this.rxd = ap.ga(this.qNM.cqA(), this.rxc);
        this.rxe = 2;
      }
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(39309);
    if ((paramView instanceof TextView))
    {
      paramContextMenu.add(0, 0, 0, getString(2131296875));
      if ((d.afj("favorite")) && (!ctO()))
        paramContextMenu.add(0, 1, 0, getString(2131299589));
      paramContextMenu.add(0, 6, 1, getString(2131296908));
      if (!this.rxh)
      {
        if (!ctO());
        while (true)
        {
          ap.a(paramContextMenu, bool2);
          AppMethodBeat.o(39309);
          return;
          bool2 = false;
        }
      }
      if (ctO())
        break label146;
    }
    label146: for (bool2 = bool1; ; bool2 = false)
    {
      ap.b(paramContextMenu, bool2);
      AppMethodBeat.o(39309);
      break;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39308);
    super.onDestroy();
    a.xxA.d(this.rxj);
    a.xxA.d(this.rxk);
    a.xxA.d(this.rxl);
    AppMethodBeat.o(39308);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI
 * JD-Core Version:    0.6.2
 */