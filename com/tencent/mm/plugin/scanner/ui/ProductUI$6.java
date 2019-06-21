package com.tencent.mm.plugin.scanner.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.cg;
import com.tencent.mm.g.a.cg.a;
import com.tencent.mm.g.a.cg.b;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.scanner.a.j;
import com.tencent.mm.plugin.scanner.c;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.plugin.scanner.util.o.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.q;

final class ProductUI$6
  implements h.d
{
  ProductUI$6(ProductUI paramProductUI)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(81086);
    if (ProductUI.a(this.qdu) == null)
    {
      AppMethodBeat.o(81086);
      return;
    }
    switch (paramInt2)
    {
    default:
    case -1:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      label60: AppMethodBeat.o(81086);
      break;
      com.tencent.mm.ui.base.h.a(this.qdu.mController.ylL, this.qdu.mController.ylL.getString(2131296882), null, null, this.qdu.mController.ylL.getString(2131296881), new h.d()
      {
        public final void bV(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          AppMethodBeat.i(81085);
          switch (paramAnonymousInt2)
          {
          default:
            ab.d("MicroMsg.scanner.ProductUI", "do del cancel");
            AppMethodBeat.o(81085);
          case -1:
          }
          while (true)
          {
            return;
            cg localcg = new cg();
            localcg.cvt.cvv = ProductUI.6.this.qdu.getIntent().getLongExtra("key_favorite_local_id", -1L);
            a.xxA.m(localcg);
            ab.d("MicroMsg.scanner.ProductUI", "do del fav product, local id %d, result %B", new Object[] { Long.valueOf(localcg.cvt.cvv), Boolean.valueOf(localcg.cvu.cvi) });
            if (!localcg.cvu.cvi)
              break;
            ProductUI.6.this.qdu.finish();
            AppMethodBeat.o(81085);
          }
        }
      });
      AppMethodBeat.o(81086);
      break;
      com.tencent.mm.plugin.report.service.h.pYm.e(11446, new Object[] { ProductUI.a(this.qdu).field_productid, Integer.valueOf(2) });
      if (ProductUI.c(this.qdu) == 3)
      {
        com.tencent.mm.plugin.fav.a.h.j(this.qdu.getIntent().getLongExtra("key_favorite_local_id", -1L), 1, 0);
        com.tencent.mm.plugin.report.service.h.pYm.e(10651, new Object[] { Integer.valueOf(10), Integer.valueOf(0), Integer.valueOf(0) });
      }
      Object localObject1 = new Intent();
      ((Intent)localObject1).putExtra("KContentObjDesc", ProductUI.a(this.qdu).field_subtitle);
      ((Intent)localObject1).putExtra("Ksnsupload_title", ProductUI.a(this.qdu).field_title);
      ((Intent)localObject1).putExtra("Ksnsupload_link", ProductUI.a(this.qdu).field_shareurl);
      ((Intent)localObject1).putExtra("Ksnsupload_appname", o.T(this.qdu, ProductUI.a(this.qdu).field_type));
      ((Intent)localObject1).putExtra("Ksnsupload_appid", j.BT(ProductUI.a(this.qdu).field_functionType));
      ((Intent)localObject1).putExtra("Ksnsupload_imgurl", ProductUI.a(this.qdu).field_thumburl);
      ab.i("MicroMsg.scanner.ProductUI", "product.field_thumburl : " + ProductUI.a(this.qdu).field_thumburl);
      if (ProductUI.o(this.qdu) != null)
        ((Intent)localObject1).putExtra("KsnsUpload_imgPath", ProductUI.o(this.qdu).anJ());
      while (true)
      {
        ((Intent)localObject1).putExtra("Ksnsupload_type", 3);
        ((Intent)localObject1).putExtra("KUploadProduct_UserData", o.c(ProductUI.a(this.qdu)));
        ((Intent)localObject1).putExtra("KUploadProduct_subType", ProductUI.a(this.qdu).field_type);
        localObject2 = v.nW("scan_product");
        v.Zp().y((String)localObject2, true).j("prePublishId", "scan_product");
        ((Intent)localObject1).putExtra("reportSessionId", (String)localObject2);
        d.b(this.qdu, "sns", ".ui.SnsUploadUI", (Intent)localObject1);
        AppMethodBeat.o(81086);
        break;
        ab.e("MicroMsg.scanner.ProductUI", "imgGetStrategy is null");
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(11446, new Object[] { ProductUI.a(this.qdu).field_productid, Integer.valueOf(1) });
      localObject1 = j.a(this.qdu.mController.ylL, ProductUI.a(this.qdu));
      Object localObject2 = new Intent();
      ((Intent)localObject2).putExtra("Retr_Msg_content", (String)localObject1);
      ((Intent)localObject2).putExtra("Retr_Msg_Type", 2);
      if (ProductUI.o(this.qdu) != null)
        ((Intent)localObject2).putExtra("Retr_Msg_thumb_path", ProductUI.o(this.qdu).anJ());
      while (true)
      {
        ((Intent)localObject2).putExtra("Retr_go_to_chattingUI", false);
        ((Intent)localObject2).putExtra("Retr_show_success_tips", true);
        c.gkE.k((Intent)localObject2, this.qdu);
        if (ProductUI.c(this.qdu) != 3)
          break label60;
        com.tencent.mm.plugin.report.service.h.pYm.e(10651, new Object[] { Integer.valueOf(10), Integer.valueOf(1), Integer.valueOf(0) });
        AppMethodBeat.o(81086);
        break;
        ab.e("MicroMsg.scanner.ProductUI", "imgGetStrategy is null");
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(11446, new Object[] { ProductUI.a(this.qdu).field_productid, Integer.valueOf(3) });
      ProductUI.r(this.qdu);
      AppMethodBeat.o(81086);
      break;
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("key_fav_scene", 2);
      ((Intent)localObject1).putExtra("key_fav_item_id", this.qdu.getIntent().getLongExtra("key_favorite_local_id", -1L));
      b.b(this.qdu.mController.ylL, ".ui.FavTagEditUI", (Intent)localObject1);
      AppMethodBeat.o(81086);
      break;
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("rawUrl", ProductUI.a(this.qdu).field_exposeurl);
      d.b(this.qdu.mController.ylL, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductUI.6
 * JD-Core Version:    0.6.2
 */