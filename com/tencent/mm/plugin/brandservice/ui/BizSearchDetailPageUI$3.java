package com.tencent.mm.plugin.brandservice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bvo;
import com.tencent.mm.protocal.protobuf.mg;
import com.tencent.mm.protocal.protobuf.mh;
import com.tencent.mm.protocal.protobuf.mn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.sortview.a;

final class BizSearchDetailPageUI$3
  implements c.b
{
  BizSearchDetailPageUI$3(BizSearchDetailPageUI paramBizSearchDetailPageUI)
  {
  }

  public final void a(c paramc, a parama, int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(13877);
    mh localmh;
    StringBuilder localStringBuilder;
    if ((BizSearchDetailPageUI.e(this.jKZ) == 1) && (parama.type == 5))
    {
      parama = (mn)parama.getData();
      if ((parama.vQv == null) || (parama.vQv.vQb == null))
      {
        ab.e("MicroMsg.BrandService.BizSearchDetailPageUI", "bcdItem.ContactItem == null || bcdItem.ContactItem.ContactItem == null");
        AppMethodBeat.o(13877);
        return;
      }
      localmh = paramc.sa(paramInt3);
      localStringBuilder = new StringBuilder().append(bo.nullAsNil(BizSearchDetailPageUI.a(this.jKZ))).append(",").append(paramInt1).append(",").append(bo.nullAsNil(paramString)).append(",").append(paramInt2).append(",").append(paramc.jLe).append(",");
      if (localmh != null)
        break label239;
    }
    label239: for (paramc = ""; ; paramc = localmh.vQg + ",1")
    {
      paramc = paramc;
      h.pYm.X(10866, paramc);
      ab.d("MicroMsg.BrandService.BizSearchDetailPageUI", "report : ".concat(String.valueOf(paramc)));
      if ((parama.vQv.vQb.wBT & 0x8) > 0)
        h.pYm.X(10298, paramString + ",35");
      AppMethodBeat.o(13877);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI.3
 * JD-Core Version:    0.6.2
 */