package com.tencent.mm.ah;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class h
{
  public int bJt;
  public int dtR;
  public int frU;
  public String frV;
  public String frW;
  private int frX;
  int frY;
  public String username;

  public h()
  {
    AppMethodBeat.i(77919);
    this.bJt = -1;
    this.username = "";
    this.dtR = 0;
    this.frU = 0;
    this.frV = "";
    this.frW = "";
    this.frX = 0;
    this.frY = 0;
    AppMethodBeat.o(77919);
  }

  public final ContentValues acj()
  {
    AppMethodBeat.i(77921);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x1) != 0)
      localContentValues.put("username", getUsername());
    if ((this.bJt & 0x2) != 0)
      localContentValues.put("imgflag", Integer.valueOf(this.dtR));
    if ((this.bJt & 0x4) != 0)
      localContentValues.put("lastupdatetime", Integer.valueOf(this.frU));
    if ((this.bJt & 0x8) != 0)
      localContentValues.put("reserved1", ack());
    if ((this.bJt & 0x10) != 0)
      localContentValues.put("reserved2", acl());
    if ((this.bJt & 0x20) != 0)
      localContentValues.put("reserved3", Integer.valueOf(this.frX));
    if ((this.bJt & 0x40) != 0)
      localContentValues.put("reserved4", Integer.valueOf(this.frY));
    AppMethodBeat.o(77921);
    return localContentValues;
  }

  public final String ack()
  {
    if (this.frW == null);
    for (String str = ""; ; str = this.frW)
      return str;
  }

  public final String acl()
  {
    if (this.frV == null);
    for (String str = ""; ; str = this.frV)
      return str;
  }

  public final void acm()
  {
    AppMethodBeat.i(77922);
    this.frY = ((int)(bo.anT() / 60L));
    this.bJt |= 64;
    AppMethodBeat.o(77922);
  }

  public final void cB(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.frX = i;
      return;
    }
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(77920);
    this.username = paramCursor.getString(0);
    this.dtR = paramCursor.getInt(1);
    this.frU = paramCursor.getInt(2);
    this.frW = paramCursor.getString(3);
    this.frV = paramCursor.getString(4);
    this.frX = paramCursor.getInt(5);
    this.frY = paramCursor.getInt(6);
    AppMethodBeat.o(77920);
  }

  public final String getUsername()
  {
    if (this.username == null);
    for (String str = ""; ; str = this.username)
      return str;
  }

  public final void qn(String paramString)
  {
    this.frV = paramString;
  }

  public final void setUsername(String paramString)
  {
    this.username = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.h
 * JD-Core Version:    0.6.2
 */