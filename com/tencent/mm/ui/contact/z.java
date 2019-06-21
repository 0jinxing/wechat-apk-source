package com.tencent.mm.ui.contact;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.List;

public final class z
{
  public static void a(Activity paramActivity, String paramString, List<String> paramList)
  {
    AppMethodBeat.i(33921);
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      String str = arT((String)localObject);
      if (ad.aox((String)localObject));
      for (int i = 66; ; i = 42)
      {
        localObject = new com.tencent.mm.modelmulti.h(paramString, str, i);
        aw.Rg().a((m)localObject, 0);
        break;
      }
    }
    com.tencent.mm.ui.widget.snackbar.b.i(paramActivity, paramActivity.getString(2131300520));
    com.tencent.mm.plugin.report.service.h.pYm.e(11003, new Object[] { paramString, Integer.valueOf(3), Integer.valueOf(paramList.size()) });
    paramActivity.setResult(-1);
    al.n(new z.1(paramActivity), 1800L);
    AppMethodBeat.o(33921);
  }

  public static String arT(String paramString)
  {
    AppMethodBeat.i(33920);
    Object localObject = o.act().qo(paramString);
    aw.ZK();
    ad localad = c.XM().aoO(paramString);
    if (localad == null)
    {
      paramString = null;
      AppMethodBeat.o(33920);
    }
    String str1;
    String str2;
    while (true)
    {
      return paramString;
      if (!ad.aox(paramString))
        break;
      str1 = localad.field_openImAppid;
      str2 = ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).c(localad.field_openImAppid, "openim_desc_icon", b.a.geS);
      paramString = ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).ba(localad.field_openImAppid, localad.field_descWordingId);
      paramString = String.format(" <msg bigheadimgurl=\"%s\" smallheadimgurl=\"%s\" username=\"%s\" nickname=\"%s\" sex=\"%d\"  openimappid=\"%s\" openimdesc=\"%s\" openimdescicon=\"%s\"/>", new Object[] { bo.ani(((com.tencent.mm.ah.h)localObject).ack()), bo.ani(((com.tencent.mm.ah.h)localObject).acl()), bo.ani(localad.field_username), bo.ani(localad.Oi()), Integer.valueOf(localad.dtS), str1, bo.ani(paramString), bo.ani(str2) });
      AppMethodBeat.o(33920);
    }
    int i = localad.dtR;
    if (localObject != null)
      i = ((com.tencent.mm.ah.h)localObject).dtR;
    label219: String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    int j;
    int k;
    int m;
    if (localad.dsf())
    {
      paramString = f.qX(localad.field_username);
      str3 = bo.ani(localad.field_username);
      str4 = bo.ani(localad.Oi());
      str5 = bo.ani(localad.Hq());
      str6 = bo.ani(localad.Oi());
      str7 = bo.ani(localad.Ht());
      str8 = bo.ani(localad.getProvince());
      localObject = bo.ani(localad.getCity());
      str2 = bo.ani(localad.signature);
      j = localad.dub;
      k = localad.dtS;
      m = localad.field_verifyFlag;
      str1 = bo.ani(localad.duh);
      if (paramString != null)
        break label445;
    }
    label445: for (paramString = ""; ; paramString = bo.ani(paramString.field_brandIconURL))
    {
      paramString = String.format("<msg username=\"%s\" nickname=\"%s\" alias=\"%s\" fullpy=\"%s\" shortpy=\"%s\" imagestatus=\"%d\" scene=\"17\" province=\"%s\" city=\"%s\" sign=\"%s\" percard=\"%d\" sex=\"%d\" certflag=\"%d\" certinfo=\"%s\" certinfoext=\"\" brandIconUrl=\"%s\" brandHomeUrl=\"\" brandSubscriptConfigUrl=\"\" brandFlags=\"\" regionCode=\"%s\"/>", new Object[] { str3, str4, str5, str6, str7, Integer.valueOf(i), str8, localObject, str2, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), str1, paramString, bo.ani(localad.dui) });
      AppMethodBeat.o(33920);
      break;
      paramString = null;
      break label219;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.z
 * JD-Core Version:    0.6.2
 */