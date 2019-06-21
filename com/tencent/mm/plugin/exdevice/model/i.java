package com.tencent.mm.plugin.exdevice.model;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ce;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.protobuf.aga;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.asr;
import com.tencent.mm.protocal.protobuf.bce;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public enum i
  implements f
{
  private ProgressDialog ehJ;
  private boolean ltp;
  public i.a ltq;

  static
  {
    AppMethodBeat.i(19305);
    lto = new i("INSTANCE");
    ltr = new i[] { lto };
    AppMethodBeat.o(19305);
  }

  private i()
  {
    AppMethodBeat.i(19299);
    this.ltp = false;
    Object localObject = ah.getContext().getSharedPreferences("exdevice_pref", 0);
    StringBuilder localStringBuilder = new StringBuilder();
    aw.ZK();
    long l = ((SharedPreferences)localObject).getLong(com.tencent.mm.model.c.QF(), 0L);
    if (l != 0L)
    {
      ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "this user has get bound device, last time is %d", new Object[] { Long.valueOf(l) });
      AppMethodBeat.o(19299);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "the user has not get bound device yet");
      AppMethodBeat.o(19299);
    }
  }

  public static void hN(long paramLong)
  {
    AppMethodBeat.i(19302);
    ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "update get bound hard device time : %d", new Object[] { Long.valueOf(paramLong) });
    SharedPreferences.Editor localEditor = ah.getContext().getSharedPreferences("exdevice_pref", 0).edit();
    StringBuilder localStringBuilder = new StringBuilder();
    aw.ZK();
    localEditor.putLong(com.tencent.mm.model.c.QF(), paramLong).commit();
    AppMethodBeat.o(19302);
  }

  public final void a(Context paramContext, i.a parama)
  {
    AppMethodBeat.i(19300);
    ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "startGetBoundHardDevices");
    if (this.ltp)
    {
      if (this.ltq == null)
        this.ltq = parama;
      ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "getting bound device now, just leave");
      AppMethodBeat.o(19300);
    }
    while (true)
    {
      return;
      o localo = new o();
      if ((paramContext != null) && ((paramContext instanceof Activity)) && (!((Activity)paramContext).isFinishing()))
      {
        if ((this.ehJ != null) && (this.ehJ.isShowing()))
          this.ehJ.dismiss();
        paramContext.getString(2131297061);
        this.ehJ = h.b(paramContext, paramContext.getString(2131302753), new i.1(this, localo, parama));
      }
      this.ltq = parama;
      aw.Rg().a(localo, 0);
      AppMethodBeat.o(19300);
    }
  }

  public final boolean gN(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(19301);
    if (this.ltp)
    {
      ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "Getting bound device now, just leave");
      AppMethodBeat.o(19301);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      long l1 = System.currentTimeMillis();
      SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("exdevice_pref", 0);
      StringBuilder localStringBuilder = new StringBuilder();
      aw.ZK();
      long l2 = localSharedPreferences.getLong(com.tencent.mm.model.c.QF(), 0L);
      if ((!paramBoolean) && (l1 - l2 < 86400000L))
      {
        ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "GetBoundHardDevices not now pp");
        AppMethodBeat.o(19301);
        paramBoolean = bool;
      }
      else
      {
        paramBoolean = true;
        AppMethodBeat.o(19301);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, final String paramString, m paramm)
  {
    AppMethodBeat.i(19303);
    ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    this.ltp = false;
    if ((paramm == null) || (paramInt2 != 0) || (paramInt1 != 0))
    {
      ab.e("MicroMsg.exdevice.GetBoundDeviceLogic", "do scene failed : %d, %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      if ((this.ehJ != null) && (this.ehJ.isShowing()))
        this.ehJ.dismiss();
      AppMethodBeat.o(19303);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "scene.getType() = %s", new Object[] { Integer.valueOf(paramm.getType()) });
      if (paramm.getType() == 539)
      {
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.e("MicroMsg.exdevice.GetBoundDeviceLogic", "scene.getType() = %s, %s, %s", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          if (this.ltq != null)
            this.ltq.gM(false);
          if ((this.ehJ != null) && (this.ehJ.isShowing()))
            this.ehJ.dismiss();
          AppMethodBeat.o(19303);
        }
        else
        {
          paramString = (o)paramm;
          if ((paramString.ehh != null) && (paramString.ehh.fsH.fsP != null));
          for (paramString = (aga)paramString.ehh.fsH.fsP; ; paramString = null)
          {
            if ((paramString != null) && (paramString.wna != null))
              break label358;
            if (this.ltq != null)
              this.ltq.gM(false);
            if ((this.ehJ != null) && (this.ehJ.isShowing()))
              this.ehJ.dismiss();
            AppMethodBeat.o(19303);
            break;
          }
          label358: aw.RS().aa(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(19296);
              i.hN(bo.anU());
              Object localObject1 = ad.boW();
              Object localObject2 = new LinkedList();
              localObject1 = ((com.tencent.mm.plugin.exdevice.h.c)localObject1).baR();
              Object localObject3;
              if ((localObject1 != null) && (((Cursor)localObject1).moveToFirst()))
                do
                {
                  localObject3 = new com.tencent.mm.plugin.exdevice.h.b();
                  ((com.tencent.mm.plugin.exdevice.h.b)localObject3).d((Cursor)localObject1);
                  ((List)localObject2).add(localObject3);
                }
                while (((Cursor)localObject1).moveToNext());
              if (localObject1 != null)
                ((Cursor)localObject1).close();
              localObject2 = ((List)localObject2).iterator();
              label914: 
              while (true)
              {
                Object localObject4;
                if (((Iterator)localObject2).hasNext())
                {
                  localObject3 = (com.tencent.mm.plugin.exdevice.h.b)((Iterator)localObject2).next();
                  localObject4 = paramString.wna.iterator();
                  do
                  {
                    if (!((Iterator)localObject4).hasNext())
                      break;
                    localObject1 = ((bce)((Iterator)localObject4).next()).vLi;
                  }
                  while ((!((com.tencent.mm.plugin.exdevice.h.b)localObject3).field_deviceType.equals(((asq)localObject1).vIk)) || (!((com.tencent.mm.plugin.exdevice.h.b)localObject3).field_deviceID.equals(((asq)localObject1).jBE)));
                }
                for (int i = 1; ; i = 0)
                {
                  if (i != 0)
                    break label914;
                  ab.d("MicroMsg.exdevice.GetBoundDeviceLogic", "delete deviceId %s, deviceType %s ", new Object[] { ((com.tencent.mm.plugin.exdevice.h.b)localObject3).field_deviceID, ((com.tencent.mm.plugin.exdevice.h.b)localObject3).field_deviceType });
                  i.d((com.tencent.mm.plugin.exdevice.h.b)localObject3);
                  ad.boW().dU(((com.tencent.mm.plugin.exdevice.h.b)localObject3).field_deviceID, ((com.tencent.mm.plugin.exdevice.h.b)localObject3).field_deviceType);
                  ad.bph();
                  e.aw(((com.tencent.mm.plugin.exdevice.h.b)localObject3).field_deviceID, false);
                  break;
                  localObject1 = paramString.wna.iterator();
                  while (((Iterator)localObject1).hasNext())
                  {
                    Object localObject5 = (bce)((Iterator)localObject1).next();
                    localObject4 = ((bce)localObject5).vLj;
                    localObject3 = ((bce)localObject5).vLi;
                    if ((localObject3 != null) && (localObject4 != null) && (!bo.isNullOrNil(((asq)localObject3).jBE)))
                    {
                      ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "ModHardDevice deviceId = %s, deviceType = %s, BindFlag = %s", new Object[] { ((asq)localObject3).jBE, ((asq)localObject3).vIk, Integer.valueOf(((bce)localObject5).wGJ) });
                      localObject2 = ad.boW().Kv(((asq)localObject3).jBE);
                      if (2 == ((bce)localObject5).wGJ)
                      {
                        ab.w("MicroMsg.exdevice.GetBoundDeviceLogic", "This Device is unbind, Just leave. deviceId = %s, mac = %s, brandName = %s", new Object[] { ((asq)localObject3).jBE, ((asr)localObject4).vKF, ((asr)localObject4).wwm });
                        if (localObject2 != null)
                        {
                          i.d((com.tencent.mm.plugin.exdevice.h.b)localObject2);
                          ad.boW().dU(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceType);
                          ad.bph();
                          e.aw(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID, false);
                        }
                      }
                      else
                      {
                        localObject5 = new com.tencent.mm.plugin.exdevice.h.b();
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_deviceID = ((asq)localObject3).jBE;
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_deviceType = ((asq)localObject3).vIk;
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_connProto = ((asr)localObject4).wwn;
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_connStrategy = ((asr)localObject4).wwo;
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_closeStrategy = ((asr)localObject4).wwp;
                        if ((((asr)localObject4).dFp == 2) && (localObject2 != null) && (((ce)localObject2).dFl != null))
                          ((asr)localObject4).guS = ((ce)localObject2).dFl;
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).iy(((asr)localObject4).guS);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).jp(((asr)localObject4).wwv);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).jo(((asr)localObject4).wwu);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).jn(((asr)localObject4).wwt);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).hV(((asr)localObject4).www);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).jl(((asr)localObject4).IconUrl);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).jm(((asr)localObject4).mZj);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).hW(((asr)localObject4).dFp);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).eH(((asr)localObject4).dFq);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).jq(((asr)localObject4).dFr);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).jr(((asr)localObject4).dFs);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).js(((asr)localObject4).dFt);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).jt(((asr)localObject4).dFu);
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_url = "";
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_mac = com.tencent.mm.plugin.exdevice.j.b.KK(com.tencent.mm.plugin.exdevice.j.b.KL(((asr)localObject4).vKF));
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_md5Str = g.x(new String(((asq)localObject3).vIk + ((asq)localObject3).jBE).getBytes());
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_authKey = ((asr)localObject4).vHO;
                        ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_brandName = ((asr)localObject4).wwm;
                        if (((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_mac == 0L)
                          ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_mac = System.currentTimeMillis();
                        boolean bool2;
                        if (localObject2 == null)
                        {
                          boolean bool1 = ad.boW().b((com.tencent.mm.sdk.e.c)localObject5);
                          bool2 = bool1;
                          if (bool1)
                          {
                            ad.bph();
                            e.aw(((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_deviceID, true);
                            bool2 = bool1;
                          }
                        }
                        while (true)
                        {
                          ab.i("MicroMsg.exdevice.GetBoundDeviceLogic", "insert HardDeviceInfo %s, brandName = %s, deviceID = %s, deviceType = %s, connProto = %s, connStrategy = %s, closeStrategy = %s, mac = %s", new Object[] { Boolean.valueOf(bool2), ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_deviceID, ((asq)localObject3).vIk, ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_connProto, Integer.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_connStrategy), Integer.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_closeStrategy), Long.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_mac) });
                          break;
                          if (ad.boW().e((com.tencent.mm.plugin.exdevice.h.b)localObject5) == 0)
                            bool2 = false;
                          else
                            bool2 = true;
                        }
                      }
                    }
                  }
                  AppMethodBeat.o(19296);
                  return;
                }
              }
            }
          });
          if (this.ltq != null)
            this.ltq.gM(true);
        }
      }
      else
      {
        if ((this.ehJ != null) && (this.ehJ.isShowing()))
          this.ehJ.dismiss();
        AppMethodBeat.o(19303);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.i
 * JD-Core Version:    0.6.2
 */