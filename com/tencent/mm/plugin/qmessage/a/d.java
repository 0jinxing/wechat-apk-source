package com.tencent.mm.plugin.qmessage.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  public int bJt;
  String extInfo;
  private int fCx;
  private int fne;
  private int frS;
  private int frT;
  private long gwC;
  public int psK;
  public long psL;
  public long psM;
  private String psN;
  private String psO;
  private String psP;
  private String psQ;
  public String username;

  public d()
  {
    AppMethodBeat.i(24079);
    this.bJt = -1;
    this.username = "";
    this.gwC = 0L;
    this.extInfo = "";
    this.psK = 0;
    this.psL = 0L;
    this.psM = 0L;
    this.fne = 0;
    this.fCx = 0;
    this.frS = 0;
    this.frT = 0;
    this.psN = "";
    this.psO = "";
    this.psP = "";
    this.psQ = "";
    AppMethodBeat.o(24079);
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(24081);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x1) != 0)
      localContentValues.put("username", getUsername());
    if ((this.bJt & 0x2) != 0)
      localContentValues.put("qq", Long.valueOf(this.gwC));
    if ((this.bJt & 0x4) != 0)
      localContentValues.put("extinfo", cbY());
    if ((this.bJt & 0x8) != 0)
      localContentValues.put("needupdate", Integer.valueOf(this.psK));
    if ((this.bJt & 0x10) != 0)
      localContentValues.put("extupdateseq", Long.valueOf(this.psL));
    if ((this.bJt & 0x20) != 0)
      localContentValues.put("imgupdateseq", Long.valueOf(this.psM));
    if ((this.bJt & 0x40) != 0)
      localContentValues.put("reserved1", Integer.valueOf(this.fne));
    if ((this.bJt & 0x80) != 0)
      localContentValues.put("reserved2", Integer.valueOf(this.fCx));
    if ((this.bJt & 0x100) != 0)
      localContentValues.put("reserved3", Integer.valueOf(this.frS));
    if ((this.bJt & 0x200) != 0)
      localContentValues.put("reserved4", Integer.valueOf(this.frT));
    if ((this.bJt & 0x400) != 0)
    {
      if (this.psN == null)
      {
        str = "";
        localContentValues.put("reserved5", str);
      }
    }
    else
    {
      if ((this.bJt & 0x800) != 0)
      {
        if (this.psO != null)
          break label366;
        str = "";
        label287: localContentValues.put("reserved6", str);
      }
      if ((this.bJt & 0x1000) != 0)
      {
        if (this.psP != null)
          break label374;
        str = "";
        label315: localContentValues.put("reserved7", str);
      }
      if ((this.bJt & 0x2000) != 0)
        if (this.psQ != null)
          break label382;
    }
    label366: label374: label382: for (String str = ""; ; str = this.psQ)
    {
      localContentValues.put("reserved8", str);
      AppMethodBeat.o(24081);
      return localContentValues;
      str = this.psN;
      break;
      str = this.psO;
      break label287;
      str = this.psP;
      break label315;
    }
  }

  public final String cbY()
  {
    if (this.extInfo == null);
    for (String str = ""; ; str = this.extInfo)
      return str;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(24080);
    this.username = paramCursor.getString(0);
    this.gwC = paramCursor.getLong(1);
    this.extInfo = paramCursor.getString(2);
    this.psK = paramCursor.getInt(3);
    this.psL = paramCursor.getLong(4);
    this.psM = paramCursor.getLong(5);
    this.fne = paramCursor.getInt(6);
    this.fCx = paramCursor.getInt(7);
    this.frS = paramCursor.getInt(8);
    this.frT = paramCursor.getInt(9);
    this.psN = paramCursor.getString(10);
    this.psO = paramCursor.getString(11);
    this.psP = paramCursor.getString(12);
    this.psQ = paramCursor.getString(13);
    AppMethodBeat.o(24080);
  }

  public final String getUsername()
  {
    if (this.username == null);
    for (String str = ""; ; str = this.username)
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.a.d
 * JD-Core Version:    0.6.2
 */