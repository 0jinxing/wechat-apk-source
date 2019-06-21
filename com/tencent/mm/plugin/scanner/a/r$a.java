package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class r$a
{
  private String country;
  private String fBi;
  private String fQE;
  private String hIa;
  private String hIb;
  private String qaE;
  private String qaF;

  public r$a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    AppMethodBeat.i(80886);
    String str = paramString1;
    if (paramString1 == null)
      str = "";
    this.qaE = str;
    paramString1 = paramString2;
    if (paramString2 == null)
      paramString1 = "";
    this.qaF = paramString1;
    paramString1 = paramString3;
    if (paramString3 == null)
      paramString1 = "";
    this.hIa = paramString1;
    paramString1 = paramString4;
    if (paramString4 == null)
      paramString1 = "";
    this.fBi = paramString1;
    paramString1 = paramString5;
    if (paramString5 == null)
      paramString1 = "";
    this.fQE = paramString1;
    paramString1 = paramString6;
    if (paramString6 == null)
      paramString1 = "";
    this.hIb = paramString1;
    paramString1 = paramString7;
    if (paramString7 == null)
      paramString1 = "";
    this.country = paramString1;
    AppMethodBeat.o(80886);
  }

  public final String aDu()
  {
    AppMethodBeat.i(80887);
    Object localObject;
    String str;
    if ((bo.amT(this.qaE)) || (bo.amT(this.qaF)) || (bo.amT(this.hIa)) || (bo.amT(this.fBi)) || (bo.amT(this.fQE)) || (bo.amT(this.country)))
    {
      localObject = new StringBuilder();
      if (this.country.length() > 0)
      {
        ((StringBuilder)localObject).append(this.country);
        ((StringBuilder)localObject).append("\n");
      }
      if (this.fQE.length() > 0)
        ((StringBuilder)localObject).append(this.fQE + " ");
      if (this.fBi.length() > 0)
        ((StringBuilder)localObject).append(this.fBi);
      if ((this.fQE.length() > 0) || (this.fBi.length() > 0))
        ((StringBuilder)localObject).append("\n");
      if (this.hIa.length() > 0)
      {
        ((StringBuilder)localObject).append(this.hIa + " ");
        ((StringBuilder)localObject).append("\n");
      }
      if (this.qaF.length() > 0)
      {
        ((StringBuilder)localObject).append(this.qaF);
        ((StringBuilder)localObject).append("\n");
      }
      if (this.qaE.length() > 0)
      {
        ((StringBuilder)localObject).append(this.qaE);
        ((StringBuilder)localObject).append("\n");
      }
      if (this.hIb.length() > 0)
        ((StringBuilder)localObject).append(this.hIb);
      str = ((StringBuilder)localObject).toString();
      localObject = str;
      if (str.endsWith("\n"))
        localObject = str.substring(0, str.length() - 1);
      AppMethodBeat.o(80887);
    }
    while (true)
    {
      return localObject;
      localObject = new StringBuilder();
      if (this.qaE.length() > 0)
      {
        ((StringBuilder)localObject).append(this.qaE);
        ((StringBuilder)localObject).append("\n");
      }
      if (this.qaF.length() > 0)
      {
        ((StringBuilder)localObject).append(this.qaF);
        ((StringBuilder)localObject).append("\n");
      }
      if (this.hIa.length() > 0)
      {
        ((StringBuilder)localObject).append(this.hIa);
        ((StringBuilder)localObject).append("\n");
      }
      if (this.fBi.length() > 0)
        ((StringBuilder)localObject).append(this.fBi + " ");
      if (this.fQE.length() > 0)
        ((StringBuilder)localObject).append(this.fQE + " ");
      if (this.hIb.length() > 0)
        ((StringBuilder)localObject).append(this.hIb);
      if ((this.fBi.length() > 0) || (this.fQE.length() > 0))
        ((StringBuilder)localObject).append("\n");
      if (this.country.length() > 0)
        ((StringBuilder)localObject).append(this.country);
      str = ((StringBuilder)localObject).toString();
      localObject = str;
      if (str.endsWith("\n"))
        localObject = str.substring(0, str.length() - 1);
      AppMethodBeat.o(80887);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.r.a
 * JD-Core Version:    0.6.2
 */