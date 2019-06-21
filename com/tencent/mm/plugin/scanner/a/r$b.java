package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class r$b
{
  private String firstName;
  private String lastName;
  private String middleName;

  public r$b(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(80888);
    String str = paramString1;
    if (paramString1 == null)
      str = "";
    this.firstName = str;
    paramString1 = paramString2;
    if (paramString2 == null)
      paramString1 = "";
    this.middleName = paramString1;
    paramString1 = paramString3;
    if (paramString3 == null)
      paramString1 = "";
    this.lastName = paramString1;
    AppMethodBeat.o(80888);
  }

  public final String aDu()
  {
    AppMethodBeat.i(80889);
    Object localObject = new StringBuilder();
    if ((bo.amT(this.firstName)) || (bo.amT(this.middleName)) || (bo.amT(this.lastName)))
    {
      if (this.lastName.trim().length() > 0)
        ((StringBuilder)localObject).append(this.lastName);
      if (this.middleName.trim().length() > 0)
        ((StringBuilder)localObject).append(this.middleName);
      if (this.firstName.trim().length() > 0)
        ((StringBuilder)localObject).append(this.firstName);
    }
    while (true)
    {
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(80889);
      return localObject;
      if (this.firstName.trim().length() > 0)
        ((StringBuilder)localObject).append(this.firstName);
      if (this.middleName.trim().length() > 0)
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(this.middleName);
      }
      if (this.lastName.trim().length() > 0)
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(this.lastName);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.r.b
 * JD-Core Version:    0.6.2
 */