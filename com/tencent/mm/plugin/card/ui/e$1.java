package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.arp;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.protocal.protobuf.wy;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

final class e$1
  implements AdapterView.OnItemClickListener
{
  e$1(e parame)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(88335);
    paramAdapterView = (com.tencent.mm.plugin.card.model.b)this.kjI.kaW.get(paramInt);
    if ((paramAdapterView == null) || (TextUtils.isEmpty(paramAdapterView.url)))
      AppMethodBeat.o(88335);
    while (true)
    {
      return;
      paramView = new Intent();
      label80: int i;
      label163: String str;
      int j;
      Object localObject;
      if ((this.kjI.kaS instanceof CardInfo))
      {
        paramView.putExtra("key_card_info_data", (CardInfo)this.kjI.kaS);
        if (!paramAdapterView.url.equals("card://jump_detail"))
          break label395;
        if ((this.kjI.kaS.aZV().vUo == null) || (TextUtils.isEmpty(this.kjI.kaS.aZV().vUo.url)))
          break label362;
        com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, this.kjI.kaS.aZV().vUo.url, 1);
        paramAdapterView = h.pYm;
        i = this.kjI.kaS.aZV().iAd;
        str = this.kjI.kaS.baa();
        paramView = this.kjI.kaS.aZZ();
        j = this.kjI.kjF.kgn;
        localObject = this.kjI.kjF.kiN;
        if (!this.kjI.kaS.aZT())
          break label390;
      }
      label390: for (paramInt = 1; ; paramInt = 0)
      {
        paramAdapterView.e(11324, new Object[] { "CardLeftRightIntroduceView", Integer.valueOf(i), str, paramView, Integer.valueOf(0), Integer.valueOf(j), localObject, Integer.valueOf(paramInt), "" });
        AppMethodBeat.o(88335);
        break;
        if (!(this.kjI.kaS instanceof ShareCardInfo))
          break label80;
        paramView.putExtra("key_card_info_data", (ShareCardInfo)this.kjI.kaS);
        break label80;
        label362: paramView.setClass(this.kjI.kjd, CardDetailPreference.class);
        this.kjI.kjd.startActivity(paramView);
        break label163;
      }
      label395: if ((paramAdapterView.url.equals("card://jump_shop_list")) && (this.kjI.kaS.aZV().vUa > 0))
      {
        e.a(this.kjI);
        AppMethodBeat.o(88335);
      }
      else if ((paramAdapterView.url.equals("card://jump_shop")) && (this.kjI.kaS.aZV().vUa > 0))
      {
        if ((this.kjI.kaY == null) || (this.kjI.kaY.size() == 0))
        {
          ab.e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
          AppMethodBeat.o(88335);
        }
        else
        {
          paramAdapterView = (od)this.kjI.kaY.get(0);
          if ((paramAdapterView != null) && (!TextUtils.isEmpty(paramAdapterView.kdF)))
          {
            com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, paramAdapterView.kdF, 1);
            h.pYm.e(11941, new Object[] { Integer.valueOf(4), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", paramAdapterView.name });
          }
          localObject = h.pYm;
          i = this.kjI.kaS.aZV().iAd;
          str = this.kjI.kaS.baa();
          paramView = this.kjI.kaS.aZZ();
          j = this.kjI.kjF.kgn;
          paramAdapterView = this.kjI.kjF.kiN;
          if (this.kjI.kaS.aZT());
          for (paramInt = 1; ; paramInt = 0)
          {
            ((h)localObject).e(11324, new Object[] { "UsedStoresView", Integer.valueOf(i), str, paramView, Integer.valueOf(0), Integer.valueOf(j), paramAdapterView, Integer.valueOf(paramInt), "" });
            AppMethodBeat.o(88335);
            break;
          }
        }
      }
      else if (paramAdapterView.url.equals("card://jump_service"))
      {
        if (!TextUtils.isEmpty(this.kjI.kaS.aZV().vTT))
        {
          com.tencent.mm.plugin.card.d.b.af(this.kjI.kjd, this.kjI.kaS.aZV().vTT);
          am.bbc().s(this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), 1);
        }
        h.pYm.e(11582, new Object[] { "OperService", Integer.valueOf(1), Integer.valueOf(this.kjI.kaS.aZV().iAd), this.kjI.kaS.baa(), this.kjI.kaS.aZZ(), this.kjI.kjF.kiN });
        AppMethodBeat.o(88335);
      }
      else if (paramAdapterView.url.equals("card://jump_gift"))
      {
        e.b(this.kjI);
        paramAdapterView = this.kjI;
        if (paramAdapterView.kaS.aZW().vSn == null)
        {
          ab.i("MicroMsg.CardDetailUIContoller", "mCardInfo.getDataInfo().gifting_info_cell is null");
          AppMethodBeat.o(88335);
        }
        else if (paramAdapterView.kaS.aZW().vSn.waC == null)
        {
          ab.e("MicroMsg.CardDetailUIContoller", "mCardInfo.getDataInfo().gifting_info_cell.gifting_info is null");
          AppMethodBeat.o(88335);
        }
        else
        {
          h.pYm.e(13866, new Object[] { Integer.valueOf(6), paramAdapterView.kaS.aZW().vSn.waC.vBB, p.getString(paramAdapterView.kaS.aZW().vSn.waC.vBA) });
          AppMethodBeat.o(88335);
        }
      }
      else if (paramAdapterView.url.equals("card://jump_card_gift"))
      {
        if (this.kjI.kaS.aZW().vSn == null)
        {
          ab.e("MicroMsg.CardDetailUIContoller", "jump_card_gift mCardInfo.getDataInfo().gifting_info_cell is null");
          AppMethodBeat.o(88335);
        }
        else if (this.kjI.kaS.aZW().vSn.waC == null)
        {
          ab.e("MicroMsg.CardDetailUIContoller", "jump_card_gift mCardInfo.getDataInfo().gifting_info_cell.gifting_info is null");
          AppMethodBeat.o(88335);
        }
        else
        {
          paramView = this.kjI;
          localObject = this.kjI.kaS.aZW().vSn.waC.vBB;
          paramInt = this.kjI.kaS.aZW().vSn.waC.vBA;
          ab.d("MicroMsg.CardDetailUIContoller", "doJumpCardGift, order_id:%s, biz_uin:%d", new Object[] { localObject, Integer.valueOf(paramInt) });
          paramAdapterView = new Intent(paramView.kjd, CardGiftReceiveUI.class);
          paramAdapterView.putExtra("key_biz_uin", paramInt);
          paramAdapterView.putExtra("key_order_id", (String)localObject);
          paramAdapterView.putExtra("key_gift_into", (CardGiftInfo)paramView.kjd.getIntent().getParcelableExtra("key_card_git_info"));
          paramView.kjd.startActivity(paramAdapterView);
          h.pYm.e(13866, new Object[] { Integer.valueOf(5), this.kjI.kaS.aZW().vSn.waC.vBB, p.getString(this.kjI.kaS.aZW().vSn.waC.vBA) });
          AppMethodBeat.o(88335);
        }
      }
      else if ((paramAdapterView.vUW & 0x20) > 0L)
      {
        paramAdapterView = this.kjI;
        com.tencent.mm.plugin.card.d.b.a(paramAdapterView.kjd, 4, paramAdapterView);
        paramAdapterView.kjd.ifE = paramAdapterView;
        AppMethodBeat.o(88335);
      }
      else if (com.tencent.mm.plugin.card.d.b.d(this.kjI.kaS.aZZ(), paramAdapterView.vTL, paramAdapterView.vTM, this.kjI.kjF.kgn, this.kjI.kjF.kjL))
      {
        h.pYm.e(11941, new Object[] { Integer.valueOf(21), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", paramAdapterView.title });
        AppMethodBeat.o(88335);
      }
      else
      {
        paramView = com.tencent.mm.plugin.card.d.l.A(paramAdapterView.url, paramAdapterView.vUW);
        com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, paramView, 1);
        h.pYm.e(11492, new Object[] { Integer.valueOf(this.kjI.kjF.kgn), this.kjI.kjF.kiO, this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), Integer.valueOf(this.kjI.kaS.aZW().status), paramView, Integer.valueOf(this.kjI.kaS.aZV().iAd), this.kjI.kaS.aZV().vTT });
        h.pYm.e(11941, new Object[] { Integer.valueOf(6), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", paramAdapterView.title });
        if (com.tencent.mm.plugin.card.d.l.a(paramAdapterView, this.kjI.kaS.aZZ()))
        {
          com.tencent.mm.plugin.card.d.l.Hs(this.kjI.kaS.aZZ());
          com.tencent.mm.plugin.card.d.b.b(this.kjI.kjd, this.kjI.kaS.aZV().kdg);
        }
        AppMethodBeat.o(88335);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.e.1
 * JD-Core Version:    0.6.2
 */