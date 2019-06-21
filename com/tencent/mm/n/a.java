package com.tencent.mm.n;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.Map;

public class a extends ap
{
  public static c.a ccO;
  private static a ewR;
  public long ewQ;
  public int versionCode;

  static
  {
    AppMethodBeat.i(59708);
    c.a locala = new c.a();
    locala.xDb = new Field[21];
    locala.columns = new String[22];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.xDd.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "username";
    locala.columns[1] = "alias";
    locala.xDd.put("alias", "TEXT default '' ");
    localStringBuilder.append(" alias TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "conRemark";
    locala.xDd.put("conRemark", "TEXT default '' ");
    localStringBuilder.append(" conRemark TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "domainList";
    locala.xDd.put("domainList", "TEXT default '' ");
    localStringBuilder.append(" domainList TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "nickname";
    locala.xDd.put("nickname", "TEXT default '' ");
    localStringBuilder.append(" nickname TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "pyInitial";
    locala.xDd.put("pyInitial", "TEXT default '' ");
    localStringBuilder.append(" pyInitial TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "quanPin";
    locala.xDd.put("quanPin", "TEXT default '' ");
    localStringBuilder.append(" quanPin TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "showHead";
    locala.xDd.put("showHead", "INTEGER default '0' ");
    localStringBuilder.append(" showHead INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "type";
    locala.xDd.put("type", "INTEGER default '0' ");
    localStringBuilder.append(" type INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "weiboFlag";
    locala.xDd.put("weiboFlag", "INTEGER default '0' ");
    localStringBuilder.append(" weiboFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "weiboNickname";
    locala.xDd.put("weiboNickname", "TEXT default '' ");
    localStringBuilder.append(" weiboNickname TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "conRemarkPYFull";
    locala.xDd.put("conRemarkPYFull", "TEXT default '' ");
    localStringBuilder.append(" conRemarkPYFull TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "conRemarkPYShort";
    locala.xDd.put("conRemarkPYShort", "TEXT default '' ");
    localStringBuilder.append(" conRemarkPYShort TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "lvbuff";
    locala.xDd.put("lvbuff", "BLOB");
    localStringBuilder.append(" lvbuff BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "verifyFlag";
    locala.xDd.put("verifyFlag", "INTEGER default '0' ");
    localStringBuilder.append(" verifyFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "encryptUsername";
    locala.xDd.put("encryptUsername", "TEXT default '' ");
    localStringBuilder.append(" encryptUsername TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[16] = "chatroomFlag";
    locala.xDd.put("chatroomFlag", "INTEGER");
    localStringBuilder.append(" chatroomFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "deleteFlag";
    locala.xDd.put("deleteFlag", "INTEGER default '0' ");
    localStringBuilder.append(" deleteFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "contactLabelIds";
    locala.xDd.put("contactLabelIds", "TEXT default '' ");
    localStringBuilder.append(" contactLabelIds TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[19] = "descWordingId";
    locala.xDd.put("descWordingId", "TEXT default '' ");
    localStringBuilder.append(" descWordingId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "openImAppid";
    locala.xDd.put("openImAppid", "TEXT");
    localStringBuilder.append(" openImAppid TEXT");
    locala.columns[21] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    ewR = null;
    AppMethodBeat.o(59708);
  }

  public a()
  {
    AppMethodBeat.i(59621);
    this.versionCode = 0;
    super.setUsername("");
    super.iB("");
    super.iC("");
    super.iD("");
    super.iy("");
    super.iz("");
    super.iG("");
    super.iF("");
    super.iA("");
    super.hv(0);
    super.iE("");
    super.hu(0);
    super.setType(0);
    super.hw(0);
    super.hx(0);
    super.iI("");
    super.hA(0);
    super.iT("");
    super.hG(0);
    super.hB(0);
    super.iM("");
    super.iN("");
    super.hC(0);
    super.hD(0);
    super.iO("");
    super.iP("");
    super.hE(1);
    super.hz(0);
    super.hF(0);
    super.iQ("");
    super.iR("");
    super.iS("");
    super.setSource(0);
    super.iV("");
    super.iU("");
    super.eC(0L);
    super.iL("");
    super.iW("");
    super.hH(0);
    super.iZ("");
    super.ja("");
    super.jb("");
    super.je("");
    super.iJ("");
    super.iK("");
    this.versionCode = 0;
    AppMethodBeat.o(59621);
  }

  public a(String paramString)
  {
    this();
    AppMethodBeat.i(59620);
    String str = paramString;
    if (paramString == null)
      str = "";
    setUsername(str);
    AppMethodBeat.o(59620);
  }

  public static int NS()
  {
    return 1;
  }

  public static int NT()
  {
    return 8;
  }

  public static int NU()
  {
    return 524288;
  }

  public static int NV()
  {
    return 16;
  }

  public static int NW()
  {
    return 32;
  }

  private int Om()
  {
    int i = this.versionCode + 1;
    this.versionCode = i;
    return i;
  }

  public static void a(a parama)
  {
    ewR = parama;
  }

  private static boolean isLetter(char paramChar)
  {
    if (((paramChar >= 'A') && (paramChar <= 'Z')) || ((paramChar >= 'a') && (paramChar <= 'z')));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean jh(int paramInt)
  {
    if ((paramInt & 0x1) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String kN(String paramString)
  {
    AppMethodBeat.i(59622);
    if (ewR != null)
    {
      paramString = ewR.jdMethod_do(paramString);
      AppMethodBeat.o(59622);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(59622);
    }
  }

  private static String kO(String paramString)
  {
    AppMethodBeat.i(59653);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(59653);
    }
    while (true)
    {
      return paramString;
      if (paramString.toLowerCase().endsWith("@t.qq.com"))
      {
        paramString = "@" + paramString.replace("@t.qq.com", "");
        AppMethodBeat.o(59653);
      }
      else if (paramString.toLowerCase().endsWith("@qqim"))
      {
        paramString = paramString.replace("@qqim", "");
        long l = Long.valueOf(paramString).longValue();
        if (l < 0L)
        {
          paramString = new p(l).toString();
          AppMethodBeat.o(59653);
        }
        else
        {
          AppMethodBeat.o(59653);
        }
      }
      else
      {
        AppMethodBeat.o(59653);
      }
    }
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean DX()
  {
    if ((this.field_type & 0x200) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void H(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(59669);
    if (!bo.isEqual(this.field_lvbuff, paramArrayOfByte))
    {
      super.H(paramArrayOfByte);
      Om();
    }
    AppMethodBeat.o(59669);
  }

  public final String Hq()
  {
    AppMethodBeat.i(59647);
    String str;
    if (ewR != null)
    {
      str = ewR.dp(this.field_username);
      if (str != null)
        break label47;
      str = super.Hq();
      AppMethodBeat.o(59647);
    }
    while (true)
    {
      return str;
      str = null;
      break;
      label47: AppMethodBeat.o(59647);
    }
  }

  public final String Ht()
  {
    AppMethodBeat.i(59645);
    String str;
    if ((super.Ht() == null) || (super.Ht().length() < 0))
    {
      str = Hu();
      AppMethodBeat.o(59645);
    }
    while (true)
    {
      return str;
      str = super.Ht();
      AppMethodBeat.o(59645);
    }
  }

  public final String Hu()
  {
    AppMethodBeat.i(59646);
    String str;
    if ((super.Hu() == null) || (super.Hu().length() < 0))
    {
      str = this.field_nickname;
      AppMethodBeat.o(59646);
    }
    while (true)
    {
      return str;
      str = super.Hu();
      AppMethodBeat.o(59646);
    }
  }

  public final boolean Kc()
  {
    if ((this.field_type & 0x400) == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void NA()
  {
    AppMethodBeat.i(59625);
    setType(this.field_type | 0x4);
    AppMethodBeat.o(59625);
  }

  public final void NB()
  {
    AppMethodBeat.i(59626);
    setType(this.field_type | 0x1);
    AppMethodBeat.o(59626);
  }

  public final void NC()
  {
    AppMethodBeat.i(59627);
    ab.w("MicroMsg.RContact", "unSetContact!! user:%s oldType:%d [%s]", new Object[] { this.field_username, Integer.valueOf(this.field_type), bo.dpG() });
    setType(this.field_type & 0xFFFFFFFE);
    AppMethodBeat.o(59627);
  }

  public final void ND()
  {
    AppMethodBeat.i(59628);
    setType(this.field_type | 0x8);
    AppMethodBeat.o(59628);
  }

  public final void NE()
  {
    AppMethodBeat.i(59629);
    setType(this.field_type & 0xFFFFFFF7);
    AppMethodBeat.o(59629);
  }

  public final void NF()
  {
    AppMethodBeat.i(59630);
    setType(this.field_type | 0x80000);
    AppMethodBeat.o(59630);
  }

  public final void NG()
  {
    AppMethodBeat.i(59631);
    setType(this.field_type & 0xFFF7FFFF);
    AppMethodBeat.o(59631);
  }

  public final void NH()
  {
    AppMethodBeat.i(59632);
    setType(this.field_type | 0x2);
    AppMethodBeat.o(59632);
  }

  public final void NI()
  {
    AppMethodBeat.i(59633);
    setType(this.field_type & 0xFFFFFFFD);
    AppMethodBeat.o(59633);
  }

  public final void NJ()
  {
    AppMethodBeat.i(59634);
    setType(this.field_type & 0xFFFFF7FF);
    AppMethodBeat.o(59634);
  }

  public final void NK()
  {
    AppMethodBeat.i(59635);
    setType(this.field_type | 0x20);
    AppMethodBeat.o(59635);
  }

  public final void NL()
  {
    AppMethodBeat.i(59636);
    setType(this.field_type & 0xFFFFFFDF);
    AppMethodBeat.o(59636);
  }

  public final void NM()
  {
    AppMethodBeat.i(59637);
    setType(this.field_type | 0x40);
    AppMethodBeat.o(59637);
  }

  public final void NN()
  {
    AppMethodBeat.i(59638);
    setType(this.field_type & 0xFFFFFFBF);
    AppMethodBeat.o(59638);
  }

  public final void NO()
  {
    AppMethodBeat.i(59639);
    setType(this.field_type | 0x200);
    AppMethodBeat.o(59639);
  }

  public final void NP()
  {
    AppMethodBeat.i(59640);
    setType(this.field_type & 0xFFFFFDFF);
    AppMethodBeat.o(59640);
  }

  public final void NQ()
  {
    AppMethodBeat.i(59641);
    setType(this.field_type | 0x100);
    AppMethodBeat.o(59641);
  }

  public final void NR()
  {
    AppMethodBeat.i(59642);
    setType(this.field_type & 0xFFFFFEFF);
    AppMethodBeat.o(59642);
  }

  public final boolean NX()
  {
    AppMethodBeat.i(138447);
    boolean bool = jh(this.field_type);
    AppMethodBeat.o(138447);
    return bool;
  }

  public final boolean NY()
  {
    if ((this.field_type & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean NZ()
  {
    if ((this.field_type & 0x4) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int Ny()
  {
    AppMethodBeat.i(59623);
    int i = 32;
    int j;
    if ((this.field_conRemarkPYShort != null) && (!this.field_conRemarkPYShort.equals("")))
    {
      j = this.field_conRemarkPYShort.charAt(0);
      if ((j < 97) || (j > 122))
        break label252;
      i = (char)(j - 32);
    }
    while (true)
    {
      AppMethodBeat.o(59623);
      return i;
      if ((this.field_conRemarkPYFull != null) && (!this.field_conRemarkPYFull.equals("")))
      {
        j = this.field_conRemarkPYFull.charAt(0);
        break;
      }
      if ((super.Ht() != null) && (!super.Ht().equals("")))
      {
        j = super.Ht().charAt(0);
        break;
      }
      if ((super.Hu() != null) && (!super.Hu().equals("")))
      {
        j = super.Hu().charAt(0);
        break;
      }
      if ((this.field_nickname != null) && (!this.field_nickname.equals("")) && (isLetter(this.field_nickname.charAt(0))))
      {
        j = this.field_nickname.charAt(0);
        break;
      }
      j = i;
      if (this.field_username == null)
        break;
      j = i;
      if (this.field_username.equals(""))
        break;
      j = i;
      if (!isLetter(this.field_username.charAt(0)))
        break;
      j = this.field_username.charAt(0);
      break;
      label252: if (j >= 65)
      {
        i = j;
        if (j <= 90);
      }
      else
      {
        i = 123;
      }
    }
  }

  public final void Nz()
  {
    AppMethodBeat.i(59624);
    setType(0);
    AppMethodBeat.o(59624);
  }

  public final boolean Oa()
  {
    if ((this.field_type & 0x8) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean Ob()
  {
    if ((0x80000 & this.field_type) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean Oc()
  {
    if ((this.field_type & 0x40) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean Od()
  {
    if ((this.field_type & 0x100) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean Oe()
  {
    if ((this.field_type & 0x800) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean Of()
  {
    if ((0x8000 & this.field_type) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void Og()
  {
    AppMethodBeat.i(59644);
    setType(this.field_type | 0x8000);
    AppMethodBeat.o(59644);
  }

  public final int Oh()
  {
    return (int)this.ewQ;
  }

  public final String Oi()
  {
    AppMethodBeat.i(59648);
    String str;
    if (ewR != null)
    {
      str = ewR.jdMethod_do(this.field_username);
      if (str == null)
        break label42;
      AppMethodBeat.o(59648);
    }
    while (true)
    {
      return str;
      str = null;
      break;
      label42: if ((this.field_nickname == null) || (this.field_nickname.length() <= 0))
      {
        str = Ok();
        AppMethodBeat.o(59648);
      }
      else
      {
        str = this.field_nickname;
        AppMethodBeat.o(59648);
      }
    }
  }

  public final String Oj()
  {
    AppMethodBeat.i(59649);
    String str;
    if ((this.field_conRemark != null) && (!this.field_conRemark.trim().equals("")))
    {
      str = this.field_conRemark;
      AppMethodBeat.o(59649);
    }
    while (true)
    {
      return str;
      str = Oi();
      AppMethodBeat.o(59649);
    }
  }

  public final String Ok()
  {
    AppMethodBeat.i(59650);
    String str = Hq();
    if (!bo.isNullOrNil(str))
      AppMethodBeat.o(59650);
    while (true)
    {
      return str;
      str = kO(this.field_username);
      if ((str != null) && (str.length() != 0))
      {
        AppMethodBeat.o(59650);
      }
      else
      {
        str = this.field_username;
        AppMethodBeat.o(59650);
      }
    }
  }

  public final int Ol()
  {
    AppMethodBeat.i(59652);
    int i = super.getSource();
    AppMethodBeat.o(59652);
    return i;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(59655);
    super.d(paramCursor);
    this.ewQ = this.xDa;
    super.H(null);
    AppMethodBeat.o(59655);
  }

  public final void eC(long paramLong)
  {
    AppMethodBeat.i(59678);
    if (!bo.af(this.dtU, paramLong))
    {
      super.eC(paramLong);
      Om();
    }
    AppMethodBeat.o(59678);
  }

  public final int getSource()
  {
    AppMethodBeat.i(59651);
    int i = super.getSource();
    AppMethodBeat.o(59651);
    return i % 1000000;
  }

  public final void hA(int paramInt)
  {
    AppMethodBeat.i(59676);
    if (!bo.gW(this.dtS, paramInt))
    {
      super.hA(paramInt);
      Om();
    }
    AppMethodBeat.o(59676);
  }

  public final void hB(int paramInt)
  {
    AppMethodBeat.i(59679);
    if (!bo.gW(this.uin, paramInt))
    {
      super.hB(paramInt);
      Om();
    }
    AppMethodBeat.o(59679);
  }

  public final void hC(int paramInt)
  {
    AppMethodBeat.i(59682);
    if (!bo.gW(this.dtW, paramInt))
    {
      super.hC(paramInt);
      Om();
    }
    AppMethodBeat.o(59682);
  }

  public final void hD(int paramInt)
  {
    AppMethodBeat.i(59683);
    if (!bo.gW(this.dtX, paramInt))
    {
      super.hD(paramInt);
      Om();
    }
    AppMethodBeat.o(59683);
  }

  public final void hE(int paramInt)
  {
    AppMethodBeat.i(59686);
    if (!bo.gW(this.dua, paramInt))
    {
      super.hE(paramInt);
      Om();
    }
    AppMethodBeat.o(59686);
  }

  public final void hF(int paramInt)
  {
    AppMethodBeat.i(59687);
    if (!bo.gW(this.dub, paramInt))
    {
      super.hF(paramInt);
      Om();
    }
    AppMethodBeat.o(59687);
  }

  public final void hG(int paramInt)
  {
    AppMethodBeat.i(59692);
    if (!bo.gW(this.duf, paramInt))
    {
      super.hG(paramInt);
      Om();
    }
    AppMethodBeat.o(59692);
  }

  public final void hH(int paramInt)
  {
    AppMethodBeat.i(59697);
    if (!bo.gW(this.duj, paramInt))
    {
      super.hH(paramInt);
      Om();
    }
    AppMethodBeat.o(59697);
  }

  public final void hI(int paramInt)
  {
    AppMethodBeat.i(59698);
    if (!bo.gW(this.duk, paramInt))
    {
      super.hI(paramInt);
      Om();
    }
    AppMethodBeat.o(59698);
  }

  public final void hu(int paramInt)
  {
    AppMethodBeat.i(59663);
    if (!bo.gW(this.field_showHead, paramInt))
    {
      super.hu(paramInt);
      Om();
    }
    AppMethodBeat.o(59663);
  }

  public final void hv(int paramInt)
  {
    AppMethodBeat.i(59665);
    if (!bo.gW(this.field_weiboFlag, paramInt))
    {
      super.hv(paramInt);
      Om();
    }
    AppMethodBeat.o(59665);
  }

  public final void hw(int paramInt)
  {
    AppMethodBeat.i(59670);
    if (!bo.gW(this.field_verifyFlag, paramInt))
    {
      super.hw(paramInt);
      Om();
    }
    AppMethodBeat.o(59670);
  }

  public final void hx(int paramInt)
  {
    AppMethodBeat.i(59672);
    if (!bo.gW(this.field_chatroomFlag, paramInt))
    {
      super.hx(paramInt);
      Om();
    }
    AppMethodBeat.o(59672);
  }

  public final void hy(int paramInt)
  {
    AppMethodBeat.i(59673);
    if (!bo.gW(this.field_deleteFlag, paramInt))
    {
      super.hy(paramInt);
      Om();
    }
    AppMethodBeat.o(59673);
  }

  public final void hz(int paramInt)
  {
    AppMethodBeat.i(59675);
    if (!bo.gW(this.dtR, paramInt))
    {
      super.hz(paramInt);
      Om();
    }
    AppMethodBeat.o(59675);
  }

  public final void iA(String paramString)
  {
    AppMethodBeat.i(59659);
    if (!bo.isEqual(this.field_domainList, paramString))
    {
      super.iA(paramString);
      Om();
    }
    AppMethodBeat.o(59659);
  }

  public final void iB(String paramString)
  {
    AppMethodBeat.i(59660);
    if (!bo.isEqual(this.field_nickname, paramString))
    {
      super.iB(paramString);
      Om();
    }
    AppMethodBeat.o(59660);
  }

  public final void iC(String paramString)
  {
    AppMethodBeat.i(59661);
    if (!bo.isEqual(Ht(), paramString))
    {
      super.iC(paramString);
      Om();
    }
    AppMethodBeat.o(59661);
  }

  public final void iD(String paramString)
  {
    AppMethodBeat.i(59662);
    if (!bo.isEqual(Hu(), paramString))
    {
      super.iD(paramString);
      Om();
    }
    AppMethodBeat.o(59662);
  }

  public final void iE(String paramString)
  {
    AppMethodBeat.i(59666);
    if (!bo.isEqual(this.field_weiboNickname, paramString))
    {
      super.iE(paramString);
      Om();
    }
    AppMethodBeat.o(59666);
  }

  public final void iF(String paramString)
  {
    AppMethodBeat.i(59667);
    if (!bo.isEqual(this.field_conRemarkPYFull, paramString))
    {
      super.iF(paramString);
      Om();
    }
    AppMethodBeat.o(59667);
  }

  public final void iG(String paramString)
  {
    AppMethodBeat.i(59668);
    if (!bo.isEqual(this.field_conRemarkPYShort, paramString))
    {
      super.iG(paramString);
      Om();
    }
    AppMethodBeat.o(59668);
  }

  public final void iH(String paramString)
  {
    AppMethodBeat.i(59671);
    if (!bo.isEqual(this.field_encryptUsername, paramString))
    {
      super.iH(paramString);
      Om();
    }
    AppMethodBeat.o(59671);
  }

  public final void iI(String paramString)
  {
    AppMethodBeat.i(59674);
    if (!bo.isEqual(this.field_contactLabelIds, paramString))
    {
      super.iI(paramString);
      Om();
    }
    AppMethodBeat.o(59674);
  }

  public final void iK(String paramString)
  {
    AppMethodBeat.i(59707);
    if (!bo.isEqual(this.field_openImAppid, paramString))
    {
      super.iK(paramString);
      Om();
    }
    AppMethodBeat.o(59707);
  }

  public final void iL(String paramString)
  {
    AppMethodBeat.i(59677);
    if (!bo.isEqual(this.dtT, paramString))
    {
      super.iL(paramString);
      Om();
    }
    AppMethodBeat.o(59677);
  }

  public final void iM(String paramString)
  {
    AppMethodBeat.i(59680);
    if (!bo.isEqual(this.dtV, paramString))
    {
      super.iM(paramString);
      Om();
    }
    AppMethodBeat.o(59680);
  }

  public final void iN(String paramString)
  {
    AppMethodBeat.i(59681);
    if (!bo.isEqual(this.cFl, paramString))
    {
      super.iN(paramString);
      Om();
    }
    AppMethodBeat.o(59681);
  }

  public final void iO(String paramString)
  {
    AppMethodBeat.i(59684);
    if (!bo.isEqual(this.dtY, paramString))
    {
      super.iO(paramString);
      Om();
    }
    AppMethodBeat.o(59684);
  }

  public final void iP(String paramString)
  {
    AppMethodBeat.i(59685);
    if (!bo.isEqual(this.dtZ, paramString))
    {
      super.iP(paramString);
      Om();
    }
    AppMethodBeat.o(59685);
  }

  public final void iQ(String paramString)
  {
    AppMethodBeat.i(59688);
    if (!bo.isEqual(this.signature, paramString))
    {
      super.iQ(paramString);
      Om();
    }
    AppMethodBeat.o(59688);
  }

  public void iR(String paramString)
  {
    AppMethodBeat.i(59689);
    if (!bo.isEqual(getProvince(), paramString))
    {
      super.iR(paramString);
      Om();
    }
    AppMethodBeat.o(59689);
  }

  public void iS(String paramString)
  {
    AppMethodBeat.i(59690);
    if (!bo.isEqual(getCity(), paramString))
    {
      super.iS(paramString);
      Om();
    }
    AppMethodBeat.o(59690);
  }

  public final void iT(String paramString)
  {
    AppMethodBeat.i(59691);
    if (!bo.isEqual(this.due, paramString))
    {
      super.iT(paramString);
      Om();
    }
    AppMethodBeat.o(59691);
  }

  public final void iU(String paramString)
  {
    AppMethodBeat.i(59694);
    if (!bo.isEqual(this.dug, paramString))
    {
      super.iU(paramString);
      Om();
    }
    AppMethodBeat.o(59694);
  }

  public final void iV(String paramString)
  {
    AppMethodBeat.i(59695);
    if (!bo.isEqual(this.duh, paramString))
    {
      super.iV(paramString);
      Om();
    }
    AppMethodBeat.o(59695);
  }

  public void iW(String paramString)
  {
    AppMethodBeat.i(59696);
    if (!bo.isEqual(this.dui, paramString))
    {
      super.iW(paramString);
      Om();
    }
    AppMethodBeat.o(59696);
  }

  public final void iX(String paramString)
  {
    AppMethodBeat.i(59699);
    if (!bo.isEqual(this.dul, paramString))
    {
      super.iX(paramString);
      Om();
    }
    AppMethodBeat.o(59699);
  }

  public final void iY(String paramString)
  {
    AppMethodBeat.i(59700);
    if (!bo.isEqual(this.dum, paramString))
    {
      super.iY(paramString);
      Om();
    }
    AppMethodBeat.o(59700);
  }

  public final void iZ(String paramString)
  {
    AppMethodBeat.i(59701);
    if (!bo.isEqual(this.dun, paramString))
    {
      super.iZ(paramString);
      Om();
    }
    AppMethodBeat.o(59701);
  }

  public final boolean isHidden()
  {
    if ((this.field_type & 0x20) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void iy(String paramString)
  {
    AppMethodBeat.i(59657);
    if (!bo.isEqual(Hq(), paramString))
    {
      super.iy(paramString);
      Om();
    }
    AppMethodBeat.o(59657);
  }

  public final void iz(String paramString)
  {
    AppMethodBeat.i(59658);
    if (!bo.isEqual(this.field_conRemark, paramString))
    {
      super.iz(paramString);
      Om();
    }
    AppMethodBeat.o(59658);
  }

  public final void ja(String paramString)
  {
    AppMethodBeat.i(59702);
    if (!bo.isEqual(this.duo, paramString))
    {
      super.ja(paramString);
      Om();
    }
    AppMethodBeat.o(59702);
  }

  public final void jb(String paramString)
  {
    AppMethodBeat.i(59703);
    if (!bo.isEqual(this.dup, paramString))
    {
      super.jb(paramString);
      Om();
    }
    AppMethodBeat.o(59703);
  }

  public final void jc(String paramString)
  {
    AppMethodBeat.i(59704);
    if (!bo.isEqual(this.duq, paramString))
    {
      super.jc(paramString);
      Om();
    }
    AppMethodBeat.o(59704);
  }

  public final void jd(String paramString)
  {
    AppMethodBeat.i(59705);
    if (!bo.isEqual(this.dur, paramString))
    {
      super.jd(paramString);
      Om();
    }
    AppMethodBeat.o(59705);
  }

  public final void je(String paramString)
  {
    AppMethodBeat.i(59706);
    if (!bo.isEqual(this.dus, paramString))
    {
      super.je(paramString);
      Om();
    }
    AppMethodBeat.o(59706);
  }

  public final void ji(int paramInt)
  {
    AppMethodBeat.i(59654);
    hx(this.field_chatroomFlag & 0xFFFFFFFE | paramInt & 0x1);
    AppMethodBeat.o(59654);
  }

  public final void setSource(int paramInt)
  {
    AppMethodBeat.i(59693);
    if (!bo.gW(super.getSource(), paramInt))
    {
      super.setSource(paramInt);
      Om();
    }
    AppMethodBeat.o(59693);
  }

  public final void setType(int paramInt)
  {
    AppMethodBeat.i(59664);
    if (!bo.gW(this.field_type, paramInt))
    {
      super.setType(paramInt);
      Om();
    }
    AppMethodBeat.o(59664);
  }

  public final void setUsername(String paramString)
  {
    AppMethodBeat.i(59656);
    if (!bo.isEqual(this.field_username, paramString))
    {
      super.setUsername(paramString);
      Om();
    }
    AppMethodBeat.o(59656);
  }

  public static abstract interface a
  {
    public abstract String jdMethod_do(String paramString);

    public abstract String dp(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.a
 * JD-Core Version:    0.6.2
 */