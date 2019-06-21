package com.tencent.mm.ah;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

final class c$c
  implements az.a
{
  Bitmap fru = null;
  String username = null;

  public c$c(c paramc, String paramString)
  {
    this.username = paramString;
  }

  public final boolean acf()
  {
    Context localContext = null;
    Object localObject1 = null;
    int i = 0;
    AppMethodBeat.i(77858);
    boolean bool;
    if (bo.isNullOrNil(this.username))
    {
      AppMethodBeat.o(77858);
      bool = false;
    }
    while (true)
    {
      return bool;
      String str1 = this.username;
      label46: String str2;
      Object localObject2;
      if (str1 == null)
      {
        bool = false;
        if (bool)
        {
          str2 = (String)this.frl.frj.get(str1);
          if (!bo.isNullOrNil(str2))
          {
            localObject2 = o.act().qo(str1);
            if ((localObject2 == null) || (!str1.equals(((h)localObject2).getUsername())))
            {
              i locali = o.act();
              localObject2 = "select img_flag.username,img_flag.imgflag,img_flag.lastupdatetime,img_flag.reserved1,img_flag.reserved2,img_flag.reserved3,img_flag.reserved4 from img_flag where img_flag.reserved2=\"" + bo.vA(str2) + "\"";
              localObject2 = locali.fni.a((String)localObject2, null, 2);
              if (localObject2 != null)
                break label273;
            }
          }
        }
      }
      while (true)
      {
        if ((localObject1 != null) && (!bo.isNullOrNil(((h)localObject1).getUsername())))
          com.tencent.mm.vfs.e.y(b.pX(((h)localObject1).getUsername()), b.pX(str1));
        localObject1 = new h();
        ((h)localObject1).username = str1;
        ((h)localObject1).dtR = 3;
        ((h)localObject1).frV = str2;
        ((h)localObject1).frW = str2;
        ((h)localObject1).bJt = 3;
        ((h)localObject1).cB(true);
        ((h)localObject1).bJt = 31;
        o.act().b((h)localObject1);
        localObject1 = c.acd();
        if (localObject1 != null)
          break label317;
        AppMethodBeat.o(77858);
        bool = false;
        break;
        bool = str1.startsWith("ammURL_");
        break label46;
        label273: localObject1 = localContext;
        if (((Cursor)localObject2).moveToFirst())
        {
          ((Cursor)localObject2).moveToFirst();
          localObject1 = new h();
          ((h)localObject1).d((Cursor)localObject2);
        }
        ((Cursor)localObject2).close();
      }
      label317: if (d.frx.containsKey(this.username))
        i = ((Integer)d.frx.get(this.username)).intValue();
      if (i != 0)
      {
        o.acs();
        localContext = o.getContext();
        if (localContext != null)
          ((d)localObject1).f(this.username, a.decodeResource(localContext.getResources(), i));
      }
      this.fru = d.qf(this.username);
      AppMethodBeat.o(77858);
      bool = true;
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(77859);
    c localc;
    String str;
    Object localObject;
    if (this.fru == null)
    {
      localc = this.frl;
      str = this.username;
      ab.d("MicroMsg.AvatarService", "avatar service push: %s", new Object[] { str });
      if (bo.isNullOrNil(str))
      {
        localObject = null;
        if (localObject != null)
          break label459;
        localc.frd.remove(str);
        label61: AppMethodBeat.o(77859);
      }
    }
    while (true)
    {
      return false;
      if ((str.equals(localc.fri + "@bottle")) && (!bo.a((Boolean)g.RP().Ry().get(60, null), false)))
      {
        localObject = null;
        break;
      }
      if ((str.equals(localc.fri)) && (!bo.a((Boolean)g.RP().Ry().get(59, null), false)))
      {
        ab.w("MicroMsg.AvatarService", "ConstantsStorage.USERINFO_HAS_HEADIMG false");
        localObject = null;
        break;
      }
      long l = bo.anT();
      c.d locald = (c.d)localc.fre.ai(str);
      if ((locald != null) && (locald.eRu >= 5) && (l - locald.eRt < 600L))
      {
        ab.w("MicroMsg.AvatarService", "checkUser block by recentdown: %s", new Object[] { str });
        localObject = null;
        break;
      }
      localObject = c.qb(str);
      if (localObject == null)
      {
        ab.w("MicroMsg.AvatarService", "checkUser block local no need: %s", new Object[] { str });
        localObject = new c.d((byte)0);
        ((c.d)localObject).eRu = 5;
        ((c.d)localObject).eRt = l;
        localc.fre.k(str, localObject);
        localObject = null;
        break;
      }
      if ((locald == null) || (l - locald.eRt > 600L))
      {
        ab.d("MicroMsg.AvatarService", "new user: %s", new Object[] { str });
        locald = new c.d((byte)0);
        locald.eRu = 1;
        locald.eRt = l;
        localc.fre.k(str, locald);
      }
      while (true)
      {
        break;
        if (locald.eRu < 5)
        {
          ab.d("MicroMsg.AvatarService", "checkUser: %s tryCount: %d time: %d", new Object[] { str, Integer.valueOf(locald.eRu), Long.valueOf(l - locald.eRt) });
          locald.eRu += 1;
          locald.eRt = l;
          localc.fre.k(str, locald);
        }
      }
      label459: if (!bo.isNullOrNil(((h)localObject).acl()))
      {
        localc.a(new c.b(localc, (h)localObject));
        break label61;
      }
      ab.w("MicroMsg.AvatarService", "dkhurl [%s] has NO URL flag:%d !", new Object[] { str, Integer.valueOf(((h)localObject).dtR) });
      if (4 == ((h)localObject).dtR)
      {
        ab.w("MicroMsg.AvatarService", "no avatar, do not batch get head image");
        break label61;
      }
      localc.frf.push(localObject);
      if (localc.frf.size() > 5)
      {
        localc.frk.ae(0L, 0L);
        break label61;
      }
      localc.frk.ae(1000L, 1000L);
      break label61;
      localObject = c.acd();
      if (localObject != null)
        ((d)localObject).e(this.username, this.fru);
      this.frl.frd.remove(this.username);
      AppMethodBeat.o(77859);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.c.c
 * JD-Core Version:    0.6.2
 */