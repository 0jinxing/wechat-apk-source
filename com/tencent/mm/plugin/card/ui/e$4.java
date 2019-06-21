package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.card.b.j.b;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.ui.view.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ax;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.nz;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.protocal.protobuf.wy;
import com.tencent.mm.protocal.protobuf.xt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.base.o;
import java.util.ArrayList;
import java.util.LinkedList;

final class e$4
  implements View.OnClickListener
{
  e$4(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool = true;
    int i = 0;
    AppMethodBeat.i(88338);
    if ((paramView.getId() == 2131821928) || (paramView.getId() == 2131821929))
      if (this.kjI.kaS.aZB())
      {
        if (this.kjI.kjE == null)
          break label4384;
        this.kjI.kjE.bcr();
        AppMethodBeat.o(88338);
      }
    while (true)
    {
      return;
      if ((this.kjI.kaS.aZC()) && (this.kjI.kjE != null))
      {
        this.kjI.kjE.bcp();
        AppMethodBeat.o(88338);
        continue;
        if ((paramView.getId() == 2131824180) || (paramView.getId() == 2131821934))
        {
          com.tencent.mm.plugin.card.d.b.ae(this.kjI.kjd, this.kjI.kjF.kiN);
          AppMethodBeat.o(88338);
        }
        else
        {
          label196: Object localObject1;
          if ((paramView.getId() == 2131821963) || (paramView.getId() == 2131821956))
          {
            if (paramView.getId() == 2131821963)
            {
              this.kjI.kjx = false;
              if ((this.kjI.kjk instanceof q))
              {
                localObject1 = ((q)this.kjI.kjk).e(c.krE);
                this.kjI.kjw.knw = ((String)localObject1);
              }
              localObject1 = this.kjI.kjw;
              bool = this.kjI.kjx;
              ((j)localObject1).bdp();
              ((j)localObject1).kjx = bool;
              if ((((j)localObject1).gKG != null) && (!((j)localObject1).gKG.isShowing()))
              {
                ((j)localObject1).gKG.showAtLocation(paramView.getRootView(), 17, 0, 0);
                ((j)localObject1).gKG.setFocusable(true);
                ((j)localObject1).gKG.setTouchable(true);
                ((j)localObject1).gKG.setBackgroundDrawable(new ColorDrawable(16777215));
                ((j)localObject1).gKG.setOutsideTouchable(true);
                if (!((j)localObject1).kjx)
                  break label746;
                ((j)localObject1).kns.setOnClickListener(((j)localObject1).gKK);
                paramView = ((j)localObject1).kno;
                if (((j)localObject1).kgb == null)
                  break label658;
                ((j)localObject1).kno = l.J(((j)localObject1).kgb);
                label394: ((j)localObject1).kns.setImageBitmap(((j)localObject1).kno);
                ((j)localObject1).knv.add(0, paramView);
                ((j)localObject1).bds();
                ((j)localObject1).gKI.setVisibility(8);
                ((j)localObject1).knr.setVisibility(0);
                paramView = ((j)localObject1).kaS.aZW().code;
                if ((((j)localObject1).kaS.aZV().vUB != null) && (((j)localObject1).kaS.aZV().vUB.wdu))
                  break label700;
                if (bo.isNullOrNil(((j)localObject1).kaS.aZW().vSo))
                  break label667;
                paramView = ((j)localObject1).kaS.aZW().vSo;
                label523: if ((TextUtils.isEmpty(paramView)) || (paramView.length() > 40))
                  break label720;
                ((j)localObject1).knt.setText(m.Hu(paramView));
                if (!((j)localObject1).kaS.aZL())
                  break label707;
                ((j)localObject1).knt.setVisibility(0);
                label573: if (bo.isNullOrNil(((j)localObject1).kaS.aZV().kCx))
                  break label733;
                ((j)localObject1).knu.setText(((j)localObject1).kaS.aZV().kCx);
                ((j)localObject1).knu.setVisibility(0);
              }
            }
            while (true)
            {
              ((j)localObject1).gKG.update();
              AppMethodBeat.o(88338);
              break;
              if (paramView.getId() != 2131821956)
                break label196;
              this.kjI.kjx = true;
              break label196;
              label658: ((j)localObject1).kno = null;
              break label394;
              label667: if (!((j)localObject1).kaS.aZQ())
                break label523;
              if (!bo.isNullOrNil(((j)localObject1).knw))
              {
                paramView = ((j)localObject1).knw;
                break label523;
              }
              label700: paramView = "";
              break label523;
              label707: ((j)localObject1).knt.setVisibility(8);
              break label573;
              label720: ((j)localObject1).knt.setVisibility(8);
              break label573;
              label733: ((j)localObject1).knu.setVisibility(8);
            }
            label746: ((j)localObject1).gKH.setOnClickListener(((j)localObject1).gKK);
            ((j)localObject1).gKH.setImageBitmap(((j)localObject1).gKF);
            paramView = ((j)localObject1).kaS.aZW().code;
            if ((((j)localObject1).kaS.aZV().vUB == null) || (!((j)localObject1).kaS.aZV().vUB.wdu))
              if (!bo.isNullOrNil(((j)localObject1).kaS.aZW().vSo))
              {
                paramView = ((j)localObject1).kaS.aZW().vSo;
                label854: if ((TextUtils.isEmpty(paramView)) || (paramView.length() > 40))
                  break label1028;
                ((j)localObject1).knp.setText(m.Hu(paramView));
                if (!((j)localObject1).kaS.aZL())
                  break label1015;
                ((j)localObject1).knp.setVisibility(0);
                label904: if (TextUtils.isEmpty(((j)localObject1).kaS.aZV().kCx))
                  break label1041;
                ((j)localObject1).knq.setText(((j)localObject1).kaS.aZV().kCx);
                ((j)localObject1).knq.setVisibility(0);
              }
            while (true)
            {
              ((j)localObject1).gKI.setVisibility(0);
              ((j)localObject1).knr.setVisibility(8);
              break;
              if (!((j)localObject1).kaS.aZQ())
                break label854;
              if (!bo.isNullOrNil(((j)localObject1).knw))
              {
                paramView = ((j)localObject1).knw;
                break label854;
              }
              paramView = "";
              break label854;
              label1015: ((j)localObject1).knp.setVisibility(8);
              break label904;
              label1028: ((j)localObject1).knp.setVisibility(8);
              break label904;
              label1041: ((j)localObject1).knq.setVisibility(8);
            }
          }
          Object localObject2;
          int j;
          String str;
          int k;
          if ((paramView.getId() == 2131822332) || (paramView.getId() == 2131822230) || (paramView.getId() == 2131822003) || (paramView.getId() == 2131821958) || (paramView.getId() == 2131822229))
          {
            if (paramView.getId() == 2131822332)
            {
              if (this.kjI.kaS.aZC())
              {
                localObject2 = h.pYm;
                j = this.kjI.kaS.aZV().iAd;
                str = this.kjI.kaS.baa();
                paramView = this.kjI.kaS.aZZ();
                k = this.kjI.kjF.kgn;
                localObject1 = this.kjI.kjF.kiN;
                if (this.kjI.kaS.aZT());
                for (i = 1; ; i = 0)
                {
                  ((h)localObject2).e(11324, new Object[] { "CardConsumedCodeUI", Integer.valueOf(j), str, paramView, Integer.valueOf(0), Integer.valueOf(k), localObject1, Integer.valueOf(i), "" });
                  if (this.kjI.kjE == null)
                    break label4384;
                  this.kjI.kjE.fJ(true);
                  AppMethodBeat.o(88338);
                  break;
                }
              }
              paramView = new j.b();
              this.kjI.a(true, paramView, false);
              AppMethodBeat.o(88338);
            }
            else if ((paramView.getId() == 2131821958) && (this.kjI.kaS.aZV().vUE))
            {
              AppMethodBeat.o(88338);
            }
            else if (this.kjI.kaS.aZC())
            {
              if (this.kjI.kjE != null)
              {
                this.kjI.kjE.fJ(false);
                AppMethodBeat.o(88338);
              }
            }
            else
            {
              paramView = new j.b();
              this.kjI.a(false, paramView, false);
              AppMethodBeat.o(88338);
            }
          }
          else if (paramView.getId() == 2131822039)
          {
            if (!TextUtils.isEmpty(this.kjI.kaS.aZV().vUi))
            {
              com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, this.kjI.kaS.aZV().vUi, 3);
              h.pYm.e(11941, new Object[] { Integer.valueOf(13), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", this.kjI.kaS.aZV().vUh });
              AppMethodBeat.o(88338);
            }
          }
          else if (paramView.getId() == 2131821932)
          {
            h.pYm.e(11582, new Object[] { "OpenShareUserSelectView", Integer.valueOf(0), Integer.valueOf(this.kjI.kaS.aZV().iAd), this.kjI.kaS.baa(), this.kjI.kaS.aZZ(), this.kjI.kjF.kiN });
            paramView = new Intent();
            paramView.putExtra("KLabel_range_index", this.kjI.kgP);
            paramView.putExtra("Klabel_name_list", this.kjI.kgQ);
            paramView.putExtra("Kother_user_name_list", this.kjI.kgR);
            paramView.putExtra("k_sns_label_ui_title", this.kjI.kjd.getString(2131297972));
            paramView.putExtra("k_sns_label_ui_style", 0);
            paramView.putExtra("KLabel_is_filter_private", true);
            d.b(this.kjI.kjd, "sns", ".ui.SnsLabelUI", paramView, 2);
            this.kjI.kjd.ifE = this.kjI;
            AppMethodBeat.o(88338);
          }
          else if (paramView.getId() == 2131822279)
          {
            if (this.kjI.kaS.aZW().vSc != null)
            {
              localObject1 = this.kjI.kaS.aZW().vSc;
              i = ((Integer)paramView.getTag()).intValue();
              paramView = (tm)((LinkedList)localObject1).get(i);
              if (com.tencent.mm.plugin.card.d.b.a(this.kjI.kaS.aZZ(), paramView, this.kjI.kjF.kgn, this.kjI.kjF.kjL))
              {
                h.pYm.e(11941, new Object[] { Integer.valueOf(19), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", paramView.title });
                AppMethodBeat.o(88338);
                continue;
              }
              if ((paramView != null) && (!TextUtils.isEmpty(paramView.url)))
              {
                com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, paramView.url, 1);
                localObject1 = h.pYm;
                switch (i)
                {
                default:
                  i = 10;
                case 0:
                case 1:
                case 2:
                case 3:
                }
              }
              while (true)
              {
                ((h)localObject1).e(11941, new Object[] { Integer.valueOf(i), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", paramView.title });
                if (l.a(paramView, this.kjI.kaS.aZZ()))
                {
                  l.Hs(this.kjI.kaS.aZZ());
                  com.tencent.mm.plugin.card.d.b.b(this.kjI.kjd, this.kjI.kaS.aZV().kdg);
                }
                AppMethodBeat.o(88338);
                break;
                i = 10;
                continue;
                i = 11;
                continue;
                i = 12;
                continue;
                i = 16;
              }
            }
          }
          else if (paramView.getId() == 2131822282)
          {
            if (this.kjI.kaS.aZW().vSc != null)
            {
              paramView = (tm)this.kjI.kaS.aZW().vSc.get(0);
              if (com.tencent.mm.plugin.card.d.b.a(this.kjI.kaS.aZZ(), paramView, this.kjI.kjF.kgn, this.kjI.kjF.kjL))
              {
                h.pYm.e(11941, new Object[] { Integer.valueOf(19), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", paramView.title });
                AppMethodBeat.o(88338);
                continue;
              }
              if ((paramView != null) && (!TextUtils.isEmpty(paramView.url)))
              {
                com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, paramView.url, 1);
                h.pYm.e(11941, new Object[] { Integer.valueOf(10), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", paramView.title });
                if (l.a(paramView, this.kjI.kaS.aZZ()))
                {
                  l.Hs(this.kjI.kaS.aZZ());
                  com.tencent.mm.plugin.card.d.b.b(this.kjI.kjd, this.kjI.kaS.aZV().kdg);
                }
              }
              AppMethodBeat.o(88338);
            }
          }
          else if ((paramView.getId() == 2131822245) || (paramView.getId() == 2131822246))
          {
            if (this.kjI.kaS.aZW().vSj != null)
            {
              if (this.kjI.kaS.aZO())
              {
                if (this.kjI.kaS.aZC())
                {
                  if (this.kjI.kjE == null)
                    break label4384;
                  this.kjI.kjE.fJ(false);
                  AppMethodBeat.o(88338);
                  continue;
                }
                paramView = new j.b();
                this.kjI.a(false, paramView, false);
                AppMethodBeat.o(88338);
                continue;
              }
              if (this.kjI.kaS.aZP())
              {
                paramView = new j.b();
                com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, paramView.kbK, paramView.kbL, false, this.kjI.kaS);
                AppMethodBeat.o(88338);
                continue;
              }
              localObject1 = this.kjI.kaS.aZW().vSj;
              if (com.tencent.mm.plugin.card.d.b.a(this.kjI.kaS.aZZ(), (tm)localObject1, this.kjI.kjF.kgn, this.kjI.kjF.kjL))
              {
                h.pYm.e(11941, new Object[] { Integer.valueOf(20), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", ((tm)localObject1).title });
                AppMethodBeat.o(88338);
                continue;
              }
              if ((localObject1 != null) && (!TextUtils.isEmpty(((tm)localObject1).url)))
              {
                paramView = l.A(((tm)localObject1).url, ((tm)localObject1).vUW);
                com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, paramView, 1);
                h.pYm.e(11941, new Object[] { Integer.valueOf(9), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", ((tm)localObject1).title });
                if (l.a((tm)localObject1, this.kjI.kaS.aZZ()))
                {
                  l.Hs(this.kjI.kaS.aZZ());
                  com.tencent.mm.plugin.card.d.b.b(this.kjI.kjd, this.kjI.kaS.aZV().kdg);
                }
              }
              AppMethodBeat.o(88338);
            }
          }
          else
          {
            Object localObject3;
            if ((paramView.getId() == 2131822030) || (paramView.getId() == 2131822023))
            {
              localObject3 = this.kjI.kaS.aZV().vUo;
              localObject2 = h.pYm;
              j = this.kjI.kaS.aZV().iAd;
              str = this.kjI.kaS.baa();
              paramView = this.kjI.kaS.aZZ();
              k = this.kjI.kjF.kgn;
              localObject1 = this.kjI.kjF.kiN;
              if (this.kjI.kaS.aZT())
                i = 1;
              ((h)localObject2).e(11324, new Object[] { "CardLeftRightIntroduceView", Integer.valueOf(j), str, paramView, Integer.valueOf(0), Integer.valueOf(k), localObject1, Integer.valueOf(i), "" });
              if ((localObject3 != null) && (!TextUtils.isEmpty(((wy)localObject3).url)))
              {
                com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, ((wy)localObject3).url, 1);
                AppMethodBeat.o(88338);
              }
              else
              {
                paramView = new Intent();
                if ((this.kjI.kaS instanceof CardInfo))
                  paramView.putExtra("key_card_info_data", (CardInfo)this.kjI.kaS);
                while (true)
                {
                  paramView.setClass(this.kjI.kjd, CardDetailPreference.class);
                  this.kjI.kjd.startActivity(paramView);
                  AppMethodBeat.o(88338);
                  break;
                  if ((this.kjI.kaS instanceof ShareCardInfo))
                    paramView.putExtra("key_card_info_data", (ShareCardInfo)this.kjI.kaS);
                }
              }
            }
            else if (paramView.getId() == 2131822302)
            {
              if (com.tencent.mm.plugin.card.sharecard.a.b.GC(this.kjI.kaS.baa()) <= 1)
              {
                AppMethodBeat.o(88338);
              }
              else
              {
                paramView = this.kjI;
                if (!this.kjI.kjg);
                while (true)
                {
                  paramView.kjg = bool;
                  this.kjI.bbB();
                  AppMethodBeat.o(88338);
                  break;
                  bool = false;
                }
              }
            }
            else if (paramView.getId() == 2131822026)
            {
              if ((this.kjI.kaS.aZV().vUk != null) && (!TextUtils.isEmpty(this.kjI.kaS.aZV().vUk.url)))
              {
                com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, this.kjI.kaS.aZV().vUk.url, 3);
                h.pYm.e(11941, new Object[] { Integer.valueOf(3), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", this.kjI.kaS.aZV().vUk.text });
                AppMethodBeat.o(88338);
              }
            }
            else if (paramView.getId() == 2131821937)
            {
              if ((this.kjI.kaS.aZV().vUr != null) && (!bo.isNullOrNil(this.kjI.kaS.aZV().vUr.url)))
              {
                com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, this.kjI.kaS.aZV().vUr.url, 1);
                h.pYm.e(11941, new Object[] { Integer.valueOf(14), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", this.kjI.kaS.aZV().vUr.text });
                AppMethodBeat.o(88338);
              }
            }
            else if ((paramView.getId() == 2131822315) || (paramView.getId() == 2131822314))
            {
              if (this.kjI.kaS.aZV().vUa > 0)
              {
                if ((this.kjI.kaY == null) || (this.kjI.kaY.size() == 0))
                {
                  ab.e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
                  AppMethodBeat.o(88338);
                  continue;
                }
                paramView = (od)this.kjI.kaY.get(0);
                com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, paramView.cEB, paramView.cGm, paramView.fBg);
                localObject3 = h.pYm;
                j = this.kjI.kaS.aZV().iAd;
                localObject2 = this.kjI.kaS.baa();
                localObject1 = this.kjI.kaS.aZZ();
                k = this.kjI.kjF.kgn;
                str = this.kjI.kjF.kiN;
                if (this.kjI.kaS.aZT());
                for (i = 1; ; i = 0)
                {
                  ((h)localObject3).e(11324, new Object[] { "UsedStoresView", Integer.valueOf(j), localObject2, localObject1, Integer.valueOf(0), Integer.valueOf(k), str, Integer.valueOf(i), "" });
                  h.pYm.e(11941, new Object[] { Integer.valueOf(5), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", paramView.name });
                  AppMethodBeat.o(88338);
                  break;
                }
              }
            }
            else if (paramView.getId() == 2131822342)
            {
              if ((this.kjI.kaY == null) || (this.kjI.kaY.size() == 0))
              {
                ab.e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
                AppMethodBeat.o(88338);
              }
              else
              {
                localObject1 = (od)this.kjI.kaY.get(0);
                paramView = (String)paramView.getTag();
                if ((!TextUtils.isEmpty(paramView)) && (paramView.equals(this.kjI.kjd.getString(2131297810))))
                {
                  e.a(this.kjI);
                  AppMethodBeat.o(88338);
                }
                else
                {
                  if (!TextUtils.isEmpty(((od)localObject1).kdF))
                  {
                    com.tencent.mm.plugin.card.d.b.a(this.kjI.kjd, ((od)localObject1).kdF, 1);
                    h.pYm.e(11941, new Object[] { Integer.valueOf(4), this.kjI.kaS.aZZ(), this.kjI.kaS.baa(), "", ((od)localObject1).name });
                  }
                  AppMethodBeat.o(88338);
                }
              }
            }
            else if (paramView.getId() == 2131822346)
            {
              e.a(this.kjI);
            }
          }
        }
      }
      else
      {
        label4384: AppMethodBeat.o(88338);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.e.4
 * JD-Core Version:    0.6.2
 */