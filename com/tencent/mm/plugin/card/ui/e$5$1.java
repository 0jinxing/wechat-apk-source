package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.d.d.a;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h.c;
import java.util.HashMap;

final class e$5$1
  implements h.c
{
  e$5$1(e.5 param5)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(88341);
    Object localObject1 = (String)this.kjJ.kjI.kjB.get(Integer.valueOf(paramInt));
    if (TextUtils.isEmpty((CharSequence)localObject1))
      AppMethodBeat.o(88341);
    while (true)
    {
      return;
      Object localObject2;
      Object localObject3;
      String str;
      if (((String)localObject1).equals("menu_func_share_friend"))
      {
        localObject1 = this.kjJ.kjI;
        com.tencent.mm.plugin.card.d.b.a(((e)localObject1).kjd, 1, (MMActivity.a)localObject1);
        ((e)localObject1).kjd.ifE = ((MMActivity.a)localObject1);
        localObject2 = h.pYm;
        int i = this.kjJ.kjI.kaS.aZV().iAd;
        localObject1 = this.kjJ.kjI.kaS.baa();
        localObject3 = this.kjJ.kjI.kaS.aZZ();
        int j = this.kjJ.kjI.kjF.kgn;
        str = this.kjJ.kjI.kjF.kiN;
        if (this.kjJ.kjI.kaS.aZT());
        for (paramInt = 1; ; paramInt = 0)
        {
          ((h)localObject2).e(11324, new Object[] { "BrandContactView", Integer.valueOf(i), localObject1, localObject3, Integer.valueOf(0), Integer.valueOf(j), str, Integer.valueOf(paramInt), "" });
          h.pYm.e(11582, new Object[] { "OperShareFriend", Integer.valueOf(1), Integer.valueOf(this.kjJ.kjI.kaS.aZV().iAd), this.kjJ.kjI.kaS.baa(), this.kjJ.kjI.kaS.aZZ(), this.kjJ.kjI.kjz });
          AppMethodBeat.o(88341);
          break;
        }
      }
      if (((String)localObject1).equals("menu_func_gift"))
      {
        e.b(this.kjJ.kjI);
        AppMethodBeat.o(88341);
      }
      else if (((String)localObject1).equals("menu_func_delete"))
      {
        localObject1 = "";
        if (this.kjJ.kjI.kaS.aZD())
          localObject1 = this.kjJ.kjI.kjd.getString(2131297831);
        com.tencent.mm.plugin.card.d.d.a(this.kjJ.kjI.kjd, this.kjJ.kjI.kjF.kaE, (String)localObject1, new e.5.1.1(this));
        h.pYm.e(11582, new Object[] { "OperDelete", Integer.valueOf(1), Integer.valueOf(this.kjJ.kjI.kaS.aZV().iAd), this.kjJ.kjI.kaS.baa(), this.kjJ.kjI.kaS.aZZ(), "" });
        AppMethodBeat.o(88341);
      }
      else if (((String)localObject1).equals("menu_func_service"))
      {
        if (!TextUtils.isEmpty(this.kjJ.kjI.kaS.aZV().vTT))
        {
          com.tencent.mm.plugin.card.d.b.af(this.kjJ.kjI.kjd, this.kjJ.kjI.kaS.aZV().vTT);
          am.bbc().s(this.kjJ.kjI.kaS.aZZ(), this.kjJ.kjI.kaS.baa(), 1);
        }
        h.pYm.e(11582, new Object[] { "OperService", Integer.valueOf(1), Integer.valueOf(this.kjJ.kjI.kaS.aZV().iAd), this.kjJ.kjI.kaS.baa(), this.kjJ.kjI.kaS.aZZ(), this.kjJ.kjI.kjF.kiN });
        AppMethodBeat.o(88341);
      }
      else if (((String)localObject1).equals("menu_func_report"))
      {
        if (!TextUtils.isEmpty(this.kjJ.kjI.kaS.aZW().vSf))
          com.tencent.mm.plugin.card.d.b.a(this.kjJ.kjI.kjd, this.kjJ.kjI.kaS.aZW().vSf, this.kjJ.kjI.getString(2131297947));
        h.pYm.e(11582, new Object[] { "OperReport", Integer.valueOf(1), Integer.valueOf(this.kjJ.kjI.kaS.aZV().iAd), this.kjJ.kjI.kaS.baa(), this.kjJ.kjI.kaS.aZZ(), "" });
        AppMethodBeat.o(88341);
      }
      else
      {
        if (((String)localObject1).equals("menu_func_share_timeline"))
        {
          x.a(new m(this.kjJ.kjI.kaS.aZV().kbV));
          localObject1 = this.kjJ.kjI.kjd;
          com.tencent.mm.plugin.card.base.b localb = this.kjJ.kjI.kaS;
          str = this.kjJ.kjI.kjF.kaE;
          localObject2 = this.kjJ.kjI.kjF.kiP;
          localObject3 = new Intent();
          ((Intent)localObject3).putExtra("Ksnsupload_link", localb.aZV().vUc);
          ((Intent)localObject3).putExtra("KContentObjDesc", localb.aZV().kdg);
          ((Intent)localObject3).putExtra("Ksnsupload_title", localb.aZV().title);
          if (TextUtils.isEmpty((CharSequence)localObject2))
            ((Intent)localObject3).putExtra("KUploadProduct_UserData", str + "#");
          while (true)
          {
            ((Intent)localObject3).putExtra("Ksnsupload_imgurl", localb.aZV().kbV);
            if (!TextUtils.isEmpty(localb.aZV().kbV))
              ((Intent)localObject3).putExtra("KsnsUpload_imgPath", new m(localb.aZV().kbV).anJ());
            ab.d("MicroMsg.CardActivityHelper", "doShareTimeLine KSnsUploadImgPath:" + ((Intent)localObject3).getStringExtra("KsnsUpload_imgPath"));
            ((Intent)localObject3).putExtra("src_username", r.Yz());
            ((Intent)localObject3).putExtra("src_displayname", r.YB());
            ((Intent)localObject3).putExtra("Ksnsupload_appid", localb.aZV().csB);
            ((Intent)localObject3).putExtra("Ksnsupload_appname", localb.aZV().vTT);
            ((Intent)localObject3).putExtra("Ksnsupload_type", 7);
            str = v.nW("card_package");
            v.Zp().y(str, true).j("prePublishId", "card_package");
            ((Intent)localObject3).putExtra("reportSessionId", str);
            com.tencent.mm.bp.d.c((Context)localObject1, "sns", ".ui.SnsUploadUI", (Intent)localObject3);
            h.pYm.e(11582, new Object[] { "OperShareTimeLine", Integer.valueOf(1), Integer.valueOf(this.kjJ.kjI.kaS.aZV().iAd), this.kjJ.kjI.kaS.baa(), this.kjJ.kjI.kaS.aZZ(), this.kjJ.kjI.kjF.kiN });
            AppMethodBeat.o(88341);
            break;
            ((Intent)localObject3).putExtra("KUploadProduct_UserData", str + "#" + (String)localObject2);
          }
        }
        if (((String)localObject1).equals("menu_func_delete_share_card"))
        {
          com.tencent.mm.plugin.card.d.d.a(this.kjJ.kjI.kjd, this.kjJ.kjI.kjF.kaE, "", new d.a()
          {
            public final void aZA()
            {
              AppMethodBeat.i(88340);
              if (e.5.1.this.kjJ.kjI.kjE != null)
                e.5.1.this.kjJ.kjI.kjE.bct();
              AppMethodBeat.o(88340);
            }
          });
          AppMethodBeat.o(88341);
        }
        else
        {
          localObject1 = (String)this.kjJ.kjI.kjC.get(localObject1);
          if (!bo.isNullOrNil((String)localObject1))
            com.tencent.mm.plugin.card.d.b.a(this.kjJ.kjI.kjd, (String)localObject1, 0);
          AppMethodBeat.o(88341);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.e.5.1
 * JD-Core Version:    0.6.2
 */