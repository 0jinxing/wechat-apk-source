package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class j
{
  int bJt;
  public int dtS;
  public int dub;
  public String duc;
  public String dud;
  public String signature;
  public String username;

  public j()
  {
    AppMethodBeat.i(108356);
    this.bJt = -1;
    this.username = "";
    this.dtS = 0;
    this.dub = 0;
    this.duc = "";
    this.dud = "";
    this.signature = "";
    AppMethodBeat.o(108356);
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(108357);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x1) != 0)
      localContentValues.put("username", getUsername());
    if ((this.bJt & 0x2) != 0)
      localContentValues.put("sex", Integer.valueOf(this.dtS));
    if ((this.bJt & 0x4) != 0)
      localContentValues.put("personalcard", Integer.valueOf(this.dub));
    if ((this.bJt & 0x8) != 0)
    {
      if (this.duc == null)
      {
        str = "";
        localContentValues.put("province", str);
      }
    }
    else
    {
      if ((this.bJt & 0x10) != 0)
      {
        if (this.dud != null)
          break label172;
        str = "";
        label123: localContentValues.put("city", str);
      }
      if ((this.bJt & 0x20) != 0)
        if (this.signature != null)
          break label180;
    }
    label172: label180: for (String str = ""; ; str = this.signature)
    {
      localContentValues.put("signature", str);
      AppMethodBeat.o(108357);
      return localContentValues;
      str = this.duc;
      break;
      str = this.dud;
      break label123;
    }
  }

  public final String getUsername()
  {
    if (this.username == null);
    for (String str = ""; ; str = this.username)
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.j
 * JD-Core Version:    0.6.2
 */