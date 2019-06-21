package com.tencent.mm.plugin.subapp.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ez;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public final class k extends j<g>
{
  private static long fXo;
  public static final String[] fnj;
  e bSd;
  private Map<String, c> stq;

  static
  {
    AppMethodBeat.i(25323);
    fnj = new String[] { j.a(g.ccO, "VoiceRemindInfo") };
    fXo = 0L;
    AppMethodBeat.o(25323);
  }

  public k(e parame)
  {
    super(parame, g.ccO, "VoiceRemindInfo", ez.diI);
    AppMethodBeat.i(25316);
    this.stq = new HashMap();
    this.bSd = parame;
    AppMethodBeat.o(25316);
  }

  public static String ug(String paramString)
  {
    AppMethodBeat.i(25317);
    long l = System.currentTimeMillis();
    String str1 = new SimpleDateFormat("ssHHmmMMddyy").format(new Date(l));
    String str2 = str1;
    if (paramString != null)
    {
      str2 = str1;
      if (paramString.length() > 1)
        str2 = str1 + com.tencent.mm.a.g.x(paramString.getBytes()).substring(0, 7);
    }
    paramString = str2 + l % 10000L;
    paramString = new StringBuilder().append(paramString);
    l = fXo;
    fXo = 1L + l;
    paramString = l;
    AppMethodBeat.o(25317);
    return paramString;
  }

  public final boolean a(String paramString, g paramg)
  {
    boolean bool1 = true;
    AppMethodBeat.i(25322);
    if (paramString.length() > 0)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (paramg == null)
        break label72;
      bool2 = true;
      label30: Assert.assertTrue(bool2);
      paramg = paramg.Hl();
      if (paramg.size() > 0)
        break label78;
      ab.e("MicroMsg.VoiceRemindStorage", "update failed, no values set");
      label54: AppMethodBeat.o(25322);
    }
    for (boolean bool2 = false; ; bool2 = bool1)
    {
      return bool2;
      bool2 = false;
      break;
      label72: bool2 = false;
      break label30;
      label78: if (this.bSd.update("VoiceRemindInfo", paramg, "filename= ?", new String[] { paramString }) <= 0)
        break label54;
      doNotify();
      AppMethodBeat.o(25322);
    }
  }

  public final c abo(String paramString)
  {
    AppMethodBeat.i(25319);
    if (this.stq.get(paramString) == null)
      this.stq.put(paramString, new c(paramString));
    paramString = (c)this.stq.get(paramString);
    AppMethodBeat.o(25319);
    return paramString;
  }

  public final g abp(String paramString)
  {
    AppMethodBeat.i(25321);
    Object localObject1 = null;
    Object localObject2 = "SELECT filename, user, msgid, offset, filenowsize, totallen, status, createtime, lastmodifytime, clientid, voicelenght, msglocalid, human, voiceformat, nettimes, reserved1, reserved2" + " FROM VoiceRemindInfo WHERE filename= ?";
    localObject2 = this.bSd.a((String)localObject2, new String[] { paramString }, 2);
    paramString = localObject1;
    if (((Cursor)localObject2).moveToFirst())
    {
      paramString = new g();
      paramString.d((Cursor)localObject2);
    }
    ((Cursor)localObject2).close();
    AppMethodBeat.o(25321);
    return paramString;
  }

  public final boolean pI(String paramString)
  {
    AppMethodBeat.i(25318);
    if (paramString.length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.bSd.delete("VoiceRemindInfo", "filename= ?", new String[] { paramString }) <= 0)
        ab.w("MicroMsg.VoiceRemindStorage", "delete failed, no such file:".concat(String.valueOf(paramString)));
      AppMethodBeat.o(25318);
      return true;
    }
  }

  public final void uO(String paramString)
  {
    AppMethodBeat.i(25320);
    c localc = (c)this.stq.get(paramString);
    if (localc != null)
    {
      localc.alO();
      this.stq.remove(paramString);
    }
    AppMethodBeat.o(25320);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.k
 * JD-Core Version:    0.6.2
 */