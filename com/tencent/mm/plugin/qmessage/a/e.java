package com.tencent.mm.plugin.qmessage.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

public final class e extends k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS qcontact ( username text  PRIMARY KEY , qq long  , extinfo text  , needupdate int  , extupdateseq long  , imgupdateseq long  , reserved1 int  , reserved2 int  , reserved3 int  , reserved4 int  , reserved5 text  , reserved6 text  , reserved7 text  , reserved8 text  ) " };
  private h fni;

  public e(h paramh)
  {
    this.fni = paramh;
  }

  public final d Vb(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(24084);
    paramString = "select qcontact.username,qcontact.qq,qcontact.extinfo,qcontact.needupdate,qcontact.extupdateseq,qcontact.imgupdateseq,qcontact.reserved1,qcontact.reserved2,qcontact.reserved3,qcontact.reserved4,qcontact.reserved5,qcontact.reserved6,qcontact.reserved7,qcontact.reserved8 from qcontact   where qcontact.username = \"" + bo.vA(String.valueOf(paramString)) + "\"";
    Cursor localCursor = this.fni.a(paramString, null, 2);
    if (localCursor == null)
    {
      AppMethodBeat.o(24084);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      paramString = localObject1;
      if (localCursor.moveToFirst())
      {
        paramString = new d();
        paramString.d(localCursor);
      }
      localCursor.close();
      AppMethodBeat.o(24084);
    }
  }

  public final boolean a(d paramd)
  {
    AppMethodBeat.i(24082);
    paramd.bJt = -1;
    paramd = paramd.Hl();
    boolean bool;
    if ((int)this.fni.insert("qcontact", "username", paramd) != -1)
    {
      bool = true;
      AppMethodBeat.o(24082);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(24082);
    }
  }

  public final boolean a(String paramString, d paramd)
  {
    boolean bool1 = false;
    AppMethodBeat.i(24083);
    boolean bool2;
    if ((paramString != null) && (paramString.length() > 0))
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (paramd != null)
        break label49;
      AppMethodBeat.o(24083);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label49: if (this.fni.update("qcontact", paramd.Hl(), "username=?", new String[] { paramString }) > 0)
      {
        AppMethodBeat.o(24083);
        bool2 = true;
      }
      else
      {
        AppMethodBeat.o(24083);
        bool2 = bool1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.a.e
 * JD-Core Version:    0.6.2
 */