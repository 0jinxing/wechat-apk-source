package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class a
{
  public static a.a qjB;
  private static a qjC;
  public boolean fPO = false;

  public static long Ff(String paramString)
  {
    AppMethodBeat.i(126839);
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    long l1 = bo.anU();
    try
    {
      long l2 = localSimpleDateFormat.parse(paramString).getTime();
      l1 = l2;
      AppMethodBeat.o(126839);
      return l1;
    }
    catch (ParseException localParseException)
    {
      while (true)
        ab.e("MicroMsg.FixToolsUplogModel", "dateToTimeStamp failed. date:%s, stack:%s", new Object[] { paramString, bo.dpG() });
    }
  }

  public static a cir()
  {
    AppMethodBeat.i(126838);
    if (qjC == null)
      qjC = new a();
    a locala = qjC;
    AppMethodBeat.o(126838);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.a
 * JD-Core Version:    0.6.2
 */