package com.tencent.mm.ui.chatting.gallery;

import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lp;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.d.a;
import com.tencent.mm.model.n;
import com.tencent.mm.modelsimple.y;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.modelvideo.t.a.a;
import com.tencent.mm.modelvideo.y.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.e;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.a;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.al.a;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;

public final class j extends a
  implements d.a, t.a
{
  public static boolean yWS = false;
  private String filename;
  private com.tencent.mm.model.d iaf;
  private ap klw;
  private long lastCheckTime;
  int mqi;
  private com.tencent.mm.plugin.n.b orK;
  private ap rcg;
  private e.e rlb;
  private boolean rll;
  private long rlp;
  private long rlq;
  private long rlu;
  private int rlv;
  private com.tencent.mm.plugin.sight.decode.ui.b vgC;
  private long vgx;
  private HashMap<String, j.a> yVF;
  private com.tencent.mm.sdk.b.c yWI;
  final SparseArray<s> yWJ;
  private m yWK;
  private boolean yWL;
  private boolean yWM;
  private boolean yWN;
  private int yWO;
  private int yWP;
  private int yWQ;
  private boolean yWR;
  ak yWT;
  private int yWU;
  private com.tencent.mm.sdk.b.c<lp> yWV;
  private boolean yWW;
  private int yWX;
  private int[] yWY;

  public j(c paramc)
  {
    super(paramc);
    AppMethodBeat.i(32335);
    this.yWJ = new SparseArray();
    this.yWL = false;
    this.yWM = false;
    this.yWN = false;
    this.yWO = 0;
    this.vgx = 0L;
    this.lastCheckTime = 0L;
    this.yWP = 0;
    this.yWQ = 0;
    this.rlp = 0L;
    this.rlq = 0L;
    this.mqi = 0;
    this.yWR = false;
    this.yWT = new ak(Looper.getMainLooper(), new ak.a()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(32324);
        if (paramAnonymousMessage.what == 1)
        {
          paramAnonymousMessage = j.this.yTG.dFP();
          if ((paramAnonymousMessage != null) && (!bo.isNullOrNil(j.a(j.this))))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "%d ui on pause, pause video now. %s", new Object[] { Integer.valueOf(hashCode()), j.a(j.this) });
            if (!j.b(j.this))
              com.tencent.mm.modelvideo.u.f(j.a(j.this), paramAnonymousMessage.dGH().yXp.getCurrentPosition(), j.c(j.this));
            j.a(j.this, paramAnonymousMessage);
            j.d(j.this).cy(false);
            if (j.c(j.this))
            {
              com.tencent.mm.sdk.b.a.xxA.d(j.e(j.this));
              j.f(j.this).dGK();
              j.a(j.this, false);
            }
          }
          j.g(j.this);
        }
        AppMethodBeat.o(32324);
        return false;
      }
    });
    this.yWU = 0;
    this.rcg = new ap(new j.13(this), true);
    this.klw = new ap(new j.14(this), true);
    this.vgC = new j.2(this);
    this.yWV = new j.3(this);
    this.yWW = false;
    this.yWX = 0;
    this.yWY = new int[] { -1000, -2000, 3400 };
    this.rlb = new j.6(this);
    this.orK = new j.7(this);
    this.yVF = new HashMap();
    this.yWK = new m(this);
    com.tencent.mm.sdk.b.a locala = com.tencent.mm.sdk.b.a.xxA;
    paramc = new com.tencent.mm.ui.chatting.al(al.a.yMf, paramc.yTI);
    this.yWI = paramc;
    locala.c(paramc);
    com.tencent.mm.sdk.b.a.xxA.c(this.yWV);
    this.iaf = new com.tencent.mm.model.d();
    AppMethodBeat.o(32335);
  }

  private void a(bi parambi, s params)
  {
    AppMethodBeat.i(32342);
    if ((!com.tencent.mm.network.ab.ch(this.yTG.yTI.mController.ylL)) && (!yWS))
      yWS = true;
    b(parambi, params);
    AppMethodBeat.o(32342);
  }

  private void a(bi parambi, s params, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(32341);
    if ((parambi == null) || (params == null))
      AppMethodBeat.o(32341);
    while (true)
    {
      return;
      if (parambi.dtH())
      {
        Toast.makeText(this.yTG.yTI, 2131304251, 0).show();
        AppMethodBeat.o(32341);
      }
      else
      {
        if (params.fXk != -1)
          break;
        localObject1 = params.alv();
        localObject2 = localObject1;
        if (com.tencent.mm.vfs.e.ct((String)localObject1))
          break label340;
        o.all();
        localObject2 = com.tencent.mm.modelvideo.t.uh(parambi.field_imgPath);
        label93: if ((localObject2 != null) && (com.tencent.mm.vfs.e.ct((String)localObject2)))
          break label343;
        Toast.makeText(this.yTG.yTI, 2131304251, 0).show();
        AppMethodBeat.o(32341);
      }
    }
    o.all();
    Object localObject1 = com.tencent.mm.modelvideo.t.uh(parambi.field_imgPath);
    Object localObject2 = localObject1;
    if (parambi.field_isSend == 1)
    {
      localObject2 = localObject1;
      if (params.fXn != null)
      {
        localObject2 = localObject1;
        if (!params.fXn.wDP);
      }
    }
    while (true)
    {
      try
      {
        Object localObject4 = com.tencent.mm.vfs.e.atb((String)localObject1);
        localObject2 = localObject4;
        if (!((String)localObject4).endsWith("/"))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = (String)localObject4 + "/";
        }
        String str = com.tencent.mm.vfs.e.atd((String)localObject1);
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject2 = (String)localObject2 + str + "_hd.mp4";
        bool = com.tencent.mm.vfs.e.ct((String)localObject2);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "local capture video, hdFilePath: %s, exist: %s", new Object[] { localObject2, Boolean.valueOf(bool) });
        if (!bool)
          break label1106;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.Imagegallery.handler.video", "try to get hd filePath error: %s", new Object[] { localException.getMessage() });
        localObject3 = localObject1;
      }
      label340: break label93;
      label343: localObject1 = OJ(paramInt);
      if (localObject1 == null)
      {
        AppMethodBeat.o(32341);
        break;
      }
      int i = 0;
      if (com.tencent.mm.model.t.kH(params.getUser()))
        i = n.mA(params.getUser());
      boolean bool = r.ua(localObject3);
      int j = this.yTG.yTI.np(parambi.field_msgId);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "play video pos[%d], isOnlinePlay[%b] opcode[%d] resetByCompletion[%b]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), Integer.valueOf(j), Boolean.valueOf(this.yWR) });
      if (!bool)
      {
        if ((com.tencent.mm.compatible.e.q.etn.esh == 1) && (com.tencent.mm.pluginsdk.h.b.a.a.b(params.getFileName(), this.yTG.yTI.mController.ylL, bool)))
        {
          AppMethodBeat.o(32341);
          break;
        }
        aw.ZK();
        if ((((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xPd, Integer.valueOf(0))).intValue() == 1) && (((k)localObject1).yXr != null))
        {
          ((k)localObject1).yXr.setVisibility(0);
          ((k)localObject1).yXr.setText(com.tencent.mm.plugin.sight.base.d.RK(localObject3));
        }
        ((k)localObject1).a(params.fXd, params.frO, i, params.getUser(), s.ue(params.alw()), params.createTime);
        this.rll = paramBoolean;
        this.yWL = true;
        this.filename = params.getFileName();
        if (j == 3)
        {
          ((k)localObject1).dGH().yXp.setMute(true);
          label630: if ((((k)localObject1).dGH().yXp.getVideoPath() == null) || (!((k)localObject1).dGH().yXp.getVideoPath().equals(localObject3)) || (((k)localObject1).dGH().yXp.isPlaying()) || (this.yWR))
            break label857;
          ((k)localObject1).a(true, 1.0F);
          ((k)localObject1).dGH().yXp.start();
          csg();
          if (!paramBoolean)
            arz(this.filename);
          Pg(((k)localObject1).dGH().yXp.getCurrentPosition() / 1000);
          cV(false);
          label754: b(paramInt, params);
          this.yTG.yTI.qx(false);
          this.yTG.yTI.mController.ylL.getWindow().addFlags(128);
          if (com.tencent.mm.compatible.util.d.fP(18))
            arz(this.filename);
          this.iaf.a(this);
        }
      }
      while (true)
      {
        ((k)localObject1).dGH().yXq.setVisibility(8);
        AppMethodBeat.o(32341);
        break;
        ((k)localObject1).dGH().yXp.setMute(false);
        break label630;
        label857: this.yWN = false;
        this.yWR = false;
        ((k)localObject1).dGH().yXp.setVideoPath(localObject3);
        if ((((k)localObject1).dGH().yXp instanceof VideoPlayerTextureView))
        {
          ((VideoPlayerTextureView)((k)localObject1).dGH().yXp).setIOnlineCache(this.orK);
          ((VideoPlayerTextureView)((k)localObject1).dGH().yXp).setNeedResetExtractor(bwE());
          ((VideoPlayerTextureView)((k)localObject1).dGH().yXp).setIsOnlineVideoType(paramBoolean);
        }
        ((k)localObject1).a(true, 0.0F);
        break label754;
        h.pYm.e(12084, new Object[] { Integer.valueOf(params.frO), Integer.valueOf(params.fXd * 1000), Integer.valueOf(0), Integer.valueOf(3), params.getUser(), Integer.valueOf(i), s.ue(params.alw()), Long.valueOf(params.createTime) });
        if (!com.tencent.mm.pluginsdk.h.b.a.a.c(localObject3, this.yTG.yTI.mController.ylL, bool))
          Toast.makeText(this.yTG.yTI.mController.ylL, this.yTG.yTI.getString(2131304264), 0).show();
      }
      label1106: Object localObject3 = localObject1;
    }
  }

  private void b(int paramInt, s params)
  {
    AppMethodBeat.i(32355);
    this.yWJ.put(paramInt, params);
    AppMethodBeat.o(32355);
  }

  private void b(bi parambi, s params)
  {
    AppMethodBeat.i(32343);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "startDownloading [%d]", new Object[] { Integer.valueOf(hashCode()) });
    if ((parambi == null) || (params == null))
      AppMethodBeat.o(32343);
    while (true)
    {
      return;
      k localk = this.yTG.dFP();
      if (localk == null)
      {
        AppMethodBeat.o(32343);
      }
      else
      {
        y.C(parambi);
        int i = this.yTG.yTI.np(parambi.field_msgId);
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.Imagegallery.handler.video", "enterVideoOpCode : ".concat(String.valueOf(i)));
        switch (i)
        {
        default:
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "enterVideoOpCode[%d] is error", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(32343);
          break;
        case 3:
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "%d mute play video [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i) });
        case 0:
          if (this.yWK.arA(parambi.field_imgPath))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "start online play video.");
            this.rll = true;
            o.all().a(this);
            this.yTG.yTI.dGm();
            this.yWW = false;
            localk.dGH().yXo.setVisibility(8);
            localk.dGH().yXq.setVisibility(8);
            localk.dGH().yXx.setVisibility(0);
            AppMethodBeat.o(32343);
          }
          else
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "start offline play video.");
            this.rll = false;
            o.all().a(this, Looper.getMainLooper());
            com.tencent.mm.modelvideo.u.up(parambi.field_imgPath);
            this.yTG.yTI.dGm();
            this.yWW = false;
            localk.dGH().yXo.setVisibility(8);
            localk.dGH().yXq.setVisibility(0);
            localk.dGH().yXq.setProgress(com.tencent.mm.modelvideo.u.g(params));
            AppMethodBeat.o(32343);
          }
          break;
        case 1:
        case 2:
          if (params.aly())
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "start complete online video");
            com.tencent.mm.modelvideo.u.uA(parambi.field_imgPath);
          }
          while (true)
          {
            o.all().a(this, Looper.getMainLooper());
            this.yTG.yTI.dGm();
            this.yWW = false;
            localk.dGH().yXo.setVisibility(8);
            localk.dGH().yXq.setVisibility(0);
            localk.dGH().yXq.setProgress(com.tencent.mm.modelvideo.u.g(params));
            if (i != 2)
              break label518;
            dGD();
            AppMethodBeat.o(32343);
            break;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "start complete offline video");
            eC(parambi.field_imgPath, 10);
            com.tencent.mm.modelvideo.u.up(parambi.field_imgPath);
          }
          label518: dGC();
          AppMethodBeat.o(32343);
        }
      }
    }
  }

  private void b(k paramk)
  {
    AppMethodBeat.i(32347);
    if (paramk == null)
      AppMethodBeat.o(32347);
    while (true)
    {
      return;
      cse();
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.Imagegallery.handler.video", "pause video.");
      if (paramk.dGH().yXp.isPlaying())
      {
        paramk.dGH().yXp.pause();
        csh();
      }
      AppMethodBeat.o(32347);
    }
  }

  private boolean b(j.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(32345);
    if (parama == null)
      AppMethodBeat.o(32345);
    while (true)
    {
      return bool;
      o.all().a(this);
      if (this.yTG.yTI.getCurrentItem() == parama.pos)
      {
        parama = OJ(parama.pos);
        if (parama != null)
        {
          parama.dGH().yXx.setVisibility(8);
          parama.dGH().yXq.setVisibility(8);
          parama.dGH().yXo.setVisibility(8);
        }
        this.yWW = true;
        this.yTG.yTI.dGl();
        AppMethodBeat.o(32345);
        bool = true;
      }
      else
      {
        this.yTG.OR(parama.pos);
        AppMethodBeat.o(32345);
      }
    }
  }

  public static s bG(bi parambi)
  {
    AppMethodBeat.i(32337);
    if (!c.f(parambi))
    {
      parambi = null;
      AppMethodBeat.o(32337);
    }
    while (true)
    {
      return parambi;
      parambi = com.tencent.mm.modelvideo.u.ut(parambi.field_imgPath);
      AppMethodBeat.o(32337);
    }
  }

  private boolean bwE()
  {
    boolean bool = false;
    AppMethodBeat.i(32372);
    if (!this.rll)
      AppMethodBeat.o(32372);
    while (true)
    {
      return bool;
      aw.ZK();
      bool = com.tencent.mm.model.c.Ry().getBoolean(ac.a.xQl, false);
      AppMethodBeat.o(32372);
    }
  }

  private boolean c(k paramk)
  {
    boolean bool = false;
    AppMethodBeat.i(32369);
    int i = this.yWO;
    this.yWO = paramk.dGH().yXp.getCurrentPosition();
    int j;
    if (i != this.yWO)
    {
      this.lastCheckTime = bo.anU();
      long l = paramk.dGH().yXp.getLastSurfaceUpdateTime();
      if ((l > 0L) && (l != this.vgx))
      {
        this.vgx = l;
        j = this.yWP;
        switch (j)
        {
        default:
          this.yWP = 0;
          label121: AppMethodBeat.o(32369);
          bool = true;
        case 2:
        case 3:
        case 4:
        }
      }
    }
    while (true)
    {
      return bool;
      i = 21;
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "%d rpt rptRepairEffect idKey %d errorTime %d filename %s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(j), this.filename });
        h.pYm.a(354L, i, 1L, false);
        h.pYm.e(13836, new Object[] { Integer.valueOf(301), Long.valueOf(bo.anT()), "" });
        break;
        i = 22;
        continue;
        i = 23;
      }
      if (this.yWP == -1)
        break label121;
      this.yWP += 1;
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "media play is playing[%d], but surface is not update!! repair time[%d]", new Object[] { Integer.valueOf(this.yWP), Integer.valueOf(this.yWQ) });
      if (this.yWQ >= 2)
        this.yWK.dGL();
      switch (this.yWP)
      {
      case 0:
      case 1:
      default:
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "rpt surface not update!!");
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "%d rpt rptSurfaceNotUpdate %s", new Object[] { Integer.valueOf(hashCode()), this.filename });
        h.pYm.e(13836, new Object[] { Integer.valueOf(300), Long.valueOf(bo.anT()), "" });
        h.pYm.a(354L, 20L, 1L, false);
        this.yWP = -1;
        break;
      case 2:
        i = this.yWO / 1000;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "surface not update, it try seek time[%d] to repair.", new Object[] { Integer.valueOf(i) });
        ae(i, true);
        this.yWQ += 1;
        AppMethodBeat.o(32369);
        break;
      case 3:
        j = (this.yWO - 2000) / 1000;
        i = j;
        if (j < 0)
          i = 0;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "surface not update, it try seek time[%d] to repair.", new Object[] { Integer.valueOf(i) });
        ae(i, true);
        this.yWQ += 1;
        AppMethodBeat.o(32369);
        break;
      case 4:
        j = (this.yWO - 4000) / 1000;
        i = j;
        if (j < 0)
          i = 0;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "surface not update, it try seek time[%d] to repair.", new Object[] { Integer.valueOf(i) });
        ae(i, true);
        this.yWQ += 1;
        AppMethodBeat.o(32369);
        continue;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "check time[%d, %d], play time[%d, %d]", new Object[] { Long.valueOf(this.lastCheckTime), Long.valueOf(bo.anU()), Integer.valueOf(i), Integer.valueOf(this.yWO) });
        if ((this.lastCheckTime <= 0L) || (bo.gb(this.lastCheckTime) < 1500L))
          break;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "play time not update! request all video data to play. ");
        i = this.yTG.dFP().yXp.getCurrentPosition();
        cse();
        com.tencent.mm.modelvideo.u.f(this.filename, i, this.rll);
        this.yTG.dFP().yXp.stop();
        this.yWK.dGL();
        paramk = (j.a)this.yVF.get(this.filename);
        if ((paramk == null) || (paramk.csG == null))
        {
          AppMethodBeat.o(32369);
        }
        else
        {
          s locals = bG(paramk.csG);
          a(paramk.csG, locals, paramk.pos, this.rll);
          this.lastCheckTime = 0L;
          AppMethodBeat.o(32369);
        }
        break;
      }
    }
  }

  private void cse()
  {
    AppMethodBeat.i(32353);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "clear timer");
    this.rcg.stopTimer();
    this.klw.stopTimer();
    AppMethodBeat.o(32353);
  }

  private void csg()
  {
    AppMethodBeat.i(32365);
    this.rlu = bo.anU();
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.Imagegallery.handler.video", "notePlayVideo filename %s notePlayVideo %d ", new Object[] { this.filename, Long.valueOf(this.rlu) });
    AppMethodBeat.o(32365);
  }

  private void csh()
  {
    AppMethodBeat.i(32366);
    if (this.rlu > 0L)
      this.rlv = ((int)(this.rlv + (bo.anU() - this.rlu) / 1000L));
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "notePauseVideo filename %s playVideoDuration %d ", new Object[] { this.filename, Integer.valueOf(this.rlv) });
    this.rlu = 0L;
    AppMethodBeat.o(32366);
  }

  private void dGB()
  {
    AppMethodBeat.i(32358);
    try
    {
      this.yTG.yTI.dFZ().yVV.setIplaySeekCallback(this.vgC);
      AppMethodBeat.o(32358);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(32358);
    }
  }

  private static void dGC()
  {
    AppMethodBeat.i(32370);
    h.pYm.a(354L, 11L, 1L, false);
    AppMethodBeat.o(32370);
  }

  private static void dGD()
  {
    AppMethodBeat.i(32371);
    h.pYm.a(354L, 14L, 1L, false);
    AppMethodBeat.o(32371);
  }

  private void eC(String paramString, int paramInt)
  {
    AppMethodBeat.i(32344);
    aw.RS().aa(new j.1(this, paramString, paramInt));
    AppMethodBeat.o(32344);
  }

  public final void Du()
  {
    AppMethodBeat.i(32346);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "stopAll. video handler hash code : " + hashCode());
    this.rlq = bo.anU();
    SparseArray localSparseArray = this.yTG.yyL;
    int i = 0;
    int j = 0;
    if (i < localSparseArray.size())
    {
      int k = localSparseArray.keyAt(i);
      if ((localSparseArray.get(k) == null) || (((View)localSparseArray.get(k)).getTag() == null))
        break label413;
      k localk = (k)((View)localSparseArray.get(k)).getTag();
      if ((localk.yXm == null) || (localk.dGH().yXm.getVisibility() != 0) || ((((View)localk.dGH().yXp).getVisibility() != 0) && (bo.isNullOrNil(localk.dGH().yXp.getVideoPath())) && ((!this.rll) || (!this.yWK.isStreaming()))))
        break label413;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "stop");
      cse();
      if (localk != null)
      {
        csh();
        if (this.rll)
          this.yWK.dGK();
        if (!this.yWM)
          com.tencent.mm.modelvideo.u.f(this.filename, this.yWO - 1000, this.rll);
        localk.dGH().yXq.setVisibility(8);
        localk.dGH().yXx.setVisibility(8);
        localk.dGH().yXp.stop();
        Pg(0);
        localk.a(false, 0.0F);
        this.rll = false;
        this.yWW = false;
        this.yWR = false;
        this.filename = null;
        this.rlv = 0;
        this.rlu = 0L;
        this.yWX = 0;
        this.yWU = 0;
        this.yWQ = 0;
        this.yWP = 0;
        this.vgx = 0L;
        this.lastCheckTime = 0L;
      }
      j = 1;
    }
    label413: 
    while (true)
    {
      i++;
      break;
      this.iaf.cy(false);
      if ((j == 0) && (this.rll))
      {
        this.yWK.dGK();
        this.rll = false;
      }
      cse();
      this.yWJ.clear();
      AppMethodBeat.o(32346);
      return;
    }
  }

  public final void Pf(int paramInt)
  {
    AppMethodBeat.i(32356);
    this.yWJ.remove(paramInt);
    AppMethodBeat.o(32356);
  }

  protected final void Pg(int paramInt)
  {
    AppMethodBeat.i(32363);
    paramInt = Math.max(0, paramInt);
    this.yTG.yTI.dFZ().yVV.seek(paramInt);
    AppMethodBeat.o(32363);
  }

  public final void a(t.a.a parama)
  {
    AppMethodBeat.i(32357);
    Object localObject = parama.fileName;
    if ((bo.isNullOrNil((String)localObject)) || (this.yVF == null))
      AppMethodBeat.o(32357);
    while (true)
    {
      return;
      j.a locala = (j.a)this.yVF.get(localObject);
      if (locala == null)
      {
        AppMethodBeat.o(32357);
      }
      else
      {
        parama = locala.csG;
        if ((parama == null) || (parama.field_imgPath == null) || (!parama.field_imgPath.equals(localObject)))
        {
          AppMethodBeat.o(32357);
        }
        else
        {
          localObject = bG(parama);
          if (localObject == null)
          {
            AppMethodBeat.o(32357);
          }
          else if ((parama.dtH()) || (((s)localObject).status == 198))
          {
            if (b(locala))
              Toast.makeText(this.yTG.yTI, 2131304251, 0).show();
            AppMethodBeat.o(32357);
          }
          else
          {
            int i = com.tencent.mm.modelvideo.u.g((s)localObject);
            k localk = OJ(locala.pos);
            if ((this.yTG.yTI.getCurrentItem() == locala.pos) && (localk != null))
            {
              this.yTG.yTI.dGm();
              this.yWW = false;
              localk.dGH().yXq.setVisibility(0);
              localk.dGH().yXq.setProgress(i);
            }
            while (true)
              if (i < localk.dGH().yXq.getMax())
              {
                AppMethodBeat.o(32357);
                break;
                if (localk == null)
                {
                  AppMethodBeat.o(32357);
                  break;
                }
              }
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.Imagegallery.handler.video", "onNotifyChange, status:%d", new Object[] { Integer.valueOf(((s)localObject).status) });
            if (((((s)localObject).status == 199) || (((s)localObject).status == 199)) && (b(locala)))
            {
              this.yTG.yTI.hG(true);
              i = this.yTG.yTI.np(parama.field_msgId);
            }
            switch (i)
            {
            default:
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "enterVideoOpCode[%d] is error", new Object[] { Integer.valueOf(i) });
              AppMethodBeat.o(32357);
              break;
            case 0:
            case 3:
              a(parama, (s)localObject, this.yTG.yTI.getCurrentItem(), false);
              AppMethodBeat.o(32357);
              break;
            case 1:
              com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.Imagegallery.handler.video", "do restransmit video");
              h.pYm.a(354L, 15L, 1L, false);
              this.yTG.bv(parama);
              this.yTG.yTI.nq(-1L);
              if (this.rll)
              {
                i = this.yTG.dFP().yXp.getCurrentPosition();
                com.tencent.mm.modelvideo.u.f(this.filename, i, this.rll);
                this.yWR = true;
              }
              this.rll = false;
              AppMethodBeat.o(32357);
              break;
            case 2:
              h.pYm.a(354L, 16L, 1L, false);
              c.a(this.yTG.yTI, parama, true);
              this.yTG.yTI.nq(-1L);
              if (this.rll)
              {
                i = this.yTG.dFP().yXp.getCurrentPosition();
                com.tencent.mm.modelvideo.u.f(this.filename, i, this.rll);
                this.yWR = true;
              }
              this.rll = false;
              AppMethodBeat.o(32357);
            }
          }
        }
      }
    }
  }

  public final boolean a(k paramk, bi parambi, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(32336);
    super.a(paramk, parambi, paramInt);
    s locals = bG(parambi);
    if (parambi == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.Imagegallery.handler.video", "msg is null!!");
      AppMethodBeat.o(32336);
    }
    while (true)
    {
      return bool;
      if (this.yVF != null)
        this.yVF.put(parambi.field_imgPath, new j.a(parambi, paramInt));
      while (true)
      {
        if (locals != null)
          break label99;
        AppMethodBeat.o(32336);
        break;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.Imagegallery.handler.video", "mCacheMap is null!");
      }
      label99: o.all();
      parambi = BackwardSupportUtil.b.i(com.tencent.mm.modelvideo.t.ui(parambi.field_imgPath), 1.0F);
      paramk.dGH().yXn.setImageBitmap(parambi);
      if (paramk.dGH().yXp.isPlaying())
        paramk.dGH().yXp.stop();
      paramk.yXr.setVisibility(8);
      paramk.dGH().yXq.setVisibility(8);
      paramk.dGH().yXx.setVisibility(8);
      paramk.a(false, 0.0F);
      this.yWP = 0;
      this.rlp = bo.anU();
      bool = true;
      AppMethodBeat.o(32336);
    }
  }

  protected final void ae(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(32360);
    k localk = this.yTG.dFP();
    if (localk == null)
      AppMethodBeat.o(32360);
    while (true)
    {
      return;
      csg();
      localk.dGH().yXx.setVisibility(8);
      localk.dGH().yXp.d(paramInt * 1000, paramBoolean);
      this.yTG.yTI.qx(false);
      cV(false);
      AppMethodBeat.o(32360);
    }
  }

  protected final void akX()
  {
    AppMethodBeat.i(32361);
    k localk = this.yTG.dFP();
    if (localk == null)
      AppMethodBeat.o(32361);
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "start to pause");
      this.yTG.yTI.qx(true);
      localk.dGH().yXx.setVisibility(0);
      localk.dGH().yXp.pause();
      csh();
      AppMethodBeat.o(32361);
    }
  }

  protected final void arz(String paramString)
  {
    AppMethodBeat.i(32364);
    if ((!this.yWW) && (!b((j.a)this.yVF.get(paramString))))
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "show tool bar error.");
    AppMethodBeat.o(32364);
  }

  protected final void bq(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(32359);
    com.tencent.mm.sdk.platformtools.al.d(new j.4(this, paramString, paramBoolean));
    AppMethodBeat.o(32359);
  }

  protected final void cV(boolean paramBoolean)
  {
    AppMethodBeat.i(32354);
    if (!this.yWM)
      if (this.rll)
        if (paramBoolean)
        {
          com.tencent.mm.sdk.platformtools.al.d(new j.12(this));
          AppMethodBeat.o(32354);
        }
    while (true)
    {
      return;
      this.rcg.ae(500L, 500L);
      AppMethodBeat.o(32354);
      continue;
      this.klw.ae(500L, 500L);
      AppMethodBeat.o(32354);
    }
  }

  protected final boolean csf()
  {
    AppMethodBeat.i(32362);
    k localk = this.yTG.dFP();
    boolean bool;
    if (localk == null)
    {
      AppMethodBeat.o(32362);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = true;
      if (!localk.dGH().yXp.isPlaying())
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "start to play");
        this.yTG.yTI.qx(false);
        localk.dGH().yXx.setVisibility(8);
        bool = localk.dGH().yXp.start();
        csg();
      }
      if (localk.dGH().yXx.getVisibility() != 8)
        localk.dGH().yXx.setVisibility(8);
      AppMethodBeat.o(32362);
    }
  }

  public final void dGA()
  {
    AppMethodBeat.i(32351);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "notify video completion. isOnlinePlay : " + this.rll);
    cse();
    csh();
    Object localObject1;
    if ((this.rll) && (this.yTG != null) && (this.yTG.dFP() != null))
    {
      localObject1 = this.yTG.dFP().dGH().yXp;
      if ((localObject1 != null) && (((com.tencent.mm.pluginsdk.ui.tools.e)localObject1).getCurrentPosition() + 2000 < ((com.tencent.mm.pluginsdk.ui.tools.e)localObject1).getDuration()))
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.Imagegallery.handler.video", "notify video completion, but cur pos[%d] is less than duration[%d]", new Object[] { Integer.valueOf(((com.tencent.mm.pluginsdk.ui.tools.e)localObject1).getCurrentPosition()), Integer.valueOf(((com.tencent.mm.pluginsdk.ui.tools.e)localObject1).getDuration()) });
    }
    for (int i = 0; ; i = 1)
    {
      if (i != 0)
      {
        com.tencent.mm.sdk.platformtools.al.d(new j.10(this));
        AppMethodBeat.o(32351);
      }
      while (true)
      {
        return;
        try
        {
          i = this.yTG.dFP().yXp.getCurrentPosition();
          com.tencent.mm.modelvideo.u.f(this.filename, i, this.rll);
          this.yTG.dFP().yXp.stop();
          this.yWK.dGL();
          i = this.yWU + 1;
          this.yWU = i;
          if (i <= 3)
          {
            localObject1 = (j.a)this.yVF.get(this.filename);
            if (localObject1 != null)
            {
              localObject2 = ((j.a)localObject1).csG;
              if (localObject2 != null);
            }
            else
            {
              AppMethodBeat.o(32351);
              continue;
            }
            Object localObject2 = bG(((j.a)localObject1).csG);
            a(((j.a)localObject1).csG, (s)localObject2, ((j.a)localObject1).pos, this.rll);
          }
          else
          {
            AppMethodBeat.o(32351);
          }
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.Imagegallery.handler.video", localException, "notify video completion error[%s]", new Object[] { localException.toString() });
          AppMethodBeat.o(32351);
        }
      }
    }
  }

  public final void dGz()
  {
    AppMethodBeat.i(32350);
    this.yWM = false;
    this.mqi = 0;
    if (this.yTG != null);
    for (Object localObject = this.yTG.dFP(); localObject == null; localObject = null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "notify video prepared, but holder is null.");
      AppMethodBeat.o(32350);
      return;
    }
    int i = bo.mA(((k)localObject).dGH().yXp.getDuration());
    int j = this.yTG.yTI.dFZ().yVV.getVideoTotalTime();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "%d videoDuration %d hadSetTotalTime %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(j) });
    if ((j <= 0) || (Math.abs(j - i) >= 2))
      this.yTG.yTI.dFZ().yVV.setVideoTotalTime(i);
    dGB();
    if ((i == 0) || (i >= 1800))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "%d repair video duration[%d] error. filename[%s]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), this.filename });
      label210: i = com.tencent.mm.modelvideo.u.A(i, this.filename);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "notify video prepared. isOnlinePlay[%b] playDuration[%d] playVideoWhenNotify[%b] hadPlayError[%b].", new Object[] { Boolean.valueOf(this.rll), Integer.valueOf(i), Boolean.valueOf(this.yWL), Boolean.valueOf(this.yWM) });
      ((k)localObject).dGH().yXp.setOneTimeVideoTextureUpdateCallback(this.rlb);
      if (!this.yWL)
        break label401;
      if (this.rll)
        break label349;
      this.yWK.reset();
      csg();
      ae(i, true);
    }
    while (true)
    {
      cV(false);
      AppMethodBeat.o(32350);
      break;
      aw.RS().aa(new j.5(this, i));
      break label210;
      label349: localObject = this.yWK;
      if (i > 0)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.OnlineVideoUIHelper", "seek to last duration : ".concat(String.valueOf(i)));
        ((m)localObject).fUS = i;
        ((m)localObject).fUU = true;
        ((m)localObject).fUP = 2;
      }
      this.yWK.mm(0);
    }
    label401: if (!this.rll)
      ae(i, false);
    while (true)
    {
      Pg(i);
      this.yTG.yTI.qx(true);
      cse();
      AppMethodBeat.o(32350);
      break;
      this.yWK.aG(i, false);
    }
  }

  public final void detach()
  {
    AppMethodBeat.i(32349);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "detach.[%d]", new Object[] { Integer.valueOf(hashCode()) });
    this.rlq = bo.anU();
    this.yWT.removeMessages(1);
    cse();
    com.tencent.mm.sdk.b.a.xxA.d(this.yWI);
    com.tencent.mm.sdk.b.a.xxA.d(this.yWV);
    Du();
    this.yTG.yTI.mController.ylL.getWindow().clearFlags(128);
    this.yTG.yTI.dFZ().yVV.setIplaySeekCallback(null);
    super.detach();
    this.yVF.clear();
    this.yVF = null;
    o.all().a(this);
    this.yWJ.clear();
    m localm = this.yWK;
    localm.reset();
    localm.fUQ = null;
    localm.yXX = null;
    localm.yXY = null;
    if (com.tencent.mm.plugin.n.e.bOT())
      aw.RS().aa(new j.8(this));
    o.alq().alG();
    o.alq().run();
    AppMethodBeat.o(32349);
  }

  protected final int getPlayVideoDuration()
  {
    AppMethodBeat.i(32367);
    if (this.rlv < 0)
      this.rlv = 0;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "get[%s] play video duration [%d]", new Object[] { this.filename, Integer.valueOf(this.rlv) });
    int i = this.rlv;
    AppMethodBeat.o(32367);
    return i;
  }

  protected final int getUiStayTime()
  {
    AppMethodBeat.i(32368);
    if ((this.rlq > 0L) && (this.rlp > 0L));
    for (int i = (int)(this.rlq - this.rlp); ; i = 0)
    {
      int j = i;
      if (i < 0)
        j = 0;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "%d filename[%s] get ui stay time[%d %d %d]", new Object[] { Integer.valueOf(hashCode()), this.filename, Integer.valueOf(j), Long.valueOf(this.rlq), Long.valueOf(this.rlp) });
      AppMethodBeat.o(32368);
      return j;
    }
  }

  public final void hp(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(32352);
    boolean bool1 = this.rll;
    Object localObject = this.yWK;
    boolean bool2;
    if ((!bo.isNullOrNil(((m)localObject).cHr)) && (((m)localObject).fUO == 1))
    {
      bool2 = true;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.Imagegallery.handler.video", "notify video error, what %d, extras %d isOnlinePlay %b isLoading %b ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      this.yWM = true;
      this.mqi = paramInt2;
      if (!this.rll)
        break label284;
      if (paramInt1 != -1)
        break label194;
      cse();
      this.yTG.dFP().yXp.stop();
      this.yWK.dGL();
      label130: this.yWW = false;
      this.yTG.yTI.qx(true);
      this.yTG.dFP().dGH().yXx.setVisibility(0);
      csh();
      h.pYm.a(354L, 18L, 1L, false);
      AppMethodBeat.o(32352);
    }
    while (true)
    {
      return;
      bool2 = false;
      break;
      label194: if (paramInt1 == -2)
      {
        cse();
        paramInt1 = this.yTG.dFP().yXp.getCurrentPosition();
        com.tencent.mm.modelvideo.u.f(this.filename, paramInt1, this.rll);
        this.yTG.dFP().yXp.stop();
        this.yWK.dGL();
        break label130;
      }
      if (paramInt1 != -3)
        break label130;
      this.yWM = false;
      this.yWK.dGL();
      AppMethodBeat.o(32352);
      continue;
      label284: com.tencent.mm.modelvideo.u.uw(this.filename);
      csh();
      if ((this.yTG != null) && (this.yTG.dFP() != null) && (this.yTG.dFP().yXp != null))
      {
        localObject = this.yTG.dFP().yXp.getVideoPath();
        this.yTG.dFP().yXp.stop();
      }
      while (true)
      {
        if (!this.yWN)
          break label404;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "%d had play completion don't show error tips", new Object[] { Integer.valueOf(hashCode()) });
        AppMethodBeat.o(32352);
        break;
        localObject = "";
      }
      label404: com.tencent.mm.sdk.platformtools.al.d(new j.11(this, (String)localObject));
      h.pYm.a(354L, 25L, 1L, false);
      AppMethodBeat.o(32352);
    }
  }

  public final void i(bi parambi, int paramInt)
  {
    AppMethodBeat.i(32339);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "toggle video");
    if (parambi == null)
      AppMethodBeat.o(32339);
    s locals;
    while (true)
    {
      return;
      if ((!c.f(parambi)) && (!c.bp(parambi)))
      {
        AppMethodBeat.o(32339);
      }
      else
      {
        locals = bG(parambi);
        if (locals == null)
        {
          AppMethodBeat.o(32339);
        }
        else if ((this.rll) && (this.yWK != null) && (this.yWK.fUU))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "%d it loading video data, do not response button click.", new Object[] { Integer.valueOf(hashCode()) });
          AppMethodBeat.o(32339);
        }
        else if (this.yTG.yTI.cGZ())
        {
          b(OJ(paramInt));
          this.yTG.yTI.qx(true);
          this.yTG.yTI.yWv.stopTimer();
          this.iaf.cy(false);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "toggle pause video.");
          AppMethodBeat.o(32339);
        }
        else
        {
          aw.ZK();
          if (com.tencent.mm.model.c.isSDCardAvailable())
            break;
          com.tencent.mm.ui.base.t.hO(this.yTG.yTI.mController.ylL);
          AppMethodBeat.o(32339);
        }
      }
    }
    if (this.rll);
    while (true)
    {
      int i;
      try
      {
        if (this.yTG.dFP().yXp != null)
        {
          i = this.yTG.dFP().yXp.getCurrentPosition() / 1000;
          if (this.yWK == null)
            continue;
          if (!this.yWK.mn(i))
            continue;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "toggle play video");
          a(parambi, locals, paramInt, this.rll);
          if (this.yTG.yTI.yWu)
            this.yTG.yTI.dGk();
          dGB();
          AppMethodBeat.o(32339);
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.Imagegallery.handler.video", localException, "", new Object[0]);
        i = 0;
        continue;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "toggle start timer.");
        cV(false);
        continue;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Imagegallery.handler.video", "%d toggle video but online video helper is null.", new Object[] { Integer.valueOf(hashCode()) });
        continue;
      }
      if (parambi.field_isSend == 0)
      {
        if ((locals.status != 113) && (locals.status != 198))
          break label531;
        a(parambi, locals);
      }
      while (true)
      {
        if (parambi.field_isSend != 1)
          break label621;
        i = locals.status;
        if ((i != 111) && (i != 113) && (i != 112) && (i != 121) && (i != 122))
          break label623;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "download video. msg talker[%s], info status[%d]", new Object[] { parambi.field_talker, Integer.valueOf(i) });
        a(parambi, locals);
        break;
        label531: if (locals.status == 199)
          a(parambi, locals, paramInt, false);
        if (locals.status == 111)
          a(parambi, locals);
        if (locals.status == 112)
          a(parambi, locals);
        if ((locals.status == 121) || (locals.status == 122))
          a(parambi, locals);
        if (locals.status == 123)
          a(parambi, locals, paramInt, false);
      }
      label621: continue;
      label623: a(parambi, locals, paramInt, false);
    }
  }

  public final void j(bi parambi, int paramInt)
  {
    AppMethodBeat.i(32340);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "toggleVideoMenu pos ");
    s locals = com.tencent.mm.modelvideo.u.ut(parambi.field_imgPath);
    if ((locals != null) && (!locals.alz()))
    {
      b(OJ(paramInt));
      this.yTG.yTI.qx(true);
      if (this.rll)
      {
        this.yWK.dGK();
        this.yWK.reset();
      }
      a(parambi, locals);
      if (this.yTG.yTI.np(parambi.field_msgId) == 2)
      {
        eC(parambi.field_imgPath, 8);
        AppMethodBeat.o(32340);
      }
    }
    while (true)
    {
      return;
      eC(parambi.field_imgPath, 5);
      AppMethodBeat.o(32340);
    }
  }

  protected final void onResume()
  {
    AppMethodBeat.i(32348);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Imagegallery.handler.video", "ui on resume, add online video event.");
    this.yWT.removeMessages(1);
    com.tencent.mm.sdk.b.a.xxA.c(this.yWV);
    k localk;
    if ((this.yTG != null) && (com.tencent.mm.compatible.util.d.iW(21)))
    {
      localk = this.yTG.dFP();
      if ((localk != null) && (localk.yXp != null))
        if ((localk.yXp instanceof VideoPlayerTextureView))
        {
          ((VideoPlayerTextureView)localk.yXp).bPd();
          AppMethodBeat.o(32348);
        }
    }
    while (true)
    {
      return;
      if ((localk.yXp instanceof VideoTextureView))
        ((VideoTextureView)localk.yXp).bPd();
      AppMethodBeat.o(32348);
    }
  }

  public final void pause(int paramInt)
  {
    AppMethodBeat.i(32338);
    b(OJ(paramInt));
    this.iaf.cy(false);
    this.yTG.yTI.qx(true);
    AppMethodBeat.o(32338);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j
 * JD-Core Version:    0.6.2
 */