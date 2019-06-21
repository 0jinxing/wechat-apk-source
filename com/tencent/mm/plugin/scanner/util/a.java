package com.tencent.mm.plugin.scanner.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.scanner.c;
import com.tencent.mm.plugin.scanner.ui.ProductUI;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.kx;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;

public final class a
  implements com.tencent.mm.ai.f
{
  public Bundle cvs;
  public Activity czX;
  public ProgressDialog ehJ;

  final void chO()
  {
    AppMethodBeat.i(81368);
    com.tencent.mm.kernel.g.Rg().b(1061, this);
    AppMethodBeat.o(81368);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(81369);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BarcodeStringHandler", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    chO();
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if ((paramInt1 == 4) && (paramInt2 == -4))
    {
      com.tencent.mm.ui.base.h.a(this.czX, 2131302097, 2131297061, null);
      AppMethodBeat.o(81369);
    }
    label528: 
    while (true)
    {
      return;
      int i;
      switch (paramInt1)
      {
      default:
        i = 0;
      case 1:
      case 2:
      }
      while (true)
      {
        if (i == 0)
          break label246;
        AppMethodBeat.o(81369);
        break;
        if (com.tencent.mm.kernel.g.Rg().acT())
        {
          com.tencent.mm.kernel.g.Rg().getNetworkServerIp();
          new StringBuilder().append(paramInt2);
        }
        while (true)
        {
          i = 1;
          break;
          if (com.tencent.mm.network.ab.ch(this.czX))
            com.tencent.mm.pluginsdk.ui.tools.h.fR(this.czX);
          else
            Toast.makeText(this.czX, this.czX.getString(2131299945, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2) }), 1).show();
        }
        Toast.makeText(this.czX, this.czX.getString(2131299946), 1).show();
        i = 1;
      }
      label246: if ((paramInt1 == 4) && (paramInt2 == -2004))
      {
        com.tencent.mm.ui.base.h.g(this.czX, 2131302090, 2131297061);
        AppMethodBeat.o(81369);
      }
      else if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Toast.makeText(this.czX, this.czX.getString(2131299995, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        AppMethodBeat.o(81369);
      }
      else if (paramm.getType() == 1061)
      {
        Object localObject = ((com.tencent.mm.plugin.scanner.a.g)paramm).cgG();
        if (localObject == null)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.BarcodeStringHandler", "onSceneEnd(), getResp() == null");
          AppMethodBeat.o(81369);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.BarcodeStringHandler", "onSceneEnd() ScanBarcode Type = %s", new Object[] { Integer.valueOf(((kx)localObject).jCt) });
          if (bo.isNullOrNil(((kx)localObject).vNK))
          {
            AppMethodBeat.o(81369);
          }
          else
          {
            int j = ((kx)localObject).jCt;
            paramString = this.czX;
            localObject = ((kx)localObject).vNK;
            paramInt1 = ((com.tencent.mm.plugin.scanner.a.g)paramm).cvn;
            i = ((com.tencent.mm.plugin.scanner.a.g)paramm).cvo;
            e locale = new e();
            paramm = this.cvs;
            paramInt2 = o.Wn((String)localObject);
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.Scanner.ScanXmlHelper", "processReturnXml(), xmlType = [%s]", new Object[] { Integer.valueOf(paramInt2) });
            o.c localc;
            if (paramInt2 == 1)
            {
              localc = o.Wo((String)localObject);
              if ((localc == null) || (bo.isNullOrNil(localc.username)))
              {
                com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Scanner.ScanXmlHelper", "xmlUser null");
                paramInt1 = 2;
                switch (paramInt1)
                {
                default:
                case 0:
                case 1:
                case 2:
                }
              }
            }
            while (true)
            {
              AppMethodBeat.o(81369);
              break;
              localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(localc.username);
              if ((localObject != null) && ((int)((com.tencent.mm.n.a)localObject).ewQ > 0))
              {
                paramm = new Intent();
                paramm.putExtra("Contact_User", ((ap)localObject).field_username);
                paramm.setFlags(65536);
                c.gkE.c(paramm, paramString);
                paramInt1 = 0;
                break label528;
              }
              locale.a(paramString, localc.username, 2, paramInt1, i, null, paramm);
              paramInt1 = 1;
              break label528;
              if (paramInt2 == 2)
              {
                localObject = o.Wp((String)localObject);
                if ((localObject == null) || (bo.isNullOrNil(((o.b)localObject).link)))
                {
                  com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Scanner.ScanXmlHelper", "xmlurl null");
                  paramInt1 = 2;
                  break label528;
                }
                com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.Scanner.ScanXmlHelper", "xmlurl.link: [%s]", new Object[] { ((o.b)localObject).link });
                if (j == 5)
                {
                  ((com.tencent.mm.plugin.appbrand.service.f)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.f.class)).b(paramString, ((o.b)localObject).link, 1031, paramm);
                  paramInt1 = 0;
                  break label528;
                }
                paramm = new Intent();
                paramm.putExtra("rawUrl", ((o.b)localObject).link);
                paramm.setFlags(65536);
                c.gkE.i(paramm, paramString);
                paramInt1 = 0;
                break label528;
              }
              if ((paramInt2 == 3) || (paramInt2 == 4))
              {
                com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.Scanner.ScanXmlHelper", "funcType = [%s], addProductToDB = [%s]", new Object[] { Integer.valueOf(4), Boolean.TRUE });
                paramm = new Intent();
                paramm.setClass(paramString, ProductUI.class);
                paramm.setFlags(65536);
                paramm.putExtra("key_Product_xml", (String)localObject);
                paramm.putExtra("key_Product_funcType", 4);
                paramm.putExtra("key_ProductUI_addToDB", true);
                paramm.putExtra("key_need_add_to_history", true);
                paramm.putExtra("key_is_from_barcode", true);
                paramString.startActivity(paramm);
                paramInt1 = 0;
                break label528;
              }
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.Scanner.ScanXmlHelper", "wrong xmlType");
              com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.Scanner.ScanXmlHelper", "wrong xml : [%s]", new Object[] { localObject });
              paramInt1 = 2;
              break label528;
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BarcodeStringHandler", "onSceneEnd PROCESS_XML_RETURN_TYPE_OK");
              AppMethodBeat.o(81369);
              break;
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BarcodeStringHandler", "onSceneEnd() PROCESS_XML_RETURN_TYPE_SEARCH_CONTACT");
              AppMethodBeat.o(81369);
              break;
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.BarcodeStringHandler", "onSceneEnd() PROCESS_XML_RETURN_TYPE_WRONG");
            }
          }
        }
      }
      else
      {
        AppMethodBeat.o(81369);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.a
 * JD-Core Version:    0.6.2
 */