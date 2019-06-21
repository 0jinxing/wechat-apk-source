package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bq
{
  int bJt;
  public String name;
  int status;
  public a xZV;
  private int xZW;

  public bq()
  {
    this.bJt = 135;
    this.name = "";
    this.xZV = null;
    this.xZV = null;
    this.name = "";
    this.status = 0;
    this.xZW = 0;
  }

  public bq(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(60231);
    this.bJt = 135;
    this.name = "";
    this.xZV = null;
    this.xZV = new a(paramString);
    this.name = paramString;
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.status = (i | 0x2);
      this.xZW = paramInt;
      AppMethodBeat.o(60231);
      return;
    }
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(60233);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x2) != 0)
      localContentValues.put("name", this.name);
    if ((this.bJt & 0x4) != 0)
      localContentValues.put("status", Integer.valueOf(this.status));
    if ((this.bJt & 0x80) != 0)
      localContentValues.put("int_reserved1", Integer.valueOf(this.xZW));
    AppMethodBeat.o(60233);
    return localContentValues;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(60232);
    if ((this.bJt & 0x2) != 0)
    {
      this.name = paramCursor.getString(1);
      if (this.xZV == null)
        this.xZV = new a(this.name);
    }
    if ((this.bJt & 0x4) != 0)
      this.status = paramCursor.getInt(2);
    if ((this.bJt & 0x80) != 0)
      this.xZW = paramCursor.getInt(7);
    AppMethodBeat.o(60232);
  }

  public final boolean dum()
  {
    if ((this.status & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean dun()
  {
    boolean bool = true;
    if (this.xZW == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean isEnable()
  {
    if ((this.status & 0x1) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void setEnable(boolean paramBoolean)
  {
    int i;
    int j;
    if (paramBoolean)
    {
      i = this.status;
      if (paramBoolean)
        j = 1;
    }
    for (this.status = (j | i); ; this.status &= -2)
    {
      return;
      j = 0;
      break;
    }
  }

  public static final class a
  {
    private String cIS;
    private String cSx;

    public a(String paramString)
    {
      AppMethodBeat.i(60230);
      int i = paramString.indexOf("@");
      if (i >= 0)
      {
        this.cIS = paramString.substring(0, i);
        this.cSx = paramString.substring(i);
        AppMethodBeat.o(60230);
      }
      while (true)
      {
        return;
        this.cIS = paramString;
        this.cSx = "";
        AppMethodBeat.o(60230);
      }
    }

    public final String apT(String paramString)
    {
      if (this.cSx != null)
        paramString = this.cSx;
      return paramString;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bq
 * JD-Core Version:    0.6.2
 */