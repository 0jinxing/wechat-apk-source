package com.tencent.mm.ba;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m
{
  int bJt;
  public int cBc;
  private String czD;
  String fMt;
  private String frQ;
  private String frR;
  private int frS;
  private int frT;
  public int id;
  String name;
  int size;
  public int status;
  public int version;

  public m()
  {
    AppMethodBeat.i(78480);
    this.bJt = -1;
    this.id = 0;
    this.version = 0;
    this.name = "";
    this.size = 0;
    this.fMt = "";
    this.status = 0;
    this.cBc = 0;
    this.frQ = "";
    this.frR = "";
    this.frS = 0;
    this.frT = 0;
    this.czD = (this.id + "_" + this.cBc);
    AppMethodBeat.o(78480);
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(78482);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x2) != 0)
      localContentValues.put("id", Integer.valueOf(this.id));
    if ((this.bJt & 0x4) != 0)
      localContentValues.put("version", Integer.valueOf(this.version));
    if ((this.bJt & 0x8) != 0)
    {
      if (this.name == null)
      {
        str = "";
        localContentValues.put("name", str);
      }
    }
    else
    {
      if ((this.bJt & 0x10) != 0)
        localContentValues.put("size", Integer.valueOf(this.size));
      if ((this.bJt & 0x20) != 0)
        localContentValues.put("packname", ais());
      if ((this.bJt & 0x40) != 0)
        localContentValues.put("status", Integer.valueOf(this.status));
      if ((this.bJt & 0x80) != 0)
        localContentValues.put("type", Integer.valueOf(this.cBc));
      if ((this.bJt & 0x100) != 0)
      {
        if (this.frQ != null)
          break label337;
        str = "";
        label195: localContentValues.put("reserved1", str);
      }
      if ((this.bJt & 0x200) != 0)
        if (this.frR != null)
          break label345;
    }
    label337: label345: for (String str = ""; ; str = this.frR)
    {
      localContentValues.put("reserved2", str);
      if ((this.bJt & 0x400) != 0)
        localContentValues.put("reserved3", Integer.valueOf(this.frS));
      if ((this.bJt & 0x800) != 0)
        localContentValues.put("reserved4", Integer.valueOf(this.frT));
      if ((this.bJt & 0x1) != 0)
        localContentValues.put("localId", this.id + "_" + this.cBc);
      AppMethodBeat.o(78482);
      return localContentValues;
      str = this.name;
      break;
      str = this.frQ;
      break label195;
    }
  }

  public final String ais()
  {
    if (this.fMt == null);
    for (String str = ""; ; str = this.fMt)
      return str;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(78481);
    this.version = paramCursor.getInt(2);
    this.name = paramCursor.getString(3);
    this.size = paramCursor.getInt(4);
    this.fMt = paramCursor.getString(5);
    this.status = paramCursor.getInt(6);
    this.frQ = paramCursor.getString(8);
    this.frR = paramCursor.getString(9);
    this.cBc = paramCursor.getInt(7);
    this.frT = paramCursor.getInt(11);
    this.id = paramCursor.getInt(1);
    this.frS = paramCursor.getInt(10);
    this.czD = paramCursor.getString(0);
    AppMethodBeat.o(78481);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ba.m
 * JD-Core Version:    0.6.2
 */