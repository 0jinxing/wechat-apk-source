package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p
{
  int bJt;
  private int fCx;
  private int fne;
  private String fng;
  private String fnh;
  public int fvK;
  public int gvE;
  public String username;

  public p()
  {
    AppMethodBeat.i(108400);
    this.bJt = -1;
    this.username = "";
    this.gvE = 0;
    this.fvK = 0;
    this.fne = 0;
    this.fCx = 0;
    this.fng = "";
    this.fnh = "";
    AppMethodBeat.o(108400);
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(108401);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x1) != 0)
      localContentValues.put("username", getUsername());
    if ((this.bJt & 0x2) != 0)
      localContentValues.put("friendtype", Integer.valueOf(this.gvE));
    if ((this.bJt & 0x4) != 0)
      localContentValues.put("updatetime", Integer.valueOf(this.fvK));
    if ((this.bJt & 0x8) != 0)
      localContentValues.put("reserved1", Integer.valueOf(this.fne));
    if ((this.bJt & 0x10) != 0)
      localContentValues.put("reserved2", Integer.valueOf(this.fCx));
    if ((this.bJt & 0x20) != 0)
    {
      if (this.fng == null)
      {
        str = "";
        localContentValues.put("reserved3", str);
      }
    }
    else if ((this.bJt & 0x40) != 0)
      if (this.fnh != null)
        break label191;
    label191: for (String str = ""; ; str = this.fnh)
    {
      localContentValues.put("reserved4", str);
      AppMethodBeat.o(108401);
      return localContentValues;
      str = this.fng;
      break;
    }
  }

  public final String getUsername()
  {
    if (this.username == null);
    for (String str = ""; ; str = this.username)
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.p
 * JD-Core Version:    0.6.2
 */