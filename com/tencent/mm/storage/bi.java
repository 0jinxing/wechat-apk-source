package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.s;
import com.tencent.mm.ay.a.a;
import com.tencent.mm.g.a.nk;
import com.tencent.mm.g.a.qc;
import com.tencent.mm.g.a.qe;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;
import junit.framework.Assert;

public final class bi extends s
{
  public static String xZb = "voip_content_voice";
  public static String xZc = "voip_content_video";
  public boolean xZd;
  private String xZe;

  public bi()
  {
    this.xZd = false;
  }

  public bi(String paramString)
  {
    AppMethodBeat.i(60155);
    this.xZd = false;
    super.ju(paramString);
    AppMethodBeat.o(60155);
  }

  private static boolean Cj()
  {
    AppMethodBeat.i(60195);
    String str = ((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("TranslateMsgOff");
    boolean bool;
    if (bo.isNullOrNil(str))
    {
      AppMethodBeat.o(60195);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (bo.ank(str) != 0)
      {
        ab.d("MicroMsg.MsgInfo", "isTranslateFeatureOn false");
        bool = false;
        AppMethodBeat.o(60195);
      }
      else
      {
        AppMethodBeat.o(60195);
        bool = true;
      }
    }
  }

  public static boolean aT(Map<String, String> paramMap)
  {
    AppMethodBeat.i(60200);
    if ((paramMap != null) && (paramMap.containsKey(".sysmsg.$type")) && (((String)paramMap.get(".sysmsg.$type")).equalsIgnoreCase("NewXmlChatRoomAccessVerifyApplication")));
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.MsgInfo", "isAddChatroomInviteMsg:%s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(60200);
      return bool;
    }
  }

  public static boolean aU(Map<String, String> paramMap)
  {
    AppMethodBeat.i(60201);
    if ((paramMap != null) && (paramMap.containsKey(".sysmsg.$type")) && (((String)paramMap.get(".sysmsg.$type")).equalsIgnoreCase("NewXmlChatRoomAccessVerifyApproval")));
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.MsgInfo", "isAddChatroomInviteAcceptMsg:%s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(60201);
      return bool;
    }
  }

  public static bi ar(bi parambi)
  {
    AppMethodBeat.i(60182);
    if (parambi == null)
    {
      ab.d("MicroMsg.MsgInfo", "convertFrom msg is null ");
      parambi = null;
      AppMethodBeat.o(60182);
    }
    while (true)
    {
      return parambi;
      bi localbi = new bi();
      localbi.setMsgId(parambi.field_msgId);
      localbi.eI(parambi.field_msgSvrId);
      localbi.setType(parambi.getType());
      localbi.setStatus(parambi.field_status);
      localbi.hO(parambi.field_isSend);
      localbi.field_isShowTimer = parambi.field_isShowTimer;
      localbi.dJj = true;
      localbi.eJ(parambi.field_createTime);
      localbi.ju(parambi.field_talker);
      localbi.setContent(parambi.field_content);
      localbi.jv(parambi.field_imgPath);
      localbi.jw(parambi.field_reserved);
      localbi.I(parambi.field_lvbuffer);
      localbi.jx(parambi.field_transContent);
      localbi.jz(parambi.dJv);
      localbi.ht(parambi.dqI);
      localbi.ix(parambi.dqJ);
      AppMethodBeat.o(60182);
      parambi = localbi;
    }
  }

  private boolean dtG()
  {
    AppMethodBeat.i(60184);
    boolean bool;
    if ((!isText()) && (!bAC()) && (!dtw()))
    {
      bool = true;
      AppMethodBeat.o(60184);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60184);
    }
  }

  public static void mS(long paramLong)
  {
    AppMethodBeat.i(60203);
    if ((100000000L > paramLong) && (-10L < paramLong));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("msgId not in the reasonable scope", bool);
      AppMethodBeat.o(60203);
      return;
    }
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(60204);
    mS(this.field_msgId);
    ContentValues localContentValues = super.Hl();
    AppMethodBeat.o(60204);
    return localContentValues;
  }

  public final void Mr(int paramInt)
  {
    AppMethodBeat.i(60194);
    switch (paramInt)
    {
    default:
      ab.w("MicroMsg.MsgInfo", "Illgeal forwardflag !!!");
      AppMethodBeat.o(60194);
    case 0:
    case 1:
    }
    while (true)
    {
      return;
      ht(this.dqI | paramInt);
      AppMethodBeat.o(60194);
    }
  }

  public final boolean apB(String paramString)
  {
    AppMethodBeat.i(60198);
    Object localObject;
    boolean bool;
    if ((!bo.isNullOrNil(this.dqJ)) && (!bo.isNullOrNil(paramString)))
    {
      localObject = br.z(this.dqJ, "msgsource");
      if (localObject == null)
      {
        AppMethodBeat.o(60198);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      localObject = (String)((Map)localObject).get(".msgsource.atuserlist");
      if (!bo.isNullOrNil((String)localObject))
      {
        localObject = ((String)localObject).split(",");
        int i = localObject.length;
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label121;
          if (localObject[j].trim().equals(paramString))
          {
            bool = true;
            AppMethodBeat.o(60198);
            break;
          }
        }
      }
      label121: AppMethodBeat.o(60198);
      bool = false;
    }
  }

  public final boolean bAA()
  {
    AppMethodBeat.i(60156);
    boolean bool;
    if ((getType() & 0xFFFF) == 49)
    {
      bool = true;
      AppMethodBeat.o(60156);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60156);
    }
  }

  public final boolean bAC()
  {
    AppMethodBeat.i(60168);
    boolean bool;
    if (getType() == 48)
    {
      bool = true;
      AppMethodBeat.o(60168);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60168);
    }
  }

  public final boolean bws()
  {
    AppMethodBeat.i(60171);
    boolean bool;
    if (getType() == 43)
    {
      bool = true;
      AppMethodBeat.o(60171);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60171);
    }
  }

  public final boolean bwt()
  {
    AppMethodBeat.i(60172);
    boolean bool;
    if (getType() == 62)
    {
      bool = true;
      AppMethodBeat.o(60172);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60172);
    }
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(60202);
    super.d(paramCursor);
    paramCursor = this.field_content;
    if ((paramCursor != null) && (paramCursor.length() > 2097152))
    {
      final long l = this.field_msgId;
      StringBuilder localStringBuilder = new StringBuilder(1024);
      localStringBuilder.append("Very big message: \nmsgId = ").append(l).append('\n').append("msgSvrId = ").append(this.field_msgSvrId).append('\n').append("type = ").append(getType()).append('\n').append("createTime = ").append(this.field_createTime).append('\n').append("talker = ").append(this.field_talker).append('\n').append("flag = ").append(this.field_flag).append('\n').append("content.length() = ").append(paramCursor.length()).append('\n').append("content = ").append(paramCursor.substring(0, 256));
      ab.e("MicroMsg.MsgInfo", localStringBuilder.toString());
      setType(1);
      setContent("");
      paramCursor = ar(this);
      g.RS().aa(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(60140);
          ((j)g.K(j.class)).bOr().a(l, this.xZf);
          AppMethodBeat.o(60140);
        }
      });
    }
    mS(this.field_msgId);
    AppMethodBeat.o(60202);
  }

  public final boolean drC()
  {
    AppMethodBeat.i(60157);
    boolean bool;
    if (getType() == 285212721)
    {
      bool = true;
      AppMethodBeat.o(60157);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60157);
    }
  }

  public final boolean drD()
  {
    AppMethodBeat.i(60158);
    boolean bool;
    if (getType() == 34)
    {
      bool = true;
      AppMethodBeat.o(60158);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60158);
    }
  }

  public final boolean drE()
  {
    AppMethodBeat.i(60166);
    boolean bool;
    switch (getType())
    {
    default:
      bool = false;
      AppMethodBeat.o(60166);
    case 3:
    case 13:
    case 23:
    case 33:
    case 39:
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(60166);
    }
  }

  public final boolean dtA()
  {
    AppMethodBeat.i(60176);
    boolean bool;
    if (getType() == 268435505)
    {
      bool = true;
      AppMethodBeat.o(60176);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60176);
    }
  }

  public final boolean dtB()
  {
    AppMethodBeat.i(60177);
    boolean bool;
    if (getType() == -1879048191)
    {
      bool = true;
      AppMethodBeat.o(60177);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60177);
    }
  }

  public final boolean dtC()
  {
    AppMethodBeat.i(60178);
    boolean bool;
    if (getType() == -1879048190)
    {
      bool = true;
      AppMethodBeat.o(60178);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60178);
    }
  }

  public final boolean dtD()
  {
    AppMethodBeat.i(60179);
    boolean bool;
    if (getType() == -1879048189)
    {
      bool = true;
      AppMethodBeat.o(60179);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60179);
    }
  }

  public final boolean dtE()
  {
    AppMethodBeat.i(60180);
    boolean bool;
    switch (getType())
    {
    case 56:
    default:
      bool = false;
      AppMethodBeat.o(60180);
    case 55:
    case 57:
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(60180);
    }
  }

  public final boolean dtF()
  {
    AppMethodBeat.i(60181);
    boolean bool;
    if ((Cj()) && (!bo.isNullOrNil(this.field_transContent)))
    {
      bool = true;
      AppMethodBeat.o(60181);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60181);
    }
  }

  public final boolean dtH()
  {
    if ((this.dJy & 0x1) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void dtI()
  {
    AppMethodBeat.i(60185);
    ib(this.dJy | 0x1);
    AppMethodBeat.o(60185);
  }

  public final void dtJ()
  {
    AppMethodBeat.i(60186);
    if (dtK())
      ht(this.dqI & 0xFFFFFFDF);
    AppMethodBeat.o(60186);
  }

  public final boolean dtK()
  {
    if ((this.dqI & 0x20) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void dtL()
  {
    AppMethodBeat.i(60187);
    ht(this.dqI | 0x8);
    AppMethodBeat.o(60187);
  }

  public final boolean dtM()
  {
    AppMethodBeat.i(60188);
    boolean bool;
    if ((dtF()) && ((this.dqI & 0x10) > 0))
    {
      bool = true;
      AppMethodBeat.o(60188);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60188);
    }
  }

  public final void dtN()
  {
    AppMethodBeat.i(60189);
    if (!dtF())
      AppMethodBeat.o(60189);
    while (true)
    {
      return;
      ht(this.dqI | 0x10);
      AppMethodBeat.o(60189);
    }
  }

  public final void dtO()
  {
    AppMethodBeat.i(60190);
    if (!dtF())
      AppMethodBeat.o(60190);
    while (true)
    {
      return;
      ht(this.dqI & 0xFFFFFFEF);
      AppMethodBeat.o(60190);
    }
  }

  public final boolean dtP()
  {
    AppMethodBeat.i(60191);
    boolean bool;
    if ((dtF()) && ((this.dqI & 0x400) > 0))
    {
      bool = true;
      AppMethodBeat.o(60191);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60191);
    }
  }

  public final void dtQ()
  {
    AppMethodBeat.i(60192);
    ht(this.dqI | 0x80);
    AppMethodBeat.o(60192);
  }

  public final void dtR()
  {
    AppMethodBeat.i(60193);
    ht(this.dqI & 0xFFFFFF7F);
    AppMethodBeat.o(60193);
  }

  public final boolean dtS()
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if ((this.dqI & 0x80) == 0)
    {
      bool2 = bool1;
      if ((this.dqI & 0x300) == 0)
        bool2 = false;
    }
    return bool2;
  }

  public final void dtT()
  {
    AppMethodBeat.i(60196);
    ht(this.dqI & 0xFFFFFFBF);
    AppMethodBeat.o(60196);
  }

  public final void dtU()
  {
    AppMethodBeat.i(60197);
    ht(this.dqI | 0x40);
    AppMethodBeat.o(60197);
  }

  public final boolean dtV()
  {
    AppMethodBeat.i(60199);
    if ((!bo.isNullOrNil(this.dqJ)) && ((this.dqJ.contains("announcement@all")) || (this.dqJ.contains("notify@all"))));
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.MsgInfo", "isAtAll isAtAll:%s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(60199);
      return bool;
    }
  }

  public final String dtW()
  {
    AppMethodBeat.i(60205);
    String str;
    if (!dtv())
    {
      str = "";
      AppMethodBeat.o(60205);
    }
    while (true)
    {
      return str;
      if (this.xZe == null)
        dtX();
      str = this.xZe;
      AppMethodBeat.o(60205);
    }
  }

  public final com.tencent.mm.ay.a dtX()
  {
    AppMethodBeat.i(60206);
    ab.i("MicroMsg.MsgInfo", "[parseNewXmlSysMsg]");
    com.tencent.mm.ay.a locala = a.a.b(br.z(this.field_content, "sysmsg"), this);
    if (locala != null)
    {
      ab.i("MicroMsg.MsgInfo", "BaseNewXmlMsg:%s", new Object[] { locala });
      locala.aip();
      this.xZe = locala.TEXT;
    }
    while (true)
    {
      AppMethodBeat.o(60206);
      return locala;
      ab.e("MicroMsg.MsgInfo", "[parseNewXmlSysMsg] null == pBaseNewXmlMsg");
    }
  }

  public final boolean dtp()
  {
    AppMethodBeat.i(60159);
    boolean bool;
    if (getType() == 436207665)
    {
      bool = true;
      AppMethodBeat.o(60159);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60159);
    }
  }

  public final boolean dtq()
  {
    AppMethodBeat.i(60160);
    boolean bool;
    if (getType() == 469762097)
    {
      bool = true;
      AppMethodBeat.o(60160);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60160);
    }
  }

  public final boolean dtr()
  {
    AppMethodBeat.i(60161);
    boolean bool;
    if (getType() == 301989937)
    {
      bool = true;
      AppMethodBeat.o(60161);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60161);
    }
  }

  public final boolean dts()
  {
    AppMethodBeat.i(60162);
    boolean bool;
    if ((getType() == 50) || (getType() == 53))
    {
      bool = true;
      AppMethodBeat.o(60162);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60162);
    }
  }

  public final boolean dtt()
  {
    AppMethodBeat.i(60163);
    boolean bool;
    if (getType() == 52)
    {
      bool = true;
      AppMethodBeat.o(60163);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60163);
    }
  }

  public final boolean dtu()
  {
    AppMethodBeat.i(60164);
    boolean bool;
    if (getType() == 318767153)
    {
      bool = true;
      AppMethodBeat.o(60164);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60164);
    }
  }

  public final boolean dtv()
  {
    AppMethodBeat.i(60165);
    boolean bool;
    if (getType() == 10002)
    {
      bool = true;
      AppMethodBeat.o(60165);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60165);
    }
  }

  public final boolean dtw()
  {
    AppMethodBeat.i(60167);
    boolean bool;
    if ((getType() == 42) || (getType() == 66))
    {
      bool = true;
      AppMethodBeat.o(60167);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60167);
    }
  }

  public final boolean dtx()
  {
    AppMethodBeat.i(60173);
    boolean bool;
    if (getType() == 47)
    {
      bool = true;
      AppMethodBeat.o(60173);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60173);
    }
  }

  public final boolean dty()
  {
    AppMethodBeat.i(60174);
    boolean bool;
    if (getType() == 1048625)
    {
      bool = true;
      AppMethodBeat.o(60174);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60174);
    }
  }

  public final boolean dtz()
  {
    AppMethodBeat.i(60175);
    boolean bool;
    if (getType() == 16777265)
    {
      bool = true;
      AppMethodBeat.o(60175);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60175);
    }
  }

  public final int getType()
  {
    AppMethodBeat.i(60207);
    int i = super.getType();
    if (i == 486539313)
    {
      i = 285212721;
      AppMethodBeat.o(60207);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(60207);
    }
  }

  public final boolean isSystem()
  {
    AppMethodBeat.i(60170);
    boolean bool;
    if (getType() == 10000)
    {
      bool = true;
      AppMethodBeat.o(60170);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60170);
    }
  }

  public final boolean isText()
  {
    AppMethodBeat.i(60169);
    boolean bool;
    switch (getType())
    {
    default:
      bool = false;
      AppMethodBeat.o(60169);
    case 1:
    case 11:
    case 21:
    case 31:
    case 36:
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(60169);
    }
  }

  public final void setStatus(int paramInt)
  {
    AppMethodBeat.i(60183);
    super.setStatus(paramInt);
    Object localObject;
    if ((this.field_isSend == 1) && (dtG()))
      if (this.field_status == 5)
      {
        ab.e("MicroMsg.MsgInfo", "set msg status fail, msgId:%d, type:%d, userName:%s %s", new Object[] { Long.valueOf(this.field_msgId), Integer.valueOf(getType()), this.field_talker, bo.dpG() });
        localObject = new qc();
        ((qc)localObject).cMs.csG = this;
        com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
        AppMethodBeat.o(60183);
      }
    while (true)
    {
      return;
      if (this.field_status == 2)
      {
        ab.d("MicroMsg.MsgInfo", "successfully send msgId:%d, type:%d", new Object[] { Long.valueOf(this.field_msgId), Integer.valueOf(getType()) });
        localObject = new qe();
        ((qe)localObject).cMu.csG = this;
        com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
        AppMethodBeat.o(60183);
        continue;
        if (this.field_isSend == 0)
        {
          localObject = new nk();
          ((nk)localObject).cJI.csG = this;
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
        }
      }
      else
      {
        AppMethodBeat.o(60183);
      }
    }
  }

  public static final class a
  {
    public String dFl = "";
    public int dtS;
    private String duc;
    private String dud;
    public String duh = "";
    private String dui = "";
    public String gta = "";
    public String gwF = "";
    public String gwG = "";
    public String gwH = "";
    public String gwK = "";
    public String nickname = "";
    public String pln = "";
    public long pnz = 0L;
    public int scene = 0;
    public String signature;
    private String source = "";
    public String svN = "";
    public int ufB = 0;
    public String vqs = "";
    public int xZh = 0;
    public String xZi = "";
    public String xZj = "";
    public String xZk = "";
    public String xZl = "";
    public String xZm = "";
    public String xZn = "";
    public String xZo = "";
    public String xZp = "";

    public static a apC(String paramString)
    {
      AppMethodBeat.i(60141);
      a locala = new a();
      Object localObject = bo.bc(paramString, "").trim();
      paramString = (String)localObject;
      if (!((String)localObject).startsWith("<"))
      {
        int i = ((String)localObject).indexOf(":");
        paramString = (String)localObject;
        if (i != -1)
          paramString = ((String)localObject).substring(i + 1);
      }
      localObject = br.z(paramString, "msg");
      if (localObject != null);
      try
      {
        if (((Map)localObject).get(".msg.$fromusername") == null);
        for (locala.svN = ((String)((Map)localObject).get(".msg.$username")); ((Map)localObject).get(".msg.$fromnickname") == null; locala.svN = ((String)((Map)localObject).get(".msg.$fromusername")))
        {
          locala.nickname = ((String)((Map)localObject).get(".msg.$nickname"));
          locala.dFl = ((String)((Map)localObject).get(".msg.$alias"));
          locala.gwG = ((String)((Map)localObject).get(".msg.$fullpy"));
          locala.gwF = ((String)((Map)localObject).get(".msg.$shortpy"));
          locala.source = ((String)((Map)localObject).get(".msg.$source"));
          locala.xZh = bo.getInt((String)((Map)localObject).get(".msg.$imagestatus"), 0);
          locala.scene = bo.getInt((String)((Map)localObject).get(".msg.$scene"), 0);
          locala.xZi = ((String)((Map)localObject).get(".msg.$mobileidentify"));
          locala.xZj = ((String)((Map)localObject).get(".msg.$mobilelongidentify"));
          if ((((Map)localObject).get(".msg.$qqnum") != null) && (((String)((Map)localObject).get(".msg.$qqnum")).length() > 0))
            locala.pnz = bo.getLong((String)((Map)localObject).get(".msg.$qqnum"), 0L);
          locala.signature = ((String)((Map)localObject).get(".msg.$sign"));
          if ((((Map)localObject).get(".msg.$sex") != null) && (((String)((Map)localObject).get(".msg.$sex")).length() > 0))
            locala.dtS = bo.getInt((String)((Map)localObject).get(".msg.$sex"), 0);
          locala.dud = ((String)((Map)localObject).get(".msg.$city"));
          locala.duc = ((String)((Map)localObject).get(".msg.$province"));
          locala.gwH = ((String)((Map)localObject).get(".msg.$qqnickname"));
          locala.gwK = ((String)((Map)localObject).get(".msg.$qqremark"));
          if (!TextUtils.isEmpty((CharSequence)((Map)localObject).get(".msg.$certflag")))
            break label777;
          paramString = "0";
          locala.ufB = bo.getInt(paramString, 0);
          locala.duh = bo.nullAsNil((String)((Map)localObject).get(".msg.$certinfo"));
          locala.pln = bo.nullAsNil((String)((Map)localObject).get(".msg.$brandIconUrl"));
          locala.dui = bo.nullAsNil((String)((Map)localObject).get(".msg.$regionCode"));
          locala.xZk = bo.nullAsNil((String)((Map)localObject).get(".msg.$bigheadimgurl"));
          locala.xZl = bo.nullAsNil((String)((Map)localObject).get(".msg.$smallheadimgurl"));
          locala.gta = bo.nullAsNil((String)((Map)localObject).get(".msg.$googlecontact"));
          locala.vqs = bo.nullAsNil((String)((Map)localObject).get(".msg.$antispamticket"));
          locala.xZm = bo.nullAsNil((String)((Map)localObject).get(".msg.$openimappid"));
          locala.xZn = bo.nullAsNil((String)((Map)localObject).get(".msg.$openimdesc"));
          locala.xZo = bo.nullAsNil((String)((Map)localObject).get(".msg.$openimdescicon"));
          locala.xZp = bo.nullAsNil((String)((Map)localObject).get(".msg.$openimcustominfo"));
          if (ad.aox(locala.svN))
            locala.vqs = bo.nullAsNil((String)((Map)localObject).get(".msg.$ticket"));
          ab.i("MicroMsg.MsgInfo", "dkverify FriendContent user:[%s] ticket:[%s] big:[%s] sm:[%s]", new Object[] { locala.svN, locala.vqs, locala.xZk, locala.xZl });
          AppMethodBeat.o(60141);
          return locala;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.MsgInfo", "exception:%s", new Object[] { bo.l(paramString) });
          continue;
          locala.nickname = ((String)((Map)localObject).get(".msg.$fromnickname"));
          continue;
          label777: paramString = (String)((Map)localObject).get(".msg.$certflag");
        }
      }
    }

    public final String dtY()
    {
      return this.svN;
    }

    public final String dtZ()
    {
      AppMethodBeat.i(60143);
      String str;
      if ((this.gwK != null) && (this.gwK.length() > 0))
      {
        str = this.gwK;
        AppMethodBeat.o(60143);
      }
      while (true)
      {
        return str;
        if ((this.gwH != null) && (this.gwH.length() > 0))
        {
          str = this.gwH;
          AppMethodBeat.o(60143);
        }
        else
        {
          str = Long.toString(this.pnz);
          AppMethodBeat.o(60143);
        }
      }
    }

    public final String getCity()
    {
      AppMethodBeat.i(60144);
      Object localObject;
      if (!bo.isNullOrNil(this.dui))
      {
        localObject = this.dui.split("_");
        if (localObject.length > 0)
        {
          if (localObject.length <= 2)
            break label71;
          RegionCodeDecoder.duj();
          this.dud = RegionCodeDecoder.aD(localObject[0], localObject[1], localObject[2]);
        }
      }
      while (true)
      {
        localObject = this.dud;
        AppMethodBeat.o(60144);
        return localObject;
        label71: if (localObject.length == 2)
        {
          RegionCodeDecoder.duj();
          this.dud = RegionCodeDecoder.id(localObject[0], localObject[1]);
        }
        else
        {
          this.dud = "";
        }
      }
    }

    public final String getDisplayName()
    {
      AppMethodBeat.i(60142);
      String str;
      if (!TextUtils.isEmpty(this.nickname))
      {
        str = this.nickname;
        AppMethodBeat.o(60142);
      }
      while (true)
      {
        return str;
        if (!TextUtils.isEmpty(this.dFl))
        {
          str = this.dFl;
          AppMethodBeat.o(60142);
        }
        else
        {
          ab.f("MicroMsg.MsgInfo", "username is nullOrNil");
          str = bo.nullAsNil(this.svN);
          AppMethodBeat.o(60142);
        }
      }
    }

    public final String getProvince()
    {
      AppMethodBeat.i(60145);
      Object localObject;
      if (!bo.isNullOrNil(this.dui))
      {
        localObject = this.dui.split("_");
        if (localObject.length > 0)
        {
          if ((localObject.length <= 2) || (!RegionCodeDecoder.apQ(localObject[0])))
            break label77;
          RegionCodeDecoder.duj();
        }
      }
      for (this.duc = RegionCodeDecoder.id(localObject[0], localObject[1]); ; this.duc = RegionCodeDecoder.apR(localObject[0]))
      {
        localObject = this.duc;
        AppMethodBeat.o(60145);
        return localObject;
        label77: RegionCodeDecoder.duj();
      }
    }
  }

  public static final class b
  {
    public int cED = 0;
    public String eUu = "";
    public String label = "";
    public String nJB = "";
    public double nJu = 0.0D;
    public double nJv = 0.0D;
    public String svN = "";
    public String vaO = "";
    public String xZq = "";
    public String xZr = null;
    public String xZs = null;
    public String xZt = null;

    public static b apD(String paramString)
    {
      AppMethodBeat.i(60147);
      b localb = new b();
      paramString = br.z(paramString, "msg");
      if (paramString != null)
      {
        localb.svN = bo.bc((String)paramString.get(".msg.location.$fromusername"), "");
        localb.nJu = bo.anm((String)paramString.get(".msg.location.$x"));
        localb.nJv = bo.anm((String)paramString.get(".msg.location.$y"));
        localb.label = bo.bc((String)paramString.get(".msg.location.$label"), "");
        localb.xZq = bo.bc((String)paramString.get(".msg.location.$maptype"), "");
        localb.cED = bo.ank((String)paramString.get(".msg.location.$scale"));
        localb.xZt = bo.bc((String)paramString.get(".msg.location.$localLocationen"), "");
        localb.xZr = bo.bc((String)paramString.get(".msg.location.$localLocationcn"), "");
        localb.xZs = bo.bc((String)paramString.get(".msg.location.$localLocationtw"), "");
        localb.eUu = bo.bc((String)paramString.get(".msg.location.$poiname"), "");
        localb.vaO = bo.bc((String)paramString.get(".msg.location.$infourl"), "");
        localb.nJB = bo.bc((String)paramString.get(".msg.location.$poiid"), "");
      }
      AppMethodBeat.o(60147);
      return localb;
    }

    public final boolean dua()
    {
      AppMethodBeat.i(60148);
      boolean bool;
      if ((this.eUu != null) && (!this.eUu.equals("")) && (!this.eUu.equals("[位置]")))
      {
        bool = true;
        AppMethodBeat.o(60148);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(60148);
      }
    }

    public final boolean dub()
    {
      AppMethodBeat.i(60149);
      boolean bool;
      if ((Math.abs(this.nJv) > 180.0D) || (Math.abs(this.nJu) > 90.0D))
      {
        bool = false;
        AppMethodBeat.o(60149);
      }
      while (true)
      {
        return bool;
        bool = true;
        AppMethodBeat.o(60149);
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(60146);
      String str = String.format("%d-%d-%d", new Object[] { Integer.valueOf((int)(this.nJu * 1000000.0D)), Integer.valueOf((int)(this.nJv * 1000000.0D)), Integer.valueOf(this.cED) });
      AppMethodBeat.o(60146);
      return str;
    }
  }

  public static final class c
  {
    public String content = "";
    public String fOt = "";
    public boolean mpz = false;
    public String ptI;
    public String title = "";
    public String xZu = "";

    public static c apE(String paramString)
    {
      AppMethodBeat.i(60150);
      c localc = new c();
      paramString = br.z(paramString, "msg");
      if (paramString != null);
      try
      {
        localc.title = ((String)paramString.get(".msg.pushmail.content.subject"));
        localc.content = ((String)paramString.get(".msg.pushmail.content.digest"));
        localc.fOt = ((String)paramString.get(".msg.pushmail.content.sender"));
        localc.xZu = ((String)paramString.get(".msg.pushmail.waplink"));
        localc.mpz = bo.nullAsNil((String)paramString.get(".msg.pushmail.content.attach")).equalsIgnoreCase("true");
        localc.ptI = ((String)paramString.get(".msg.pushmail.mailid"));
        AppMethodBeat.o(60150);
        return localc;
      }
      catch (Exception paramString)
      {
        while (true)
          ab.e("MicroMsg.MsgInfo", "exception:%s", new Object[] { bo.l(paramString) });
      }
    }
  }

  public static final class d
  {
    public int cAd;
    public String chatroomName = "";
    public String content = "";
    private String countryCode;
    public String dFl = "";
    public int dtS;
    private String fno;
    private String fnp;
    public String gta;
    public String gwF = "";
    public String gwG = "";
    public String gwH = "";
    private String gwK = "";
    public String ijx;
    public String mGZ;
    public String nickname = "";
    public long pnz = 0L;
    public int scene = 0;
    public String signature;
    public String svN = "";
    public String vjM;
    public String xZA;
    public int xZh = 0;
    public String xZi = "";
    public String xZj = "";
    public String xZk = "";
    public String xZl = "";
    public int xZv = 0;
    public String xZw;
    public String xZx;
    public int xZy;
    public String xZz;

    public static d apF(String paramString)
    {
      AppMethodBeat.i(60151);
      d locald = new d();
      paramString = br.z(paramString, "msg");
      if (paramString != null);
      try
      {
        locald.svN = ((String)paramString.get(".msg.$fromusername"));
        locald.dFl = ((String)paramString.get(".msg.$alias"));
        locald.nickname = ((String)paramString.get(".msg.$fromnickname"));
        locald.gwG = ((String)paramString.get(".msg.$fullpy"));
        locald.gwF = ((String)paramString.get(".msg.$shortpy"));
        locald.content = ((String)paramString.get(".msg.$content"));
        locald.xZh = bo.getInt((String)paramString.get(".msg.$imagestatus"), 0);
        locald.scene = bo.getInt((String)paramString.get(".msg.$scene"), 0);
        locald.xZi = ((String)paramString.get(".msg.$mhash"));
        locald.xZj = ((String)paramString.get(".msg.$mfullhash"));
        if ((paramString.get(paramString.get(".msg.$qqnum")) != null) && (((String)paramString.get(paramString.get(".msg.$qqnum"))).length() > 0))
          locald.pnz = bo.getLong((String)paramString.get(".msg.$qqnum"), 0L);
        locald.gwH = ((String)paramString.get(".msg.$qqnickname"));
        locald.gwK = ((String)paramString.get(".msg.$qqremark"));
        locald.signature = ((String)paramString.get(".msg.$sign"));
        if ((paramString.get(".msg.$sex") != null) && (((String)paramString.get(".msg.$sex")).length() > 0))
          locald.dtS = bo.getInt((String)paramString.get(".msg.$sex"), 0);
        locald.fno = ((String)paramString.get(".msg.$city"));
        locald.fnp = ((String)paramString.get(".msg.$province"));
        locald.countryCode = ((String)paramString.get(".msg.$country"));
        if (paramString.get(".msg.$snsflag") != null)
        {
          locald.xZv = bo.getInt((String)paramString.get(".msg.$snsflag"), 0);
          locald.xZw = ((String)paramString.get(".msg.$snsbgimgid"));
        }
        locald.mGZ = ((String)paramString.get(".msg.$ticket"));
        ab.d("MicroMsg.MsgInfo", "dkverify ticket:%s", new Object[] { locald.mGZ });
        locald.xZk = bo.nullAsNil((String)paramString.get(".msg.$bigheadimgurl"));
        locald.xZl = bo.nullAsNil((String)paramString.get(".msg.$smallheadimgurl"));
        locald.cAd = bo.getInt((String)paramString.get(".msg.$opcode"), 0);
        locald.xZx = bo.nullAsNil((String)paramString.get(".msg.$encryptusername"));
        locald.gta = bo.nullAsNil((String)paramString.get(".msg.$googlecontact"));
        ab.d("MicroMsg.MsgInfo", "dkavatar VerifyContent user:[%s] big:[%s] sm:[%s]", new Object[] { locald.svN, locald.xZk, locald.xZl });
        locald.chatroomName = bo.nullAsNil((String)paramString.get(".msg.$chatroomusername"));
        locald.ijx = ((String)paramString.get(".msg.$sourceusername"));
        locald.vjM = ((String)paramString.get(".msg.$sourcenickname"));
        locald.xZy = bo.getInt((String)paramString.get(".msg.Antispam.$isSuspiciousUser"), 0);
        if (locald.xZy == 1)
        {
          locald.xZz = ((String)paramString.get(".msg.Antispam.safetyWarning"));
          locald.xZA = ((String)paramString.get(".msg.Antispam.safetyWarningDetail"));
        }
        AppMethodBeat.o(60151);
        return locald;
      }
      catch (Exception paramString)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.MsgInfo", paramString, "", new Object[0]);
      }
    }

    public final String Hq()
    {
      return this.dFl;
    }

    public final String Hs()
    {
      return this.nickname;
    }

    public final String Ht()
    {
      return this.gwF;
    }

    public final String Hu()
    {
      return this.gwG;
    }

    public final String dtY()
    {
      return this.svN;
    }

    public final String duc()
    {
      return this.mGZ;
    }

    public final int dud()
    {
      return this.dtS;
    }

    public final String due()
    {
      return this.signature;
    }

    public final String duf()
    {
      return this.xZx;
    }

    public final String getCity()
    {
      AppMethodBeat.i(60153);
      String str;
      if ((!bo.isNullOrNil(this.countryCode)) && (!bo.isNullOrNil(this.fnp)))
        if (bo.isNullOrNil(this.fno))
        {
          RegionCodeDecoder.duj();
          str = RegionCodeDecoder.id(this.countryCode, this.fnp);
          AppMethodBeat.o(60153);
        }
      while (true)
      {
        return str;
        RegionCodeDecoder.duj();
        str = RegionCodeDecoder.aD(this.countryCode, this.fnp, this.fno);
        AppMethodBeat.o(60153);
        continue;
        str = this.fno;
        AppMethodBeat.o(60153);
      }
    }

    public final String getDisplayName()
    {
      AppMethodBeat.i(60152);
      String str;
      if ((this.nickname != null) && (this.nickname.length() > 0))
      {
        str = this.nickname;
        AppMethodBeat.o(60152);
      }
      while (true)
      {
        return str;
        ab.f("MicroMsg.MsgInfo", "username is nullOrNil");
        str = this.svN;
        AppMethodBeat.o(60152);
      }
    }

    public final String getProvince()
    {
      AppMethodBeat.i(60154);
      String str;
      if (!bo.isNullOrNil(this.countryCode))
        if ((!bo.isNullOrNil(this.fnp)) && (!bo.isNullOrNil(this.fno)) && (RegionCodeDecoder.apQ(this.countryCode)))
        {
          RegionCodeDecoder.duj();
          str = RegionCodeDecoder.id(this.countryCode, this.fnp);
          AppMethodBeat.o(60154);
        }
      while (true)
      {
        return str;
        RegionCodeDecoder.duj();
        str = RegionCodeDecoder.apR(this.countryCode);
        AppMethodBeat.o(60154);
        continue;
        str = this.fnp;
        AppMethodBeat.o(60154);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bi
 * JD-Core Version:    0.6.2
 */