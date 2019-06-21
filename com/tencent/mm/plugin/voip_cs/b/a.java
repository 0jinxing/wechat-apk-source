package com.tencent.mm.plugin.voip_cs.b;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.c.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

public final class a extends v2protocal
{
  public int field_voipcsChannelInfoLength;
  int field_voipcsEngineInfoLength;
  public byte[] tcD;
  byte[] tcE;

  public a(ak paramak)
  {
    super(paramak);
    AppMethodBeat.i(135285);
    this.tcD = new byte[2048];
    this.tcE = new byte[2048];
    this.field_voipcsChannelInfoLength = 0;
    this.field_voipcsEngineInfoLength = 0;
    AppMethodBeat.o(135285);
  }

  public final String cMb()
  {
    AppMethodBeat.i(135286);
    getVoipcsEngineInfo(this.tcE, this.tcE.length);
    ab.d("MicroMsg.CSV2protocal", "field_voipcsEngineInfoLength: %d", new Object[] { Integer.valueOf(this.field_voipcsEngineInfoLength) });
    String str = this.nwC + "," + this.nwv + "," + this.sTZ + "," + c.cMg().tdl + "," + this.sUm + "," + this.sUn + cKC() + new String(this.tcE, 0, this.field_voipcsEngineInfoLength);
    com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.CSV2protocal", "voipreport:NewEngineString:".concat(String.valueOf(str)));
    AppMethodBeat.o(135286);
    return str;
  }

  public final int cMc()
  {
    boolean bool1 = false;
    AppMethodBeat.i(135287);
    this.netType = com.tencent.mm.plugin.voip.a.a.getNetType(ah.getContext());
    this.sTX = this.netType;
    c.cMg().sTX = this.netType;
    if (this.netType == 5)
      this.netType = 4;
    boolean bool2;
    if ((this.sTX >= 4) && ((cpuFlag0 & 0x400) != 0) && ((cpuFlag0 & 0xFF) >= 30))
    {
      bool2 = true;
      if ((q.etc.erv != 1) || (q.etc.eqX.width < 480) || (q.etc.eqX.height < 360) || (q.etc.eqZ.width < 480) || (q.etc.eqZ.height < 360))
        break label488;
    }
    label488: for (boolean bool3 = true; ; bool3 = false)
    {
      if (q.etc.erv == 0)
        bool1 = true;
      if (((bool2) || (bool3)) && (!bool1))
      {
        this.defaultWidth = 480;
        this.defaultHeight = 360;
        sTV = true;
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.CSV2protocal", "steve:Set Enable 480! " + this.defaultWidth + "x" + this.defaultHeight);
      }
      com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.CSV2protocal", "steve: Android CPUFlag:" + (cpuFlag0 & 0xFF) + ", 480x360 Enc flags: bEnable480FromLocal:" + bool2 + ", bEnable480FromSvr:" + bool3 + ", bDisable480FromSvr:" + bool1);
      this.sUU = new int[this.defaultWidth * this.defaultHeight];
      g.RN();
      this.kIm = com.tencent.mm.kernel.a.QF();
      int i = Build.VERSION.SDK_INT;
      int j = OpenGlRender.getGLVersion();
      Display localDisplay = ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay();
      int k = localDisplay.getWidth();
      int m = localDisplay.getHeight();
      m = init(this.netType, 2, this.defaultWidth << 16 | this.defaultHeight, k << 16 | m, this.kIm, cpuFlag0 | (j << 24 | i << 16), e.eSi + "lib/", 8);
      com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.CSV2protocal", "protocal init ret :" + m + ",uin= " + this.kIm);
      this.isInited = true;
      if (m < 0)
        reset();
      AppMethodBeat.o(135287);
      return m;
      bool2 = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a
 * JD-Core Version:    0.6.2
 */