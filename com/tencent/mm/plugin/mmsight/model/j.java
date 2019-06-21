package com.tencent.mm.plugin.mmsight.model;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.Camera.Parameters;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.v;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bs;
import com.tencent.mm.ui.base.t;

public final class j
{
  static int fXT;
  static double ouA;
  public static boolean ouw = true;
  public static boolean oux = false;
  public static boolean ouy = false;
  public static o ouz;

  public static void a(Camera.Parameters paramParameters, boolean paramBoolean)
  {
    AppMethodBeat.i(76527);
    Object localObject1;
    if (oux)
    {
      localObject1 = ah.getContext();
      localObject2 = ah.getResources();
      if (ouz == null)
      {
        paramParameters = "";
        t.makeText((Context)localObject1, ((Resources)localObject2).getString(2131300602, new Object[] { paramParameters }), 1).show();
        AppMethodBeat.o(76527);
      }
    }
    while (true)
    {
      return;
      paramParameters = Integer.valueOf(ouz.ouK);
      break;
      ab.i("MicroMsg.MMSightRecorderConfig", "autoConfig, recorderOption: %s, isUseRecorderOption: %s", new Object[] { Integer.valueOf(q.etj.etG), Boolean.valueOf(ouy) });
      if (!ouy)
        break label115;
      AppMethodBeat.o(76527);
    }
    label115: Object localObject2 = com.tencent.mm.plugin.mmsight.d.bPg();
    int i = bo.getInt(CaptureMMProxy.getInstance().getDynamicConfig("SightMediaCodecMinApiLevel"), 19);
    int j = bo.getInt(CaptureMMProxy.getInstance().getDynamicConfig("Sight1080pRecordMinApiLevel"), 19);
    int k = bo.getInt(CaptureMMProxy.getInstance().getDynamicConfig("Sight720pRecordMinApiLevel"), 19);
    ab.i("MicroMsg.MMSightRecorderConfig", "apiLevel: %s record1080pApiLevel: %s, record720pApiLevel: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
    if ((q.etj.etF == -1) || ((q.etj.etF & 0x1) != 0))
      if ((q.etj.etF != -1) && ((q.etj.etF & 0x1) != 0))
      {
        ouz.bPG().ouM = true;
        j = 1;
      }
    while (true)
    {
      boolean bool;
      if (q.etj.etA != -1)
      {
        localObject1 = ouz;
        if (q.etj.etA == 1)
        {
          bool = true;
          label281: ((o)localObject1).ouL = bool;
          label287: if ((q.etj.etF == -1) || ((q.etj.etF & 0x2) != 0))
          {
            if ((q.etj.etF == -1) || ((q.etj.etF & 0x2) == 0))
              break label513;
            paramParameters = ouz.bPE();
            paramParameters.ouM = false;
            paramParameters.bPF();
          }
        }
      }
      label513: label623: 
      while (true)
      {
        ouz.ouK = -1;
        ab.i("MicroMsg.MMSightRecorderConfig", "autoConfig parameter byserver %s", new Object[] { ouz.toString() });
        AppMethodBeat.o(76527);
        break;
        if ((!com.tencent.mm.compatible.util.d.iW(j)) || (fXT < 512) || (ouA < 1725.0D) || (Math.min(((Point)localObject2).x, ((Point)localObject2).y) < 1080))
          break label625;
        localObject1 = ouz;
        ((o)localObject1).ouP = g.a(paramParameters, com.tencent.mm.plugin.mmsight.d.bPg(), ((o)localObject1).fcY.width * 2, paramBoolean);
        if ((((o)localObject1).ouP != null) && (((o)localObject1).ouP.oum != null));
        for (j = 1; ; j = 0)
        {
          if (j == 0)
            break label625;
          ouz.bPG().ouM = true;
          j = 1;
          break;
        }
        bool = false;
        break label281;
        ouz.ouL = false;
        break label287;
        if ((j == 0) && (com.tencent.mm.compatible.util.d.iW(k)) && (fXT >= 512) && (ouA >= 1725.0D) && (Math.min(((Point)localObject2).x, ((Point)localObject2).y) >= 720))
        {
          localObject2 = ouz;
          ((o)localObject2).ouP = g.a(paramParameters, com.tencent.mm.plugin.mmsight.d.bPg(), 720, paramBoolean);
          if ((((o)localObject2).ouP != null) && (((o)localObject2).ouP.oum != null));
          for (j = 1; ; j = 0)
          {
            if (j == 0)
              break label623;
            ouz.bPE().ouM = true;
            break;
          }
        }
      }
      label625: j = 0;
    }
  }

  public static void a(g.b paramb)
  {
    AppMethodBeat.i(76529);
    if (paramb.oum == null)
    {
      ab.i("MicroMsg.MMSightRecorderConfig", "checkMore start %s", new Object[] { paramb.toString() });
      paramb.oum = paramb.oup;
      paramb.oun = paramb.ouq;
      paramb.ouo = paramb.our;
      if (Math.min(paramb.oun.y, paramb.oun.x) >= ouz.fcY.width + 16)
      {
        ouz.bPF();
        ouz.ouM = false;
        ouz.ouL = false;
        ab.i("MicroMsg.MMSightRecorderConfig", "checkMore out %s", new Object[] { paramb.toString() });
      }
    }
    AppMethodBeat.o(76529);
  }

  public static void bPw()
  {
    AppMethodBeat.i(76530);
    ab.i("MicroMsg.MMSightRecorderConfig", "initSimple");
    o localo = new o();
    ouz = localo;
    localo.ouL = false;
    ouz.ouM = false;
    if (com.tencent.mm.compatible.util.d.iW(19))
    {
      ouz.etz = 2;
      AppMethodBeat.o(76530);
    }
    while (true)
    {
      return;
      ouz.etz = 1;
      AppMethodBeat.o(76530);
    }
  }

  public static void c(VideoTransPara paramVideoTransPara)
  {
    boolean bool1 = true;
    AppMethodBeat.i(76528);
    Object localObject1 = j.a.ouC;
    oux = false;
    ouy = false;
    fXT = ((ActivityManager)ah.getContext().getSystemService("activity")).getLargeMemoryClass();
    ouA = com.tencent.mm.plugin.mmsight.d.ev(ah.getContext());
    Object localObject2 = bs.dut();
    int i = bo.getInt(CaptureMMProxy.getInstance().getDynamicConfig("SightMediaCodecMinApiLevel"), 19);
    ab.i("MicroMsg.MMSightRecorderConfig", "MXM_DynaCfg_AV_Item_Key_SightMediaCodecMinApiLevel: %s", new Object[] { Integer.valueOf(i) });
    if (CaptureMMProxy.getInstance() != null)
      q.ku(CaptureMMProxy.getInstance().getDeviceInfoConfig());
    ab.i("MicroMsg.MMSightRecorderConfig", "init large memory class: %sMB, totalMemory: %sGB  fingerprint: %s mmSightRecorderInfo: %s", new Object[] { Integer.valueOf(fXT), Double.valueOf(ouA), localObject2, q.etj });
    int j;
    int k;
    if (CaptureMMProxy.getInstance() != null)
    {
      j = CaptureMMProxy.getInstance().getInt(ac.a.xPh, -1);
      k = CaptureMMProxy.getInstance().getInt(ac.a.xPk, 1);
    }
    while (true)
    {
      localObject2 = o.a(j, paramVideoTransPara);
      ouz = (o)localObject2;
      boolean bool2;
      if (localObject2 != null)
      {
        paramVideoTransPara = ouz;
        if (k == 1)
        {
          bool2 = true;
          paramVideoTransPara.ouN = bool2;
          oux = true;
          localObject2 = ah.getContext();
          localObject1 = ah.getResources();
          if (ouz != null)
            break label260;
          paramVideoTransPara = "";
          label226: t.makeText((Context)localObject2, ((Resources)localObject1).getString(2131300602, new Object[] { paramVideoTransPara }), 1).show();
          AppMethodBeat.o(76528);
        }
      }
      while (true)
      {
        return;
        bool2 = false;
        break;
        label260: paramVideoTransPara = Integer.valueOf(ouz.ouK);
        break label226;
        switch (j.1.ouB[localObject1.ordinal()])
        {
        default:
          j = q.etj.etG;
          label308: ab.i("MicroMsg.MMSightRecorderConfig", "recorderOption: %s", new Object[] { Integer.valueOf(j) });
          if (j != -1)
            ouz = o.a(j, paramVideoTransPara);
          if (ouz == null)
            break label395;
          if (k != 1)
            break;
        case 2:
        }
        for (ouz.ouN = true; ; ouz.ouN = false)
        {
          ouy = true;
          AppMethodBeat.o(76528);
          break;
          localObject1 = q.etk;
          j = 12;
          break label308;
        }
        label395: ouz = o.a(1, paramVideoTransPara);
        if (k == 1)
        {
          ouz.ouN = true;
          label416: if (q.etj.etz == -1)
            break label517;
          ouz.etz = q.etj.etz;
          label438: if (q.etj.etC != -1)
          {
            if (q.etj.etC != 1)
              break label545;
            bool2 = true;
            label461: ouw = bool2;
          }
          if (q.etj.etA == -1)
            break label557;
          paramVideoTransPara = ouz;
          if (q.etj.etA != 1)
            break label551;
        }
        label517: label545: label551: for (bool2 = bool1; ; bool2 = false)
        {
          paramVideoTransPara.ouL = bool2;
          AppMethodBeat.o(76528);
          break;
          ouz.ouN = false;
          break label416;
          if (com.tencent.mm.compatible.util.d.iW(i))
          {
            ouz.etz = 2;
            break label438;
          }
          ouz.etz = 1;
          break label438;
          bool2 = false;
          break label461;
        }
        label557: ouz.ouL = false;
        AppMethodBeat.o(76528);
      }
      k = 1;
      j = -1;
    }
  }

  public static boolean d(Point paramPoint)
  {
    AppMethodBeat.i(76526);
    boolean bool;
    if (oux)
    {
      Context localContext = ah.getContext();
      Resources localResources = ah.getResources();
      if (ouz == null)
      {
        paramPoint = "";
        t.makeText(localContext, localResources.getString(2131300602, new Object[] { paramPoint }), 1).show();
        AppMethodBeat.o(76526);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      paramPoint = Integer.valueOf(ouz.ouK);
      break;
      ab.i("MicroMsg.MMSightRecorderConfig", "checkMediaCodecHappy, deviceInfo recorderType: %s, recorderOption: %s, isUseRecorderOption: %s", new Object[] { Integer.valueOf(q.etj.etz), Integer.valueOf(q.etj.etG), Boolean.valueOf(ouy) });
      if (ouy)
      {
        AppMethodBeat.o(76526);
        bool = false;
      }
      else if (q.etj.etz != -1)
      {
        AppMethodBeat.o(76526);
        bool = true;
      }
      else if ((ouz != null) && (1 == ouz.etz))
      {
        AppMethodBeat.o(76526);
        bool = true;
      }
      else if (paramPoint == null)
      {
        AppMethodBeat.o(76526);
        bool = false;
      }
      else if ((com.tencent.mm.plugin.mmsight.d.yO(paramPoint.x)) && (com.tencent.mm.plugin.mmsight.d.yO(paramPoint.y)))
      {
        AppMethodBeat.o(76526);
        bool = true;
      }
      else
      {
        if (ouz != null)
        {
          ab.i("MicroMsg.MMSightRecorderConfig", "checkMediaCodecHappy not happy %s", new Object[] { paramPoint.toString() });
          ouz.etz = 1;
        }
        AppMethodBeat.o(76526);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.j
 * JD-Core Version:    0.6.2
 */