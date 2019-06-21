package com.tencent.mm.plugin.facedetectaction.b;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ais;
import com.tencent.mm.protocal.protobuf.aiu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.youtu.ytcommon.YTCommonExInterface;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;

public final class d
  implements f
{
  public static d mcq;
  String cKT;
  public String cKU;
  public MMActivity crP;
  public int fcR;
  private String lTX;
  public int mStatus = 0;
  public FaceActionUI mbY;
  public int mcA;
  public b mcr;
  private e mcs;
  private String mct;
  private float mcu;
  private String mcv;
  public d.a mcw;
  HandlerThread mcx;
  ak mcy;
  public int mcz;
  String packageName;
  int requestCode;
  int scene;

  static
  {
    AppMethodBeat.i(700);
    mcq = new d();
    AppMethodBeat.o(700);
  }

  public final void R(Runnable paramRunnable)
  {
    AppMethodBeat.i(695);
    if (this.mcy != null)
      this.mcy.post(paramRunnable);
    AppMethodBeat.o(695);
  }

  public final void a(FaceActionUI paramFaceActionUI)
  {
    AppMethodBeat.i(693);
    com.tencent.mm.plugin.facedetectaction.a.a locala = new com.tencent.mm.plugin.facedetectaction.a.a(this.scene, this.packageName, this.cKT);
    g.Rg().a(2696, this);
    g.Rg().a(locala, 0);
    this.mbY = paramFaceActionUI;
    AppMethodBeat.o(693);
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(696);
    if ((this.mStatus == 0) || (this.mStatus == 1))
    {
      this.mbY.a("cancel", 90004, null, Boolean.valueOf(this.mbY.mcY));
      AppMethodBeat.o(696);
    }
    while (true)
    {
      return;
      if (this.mStatus == 2)
      {
        this.mbY.a("cancel", 90025, null, Boolean.valueOf(this.mbY.mcY));
        AppMethodBeat.o(696);
      }
      else
      {
        if (this.mStatus == 3)
          this.mbY.a("cancel", 90006, null, Boolean.valueOf(this.mbY.mcY));
        AppMethodBeat.o(696);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(694);
    ab.i("MicroMsg.FaceCheckActionMgr", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm });
    if ((paramm instanceof com.tencent.mm.plugin.facedetectaction.a.a))
    {
      g.Rg().b(2696, this);
      paramm = (com.tencent.mm.plugin.facedetectaction.a.a)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = paramm.mbT;
        ab.i("MicroMsg.FaceCheckActionMgr", "GetFaceCheckAction, ret_code: %s, ret_msg: %s, action_data: %s, reduction_ratio: %s, take_message: %s", new Object[] { Integer.valueOf(paramString.kdT), paramString.kdU, paramString.woJ, Float.valueOf(paramString.woK), paramString.vYl });
        if (paramString.kdT == 0)
        {
          this.mct = paramString.person_id;
          this.lTX = paramString.woJ;
          this.mcu = paramString.woK;
          this.mcv = paramString.vYl;
          switch (bo.getInt(this.lTX, -1))
          {
          case 2:
          case 4:
          default:
            paramInt1 = -1;
            if (paramInt1 == -1)
            {
              if (this.mcw == null)
                break label393;
              this.mcw.a(1, -1, "", 1);
              AppMethodBeat.o(694);
            }
            break;
          case 1:
          case 3:
          case 5:
          }
        }
      }
    }
    while (true)
    {
      return;
      paramInt1 = 0;
      break;
      paramInt1 = 1;
      break;
      paramInt1 = 2;
      break;
      paramString = paramString.woL;
      ab.i("MicroMsg.FaceCheckActionMgr", "onGetLiveTypeFinish, liveType: %s, actionHint: %s", new Object[] { Integer.valueOf(paramInt1), paramString });
      b localb = this.mcr;
      paramm = this.crP;
      paramInt2 = YTCommonExInterface.initAuth(ah.getContext(), "rel_wechat_2055-12-06.lic1.2", 0, false);
      ab.i("MicroMsg.FaceCheckActionEngine", "initAuth ret: %s", new Object[] { Integer.valueOf(paramInt2) });
      localb.mcm = paramInt1;
      if (paramInt2 != 0)
        h.pYm.a(917L, 58L, 1L, false);
      while (true)
      {
        this.mStatus = 0;
        this.mcr.mco = new d.1(this);
        if (this.mcw != null)
          this.mcw.aA(paramInt1, paramString);
        label393: AppMethodBeat.o(694);
        break;
        h.pYm.a(917L, 57L, 1L, false);
        localb.f(paramm);
        localb.mcn = new b.1(localb);
      }
      if (this.mcw != null)
        this.mcw.a(1, paramString.kdT, paramString.kdU, 1);
      AppMethodBeat.o(694);
      continue;
      ab.e("MicroMsg.FaceCheckActionMgr", "get face check action failed!");
      if (this.mcw != null)
        this.mcw.a(1, paramInt2, paramString, 1);
      AppMethodBeat.o(694);
      continue;
      if ((paramm instanceof com.tencent.mm.plugin.facedetectaction.a.b))
      {
        paramm = (com.tencent.mm.plugin.facedetectaction.a.b)paramm;
        g.Rg().b(2726, this);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = paramm.mbV;
          ab.i("MicroMsg.FaceCheckActionMgr", "get face check result, ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(paramString.kdT), paramString.kdU });
          if (paramString.kdT != 0)
          {
            if (this.mcw != null)
            {
              this.mcw.a(3, paramString.kdT, paramString.kdU, paramString.woP);
              AppMethodBeat.o(694);
            }
          }
          else
          {
            ab.i("MicroMsg.FaceCheckActionMgr", "on verify finish!");
            if (this.mcw != null)
            {
              this.mcw.Lx(paramString.wcg);
              this.mStatus = 2;
            }
            AppMethodBeat.o(694);
          }
        }
        else
        {
          ab.e("MicroMsg.FaceCheckActionMgr", "get face check result failed");
          if (this.mcw != null)
            this.mcw.a(3, paramInt2, paramString, 1);
        }
      }
      else
      {
        AppMethodBeat.o(694);
      }
    }
  }

  public final void release(boolean paramBoolean)
  {
    AppMethodBeat.i(697);
    ab.i("MicroMsg.FaceCheckActionMgr", "release, recreate: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    b localb;
    if (this.mcr != null)
      localb = this.mcr;
    try
    {
      if ((localb.status == 4) || (localb.status == 3) || (localb.status == 5))
        YTPoseDetectInterface.releaseModel();
      this.mcr = new b();
      if (this.mcs != null)
      {
        if (com.tencent.mm.plugin.facedetect.e.a.btw().isStarted())
          com.tencent.mm.plugin.facedetect.e.a.btw().bty();
        this.mcs = null;
      }
      if (paramBoolean)
      {
        if (this.mcx != null)
        {
          this.mcx.quit();
          this.mcx = null;
          this.mcy = null;
        }
        mcq = new d();
      }
      AppMethodBeat.o(697);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.FaceCheckActionEngine", localException, "release error", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.b.d
 * JD-Core Version:    0.6.2
 */