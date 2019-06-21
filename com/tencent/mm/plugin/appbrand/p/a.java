package com.tencent.mm.plugin.appbrand.p;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.a;
import com.tencent.mm.storage.be.b;
import com.tencent.mm.storage.bi;
import java.util.Map;

public final class a
  implements be.a
{
  private static void a(ak paramak1, ak paramak2)
  {
    AppMethodBeat.i(132732);
    Object localObject = aLF();
    if (localObject != null)
    {
      ab.e("MicroMsg.AppBrandConversionExtension", "The lastest app brand conversation username is %s", new Object[] { ((at)localObject).field_username });
      localObject = ((j)g.K(j.class)).bOr().Rb(((at)localObject).field_username);
      if ((localObject == null) || (((cy)localObject).field_msgId <= 0L))
        break label316;
      paramak2.ap((bi)localObject);
      paramak2.setContent(((cy)localObject).field_talker + ":" + ((cy)localObject).field_content);
      paramak2.jg(Integer.toString(((bi)localObject).getType()));
      be.b localb = ((j)g.K(j.class)).XR().Cb();
      if (localb != null)
      {
        PString localPString1 = new PString();
        PString localPString2 = new PString();
        PInt localPInt = new PInt();
        ((bi)localObject).ju(paramak1.field_parentRef);
        ((bi)localObject).setContent(paramak2.field_content);
        localb.a((bi)localObject, localPString1, localPString2, localPInt, true);
        paramak1 = ac(((bi)localObject).getType(), ((cy)localObject).field_content);
        localObject = bo.nullAsNil(localPString1.value);
        if (!bo.isNullOrNil(paramak1))
          break label293;
        paramak1 = "";
        label227: paramak2.jh(((String)localObject).concat(paramak1));
        paramak2.ji(localPString2.value);
        paramak2.hP(localPInt.value);
      }
      AppMethodBeat.o(132732);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.AppBrandConversionExtension", "The lastest app brand conversation is null");
      localObject = ((j)g.K(j.class)).bOr().Rb(paramak1.field_username);
      break;
      label293: paramak1 = " " + bo.nullAsNil(paramak1);
      break label227;
      label316: ab.e("MicroMsg.AppBrandConversionExtension", "the last of msg is null'");
      paramak2.dsI();
      AppMethodBeat.o(132732);
    }
  }

  private static ak aLF()
  {
    AppMethodBeat.i(132731);
    Cursor localCursor = ((j)g.K(j.class)).XR().c(t.fkV, null, "appbrandcustomerservicemsg");
    ak localak;
    if (localCursor != null)
      if ((localCursor.getCount() > 0) && (localCursor.moveToFirst()))
      {
        localak = new ak();
        localak.d(localCursor);
        localCursor.close();
      }
    while (true)
    {
      AppMethodBeat.o(132731);
      return localak;
      localak = null;
      break;
      localak = null;
    }
  }

  private static String ac(int paramInt, String paramString)
  {
    AppMethodBeat.i(132730);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (!bo.isNullOrNil(paramString))
      switch (paramInt)
      {
      default:
        localObject2 = localObject1;
      case 49:
      }
    while (true)
    {
      AppMethodBeat.o(132730);
      return localObject2;
      paramString = br.z(paramString, "msg");
      localObject2 = localObject1;
      if (paramString != null)
      {
        localObject2 = (String)paramString.get(".msg.appmsg.title");
        ab.d("MicroMsg.AppBrandConversionExtension", "[oneliang][parseConversationMsgContentTitle] title:%s", new Object[] { localObject2 });
      }
    }
  }

  public final void a(ak paramak, be parambe)
  {
    AppMethodBeat.i(132729);
    String str;
    if ((paramak != null) && (!bo.isNullOrNil(paramak.field_username)))
    {
      str = paramak.field_username;
      parambe = ((j)g.K(j.class)).XM().aoO(str);
      if ((parambe == null) || ((int)parambe.ewQ == 0))
      {
        ab.e("MicroMsg.AppBrandConversionExtension", "contact is null or contactId is 0 for %s", new Object[] { str });
        AppMethodBeat.o(132729);
      }
    }
    while (true)
    {
      return;
      if ((ad.mg(str)) && (!t.nl(str)))
      {
        ab.i("MicroMsg.AppBrandConversionExtension", "this conversation is a app brand contact!");
        paramak.jj("appbrandcustomerservicemsg");
        parambe = ((j)g.K(j.class)).XR().aoZ("appbrandcustomerservicemsg");
        if (parambe == null)
        {
          ab.i("MicroMsg.AppBrandConversionExtension", "create parentConv");
          parambe = new ak("appbrandcustomerservicemsg");
          parambe.dsI();
          a(paramak, parambe);
          ((j)g.K(j.class)).XR().d(parambe);
          AppMethodBeat.o(132729);
        }
        else
        {
          ab.i("MicroMsg.AppBrandConversionExtension", "appBrandSuperConv is created");
          parambe.jj(null);
          a(paramak, parambe);
          ((j)g.K(j.class)).XR().a(parambe, "appbrandcustomerservicemsg");
          AppMethodBeat.o(132729);
        }
      }
      else
      {
        if (t.nH(str))
        {
          ab.i("MicroMsg.AppBrandConversionExtension", "appBrandSuperConv is created");
          paramak.jj(null);
        }
        AppMethodBeat.o(132729);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.p.a
 * JD-Core Version:    0.6.2
 */