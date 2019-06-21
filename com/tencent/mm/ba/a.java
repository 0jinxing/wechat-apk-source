package com.tencent.mm.ba;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  int bJt;
  public int fLV;
  private String frQ;
  private String frR;
  private int frS;
  private int frT;
  private String path;
  public String username;

  public a()
  {
    AppMethodBeat.i(78430);
    this.bJt = -1;
    this.username = "";
    this.fLV = 0;
    this.path = "";
    this.frQ = "";
    this.frR = "";
    this.frS = 0;
    this.frT = 0;
    AppMethodBeat.o(78430);
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(78432);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x1) != 0)
      localContentValues.put("username", getUsername());
    if ((this.bJt & 0x2) != 0)
      localContentValues.put("bgflag", Integer.valueOf(this.fLV));
    if ((this.bJt & 0x4) != 0)
    {
      if (this.path == null)
      {
        str = "";
        localContentValues.put("path", str);
      }
    }
    else
    {
      if ((this.bJt & 0x8) != 0)
      {
        if (this.frQ != null)
          break label195;
        str = "";
        label100: localContentValues.put("reserved1", str);
      }
      if ((this.bJt & 0x10) != 0)
        if (this.frR != null)
          break label203;
    }
    label195: label203: for (String str = ""; ; str = this.frR)
    {
      localContentValues.put("reserved2", str);
      if ((this.bJt & 0x20) != 0)
        localContentValues.put("reserved3", Integer.valueOf(this.frS));
      if ((this.bJt & 0x40) != 0)
        localContentValues.put("reserved4", Integer.valueOf(this.frT));
      AppMethodBeat.o(78432);
      return localContentValues;
      str = this.path;
      break;
      str = this.frQ;
      break label100;
    }
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(78431);
    this.username = paramCursor.getString(0);
    this.fLV = paramCursor.getInt(1);
    this.path = paramCursor.getString(2);
    this.frQ = paramCursor.getString(3);
    this.frR = paramCursor.getString(4);
    this.frS = paramCursor.getInt(5);
    this.frT = paramCursor.getInt(6);
    AppMethodBeat.o(78431);
  }

  public final String getUsername()
  {
    if (this.username == null);
    for (String str = ""; ; str = this.username)
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.a
 * JD-Core Version:    0.6.2
 */