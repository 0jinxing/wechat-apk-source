package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g
{
  String bCu;
  int bJt;
  String dFl;
  int dtS;
  public long dtU;
  private String dtV;
  int dub;
  String duc;
  String dud;
  String guG;
  String guH;
  String gvg;
  int gvh;
  String signature;
  public int status;
  private int type;
  String username;

  public g()
  {
    AppMethodBeat.i(108331);
    this.bJt = -1;
    this.dtU = 0L;
    this.gvg = "";
    this.gvh = 0;
    this.status = 0;
    this.username = "";
    this.bCu = "";
    this.guG = "";
    this.guH = "";
    this.dtS = 0;
    this.dub = 0;
    this.duc = "";
    this.dud = "";
    this.signature = "";
    this.dFl = "";
    this.type = 0;
    this.dtV = "";
    AppMethodBeat.o(108331);
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(108333);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x1) != 0)
      localContentValues.put("fbid", Long.valueOf(this.dtU));
    if ((this.bJt & 0x2) != 0)
      localContentValues.put("fbname", apL());
    if ((this.bJt & 0x4) != 0)
      localContentValues.put("fbimgkey", Integer.valueOf(this.gvh));
    if ((this.bJt & 0x8) != 0)
      localContentValues.put("status", Integer.valueOf(this.status));
    if ((this.bJt & 0x10) != 0)
      localContentValues.put("username", getUsername());
    if ((this.bJt & 0x20) != 0)
      localContentValues.put("nickname", apD());
    if ((this.bJt & 0x40) != 0)
    {
      if (this.guG == null)
      {
        str = "";
        localContentValues.put("nicknamepyinitial", str);
      }
    }
    else
    {
      if ((this.bJt & 0x80) != 0)
      {
        if (this.guH != null)
          break label420;
        str = "";
        label187: localContentValues.put("nicknamequanpin", str);
      }
      if ((this.bJt & 0x100) != 0)
        localContentValues.put("sex", Integer.valueOf(this.dtS));
      if ((this.bJt & 0x200) != 0)
        localContentValues.put("personalcard", Integer.valueOf(this.dub));
      if ((this.bJt & 0x400) != 0)
      {
        if (this.duc != null)
          break label428;
        str = "";
        label263: localContentValues.put("province", str);
      }
      if ((this.bJt & 0x800) != 0)
      {
        if (this.dud != null)
          break label436;
        str = "";
        label291: localContentValues.put("city", str);
      }
      if ((this.bJt & 0x1000) != 0)
      {
        if (this.signature != null)
          break label444;
        str = "";
        label319: localContentValues.put("signature", str);
      }
      if ((this.bJt & 0x2000) != 0)
      {
        if (this.dFl != null)
          break label452;
        str = "";
        label347: localContentValues.put("alias", str);
      }
      if ((this.bJt & 0x4000) != 0)
        localContentValues.put("type", Integer.valueOf(this.type));
      if ((this.bJt & 0x8000) != 0)
        if (this.dtV != null)
          break label460;
    }
    label420: label428: label436: label444: label452: label460: for (String str = ""; ; str = this.dtV)
    {
      localContentValues.put("email", str);
      AppMethodBeat.o(108333);
      return localContentValues;
      str = this.guG;
      break;
      str = this.guH;
      break label187;
      str = this.duc;
      break label263;
      str = this.dud;
      break label291;
      str = this.signature;
      break label319;
      str = this.dFl;
      break label347;
    }
  }

  public final String apD()
  {
    if (this.bCu == null);
    for (String str = ""; ; str = this.bCu)
      return str;
  }

  public final String apL()
  {
    if (this.gvg == null);
    for (String str = ""; ; str = this.gvg)
      return str;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(108332);
    this.dtU = paramCursor.getLong(0);
    this.gvg = paramCursor.getString(1);
    this.gvh = paramCursor.getInt(2);
    this.status = paramCursor.getInt(3);
    this.username = paramCursor.getString(4);
    this.bCu = paramCursor.getString(5);
    this.guG = paramCursor.getString(6);
    this.guH = paramCursor.getString(7);
    this.dtS = paramCursor.getInt(8);
    this.dub = paramCursor.getInt(9);
    this.duc = paramCursor.getString(10);
    this.dud = paramCursor.getString(11);
    this.signature = paramCursor.getString(12);
    this.dFl = paramCursor.getString(13);
    this.type = paramCursor.getInt(14);
    this.dtV = paramCursor.getString(15);
    AppMethodBeat.o(108332);
  }

  public final String getUsername()
  {
    if (this.username == null);
    for (String str = ""; ; str = this.username)
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.g
 * JD-Core Version:    0.6.2
 */