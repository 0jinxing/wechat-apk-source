package com.tencent.mm.ah;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  int bJt;
  int coc;
  int frL;
  int frM;
  String frN;
  int frO;
  int frP;
  String frQ;
  String frR;
  int frS;
  int frT;
  String username;

  public f()
  {
    AppMethodBeat.i(77915);
    this.bJt = -1;
    reset();
    AppMethodBeat.o(77915);
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(77916);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x1) != 0)
    {
      if (this.username == null)
      {
        str = "";
        localContentValues.put("username", str);
      }
    }
    else
    {
      if ((this.bJt & 0x2) != 0)
        localContentValues.put("imgwidth", Integer.valueOf(this.frL));
      if ((this.bJt & 0x4) != 0)
        localContentValues.put("imgheigth", Integer.valueOf(this.frM));
      if ((this.bJt & 0x8) != 0)
        localContentValues.put("imgformat", aci());
      if ((this.bJt & 0x10) != 0)
        localContentValues.put("totallen", Integer.valueOf(this.frO));
      if ((this.bJt & 0x20) != 0)
        localContentValues.put("startpos", Integer.valueOf(this.coc));
      if ((this.bJt & 0x40) != 0)
        localContentValues.put("headimgtype", Integer.valueOf(this.frP));
      if ((this.bJt & 0x80) != 0)
      {
        if (this.frQ != null)
          break label291;
        str = "";
        label193: localContentValues.put("reserved1", str);
      }
      if ((this.bJt & 0x100) != 0)
        if (this.frR != null)
          break label299;
    }
    label291: label299: for (String str = ""; ; str = this.frR)
    {
      localContentValues.put("reserved2", str);
      if ((this.bJt & 0x200) != 0)
        localContentValues.put("reserved3", Integer.valueOf(this.frS));
      if ((this.bJt & 0x400) != 0)
        localContentValues.put("reserved4", Integer.valueOf(this.frT));
      AppMethodBeat.o(77916);
      return localContentValues;
      str = this.username;
      break;
      str = this.frQ;
      break label193;
    }
  }

  public final String aci()
  {
    if (this.frN == null);
    for (String str = ""; ; str = this.frN)
      return str;
  }

  public final void reset()
  {
    this.username = "";
    this.frL = 0;
    this.frM = 0;
    this.frN = "";
    this.frO = 0;
    this.coc = 0;
    this.frP = 0;
    this.frQ = "";
    this.frR = "";
    this.frS = 0;
    this.frT = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.f
 * JD-Core Version:    0.6.2
 */