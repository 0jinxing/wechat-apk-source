package com.tencent.mm.plugin.sysvideo.ui.video;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.d;
import com.tencent.mm.compatible.e.x;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.i.a;
import com.tencent.mm.pluginsdk.i.b;
import com.tencent.mm.pluginsdk.i.f;
import com.tencent.mm.pluginsdk.i.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q.b;

public class VideoRecorderUI extends MMActivity
{
  private static VideoRecorderUI swV;
  private ProgressDialog ehJ;
  private long miD;
  private ap miP;
  private ak oHR;
  private boolean qhS;
  private String swB;
  private SurfaceView swF;
  private SurfaceHolder swG;
  private b swH;
  private ImageButton swI;
  private boolean swJ;
  private boolean swK;
  private TextView swL;
  private LinearLayout swM;
  private ImageView swN;
  private ImageButton swO;
  private ImageView swP;
  private TextView swQ;
  private TextView swR;
  private TextView swS;
  private int swT;
  private ImageButton swU;
  private boolean swW;
  private boolean swX;
  private String swY;
  private String swZ;
  private View sxa;
  private View sxb;
  SurfaceHolder.Callback sxc;
  private String talker;
  private String videoPath;

  public VideoRecorderUI()
  {
    AppMethodBeat.i(25657);
    this.swF = null;
    this.swG = null;
    this.talker = null;
    this.ehJ = null;
    this.swJ = false;
    this.swK = false;
    this.miD = -1L;
    this.swO = null;
    this.swT = 0;
    this.swW = false;
    this.swX = true;
    this.videoPath = null;
    this.swB = null;
    this.swY = null;
    this.swZ = null;
    this.miP = new ap(new VideoRecorderUI.1(this), true);
    this.oHR = new VideoRecorderUI.9(this);
    this.sxc = new VideoRecorderUI.3(this);
    AppMethodBeat.o(25657);
  }

  private void bHM()
  {
    AppMethodBeat.i(25665);
    getSupportActionBar().hide();
    this.swQ.setText(f.mK(0));
    this.sxa.setVisibility(8);
    this.sxb.setVisibility(8);
    this.swP.setVisibility(0);
    this.swJ = false;
    this.swM.setVisibility(0);
    this.swF.setVisibility(0);
    this.swL.setVisibility(8);
    this.swO.setVisibility(8);
    this.swQ.setText(f.mK(0));
    this.swN.setVisibility(8);
    this.swI.setEnabled(true);
    this.swU.setVisibility(0);
    AppMethodBeat.o(25665);
  }

  private void cDZ()
  {
    AppMethodBeat.i(25664);
    if (this.swJ)
    {
      h.a(this, getString(2131304267), getString(2131297061), new VideoRecorderUI.11(this), new VideoRecorderUI.12(this));
      AppMethodBeat.o(25664);
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(25664);
    }
  }

  private void cEa()
  {
    AppMethodBeat.i(25669);
    h.a(this, 2131304244, 2131297061, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(25648);
        VideoRecorderUI.h(VideoRecorderUI.this).diG();
        VideoRecorderUI.this.finish();
        AppMethodBeat.o(25648);
      }
    });
    AppMethodBeat.o(25669);
  }

  private void releaseWakeLock()
  {
    AppMethodBeat.i(25670);
    this.swF.setKeepScreenOn(false);
    AppMethodBeat.o(25670);
  }

  public final void dealContentView(View paramView)
  {
    AppMethodBeat.i(25662);
    com.tencent.mm.ui.ae.h(com.tencent.mm.ui.ae.a(getWindow(), null), this.mController.ylv);
    ((ViewGroup)this.mController.ylv.getParent()).removeView(this.mController.ylv);
    ((ViewGroup)getWindow().getDecorView()).addView(this.mController.ylv, 0);
    AppMethodBeat.o(25662);
  }

  public final int getLayoutId()
  {
    AppMethodBeat.i(25671);
    boolean bool;
    int i;
    if (d.Lt())
    {
      bool = true;
      this.qhS = bool;
      if (this.qhS)
        break label43;
      i = 2130970994;
      AppMethodBeat.o(25671);
    }
    while (true)
    {
      return i;
      bool = false;
      break;
      label43: getWindow().setFlags(1024, 1024);
      setRequestedOrientation(0);
      i = 2130970995;
      AppMethodBeat.o(25671);
    }
  }

  public final void initView()
  {
    int i = 1;
    AppMethodBeat.i(25661);
    this.swF = ((SurfaceView)findViewById(2131827545));
    this.swM = ((LinearLayout)findViewById(2131821705));
    this.swG = this.swF.getHolder();
    this.swG.addCallback(this.sxc);
    this.swG.setType(3);
    this.swP = ((ImageView)findViewById(2131828421));
    this.swU = ((ImageButton)findViewById(2131828423));
    this.swQ = ((TextView)findViewById(2131828422));
    this.sxa = findViewById(2131828420);
    this.sxb = findViewById(2131828425);
    this.swQ.setText(f.mK(0));
    this.swH = new b();
    this.swL = ((TextView)findViewById(2131828424));
    this.swR = ((TextView)findViewById(2131828427));
    this.swS = ((TextView)findViewById(2131828426));
    this.swI = ((ImageButton)findViewById(2131822715));
    this.swI.setOnClickListener(new VideoRecorderUI.7(this));
    b localb;
    label314: Object localObject;
    if (d.getNumberOfCameras() > 1)
    {
      this.swU.setVisibility(0);
      this.swU.setOnClickListener(new VideoRecorderUI.8(this));
      this.swO = ((ImageButton)findViewById(2131828428));
      this.swN = ((ImageView)findViewById(2131828419));
      this.swO.setOnClickListener(new VideoRecorderUI.10(this));
      localb = this.swH;
      if (this.qhS)
        break label579;
      j = 1;
      localObject = this.videoPath;
      String str1 = this.swB;
      String str2 = this.swY;
      String str3 = this.swZ;
      localb.fVl = 0;
      if (1 != localb.fVl)
        break label584;
      localb.qBs = a.diF();
      label358: if (com.tencent.mm.compatible.e.q.ete.etU)
      {
        localb.qBs.ouT = com.tencent.mm.compatible.e.q.ete.mVideoHeight;
        localb.qBs.ouU = com.tencent.mm.compatible.e.q.ete.mVideoWidth;
        localb.qBs.ouS = com.tencent.mm.compatible.e.q.ete.etW;
      }
      localb.filename = str3;
      localb.qBs.ovb = str1;
      localb.qBs.ouZ = str2;
      localb.qBs.ouY = ((String)localObject + "temp.pcm");
      localb.qBs.ouX = ((String)localObject + "temp.yuv");
      localb.qBs.ova = ((String)localObject + "temp.vid");
      localb.qBs.ovd = d.getNumberOfCameras();
      localObject = localb.qBs;
      if (j == 0)
        break label594;
    }
    label579: label584: label594: for (int j = i; ; j = 0)
    {
      ((a)localObject).rotate = j;
      localb.qBs.fXd = 0;
      localb.vfT = new g();
      AppMethodBeat.o(25661);
      return;
      this.swU.setVisibility(4);
      break;
      j = 0;
      break label314;
      localb.qBs = a.diE();
      break label358;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(25668);
    if (paramInt2 != -1)
      AppMethodBeat.o(25668);
    while (true)
    {
      return;
      if (paramInt1 == 0)
      {
        setResult(-1, paramIntent);
        finish();
      }
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(25668);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25658);
    super.onCreate(paramBundle);
    com.tencent.mm.ui.q.initLanguage(this);
    swV = this;
    getWindow().setFlags(1024, 1024);
    getSupportActionBar().hide();
    setMMTitle(2131304269);
    a(0, getString(2131297041), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(25649);
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("VideoRecorder_FileName", VideoRecorderUI.h(VideoRecorderUI.this).filename);
        paramAnonymousMenuItem.putExtra("VideoRecorder_VideoLength", VideoRecorderUI.h(VideoRecorderUI.this).qBs.fXd);
        paramAnonymousMenuItem.putExtra("VideoRecorder_ToUser", VideoRecorderUI.i(VideoRecorderUI.this));
        VideoRecorderUI.this.setResult(-1, paramAnonymousMenuItem);
        VideoRecorderUI.this.finish();
        AppMethodBeat.o(25649);
        return true;
      }
    }
    , q.b.ymu);
    setBackBtn(new VideoRecorderUI.6(this));
    this.talker = getIntent().getStringExtra("VideoRecorder_ToUser");
    this.videoPath = getIntent().getStringExtra("VideoRecorder_VideoPath");
    this.swB = getIntent().getStringExtra("VideoRecorder_VideoFullPath");
    this.swY = getIntent().getStringExtra("VideoRecorder_VideoThumbPath");
    this.swZ = getIntent().getStringExtra("VideoRecorder_FileName");
    ab.d("MicroMsg.VideoRecorderUI", "talker :" + this.talker);
    ab.d("MicroMsg.VideoRecorderUI", "videoPath :" + this.videoPath + " videoFullPath " + this.swB + " videoThumbPath " + this.swY + " KFileName " + this.swZ);
    initView();
    bHM();
    aw.Cc().Id();
    AppMethodBeat.o(25658);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(25660);
    swV = null;
    ab.v("MicroMsg.VideoRecorderUI", "on destroy");
    aw.Cc().Ic();
    super.onDestroy();
    AppMethodBeat.o(25660);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(25663);
    if (paramInt == 4)
    {
      ab.d("MicroMsg.VideoRecorderUI", "KEYCODE_BACK");
      if (this.swK)
        AppMethodBeat.o(25663);
    }
    while (true)
    {
      return bool;
      cDZ();
      AppMethodBeat.o(25663);
      continue;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(25663);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(25667);
    if (this.swK)
    {
      b localb = this.swH;
      if (localb.owh != null)
      {
        localb.owh.stop();
        localb.owh.release();
        localb.owh = null;
      }
      bHM();
      this.swK = false;
      releaseWakeLock();
      this.swI.setImageResource(2130840534);
      this.miP.stopTimer();
      this.swL.setVisibility(8);
      this.swM.setVisibility(0);
      this.swF.setVisibility(0);
    }
    this.swH.diG();
    ab.v("MicroMsg.VideoRecorderUI", "onPause");
    super.onPause();
    AppMethodBeat.o(25667);
  }

  public void onResume()
  {
    AppMethodBeat.i(25666);
    if ((!this.swX) && ((this.swH.b(this, false) != 0) || (this.swH.b(this.swG) != 0)))
      cEa();
    this.swX = false;
    ab.v("MicroMsg.VideoRecorderUI", "onResume");
    super.onResume();
    AppMethodBeat.o(25666);
  }

  public void onStart()
  {
    AppMethodBeat.i(25659);
    super.onStart();
    if (this.qhS)
    {
      setRequestedOrientation(0);
      AppMethodBeat.o(25659);
    }
    while (true)
    {
      return;
      setRequestedOrientation(1);
      AppMethodBeat.o(25659);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderUI
 * JD-Core Version:    0.6.2
 */