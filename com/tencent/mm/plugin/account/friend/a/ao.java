package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ao
{
  int bJt;
  String frQ;
  String frR;
  public int frS;
  public int frT;
  public long gwC;
  public int gwD;
  int gwE;
  String gwF;
  String gwG;
  String gwH;
  String gwI;
  String gwJ;
  public String gwK;
  String gwL;
  String gwM;
  public String nickname;
  public String username;

  public ao()
  {
    AppMethodBeat.i(108498);
    this.bJt = -1;
    this.gwC = 0L;
    this.gwD = 0;
    this.gwE = 0;
    this.username = "";
    this.nickname = "";
    this.gwF = "";
    this.gwG = "";
    this.gwH = "";
    this.gwI = "";
    this.gwJ = "";
    this.gwK = "";
    this.gwL = "";
    this.gwM = "";
    this.frQ = "";
    this.frR = "";
    this.frS = 0;
    this.frT = 0;
    AppMethodBeat.o(108498);
  }

  public final String Hs()
  {
    if (this.nickname == null);
    for (String str = ""; ; str = this.nickname)
      return str;
  }

  public final ContentValues aqn()
  {
    AppMethodBeat.i(108500);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x1) != 0)
      localContentValues.put("qq", Long.valueOf(this.gwC));
    int i;
    if ((this.bJt & 0x2) != 0)
    {
      i = this.gwD;
      if (i == 0)
        localContentValues.put("wexinstatus", Integer.valueOf(65536));
    }
    else
    {
      if ((this.bJt & 0x4) != 0)
        localContentValues.put("groupid", Integer.valueOf(this.gwE));
      if ((this.bJt & 0x8) != 0)
        localContentValues.put("username", getUsername());
      if ((this.bJt & 0x10) != 0)
        localContentValues.put("nickname", Hs());
      if ((this.bJt & 0x20) != 0)
      {
        if (this.gwF != null)
          break label400;
        str = "";
        label146: localContentValues.put("pyinitial", str);
      }
      if ((this.bJt & 0x40) != 0)
      {
        if (this.gwG != null)
          break label408;
        str = "";
        label173: localContentValues.put("quanpin", str);
      }
      if ((this.bJt & 0x80) != 0)
        localContentValues.put("qqnickname", aqo());
      if ((this.bJt & 0x100) != 0)
        localContentValues.put("qqpyinitial", aqp());
      if ((this.bJt & 0x200) != 0)
        localContentValues.put("qqquanpin", aqq());
      if ((this.bJt & 0x400) != 0)
        localContentValues.put("qqremark", aqr());
      if ((this.bJt & 0x800) != 0)
        localContentValues.put("qqremarkpyinitial", aqs());
      if ((this.bJt & 0x1000) != 0)
        localContentValues.put("qqremarkquanpin", aqt());
      if ((this.bJt & 0x4000) != 0)
        if (this.frR != null)
          break label416;
    }
    label400: label408: label416: for (String str = ""; ; str = this.frR)
    {
      localContentValues.put("reserved2", str);
      if ((this.bJt & 0x8000) != 0)
        localContentValues.put("reserved3", Integer.valueOf(this.frS));
      if ((this.bJt & 0x10000) != 0)
        localContentValues.put("reserved4", Integer.valueOf(this.frT));
      AppMethodBeat.o(108500);
      return localContentValues;
      localContentValues.put("wexinstatus", Integer.valueOf(i));
      break;
      str = this.gwF;
      break label146;
      str = this.gwG;
      break label173;
    }
  }

  public final String aqo()
  {
    if (this.gwH == null);
    for (String str = ""; ; str = this.gwH)
      return str;
  }

  public final String aqp()
  {
    if (this.gwI == null);
    for (String str = ""; ; str = this.gwI)
      return str;
  }

  public final String aqq()
  {
    if (this.gwJ == null);
    for (String str = ""; ; str = this.gwJ)
      return str;
  }

  public final String aqr()
  {
    if (this.gwK == null);
    for (String str = ""; ; str = this.gwK)
      return str;
  }

  public final String aqs()
  {
    if (this.gwL == null);
    for (String str = ""; ; str = this.gwL)
      return str;
  }

  public final String aqt()
  {
    if (this.gwM == null);
    for (String str = ""; ; str = this.gwM)
      return str;
  }

  public final void aqu()
  {
    this.frS |= 1;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(108499);
    this.gwC = paramCursor.getLong(0);
    int i = paramCursor.getInt(1);
    if (i == 65536);
    for (this.gwD = 0; ; this.gwD = i)
    {
      this.gwE = paramCursor.getInt(2);
      this.username = paramCursor.getString(3);
      this.nickname = paramCursor.getString(4);
      this.gwF = paramCursor.getString(5);
      this.gwG = paramCursor.getString(6);
      this.gwH = paramCursor.getString(7);
      this.gwI = paramCursor.getString(8);
      this.gwJ = paramCursor.getString(9);
      this.gwK = paramCursor.getString(10);
      this.gwL = paramCursor.getString(11);
      this.gwM = paramCursor.getString(12);
      this.frQ = paramCursor.getString(13);
      this.frR = paramCursor.getString(14);
      this.frS = paramCursor.getInt(15);
      this.frT = paramCursor.getInt(16);
      AppMethodBeat.o(108499);
      return;
    }
  }

  public final String getDisplayName()
  {
    AppMethodBeat.i(108501);
    String str;
    if ((aqr() == null) || (aqr().length() <= 0))
    {
      str = aqo();
      AppMethodBeat.o(108501);
    }
    while (true)
    {
      return str;
      str = aqr();
      AppMethodBeat.o(108501);
    }
  }

  public final String getUsername()
  {
    if (this.username == null);
    for (String str = ""; ; str = this.username)
      return str;
  }

  public final String toString()
  {
    AppMethodBeat.i(108502);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("groupID\t:").append(this.gwE).append("\n");
    ((StringBuilder)localObject).append("qq\t:").append(this.gwC).append("\n");
    ((StringBuilder)localObject).append("username\t:").append(this.username).append("\n");
    ((StringBuilder)localObject).append("nickname\t:").append(this.nickname).append("\n");
    ((StringBuilder)localObject).append("wexinStatus\t:").append(this.gwD).append("\n");
    ((StringBuilder)localObject).append("reserved3\t:").append(this.frS).append("\n");
    ((StringBuilder)localObject).append("reserved4\t:").append(this.frT).append("\n");
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(108502);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ao
 * JD-Core Version:    0.6.2
 */