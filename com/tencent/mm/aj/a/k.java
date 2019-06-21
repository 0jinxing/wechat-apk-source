package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class k extends com.tencent.mm.sdk.e.j<j>
{
  public static final String[] fnj;
  public e bSd;
  final l<k.a, k.a.b> fuL;
  Map<String, String> fxs;

  static
  {
    AppMethodBeat.i(11605);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(j.ccO, "BizChatUserInfo") };
    AppMethodBeat.o(11605);
  }

  public k(e parame)
  {
    super(parame, j.ccO, "BizChatUserInfo", null);
    AppMethodBeat.i(11595);
    this.fxs = new HashMap();
    this.fuL = new k.1(this);
    this.bSd = parame;
    parame.hY("BizChatUserInfo", "CREATE INDEX IF NOT EXISTS bizUserIdIndex ON BizChatUserInfo ( userId )");
    this.fxs.clear();
    AppMethodBeat.o(11595);
  }

  public static String a(String[] paramArrayOfString, List<String> paramList)
  {
    AppMethodBeat.i(11603);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      paramArrayOfString = "";
      AppMethodBeat.o(11603);
    }
    while (true)
    {
      return paramArrayOfString;
      StringBuilder localStringBuilder = new StringBuilder(" 1=1 ");
      String str = "";
      Object localObject = str;
      if (paramList != null)
      {
        localObject = str;
        if (paramList.size() > 0)
        {
          localObject = paramList.iterator();
          for (paramList = ""; ((Iterator)localObject).hasNext(); paramList = paramList + " and userId != '" + str + "'")
            str = (String)((Iterator)localObject).next();
          localObject = paramList;
        }
      }
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(" and ");
      localStringBuilder.append("userId in(");
      for (int i = 0; i < paramArrayOfString.length; i++)
      {
        if (i > 0)
          localStringBuilder.append(" , ");
        localStringBuilder.append(" '").append(paramArrayOfString[i]).append("' ");
      }
      localStringBuilder.append(" )");
      paramArrayOfString = localStringBuilder.toString();
      AppMethodBeat.o(11603);
    }
  }

  public final boolean a(j paramj)
  {
    AppMethodBeat.i(11597);
    ab.d("MicroMsg.BizChatUserInfoStorage", "BizChatUserInfo insert");
    boolean bool;
    if (paramj == null)
    {
      ab.w("MicroMsg.BizChatUserInfoStorage", "insert wrong argument");
      bool = false;
      AppMethodBeat.o(11597);
    }
    while (true)
    {
      return bool;
      bool = super.b(paramj);
      if (bool)
      {
        k.a.b localb = new k.a.b();
        localb.userId = paramj.field_userId;
        localb.fyc = k.a.a.fxY;
        localb.fyd = paramj;
        this.fuL.cF(localb);
        this.fuL.doNotify();
      }
      AppMethodBeat.o(11597);
    }
  }

  public final boolean b(j paramj)
  {
    AppMethodBeat.i(11598);
    ab.d("MicroMsg.BizChatUserInfoStorage", "BizChatUserInfo update");
    boolean bool;
    if (paramj == null)
    {
      ab.w("MicroMsg.BizChatUserInfoStorage", "update wrong argument");
      bool = false;
      AppMethodBeat.o(11598);
      return bool;
    }
    if ((paramj == null) || (bo.isNullOrNil(paramj.field_userName)))
      ab.i("MicroMsg.BizChatUserInfoStorage", "dealWithChatNamePY null");
    while (true)
    {
      bool = super.a(paramj);
      if (bool)
      {
        k.a.b localb = new k.a.b();
        localb.userId = paramj.field_userId;
        localb.fyc = k.a.a.fya;
        localb.fyd = paramj;
        this.fuL.cF(localb);
        this.fuL.doNotify();
      }
      AppMethodBeat.o(11598);
      break;
      paramj.field_userNamePY = com.tencent.mm.platformtools.g.vo(paramj.field_userName);
    }
  }

  public final void c(j paramj)
  {
    AppMethodBeat.i(11602);
    ab.i("MicroMsg.BizChatUserInfoStorage", "updateUserName");
    j localj = cH(paramj.field_userId);
    if (localj != null)
    {
      if ((bo.isNullOrNil(paramj.field_userName)) || (paramj.field_userName.equals(localj.field_userName)))
        break label77;
      localj.field_userName = paramj.field_userName;
      b(localj);
      AppMethodBeat.o(11602);
    }
    while (true)
    {
      return;
      a(paramj);
      label77: AppMethodBeat.o(11602);
    }
  }

  public final j cH(String paramString)
  {
    AppMethodBeat.i(11596);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.BizChatUserInfoStorage", "get  wrong argument");
      paramString = null;
      AppMethodBeat.o(11596);
    }
    while (true)
    {
      return paramString;
      j localj = new j();
      localj.field_userId = paramString;
      super.b(localj, new String[0]);
      AppMethodBeat.o(11596);
      paramString = localj;
    }
  }

  public final String cI(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(11601);
    if (paramString == null)
    {
      ab.i("MicroMsg.BizChatUserInfoStorage", "getMyUserId brandUserName is null");
      AppMethodBeat.o(11601);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      ab.i("MicroMsg.BizChatUserInfoStorage", "getMyUserId:%s", new Object[] { paramString });
      if ((this.fxs.containsKey(paramString)) && (this.fxs.get(paramString) != null))
      {
        paramString = (String)this.fxs.get(paramString);
        AppMethodBeat.o(11601);
      }
      else
      {
        f localf = z.aeW().rA(paramString);
        if (localf != null)
        {
          ab.d("MicroMsg.BizChatUserInfoStorage", "getMyUserId bizChatMyUserInfo brandUserName:%s,%s", new Object[] { paramString, localf.field_userId });
          this.fxs.put(paramString, localf.field_userId);
          paramString = localf.field_userId;
          AppMethodBeat.o(11601);
        }
        else
        {
          ab.w("MicroMsg.BizChatUserInfoStorage", "getMyUserId bizChatMyUserInfo == null brandUserName:%s", new Object[] { paramString });
          AppMethodBeat.o(11601);
          paramString = localObject;
        }
      }
    }
  }

  public final int rC(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(11599);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.BizChatUserInfoStorage", "getBizChatVersion wrong argument");
      AppMethodBeat.o(11599);
    }
    while (true)
    {
      return i;
      paramString = cH(paramString);
      if (paramString != null)
      {
        i = paramString.field_UserVersion;
        AppMethodBeat.o(11599);
      }
      else
      {
        ab.w("MicroMsg.BizChatUserInfoStorage", "getBizChatVersion item == null");
        AppMethodBeat.o(11599);
      }
    }
  }

  public final j rD(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(11600);
    if (paramString == null)
    {
      ab.i("MicroMsg.BizChatUserInfoStorage", "getMyUserInfo brandUserName is null");
      AppMethodBeat.o(11600);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = cI(paramString);
      if (paramString == null)
      {
        ab.i("MicroMsg.BizChatUserInfoStorage", "getMyUserInfo myUserIdString is null");
        AppMethodBeat.o(11600);
        paramString = localObject;
      }
      else
      {
        paramString = cH(paramString);
        AppMethodBeat.o(11600);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.k
 * JD-Core Version:    0.6.2
 */