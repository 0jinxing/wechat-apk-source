package com.tencent.mm.plugin.scanner.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.service.f;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.scanner.c;
import com.tencent.mm.plugin.scanner.ui.ProductUI;
import com.tencent.mm.plugin.scanner.ui.i;
import com.tencent.mm.plugin.scanner.ui.i.b;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bd;
import java.util.Map;

public final class o
{
  public static String T(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(81475);
    if ((paramContext == null) || (paramInt < 0))
    {
      paramContext = "";
      AppMethodBeat.o(81475);
      return paramContext;
    }
    if (paramInt == 0)
      paramContext.getString(2131302776);
    while (true)
    {
      paramContext = paramContext.getString(2131302776);
      AppMethodBeat.o(81475);
      break;
      if (paramInt == 1)
        paramContext.getString(2131302769);
      else if (paramInt == 2)
        paramContext.getString(2131302775);
      else if (paramInt == 3)
        paramContext.getString(2131302770);
    }
  }

  public static int Wn(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(81476);
    if (paramString == null)
      AppMethodBeat.o(81476);
    while (true)
    {
      return i;
      paramString = paramString.trim();
      if (paramString.startsWith("<user"))
      {
        i = 1;
        AppMethodBeat.o(81476);
      }
      else if (paramString.startsWith("<url"))
      {
        i = 2;
        AppMethodBeat.o(81476);
      }
      else if (paramString.startsWith("<product"))
      {
        i = 3;
        AppMethodBeat.o(81476);
      }
      else if (paramString.startsWith("<search"))
      {
        i = 4;
        AppMethodBeat.o(81476);
      }
      else
      {
        AppMethodBeat.o(81476);
      }
    }
  }

  public static o.c Wo(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(81477);
    if (paramString == null)
    {
      AppMethodBeat.o(81477);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = br.z(paramString, "user");
      if (paramString == null)
      {
        AppMethodBeat.o(81477);
        paramString = localObject;
      }
      else
      {
        paramString = new o.c(bo.nullAsNil((String)paramString.get(".user.username")), bo.nullAsNil((String)paramString.get(".user.nickname")));
        AppMethodBeat.o(81477);
      }
    }
  }

  public static o.b Wp(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(81478);
    if (paramString == null)
    {
      AppMethodBeat.o(81478);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = br.z(paramString, "url");
      if (paramString == null)
      {
        AppMethodBeat.o(81478);
        paramString = localObject;
      }
      else
      {
        paramString = new o.b(bo.nullAsNil((String)paramString.get(".url.link")));
        AppMethodBeat.o(81478);
      }
    }
  }

  public static o.a Wq(String paramString)
  {
    o.a locala = null;
    AppMethodBeat.i(81480);
    if (paramString == null)
    {
      AppMethodBeat.o(81480);
      paramString = locala;
    }
    while (true)
    {
      return paramString;
      Map localMap = br.z(paramString, "search");
      if (localMap == null)
      {
        AppMethodBeat.o(81480);
        paramString = locala;
      }
      else
      {
        locala = new o.a();
        locala.field_xmlType = 4;
        locala.field_xml = paramString;
        locala.qiL = com.tencent.mm.plugin.scanner.a.a.l(localMap, ".search");
        AppMethodBeat.o(81480);
        paramString = locala;
      }
    }
  }

  public static int a(int paramInt1, String paramString, i parami, int paramInt2, e.a parama, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    AppMethodBeat.i(81482);
    if ((paramString == null) || (parami.chu() == null) || (parami.chu().getContext() == null))
      if (paramString == null)
      {
        paramBoolean = true;
        ab.e("MicroMsg.Scanner.ScanXmlHelper", "wrong args, xml == null ? [%s]", new Object[] { Boolean.valueOf(paramBoolean) });
        paramInt1 = 2;
        AppMethodBeat.o(81482);
      }
    while (true)
    {
      return paramInt1;
      paramBoolean = false;
      break;
      int i = Wn(paramString);
      ab.d("MicroMsg.Scanner.ScanXmlHelper", "processReturnXml(), xmlType = [%s]", new Object[] { Integer.valueOf(i) });
      if (i == 1)
      {
        o.c localc = Wo(paramString);
        if ((localc == null) || (bo.isNullOrNil(localc.username)))
        {
          ab.w("MicroMsg.Scanner.ScanXmlHelper", "xmlUser null");
          paramInt1 = 2;
          AppMethodBeat.o(81482);
        }
        else
        {
          paramString = ((j)g.K(j.class)).XM().aoO(localc.username);
          if ((paramString != null) && ((int)paramString.ewQ > 0))
          {
            parama = new Intent();
            parama.putExtra("Contact_User", paramString.field_username);
            parama.setFlags(65536);
            c.gkE.c(parama, parami.chu().getContext());
            paramInt1 = 0;
            AppMethodBeat.o(81482);
          }
          else
          {
            parami.chu().a(localc.username, 1, paramInt3, paramInt4, parama);
            paramInt1 = 1;
            AppMethodBeat.o(81482);
          }
        }
      }
      else if (i == 2)
      {
        paramString = Wp(paramString);
        if ((paramString == null) || (bo.isNullOrNil(paramString.link)))
        {
          ab.w("MicroMsg.Scanner.ScanXmlHelper", "xmlurl null");
          paramInt1 = 2;
          AppMethodBeat.o(81482);
        }
        else
        {
          ab.d("MicroMsg.Scanner.ScanXmlHelper", "xmlurl.link: [%s]", new Object[] { paramString.link });
          if (paramInt1 == 5)
          {
            parama = (f)g.K(f.class);
            parami = parami.chu().getContext();
            paramString = paramString.link;
            if (paramBoolean);
            for (paramInt1 = 1032; ; paramInt1 = 1025)
            {
              parama.b(parami, paramString, paramInt1, null);
              paramInt1 = 0;
              AppMethodBeat.o(81482);
              break;
            }
          }
          parama = new Intent();
          parama.putExtra("rawUrl", paramString.link);
          parama.setFlags(65536);
          c.gkE.i(parama, parami.chu().getContext());
          paramInt1 = 0;
          AppMethodBeat.o(81482);
        }
      }
      else if ((i == 3) || (i == 4))
      {
        ab.d("MicroMsg.Scanner.ScanXmlHelper", "funcType = [%s], addProductToDB = [%s]", new Object[] { Integer.valueOf(paramInt2), Boolean.TRUE });
        parama = new Intent();
        parama.setClass(parami.chu().getContext(), ProductUI.class);
        parama.setFlags(65536);
        parama.putExtra("key_Product_xml", paramString);
        parama.putExtra("key_Product_funcType", paramInt2);
        parama.putExtra("key_ProductUI_addToDB", true);
        parama.putExtra("key_need_add_to_history", true);
        parama.putExtra("key_is_from_barcode", true);
        parami.chu().getContext().startActivity(parama);
        paramInt1 = 0;
        AppMethodBeat.o(81482);
      }
      else
      {
        ab.w("MicroMsg.Scanner.ScanXmlHelper", "wrong xmlType");
        ab.v("MicroMsg.Scanner.ScanXmlHelper", "wrong xml : [%s]", new Object[] { paramString });
        paramInt1 = 2;
        AppMethodBeat.o(81482);
      }
    }
  }

  public static String c(o.a parama)
  {
    AppMethodBeat.i(81481);
    StringBuilder localStringBuilder = new StringBuilder(256);
    if (!bo.isNullOrNil(parama.field_productid))
    {
      localStringBuilder.append("<productInfo><product type=\"" + parama.field_type + "\">");
      localStringBuilder.append("<id>" + bo.ani(parama.field_productid) + "</id>");
      localStringBuilder.append("<title>" + bo.ani(parama.field_title) + "</title>");
      localStringBuilder.append("<subtitle>" + bo.ani(parama.field_subtitle) + "</subtitle>");
      localStringBuilder.append("<thumburl>" + bo.ani(parama.field_thumburl) + "</thumburl>");
      localStringBuilder.append("<source>" + bo.ani(parama.field_source) + "</source>");
      localStringBuilder.append("<shareurl>" + bo.ani(parama.field_shareurl) + "</shareurl>");
      localStringBuilder.append("<playurl>" + bo.ani(parama.field_playurl) + "</playurl>");
      localStringBuilder.append("<extinfo>" + bo.ani(parama.field_extinfo) + "</extinfo>");
      localStringBuilder.append("<getaction>" + bo.ani(new StringBuilder().append(parama.field_getaction).toString()) + "</getaction>");
      localStringBuilder.append("<certification>" + bo.ani(new StringBuilder().append(parama.field_certification).toString()) + "</certification>");
      localStringBuilder.append("<headerbackgroundurl>" + bo.ani(new StringBuilder().append(parama.field_headerbackgroundurl).toString()) + "</headerbackgroundurl>");
      localStringBuilder.append("<headermask>" + bo.ani(new StringBuilder().append(parama.field_headermask).toString()) + "</headermask>");
      localStringBuilder.append("<detailurl>" + bo.ani(new StringBuilder().append(parama.field_detailurl).toString()) + "</detailurl>");
      localStringBuilder.append("<certificationurl>" + bo.ani(new StringBuilder().append(parama.field_certificationurl).toString()) + "</certificationurl>");
      localStringBuilder.append("</product>");
      localStringBuilder.append("<functionType>" + parama.field_functionType + "</functionType>");
      localStringBuilder.append("</productInfo>");
    }
    while (true)
    {
      parama = localStringBuilder.toString();
      AppMethodBeat.o(81481);
      while (true)
      {
        return parama;
        if (parama.field_xml == null)
        {
          ab.e("MicroMsg.Scanner.ScanXmlHelper", "product.field_xml == null in getProductInfoXml()");
          parama = "";
          AppMethodBeat.o(81481);
        }
        else
        {
          if (!parama.field_xml.startsWith("<productInfo"))
            break;
          parama = parama.field_xml;
          AppMethodBeat.o(81481);
        }
      }
      localStringBuilder.append("<productInfo>");
      localStringBuilder.append(parama.field_xml);
      localStringBuilder.append("<functionType>" + parama.field_functionType + "</functionType>");
      localStringBuilder.append("</productInfo>");
    }
  }

  public static o.a cW(String paramString, int paramInt)
  {
    o.a locala = null;
    AppMethodBeat.i(81479);
    if (paramString == null)
    {
      AppMethodBeat.o(81479);
      paramString = locala;
      return paramString;
    }
    Object localObject = "";
    Map localMap;
    if (paramString.startsWith("<productInfo"))
    {
      localMap = br.z(paramString, "productInfo");
      localObject = ".productInfo";
    }
    for (int i = 1; ; i = 0)
    {
      if (localMap != null)
        break label82;
      AppMethodBeat.o(81479);
      paramString = locala;
      break;
      localMap = br.z(paramString, "product");
    }
    label82: locala = new o.a();
    if (!bo.isNullOrNil((String)localMap.get((String)localObject + ".product.$type")))
    {
      locala.field_type = Integer.valueOf((String)localMap.get((String)localObject + ".product.$type")).intValue();
      label166: locala.field_productid = bo.nullAsNil((String)localMap.get((String)localObject + ".product.id"));
      locala.field_subtitle = bo.nullAsNil((String)localMap.get((String)localObject + ".product.subtitle"));
      locala.field_shareurl = bo.nullAsNil((String)localMap.get((String)localObject + ".product.shareurl"));
      locala.field_playurl = bo.nullAsNil((String)localMap.get((String)localObject + ".product.playurl"));
      locala.field_xmlType = 3;
      locala.field_title = bo.nullAsNil((String)localMap.get((String)localObject + ".product.title"));
      locala.field_thumburl = bo.nullAsNil((String)localMap.get((String)localObject + ".product.thumburl"));
      locala.field_source = bo.nullAsNil((String)localMap.get((String)localObject + ".product.source"));
      locala.field_feedbackurl = bo.nullAsNil((String)localMap.get((String)localObject + ".product.feedbackurl"));
      locala.field_extinfo = bo.nullAsNil((String)localMap.get((String)localObject + ".product.extinfo"));
      locala.field_introtitle = bo.nullAsNil((String)localMap.get((String)localObject + ".product.introtitle"));
      locala.field_introlink = bo.nullAsNil((String)localMap.get((String)localObject + ".product.introlink"));
      locala.field_getaction = bo.getInt((String)localMap.get((String)localObject + ".product.getaction"), 0);
      locala.field_certification = bo.nullAsNil((String)localMap.get((String)localObject + ".product.certification"));
      locala.field_headerbackgroundurl = bo.nullAsNil((String)localMap.get((String)localObject + ".product.headerbackgroundurl"));
      locala.field_headermask = bo.nullAsNil((String)localMap.get((String)localObject + ".product.headermask"));
      locala.field_detailurl = bo.nullAsNil((String)localMap.get((String)localObject + ".product.detailurl"));
      locala.field_certificationurl = bo.nullAsNil((String)localMap.get((String)localObject + ".product.certificationurl"));
      locala.field_exposeurl = bo.nullAsNil((String)localMap.get((String)localObject + ".product.exposeurl"));
      locala.qiL = com.tencent.mm.plugin.scanner.a.a.l(localMap, (String)localObject + ".product");
      locala.n(localMap, (String)localObject + ".product");
      localObject = (String)localMap.get((String)localObject + ".functionType");
      if (bo.isNullOrNil((String)localObject))
        break label971;
      locala.field_functionType = Integer.valueOf((String)localObject).intValue();
      label942: if (i == 0)
        break label979;
    }
    for (locala.field_xml = paramString; ; locala.field_xml = ((StringBuilder)localObject).toString())
    {
      AppMethodBeat.o(81479);
      paramString = locala;
      break;
      locala.field_type = 0;
      break label166;
      label971: locala.field_functionType = paramInt;
      break label942;
      label979: localObject = new StringBuilder(256);
      ((StringBuilder)localObject).append("<productInfo>");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("<functionType>" + locala.field_functionType + "</functionType>");
      ((StringBuilder)localObject).append("</productInfo>");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.o
 * JD-Core Version:    0.6.2
 */