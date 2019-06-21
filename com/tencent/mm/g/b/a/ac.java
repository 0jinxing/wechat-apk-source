package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

public final class ac extends a
{
  public long cYn;
  public long cYo;
  public String cYp;
  public boolean cYq;

  public ac()
  {
    this.cYn = 0L;
    this.cYo = 0L;
    this.cYp = "";
  }

  public ac(String paramString)
  {
    AppMethodBeat.i(73303);
    this.cYn = 0L;
    this.cYo = 0L;
    this.cYp = "";
    if (paramString != null)
    {
      paramString = paramString.split(",");
      if (paramString != null)
      {
        if (paramString.length >= 4)
          break label117;
        String[] arrayOfString = new String[4];
        Arrays.fill(arrayOfString, 0, 4, "");
        System.arraycopy(paramString, 0, arrayOfString, 0, paramString.length);
        paramString = arrayOfString;
      }
    }
    label117: 
    while (true)
    {
      this.cYn = bo.getLong(paramString[0], 0L);
      aR(bo.getLong(paramString[1], 0L));
      eX(paramString[2]);
      this.cYq = a.getBoolean(paramString[3]);
      AppMethodBeat.o(73303);
      return;
    }
  }

  private ac aR(long paramLong)
  {
    AppMethodBeat.i(73304);
    this.cYo = paramLong;
    super.ak("StartTimeStampSec", this.cYo);
    AppMethodBeat.o(73304);
    return this;
  }

  public final String Fj()
  {
    AppMethodBeat.i(73307);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cYn);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYo);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cYp);
    ((StringBuffer)localObject).append(",");
    if (this.cYq);
    for (int i = 1; ; i = 0)
    {
      ((StringBuffer)localObject).append(i);
      localObject = ((StringBuffer)localObject).toString();
      VX((String)localObject);
      AppMethodBeat.o(73307);
      return localObject;
    }
  }

  public final String Fk()
  {
    AppMethodBeat.i(73308);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("ExptFlag:").append(this.cYn);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("StartTimeStampSec:").append(this.cYo);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("Roomname:").append(this.cYp);
    ((StringBuffer)localObject).append("\r\n");
    ((StringBuffer)localObject).append("hardcodeExptBool:").append(this.cYq);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(73308);
    return localObject;
  }

  public final ac Fq()
  {
    AppMethodBeat.i(73305);
    ac localac = aR(bo.anT());
    AppMethodBeat.o(73305);
    return localac;
  }

  public final ac eX(String paramString)
  {
    AppMethodBeat.i(73306);
    this.cYp = t("Roomname", paramString, true);
    AppMethodBeat.o(73306);
    return this;
  }

  public final int getId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.ac
 * JD-Core Version:    0.6.2
 */