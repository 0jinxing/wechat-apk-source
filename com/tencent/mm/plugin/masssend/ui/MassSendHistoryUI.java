package com.tencent.mm.plugin.masssend.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h.a;
import com.tencent.mm.ai.h.b;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.masssend.a.b;
import com.tencent.mm.plugin.masssend.a.h;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.j;
import junit.framework.Assert;

public class MassSendHistoryUI extends MMActivity
  implements h.a, h.b, SensorController.a
{
  private static SensorController mfW;
  private com.tencent.mm.audio.a.a chb;
  private n.d jOb;
  private boolean mfP;
  private View nDr;
  private ListView ooS;
  private c ooT;
  private Button ooU;
  private Button ooV;
  private MMPullDownView ooW;
  private boolean ooX;
  private LinearLayout ooY;

  public MassSendHistoryUI()
  {
    AppMethodBeat.i(22806);
    this.mfP = true;
    this.ooX = false;
    this.jOb = new MassSendHistoryUI.4(this);
    AppMethodBeat.o(22806);
  }

  private boolean Qx(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(22816);
    boolean bool2;
    if (paramString != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      mfW.a(this);
      paramString = h.bNE().Qs(paramString);
      aw.ZK();
      if ((com.tencent.mm.model.c.isSDCardAvailable()) || (bo.isNullOrNil(paramString.bNw())))
        break label72;
      t.hO(this);
      AppMethodBeat.o(22816);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label72: if (this.chb == null)
        this.chb = new com.tencent.mm.audio.a.a(this);
      this.chb.stop(false);
      if (this.chb.m(paramString.bNw(), this.mfP))
      {
        aw.ZL().f(this.mfP, false, false);
        this.chb.coD = this;
        this.chb.coC = this;
        AppMethodBeat.o(22816);
        bool2 = true;
      }
      else
      {
        Toast.makeText(this, getString(2131298205), 0).show();
        AppMethodBeat.o(22816);
        bool2 = bool1;
      }
    }
  }

  private void stopPlay()
  {
    AppMethodBeat.i(22817);
    mfW.dps();
    this.chb.stop(false);
    this.ooT.Qv("");
    releaseWakeLock();
    AppMethodBeat.o(22817);
  }

  public final void EA()
  {
    AppMethodBeat.i(22818);
    stopPlay();
    AppMethodBeat.o(22818);
  }

  public final int getLayoutId()
  {
    return 2130970071;
  }

  public final void he(boolean paramBoolean)
  {
    AppMethodBeat.i(22815);
    if (this.chb == null)
      AppMethodBeat.o(22815);
    while (true)
    {
      return;
      if (!this.chb.isPlaying())
      {
        this.chb.bo(true);
        aw.ZL().f(true, false, false);
        this.mfP = true;
        AppMethodBeat.o(22815);
      }
      else
      {
        this.chb.bo(paramBoolean);
        aw.ZL().f(paramBoolean, false, false);
        this.mfP = paramBoolean;
        if (!paramBoolean)
        {
          if (Qx(this.ooT.ooH))
          {
            this.ooT.Qv(this.ooT.ooH);
            AppMethodBeat.o(22815);
          }
          else
          {
            this.ooT.Qv("");
          }
        }
        else
          AppMethodBeat.o(22815);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(22811);
    this.ooX = getIntent().getBooleanExtra("finish_direct", false);
    ab.d("MicroMsg.MassSendHistoryUI", "isFromSearch  " + this.ooX);
    this.ooY = ((LinearLayout)findViewById(2131825921));
    this.ooS = ((ListView)findViewById(2131825918));
    this.ooS.setTranscriptMode(0);
    this.ooW = ((MMPullDownView)findViewById(2131825917));
    this.ooW.setOnTopLoadDataListener(new MassSendHistoryUI.5(this));
    this.ooW.setTopViewVisible(true);
    this.ooW.setAtBottomCallBack(new MassSendHistoryUI.6(this));
    this.ooW.setAtTopCallBack(new MassSendHistoryUI.7(this));
    this.ooW.setIsBottomShowAll(true);
    this.ooT = new c(this);
    this.ooT.a(new MassSendHistoryUI.8(this));
    this.nDr = findViewById(2131825919);
    this.ooS.setAdapter(this.ooT);
    this.ooS.setOnItemClickListener(new MassSendHistoryUI.9(this));
    this.ooS.setOnTouchListener(new MassSendHistoryUI.10(this));
    this.ooU = ((Button)findViewById(2131825922));
    this.ooU.setOnClickListener(new MassSendHistoryUI.11(this));
    this.ooV = ((Button)findViewById(2131825920));
    this.ooV.setOnClickListener(new MassSendHistoryUI.12(this));
    setBackBtn(new MassSendHistoryUI.2(this));
    addIconOptionMenu(0, 2131297046, 2131230758, new MassSendHistoryUI.3(this));
    new j(this).a(this.ooS, this, this.jOb);
    AppMethodBeat.o(22811);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22807);
    super.onCreate(paramBundle);
    setMMTitle(2131301406);
    if (mfW == null)
      mfW = new SensorController(getApplicationContext());
    initView();
    this.chb = new com.tencent.mm.audio.a.a(this);
    this.chb.coD = this;
    this.chb.coC = this;
    this.ooT.ooI = new MassSendHistoryUI.1(this);
    if (this.mController != null)
      this.mController.aC(3, false);
    AppMethodBeat.o(22807);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(22813);
    ab.v("MicroMsg.MassSendHistoryUI", "onCreateContextMenu");
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    String[] arrayOfString = ((com.tencent.mm.plugin.masssend.a.a)this.ooT.getItem(paramContextMenuInfo.position)).bNy().split(";");
    paramView = new StringBuilder();
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      Object localObject = arrayOfString[j];
      aw.ZK();
      localObject = com.tencent.mm.model.c.XM().aoO((String)localObject);
      if (localObject != null)
        paramView.append(((ad)localObject).Oj() + ";");
    }
    paramContextMenu.setHeaderTitle(paramView.toString());
    paramContextMenu.add(paramContextMenuInfo.position, 1, 0, getString(2131298154));
    AppMethodBeat.o(22813);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22810);
    this.ooT.bIf();
    super.onDestroy();
    AppMethodBeat.o(22810);
  }

  public final void onError()
  {
    AppMethodBeat.i(22819);
    stopPlay();
    AppMethodBeat.o(22819);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(22812);
    boolean bool;
    if (paramInt == 4)
      if (this.ooX)
      {
        finish();
        bool = true;
        AppMethodBeat.o(22812);
      }
    while (true)
    {
      return bool;
      paramKeyEvent = new Intent();
      paramKeyEvent.addFlags(67108864);
      com.tencent.mm.plugin.masssend.a.gkE.p(paramKeyEvent, this);
      finish();
      break;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(22812);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(22809);
    super.onPause();
    aw.ZL().La();
    h.bNE().d(this.ooT);
    mfW.dps();
    AppMethodBeat.o(22809);
  }

  public void onResume()
  {
    AppMethodBeat.i(22808);
    super.onResume();
    h.bNE().c(this.ooT);
    this.ooT.a(null, null);
    this.ooS.setSelection(this.ooT.getCount() - 1);
    AppMethodBeat.o(22808);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void releaseWakeLock()
  {
    AppMethodBeat.i(22814);
    this.ooS.setKeepScreenOn(false);
    AppMethodBeat.o(22814);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI
 * JD-Core Version:    0.6.2
 */