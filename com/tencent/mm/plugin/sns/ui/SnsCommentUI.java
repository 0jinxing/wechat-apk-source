package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q.b;

@a(17)
public class SnsCommentUI extends MMActivity
  implements f
{
  private int cNE;
  private int czs;
  private SnsEditText rrH;
  private int rrI = 0;
  private boolean rrJ = false;
  private boolean rrK = false;
  private com.tencent.mm.ui.base.p tipDialog = null;

  public void finish()
  {
    AppMethodBeat.i(38926);
    super.finish();
    long l1;
    long l2;
    String str1;
    String str2;
    String str3;
    long l3;
    Object localObject;
    if ((!this.rrK) && (this.rrI == 2))
    {
      l1 = getIntent().getLongExtra("sns_id", 0L);
      l2 = getIntent().getLongExtra("action_st_time", 0L);
      str1 = bo.bc(getIntent().getStringExtra("sns_uxinfo"), "");
      str2 = bo.bc(getIntent().getStringExtra("sns_actionresult"), "");
      str3 = str2 + "|4:0:";
      l3 = System.currentTimeMillis();
      localObject = af.cnx().coB();
      if ((localObject == null) || (!((com.tencent.mm.plugin.sns.g.h)localObject).coC()))
        AppMethodBeat.o(38926);
    }
    while (true)
    {
      return;
      str2 = ((com.tencent.mm.plugin.sns.g.h)localObject).qPn;
      localObject = ((com.tencent.mm.plugin.sns.g.h)localObject).qPm;
      ab.d("MicroMsg.SnsCommentUI", "report abtestnotlike " + l1 + " uxinfo:" + str1 + " actionresult: " + str3 + " " + l2 + " " + l3);
      com.tencent.mm.plugin.report.service.h.pYm.e(11988, new Object[] { str2, localObject, "", "", i.jV(l1), str1, str3, Long.valueOf(l2 / 1000L), Long.valueOf(l3 / 1000L) });
      AppMethodBeat.o(38926);
    }
  }

  public final int getLayoutId()
  {
    return 2130970756;
  }

  public final void initView()
  {
    AppMethodBeat.i(38924);
    this.rrH = ((SnsEditText)findViewById(2131821019));
    a(0, getString(2131297041), new SnsCommentUI.2(this), q.b.ymu);
    if (this.rrI == 0)
      setMMTitle(2131303612);
    while (true)
    {
      setBackBtn(new SnsCommentUI.3(this));
      this.rrH.addTextChangedListener(new SnsCommentUI.4(this));
      AppMethodBeat.o(38924);
      return;
      if (this.rrI == 1)
      {
        setMMTitle(2131303857);
        com.tencent.mm.kernel.g.RQ();
        String str = bo.bc((String)com.tencent.mm.kernel.g.RP().Ry().get(68408, ""), "");
        com.tencent.mm.kernel.g.RQ();
        int i = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(7489, Integer.valueOf(0)), 0);
        this.rrH.setPasterLen(i);
        this.rrH.append(bo.bc(str, ""));
        if ((str != null) && (str.length() > 0))
          enableOptionMenu(true);
        else
          enableOptionMenu(false);
      }
      else if (this.rrI == 2)
      {
        setMMTitle(2131303565);
        enableOptionMenu(false);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(38920);
    super.onCreate(paramBundle);
    this.cNE = getIntent().getIntExtra("sns_comment_localId", 0);
    this.rrI = getIntent().getIntExtra("sns_comment_type", 0);
    this.czs = getIntent().getIntExtra("sns_source", 0);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(213, this);
    initView();
    AppMethodBeat.o(38920);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(38923);
    super.onDestroy();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(213, this);
    AppMethodBeat.o(38923);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(38927);
    boolean bool;
    if (paramInt == 4)
    {
      aqX();
      finish();
      bool = true;
      AppMethodBeat.o(38927);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(38927);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(38921);
    super.onPause();
    if (this.rrH != null)
    {
      String str = this.rrH.getText().toString().trim();
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(68408, str);
      if (!bo.isNullOrNil(str))
      {
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(7489, Integer.valueOf(this.rrH.getPasterLen()));
        AppMethodBeat.o(38921);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(7489, Integer.valueOf(0));
      AppMethodBeat.o(38921);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(38922);
    super.onResume();
    showVKB();
    AppMethodBeat.o(38922);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(38925);
    ab.i("MicroMsg.SnsCommentUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramm.getType() + " @" + hashCode());
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    switch (paramm.getType())
    {
    default:
    case 213:
    }
    while (true)
    {
      AppMethodBeat.o(38925);
      return;
      if (this.rrJ)
        finish();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentUI
 * JD-Core Version:    0.6.2
 */