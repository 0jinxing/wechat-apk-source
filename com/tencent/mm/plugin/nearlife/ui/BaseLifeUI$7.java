package com.tencent.mm.plugin.nearlife.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.protocal.protobuf.axx;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;

final class BaseLifeUI$7
  implements b.a
{
  BaseLifeUI$7(BaseLifeUI paramBaseLifeUI)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(22948);
    if (this.oRY.eVT)
    {
      paramBoolean = false;
      AppMethodBeat.o(22948);
    }
    while (true)
    {
      return paramBoolean;
      if (this.oRY.ecu)
      {
        paramBoolean = false;
        AppMethodBeat.o(22948);
      }
      else
      {
        if (paramBoolean)
          break;
        if ((!BaseLifeUI.j(this.oRY)) && (!d.agA()))
        {
          BaseLifeUI.k(this.oRY);
          h.a(this.oRY, this.oRY.getString(2131300421), this.oRY.getString(2131297061), this.oRY.getString(2131300878), this.oRY.getString(2131296868), false, new BaseLifeUI.7.1(this), null);
        }
        paramBoolean = true;
        AppMethodBeat.o(22948);
      }
    }
    o.a(2003, paramFloat1, paramFloat2, (int)paramDouble2);
    this.oRY.ecu = true;
    ab.i("MicroMsg.BaseLifeUI", "on get location %f %f " + System.currentTimeMillis(), new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1) });
    this.oRY.oRH = new axx();
    this.oRY.oRH.wfI = "";
    this.oRY.oRH.wfJ = 0;
    this.oRY.oRH.vRq = paramFloat2;
    this.oRY.oRH.vRp = paramFloat1;
    this.oRY.oRH.wfH = "";
    this.oRY.oRH.wfG = ((int)paramDouble2);
    this.oRY.oRI = paramFloat2;
    this.oRY.oRJ = paramFloat1;
    this.oRY.oRK = paramInt;
    this.oRY.oRL = ((float)paramDouble2);
    Object localObject = this.oRY;
    label337: BaseLifeUI localBaseLifeUI;
    if (BaseLifeUI.l(this.oRY) == null)
    {
      paramBoolean = false;
      ((BaseLifeUI)localObject).fBD = paramBoolean;
      localObject = BaseLifeUI.f(this.oRY).oRp;
      if ((localObject == null) || (((ArrayList)localObject).size() <= 0))
        break label579;
      localObject = (BackwardSupportUtil.ExifHelper.LatLongData)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
      this.oRY.p(((BackwardSupportUtil.ExifHelper.LatLongData)localObject).cEB, ((BackwardSupportUtil.ExifHelper.LatLongData)localObject).fFz);
      this.oRY.oRS = BaseLifeUI.h(((BackwardSupportUtil.ExifHelper.LatLongData)localObject).cEB, ((BackwardSupportUtil.ExifHelper.LatLongData)localObject).fFz, paramFloat2, paramFloat1);
      label426: BaseLifeUI.f(this.oRY).oRt = new BackwardSupportUtil.ExifHelper.LatLongData(this.oRY.oRH.vRq, this.oRY.oRH.vRp);
      BaseLifeUI.b(this.oRY).oRt = new BackwardSupportUtil.ExifHelper.LatLongData(this.oRY.oRH.vRq, this.oRY.oRH.vRp);
      localBaseLifeUI = this.oRY;
      if (!this.oRY.gxV)
        break label593;
    }
    label579: label593: for (localObject = BaseLifeUI.b(this.oRY); ; localObject = BaseLifeUI.f(this.oRY))
    {
      BaseLifeUI.a(localBaseLifeUI, (a)localObject);
      BaseLifeUI.m(this.oRY);
      this.oRY.a(BaseLifeUI.i(this.oRY));
      paramBoolean = false;
      AppMethodBeat.o(22948);
      break;
      paramBoolean = BaseLifeUI.l(this.oRY).fBD;
      break label337;
      this.oRY.p(paramFloat2, paramFloat1);
      break label426;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.BaseLifeUI.7
 * JD-Core Version:    0.6.2
 */