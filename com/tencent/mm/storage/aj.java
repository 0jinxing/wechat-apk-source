package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.d;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.memory.a.c;
import com.tencent.mm.model.t;
import com.tencent.mm.n.a;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class aj extends n
  implements bd
{
  public static final String[] diI;
  public static final String[] fnj;
  private static String xXn;
  private static String xXo;
  private com.tencent.mm.sdk.e.e bSd;
  private final l<bd.a, ad> fuL;
  private com.tencent.mm.sdk.e.e xXk;
  public final com.tencent.mm.a.f<String, ad> xXl;
  public final com.tencent.mm.a.f<String, Integer> xXm;

  static
  {
    AppMethodBeat.i(1192);
    fnj = new String[] { j.a(ad.ccO, "rcontact"), j.a(ad.ccO, "bottlecontact"), j.a(ae.ccO, "ContactCmdBuf"), "CREATE TABLE IF NOT EXISTS contact ( contactID INTEGER PRIMARY KEY, sex INT, type INT, showHead INT, username VARCHAR(40), nickname VARCHAR(40), pyInitial VARCHAR(40), quanPin VARCHAR(60), reserved TEXT );", "CREATE TABLE IF NOT EXISTS contact_ext ( username VARCHAR(40), Uin INTEGER DEFAULT 0, Email VARCHAR(128), Mobile VARCHAR(40), ShowFlag INTEGER DEFAULT 0 , ConType INTEGER DEFAULT 0 , ConRemark TEXT, ConRemark_PYShort TEXT, ConRemark_PYFull TEXT, ConQQMBlog TEXT, ConSMBlog TEXT, DomainList TEXT, reserved1 INT DEFAULT 0 , reserved2 INT DEFAULT 0 , reserved3 INT DEFAULT 0 , reserved4 INT DEFAULT 0 , reserved5 INT DEFAULT 0 , reserved6 TEXT, reserved7 TEXT, reserved8 TEXT, reserved9 TEXT, reserved10 TEXT, weiboflag  INT DEFAULT 0 ,weibonickname TEXT  );" };
    diI = new String[] { "CREATE UNIQUE INDEX IF NOT EXISTS  contact_username_unique_index ON rcontact ( username )", "CREATE INDEX IF NOT EXISTS  contact_alias_index ON rcontact ( alias )", "CREATE INDEX IF NOT EXISTS  en_username_unique_index ON rcontact ( encryptUsername )", "CREATE UNIQUE INDEX IF NOT EXISTS  bottle_username_unique_index ON bottlecontact ( username )", "CREATE INDEX IF NOT EXISTS type_verifyFlag_index ON rcontact ( type,verifyFlag ) " };
    xXn = "showHead = 32";
    xXo = "type & 64 !=0 ";
    AppMethodBeat.o(1192);
  }

  public aj(h paramh)
  {
    AppMethodBeat.i(1106);
    this.xXl = new c(200);
    this.xXm = new c(400);
    this.fuL = new aj.1(this);
    Object localObject = paramh.a("PRAGMA table_info( contact_ext )", null, 2);
    int k = ((Cursor)localObject).getColumnIndex("name");
    int m = 0;
    int n = 0;
    while ((((Cursor)localObject).moveToNext()) && ((n == 0) || (m == 0)))
      if (k >= 0)
      {
        String str = ((Cursor)localObject).getString(k);
        if ("weiboNickname".equalsIgnoreCase(str))
          m = 1;
        else if ("weiboFlag".equalsIgnoreCase(str))
          n = 1;
      }
    ((Cursor)localObject).close();
    if (n == 0)
      paramh.hY("contact_ext", "Alter table contact_ext add weiboFlag INT DEFAULT 0 ");
    if (m == 0)
      paramh.hY("contact_ext", "Alter table contact_ext add weiboNickname INT DEFAULT 0 ");
    localObject = paramh.a("PRAGMA table_info( rcontact )", null, 2);
    n = ((Cursor)localObject).getColumnIndex("name");
    do
      if (!((Cursor)localObject).moveToNext())
        break;
    while ((n < 0) || (!"verifyFlag".equalsIgnoreCase(((Cursor)localObject).getString(n))));
    for (n = i; ; n = 0)
    {
      ((Cursor)localObject).close();
      if (n == 0)
        paramh.hY("rcontact", "Alter table rcontact add verifyFlag INT DEFAULT 0 ");
      localObject = j.a(a.ccO, "bottlecontact", paramh).iterator();
      while (((Iterator)localObject).hasNext())
        paramh.hY("bottlecontact", (String)((Iterator)localObject).next());
      localObject = j.a(a.ccO, "rcontact", paramh).iterator();
      while (((Iterator)localObject).hasNext())
        paramh.hY("rcontact", (String)((Iterator)localObject).next());
      localObject = diI;
      m = localObject.length;
      for (n = j; n < m; n++)
        paramh.hY("rcontact", localObject[n]);
      this.bSd = paramh;
      this.xXk = paramh;
      AppMethodBeat.o(1106);
      return;
    }
  }

  private void MQ(String paramString)
  {
    AppMethodBeat.i(1111);
    if (!bo.isNullOrNil(paramString))
    {
      this.xXl.remove(paramString);
      this.xXm.remove(paramString);
    }
    AppMethodBeat.o(1111);
  }

  private static String S(String[] paramArrayOfString)
  {
    AppMethodBeat.i(1170);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      paramArrayOfString = "";
      AppMethodBeat.o(1170);
    }
    while (true)
    {
      return paramArrayOfString;
      String str1 = " and (";
      for (int i = 0; i < paramArrayOfString.length; i++)
      {
        String str2 = str1;
        if (i > 0)
          str2 = str1 + " or ";
        str1 = str2 + "username = '" + paramArrayOfString[i] + "' ";
      }
      paramArrayOfString = str1 + " )";
      AppMethodBeat.o(1170);
    }
  }

  private static String a(String paramString1, List<String> paramList1, String paramString2, List<String> paramList2)
  {
    AppMethodBeat.i(1117);
    paramString1 = paramString1 + " and OpenIMWordingInfo.language='" + paramString2 + "' ";
    String str = paramString1 + dsE();
    paramString2 = "";
    paramString1 = paramString2;
    if (paramList2 != null)
    {
      paramString1 = paramString2;
      if (paramList2.size() > 0)
      {
        paramString2 = paramList2.iterator();
        paramString1 = "";
        if (paramString2.hasNext())
        {
          paramList2 = (String)paramString2.next();
          if (paramString1.equals(""));
          for (paramString1 = paramString1 + " and ("; ; paramString1 = paramString1 + " or ")
          {
            paramString1 = paramString1 + "openImAppid == '" + paramList2 + "'";
            break;
          }
        }
        paramString1 = paramString1 + " )";
      }
    }
    paramList2 = str + paramString1;
    paramString2 = "";
    paramString1 = paramString2;
    if (paramList1 != null)
    {
      paramString1 = paramString2;
      if (paramList1.size() > 0)
      {
        paramList1 = paramList1.iterator();
        for (paramString1 = ""; paramList1.hasNext(); paramString1 = paramString1 + " and username != '" + paramString2 + "'")
          paramString2 = (String)paramList1.next();
      }
    }
    paramString1 = paramList2 + paramString1;
    ab.v("MicroMsg.ContactStorage", "getOpenIMCursor:%s", new Object[] { paramString1 });
    AppMethodBeat.o(1117);
    return paramString1;
  }

  private static boolean ab(ad paramad)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(1189);
    if (paramad == null)
    {
      AppMethodBeat.o(1189);
      return bool2;
    }
    int i = paramad.versionCode;
    if (i <= 0);
    for (bool2 = bool1; ; bool2 = true)
    {
      ab.d("MicroMsg.ContactStorage", "it need to update contact: " + bool2 + " version code : " + i + " user: " + paramad.field_username);
      AppMethodBeat.o(1189);
      break;
    }
  }

  private static String ae(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(1175);
    String str1 = "type & " + a.NS() + "!=0";
    String str2 = str1;
    if (paramBoolean1)
      str2 = str1 + " or type & " + a.NV() + "!=0";
    str2 = " where (" + str2 + ")";
    str2 = str2 + " and type & " + a.NW() + "=0 ";
    str1 = str2 + " and type & " + a.NT() + " =0 ";
    str2 = str1;
    if (!paramBoolean2)
      str2 = str1 + " and verifyFlag & " + ad.dsh() + " =0 ";
    AppMethodBeat.o(1175);
    return str2;
  }

  private static String aoG(String paramString)
  {
    AppMethodBeat.i(1104);
    paramString = "select *,rowid from " + aoH(paramString) + " ";
    AppMethodBeat.o(1104);
    return paramString;
  }

  private static String aoH(String paramString)
  {
    AppMethodBeat.i(1105);
    if (ad.mR(paramString))
    {
      paramString = "bottlecontact";
      AppMethodBeat.o(1105);
    }
    while (true)
    {
      return paramString;
      paramString = "rcontact";
      AppMethodBeat.o(1105);
    }
  }

  private static String dsA()
  {
    AppMethodBeat.i(1177);
    String str = "type & " + a.NS() + "!=0";
    str = " where (" + str + ") and ";
    str = str + "type & " + a.NW() + "=0  ";
    AppMethodBeat.o(1177);
    return str;
  }

  private static String dsB()
  {
    AppMethodBeat.i(1178);
    String str = "type & " + a.NS() + "!=0";
    str = "( (" + str + ") and type & " + a.NT() + "=0 and (username like '%@chatroom') or (username like '%@im.chatroom'))";
    AppMethodBeat.o(1178);
    return str;
  }

  private static String dsC()
  {
    AppMethodBeat.i(1179);
    String str = "type & " + a.NS() + "!=0";
    str = "( (" + str + ") and type & " + a.NT() + "=0 and username like '%@talkroom')";
    AppMethodBeat.o(1179);
    return str;
  }

  private static String dsD()
  {
    AppMethodBeat.i(1180);
    String str = "type & " + a.NT() + "=0 and username like '%@openim'";
    AppMethodBeat.o(1180);
    return str;
  }

  private static String dsE()
  {
    AppMethodBeat.i(1181);
    String str = dsA() + " and " + dsD();
    AppMethodBeat.o(1181);
    return str;
  }

  private static String dsx()
  {
    AppMethodBeat.i(1172);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(" order by showHead asc, ");
    ((StringBuffer)localObject).append(" case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull) ");
    ((StringBuffer)localObject).append(" else upper(quanPin) end asc, ");
    ((StringBuffer)localObject).append(" case when length(conRemark) > 0 then upper(conRemark) ");
    ((StringBuffer)localObject).append(" else upper(quanPin) end asc, ");
    ((StringBuffer)localObject).append(" upper(quanPin) asc, ");
    ((StringBuffer)localObject).append(" upper(nickname) asc, ");
    ((StringBuffer)localObject).append(" upper(username) asc ");
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(1172);
    return localObject;
  }

  private static String dsy()
  {
    AppMethodBeat.i(1174);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(" order by case when verifyFlag & " + ad.dsh() + " != 0 then 0 else 1 end , showHead asc, ");
    ((StringBuffer)localObject).append(" case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull) ");
    ((StringBuffer)localObject).append(" else upper(quanPin) end asc, ");
    ((StringBuffer)localObject).append(" case when length(conRemark) > 0 then upper(conRemark) ");
    ((StringBuffer)localObject).append(" else upper(quanPin) end asc, ");
    ((StringBuffer)localObject).append(" upper(quanPin) asc, ");
    ((StringBuffer)localObject).append(" upper(nickname) asc, ");
    ((StringBuffer)localObject).append(" upper(username) asc ");
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(1174);
    return localObject;
  }

  private static String dsz()
  {
    AppMethodBeat.i(1176);
    String str = "type & " + a.NS() + " !=0 ";
    str = " where (" + str + ") and ";
    str = str + "type & " + a.NW() + " =0 and ";
    str = str + "type & " + a.NT() + " =0";
    AppMethodBeat.o(1176);
    return str;
  }

  private static String eH(List<String> paramList)
  {
    AppMethodBeat.i(1183);
    Object localObject = ae(false, false) + " AND " + xXo;
    String str1 = (String)localObject + " and ( username not like '%@openim')";
    String str2 = "";
    localObject = str2;
    if (paramList != null)
    {
      localObject = str2;
      if (paramList.size() > 0)
      {
        localObject = paramList.iterator();
        for (paramList = ""; ((Iterator)localObject).hasNext(); paramList = paramList + " AND username != '" + str2 + "'")
          str2 = (String)((Iterator)localObject).next();
        localObject = paramList;
      }
    }
    paramList = str1 + (String)localObject;
    AppMethodBeat.o(1183);
    return paramList;
  }

  private static String ey(List<String> paramList)
  {
    AppMethodBeat.i(1149);
    if ((paramList == null) || (paramList.size() == 0))
    {
      paramList = "";
      AppMethodBeat.o(1149);
    }
    while (true)
    {
      return paramList;
      StringBuilder localStringBuilder = new StringBuilder();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        localStringBuilder.append(" or username = '").append(str).append("'");
      }
      paramList = localStringBuilder.toString();
      AppMethodBeat.o(1149);
    }
  }

  private static String ez(List<String> paramList)
  {
    AppMethodBeat.i(1151);
    String str = ey(paramList);
    int i = str.indexOf("or");
    paramList = str;
    if (i <= 2)
      paramList = str.substring(i + 2);
    AppMethodBeat.o(1151);
    return paramList;
  }

  private static String l(List<String> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(1182);
    String str1 = ae(false, paramBoolean) + " AND " + xXo;
    String str2 = "";
    Object localObject = str2;
    if (paramList != null)
    {
      localObject = str2;
      if (paramList.size() > 0)
      {
        localObject = paramList.iterator();
        for (paramList = ""; ((Iterator)localObject).hasNext(); paramList = paramList + " AND username != '" + str2 + "'")
          str2 = (String)((Iterator)localObject).next();
        localObject = paramList;
      }
    }
    paramList = str1 + (String)localObject;
    AppMethodBeat.o(1182);
    return paramList;
  }

  private static String y(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(1169);
    if ((paramString == null) || (paramString.equals("")))
    {
      paramString = "";
      AppMethodBeat.o(1169);
    }
    while (true)
    {
      return paramString;
      String str = " and (";
      Object localObject = str;
      if (paramList != null)
      {
        localObject = str;
        if (paramList.size() != 0)
        {
          localObject = paramList.iterator();
          for (paramList = " and ("; ((Iterator)localObject).hasNext(); paramList = paramList + "username = '" + str + "' or ")
            str = (String)((Iterator)localObject).next();
          localObject = paramList;
        }
      }
      paramList = (String)localObject + "conRemark like '%" + paramString + "%' or ";
      paramList = paramList + "conRemarkPYFull like '%" + paramString + "%' or ";
      paramList = paramList + "conRemarkPYShort like '%" + paramString + "%' or ";
      paramList = paramList + "alias like '%" + paramString + "%' or ";
      paramList = paramList + "username like '%" + paramString + "%' or ";
      paramList = paramList + "nickname like '%" + paramString + "%' or ";
      paramList = paramList + "pyInitial like '%" + paramString + "%' or ";
      paramString = paramList + "quanPin like '%" + paramString + "%' )";
      AppMethodBeat.o(1169);
    }
  }

  public final int F(String paramString, byte[] paramArrayOfByte)
  {
    int i = -1;
    AppMethodBeat.i(1135);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.ContactStorage", "getCmdbuf failed user is null");
      AppMethodBeat.o(1135);
      return i;
    }
    ae localae = new ae();
    localae.field_cmdbuf = paramArrayOfByte;
    localae.field_username = paramString;
    int j = (int)this.bSd.replace("ContactCmdBuf", "username", localae.Hl());
    if (paramArrayOfByte == null);
    while (true)
    {
      ab.d("MicroMsg.ContactStorage", "setCmdbuf user:%s buf:%d result:%d", new Object[] { paramString, Integer.valueOf(i), Integer.valueOf(j) });
      AppMethodBeat.o(1135);
      i = j;
      break;
      i = paramArrayOfByte.length;
    }
  }

  public final void W(ad paramad)
  {
    AppMethodBeat.i(1110);
    if ((paramad == null) || (paramad.field_username == null) || (paramad.field_type == 0))
      AppMethodBeat.o(1110);
    while (true)
    {
      return;
      this.xXl.k(paramad.field_username, paramad);
      this.xXm.k(paramad.field_username, Integer.valueOf(paramad.field_type));
      AppMethodBeat.o(1110);
    }
  }

  public final boolean X(ad paramad)
  {
    boolean bool = true;
    AppMethodBeat.i(1113);
    if (aoQ(paramad.field_username))
      if (b(paramad.field_username, paramad) == 0)
        AppMethodBeat.o(1113);
    while (true)
    {
      return bool;
      AppMethodBeat.o(1113);
      bool = false;
      continue;
      if (aa(paramad) >= 0)
      {
        AppMethodBeat.o(1113);
      }
      else
      {
        AppMethodBeat.o(1113);
        bool = false;
      }
    }
  }

  public final boolean Y(ad paramad)
  {
    boolean bool1 = true;
    AppMethodBeat.i(1132);
    boolean bool2;
    if (paramad != null)
    {
      bool2 = true;
      Assert.assertTrue("contact NULL !", bool2);
      if (ab(paramad))
        break label43;
      AppMethodBeat.o(1132);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label43: paramad.hu(paramad.Ny());
      this.fuL.cF(paramad);
      this.fuL.doNotify();
      ab.d("MicroMsg.ContactStorage", "replace : username=%s, showHead=%d, verifyFlag=%d", new Object[] { paramad.field_username, Integer.valueOf(paramad.field_showHead), Integer.valueOf(paramad.field_verifyFlag) });
      ContentValues localContentValues = paramad.Hl();
      if ((int)paramad.ewQ > 0)
        localContentValues.put("rowid", Integer.valueOf((int)paramad.ewQ));
      if (this.bSd.replace(aoH(paramad.field_username), a.ccO.xDc, localContentValues) > 0L);
      for (int i = 1; ; i = 0)
      {
        MQ(paramad.field_username);
        if (!bo.isNullOrNil(paramad.field_encryptUsername))
          MQ(paramad.field_encryptUsername);
        if (i != 0)
          break label216;
        AppMethodBeat.o(1132);
        bool2 = false;
        break;
      }
      label216: b(4, this, paramad.field_username);
      AppMethodBeat.o(1132);
      bool2 = bool1;
    }
  }

  public final boolean Z(ad paramad)
  {
    AppMethodBeat.i(1133);
    boolean bool;
    if (aa(paramad) > 0)
    {
      bool = true;
      AppMethodBeat.o(1133);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1133);
    }
  }

  public final Cursor a(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(1115);
    paramString1 = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact " + e(paramString1, paramString2, paramList1) + ey(paramList2) + dsx();
    ab.v("MicroMsg.ContactStorage", paramString1);
    if (paramBoolean1)
    {
      paramString2 = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact " + l(paramList1, paramBoolean2) + dsy();
      ab.v("MicroMsg.ContactStorage", "favourSql ".concat(String.valueOf(paramString1)));
      paramString2 = this.bSd.a(paramString2, null, 4);
      paramString1 = this.bSd.a(paramString1, null, 4);
      if (((paramString2 instanceof com.tencent.mm.cd.a.f)) && ((paramString1 instanceof com.tencent.mm.cd.a.f)))
      {
        paramString1 = new com.tencent.mm.cd.a.e(new com.tencent.mm.cd.a.f[] { (com.tencent.mm.cd.a.f)paramString2, (com.tencent.mm.cd.a.f)paramString1 });
        AppMethodBeat.o(1115);
      }
    }
    while (true)
    {
      return paramString1;
      paramString1 = d.dvo();
      AppMethodBeat.o(1115);
      continue;
      paramString1 = this.bSd.a(paramString1, null, 4);
      AppMethodBeat.o(1115);
    }
  }

  public final Cursor a(List<String> paramList1, String paramString, List<String> paramList2)
  {
    AppMethodBeat.i(1118);
    paramList1 = a("select rcontact.username ,rcontact.nickname ,rcontact.alias,rcontact.conRemark,rcontact.verifyFlag,rcontact.showHead,rcontact.weiboFlag,rcontact.rowid ,rcontact.deleteFlag,rcontact.lvbuff,rcontact.descWordingId, rcontact.openImAppid,  OpenIMWordingInfo.wording, OpenIMWordingInfo.quanpin  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId and rcontact.openImAppid = OpenIMWordingInfo.appid ", paramList1, paramString, paramList2);
    paramList1 = paramList1 + " order by OpenIMWordingInfo.quanpin IS NULL, OpenIMWordingInfo.quanpin ";
    paramList1 = this.bSd.a(paramList1, null, 4);
    AppMethodBeat.o(1118);
    return paramList1;
  }

  public final Cursor a(String[] paramArrayOfString, String paramString1, String paramString2, List<String> paramList1, List<String> paramList2)
  {
    AppMethodBeat.i(1168);
    paramArrayOfString = "select * ,rowid from rcontact " + e(paramString1, paramString2, paramList2) + S(paramArrayOfString) + y(paramString2, paramList1) + dsx();
    ab.i("MicroMsg.ContactStorage", paramArrayOfString);
    paramArrayOfString = this.bSd.rawQuery(paramArrayOfString, null);
    AppMethodBeat.o(1168);
    return paramArrayOfString;
  }

  public final Cursor a(String[] paramArrayOfString, String paramString, List<String> paramList)
  {
    AppMethodBeat.i(1167);
    paramString = "select * ,rowid from rcontact " + e(paramString, null, paramList) + S(paramArrayOfString);
    paramList = paramString;
    if (paramArrayOfString != null)
    {
      paramList = paramString;
      if (paramArrayOfString.length > 0)
      {
        paramString = paramString + " order by 1=1 ";
        int i = paramArrayOfString.length;
        for (int j = 0; ; j++)
        {
          paramList = paramString;
          if (j >= i)
            break;
          paramList = paramArrayOfString[j];
          paramString = paramString + ",username='" + paramList + "' desc";
        }
      }
    }
    ab.v("MicroMsg.ContactStorage", "getSearchCursorByArrOrder sql : ".concat(String.valueOf(paramList)));
    paramArrayOfString = this.bSd.rawQuery(paramList, null);
    AppMethodBeat.o(1167);
    return paramArrayOfString;
  }

  public final void a(bd.a parama)
  {
    AppMethodBeat.i(1107);
    this.fuL.a(parama, null);
    AppMethodBeat.o(1107);
  }

  public final int aa(ad paramad)
  {
    AppMethodBeat.i(1134);
    int i;
    if (bo.nullAsNil(paramad.field_username).length() <= 0)
    {
      ab.e("MicroMsg.ContactStorage", "FATAL ERROR, invalid contact, empty username");
      AppMethodBeat.o(1134);
      i = -1;
    }
    while (true)
    {
      return i;
      paramad.hu(paramad.Ny());
      this.fuL.cF(paramad);
      this.fuL.doNotify();
      Object localObject = paramad.Hl();
      long l = System.currentTimeMillis();
      int j = (int)this.bSd.insert(aoH(paramad.field_username), a.ccO.xDc, (ContentValues)localObject);
      int k = (int)bo.gb(l);
      boolean bool = b.foreground;
      localObject = com.tencent.mm.plugin.report.e.pXa;
      if (bool)
      {
        i = 11;
        label122: if (!bool)
          break label254;
      }
      label254: for (int m = 12; ; m = 15)
      {
        ((com.tencent.mm.plugin.report.e)localObject).d(463, i, m, k, false);
        ab.i("MicroMsg.ContactStorage", "insert : username=%s, showHead=%d, verifyFlag=%d, ret=:%d take[%s]ms fg:%b", new Object[] { paramad.field_username, Integer.valueOf(paramad.field_showHead), Integer.valueOf(paramad.field_verifyFlag), Integer.valueOf(j), Integer.valueOf(k), Boolean.valueOf(bool) });
        if (j == -1)
          break label261;
        paramad.ewQ = j;
        W(paramad);
        b(2, this, paramad.field_username);
        AppMethodBeat.o(1134);
        i = j;
        break;
        i = 14;
        break label122;
      }
      label261: ab.e("MicroMsg.ContactStorage", "insert failed: username=" + paramad.field_username);
      AppMethodBeat.o(1134);
      i = -1;
    }
  }

  public final String aet()
  {
    AppMethodBeat.i(138673);
    String str = dsx();
    AppMethodBeat.o(138673);
    return str;
  }

  public final ad aoI(String paramString)
  {
    AppMethodBeat.i(1109);
    paramString = (ad)this.xXl.ai(paramString);
    if (paramString != null)
      AppMethodBeat.o(1109);
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(1109);
    }
  }

  public final boolean aoJ(String paramString)
  {
    AppMethodBeat.i(1112);
    boolean bool;
    if ((bo.isNullOrNil(paramString)) || ((paramString.contains("@")) && (!paramString.endsWith("@stranger"))))
    {
      AppMethodBeat.o(1112);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = (Integer)this.xXm.get(paramString);
      if (localObject != null)
      {
        bool = a.jh(((Integer)localObject).intValue());
        AppMethodBeat.o(1112);
      }
      else
      {
        localObject = aoO(paramString);
        if ((localObject == null) || ((!((ap)localObject).field_username.equals(paramString)) && (!paramString.equals(((ap)localObject).field_encryptUsername))))
        {
          this.xXm.k(paramString, Integer.valueOf(0));
          AppMethodBeat.o(1112);
          bool = false;
        }
        else
        {
          this.xXm.k(paramString, Integer.valueOf(((ap)localObject).field_type));
          bool = a.jh(((ap)localObject).field_type);
          AppMethodBeat.o(1112);
        }
      }
    }
  }

  public final ad aoK(String paramString)
  {
    ad localad = null;
    AppMethodBeat.i(1114);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(1114);
    for (paramString = localad; ; paramString = localad)
    {
      return paramString;
      localad = new ad();
      paramString = "select *,rowid from rcontact where alias=" + h.escape(paramString);
      paramString = this.bSd.a(paramString, null, 2);
      if (paramString.moveToFirst())
      {
        localad.d(paramString);
        W(localad);
      }
      paramString.close();
      localad.dsk();
      AppMethodBeat.o(1114);
    }
  }

  public final Cursor aoL(String paramString)
  {
    AppMethodBeat.i(1121);
    paramString = this.bSd.a(paramString, null, 4);
    AppMethodBeat.o(1121);
    return paramString;
  }

  public final ad aoM(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(1125);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(1125);
      paramString = (String)localObject;
    }
    while (true)
    {
      return paramString;
      localObject = paramString;
      if (ad.mR(paramString))
        localObject = ad.aoC(paramString);
      paramString = aoI((String)localObject);
      if (paramString != null)
      {
        paramString.dsk();
        AppMethodBeat.o(1125);
      }
      else
      {
        paramString = new ad();
        localObject = aoG((String)localObject) + " where username=" + h.escape((String)localObject);
        localObject = this.bSd.a((String)localObject, null, 2);
        if (((Cursor)localObject).moveToFirst())
        {
          paramString.d((Cursor)localObject);
          W(paramString);
        }
        ((Cursor)localObject).close();
        paramString.dsk();
        AppMethodBeat.o(1125);
      }
    }
  }

  public final ad aoN(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(1126);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(1126);
      paramString = (String)localObject;
    }
    while (true)
    {
      return paramString;
      localObject = paramString;
      if (ad.mR(paramString))
        localObject = ad.aoC(paramString);
      paramString = aoI((String)localObject);
      if (paramString != null)
      {
        AppMethodBeat.o(1126);
      }
      else
      {
        paramString = new ad();
        localObject = aoG((String)localObject) + " where username=" + h.escape((String)localObject) + " or encryptUsername=" + h.escape((String)localObject);
        localObject = this.bSd.a((String)localObject, null, 2);
        if (((Cursor)localObject).moveToFirst())
        {
          paramString.d((Cursor)localObject);
          W(paramString);
        }
        ((Cursor)localObject).close();
        AppMethodBeat.o(1126);
      }
    }
  }

  public final ad aoO(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(1127);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(1127);
      paramString = (String)localObject;
    }
    while (true)
    {
      return paramString;
      localObject = paramString;
      if (ad.mR(paramString))
        localObject = ad.aoC(paramString);
      paramString = aoI((String)localObject);
      if (paramString == null)
        break;
      AppMethodBeat.o(1127);
    }
    paramString = new ad();
    localObject = aoG((String)localObject) + " where username=" + h.escape((String)localObject) + " or encryptUsername=" + h.escape((String)localObject);
    localObject = this.bSd.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      paramString.d((Cursor)localObject);
      ((Cursor)localObject).close();
      paramString.dsk();
      W(paramString);
    }
    while (true)
    {
      AppMethodBeat.o(1127);
      break;
      ((Cursor)localObject).close();
    }
  }

  public final long aoP(String paramString)
  {
    AppMethodBeat.i(1129);
    long l1 = -1L;
    paramString = aoO(paramString);
    long l2 = l1;
    if (paramString != null)
    {
      l2 = l1;
      if (paramString.ewQ > 0L)
        l2 = (int)paramString.ewQ;
    }
    AppMethodBeat.o(1129);
    return l2;
  }

  public final boolean aoQ(String paramString)
  {
    AppMethodBeat.i(1130);
    ad localad = aoO(paramString);
    boolean bool;
    if ((localad != null) && (!bo.isNullOrNil(localad.field_username)) && (localad.field_username.equals(paramString)))
    {
      bool = true;
      AppMethodBeat.o(1130);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1130);
    }
  }

  public final boolean aoR(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(1131);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(1131);
    while (true)
    {
      return bool2;
      paramString = "select count(*) from " + aoH(paramString) + " where type & " + a.NT() + " !=0 and username=" + h.escape(paramString);
      paramString = this.bSd.a(paramString, null, 2);
      bool2 = bool1;
      if (paramString.moveToFirst())
      {
        bool2 = bool1;
        if (paramString.getInt(0) > 0)
          bool2 = true;
      }
      paramString.close();
      AppMethodBeat.o(1131);
    }
  }

  public final byte[] aoS(String paramString)
  {
    ae localae = null;
    AppMethodBeat.i(1136);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.ContactStorage", "getCmdbuf failed user is null");
      AppMethodBeat.o(1136);
      paramString = localae;
      return paramString;
    }
    localae = new ae();
    Cursor localCursor = this.bSd.a("ContactCmdBuf", null, "username=?", new String[] { paramString }, null, null, null, 2);
    if (localCursor.moveToFirst())
      localae.d(localCursor);
    localCursor.close();
    if (localae.field_cmdbuf == null);
    for (int i = -1; ; i = localae.field_cmdbuf.length)
    {
      ab.d("MicroMsg.ContactStorage", "getCmdbuf user:%s buf:%d", new Object[] { paramString, Integer.valueOf(i) });
      paramString = localae.field_cmdbuf;
      AppMethodBeat.o(1136);
      break;
    }
  }

  public final int aoT(String paramString)
  {
    AppMethodBeat.i(1137);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.ContactStorage", "delCmdBuf failed user is null");
      i = -1;
      AppMethodBeat.o(1137);
    }
    while (true)
    {
      return i;
      i = this.bSd.delete("ContactCmdBuf", "username=?", new String[] { String.valueOf(paramString) });
      ab.d("MicroMsg.ContactStorage", "delCmdBuf user:%s ret:%d", new Object[] { paramString, Integer.valueOf(i) });
      AppMethodBeat.o(1137);
    }
  }

  public final int aoU(String paramString)
  {
    AppMethodBeat.i(1138);
    boolean bool;
    String str;
    int i;
    if (paramString.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      str = paramString;
      if (ad.mR(paramString))
        str = ad.aoC(paramString);
      MQ(str);
      paramString = new ad(str);
      paramString.setType(0);
      paramString.setUsername("fake_" + bo.anU());
      paramString.iH("fake_" + bo.anU());
      paramString.setSource(0);
      i = this.bSd.update(aoH(str), paramString.Hl(), "username=?", new String[] { String.valueOf(str) });
      aoT(str);
      ab.w("MicroMsg.ContactStorage", "delete (because the fucking talker id , dk just mark it  disappear .) user:%s res:%s %s", new Object[] { str, Integer.valueOf(i), bo.dpG() });
      if (i != 0)
        break label191;
      AppMethodBeat.o(1138);
    }
    while (true)
    {
      return i;
      bool = false;
      break;
      label191: b(5, this, str);
      AppMethodBeat.o(1138);
    }
  }

  public final String aoV(String paramString)
  {
    AppMethodBeat.i(1171);
    if ((paramString == null) || (paramString.equals("")))
    {
      paramString = "";
      AppMethodBeat.o(1171);
    }
    while (true)
    {
      return paramString;
      String str = " and (" + "conRemark like '%" + paramString + "%' or ";
      str = str + "conRemarkPYFull like '%" + paramString + "%' or ";
      str = str + "conRemarkPYShort like '%" + paramString + "%' or ";
      str = str + "alias like '%" + paramString + "%' or ";
      str = str + "username like '%" + paramString + "%' or ";
      str = str + "nickname like '%" + paramString + "%' or ";
      str = str + "pyInitial like '%" + paramString + "%' or ";
      paramString = str + "quanPin like '%" + paramString + "%' )";
      AppMethodBeat.o(1171);
    }
  }

  public final boolean apK()
  {
    boolean bool = true;
    AppMethodBeat.i(1188);
    Object localObject;
    if ((this.bSd == null) || (this.bSd.dpU()))
      if (this.bSd == null)
      {
        localObject = "null";
        ab.w("MicroMsg.ContactStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
        AppMethodBeat.o(1188);
        bool = false;
      }
    while (true)
    {
      return bool;
      localObject = Boolean.valueOf(this.bSd.dpU());
      break;
      AppMethodBeat.o(1188);
    }
  }

  public final int b(String paramString, ad paramad)
  {
    AppMethodBeat.i(1139);
    ab.i("MicroMsg.ContactStorage", "begin to update contact : ".concat(String.valueOf(paramString)));
    if (!ab(paramad))
    {
      AppMethodBeat.o(1139);
      i = 1;
      return i;
    }
    long l = System.currentTimeMillis();
    String str = paramString;
    if (ad.mR(paramString))
      str = ad.aoC(paramString);
    paramad.hu(paramad.Ny());
    this.fuL.cF(paramad);
    this.fuL.doNotify();
    paramString = paramad.Hl();
    if ((int)paramad.ewQ > 0)
      paramString.put("rowid", Integer.valueOf((int)paramad.ewQ));
    if (paramString.size() > 0);
    for (int i = this.bSd.update(aoH(str), paramString, "username=?", new String[] { String.valueOf(str) }); ; i = 0)
    {
      ab.i("MicroMsg.ContactStorage", "update : username=%s, showHead=%d, verifyFlag=%d, result1=%d, take[%d]ms", new Object[] { paramad.field_username, Integer.valueOf(paramad.field_showHead), Integer.valueOf(paramad.field_verifyFlag), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
      MQ(str);
      if (!bo.isNullOrNil(paramad.field_encryptUsername))
        MQ(paramad.field_encryptUsername);
      if (i != 0)
        b(4, this, str);
      AppMethodBeat.o(1139);
      break;
    }
  }

  public final int b(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(1185);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select count(username) from rcontact where ");
    localStringBuilder.append("type & ").append(a.NS()).append(" !=0 and ");
    localStringBuilder.append("type & ").append(a.NW()).append(" =0 and ");
    localStringBuilder.append("type & ").append(a.NT()).append(" =0 and ");
    localStringBuilder.append("verifyFlag & 8 = 0 and ");
    localStringBuilder.append("( username not like '%@%')");
    if ((paramArrayOfString1 != null) && (paramArrayOfString1.length > 0))
    {
      int i = paramArrayOfString1.length;
      for (j = 0; j < i; j++)
      {
        String str = paramArrayOfString1[j];
        localStringBuilder.append(" and rcontact.username != '").append(str).append("'");
      }
    }
    for (int j = 0; j < 4; j++)
    {
      paramArrayOfString1 = paramArrayOfString2[j];
      localStringBuilder.append(" and rcontact.username != '").append(paramArrayOfString1).append("'");
    }
    localStringBuilder.append(" or username = 'weixin'");
    paramArrayOfString2 = localStringBuilder.toString();
    paramArrayOfString1 = this.bSd.a(paramArrayOfString2, null, 2);
    if ((paramArrayOfString1 != null) && (paramArrayOfString1.moveToFirst()))
    {
      j = paramArrayOfString1.getInt(0);
      paramArrayOfString1.close();
    }
    while (true)
    {
      ab.d("MicroMsg.ContactStorage", "getNormalContactCount, sql:%s, result:%d", new Object[] { paramArrayOfString2, Integer.valueOf(j) });
      AppMethodBeat.o(1185);
      return j;
      j = 0;
    }
  }

  public final Cursor b(String paramString1, String paramString2, List<String> paramList)
  {
    AppMethodBeat.i(1150);
    paramString1 = "select * ,rowid from rcontact " + e(paramString1, paramString2, paramList) + ey(null) + dsx();
    ab.v("MicroMsg.ContactStorage", paramString1);
    paramString1 = this.bSd.rawQuery(paramString1, null);
    AppMethodBeat.o(1150);
    return paramString1;
  }

  public final Cursor b(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(1124);
    paramString1 = "select username from rcontact " + e(paramString1, paramString2, paramList1) + ey(paramList2) + dsx();
    ab.v("MicroMsg.ContactStorage", paramString1);
    if (paramBoolean1)
    {
      paramString2 = "select username from rcontact " + l(paramList1, paramBoolean2) + dsy();
      ab.v("MicroMsg.ContactStorage", "favourSql ".concat(String.valueOf(paramString1)));
      paramString2 = this.bSd.a(paramString2, null, 4);
      paramString1 = this.bSd.a(paramString1, null, 4);
      if (((paramString2 instanceof com.tencent.mm.cd.a.f)) && ((paramString1 instanceof com.tencent.mm.cd.a.f)))
      {
        paramString1 = new com.tencent.mm.cd.a.e(new com.tencent.mm.cd.a.f[] { (com.tencent.mm.cd.a.f)paramString2, (com.tencent.mm.cd.a.f)paramString1 });
        AppMethodBeat.o(1124);
      }
    }
    while (true)
    {
      return paramString1;
      paramString1 = d.dvo();
      AppMethodBeat.o(1124);
      continue;
      paramString1 = this.bSd.rawQuery(paramString1, null);
      AppMethodBeat.o(1124);
    }
  }

  public final Cursor b(List<String> paramList1, String paramString, List<String> paramList2)
  {
    AppMethodBeat.i(1119);
    paramList1 = a("select count(*)  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId and rcontact.openImAppid = OpenIMWordingInfo.appid ", paramList1, paramString, paramList2);
    paramList1 = paramList1 + "group by OpenIMWordingInfo.wording ";
    paramList1 = paramList1 + " order by OpenIMWordingInfo.quanpin IS NULL, OpenIMWordingInfo.quanpin ";
    ab.v("MicroMsg.ContactStorage", "getOpenIMHeaderCursor:%s", new Object[] { paramList1 });
    paramList1 = this.bSd.a(paramList1, null, 4);
    AppMethodBeat.o(1119);
    return paramList1;
  }

  public final void b(bd.a parama)
  {
    AppMethodBeat.i(1108);
    if (this.fuL != null)
      this.fuL.remove(parama);
    AppMethodBeat.o(1108);
  }

  public final int[] b(String paramString1, String paramString2, String paramString3, List<String> paramList)
  {
    AppMethodBeat.i(1162);
    paramString1 = "select distinct showHead from rcontact " + e(paramString1, paramString2, paramList) + aoV(paramString3) + dsx();
    long l = System.currentTimeMillis();
    paramString1 = this.bSd.rawQuery(paramString1, null);
    ab.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead db.rawQuery : " + (System.currentTimeMillis() - l));
    l = System.currentTimeMillis();
    if (paramString1.getCount() >= 0);
    for (int i = paramString1.getCount(); ; i = 0)
    {
      ab.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead cu.getCount() : " + (System.currentTimeMillis() - l));
      paramString2 = new int[i];
      if (paramString1.getCount() <= 0)
        break;
      for (int j = 0; j < i; j++)
      {
        paramString1.moveToPosition(j);
        paramString2[j] = paramString1.getInt(0);
      }
    }
    paramString1.close();
    AppMethodBeat.o(1162);
    return paramString2;
  }

  public final int[] b(String paramString1, String paramString2, String[] paramArrayOfString, List<String> paramList)
  {
    AppMethodBeat.i(1161);
    paramString1 = "select distinct showHead from rcontact " + e(paramString1, paramString2, paramList) + S(paramArrayOfString) + dsx();
    long l = System.currentTimeMillis();
    paramString1 = this.bSd.rawQuery(paramString1, null);
    ab.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowHeadDistinct db.rawQuery last" + (System.currentTimeMillis() - l));
    l = System.currentTimeMillis();
    if (paramString1.getCount() >= 0);
    for (int i = paramString1.getCount(); ; i = 0)
    {
      ab.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowHeadDistinct  cu.getCount() last" + (System.currentTimeMillis() - l));
      paramString2 = new int[i];
      if (paramString1.getCount() <= 0)
        break;
      for (int j = 0; j < i; j++)
      {
        paramString1.moveToPosition(j);
        paramString2[j] = paramString1.getInt(0);
      }
    }
    paramString1.close();
    AppMethodBeat.o(1161);
    return paramString2;
  }

  public final int c(String paramString, ad paramad)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(1140);
    if ((bo.isNullOrNil(paramString)) || (paramad == null) || (bo.isNullOrNil(paramad.field_username)))
    {
      ab.e("MicroMsg.ContactStorage", "update : wrong input!");
      AppMethodBeat.o(1140);
    }
    for (i = j; ; i = 1)
    {
      return i;
      ab.d("MicroMsg.ContactStorage", "updateEncryptUser contact: " + paramad.field_username + " enUsername: " + paramString);
      if (ab(paramad))
        break;
      AppMethodBeat.o(1140);
    }
    if (ad.mR(paramad.field_username))
      paramad.setUsername(ad.aoC(paramad.field_username));
    paramad.hu(paramad.Ny());
    this.fuL.cF(paramad);
    this.fuL.doNotify();
    ab.d("MicroMsg.ContactStorage", "update : oldUsername=%s, username=%s, showHead=%d, verifyFlag=%d", new Object[] { paramString, paramad.field_username, Integer.valueOf(paramad.field_showHead), Integer.valueOf(paramad.field_verifyFlag) });
    ContentValues localContentValues = paramad.Hl();
    ad localad;
    if (paramad.ewQ <= 0L)
    {
      localad = new ad(paramString);
      localad.setType(0);
      localad.setUsername("fake_" + bo.anU());
      localad.iH("fake_" + bo.anU());
      j = this.bSd.update(aoH(paramString), localad.Hl(), "username=?", new String[] { String.valueOf(paramString) });
      ab.d("MicroMsg.ContactStorage", "newContact.contactId <= 0 | delete " + aoH(paramString) + " user :" + paramString + ", res:" + j);
      if (localContentValues.size() > 0)
        i = (int)this.bSd.replace(aoH(paramad.field_username), a.ccO.xDc, localContentValues);
    }
    while (true)
    {
      MQ(paramad.field_username);
      if (!bo.isNullOrNil(paramad.field_encryptUsername))
        MQ(paramad.field_encryptUsername);
      b(3, this, paramString);
      b(3, this, paramad.field_username);
      AppMethodBeat.o(1140);
      break;
      if (paramString.equals(paramad.field_username))
      {
        if (localContentValues.size() > 0)
        {
          i = this.bSd.update(aoH(paramad.field_username), localContentValues, "rowid=?", new String[] { paramad.ewQ });
          ab.i("MicroMsg.ContactStorage", "summercontact en equal username[%s], result1[%d], contactId[%d]", new Object[] { paramad.field_username, Integer.valueOf(i), Long.valueOf(paramad.ewQ) });
        }
      }
      else
      {
        localad = new ad(paramString);
        localad.setType(0);
        localad.setUsername("fake_" + bo.anU());
        localad.iH("fake_" + bo.anU());
        j = this.bSd.update(aoH(paramString), localad.Hl(), "username=?", new String[] { String.valueOf(paramString) });
        ab.d("MicroMsg.ContactStorage", "delete " + aoH(paramString) + " user :" + paramString + ", res:" + j);
        if (localContentValues.size() > 0)
          i = this.bSd.update(aoH(paramad.field_username), localContentValues, "rowid=?", new String[] { paramad.ewQ });
      }
    }
  }

  public final int c(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(1186);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select count(username) from rcontact where ");
    localStringBuilder.append("type & ").append(a.NS()).append(" !=0 and ");
    localStringBuilder.append("type & ").append(a.NW()).append(" =0 and ");
    localStringBuilder.append("type & ").append(a.NT()).append(" =0 and ");
    localStringBuilder.append("verifyFlag & 8 = 0 and ");
    localStringBuilder.append("(( username like '%@chatroom') or ");
    localStringBuilder.append("( username like '%@im.chatroom'))");
    if ((paramArrayOfString1 != null) && (paramArrayOfString1.length > 0))
    {
      int i = paramArrayOfString1.length;
      for (j = 0; j < i; j++)
      {
        String str = paramArrayOfString1[j];
        localStringBuilder.append(" and rcontact.username != '").append(str).append("'");
      }
    }
    for (int j = 0; j < 4; j++)
    {
      paramArrayOfString1 = paramArrayOfString2[j];
      localStringBuilder.append(" and rcontact.username != '").append(paramArrayOfString1).append("'");
    }
    paramArrayOfString1 = localStringBuilder.toString();
    paramArrayOfString2 = this.bSd.a(paramArrayOfString1, null, 2);
    if ((paramArrayOfString2 != null) && (paramArrayOfString2.moveToFirst()))
    {
      j = paramArrayOfString2.getInt(0);
      paramArrayOfString2.close();
    }
    while (true)
    {
      ab.v("MicroMsg.ContactStorage", "getChatroomContactCount, sql:%s, result:%d", new Object[] { paramArrayOfString1, Integer.valueOf(j) });
      AppMethodBeat.o(1186);
      return j;
      j = 0;
    }
  }

  public final Cursor c(String paramString1, String paramString2, List<String> paramList)
  {
    AppMethodBeat.i(1157);
    paramString1 = b(paramString1, paramString2, paramList);
    AppMethodBeat.o(1157);
    return paramString1;
  }

  public final Cursor c(List<String> paramList1, String paramString, List<String> paramList2)
  {
    AppMethodBeat.i(1120);
    paramList1 = a("select rcontact.username ,rcontact.nickname ,rcontact.alias,rcontact.conRemark,rcontact.verifyFlag,rcontact.showHead,rcontact.weiboFlag,rcontact.rowid ,rcontact.deleteFlag,rcontact.lvbuff,rcontact.descWordingId, rcontact.openImAppid,  OpenIMWordingInfo.wording, OpenIMWordingInfo.quanpin  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId and rcontact.openImAppid = OpenIMWordingInfo.appid ", paramList1, paramString, paramList2);
    paramList1 = paramList1 + "group by OpenIMWordingInfo.wording ";
    paramList1 = paramList1 + " order by OpenIMWordingInfo.quanpin IS NULL, OpenIMWordingInfo.quanpin ";
    ab.v("MicroMsg.ContactStorage", "getOpenIMHeaderCursor:%s", new Object[] { paramList1 });
    paramList1 = this.bSd.a(paramList1, null, 4);
    AppMethodBeat.o(1120);
    return paramList1;
  }

  public final int[] c(String paramString1, String paramString2, String paramString3, List<String> paramList)
  {
    Object localObject = null;
    AppMethodBeat.i(1164);
    long l = System.currentTimeMillis();
    paramString1 = "select count(*) from rcontact " + e(paramString1, paramString2, paramList) + aoV(paramString3);
    paramString1 = paramString1 + " group by showHead";
    paramString3 = this.bSd.rawQuery(paramString1, null);
    ab.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead db.rawQuery : " + (System.currentTimeMillis() - l));
    l = System.currentTimeMillis();
    int i = paramString3.getCount();
    ab.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead cu.getCount() : " + (System.currentTimeMillis() - l));
    paramString1 = localObject;
    if (i > 0)
    {
      paramString2 = new int[i];
      for (int j = 0; ; j++)
      {
        paramString1 = paramString2;
        if (j >= i)
          break;
        paramString3.moveToPosition(j);
        paramString2[j] = paramString3.getInt(0);
      }
    }
    paramString3.close();
    AppMethodBeat.o(1164);
    return paramString1;
  }

  public final int[] c(String paramString1, String paramString2, String[] paramArrayOfString, List<String> paramList)
  {
    Object localObject = null;
    AppMethodBeat.i(1166);
    paramString1 = "select count(*) from rcontact " + e(paramString1, paramString2, paramList) + S(paramArrayOfString);
    paramString1 = paramString1 + " group by showHead";
    paramArrayOfString = this.bSd.rawQuery(paramString1, null);
    paramString1 = localObject;
    if (paramArrayOfString.getCount() > 0)
    {
      int i = paramArrayOfString.getCount();
      paramString2 = new int[i];
      for (int j = 0; ; j++)
      {
        paramString1 = paramString2;
        if (j >= i)
          break;
        paramArrayOfString.moveToPosition(j);
        paramString2[j] = paramArrayOfString.getInt(0);
      }
    }
    paramArrayOfString.close();
    AppMethodBeat.o(1166);
    return paramString1;
  }

  public final Cursor d(String paramString1, String paramString2, List<String> paramList)
  {
    AppMethodBeat.i(1158);
    paramString1 = "select * ,rowid from rcontact " + e(paramString1, paramString2, paramList) + dsx();
    ab.v("MicroMsg.ContactStorage", paramString1);
    paramString1 = this.bSd.rawQuery(paramString1, null);
    AppMethodBeat.o(1158);
    return paramString1;
  }

  public final void d(String paramString, ad paramad)
  {
    AppMethodBeat.i(1141);
    if (paramString == null)
      AppMethodBeat.o(1141);
    while (true)
    {
      return;
      String str = paramString;
      if (ad.mR(paramString))
        str = ad.aoC(paramString);
      paramad.hu(paramad.Ny());
      if (t.e(paramad))
      {
        paramad.hu(43);
        paramad.iC(g.vp(paramad.Oi()));
        paramad.iD(g.vo(paramad.Oi()));
        paramad.iF(g.vo(paramad.Oj()));
        paramad.iG(paramad.Oj());
        AppMethodBeat.o(1141);
      }
      else
      {
        if (t.ny(paramad.field_username))
        {
          ab.i("MicroMsg.ContactStorage", "update official account helper showhead %d", new Object[] { Integer.valueOf(31) });
          paramad.hu(31);
        }
        this.fuL.cF(paramad);
        this.fuL.doNotify();
        ab.d("MicroMsg.ContactStorage", "username=%s, showHead=%d, verifyFlag=%d", new Object[] { paramad.field_username, Integer.valueOf(paramad.field_showHead), Integer.valueOf(paramad.field_verifyFlag) });
        paramString = paramad.Hl();
        if ((int)paramad.ewQ > 0)
          paramString.put("rowid", Integer.valueOf((int)paramad.ewQ));
        if (paramString.size() > 0)
          this.bSd.update(aoH(str), paramString, "username=?", new String[] { String.valueOf(str) });
        AppMethodBeat.o(1141);
      }
    }
  }

  public final Cursor dsF()
  {
    AppMethodBeat.i(1187);
    Cursor localCursor = this.bSd.rawQuery("select * ,rowid from rcontact  where rowid = -1", null);
    AppMethodBeat.o(1187);
    return localCursor;
  }

  public final Cursor dsG()
  {
    AppMethodBeat.i(1190);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact  where ");
    ((StringBuilder)localObject).append("type & ").append(a.NS()).append(" !=0 and ");
    ((StringBuilder)localObject).append("type & ").append(a.NW()).append(" =0 and ");
    ((StringBuilder)localObject).append("type & ").append(a.NT()).append(" =0 and ");
    ((StringBuilder)localObject).append("verifyFlag & 8 = 0 and ");
    ((StringBuilder)localObject).append("( username not like '%@%')");
    ((StringBuilder)localObject).append(" or username = 'weixin'");
    localObject = ((StringBuilder)localObject).toString();
    Cursor localCursor = this.bSd.a((String)localObject, null, 2);
    ab.i("MicroMsg.ContactStorage", "[oneliang]getNormalContactCursor, sql:%s", new Object[] { localObject });
    AppMethodBeat.o(1190);
    return localCursor;
  }

  public final Cursor dsH()
  {
    AppMethodBeat.i(1191);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact  where ");
    ((StringBuilder)localObject).append("type & ").append(a.NS()).append(" !=0 and ");
    ((StringBuilder)localObject).append("type & ").append(a.NW()).append(" =0 and ");
    ((StringBuilder)localObject).append("type & ").append(a.NT()).append(" =0 and ");
    ((StringBuilder)localObject).append("verifyFlag & 8 = 0 and ");
    ((StringBuilder)localObject).append("( username not like '%@%')");
    ((StringBuilder)localObject).append(" or username = 'weixin'");
    localObject = this.bSd.a(((StringBuilder)localObject).toString(), null, 2);
    AppMethodBeat.o(1191);
    return localObject;
  }

  public final List<String> dsq()
  {
    AppMethodBeat.i(1116);
    Object localObject = " select openImAppid from rcontact" + dsE() + " group by openImAppid ";
    localObject = " select acctTypeId from OpenIMAppIdInfo where appid in (" + (String)localObject + ") group by acctTypeId";
    localObject = this.bSd.a((String)localObject, null, 4);
    LinkedList localLinkedList = new LinkedList();
    if (((Cursor)localObject).moveToFirst())
      do
      {
        String str = ((Cursor)localObject).getString(0);
        if (!bo.isNullOrNil(str))
          localLinkedList.add(str);
      }
      while (((Cursor)localObject).moveToNext());
    ((Cursor)localObject).close();
    AppMethodBeat.o(1116);
    return localLinkedList;
  }

  public final List<String> dsr()
  {
    AppMethodBeat.i(1144);
    Object localObject = "select username from rcontact where " + dsB();
    localObject = this.bSd.a((String)localObject, null, 2);
    ArrayList localArrayList = new ArrayList();
    if (localObject == null)
      AppMethodBeat.o(1144);
    while (true)
    {
      return localArrayList;
      if (((Cursor)localObject).moveToFirst())
        do
          localArrayList.add(((Cursor)localObject).getString(0));
        while (((Cursor)localObject).moveToNext());
      ((Cursor)localObject).close();
      AppMethodBeat.o(1144);
    }
  }

  public final Cursor dss()
  {
    AppMethodBeat.i(1145);
    Object localObject = "select * ,rowid from rcontact  where " + new StringBuilder("type & ").append(a.NT()).append("=0 and username like '%@chatroom'").toString();
    localObject = this.bSd.rawQuery((String)localObject, null);
    AppMethodBeat.o(1145);
    return localObject;
  }

  public final Cursor dst()
  {
    AppMethodBeat.i(1146);
    Object localObject = "select * ,rowid from rcontact " + dsA() + " AND type & 256 !=0 " + dsx();
    ab.v("MicroMsg.ContactStorage", (String)localObject);
    localObject = this.bSd.rawQuery((String)localObject, null);
    AppMethodBeat.o(1146);
    return localObject;
  }

  public final Cursor dsu()
  {
    AppMethodBeat.i(1147);
    Object localObject = "select * ,rowid from rcontact  where " + xXo + " and verifyFlag & " + ad.dsh() + " !=0 ";
    ab.v("MicroMsg.ContactStorage", "dkbf:".concat(String.valueOf(localObject)));
    localObject = this.bSd.rawQuery((String)localObject, null);
    AppMethodBeat.o(1147);
    return localObject;
  }

  public final Cursor dsv()
  {
    AppMethodBeat.i(1148);
    Object localObject = "select * ,rowid from rcontact " + dsA() + " AND " + xXo + " AND " + xXn + dsy();
    ab.v("MicroMsg.ContactStorage", (String)localObject);
    localObject = this.bSd.rawQuery((String)localObject, null);
    AppMethodBeat.o(1148);
    return localObject;
  }

  public final int dsw()
  {
    int i = 0;
    AppMethodBeat.i(1159);
    Object localObject = "select count(rowid) from rcontact " + e("@biz.contact", null, null);
    ab.v("MicroMsg.ContactStorage", (String)localObject);
    localObject = this.bSd.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
      i = ((Cursor)localObject).getInt(0);
    ((Cursor)localObject).close();
    AppMethodBeat.o(1159);
    return i;
  }

  public final String e(String paramString1, String paramString2, List<String> paramList)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool5 = true;
    boolean bool6 = true;
    boolean bool7 = true;
    boolean bool8 = true;
    AppMethodBeat.i(1184);
    if ((paramString1 == null) || (paramString1.equals("@all.android")))
      paramString1 = "" + ae(true, false);
    while (true)
    {
      Object localObject = "";
      paramString2 = (String)localObject;
      if (paramList == null)
        break;
      paramString2 = (String)localObject;
      if (paramList.size() <= 0)
        break;
      paramList = paramList.iterator();
      for (paramString2 = ""; paramList.hasNext(); paramString2 = paramString2 + " and username != '" + (String)localObject + "'")
        localObject = (String)paramList.next();
      if (paramString1.equals("@all.contact.android"))
      {
        paramString1 = "" + dsA();
      }
      else if (paramString1.equals("@all.chatroom.contact"))
      {
        paramString1 = new StringBuilder().append("");
        paramString2 = "(type & " + a.NS() + "!=0 and (username like '%@chatroom' or username like '%@im.chatroom'))";
        paramString2 = " where (" + paramString2 + ") and ";
        paramString1 = new StringBuilder().append(paramString2).append("type & ").append(a.NW()).append("=0 ").toString();
      }
      else
      {
        if (paramString1.equals("@all.contact.without.chatroom"))
        {
          localObject = new StringBuilder().append("");
          paramString1 = ae(false, false);
          if ((paramString1 != null) && (paramString1.length() > 0));
          while (true)
          {
            Assert.assertTrue(bool8);
            paramString2 = " or (" + dsC() + ')' + " or (" + dsD() + ")";
            paramString1 = new StringBuilder().append(paramString1).append(" and ( username not like '%@%'").append(paramString2).append(")").toString();
            break;
            bool8 = false;
          }
        }
        if ((paramString1.equals("@all.contact.without.chatroom.without.openim")) || (paramString1.equals("@all.contact.without.chatroom.without.openim.without.openimfavour")))
        {
          paramString2 = new StringBuilder().append("");
          paramString1 = ae(false, false);
          if ((paramString1 != null) && (paramString1.length() > 0));
          for (bool8 = bool1; ; bool8 = false)
          {
            Assert.assertTrue(bool8);
            localObject = " or (" + dsC() + ')';
            paramString1 = new StringBuilder().append(paramString1).append(" and ( username not like '%@%'").append((String)localObject).append(")").toString();
            break;
          }
        }
        if (paramString1.equals("@black.android"))
        {
          paramString1 = "" + new StringBuilder(" where type & ").append(a.NT()).append("!=0").toString();
        }
        else if (paramString1.equals("@werun.black.android"))
        {
          paramString1 = "" + new StringBuilder(" where type & ").append(a.NU()).append("!=0").toString();
        }
        else if (paramString1.equals("@t.qq.com"))
        {
          paramString1 = "" + new StringBuilder(" where username like '%").append("@t.qq.com").append("'").toString();
        }
        else
        {
          if (paramString1.equals("@domain.android"))
          {
            localObject = new StringBuilder().append("");
            paramString1 = ae(true, false);
            if ((paramString1 != null) && (paramString1.length() > 0));
            for (bool8 = bool2; ; bool8 = false)
            {
              Assert.assertTrue(bool8);
              paramString1 = new StringBuilder().append(paramString1).append(" and domainList like '%").append(paramString2).append("%'").toString();
              break;
            }
          }
          if (paramString1.equals("@micromsg.qq.com"))
          {
            paramString2 = new StringBuilder().append("");
            String str = ae(false, false);
            if ((str != null) && (str.length() > 0));
            for (bool8 = bool3; ; bool8 = false)
            {
              Assert.assertTrue(bool8);
              paramString1 = " or (" + dsB() + ')';
              localObject = " or (" + dsC() + ')';
              paramString1 = new StringBuilder().append(str).append(" and ( username not like '%@%'").append(paramString1).append((String)localObject).append(")").toString();
              break;
            }
          }
          if (paramString1.equals("@micromsg.no.verify.biz.qq.com"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = "type & " + a.NS() + " !=0 ";
            paramString2 = " where (" + paramString2 + ") and ";
            paramString2 = paramString2 + "type & " + a.NW() + " =0 and ";
            paramString2 = paramString2 + "type & " + a.NT() + " =0 and ";
            localObject = paramString2 + "verifyFlag & " + ad.dsh() + " =0";
            if ((localObject != null) && (((String)localObject).length() > 0));
            for (bool8 = bool4; ; bool8 = false)
            {
              Assert.assertTrue(bool8);
              paramString2 = " or (" + dsB() + ')';
              paramString1 = new StringBuilder().append((String)localObject).append(" and ( username not like '%@%'").append(paramString2).append(")").toString();
              break;
            }
          }
          if (paramString1.equals("@micromsg.with.all.biz.qq.com"))
          {
            paramString2 = new StringBuilder().append("");
            paramString1 = dsz();
            if ((paramString1 != null) && (paramString1.length() > 0));
            for (bool8 = bool5; ; bool8 = false)
            {
              Assert.assertTrue(bool8);
              localObject = " or (" + dsB() + ')';
              paramString1 = new StringBuilder().append(paramString1).append(" and ( username not like '%@%'").append((String)localObject).append(")").toString();
              break;
            }
          }
          if (paramString1.equals("@micromsg.with.all.biz.qq.com.openim"))
          {
            localObject = new StringBuilder().append("");
            paramString2 = dsz();
            if ((paramString2 != null) && (paramString2.length() > 0));
            for (bool8 = bool6; ; bool8 = false)
            {
              Assert.assertTrue(bool8);
              paramString1 = " or (" + dsB() + ')';
              paramString1 = new StringBuilder().append(paramString2).append(" and ( username not like '%@%'").append(paramString1).append(" or (username like '%@openim'))").toString();
              break;
            }
          }
          if (paramString1.equals("@qqim"))
          {
            paramString2 = new StringBuilder().append("");
            paramString1 = ae(false, false);
            if ((paramString1 != null) && (paramString1.length() > 0));
            for (bool8 = bool7; ; bool8 = false)
            {
              Assert.assertTrue(bool8);
              paramString1 = new StringBuilder().append(paramString1).append(" and username like '%").append("@qqim").append("'").toString();
              break;
            }
          }
          if (paramString1.equals("@all.chatroom"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = "type & " + a.NS() + " !=0";
            paramString2 = paramString2 + " or type & 2 !=0";
            paramString2 = paramString2 + " or type & 4 !=0";
            paramString2 = paramString2 + " or 1";
            paramString1 = new StringBuilder(" where (").append(paramString2).append(") ").toString();
          }
          else if (paramString1.equals("@verify.contact"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = "type & " + a.NS() + " != 0 and ";
            paramString2 = paramString2 + "verifyFlag & " + ad.dsg() + " != 0";
            paramString1 = new StringBuilder(" where (").append(paramString2).append(") ").toString();
          }
          else if (paramString1.equals("@biz.contact"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = "type & " + a.NS() + " != 0 and ";
            paramString2 = paramString2 + "verifyFlag & " + ad.dsh() + " != 0";
            paramString1 = new StringBuilder(" where (").append(paramString2).append(") ").toString();
          }
          else if (paramString1.equals("@all.weixin.android"))
          {
            paramString1 = new StringBuilder().append("");
            paramString2 = "type & " + a.NS() + " != 0 or  (username not like '%@qqim' and username not like '%@qr' and username not like '%@bottle' and username not like '%@fb' and username not like '%@google' and username not like '%@t.qq.com' and username not like '%@t.sina.com' and username not like '%@t.sina.com" + "')";
            paramString1 = new StringBuilder(" where (").append(paramString2).append(") ").toString();
          }
          else if (paramString1.equals("@openim.contact"))
          {
            paramString1 = "" + dsE();
          }
          else
          {
            ab.d("MicroMsg.ContactStorage", "unknow role type");
            paramString1 = "" + ae(false, false);
          }
        }
      }
    }
    paramString1 = paramString1 + paramString2;
    AppMethodBeat.o(1184);
    return paramString1;
  }

  public final Cursor eA(List<String> paramList)
  {
    AppMethodBeat.i(1153);
    paramList = "select * ,rowid from rcontact where (" + xXo + ") and (" + ez(paramList) + ")" + dsy();
    paramList = this.bSd.rawQuery(paramList, null);
    AppMethodBeat.o(1153);
    return paramList;
  }

  public final Cursor eB(List<String> paramList)
  {
    AppMethodBeat.i(1154);
    paramList = "select * ,rowid from rcontact where (" + xXo + ") and (" + ez(paramList) + ")" + dsy() + " and (username like  '%@openim' )";
    paramList = this.bSd.rawQuery(paramList, null);
    AppMethodBeat.o(1154);
    return paramList;
  }

  public final Cursor eC(List<String> paramList)
  {
    AppMethodBeat.i(1155);
    paramList = "select * ,rowid from rcontact " + l(paramList, false) + dsy();
    ab.v("MicroMsg.ContactStorage", "favourSql ".concat(String.valueOf(paramList)));
    paramList = this.bSd.rawQuery(paramList, null);
    AppMethodBeat.o(1155);
    return paramList;
  }

  public final Cursor eD(List<String> paramList)
  {
    AppMethodBeat.i(1156);
    paramList = "select * ,rowid from rcontact " + eH(paramList) + dsy();
    ab.v("MicroMsg.ContactStorage", "favourSql ".concat(String.valueOf(paramList)));
    paramList = this.bSd.rawQuery(paramList, null);
    AppMethodBeat.o(1156);
    return paramList;
  }

  public final List<String> eE(List<String> paramList)
  {
    AppMethodBeat.i(1160);
    if (paramList.isEmpty())
    {
      ab.w("MicroMsg.ContactStorage", "getFilterList: but white list is empty");
      paramList = new LinkedList();
      AppMethodBeat.o(1160);
    }
    while (true)
    {
      return paramList;
      long l = bo.yz();
      LinkedList localLinkedList = new LinkedList();
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("username='").append((String)paramList.get(0)).append("'");
      for (int i = 1; i < paramList.size(); i++)
        ((StringBuilder)localObject).append(" or username='").append((String)paramList.get(i)).append("'");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("showHead asc, ");
      localStringBuilder.append("pyInitial asc, ");
      localStringBuilder.append("quanPin asc, ");
      localStringBuilder.append("nickname asc, ");
      localStringBuilder.append("username asc ");
      localObject = String.format("select %s from %s where (%s) and (%s & %d != 0)  order by %s", new Object[] { "username", "rcontact", ((StringBuilder)localObject).toString(), "type", Integer.valueOf(a.NS()), localStringBuilder.toString() });
      ab.i("MicroMsg.ContactStorage", "getFilterList: sql is %s", new Object[] { localObject });
      localObject = this.bSd.a((String)localObject, null, 2);
      if (localObject != null)
      {
        while (((Cursor)localObject).moveToNext())
          localLinkedList.add(((Cursor)localObject).getString(0));
        ((Cursor)localObject).close();
      }
      ab.i("MicroMsg.ContactStorage", "getFilerList: use time[%d ms] whiteList[%s], usernameList[%s]", new Object[] { Long.valueOf(bo.az(l)), paramList, localLinkedList.toString() });
      AppMethodBeat.o(1160);
      paramList = localLinkedList;
    }
  }

  public final int[] eF(List<String> paramList)
  {
    AppMethodBeat.i(1163);
    paramList = "select distinct showHead from rcontact  where (" + ez(paramList) + ") " + dsx();
    long l = System.currentTimeMillis();
    paramList = this.bSd.rawQuery(paramList, null);
    ab.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead db.rawQuery : " + (System.currentTimeMillis() - l));
    l = System.currentTimeMillis();
    if (paramList.getCount() >= 0);
    int[] arrayOfInt;
    for (int i = paramList.getCount(); ; i = 0)
    {
      ab.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead cu.getCount() : " + (System.currentTimeMillis() - l));
      arrayOfInt = new int[i];
      if (paramList.getCount() <= 0)
        break;
      for (int j = 0; j < i; j++)
      {
        paramList.moveToPosition(j);
        arrayOfInt[j] = paramList.getInt(0);
      }
    }
    paramList.close();
    AppMethodBeat.o(1163);
    return arrayOfInt;
  }

  public final int[] eG(List<String> paramList)
  {
    int[] arrayOfInt = null;
    AppMethodBeat.i(1165);
    long l = System.currentTimeMillis();
    paramList = "select count(*) from rcontact " + "where " + ez(paramList);
    paramList = paramList + " group by showHead";
    Cursor localCursor = this.bSd.a(paramList, null, 2);
    ab.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead db.rawQuery : " + (System.currentTimeMillis() - l));
    l = System.currentTimeMillis();
    int i = localCursor.getCount();
    ab.d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead cu.getCount() : " + (System.currentTimeMillis() - l));
    paramList = arrayOfInt;
    if (i > 0)
    {
      arrayOfInt = new int[i];
      for (int j = 0; ; j++)
      {
        paramList = arrayOfInt;
        if (j >= i)
          break;
        localCursor.moveToPosition(j);
        arrayOfInt[j] = localCursor.getInt(0);
      }
    }
    localCursor.close();
    AppMethodBeat.o(1165);
    return paramList;
  }

  public final Cursor eu(List<String> paramList)
  {
    int i = 0;
    AppMethodBeat.i(1122);
    boolean bool;
    if (paramList.size() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      str = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,type from rcontact  where ";
      label28: if (i >= paramList.size())
        break label145;
      if (i == paramList.size() - 1)
        break label102;
    }
    label102: for (String str = str + "username = '" + (String)paramList.get(i) + "' OR "; ; str = str + "username = '" + (String)paramList.get(i) + "'")
    {
      i++;
      break label28;
      bool = false;
      break;
    }
    label145: paramList = str + dsx();
    paramList = this.bSd.rawQuery(paramList, null);
    AppMethodBeat.o(1122);
    return paramList;
  }

  public final Cursor ev(List<String> paramList)
  {
    int i = 0;
    AppMethodBeat.i(1123);
    boolean bool;
    if (paramList.size() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      str = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact  where ";
      label28: if (i >= paramList.size())
        break label145;
      if (i == paramList.size() - 1)
        break label102;
    }
    label102: for (String str = str + "username = '" + (String)paramList.get(i) + "' OR "; ; str = str + "username = '" + (String)paramList.get(i) + "'")
    {
      i++;
      break label28;
      bool = false;
      break;
    }
    label145: paramList = str + dsx();
    paramList = this.bSd.rawQuery(paramList, null);
    AppMethodBeat.o(1123);
    return paramList;
  }

  public final Cursor ew(List<String> paramList)
  {
    int i = 0;
    AppMethodBeat.i(1142);
    boolean bool;
    if (paramList.size() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      str = "select * ,rowid from rcontact  where ";
      label28: if (i >= paramList.size())
        break label145;
      if (i == paramList.size() - 1)
        break label102;
    }
    label102: for (String str = str + "username = '" + (String)paramList.get(i) + "' OR "; ; str = str + "username = '" + (String)paramList.get(i) + "'")
    {
      i++;
      break label28;
      bool = false;
      break;
    }
    label145: paramList = str + dsx();
    paramList = this.bSd.rawQuery(paramList, null);
    AppMethodBeat.o(1142);
    return paramList;
  }

  public final Cursor ex(List<String> paramList)
  {
    int i = 0;
    AppMethodBeat.i(1143);
    boolean bool;
    if (paramList.size() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      str = "select * ,rowid from rcontact  where (";
      j = 0;
      label31: if (j >= paramList.size())
        break label152;
      if (j == paramList.size() - 1)
        break label108;
    }
    label108: for (String str = str + "username = '" + (String)paramList.get(j) + "' OR "; ; str = str + "username = '" + (String)paramList.get(j) + "'")
    {
      j++;
      break label31;
      bool = false;
      break;
    }
    label152: str = str + ") order by case username ";
    for (int j = i; j < paramList.size(); j++)
      str = str + " when '" + (String)paramList.get(j) + "' then " + j;
    paramList = str + " end";
    ab.d("MicroMsg.ContactStorage", "getCursorByNamesInListOrder sql:".concat(String.valueOf(paramList)));
    paramList = this.bSd.rawQuery(paramList, null);
    AppMethodBeat.o(1143);
    return paramList;
  }

  public final Cursor k(List<String> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(1152);
    String str = "select * ,rowid from rcontact  where " + ez(paramList);
    paramList = str;
    if (paramBoolean)
      paramList = str + " " + dsx();
    ab.d("MicroMsg.ContactStorage", "sql ".concat(String.valueOf(paramList)));
    paramList = this.bSd.rawQuery(paramList, null);
    AppMethodBeat.o(1152);
    return paramList;
  }

  public final ad mQ(long paramLong)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(1128);
    if (paramLong <= 0L)
    {
      AppMethodBeat.o(1128);
      localObject1 = localObject2;
    }
    while (true)
    {
      return localObject1;
      localObject2 = "select * ,rowid from rcontact  where rowid=".concat(String.valueOf(paramLong));
      localObject2 = this.bSd.a((String)localObject2, null, 2);
      if (((Cursor)localObject2).moveToFirst())
      {
        localObject1 = new ad();
        ((ad)localObject1).d((Cursor)localObject2);
        W((ad)localObject1);
      }
      ((Cursor)localObject2).close();
      if (localObject1 != null)
        ((ad)localObject1).dsk();
      AppMethodBeat.o(1128);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.aj
 * JD-Core Version:    0.6.2
 */