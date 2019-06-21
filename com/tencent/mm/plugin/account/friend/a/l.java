package com.tencent.mm.plugin.account.friend.a;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class l
{
  private static Map<String, String> gvw = null;

  public static boolean a(String paramString, Context paramContext, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108371);
    boolean bool = com.tencent.mm.pluginsdk.a.b(paramString, paramContext, paramArrayOfByte);
    AppMethodBeat.o(108371);
    return bool;
  }

  public static void apP()
  {
    AppMethodBeat.i(108363);
    g.RP().Ry().set(12322, Boolean.TRUE);
    AppMethodBeat.o(108363);
  }

  public static boolean apQ()
  {
    AppMethodBeat.i(108364);
    boolean bool;
    if ((g.RP() != null) && (g.RP().Ry() != null))
    {
      bool = bo.a((Boolean)g.RP().Ry().get(12322, Boolean.TRUE), true);
      AppMethodBeat.o(108364);
    }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.FriendLogic", "[arthurdan.UploadPhone] Notice!!!! MMKernel.storage() is null!!!");
      bool = false;
      AppMethodBeat.o(108364);
    }
  }

  public static boolean apR()
  {
    AppMethodBeat.i(108365);
    l.a locala = apS();
    ab.i("MicroMsg.FriendLogic", "isTipInMobileFriend, state %s", new Object[] { locala.toString() });
    boolean bool;
    if (locala == l.a.gvz)
    {
      bool = bo.a((Boolean)g.RP().Ry().get(12322, Boolean.FALSE), false);
      ab.i("MicroMsg.FriendLogic", "USERINFO_UPLOAD_ADDR_LOOK_UP %B", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        AppMethodBeat.o(108365);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(108365);
      bool = false;
      continue;
      AppMethodBeat.o(108365);
      bool = false;
    }
  }

  public static l.a apS()
  {
    AppMethodBeat.i(108366);
    try
    {
      Object localObject1 = (String)g.RP().Ry().get(4097, "");
      String str = (String)g.RP().Ry().get(6, "");
      boolean bool = r.Zc();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("isUpload ");
      ab.i("MicroMsg.FriendLogic", bool + " stat " + r.YD());
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((String)localObject1).length() > 0);
      }
      else
      {
        localObject2 = null;
      }
      if (str != null)
      {
        localObject1 = str;
        if (str.length() > 0);
      }
      else
      {
        localObject1 = null;
      }
      if ((localObject2 == null) && (localObject1 == null))
      {
        localObject2 = l.a.gvx;
        AppMethodBeat.o(108366);
      }
      while (true)
      {
        return localObject2;
        if ((localObject2 != null) && (localObject1 == null))
        {
          localObject2 = l.a.gvy;
          AppMethodBeat.o(108366);
        }
        else if (bool)
        {
          localObject2 = l.a.gvz;
          AppMethodBeat.o(108366);
        }
        else
        {
          localObject2 = l.a.gvA;
          AppMethodBeat.o(108366);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        l.a locala = l.a.gvx;
        AppMethodBeat.o(108366);
      }
    }
  }

  public static void apT()
  {
    AppMethodBeat.i(108367);
    g.RP().Ry().set(4097, "");
    g.RP().Ry().set(6, "");
    AppMethodBeat.o(108367);
  }

  public static String apU()
  {
    AppMethodBeat.i(108368);
    String str = (String)g.RP().Ry().get(6, "");
    AppMethodBeat.o(108368);
    return str;
  }

  public static boolean apV()
  {
    boolean bool1 = false;
    AppMethodBeat.i(108369);
    boolean bool2 = g.RK();
    if (!bool2)
    {
      ab.i("MicroMsg.FriendLogic", "canSyncAddrBook isAccHasReady: %b", new Object[] { Boolean.valueOf(bool2) });
      AppMethodBeat.o(108369);
    }
    while (true)
    {
      return bool1;
      if (apS() == l.a.gvz);
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label85;
        ab.i("MicroMsg.FriendLogic", "canSyncAddrBook userBindOpMobile: %b", new Object[] { Boolean.FALSE });
        AppMethodBeat.o(108369);
        break;
      }
      label85: bool2 = apQ();
      if (!bool2)
      {
        ab.i("MicroMsg.FriendLogic", "canSyncAddrBook isUploadContact: %b", new Object[] { Boolean.valueOf(bool2) });
        AppMethodBeat.o(108369);
      }
      else
      {
        AppMethodBeat.o(108369);
        bool1 = true;
      }
    }
  }

  public static boolean apW()
  {
    return true;
  }

  public static void apX()
  {
  }

  public static void apY()
  {
    AppMethodBeat.i(108372);
    b localb = (b)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg();
    int i = localb.fni.delete("addr_upload2", null, null);
    ab.d("MicroMsg.AddrUploadStorage", "delete addr_upload2");
    if (i > 0)
      localb.b(5, localb, null);
    AppMethodBeat.o(108372);
  }

  public static void apZ()
  {
    AppMethodBeat.i(108373);
    HashSet localHashSet = new HashSet();
    Iterator localIterator = ((ArrayList)((j)g.K(j.class)).bOq().bOw()).iterator();
    while (localIterator.hasNext())
    {
      localObject = (ax)localIterator.next();
      bi.a locala = ((j)g.K(j.class)).bOr().Rn(((ax)localObject).field_msgContent);
      if ((locala != null) && ((locala.scene == 10) || (locala.scene == 11)))
        localHashSet.add(((ax)localObject).field_talker);
    }
    ab.d("MicroMsg.FriendLogic", "deleteMobileFMessage, delete fmsg and fconv, talker size = " + localHashSet.size());
    Object localObject = localHashSet.iterator();
    while (((Iterator)localObject).hasNext())
      we((String)((Iterator)localObject).next());
    AppMethodBeat.o(108373);
  }

  public static List<String> aqa()
  {
    AppMethodBeat.i(108379);
    Cursor localCursor = ((b)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).fni.a("select addr_upload2.md5 from addr_upload2 where addr_upload2.uploadtime = 0 AND addr_upload2.type = 1", null, 2);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
      localArrayList.add(localCursor.getString(0));
    localCursor.close();
    AppMethodBeat.o(108379);
    return localArrayList;
  }

  public static List<String> aqb()
  {
    AppMethodBeat.i(108380);
    Cursor localCursor = ((b)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).fni.a("select addr_upload2.moblie from addr_upload2 where addr_upload2.uploadtime = 0 AND addr_upload2.type = 0", null, 2);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
    {
      String str = com.tencent.mm.pluginsdk.a.ws(localCursor.getString(0));
      if (com.tencent.mm.pluginsdk.a.aij(str))
        localArrayList.add(str);
    }
    localCursor.close();
    AppMethodBeat.o(108380);
    return localArrayList;
  }

  public static void ar(List<String> paramList)
  {
    AppMethodBeat.i(108375);
    if (paramList.size() == 0)
      AppMethodBeat.o(108375);
    while (true)
    {
      return;
      HashSet localHashSet = new HashSet();
      Iterator localIterator = ((ArrayList)((j)g.K(j.class)).bOq().bOw()).iterator();
      while (localIterator.hasNext())
      {
        ax localax = (ax)localIterator.next();
        bi.a locala = ((j)g.K(j.class)).bOr().Rn(localax.field_msgContent);
        if (locala != null)
        {
          String str1 = locala.xZj;
          String str2 = locala.xZi;
          if (((locala.scene == 10) || (locala.scene == 11)) && ((paramList.contains(str1)) || (paramList.contains(str2))))
            localHashSet.add(localax.field_talker);
        }
      }
      ab.d("MicroMsg.FriendLogic", "deleteMobileFMessage(md5List), delete fmsg and fconv, talker size = " + localHashSet.size());
      paramList = localHashSet.iterator();
      while (paramList.hasNext())
        we((String)paramList.next());
      AppMethodBeat.o(108375);
    }
  }

  public static void as(List<a> paramList)
  {
    AppMethodBeat.i(108377);
    if (paramList == null)
    {
      ab.e("MicroMsg.FriendLogic", "sync address book failed, null info list");
      AppMethodBeat.o(108377);
    }
    while (true)
    {
      return;
      ((b)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).aa(paramList);
      AppMethodBeat.o(108377);
    }
  }

  public static void at(List<String> paramList)
  {
    AppMethodBeat.i(108378);
    if (paramList == null)
    {
      ab.e("MicroMsg.FriendLogic", "set uploaded mobile contact failed, null info list");
      AppMethodBeat.o(108378);
    }
    while (true)
    {
      return;
      ((b)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).aq(paramList);
      AppMethodBeat.o(108378);
    }
  }

  public static Bitmap b(String paramString, Context paramContext)
  {
    AppMethodBeat.i(108370);
    paramString = com.tencent.mm.pluginsdk.a.a(paramString, paramContext, false);
    AppMethodBeat.o(108370);
    return paramString;
  }

  public static boolean mX(int paramInt)
  {
    AppMethodBeat.i(108381);
    am localam = ((an)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg()).mY(paramInt);
    boolean bool = ((ap)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).mZ(paramInt);
    if (localam == null)
    {
      AppMethodBeat.o(108381);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((localam.gwz == 1) || (bool))
      {
        AppMethodBeat.o(108381);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(108381);
        bool = false;
      }
    }
  }

  private static void we(String paramString)
  {
    AppMethodBeat.i(108374);
    ab.i("MicroMsg.FriendLogic", "clearFMsgAndFConvByTalker, rowId: %d, talker: %s", new Object[] { Long.valueOf(0L), paramString });
    ab.i("MicroMsg.FriendLogic", "clearFMsgAndFConvByTalker, delete fconversation, ret = ".concat(String.valueOf(((j)g.K(j.class)).bOp().p(0L, paramString))));
    ab.i("MicroMsg.FriendLogic", "clearFMsgAndFConvByTalker, delete fmsginfo, ret = ".concat(String.valueOf(((j)g.K(j.class)).bOq().QS(paramString))));
    AppMethodBeat.o(108374);
  }

  public static String wf(String paramString)
  {
    AppMethodBeat.i(108376);
    if ((paramString == null) || (paramString.equals("")))
    {
      paramString = "";
      AppMethodBeat.o(108376);
    }
    while (true)
    {
      return paramString;
      Object localObject = (b)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg();
      paramString = "select addr_upload2.realname from addr_upload2 where addr_upload2.id = \"" + a.vR(paramString) + "\"";
      localObject = ((b)localObject).fni.a(paramString, null, 2);
      if (localObject == null)
      {
        paramString = "";
        AppMethodBeat.o(108376);
      }
      else
      {
        paramString = "";
        if (((Cursor)localObject).moveToFirst())
          paramString = ((Cursor)localObject).getString(0);
        ((Cursor)localObject).close();
        AppMethodBeat.o(108376);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.l
 * JD-Core Version:    0.6.2
 */