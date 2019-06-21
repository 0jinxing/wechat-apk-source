package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.y;

public final class a
{
  String bCu;
  public int bJt;
  private String cvZ;
  public String dtV;
  public String eBb;
  public String frQ;
  public int frT;
  public String guC;
  long guD;
  public String guE;
  public String guF;
  String guG;
  String guH;
  public String guI;
  public int guJ;
  public byte[] guK;
  public int guL;
  public String guM;
  public int guN;
  public String guO;
  public String guP;
  public String guQ;
  int guR;
  public String guS;
  int guT;
  int guU;
  String guV;
  public String guW;
  String guX;
  int guY;
  String guZ;
  long gva;
  int gvb;
  String gvc;
  String gvd;
  String gve;
  public long gvf;
  private int id;
  public int status;
  public int type;
  public String username;

  public a()
  {
    AppMethodBeat.i(108301);
    this.bJt = -1;
    this.id = 0;
    this.cvZ = "";
    this.guC = "";
    this.guD = 0L;
    this.eBb = "";
    this.guE = "";
    this.guF = "";
    this.username = "";
    this.bCu = "";
    this.guG = "";
    this.guH = "";
    this.type = 0;
    this.guI = "";
    this.dtV = "";
    this.status = 0;
    this.frQ = "";
    this.frT = 0;
    this.guJ = 0;
    this.guM = "";
    this.guN = 0;
    this.guO = "";
    this.guP = "";
    this.guQ = "";
    this.guR = 0;
    this.guS = "";
    this.guT = 0;
    this.guU = 0;
    this.guV = "";
    this.guW = "";
    this.guX = "";
    this.guY = -1;
    this.guZ = "";
    this.gva = -1L;
    this.gvb = -1;
    this.gvc = "";
    this.gvd = "";
    this.gve = "";
    this.gvf = 0L;
    AppMethodBeat.o(108301);
  }

  private void ah(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108303);
    try
    {
      y localy = new com/tencent/mm/sdk/platformtools/y;
      localy.<init>();
      int i = localy.bX(paramArrayOfByte);
      if (i != 0)
      {
        ab.e("MicroMsg.AddrUpload", "parse LVBuffer error:".concat(String.valueOf(i)));
        AppMethodBeat.o(108303);
      }
      while (true)
      {
        return;
        this.guM = localy.getString();
        this.guN = localy.getInt();
        this.guO = localy.getString();
        this.guP = localy.getString();
        this.guQ = localy.getString();
        this.guR = localy.getInt();
        this.guS = localy.getString();
        this.guT = localy.getInt();
        this.guU = localy.getInt();
        this.guV = localy.getString();
        this.guW = localy.getString();
        this.guX = localy.getString();
        this.guY = localy.getInt();
        this.guZ = localy.getString();
        this.gva = localy.getLong();
        this.gvb = localy.getInt();
        this.gvc = localy.getString();
        this.gvd = localy.getString();
        this.gve = localy.getString();
        this.gvf = localy.getLong();
        AppMethodBeat.o(108303);
      }
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AddrUpload", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(108303);
      }
    }
  }

  private byte[] apy()
  {
    AppMethodBeat.i(108305);
    try
    {
      Object localObject1 = new com/tencent/mm/sdk/platformtools/y;
      ((y)localObject1).<init>();
      ((y)localObject1).dog();
      ((y)localObject1).amu(this.guM);
      ((y)localObject1).LY(this.guN);
      ((y)localObject1).amu(this.guO);
      ((y)localObject1).amu(this.guP);
      ((y)localObject1).amu(this.guQ);
      ((y)localObject1).LY(this.guR);
      ((y)localObject1).amu(this.guS);
      ((y)localObject1).LY(this.guT);
      ((y)localObject1).LY(this.guU);
      ((y)localObject1).amu(this.guV);
      ((y)localObject1).amu(this.guW);
      ((y)localObject1).amu(this.guX);
      ((y)localObject1).LY(this.guY);
      ((y)localObject1).amu(this.guZ);
      ((y)localObject1).mq(this.gva);
      ((y)localObject1).LY(this.gvb);
      ((y)localObject1).amu(this.gvc);
      ((y)localObject1).amu(this.gvd);
      ((y)localObject1).amu(this.gve);
      ((y)localObject1).mq(this.gvf);
      localObject1 = ((y)localObject1).doh();
      AppMethodBeat.o(108305);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AddrUpload", localException, "", new Object[0]);
        Object localObject2 = null;
        AppMethodBeat.o(108305);
      }
    }
  }

  public static int vR(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(108306);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("0x");
      j = bo.anc(paramString.substring(0, 8));
      AppMethodBeat.o(108306);
      return j;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AddrUpload", localException, "md5: %s", new Object[] { paramString });
        int j = i;
      }
    }
  }

  public final String Aq()
  {
    if (this.cvZ == null);
    for (String str = ""; ; str = this.cvZ)
      return str;
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(108304);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x1) != 0)
      localContentValues.put("id", Integer.valueOf(this.id));
    if ((this.bJt & 0x2) != 0)
      localContentValues.put("md5", Aq());
    if ((this.bJt & 0x4) != 0)
      localContentValues.put("peopleid", apz());
    if ((this.bJt & 0x8) != 0)
      localContentValues.put("uploadtime", Long.valueOf(this.guD));
    if ((this.bJt & 0x10) != 0)
      localContentValues.put("realname", apA());
    if ((this.bJt & 0x20) != 0)
      localContentValues.put("realnamepyinitial", apB());
    if ((this.bJt & 0x40) != 0)
      localContentValues.put("realnamequanpin", apC());
    if ((this.bJt & 0x80) != 0)
      localContentValues.put("username", getUsername());
    if ((this.bJt & 0x100) != 0)
      localContentValues.put("nickname", apD());
    if ((this.bJt & 0x200) != 0)
      localContentValues.put("nicknamepyinitial", apE());
    if ((this.bJt & 0x400) != 0)
      localContentValues.put("nicknamequanpin", apF());
    if ((this.bJt & 0x800) != 0)
      localContentValues.put("type", Integer.valueOf(this.type));
    if ((this.bJt & 0x1000) != 0)
      localContentValues.put("moblie", apG());
    if ((this.bJt & 0x2000) != 0)
      localContentValues.put("email", getEmail());
    int i;
    if ((this.bJt & 0x4000) != 0)
    {
      i = this.status;
      if (i != 0)
        break label486;
      localContentValues.put("status", Integer.valueOf(65536));
    }
    while (true)
    {
      if ((this.bJt & 0x8000) != 0)
        localContentValues.put("reserved1", this.frQ);
      if ((this.bJt & 0x20000) != 0)
        localContentValues.put("reserved3", Integer.valueOf(this.guJ));
      if ((this.bJt & 0x40000) != 0)
        localContentValues.put("reserved4", Integer.valueOf(this.frT));
      if ((this.bJt & 0x80000) != 0)
      {
        this.guK = apy();
        localContentValues.put("lvbuf", this.guK);
      }
      if ((this.bJt & 0x100000) != 0)
        localContentValues.put("showhead", Integer.valueOf(this.guL));
      AppMethodBeat.o(108304);
      return localContentValues;
      label486: localContentValues.put("status", Integer.valueOf(i));
    }
  }

  public final int Ny()
  {
    AppMethodBeat.i(108308);
    int i = 32;
    int j;
    if (!bo.isNullOrNil(apB()))
    {
      i = apB().charAt(0);
      if ((i < 97) || (i > 122))
        break label76;
      j = (char)(i - 32);
    }
    while (true)
    {
      AppMethodBeat.o(108308);
      return j;
      if (bo.isNullOrNil(apC()))
        break;
      i = apC().charAt(0);
      break;
      label76: if (i >= 65)
      {
        j = i;
        if (i <= 90);
      }
      else
      {
        j = 123;
      }
    }
  }

  public final String apA()
  {
    if (this.eBb == null);
    for (String str = ""; ; str = this.eBb)
      return str;
  }

  public final String apB()
  {
    if (this.guE == null);
    for (String str = ""; ; str = this.guE)
      return str;
  }

  public final String apC()
  {
    if (this.guF == null);
    for (String str = ""; ; str = this.guF)
      return str;
  }

  public final String apD()
  {
    if (this.bCu == null);
    for (String str = ""; ; str = this.bCu)
      return str;
  }

  public final String apE()
  {
    if (this.guG == null);
    for (String str = ""; ; str = this.guG)
      return str;
  }

  public final String apF()
  {
    if (this.guH == null);
    for (String str = ""; ; str = this.guH)
      return str;
  }

  public final String apG()
  {
    if (this.guI == null);
    for (String str = ""; ; str = this.guI)
      return str;
  }

  public final void apH()
  {
    this.guJ |= 1;
  }

  public final boolean apI()
  {
    if ((this.guJ & 0x1) == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String apz()
  {
    if (this.guC == null);
    for (String str = ""; ; str = this.guC)
      return str;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(108302);
    vS(paramCursor.getString(1));
    this.guC = paramCursor.getString(2);
    this.guD = paramCursor.getLong(3);
    this.eBb = paramCursor.getString(4);
    this.guE = paramCursor.getString(5);
    this.guF = paramCursor.getString(6);
    this.username = paramCursor.getString(7);
    this.bCu = paramCursor.getString(8);
    this.guG = paramCursor.getString(9);
    this.guH = paramCursor.getString(10);
    this.type = paramCursor.getInt(11);
    this.guI = paramCursor.getString(12);
    this.dtV = paramCursor.getString(13);
    int i = paramCursor.getInt(14);
    if (i == 65536);
    for (this.status = 0; ; this.status = i)
    {
      this.guJ = paramCursor.getInt(17);
      this.frQ = paramCursor.getString(15);
      this.frT = paramCursor.getInt(18);
      this.guK = paramCursor.getBlob(19);
      if (!bo.cb(this.guK))
        ah(this.guK);
      this.guL = paramCursor.getInt(20);
      AppMethodBeat.o(108302);
      return;
    }
  }

  public final String getEmail()
  {
    if (this.dtV == null);
    for (String str = ""; ; str = this.dtV)
      return str;
  }

  public final String getUsername()
  {
    if (this.username == null);
    for (String str = ""; ; str = this.username)
      return str;
  }

  public final void vS(String paramString)
  {
    AppMethodBeat.i(108307);
    this.cvZ = paramString;
    this.id = vR(paramString);
    AppMethodBeat.o(108307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.a
 * JD-Core Version:    0.6.2
 */