package com.tencent.mm.ar;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.k;

public final class b extends k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS getcontactinfov2 ( username text  PRIMARY KEY , inserttime long  , type int  , lastgettime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) " };
  h fni;

  public b(h paramh)
  {
    this.fni = paramh;
  }

  public final boolean a(a parama)
  {
    AppMethodBeat.i(16468);
    parama.bJt = -1;
    ContentValues localContentValues = new ContentValues();
    if ((parama.bJt & 0x1) != 0)
      localContentValues.put("username", parama.getUsername());
    if ((parama.bJt & 0x2) != 0)
      localContentValues.put("inserttime", Long.valueOf(parama.fCv));
    if ((parama.bJt & 0x4) != 0)
      localContentValues.put("type", Integer.valueOf(parama.type));
    if ((parama.bJt & 0x8) != 0)
      localContentValues.put("lastgettime", Integer.valueOf(parama.fCw));
    if ((parama.bJt & 0x10) != 0)
      localContentValues.put("reserved1", Integer.valueOf(parama.fne));
    if ((parama.bJt & 0x20) != 0)
      localContentValues.put("reserved2", Integer.valueOf(parama.fCx));
    if ((parama.bJt & 0x40) != 0)
      localContentValues.put("reserved3", parama.agH());
    if ((parama.bJt & 0x80) != 0)
      localContentValues.put("reserved4", parama.agI());
    boolean bool;
    if ((int)this.fni.replace("getcontactinfov2", "username", localContentValues) != -1)
    {
      anF(parama.getUsername());
      bool = true;
      AppMethodBeat.o(16468);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(16468);
    }
  }

  public final boolean rY(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(16469);
    if (this.fni.delete("getcontactinfov2", "username= ?", new String[] { String.valueOf(paramString) }) > 0)
    {
      anF(paramString);
      AppMethodBeat.o(16469);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(16469);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.b
 * JD-Core Version:    0.6.2
 */