package com.tencent.mm.plugin.voip_cs.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.view.Display;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.f;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.voip.model.p.a;
import com.tencent.mm.plugin.voip.ui.VoipBigIconButton;
import com.tencent.mm.plugin.voip.video.MovableVideoView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Timer;
import java.util.TimerTask;

public final class b
  implements TextureView.SurfaceTextureListener, View.OnClickListener, p.a, com.tencent.mm.plugin.voip.video.g
{
  protected static int mScreenHeight;
  protected static int mScreenWidth;
  protected static final int[] sWo = { -1, 2131304399, 2131304404, 2131304403 };
  public boolean cAY;
  public TextView ejp;
  private TextView enf;
  private ak fbD;
  private Timer oGr;
  private View oIL;
  private ObservableTextureView oIY;
  private ImageButton oIs;
  private OpenGlView sWS;
  private OpenGlView sWT;
  public OpenGlRender sWU;
  public OpenGlRender sWV;
  private boolean sXI;
  private VoipBigIconButton sXq;
  private View.OnClickListener sYk;
  public VoipCSMainUI tdU;
  private RelativeLayout tdV;
  private TextView tdW;
  private TextView tdX;
  private TextView tdY;
  private TextView tdZ;
  public ImageView tea;
  private ak teb;
  private com.tencent.mm.plugin.voip_cs.c.a tec;
  private boolean ted;
  protected long tee;
  private boolean tef;
  private boolean teg;
  private int teh;
  private int tei;
  private com.tencent.mm.plugin.voip_cs.c.b tej;
  public String tek;
  public String tel;
  private ap tem;
  private ap ten;
  b.a teo;
  b.c tep;
  b.b teq;
  String ter;
  Drawable tes;

  public b(VoipCSMainUI paramVoipCSMainUI)
  {
    AppMethodBeat.i(135330);
    this.sXI = false;
    this.cAY = false;
    this.ted = false;
    this.tee = -1L;
    this.tef = false;
    this.teg = false;
    this.teh = 60000;
    this.tei = 5000;
    this.tej = new com.tencent.mm.plugin.voip_cs.c.b();
    this.tek = "";
    this.tel = "";
    this.tem = new ap(Looper.getMainLooper(), new b.1(this), false);
    this.ten = new ap(Looper.getMainLooper(), new b.2(this), false);
    this.sYk = new b.3(this);
    this.teo = new b.a(this, (byte)0);
    this.ter = "";
    this.tes = null;
    this.tdU = paramVoipCSMainUI;
    Object localObject = (WindowManager)paramVoipCSMainUI.getSystemService("window");
    int i = ((WindowManager)localObject).getDefaultDisplay().getHeight() / 5;
    int j = ((WindowManager)localObject).getDefaultDisplay().getWidth() * i / ((WindowManager)localObject).getDefaultDisplay().getHeight();
    if (Build.MANUFACTURER.equalsIgnoreCase("meizu"))
      ((RelativeLayout)paramVoipCSMainUI.findViewById(2131828499)).setPadding(0, 0, 0, BackwardSupportUtil.b.b(paramVoipCSMainUI.mController.ylL, 40.0F));
    this.sWT = new MovableVideoView(paramVoipCSMainUI.getApplicationContext());
    ((MovableVideoView)this.sWT).ga(j, i);
    this.sWT.setVisibility(8);
    this.sWU = new OpenGlRender(this.sWT, OpenGlRender.RenderRemote);
    this.sWT.setRenderer(this.sWU);
    this.sWT.setRenderMode(0);
    if (Build.MODEL.equals("Nexus 6"))
    {
      this.sWT.setZOrderOnTop(true);
      this.enf = ((TextView)paramVoipCSMainUI.findViewById(2131820988));
      this.enf.setVisibility(0);
      this.oGr = new Timer("voip_cs_talking_time");
      this.tdW = ((TextView)paramVoipCSMainUI.findViewById(2131828502));
      this.tdW.setVisibility(0);
      this.tdX = ((TextView)paramVoipCSMainUI.findViewById(2131828496));
      if (!paramVoipCSMainUI.cQL.equals("1"))
        break label1017;
      if (!paramVoipCSMainUI.type.equals("video"))
        break label998;
      this.tdX.setText(ah.getContext().getString(2131304382));
      label455: this.tdX.setVisibility(0);
      this.ejp = ((TextView)paramVoipCSMainUI.findViewById(2131828494));
      this.ejp.setVisibility(0);
      this.tea = ((ImageView)paramVoipCSMainUI.findViewById(2131828493));
      this.tea.setVisibility(0);
      this.tdZ = ((TextView)paramVoipCSMainUI.findViewById(2131828503));
      this.tdY = ((TextView)paramVoipCSMainUI.findViewById(2131828497));
      this.sXq = ((VoipBigIconButton)paramVoipCSMainUI.findViewById(2131828501));
      if ((paramVoipCSMainUI.teD == null) || (!paramVoipCSMainUI.teD.equals("1")))
        break label1068;
      this.sXq.setVisibility(0);
      this.sXq.setOnClickListener(this.sYk);
      label588: this.fbD = new ak();
      this.teb = new b.4(this);
      this.oIL = paramVoipCSMainUI.findViewById(2131828491);
      this.oIs = ((ImageButton)paramVoipCSMainUI.findViewById(2131828500));
      this.tdV = ((RelativeLayout)paramVoipCSMainUI.findViewById(2131828491));
      mScreenWidth = com.tencent.mm.bz.a.gd(paramVoipCSMainUI.mController.ylL);
      mScreenHeight = com.tencent.mm.plugin.voip_cs.c.c.fj(paramVoipCSMainUI.mController.ylL);
      this.sWS = ((OpenGlView)paramVoipCSMainUI.findViewById(2131828492));
      this.sWS.gb(mScreenWidth, mScreenHeight);
      this.sWV = new OpenGlRender(this.sWS, OpenGlRender.RenderLocal);
      this.sWS.setRenderer(this.sWV);
      this.sWS.setRenderMode(0);
      this.sWS.setVisibility(0);
      ab.i("MicroMsg.voipcs.VoipCSViewManager", "mScreenHeight %d", new Object[] { Integer.valueOf(mScreenHeight) });
      this.oIs.setOnClickListener(this);
      this.tdV.addView(this.sWT);
      this.sWT.setOnClickListener(new b.5(this));
      this.sWU.taA = true;
      this.sWV.taA = true;
      if (!com.tencent.mm.plugin.voip.a.d.fd(ah.getContext()))
        com.tencent.mm.plugin.voip.a.d.fe(ah.getContext());
      paramVoipCSMainUI = ah.doB();
      this.tek = paramVoipCSMainUI.getString(cMr(), "");
      if ((this.tdU.gEl == null) || (this.tdU.gEl.equals("")))
        break label1080;
      ace(this.tdU.gEl);
    }
    while (true)
    {
      this.tel = paramVoipCSMainUI.getString(cMs(), "");
      if (!bo.isNullOrNil(this.tel))
        acd(this.tel);
      paramVoipCSMainUI = com.tencent.mm.plugin.voip_cs.b.c.cMf();
      localObject = this.tdU.tdN;
      ab.d("MicroMsg.voipcs.VoipCSService", "start getBizInfo for username:".concat(String.valueOf(localObject)));
      com.tencent.mm.kernel.g.Rg().a(106, paramVoipCSMainUI);
      paramVoipCSMainUI = new f((String)localObject);
      com.tencent.mm.kernel.g.Rg().a(paramVoipCSMainUI, 0);
      AppMethodBeat.o(135330);
      return;
      this.sWT.setZOrderMediaOverlay(true);
      break;
      label998: this.tdX.setText(ah.getContext().getString(2131304383));
      break label455;
      label1017: if (paramVoipCSMainUI.type.equals("video"))
      {
        this.tdX.setText(ah.getContext().getString(2131304384));
        break label455;
      }
      this.tdX.setText(ah.getContext().getString(2131304383));
      break label455;
      label1068: this.sXq.setVisibility(8);
      break label588;
      label1080: if (!bo.isNullOrNil(this.tek))
        ace(this.tek);
    }
  }

  private void GX(int paramInt)
  {
    AppMethodBeat.i(135340);
    if ((this.tdU.teD != null) && (this.tdU.teD.equals("1")))
    {
      this.sXq.setVisibility(paramInt);
      AppMethodBeat.o(135340);
    }
    while (true)
    {
      return;
      this.sXq.setVisibility(8);
      AppMethodBeat.o(135340);
    }
  }

  private static int GZ(int paramInt)
  {
    int i = 2131304386;
    AppMethodBeat.i(135349);
    if (paramInt == 1)
    {
      paramInt = 2131304379;
      AppMethodBeat.o(135349);
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 0)
      {
        AppMethodBeat.o(135349);
        paramInt = i;
      }
      else if ((paramInt == -1) || (paramInt == 5))
      {
        paramInt = 2131304397;
        AppMethodBeat.o(135349);
      }
      else if ((paramInt == 403) || (paramInt == 404))
      {
        paramInt = 2131304405;
        AppMethodBeat.o(135349);
      }
      else if (paramInt == 6)
      {
        paramInt = 2131304400;
        AppMethodBeat.o(135349);
      }
      else if (paramInt == 1001)
      {
        paramInt = 2131304396;
        AppMethodBeat.o(135349);
      }
      else if (paramInt == 10)
      {
        paramInt = 2131304385;
        AppMethodBeat.o(135349);
      }
      else if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM < 2)
      {
        paramInt = 2131304377;
        AppMethodBeat.o(135349);
      }
      else
      {
        AppMethodBeat.o(135349);
        paramInt = i;
      }
    }
  }

  public static Drawable acf(String paramString)
  {
    AppMethodBeat.i(135346);
    try
    {
      URL localURL = new java/net/URL;
      localURL.<init>(paramString);
      paramString = Drawable.createFromStream((InputStream)localURL.getContent(), "urlDrawable");
      AppMethodBeat.o(135346);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.voipcs.VoipCSViewManager", "parse Drawable faill!");
        paramString = null;
        AppMethodBeat.o(135346);
      }
    }
  }

  private void cMv()
  {
    AppMethodBeat.i(135343);
    ab.i("MicroMsg.voipcs.VoipCSViewManager", "trigger dismiss button");
    this.fbD.postDelayed(new b.6(this), 10000L);
    AppMethodBeat.o(135343);
  }

  protected static String fQ(long paramLong)
  {
    AppMethodBeat.i(135347);
    String str = String.format("%02d:%02d", new Object[] { Long.valueOf(paramLong / 60L), Long.valueOf(paramLong % 60L) });
    AppMethodBeat.o(135347);
    return str;
  }

  private Point mA(boolean paramBoolean)
  {
    AppMethodBeat.i(135337);
    int i = ((WindowManager)this.tdU.getSystemService("window")).getDefaultDisplay().getHeight() / 5;
    float f = i;
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      Point localPoint = new Point((int)(mw(paramBoolean) * f), i);
      AppMethodBeat.o(135337);
      return localPoint;
    }
  }

  private void mG(boolean paramBoolean)
  {
    AppMethodBeat.i(135344);
    if (Build.MANUFACTURER.equalsIgnoreCase("sony"))
    {
      ab.i("MicroMsg.voipcs.VoipCSViewManager", "sony is not compatible,so we return.");
      AppMethodBeat.o(135344);
    }
    while (true)
    {
      return;
      if (!paramBoolean)
      {
        this.tdU.getWindow().setFlags(1024, 1024);
        AppMethodBeat.o(135344);
      }
      else
      {
        this.tdU.getWindow().clearFlags(1024);
        AppMethodBeat.o(135344);
      }
    }
  }

  private static float mw(boolean paramBoolean)
  {
    AppMethodBeat.i(135338);
    float f1 = 0.7476636F;
    float f2;
    if (paramBoolean)
      f2 = f1;
    try
    {
      for (Object localObject = com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.field_capInfo; ; localObject = com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.sUb)
      {
        f2 = f1;
        if (localObject != null)
        {
          f2 = f1;
          localObject = ByteBuffer.wrap((byte[])localObject);
          f2 = f1;
          if (((ByteBuffer)localObject).getInt() > 65535)
          {
            f2 = f1;
            ((ByteBuffer)localObject).order(ByteOrder.LITTLE_ENDIAN);
          }
          f2 = f1;
          ((ByteBuffer)localObject).getShort();
          f2 = f1;
          ((ByteBuffer)localObject).getShort();
          f2 = f1;
          float f3 = ((ByteBuffer)localObject).getInt() / 100.0F;
          if (f3 != 0.0F)
            f1 = f3;
          f2 = f1;
          ab.d("MicroMsg.voipcs.VoipCSViewManager", "use rate: %s, changed: %s", new Object[] { Float.valueOf(f1), Boolean.valueOf(paramBoolean) });
          f2 = f1;
        }
        AppMethodBeat.o(135338);
        return f2;
        f2 = f1;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.voipcs.VoipCSViewManager", "update failed: " + localException.getMessage());
    }
  }

  public final void GY(int paramInt)
  {
    AppMethodBeat.i(135348);
    ab.i("MicroMsg.voipcs.VoipCSViewManager", "onRefreshed for action:".concat(String.valueOf(paramInt)));
    if (this.oGr != null)
    {
      this.oGr.cancel();
      this.oGr = null;
    }
    if (!this.tem.doT())
      this.tem.stopTimer();
    if (!this.ten.doT())
      this.ten.stopTimer();
    this.tej.cLc();
    this.ted = false;
    this.tdZ.setVisibility(0);
    this.tdZ.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
    this.tdZ.setBackgroundResource(2130840615);
    this.tdZ.setCompoundDrawables(null, null, null, null);
    this.tdZ.setCompoundDrawablePadding(0);
    this.tdZ.setText(GZ(paramInt));
    if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM == 2)
      com.tencent.mm.sdk.g.d.post(new b.8(this), "VoipCS_play_end_sound");
    this.fbD.postDelayed(new b.9(this), 2000L);
    AppMethodBeat.o(135348);
  }

  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(135352);
    ab.d("MicroMsg.voipcs.VoipCSViewManager", "receive frame data , isPause : " + this.cAY);
    if (this.cAY)
      AppMethodBeat.o(135352);
    while (true)
    {
      return;
      if (this.teo.oHc == null)
      {
        this.teo.w = paramInt1;
        this.teo.h = paramInt2;
        this.teo.oHc = new int[this.teo.w * this.teo.h];
      }
      int i;
      if (this.tec.cLE())
      {
        i = OpenGlRender.FLAG_Mirror;
        label113: if (!this.tec.cLF())
          break label280;
      }
      label280: for (int j = OpenGlRender.FLAG_Angle270; ; j = OpenGlRender.FLAG_Angle90)
      {
        if (this.tef)
        {
          ab.d("MicroMsg.voipcs.VoipCSViewManager", "videoEncodeToSend , ret = ".concat(String.valueOf(com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.videoEncodeToSend(paramArrayOfByte, paramArrayOfByte.length, paramInt1, paramInt2, paramInt3 + paramInt4))));
          com.tencent.mm.plugin.voip_cs.b.a locala = com.tencent.mm.plugin.voip_cs.b.c.cMe().tew;
          locala.sVr += 1;
        }
        com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.videoEncodeToLocal(paramArrayOfByte, (int)paramLong, paramInt1, paramInt2, paramInt3 + paramInt4, 0, 75, this.teo.oHc);
        if (OpenGlRender.taQ != 1)
          break label325;
        if (!this.sXI)
          break label288;
        this.sWU.a(this.teo.oHc, paramInt1, paramInt2, OpenGlRender.FLAG_RGBAClip + i + j, false);
        AppMethodBeat.o(135352);
        break;
        i = 0;
        break label113;
      }
      label288: this.sWV.a(this.teo.oHc, paramInt1, paramInt2, OpenGlRender.FLAG_RGBAClip + i + j, false);
      AppMethodBeat.o(135352);
      continue;
      label325: if (OpenGlRender.taQ == 2)
      {
        if (this.sXI)
        {
          this.sWU.c(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.FLAG_NV21 + i + j, false);
          AppMethodBeat.o(135352);
        }
        else
        {
          this.sWV.c(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.FLAG_NV21 + i + j, false);
        }
      }
      else
        AppMethodBeat.o(135352);
    }
  }

  public final void acd(String paramString)
  {
    AppMethodBeat.i(135333);
    if (this.tdU.teG);
    for (paramString = paramString + ah.getContext().getString(2131304373); ; paramString = paramString + ah.getContext().getString(2131304374))
    {
      this.ejp.setText(paramString);
      AppMethodBeat.o(135333);
      return;
    }
  }

  public final void ace(String paramString)
  {
    AppMethodBeat.i(135334);
    if (!bo.isNullOrNil(paramString))
    {
      this.teq = new b.b(this);
      if ((this.tdU.gEl == null) || (this.tdU.gEl.equals("")))
        break label78;
    }
    label78: for (this.ter = this.tdU.gEl; ; this.ter = paramString)
    {
      com.tencent.mm.sdk.g.d.f(this.teq, "VOIPCS_netPic");
      AppMethodBeat.o(135334);
      return;
    }
  }

  public final void bGQ()
  {
    AppMethodBeat.i(135345);
    this.tem.stopTimer();
    this.ten.stopTimer();
    this.tej.cLc();
    this.tdY.setVisibility(8);
    this.tdX.setText(2131304402);
    this.tdW.setText(2131304390);
    GX(0);
    this.oIL.setOnClickListener(this);
    Object localObject;
    if ((this.tdU.teE != null) && (this.tdU.teE.equals("1")))
    {
      this.sWT.setVisibility(0);
      this.sXI = true;
      localObject = mA(this.sXI);
      ((MovableVideoView)this.sWT).ga(((Point)localObject).x, ((Point)localObject).y);
      cMw();
    }
    cMv();
    this.tef = true;
    if (this.oGr == null)
      this.oGr = new Timer("voip_cs_talking_time");
    if (this.ted)
      AppMethodBeat.o(135345);
    while (true)
    {
      return;
      if (this.tee == -1L)
        this.tee = bo.anT();
      this.ted = true;
      localObject = new b.7(this);
      this.oGr.schedule((TimerTask)localObject, 1000L, 1000L);
      com.tencent.mm.plugin.voip.model.p.cJR().cJS();
      com.tencent.mm.plugin.voip.model.p.cJR().a(this);
      AppMethodBeat.o(135345);
    }
  }

  public final void bGR()
  {
    AppMethodBeat.i(135351);
    this.tdZ.setVisibility(8);
    AppMethodBeat.o(135351);
  }

  public final void bSo()
  {
    AppMethodBeat.i(135353);
    ab.e("MicroMsg.voipcs.VoipCSViewManager", "init camera fail！");
    AppMethodBeat.o(135353);
  }

  public final void cMp()
  {
    AppMethodBeat.i(135331);
    if (this.tem.doT())
    {
      ap localap = this.tem;
      long l = this.teh;
      localap.ae(l, l);
    }
    AppMethodBeat.o(135331);
  }

  public final void cMq()
  {
    AppMethodBeat.i(135332);
    if (this.ten.doT())
    {
      ap localap = this.ten;
      long l = this.tei;
      localap.ae(l, l);
    }
    AppMethodBeat.o(135332);
  }

  public final String cMr()
  {
    AppMethodBeat.i(135335);
    String str = "voip_cs_headImageUrl_" + this.tdU.tdN;
    AppMethodBeat.o(135335);
    return str;
  }

  public final String cMs()
  {
    AppMethodBeat.i(135336);
    String str = "voip_cs_nickname_" + this.tdU.tdN;
    AppMethodBeat.o(135336);
    return str;
  }

  public final void cMt()
  {
    AppMethodBeat.i(135341);
    ab.i("MicroMsg.voipcs.VoipCSViewManager", "start capture render");
    if (this.oIY == null)
    {
      ab.i("MicroMsg.voipcs.VoipCSViewManager", "create capture View");
      this.oIY = new ObservableTextureView(this.tdU);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(1, 1);
      this.oIY.setLayoutParams(localLayoutParams);
      this.tdV.addView(this.oIY, new RelativeLayout.LayoutParams(1, 1));
      this.oIY.setVisibility(0);
    }
    if (this.tec == null)
    {
      int i = 320;
      int j = 240;
      com.tencent.mm.plugin.voip_cs.b.c.cMe();
      if (com.tencent.mm.plugin.voip_cs.b.a.sTV)
      {
        i = 640;
        j = 480;
      }
      ab.i("MicroMsg.voipcs.VoipCSViewManager", "create capture Render");
      this.tec = new com.tencent.mm.plugin.voip_cs.c.a(i, j);
      this.tec.a(this, true);
      this.tec.a(this.oIY);
      com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.sUm = this.tec.cLG();
      this.tec.cLC();
      this.tec.cMB();
      ab.i("MicroMsg.voipcs.VoipCSViewManager", "captureRender.mIsCurrentFaceCamera=%b captureRender.mIsCameraRemote180=%b", new Object[] { Boolean.valueOf(this.tec.cLE()), Boolean.valueOf(this.tec.cLF()) });
    }
    AppMethodBeat.o(135341);
  }

  public final void cMu()
  {
    AppMethodBeat.i(135342);
    ab.i("MicroMsg.voipcs.VoipCSViewManager", "stop capture render");
    if (this.oIY != null)
    {
      this.tdV.removeView(this.oIY);
      this.oIY = null;
    }
    if (this.tec != null)
    {
      this.tec.cLD();
      this.tec = null;
    }
    AppMethodBeat.o(135342);
  }

  public final void cMw()
  {
    AppMethodBeat.i(135354);
    cMx();
    this.tep = new b.c(this);
    com.tencent.mm.sdk.g.d.f(this.tep, "VOIPCS_VideoDecode");
    ab.d("MicroMsg.voipcs.VoipCSViewManager", "start video decode thread..");
    AppMethodBeat.o(135354);
  }

  public final void cMx()
  {
    AppMethodBeat.i(135355);
    if (this.tep != null)
    {
      ab.d("MicroMsg.voipcs.VoipCSViewManager", "stop videodecode thread...");
      this.tep.sQd = true;
      com.tencent.mm.sdk.g.d.xDG.remove(this.tep);
      this.tep = null;
    }
    AppMethodBeat.o(135355);
  }

  public final void ig(boolean paramBoolean)
  {
    AppMethodBeat.i(135350);
    this.tdZ.setVisibility(0);
    this.tdZ.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
    this.tdZ.setBackgroundResource(2130840615);
    this.tdZ.setCompoundDrawables(null, null, null, null);
    this.tdZ.setCompoundDrawablePadding(0);
    this.tdZ.setText(GZ(1001));
    AppMethodBeat.o(135350);
  }

  public final void onClick(View paramView)
  {
    boolean bool = false;
    AppMethodBeat.i(135339);
    if (paramView.getId() == 2131828500)
    {
      if (com.tencent.mm.plugin.voip_cs.b.c.cMf().tdM < 2);
      for (com.tencent.mm.plugin.voip_cs.b.c.cMg().dataType = 2; ; com.tencent.mm.plugin.voip_cs.b.c.cMg().dataType = 4)
      {
        paramView = com.tencent.mm.plugin.voip_cs.b.c.cMg();
        paramView.tcP = 1;
        paramView.tdm = 1;
        paramView.tcQ = ((int)(System.currentTimeMillis() / 1000L));
        paramView = com.tencent.mm.plugin.voip_cs.b.c.cMg();
        ab.d("MicroMsg.VoipCSReportHelper", "selfCancel");
        if (paramView.tdj == 0)
        {
          paramView.tde = 3;
          if ((paramView.tdn == 0L) && (paramView.tdz != 0))
            paramView.tdn = ((int)(System.currentTimeMillis() / 1000L) - paramView.tdz);
        }
        com.tencent.mm.plugin.voip_cs.b.c.cMg().cMh();
        ab.d("MicroMsg.voipcs.VoipCSViewManager", "user click hangup button!");
        GY(0);
        AppMethodBeat.o(135339);
        return;
      }
    }
    if (this.oIs.getVisibility() == 0);
    for (int i = 8; ; i = 0)
    {
      this.oIs.setVisibility(i);
      this.enf.setVisibility(i);
      this.tdW.setVisibility(i);
      GX(i);
      if (i == 0)
        bool = true;
      mG(bool);
      AppMethodBeat.o(135339);
      break;
    }
  }

  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
  }

  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    return false;
  }

  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
  }

  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.b
 * JD-Core Version:    0.6.2
 */